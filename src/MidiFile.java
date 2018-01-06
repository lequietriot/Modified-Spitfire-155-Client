public class MidiFile {

    static final byte[] staticByteArray4 = new byte[] { (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0 };
    Buffer buffer2 = new Buffer((byte[]) null);
    int int244;
    int int245;
    int[] intArray38;
    long long11;
    int[] intArray39;
    int[] intArray40;
    int[] intArray41;

    MidiFile() {
    }

    MidiFile(byte[] bytes_1) {
        readMidi(bytes_1);
    }

    void readMidi(byte[] bytes_1) {
        buffer2.buf = bytes_1;
        buffer2.off = 10;
        int i_2 = buffer2.readUShort();
        int244 = buffer2.readUShort();
        int245 = 500000;
        intArray38 = new int[i_2];

        int i_3;
        int i_5;
        for (i_3 = 0; i_3 < i_2; buffer2.off += i_5) {
            int i_4 = buffer2.readInt();
            i_5 = buffer2.readInt();
            if (i_4 == 1297379947) {
                intArray38[i_3] = buffer2.off;
                ++i_3;
            }
        }

        long11 = 0L;
        intArray39 = new int[i_2];

        for (i_3 = 0; i_3 < i_2; i_3++)
            intArray39[i_3] = intArray38[i_3];

        intArray40 = new int[i_2];
        intArray41 = new int[i_2];
    }

    void method269() {
        buffer2.buf = null;
        intArray38 = null;
        intArray39 = null;
        intArray40 = null;
        intArray41 = null;
    }

    boolean method270() {
        return buffer2.buf != null;
    }

    int method271() {
        return intArray39.length;
    }

    void method272(int i_1) {
        buffer2.off = intArray39[i_1];
    }

    void method273(int i_1) {
        intArray39[i_1] = buffer2.off;
    }

    void method274() {
        buffer2.off = -1;
    }

    void method275(int i_1) {
        int i_2 = buffer2.method456();
        intArray40[i_1] += i_2;
    }

    int method276(int i_1) {
        int i_2 = method277(i_1);
        return i_2;
    }

    int method277(int i_1) {
        byte b_2 = buffer2.buf[buffer2.off];
        int i_5;
        if (b_2 < 0) {
            i_5 = b_2 & 0xff;
            intArray41[i_1] = i_5;
            ++buffer2.off;
        } else
            i_5 = intArray41[i_1];

        if (i_5 != 240 && i_5 != 247)
            return method278(i_1, i_5);
        else {
            int i_3 = buffer2.method456();
            if (i_5 == 247 && i_3 > 0) {
                int i_4 = buffer2.buf[buffer2.off] & 0xff;
                if (i_4 >= 241 && i_4 <= 243 || i_4 == 246 || i_4 == 248 || i_4 >= 250 && i_4 <= 252 || i_4 == 254) {
                    ++buffer2.off;
                    intArray41[i_1] = i_4;
                    return method278(i_1, i_4);
                }
            }

            buffer2.off += i_3;
            return 0;
        }
    }

    int method278(int i_1, int i_2) {
        int i_4;
        if (i_2 == 255) {
            int i_7 = buffer2.readUByte();
            i_4 = buffer2.method456();
            if (i_7 == 47) {
                buffer2.off += i_4;
                return 1;
            } else if (i_7 == 81) {
                int i_5 = buffer2.method443();
                i_4 -= 3;
                int i_6 = intArray40[i_1];
                long11 += (long) i_6 * (long) (int245 - i_5);
                int245 = i_5;
                buffer2.off += i_4;
                return 2;
            } else {
                buffer2.off += i_4;
                return 3;
            }
        } else {
            byte b_3 = staticByteArray4[i_2 - 128];
            i_4 = i_2;
            if (b_3 >= 1)
                i_4 = i_2 | buffer2.readUByte() << 8;

            if (b_3 >= 2)
                i_4 |= buffer2.readUByte() << 16;

            return i_4;
        }
    }

    long method279(int i_1) {
        return long11 + (long) i_1 * (long) int245;
    }

    int method280() {
        int i_1 = intArray39.length;
        int i_2 = -1;
        int i_3 = Integer.MAX_VALUE;

        for (int i_4 = 0; i_4 < i_1; i_4++)
            if (intArray39[i_4] >= 0 && intArray40[i_4] < i_3) {
                i_2 = i_4;
                i_3 = intArray40[i_4];
            }

        return i_2;
    }

    boolean method281() {
        int i_1 = intArray39.length;

        for (int i_2 = 0; i_2 < i_1; i_2++)
            if (intArray39[i_2] >= 0)
                return false;

        return true;
    }

    void method282(long long_1) {
        long11 = long_1;
        int i_3 = intArray39.length;

        for (int i_4 = 0; i_4 < i_3; i_4++) {
            intArray40[i_4] = 0;
            intArray41[i_4] = 0;
            buffer2.off = intArray38[i_4];
            method275(i_4);
            intArray39[i_4] = buffer2.off;
        }

    }

}

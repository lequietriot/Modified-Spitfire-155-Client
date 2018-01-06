import java.math.BigInteger;

public class Buffer extends Node {

    static int[] staticIntArray126 = new int[256];
    static long[] staticLongArray4;
    public byte[] buf;
    public int off;

    static {
        int i_2;
        for (int i_1 = 0; i_1 < 256; i_1++) {
            int i_0 = i_1;

            for (i_2 = 0; i_2 < 8; i_2++)
                if ((i_0 & 0x1) == 1)
                    i_0 = i_0 >>> 1 ^ ~0x12477cdf;
                else
                    i_0 >>>= 1;

            staticIntArray126[i_1] = i_0;
        }

        staticLongArray4 = new long[256];

        for (i_2 = 0; i_2 < 256; i_2++) {
            long long_4 = i_2;

            for (int i_3 = 0; i_3 < 8; i_3++)
                if ((long_4 & 0x1L) == 1L)
                    long_4 = long_4 >>> 1 ^ ~0x3693a86a2878f0bdL;
                else
                    long_4 >>>= 1;

            staticLongArray4[i_2] = long_4;
        }

    }

    static int staticMethod376(byte[] bytes_0, int i_1, int i_2) {
        int i_4 = -1;

        for (int i_5 = i_1; i_5 < i_2; i_5++)
            i_4 = i_4 >>> 8 ^ staticIntArray126[(i_4 ^ bytes_0[i_5]) & 0xff];

        i_4 = ~i_4;
        return i_4;
    }

    public static int staticMethod377(byte[] bytes_0, int i_1) {
        return staticMethod376(bytes_0, 0, i_1);
    }

    public Buffer(int i_1) {
        buf = StaticClass20.synchronizedMethod6(i_1);
        off = 0;
    }

    public Buffer(byte[] bytes_1) {
        buf = bytes_1;
        off = 0;
    }

    public void writeByte(int i_1) {
        buf[off++] = (byte) i_1;
    }

    public void writeShort(int i_1) {
        buf[off++] = (byte) (i_1 >> 8);
        buf[off++] = (byte) i_1;
    }

    public void writeTriByte(int i_1) {
        buf[off++] = (byte) (i_1 >> 16);
        buf[off++] = (byte) (i_1 >> 8);
        buf[off++] = (byte) i_1;
    }

    public void writeInt(int i_1) {
        buf[off++] = (byte) (i_1 >> 24);
        buf[off++] = (byte) (i_1 >> 16);
        buf[off++] = (byte) (i_1 >> 8);
        buf[off++] = (byte) i_1;
    }

    public void writeHexByte(long long_1) {
        buf[off++] = (byte) (int) (long_1 >> 40);
        buf[off++] = (byte) (int) (long_1 >> 32);
        buf[off++] = (byte) (int) (long_1 >> 24);
        buf[off++] = (byte) (int) (long_1 >> 16);
        buf[off++] = (byte) (int) (long_1 >> 8);
        buf[off++] = (byte) (int) long_1;
    }

    public void writeLong(long long_1) {
        buf[off++] = (byte) (int) (long_1 >> 56);
        buf[off++] = (byte) (int) (long_1 >> 48);
        buf[off++] = (byte) (int) (long_1 >> 40);
        buf[off++] = (byte) (int) (long_1 >> 32);
        buf[off++] = (byte) (int) (long_1 >> 24);
        buf[off++] = (byte) (int) (long_1 >> 16);
        buf[off++] = (byte) (int) (long_1 >> 8);
        buf[off++] = (byte) (int) long_1;
    }

    public void method429(boolean bool_1) {
        writeByte(bool_1 ? 1 : 0);
    }

    public static int staticMethod378(String string_0) {
        return string_0.length() + 1;
    }

    public void method430(String string_1) {
        int i_3 = string_1.indexOf(0);
        if (i_3 >= 0)
            throw new IllegalArgumentException("");
        else {
            off += StaticClass52.staticMethod220(string_1, 0, string_1.length(), buf, off);
            buf[off++] = 0;
        }
    }

    public void method431(String string_1) {
        int i_3 = string_1.indexOf(0);
        if (i_3 >= 0)
            throw new IllegalArgumentException("");
        else {
            buf[off++] = 0;
            off += StaticClass52.staticMethod220(string_1, 0, string_1.length(), buf, off);
            buf[off++] = 0;
        }
    }

    public void method432(CharSequence charsequence_1) {
        int i_3 = StaticClass5.staticMethod33(charsequence_1);
        buf[off++] = 0;
        method438(i_3);
        off += StaticClass25.staticMethod147(buf, off, charsequence_1);
    }

    public void method433(byte[] bytes_1, int i_2, int i_3) {
        for (int i_5 = i_2; i_5 < i_3 + i_2; i_5++)
            buf[off++] = bytes_1[i_5];

    }

    public void method434(int i_1) {
        buf[off - i_1 - 4] = (byte) (i_1 >> 24);
        buf[off - i_1 - 3] = (byte) (i_1 >> 16);
        buf[off - i_1 - 2] = (byte) (i_1 >> 8);
        buf[off - i_1 - 1] = (byte) i_1;
    }

    public void method435(int i_1) {
        buf[off - i_1 - 2] = (byte) (i_1 >> 8);
        buf[off - i_1 - 1] = (byte) i_1;
    }

    public void method436(int i_1) {
        buf[off - i_1 - 1] = (byte) i_1;
    }

    public void method437(int i_1) {
        if (i_1 >= 0 && i_1 < 128)
            writeByte(i_1);
        else if (i_1 >= 0 && i_1 < 32768)
            writeShort(i_1 + 32768);
        else
            throw new IllegalArgumentException();
    }

    public void method438(int i_1) {
        if ((i_1 & ~0x7f) != 0) {
            if ((i_1 & ~0x3fff) != 0) {
                if ((i_1 & ~0x1fffff) != 0) {
                    if ((i_1 & ~0xfffffff) != 0)
                        writeByte(i_1 >>> 28 | 0x80);

                    writeByte(i_1 >>> 21 | 0x80);
                }

                writeByte(i_1 >>> 14 | 0x80);
            }

            writeByte(i_1 >>> 7 | 0x80);
        }

        writeByte(i_1 & 0x7f);
    }

    public int readUByte() {
        return buf[off++] & 0xff;
    }

    public byte method440() {
        return buf[off++];
    }

    public int readUShort() {
        off += 2;
        return ((buf[off - 2] & 0xff) << 8) + (buf[off - 1] & 0xff);
    }

    public int readShort() {
        off += 2;
        int i_2 = (buf[off - 1] & 0xff) + ((buf[off - 2] & 0xff) << 8);
        if (i_2 > 32767)
            i_2 -= 65536;

        return i_2;
    }

    public int method443() {
        off += 3;
        return (buf[off - 1] & 0xff) + ((buf[off - 3] & 0xff) << 16) + ((buf[off - 2] & 0xff) << 8);
    }

    public int readInt() {
        off += 4;
        return (buf[off - 1] & 0xff) + ((buf[off - 2] & 0xff) << 8) + ((buf[off - 3] & 0xff) << 16) + ((buf[off - 4] & 0xff) << 24);
    }

    public long method445() {
        long long_2 = readInt() & 0xffffffffL;
        long long_4 = readInt() & 0xffffffffL;
        return (long_2 << 32) + long_4;
    }

    public boolean method446() {
        return (readUByte() & 0x1) == 1;
    }

    public String method447() {
        if (buf[off] == 0) {
            ++off;
            return null;
        } else
            return method448();
    }

    public String method448() {
        int i_2 = off;

        while (buf[off++] != 0)
            ;

        int i_3 = off - i_2 - 1;
        return i_3 == 0 ? "" : StaticClass52.staticMethod221(buf, i_2, i_3);
    }

    public String method449() {
        byte b_2 = buf[off++];
        if (b_2 != 0)
            throw new IllegalStateException("");
        else {
            int i_3 = off;

            while (buf[off++] != 0)
                ;

            int i_4 = off - i_3 - 1;
            return i_4 == 0 ? "" : StaticClass52.staticMethod221(buf, i_3, i_4);
        }
    }

    public String method450() {
        byte b_2 = buf[off++];
        if (b_2 != 0)
            throw new IllegalStateException("");
        else {
            int i_3 = method456();
            if (off + i_3 > buf.length)
                throw new IllegalStateException("");
            else {
                String string_4 = StaticClass5.staticMethod34(buf, off, i_3);
                off += i_3;
                return string_4;
            }
        }
    }

    public void method451(byte[] bytes_1, int i_2, int i_3) {
        for (int i_5 = i_2; i_5 < i_2 + i_3; i_5++)
            bytes_1[i_5] = buf[off++];

    }

    public int method452() {
        int i_2 = buf[off] & 0xff;
        return i_2 < 128 ? readUByte() - 64 : readUShort() - 49152;
    }

    public int method453() {
        int i_2 = buf[off] & 0xff;
        return i_2 < 128 ? readUByte() : readUShort() - 32768;
    }

    public int method454() {
        return buf[off] < 0 ? readInt() & 0x7fffffff : readUShort();
    }

    public int method455() {
        if (buf[off] < 0)
            return readInt() & 0x7fffffff;
        else {
            int i_2 = readUShort();
            return i_2 == 32767 ? -1 : i_2;
        }
    }

    public int method456() {
        byte b_2 = buf[off++];

        int i_3;
        for (i_3 = 0; b_2 < 0; b_2 = buf[off++])
            i_3 = (i_3 | b_2 & 0x7f) << 7;

        return i_3 | b_2;
    }

    public void method457(int[] ints_1) {
        int i_3 = off / 8;
        off = 0;

        for (int i_4 = 0; i_4 < i_3; i_4++) {
            int i_5 = readInt();
            int i_6 = readInt();
            int i_7 = 0;
            int i_8 = -1640531527;

            for (int i_9 = 32; i_9-- > 0; i_6 += i_5 + (i_5 << 4 ^ i_5 >>> 5) ^ i_7 + ints_1[i_7 >>> 11 & 0x3]) {
                i_5 += (i_6 << 4 ^ i_6 >>> 5) + i_6 ^ i_7 + ints_1[i_7 & 0x3];
                i_7 += i_8;
            }

            off -= 8;
            writeInt(i_5);
            writeInt(i_6);
        }

    }

    public void method458(int[] ints_1) {
        int i_3 = off / 8;
        off = 0;

        for (int i_4 = 0; i_4 < i_3; i_4++) {
            int i_5 = readInt();
            int i_6 = readInt();
            int i_7 = -957401312;
            int i_8 = -1640531527;

            for (int i_9 = 32; i_9-- > 0; i_5 -= i_6 + (i_6 << 4 ^ i_6 >>> 5) ^ i_7 + ints_1[i_7 & 0x3]) {
                i_6 -= (i_5 << 4 ^ i_5 >>> 5) + i_5 ^ i_7 + ints_1[i_7 >>> 11 & 0x3];
                i_7 -= i_8;
            }

            off -= 8;
            writeInt(i_5);
            writeInt(i_6);
        }

    }

    public void method459(int[] ints_1, int i_2, int i_3) {
        int i_5 = off;
        off = i_2;
        int i_6 = (i_3 - i_2) / 8;

        for (int i_7 = 0; i_7 < i_6; i_7++) {
            int i_8 = readInt();
            int i_9 = readInt();
            int i_10 = 0;
            int i_11 = -1640531527;

            for (int i_12 = 32; i_12-- > 0; i_9 += (i_8 << 4 ^ i_8 >>> 5) + i_8 ^ i_10 + ints_1[i_10 >>> 11 & 0x3]) {
                i_8 += i_9 + (i_9 << 4 ^ i_9 >>> 5) ^ i_10 + ints_1[i_10 & 0x3];
                i_10 += i_11;
            }

            off -= 8;
            writeInt(i_8);
            writeInt(i_9);
        }

        off = i_5;
    }

    public void method460(int[] ints_1, int i_2, int i_3) {
        int i_5 = off;
        off = i_2;
        int i_6 = (i_3 - i_2) / 8;

        for (int i_7 = 0; i_7 < i_6; i_7++) {
            int i_8 = readInt();
            int i_9 = readInt();
            int i_10 = -957401312;
            int i_11 = -1640531527;

            for (int i_12 = 32; i_12-- > 0; i_8 -= (i_9 << 4 ^ i_9 >>> 5) + i_9 ^ i_10 + ints_1[i_10 & 0x3]) {
                i_9 -= (i_8 << 4 ^ i_8 >>> 5) + i_8 ^ ints_1[i_10 >>> 11 & 0x3] + i_10;
                i_10 -= i_11;
            }

            off -= 8;
            writeInt(i_8);
            writeInt(i_9);
        }

        off = i_5;
    }

    public void method461(BigInteger biginteger_1, BigInteger biginteger_2) {
        int i_4 = off;
        off = 0;
        byte[] bytes_5 = new byte[i_4];
        method451(bytes_5, 0, i_4);
        BigInteger biginteger_6 = new BigInteger(bytes_5);
        BigInteger biginteger_7 = biginteger_6.modPow(biginteger_1, biginteger_2);
        byte[] bytes_8 = biginteger_7.toByteArray();
        off = 0;
        writeShort(bytes_8.length);
        method433(bytes_8, 0, bytes_8.length);
    }

    public int method462(int i_1) {
        byte[] bytes_4 = buf;
        int i_5 = off;
        int i_6 = -1;

        for (int i_7 = i_1; i_7 < i_5; i_7++)
            i_6 = i_6 >>> 8 ^ staticIntArray126[(i_6 ^ bytes_4[i_7]) & 0xff];

        i_6 = ~i_6;
        writeInt(i_6);
        return i_6;
    }

    public boolean method463() {
        off -= 4;
        int i_2 = staticMethod376(buf, 0, off);
        int i_3 = readInt();

        System.out.println("uid " + i_3);

        return i_2 == i_3;
    }

    public void method464(int i_1) {
        buf[off++] = (byte) (i_1 + 128);
    }

    public void method465(int i_1) {
        buf[off++] = (byte) (0 - i_1);
    }

    public void method466(int i_1) {
        buf[off++] = (byte) (128 - i_1);
    }

    public int readUByteA() {
        return buf[off++] - 128 & 0xff;
    }

    public int readUByteN() {
        return 0 - buf[off++] & 0xff;
    }

    public int readUByteS() {
        return 128 - buf[off++] & 0xff;
    }

    public byte method470() {
        return (byte) (buf[off++] - 128);
    }

    public byte method471() {
        return (byte) (0 - buf[off++]);
    }

    public byte method472() {
        return (byte) (128 - buf[off++]);
    }

    public void method473(int i_1) {
        buf[off++] = (byte) i_1;
        buf[off++] = (byte) (i_1 >> 8);
    }

    public void method474(int i_1) {
        buf[off++] = (byte) (i_1 >> 8);
        buf[off++] = (byte) (i_1 + 128);
    }

    public void method475(int i_1) {
        buf[off++] = (byte) (i_1 + 128);
        buf[off++] = (byte) (i_1 >> 8);
    }

    public int readUShortLE() {
        off += 2;
        return (buf[off - 2] & 0xff) + ((buf[off - 1] & 0xff) << 8);
    }

    public int readUShortA() {
        off += 2;
        return ((buf[off - 2] & 0xff) << 8) + (buf[off - 1] - 128 & 0xff);
    }

    public int readUShortLEA() {
        off += 2;
        return ((buf[off - 1] & 0xff) << 8) + (buf[off - 2] - 128 & 0xff);
    }

    public int method479() {
        off += 2;
        int i_2 = (buf[off - 2] & 0xff) + ((buf[off - 1] & 0xff) << 8);
        if (i_2 > 32767)
            i_2 -= 65536;

        return i_2;
    }

    public void method480(int i_1) {
        buf[off++] = (byte) (i_1 >> 8);
        buf[off++] = (byte) (i_1 >> 16);
        buf[off++] = (byte) i_1;
    }

    public int readU24Int() {
        off += 3;
        return (buf[off - 3] & 0xff) + ((buf[off - 2] & 0xff) << 8) + ((buf[off - 1] & 0xff) << 16);
    }

    public void method482(int i_1) {
        buf[off++] = (byte) i_1;
        buf[off++] = (byte) (i_1 >> 8);
        buf[off++] = (byte) (i_1 >> 16);
        buf[off++] = (byte) (i_1 >> 24);
    }

    public void method483(int i_1) {
        buf[off++] = (byte) (i_1 >> 8);
        buf[off++] = (byte) i_1;
        buf[off++] = (byte) (i_1 >> 24);
        buf[off++] = (byte) (i_1 >> 16);
    }

    public void method484(int i_1) {
        buf[off++] = (byte) (i_1 >> 16);
        buf[off++] = (byte) (i_1 >> 24);
        buf[off++] = (byte) i_1;
        buf[off++] = (byte) (i_1 >> 8);
    }

    public int readIntLE() {
        off += 4;
        return ((buf[off - 1] & 0xff) << 24) + ((buf[off - 2] & 0xff) << 16) + ((buf[off - 3] & 0xff) << 8) + (buf[off - 4] & 0xff);
    }

    public int readIntME() {
        off += 4;
        return (buf[off - 3] & 0xff) + ((buf[off - 4] & 0xff) << 8) + ((buf[off - 1] & 0xff) << 16) + ((buf[off - 2] & 0xff) << 24);
    }

    public int readIntIM() {
        off += 4;
        return (buf[off - 2] & 0xff) + ((buf[off - 3] & 0xff) << 24) + ((buf[off - 4] & 0xff) << 16) + ((buf[off - 1] & 0xff) << 8);
    }

    public void method488(byte[] bytes_1, int i_2, int i_3) {
        for (int i_5 = i_2 + i_3 - 1; i_5 >= i_2; --i_5)
            bytes_1[i_5] = buf[off++];

    }

    public void method489(byte[] bytes_1, int i_2, int i_3) {
        for (int i_5 = i_2; i_5 < i_2 + i_3; i_5++) {
            bytes_1[i_5] = (byte) (buf[off++] - 128);
        }
    }

}

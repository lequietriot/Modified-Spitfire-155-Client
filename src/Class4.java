import java.io.EOFException;

public class Class4 {

    static Js5IndexImpl staticJs5IndexImpl8;
    static int staticInt53;
    boolean bool9 = false;
    int[] intArray5;
    String[] stringArray2;
    boolean[] boolArray1;
    boolean[] boolArray2;
    long long2;

    Class4() {
        intArray5 = new int[DataClass11.staticJs5IndexImpl9.numFiles(19)];
        stringArray2 = new String[DataClass11.staticJs5IndexImpl9.numFiles(15)];
        boolArray1 = new boolean[intArray5.length];

        int i_1;
        byte[] bytes_4;
        for (i_1 = 0; i_1 < intArray5.length; i_1++) {
            Config19 config19_3 = (Config19) Config19.staticCache16.get(i_1);
            Config19 config19_2;
            if (config19_3 != null)
                config19_2 = config19_3;
            else {
                bytes_4 = Config19.staticJs5Index19.getFile(19, i_1);
                config19_3 = new Config19();
                if (bytes_4 != null)
                    config19_3.decode(new Buffer(bytes_4));

                Config19.staticCache16.put(config19_3, i_1);
                config19_2 = config19_3;
            }

            boolArray1[i_1] = config19_2.bool66;
        }

        boolArray2 = new boolean[stringArray2.length];

        for (i_1 = 0; i_1 < stringArray2.length; i_1++) {
            Config15 config15_6 = (Config15) Config15.staticCache7.get(i_1);
            Config15 config15_5;
            if (config15_6 != null)
                config15_5 = config15_6;
            else {
                bytes_4 = Config15.staticJs5Index11.getFile(15, i_1);
                config15_6 = new Config15();
                if (bytes_4 != null)
                    config15_6.decode(new Buffer(bytes_4));

                Config15.staticCache7.put(config15_6, i_1);
                config15_5 = config15_6;
            }

            boolArray2[i_1] = config15_5.bool52;
        }

        for (i_1 = 0; i_1 < intArray5.length; i_1++)
            intArray5[i_1] = -1;

        method140();
    }

    void method134(int i_1, int i_2) {
        intArray5[i_1] = i_2;
        if (boolArray1[i_1])
            bool9 = true;

    }

    int method135(int i_1) {
        return intArray5[i_1];
    }

    void method136(int i_1, String string_2) {
        stringArray2[i_1] = string_2;
        if (boolArray2[i_1])
            bool9 = true;

    }

    String method137(int i_1) {
        return stringArray2[i_1];
    }

    void method138() {
        int i_2;
        for (i_2 = 0; i_2 < intArray5.length; i_2++)
            if (!boolArray1[i_2])
                intArray5[i_2] = -1;

        for (i_2 = 0; i_2 < stringArray2.length; i_2++)
            if (!boolArray2[i_2])
                stringArray2[i_2] = null;

    }

    FileOnDisk method139(boolean bool_1) {
        return StaticClass16.staticMethod111("2", Client.staticGameType7.string13, bool_1);
    }

    void shutdown() {
        FileOnDisk fileondisk_2 = method139(true);

        try {
            int i_3 = 3;
            int i_4 = 0;

            int i_5;
            for (i_5 = 0; i_5 < intArray5.length; i_5++)
                if (boolArray1[i_5] && intArray5[i_5] != -1) {
                    i_3 += 6;
                    ++i_4;
                }

            i_3 += 2;
            i_5 = 0;

            for (int i_6 = 0; i_6 < stringArray2.length; i_6++)
                if (boolArray2[i_6] && stringArray2[i_6] != null) {
                    i_3 += 2 + Buffer.staticMethod378(stringArray2[i_6]);
                    ++i_5;
                }

            Buffer buffer_18 = new Buffer(i_3);
            buffer_18.writeByte(1);
            buffer_18.writeShort(i_4);

            int i_7;
            for (i_7 = 0; i_7 < intArray5.length; i_7++)
                if (boolArray1[i_7] && intArray5[i_7] != -1) {
                    buffer_18.writeShort(i_7);
                    buffer_18.writeInt(intArray5[i_7]);
                }

            buffer_18.writeShort(i_5);

            for (i_7 = 0; i_7 < stringArray2.length; i_7++)
                if (boolArray2[i_7] && stringArray2[i_7] != null) {
                    buffer_18.writeShort(i_7);
                    buffer_18.method430(stringArray2[i_7]);
                }

            fileondisk_2.write(buffer_18.buf, 0, buffer_18.off);
        } catch (Exception exception_16) {
            ;
        } finally {
            try {
                fileondisk_2.close();
            } catch (Exception exception_15) {
                ;
            }

        }

        bool9 = false;
        long2 = StaticClass27.synchronizedMethod7();
    }

    void method140() {
        FileOnDisk fileondisk_2 = method139(false);

        try {
            byte[] bytes_3 = new byte[(int) fileondisk_2.method177()];

            int i_5;
            for (int i_4 = 0; i_4 < bytes_3.length; i_4 += i_5) {
                i_5 = fileondisk_2.method178(bytes_3, i_4, bytes_3.length - i_4);
                if (i_5 == -1)
                    throw new EOFException();
            }

            Buffer buffer_24 = new Buffer(bytes_3);
            if (buffer_24.buf.length - buffer_24.off < 1)
                return;

            int i_6 = buffer_24.readUByte();
            if (i_6 < 0 || i_6 > 1)
                return;

            int i_7 = buffer_24.readUShort();

            int i_8;
            int i_9;
            int i_10;
            for (i_8 = 0; i_8 < i_7; i_8++) {
                i_9 = buffer_24.readUShort();
                i_10 = buffer_24.readInt();
                if (boolArray1[i_9])
                    intArray5[i_9] = i_10;
            }

            i_8 = buffer_24.readUShort();

            for (i_9 = 0; i_9 < i_8; i_9++) {
                i_10 = buffer_24.readUShort();
                String string_11 = buffer_24.method448();
                if (boolArray2[i_10])
                    stringArray2[i_10] = string_11;
            }
        } catch (Exception exception_22) {
            ;
        } finally {
            try {
                fileondisk_2.close();
            } catch (Exception exception_21) {
                ;
            }

        }

        bool9 = false;
    }

    void method141() {
        if (bool9 && long2 < StaticClass27.synchronizedMethod7() - 60000L)
            shutdown();

    }

    boolean running() {
        return bool9;
    }

}

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class StaticClass16 {

    public static File staticFile2;
    public static BufferedFile staticBufferedFile1 = null;
    public static BufferedFile staticBufferedFile3 = null;
    public static BufferedFile staticBufferedFile2 = null;
    static File staticFile1;

    StaticClass16() throws Throwable {
        throw new Error();
    }

    public static File staticMethod108(String string_0, String string_1, int i_2) {
        String str_4 = i_2 == 0 ? "" : "" + i_2;
        staticFile1 = new File(Class5.staticString3, "jagex_cl_" + string_0 + "_" + string_1 + str_4 + ".dat");
        String string_5 = null;
        String string_6 = null;
        boolean bool_7 = false;
        File file_20;
        if (staticFile1.exists()) {
            try {
                FileOnDisk fileondisk_8 = new FileOnDisk(staticFile1, "rw", 10000L);

                Buffer buffer_9;
                int i_10;
                for (buffer_9 = new Buffer((int) fileondisk_8.method177()); buffer_9.off < buffer_9.buf.length; buffer_9.off += i_10) {
                    i_10 = fileondisk_8.method178(buffer_9.buf, buffer_9.off, buffer_9.buf.length - buffer_9.off);
                    if (i_10 == -1)
                        throw new IOException();
                }

                buffer_9.off = 0;
                i_10 = buffer_9.readUByte();
                if (i_10 < 1 || i_10 > 3)
                    throw new IOException("" + i_10);

                int i_11 = 0;
                if (i_10 > 1)
                    i_11 = buffer_9.readUByte();

                if (i_10 <= 2) {
                    string_5 = buffer_9.method449();
                    if (i_11 == 1)
                        string_6 = buffer_9.method449();
                } else {
                    string_5 = buffer_9.method450();
                    if (i_11 == 1)
                        string_6 = buffer_9.method450();
                }

                fileondisk_8.close();
            } catch (IOException ioexception_17) {
                ioexception_17.printStackTrace();
            }

            if (string_5 != null) {
                file_20 = new File(string_5);
                if (!file_20.exists())
                    string_5 = null;
            }

            if (string_5 != null) {
                file_20 = new File(string_5, "test.dat");
                if (!staticMethod110(file_20, true))
                    string_5 = null;
            }
        }

        if (string_5 == null && i_2 == 0)
            label103: for (int i_18 = 0; i_18 < AbstractClass1Sub1.staticStringArray6.length; i_18++)
                for (int i_21 = 0; i_21 < ExchangeOfferComparator3.staticStringArray5.length; i_21++) {
                    File file_22 = new File(ExchangeOfferComparator3.staticStringArray5[i_21] + AbstractClass1Sub1.staticStringArray6[i_18] + File.separatorChar + string_0 + File.separatorChar);
                    if (file_22.exists() && staticMethod110(new File(file_22, "test.dat"), true)) {
                        string_5 = file_22.toString();
                        bool_7 = true;
                        break label103;
                    }
                }

        if (string_5 == null) {
            string_5 = Class5.staticString3 + File.separatorChar + "jagexcache" + str_4 + File.separatorChar + string_0 + File.separatorChar + string_1 + File.separatorChar;
            bool_7 = true;
        }

        if (string_6 != null) {
            File file_19 = new File(string_6);
            file_20 = new File(string_5);

            try {
                File[] arr_23 = file_19.listFiles();
                File[] arr_24 = arr_23;

                for (int i_12 = 0; i_12 < arr_24.length; i_12++) {
                    File file_13 = arr_24[i_12];
                    File file_14 = new File(file_20, file_13.getName());
                    boolean bool_15 = file_13.renameTo(file_14);
                    if (!bool_15)
                        throw new IOException();
                }
            } catch (Exception exception_16) {
                exception_16.printStackTrace();
            }

            bool_7 = true;
        }

        if (bool_7)
            staticMethod109(new File(string_5), (File) null);

        return new File(string_5);
    }

    static void staticMethod109(File file_0, File file_1) {
        try {
            FileOnDisk fileondisk_3 = new FileOnDisk(staticFile1, "rw", 10000L);
            Buffer buffer_4 = new Buffer(500);
            buffer_4.writeByte(3);
            buffer_4.writeByte(file_1 != null ? 1 : 0);
            buffer_4.method432(file_0.getPath());
            if (file_1 != null)
                buffer_4.method432(file_1.getPath());

            fileondisk_3.write(buffer_4.buf, 0, buffer_4.off);
            fileondisk_3.close();
        } catch (IOException ioexception_5) {
            ioexception_5.printStackTrace();
        }

    }

    public static boolean staticMethod110(File file_0, boolean bool_1) {
        try {
            RandomAccessFile randomaccessfile_3 = new RandomAccessFile(file_0, "rw");
            int i_4 = randomaccessfile_3.read();
            randomaccessfile_3.seek(0L);
            randomaccessfile_3.write(i_4);
            randomaccessfile_3.seek(0L);
            randomaccessfile_3.close();
            if (bool_1)
                file_0.delete();

            return true;
        } catch (Exception exception_5) {
            return false;
        }
    }

    public static FileOnDisk staticMethod111(String string_0, String string_1, boolean bool_2) {
        File file_4 = new File(staticFile2, "preferences" + string_0 + ".dat");
        if (file_4.exists())
            try {
                FileOnDisk fileondisk_11 = new FileOnDisk(file_4, "rw", 10000L);
                return fileondisk_11;
            } catch (IOException ioexception_10) {
                ;
            }

        String str_5 = "";
        if (Ignore.staticInt25 == 33)
            str_5 = "_rc";
        else if (Ignore.staticInt25 == 34)
            str_5 = "_wip";

        File file_6 = new File(Class5.staticString3, "jagex_" + string_1 + "_preferences" + string_0 + str_5 + ".dat");
        FileOnDisk fileondisk_7;
        if (!bool_2 && file_6.exists())
            try {
                fileondisk_7 = new FileOnDisk(file_6, "rw", 10000L);
                return fileondisk_7;
            } catch (IOException ioexception_9) {
                ;
            }

        try {
            fileondisk_7 = new FileOnDisk(file_4, "rw", 10000L);
            return fileondisk_7;
        } catch (IOException ioexception_8) {
            throw new RuntimeException();
        }
    }

    public static byte[] staticMethod112() {
        byte[] bytes_1 = new byte[24];

        try {
            staticBufferedFile1.seek(0L);
            staticBufferedFile1.read(bytes_1);

            int i_2;
            for (i_2 = 0; i_2 < 24 && bytes_1[i_2] == 0; i_2++)
                ;

            if (i_2 >= 24)
                throw new IOException();
        } catch (Exception exception_4) {
            for (int i_3 = 0; i_3 < 24; i_3++)
                bytes_1[i_3] = -1;
        }

        return bytes_1;
    }

}

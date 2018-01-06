import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

public final class FileOnDisk {

    static String[] staticStringArray3;
    RandomAccessFile file;
    long long6;
    long pos;

    public FileOnDisk(File file_1, String string_2, long long_3) throws IOException {
        if (long_3 == -1L)
            long_3 = Long.MAX_VALUE;

        if (file_1.length() >= long_3)
            file_1.delete();

        file = new RandomAccessFile(file_1, string_2);
        long6 = long_3;
        pos = 0L;
        int i_5 = file.read();
        if (i_5 != -1 && !string_2.equals("r")) {
            file.seek(0L);
            file.write(i_5);
        }

        file.seek(0L);
    }

    final void seek(long long_1) throws IOException {
        file.seek(long_1);
        pos = long_1;
    }

    public final void write(byte[] bytes_1, int i_2, int i_3) throws IOException {
        if (pos + i_3 > long6) {
            file.seek(1L + long6);
            file.write(1);
            throw new EOFException();
        } else {
            file.write(bytes_1, i_2, i_3);
            pos += i_3;
        }
    }

    public final void close() throws IOException {
        method176(false);
    }

    public final void method176(boolean bool_1) throws IOException {
        if (file != null) {
            if (bool_1)
                try {
                    file.getFD().sync();
                } catch (SyncFailedException syncfailedexception_4) {
                    ;
                }

            file.close();
            file = null;
        }

    }

    public final long method177() throws IOException {
        return file.length();
    }

    public final int method178(byte[] bytes_1, int i_2, int i_3) throws IOException {
        int i_5 = file.read(bytes_1, i_2, i_3);
        if (i_5 > 0)
            pos += i_5;

        return i_5;
    }

    @Override
    protected void finalize() throws Throwable {
        if (file != null) {
            System.out.println("");
            close();
        }

    }

}

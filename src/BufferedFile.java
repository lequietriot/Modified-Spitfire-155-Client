import java.io.EOFException;
import java.io.IOException;

public class BufferedFile {

    static int staticInt77;
    long long7 = -1L;
    long long8 = -1L;
    int int151 = 0;
    FileOnDisk file;
    long long9;
    long long10;
    byte[] readBuffer;
    byte[] writeBuffer;
    long seek;
    long position;
    int int152;

    public BufferedFile(FileOnDisk fileondisk_1, int i_2, int i_3) throws IOException {
        file = fileondisk_1;
        long10 = long9 = fileondisk_1.method177();
        readBuffer = new byte[i_2];
        writeBuffer = new byte[i_3];
        seek = 0L;
    }

    public void close() throws IOException {
        flush();
        file.close();
    }

    public void seek(long long_1) throws IOException {
        if (long_1 < 0L)
            throw new IOException("");
        else
            seek = long_1;
    }

    public long position() {
        return long10;
    }

    public void read(byte[] bytes_1) throws IOException {
        this.read(bytes_1, 0, bytes_1.length);
    }

    public void read(byte[] bytes_1, int i_2, int i_3) throws IOException {
        try {
            if (i_2 + i_3 > bytes_1.length)
                throw new ArrayIndexOutOfBoundsException(i_3 + i_2 - bytes_1.length);

            if (long8 != -1L && seek >= long8 && seek + i_3 <= long8 + int151) {
                System.arraycopy(writeBuffer, (int) (seek - long8), bytes_1, i_2, i_3);
                seek += i_3;
                return;
            }

            long long_5 = seek;
            int i_8 = i_3;
            int i_9;
            if (seek >= long7 && seek < int152 + long7) {
                i_9 = (int) (int152 - (seek - long7));
                if (i_9 > i_3)
                    i_9 = i_3;

                System.arraycopy(readBuffer, (int) (seek - long7), bytes_1, i_2, i_9);
                seek += i_9;
                i_2 += i_9;
                i_3 -= i_9;
            }

            if (i_3 > readBuffer.length) {
                file.seek(seek);

                for (position = seek; i_3 > 0; i_3 -= i_9) {
                    i_9 = file.method178(bytes_1, i_2, i_3);
                    if (i_9 == -1)
                        break;

                    position += i_9;
                    seek += i_9;
                    i_2 += i_9;
                }
            } else if (i_3 > 0) {
                method182();
                i_9 = i_3;
                if (i_3 > int152)
                    i_9 = int152;

                System.arraycopy(readBuffer, 0, bytes_1, i_2, i_9);
                i_2 += i_9;
                i_3 -= i_9;
                seek += i_9;
            }

            if (long8 != -1L) {
                if (long8 > seek && i_3 > 0) {
                    i_9 = (int) (long8 - seek) + i_2;
                    if (i_9 > i_2 + i_3)
                        i_9 = i_2 + i_3;

                    while (i_2 < i_9) {
                        bytes_1[i_2++] = 0;
                        --i_3;
                        ++seek;
                    }
                }

                long long_15 = -1L;
                long long_11 = -1L;
                if (long8 >= long_5 && long8 < long_5 + i_8)
                    long_15 = long8;
                else if (long_5 >= long8 && long_5 < long8 + int151)
                    long_15 = long_5;

                if (int151 + long8 > long_5 && int151 + long8 <= i_8 + long_5)
                    long_11 = int151 + long8;
                else if (long_5 + i_8 > long8 && i_8 + long_5 <= long8 + int151)
                    long_11 = long_5 + i_8;

                if (long_15 > -1L && long_11 > long_15) {
                    int i_13 = (int) (long_11 - long_15);
                    System.arraycopy(writeBuffer, (int) (long_15 - long8), bytes_1, i_2 + (int) (long_15 - long_5), i_13);
                    if (long_11 > seek) {
                        i_3 = (int) (i_3 - (long_11 - seek));
                        seek = long_11;
                    }
                }
            }
        } catch (IOException ioexception_14) {
            position = -1L;
            throw ioexception_14;
        }

        if (i_3 > 0)
            throw new EOFException();
    }

    void method182() throws IOException {
        int152 = 0;
        if (position != seek) {
            file.seek(seek);
            position = seek;
        }

        int i_2;
        for (long7 = seek; int152 < readBuffer.length; int152 += i_2) {
            i_2 = file.method178(readBuffer, int152, readBuffer.length - int152);
            if (i_2 == -1)
                break;

            position += i_2;
        }

    }

    public void write(byte[] bytes_1, int i_2, int i_3) throws IOException {
        try {
            if (i_3 + seek > long10)
                long10 = seek + i_3;

            if (long8 != -1L && (seek < long8 || seek > long8 + int151))
                flush();

            if (long8 != -1L && seek + i_3 > long8 + writeBuffer.length) {
                int i_5 = (int) (writeBuffer.length - (seek - long8));
                System.arraycopy(bytes_1, i_2, writeBuffer, (int) (seek - long8), i_5);
                seek += i_5;
                i_2 += i_5;
                i_3 -= i_5;
                int151 = writeBuffer.length;
                flush();
            }

            if (i_3 <= writeBuffer.length) {
                if (i_3 > 0) {
                    if (long8 == -1L)
                        long8 = seek;

                    System.arraycopy(bytes_1, i_2, writeBuffer, (int) (seek - long8), i_3);
                    seek += i_3;
                    if (seek - long8 > int151)
                        int151 = (int) (seek - long8);

                }
            } else {
                if (seek != position) {
                    file.seek(seek);
                    position = seek;
                }

                file.write(bytes_1, i_2, i_3);
                position += i_3;
                if (position > long9)
                    long9 = position;

                long long_11 = -1L;
                long long_7 = -1L;
                if (seek >= long7 && seek < long7 + int152)
                    long_11 = seek;
                else if (long7 >= seek && long7 < i_3 + seek)
                    long_11 = long7;

                if (i_3 + seek > long7 && seek + i_3 <= int152 + long7)
                    long_7 = seek + i_3;
                else if (long7 + int152 > seek && int152 + long7 <= i_3 + seek)
                    long_7 = long7 + int152;

                if (long_11 > -1L && long_7 > long_11) {
                    int i_9 = (int) (long_7 - long_11);
                    System.arraycopy(bytes_1, (int) (long_11 + i_2 - seek), readBuffer, (int) (long_11 - long7), i_9);
                }

                seek += i_3;
            }
        } catch (IOException ioexception_10) {
            position = -1L;
            throw ioexception_10;
        }
    }

    void flush() throws IOException {
        if (long8 != -1L) {
            if (position != long8) {
                file.seek(long8);
                position = long8;
            }

            file.write(writeBuffer, 0, int151);
            position += int151;
            if (position > long9)
                long9 = position;

            long long_2 = -1L;
            long long_4 = -1L;
            if (long8 >= long7 && long8 < int152 + long7)
                long_2 = long8;
            else if (long7 >= long8 && long7 < long8 + int151)
                long_2 = long7;

            if (long8 + int151 > long7 && int151 + long8 <= int152 + long7)
                long_4 = int151 + long8;
            else if (int152 + long7 > long8 && long7 + int152 <= long8 + int151)
                long_4 = int152 + long7;

            if (long_2 > -1L && long_4 > long_2) {
                int i_6 = (int) (long_4 - long_2);
                System.arraycopy(writeBuffer, (int) (long_2 - long8), readBuffer, (int) (long_2 - long7), i_6);
            }

            long8 = -1L;
            int151 = 0;
        }

    }

}

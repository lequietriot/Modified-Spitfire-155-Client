import java.io.EOFException;
import java.io.IOException;

public final class Js5DiskCache {

    static byte[] staticByteArray3 = new byte[520];
    BufferedFile mainFile = null;
    BufferedFile indexFile = null;
    int maxSize = 65000;
    int id;

    public Js5DiskCache(int i_1, BufferedFile bufferedfile_2, BufferedFile bufferedfile_3, int i_4) {
        id = i_1;
        mainFile = bufferedfile_2;
        indexFile = bufferedfile_3;
        maxSize = i_4;
    }

    public byte[] get(int i_1) {
        BufferedFile bufferedfile_3 = mainFile;
        synchronized (mainFile) {
            Object obj_10000;
            try {
                if (indexFile.position() < i_1 * 6 + 6) {
                    obj_10000 = null;
                    return (byte[]) obj_10000;
                }

                indexFile.seek(i_1 * 6);
                indexFile.read(staticByteArray3, 0, 6);
                int i_4 = ((staticByteArray3[0] & 0xff) << 16) + ((staticByteArray3[1] & 0xff) << 8) + (staticByteArray3[2] & 0xff);
                int i_5 = (staticByteArray3[5] & 0xff) + ((staticByteArray3[4] & 0xff) << 8) + ((staticByteArray3[3] & 0xff) << 16);
                if (i_4 < 0 || i_4 > maxSize) {
                    obj_10000 = null;
                    return (byte[]) obj_10000;
                }

                if (i_5 > 0 && i_5 <= mainFile.position() / 520L) {
                    byte[] bytes_6 = new byte[i_4];
                    int i_7 = 0;

                    for (int i_8 = 0; i_7 < i_4; i_8++) {
                        if (i_5 == 0) {
                            obj_10000 = null;
                            return (byte[]) obj_10000;
                        }

                        mainFile.seek(i_5 * 520);
                        int i_9 = i_4 - i_7;
                        if (i_9 > 512)
                            i_9 = 512;

                        mainFile.read(staticByteArray3, 0, i_9 + 8);
                        int i_10 = ((staticByteArray3[0] & 0xff) << 8) + (staticByteArray3[1] & 0xff);
                        int i_11 = (staticByteArray3[3] & 0xff) + ((staticByteArray3[2] & 0xff) << 8);
                        int i_12 = (staticByteArray3[6] & 0xff) + ((staticByteArray3[4] & 0xff) << 16) + ((staticByteArray3[5] & 0xff) << 8);
                        int i_13 = staticByteArray3[7] & 0xff;
                        if (i_1 != i_10 || i_8 != i_11 || i_13 != id) {
                            obj_10000 = null;
                            return (byte[]) obj_10000;
                        }

                        if (i_12 < 0 || i_12 > mainFile.position() / 520L) {
                            obj_10000 = null;
                            return (byte[]) obj_10000;
                        }

                        for (int i_14 = 0; i_14 < i_9; i_14++)
                            bytes_6[i_7++] = staticByteArray3[i_14 + 8];

                        i_5 = i_12;
                    }

                    byte[] bytes_18 = bytes_6;
                    return bytes_18;
                }

                obj_10000 = null;
            } catch (IOException ioexception_16) {
                return null;
            }

            return (byte[]) obj_10000;
        }
    }

    public boolean put(int i_1, byte[] bytes_2, int i_3) {
        BufferedFile bufferedfile_5 = mainFile;
        synchronized (mainFile) {
            if (i_3 >= 0 && i_3 <= maxSize) {
                boolean bool_6 = this.put(i_1, bytes_2, i_3, true);
                if (!bool_6)
                    bool_6 = this.put(i_1, bytes_2, i_3, false);

                return bool_6;
            } else
                throw new IllegalArgumentException();
        }
    }

    boolean put(int i_1, byte[] bytes_2, int i_3, boolean bool_4) {
        BufferedFile bufferedfile_6 = mainFile;
        synchronized (mainFile) {
            try {
                int i_7;
                boolean bool_10000;
                if (bool_4) {
                    if (indexFile.position() < i_1 * 6 + 6) {
                        bool_10000 = false;
                        return bool_10000;
                    }

                    indexFile.seek(i_1 * 6);
                    indexFile.read(staticByteArray3, 0, 6);
                    i_7 = (staticByteArray3[5] & 0xff) + ((staticByteArray3[3] & 0xff) << 16) + ((staticByteArray3[4] & 0xff) << 8);
                    if (i_7 <= 0 || i_7 > mainFile.position() / 520L) {
                        bool_10000 = false;
                        return bool_10000;
                    }
                } else {
                    i_7 = (int) ((mainFile.position() + 519L) / 520L);
                    if (i_7 == 0)
                        i_7 = 1;
                }

                staticByteArray3[0] = (byte) (i_3 >> 16);
                staticByteArray3[1] = (byte) (i_3 >> 8);
                staticByteArray3[2] = (byte) i_3;
                staticByteArray3[3] = (byte) (i_7 >> 16);
                staticByteArray3[4] = (byte) (i_7 >> 8);
                staticByteArray3[5] = (byte) i_7;
                indexFile.seek(i_1 * 6);
                indexFile.write(staticByteArray3, 0, 6);
                int i_8 = 0;
                int i_9 = 0;

                while (true) {
                    if (i_8 < i_3)
                        label129: {
                            int i_10 = 0;
                            int i_11;
                            if (bool_4) {
                                mainFile.seek(i_7 * 520);

                                try {
                                    mainFile.read(staticByteArray3, 0, 8);
                                } catch (EOFException eofexception_15) {
                                    break label129;
                                }

                                i_11 = (staticByteArray3[1] & 0xff) + ((staticByteArray3[0] & 0xff) << 8);
                                int i_12 = ((staticByteArray3[2] & 0xff) << 8) + (staticByteArray3[3] & 0xff);
                                i_10 = ((staticByteArray3[4] & 0xff) << 16) + ((staticByteArray3[5] & 0xff) << 8) + (staticByteArray3[6] & 0xff);
                                int i_13 = staticByteArray3[7] & 0xff;
                                if (i_11 != i_1 || i_12 != i_9 || i_13 != id) {
                                    bool_10000 = false;
                                    return bool_10000;
                                }

                                if (i_10 < 0 || i_10 > mainFile.position() / 520L) {
                                    bool_10000 = false;
                                    return bool_10000;
                                }
                            }

                            if (i_10 == 0) {
                                bool_4 = false;
                                i_10 = (int) ((mainFile.position() + 519L) / 520L);
                                if (i_10 == 0)
                                    ++i_10;

                                if (i_7 == i_10)
                                    ++i_10;
                            }

                            if (i_3 - i_8 <= 512)
                                i_10 = 0;

                            staticByteArray3[0] = (byte) (i_1 >> 8);
                            staticByteArray3[1] = (byte) i_1;
                            staticByteArray3[2] = (byte) (i_9 >> 8);
                            staticByteArray3[3] = (byte) i_9;
                            staticByteArray3[4] = (byte) (i_10 >> 16);
                            staticByteArray3[5] = (byte) (i_10 >> 8);
                            staticByteArray3[6] = (byte) i_10;
                            staticByteArray3[7] = (byte) id;
                            mainFile.seek(i_7 * 520);
                            mainFile.write(staticByteArray3, 0, 8);
                            i_11 = i_3 - i_8;
                            if (i_11 > 512)
                                i_11 = 512;

                            mainFile.write(bytes_2, i_8, i_11);
                            i_8 += i_11;
                            i_7 = i_10;
                            ++i_9;
                            continue;
                        }

                    bool_10000 = true;
                    return bool_10000;
                }
            } catch (IOException ioexception_16) {
                return false;
            }
        }
    }

}

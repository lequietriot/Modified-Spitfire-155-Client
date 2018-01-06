public abstract class Js5Index {

    static GZipDecompressor staticGZipDecompressor1 = new GZipDecompressor();
    static int staticInt147 = 0;
    boolean bool18;
    boolean useByteArrays;
    public int crc;
    int numGroups;
    int[] groupIds;
    int[] groupCrcs;
    int[] groupVersions;
    int[] numFiles;
    int[][] fileIds;
    Object[] groups;
    Object[][] files;
    int[] groupHashes;
    Js5FileHashTable groupHashTable;
    int[][] fileHashes;
    Js5FileHashTable[] fileHashTables;

    Js5Index(boolean bool_1, boolean bool_2) {
        bool18 = bool_1;
        useByteArrays = bool_2;
    }

    void init(byte[] bytes_1) {
        crc = Buffer.staticMethod377(bytes_1, bytes_1.length);
        Buffer buffer_3 = new Buffer(staticMethod200(bytes_1));
        int i_4 = buffer_3.readUByte();
        if (i_4 >= 5 && i_4 <= 7) {
            if (i_4 >= 6)
                buffer_3.readInt();

            int i_5 = buffer_3.readUByte();
            if (i_4 >= 7)
                numGroups = buffer_3.method454();
            else
                numGroups = buffer_3.readUShort();

            int i_6 = 0;
            int i_7 = -1;
            groupIds = new int[numGroups];
            int i_8;
            if (i_4 >= 7)
                for (i_8 = 0; i_8 < numGroups; i_8++) {
                    groupIds[i_8] = i_6 += buffer_3.method454();
                    if (groupIds[i_8] > i_7)
                        i_7 = groupIds[i_8];
                }
            else
                for (i_8 = 0; i_8 < numGroups; i_8++) {
                    groupIds[i_8] = i_6 += buffer_3.readUShort();
                    if (groupIds[i_8] > i_7)
                        i_7 = groupIds[i_8];
                }

            groupCrcs = new int[i_7 + 1];
            groupVersions = new int[i_7 + 1];
            numFiles = new int[i_7 + 1];
            fileIds = new int[i_7 + 1][];
            groups = new Object[i_7 + 1];
            files = new Object[i_7 + 1][];
            if (i_5 != 0) {
                groupHashes = new int[i_7 + 1];

                for (i_8 = 0; i_8 < numGroups; i_8++)
                    groupHashes[groupIds[i_8]] = buffer_3.readInt();

                groupHashTable = new Js5FileHashTable(groupHashes);
            }

            for (i_8 = 0; i_8 < numGroups; i_8++)
                groupCrcs[groupIds[i_8]] = buffer_3.readInt();

            for (i_8 = 0; i_8 < numGroups; i_8++)
                groupVersions[groupIds[i_8]] = buffer_3.readInt();

            for (i_8 = 0; i_8 < numGroups; i_8++)
                numFiles[groupIds[i_8]] = buffer_3.readUShort();

            int i_9;
            int i_10;
            int i_11;
            int i_12;
            int i_13;
            if (i_4 >= 7)
                for (i_8 = 0; i_8 < numGroups; i_8++) {
                    i_9 = groupIds[i_8];
                    i_10 = numFiles[i_9];
                    i_6 = 0;
                    i_11 = -1;
                    fileIds[i_9] = new int[i_10];

                    for (i_12 = 0; i_12 < i_10; i_12++) {
                        i_13 = fileIds[i_9][i_12] = i_6 += buffer_3.method454();
                        if (i_13 > i_11)
                            i_11 = i_13;
                    }

                    files[i_9] = new Object[i_11 + 1];
                }
            else
                for (i_8 = 0; i_8 < numGroups; i_8++) {
                    i_9 = groupIds[i_8];
                    i_10 = numFiles[i_9];
                    i_6 = 0;
                    i_11 = -1;
                    fileIds[i_9] = new int[i_10];

                    for (i_12 = 0; i_12 < i_10; i_12++) {
                        i_13 = fileIds[i_9][i_12] = i_6 += buffer_3.readUShort();
                        if (i_13 > i_11)
                            i_11 = i_13;
                    }

                    files[i_9] = new Object[i_11 + 1];
                }

            if (i_5 != 0) {
                fileHashes = new int[i_7 + 1][];
                fileHashTables = new Js5FileHashTable[i_7 + 1];

                for (i_8 = 0; i_8 < numGroups; i_8++) {
                    i_9 = groupIds[i_8];
                    i_10 = numFiles[i_9];
                    fileHashes[i_9] = new int[files[i_9].length];

                    for (i_11 = 0; i_11 < i_10; i_11++)
                        fileHashes[i_9][fileIds[i_9][i_11]] = buffer_3.readInt();

                    fileHashTables[i_9] = new Js5FileHashTable(fileHashes[i_9]);
                }
            }

        } else
            throw new RuntimeException("");
    }

    void request(int i_1) {
    }

    public byte[] getFile(int i_1, int i_2) {
        return this.getFile(i_1, i_2, (int[]) null);
    }

    public byte[] getFile(int i_1, int i_2, int[] ints_3) {
        if (i_1 >= 0 && i_1 < files.length && files[i_1] != null && i_2 >= 0 && i_2 < files[i_1].length) {
            if (files[i_1][i_2] == null) {
                boolean bool_5 = loadGroup(i_1, ints_3);
                if (!bool_5) {
                    method307(i_1);
                    bool_5 = loadGroup(i_1, ints_3);
                    if (!bool_5)
                        return null;
                }
            }

            byte[] bytes_6 = BufferWrapper.staticMethod154(files[i_1][i_2], false);
            if (useByteArrays)
                files[i_1][i_2] = null;

            return bytes_6;
        } else
            return null;
    }

    public boolean contains(int i_1, int i_2) {
        if (i_1 >= 0 && i_1 < files.length && files[i_1] != null && i_2 >= 0 && i_2 < files[i_1].length) {
            if (files[i_1][i_2] != null)
                return true;
            else if (groups[i_1] != null)
                return true;
            else {
                method307(i_1);
                return groups[i_1] != null;
            }
        } else
            return false;
    }

    public boolean method306(int i_1) {
        if (groups[i_1] != null)
            return true;
        else {
            method307(i_1);
            return groups[i_1] != null;
        }
    }

    public boolean loaded() {
        boolean bool_2 = true;

        for (int i_3 = 0; i_3 < groupIds.length; i_3++) {
            int i_4 = groupIds[i_3];
            if (groups[i_4] == null) {
                method307(i_4);
                if (groups[i_4] == null)
                    bool_2 = false;
            }
        }

        return bool_2;
    }

    int getLoadedPercentage(int i_1) {
        return groups[i_1] != null ? 100 : 0;
    }

    public byte[] getFile(int i_1) {
        if (files.length == 1)
            return this.getFile(0, i_1);
        else if (files[i_1].length == 1)
            return this.getFile(i_1, 0);
        else
            throw new RuntimeException();
    }

    public byte[] getFile2(int i_1, int i_2) {
        if (i_1 >= 0 && i_1 < files.length && files[i_1] != null && i_2 >= 0 && i_2 < files[i_1].length) {
            if (files[i_1][i_2] == null) {
                boolean bool_4 = loadGroup(i_1, (int[]) null);
                if (!bool_4) {
                    method307(i_1);
                    bool_4 = loadGroup(i_1, (int[]) null);
                    if (!bool_4)
                        return null;
                }
            }

            byte[] bytes_5 = BufferWrapper.staticMethod154(files[i_1][i_2], false);
            return bytes_5;
        } else
            return null;
    }

    public byte[] getFile2(int i_1) {
        if (files.length == 1)
            return this.getFile2(0, i_1);
        else if (files[i_1].length == 1)
            return this.getFile2(i_1, 0);
        else
            throw new RuntimeException();
    }

    void method307(int i_1) {
    }

    public int[] getFileIds(int i_1) {
        return fileIds[i_1];
    }

    public int numFiles(int i_1) {
        return files[i_1].length;
    }

    public int numGroups() {
        return files.length;
    }

    public void clearGroup(int i_1) {
        for (int i_3 = 0; i_3 < files[i_1].length; i_3++)
            files[i_1][i_3] = null;

    }

    public void clear() {
        for (int i_2 = 0; i_2 < files.length; i_2++)
            if (files[i_2] != null)
                for (int i_3 = 0; i_3 < files[i_2].length; i_3++)
                    files[i_2][i_3] = null;

    }

    boolean loadGroup(int i_1, int[] ints_2) {
        if (groups[i_1] == null)
            return false;
        else {
            int i_4 = numFiles[i_1];
            int[] ints_5 = fileIds[i_1];
            Object[] arr_6 = files[i_1];
            boolean bool_7 = true;

            for (int i_8 = 0; i_8 < i_4; i_8++)
                if (arr_6[ints_5[i_8]] == null) {
                    bool_7 = false;
                    break;
                }

            if (bool_7)
                return true;
            else {
                byte[] bytes_20;
                if (ints_2 != null && (ints_2[0] != 0 || ints_2[1] != 0 || ints_2[2] != 0 || ints_2[3] != 0)) {
                    bytes_20 = BufferWrapper.staticMethod154(groups[i_1], true);
                    Buffer buffer_9 = new Buffer(bytes_20);
                    buffer_9.method460(ints_2, 5, buffer_9.buf.length);
                } else
                    bytes_20 = BufferWrapper.staticMethod154(groups[i_1], false);

                byte[] bytes_21;
                try {
                    bytes_21 = staticMethod200(bytes_20);
                } catch (RuntimeException runtimeexception_19) {
                    throw ClientError.staticMethod114(runtimeexception_19, "" + (ints_2 != null) + "," + i_1 + "," + bytes_20.length + "," + Buffer.staticMethod377(bytes_20, bytes_20.length) + "," + Buffer.staticMethod377(bytes_20, bytes_20.length - 2) + "," + groupCrcs[i_1] + "," + crc);
                }

                if (bool18)
                    groups[i_1] = null;

                if (i_4 > 1) {
                    int i_10 = bytes_21.length;
                    --i_10;
                    int i_11 = bytes_21[i_10] & 0xff;
                    i_10 -= i_11 * i_4 * 4;
                    Buffer buffer_12 = new Buffer(bytes_21);
                    int[] ints_13 = new int[i_4];
                    buffer_12.off = i_10;

                    int i_15;
                    int i_16;
                    for (int i_14 = 0; i_14 < i_11; i_14++) {
                        i_15 = 0;

                        for (i_16 = 0; i_16 < i_4; i_16++) {
                            i_15 += buffer_12.readInt();
                            ints_13[i_16] += i_15;
                        }
                    }

                    byte[][] bytes_22 = new byte[i_4][];

                    for (i_15 = 0; i_15 < i_4; i_15++) {
                        bytes_22[i_15] = new byte[ints_13[i_15]];
                        ints_13[i_15] = 0;
                    }

                    buffer_12.off = i_10;
                    i_15 = 0;

                    for (i_16 = 0; i_16 < i_11; i_16++) {
                        int i_17 = 0;

                        for (int i_18 = 0; i_18 < i_4; i_18++) {
                            i_17 += buffer_12.readInt();
                            System.arraycopy(bytes_21, i_15, bytes_22[i_18], ints_13[i_18], i_17);
                            ints_13[i_18] += i_17;
                            i_15 += i_17;
                        }
                    }

                    for (i_16 = 0; i_16 < i_4; i_16++)
                        if (!useByteArrays)
                            arr_6[ints_5[i_16]] = BufferWrapper.staticMethod153(bytes_22[i_16], false);
                        else
                            arr_6[ints_5[i_16]] = bytes_22[i_16];
                } else if (!useByteArrays)
                    arr_6[ints_5[0]] = BufferWrapper.staticMethod153(bytes_21, false);
                else
                    arr_6[ints_5[0]] = bytes_21;

                return true;
            }
        }
    }

    public int indexOf(String string_1) {
        string_1 = string_1.toLowerCase();
        return groupHashTable.indexOf(StaticClass51.staticMethod213(string_1));
    }

    public int indexOf(int i_1, String string_2) {
        string_2 = string_2.toLowerCase();
        return fileHashTables[i_1].indexOf(StaticClass51.staticMethod213(string_2));
    }

    public boolean contains(String string_1, String string_2) {
        string_1 = string_1.toLowerCase();
        string_2 = string_2.toLowerCase();
        int i_4 = groupHashTable.indexOf(StaticClass51.staticMethod213(string_1));
        if (i_4 < 0)
            return false;
        else {
            int i_5 = fileHashTables[i_4].indexOf(StaticClass51.staticMethod213(string_2));
            return i_5 >= 0;
        }
    }

    public byte[] getFile(String string_1, String string_2) {
        string_1 = string_1.toLowerCase();
        string_2 = string_2.toLowerCase();
        int i_4 = groupHashTable.indexOf(StaticClass51.staticMethod213(string_1));
        int i_5 = fileHashTables[i_4].indexOf(StaticClass51.staticMethod213(string_2));
        return this.getFile(i_4, i_5);
    }

    public boolean method308(String string_1, String string_2) {
        string_1 = string_1.toLowerCase();
        string_2 = string_2.toLowerCase();
        int i_4 = groupHashTable.indexOf(StaticClass51.staticMethod213(string_1));
        int i_5 = fileHashTables[i_4].indexOf(StaticClass51.staticMethod213(string_2));
        return this.contains(i_4, i_5);
    }

    public boolean method309(String string_1) {
        string_1 = string_1.toLowerCase();
        int i_3 = groupHashTable.indexOf(StaticClass51.staticMethod213(string_1));
        return method306(i_3);
    }

    public void request(String string_1) {
        string_1 = string_1.toLowerCase();
        int i_3 = groupHashTable.indexOf(StaticClass51.staticMethod213(string_1));
        if (i_3 >= 0)
            this.request(i_3);
    }

    public int getLoadedPercentage(String string_1) {
        string_1 = string_1.toLowerCase();
        int i_3 = groupHashTable.indexOf(StaticClass51.staticMethod213(string_1));
        return this.getLoadedPercentage(i_3);
    }

    static final byte[] staticMethod200(byte[] bytes_0) {
        Buffer buffer_2 = new Buffer(bytes_0);
        int i_3 = buffer_2.readUByte();
        int i_4 = buffer_2.readInt();
        if (i_4 >= 0 && (staticInt147 == 0 || i_4 <= staticInt147)) {
            if (i_3 == 0) {
                byte[] bytes_7 = new byte[i_4];
                buffer_2.method451(bytes_7, 0, i_4);
                return bytes_7;
            } else {
                int i_5 = buffer_2.readInt();
                if (i_5 < 0 || staticInt147 != 0 && i_5 > staticInt147)
                    throw new RuntimeException();
                else {
                    byte[] bytes_6 = new byte[i_5];
                    if (i_3 == 1)
                        StaticClass19.staticMethod129(bytes_6, i_5, bytes_0, i_4, 9);
                    else
                        staticGZipDecompressor1.inflate(buffer_2, bytes_6);

                    return bytes_6;
                }
            }
        } else
            throw new RuntimeException();
    }

}

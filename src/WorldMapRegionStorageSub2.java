public class WorldMapRegionStorageSub2 extends WorldMapRegionStorage {

    int int308;
    int int306;
    int int305;
    int int307;

    void method388(Buffer buffer_1, Buffer buffer_2) {
        int i_4 = buffer_2.readUByte();
        if (i_4 != DataClass2.staticDataClass2_2.int77)
            throw new IllegalStateException("");
        else {
            int36 = buffer_2.readUByte();
            int35 = buffer_2.readUByte();
            int34 = buffer_2.readUShort();
            int37 = buffer_2.readUShort();
            int308 = buffer_2.readUByte();
            int306 = buffer_2.readUByte();
            int32 = buffer_2.readUShort();
            int33 = buffer_2.readUShort();
            int305 = buffer_2.readUByte();
            int307 = buffer_2.readUByte();
            int35 = Math.min(int35, 4);
            shortArrayArrayArray1 = new short[1][64][64];
            shortArrayArrayArray2 = new short[int35][64][64];
            byteArrayArrayArray1 = new byte[int35][64][64];
            byteArrayArrayArray2 = new byte[int35][64][64];
            tiles = new WorldMapTile[int35][64][64][];
            i_4 = buffer_1.readUByte();
            if (DataClass1.staticDataClass1_1.int43 != i_4)
                throw new IllegalStateException("");
            else {
                int i_5 = buffer_1.readUByte();
                int i_6 = buffer_1.readUByte();
                int i_7 = buffer_1.readUByte();
                int i_8 = buffer_1.readUByte();
                if (int32 == i_5 && int33 == i_6 && int305 == i_7 && int307 == i_8)
                    for (int i_9 = 0; i_9 < 8; i_9++)
                        for (int i_10 = 0; i_10 < 8; i_10++)
                            method9(int305 * 8 + i_9, int307 * 8 + i_10, buffer_1);
                else
                    throw new IllegalStateException("");
            }
        }
    }

    boolean method389(int i_1, int i_2) {
        return i_1 < int305 * 8 ? false : i_2 < int307 * 8 ? false : i_1 >= 8 + int305 * 8 ? false : i_2 < 8 + int307 * 8;
    }

    @Override
    public boolean equals(Object object_1) {
        if (!(object_1 instanceof WorldMapRegionStorageSub2))
            return false;
        else {
            WorldMapRegionStorageSub2 worldmapregionstoragesub2_2 = (WorldMapRegionStorageSub2) object_1;
            return worldmapregionstoragesub2_2.int32 == int32 && worldmapregionstoragesub2_2.int33 == int33 ? int305 == worldmapregionstoragesub2_2.int305 && int307 == worldmapregionstoragesub2_2.int307 : false;
        }
    }

    @Override
    public int hashCode() {
        return int32 | int33 << 8 | int305 << 16 | int307 << 24;
    }

    int method390() {
        return int308;
    }

    int method391() {
        return int306;
    }

    int method392() {
        return int305;
    }

    int method393() {
        return int307;
    }

}

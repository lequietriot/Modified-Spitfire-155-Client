public class WorldMapRegionStorageSub1 extends WorldMapRegionStorage {

    void method514(Buffer buffer_1, Buffer buffer_2) {
        int i_4 = buffer_2.readUByte();
        if (i_4 != DataClass2.staticDataClass2_1.int77)
            throw new IllegalStateException("");
        else {
            int36 = buffer_2.readUByte();
            int35 = buffer_2.readUByte();
            int34 = buffer_2.readUShort();
            int37 = buffer_2.readUShort();
            int32 = buffer_2.readUShort();
            int33 = buffer_2.readUShort();
            int35 = Math.min(int35, 4);
            shortArrayArrayArray1 = new short[1][64][64];
            shortArrayArrayArray2 = new short[int35][64][64];
            byteArrayArrayArray1 = new byte[int35][64][64];
            byteArrayArrayArray2 = new byte[int35][64][64];
            tiles = new WorldMapTile[int35][64][64][];
            i_4 = buffer_1.readUByte();
            if (i_4 != DataClass1.staticDataClass1_2.int43)
                throw new IllegalStateException("");
            else {
                int i_5 = buffer_1.readUByte();
                int i_6 = buffer_1.readUByte();
                if (int32 == i_5 && int33 == i_6)
                    for (int i_7 = 0; i_7 < 64; i_7++)
                        for (int i_8 = 0; i_8 < 64; i_8++)
                            method9(i_7, i_8, buffer_1);
                else
                    throw new IllegalStateException("");
            }
        }
    }

    @Override
    public boolean equals(Object object_1) {
        if (!(object_1 instanceof WorldMapRegionStorageSub1))
            return false;
        else {
            WorldMapRegionStorageSub1 worldmapregionstoragesub1_2 = (WorldMapRegionStorageSub1) object_1;
            return worldmapregionstoragesub1_2.int32 == int32 && int33 == worldmapregionstoragesub1_2.int33;
        }
    }

    @Override
    public int hashCode() {
        return int32 | int33 << 8;
    }

}

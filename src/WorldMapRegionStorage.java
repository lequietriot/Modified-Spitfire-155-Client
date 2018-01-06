import java.util.LinkedList;

public abstract class WorldMapRegionStorage {

    static Sprite[] staticSpriteArray2;
    int int32;
    int int33;
    int int34;
    int int35;
    short[][][] shortArrayArrayArray1;
    short[][][] shortArrayArrayArray2;
    byte[][][] byteArrayArrayArray1;
    byte[][][] byteArrayArrayArray2;
    WorldMapTile[][][][] tiles;
    int int36;
    int int37;
    static int staticInt8;
    static int staticInt9;

    WorldMapRegionStorage() {
        new LinkedList();
    }

    void method9(int i_1, int i_2, Buffer buffer_3) {
        int i_5 = buffer_3.readUByte();
        if (i_5 != 0)
            if ((i_5 & 0x1) != 0)
                method10(i_1, i_2, buffer_3, i_5);
            else
                method11(i_1, i_2, buffer_3, i_5);
    }

    void method10(int i_1, int i_2, Buffer buffer_3, int i_4) {
        boolean bool_6 = (i_4 & 0x2) != 0;
        if (bool_6)
            shortArrayArrayArray2[0][i_1][i_2] = (short) buffer_3.readUByte();

        shortArrayArrayArray1[0][i_1][i_2] = (short) buffer_3.readUByte();
    }

    void method11(int i_1, int i_2, Buffer buffer_3, int i_4) {
        int i_6 = 1 + ((i_4 & 0x18) >> 3);
        boolean bool_7 = (i_4 & 0x2) != 0;
        boolean bool_8 = (i_4 & 0x4) != 0;
        shortArrayArrayArray1[0][i_1][i_2] = (short) buffer_3.readUByte();
        int i_9;
        int i_10;
        int i_12;
        if (bool_7) {
            i_9 = buffer_3.readUByte();

            for (i_10 = 0; i_10 < i_9; i_10++) {
                int i_11 = buffer_3.readUByte();
                if (i_11 != 0) {
                    shortArrayArrayArray2[i_10][i_1][i_2] = (short) i_11;
                    i_12 = buffer_3.readUByte();
                    byteArrayArrayArray1[i_10][i_1][i_2] = (byte) (i_12 >> 2);
                    byteArrayArrayArray2[i_10][i_1][i_2] = (byte) (i_12 & 0x3);
                }
            }
        }

        if (bool_8)
            for (i_9 = 0; i_9 < i_6; i_9++) {
                i_10 = buffer_3.readUByte();
                if (i_10 != 0) {
                    WorldMapTile[] arr_15 = tiles[i_9][i_1][i_2] = new WorldMapTile[i_10];

                    for (i_12 = 0; i_12 < i_10; i_12++) {
                        int i_13 = buffer_3.method455();
                        int i_14 = buffer_3.readUByte();
                        arr_15[i_12] = new WorldMapTile(i_13, i_14 >> 2, i_14 & 0x3);
                    }
                }
            }

    }

    int method12(int i_1, int i_2) {
        return i_1 >= 0 && i_2 >= 0 ? i_1 < 64 && i_2 < 64 ? shortArrayArrayArray1[0][i_1][i_2] - 1 : -1 : -1;
    }

    int method13() {
        return int32;
    }

    int method14() {
        return int33;
    }

}

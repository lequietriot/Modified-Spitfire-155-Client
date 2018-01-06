public class Scene {

    public static boolean staticBool12 = true;
    static int staticInt89 = 0;
    static int staticInt84 = 0;
    static GameObject[] staticGameObjectArray1 = new GameObject[100];
    static boolean staticBool14 = false;
    static int staticInt96 = 0;
    static int staticInt97 = 0;
    static int staticInt98 = 0;
    public static int staticInt103 = -1;
    public static int staticInt99 = -1;
    static boolean staticBool13 = false;
    static int staticInt81 = 4;
    static int[] staticIntArray49;
    static DataClass7[][] staticDataClass7ArrayArray1;
    static int staticInt100;
    static DataClass7[] staticDataClass7Array1;
    static Deque staticDeque1;
    static final int[] staticIntArray48;
    static final int[] staticIntArray50;
    static final int[] staticIntArray51;
    static final int[] staticIntArray52;
    static final int[] staticIntArray53;
    static final int[] staticIntArray54;
    static final int[] staticIntArray55;
    static boolean[][][][] staticBoolArrayArrayArrayArray1;
    int int181 = 0;
    int int184 = 0;
    GameObject[] gameObjectArray1 = new GameObject[5000];
    int[][] intArrayArray9 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };
    int[][] intArrayArray8 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };
    int int180;
    int int182;
    int int183;
    Tile[][][] tiles;
    int[][][] intArrayArrayArray4;
    int[][][] intArrayArrayArray3;
    static int staticInt105;
    static int staticInt106;
    static int staticInt107;
    static int staticInt101;
    static int staticInt102;
    static int staticInt83;
    static int staticInt92;
    static int staticInt93;
    static int staticInt108;
    static int staticInt94;
    static int staticInt104;
    static boolean[][] staticBoolArrayArray1;
    static int staticInt95;
    static int staticInt90;
    static int staticInt91;
    static int staticInt88;
    static int staticInt87;
    static int staticInt85;
    static int staticInt80;
    static int staticInt86;
    static int staticInt82;

    static {
        staticIntArray49 = new int[staticInt81];
        staticDataClass7ArrayArray1 = new DataClass7[staticInt81][500];
        staticInt100 = 0;
        staticDataClass7Array1 = new DataClass7[500];
        staticDeque1 = new Deque();
        staticIntArray48 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };
        staticIntArray50 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };
        staticIntArray51 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };
        staticIntArray52 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };
        staticIntArray53 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };
        staticIntArray54 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };
        staticIntArray55 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };
        staticBoolArrayArrayArrayArray1 = new boolean[8][32][51][51];
    }

    public Scene(int i_1, int i_2, int i_3, int[][][] ints_4) {
        int180 = i_1;
        int182 = i_2;
        int183 = i_3;
        tiles = new Tile[i_1][i_2][i_3];
        intArrayArrayArray4 = new int[i_1][i_2 + 1][i_3 + 1];
        intArrayArrayArray3 = ints_4;
        method183();
    }

    public void method183() {
        int i_1;
        int i_2;
        for (i_1 = 0; i_1 < int180; i_1++)
            for (i_2 = 0; i_2 < int182; i_2++)
                for (int i_3 = 0; i_3 < int183; i_3++)
                    tiles[i_1][i_2][i_3] = null;

        for (i_1 = 0; i_1 < staticInt81; i_1++) {
            for (i_2 = 0; i_2 < staticIntArray49[i_1]; i_2++)
                staticDataClass7ArrayArray1[i_1][i_2] = null;

            staticIntArray49[i_1] = 0;
        }

        for (i_1 = 0; i_1 < int184; i_1++)
            gameObjectArray1[i_1] = null;

        int184 = 0;

        for (i_1 = 0; i_1 < staticGameObjectArray1.length; i_1++)
            staticGameObjectArray1[i_1] = null;

    }

    public void method184(int i_1) {
        int181 = i_1;

        for (int i_2 = 0; i_2 < int182; i_2++)
            for (int i_3 = 0; i_3 < int183; i_3++)
                if (tiles[i_1][i_2][i_3] == null)
                    tiles[i_1][i_2][i_3] = new Tile(i_1, i_2, i_3);

    }

    public void method185(int i_1, int i_2) {
        Tile tile_3 = tiles[0][i_1][i_2];

        for (int i_4 = 0; i_4 < 3; i_4++) {
            Tile tile_5 = tiles[i_4][i_1][i_2] = tiles[i_4 + 1][i_1][i_2];
            if (tile_5 != null) {
                --tile_5.int365;

                for (int i_6 = 0; i_6 < tile_5.numGameObjects; i_6++) {
                    GameObject gameobject_7 = tile_5.gameObjects[i_6];
                    if ((gameobject_7.int206 >> 29 & 0x3) == 2 && gameobject_7.int203 == i_1 && gameobject_7.int208 == i_2)
                        --gameobject_7.int200;
                }
            }
        }

        if (tiles[0][i_1][i_2] == null)
            tiles[0][i_1][i_2] = new Tile(0, i_1, i_2);

        tiles[0][i_1][i_2].groundTile = tile_3;
        tiles[3][i_1][i_2] = null;
    }

    public static void staticMethod115(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
        DataClass7 dataclass7_8 = new DataClass7();
        dataclass7_8.int176 = i_2 / 128;
        dataclass7_8.int160 = i_3 / 128;
        dataclass7_8.int161 = i_4 / 128;
        dataclass7_8.int171 = i_5 / 128;
        dataclass7_8.int162 = i_1;
        dataclass7_8.int163 = i_2;
        dataclass7_8.int164 = i_3;
        dataclass7_8.int165 = i_4;
        dataclass7_8.int166 = i_5;
        dataclass7_8.int167 = i_6;
        dataclass7_8.int168 = i_7;
        staticDataClass7ArrayArray1[i_0][staticIntArray49[i_0]++] = dataclass7_8;
    }

    public void method186(int i_1, int i_2, int i_3, int i_4) {
        Tile tile_5 = tiles[i_1][i_2][i_3];
        if (tile_5 != null)
            tiles[i_1][i_2][i_3].int362 = i_4;
    }

    public void method187(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12, int i_13, int i_14, int i_15, int i_16, int i_17, int i_18, int i_19, int i_20) {
        DataClass9 dataclass9_21;
        int i_22;
        if (i_4 == 0) {
            dataclass9_21 = new DataClass9(i_11, i_12, i_13, i_14, -1, i_19, false);

            for (i_22 = i_1; i_22 >= 0; --i_22)
                if (tiles[i_22][i_2][i_3] == null)
                    tiles[i_22][i_2][i_3] = new Tile(i_22, i_2, i_3);

            tiles[i_1][i_2][i_3].dataClass9_1 = dataclass9_21;
        } else if (i_4 != 1) {
            DataClass4 dataclass4_23 = new DataClass4(i_4, i_5, i_6, i_2, i_3, i_7, i_8, i_9, i_10, i_11, i_12, i_13, i_14, i_15, i_16, i_17, i_18, i_19, i_20);

            for (i_22 = i_1; i_22 >= 0; --i_22)
                if (tiles[i_22][i_2][i_3] == null)
                    tiles[i_22][i_2][i_3] = new Tile(i_22, i_2, i_3);

            tiles[i_1][i_2][i_3].tilePaint = dataclass4_23;
        } else {
            dataclass9_21 = new DataClass9(i_15, i_16, i_17, i_18, i_6, i_20, i_7 == i_8 && i_7 == i_9 && i_7 == i_10);

            for (i_22 = i_1; i_22 >= 0; --i_22)
                if (tiles[i_22][i_2][i_3] == null)
                    tiles[i_22][i_2][i_3] = new Tile(i_22, i_2, i_3);

            tiles[i_1][i_2][i_3].dataClass9_1 = dataclass9_21;
        }
    }

    public void addGroundDecoration(int i_1, int i_2, int i_3, int i_4, Renderable renderable_5, int i_6, int i_7) {
        if (renderable_5 != null) {
            GroundDecoration grounddecoration_8 = new GroundDecoration();
            grounddecoration_8.gameObject = renderable_5;
            grounddecoration_8.x = i_2 * 128 + 64;
            grounddecoration_8.y = i_3 * 128 + 64;
            grounddecoration_8.int143 = i_4;
            grounddecoration_8.int142 = i_6;
            grounddecoration_8.int141 = i_7;
            if (tiles[i_1][i_2][i_3] == null)
                tiles[i_1][i_2][i_3] = new Tile(i_1, i_2, i_3);

            tiles[i_1][i_2][i_3].groundDecoration = grounddecoration_8;
        }
    }

    public void addGroundItemPile(int i_1, int i_2, int i_3, int i_4, Renderable renderable_5, int i_6, Renderable renderable_7, Renderable renderable_8) {
        GroundItemPile grounditempile_9 = new GroundItemPile();
        grounditempile_9.topItem = renderable_5;
        grounditempile_9.x = i_2 * 128 + 64;
        grounditempile_9.y = i_3 * 128 + 64;
        grounditempile_9.int127 = i_4;
        grounditempile_9.int129 = i_6;
        grounditempile_9.bottomItem = renderable_7;
        grounditempile_9.middleItem = renderable_8;
        int i_10 = 0;
        Tile tile_11 = tiles[i_1][i_2][i_3];
        if (tile_11 != null)
            for (int i_12 = 0; i_12 < tile_11.numGameObjects; i_12++)
                if ((tile_11.gameObjects[i_12].int205 & 0x100) == 256 && tile_11.gameObjects[i_12].renderable5 instanceof Model) {
                    Model model_13 = (Model) tile_11.gameObjects[i_12].renderable5;
                    model_13.method640();
                    if (model_13.modelHeight > i_10)
                        i_10 = model_13.modelHeight;
                }

        grounditempile_9.int128 = i_10;
        if (tiles[i_1][i_2][i_3] == null)
            tiles[i_1][i_2][i_3] = new Tile(i_1, i_2, i_3);

        tiles[i_1][i_2][i_3].groundItemPile = grounditempile_9;
    }

    public void method188(int i_1, int i_2, int i_3, int i_4, Renderable renderable_5, Renderable renderable_6, int i_7, int i_8, int i_9, int i_10) {
        if (renderable_5 != null || renderable_6 != null) {
            DataClass10 dataclass10_11 = new DataClass10();
            dataclass10_11.int193 = i_9;
            dataclass10_11.int194 = i_10;
            dataclass10_11.int189 = i_2 * 128 + 64;
            dataclass10_11.int190 = i_3 * 128 + 64;
            dataclass10_11.int195 = i_4;
            dataclass10_11.renderable4 = renderable_5;
            dataclass10_11.renderable3 = renderable_6;
            dataclass10_11.int191 = i_7;
            dataclass10_11.int192 = i_8;

            for (int i_12 = i_1; i_12 >= 0; --i_12)
                if (tiles[i_12][i_2][i_3] == null)
                    tiles[i_12][i_2][i_3] = new Tile(i_12, i_2, i_3);

            tiles[i_1][i_2][i_3].dataClass10_1 = dataclass10_11;
        }
    }

    public void addWallObject(int i_1, int i_2, int i_3, int i_4, Renderable renderable_5, Renderable renderable_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12) {
        if (renderable_5 != null) {
            WallObject wallobject_13 = new WallObject();
            wallobject_13.int153 = i_11;
            wallobject_13.int159 = i_12;
            wallobject_13.x = i_2 * 128 + 64;
            wallobject_13.y = i_3 * 128 + 64;
            wallobject_13.int158 = i_4;
            wallobject_13.renderable1 = renderable_5;
            wallobject_13.renderable2 = renderable_6;
            wallobject_13.int157 = i_7;
            wallobject_13.int155 = i_8;
            wallobject_13.int156 = i_9;
            wallobject_13.int154 = i_10;

            for (int i_14 = i_1; i_14 >= 0; --i_14)
                if (tiles[i_14][i_2][i_3] == null)
                    tiles[i_14][i_2][i_3] = new Tile(i_14, i_2, i_3);

            tiles[i_1][i_2][i_3].wallObject = wallobject_13;
        }
    }

    public boolean method189(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, Renderable renderable_7, int i_8, int i_9, int i_10) {
        if (renderable_7 == null)
            return true;
        else {
            int i_11 = i_2 * 128 + i_5 * 64;
            int i_12 = i_3 * 128 + i_6 * 64;
            return method192(i_1, i_2, i_3, i_5, i_6, i_11, i_12, i_4, renderable_7, i_8, false, i_9, i_10);
        }
    }

    public boolean method190(int i_1, int i_2, int i_3, int i_4, int i_5, Renderable renderable_6, int i_7, int i_8, boolean bool_9) {
        if (renderable_6 == null)
            return true;
        else {
            int i_10 = i_2 - i_5;
            int i_11 = i_3 - i_5;
            int i_12 = i_2 + i_5;
            int i_13 = i_3 + i_5;
            if (bool_9) {
                if (i_7 > 640 && i_7 < 1408)
                    i_13 += 128;

                if (i_7 > 1152 && i_7 < 1920)
                    i_12 += 128;

                if (i_7 > 1664 || i_7 < 384)
                    i_11 -= 128;

                if (i_7 > 128 && i_7 < 896)
                    i_10 -= 128;
            }

            i_10 /= 128;
            i_11 /= 128;
            i_12 /= 128;
            i_13 /= 128;
            return method192(i_1, i_10, i_11, i_12 - i_10 + 1, i_13 - i_11 + 1, i_2, i_3, i_4, renderable_6, i_7, true, i_8, 0);
        }
    }

    public boolean method191(int i_1, int i_2, int i_3, int i_4, int i_5, Renderable renderable_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12) {
        return renderable_6 == null ? true : method192(i_1, i_9, i_10, i_11 - i_9 + 1, i_12 - i_10 + 1, i_2, i_3, i_4, renderable_6, i_7, true, i_8, 0);
    }

    boolean method192(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, Renderable renderable_9, int i_10, boolean bool_11, int i_12, int i_13) {
        int i_15;
        for (int i_14 = i_2; i_14 < i_2 + i_4; i_14++)
            for (i_15 = i_3; i_15 < i_3 + i_5; i_15++) {
                if (i_14 < 0 || i_15 < 0 || i_14 >= int182 || i_15 >= int183)
                    return false;

                Tile tile_16 = tiles[i_1][i_14][i_15];
                if (tile_16 != null && tile_16.numGameObjects >= 5)
                    return false;
            }

        GameObject gameobject_20 = new GameObject();
        gameobject_20.int206 = i_12;
        gameobject_20.int205 = i_13;
        gameobject_20.int200 = i_1;
        gameobject_20.int201 = i_6;
        gameobject_20.int198 = i_7;
        gameobject_20.int197 = i_8;
        gameobject_20.renderable5 = renderable_9;
        gameobject_20.int199 = i_10;
        gameobject_20.int203 = i_2;
        gameobject_20.int208 = i_3;
        gameobject_20.int202 = i_2 + i_4 - 1;
        gameobject_20.int207 = i_3 + i_5 - 1;

        for (i_15 = i_2; i_15 < i_2 + i_4; i_15++)
            for (int i_21 = i_3; i_21 < i_3 + i_5; i_21++) {
                int i_17 = 0;
                if (i_15 > i_2)
                    ++i_17;

                if (i_15 < i_2 + i_4 - 1)
                    i_17 += 4;

                if (i_21 > i_3)
                    i_17 += 8;

                if (i_21 < i_3 + i_5 - 1)
                    i_17 += 2;

                for (int i_18 = i_1; i_18 >= 0; --i_18)
                    if (tiles[i_18][i_15][i_21] == null)
                        tiles[i_18][i_15][i_21] = new Tile(i_18, i_15, i_21);

                Tile tile_22 = tiles[i_1][i_15][i_21];
                tile_22.gameObjects[tile_22.numGameObjects] = gameobject_20;
                tile_22.gameObjectFlags[tile_22.numGameObjects] = i_17;
                tile_22.flags |= i_17;
                ++tile_22.numGameObjects;
            }

        if (bool_11)
            gameObjectArray1[int184++] = gameobject_20;

        return true;
    }

    public void method193() {
        for (int i_1 = 0; i_1 < int184; i_1++) {
            GameObject gameobject_2 = gameObjectArray1[i_1];
            method194(gameobject_2);
            gameObjectArray1[i_1] = null;
        }

        int184 = 0;
    }

    void method194(GameObject gameobject_1) {
        for (int i_2 = gameobject_1.int203; i_2 <= gameobject_1.int202; i_2++)
            for (int i_3 = gameobject_1.int208; i_3 <= gameobject_1.int207; i_3++) {
                Tile tile_4 = tiles[gameobject_1.int200][i_2][i_3];
                if (tile_4 != null) {
                    int i_5;
                    for (i_5 = 0; i_5 < tile_4.numGameObjects; i_5++)
                        if (tile_4.gameObjects[i_5] == gameobject_1) {
                            --tile_4.numGameObjects;

                            for (int i_6 = i_5; i_6 < tile_4.numGameObjects; i_6++) {
                                tile_4.gameObjects[i_6] = tile_4.gameObjects[i_6 + 1];
                                tile_4.gameObjectFlags[i_6] = tile_4.gameObjectFlags[i_6 + 1];
                            }

                            tile_4.gameObjects[tile_4.numGameObjects] = null;
                            break;
                        }

                    tile_4.flags = 0;

                    for (i_5 = 0; i_5 < tile_4.numGameObjects; i_5++)
                        tile_4.flags |= tile_4.gameObjectFlags[i_5];
                }
            }

    }

    public void method195(int i_1, int i_2, int i_3, int i_4) {
        Tile tile_5 = tiles[i_1][i_2][i_3];
        if (tile_5 != null) {
            WallObject wallobject_6 = tile_5.wallObject;
            if (wallobject_6 != null) {
                wallobject_6.int156 = wallobject_6.int156 * i_4 / 16;
                wallobject_6.int154 = wallobject_6.int154 * i_4 / 16;
            }
        }
    }

    public void method196(int i_1, int i_2, int i_3) {
        Tile tile_4 = tiles[i_1][i_2][i_3];
        if (tile_4 != null)
            tile_4.dataClass10_1 = null;
    }

    public void method197(int i_1, int i_2, int i_3) {
        Tile tile_4 = tiles[i_1][i_2][i_3];
        if (tile_4 != null)
            tile_4.wallObject = null;
    }

    public void method198(int i_1, int i_2, int i_3) {
        Tile tile_4 = tiles[i_1][i_2][i_3];
        if (tile_4 != null)
            for (int i_5 = 0; i_5 < tile_4.numGameObjects; i_5++) {
                GameObject gameobject_6 = tile_4.gameObjects[i_5];
                if ((gameobject_6.int206 >> 29 & 0x3) == 2 && gameobject_6.int203 == i_2 && gameobject_6.int208 == i_3) {
                    method194(gameobject_6);
                    return;
                }
            }
    }

    public void method199(int i_1, int i_2, int i_3) {
        Tile tile_4 = tiles[i_1][i_2][i_3];
        if (tile_4 != null)
            tile_4.groundDecoration = null;
    }

    public void method200(int i_1, int i_2, int i_3) {
        Tile tile_4 = tiles[i_1][i_2][i_3];
        if (tile_4 != null)
            tile_4.groundItemPile = null;
    }

    public DataClass10 method201(int i_1, int i_2, int i_3) {
        Tile tile_4 = tiles[i_1][i_2][i_3];
        return tile_4 == null ? null : tile_4.dataClass10_1;
    }

    public WallObject method202(int i_1, int i_2, int i_3) {
        Tile tile_4 = tiles[i_1][i_2][i_3];
        return tile_4 == null ? null : tile_4.wallObject;
    }

    public GameObject method203(int i_1, int i_2, int i_3) {
        Tile tile_4 = tiles[i_1][i_2][i_3];
        if (tile_4 == null)
            return null;
        else {
            for (int i_5 = 0; i_5 < tile_4.numGameObjects; i_5++) {
                GameObject gameobject_6 = tile_4.gameObjects[i_5];
                if ((gameobject_6.int206 >> 29 & 0x3) == 2 && gameobject_6.int203 == i_2 && gameobject_6.int208 == i_3)
                    return gameobject_6;
            }

            return null;
        }
    }

    public GroundDecoration method204(int i_1, int i_2, int i_3) {
        Tile tile_4 = tiles[i_1][i_2][i_3];
        return tile_4 != null && tile_4.groundDecoration != null ? tile_4.groundDecoration : null;
    }

    public int method205(int i_1, int i_2, int i_3) {
        Tile tile_4 = tiles[i_1][i_2][i_3];
        return tile_4 != null && tile_4.dataClass10_1 != null ? tile_4.dataClass10_1.int193 : 0;
    }

    public int method206(int i_1, int i_2, int i_3) {
        Tile tile_4 = tiles[i_1][i_2][i_3];
        return tile_4 != null && tile_4.wallObject != null ? tile_4.wallObject.int153 : 0;
    }

    public int method207(int i_1, int i_2, int i_3) {
        Tile tile_4 = tiles[i_1][i_2][i_3];
        if (tile_4 == null)
            return 0;
        else {
            for (int i_5 = 0; i_5 < tile_4.numGameObjects; i_5++) {
                GameObject gameobject_6 = tile_4.gameObjects[i_5];
                if ((gameobject_6.int206 >> 29 & 0x3) == 2 && gameobject_6.int203 == i_2 && gameobject_6.int208 == i_3)
                    return gameobject_6.int206;
            }

            return 0;
        }
    }

    public int method208(int i_1, int i_2, int i_3) {
        Tile tile_4 = tiles[i_1][i_2][i_3];
        return tile_4 != null && tile_4.groundDecoration != null ? tile_4.groundDecoration.int142 : 0;
    }

    public int method209(int i_1, int i_2, int i_3, int i_4) {
        Tile tile_5 = tiles[i_1][i_2][i_3];
        if (tile_5 == null)
            return -1;
        else if (tile_5.dataClass10_1 != null && tile_5.dataClass10_1.int193 == i_4)
            return tile_5.dataClass10_1.int194 & 0xff;
        else if (tile_5.wallObject != null && tile_5.wallObject.int153 == i_4)
            return tile_5.wallObject.int159 & 0xff;
        else if (tile_5.groundDecoration != null && tile_5.groundDecoration.int142 == i_4)
            return tile_5.groundDecoration.int141 & 0xff;
        else {
            for (int i_6 = 0; i_6 < tile_5.numGameObjects; i_6++)
                if (tile_5.gameObjects[i_6].int206 == i_4)
                    return tile_5.gameObjects[i_6].int205 & 0xff;

            return -1;
        }
    }

    public void method210(int i_1, int i_2, int i_3) {
        for (int i_4 = 0; i_4 < int180; i_4++)
            for (int i_5 = 0; i_5 < int182; i_5++)
                for (int i_6 = 0; i_6 < int183; i_6++) {
                    Tile tile_7 = tiles[i_4][i_5][i_6];
                    if (tile_7 != null) {
                        DataClass10 dataclass10_8 = tile_7.dataClass10_1;
                        Mesh mesh_10;
                        if (dataclass10_8 != null && dataclass10_8.renderable4 instanceof Mesh) {
                            Mesh mesh_9 = (Mesh) dataclass10_8.renderable4;
                            method212(mesh_9, i_4, i_5, i_6, 1, 1);
                            if (dataclass10_8.renderable3 instanceof Mesh) {
                                mesh_10 = (Mesh) dataclass10_8.renderable3;
                                method212(mesh_10, i_4, i_5, i_6, 1, 1);
                                Mesh.staticMethod467(mesh_9, mesh_10, 0, 0, 0, false);
                                dataclass10_8.renderable3 = mesh_10.method634(mesh_10.short3, mesh_10.short2, i_1, i_2, i_3);
                            }

                            dataclass10_8.renderable4 = mesh_9.method634(mesh_9.short3, mesh_9.short2, i_1, i_2, i_3);
                        }

                        for (int i_12 = 0; i_12 < tile_7.numGameObjects; i_12++) {
                            GameObject gameobject_14 = tile_7.gameObjects[i_12];
                            if (gameobject_14 != null && gameobject_14.renderable5 instanceof Mesh) {
                                Mesh mesh_11 = (Mesh) gameobject_14.renderable5;
                                method212(mesh_11, i_4, i_5, i_6, gameobject_14.int202 - gameobject_14.int203 + 1, gameobject_14.int207 - gameobject_14.int208 + 1);
                                gameobject_14.renderable5 = mesh_11.method634(mesh_11.short3, mesh_11.short2, i_1, i_2, i_3);
                            }
                        }

                        GroundDecoration grounddecoration_13 = tile_7.groundDecoration;
                        if (grounddecoration_13 != null && grounddecoration_13.gameObject instanceof Mesh) {
                            mesh_10 = (Mesh) grounddecoration_13.gameObject;
                            method211(mesh_10, i_4, i_5, i_6);
                            grounddecoration_13.gameObject = mesh_10.method634(mesh_10.short3, mesh_10.short2, i_1, i_2, i_3);
                        }
                    }
                }

    }

    void method211(Mesh mesh_1, int i_2, int i_3, int i_4) {
        Tile tile_5;
        Mesh mesh_6;
        if (i_3 < int182) {
            tile_5 = tiles[i_2][i_3 + 1][i_4];
            if (tile_5 != null && tile_5.groundDecoration != null && tile_5.groundDecoration.gameObject instanceof Mesh) {
                mesh_6 = (Mesh) tile_5.groundDecoration.gameObject;
                Mesh.staticMethod467(mesh_1, mesh_6, 128, 0, 0, true);
            }
        }

        if (i_4 < int182) {
            tile_5 = tiles[i_2][i_3][i_4 + 1];
            if (tile_5 != null && tile_5.groundDecoration != null && tile_5.groundDecoration.gameObject instanceof Mesh) {
                mesh_6 = (Mesh) tile_5.groundDecoration.gameObject;
                Mesh.staticMethod467(mesh_1, mesh_6, 0, 0, 128, true);
            }
        }

        if (i_3 < int182 && i_4 < int183) {
            tile_5 = tiles[i_2][i_3 + 1][i_4 + 1];
            if (tile_5 != null && tile_5.groundDecoration != null && tile_5.groundDecoration.gameObject instanceof Mesh) {
                mesh_6 = (Mesh) tile_5.groundDecoration.gameObject;
                Mesh.staticMethod467(mesh_1, mesh_6, 128, 0, 128, true);
            }
        }

        if (i_3 < int182 && i_4 > 0) {
            tile_5 = tiles[i_2][i_3 + 1][i_4 - 1];
            if (tile_5 != null && tile_5.groundDecoration != null && tile_5.groundDecoration.gameObject instanceof Mesh) {
                mesh_6 = (Mesh) tile_5.groundDecoration.gameObject;
                Mesh.staticMethod467(mesh_1, mesh_6, 128, 0, -128, true);
            }
        }

    }

    void method212(Mesh mesh_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        boolean bool_7 = true;
        int i_8 = i_3;
        int i_9 = i_3 + i_5;
        int i_10 = i_4 - 1;
        int i_11 = i_4 + i_6;

        for (int i_12 = i_2; i_12 <= i_2 + 1; i_12++)
            if (i_12 != int180) {
                for (int i_13 = i_8; i_13 <= i_9; i_13++)
                    if (i_13 >= 0 && i_13 < int182)
                        for (int i_14 = i_10; i_14 <= i_11; i_14++)
                            if (i_14 >= 0 && i_14 < int183 && (!bool_7 || i_13 >= i_9 || i_14 >= i_11 || i_14 < i_4 && i_13 != i_3)) {
                                Tile tile_15 = tiles[i_12][i_13][i_14];
                                if (tile_15 != null) {
                                    int i_16 = (intArrayArrayArray3[i_12][i_13][i_14] + intArrayArrayArray3[i_12][i_13 + 1][i_14] + intArrayArrayArray3[i_12][i_13][i_14 + 1] + intArrayArrayArray3[i_12][i_13 + 1][i_14 + 1]) / 4 - (intArrayArrayArray3[i_2][i_3][i_4] + intArrayArrayArray3[i_2][i_3 + 1][i_4] + intArrayArrayArray3[i_2][i_3][i_4 + 1] + intArrayArrayArray3[i_2][i_3 + 1][i_4 + 1]) / 4;
                                    DataClass10 dataclass10_17 = tile_15.dataClass10_1;
                                    if (dataclass10_17 != null) {
                                        Mesh mesh_18;
                                        if (dataclass10_17.renderable4 instanceof Mesh) {
                                            mesh_18 = (Mesh) dataclass10_17.renderable4;
                                            Mesh.staticMethod467(mesh_1, mesh_18, (i_13 - i_3) * 128 + (1 - i_5) * 64, i_16, (i_14 - i_4) * 128 + (1 - i_6) * 64, bool_7);
                                        }

                                        if (dataclass10_17.renderable3 instanceof Mesh) {
                                            mesh_18 = (Mesh) dataclass10_17.renderable3;
                                            Mesh.staticMethod467(mesh_1, mesh_18, (i_13 - i_3) * 128 + (1 - i_5) * 64, i_16, (i_14 - i_4) * 128 + (1 - i_6) * 64, bool_7);
                                        }
                                    }

                                    for (int i_23 = 0; i_23 < tile_15.numGameObjects; i_23++) {
                                        GameObject gameobject_19 = tile_15.gameObjects[i_23];
                                        if (gameobject_19 != null && gameobject_19.renderable5 instanceof Mesh) {
                                            Mesh mesh_20 = (Mesh) gameobject_19.renderable5;
                                            int i_21 = gameobject_19.int202 - gameobject_19.int203 + 1;
                                            int i_22 = gameobject_19.int207 - gameobject_19.int208 + 1;
                                            Mesh.staticMethod467(mesh_1, mesh_20, (gameobject_19.int203 - i_3) * 128 + (i_21 - i_5) * 64, i_16, (gameobject_19.int208 - i_4) * 128 + (i_22 - i_6) * 64, bool_7);
                                        }
                                    }
                                }
                            }

                --i_8;
                bool_7 = false;
            }

    }

    public void method213(int[] ints_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        Tile tile_7 = tiles[i_4][i_5][i_6];
        if (tile_7 != null) {
            DataClass9 dataclass9_8 = tile_7.dataClass9_1;
            int i_10;
            if (dataclass9_8 != null) {
                int i_18 = dataclass9_8.color;
                if (i_18 != 0)
                    for (i_10 = 0; i_10 < 4; i_10++) {
                        ints_1[i_2] = i_18;
                        ints_1[i_2 + 1] = i_18;
                        ints_1[i_2 + 2] = i_18;
                        ints_1[i_2 + 3] = i_18;
                        i_2 += i_3;
                    }
            } else {
                DataClass4 dataclass4_9 = tile_7.tilePaint;
                if (dataclass4_9 != null) {
                    i_10 = dataclass4_9.int114;
                    int i_11 = dataclass4_9.int115;
                    int i_12 = dataclass4_9.int116;
                    int i_13 = dataclass4_9.int117;
                    int[] ints_14 = intArrayArray9[i_10];
                    int[] ints_15 = intArrayArray8[i_11];
                    int i_16 = 0;
                    int i_17;
                    if (i_12 != 0)
                        for (i_17 = 0; i_17 < 4; i_17++) {
                            ints_1[i_2] = ints_14[ints_15[i_16++]] == 0 ? i_12 : i_13;
                            ints_1[i_2 + 1] = ints_14[ints_15[i_16++]] == 0 ? i_12 : i_13;
                            ints_1[i_2 + 2] = ints_14[ints_15[i_16++]] == 0 ? i_12 : i_13;
                            ints_1[i_2 + 3] = ints_14[ints_15[i_16++]] == 0 ? i_12 : i_13;
                            i_2 += i_3;
                        }
                    else
                        for (i_17 = 0; i_17 < 4; i_17++) {
                            if (ints_14[ints_15[i_16++]] != 0)
                                ints_1[i_2] = i_13;

                            if (ints_14[ints_15[i_16++]] != 0)
                                ints_1[i_2 + 1] = i_13;

                            if (ints_14[ints_15[i_16++]] != 0)
                                ints_1[i_2 + 2] = i_13;

                            if (ints_14[ints_15[i_16++]] != 0)
                                ints_1[i_2 + 3] = i_13;

                            i_2 += i_3;
                        }

                }
            }
        }
    }

    public static void staticMethod116(int[] ints_0, int i_1, int i_2, int i_3, int i_4) {
        staticInt105 = 0;
        staticInt106 = 0;
        staticInt107 = i_3;
        staticInt101 = i_4;
        staticInt102 = i_3 / 2;
        staticInt83 = i_4 / 2;
        boolean[][][][] bools_5 = new boolean[9][32][53][53];

        int i_6;
        int i_7;
        int i_8;
        int i_9;
        int i_11;
        int i_12;
        for (i_6 = 128; i_6 <= 384; i_6 += 32)
            for (i_7 = 0; i_7 < 2048; i_7 += 64) {
                staticInt92 = Rasterizer3D.staticIntArray156[i_6];
                staticInt93 = Rasterizer3D.staticIntArray159[i_6];
                staticInt108 = Rasterizer3D.staticIntArray156[i_7];
                staticInt94 = Rasterizer3D.staticIntArray159[i_7];
                i_8 = (i_6 - 128) / 32;
                i_9 = i_7 / 64;

                for (int i_10 = -26; i_10 <= 26; i_10++)
                    for (i_11 = -26; i_11 <= 26; i_11++) {
                        i_12 = i_10 * 128;
                        int i_13 = i_11 * 128;
                        boolean bool_14 = false;

                        for (int i_15 = -i_1; i_15 <= i_2; i_15 += 128)
                            if (staticMethod117(i_12, ints_0[i_8] + i_15, i_13)) {
                                bool_14 = true;
                                break;
                            }

                        bools_5[i_8][i_9][i_10 + 25 + 1][i_11 + 25 + 1] = bool_14;
                    }
            }

        for (i_6 = 0; i_6 < 8; i_6++)
            for (i_7 = 0; i_7 < 32; i_7++)
                for (i_8 = -25; i_8 < 25; i_8++)
                    for (i_9 = -25; i_9 < 25; i_9++) {
                        boolean bool_16 = false;

                        label76: for (i_11 = -1; i_11 <= 1; i_11++)
                            for (i_12 = -1; i_12 <= 1; i_12++) {
                                if (bools_5[i_6][i_7][i_8 + i_11 + 25 + 1][i_9 + i_12 + 25 + 1]) {
                                    bool_16 = true;
                                    break label76;
                                }

                                if (bools_5[i_6][(i_7 + 1) % 31][i_8 + i_11 + 25 + 1][i_9 + i_12 + 25 + 1]) {
                                    bool_16 = true;
                                    break label76;
                                }

                                if (bools_5[i_6 + 1][i_7][i_8 + i_11 + 25 + 1][i_9 + i_12 + 25 + 1]) {
                                    bool_16 = true;
                                    break label76;
                                }

                                if (bools_5[i_6 + 1][(i_7 + 1) % 31][i_8 + i_11 + 25 + 1][i_9 + i_12 + 25 + 1]) {
                                    bool_16 = true;
                                    break label76;
                                }
                            }

                        staticBoolArrayArrayArrayArray1[i_6][i_7][i_8 + 25][i_9 + 25] = bool_16;
                    }

    }

    static boolean staticMethod117(int i_0, int i_1, int i_2) {
        int i_3 = i_2 * staticInt108 + i_0 * staticInt94 >> 16;
        int i_4 = i_2 * staticInt94 - i_0 * staticInt108 >> 16;
        int i_5 = i_1 * staticInt92 + i_4 * staticInt93 >> 16;
        int i_6 = i_1 * staticInt93 - i_4 * staticInt92 >> 16;
        if (i_5 >= 50 && i_5 <= 3500) {
            int i_7 = staticInt102 + i_3 * 390 / i_5;
            int i_8 = staticInt83 + i_6 * 390 / i_5;
            return i_7 >= staticInt105 && i_7 <= staticInt107 && i_8 >= staticInt106 && i_8 <= staticInt101;
        } else
            return false;
    }

    public void method214(int i_1, int i_2, int i_3, boolean bool_4) {
        if (!staticMethod118() || bool_4) {
            staticBool14 = true;
            staticBool13 = bool_4;
            staticInt96 = i_1;
            staticInt97 = i_2;
            staticInt98 = i_3;
            staticInt103 = -1;
            staticInt99 = -1;
        }
    }

    public void method215() {
        staticBool13 = true;
    }

    public static boolean staticMethod118() {
        return staticBool13 && staticInt103 != -1;
    }

    public static void staticMethod119() {
        staticInt103 = -1;
        staticBool13 = false;
    }

    public void method216(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        if (i_1 < 0)
            i_1 = 0;
        else if (i_1 >= int182 * 128)
            i_1 = int182 * 128 - 1;

        if (i_3 < 0)
            i_3 = 0;
        else if (i_3 >= int183 * 128)
            i_3 = int183 * 128 - 1;

        ++staticInt104;
        staticInt92 = Rasterizer3D.staticIntArray156[i_4];
        staticInt93 = Rasterizer3D.staticIntArray159[i_4];
        staticInt108 = Rasterizer3D.staticIntArray156[i_5];
        staticInt94 = Rasterizer3D.staticIntArray159[i_5];
        staticBoolArrayArray1 = staticBoolArrayArrayArrayArray1[(i_4 - 128) / 32][i_5 / 64];
        staticInt95 = i_1;
        staticInt90 = i_2;
        staticInt91 = i_3;
        staticInt88 = i_1 / 128;
        staticInt87 = i_3 / 128;
        staticInt84 = i_6;
        staticInt85 = staticInt88 - 25;
        if (staticInt85 < 0)
            staticInt85 = 0;

        staticInt80 = staticInt87 - 25;
        if (staticInt80 < 0)
            staticInt80 = 0;

        staticInt86 = staticInt88 + 25;
        if (staticInt86 > int182)
            staticInt86 = int182;

        staticInt82 = staticInt87 + 25;
        if (staticInt82 > int183)
            staticInt82 = int183;

        method221();
        staticInt89 = 0;

        int i_7;
        Tile[][] arr_8;
        int i_9;
        int i_10;
        for (i_7 = int181; i_7 < int180; i_7++) {
            arr_8 = tiles[i_7];

            for (i_9 = staticInt85; i_9 < staticInt86; i_9++)
                for (i_10 = staticInt80; i_10 < staticInt82; i_10++) {
                    Tile tile_11 = arr_8[i_9][i_10];
                    if (tile_11 != null)
                        if (tile_11.int362 > i_6 || !staticBoolArrayArray1[i_9 - staticInt88 + 25][i_10 - staticInt87 + 25] && intArrayArrayArray3[i_7][i_9][i_10] - i_2 < 2000) {
                            tile_11.bool29 = false;
                            tile_11.bool30 = false;
                            tile_11.int361 = 0;
                        } else {
                            tile_11.bool29 = true;
                            tile_11.bool30 = true;
                            if (tile_11.numGameObjects > 0)
                                tile_11.bool31 = true;
                            else
                                tile_11.bool31 = false;

                            ++staticInt89;
                        }
                }
        }

        int i_12;
        int i_13;
        int i_14;
        Tile tile_15;
        int i_16;
        for (i_7 = int181; i_7 < int180; i_7++) {
            arr_8 = tiles[i_7];

            for (i_9 = -25; i_9 <= 0; i_9++) {
                i_10 = staticInt88 + i_9;
                i_16 = staticInt88 - i_9;
                if (i_10 >= staticInt85 || i_16 < staticInt86)
                    for (i_12 = -25; i_12 <= 0; i_12++) {
                        i_13 = staticInt87 + i_12;
                        i_14 = staticInt87 - i_12;
                        if (i_10 >= staticInt85) {
                            if (i_13 >= staticInt80) {
                                tile_15 = arr_8[i_10][i_13];
                                if (tile_15 != null && tile_15.bool29)
                                    method217(tile_15, true);
                            }

                            if (i_14 < staticInt82) {
                                tile_15 = arr_8[i_10][i_14];
                                if (tile_15 != null && tile_15.bool29)
                                    method217(tile_15, true);
                            }
                        }

                        if (i_16 < staticInt86) {
                            if (i_13 >= staticInt80) {
                                tile_15 = arr_8[i_16][i_13];
                                if (tile_15 != null && tile_15.bool29)
                                    method217(tile_15, true);
                            }

                            if (i_14 < staticInt82) {
                                tile_15 = arr_8[i_16][i_14];
                                if (tile_15 != null && tile_15.bool29)
                                    method217(tile_15, true);
                            }
                        }

                        if (staticInt89 == 0) {
                            staticBool14 = false;
                            return;
                        }
                    }
            }
        }

        for (i_7 = int181; i_7 < int180; i_7++) {
            arr_8 = tiles[i_7];

            for (i_9 = -25; i_9 <= 0; i_9++) {
                i_10 = staticInt88 + i_9;
                i_16 = staticInt88 - i_9;
                if (i_10 >= staticInt85 || i_16 < staticInt86)
                    for (i_12 = -25; i_12 <= 0; i_12++) {
                        i_13 = staticInt87 + i_12;
                        i_14 = staticInt87 - i_12;
                        if (i_10 >= staticInt85) {
                            if (i_13 >= staticInt80) {
                                tile_15 = arr_8[i_10][i_13];
                                if (tile_15 != null && tile_15.bool29)
                                    method217(tile_15, false);
                            }

                            if (i_14 < staticInt82) {
                                tile_15 = arr_8[i_10][i_14];
                                if (tile_15 != null && tile_15.bool29)
                                    method217(tile_15, false);
                            }
                        }

                        if (i_16 < staticInt86) {
                            if (i_13 >= staticInt80) {
                                tile_15 = arr_8[i_16][i_13];
                                if (tile_15 != null && tile_15.bool29)
                                    method217(tile_15, false);
                            }

                            if (i_14 < staticInt82) {
                                tile_15 = arr_8[i_16][i_14];
                                if (tile_15 != null && tile_15.bool29)
                                    method217(tile_15, false);
                            }
                        }

                        if (staticInt89 == 0) {
                            staticBool14 = false;
                            return;
                        }
                    }
            }
        }

        staticBool14 = false;
    }

    void method217(Tile tile_1, boolean bool_2) {
        staticDeque1.method253(tile_1);

        while (true) {
            Tile tile_3;
            int i_4;
            int i_5;
            int i_6;
            int i_7;
            Tile[][] arr_8;
            Tile tile_9;
            int i_11;
            int i_14;
            int i_15;
            int i_16;
            int i_24;
            int i_26;
            do {
                do {
                    do {
                        do {
                            do
                                do
                                    while (true) {
                                        DataClass10 dataclass10_10;
                                        GameObject gameobject_12;
                                        int i_17;
                                        int i_18;
                                        int i_21;
                                        boolean bool_22;
                                        Tile tile_33;
                                        while (true) {
                                            do {
                                                tile_3 = (Tile) staticDeque1.method255();
                                                if (tile_3 == null)
                                                    return;
                                            } while (!tile_3.bool30);

                                            i_4 = tile_3.x;
                                            i_5 = tile_3.y;
                                            i_6 = tile_3.int365;
                                            i_7 = tile_3.int360;
                                            arr_8 = tiles[i_6];
                                            if (!tile_3.bool29)
                                                break;

                                            if (bool_2) {
                                                if (i_6 > 0) {
                                                    tile_9 = tiles[i_6 - 1][i_4][i_5];
                                                    if (tile_9 != null && tile_9.bool30)
                                                        continue;
                                                }

                                                if (i_4 <= staticInt88 && i_4 > staticInt85) {
                                                    tile_9 = arr_8[i_4 - 1][i_5];
                                                    if (tile_9 != null && tile_9.bool30 && (tile_9.bool29 || (tile_3.flags & 0x1) == 0))
                                                        continue;
                                                }

                                                if (i_4 >= staticInt88 && i_4 < staticInt86 - 1) {
                                                    tile_9 = arr_8[i_4 + 1][i_5];
                                                    if (tile_9 != null && tile_9.bool30 && (tile_9.bool29 || (tile_3.flags & 0x4) == 0))
                                                        continue;
                                                }

                                                if (i_5 <= staticInt87 && i_5 > staticInt80) {
                                                    tile_9 = arr_8[i_4][i_5 - 1];
                                                    if (tile_9 != null && tile_9.bool30 && (tile_9.bool29 || (tile_3.flags & 0x8) == 0))
                                                        continue;
                                                }

                                                if (i_5 >= staticInt87 && i_5 < staticInt82 - 1) {
                                                    tile_9 = arr_8[i_4][i_5 + 1];
                                                    if (tile_9 != null && tile_9.bool30 && (tile_9.bool29 || (tile_3.flags & 0x2) == 0))
                                                        continue;
                                                }
                                            } else
                                                bool_2 = true;

                                            tile_3.bool29 = false;
                                            if (tile_3.groundTile != null) {
                                                tile_9 = tile_3.groundTile;
                                                if (tile_9.dataClass9_1 != null) {
                                                    if (!method222(0, i_4, i_5))
                                                        method218(tile_9.dataClass9_1, 0, staticInt92, staticInt93, staticInt108, staticInt94, i_4, i_5);
                                                } else if (tile_9.tilePaint != null && !method222(0, i_4, i_5))
                                                    method219(tile_9.tilePaint, staticInt92, staticInt93, staticInt108, staticInt94, i_4, i_5);

                                                dataclass10_10 = tile_9.dataClass10_1;
                                                if (dataclass10_10 != null)
                                                    dataclass10_10.renderable4.renderAt(0, staticInt92, staticInt93, staticInt108, staticInt94, dataclass10_10.int189 - staticInt95, dataclass10_10.int195 - staticInt90, dataclass10_10.int190 - staticInt91, dataclass10_10.int193);

                                                for (i_11 = 0; i_11 < tile_9.numGameObjects; i_11++) {
                                                    gameobject_12 = tile_9.gameObjects[i_11];
                                                    if (gameobject_12 != null)
                                                        gameobject_12.renderable5.renderAt(gameobject_12.int199, staticInt92, staticInt93, staticInt108, staticInt94, gameobject_12.int201 - staticInt95, gameobject_12.int197 - staticInt90, gameobject_12.int198 - staticInt91, gameobject_12.int206);
                                                }
                                            }

                                            bool_22 = false;
                                            if (tile_3.dataClass9_1 != null) {
                                                if (!method222(i_7, i_4, i_5)) {
                                                    bool_22 = true;
                                                    if (tile_3.dataClass9_1.d != 12345678 || staticBool14 && i_6 <= staticInt96)
                                                        method218(tile_3.dataClass9_1, i_7, staticInt92, staticInt93, staticInt108, staticInt94, i_4, i_5);
                                                }
                                            } else if (tile_3.tilePaint != null && !method222(i_7, i_4, i_5)) {
                                                bool_22 = true;
                                                method219(tile_3.tilePaint, staticInt92, staticInt93, staticInt108, staticInt94, i_4, i_5);
                                            }

                                            i_21 = 0;
                                            i_11 = 0;
                                            DataClass10 dataclass10_23 = tile_3.dataClass10_1;
                                            WallObject wallobject_13 = tile_3.wallObject;
                                            if (dataclass10_23 != null || wallobject_13 != null) {
                                                if (staticInt88 == i_4)
                                                    ++i_21;
                                                else if (staticInt88 < i_4)
                                                    i_21 += 2;

                                                if (staticInt87 == i_5)
                                                    i_21 += 3;
                                                else if (staticInt87 > i_5)
                                                    i_21 += 6;

                                                i_11 = staticIntArray48[i_21];
                                                tile_3.int359 = staticIntArray51[i_21];
                                            }

                                            if (dataclass10_23 != null) {
                                                if ((dataclass10_23.int191 & staticIntArray50[i_21]) != 0) {
                                                    if (dataclass10_23.int191 == 16) {
                                                        tile_3.int361 = 3;
                                                        tile_3.int364 = staticIntArray52[i_21];
                                                        tile_3.int363 = 3 - tile_3.int364;
                                                    } else if (dataclass10_23.int191 == 32) {
                                                        tile_3.int361 = 6;
                                                        tile_3.int364 = staticIntArray53[i_21];
                                                        tile_3.int363 = 6 - tile_3.int364;
                                                    } else if (dataclass10_23.int191 == 64) {
                                                        tile_3.int361 = 12;
                                                        tile_3.int364 = staticIntArray54[i_21];
                                                        tile_3.int363 = 12 - tile_3.int364;
                                                    } else {
                                                        tile_3.int361 = 9;
                                                        tile_3.int364 = staticIntArray55[i_21];
                                                        tile_3.int363 = 9 - tile_3.int364;
                                                    }
                                                } else
                                                    tile_3.int361 = 0;

                                                if ((dataclass10_23.int191 & i_11) != 0 && !method223(i_7, i_4, i_5, dataclass10_23.int191))
                                                    dataclass10_23.renderable4.renderAt(0, staticInt92, staticInt93, staticInt108, staticInt94, dataclass10_23.int189 - staticInt95, dataclass10_23.int195 - staticInt90, dataclass10_23.int190 - staticInt91, dataclass10_23.int193);

                                                if ((dataclass10_23.int192 & i_11) != 0 && !method223(i_7, i_4, i_5, dataclass10_23.int192))
                                                    dataclass10_23.renderable3.renderAt(0, staticInt92, staticInt93, staticInt108, staticInt94, dataclass10_23.int189 - staticInt95, dataclass10_23.int195 - staticInt90, dataclass10_23.int190 - staticInt91, dataclass10_23.int193);
                                            }

                                            if (wallobject_13 != null && !method224(i_7, i_4, i_5, wallobject_13.renderable1.modelHeight))
                                                if ((wallobject_13.int157 & i_11) != 0)
                                                    wallobject_13.renderable1.renderAt(0, staticInt92, staticInt93, staticInt108, staticInt94, wallobject_13.x - staticInt95 + wallobject_13.int156, wallobject_13.int158 - staticInt90, wallobject_13.y - staticInt91 + wallobject_13.int154, wallobject_13.int153);
                                                else if (wallobject_13.int157 == 256) {
                                                    i_14 = wallobject_13.x - staticInt95;
                                                    i_15 = wallobject_13.int158 - staticInt90;
                                                    i_16 = wallobject_13.y - staticInt91;
                                                    i_17 = wallobject_13.int155;
                                                    if (i_17 != 1 && i_17 != 2)
                                                        i_18 = i_14;
                                                    else
                                                        i_18 = -i_14;

                                                    int i_19;
                                                    if (i_17 != 2 && i_17 != 3)
                                                        i_19 = i_16;
                                                    else
                                                        i_19 = -i_16;

                                                    if (i_19 < i_18)
                                                        wallobject_13.renderable1.renderAt(0, staticInt92, staticInt93, staticInt108, staticInt94, i_14 + wallobject_13.int156, i_15, i_16 + wallobject_13.int154, wallobject_13.int153);
                                                    else if (wallobject_13.renderable2 != null)
                                                        wallobject_13.renderable2.renderAt(0, staticInt92, staticInt93, staticInt108, staticInt94, i_14, i_15, i_16, wallobject_13.int153);
                                                }

                                            if (bool_22) {
                                                GroundDecoration grounddecoration_27 = tile_3.groundDecoration;
                                                if (grounddecoration_27 != null)
                                                    grounddecoration_27.gameObject.renderAt(0, staticInt92, staticInt93, staticInt108, staticInt94, grounddecoration_27.x - staticInt95, grounddecoration_27.int143 - staticInt90, grounddecoration_27.y - staticInt91, grounddecoration_27.int142);

                                                GroundItemPile grounditempile_31 = tile_3.groundItemPile;
                                                if (grounditempile_31 != null && grounditempile_31.int128 == 0) {
                                                    if (grounditempile_31.bottomItem != null)
                                                        grounditempile_31.bottomItem.renderAt(0, staticInt92, staticInt93, staticInt108, staticInt94, grounditempile_31.x - staticInt95, grounditempile_31.int127 - staticInt90, grounditempile_31.y - staticInt91, grounditempile_31.int129);

                                                    if (grounditempile_31.middleItem != null)
                                                        grounditempile_31.middleItem.renderAt(0, staticInt92, staticInt93, staticInt108, staticInt94, grounditempile_31.x - staticInt95, grounditempile_31.int127 - staticInt90, grounditempile_31.y - staticInt91, grounditempile_31.int129);

                                                    if (grounditempile_31.topItem != null)
                                                        grounditempile_31.topItem.renderAt(0, staticInt92, staticInt93, staticInt108, staticInt94, grounditempile_31.x - staticInt95, grounditempile_31.int127 - staticInt90, grounditempile_31.y - staticInt91, grounditempile_31.int129);
                                                }
                                            }

                                            i_14 = tile_3.flags;
                                            if (i_14 != 0) {
                                                if (i_4 < staticInt88 && (i_14 & 0x4) != 0) {
                                                    tile_33 = arr_8[i_4 + 1][i_5];
                                                    if (tile_33 != null && tile_33.bool30)
                                                        staticDeque1.method253(tile_33);
                                                }

                                                if (i_5 < staticInt87 && (i_14 & 0x2) != 0) {
                                                    tile_33 = arr_8[i_4][i_5 + 1];
                                                    if (tile_33 != null && tile_33.bool30)
                                                        staticDeque1.method253(tile_33);
                                                }

                                                if (i_4 > staticInt88 && (i_14 & 0x1) != 0) {
                                                    tile_33 = arr_8[i_4 - 1][i_5];
                                                    if (tile_33 != null && tile_33.bool30)
                                                        staticDeque1.method253(tile_33);
                                                }

                                                if (i_5 > staticInt87 && (i_14 & 0x8) != 0) {
                                                    tile_33 = arr_8[i_4][i_5 - 1];
                                                    if (tile_33 != null && tile_33.bool30)
                                                        staticDeque1.method253(tile_33);
                                                }
                                            }
                                            break;
                                        }

                                        if (tile_3.int361 != 0) {
                                            bool_22 = true;

                                            for (i_21 = 0; i_21 < tile_3.numGameObjects; i_21++)
                                                if (tile_3.gameObjects[i_21].int196 != staticInt104 && (tile_3.gameObjectFlags[i_21] & tile_3.int361) == tile_3.int364) {
                                                    bool_22 = false;
                                                    break;
                                                }

                                            if (bool_22) {
                                                dataclass10_10 = tile_3.dataClass10_1;
                                                if (!method223(i_7, i_4, i_5, dataclass10_10.int191))
                                                    dataclass10_10.renderable4.renderAt(0, staticInt92, staticInt93, staticInt108, staticInt94, dataclass10_10.int189 - staticInt95, dataclass10_10.int195 - staticInt90, dataclass10_10.int190 - staticInt91, dataclass10_10.int193);

                                                tile_3.int361 = 0;
                                            }
                                        }

                                        if (!tile_3.bool31)
                                            break;

                                        try {
                                            int i_25 = tile_3.numGameObjects;
                                            tile_3.bool31 = false;
                                            i_21 = 0;

                                            label563: for (i_11 = 0; i_11 < i_25; i_11++) {
                                                gameobject_12 = tile_3.gameObjects[i_11];
                                                if (gameobject_12.int196 != staticInt104) {
                                                    for (i_26 = gameobject_12.int203; i_26 <= gameobject_12.int202; i_26++)
                                                        for (i_14 = gameobject_12.int208; i_14 <= gameobject_12.int207; i_14++) {
                                                            tile_33 = arr_8[i_26][i_14];
                                                            if (tile_33.bool29) {
                                                                tile_3.bool31 = true;
                                                                continue label563;
                                                            }

                                                            if (tile_33.int361 != 0) {
                                                                i_16 = 0;
                                                                if (i_26 > gameobject_12.int203)
                                                                    ++i_16;

                                                                if (i_26 < gameobject_12.int202)
                                                                    i_16 += 4;

                                                                if (i_14 > gameobject_12.int208)
                                                                    i_16 += 8;

                                                                if (i_14 < gameobject_12.int207)
                                                                    i_16 += 2;

                                                                if ((i_16 & tile_33.int361) == tile_3.int363) {
                                                                    tile_3.bool31 = true;
                                                                    continue label563;
                                                                }
                                                            }
                                                        }

                                                    staticGameObjectArray1[i_21++] = gameobject_12;
                                                    i_26 = staticInt88 - gameobject_12.int203;
                                                    i_14 = gameobject_12.int202 - staticInt88;
                                                    if (i_14 > i_26)
                                                        i_26 = i_14;

                                                    i_15 = staticInt87 - gameobject_12.int208;
                                                    i_16 = gameobject_12.int207 - staticInt87;
                                                    if (i_16 > i_15)
                                                        gameobject_12.int204 = i_26 + i_16;
                                                    else
                                                        gameobject_12.int204 = i_26 + i_15;
                                                }
                                            }

                                            while (i_21 > 0) {
                                                i_11 = -50;
                                                i_24 = -1;

                                                for (i_26 = 0; i_26 < i_21; i_26++) {
                                                    GameObject gameobject_34 = staticGameObjectArray1[i_26];
                                                    if (gameobject_34.int196 != staticInt104)
                                                        if (gameobject_34.int204 > i_11) {
                                                            i_11 = gameobject_34.int204;
                                                            i_24 = i_26;
                                                        } else if (gameobject_34.int204 == i_11) {
                                                            i_15 = gameobject_34.int201 - staticInt95;
                                                            i_16 = gameobject_34.int198 - staticInt91;
                                                            i_17 = staticGameObjectArray1[i_24].int201 - staticInt95;
                                                            i_18 = staticGameObjectArray1[i_24].int198 - staticInt91;
                                                            if (i_15 * i_15 + i_16 * i_16 > i_17 * i_17 + i_18 * i_18)
                                                                i_24 = i_26;
                                                        }
                                                }

                                                if (i_24 == -1)
                                                    break;

                                                GameObject gameobject_35 = staticGameObjectArray1[i_24];
                                                gameobject_35.int196 = staticInt104;
                                                if (!method225(i_7, gameobject_35.int203, gameobject_35.int202, gameobject_35.int208, gameobject_35.int207, gameobject_35.renderable5.modelHeight))
                                                    gameobject_35.renderable5.renderAt(gameobject_35.int199, staticInt92, staticInt93, staticInt108, staticInt94, gameobject_35.int201 - staticInt95, gameobject_35.int197 - staticInt90, gameobject_35.int198 - staticInt91, gameobject_35.int206);

                                                for (i_14 = gameobject_35.int203; i_14 <= gameobject_35.int202; i_14++)
                                                    for (i_15 = gameobject_35.int208; i_15 <= gameobject_35.int207; i_15++) {
                                                        Tile tile_36 = arr_8[i_14][i_15];
                                                        if (tile_36.int361 != 0)
                                                            staticDeque1.method253(tile_36);
                                                        else if ((i_14 != i_4 || i_15 != i_5) && tile_36.bool30)
                                                            staticDeque1.method253(tile_36);
                                                    }
                                            }

                                            if (!tile_3.bool31)
                                                break;
                                        } catch (Exception exception_20) {
                                            tile_3.bool31 = false;
                                            break;
                                        }
                                    }
                                while (!tile_3.bool30);
                            while (tile_3.int361 != 0);

                            if (i_4 > staticInt88 || i_4 <= staticInt85)
                                break;

                            tile_9 = arr_8[i_4 - 1][i_5];
                        } while (tile_9 != null && tile_9.bool30);

                        if (i_4 < staticInt88 || i_4 >= staticInt86 - 1)
                            break;

                        tile_9 = arr_8[i_4 + 1][i_5];
                    } while (tile_9 != null && tile_9.bool30);

                    if (i_5 > staticInt87 || i_5 <= staticInt80)
                        break;

                    tile_9 = arr_8[i_4][i_5 - 1];
                } while (tile_9 != null && tile_9.bool30);

                if (i_5 < staticInt87 || i_5 >= staticInt82 - 1)
                    break;

                tile_9 = arr_8[i_4][i_5 + 1];
            } while (tile_9 != null && tile_9.bool30);

            tile_3.bool30 = false;
            --staticInt89;
            GroundItemPile grounditempile_29 = tile_3.groundItemPile;
            if (grounditempile_29 != null && grounditempile_29.int128 != 0) {
                if (grounditempile_29.bottomItem != null)
                    grounditempile_29.bottomItem.renderAt(0, staticInt92, staticInt93, staticInt108, staticInt94, grounditempile_29.x - staticInt95, grounditempile_29.int127 - staticInt90 - grounditempile_29.int128, grounditempile_29.y - staticInt91, grounditempile_29.int129);

                if (grounditempile_29.middleItem != null)
                    grounditempile_29.middleItem.renderAt(0, staticInt92, staticInt93, staticInt108, staticInt94, grounditempile_29.x - staticInt95, grounditempile_29.int127 - staticInt90 - grounditempile_29.int128, grounditempile_29.y - staticInt91, grounditempile_29.int129);

                if (grounditempile_29.topItem != null)
                    grounditempile_29.topItem.renderAt(0, staticInt92, staticInt93, staticInt108, staticInt94, grounditempile_29.x - staticInt95, grounditempile_29.int127 - staticInt90 - grounditempile_29.int128, grounditempile_29.y - staticInt91, grounditempile_29.int129);
            }

            if (tile_3.int359 != 0) {
                WallObject wallobject_30 = tile_3.wallObject;
                if (wallobject_30 != null && !method224(i_7, i_4, i_5, wallobject_30.renderable1.modelHeight))
                    if ((wallobject_30.int157 & tile_3.int359) != 0)
                        wallobject_30.renderable1.renderAt(0, staticInt92, staticInt93, staticInt108, staticInt94, wallobject_30.x - staticInt95 + wallobject_30.int156, wallobject_30.int158 - staticInt90, wallobject_30.y - staticInt91 + wallobject_30.int154, wallobject_30.int153);
                    else if (wallobject_30.int157 == 256) {
                        i_11 = wallobject_30.x - staticInt95;
                        i_24 = wallobject_30.int158 - staticInt90;
                        i_26 = wallobject_30.y - staticInt91;
                        i_14 = wallobject_30.int155;
                        if (i_14 != 1 && i_14 != 2)
                            i_15 = i_11;
                        else
                            i_15 = -i_11;

                        if (i_14 != 2 && i_14 != 3)
                            i_16 = i_26;
                        else
                            i_16 = -i_26;

                        if (i_16 >= i_15)
                            wallobject_30.renderable1.renderAt(0, staticInt92, staticInt93, staticInt108, staticInt94, i_11 + wallobject_30.int156, i_24, i_26 + wallobject_30.int154, wallobject_30.int153);
                        else if (wallobject_30.renderable2 != null)
                            wallobject_30.renderable2.renderAt(0, staticInt92, staticInt93, staticInt108, staticInt94, i_11, i_24, i_26, wallobject_30.int153);
                    }

                DataClass10 dataclass10_28 = tile_3.dataClass10_1;
                if (dataclass10_28 != null) {
                    if ((dataclass10_28.int192 & tile_3.int359) != 0 && !method223(i_7, i_4, i_5, dataclass10_28.int192))
                        dataclass10_28.renderable3.renderAt(0, staticInt92, staticInt93, staticInt108, staticInt94, dataclass10_28.int189 - staticInt95, dataclass10_28.int195 - staticInt90, dataclass10_28.int190 - staticInt91, dataclass10_28.int193);

                    if ((dataclass10_28.int191 & tile_3.int359) != 0 && !method223(i_7, i_4, i_5, dataclass10_28.int191))
                        dataclass10_28.renderable4.renderAt(0, staticInt92, staticInt93, staticInt108, staticInt94, dataclass10_28.int189 - staticInt95, dataclass10_28.int195 - staticInt90, dataclass10_28.int190 - staticInt91, dataclass10_28.int193);
                }
            }

            Tile tile_32;
            if (i_6 < int180 - 1) {
                tile_32 = tiles[i_6 + 1][i_4][i_5];
                if (tile_32 != null && tile_32.bool30)
                    staticDeque1.method253(tile_32);
            }

            if (i_4 < staticInt88) {
                tile_32 = arr_8[i_4 + 1][i_5];
                if (tile_32 != null && tile_32.bool30)
                    staticDeque1.method253(tile_32);
            }

            if (i_5 < staticInt87) {
                tile_32 = arr_8[i_4][i_5 + 1];
                if (tile_32 != null && tile_32.bool30)
                    staticDeque1.method253(tile_32);
            }

            if (i_4 > staticInt88) {
                tile_32 = arr_8[i_4 - 1][i_5];
                if (tile_32 != null && tile_32.bool30)
                    staticDeque1.method253(tile_32);
            }

            if (i_5 > staticInt87) {
                tile_32 = arr_8[i_4][i_5 - 1];
                if (tile_32 != null && tile_32.bool30)
                    staticDeque1.method253(tile_32);
            }
        }
    }

    void method218(DataClass9 dataclass9_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
        int i_9;
        int i_10 = i_9 = (i_7 << 7) - staticInt95;
        int i_11;
        int i_12 = i_11 = (i_8 << 7) - staticInt91;
        int i_13;
        int i_14 = i_13 = i_10 + 128;
        int i_15;
        int i_16 = i_15 = i_12 + 128;
        int i_17 = intArrayArrayArray3[i_2][i_7][i_8] - staticInt90;
        int i_18 = intArrayArrayArray3[i_2][i_7 + 1][i_8] - staticInt90;
        int i_19 = intArrayArrayArray3[i_2][i_7 + 1][i_8 + 1] - staticInt90;
        int i_20 = intArrayArrayArray3[i_2][i_7][i_8 + 1] - staticInt90;
        int i_21 = i_12 * i_5 + i_10 * i_6 >> 16;
        i_12 = i_12 * i_6 - i_10 * i_5 >> 16;
        i_10 = i_21;
        i_21 = i_17 * i_4 - i_12 * i_3 >> 16;
        i_12 = i_17 * i_3 + i_12 * i_4 >> 16;
        i_17 = i_21;
        if (i_12 >= 50) {
            i_21 = i_11 * i_5 + i_14 * i_6 >> 16;
            i_11 = i_11 * i_6 - i_14 * i_5 >> 16;
            i_14 = i_21;
            i_21 = i_18 * i_4 - i_11 * i_3 >> 16;
            i_11 = i_18 * i_3 + i_11 * i_4 >> 16;
            i_18 = i_21;
            if (i_11 >= 50) {
                i_21 = i_16 * i_5 + i_13 * i_6 >> 16;
                i_16 = i_16 * i_6 - i_13 * i_5 >> 16;
                i_13 = i_21;
                i_21 = i_19 * i_4 - i_16 * i_3 >> 16;
                i_16 = i_19 * i_3 + i_16 * i_4 >> 16;
                i_19 = i_21;
                if (i_16 >= 50) {
                    i_21 = i_15 * i_5 + i_9 * i_6 >> 16;
                    i_15 = i_15 * i_6 - i_9 * i_5 >> 16;
                    i_9 = i_21;
                    i_21 = i_20 * i_4 - i_15 * i_3 >> 16;
                    i_15 = i_20 * i_3 + i_15 * i_4 >> 16;
                    if (i_15 >= 50) {
                        int i_22 = Rasterizer3D.staticInt325 + i_10 * Rasterizer3D.staticInt326 / i_12;
                        int i_23 = Rasterizer3D.staticInt332 + i_17 * Rasterizer3D.staticInt326 / i_12;
                        int i_24 = Rasterizer3D.staticInt325 + i_14 * Rasterizer3D.staticInt326 / i_11;
                        int i_25 = Rasterizer3D.staticInt332 + i_18 * Rasterizer3D.staticInt326 / i_11;
                        int i_26 = Rasterizer3D.staticInt325 + i_13 * Rasterizer3D.staticInt326 / i_16;
                        int i_27 = Rasterizer3D.staticInt332 + i_19 * Rasterizer3D.staticInt326 / i_16;
                        int i_28 = Rasterizer3D.staticInt325 + i_9 * Rasterizer3D.staticInt326 / i_15;
                        int i_29 = Rasterizer3D.staticInt332 + i_21 * Rasterizer3D.staticInt326 / i_15;
                        Rasterizer3D.staticInt333 = 0;
                        int i_30;
                        if ((i_26 - i_28) * (i_25 - i_29) - (i_27 - i_29) * (i_24 - i_28) > 0) {
                            Rasterizer3D.staticBool54 = false;
                            if (i_26 < 0 || i_28 < 0 || i_24 < 0 || i_26 > Rasterizer3D.staticInt327 || i_28 > Rasterizer3D.staticInt327 || i_24 > Rasterizer3D.staticInt327)
                                Rasterizer3D.staticBool54 = true;

                            if (staticBool14 && method220(staticInt97, staticInt98, i_27, i_29, i_25, i_26, i_28, i_24)) {
                                staticInt103 = i_7;
                                staticInt99 = i_8;
                            }

                            if (dataclass9_1.texture == -1) {
                                if (dataclass9_1.d != 12345678)
                                    Rasterizer3D.staticMethod479(i_27, i_29, i_25, i_26, i_28, i_24, dataclass9_1.d, dataclass9_1.c, dataclass9_1.b);
                            } else if (!staticBool12) {
                                if (dataclass9_1.flat)
                                    Rasterizer3D.staticMethod485(i_27, i_29, i_25, i_26, i_28, i_24, dataclass9_1.d, dataclass9_1.c, dataclass9_1.b, i_10, i_14, i_9, i_17, i_18, i_21, i_12, i_11, i_15, dataclass9_1.texture);
                                else
                                    Rasterizer3D.staticMethod485(i_27, i_29, i_25, i_26, i_28, i_24, dataclass9_1.d, dataclass9_1.c, dataclass9_1.b, i_13, i_9, i_14, i_19, i_21, i_18, i_16, i_15, i_11, dataclass9_1.texture);
                            } else {
                                i_30 = Rasterizer3D.staticInterface2_1.method151(dataclass9_1.texture);
                                Rasterizer3D.staticMethod479(i_27, i_29, i_25, i_26, i_28, i_24, staticMethod120(i_30, dataclass9_1.d), staticMethod120(i_30, dataclass9_1.c), staticMethod120(i_30, dataclass9_1.b));
                            }
                        }

                        if ((i_22 - i_24) * (i_29 - i_25) - (i_23 - i_25) * (i_28 - i_24) > 0) {
                            Rasterizer3D.staticBool54 = false;
                            if (i_22 < 0 || i_24 < 0 || i_28 < 0 || i_22 > Rasterizer3D.staticInt327 || i_24 > Rasterizer3D.staticInt327 || i_28 > Rasterizer3D.staticInt327)
                                Rasterizer3D.staticBool54 = true;

                            if (staticBool14 && method220(staticInt97, staticInt98, i_23, i_25, i_29, i_22, i_24, i_28)) {
                                staticInt103 = i_7;
                                staticInt99 = i_8;
                            }

                            if (dataclass9_1.texture == -1) {
                                if (dataclass9_1.a != 12345678)
                                    Rasterizer3D.staticMethod479(i_23, i_25, i_29, i_22, i_24, i_28, dataclass9_1.a, dataclass9_1.b, dataclass9_1.c);
                            } else if (!staticBool12)
                                Rasterizer3D.staticMethod485(i_23, i_25, i_29, i_22, i_24, i_28, dataclass9_1.a, dataclass9_1.b, dataclass9_1.c, i_10, i_14, i_9, i_17, i_18, i_21, i_12, i_11, i_15, dataclass9_1.texture);
                            else {
                                i_30 = Rasterizer3D.staticInterface2_1.method151(dataclass9_1.texture);
                                Rasterizer3D.staticMethod479(i_23, i_25, i_29, i_22, i_24, i_28, staticMethod120(i_30, dataclass9_1.a), staticMethod120(i_30, dataclass9_1.b), staticMethod120(i_30, dataclass9_1.c));
                            }
                        }

                    }
                }
            }
        }
    }

    void method219(DataClass4 dataclass4_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
        int i_8 = dataclass4_1.intArray16.length;

        int i_9;
        int i_10;
        int i_11;
        int i_12;
        int i_13;
        for (i_9 = 0; i_9 < i_8; i_9++) {
            i_10 = dataclass4_1.intArray16[i_9] - staticInt95;
            i_11 = dataclass4_1.intArray17[i_9] - staticInt90;
            i_12 = dataclass4_1.intArray8[i_9] - staticInt91;
            i_13 = i_12 * i_4 + i_10 * i_5 >> 16;
            i_12 = i_12 * i_5 - i_10 * i_4 >> 16;
            i_10 = i_13;
            i_13 = i_11 * i_3 - i_12 * i_2 >> 16;
            i_12 = i_11 * i_2 + i_12 * i_3 >> 16;
            if (i_12 < 50)
                return;

            if (dataclass4_1.intArray14 != null) {
                DataClass4.staticIntArray28[i_9] = i_10;
                DataClass4.staticIntArray30[i_9] = i_13;
                DataClass4.staticIntArray29[i_9] = i_12;
            }

            DataClass4.staticIntArray32[i_9] = Rasterizer3D.staticInt325 + i_10 * Rasterizer3D.staticInt326 / i_12;
            DataClass4.staticIntArray31[i_9] = Rasterizer3D.staticInt332 + i_13 * Rasterizer3D.staticInt326 / i_12;
        }

        Rasterizer3D.staticInt333 = 0;
        i_8 = dataclass4_1.intArray12.length;

        for (i_9 = 0; i_9 < i_8; i_9++) {
            i_10 = dataclass4_1.intArray12[i_9];
            i_11 = dataclass4_1.intArray13[i_9];
            i_12 = dataclass4_1.intArray15[i_9];
            i_13 = DataClass4.staticIntArray32[i_10];
            int i_14 = DataClass4.staticIntArray32[i_11];
            int i_15 = DataClass4.staticIntArray32[i_12];
            int i_16 = DataClass4.staticIntArray31[i_10];
            int i_17 = DataClass4.staticIntArray31[i_11];
            int i_18 = DataClass4.staticIntArray31[i_12];
            if ((i_13 - i_14) * (i_18 - i_17) - (i_16 - i_17) * (i_15 - i_14) > 0) {
                Rasterizer3D.staticBool54 = false;
                if (i_13 < 0 || i_14 < 0 || i_15 < 0 || i_13 > Rasterizer3D.staticInt327 || i_14 > Rasterizer3D.staticInt327 || i_15 > Rasterizer3D.staticInt327)
                    Rasterizer3D.staticBool54 = true;

                if (staticBool14 && method220(staticInt97, staticInt98, i_16, i_17, i_18, i_13, i_14, i_15)) {
                    staticInt103 = i_6;
                    staticInt99 = i_7;
                }

                if (dataclass4_1.intArray14 != null && dataclass4_1.intArray14[i_9] != -1) {
                    if (!staticBool12) {
                        if (dataclass4_1.bool13)
                            Rasterizer3D.staticMethod485(i_16, i_17, i_18, i_13, i_14, i_15, dataclass4_1.intArray9[i_9], dataclass4_1.intArray10[i_9], dataclass4_1.intArray11[i_9], DataClass4.staticIntArray28[0], DataClass4.staticIntArray28[1], DataClass4.staticIntArray28[3], DataClass4.staticIntArray30[0], DataClass4.staticIntArray30[1], DataClass4.staticIntArray30[3], DataClass4.staticIntArray29[0], DataClass4.staticIntArray29[1], DataClass4.staticIntArray29[3], dataclass4_1.intArray14[i_9]);
                        else
                            Rasterizer3D.staticMethod485(i_16, i_17, i_18, i_13, i_14, i_15, dataclass4_1.intArray9[i_9], dataclass4_1.intArray10[i_9], dataclass4_1.intArray11[i_9], DataClass4.staticIntArray28[i_10], DataClass4.staticIntArray28[i_11], DataClass4.staticIntArray28[i_12], DataClass4.staticIntArray30[i_10], DataClass4.staticIntArray30[i_11], DataClass4.staticIntArray30[i_12], DataClass4.staticIntArray29[i_10], DataClass4.staticIntArray29[i_11], DataClass4.staticIntArray29[i_12], dataclass4_1.intArray14[i_9]);
                    } else {
                        int i_19 = Rasterizer3D.staticInterface2_1.method151(dataclass4_1.intArray14[i_9]);
                        Rasterizer3D.staticMethod479(i_16, i_17, i_18, i_13, i_14, i_15, staticMethod120(i_19, dataclass4_1.intArray9[i_9]), staticMethod120(i_19, dataclass4_1.intArray10[i_9]), staticMethod120(i_19, dataclass4_1.intArray11[i_9]));
                    }
                } else if (dataclass4_1.intArray9[i_9] != 12345678)
                    Rasterizer3D.staticMethod479(i_16, i_17, i_18, i_13, i_14, i_15, dataclass4_1.intArray9[i_9], dataclass4_1.intArray10[i_9], dataclass4_1.intArray11[i_9]);
            }
        }

    }

    static final int staticMethod120(int i_0, int i_1) {
        i_1 = i_1 * (i_0 & 0x7f) >> 7;
        if (i_1 < 2)
            i_1 = 2;
        else if (i_1 > 126)
            i_1 = 126;

        return (i_0 & 0xff80) + i_1;
    }

    boolean method220(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
        if (i_2 < i_3 && i_2 < i_4 && i_2 < i_5)
            return false;
        else if (i_2 > i_3 && i_2 > i_4 && i_2 > i_5)
            return false;
        else if (i_1 < i_6 && i_1 < i_7 && i_1 < i_8)
            return false;
        else if (i_1 > i_6 && i_1 > i_7 && i_1 > i_8)
            return false;
        else {
            int i_9 = (i_2 - i_3) * (i_7 - i_6) - (i_1 - i_6) * (i_4 - i_3);
            int i_10 = (i_2 - i_5) * (i_6 - i_8) - (i_1 - i_8) * (i_3 - i_5);
            int i_11 = (i_2 - i_4) * (i_8 - i_7) - (i_1 - i_7) * (i_5 - i_4);
            return i_9 * i_11 > 0 && i_11 * i_10 > 0;
        }
    }

    void method221() {
        int i_1 = staticIntArray49[staticInt84];
        DataClass7[] arr_2 = staticDataClass7ArrayArray1[staticInt84];
        staticInt100 = 0;

        for (int i_3 = 0; i_3 < i_1; i_3++) {
            DataClass7 dataclass7_4 = arr_2[i_3];
            int i_5;
            int i_6;
            int i_7;
            int i_9;
            boolean bool_13;
            if (dataclass7_4.int162 == 1) {
                i_5 = dataclass7_4.int176 - staticInt88 + 25;
                if (i_5 >= 0 && i_5 <= 50) {
                    i_6 = dataclass7_4.int161 - staticInt87 + 25;
                    if (i_6 < 0)
                        i_6 = 0;

                    i_7 = dataclass7_4.int171 - staticInt87 + 25;
                    if (i_7 > 50)
                        i_7 = 50;

                    bool_13 = false;

                    while (i_6 <= i_7)
                        if (staticBoolArrayArray1[i_5][i_6++]) {
                            bool_13 = true;
                            break;
                        }

                    if (bool_13) {
                        i_9 = staticInt95 - dataclass7_4.int163;
                        if (i_9 > 32)
                            dataclass7_4.int169 = 1;
                        else {
                            if (i_9 >= -32)
                                continue;

                            dataclass7_4.int169 = 2;
                            i_9 = -i_9;
                        }

                        dataclass7_4.int172 = (dataclass7_4.int165 - staticInt91 << 8) / i_9;
                        dataclass7_4.int173 = (dataclass7_4.int166 - staticInt91 << 8) / i_9;
                        dataclass7_4.int174 = (dataclass7_4.int167 - staticInt90 << 8) / i_9;
                        dataclass7_4.int175 = (dataclass7_4.int168 - staticInt90 << 8) / i_9;
                        staticDataClass7Array1[staticInt100++] = dataclass7_4;
                    }
                }
            } else if (dataclass7_4.int162 == 2) {
                i_5 = dataclass7_4.int161 - staticInt87 + 25;
                if (i_5 >= 0 && i_5 <= 50) {
                    i_6 = dataclass7_4.int176 - staticInt88 + 25;
                    if (i_6 < 0)
                        i_6 = 0;

                    i_7 = dataclass7_4.int160 - staticInt88 + 25;
                    if (i_7 > 50)
                        i_7 = 50;

                    bool_13 = false;

                    while (i_6 <= i_7)
                        if (staticBoolArrayArray1[i_6++][i_5]) {
                            bool_13 = true;
                            break;
                        }

                    if (bool_13) {
                        i_9 = staticInt91 - dataclass7_4.int165;
                        if (i_9 > 32)
                            dataclass7_4.int169 = 3;
                        else {
                            if (i_9 >= -32)
                                continue;

                            dataclass7_4.int169 = 4;
                            i_9 = -i_9;
                        }

                        dataclass7_4.int170 = (dataclass7_4.int163 - staticInt95 << 8) / i_9;
                        dataclass7_4.int177 = (dataclass7_4.int164 - staticInt95 << 8) / i_9;
                        dataclass7_4.int174 = (dataclass7_4.int167 - staticInt90 << 8) / i_9;
                        dataclass7_4.int175 = (dataclass7_4.int168 - staticInt90 << 8) / i_9;
                        staticDataClass7Array1[staticInt100++] = dataclass7_4;
                    }
                }
            } else if (dataclass7_4.int162 == 4) {
                i_5 = dataclass7_4.int167 - staticInt90;
                if (i_5 > 128) {
                    i_6 = dataclass7_4.int161 - staticInt87 + 25;
                    if (i_6 < 0)
                        i_6 = 0;

                    i_7 = dataclass7_4.int171 - staticInt87 + 25;
                    if (i_7 > 50)
                        i_7 = 50;

                    if (i_6 <= i_7) {
                        int i_8 = dataclass7_4.int176 - staticInt88 + 25;
                        if (i_8 < 0)
                            i_8 = 0;

                        i_9 = dataclass7_4.int160 - staticInt88 + 25;
                        if (i_9 > 50)
                            i_9 = 50;

                        boolean bool_10 = false;

                        label144: for (int i_11 = i_8; i_11 <= i_9; i_11++)
                            for (int i_12 = i_6; i_12 <= i_7; i_12++)
                                if (staticBoolArrayArray1[i_11][i_12]) {
                                    bool_10 = true;
                                    break label144;
                                }

                        if (bool_10) {
                            dataclass7_4.int169 = 5;
                            dataclass7_4.int170 = (dataclass7_4.int163 - staticInt95 << 8) / i_5;
                            dataclass7_4.int177 = (dataclass7_4.int164 - staticInt95 << 8) / i_5;
                            dataclass7_4.int172 = (dataclass7_4.int165 - staticInt91 << 8) / i_5;
                            dataclass7_4.int173 = (dataclass7_4.int166 - staticInt91 << 8) / i_5;
                            staticDataClass7Array1[staticInt100++] = dataclass7_4;
                        }
                    }
                }
            }
        }

    }

    boolean method222(int i_1, int i_2, int i_3) {
        int i_4 = intArrayArrayArray4[i_1][i_2][i_3];
        if (i_4 == -staticInt104)
            return false;
        else if (i_4 == staticInt104)
            return true;
        else {
            int i_5 = i_2 << 7;
            int i_6 = i_3 << 7;
            if (method226(i_5 + 1, intArrayArrayArray3[i_1][i_2][i_3], i_6 + 1) && method226(i_5 + 128 - 1, intArrayArrayArray3[i_1][i_2 + 1][i_3], i_6 + 1) && method226(i_5 + 128 - 1, intArrayArrayArray3[i_1][i_2 + 1][i_3 + 1], i_6 + 128 - 1) && method226(i_5 + 1, intArrayArrayArray3[i_1][i_2][i_3 + 1], i_6 + 128 - 1)) {
                intArrayArrayArray4[i_1][i_2][i_3] = staticInt104;
                return true;
            } else {
                intArrayArrayArray4[i_1][i_2][i_3] = -staticInt104;
                return false;
            }
        }
    }

    boolean method223(int i_1, int i_2, int i_3, int i_4) {
        if (!method222(i_1, i_2, i_3))
            return false;
        else {
            int i_5 = i_2 << 7;
            int i_6 = i_3 << 7;
            int i_7 = intArrayArrayArray3[i_1][i_2][i_3] - 1;
            int i_8 = i_7 - 120;
            int i_9 = i_7 - 230;
            int i_10 = i_7 - 238;
            if (i_4 < 16) {
                if (i_4 == 1) {
                    if (i_5 > staticInt95) {
                        if (!method226(i_5, i_7, i_6))
                            return false;

                        if (!method226(i_5, i_7, i_6 + 128))
                            return false;
                    }

                    if (i_1 > 0) {
                        if (!method226(i_5, i_8, i_6))
                            return false;

                        if (!method226(i_5, i_8, i_6 + 128))
                            return false;
                    }

                    if (!method226(i_5, i_9, i_6))
                        return false;

                    if (!method226(i_5, i_9, i_6 + 128))
                        return false;

                    return true;
                }

                if (i_4 == 2) {
                    if (i_6 < staticInt91) {
                        if (!method226(i_5, i_7, i_6 + 128))
                            return false;

                        if (!method226(i_5 + 128, i_7, i_6 + 128))
                            return false;
                    }

                    if (i_1 > 0) {
                        if (!method226(i_5, i_8, i_6 + 128))
                            return false;

                        if (!method226(i_5 + 128, i_8, i_6 + 128))
                            return false;
                    }

                    if (!method226(i_5, i_9, i_6 + 128))
                        return false;

                    if (!method226(i_5 + 128, i_9, i_6 + 128))
                        return false;

                    return true;
                }

                if (i_4 == 4) {
                    if (i_5 < staticInt95) {
                        if (!method226(i_5 + 128, i_7, i_6))
                            return false;

                        if (!method226(i_5 + 128, i_7, i_6 + 128))
                            return false;
                    }

                    if (i_1 > 0) {
                        if (!method226(i_5 + 128, i_8, i_6))
                            return false;

                        if (!method226(i_5 + 128, i_8, i_6 + 128))
                            return false;
                    }

                    if (!method226(i_5 + 128, i_9, i_6))
                        return false;

                    if (!method226(i_5 + 128, i_9, i_6 + 128))
                        return false;

                    return true;
                }

                if (i_4 == 8) {
                    if (i_6 > staticInt91) {
                        if (!method226(i_5, i_7, i_6))
                            return false;

                        if (!method226(i_5 + 128, i_7, i_6))
                            return false;
                    }

                    if (i_1 > 0) {
                        if (!method226(i_5, i_8, i_6))
                            return false;

                        if (!method226(i_5 + 128, i_8, i_6))
                            return false;
                    }

                    if (!method226(i_5, i_9, i_6))
                        return false;

                    if (!method226(i_5 + 128, i_9, i_6))
                        return false;

                    return true;
                }
            }

            return !method226(i_5 + 64, i_10, i_6 + 64) ? false : i_4 == 16 ? method226(i_5, i_9, i_6 + 128) : i_4 == 32 ? method226(i_5 + 128, i_9, i_6 + 128) : i_4 == 64 ? method226(i_5 + 128, i_9, i_6) : i_4 == 128 ? method226(i_5, i_9, i_6) : true;
        }
    }

    boolean method224(int i_1, int i_2, int i_3, int i_4) {
        if (!method222(i_1, i_2, i_3))
            return false;
        else {
            int i_5 = i_2 << 7;
            int i_6 = i_3 << 7;
            return method226(i_5 + 1, intArrayArrayArray3[i_1][i_2][i_3] - i_4, i_6 + 1) && method226(i_5 + 128 - 1, intArrayArrayArray3[i_1][i_2 + 1][i_3] - i_4, i_6 + 1) && method226(i_5 + 128 - 1, intArrayArrayArray3[i_1][i_2 + 1][i_3 + 1] - i_4, i_6 + 128 - 1) && method226(i_5 + 1, intArrayArrayArray3[i_1][i_2][i_3 + 1] - i_4, i_6 + 128 - 1);
        }
    }

    boolean method225(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        int i_7;
        int i_8;
        if (i_2 == i_3 && i_4 == i_5) {
            if (!method222(i_1, i_2, i_4))
                return false;
            else {
                i_7 = i_2 << 7;
                i_8 = i_4 << 7;
                return method226(i_7 + 1, intArrayArrayArray3[i_1][i_2][i_4] - i_6, i_8 + 1) && method226(i_7 + 128 - 1, intArrayArrayArray3[i_1][i_2 + 1][i_4] - i_6, i_8 + 1) && method226(i_7 + 128 - 1, intArrayArrayArray3[i_1][i_2 + 1][i_4 + 1] - i_6, i_8 + 128 - 1) && method226(i_7 + 1, intArrayArrayArray3[i_1][i_2][i_4 + 1] - i_6, i_8 + 128 - 1);
            }
        } else {
            for (i_7 = i_2; i_7 <= i_3; i_7++)
                for (i_8 = i_4; i_8 <= i_5; i_8++)
                    if (intArrayArrayArray4[i_1][i_7][i_8] == -staticInt104)
                        return false;

            i_7 = (i_2 << 7) + 1;
            i_8 = (i_4 << 7) + 2;
            int i_9 = intArrayArrayArray3[i_1][i_2][i_4] - i_6;
            if (!method226(i_7, i_9, i_8))
                return false;
            else {
                int i_10 = (i_3 << 7) - 1;
                if (!method226(i_10, i_9, i_8))
                    return false;
                else {
                    int i_11 = (i_5 << 7) - 1;
                    if (!method226(i_7, i_9, i_11))
                        return false;
                    else if (!method226(i_10, i_9, i_11))
                        return false;
                    else
                        return true;
                }
            }
        }
    }

    boolean method226(int i_1, int i_2, int i_3) {
        for (int i_4 = 0; i_4 < staticInt100; i_4++) {
            DataClass7 dataclass7_5 = staticDataClass7Array1[i_4];
            int i_6;
            int i_7;
            int i_8;
            int i_9;
            int i_10;
            if (dataclass7_5.int169 == 1) {
                i_6 = dataclass7_5.int163 - i_1;
                if (i_6 > 0) {
                    i_7 = dataclass7_5.int165 + (dataclass7_5.int172 * i_6 >> 8);
                    i_8 = dataclass7_5.int166 + (dataclass7_5.int173 * i_6 >> 8);
                    i_9 = dataclass7_5.int167 + (dataclass7_5.int174 * i_6 >> 8);
                    i_10 = dataclass7_5.int168 + (dataclass7_5.int175 * i_6 >> 8);
                    if (i_3 >= i_7 && i_3 <= i_8 && i_2 >= i_9 && i_2 <= i_10)
                        return true;
                }
            } else if (dataclass7_5.int169 == 2) {
                i_6 = i_1 - dataclass7_5.int163;
                if (i_6 > 0) {
                    i_7 = dataclass7_5.int165 + (dataclass7_5.int172 * i_6 >> 8);
                    i_8 = dataclass7_5.int166 + (dataclass7_5.int173 * i_6 >> 8);
                    i_9 = dataclass7_5.int167 + (dataclass7_5.int174 * i_6 >> 8);
                    i_10 = dataclass7_5.int168 + (dataclass7_5.int175 * i_6 >> 8);
                    if (i_3 >= i_7 && i_3 <= i_8 && i_2 >= i_9 && i_2 <= i_10)
                        return true;
                }
            } else if (dataclass7_5.int169 == 3) {
                i_6 = dataclass7_5.int165 - i_3;
                if (i_6 > 0) {
                    i_7 = dataclass7_5.int163 + (dataclass7_5.int170 * i_6 >> 8);
                    i_8 = dataclass7_5.int164 + (dataclass7_5.int177 * i_6 >> 8);
                    i_9 = dataclass7_5.int167 + (dataclass7_5.int174 * i_6 >> 8);
                    i_10 = dataclass7_5.int168 + (dataclass7_5.int175 * i_6 >> 8);
                    if (i_1 >= i_7 && i_1 <= i_8 && i_2 >= i_9 && i_2 <= i_10)
                        return true;
                }
            } else if (dataclass7_5.int169 == 4) {
                i_6 = i_3 - dataclass7_5.int165;
                if (i_6 > 0) {
                    i_7 = dataclass7_5.int163 + (dataclass7_5.int170 * i_6 >> 8);
                    i_8 = dataclass7_5.int164 + (dataclass7_5.int177 * i_6 >> 8);
                    i_9 = dataclass7_5.int167 + (dataclass7_5.int174 * i_6 >> 8);
                    i_10 = dataclass7_5.int168 + (dataclass7_5.int175 * i_6 >> 8);
                    if (i_1 >= i_7 && i_1 <= i_8 && i_2 >= i_9 && i_2 <= i_10)
                        return true;
                }
            } else if (dataclass7_5.int169 == 5) {
                i_6 = i_2 - dataclass7_5.int167;
                if (i_6 > 0) {
                    i_7 = dataclass7_5.int163 + (dataclass7_5.int170 * i_6 >> 8);
                    i_8 = dataclass7_5.int164 + (dataclass7_5.int177 * i_6 >> 8);
                    i_9 = dataclass7_5.int165 + (dataclass7_5.int172 * i_6 >> 8);
                    i_10 = dataclass7_5.int166 + (dataclass7_5.int173 * i_6 >> 8);
                    if (i_1 >= i_7 && i_1 <= i_8 && i_3 >= i_9 && i_3 <= i_10)
                        return true;
                }
            }
        }

        return false;
    }

    public static final int[] staticMethod121(int i_0, int i_1, int i_2) {
        int i_3 = i_2 * staticInt108 + i_0 * staticInt94 >> 16;
        i_2 = i_2 * staticInt94 - i_0 * staticInt108 >> 16;
        i_0 = i_3;
        i_3 = i_1 * staticInt93 - i_2 * staticInt92 >> 16;
        i_2 = i_1 * staticInt92 + i_2 * staticInt93 >> 16;
        i_2 |= 0x1;
        int i_4 = Rasterizer3D.staticInt325 + i_0 * Rasterizer3D.staticInt326 / i_2 + Rasterizer2D.staticInt316;
        int i_5 = Rasterizer3D.staticInt332 + i_3 * Rasterizer3D.staticInt326 / i_2 + Rasterizer2D.staticInt311;
        return new int[] { i_4, i_5 };
    }

}

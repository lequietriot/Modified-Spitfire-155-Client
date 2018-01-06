
public class StaticClass23 {

    static int[][] staticIntArrayArray8 = new int[128][128];
    static int[][] staticIntArrayArray7 = new int[128][128];
    static int[] staticIntArray61 = new int[4096];
    static int[] staticIntArray62 = new int[4096];
    static int staticInt128;
    static int staticInt129;

    StaticClass23() throws Throwable {
        throw new Error();
    }

    public static int staticMethod140(int i_0, int i_1, int i_2, AbstractClass1 abstractclass1_3, CollisionMap collisionmap_4, boolean bool_5, int[] ints_6, int[] ints_7) {
        int i_10;
        for (int i_9 = 0; i_9 < 128; i_9++)
            for (i_10 = 0; i_10 < 128; i_10++) {
                staticIntArrayArray8[i_9][i_10] = 0;
                staticIntArrayArray7[i_9][i_10] = 99999999;
            }

        int i_11;
        int i_12;
        byte b_13;
        byte b_14;
        int i_15;
        int i_16;
        byte b_17;
        int i_18;
        int[][] ints_19;
        int i_20;
        int i_21;
        int i_22;
        int i_23;
        boolean bool_28;
        boolean bool_29;
        int i_30;
        int i_31;
        int i_33;
        if (i_2 == 1) {
            i_11 = i_0;
            i_12 = i_1;
            b_13 = 64;
            b_14 = 64;
            i_15 = i_0 - b_13;
            i_16 = i_1 - b_14;
            staticIntArrayArray8[b_13][b_14] = 99;
            staticIntArrayArray7[b_13][b_14] = 0;
            b_17 = 0;
            i_18 = 0;
            staticIntArray61[b_17] = i_0;
            i_33 = b_17 + 1;
            staticIntArray62[b_17] = i_1;
            ints_19 = collisionmap_4.adjacencies;

            while (true) {
                if (i_33 == i_18) {
                    staticInt128 = i_11;
                    staticInt129 = i_12;
                    bool_29 = false;
                    break;
                }

                i_11 = staticIntArray61[i_18];
                i_12 = staticIntArray62[i_18];
                i_18 = i_18 + 1 & 0xfff;
                i_30 = i_11 - i_15;
                i_31 = i_12 - i_16;
                i_20 = i_11 - collisionmap_4.xOffset;
                i_21 = i_12 - collisionmap_4.yOffset;
                if (abstractclass1_3.method246(1, i_11, i_12, collisionmap_4)) {
                    staticInt128 = i_11;
                    staticInt129 = i_12;
                    bool_29 = true;
                    break;
                }

                i_22 = 1 + staticIntArrayArray7[i_30][i_31];
                if (i_30 > 0 && staticIntArrayArray8[i_30 - 1][i_31] == 0 && (ints_19[i_20 - 1][i_21] & 0x1240108) == 0) {
                    staticIntArray61[i_33] = i_11 - 1;
                    staticIntArray62[i_33] = i_12;
                    i_33 = i_33 + 1 & 0xfff;
                    staticIntArrayArray8[i_30 - 1][i_31] = 2;
                    staticIntArrayArray7[i_30 - 1][i_31] = i_22;
                }

                if (i_30 < 127 && staticIntArrayArray8[i_30 + 1][i_31] == 0 && (ints_19[i_20 + 1][i_21] & 0x1240180) == 0) {
                    staticIntArray61[i_33] = i_11 + 1;
                    staticIntArray62[i_33] = i_12;
                    i_33 = i_33 + 1 & 0xfff;
                    staticIntArrayArray8[i_30 + 1][i_31] = 8;
                    staticIntArrayArray7[i_30 + 1][i_31] = i_22;
                }

                if (i_31 > 0 && staticIntArrayArray8[i_30][i_31 - 1] == 0 && (ints_19[i_20][i_21 - 1] & 0x1240102) == 0) {
                    staticIntArray61[i_33] = i_11;
                    staticIntArray62[i_33] = i_12 - 1;
                    i_33 = i_33 + 1 & 0xfff;
                    staticIntArrayArray8[i_30][i_31 - 1] = 1;
                    staticIntArrayArray7[i_30][i_31 - 1] = i_22;
                }

                if (i_31 < 127 && staticIntArrayArray8[i_30][i_31 + 1] == 0 && (ints_19[i_20][i_21 + 1] & 0x1240120) == 0) {
                    staticIntArray61[i_33] = i_11;
                    staticIntArray62[i_33] = i_12 + 1;
                    i_33 = i_33 + 1 & 0xfff;
                    staticIntArrayArray8[i_30][i_31 + 1] = 4;
                    staticIntArrayArray7[i_30][i_31 + 1] = i_22;
                }

                if (i_30 > 0 && i_31 > 0 && staticIntArrayArray8[i_30 - 1][i_31 - 1] == 0 && (ints_19[i_20 - 1][i_21 - 1] & 0x124010e) == 0 && (ints_19[i_20 - 1][i_21] & 0x1240108) == 0 && (ints_19[i_20][i_21 - 1] & 0x1240102) == 0) {
                    staticIntArray61[i_33] = i_11 - 1;
                    staticIntArray62[i_33] = i_12 - 1;
                    i_33 = i_33 + 1 & 0xfff;
                    staticIntArrayArray8[i_30 - 1][i_31 - 1] = 3;
                    staticIntArrayArray7[i_30 - 1][i_31 - 1] = i_22;
                }

                if (i_30 < 127 && i_31 > 0 && staticIntArrayArray8[i_30 + 1][i_31 - 1] == 0 && (ints_19[i_20 + 1][i_21 - 1] & 0x1240183) == 0 && (ints_19[i_20 + 1][i_21] & 0x1240180) == 0 && (ints_19[i_20][i_21 - 1] & 0x1240102) == 0) {
                    staticIntArray61[i_33] = i_11 + 1;
                    staticIntArray62[i_33] = i_12 - 1;
                    i_33 = i_33 + 1 & 0xfff;
                    staticIntArrayArray8[i_30 + 1][i_31 - 1] = 9;
                    staticIntArrayArray7[i_30 + 1][i_31 - 1] = i_22;
                }

                if (i_30 > 0 && i_31 < 127 && staticIntArrayArray8[i_30 - 1][i_31 + 1] == 0 && (ints_19[i_20 - 1][i_21 + 1] & 0x1240138) == 0 && (ints_19[i_20 - 1][i_21] & 0x1240108) == 0 && (ints_19[i_20][i_21 + 1] & 0x1240120) == 0) {
                    staticIntArray61[i_33] = i_11 - 1;
                    staticIntArray62[i_33] = i_12 + 1;
                    i_33 = i_33 + 1 & 0xfff;
                    staticIntArrayArray8[i_30 - 1][i_31 + 1] = 6;
                    staticIntArrayArray7[i_30 - 1][i_31 + 1] = i_22;
                }

                if (i_30 < 127 && i_31 < 127 && staticIntArrayArray8[i_30 + 1][i_31 + 1] == 0 && (ints_19[i_20 + 1][i_21 + 1] & 0x12401e0) == 0 && (ints_19[i_20 + 1][i_21] & 0x1240180) == 0 && (ints_19[i_20][i_21 + 1] & 0x1240120) == 0) {
                    staticIntArray61[i_33] = i_11 + 1;
                    staticIntArray62[i_33] = i_12 + 1;
                    i_33 = i_33 + 1 & 0xfff;
                    staticIntArrayArray8[i_30 + 1][i_31 + 1] = 12;
                    staticIntArrayArray7[i_30 + 1][i_31 + 1] = i_22;
                }
            }

            bool_28 = bool_29;
        } else if (i_2 == 2) {
            i_11 = i_0;
            i_12 = i_1;
            b_13 = 64;
            b_14 = 64;
            i_15 = i_0 - b_13;
            i_16 = i_1 - b_14;
            staticIntArrayArray8[b_13][b_14] = 99;
            staticIntArrayArray7[b_13][b_14] = 0;
            b_17 = 0;
            i_18 = 0;
            staticIntArray61[b_17] = i_0;
            i_33 = b_17 + 1;
            staticIntArray62[b_17] = i_1;
            ints_19 = collisionmap_4.adjacencies;

            while (true) {
                if (i_33 == i_18) {
                    staticInt128 = i_11;
                    staticInt129 = i_12;
                    bool_29 = false;
                    break;
                }

                i_11 = staticIntArray61[i_18];
                i_12 = staticIntArray62[i_18];
                i_18 = i_18 + 1 & 0xfff;
                i_30 = i_11 - i_15;
                i_31 = i_12 - i_16;
                i_20 = i_11 - collisionmap_4.xOffset;
                i_21 = i_12 - collisionmap_4.yOffset;
                if (abstractclass1_3.method246(2, i_11, i_12, collisionmap_4)) {
                    staticInt128 = i_11;
                    staticInt129 = i_12;
                    bool_29 = true;
                    break;
                }

                i_22 = staticIntArrayArray7[i_30][i_31] + 1;
                if (i_30 > 0 && staticIntArrayArray8[i_30 - 1][i_31] == 0 && (ints_19[i_20 - 1][i_21] & 0x124010e) == 0 && (ints_19[i_20 - 1][i_21 + 1] & 0x1240138) == 0) {
                    staticIntArray61[i_33] = i_11 - 1;
                    staticIntArray62[i_33] = i_12;
                    i_33 = i_33 + 1 & 0xfff;
                    staticIntArrayArray8[i_30 - 1][i_31] = 2;
                    staticIntArrayArray7[i_30 - 1][i_31] = i_22;
                }

                if (i_30 < 126 && staticIntArrayArray8[i_30 + 1][i_31] == 0 && (ints_19[i_20 + 2][i_21] & 0x1240183) == 0 && (ints_19[i_20 + 2][i_21 + 1] & 0x12401e0) == 0) {
                    staticIntArray61[i_33] = i_11 + 1;
                    staticIntArray62[i_33] = i_12;
                    i_33 = i_33 + 1 & 0xfff;
                    staticIntArrayArray8[i_30 + 1][i_31] = 8;
                    staticIntArrayArray7[i_30 + 1][i_31] = i_22;
                }

                if (i_31 > 0 && staticIntArrayArray8[i_30][i_31 - 1] == 0 && (ints_19[i_20][i_21 - 1] & 0x124010e) == 0 && (ints_19[i_20 + 1][i_21 - 1] & 0x1240183) == 0) {
                    staticIntArray61[i_33] = i_11;
                    staticIntArray62[i_33] = i_12 - 1;
                    i_33 = i_33 + 1 & 0xfff;
                    staticIntArrayArray8[i_30][i_31 - 1] = 1;
                    staticIntArrayArray7[i_30][i_31 - 1] = i_22;
                }

                if (i_31 < 126 && staticIntArrayArray8[i_30][i_31 + 1] == 0 && (ints_19[i_20][i_21 + 2] & 0x1240138) == 0 && (ints_19[i_20 + 1][i_21 + 2] & 0x12401e0) == 0) {
                    staticIntArray61[i_33] = i_11;
                    staticIntArray62[i_33] = i_12 + 1;
                    i_33 = i_33 + 1 & 0xfff;
                    staticIntArrayArray8[i_30][i_31 + 1] = 4;
                    staticIntArrayArray7[i_30][i_31 + 1] = i_22;
                }

                if (i_30 > 0 && i_31 > 0 && staticIntArrayArray8[i_30 - 1][i_31 - 1] == 0 && (ints_19[i_20 - 1][i_21] & 0x124013e) == 0 && (ints_19[i_20 - 1][i_21 - 1] & 0x124010e) == 0 && (ints_19[i_20][i_21 - 1] & 0x124018f) == 0) {
                    staticIntArray61[i_33] = i_11 - 1;
                    staticIntArray62[i_33] = i_12 - 1;
                    i_33 = i_33 + 1 & 0xfff;
                    staticIntArrayArray8[i_30 - 1][i_31 - 1] = 3;
                    staticIntArrayArray7[i_30 - 1][i_31 - 1] = i_22;
                }

                if (i_30 < 126 && i_31 > 0 && staticIntArrayArray8[i_30 + 1][i_31 - 1] == 0 && (ints_19[i_20 + 1][i_21 - 1] & 0x124018f) == 0 && (ints_19[i_20 + 2][i_21 - 1] & 0x1240183) == 0 && (ints_19[i_20 + 2][i_21] & 0x12401e3) == 0) {
                    staticIntArray61[i_33] = i_11 + 1;
                    staticIntArray62[i_33] = i_12 - 1;
                    i_33 = i_33 + 1 & 0xfff;
                    staticIntArrayArray8[i_30 + 1][i_31 - 1] = 9;
                    staticIntArrayArray7[i_30 + 1][i_31 - 1] = i_22;
                }

                if (i_30 > 0 && i_31 < 126 && staticIntArrayArray8[i_30 - 1][i_31 + 1] == 0 && (ints_19[i_20 - 1][i_21 + 1] & 0x124013e) == 0 && (ints_19[i_20 - 1][i_21 + 2] & 0x1240138) == 0 && (ints_19[i_20][i_21 + 2] & 0x12401f8) == 0) {
                    staticIntArray61[i_33] = i_11 - 1;
                    staticIntArray62[i_33] = i_12 + 1;
                    i_33 = i_33 + 1 & 0xfff;
                    staticIntArrayArray8[i_30 - 1][i_31 + 1] = 6;
                    staticIntArrayArray7[i_30 - 1][i_31 + 1] = i_22;
                }

                if (i_30 < 126 && i_31 < 126 && staticIntArrayArray8[i_30 + 1][i_31 + 1] == 0 && (ints_19[i_20 + 1][i_21 + 2] & 0x12401f8) == 0 && (ints_19[i_20 + 2][i_21 + 2] & 0x12401e0) == 0 && (ints_19[i_20 + 2][i_21 + 1] & 0x12401e3) == 0) {
                    staticIntArray61[i_33] = i_11 + 1;
                    staticIntArray62[i_33] = i_12 + 1;
                    i_33 = i_33 + 1 & 0xfff;
                    staticIntArrayArray8[i_30 + 1][i_31 + 1] = 12;
                    staticIntArrayArray7[i_30 + 1][i_31 + 1] = i_22;
                }
            }

            bool_28 = bool_29;
        } else {
            i_11 = i_0;
            i_12 = i_1;
            b_13 = 64;
            b_14 = 64;
            i_15 = i_0 - b_13;
            i_16 = i_1 - b_14;
            staticIntArrayArray8[b_13][b_14] = 99;
            staticIntArrayArray7[b_13][b_14] = 0;
            b_17 = 0;
            i_18 = 0;
            staticIntArray61[b_17] = i_0;
            i_33 = b_17 + 1;
            staticIntArray62[b_17] = i_1;
            ints_19 = collisionmap_4.adjacencies;

            label611: while (true)
                label609: while (true) {
                    do
                        do
                            do
                                label586: do {
                                    if (i_18 == i_33) {
                                        staticInt128 = i_11;
                                        staticInt129 = i_12;
                                        bool_29 = false;
                                        break label611;
                                    }

                                    i_11 = staticIntArray61[i_18];
                                    i_12 = staticIntArray62[i_18];
                                    i_18 = i_18 + 1 & 0xfff;
                                    i_30 = i_11 - i_15;
                                    i_31 = i_12 - i_16;
                                    i_20 = i_11 - collisionmap_4.xOffset;
                                    i_21 = i_12 - collisionmap_4.yOffset;
                                    if (abstractclass1_3.method246(i_2, i_11, i_12, collisionmap_4)) {
                                        staticInt128 = i_11;
                                        staticInt129 = i_12;
                                        bool_29 = true;
                                        break label611;
                                    }

                                    i_22 = staticIntArrayArray7[i_30][i_31] + 1;
                                    if (i_30 > 0 && staticIntArrayArray8[i_30 - 1][i_31] == 0 && (ints_19[i_20 - 1][i_21] & 0x124010e) == 0 && (ints_19[i_20 - 1][i_21 + i_2 - 1] & 0x1240138) == 0) {
                                        i_23 = 1;

                                        while (true) {
                                            if (i_23 >= i_2 - 1) {
                                                staticIntArray61[i_33] = i_11 - 1;
                                                staticIntArray62[i_33] = i_12;
                                                i_33 = i_33 + 1 & 0xfff;
                                                staticIntArrayArray8[i_30 - 1][i_31] = 2;
                                                staticIntArrayArray7[i_30 - 1][i_31] = i_22;
                                                break;
                                            }

                                            if ((ints_19[i_20 - 1][i_21 + i_23] & 0x124013e) != 0)
                                                break;

                                            ++i_23;
                                        }
                                    }

                                    if (i_30 < 128 - i_2 && staticIntArrayArray8[i_30 + 1][i_31] == 0 && (ints_19[i_2 + i_20][i_21] & 0x1240183) == 0 && (ints_19[i_20 + i_2][i_2 + i_21 - 1] & 0x12401e0) == 0) {
                                        i_23 = 1;

                                        while (true) {
                                            if (i_23 >= i_2 - 1) {
                                                staticIntArray61[i_33] = i_11 + 1;
                                                staticIntArray62[i_33] = i_12;
                                                i_33 = i_33 + 1 & 0xfff;
                                                staticIntArrayArray8[i_30 + 1][i_31] = 8;
                                                staticIntArrayArray7[i_30 + 1][i_31] = i_22;
                                                break;
                                            }

                                            if ((ints_19[i_20 + i_2][i_21 + i_23] & 0x12401e3) != 0)
                                                break;

                                            ++i_23;
                                        }
                                    }

                                    if (i_31 > 0 && staticIntArrayArray8[i_30][i_31 - 1] == 0 && (ints_19[i_20][i_21 - 1] & 0x124010e) == 0 && (ints_19[i_20 + i_2 - 1][i_21 - 1] & 0x1240183) == 0) {
                                        i_23 = 1;

                                        while (true) {
                                            if (i_23 >= i_2 - 1) {
                                                staticIntArray61[i_33] = i_11;
                                                staticIntArray62[i_33] = i_12 - 1;
                                                i_33 = i_33 + 1 & 0xfff;
                                                staticIntArrayArray8[i_30][i_31 - 1] = 1;
                                                staticIntArrayArray7[i_30][i_31 - 1] = i_22;
                                                break;
                                            }

                                            if ((ints_19[i_23 + i_20][i_21 - 1] & 0x124018f) != 0)
                                                break;

                                            ++i_23;
                                        }
                                    }

                                    if (i_31 < 128 - i_2 && staticIntArrayArray8[i_30][i_31 + 1] == 0 && (ints_19[i_20][i_21 + i_2] & 0x1240138) == 0 && (ints_19[i_20 + i_2 - 1][i_2 + i_21] & 0x12401e0) == 0) {
                                        i_23 = 1;

                                        while (true) {
                                            if (i_23 >= i_2 - 1) {
                                                staticIntArray61[i_33] = i_11;
                                                staticIntArray62[i_33] = i_12 + 1;
                                                i_33 = i_33 + 1 & 0xfff;
                                                staticIntArrayArray8[i_30][i_31 + 1] = 4;
                                                staticIntArrayArray7[i_30][i_31 + 1] = i_22;
                                                break;
                                            }

                                            if ((ints_19[i_20 + i_23][i_21 + i_2] & 0x12401f8) != 0)
                                                break;

                                            ++i_23;
                                        }
                                    }

                                    if (i_30 > 0 && i_31 > 0 && staticIntArrayArray8[i_30 - 1][i_31 - 1] == 0 && (ints_19[i_20 - 1][i_21 - 1] & 0x124010e) == 0) {
                                        i_23 = 1;

                                        while (true) {
                                            if (i_23 >= i_2) {
                                                staticIntArray61[i_33] = i_11 - 1;
                                                staticIntArray62[i_33] = i_12 - 1;
                                                i_33 = i_33 + 1 & 0xfff;
                                                staticIntArrayArray8[i_30 - 1][i_31 - 1] = 3;
                                                staticIntArrayArray7[i_30 - 1][i_31 - 1] = i_22;
                                                break;
                                            }

                                            if ((ints_19[i_20 - 1][i_21 - 1 + i_23] & 0x124013e) != 0 || (ints_19[i_23 + i_20 - 1][i_21 - 1] & 0x124018f) != 0)
                                                break;

                                            ++i_23;
                                        }
                                    }

                                    if (i_30 < 128 - i_2 && i_31 > 0 && staticIntArrayArray8[i_30 + 1][i_31 - 1] == 0 && (ints_19[i_20 + i_2][i_21 - 1] & 0x1240183) == 0) {
                                        i_23 = 1;

                                        while (true) {
                                            if (i_23 >= i_2) {
                                                staticIntArray61[i_33] = i_11 + 1;
                                                staticIntArray62[i_33] = i_12 - 1;
                                                i_33 = i_33 + 1 & 0xfff;
                                                staticIntArrayArray8[i_30 + 1][i_31 - 1] = 9;
                                                staticIntArrayArray7[i_30 + 1][i_31 - 1] = i_22;
                                                break;
                                            }

                                            if ((ints_19[i_2 + i_20][i_21 - 1 + i_23] & 0x12401e3) != 0 || (ints_19[i_20 + i_23][i_21 - 1] & 0x124018f) != 0)
                                                break;

                                            ++i_23;
                                        }
                                    }

                                    if (i_30 > 0 && i_31 < 128 - i_2 && staticIntArrayArray8[i_30 - 1][i_31 + 1] == 0 && (ints_19[i_20 - 1][i_2 + i_21] & 0x1240138) == 0) {
                                        for (i_23 = 1; i_23 < i_2; i_23++)
                                            if ((ints_19[i_20 - 1][i_23 + i_21] & 0x124013e) != 0 || (ints_19[i_23 + i_20 - 1][i_2 + i_21] & 0x12401f8) != 0)
                                                continue label586;

                                        staticIntArray61[i_33] = i_11 - 1;
                                        staticIntArray62[i_33] = i_12 + 1;
                                        i_33 = i_33 + 1 & 0xfff;
                                        staticIntArrayArray8[i_30 - 1][i_31 + 1] = 6;
                                        staticIntArrayArray7[i_30 - 1][i_31 + 1] = i_22;
                                    }
                                } while (i_30 >= 128 - i_2);
                            while (i_31 >= 128 - i_2);
                        while (staticIntArrayArray8[i_30 + 1][i_31 + 1] != 0);
                    while ((ints_19[i_20 + i_2][i_21 + i_2] & 0x12401e0) != 0);

                    for (i_23 = 1; i_23 < i_2; i_23++)
                        if ((ints_19[i_20 + i_23][i_21 + i_2] & 0x12401f8) != 0 || (ints_19[i_2 + i_20][i_23 + i_21] & 0x12401e3) != 0)
                            continue label609;

                    staticIntArray61[i_33] = i_11 + 1;
                    staticIntArray62[i_33] = i_12 + 1;
                    i_33 = i_33 + 1 & 0xfff;
                    staticIntArrayArray8[i_30 + 1][i_31 + 1] = 12;
                    staticIntArrayArray7[i_30 + 1][i_31 + 1] = i_22;
                }

            bool_28 = bool_29;
        }

        i_10 = i_0 - 64;
        i_11 = i_1 - 64;
        i_12 = staticInt128;
        i_30 = staticInt129;
        if (!bool_28) {
            if (!bool_5)
                return -1;

            i_31 = Integer.MAX_VALUE;
            i_15 = Integer.MAX_VALUE;
            byte b_32 = 10;
            i_33 = abstractclass1_3.int237;
            i_18 = abstractclass1_3.int238;
            int i_34 = abstractclass1_3.int239;
            i_20 = abstractclass1_3.int240;

            for (i_21 = i_33 - b_32; i_21 <= b_32 + i_33; i_21++)
                for (i_22 = i_18 - b_32; i_22 <= b_32 + i_18; i_22++) {
                    i_23 = i_21 - i_10;
                    int i_24 = i_22 - i_11;
                    if (i_23 >= 0 && i_24 >= 0 && i_23 < 128 && i_24 < 128 && staticIntArrayArray7[i_23][i_24] < 100) {
                        int i_25 = 0;
                        if (i_21 < i_33)
                            i_25 = i_33 - i_21;
                        else if (i_21 > i_33 + i_34 - 1)
                            i_25 = i_21 - (i_34 + i_33 - 1);

                        int i_26 = 0;
                        if (i_22 < i_18)
                            i_26 = i_18 - i_22;
                        else if (i_22 > i_18 + i_20 - 1)
                            i_26 = i_22 - (i_20 + i_18 - 1);

                        int i_27 = i_25 * i_25 + i_26 * i_26;
                        if (i_27 < i_31 || i_31 == i_27 && staticIntArrayArray7[i_23][i_24] < i_15) {
                            i_31 = i_27;
                            i_15 = staticIntArrayArray7[i_23][i_24];
                            i_12 = i_21;
                            i_30 = i_22;
                        }
                    }
                }

            if (i_31 == Integer.MAX_VALUE)
                return -1;
        }

        if (i_12 == i_0 && i_1 == i_30)
            return 0;
        else {
            b_14 = 0;
            staticIntArray61[b_14] = i_12;
            i_31 = b_14 + 1;
            staticIntArray62[b_14] = i_30;

            for (i_15 = i_16 = staticIntArrayArray8[i_12 - i_10][i_30 - i_11]; i_0 != i_12 || i_30 != i_1; i_15 = staticIntArrayArray8[i_12 - i_10][i_30 - i_11]) {
                if (i_16 != i_15) {
                    i_16 = i_15;
                    staticIntArray61[i_31] = i_12;
                    staticIntArray62[i_31++] = i_30;
                }

                if ((i_15 & 0x2) != 0)
                    ++i_12;
                else if ((i_15 & 0x8) != 0)
                    --i_12;

                if ((i_15 & 0x1) != 0)
                    ++i_30;
                else if ((i_15 & 0x4) != 0)
                    --i_30;
            }

            i_33 = 0;

            while (i_31-- > 0) {
                ints_6[i_33] = staticIntArray61[i_31];
                ints_7[i_33++] = staticIntArray62[i_31];
                if (i_33 >= ints_6.length)
                    break;
            }

            return i_33;
        }
    }

}

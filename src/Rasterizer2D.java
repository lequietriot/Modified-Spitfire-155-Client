public class Rasterizer2D extends Cacheable {

    public static int staticInt311 = 0;
    public static int staticInt315 = 0;
    public static int staticInt316 = 0;
    protected static int staticInt314 = 0;
    public static int[] staticIntArray130;
    public static int staticInt312;
    public static int staticInt313;

    public static void staticMethod440(int[] ints_0, int i_1, int i_2) {
        staticIntArray130 = ints_0;
        staticInt312 = i_1;
        staticInt313 = i_2;
        staticMethod442(0, 0, i_1, i_2);
    }

    public static void staticMethod441() {
        staticInt316 = 0;
        staticInt311 = 0;
        staticInt314 = staticInt312;
        staticInt315 = staticInt313;
    }

    public static void staticMethod442(int i_0, int i_1, int i_2, int i_3) {
        if (i_0 < 0)
            i_0 = 0;

        if (i_1 < 0)
            i_1 = 0;

        if (i_2 > staticInt312)
            i_2 = staticInt312;

        if (i_3 > staticInt313)
            i_3 = staticInt313;

        staticInt316 = i_0;
        staticInt311 = i_1;
        staticInt314 = i_2;
        staticInt315 = i_3;
    }

    public static void staticMethod443(int i_0, int i_1, int i_2, int i_3) {
        if (staticInt316 < i_0)
            staticInt316 = i_0;

        if (staticInt311 < i_1)
            staticInt311 = i_1;

        if (staticInt314 > i_2)
            staticInt314 = i_2;

        if (staticInt315 > i_3)
            staticInt315 = i_3;

    }

    public static void staticMethod444(int[] ints_0) {
        ints_0[0] = staticInt316;
        ints_0[1] = staticInt311;
        ints_0[2] = staticInt314;
        ints_0[3] = staticInt315;
    }

    public static void staticMethod445(int[] ints_0) {
        staticInt316 = ints_0[0];
        staticInt311 = ints_0[1];
        staticInt314 = ints_0[2];
        staticInt315 = ints_0[3];
    }

    public static void staticMethod446() {
        int i_0 = 0;

        int i_1;
        for (i_1 = staticInt312 * staticInt313 - 7; i_0 < i_1; staticIntArray130[i_0++] = 0) {
            staticIntArray130[i_0++] = 0;
            staticIntArray130[i_0++] = 0;
            staticIntArray130[i_0++] = 0;
            staticIntArray130[i_0++] = 0;
            staticIntArray130[i_0++] = 0;
            staticIntArray130[i_0++] = 0;
            staticIntArray130[i_0++] = 0;
        }

        for (i_1 += 7; i_0 < i_1; staticIntArray130[i_0++] = 0)
            ;

    }

    static void staticMethod447(int i_0, int i_1, int i_2, int i_3) {
        if (i_2 == 0)
            staticMethod464(i_0, i_1, i_3);
        else {
            if (i_2 < 0)
                i_2 = -i_2;

            int i_4 = i_1 - i_2;
            if (i_4 < staticInt311)
                i_4 = staticInt311;

            int i_5 = i_1 + i_2 + 1;
            if (i_5 > staticInt315)
                i_5 = staticInt315;

            int i_6 = i_4;
            int i_7 = i_2 * i_2;
            int i_8 = 0;
            int i_9 = i_1 - i_4;
            int i_10 = i_9 * i_9;
            int i_11 = i_10 - i_9;
            if (i_1 > i_5)
                i_1 = i_5;

            int i_12;
            int i_13;
            int i_14;
            int i_15;
            while (i_6 < i_1) {
                while (i_11 <= i_7 || i_10 <= i_7) {
                    i_10 += i_8 + i_8;
                    i_11 += i_8++ + i_8;
                }

                i_12 = i_0 - i_8 + 1;
                if (i_12 < staticInt316)
                    i_12 = staticInt316;

                i_13 = i_0 + i_8;
                if (i_13 > staticInt314)
                    i_13 = staticInt314;

                i_14 = i_12 + i_6 * staticInt312;

                for (i_15 = i_12; i_15 < i_13; i_15++)
                    staticIntArray130[i_14++] = i_3;

                ++i_6;
                i_10 -= i_9-- + i_9;
                i_11 -= i_9 + i_9;
            }

            i_8 = i_2;
            i_9 = i_6 - i_1;
            i_11 = i_9 * i_9 + i_7;
            i_10 = i_11 - i_2;

            for (i_11 -= i_9; i_6 < i_5; i_10 += i_9++ + i_9) {
                while (i_11 > i_7 && i_10 > i_7) {
                    i_11 -= i_8-- + i_8;
                    i_10 -= i_8 + i_8;
                }

                i_12 = i_0 - i_8;
                if (i_12 < staticInt316)
                    i_12 = staticInt316;

                i_13 = i_0 + i_8;
                if (i_13 > staticInt314 - 1)
                    i_13 = staticInt314 - 1;

                i_14 = i_12 + i_6 * staticInt312;

                for (i_15 = i_12; i_15 <= i_13; i_15++)
                    staticIntArray130[i_14++] = i_3;

                ++i_6;
                i_11 += i_9 + i_9;
            }

        }
    }

    public static void staticMethod448(int i_0, int i_1, int i_2, int i_3, int i_4) {
        if (i_4 != 0)
            if (i_4 == 256)
                staticMethod447(i_0, i_1, i_2, i_3);
            else {
                if (i_2 < 0)
                    i_2 = -i_2;

                int i_5 = 256 - i_4;
                int i_6 = (i_3 >> 16 & 0xff) * i_4;
                int i_7 = (i_3 >> 8 & 0xff) * i_4;
                int i_8 = (i_3 & 0xff) * i_4;
                int i_12 = i_1 - i_2;
                if (i_12 < staticInt311)
                    i_12 = staticInt311;

                int i_13 = i_1 + i_2 + 1;
                if (i_13 > staticInt315)
                    i_13 = staticInt315;

                int i_14 = i_12;
                int i_15 = i_2 * i_2;
                int i_16 = 0;
                int i_17 = i_1 - i_12;
                int i_18 = i_17 * i_17;
                int i_19 = i_18 - i_17;
                if (i_1 > i_13)
                    i_1 = i_13;

                int i_9;
                int i_10;
                int i_11;
                int i_20;
                int i_21;
                int i_22;
                int i_23;
                int i_24;
                while (i_14 < i_1) {
                    while (i_19 <= i_15 || i_18 <= i_15) {
                        i_18 += i_16 + i_16;
                        i_19 += i_16++ + i_16;
                    }

                    i_20 = i_0 - i_16 + 1;
                    if (i_20 < staticInt316)
                        i_20 = staticInt316;

                    i_21 = i_0 + i_16;
                    if (i_21 > staticInt314)
                        i_21 = staticInt314;

                    i_22 = i_20 + i_14 * staticInt312;

                    for (i_23 = i_20; i_23 < i_21; i_23++) {
                        i_9 = (staticIntArray130[i_22] >> 16 & 0xff) * i_5;
                        i_10 = (staticIntArray130[i_22] >> 8 & 0xff) * i_5;
                        i_11 = (staticIntArray130[i_22] & 0xff) * i_5;
                        i_24 = (i_6 + i_9 >> 8 << 16) + (i_7 + i_10 >> 8 << 8) + (i_8 + i_11 >> 8);
                        staticIntArray130[i_22++] = i_24;
                    }

                    ++i_14;
                    i_18 -= i_17-- + i_17;
                    i_19 -= i_17 + i_17;
                }

                i_16 = i_2;
                i_17 = -i_17;
                i_19 = i_17 * i_17 + i_15;
                i_18 = i_19 - i_2;

                for (i_19 -= i_17; i_14 < i_13; i_18 += i_17++ + i_17) {
                    while (i_19 > i_15 && i_18 > i_15) {
                        i_19 -= i_16-- + i_16;
                        i_18 -= i_16 + i_16;
                    }

                    i_20 = i_0 - i_16;
                    if (i_20 < staticInt316)
                        i_20 = staticInt316;

                    i_21 = i_0 + i_16;
                    if (i_21 > staticInt314 - 1)
                        i_21 = staticInt314 - 1;

                    i_22 = i_20 + i_14 * staticInt312;

                    for (i_23 = i_20; i_23 <= i_21; i_23++) {
                        i_9 = (staticIntArray130[i_22] >> 16 & 0xff) * i_5;
                        i_10 = (staticIntArray130[i_22] >> 8 & 0xff) * i_5;
                        i_11 = (staticIntArray130[i_22] & 0xff) * i_5;
                        i_24 = (i_6 + i_9 >> 8 << 16) + (i_7 + i_10 >> 8 << 8) + (i_8 + i_11 >> 8);
                        staticIntArray130[i_22++] = i_24;
                    }

                    ++i_14;
                    i_19 += i_17 + i_17;
                }

            }
    }

    public static void staticMethod449(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5) {
        if (i_0 < staticInt316) {
            i_2 -= staticInt316 - i_0;
            i_0 = staticInt316;
        }

        if (i_1 < staticInt311) {
            i_3 -= staticInt311 - i_1;
            i_1 = staticInt311;
        }

        if (i_0 + i_2 > staticInt314)
            i_2 = staticInt314 - i_0;

        if (i_1 + i_3 > staticInt315)
            i_3 = staticInt315 - i_1;

        i_4 = ((i_4 & 0xff00ff) * i_5 >> 8 & 0xff00ff) + ((i_4 & 0xff00) * i_5 >> 8 & 0xff00);
        int i_6 = 256 - i_5;
        int i_7 = staticInt312 - i_2;
        int i_8 = i_0 + i_1 * staticInt312;

        for (int i_9 = 0; i_9 < i_3; i_9++) {
            for (int i_10 = -i_2; i_10 < 0; i_10++) {
                int i_11 = staticIntArray130[i_8];
                i_11 = ((i_11 & 0xff00ff) * i_6 >> 8 & 0xff00ff) + ((i_11 & 0xff00) * i_6 >> 8 & 0xff00);
                staticIntArray130[i_8++] = i_4 + i_11;
            }

            i_8 += i_7;
        }

    }

    public static void staticMethod450(int i_0, int i_1, int i_2, int i_3, int i_4) {
        if (i_0 < staticInt316) {
            i_2 -= staticInt316 - i_0;
            i_0 = staticInt316;
        }

        if (i_1 < staticInt311) {
            i_3 -= staticInt311 - i_1;
            i_1 = staticInt311;
        }

        if (i_0 + i_2 > staticInt314)
            i_2 = staticInt314 - i_0;

        if (i_1 + i_3 > staticInt315)
            i_3 = staticInt315 - i_1;

        int i_5 = staticInt312 - i_2;
        int i_6 = i_0 + i_1 * staticInt312;

        for (int i_7 = -i_3; i_7 < 0; i_7++) {
            for (int i_8 = -i_2; i_8 < 0; i_8++)
                staticIntArray130[i_6++] = i_4;

            i_6 += i_5;
        }

    }

    public static void staticMethod451(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
        int i_8 = 0;
        int i_9 = i_4 == i_5 && i_6 == i_7 ? -1 : 65536 / i_3;
        int i_10 = i_6;
        int i_11 = 256 - i_6;
        int i_12 = i_4;
        if (i_0 < staticInt316) {
            i_2 -= staticInt316 - i_0;
            i_0 = staticInt316;
        }

        if (i_1 < staticInt311) {
            i_8 += (staticInt311 - i_1) * i_9;
            i_3 -= staticInt311 - i_1;
            i_1 = staticInt311;
        }

        if (i_0 + i_2 > staticInt314)
            i_2 = staticInt314 - i_0;

        if (i_1 + i_3 > staticInt315)
            i_3 = staticInt315 - i_1;

        int i_13 = staticInt312 - i_2;
        int i_14 = i_0 + i_1 * staticInt312;

        for (int i_15 = -i_3; i_15 < 0; i_15++) {
            int i_16;
            int i_17;
            for (i_16 = -i_2; i_16 < 0; i_16++) {
                i_17 = staticIntArray130[i_14];
                int i_18 = i_12 + i_17;
                int i_19 = (i_12 & 0xff00ff) + (i_17 & 0xff00ff);
                int i_20 = (i_19 & 0x1000100) + (i_18 - i_19 & 0x10000);
                if (i_11 == 0)
                    staticIntArray130[i_14++] = i_18 - i_20 | i_20 - (i_20 >>> 8);
                else {
                    int i_21 = i_18 - i_20 | i_20 - (i_20 >>> 8);
                    staticIntArray130[i_14++] = ((i_21 & 0xff00ff) * i_10 >> 8 & 0xff00ff) + ((i_21 & 0xff00) * i_10 >> 8 & 0xff00) + ((i_17 & 0xff00ff) * i_11 >> 8 & 0xff00ff) + ((i_17 & 0xff00) * i_11 >> 8 & 0xff00);
                }
            }

            if (i_9 > 0) {
                i_8 += i_9;
                i_16 = 65536 - i_8 >> 8;
                i_17 = i_8 >> 8;
                if (i_6 != i_7) {
                    i_10 = i_6 * (65536 - i_8) + i_7 * i_8 >> 16;
                    i_11 = 256 - i_10;
                }

                if (i_4 != i_5)
                    i_12 = ((i_4 & 0xff00ff) * i_16 + (i_5 & 0xff00ff) * i_17 & ~0xff00ff) + ((i_4 & 0xff00) * i_16 + (i_5 & 0xff00) * i_17 & 0xff0000) >>> 8;
            }

            i_14 += i_13;
        }

    }

    public static void staticMethod452(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
        int i_8 = 0;
        int i_9 = i_4 == i_5 && i_6 == i_7 ? -1 : 65536 / i_3;
        int i_10 = i_6;
        int i_11 = 256 - i_6;
        if (i_0 < staticInt316) {
            i_2 -= staticInt316 - i_0;
            i_0 = staticInt316;
        }

        if (i_1 < staticInt311) {
            i_8 += (staticInt311 - i_1) * i_9;
            i_3 -= staticInt311 - i_1;
            i_1 = staticInt311;
        }

        if (i_0 + i_2 > staticInt314)
            i_2 = staticInt314 - i_0;

        if (i_1 + i_3 > staticInt315)
            i_3 = staticInt315 - i_1;

        int i_12 = i_4 >> 16;
        int i_13 = (i_4 & 0xff00) >> 8;
        int i_14 = i_4 & 0xff;
        int i_18 = staticInt312 - i_2;
        int i_19 = i_0 + i_1 * staticInt312;

        for (int i_20 = 0; i_20 < i_3; i_20++) {
            int i_21;
            int i_22;
            int i_23;
            for (i_21 = -i_2; i_21 < 0; i_21++) {
                i_22 = staticIntArray130[i_19];
                i_23 = i_22 >> 16;
                int i_24 = (i_22 & 0xff00) >> 8;
                int i_25 = i_22 & 0xff;
                int i_15;
                int i_16;
                int i_17;
                if (i_11 == 0) {
                    i_15 = i_23 < 127 ? i_12 * i_23 >> 7 : 255 - ((255 - i_12) * (255 - i_23) >> 7);
                    i_16 = i_24 < 127 ? i_13 * i_24 >> 7 : 255 - ((255 - i_13) * (255 - i_24) >> 7);
                    i_17 = i_25 < 127 ? i_14 * i_25 >> 7 : 255 - ((255 - i_14) * (255 - i_25) >> 7);
                } else {
                    i_15 = i_23 < 127 ? (i_12 * i_23 * i_10 >> 7) + i_23 * i_11 >> 8 : (255 - ((255 - i_12) * (255 - i_23) >> 7)) * i_10 + i_23 * i_11 >> 8;
                    i_16 = i_24 < 127 ? (i_13 * i_24 * i_10 >> 7) + i_24 * i_11 >> 8 : (255 - ((255 - i_13) * (255 - i_24) >> 7)) * i_10 + i_24 * i_11 >> 8;
                    i_17 = i_25 < 127 ? (i_14 * i_25 * i_10 >> 7) + i_25 * i_11 >> 8 : (255 - ((255 - i_14) * (255 - i_25) >> 7)) * i_10 + i_25 * i_11 >> 8;
                }

                staticIntArray130[i_19++] = (i_15 << 16) + (i_16 << 8) + i_17;
            }

            if (i_9 > 0) {
                i_8 += i_9;
                i_21 = 65536 - i_8 >> 8;
                i_22 = i_8 >> 8;
                if (i_6 != i_7) {
                    i_10 = i_6 * (65536 - i_8) + i_7 * i_8 >> 16;
                    i_11 = 256 - i_10;
                }

                if (i_4 != i_5) {
                    i_23 = ((i_4 & 0xff00ff) * i_21 + (i_5 & 0xff00ff) * i_22 & ~0xff00ff) + ((i_4 & 0xff00) * i_21 + (i_5 & 0xff00) * i_22 & 0xff0000) >>> 8;
                    i_12 = i_23 >> 16;
                    i_13 = (i_23 & 0xff00) >> 8;
                    i_14 = i_23 & 0xff;
                }
            }

            i_19 += i_18;
        }

    }

    public static void staticMethod453(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
        int i_8 = 0;
        int i_9 = 65536 / i_3;
        int i_10 = i_6;
        int i_11 = 256 - i_6;
        if (i_0 < staticInt316) {
            i_2 -= staticInt316 - i_0;
            i_0 = staticInt316;
        }

        if (i_1 < staticInt311) {
            i_8 += (staticInt311 - i_1) * i_9;
            i_3 -= staticInt311 - i_1;
            i_1 = staticInt311;
        }

        if (i_0 + i_2 > staticInt314)
            i_2 = staticInt314 - i_0;

        if (i_1 + i_3 > staticInt315)
            i_3 = staticInt315 - i_1;

        int i_12 = i_4 & 0xff0000;
        int i_13 = i_4 & 0xff00;
        int i_14 = i_4 & 0xff;
        int i_15 = i_12 * i_6 >> 8;
        int i_16 = i_13 * i_6 >> 8;
        int i_17 = i_14 * i_6 >> 8;
        int i_18 = staticInt312 - i_2;
        int i_19 = i_0 + i_1 * staticInt312;

        for (int i_20 = 0; i_20 < i_3; i_20++) {
            int i_21;
            int i_22;
            int i_23;
            for (i_21 = -i_2; i_21 < 0; i_21++) {
                i_22 = staticIntArray130[i_19];
                i_23 = i_22 & 0xff0000;
                int i_24 = i_23 <= i_12 ? i_23 : i_11 == 0 ? i_12 : i_15 + (i_23 * i_11 >> 8) & 0xff0000;
                int i_25 = i_22 & 0xff00;
                int i_26 = i_25 <= i_13 ? i_25 : i_11 == 0 ? i_13 : i_16 + (i_25 * i_11 >> 8) & 0xff00;
                int i_27 = i_22 & 0xff;
                int i_28 = i_27 <= i_14 ? i_27 : i_11 == 0 ? i_14 : i_17 + (i_27 * i_11 >> 8);
                staticIntArray130[i_19++] = i_24 + i_26 + i_28;
            }

            if (i_9 > 0) {
                i_8 += i_9;
                i_21 = 65536 - i_8 >> 8;
                i_22 = i_8 >> 8;
                if (i_6 != i_7) {
                    i_10 = i_6 * (65536 - i_8) + i_7 * i_8 >> 16;
                    i_11 = 256 - i_10;
                }

                if (i_4 != i_5) {
                    i_23 = ((i_4 & 0xff00ff) * i_21 + (i_5 & 0xff00ff) * i_22 & ~0xff00ff) + ((i_4 & 0xff00) * i_21 + (i_5 & 0xff00) * i_22 & 0xff0000) >>> 8;
                    i_12 = i_23 & 0xff0000;
                    i_13 = i_23 & 0xff00;
                    i_14 = i_23 & 0xff;
                    i_15 = i_12 * i_10 >> 8;
                    i_16 = i_13 * i_10 >> 8;
                    i_17 = i_14 * i_10 >> 8;
                }
            }

            i_19 += i_18;
        }

    }

    public static void staticMethod454(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
        int i_8 = 0;
        int i_9 = 65536 / i_3;
        int i_10 = i_6;
        int i_11 = 256 - i_6;
        if (i_0 < staticInt316) {
            i_2 -= staticInt316 - i_0;
            i_0 = staticInt316;
        }

        if (i_1 < staticInt311) {
            i_8 += (staticInt311 - i_1) * i_9;
            i_3 -= staticInt311 - i_1;
            i_1 = staticInt311;
        }

        if (i_0 + i_2 > staticInt314)
            i_2 = staticInt314 - i_0;

        if (i_1 + i_3 > staticInt315)
            i_3 = staticInt315 - i_1;

        int i_12 = i_4 & 0xff0000;
        int i_13 = i_4 & 0xff00;
        int i_14 = i_4 & 0xff;
        int i_15 = i_12 * i_6 >> 8;
        int i_16 = i_13 * i_6 >> 8;
        int i_17 = i_14 * i_6 >> 8;
        int i_18 = staticInt312 - i_2;
        int i_19 = i_0 + i_1 * staticInt312;

        for (int i_20 = 0; i_20 < i_3; i_20++) {
            int i_21;
            int i_22;
            int i_23;
            for (i_21 = -i_2; i_21 < 0; i_21++) {
                i_22 = staticIntArray130[i_19];
                i_23 = i_22 & 0xff0000;
                int i_24 = i_23 >= i_12 ? i_23 : i_11 == 0 ? i_12 : i_15 + (i_23 * i_11 >> 8) & 0xff0000;
                int i_25 = i_22 & 0xff00;
                int i_26 = i_25 >= i_13 ? i_25 : i_11 == 0 ? i_13 : i_16 + (i_25 * i_11 >> 8) & 0xff00;
                int i_27 = i_22 & 0xff;
                int i_28 = i_27 >= i_14 ? i_27 : i_11 == 0 ? i_14 : i_17 + (i_27 * i_11 >> 8);
                staticIntArray130[i_19++] = i_24 + i_26 + i_28;
            }

            if (i_9 > 0) {
                i_8 += i_9;
                i_21 = 65536 - i_8 >> 8;
                i_22 = i_8 >> 8;
                if (i_6 != i_7) {
                    i_10 = i_6 * (65536 - i_8) + i_7 * i_8 >> 16;
                    i_11 = 256 - i_10;
                }

                if (i_4 != i_5) {
                    i_23 = ((i_4 & 0xff00ff) * i_21 + (i_5 & 0xff00ff) * i_22 & ~0xff00ff) + ((i_4 & 0xff00) * i_21 + (i_5 & 0xff00) * i_22 & 0xff0000) >>> 8;
                    i_12 = i_23 & 0xff0000;
                    i_13 = i_23 & 0xff00;
                    i_14 = i_23 & 0xff;
                    i_15 = i_12 * i_10 >> 8;
                    i_16 = i_13 * i_10 >> 8;
                    i_17 = i_14 * i_10 >> 8;
                }
            }

            i_19 += i_18;
        }

    }

    public static void staticMethod455(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5) {
        int i_6 = 0;
        int i_7 = 65536 / i_3;
        if (i_0 < staticInt316) {
            i_2 -= staticInt316 - i_0;
            i_0 = staticInt316;
        }

        if (i_1 < staticInt311) {
            i_6 += (staticInt311 - i_1) * i_7;
            i_3 -= staticInt311 - i_1;
            i_1 = staticInt311;
        }

        if (i_0 + i_2 > staticInt314)
            i_2 = staticInt314 - i_0;

        if (i_1 + i_3 > staticInt315)
            i_3 = staticInt315 - i_1;

        int i_8 = staticInt312 - i_2;
        int i_9 = i_0 + i_1 * staticInt312;

        for (int i_10 = -i_3; i_10 < 0; i_10++) {
            int i_11 = 65536 - i_6 >> 8;
            int i_12 = i_6 >> 8;
            int i_13 = ((i_4 & 0xff00ff) * i_11 + (i_5 & 0xff00ff) * i_12 & ~0xff00ff) + ((i_4 & 0xff00) * i_11 + (i_5 & 0xff00) * i_12 & 0xff0000) >>> 8;

            for (int i_14 = -i_2; i_14 < 0; i_14++)
                staticIntArray130[i_9++] = i_13;

            i_9 += i_8;
            i_6 += i_7;
        }

    }

    public static void staticMethod456(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, byte[] bytes_6, int i_7, boolean bool_8) {
        if (i_0 + i_2 >= 0 && i_1 + i_3 >= 0)
            if (i_0 < staticInt312 && i_1 < staticInt313) {
                int i_9 = 0;
                int i_10 = 0;
                if (i_0 < 0) {
                    i_9 -= i_0;
                    i_2 += i_0;
                }

                if (i_1 < 0) {
                    i_10 -= i_1;
                    i_3 += i_1;
                }

                if (i_0 + i_2 > staticInt312)
                    i_2 = staticInt312 - i_0;

                if (i_1 + i_3 > staticInt313)
                    i_3 = staticInt313 - i_1;

                int i_11 = bytes_6.length / i_7;
                int i_12 = staticInt312 - i_2;
                int i_13 = i_4 >>> 24;
                int i_14 = i_5 >>> 24;
                int i_15;
                int i_16;
                int i_17;
                int i_18;
                int i_19;
                if (bool_8 && (i_13 != 255 || i_14 != 255)) {
                    i_15 = (i_1 + i_10) * staticInt312 + i_0 + i_9;

                    for (i_16 = i_1 + i_10; i_16 < i_1 + i_10 + i_3; i_16++) {
                        for (i_17 = i_0 + i_9; i_17 < i_0 + i_9 + i_2; i_17++) {
                            i_18 = (i_16 - i_1) % i_11;
                            i_19 = (i_17 - i_0) % i_7;
                            int i_20 = i_4;
                            if (bytes_6[i_18 * i_7 + i_19] != 0)
                                i_20 = i_5;

                            int i_21 = i_20 >>> 24;
                            int i_22 = 255 - i_21;
                            int i_23 = staticIntArray130[i_15];
                            int i_24 = ((i_20 & 0xff00ff) * i_21 + (i_23 & 0xff00ff) * i_22 & ~0xff00ff) + ((i_20 & 0xff00) * i_21 + (i_23 & 0xff00) * i_22 & 0xff0000) >> 8;
                            staticIntArray130[i_15++] = i_24;
                        }

                        i_15 += i_12;
                    }
                } else {
                    i_15 = (i_1 + i_10) * staticInt312 + i_0 + i_9;

                    for (i_16 = i_1 + i_10; i_16 < i_1 + i_10 + i_3; i_16++) {
                        for (i_17 = i_0 + i_9; i_17 < i_0 + i_9 + i_2; i_17++) {
                            i_18 = (i_16 - i_1) % i_11;
                            i_19 = (i_17 - i_0) % i_7;
                            if (bytes_6[i_18 * i_7 + i_19] != 0)
                                staticIntArray130[i_15++] = i_5;
                            else
                                staticIntArray130[i_15++] = i_4;
                        }

                        i_15 += i_12;
                    }
                }

            }
    }

    public static void staticMethod457(int i_0, int i_1, int i_2, int i_3, int i_4) {
        staticMethod459(i_0, i_1, i_2, i_4);
        staticMethod459(i_0, i_1 + i_3 - 1, i_2, i_4);
        staticMethod461(i_0, i_1, i_3, i_4);
        staticMethod461(i_0 + i_2 - 1, i_1, i_3, i_4);
    }

    public static void staticMethod458(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5) {
        staticMethod460(i_0, i_1, i_2, i_4, i_5);
        staticMethod460(i_0, i_1 + i_3 - 1, i_2, i_4, i_5);
        if (i_3 >= 3) {
            staticMethod462(i_0, i_1 + 1, i_3 - 2, i_4, i_5);
            staticMethod462(i_0 + i_2 - 1, i_1 + 1, i_3 - 2, i_4, i_5);
        }

    }

    public static void staticMethod459(int i_0, int i_1, int i_2, int i_3) {
        if (i_1 >= staticInt311 && i_1 < staticInt315) {
            if (i_0 < staticInt316) {
                i_2 -= staticInt316 - i_0;
                i_0 = staticInt316;
            }

            if (i_0 + i_2 > staticInt314)
                i_2 = staticInt314 - i_0;

            int i_4 = i_0 + i_1 * staticInt312;

            for (int i_5 = 0; i_5 < i_2; i_5++)
                staticIntArray130[i_4 + i_5] = i_3;

        }
    }

    static void staticMethod460(int i_0, int i_1, int i_2, int i_3, int i_4) {
        if (i_1 >= staticInt311 && i_1 < staticInt315) {
            if (i_0 < staticInt316) {
                i_2 -= staticInt316 - i_0;
                i_0 = staticInt316;
            }

            if (i_0 + i_2 > staticInt314)
                i_2 = staticInt314 - i_0;

            int i_5 = 256 - i_4;
            int i_6 = (i_3 >> 16 & 0xff) * i_4;
            int i_7 = (i_3 >> 8 & 0xff) * i_4;
            int i_8 = (i_3 & 0xff) * i_4;
            int i_12 = i_0 + i_1 * staticInt312;

            for (int i_13 = 0; i_13 < i_2; i_13++) {
                int i_9 = (staticIntArray130[i_12] >> 16 & 0xff) * i_5;
                int i_10 = (staticIntArray130[i_12] >> 8 & 0xff) * i_5;
                int i_11 = (staticIntArray130[i_12] & 0xff) * i_5;
                int i_14 = (i_6 + i_9 >> 8 << 16) + (i_7 + i_10 >> 8 << 8) + (i_8 + i_11 >> 8);
                staticIntArray130[i_12++] = i_14;
            }

        }
    }

    public static void staticMethod461(int i_0, int i_1, int i_2, int i_3) {
        if (i_0 >= staticInt316 && i_0 < staticInt314) {
            if (i_1 < staticInt311) {
                i_2 -= staticInt311 - i_1;
                i_1 = staticInt311;
            }

            if (i_1 + i_2 > staticInt315)
                i_2 = staticInt315 - i_1;

            int i_4 = i_0 + i_1 * staticInt312;

            for (int i_5 = 0; i_5 < i_2; i_5++)
                staticIntArray130[i_4 + i_5 * staticInt312] = i_3;

        }
    }

    static void staticMethod462(int i_0, int i_1, int i_2, int i_3, int i_4) {
        if (i_0 >= staticInt316 && i_0 < staticInt314) {
            if (i_1 < staticInt311) {
                i_2 -= staticInt311 - i_1;
                i_1 = staticInt311;
            }

            if (i_1 + i_2 > staticInt315)
                i_2 = staticInt315 - i_1;

            int i_5 = 256 - i_4;
            int i_6 = (i_3 >> 16 & 0xff) * i_4;
            int i_7 = (i_3 >> 8 & 0xff) * i_4;
            int i_8 = (i_3 & 0xff) * i_4;
            int i_12 = i_0 + i_1 * staticInt312;

            for (int i_13 = 0; i_13 < i_2; i_13++) {
                int i_9 = (staticIntArray130[i_12] >> 16 & 0xff) * i_5;
                int i_10 = (staticIntArray130[i_12] >> 8 & 0xff) * i_5;
                int i_11 = (staticIntArray130[i_12] & 0xff) * i_5;
                int i_14 = (i_6 + i_9 >> 8 << 16) + (i_7 + i_10 >> 8 << 8) + (i_8 + i_11 >> 8);
                staticIntArray130[i_12] = i_14;
                i_12 += staticInt312;
            }

        }
    }

    public static void staticMethod463(int i_0, int i_1, int i_2, int i_3, int i_4) {
        i_2 -= i_0;
        i_3 -= i_1;
        if (i_3 == 0) {
            if (i_2 >= 0)
                staticMethod459(i_0, i_1, i_2 + 1, i_4);
            else
                staticMethod459(i_0 + i_2, i_1, -i_2 + 1, i_4);

        } else if (i_2 == 0) {
            if (i_3 >= 0)
                staticMethod461(i_0, i_1, i_3 + 1, i_4);
            else
                staticMethod461(i_0, i_1 + i_3, -i_3 + 1, i_4);

        } else {
            if (i_2 + i_3 < 0) {
                i_0 += i_2;
                i_2 = -i_2;
                i_1 += i_3;
                i_3 = -i_3;
            }

            int i_5;
            int i_6;
            if (i_2 > i_3) {
                i_1 <<= 16;
                i_1 += 32768;
                i_3 <<= 16;
                i_5 = (int) Math.floor((double) i_3 / (double) i_2 + 0.5D);
                i_2 += i_0;
                if (i_0 < staticInt316) {
                    i_1 += i_5 * (staticInt316 - i_0);
                    i_0 = staticInt316;
                }

                if (i_2 >= staticInt314)
                    i_2 = staticInt314 - 1;

                while (i_0 <= i_2) {
                    i_6 = i_1 >> 16;
                    if (i_6 >= staticInt311 && i_6 < staticInt315)
                        staticIntArray130[i_0 + i_6 * staticInt312] = i_4;

                    i_1 += i_5;
                    ++i_0;
                }
            } else {
                i_0 <<= 16;
                i_0 += 32768;
                i_2 <<= 16;
                i_5 = (int) Math.floor((double) i_2 / (double) i_3 + 0.5D);
                i_3 += i_1;
                if (i_1 < staticInt311) {
                    i_0 += i_5 * (staticInt311 - i_1);
                    i_1 = staticInt311;
                }

                if (i_3 >= staticInt315)
                    i_3 = staticInt315 - 1;

                while (i_1 <= i_3) {
                    i_6 = i_0 >> 16;
                    if (i_6 >= staticInt316 && i_6 < staticInt314)
                        staticIntArray130[i_6 + i_1 * staticInt312] = i_4;

                    i_0 += i_5;
                    ++i_1;
                }
            }

        }
    }

    static void staticMethod464(int i_0, int i_1, int i_2) {
        if (i_0 >= staticInt316 && i_1 >= staticInt311 && i_0 < staticInt314 && i_1 < staticInt315)
            staticIntArray130[i_0 + i_1 * staticInt312] = i_2;
    }

    public static void staticMethod465(int i_0, int i_1, int i_2, int[] ints_3, int[] ints_4) {
        int i_5 = i_0 + i_1 * staticInt312;

        for (i_1 = 0; i_1 < ints_3.length; i_1++) {
            int i_6 = i_5 + ints_3[i_1];

            for (i_0 = -ints_4[i_1]; i_0 < 0; i_0++)
                staticIntArray130[i_6++] = i_2;

            i_5 += staticInt312;
        }

    }

}

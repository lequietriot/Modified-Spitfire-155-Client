public class Rasterizer3D extends Rasterizer2D {

    static boolean staticBool54 = false;
    static boolean staticBool55 = false;
    static boolean staticBool52 = false;
    public static boolean staticBool53 = true;
    static int staticInt333 = 0;
    public static int staticInt326 = 512;
    static int[] staticIntArray154 = new int[1024];
    public static int[] staticIntArray155 = new int[65536];
    static int[] staticIntArray157 = new int[512];
    static int[] staticIntArray158 = new int[2048];
    public static int[] staticIntArray156 = new int[2048];
    public static int[] staticIntArray159 = new int[2048];
    static int staticInt327;
    static int staticInt328;
    static int staticInt325;
    static int staticInt332;
    static int staticInt329;
    static int staticInt330;
    static int staticInt331;
    static int staticInt324;
    public static Interface2 staticInterface2_1;

    static {
        int i_0;
        for (i_0 = 1; i_0 < 512; i_0++)
            staticIntArray157[i_0] = 32768 / i_0;

        for (i_0 = 1; i_0 < 2048; i_0++)
            staticIntArray158[i_0] = 65536 / i_0;

        for (i_0 = 0; i_0 < 2048; i_0++) {
            staticIntArray156[i_0] = (int) (65536.0D * Math.sin(i_0 * 0.0030679615D));
            staticIntArray159[i_0] = (int) (65536.0D * Math.cos(i_0 * 0.0030679615D));
        }

    }

    Rasterizer3D() throws Throwable {
        throw new Error();
    }

    public static final void staticMethod470() {
        staticMethod471(staticInt316, staticInt311, staticInt314, staticInt315);
    }

    static final void staticMethod471(int i_0, int i_1, int i_2, int i_3) {
        staticInt327 = i_2 - i_0;
        staticInt328 = i_3 - i_1;
        staticMethod472();
        if (staticIntArray154.length < staticInt328)
            staticIntArray154 = new int[StaticClass25.staticMethod149(staticInt328)];

        int i_4 = i_1 * staticInt312 + i_0;

        for (int i_5 = 0; i_5 < staticInt328; i_5++) {
            staticIntArray154[i_5] = i_4;
            i_4 += staticInt312;
        }

    }

    public static final void staticMethod472() {
        staticInt325 = staticInt327 / 2;
        staticInt332 = staticInt328 / 2;
        staticInt329 = -staticInt325;
        staticInt330 = staticInt327 - staticInt325;
        staticInt331 = -staticInt332;
        staticInt324 = staticInt328 - staticInt332;
    }

    public static final void staticMethod473(int i_0, int i_1) {
        int i_2 = staticIntArray154[0];
        int i_3 = i_2 / staticInt312;
        int i_4 = i_2 - i_3 * staticInt312;
        staticInt325 = i_0 - i_4;
        staticInt332 = i_1 - i_3;
        staticInt329 = -staticInt325;
        staticInt330 = staticInt327 - staticInt325;
        staticInt331 = -staticInt332;
        staticInt324 = staticInt328 - staticInt332;
    }

    public static final void staticMethod474(Interface2 interface2_0) {
        staticInterface2_1 = interface2_0;
    }

    public static final void staticMethod475(double d_0) {
        staticMethod476(d_0, 0, 512);
    }

    static final void staticMethod476(double d_0, int i_2, int i_3) {
        int i_4 = i_2 * 128;

        for (int i_5 = i_2; i_5 < i_3; i_5++) {
            double d_6 = (i_5 >> 3) / 64.0D + 0.0078125D;
            double d_8 = (i_5 & 0x7) / 8.0D + 0.0625D;

            for (int i_10 = 0; i_10 < 128; i_10++) {
                double d_11 = i_10 / 128.0D;
                double d_13 = d_11;
                double d_15 = d_11;
                double d_17 = d_11;
                if (d_8 != 0.0D) {
                    double d_19;
                    if (d_11 < 0.5D)
                        d_19 = d_11 * (1.0D + d_8);
                    else
                        d_19 = d_11 + d_8 - d_11 * d_8;

                    double d_21 = 2.0D * d_11 - d_19;
                    double d_23 = d_6 + 0.3333333333333333D;
                    if (d_23 > 1.0D)
                        --d_23;

                    double d_27 = d_6 - 0.3333333333333333D;
                    if (d_27 < 0.0D)
                        ++d_27;

                    if (6.0D * d_23 < 1.0D)
                        d_13 = d_21 + (d_19 - d_21) * 6.0D * d_23;
                    else if (2.0D * d_23 < 1.0D)
                        d_13 = d_19;
                    else if (3.0D * d_23 < 2.0D)
                        d_13 = d_21 + (d_19 - d_21) * (0.6666666666666666D - d_23) * 6.0D;
                    else
                        d_13 = d_21;

                    if (6.0D * d_6 < 1.0D)
                        d_15 = d_21 + (d_19 - d_21) * 6.0D * d_6;
                    else if (2.0D * d_6 < 1.0D)
                        d_15 = d_19;
                    else if (3.0D * d_6 < 2.0D)
                        d_15 = d_21 + (d_19 - d_21) * (0.6666666666666666D - d_6) * 6.0D;
                    else
                        d_15 = d_21;

                    if (6.0D * d_27 < 1.0D)
                        d_17 = d_21 + (d_19 - d_21) * 6.0D * d_27;
                    else if (2.0D * d_27 < 1.0D)
                        d_17 = d_19;
                    else if (3.0D * d_27 < 2.0D)
                        d_17 = d_21 + (d_19 - d_21) * (0.6666666666666666D - d_27) * 6.0D;
                    else
                        d_17 = d_21;
                }

                int i_30 = (int) (d_13 * 256.0D);
                int i_20 = (int) (d_15 * 256.0D);
                int i_29 = (int) (d_17 * 256.0D);
                int i_22 = (i_30 << 16) + (i_20 << 8) + i_29;
                i_22 = staticMethod477(i_22, d_0);
                if (i_22 == 0)
                    i_22 = 1;

                staticIntArray155[i_4++] = i_22;
            }
        }

    }

    static int staticMethod477(int i_0, double d_1) {
        double d_3 = (i_0 >> 16) / 256.0D;
        double d_5 = (i_0 >> 8 & 0xff) / 256.0D;
        double d_7 = (i_0 & 0xff) / 256.0D;
        d_3 = Math.pow(d_3, d_1);
        d_5 = Math.pow(d_5, d_1);
        d_7 = Math.pow(d_7, d_1);
        int i_9 = (int) (d_3 * 256.0D);
        int i_10 = (int) (d_5 * 256.0D);
        int i_11 = (int) (d_7 * 256.0D);
        return (i_9 << 16) + (i_10 << 8) + i_11;
    }

    public static void staticMethod478(int i_0, int i_1, int i_2) {
        staticBool54 = i_0 < 0 || i_0 > staticInt327 || i_1 < 0 || i_1 > staticInt327 || i_2 < 0 || i_2 > staticInt327;
    }

    static final void staticMethod479(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
        int i_9 = i_4 - i_3;
        int i_10 = i_1 - i_0;
        int i_11 = i_5 - i_3;
        int i_12 = i_2 - i_0;
        int i_13 = i_7 - i_6;
        int i_14 = i_8 - i_6;
        int i_15;
        if (i_2 != i_1)
            i_15 = (i_5 - i_4 << 14) / (i_2 - i_1);
        else
            i_15 = 0;

        int i_16;
        if (i_1 != i_0)
            i_16 = (i_9 << 14) / i_10;
        else
            i_16 = 0;

        int i_17;
        if (i_2 != i_0)
            i_17 = (i_11 << 14) / i_12;
        else
            i_17 = 0;

        int i_18 = i_9 * i_12 - i_11 * i_10;
        if (i_18 != 0) {
            int i_19 = (i_13 * i_12 - i_14 * i_10 << 8) / i_18;
            int i_20 = (i_14 * i_9 - i_13 * i_11 << 8) / i_18;
            if (i_0 <= i_1 && i_0 <= i_2) {
                if (i_0 < staticInt328) {
                    if (i_1 > staticInt328)
                        i_1 = staticInt328;

                    if (i_2 > staticInt328)
                        i_2 = staticInt328;

                    i_6 = (i_6 << 8) - i_19 * i_3 + i_19;
                    if (i_1 < i_2) {
                        i_5 = i_3 <<= 14;
                        if (i_0 < 0) {
                            i_5 -= i_17 * i_0;
                            i_3 -= i_16 * i_0;
                            i_6 -= i_20 * i_0;
                            i_0 = 0;
                        }

                        i_4 <<= 14;
                        if (i_1 < 0) {
                            i_4 -= i_15 * i_1;
                            i_1 = 0;
                        }

                        if ((i_0 == i_1 || i_17 >= i_16) && (i_0 != i_1 || i_17 <= i_15)) {
                            i_2 -= i_1;
                            i_1 -= i_0;
                            i_0 = staticIntArray154[i_0];

                            while (true) {
                                --i_1;
                                if (i_1 < 0)
                                    while (true) {
                                        --i_2;
                                        if (i_2 < 0)
                                            return;

                                        staticMethod480(staticIntArray130, i_0, 0, 0, i_4 >> 14, i_5 >> 14, i_6, i_19);
                                        i_5 += i_17;
                                        i_4 += i_15;
                                        i_6 += i_20;
                                        i_0 += staticInt312;
                                    }

                                staticMethod480(staticIntArray130, i_0, 0, 0, i_3 >> 14, i_5 >> 14, i_6, i_19);
                                i_5 += i_17;
                                i_3 += i_16;
                                i_6 += i_20;
                                i_0 += staticInt312;
                            }
                        } else {
                            i_2 -= i_1;
                            i_1 -= i_0;
                            i_0 = staticIntArray154[i_0];

                            while (true) {
                                --i_1;
                                if (i_1 < 0)
                                    while (true) {
                                        --i_2;
                                        if (i_2 < 0)
                                            return;

                                        staticMethod480(staticIntArray130, i_0, 0, 0, i_5 >> 14, i_4 >> 14, i_6, i_19);
                                        i_5 += i_17;
                                        i_4 += i_15;
                                        i_6 += i_20;
                                        i_0 += staticInt312;
                                    }

                                staticMethod480(staticIntArray130, i_0, 0, 0, i_5 >> 14, i_3 >> 14, i_6, i_19);
                                i_5 += i_17;
                                i_3 += i_16;
                                i_6 += i_20;
                                i_0 += staticInt312;
                            }
                        }
                    } else {
                        i_4 = i_3 <<= 14;
                        if (i_0 < 0) {
                            i_4 -= i_17 * i_0;
                            i_3 -= i_16 * i_0;
                            i_6 -= i_20 * i_0;
                            i_0 = 0;
                        }

                        i_5 <<= 14;
                        if (i_2 < 0) {
                            i_5 -= i_15 * i_2;
                            i_2 = 0;
                        }

                        if (i_0 != i_2 && i_17 < i_16 || i_0 == i_2 && i_15 > i_16) {
                            i_1 -= i_2;
                            i_2 -= i_0;
                            i_0 = staticIntArray154[i_0];

                            while (true) {
                                --i_2;
                                if (i_2 < 0)
                                    while (true) {
                                        --i_1;
                                        if (i_1 < 0)
                                            return;

                                        staticMethod480(staticIntArray130, i_0, 0, 0, i_5 >> 14, i_3 >> 14, i_6, i_19);
                                        i_5 += i_15;
                                        i_3 += i_16;
                                        i_6 += i_20;
                                        i_0 += staticInt312;
                                    }

                                staticMethod480(staticIntArray130, i_0, 0, 0, i_4 >> 14, i_3 >> 14, i_6, i_19);
                                i_4 += i_17;
                                i_3 += i_16;
                                i_6 += i_20;
                                i_0 += staticInt312;
                            }
                        } else {
                            i_1 -= i_2;
                            i_2 -= i_0;
                            i_0 = staticIntArray154[i_0];

                            while (true) {
                                --i_2;
                                if (i_2 < 0)
                                    while (true) {
                                        --i_1;
                                        if (i_1 < 0)
                                            return;

                                        staticMethod480(staticIntArray130, i_0, 0, 0, i_3 >> 14, i_5 >> 14, i_6, i_19);
                                        i_5 += i_15;
                                        i_3 += i_16;
                                        i_6 += i_20;
                                        i_0 += staticInt312;
                                    }

                                staticMethod480(staticIntArray130, i_0, 0, 0, i_3 >> 14, i_4 >> 14, i_6, i_19);
                                i_4 += i_17;
                                i_3 += i_16;
                                i_6 += i_20;
                                i_0 += staticInt312;
                            }
                        }
                    }
                }
            } else if (i_1 <= i_2) {
                if (i_1 < staticInt328) {
                    if (i_2 > staticInt328)
                        i_2 = staticInt328;

                    if (i_0 > staticInt328)
                        i_0 = staticInt328;

                    i_7 = (i_7 << 8) - i_19 * i_4 + i_19;
                    if (i_2 < i_0) {
                        i_3 = i_4 <<= 14;
                        if (i_1 < 0) {
                            i_3 -= i_16 * i_1;
                            i_4 -= i_15 * i_1;
                            i_7 -= i_20 * i_1;
                            i_1 = 0;
                        }

                        i_5 <<= 14;
                        if (i_2 < 0) {
                            i_5 -= i_17 * i_2;
                            i_2 = 0;
                        }

                        if ((i_1 == i_2 || i_16 >= i_15) && (i_1 != i_2 || i_16 <= i_17)) {
                            i_0 -= i_2;
                            i_2 -= i_1;
                            i_1 = staticIntArray154[i_1];

                            while (true) {
                                --i_2;
                                if (i_2 < 0)
                                    while (true) {
                                        --i_0;
                                        if (i_0 < 0)
                                            return;

                                        staticMethod480(staticIntArray130, i_1, 0, 0, i_5 >> 14, i_3 >> 14, i_7, i_19);
                                        i_3 += i_16;
                                        i_5 += i_17;
                                        i_7 += i_20;
                                        i_1 += staticInt312;
                                    }

                                staticMethod480(staticIntArray130, i_1, 0, 0, i_4 >> 14, i_3 >> 14, i_7, i_19);
                                i_3 += i_16;
                                i_4 += i_15;
                                i_7 += i_20;
                                i_1 += staticInt312;
                            }
                        } else {
                            i_0 -= i_2;
                            i_2 -= i_1;
                            i_1 = staticIntArray154[i_1];

                            while (true) {
                                --i_2;
                                if (i_2 < 0)
                                    while (true) {
                                        --i_0;
                                        if (i_0 < 0)
                                            return;

                                        staticMethod480(staticIntArray130, i_1, 0, 0, i_3 >> 14, i_5 >> 14, i_7, i_19);
                                        i_3 += i_16;
                                        i_5 += i_17;
                                        i_7 += i_20;
                                        i_1 += staticInt312;
                                    }

                                staticMethod480(staticIntArray130, i_1, 0, 0, i_3 >> 14, i_4 >> 14, i_7, i_19);
                                i_3 += i_16;
                                i_4 += i_15;
                                i_7 += i_20;
                                i_1 += staticInt312;
                            }
                        }
                    } else {
                        i_5 = i_4 <<= 14;
                        if (i_1 < 0) {
                            i_5 -= i_16 * i_1;
                            i_4 -= i_15 * i_1;
                            i_7 -= i_20 * i_1;
                            i_1 = 0;
                        }

                        i_3 <<= 14;
                        if (i_0 < 0) {
                            i_3 -= i_17 * i_0;
                            i_0 = 0;
                        }

                        if (i_16 < i_15) {
                            i_2 -= i_0;
                            i_0 -= i_1;
                            i_1 = staticIntArray154[i_1];

                            while (true) {
                                --i_0;
                                if (i_0 < 0)
                                    while (true) {
                                        --i_2;
                                        if (i_2 < 0)
                                            return;

                                        staticMethod480(staticIntArray130, i_1, 0, 0, i_3 >> 14, i_4 >> 14, i_7, i_19);
                                        i_3 += i_17;
                                        i_4 += i_15;
                                        i_7 += i_20;
                                        i_1 += staticInt312;
                                    }

                                staticMethod480(staticIntArray130, i_1, 0, 0, i_5 >> 14, i_4 >> 14, i_7, i_19);
                                i_5 += i_16;
                                i_4 += i_15;
                                i_7 += i_20;
                                i_1 += staticInt312;
                            }
                        } else {
                            i_2 -= i_0;
                            i_0 -= i_1;
                            i_1 = staticIntArray154[i_1];

                            while (true) {
                                --i_0;
                                if (i_0 < 0)
                                    while (true) {
                                        --i_2;
                                        if (i_2 < 0)
                                            return;

                                        staticMethod480(staticIntArray130, i_1, 0, 0, i_4 >> 14, i_3 >> 14, i_7, i_19);
                                        i_3 += i_17;
                                        i_4 += i_15;
                                        i_7 += i_20;
                                        i_1 += staticInt312;
                                    }

                                staticMethod480(staticIntArray130, i_1, 0, 0, i_4 >> 14, i_5 >> 14, i_7, i_19);
                                i_5 += i_16;
                                i_4 += i_15;
                                i_7 += i_20;
                                i_1 += staticInt312;
                            }
                        }
                    }
                }
            } else if (i_2 < staticInt328) {
                if (i_0 > staticInt328)
                    i_0 = staticInt328;

                if (i_1 > staticInt328)
                    i_1 = staticInt328;

                i_8 = (i_8 << 8) - i_19 * i_5 + i_19;
                if (i_0 < i_1) {
                    i_4 = i_5 <<= 14;
                    if (i_2 < 0) {
                        i_4 -= i_15 * i_2;
                        i_5 -= i_17 * i_2;
                        i_8 -= i_20 * i_2;
                        i_2 = 0;
                    }

                    i_3 <<= 14;
                    if (i_0 < 0) {
                        i_3 -= i_16 * i_0;
                        i_0 = 0;
                    }

                    if (i_15 < i_17) {
                        i_1 -= i_0;
                        i_0 -= i_2;
                        i_2 = staticIntArray154[i_2];

                        while (true) {
                            --i_0;
                            if (i_0 < 0)
                                while (true) {
                                    --i_1;
                                    if (i_1 < 0)
                                        return;

                                    staticMethod480(staticIntArray130, i_2, 0, 0, i_4 >> 14, i_3 >> 14, i_8, i_19);
                                    i_4 += i_15;
                                    i_3 += i_16;
                                    i_8 += i_20;
                                    i_2 += staticInt312;
                                }

                            staticMethod480(staticIntArray130, i_2, 0, 0, i_4 >> 14, i_5 >> 14, i_8, i_19);
                            i_4 += i_15;
                            i_5 += i_17;
                            i_8 += i_20;
                            i_2 += staticInt312;
                        }
                    } else {
                        i_1 -= i_0;
                        i_0 -= i_2;
                        i_2 = staticIntArray154[i_2];

                        while (true) {
                            --i_0;
                            if (i_0 < 0)
                                while (true) {
                                    --i_1;
                                    if (i_1 < 0)
                                        return;

                                    staticMethod480(staticIntArray130, i_2, 0, 0, i_3 >> 14, i_4 >> 14, i_8, i_19);
                                    i_4 += i_15;
                                    i_3 += i_16;
                                    i_8 += i_20;
                                    i_2 += staticInt312;
                                }

                            staticMethod480(staticIntArray130, i_2, 0, 0, i_5 >> 14, i_4 >> 14, i_8, i_19);
                            i_4 += i_15;
                            i_5 += i_17;
                            i_8 += i_20;
                            i_2 += staticInt312;
                        }
                    }
                } else {
                    i_3 = i_5 <<= 14;
                    if (i_2 < 0) {
                        i_3 -= i_15 * i_2;
                        i_5 -= i_17 * i_2;
                        i_8 -= i_20 * i_2;
                        i_2 = 0;
                    }

                    i_4 <<= 14;
                    if (i_1 < 0) {
                        i_4 -= i_16 * i_1;
                        i_1 = 0;
                    }

                    if (i_15 < i_17) {
                        i_0 -= i_1;
                        i_1 -= i_2;
                        i_2 = staticIntArray154[i_2];

                        while (true) {
                            --i_1;
                            if (i_1 < 0)
                                while (true) {
                                    --i_0;
                                    if (i_0 < 0)
                                        return;

                                    staticMethod480(staticIntArray130, i_2, 0, 0, i_4 >> 14, i_5 >> 14, i_8, i_19);
                                    i_4 += i_16;
                                    i_5 += i_17;
                                    i_8 += i_20;
                                    i_2 += staticInt312;
                                }

                            staticMethod480(staticIntArray130, i_2, 0, 0, i_3 >> 14, i_5 >> 14, i_8, i_19);
                            i_3 += i_15;
                            i_5 += i_17;
                            i_8 += i_20;
                            i_2 += staticInt312;
                        }
                    } else {
                        i_0 -= i_1;
                        i_1 -= i_2;
                        i_2 = staticIntArray154[i_2];

                        while (true) {
                            --i_1;
                            if (i_1 < 0)
                                while (true) {
                                    --i_0;
                                    if (i_0 < 0)
                                        return;

                                    staticMethod480(staticIntArray130, i_2, 0, 0, i_5 >> 14, i_4 >> 14, i_8, i_19);
                                    i_4 += i_16;
                                    i_5 += i_17;
                                    i_8 += i_20;
                                    i_2 += staticInt312;
                                }

                            staticMethod480(staticIntArray130, i_2, 0, 0, i_5 >> 14, i_3 >> 14, i_8, i_19);
                            i_3 += i_15;
                            i_5 += i_17;
                            i_8 += i_20;
                            i_2 += staticInt312;
                        }
                    }
                }
            }
        }
    }

    static final void staticMethod480(int[] ints_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
        if (staticBool54) {
            if (i_5 > staticInt327)
                i_5 = staticInt327;

            if (i_4 < 0)
                i_4 = 0;
        }

        if (i_4 < i_5) {
            i_1 += i_4;
            i_6 += i_7 * i_4;
            int i_8;
            int i_9;
            int i_10;
            if (staticBool53) {
                i_3 = i_5 - i_4 >> 2;
                i_7 <<= 2;
                if (staticInt333 == 0) {
                    if (i_3 > 0)
                        do {
                            i_2 = staticIntArray155[i_6 >> 8];
                            i_6 += i_7;
                            ints_0[i_1++] = i_2;
                            ints_0[i_1++] = i_2;
                            ints_0[i_1++] = i_2;
                            ints_0[i_1++] = i_2;
                            --i_3;
                        } while (i_3 > 0);

                    i_3 = i_5 - i_4 & 0x3;
                    if (i_3 > 0) {
                        i_2 = staticIntArray155[i_6 >> 8];

                        do {
                            ints_0[i_1++] = i_2;
                            --i_3;
                        } while (i_3 > 0);
                    }
                } else {
                    i_8 = staticInt333;
                    i_9 = 256 - staticInt333;
                    if (i_3 > 0)
                        do {
                            i_2 = staticIntArray155[i_6 >> 8];
                            i_6 += i_7;
                            i_2 = ((i_2 & 0xff00ff) * i_9 >> 8 & 0xff00ff) + ((i_2 & 0xff00) * i_9 >> 8 & 0xff00);
                            i_10 = ints_0[i_1];
                            ints_0[i_1++] = i_2 + ((i_10 & 0xff00ff) * i_8 >> 8 & 0xff00ff) + ((i_10 & 0xff00) * i_8 >> 8 & 0xff00);
                            i_10 = ints_0[i_1];
                            ints_0[i_1++] = i_2 + ((i_10 & 0xff00ff) * i_8 >> 8 & 0xff00ff) + ((i_10 & 0xff00) * i_8 >> 8 & 0xff00);
                            i_10 = ints_0[i_1];
                            ints_0[i_1++] = i_2 + ((i_10 & 0xff00ff) * i_8 >> 8 & 0xff00ff) + ((i_10 & 0xff00) * i_8 >> 8 & 0xff00);
                            i_10 = ints_0[i_1];
                            ints_0[i_1++] = i_2 + ((i_10 & 0xff00ff) * i_8 >> 8 & 0xff00ff) + ((i_10 & 0xff00) * i_8 >> 8 & 0xff00);
                            --i_3;
                        } while (i_3 > 0);

                    i_3 = i_5 - i_4 & 0x3;
                    if (i_3 > 0) {
                        i_2 = staticIntArray155[i_6 >> 8];
                        i_2 = ((i_2 & 0xff00ff) * i_9 >> 8 & 0xff00ff) + ((i_2 & 0xff00) * i_9 >> 8 & 0xff00);

                        do {
                            i_10 = ints_0[i_1];
                            ints_0[i_1++] = i_2 + ((i_10 & 0xff00ff) * i_8 >> 8 & 0xff00ff) + ((i_10 & 0xff00) * i_8 >> 8 & 0xff00);
                            --i_3;
                        } while (i_3 > 0);
                    }
                }

            } else {
                i_3 = i_5 - i_4;
                if (staticInt333 == 0)
                    do {
                        ints_0[i_1++] = staticIntArray155[i_6 >> 8];
                        i_6 += i_7;
                        --i_3;
                    } while (i_3 > 0);
                else {
                    i_8 = staticInt333;
                    i_9 = 256 - staticInt333;

                    do {
                        i_2 = staticIntArray155[i_6 >> 8];
                        i_6 += i_7;
                        i_2 = ((i_2 & 0xff00ff) * i_9 >> 8 & 0xff00ff) + ((i_2 & 0xff00) * i_9 >> 8 & 0xff00);
                        i_10 = ints_0[i_1];
                        ints_0[i_1++] = i_2 + ((i_10 & 0xff00ff) * i_8 >> 8 & 0xff00ff) + ((i_10 & 0xff00) * i_8 >> 8 & 0xff00);
                        --i_3;
                    } while (i_3 > 0);
                }

            }
        }
    }

    public static final void staticMethod481(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        int i_7 = 0;
        if (i_1 != i_0)
            i_7 = (i_4 - i_3 << 14) / (i_1 - i_0);

        int i_8 = 0;
        if (i_2 != i_1)
            i_8 = (i_5 - i_4 << 14) / (i_2 - i_1);

        int i_9 = 0;
        if (i_2 != i_0)
            i_9 = (i_3 - i_5 << 14) / (i_0 - i_2);

        if (i_0 <= i_1 && i_0 <= i_2) {
            if (i_0 < staticInt328) {
                if (i_1 > staticInt328)
                    i_1 = staticInt328;

                if (i_2 > staticInt328)
                    i_2 = staticInt328;

                if (i_1 < i_2) {
                    i_5 = i_3 <<= 14;
                    if (i_0 < 0) {
                        i_5 -= i_9 * i_0;
                        i_3 -= i_7 * i_0;
                        i_0 = 0;
                    }

                    i_4 <<= 14;
                    if (i_1 < 0) {
                        i_4 -= i_8 * i_1;
                        i_1 = 0;
                    }

                    if (i_0 != i_1 && i_9 < i_7 || i_0 == i_1 && i_9 > i_8) {
                        i_2 -= i_1;
                        i_1 -= i_0;
                        i_0 = staticIntArray154[i_0];

                        while (true) {
                            --i_1;
                            if (i_1 < 0)
                                while (true) {
                                    --i_2;
                                    if (i_2 < 0)
                                        return;

                                    staticMethod482(staticIntArray130, i_0, i_6, 0, i_5 >> 14, i_4 >> 14);
                                    i_5 += i_9;
                                    i_4 += i_8;
                                    i_0 += staticInt312;
                                }

                            staticMethod482(staticIntArray130, i_0, i_6, 0, i_5 >> 14, i_3 >> 14);
                            i_5 += i_9;
                            i_3 += i_7;
                            i_0 += staticInt312;
                        }
                    } else {
                        i_2 -= i_1;
                        i_1 -= i_0;
                        i_0 = staticIntArray154[i_0];

                        while (true) {
                            --i_1;
                            if (i_1 < 0)
                                while (true) {
                                    --i_2;
                                    if (i_2 < 0)
                                        return;

                                    staticMethod482(staticIntArray130, i_0, i_6, 0, i_4 >> 14, i_5 >> 14);
                                    i_5 += i_9;
                                    i_4 += i_8;
                                    i_0 += staticInt312;
                                }

                            staticMethod482(staticIntArray130, i_0, i_6, 0, i_3 >> 14, i_5 >> 14);
                            i_5 += i_9;
                            i_3 += i_7;
                            i_0 += staticInt312;
                        }
                    }
                } else {
                    i_4 = i_3 <<= 14;
                    if (i_0 < 0) {
                        i_4 -= i_9 * i_0;
                        i_3 -= i_7 * i_0;
                        i_0 = 0;
                    }

                    i_5 <<= 14;
                    if (i_2 < 0) {
                        i_5 -= i_8 * i_2;
                        i_2 = 0;
                    }

                    if (i_0 != i_2 && i_9 < i_7 || i_0 == i_2 && i_8 > i_7) {
                        i_1 -= i_2;
                        i_2 -= i_0;
                        i_0 = staticIntArray154[i_0];

                        while (true) {
                            --i_2;
                            if (i_2 < 0)
                                while (true) {
                                    --i_1;
                                    if (i_1 < 0)
                                        return;

                                    staticMethod482(staticIntArray130, i_0, i_6, 0, i_5 >> 14, i_3 >> 14);
                                    i_5 += i_8;
                                    i_3 += i_7;
                                    i_0 += staticInt312;
                                }

                            staticMethod482(staticIntArray130, i_0, i_6, 0, i_4 >> 14, i_3 >> 14);
                            i_4 += i_9;
                            i_3 += i_7;
                            i_0 += staticInt312;
                        }
                    } else {
                        i_1 -= i_2;
                        i_2 -= i_0;
                        i_0 = staticIntArray154[i_0];

                        while (true) {
                            --i_2;
                            if (i_2 < 0)
                                while (true) {
                                    --i_1;
                                    if (i_1 < 0)
                                        return;

                                    staticMethod482(staticIntArray130, i_0, i_6, 0, i_3 >> 14, i_5 >> 14);
                                    i_5 += i_8;
                                    i_3 += i_7;
                                    i_0 += staticInt312;
                                }

                            staticMethod482(staticIntArray130, i_0, i_6, 0, i_3 >> 14, i_4 >> 14);
                            i_4 += i_9;
                            i_3 += i_7;
                            i_0 += staticInt312;
                        }
                    }
                }
            }
        } else if (i_1 <= i_2) {
            if (i_1 < staticInt328) {
                if (i_2 > staticInt328)
                    i_2 = staticInt328;

                if (i_0 > staticInt328)
                    i_0 = staticInt328;

                if (i_2 < i_0) {
                    i_3 = i_4 <<= 14;
                    if (i_1 < 0) {
                        i_3 -= i_7 * i_1;
                        i_4 -= i_8 * i_1;
                        i_1 = 0;
                    }

                    i_5 <<= 14;
                    if (i_2 < 0) {
                        i_5 -= i_9 * i_2;
                        i_2 = 0;
                    }

                    if (i_1 != i_2 && i_7 < i_8 || i_1 == i_2 && i_7 > i_9) {
                        i_0 -= i_2;
                        i_2 -= i_1;
                        i_1 = staticIntArray154[i_1];

                        while (true) {
                            --i_2;
                            if (i_2 < 0)
                                while (true) {
                                    --i_0;
                                    if (i_0 < 0)
                                        return;

                                    staticMethod482(staticIntArray130, i_1, i_6, 0, i_3 >> 14, i_5 >> 14);
                                    i_3 += i_7;
                                    i_5 += i_9;
                                    i_1 += staticInt312;
                                }

                            staticMethod482(staticIntArray130, i_1, i_6, 0, i_3 >> 14, i_4 >> 14);
                            i_3 += i_7;
                            i_4 += i_8;
                            i_1 += staticInt312;
                        }
                    } else {
                        i_0 -= i_2;
                        i_2 -= i_1;
                        i_1 = staticIntArray154[i_1];

                        while (true) {
                            --i_2;
                            if (i_2 < 0)
                                while (true) {
                                    --i_0;
                                    if (i_0 < 0)
                                        return;

                                    staticMethod482(staticIntArray130, i_1, i_6, 0, i_5 >> 14, i_3 >> 14);
                                    i_3 += i_7;
                                    i_5 += i_9;
                                    i_1 += staticInt312;
                                }

                            staticMethod482(staticIntArray130, i_1, i_6, 0, i_4 >> 14, i_3 >> 14);
                            i_3 += i_7;
                            i_4 += i_8;
                            i_1 += staticInt312;
                        }
                    }
                } else {
                    i_5 = i_4 <<= 14;
                    if (i_1 < 0) {
                        i_5 -= i_7 * i_1;
                        i_4 -= i_8 * i_1;
                        i_1 = 0;
                    }

                    i_3 <<= 14;
                    if (i_0 < 0) {
                        i_3 -= i_9 * i_0;
                        i_0 = 0;
                    }

                    if (i_7 < i_8) {
                        i_2 -= i_0;
                        i_0 -= i_1;
                        i_1 = staticIntArray154[i_1];

                        while (true) {
                            --i_0;
                            if (i_0 < 0)
                                while (true) {
                                    --i_2;
                                    if (i_2 < 0)
                                        return;

                                    staticMethod482(staticIntArray130, i_1, i_6, 0, i_3 >> 14, i_4 >> 14);
                                    i_3 += i_9;
                                    i_4 += i_8;
                                    i_1 += staticInt312;
                                }

                            staticMethod482(staticIntArray130, i_1, i_6, 0, i_5 >> 14, i_4 >> 14);
                            i_5 += i_7;
                            i_4 += i_8;
                            i_1 += staticInt312;
                        }
                    } else {
                        i_2 -= i_0;
                        i_0 -= i_1;
                        i_1 = staticIntArray154[i_1];

                        while (true) {
                            --i_0;
                            if (i_0 < 0)
                                while (true) {
                                    --i_2;
                                    if (i_2 < 0)
                                        return;

                                    staticMethod482(staticIntArray130, i_1, i_6, 0, i_4 >> 14, i_3 >> 14);
                                    i_3 += i_9;
                                    i_4 += i_8;
                                    i_1 += staticInt312;
                                }

                            staticMethod482(staticIntArray130, i_1, i_6, 0, i_4 >> 14, i_5 >> 14);
                            i_5 += i_7;
                            i_4 += i_8;
                            i_1 += staticInt312;
                        }
                    }
                }
            }
        } else if (i_2 < staticInt328) {
            if (i_0 > staticInt328)
                i_0 = staticInt328;

            if (i_1 > staticInt328)
                i_1 = staticInt328;

            if (i_0 < i_1) {
                i_4 = i_5 <<= 14;
                if (i_2 < 0) {
                    i_4 -= i_8 * i_2;
                    i_5 -= i_9 * i_2;
                    i_2 = 0;
                }

                i_3 <<= 14;
                if (i_0 < 0) {
                    i_3 -= i_7 * i_0;
                    i_0 = 0;
                }

                if (i_8 < i_9) {
                    i_1 -= i_0;
                    i_0 -= i_2;
                    i_2 = staticIntArray154[i_2];

                    while (true) {
                        --i_0;
                        if (i_0 < 0)
                            while (true) {
                                --i_1;
                                if (i_1 < 0)
                                    return;

                                staticMethod482(staticIntArray130, i_2, i_6, 0, i_4 >> 14, i_3 >> 14);
                                i_4 += i_8;
                                i_3 += i_7;
                                i_2 += staticInt312;
                            }

                        staticMethod482(staticIntArray130, i_2, i_6, 0, i_4 >> 14, i_5 >> 14);
                        i_4 += i_8;
                        i_5 += i_9;
                        i_2 += staticInt312;
                    }
                } else {
                    i_1 -= i_0;
                    i_0 -= i_2;
                    i_2 = staticIntArray154[i_2];

                    while (true) {
                        --i_0;
                        if (i_0 < 0)
                            while (true) {
                                --i_1;
                                if (i_1 < 0)
                                    return;

                                staticMethod482(staticIntArray130, i_2, i_6, 0, i_3 >> 14, i_4 >> 14);
                                i_4 += i_8;
                                i_3 += i_7;
                                i_2 += staticInt312;
                            }

                        staticMethod482(staticIntArray130, i_2, i_6, 0, i_5 >> 14, i_4 >> 14);
                        i_4 += i_8;
                        i_5 += i_9;
                        i_2 += staticInt312;
                    }
                }
            } else {
                i_3 = i_5 <<= 14;
                if (i_2 < 0) {
                    i_3 -= i_8 * i_2;
                    i_5 -= i_9 * i_2;
                    i_2 = 0;
                }

                i_4 <<= 14;
                if (i_1 < 0) {
                    i_4 -= i_7 * i_1;
                    i_1 = 0;
                }

                if (i_8 < i_9) {
                    i_0 -= i_1;
                    i_1 -= i_2;
                    i_2 = staticIntArray154[i_2];

                    while (true) {
                        --i_1;
                        if (i_1 < 0)
                            while (true) {
                                --i_0;
                                if (i_0 < 0)
                                    return;

                                staticMethod482(staticIntArray130, i_2, i_6, 0, i_4 >> 14, i_5 >> 14);
                                i_4 += i_7;
                                i_5 += i_9;
                                i_2 += staticInt312;
                            }

                        staticMethod482(staticIntArray130, i_2, i_6, 0, i_3 >> 14, i_5 >> 14);
                        i_3 += i_8;
                        i_5 += i_9;
                        i_2 += staticInt312;
                    }
                } else {
                    i_0 -= i_1;
                    i_1 -= i_2;
                    i_2 = staticIntArray154[i_2];

                    while (true) {
                        --i_1;
                        if (i_1 < 0)
                            while (true) {
                                --i_0;
                                if (i_0 < 0)
                                    return;

                                staticMethod482(staticIntArray130, i_2, i_6, 0, i_5 >> 14, i_4 >> 14);
                                i_4 += i_7;
                                i_5 += i_9;
                                i_2 += staticInt312;
                            }

                        staticMethod482(staticIntArray130, i_2, i_6, 0, i_5 >> 14, i_3 >> 14);
                        i_3 += i_8;
                        i_5 += i_9;
                        i_2 += staticInt312;
                    }
                }
            }
        }
    }

    static final void staticMethod482(int[] ints_0, int i_1, int i_2, int i_3, int i_4, int i_5) {
        if (staticBool54) {
            if (i_5 > staticInt327)
                i_5 = staticInt327;

            if (i_4 < 0)
                i_4 = 0;
        }

        if (i_4 < i_5) {
            i_1 += i_4;
            i_3 = i_5 - i_4 >> 2;
            if (staticInt333 != 0) {
                if (staticInt333 == 254)
                    while (true) {
                        --i_3;
                        if (i_3 < 0) {
                            i_3 = i_5 - i_4 & 0x3;

                            while (true) {
                                --i_3;
                                if (i_3 < 0)
                                    return;

                                ints_0[i_1++] = ints_0[i_1];
                            }
                        }

                        ints_0[i_1++] = ints_0[i_1];
                        ints_0[i_1++] = ints_0[i_1];
                        ints_0[i_1++] = ints_0[i_1];
                        ints_0[i_1++] = ints_0[i_1];
                    }
                else {
                    int i_6 = staticInt333;
                    int i_7 = 256 - staticInt333;
                    i_2 = ((i_2 & 0xff00ff) * i_7 >> 8 & 0xff00ff) + ((i_2 & 0xff00) * i_7 >> 8 & 0xff00);

                    while (true) {
                        --i_3;
                        int i_8;
                        if (i_3 < 0) {
                            i_3 = i_5 - i_4 & 0x3;

                            while (true) {
                                --i_3;
                                if (i_3 < 0)
                                    return;

                                i_8 = ints_0[i_1];
                                ints_0[i_1++] = i_2 + ((i_8 & 0xff00ff) * i_6 >> 8 & 0xff00ff) + ((i_8 & 0xff00) * i_6 >> 8 & 0xff00);
                            }
                        }

                        i_8 = ints_0[i_1];
                        ints_0[i_1++] = i_2 + ((i_8 & 0xff00ff) * i_6 >> 8 & 0xff00ff) + ((i_8 & 0xff00) * i_6 >> 8 & 0xff00);
                        i_8 = ints_0[i_1];
                        ints_0[i_1++] = i_2 + ((i_8 & 0xff00ff) * i_6 >> 8 & 0xff00ff) + ((i_8 & 0xff00) * i_6 >> 8 & 0xff00);
                        i_8 = ints_0[i_1];
                        ints_0[i_1++] = i_2 + ((i_8 & 0xff00ff) * i_6 >> 8 & 0xff00ff) + ((i_8 & 0xff00) * i_6 >> 8 & 0xff00);
                        i_8 = ints_0[i_1];
                        ints_0[i_1++] = i_2 + ((i_8 & 0xff00ff) * i_6 >> 8 & 0xff00ff) + ((i_8 & 0xff00) * i_6 >> 8 & 0xff00);
                    }
                }
            } else
                while (true) {
                    --i_3;
                    if (i_3 < 0) {
                        i_3 = i_5 - i_4 & 0x3;

                        while (true) {
                            --i_3;
                            if (i_3 < 0)
                                return;

                            ints_0[i_1++] = i_2;
                        }
                    }

                    ints_0[i_1++] = i_2;
                    ints_0[i_1++] = i_2;
                    ints_0[i_1++] = i_2;
                    ints_0[i_1++] = i_2;
                }
        }
    }

    static final void staticMethod483(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12, int i_13, int i_14, int i_15, int i_16, int i_17, int i_18) {
        int[] ints_19 = staticInterface2_1.method150(i_18);
        int i_20;
        if (ints_19 == null) {
            i_20 = staticInterface2_1.method151(i_18);
            staticMethod479(i_0, i_1, i_2, i_3, i_4, i_5, staticMethod487(i_20, i_6), staticMethod487(i_20, i_7), staticMethod487(i_20, i_8));
        } else {
            staticBool52 = staticInterface2_1.method153(i_18);
            staticBool55 = staticInterface2_1.method152(i_18);
            i_20 = i_4 - i_3;
            int i_21 = i_1 - i_0;
            int i_22 = i_5 - i_3;
            int i_23 = i_2 - i_0;
            int i_24 = i_7 - i_6;
            int i_25 = i_8 - i_6;
            int i_26 = 0;
            if (i_1 != i_0)
                i_26 = (i_4 - i_3 << 14) / (i_1 - i_0);

            int i_27 = 0;
            if (i_2 != i_1)
                i_27 = (i_5 - i_4 << 14) / (i_2 - i_1);

            int i_28 = 0;
            if (i_2 != i_0)
                i_28 = (i_3 - i_5 << 14) / (i_0 - i_2);

            int i_29 = i_20 * i_23 - i_22 * i_21;
            if (i_29 != 0) {
                int i_30 = (i_24 * i_23 - i_25 * i_21 << 9) / i_29;
                int i_31 = (i_25 * i_20 - i_24 * i_22 << 9) / i_29;
                i_10 = i_9 - i_10;
                i_13 = i_12 - i_13;
                i_16 = i_15 - i_16;
                i_11 -= i_9;
                i_14 -= i_12;
                i_17 -= i_15;
                int i_32 = i_11 * i_12 - i_14 * i_9 << 14;
                int i_33 = (int) (((long) (i_14 * i_15 - i_17 * i_12) << 3 << 14) / staticInt326);
                int i_34 = (int) (((long) (i_17 * i_9 - i_11 * i_15) << 14) / staticInt326);
                int i_35 = i_10 * i_12 - i_13 * i_9 << 14;
                int i_36 = (int) (((long) (i_13 * i_15 - i_16 * i_12) << 3 << 14) / staticInt326);
                int i_37 = (int) (((long) (i_16 * i_9 - i_10 * i_15) << 14) / staticInt326);
                int i_38 = i_13 * i_11 - i_10 * i_14 << 14;
                int i_39 = (int) (((long) (i_16 * i_14 - i_13 * i_17) << 3 << 14) / staticInt326);
                int i_40 = (int) (((long) (i_10 * i_17 - i_16 * i_11) << 14) / staticInt326);
                int i_41;
                if (i_0 <= i_1 && i_0 <= i_2) {
                    if (i_0 < staticInt328) {
                        if (i_1 > staticInt328)
                            i_1 = staticInt328;

                        if (i_2 > staticInt328)
                            i_2 = staticInt328;

                        i_6 = (i_6 << 9) - i_30 * i_3 + i_30;
                        if (i_1 < i_2) {
                            i_5 = i_3 <<= 14;
                            if (i_0 < 0) {
                                i_5 -= i_28 * i_0;
                                i_3 -= i_26 * i_0;
                                i_6 -= i_31 * i_0;
                                i_0 = 0;
                            }

                            i_4 <<= 14;
                            if (i_1 < 0) {
                                i_4 -= i_27 * i_1;
                                i_1 = 0;
                            }

                            i_41 = i_0 - staticInt332;
                            i_32 += i_34 * i_41;
                            i_35 += i_37 * i_41;
                            i_38 += i_40 * i_41;
                            if (i_0 != i_1 && i_28 < i_26 || i_0 == i_1 && i_28 > i_27) {
                                i_2 -= i_1;
                                i_1 -= i_0;
                                i_0 = staticIntArray154[i_0];

                                while (true) {
                                    --i_1;
                                    if (i_1 < 0)
                                        while (true) {
                                            --i_2;
                                            if (i_2 < 0)
                                                return;

                                            staticMethod484(staticIntArray130, ints_19, 0, 0, i_0, i_5 >> 14, i_4 >> 14, i_6, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                            i_5 += i_28;
                                            i_4 += i_27;
                                            i_6 += i_31;
                                            i_0 += staticInt312;
                                            i_32 += i_34;
                                            i_35 += i_37;
                                            i_38 += i_40;
                                        }

                                    staticMethod484(staticIntArray130, ints_19, 0, 0, i_0, i_5 >> 14, i_3 >> 14, i_6, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                    i_5 += i_28;
                                    i_3 += i_26;
                                    i_6 += i_31;
                                    i_0 += staticInt312;
                                    i_32 += i_34;
                                    i_35 += i_37;
                                    i_38 += i_40;
                                }
                            } else {
                                i_2 -= i_1;
                                i_1 -= i_0;
                                i_0 = staticIntArray154[i_0];

                                while (true) {
                                    --i_1;
                                    if (i_1 < 0)
                                        while (true) {
                                            --i_2;
                                            if (i_2 < 0)
                                                return;

                                            staticMethod484(staticIntArray130, ints_19, 0, 0, i_0, i_4 >> 14, i_5 >> 14, i_6, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                            i_5 += i_28;
                                            i_4 += i_27;
                                            i_6 += i_31;
                                            i_0 += staticInt312;
                                            i_32 += i_34;
                                            i_35 += i_37;
                                            i_38 += i_40;
                                        }

                                    staticMethod484(staticIntArray130, ints_19, 0, 0, i_0, i_3 >> 14, i_5 >> 14, i_6, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                    i_5 += i_28;
                                    i_3 += i_26;
                                    i_6 += i_31;
                                    i_0 += staticInt312;
                                    i_32 += i_34;
                                    i_35 += i_37;
                                    i_38 += i_40;
                                }
                            }
                        } else {
                            i_4 = i_3 <<= 14;
                            if (i_0 < 0) {
                                i_4 -= i_28 * i_0;
                                i_3 -= i_26 * i_0;
                                i_6 -= i_31 * i_0;
                                i_0 = 0;
                            }

                            i_5 <<= 14;
                            if (i_2 < 0) {
                                i_5 -= i_27 * i_2;
                                i_2 = 0;
                            }

                            i_41 = i_0 - staticInt332;
                            i_32 += i_34 * i_41;
                            i_35 += i_37 * i_41;
                            i_38 += i_40 * i_41;
                            if ((i_0 == i_2 || i_28 >= i_26) && (i_0 != i_2 || i_27 <= i_26)) {
                                i_1 -= i_2;
                                i_2 -= i_0;
                                i_0 = staticIntArray154[i_0];

                                while (true) {
                                    --i_2;
                                    if (i_2 < 0)
                                        while (true) {
                                            --i_1;
                                            if (i_1 < 0)
                                                return;

                                            staticMethod484(staticIntArray130, ints_19, 0, 0, i_0, i_3 >> 14, i_5 >> 14, i_6, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                            i_5 += i_27;
                                            i_3 += i_26;
                                            i_6 += i_31;
                                            i_0 += staticInt312;
                                            i_32 += i_34;
                                            i_35 += i_37;
                                            i_38 += i_40;
                                        }

                                    staticMethod484(staticIntArray130, ints_19, 0, 0, i_0, i_3 >> 14, i_4 >> 14, i_6, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                    i_4 += i_28;
                                    i_3 += i_26;
                                    i_6 += i_31;
                                    i_0 += staticInt312;
                                    i_32 += i_34;
                                    i_35 += i_37;
                                    i_38 += i_40;
                                }
                            } else {
                                i_1 -= i_2;
                                i_2 -= i_0;
                                i_0 = staticIntArray154[i_0];

                                while (true) {
                                    --i_2;
                                    if (i_2 < 0)
                                        while (true) {
                                            --i_1;
                                            if (i_1 < 0)
                                                return;

                                            staticMethod484(staticIntArray130, ints_19, 0, 0, i_0, i_5 >> 14, i_3 >> 14, i_6, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                            i_5 += i_27;
                                            i_3 += i_26;
                                            i_6 += i_31;
                                            i_0 += staticInt312;
                                            i_32 += i_34;
                                            i_35 += i_37;
                                            i_38 += i_40;
                                        }

                                    staticMethod484(staticIntArray130, ints_19, 0, 0, i_0, i_4 >> 14, i_3 >> 14, i_6, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                    i_4 += i_28;
                                    i_3 += i_26;
                                    i_6 += i_31;
                                    i_0 += staticInt312;
                                    i_32 += i_34;
                                    i_35 += i_37;
                                    i_38 += i_40;
                                }
                            }
                        }
                    }
                } else if (i_1 <= i_2) {
                    if (i_1 < staticInt328) {
                        if (i_2 > staticInt328)
                            i_2 = staticInt328;

                        if (i_0 > staticInt328)
                            i_0 = staticInt328;

                        i_7 = (i_7 << 9) - i_30 * i_4 + i_30;
                        if (i_2 < i_0) {
                            i_3 = i_4 <<= 14;
                            if (i_1 < 0) {
                                i_3 -= i_26 * i_1;
                                i_4 -= i_27 * i_1;
                                i_7 -= i_31 * i_1;
                                i_1 = 0;
                            }

                            i_5 <<= 14;
                            if (i_2 < 0) {
                                i_5 -= i_28 * i_2;
                                i_2 = 0;
                            }

                            i_41 = i_1 - staticInt332;
                            i_32 += i_34 * i_41;
                            i_35 += i_37 * i_41;
                            i_38 += i_40 * i_41;
                            if (i_1 != i_2 && i_26 < i_27 || i_1 == i_2 && i_26 > i_28) {
                                i_0 -= i_2;
                                i_2 -= i_1;
                                i_1 = staticIntArray154[i_1];

                                while (true) {
                                    --i_2;
                                    if (i_2 < 0)
                                        while (true) {
                                            --i_0;
                                            if (i_0 < 0)
                                                return;

                                            staticMethod484(staticIntArray130, ints_19, 0, 0, i_1, i_3 >> 14, i_5 >> 14, i_7, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                            i_3 += i_26;
                                            i_5 += i_28;
                                            i_7 += i_31;
                                            i_1 += staticInt312;
                                            i_32 += i_34;
                                            i_35 += i_37;
                                            i_38 += i_40;
                                        }

                                    staticMethod484(staticIntArray130, ints_19, 0, 0, i_1, i_3 >> 14, i_4 >> 14, i_7, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                    i_3 += i_26;
                                    i_4 += i_27;
                                    i_7 += i_31;
                                    i_1 += staticInt312;
                                    i_32 += i_34;
                                    i_35 += i_37;
                                    i_38 += i_40;
                                }
                            } else {
                                i_0 -= i_2;
                                i_2 -= i_1;
                                i_1 = staticIntArray154[i_1];

                                while (true) {
                                    --i_2;
                                    if (i_2 < 0)
                                        while (true) {
                                            --i_0;
                                            if (i_0 < 0)
                                                return;

                                            staticMethod484(staticIntArray130, ints_19, 0, 0, i_1, i_5 >> 14, i_3 >> 14, i_7, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                            i_3 += i_26;
                                            i_5 += i_28;
                                            i_7 += i_31;
                                            i_1 += staticInt312;
                                            i_32 += i_34;
                                            i_35 += i_37;
                                            i_38 += i_40;
                                        }

                                    staticMethod484(staticIntArray130, ints_19, 0, 0, i_1, i_4 >> 14, i_3 >> 14, i_7, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                    i_3 += i_26;
                                    i_4 += i_27;
                                    i_7 += i_31;
                                    i_1 += staticInt312;
                                    i_32 += i_34;
                                    i_35 += i_37;
                                    i_38 += i_40;
                                }
                            }
                        } else {
                            i_5 = i_4 <<= 14;
                            if (i_1 < 0) {
                                i_5 -= i_26 * i_1;
                                i_4 -= i_27 * i_1;
                                i_7 -= i_31 * i_1;
                                i_1 = 0;
                            }

                            i_3 <<= 14;
                            if (i_0 < 0) {
                                i_3 -= i_28 * i_0;
                                i_0 = 0;
                            }

                            i_41 = i_1 - staticInt332;
                            i_32 += i_34 * i_41;
                            i_35 += i_37 * i_41;
                            i_38 += i_40 * i_41;
                            if (i_26 < i_27) {
                                i_2 -= i_0;
                                i_0 -= i_1;
                                i_1 = staticIntArray154[i_1];

                                while (true) {
                                    --i_0;
                                    if (i_0 < 0)
                                        while (true) {
                                            --i_2;
                                            if (i_2 < 0)
                                                return;

                                            staticMethod484(staticIntArray130, ints_19, 0, 0, i_1, i_3 >> 14, i_4 >> 14, i_7, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                            i_3 += i_28;
                                            i_4 += i_27;
                                            i_7 += i_31;
                                            i_1 += staticInt312;
                                            i_32 += i_34;
                                            i_35 += i_37;
                                            i_38 += i_40;
                                        }

                                    staticMethod484(staticIntArray130, ints_19, 0, 0, i_1, i_5 >> 14, i_4 >> 14, i_7, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                    i_5 += i_26;
                                    i_4 += i_27;
                                    i_7 += i_31;
                                    i_1 += staticInt312;
                                    i_32 += i_34;
                                    i_35 += i_37;
                                    i_38 += i_40;
                                }
                            } else {
                                i_2 -= i_0;
                                i_0 -= i_1;
                                i_1 = staticIntArray154[i_1];

                                while (true) {
                                    --i_0;
                                    if (i_0 < 0)
                                        while (true) {
                                            --i_2;
                                            if (i_2 < 0)
                                                return;

                                            staticMethod484(staticIntArray130, ints_19, 0, 0, i_1, i_4 >> 14, i_3 >> 14, i_7, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                            i_3 += i_28;
                                            i_4 += i_27;
                                            i_7 += i_31;
                                            i_1 += staticInt312;
                                            i_32 += i_34;
                                            i_35 += i_37;
                                            i_38 += i_40;
                                        }

                                    staticMethod484(staticIntArray130, ints_19, 0, 0, i_1, i_4 >> 14, i_5 >> 14, i_7, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                    i_5 += i_26;
                                    i_4 += i_27;
                                    i_7 += i_31;
                                    i_1 += staticInt312;
                                    i_32 += i_34;
                                    i_35 += i_37;
                                    i_38 += i_40;
                                }
                            }
                        }
                    }
                } else if (i_2 < staticInt328) {
                    if (i_0 > staticInt328)
                        i_0 = staticInt328;

                    if (i_1 > staticInt328)
                        i_1 = staticInt328;

                    i_8 = (i_8 << 9) - i_30 * i_5 + i_30;
                    if (i_0 < i_1) {
                        i_4 = i_5 <<= 14;
                        if (i_2 < 0) {
                            i_4 -= i_27 * i_2;
                            i_5 -= i_28 * i_2;
                            i_8 -= i_31 * i_2;
                            i_2 = 0;
                        }

                        i_3 <<= 14;
                        if (i_0 < 0) {
                            i_3 -= i_26 * i_0;
                            i_0 = 0;
                        }

                        i_41 = i_2 - staticInt332;
                        i_32 += i_34 * i_41;
                        i_35 += i_37 * i_41;
                        i_38 += i_40 * i_41;
                        if (i_27 < i_28) {
                            i_1 -= i_0;
                            i_0 -= i_2;
                            i_2 = staticIntArray154[i_2];

                            while (true) {
                                --i_0;
                                if (i_0 < 0)
                                    while (true) {
                                        --i_1;
                                        if (i_1 < 0)
                                            return;

                                        staticMethod484(staticIntArray130, ints_19, 0, 0, i_2, i_4 >> 14, i_3 >> 14, i_8, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                        i_4 += i_27;
                                        i_3 += i_26;
                                        i_8 += i_31;
                                        i_2 += staticInt312;
                                        i_32 += i_34;
                                        i_35 += i_37;
                                        i_38 += i_40;
                                    }

                                staticMethod484(staticIntArray130, ints_19, 0, 0, i_2, i_4 >> 14, i_5 >> 14, i_8, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                i_4 += i_27;
                                i_5 += i_28;
                                i_8 += i_31;
                                i_2 += staticInt312;
                                i_32 += i_34;
                                i_35 += i_37;
                                i_38 += i_40;
                            }
                        } else {
                            i_1 -= i_0;
                            i_0 -= i_2;
                            i_2 = staticIntArray154[i_2];

                            while (true) {
                                --i_0;
                                if (i_0 < 0)
                                    while (true) {
                                        --i_1;
                                        if (i_1 < 0)
                                            return;

                                        staticMethod484(staticIntArray130, ints_19, 0, 0, i_2, i_3 >> 14, i_4 >> 14, i_8, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                        i_4 += i_27;
                                        i_3 += i_26;
                                        i_8 += i_31;
                                        i_2 += staticInt312;
                                        i_32 += i_34;
                                        i_35 += i_37;
                                        i_38 += i_40;
                                    }

                                staticMethod484(staticIntArray130, ints_19, 0, 0, i_2, i_5 >> 14, i_4 >> 14, i_8, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                i_4 += i_27;
                                i_5 += i_28;
                                i_8 += i_31;
                                i_2 += staticInt312;
                                i_32 += i_34;
                                i_35 += i_37;
                                i_38 += i_40;
                            }
                        }
                    } else {
                        i_3 = i_5 <<= 14;
                        if (i_2 < 0) {
                            i_3 -= i_27 * i_2;
                            i_5 -= i_28 * i_2;
                            i_8 -= i_31 * i_2;
                            i_2 = 0;
                        }

                        i_4 <<= 14;
                        if (i_1 < 0) {
                            i_4 -= i_26 * i_1;
                            i_1 = 0;
                        }

                        i_41 = i_2 - staticInt332;
                        i_32 += i_34 * i_41;
                        i_35 += i_37 * i_41;
                        i_38 += i_40 * i_41;
                        if (i_27 < i_28) {
                            i_0 -= i_1;
                            i_1 -= i_2;
                            i_2 = staticIntArray154[i_2];

                            while (true) {
                                --i_1;
                                if (i_1 < 0)
                                    while (true) {
                                        --i_0;
                                        if (i_0 < 0)
                                            return;

                                        staticMethod484(staticIntArray130, ints_19, 0, 0, i_2, i_4 >> 14, i_5 >> 14, i_8, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                        i_4 += i_26;
                                        i_5 += i_28;
                                        i_8 += i_31;
                                        i_2 += staticInt312;
                                        i_32 += i_34;
                                        i_35 += i_37;
                                        i_38 += i_40;
                                    }

                                staticMethod484(staticIntArray130, ints_19, 0, 0, i_2, i_3 >> 14, i_5 >> 14, i_8, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                i_3 += i_27;
                                i_5 += i_28;
                                i_8 += i_31;
                                i_2 += staticInt312;
                                i_32 += i_34;
                                i_35 += i_37;
                                i_38 += i_40;
                            }
                        } else {
                            i_0 -= i_1;
                            i_1 -= i_2;
                            i_2 = staticIntArray154[i_2];

                            while (true) {
                                --i_1;
                                if (i_1 < 0)
                                    while (true) {
                                        --i_0;
                                        if (i_0 < 0)
                                            return;

                                        staticMethod484(staticIntArray130, ints_19, 0, 0, i_2, i_5 >> 14, i_4 >> 14, i_8, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                        i_4 += i_26;
                                        i_5 += i_28;
                                        i_8 += i_31;
                                        i_2 += staticInt312;
                                        i_32 += i_34;
                                        i_35 += i_37;
                                        i_38 += i_40;
                                    }

                                staticMethod484(staticIntArray130, ints_19, 0, 0, i_2, i_5 >> 14, i_3 >> 14, i_8, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                i_3 += i_27;
                                i_5 += i_28;
                                i_8 += i_31;
                                i_2 += staticInt312;
                                i_32 += i_34;
                                i_35 += i_37;
                                i_38 += i_40;
                            }
                        }
                    }
                }
            }
        }
    }

    static final void staticMethod484(int[] ints_0, int[] ints_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12, int i_13, int i_14) {
        if (staticBool54) {
            if (i_6 > staticInt327)
                i_6 = staticInt327;

            if (i_5 < 0)
                i_5 = 0;
        }

        if (i_5 < i_6) {
            i_4 += i_5;
            i_7 += i_8 * i_5;
            int i_17 = i_6 - i_5;
            int i_15;
            int i_16;
            int i_10000;
            int i_18;
            int i_19;
            int i_20;
            int i_21;
            int i_22;
            int i_23;
            if (staticBool52) {
                i_23 = i_5 - staticInt325;
                i_9 += (i_12 >> 3) * i_23;
                i_10 += (i_13 >> 3) * i_23;
                i_11 += (i_14 >> 3) * i_23;
                i_22 = i_11 >> 12;
                if (i_22 != 0) {
                    i_18 = i_9 / i_22;
                    i_19 = i_10 / i_22;
                    if (i_18 < 0)
                        i_18 = 0;
                    else if (i_18 > 4032)
                        i_18 = 4032;
                } else {
                    i_18 = 0;
                    i_19 = 0;
                }

                i_9 += i_12;
                i_10 += i_13;
                i_11 += i_14;
                i_22 = i_11 >> 12;
                if (i_22 != 0) {
                    i_20 = i_9 / i_22;
                    i_21 = i_10 / i_22;
                    if (i_20 < 0)
                        i_20 = 0;
                    else if (i_20 > 4032)
                        i_20 = 4032;
                } else {
                    i_20 = 0;
                    i_21 = 0;
                }

                i_2 = (i_18 << 20) + i_19;
                i_16 = (i_20 - i_18 >> 3 << 20) + (i_21 - i_19 >> 3);
                i_17 >>= 3;
                i_8 <<= 3;
                i_15 = i_7 >> 8;
                if (staticBool55) {
                    if (i_17 > 0)
                        do {
                            i_3 = ints_1[(i_2 & 0xfc0) + (i_2 >>> 26)];
                            ints_0[i_4++] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;
                            i_2 += i_16;
                            i_3 = ints_1[(i_2 & 0xfc0) + (i_2 >>> 26)];
                            ints_0[i_4++] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;
                            i_2 += i_16;
                            i_3 = ints_1[(i_2 & 0xfc0) + (i_2 >>> 26)];
                            ints_0[i_4++] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;
                            i_2 += i_16;
                            i_3 = ints_1[(i_2 & 0xfc0) + (i_2 >>> 26)];
                            ints_0[i_4++] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;
                            i_2 += i_16;
                            i_3 = ints_1[(i_2 & 0xfc0) + (i_2 >>> 26)];
                            ints_0[i_4++] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;
                            i_2 += i_16;
                            i_3 = ints_1[(i_2 & 0xfc0) + (i_2 >>> 26)];
                            ints_0[i_4++] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;
                            i_2 += i_16;
                            i_3 = ints_1[(i_2 & 0xfc0) + (i_2 >>> 26)];
                            ints_0[i_4++] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;
                            i_2 += i_16;
                            i_3 = ints_1[(i_2 & 0xfc0) + (i_2 >>> 26)];
                            ints_0[i_4++] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;
                            i_10000 = i_2 + i_16;
                            i_18 = i_20;
                            i_19 = i_21;
                            i_9 += i_12;
                            i_10 += i_13;
                            i_11 += i_14;
                            i_22 = i_11 >> 12;
                            if (i_22 != 0) {
                                i_20 = i_9 / i_22;
                                i_21 = i_10 / i_22;
                                if (i_20 < 0)
                                    i_20 = 0;
                                else if (i_20 > 4032)
                                    i_20 = 4032;
                            } else {
                                i_20 = 0;
                                i_21 = 0;
                            }

                            i_2 = (i_18 << 20) + i_19;
                            i_16 = (i_20 - i_18 >> 3 << 20) + (i_21 - i_19 >> 3);
                            i_7 += i_8;
                            i_15 = i_7 >> 8;
                            --i_17;
                        } while (i_17 > 0);

                    i_17 = i_6 - i_5 & 0x7;
                    if (i_17 > 0)
                        do {
                            i_3 = ints_1[(i_2 & 0xfc0) + (i_2 >>> 26)];
                            ints_0[i_4++] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;
                            i_2 += i_16;
                            --i_17;
                        } while (i_17 > 0);
                } else {
                    if (i_17 > 0)
                        do {
                            if ((i_3 = ints_1[(i_2 & 0xfc0) + (i_2 >>> 26)]) != 0)
                                ints_0[i_4] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;

                            ++i_4;
                            i_2 += i_16;
                            if ((i_3 = ints_1[(i_2 & 0xfc0) + (i_2 >>> 26)]) != 0)
                                ints_0[i_4] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;

                            ++i_4;
                            i_2 += i_16;
                            if ((i_3 = ints_1[(i_2 & 0xfc0) + (i_2 >>> 26)]) != 0)
                                ints_0[i_4] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;

                            ++i_4;
                            i_2 += i_16;
                            if ((i_3 = ints_1[(i_2 & 0xfc0) + (i_2 >>> 26)]) != 0)
                                ints_0[i_4] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;

                            ++i_4;
                            i_2 += i_16;
                            if ((i_3 = ints_1[(i_2 & 0xfc0) + (i_2 >>> 26)]) != 0)
                                ints_0[i_4] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;

                            ++i_4;
                            i_2 += i_16;
                            if ((i_3 = ints_1[(i_2 & 0xfc0) + (i_2 >>> 26)]) != 0)
                                ints_0[i_4] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;

                            ++i_4;
                            i_2 += i_16;
                            if ((i_3 = ints_1[(i_2 & 0xfc0) + (i_2 >>> 26)]) != 0)
                                ints_0[i_4] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;

                            ++i_4;
                            i_2 += i_16;
                            if ((i_3 = ints_1[(i_2 & 0xfc0) + (i_2 >>> 26)]) != 0)
                                ints_0[i_4] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;

                            ++i_4;
                            i_10000 = i_2 + i_16;
                            i_18 = i_20;
                            i_19 = i_21;
                            i_9 += i_12;
                            i_10 += i_13;
                            i_11 += i_14;
                            i_22 = i_11 >> 12;
                            if (i_22 != 0) {
                                i_20 = i_9 / i_22;
                                i_21 = i_10 / i_22;
                                if (i_20 < 0)
                                    i_20 = 0;
                                else if (i_20 > 4032)
                                    i_20 = 4032;
                            } else {
                                i_20 = 0;
                                i_21 = 0;
                            }

                            i_2 = (i_18 << 20) + i_19;
                            i_16 = (i_20 - i_18 >> 3 << 20) + (i_21 - i_19 >> 3);
                            i_7 += i_8;
                            i_15 = i_7 >> 8;
                            --i_17;
                        } while (i_17 > 0);

                    i_17 = i_6 - i_5 & 0x7;
                    if (i_17 > 0)
                        do {
                            if ((i_3 = ints_1[(i_2 & 0xfc0) + (i_2 >>> 26)]) != 0)
                                ints_0[i_4] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;

                            ++i_4;
                            i_2 += i_16;
                            --i_17;
                        } while (i_17 > 0);
                }
            } else {
                i_23 = i_5 - staticInt325;
                i_9 += (i_12 >> 3) * i_23;
                i_10 += (i_13 >> 3) * i_23;
                i_11 += (i_14 >> 3) * i_23;
                i_22 = i_11 >> 14;
                if (i_22 != 0) {
                    i_18 = i_9 / i_22;
                    i_19 = i_10 / i_22;
                    if (i_18 < 0)
                        i_18 = 0;
                    else if (i_18 > 16256)
                        i_18 = 16256;
                } else {
                    i_18 = 0;
                    i_19 = 0;
                }

                i_9 += i_12;
                i_10 += i_13;
                i_11 += i_14;
                i_22 = i_11 >> 14;
                if (i_22 != 0) {
                    i_20 = i_9 / i_22;
                    i_21 = i_10 / i_22;
                    if (i_20 < 0)
                        i_20 = 0;
                    else if (i_20 > 16256)
                        i_20 = 16256;
                } else {
                    i_20 = 0;
                    i_21 = 0;
                }

                i_2 = (i_18 << 18) + i_19;
                i_16 = (i_20 - i_18 >> 3 << 18) + (i_21 - i_19 >> 3);
                i_17 >>= 3;
                i_8 <<= 3;
                i_15 = i_7 >> 8;
                if (staticBool55) {
                    if (i_17 > 0)
                        do {
                            i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)];
                            ints_0[i_4++] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;
                            i_2 += i_16;
                            i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)];
                            ints_0[i_4++] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;
                            i_2 += i_16;
                            i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)];
                            ints_0[i_4++] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;
                            i_2 += i_16;
                            i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)];
                            ints_0[i_4++] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;
                            i_2 += i_16;
                            i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)];
                            ints_0[i_4++] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;
                            i_2 += i_16;
                            i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)];
                            ints_0[i_4++] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;
                            i_2 += i_16;
                            i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)];
                            ints_0[i_4++] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;
                            i_2 += i_16;
                            i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)];
                            ints_0[i_4++] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;
                            i_10000 = i_2 + i_16;
                            i_18 = i_20;
                            i_19 = i_21;
                            i_9 += i_12;
                            i_10 += i_13;
                            i_11 += i_14;
                            i_22 = i_11 >> 14;
                            if (i_22 != 0) {
                                i_20 = i_9 / i_22;
                                i_21 = i_10 / i_22;
                                if (i_20 < 0)
                                    i_20 = 0;
                                else if (i_20 > 16256)
                                    i_20 = 16256;
                            } else {
                                i_20 = 0;
                                i_21 = 0;
                            }

                            i_2 = (i_18 << 18) + i_19;
                            i_16 = (i_20 - i_18 >> 3 << 18) + (i_21 - i_19 >> 3);
                            i_7 += i_8;
                            i_15 = i_7 >> 8;
                            --i_17;
                        } while (i_17 > 0);

                    i_17 = i_6 - i_5 & 0x7;
                    if (i_17 > 0)
                        do {
                            i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)];
                            ints_0[i_4++] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;
                            i_2 += i_16;
                            --i_17;
                        } while (i_17 > 0);
                } else {
                    if (i_17 > 0)
                        do {
                            if ((i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)]) != 0)
                                ints_0[i_4] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;

                            ++i_4;
                            i_2 += i_16;
                            if ((i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)]) != 0)
                                ints_0[i_4] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;

                            ++i_4;
                            i_2 += i_16;
                            if ((i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)]) != 0)
                                ints_0[i_4] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;

                            ++i_4;
                            i_2 += i_16;
                            if ((i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)]) != 0)
                                ints_0[i_4] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;

                            ++i_4;
                            i_2 += i_16;
                            if ((i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)]) != 0)
                                ints_0[i_4] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;

                            ++i_4;
                            i_2 += i_16;
                            if ((i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)]) != 0)
                                ints_0[i_4] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;

                            ++i_4;
                            i_2 += i_16;
                            if ((i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)]) != 0)
                                ints_0[i_4] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;

                            ++i_4;
                            i_2 += i_16;
                            if ((i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)]) != 0)
                                ints_0[i_4] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;

                            ++i_4;
                            i_10000 = i_2 + i_16;
                            i_18 = i_20;
                            i_19 = i_21;
                            i_9 += i_12;
                            i_10 += i_13;
                            i_11 += i_14;
                            i_22 = i_11 >> 14;
                            if (i_22 != 0) {
                                i_20 = i_9 / i_22;
                                i_21 = i_10 / i_22;
                                if (i_20 < 0)
                                    i_20 = 0;
                                else if (i_20 > 16256)
                                    i_20 = 16256;
                            } else {
                                i_20 = 0;
                                i_21 = 0;
                            }

                            i_2 = (i_18 << 18) + i_19;
                            i_16 = (i_20 - i_18 >> 3 << 18) + (i_21 - i_19 >> 3);
                            i_7 += i_8;
                            i_15 = i_7 >> 8;
                            --i_17;
                        } while (i_17 > 0);

                    i_17 = i_6 - i_5 & 0x7;
                    if (i_17 > 0)
                        do {
                            if ((i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)]) != 0)
                                ints_0[i_4] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;

                            ++i_4;
                            i_2 += i_16;
                            --i_17;
                        } while (i_17 > 0);
                }
            }

        }
    }

    static final void staticMethod485(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12, int i_13, int i_14, int i_15, int i_16, int i_17, int i_18) {
        int[] ints_19 = staticInterface2_1.method150(i_18);
        int i_20;
        if (ints_19 == null) {
            i_20 = staticInterface2_1.method151(i_18);
            staticMethod479(i_0, i_1, i_2, i_3, i_4, i_5, staticMethod487(i_20, i_6), staticMethod487(i_20, i_7), staticMethod487(i_20, i_8));
        } else {
            staticBool52 = staticInterface2_1.method153(i_18);
            staticBool55 = staticInterface2_1.method152(i_18);
            i_20 = i_4 - i_3;
            int i_21 = i_1 - i_0;
            int i_22 = i_5 - i_3;
            int i_23 = i_2 - i_0;
            int i_24 = i_7 - i_6;
            int i_25 = i_8 - i_6;
            int i_26 = 0;
            if (i_1 != i_0)
                i_26 = (i_4 - i_3 << 14) / (i_1 - i_0);

            int i_27 = 0;
            if (i_2 != i_1)
                i_27 = (i_5 - i_4 << 14) / (i_2 - i_1);

            int i_28 = 0;
            if (i_2 != i_0)
                i_28 = (i_3 - i_5 << 14) / (i_0 - i_2);

            int i_29 = i_20 * i_23 - i_22 * i_21;
            if (i_29 != 0) {
                int i_30 = (i_24 * i_23 - i_25 * i_21 << 9) / i_29;
                int i_31 = (i_25 * i_20 - i_24 * i_22 << 9) / i_29;
                i_10 = i_9 - i_10;
                i_13 = i_12 - i_13;
                i_16 = i_15 - i_16;
                i_11 -= i_9;
                i_14 -= i_12;
                i_17 -= i_15;
                int i_32 = i_11 * i_12 - i_14 * i_9 << 14;
                int i_33 = (int) (((long) (i_14 * i_15 - i_17 * i_12) << 14) / staticInt326);
                int i_34 = (int) (((long) (i_17 * i_9 - i_11 * i_15) << 14) / staticInt326);
                int i_35 = i_10 * i_12 - i_13 * i_9 << 14;
                int i_36 = (int) (((long) (i_13 * i_15 - i_16 * i_12) << 14) / staticInt326);
                int i_37 = (int) (((long) (i_16 * i_9 - i_10 * i_15) << 14) / staticInt326);
                int i_38 = i_13 * i_11 - i_10 * i_14 << 14;
                int i_39 = (int) (((long) (i_16 * i_14 - i_13 * i_17) << 14) / staticInt326);
                int i_40 = (int) (((long) (i_10 * i_17 - i_16 * i_11) << 14) / staticInt326);
                int i_41;
                if (i_0 <= i_1 && i_0 <= i_2) {
                    if (i_0 < staticInt328) {
                        if (i_1 > staticInt328)
                            i_1 = staticInt328;

                        if (i_2 > staticInt328)
                            i_2 = staticInt328;

                        i_6 = (i_6 << 9) - i_30 * i_3 + i_30;
                        if (i_1 < i_2) {
                            i_5 = i_3 <<= 14;
                            if (i_0 < 0) {
                                i_5 -= i_28 * i_0;
                                i_3 -= i_26 * i_0;
                                i_6 -= i_31 * i_0;
                                i_0 = 0;
                            }

                            i_4 <<= 14;
                            if (i_1 < 0) {
                                i_4 -= i_27 * i_1;
                                i_1 = 0;
                            }

                            i_41 = i_0 - staticInt332;
                            i_32 += i_34 * i_41;
                            i_35 += i_37 * i_41;
                            i_38 += i_40 * i_41;
                            if (i_0 != i_1 && i_28 < i_26 || i_0 == i_1 && i_28 > i_27) {
                                i_2 -= i_1;
                                i_1 -= i_0;
                                i_0 = staticIntArray154[i_0];

                                while (true) {
                                    --i_1;
                                    if (i_1 < 0)
                                        while (true) {
                                            --i_2;
                                            if (i_2 < 0)
                                                return;

                                            staticMethod486(staticIntArray130, ints_19, 0, 0, i_0, i_5 >> 14, i_4 >> 14, i_6, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                            i_5 += i_28;
                                            i_4 += i_27;
                                            i_6 += i_31;
                                            i_0 += staticInt312;
                                            i_32 += i_34;
                                            i_35 += i_37;
                                            i_38 += i_40;
                                        }

                                    staticMethod486(staticIntArray130, ints_19, 0, 0, i_0, i_5 >> 14, i_3 >> 14, i_6, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                    i_5 += i_28;
                                    i_3 += i_26;
                                    i_6 += i_31;
                                    i_0 += staticInt312;
                                    i_32 += i_34;
                                    i_35 += i_37;
                                    i_38 += i_40;
                                }
                            } else {
                                i_2 -= i_1;
                                i_1 -= i_0;
                                i_0 = staticIntArray154[i_0];

                                while (true) {
                                    --i_1;
                                    if (i_1 < 0)
                                        while (true) {
                                            --i_2;
                                            if (i_2 < 0)
                                                return;

                                            staticMethod486(staticIntArray130, ints_19, 0, 0, i_0, i_4 >> 14, i_5 >> 14, i_6, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                            i_5 += i_28;
                                            i_4 += i_27;
                                            i_6 += i_31;
                                            i_0 += staticInt312;
                                            i_32 += i_34;
                                            i_35 += i_37;
                                            i_38 += i_40;
                                        }

                                    staticMethod486(staticIntArray130, ints_19, 0, 0, i_0, i_3 >> 14, i_5 >> 14, i_6, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                    i_5 += i_28;
                                    i_3 += i_26;
                                    i_6 += i_31;
                                    i_0 += staticInt312;
                                    i_32 += i_34;
                                    i_35 += i_37;
                                    i_38 += i_40;
                                }
                            }
                        } else {
                            i_4 = i_3 <<= 14;
                            if (i_0 < 0) {
                                i_4 -= i_28 * i_0;
                                i_3 -= i_26 * i_0;
                                i_6 -= i_31 * i_0;
                                i_0 = 0;
                            }

                            i_5 <<= 14;
                            if (i_2 < 0) {
                                i_5 -= i_27 * i_2;
                                i_2 = 0;
                            }

                            i_41 = i_0 - staticInt332;
                            i_32 += i_34 * i_41;
                            i_35 += i_37 * i_41;
                            i_38 += i_40 * i_41;
                            if ((i_0 == i_2 || i_28 >= i_26) && (i_0 != i_2 || i_27 <= i_26)) {
                                i_1 -= i_2;
                                i_2 -= i_0;
                                i_0 = staticIntArray154[i_0];

                                while (true) {
                                    --i_2;
                                    if (i_2 < 0)
                                        while (true) {
                                            --i_1;
                                            if (i_1 < 0)
                                                return;

                                            staticMethod486(staticIntArray130, ints_19, 0, 0, i_0, i_3 >> 14, i_5 >> 14, i_6, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                            i_5 += i_27;
                                            i_3 += i_26;
                                            i_6 += i_31;
                                            i_0 += staticInt312;
                                            i_32 += i_34;
                                            i_35 += i_37;
                                            i_38 += i_40;
                                        }

                                    staticMethod486(staticIntArray130, ints_19, 0, 0, i_0, i_3 >> 14, i_4 >> 14, i_6, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                    i_4 += i_28;
                                    i_3 += i_26;
                                    i_6 += i_31;
                                    i_0 += staticInt312;
                                    i_32 += i_34;
                                    i_35 += i_37;
                                    i_38 += i_40;
                                }
                            } else {
                                i_1 -= i_2;
                                i_2 -= i_0;
                                i_0 = staticIntArray154[i_0];

                                while (true) {
                                    --i_2;
                                    if (i_2 < 0)
                                        while (true) {
                                            --i_1;
                                            if (i_1 < 0)
                                                return;

                                            staticMethod486(staticIntArray130, ints_19, 0, 0, i_0, i_5 >> 14, i_3 >> 14, i_6, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                            i_5 += i_27;
                                            i_3 += i_26;
                                            i_6 += i_31;
                                            i_0 += staticInt312;
                                            i_32 += i_34;
                                            i_35 += i_37;
                                            i_38 += i_40;
                                        }

                                    staticMethod486(staticIntArray130, ints_19, 0, 0, i_0, i_4 >> 14, i_3 >> 14, i_6, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                    i_4 += i_28;
                                    i_3 += i_26;
                                    i_6 += i_31;
                                    i_0 += staticInt312;
                                    i_32 += i_34;
                                    i_35 += i_37;
                                    i_38 += i_40;
                                }
                            }
                        }
                    }
                } else if (i_1 <= i_2) {
                    if (i_1 < staticInt328) {
                        if (i_2 > staticInt328)
                            i_2 = staticInt328;

                        if (i_0 > staticInt328)
                            i_0 = staticInt328;

                        i_7 = (i_7 << 9) - i_30 * i_4 + i_30;
                        if (i_2 < i_0) {
                            i_3 = i_4 <<= 14;
                            if (i_1 < 0) {
                                i_3 -= i_26 * i_1;
                                i_4 -= i_27 * i_1;
                                i_7 -= i_31 * i_1;
                                i_1 = 0;
                            }

                            i_5 <<= 14;
                            if (i_2 < 0) {
                                i_5 -= i_28 * i_2;
                                i_2 = 0;
                            }

                            i_41 = i_1 - staticInt332;
                            i_32 += i_34 * i_41;
                            i_35 += i_37 * i_41;
                            i_38 += i_40 * i_41;
                            if (i_1 != i_2 && i_26 < i_27 || i_1 == i_2 && i_26 > i_28) {
                                i_0 -= i_2;
                                i_2 -= i_1;
                                i_1 = staticIntArray154[i_1];

                                while (true) {
                                    --i_2;
                                    if (i_2 < 0)
                                        while (true) {
                                            --i_0;
                                            if (i_0 < 0)
                                                return;

                                            staticMethod486(staticIntArray130, ints_19, 0, 0, i_1, i_3 >> 14, i_5 >> 14, i_7, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                            i_3 += i_26;
                                            i_5 += i_28;
                                            i_7 += i_31;
                                            i_1 += staticInt312;
                                            i_32 += i_34;
                                            i_35 += i_37;
                                            i_38 += i_40;
                                        }

                                    staticMethod486(staticIntArray130, ints_19, 0, 0, i_1, i_3 >> 14, i_4 >> 14, i_7, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                    i_3 += i_26;
                                    i_4 += i_27;
                                    i_7 += i_31;
                                    i_1 += staticInt312;
                                    i_32 += i_34;
                                    i_35 += i_37;
                                    i_38 += i_40;
                                }
                            } else {
                                i_0 -= i_2;
                                i_2 -= i_1;
                                i_1 = staticIntArray154[i_1];

                                while (true) {
                                    --i_2;
                                    if (i_2 < 0)
                                        while (true) {
                                            --i_0;
                                            if (i_0 < 0)
                                                return;

                                            staticMethod486(staticIntArray130, ints_19, 0, 0, i_1, i_5 >> 14, i_3 >> 14, i_7, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                            i_3 += i_26;
                                            i_5 += i_28;
                                            i_7 += i_31;
                                            i_1 += staticInt312;
                                            i_32 += i_34;
                                            i_35 += i_37;
                                            i_38 += i_40;
                                        }

                                    staticMethod486(staticIntArray130, ints_19, 0, 0, i_1, i_4 >> 14, i_3 >> 14, i_7, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                    i_3 += i_26;
                                    i_4 += i_27;
                                    i_7 += i_31;
                                    i_1 += staticInt312;
                                    i_32 += i_34;
                                    i_35 += i_37;
                                    i_38 += i_40;
                                }
                            }
                        } else {
                            i_5 = i_4 <<= 14;
                            if (i_1 < 0) {
                                i_5 -= i_26 * i_1;
                                i_4 -= i_27 * i_1;
                                i_7 -= i_31 * i_1;
                                i_1 = 0;
                            }

                            i_3 <<= 14;
                            if (i_0 < 0) {
                                i_3 -= i_28 * i_0;
                                i_0 = 0;
                            }

                            i_41 = i_1 - staticInt332;
                            i_32 += i_34 * i_41;
                            i_35 += i_37 * i_41;
                            i_38 += i_40 * i_41;
                            if (i_26 < i_27) {
                                i_2 -= i_0;
                                i_0 -= i_1;
                                i_1 = staticIntArray154[i_1];

                                while (true) {
                                    --i_0;
                                    if (i_0 < 0)
                                        while (true) {
                                            --i_2;
                                            if (i_2 < 0)
                                                return;

                                            staticMethod486(staticIntArray130, ints_19, 0, 0, i_1, i_3 >> 14, i_4 >> 14, i_7, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                            i_3 += i_28;
                                            i_4 += i_27;
                                            i_7 += i_31;
                                            i_1 += staticInt312;
                                            i_32 += i_34;
                                            i_35 += i_37;
                                            i_38 += i_40;
                                        }

                                    staticMethod486(staticIntArray130, ints_19, 0, 0, i_1, i_5 >> 14, i_4 >> 14, i_7, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                    i_5 += i_26;
                                    i_4 += i_27;
                                    i_7 += i_31;
                                    i_1 += staticInt312;
                                    i_32 += i_34;
                                    i_35 += i_37;
                                    i_38 += i_40;
                                }
                            } else {
                                i_2 -= i_0;
                                i_0 -= i_1;
                                i_1 = staticIntArray154[i_1];

                                while (true) {
                                    --i_0;
                                    if (i_0 < 0)
                                        while (true) {
                                            --i_2;
                                            if (i_2 < 0)
                                                return;

                                            staticMethod486(staticIntArray130, ints_19, 0, 0, i_1, i_4 >> 14, i_3 >> 14, i_7, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                            i_3 += i_28;
                                            i_4 += i_27;
                                            i_7 += i_31;
                                            i_1 += staticInt312;
                                            i_32 += i_34;
                                            i_35 += i_37;
                                            i_38 += i_40;
                                        }

                                    staticMethod486(staticIntArray130, ints_19, 0, 0, i_1, i_4 >> 14, i_5 >> 14, i_7, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                    i_5 += i_26;
                                    i_4 += i_27;
                                    i_7 += i_31;
                                    i_1 += staticInt312;
                                    i_32 += i_34;
                                    i_35 += i_37;
                                    i_38 += i_40;
                                }
                            }
                        }
                    }
                } else if (i_2 < staticInt328) {
                    if (i_0 > staticInt328)
                        i_0 = staticInt328;

                    if (i_1 > staticInt328)
                        i_1 = staticInt328;

                    i_8 = (i_8 << 9) - i_30 * i_5 + i_30;
                    if (i_0 < i_1) {
                        i_4 = i_5 <<= 14;
                        if (i_2 < 0) {
                            i_4 -= i_27 * i_2;
                            i_5 -= i_28 * i_2;
                            i_8 -= i_31 * i_2;
                            i_2 = 0;
                        }

                        i_3 <<= 14;
                        if (i_0 < 0) {
                            i_3 -= i_26 * i_0;
                            i_0 = 0;
                        }

                        i_41 = i_2 - staticInt332;
                        i_32 += i_34 * i_41;
                        i_35 += i_37 * i_41;
                        i_38 += i_40 * i_41;
                        if (i_27 < i_28) {
                            i_1 -= i_0;
                            i_0 -= i_2;
                            i_2 = staticIntArray154[i_2];

                            while (true) {
                                --i_0;
                                if (i_0 < 0)
                                    while (true) {
                                        --i_1;
                                        if (i_1 < 0)
                                            return;

                                        staticMethod486(staticIntArray130, ints_19, 0, 0, i_2, i_4 >> 14, i_3 >> 14, i_8, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                        i_4 += i_27;
                                        i_3 += i_26;
                                        i_8 += i_31;
                                        i_2 += staticInt312;
                                        i_32 += i_34;
                                        i_35 += i_37;
                                        i_38 += i_40;
                                    }

                                staticMethod486(staticIntArray130, ints_19, 0, 0, i_2, i_4 >> 14, i_5 >> 14, i_8, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                i_4 += i_27;
                                i_5 += i_28;
                                i_8 += i_31;
                                i_2 += staticInt312;
                                i_32 += i_34;
                                i_35 += i_37;
                                i_38 += i_40;
                            }
                        } else {
                            i_1 -= i_0;
                            i_0 -= i_2;
                            i_2 = staticIntArray154[i_2];

                            while (true) {
                                --i_0;
                                if (i_0 < 0)
                                    while (true) {
                                        --i_1;
                                        if (i_1 < 0)
                                            return;

                                        staticMethod486(staticIntArray130, ints_19, 0, 0, i_2, i_3 >> 14, i_4 >> 14, i_8, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                        i_4 += i_27;
                                        i_3 += i_26;
                                        i_8 += i_31;
                                        i_2 += staticInt312;
                                        i_32 += i_34;
                                        i_35 += i_37;
                                        i_38 += i_40;
                                    }

                                staticMethod486(staticIntArray130, ints_19, 0, 0, i_2, i_5 >> 14, i_4 >> 14, i_8, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                i_4 += i_27;
                                i_5 += i_28;
                                i_8 += i_31;
                                i_2 += staticInt312;
                                i_32 += i_34;
                                i_35 += i_37;
                                i_38 += i_40;
                            }
                        }
                    } else {
                        i_3 = i_5 <<= 14;
                        if (i_2 < 0) {
                            i_3 -= i_27 * i_2;
                            i_5 -= i_28 * i_2;
                            i_8 -= i_31 * i_2;
                            i_2 = 0;
                        }

                        i_4 <<= 14;
                        if (i_1 < 0) {
                            i_4 -= i_26 * i_1;
                            i_1 = 0;
                        }

                        i_41 = i_2 - staticInt332;
                        i_32 += i_34 * i_41;
                        i_35 += i_37 * i_41;
                        i_38 += i_40 * i_41;
                        if (i_27 < i_28) {
                            i_0 -= i_1;
                            i_1 -= i_2;
                            i_2 = staticIntArray154[i_2];

                            while (true) {
                                --i_1;
                                if (i_1 < 0)
                                    while (true) {
                                        --i_0;
                                        if (i_0 < 0)
                                            return;

                                        staticMethod486(staticIntArray130, ints_19, 0, 0, i_2, i_4 >> 14, i_5 >> 14, i_8, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                        i_4 += i_26;
                                        i_5 += i_28;
                                        i_8 += i_31;
                                        i_2 += staticInt312;
                                        i_32 += i_34;
                                        i_35 += i_37;
                                        i_38 += i_40;
                                    }

                                staticMethod486(staticIntArray130, ints_19, 0, 0, i_2, i_3 >> 14, i_5 >> 14, i_8, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                i_3 += i_27;
                                i_5 += i_28;
                                i_8 += i_31;
                                i_2 += staticInt312;
                                i_32 += i_34;
                                i_35 += i_37;
                                i_38 += i_40;
                            }
                        } else {
                            i_0 -= i_1;
                            i_1 -= i_2;
                            i_2 = staticIntArray154[i_2];

                            while (true) {
                                --i_1;
                                if (i_1 < 0)
                                    while (true) {
                                        --i_0;
                                        if (i_0 < 0)
                                            return;

                                        staticMethod486(staticIntArray130, ints_19, 0, 0, i_2, i_5 >> 14, i_4 >> 14, i_8, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                        i_4 += i_26;
                                        i_5 += i_28;
                                        i_8 += i_31;
                                        i_2 += staticInt312;
                                        i_32 += i_34;
                                        i_35 += i_37;
                                        i_38 += i_40;
                                    }

                                staticMethod486(staticIntArray130, ints_19, 0, 0, i_2, i_5 >> 14, i_3 >> 14, i_8, i_30, i_32, i_35, i_38, i_33, i_36, i_39);
                                i_3 += i_27;
                                i_5 += i_28;
                                i_8 += i_31;
                                i_2 += staticInt312;
                                i_32 += i_34;
                                i_35 += i_37;
                                i_38 += i_40;
                            }
                        }
                    }
                }
            }
        }
    }

    static final void staticMethod486(int[] ints_0, int[] ints_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12, int i_13, int i_14) {
        if (staticBool54) {
            if (i_6 > staticInt327)
                i_6 = staticInt327;

            if (i_5 < 0)
                i_5 = 0;
        }

        if (i_5 < i_6) {
            i_4 += i_5;
            i_7 += i_8 * i_5;
            int i_17 = i_6 - i_5;
            int i_15;
            int i_16;
            int i_18;
            int i_19;
            int i_20;
            int i_21;
            int i_22;
            int i_23;
            if (staticBool52) {
                i_23 = i_5 - staticInt325;
                i_9 += i_12 * i_23;
                i_10 += i_13 * i_23;
                i_11 += i_14 * i_23;
                i_22 = i_11 >> 12;
                if (i_22 != 0) {
                    i_18 = i_9 / i_22;
                    i_19 = i_10 / i_22;
                } else {
                    i_18 = 0;
                    i_19 = 0;
                }

                i_9 += i_12 * i_17;
                i_10 += i_13 * i_17;
                i_11 += i_14 * i_17;
                i_22 = i_11 >> 12;
                if (i_22 != 0) {
                    i_20 = i_9 / i_22;
                    i_21 = i_10 / i_22;
                } else {
                    i_20 = 0;
                    i_21 = 0;
                }

                i_2 = (i_18 << 20) + i_19;
                i_16 = ((i_20 - i_18) / i_17 << 20) + (i_21 - i_19) / i_17;
                i_17 >>= 3;
                i_8 <<= 3;
                i_15 = i_7 >> 8;
                if (staticBool55) {
                    if (i_17 > 0)
                        do {
                            i_3 = ints_1[(i_2 & 0xfc0) + (i_2 >>> 26)];
                            ints_0[i_4++] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;
                            i_2 += i_16;
                            i_3 = ints_1[(i_2 & 0xfc0) + (i_2 >>> 26)];
                            ints_0[i_4++] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;
                            i_2 += i_16;
                            i_3 = ints_1[(i_2 & 0xfc0) + (i_2 >>> 26)];
                            ints_0[i_4++] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;
                            i_2 += i_16;
                            i_3 = ints_1[(i_2 & 0xfc0) + (i_2 >>> 26)];
                            ints_0[i_4++] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;
                            i_2 += i_16;
                            i_3 = ints_1[(i_2 & 0xfc0) + (i_2 >>> 26)];
                            ints_0[i_4++] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;
                            i_2 += i_16;
                            i_3 = ints_1[(i_2 & 0xfc0) + (i_2 >>> 26)];
                            ints_0[i_4++] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;
                            i_2 += i_16;
                            i_3 = ints_1[(i_2 & 0xfc0) + (i_2 >>> 26)];
                            ints_0[i_4++] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;
                            i_2 += i_16;
                            i_3 = ints_1[(i_2 & 0xfc0) + (i_2 >>> 26)];
                            ints_0[i_4++] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;
                            i_2 += i_16;
                            i_7 += i_8;
                            i_15 = i_7 >> 8;
                            --i_17;
                        } while (i_17 > 0);

                    i_17 = i_6 - i_5 & 0x7;
                    if (i_17 > 0)
                        do {
                            i_3 = ints_1[(i_2 & 0xfc0) + (i_2 >>> 26)];
                            ints_0[i_4++] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;
                            i_2 += i_16;
                            --i_17;
                        } while (i_17 > 0);
                } else {
                    if (i_17 > 0)
                        do {
                            if ((i_3 = ints_1[(i_2 & 0xfc0) + (i_2 >>> 26)]) != 0)
                                ints_0[i_4] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;

                            ++i_4;
                            i_2 += i_16;
                            if ((i_3 = ints_1[(i_2 & 0xfc0) + (i_2 >>> 26)]) != 0)
                                ints_0[i_4] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;

                            ++i_4;
                            i_2 += i_16;
                            if ((i_3 = ints_1[(i_2 & 0xfc0) + (i_2 >>> 26)]) != 0)
                                ints_0[i_4] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;

                            ++i_4;
                            i_2 += i_16;
                            if ((i_3 = ints_1[(i_2 & 0xfc0) + (i_2 >>> 26)]) != 0)
                                ints_0[i_4] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;

                            ++i_4;
                            i_2 += i_16;
                            if ((i_3 = ints_1[(i_2 & 0xfc0) + (i_2 >>> 26)]) != 0)
                                ints_0[i_4] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;

                            ++i_4;
                            i_2 += i_16;
                            if ((i_3 = ints_1[(i_2 & 0xfc0) + (i_2 >>> 26)]) != 0)
                                ints_0[i_4] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;

                            ++i_4;
                            i_2 += i_16;
                            if ((i_3 = ints_1[(i_2 & 0xfc0) + (i_2 >>> 26)]) != 0)
                                ints_0[i_4] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;

                            ++i_4;
                            i_2 += i_16;
                            if ((i_3 = ints_1[(i_2 & 0xfc0) + (i_2 >>> 26)]) != 0)
                                ints_0[i_4] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;

                            ++i_4;
                            i_2 += i_16;
                            i_7 += i_8;
                            i_15 = i_7 >> 8;
                            --i_17;
                        } while (i_17 > 0);

                    i_17 = i_6 - i_5 & 0x7;
                    if (i_17 > 0)
                        do {
                            if ((i_3 = ints_1[(i_2 & 0xfc0) + (i_2 >>> 26)]) != 0)
                                ints_0[i_4] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;

                            ++i_4;
                            i_2 += i_16;
                            --i_17;
                        } while (i_17 > 0);
                }
            } else {
                i_23 = i_5 - staticInt325;
                i_9 += i_12 * i_23;
                i_10 += i_13 * i_23;
                i_11 += i_14 * i_23;
                i_22 = i_11 >> 14;
                if (i_22 != 0) {
                    i_18 = i_9 / i_22;
                    i_19 = i_10 / i_22;
                } else {
                    i_18 = 0;
                    i_19 = 0;
                }

                i_9 += i_12 * i_17;
                i_10 += i_13 * i_17;
                i_11 += i_14 * i_17;
                i_22 = i_11 >> 14;
                if (i_22 != 0) {
                    i_20 = i_9 / i_22;
                    i_21 = i_10 / i_22;
                } else {
                    i_20 = 0;
                    i_21 = 0;
                }

                i_2 = (i_18 << 18) + i_19;
                i_16 = ((i_20 - i_18) / i_17 << 18) + (i_21 - i_19) / i_17;
                i_17 >>= 3;
                i_8 <<= 3;
                i_15 = i_7 >> 8;
                if (staticBool55) {
                    if (i_17 > 0)
                        do {
                            i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)];
                            ints_0[i_4++] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;
                            i_2 += i_16;
                            i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)];
                            ints_0[i_4++] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;
                            i_2 += i_16;
                            i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)];
                            ints_0[i_4++] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;
                            i_2 += i_16;
                            i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)];
                            ints_0[i_4++] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;
                            i_2 += i_16;
                            i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)];
                            ints_0[i_4++] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;
                            i_2 += i_16;
                            i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)];
                            ints_0[i_4++] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;
                            i_2 += i_16;
                            i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)];
                            ints_0[i_4++] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;
                            i_2 += i_16;
                            i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)];
                            ints_0[i_4++] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;
                            i_2 += i_16;
                            i_7 += i_8;
                            i_15 = i_7 >> 8;
                            --i_17;
                        } while (i_17 > 0);

                    i_17 = i_6 - i_5 & 0x7;
                    if (i_17 > 0)
                        do {
                            i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)];
                            ints_0[i_4++] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;
                            i_2 += i_16;
                            --i_17;
                        } while (i_17 > 0);
                } else {
                    if (i_17 > 0)
                        do {
                            if ((i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)]) != 0)
                                ints_0[i_4] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;

                            ++i_4;
                            i_2 += i_16;
                            if ((i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)]) != 0)
                                ints_0[i_4] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;

                            ++i_4;
                            i_2 += i_16;
                            if ((i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)]) != 0)
                                ints_0[i_4] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;

                            ++i_4;
                            i_2 += i_16;
                            if ((i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)]) != 0)
                                ints_0[i_4] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;

                            ++i_4;
                            i_2 += i_16;
                            if ((i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)]) != 0)
                                ints_0[i_4] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;

                            ++i_4;
                            i_2 += i_16;
                            if ((i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)]) != 0)
                                ints_0[i_4] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;

                            ++i_4;
                            i_2 += i_16;
                            if ((i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)]) != 0)
                                ints_0[i_4] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;

                            ++i_4;
                            i_2 += i_16;
                            if ((i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)]) != 0)
                                ints_0[i_4] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;

                            ++i_4;
                            i_2 += i_16;
                            i_7 += i_8;
                            i_15 = i_7 >> 8;
                            --i_17;
                        } while (i_17 > 0);

                    i_17 = i_6 - i_5 & 0x7;
                    if (i_17 > 0)
                        do {
                            if ((i_3 = ints_1[(i_2 & 0x3f80) + (i_2 >>> 25)]) != 0)
                                ints_0[i_4] = ((i_3 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_3 & 0xff00) * i_15 & 0xff0000) >> 8;

                            ++i_4;
                            i_2 += i_16;
                            --i_17;
                        } while (i_17 > 0);
                }
            }

        }
    }

    static final int staticMethod487(int i_0, int i_1) {
        i_1 = i_1 * (i_0 & 0x7f) >> 7;
        if (i_1 < 2)
            i_1 = 2;
        else if (i_1 > 126)
            i_1 = 126;

        return (i_0 & 0xff80) + i_1;
    }

    static final int staticMethod488(int i_0, int i_1, int i_2, int i_3) {
        return i_0 * i_2 + i_1 * i_3 >> 16;
    }

    static final int staticMethod489(int i_0, int i_1, int i_2, int i_3) {
        return i_1 * i_2 - i_0 * i_3 >> 16;
    }

    static final int staticMethod490(int i_0, int i_1, int i_2, int i_3) {
        return i_0 * i_2 - i_1 * i_3 >> 16;
    }

    static final int staticMethod491(int i_0, int i_1, int i_2, int i_3) {
        return i_0 * i_3 + i_1 * i_2 >> 16;
    }

    static final int staticMethod492(int i_0, int i_1, int i_2, int i_3) {
        return i_0 * i_2 + i_1 * i_3 >> 16;
    }

    static final int staticMethod493(int i_0, int i_1, int i_2, int i_3) {
        return i_1 * i_2 - i_0 * i_3 >> 16;
    }

}

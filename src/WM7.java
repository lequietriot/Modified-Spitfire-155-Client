public class WM7 {

    static int staticInt13;
    protected static boolean staticBool2;
    int int51;
    int int50;
    int[][] intArrayArray4;
    int[][] intArrayArray1;
    int[][] intArrayArray2;
    int[][] intArrayArray3;

    WM7(int i_1, int i_2) {
        int51 = i_1;
        int50 = i_2;
        intArrayArray4 = new int[i_1][i_2];
        intArrayArray1 = new int[i_1][i_2];
        intArrayArray2 = new int[i_1][i_2];
        intArrayArray3 = new int[i_1][i_2];
    }

    void method24(int i_1, int i_2, int i_3, Underlay underlay_4) {
        if (underlay_4 != null)
            if (i_1 + i_3 >= 0 && i_3 + i_2 >= 0)
                if (i_1 - i_3 <= int51 && i_2 - i_3 <= int50) {
                    int i_6 = Math.max(0, i_1 - i_3);
                    int i_7 = Math.min(int51, i_1 + i_3);
                    int i_8 = Math.max(0, i_2 - i_3);
                    int i_9 = Math.min(int50, i_3 + i_2);

                    for (int i_10 = i_6; i_10 < i_7; i_10++)
                        for (int i_11 = i_8; i_11 < i_9; i_11++) {
                            intArrayArray4[i_10][i_11] += underlay_4.int580 * 256 / underlay_4.int584;
                            intArrayArray1[i_10][i_11] += underlay_4.int582;
                            intArrayArray2[i_10][i_11] += underlay_4.int583;
                            ++intArrayArray3[i_10][i_11];
                        }

                }
    }

    int method25(int i_1, int i_2) {
        if (i_1 >= 0 && i_2 >= 0 && i_1 < int51 && i_2 < int50) {
            if (intArrayArray2[i_1][i_2] == 0)
                return 0;
            else {
                int i_4 = intArrayArray4[i_1][i_2] / intArrayArray3[i_1][i_2];
                int i_5 = intArrayArray1[i_1][i_2] / intArrayArray3[i_1][i_2];
                int i_6 = intArrayArray2[i_1][i_2] / intArrayArray3[i_1][i_2];
                double d_8 = i_4 / 256.0D;
                double d_10 = i_5 / 256.0D;
                double d_12 = i_6 / 256.0D;
                double d_14 = d_12;
                double d_16 = d_12;
                double d_18 = d_12;
                if (d_10 != 0.0D) {
                    double d_20;
                    if (d_12 < 0.5D)
                        d_20 = d_12 * (d_10 + 1.0D);
                    else
                        d_20 = d_10 + d_12 - d_10 * d_12;

                    double d_22 = 2.0D * d_12 - d_20;
                    double d_24 = d_8 + 0.3333333333333333D;
                    if (d_24 > 1.0D)
                        --d_24;

                    double d_28 = d_8 - 0.3333333333333333D;
                    if (d_28 < 0.0D)
                        ++d_28;

                    if (d_24 * 6.0D < 1.0D)
                        d_14 = d_22 + (d_20 - d_22) * 6.0D * d_24;
                    else if (2.0D * d_24 < 1.0D)
                        d_14 = d_20;
                    else if (3.0D * d_24 < 2.0D)
                        d_14 = d_22 + (d_20 - d_22) * (0.6666666666666666D - d_24) * 6.0D;
                    else
                        d_14 = d_22;

                    if (d_8 * 6.0D < 1.0D)
                        d_16 = (d_20 - d_22) * 6.0D * d_8 + d_22;
                    else if (d_8 * 2.0D < 1.0D)
                        d_16 = d_20;
                    else if (3.0D * d_8 < 2.0D)
                        d_16 = (0.6666666666666666D - d_8) * (d_20 - d_22) * 6.0D + d_22;
                    else
                        d_16 = d_22;

                    if (d_28 * 6.0D < 1.0D)
                        d_18 = d_22 + 6.0D * (d_20 - d_22) * d_28;
                    else if (2.0D * d_28 < 1.0D)
                        d_18 = d_20;
                    else if (d_28 * 3.0D < 2.0D)
                        d_18 = d_22 + 6.0D * (d_20 - d_22) * (0.6666666666666666D - d_28);
                    else
                        d_18 = d_22;
                }

                int i_30 = (int) (d_14 * 256.0D);
                int i_21 = (int) (d_16 * 256.0D);
                int i_31 = (int) (d_18 * 256.0D);
                int i_23 = i_31 + (i_21 << 8) + (i_30 << 16);
                return i_23;
            }
        } else
            return 0;
    }

    static final void staticMethod3(int i_0, int i_1, int i_2, int i_3, Sprite sprite_4, CacheableSub1 cacheablesub1_5) {
        if (sprite_4 != null) {
            int i_7 = Client.staticInt207 & 0x7ff;
            int i_8 = i_2 * i_2 + i_3 * i_3;
            if (i_8 <= 6400) {
                int i_9 = Rasterizer3D.staticIntArray156[i_7];
                int i_10 = Rasterizer3D.staticIntArray159[i_7];
                int i_11 = i_2 * i_10 + i_9 * i_3 >> 16;
                int i_12 = i_3 * i_10 - i_2 * i_9 >> 16;
                if (i_8 > 2500)
                    sprite_4.method689(cacheablesub1_5.int512 / 2 + i_11 - sprite_4.newWidth / 2, cacheablesub1_5.int511 / 2 - i_12 - sprite_4.newHeight / 2, i_0, i_1, cacheablesub1_5.int512, cacheablesub1_5.int511, cacheablesub1_5.intArray83, cacheablesub1_5.intArray82);
                else
                    sprite_4.method684(cacheablesub1_5.int512 / 2 + i_0 + i_11 - sprite_4.newWidth / 2, cacheablesub1_5.int511 / 2 + i_1 - i_12 - sprite_4.newHeight / 2);

            }
        }
    }

}

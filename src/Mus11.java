public class Mus11 {

    int int91;
    int int90;
    int[] intArray2;
    int[] intArray3;
    float[][] floatArrayArray1;
    int[] intArray4;

    static int staticMethod43(int i_0, int i_1) {
        int i_2;
        for (i_2 = (int) Math.pow(i_0, 1.0D / i_1) + 1; StaticClass25.staticMethod145(i_2, i_1) > i_0; --i_2)
            ;

        return i_2;
    }

    Mus11() {
        Sfx1.staticMethod372(24);
        int91 = Sfx1.staticMethod372(16);
        int90 = Sfx1.staticMethod372(24);
        intArray2 = new int[int90];
        boolean bool_1 = Sfx1.staticMethod371() != 0;
        int i_2;
        int i_3;
        int i_5;
        if (bool_1) {
            i_2 = 0;

            for (i_3 = Sfx1.staticMethod372(5) + 1; i_2 < int90; i_3++) {
                int i_4 = Sfx1.staticMethod372(StaticClass25.staticMethod150(int90 - i_2));

                for (i_5 = 0; i_5 < i_4; i_5++)
                    intArray2[i_2++] = i_3;
            }
        } else {
            boolean bool_14 = Sfx1.staticMethod371() != 0;

            for (i_3 = 0; i_3 < int90; i_3++)
                if (bool_14 && Sfx1.staticMethod371() == 0)
                    intArray2[i_3] = 0;
                else
                    intArray2[i_3] = Sfx1.staticMethod372(5) + 1;
        }

        method126();
        i_2 = Sfx1.staticMethod372(4);
        if (i_2 > 0) {
            float f_15 = Sfx1.staticMethod369(Sfx1.staticMethod372(32));
            float f_16 = Sfx1.staticMethod369(Sfx1.staticMethod372(32));
            i_5 = Sfx1.staticMethod372(4) + 1;
            boolean bool_6 = Sfx1.staticMethod371() != 0;
            int i_7;
            if (i_2 == 1)
                i_7 = staticMethod43(int90, int91);
            else
                i_7 = int90 * int91;

            intArray3 = new int[i_7];

            int i_8;
            for (i_8 = 0; i_8 < i_7; i_8++)
                intArray3[i_8] = Sfx1.staticMethod372(i_5);

            floatArrayArray1 = new float[int90][int91];
            float f_9;
            int i_10;
            int i_11;
            if (i_2 == 1)
                for (i_8 = 0; i_8 < int90; i_8++) {
                    f_9 = 0.0F;
                    i_10 = 1;

                    for (i_11 = 0; i_11 < int91; i_11++) {
                        int i_12 = i_8 / i_10 % i_7;
                        float f_13 = intArray3[i_12] * f_16 + f_15 + f_9;
                        floatArrayArray1[i_8][i_11] = f_13;
                        if (bool_6)
                            f_9 = f_13;

                        i_10 *= i_7;
                    }
                }
            else
                for (i_8 = 0; i_8 < int90; i_8++) {
                    f_9 = 0.0F;
                    i_10 = i_8 * int91;

                    for (i_11 = 0; i_11 < int91; i_11++) {
                        float f_17 = intArray3[i_10] * f_16 + f_15 + f_9;
                        floatArrayArray1[i_8][i_11] = f_17;
                        if (bool_6)
                            f_9 = f_17;

                        ++i_10;
                    }
                }
        }

    }

    void method126() {
        int[] ints_1 = new int[int90];
        int[] ints_2 = new int[33];

        int i_3;
        int i_4;
        int i_5;
        int i_6;
        int i_7;
        int i_8;
        int i_10;
        for (i_3 = 0; i_3 < int90; i_3++) {
            i_4 = intArray2[i_3];
            if (i_4 != 0) {
                i_5 = 1 << 32 - i_4;
                i_6 = ints_2[i_4];
                ints_1[i_3] = i_6;
                int i_9;
                if ((i_6 & i_5) != 0)
                    i_7 = ints_2[i_4 - 1];
                else {
                    i_7 = i_6 | i_5;

                    for (i_8 = i_4 - 1; i_8 >= 1; --i_8) {
                        i_9 = ints_2[i_8];
                        if (i_9 != i_6)
                            break;

                        i_10 = 1 << 32 - i_8;
                        if ((i_9 & i_10) != 0) {
                            ints_2[i_8] = ints_2[i_8 - 1];
                            break;
                        }

                        ints_2[i_8] = i_9 | i_10;
                    }
                }

                ints_2[i_4] = i_7;

                for (i_8 = i_4 + 1; i_8 <= 32; i_8++) {
                    i_9 = ints_2[i_8];
                    if (i_9 == i_6)
                        ints_2[i_8] = i_7;
                }
            }
        }

        intArray4 = new int[8];
        int i_11 = 0;

        for (i_3 = 0; i_3 < int90; i_3++) {
            i_4 = intArray2[i_3];
            if (i_4 != 0) {
                i_5 = ints_1[i_3];
                i_6 = 0;

                for (i_7 = 0; i_7 < i_4; i_7++) {
                    i_8 = Integer.MIN_VALUE >>> i_7;
                    if ((i_5 & i_8) != 0) {
                        if (intArray4[i_6] == 0)
                            intArray4[i_6] = i_11;

                        i_6 = intArray4[i_6];
                    } else
                        ++i_6;

                    if (i_6 >= intArray4.length) {
                        int[] ints_12 = new int[intArray4.length * 2];

                        for (i_10 = 0; i_10 < intArray4.length; i_10++)
                            ints_12[i_10] = intArray4[i_10];

                        intArray4 = ints_12;
                    }

                    i_8 >>>= 1;
                }

                intArray4[i_6] = ~i_3;
                if (i_6 >= i_11)
                    i_11 = i_6 + 1;
            }
        }

    }

    int method127() {
        int i_1;
        for (i_1 = 0; intArray4[i_1] >= 0; i_1 = Sfx1.staticMethod371() != 0 ? intArray4[i_1] : i_1 + 1)
            ;

        return ~intArray4[i_1];
    }

    float[] method128() {
        return floatArrayArray1[method127()];
    }

}

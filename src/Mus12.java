public class Mus12 {

    int int120 = Sfx1.staticMethod372(16);
    int int118 = Sfx1.staticMethod372(24);
    int int122 = Sfx1.staticMethod372(24);
    int int119 = Sfx1.staticMethod372(24) + 1;
    int int121 = Sfx1.staticMethod372(6) + 1;
    int int123 = Sfx1.staticMethod372(8);
    int[] intArray18;

    Mus12() {
        int[] ints_1 = new int[int121];

        int i_2;
        for (i_2 = 0; i_2 < int121; i_2++) {
            int i_3 = 0;
            int i_4 = Sfx1.staticMethod372(3);
            boolean bool_5 = Sfx1.staticMethod371() != 0;
            if (bool_5)
                i_3 = Sfx1.staticMethod372(5);

            ints_1[i_2] = i_3 << 3 | i_4;
        }

        intArray18 = new int[int121 * 8];

        for (i_2 = 0; i_2 < int121 * 8; i_2++)
            intArray18[i_2] = (ints_1[i_2 >> 3] & 1 << (i_2 & 0x7)) != 0 ? Sfx1.staticMethod372(8) : -1;

    }

    void method148(float[] floats_1, int i_2, boolean bool_3) {
        int i_4;
        for (i_4 = 0; i_4 < i_2; i_4++)
            floats_1[i_4] = 0.0F;

        if (!bool_3) {
            i_4 = Sfx1.staticMus11Array1[int123].int91;
            int i_5 = int122 - int118;
            int i_6 = i_5 / int119;
            int[] ints_7 = new int[i_6];

            for (int i_8 = 0; i_8 < 8; i_8++) {
                int i_9 = 0;

                while (i_9 < i_6) {
                    int i_10;
                    int i_11;
                    if (i_8 == 0) {
                        i_10 = Sfx1.staticMus11Array1[int123].method127();

                        for (i_11 = i_4 - 1; i_11 >= 0; --i_11) {
                            if (i_9 + i_11 < i_6)
                                ints_7[i_9 + i_11] = i_10 % int121;

                            i_10 /= int121;
                        }
                    }

                    for (i_10 = 0; i_10 < i_4; i_10++) {
                        i_11 = ints_7[i_9];
                        int i_12 = intArray18[i_11 * 8 + i_8];
                        if (i_12 >= 0) {
                            int i_13 = int118 + i_9 * int119;
                            Mus11 mus11_14 = Sfx1.staticMus11Array1[i_12];
                            int i_15;
                            if (int120 == 0) {
                                i_15 = int119 / mus11_14.int91;

                                for (int i_19 = 0; i_19 < i_15; i_19++) {
                                    float[] floats_20 = mus11_14.method128();

                                    for (int i_18 = 0; i_18 < mus11_14.int91; i_18++)
                                        floats_1[i_13 + i_19 + i_18 * i_15] += floats_20[i_18];
                                }
                            } else {
                                i_15 = 0;

                                while (i_15 < int119) {
                                    float[] floats_16 = mus11_14.method128();

                                    for (int i_17 = 0; i_17 < mus11_14.int91; i_17++) {
                                        floats_1[i_13 + i_15] += floats_16[i_17];
                                        ++i_15;
                                    }
                                }
                            }
                        }

                        ++i_9;
                        if (i_9 >= i_6)
                            break;
                    }
                }
            }

        }
    }

}

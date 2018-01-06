public final class DataClass4 {

    static int[] staticIntArray32 = new int[6];
    static int[] staticIntArray31 = new int[6];
    static int[] staticIntArray28 = new int[6];
    static int[] staticIntArray30 = new int[6];
    static int[] staticIntArray29 = new int[6];
    static final int[][] staticIntArrayArray5 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };
    static final int[][] staticIntArrayArray4 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };
    boolean bool13 = true;
    int int114;
    int int115;
    int int116;
    int int117;
    int[] intArray16;
    int[] intArray17;
    int[] intArray8;
    int[] intArray12;
    int[] intArray13;
    int[] intArray15;
    int[] intArray9;
    int[] intArray10;
    int[] intArray11;
    int[] intArray14;

    DataClass4(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12, int i_13, int i_14, int i_15, int i_16, int i_17, int i_18, int i_19) {
        if (i_6 != i_7 || i_6 != i_8 || i_6 != i_9)
            bool13 = false;

        int114 = i_1;
        int115 = i_2;
        int116 = i_18;
        int117 = i_19;
        short s_20 = 128;
        int i_21 = s_20 / 2;
        int i_22 = s_20 / 4;
        int i_23 = s_20 * 3 / 4;
        int[] ints_24 = staticIntArrayArray5[i_1];
        int i_25 = ints_24.length;
        intArray16 = new int[i_25];
        intArray17 = new int[i_25];
        intArray8 = new int[i_25];
        int[] ints_26 = new int[i_25];
        int[] ints_27 = new int[i_25];
        int i_28 = i_4 * s_20;
        int i_29 = i_5 * s_20;

        int i_31;
        int i_32;
        int i_33;
        int i_34;
        int i_35;
        int i_36;
        for (int i_30 = 0; i_30 < i_25; i_30++) {
            i_31 = ints_24[i_30];
            if ((i_31 & 0x1) == 0 && i_31 <= 8)
                i_31 = (i_31 - i_2 - i_2 - 1 & 0x7) + 1;

            if (i_31 > 8 && i_31 <= 12)
                i_31 = (i_31 - 9 - i_2 & 0x3) + 9;

            if (i_31 > 12 && i_31 <= 16)
                i_31 = (i_31 - 13 - i_2 & 0x3) + 13;

            if (i_31 == 1) {
                i_32 = i_28;
                i_33 = i_29;
                i_34 = i_6;
                i_35 = i_10;
                i_36 = i_14;
            } else if (i_31 == 2) {
                i_32 = i_28 + i_21;
                i_33 = i_29;
                i_34 = i_6 + i_7 >> 1;
                i_35 = i_10 + i_11 >> 1;
                i_36 = i_14 + i_15 >> 1;
            } else if (i_31 == 3) {
                i_32 = i_28 + s_20;
                i_33 = i_29;
                i_34 = i_7;
                i_35 = i_11;
                i_36 = i_15;
            } else if (i_31 == 4) {
                i_32 = i_28 + s_20;
                i_33 = i_29 + i_21;
                i_34 = i_7 + i_8 >> 1;
                i_35 = i_11 + i_12 >> 1;
                i_36 = i_15 + i_16 >> 1;
            } else if (i_31 == 5) {
                i_32 = i_28 + s_20;
                i_33 = i_29 + s_20;
                i_34 = i_8;
                i_35 = i_12;
                i_36 = i_16;
            } else if (i_31 == 6) {
                i_32 = i_28 + i_21;
                i_33 = i_29 + s_20;
                i_34 = i_8 + i_9 >> 1;
                i_35 = i_12 + i_13 >> 1;
                i_36 = i_16 + i_17 >> 1;
            } else if (i_31 == 7) {
                i_32 = i_28;
                i_33 = i_29 + s_20;
                i_34 = i_9;
                i_35 = i_13;
                i_36 = i_17;
            } else if (i_31 == 8) {
                i_32 = i_28;
                i_33 = i_29 + i_21;
                i_34 = i_9 + i_6 >> 1;
                i_35 = i_13 + i_10 >> 1;
                i_36 = i_17 + i_14 >> 1;
            } else if (i_31 == 9) {
                i_32 = i_28 + i_21;
                i_33 = i_29 + i_22;
                i_34 = i_6 + i_7 >> 1;
                i_35 = i_10 + i_11 >> 1;
                i_36 = i_14 + i_15 >> 1;
            } else if (i_31 == 10) {
                i_32 = i_28 + i_23;
                i_33 = i_29 + i_21;
                i_34 = i_7 + i_8 >> 1;
                i_35 = i_11 + i_12 >> 1;
                i_36 = i_15 + i_16 >> 1;
            } else if (i_31 == 11) {
                i_32 = i_28 + i_21;
                i_33 = i_29 + i_23;
                i_34 = i_8 + i_9 >> 1;
                i_35 = i_12 + i_13 >> 1;
                i_36 = i_16 + i_17 >> 1;
            } else if (i_31 == 12) {
                i_32 = i_28 + i_22;
                i_33 = i_29 + i_21;
                i_34 = i_9 + i_6 >> 1;
                i_35 = i_13 + i_10 >> 1;
                i_36 = i_17 + i_14 >> 1;
            } else if (i_31 == 13) {
                i_32 = i_28 + i_22;
                i_33 = i_29 + i_22;
                i_34 = i_6;
                i_35 = i_10;
                i_36 = i_14;
            } else if (i_31 == 14) {
                i_32 = i_28 + i_23;
                i_33 = i_29 + i_22;
                i_34 = i_7;
                i_35 = i_11;
                i_36 = i_15;
            } else if (i_31 == 15) {
                i_32 = i_28 + i_23;
                i_33 = i_29 + i_23;
                i_34 = i_8;
                i_35 = i_12;
                i_36 = i_16;
            } else {
                i_32 = i_28 + i_22;
                i_33 = i_29 + i_23;
                i_34 = i_9;
                i_35 = i_13;
                i_36 = i_17;
            }

            intArray16[i_30] = i_32;
            intArray17[i_30] = i_34;
            intArray8[i_30] = i_33;
            ints_26[i_30] = i_35;
            ints_27[i_30] = i_36;
        }

        int[] ints_38 = staticIntArrayArray4[i_1];
        i_31 = ints_38.length / 4;
        intArray12 = new int[i_31];
        intArray13 = new int[i_31];
        intArray15 = new int[i_31];
        intArray9 = new int[i_31];
        intArray10 = new int[i_31];
        intArray11 = new int[i_31];
        if (i_3 != -1)
            intArray14 = new int[i_31];

        i_32 = 0;

        for (i_33 = 0; i_33 < i_31; i_33++) {
            i_34 = ints_38[i_32];
            i_35 = ints_38[i_32 + 1];
            i_36 = ints_38[i_32 + 2];
            int i_37 = ints_38[i_32 + 3];
            i_32 += 4;
            if (i_35 < 4)
                i_35 = i_35 - i_2 & 0x3;

            if (i_36 < 4)
                i_36 = i_36 - i_2 & 0x3;

            if (i_37 < 4)
                i_37 = i_37 - i_2 & 0x3;

            intArray12[i_33] = i_35;
            intArray13[i_33] = i_36;
            intArray15[i_33] = i_37;
            if (i_34 == 0) {
                intArray9[i_33] = ints_26[i_35];
                intArray10[i_33] = ints_26[i_36];
                intArray11[i_33] = ints_26[i_37];
                if (intArray14 != null)
                    intArray14[i_33] = -1;
            } else {
                intArray9[i_33] = ints_27[i_35];
                intArray10[i_33] = ints_27[i_36];
                intArray11[i_33] = ints_27[i_37];
                if (intArray14 != null)
                    intArray14[i_33] = i_3;
            }
        }

        i_33 = i_6;
        i_34 = i_7;
        if (i_7 < i_6)
            i_33 = i_7;

        if (i_7 > i_7)
            i_34 = i_7;

        if (i_8 < i_33)
            i_33 = i_8;

        if (i_8 > i_34)
            i_34 = i_8;

        if (i_9 < i_33)
            i_33 = i_9;

        if (i_9 > i_34)
            i_34 = i_9;

        i_33 /= 14;
        i_34 /= 14;
    }

}

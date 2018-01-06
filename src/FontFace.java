public final class FontFace extends TypeFace {

    public FontFace(byte[] bytes_1, int[] ints_2, int[] ints_3, int[] ints_4, int[] ints_5, int[] ints_6, byte[][] bytes_7) {
        super(bytes_1, ints_2, ints_3, ints_4, ints_5, ints_6, bytes_7);
    }

    public FontFace(byte[] bytes_1) {
        super(bytes_1);
    }

    @Override
    final void method658(byte[] bytes_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        int i_7 = i_2 + i_3 * staticInt312;
        int i_8 = staticInt312 - i_4;
        int i_9 = 0;
        int i_10 = 0;
        int i_11;
        if (i_3 < staticInt311) {
            i_11 = staticInt311 - i_3;
            i_5 -= i_11;
            i_3 = staticInt311;
            i_10 += i_11 * i_4;
            i_7 += i_11 * staticInt312;
        }

        if (i_3 + i_5 > staticInt315)
            i_5 -= i_3 + i_5 - staticInt315;

        if (i_2 < staticInt316) {
            i_11 = staticInt316 - i_2;
            i_4 -= i_11;
            i_2 = staticInt316;
            i_10 += i_11;
            i_7 += i_11;
            i_9 += i_11;
            i_8 += i_11;
        }

        if (i_2 + i_4 > staticInt314) {
            i_11 = i_2 + i_4 - staticInt314;
            i_4 -= i_11;
            i_9 += i_11;
            i_8 += i_11;
        }

        if (i_4 > 0 && i_5 > 0)
            staticMethod497(staticIntArray130, bytes_1, i_6, i_10, i_7, i_4, i_5, i_8, i_9);
    }

    @Override
    final void method659(byte[] bytes_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
        int i_8 = i_2 + i_3 * staticInt312;
        int i_9 = staticInt312 - i_4;
        int i_10 = 0;
        int i_11 = 0;
        int i_12;
        if (i_3 < staticInt311) {
            i_12 = staticInt311 - i_3;
            i_5 -= i_12;
            i_3 = staticInt311;
            i_11 += i_12 * i_4;
            i_8 += i_12 * staticInt312;
        }

        if (i_3 + i_5 > staticInt315)
            i_5 -= i_3 + i_5 - staticInt315;

        if (i_2 < staticInt316) {
            i_12 = staticInt316 - i_2;
            i_4 -= i_12;
            i_2 = staticInt316;
            i_11 += i_12;
            i_8 += i_12;
            i_10 += i_12;
            i_9 += i_12;
        }

        if (i_2 + i_4 > staticInt314) {
            i_12 = i_2 + i_4 - staticInt314;
            i_4 -= i_12;
            i_10 += i_12;
            i_9 += i_12;
        }

        if (i_4 > 0 && i_5 > 0)
            staticMethod499(staticIntArray130, bytes_1, i_6, i_11, i_8, i_4, i_5, i_9, i_10, i_7);
    }

}

public final class IndexedSprite extends Rasterizer2D {

    public int[] intArray115;
    public int int677;
    public int int678;
    public byte[] indices;
    public int width;
    public int height;
    public int xoffset;
    public int yoffset;

    public void method671() {
        if (width != int677 || height != int678) {
            byte[] bytes_1 = new byte[int677 * int678];
            int i_2 = 0;

            for (int i_3 = 0; i_3 < height; i_3++)
                for (int i_4 = 0; i_4 < width; i_4++)
                    bytes_1[i_4 + xoffset + (i_3 + yoffset) * int677] = indices[i_2++];

            indices = bytes_1;
            width = int677;
            height = int678;
            xoffset = 0;
            yoffset = 0;
        }
    }

    public void method672(int i_1, int i_2, int i_3) {
        for (int i_4 = 0; i_4 < intArray115.length; i_4++) {
            int i_5 = intArray115[i_4] >> 16 & 0xff;
            i_5 += i_1;
            if (i_5 < 0)
                i_5 = 0;
            else if (i_5 > 255)
                i_5 = 255;

            int i_6 = intArray115[i_4] >> 8 & 0xff;
            i_6 += i_2;
            if (i_6 < 0)
                i_6 = 0;
            else if (i_6 > 255)
                i_6 = 255;

            int i_7 = intArray115[i_4] & 0xff;
            i_7 += i_3;
            if (i_7 < 0)
                i_7 = 0;
            else if (i_7 > 255)
                i_7 = 255;

            intArray115[i_4] = (i_5 << 16) + (i_6 << 8) + i_7;
        }

    }

    public void method673(int i_1, int i_2) {
        i_1 += xoffset;
        i_2 += yoffset;
        int i_3 = i_1 + i_2 * staticInt312;
        int i_4 = 0;
        int i_5 = height;
        int i_6 = width;
        int i_7 = staticInt312 - i_6;
        int i_8 = 0;
        int i_9;
        if (i_2 < staticInt311) {
            i_9 = staticInt311 - i_2;
            i_5 -= i_9;
            i_2 = staticInt311;
            i_4 += i_9 * i_6;
            i_3 += i_9 * staticInt312;
        }

        if (i_2 + i_5 > staticInt315)
            i_5 -= i_2 + i_5 - staticInt315;

        if (i_1 < staticInt316) {
            i_9 = staticInt316 - i_1;
            i_6 -= i_9;
            i_1 = staticInt316;
            i_4 += i_9;
            i_3 += i_9;
            i_8 += i_9;
            i_7 += i_9;
        }

        if (i_1 + i_6 > staticInt314) {
            i_9 = i_1 + i_6 - staticInt314;
            i_6 -= i_9;
            i_8 += i_9;
            i_7 += i_9;
        }

        if (i_6 > 0 && i_5 > 0)
            staticMethod500(staticIntArray130, indices, intArray115, i_4, i_3, i_6, i_5, i_7, i_8);
    }

    static void staticMethod500(int[] ints_0, byte[] bytes_1, int[] ints_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
        int i_9 = -(i_5 >> 2);
        i_5 = -(i_5 & 0x3);

        for (int i_10 = -i_6; i_10 < 0; i_10++) {
            int i_11;
            byte b_12;
            for (i_11 = i_9; i_11 < 0; i_11++) {
                b_12 = bytes_1[i_3++];
                if (b_12 != 0)
                    ints_0[i_4++] = ints_2[b_12 & 0xff];
                else
                    ++i_4;

                b_12 = bytes_1[i_3++];
                if (b_12 != 0)
                    ints_0[i_4++] = ints_2[b_12 & 0xff];
                else
                    ++i_4;

                b_12 = bytes_1[i_3++];
                if (b_12 != 0)
                    ints_0[i_4++] = ints_2[b_12 & 0xff];
                else
                    ++i_4;

                b_12 = bytes_1[i_3++];
                if (b_12 != 0)
                    ints_0[i_4++] = ints_2[b_12 & 0xff];
                else
                    ++i_4;
            }

            for (i_11 = i_5; i_11 < 0; i_11++) {
                b_12 = bytes_1[i_3++];
                if (b_12 != 0)
                    ints_0[i_4++] = ints_2[b_12 & 0xff];
                else
                    ++i_4;
            }

            i_4 += i_7;
            i_3 += i_8;
        }

    }

    public void method674(int i_1, int i_2, int i_3, int i_4) {
        int i_5 = width;
        int i_6 = height;
        int i_7 = 0;
        int i_8 = 0;
        int i_9 = int677;
        int i_10 = int678;
        int i_11 = (i_9 << 16) / i_3;
        int i_12 = (i_10 << 16) / i_4;
        int i_13;
        if (xoffset > 0) {
            i_13 = ((xoffset << 16) + i_11 - 1) / i_11;
            i_1 += i_13;
            i_7 += i_13 * i_11 - (xoffset << 16);
        }

        if (yoffset > 0) {
            i_13 = ((yoffset << 16) + i_12 - 1) / i_12;
            i_2 += i_13;
            i_8 += i_13 * i_12 - (yoffset << 16);
        }

        if (i_5 < i_9)
            i_3 = ((i_5 << 16) - i_7 + i_11 - 1) / i_11;

        if (i_6 < i_10)
            i_4 = ((i_6 << 16) - i_8 + i_12 - 1) / i_12;

        i_13 = i_1 + i_2 * staticInt312;
        int i_14 = staticInt312 - i_3;
        if (i_2 + i_4 > staticInt315)
            i_4 -= i_2 + i_4 - staticInt315;

        int i_15;
        if (i_2 < staticInt311) {
            i_15 = staticInt311 - i_2;
            i_4 -= i_15;
            i_13 += i_15 * staticInt312;
            i_8 += i_12 * i_15;
        }

        if (i_1 + i_3 > staticInt314) {
            i_15 = i_1 + i_3 - staticInt314;
            i_3 -= i_15;
            i_14 += i_15;
        }

        if (i_1 < staticInt316) {
            i_15 = staticInt316 - i_1;
            i_3 -= i_15;
            i_13 += i_15;
            i_7 += i_11 * i_15;
            i_14 += i_15;
        }

        staticMethod501(staticIntArray130, indices, intArray115, i_7, i_8, i_13, i_14, i_3, i_4, i_11, i_12, i_5);
    }

    static void staticMethod501(int[] ints_0, byte[] bytes_1, int[] ints_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11) {
        int i_12 = i_3;

        for (int i_13 = -i_8; i_13 < 0; i_13++) {
            int i_14 = (i_4 >> 16) * i_11;

            for (int i_15 = -i_7; i_15 < 0; i_15++) {
                byte b_16 = bytes_1[(i_3 >> 16) + i_14];
                if (b_16 != 0)
                    ints_0[i_5++] = ints_2[b_16 & 0xff];
                else
                    ++i_5;

                i_3 += i_9;
            }

            i_4 += i_10;
            i_3 = i_12;
            i_5 += i_6;
        }

    }

}

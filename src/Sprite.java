public final class Sprite extends Rasterizer2D {

    public int[] pixels;
    public int newWidth;
    public int width;
    public int newHeight;
    public int height;
    int yoffset;
    public int xoffset;

    Sprite() {
    }

    public Sprite(int i_1, int i_2) {
        this(new int[i_1 * i_2], i_1, i_2);
    }

    public Sprite(int[] ints_1, int i_2, int i_3) {
        pixels = ints_1;
        width = newWidth = i_2;
        height = newHeight = i_3;
        yoffset = 0;
        xoffset = 0;
    }

    public Sprite method675() {
        Sprite sprite_1 = new Sprite(width, height);
        sprite_1.newWidth = newWidth;
        sprite_1.newHeight = newHeight;
        sprite_1.xoffset = newWidth - width - xoffset;
        sprite_1.yoffset = yoffset;

        for (int i_2 = 0; i_2 < height; i_2++)
            for (int i_3 = 0; i_3 < width; i_3++)
                sprite_1.pixels[i_2 * width + i_3] = pixels[i_2 * width + width - 1 - i_3];

        return sprite_1;
    }

    public Sprite method676() {
        Sprite sprite_1 = new Sprite(newWidth, newHeight);

        for (int i_2 = 0; i_2 < height; i_2++)
            for (int i_3 = 0; i_3 < width; i_3++)
                sprite_1.pixels[(i_2 + yoffset) * newWidth + i_3 + xoffset] = pixels[i_2 * width + i_3];

        return sprite_1;
    }

    public void setRasterizerTarget() {
        staticMethod440(pixels, width, height);
    }

    public void method677() {
        if (width != newWidth || height != newHeight) {
            int[] ints_1 = new int[newWidth * newHeight];

            for (int i_2 = 0; i_2 < height; i_2++)
                for (int i_3 = 0; i_3 < width; i_3++)
                    ints_1[(i_2 + yoffset) * newWidth + i_3 + xoffset] = pixels[i_2 * width + i_3];

            pixels = ints_1;
            width = newWidth;
            height = newHeight;
            xoffset = 0;
            yoffset = 0;
        }
    }

    public void method678(int i_1) {
        if (width != newWidth || height != newHeight) {
            int i_2 = i_1;
            if (i_1 > xoffset)
                i_2 = xoffset;

            int i_3 = i_1;
            if (i_1 + xoffset + width > newWidth)
                i_3 = newWidth - xoffset - width;

            int i_4 = i_1;
            if (i_1 > yoffset)
                i_4 = yoffset;

            int i_5 = i_1;
            if (i_1 + yoffset + height > newHeight)
                i_5 = newHeight - yoffset - height;

            int i_6 = width + i_2 + i_3;
            int i_7 = height + i_4 + i_5;
            int[] ints_8 = new int[i_6 * i_7];

            for (int i_9 = 0; i_9 < height; i_9++)
                for (int i_10 = 0; i_10 < width; i_10++)
                    ints_8[(i_9 + i_4) * i_6 + i_10 + i_2] = pixels[i_9 * width + i_10];

            pixels = ints_8;
            width = i_6;
            height = i_7;
            xoffset -= i_2;
            yoffset -= i_4;
        }
    }

    public void method679() {
        int[] ints_1 = new int[width * height];
        int i_2 = 0;

        for (int i_3 = 0; i_3 < height; i_3++)
            for (int i_4 = width - 1; i_4 >= 0; --i_4)
                ints_1[i_2++] = pixels[i_4 + i_3 * width];

        pixels = ints_1;
        xoffset = newWidth - width - xoffset;
    }

    public void method680() {
        int[] ints_1 = new int[width * height];
        int i_2 = 0;

        for (int i_3 = height - 1; i_3 >= 0; --i_3)
            for (int i_4 = 0; i_4 < width; i_4++)
                ints_1[i_2++] = pixels[i_4 + i_3 * width];

        pixels = ints_1;
        yoffset = newHeight - height - yoffset;
    }

    public void method681(int i_1) {
        int[] ints_2 = new int[width * height];
        int i_3 = 0;

        for (int i_4 = 0; i_4 < height; i_4++)
            for (int i_5 = 0; i_5 < width; i_5++) {
                int i_6 = pixels[i_3];
                if (i_6 == 0)
                    if (i_5 > 0 && pixels[i_3 - 1] != 0)
                        i_6 = i_1;
                    else if (i_4 > 0 && pixels[i_3 - width] != 0)
                        i_6 = i_1;
                    else if (i_5 < width - 1 && pixels[i_3 + 1] != 0)
                        i_6 = i_1;
                    else if (i_4 < height - 1 && pixels[i_3 + width] != 0)
                        i_6 = i_1;

                ints_2[i_3++] = i_6;
            }

        pixels = ints_2;
    }

    public void method682(int i_1) {
        for (int i_2 = height - 1; i_2 > 0; --i_2) {
            int i_3 = i_2 * width;

            for (int i_4 = width - 1; i_4 > 0; --i_4)
                if (pixels[i_4 + i_3] == 0 && pixels[i_4 + i_3 - 1 - width] != 0)
                    pixels[i_4 + i_3] = i_1;
        }

    }

    public void method683(int i_1, int i_2) {
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
            staticMethod502(staticIntArray130, pixels, i_4, i_3, i_6, i_5, i_7, i_8);
    }

    static void staticMethod502(int[] ints_0, int[] ints_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
        for (int i_8 = -i_5; i_8 < 0; i_8++) {
            int i_9;
            for (i_9 = i_3 + i_4 - 3; i_3 < i_9; ints_0[i_3++] = ints_1[i_2++]) {
                ints_0[i_3++] = ints_1[i_2++];
                ints_0[i_3++] = ints_1[i_2++];
                ints_0[i_3++] = ints_1[i_2++];
            }

            for (i_9 += 3; i_3 < i_9; ints_0[i_3++] = ints_1[i_2++])
                ;

            i_3 += i_6;
            i_2 += i_7;
        }

    }

    public void method684(int i_1, int i_2) {
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
            staticMethod503(staticIntArray130, pixels, 0, i_4, i_3, i_6, i_5, i_7, i_8);
    }

    static void staticMethod503(int[] ints_0, int[] ints_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
        int i_9 = -(i_5 >> 2);
        i_5 = -(i_5 & 0x3);

        for (int i_10 = -i_6; i_10 < 0; i_10++) {
            int i_11;
            for (i_11 = i_9; i_11 < 0; i_11++) {
                i_2 = ints_1[i_3++];
                if (i_2 != 0)
                    ints_0[i_4++] = i_2;
                else
                    ++i_4;

                i_2 = ints_1[i_3++];
                if (i_2 != 0)
                    ints_0[i_4++] = i_2;
                else
                    ++i_4;

                i_2 = ints_1[i_3++];
                if (i_2 != 0)
                    ints_0[i_4++] = i_2;
                else
                    ++i_4;

                i_2 = ints_1[i_3++];
                if (i_2 != 0)
                    ints_0[i_4++] = i_2;
                else
                    ++i_4;
            }

            for (i_11 = i_5; i_11 < 0; i_11++) {
                i_2 = ints_1[i_3++];
                if (i_2 != 0)
                    ints_0[i_4++] = i_2;
                else
                    ++i_4;
            }

            i_4 += i_7;
            i_3 += i_8;
        }

    }

    public void method685(int i_1, int i_2, int i_3, int i_4) {
        if (i_3 > 0 && i_4 > 0) {
            int i_5 = width;
            int i_6 = height;
            int i_7 = 0;
            int i_8 = 0;
            int i_9 = newWidth;
            int i_10 = newHeight;
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

            staticMethod504(staticIntArray130, pixels, 0, i_7, i_8, i_13, i_14, i_3, i_4, i_11, i_12, i_5);
        }
    }

    static void staticMethod504(int[] ints_0, int[] ints_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11) {
        int i_12 = i_3;

        for (int i_13 = -i_8; i_13 < 0; i_13++) {
            int i_14 = (i_4 >> 16) * i_11;

            for (int i_15 = -i_7; i_15 < 0; i_15++) {
                i_2 = ints_1[(i_3 >> 16) + i_14];
                if (i_2 != 0)
                    ints_0[i_5++] = i_2;
                else
                    ++i_5;

                i_3 += i_9;
            }

            i_4 += i_10;
            i_3 = i_12;
            i_5 += i_6;
        }

    }

    public void method686(int i_1, int i_2, int i_3, int i_4) {
        if (i_3 == 256)
            method684(i_1, i_2);
        else {
            i_1 += xoffset;
            i_2 += yoffset;
            int i_5 = i_1 + i_2 * staticInt312;
            int i_6 = 0;
            int i_7 = height;
            int i_8 = width;
            int i_9 = staticInt312 - i_8;
            int i_10 = 0;
            int i_11;
            if (i_2 < staticInt311) {
                i_11 = staticInt311 - i_2;
                i_7 -= i_11;
                i_2 = staticInt311;
                i_6 += i_11 * i_8;
                i_5 += i_11 * staticInt312;
            }

            if (i_2 + i_7 > staticInt315)
                i_7 -= i_2 + i_7 - staticInt315;

            if (i_1 < staticInt316) {
                i_11 = staticInt316 - i_1;
                i_8 -= i_11;
                i_1 = staticInt316;
                i_6 += i_11;
                i_5 += i_11;
                i_10 += i_11;
                i_9 += i_11;
            }

            if (i_1 + i_8 > staticInt314) {
                i_11 = i_1 + i_8 - staticInt314;
                i_8 -= i_11;
                i_10 += i_11;
                i_9 += i_11;
            }

            if (i_8 > 0 && i_7 > 0)
                staticMethod505(staticIntArray130, pixels, 0, i_6, i_5, i_8, i_7, i_9, i_10, i_3, i_4);
        }
    }

    static void staticMethod505(int[] ints_0, int[] ints_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10) {
        int i_11 = 256 - i_9;
        int i_12 = (i_10 & 0xff00ff) * i_11 & ~0xff00ff;
        int i_13 = (i_10 & 0xff00) * i_11 & 0xff0000;
        i_10 = (i_12 | i_13) >>> 8;

        for (int i_14 = -i_6; i_14 < 0; i_14++) {
            for (int i_15 = -i_5; i_15 < 0; i_15++) {
                i_2 = ints_1[i_3++];
                if (i_2 != 0) {
                    i_12 = (i_2 & 0xff00ff) * i_9 & ~0xff00ff;
                    i_13 = (i_2 & 0xff00) * i_9 & 0xff0000;
                    ints_0[i_4++] = ((i_12 | i_13) >>> 8) + i_10;
                } else
                    ++i_4;
            }

            i_4 += i_7;
            i_3 += i_8;
        }

    }

    public void method687(int i_1, int i_2, int i_3) {
        i_1 += xoffset;
        i_2 += yoffset;
        int i_4 = i_1 + i_2 * staticInt312;
        int i_5 = 0;
        int i_6 = height;
        int i_7 = width;
        int i_8 = staticInt312 - i_7;
        int i_9 = 0;
        int i_10;
        if (i_2 < staticInt311) {
            i_10 = staticInt311 - i_2;
            i_6 -= i_10;
            i_2 = staticInt311;
            i_5 += i_10 * i_7;
            i_4 += i_10 * staticInt312;
        }

        if (i_2 + i_6 > staticInt315)
            i_6 -= i_2 + i_6 - staticInt315;

        if (i_1 < staticInt316) {
            i_10 = staticInt316 - i_1;
            i_7 -= i_10;
            i_1 = staticInt316;
            i_5 += i_10;
            i_4 += i_10;
            i_9 += i_10;
            i_8 += i_10;
        }

        if (i_1 + i_7 > staticInt314) {
            i_10 = i_1 + i_7 - staticInt314;
            i_7 -= i_10;
            i_9 += i_10;
            i_8 += i_10;
        }

        if (i_7 > 0 && i_6 > 0)
            staticMethod506(staticIntArray130, pixels, 0, i_5, i_4, i_7, i_6, i_8, i_9, i_3);
    }

    static void staticMethod506(int[] ints_0, int[] ints_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
        int i_10 = 256 - i_9;

        for (int i_11 = -i_6; i_11 < 0; i_11++) {
            for (int i_12 = -i_5; i_12 < 0; i_12++) {
                i_2 = ints_1[i_3++];
                if (i_2 != 0) {
                    int i_13 = ints_0[i_4];
                    ints_0[i_4++] = ((i_2 & 0xff00ff) * i_9 + (i_13 & 0xff00ff) * i_10 & ~0xff00ff) + ((i_2 & 0xff00) * i_9 + (i_13 & 0xff00) * i_10 & 0xff0000) >> 8;
                } else
                    ++i_4;
            }

            i_4 += i_7;
            i_3 += i_8;
        }

    }

    public void method688(int i_1, int i_2, int i_3, int i_4, int i_5) {
        if (i_3 > 0 && i_4 > 0) {
            int i_6 = width;
            int i_7 = height;
            int i_8 = 0;
            int i_9 = 0;
            int i_10 = newWidth;
            int i_11 = newHeight;
            int i_12 = (i_10 << 16) / i_3;
            int i_13 = (i_11 << 16) / i_4;
            int i_14;
            if (xoffset > 0) {
                i_14 = ((xoffset << 16) + i_12 - 1) / i_12;
                i_1 += i_14;
                i_8 += i_14 * i_12 - (xoffset << 16);
            }

            if (yoffset > 0) {
                i_14 = ((yoffset << 16) + i_13 - 1) / i_13;
                i_2 += i_14;
                i_9 += i_14 * i_13 - (yoffset << 16);
            }

            if (i_6 < i_10)
                i_3 = ((i_6 << 16) - i_8 + i_12 - 1) / i_12;

            if (i_7 < i_11)
                i_4 = ((i_7 << 16) - i_9 + i_13 - 1) / i_13;

            i_14 = i_1 + i_2 * staticInt312;
            int i_15 = staticInt312 - i_3;
            if (i_2 + i_4 > staticInt315)
                i_4 -= i_2 + i_4 - staticInt315;

            int i_16;
            if (i_2 < staticInt311) {
                i_16 = staticInt311 - i_2;
                i_4 -= i_16;
                i_14 += i_16 * staticInt312;
                i_9 += i_13 * i_16;
            }

            if (i_1 + i_3 > staticInt314) {
                i_16 = i_1 + i_3 - staticInt314;
                i_3 -= i_16;
                i_15 += i_16;
            }

            if (i_1 < staticInt316) {
                i_16 = staticInt316 - i_1;
                i_3 -= i_16;
                i_14 += i_16;
                i_8 += i_12 * i_16;
                i_15 += i_16;
            }

            staticMethod507(staticIntArray130, pixels, 0, i_8, i_9, i_14, i_15, i_3, i_4, i_12, i_13, i_6, i_5);
        }
    }

    static void staticMethod507(int[] ints_0, int[] ints_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12) {
        int i_13 = 256 - i_12;
        int i_14 = i_3;

        for (int i_15 = -i_8; i_15 < 0; i_15++) {
            int i_16 = (i_4 >> 16) * i_11;

            for (int i_17 = -i_7; i_17 < 0; i_17++) {
                i_2 = ints_1[(i_3 >> 16) + i_16];
                if (i_2 != 0) {
                    int i_18 = ints_0[i_5];
                    ints_0[i_5++] = ((i_2 & 0xff00ff) * i_12 + (i_18 & 0xff00ff) * i_13 & ~0xff00ff) + ((i_2 & 0xff00) * i_12 + (i_18 & 0xff00) * i_13 & 0xff0000) >> 8;
                } else
                    ++i_5;

                i_3 += i_9;
            }

            i_4 += i_10;
            i_3 = i_14;
            i_5 += i_6;
        }

    }

    public void method689(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int[] ints_7, int[] ints_8) {
        int i_9 = i_2 < 0 ? -i_2 : 0;
        int i_10 = i_2 + height <= i_6 ? height : i_6 - i_2;
        int i_11 = i_1 < 0 ? -i_1 : 0;
        int i_10000;
        if (i_1 + width <= i_5)
            i_10000 = width;
        else
            i_10000 = i_5 - i_1;

        int i_13 = i_3 + i_1 + i_11 + (i_4 + i_2 + i_9) * staticInt312;
        int i_14 = i_2 + i_9;

        for (int i_15 = i_9; i_15 < i_10; i_15++) {
            int i_16 = ints_7[i_14];
            int i_17 = ints_8[i_14++];
            int i_18 = i_13;
            int i_19;
            if (i_1 < i_16) {
                i_19 = i_16 - i_1;
                i_18 = i_13 + i_19 - i_11;
            } else
                i_19 = i_11;

            int i_12;
            if (i_1 + width <= i_16 + i_17)
                i_12 = width;
            else
                i_12 = i_16 + i_17 - i_1;

            for (int i_20 = i_19; i_20 < i_12; i_20++) {
                int i_21 = pixels[i_20 + i_15 * width];
                if (i_21 != 0)
                    staticIntArray130[i_18++] = i_21;
                else
                    ++i_18;
            }

            i_13 += staticInt312;
        }

    }

    public void method690(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int[] ints_9, int[] ints_10) {
        try {
            int i_11 = -i_3 / 2;
            int i_12 = -i_4 / 2;
            int i_13 = (int) (Math.sin(i_7 / 326.11D) * 65536.0D);
            int i_14 = (int) (Math.cos(i_7 / 326.11D) * 65536.0D);
            i_13 = i_13 * i_8 >> 8;
            i_14 = i_14 * i_8 >> 8;
            int i_15 = (i_5 << 16) + i_12 * i_13 + i_11 * i_14;
            int i_16 = (i_6 << 16) + i_12 * i_14 - i_11 * i_13;
            int i_17 = i_1 + i_2 * staticInt312;

            for (i_2 = 0; i_2 < i_4; i_2++) {
                int i_18 = ints_9[i_2];
                int i_19 = i_17 + i_18;
                int i_20 = i_15 + i_14 * i_18;
                int i_21 = i_16 - i_13 * i_18;

                for (i_1 = -ints_10[i_2]; i_1 < 0; i_1++) {
                    staticIntArray130[i_19++] = pixels[(i_20 >> 16) + (i_21 >> 16) * width];
                    i_20 += i_14;
                    i_21 -= i_13;
                }

                i_15 += i_13;
                i_16 += i_14;
                i_17 += staticInt312;
            }
        } catch (Exception exception_22) {
            ;
        }

    }

    public void method691(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, double d_7, int i_9) {
        try {
            int i_10 = -i_3 / 2;
            int i_11 = -i_4 / 2;
            int i_12 = (int) (Math.sin(d_7) * 65536.0D);
            int i_13 = (int) (Math.cos(d_7) * 65536.0D);
            i_12 = i_12 * i_9 >> 8;
            i_13 = i_13 * i_9 >> 8;
            int i_14 = (i_5 << 16) + i_11 * i_12 + i_10 * i_13;
            int i_15 = (i_6 << 16) + i_11 * i_13 - i_10 * i_12;
            int i_16 = i_1 + i_2 * staticInt312;

            for (i_2 = 0; i_2 < i_4; i_2++) {
                int i_17 = i_16;
                int i_18 = i_14;
                int i_19 = i_15;

                for (i_1 = -i_3; i_1 < 0; i_1++) {
                    int i_20 = pixels[(i_18 >> 16) + (i_19 >> 16) * width];
                    if (i_20 != 0)
                        staticIntArray130[i_17++] = i_20;
                    else
                        ++i_17;

                    i_18 += i_13;
                    i_19 -= i_12;
                }

                i_14 += i_12;
                i_15 += i_13;
                i_16 += staticInt312;
            }
        } catch (Exception exception_21) {
            ;
        }

    }

    public void method692(int i_1, int i_2, int i_3, int i_4) {
        method693(newWidth << 3, newHeight << 3, i_1 << 4, i_2 << 4, i_3, i_4);
    }

    void method693(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        if (i_6 != 0) {
            i_1 -= xoffset << 4;
            i_2 -= yoffset << 4;
            double d_7 = (i_5 & 0xffff) * 9.587379924285257E-5D;
            int i_9 = (int) Math.floor(Math.sin(d_7) * i_6 + 0.5D);
            int i_10 = (int) Math.floor(Math.cos(d_7) * i_6 + 0.5D);
            int i_11 = -i_1 * i_10 + -i_2 * i_9;
            int i_12 = -(-i_1) * i_9 + -i_2 * i_10;
            int i_13 = ((width << 4) - i_1) * i_10 + -i_2 * i_9;
            int i_14 = -((width << 4) - i_1) * i_9 + -i_2 * i_10;
            int i_15 = -i_1 * i_10 + ((height << 4) - i_2) * i_9;
            int i_16 = -(-i_1) * i_9 + ((height << 4) - i_2) * i_10;
            int i_17 = ((width << 4) - i_1) * i_10 + ((height << 4) - i_2) * i_9;
            int i_18 = -((width << 4) - i_1) * i_9 + ((height << 4) - i_2) * i_10;
            int i_19;
            int i_20;
            if (i_11 < i_13) {
                i_19 = i_11;
                i_20 = i_13;
            } else {
                i_19 = i_13;
                i_20 = i_11;
            }

            if (i_15 < i_19)
                i_19 = i_15;

            if (i_17 < i_19)
                i_19 = i_17;

            if (i_15 > i_20)
                i_20 = i_15;

            if (i_17 > i_20)
                i_20 = i_17;

            int i_21;
            int i_22;
            if (i_12 < i_14) {
                i_21 = i_12;
                i_22 = i_14;
            } else {
                i_21 = i_14;
                i_22 = i_12;
            }

            if (i_16 < i_21)
                i_21 = i_16;

            if (i_18 < i_21)
                i_21 = i_18;

            if (i_16 > i_22)
                i_22 = i_16;

            if (i_18 > i_22)
                i_22 = i_18;

            i_19 >>= 12;
            i_20 = i_20 + 4095 >> 12;
            i_21 >>= 12;
            i_22 = i_22 + 4095 >> 12;
            i_19 += i_3;
            i_20 += i_3;
            i_21 += i_4;
            i_22 += i_4;
            i_19 >>= 4;
            i_20 = i_20 + 15 >> 4;
            i_21 >>= 4;
            i_22 = i_22 + 15 >> 4;
            if (i_19 < staticInt316)
                i_19 = staticInt316;

            if (i_20 > staticInt314)
                i_20 = staticInt314;

            if (i_21 < staticInt311)
                i_21 = staticInt311;

            if (i_22 > staticInt315)
                i_22 = staticInt315;

            i_20 = i_19 - i_20;
            if (i_20 < 0) {
                i_22 = i_21 - i_22;
                if (i_22 < 0) {
                    int i_23 = i_21 * staticInt312 + i_19;
                    double d_24 = 1.6777216E7D / i_6;
                    int i_26 = (int) Math.floor(Math.sin(d_7) * d_24 + 0.5D);
                    int i_27 = (int) Math.floor(Math.cos(d_7) * d_24 + 0.5D);
                    int i_28 = (i_19 << 4) + 8 - i_3;
                    int i_29 = (i_21 << 4) + 8 - i_4;
                    int i_30 = (i_1 << 8) - (i_29 * i_26 >> 4);
                    int i_31 = (i_2 << 8) + (i_29 * i_27 >> 4);
                    int i_32;
                    int i_33;
                    int i_34;
                    int i_35;
                    int i_36;
                    int i_37;
                    int i_38;
                    if (i_27 == 0) {
                        if (i_26 == 0)
                            for (i_33 = i_22; i_33 < 0; i_23 += staticInt312) {
                                i_34 = i_23;
                                i_35 = i_30;
                                i_36 = i_31;
                                i_37 = i_20;
                                if (i_30 >= 0 && i_31 >= 0 && i_30 - (width << 12) < 0 && i_31 - (height << 12) < 0)
                                    for (; i_37 < 0; i_37++) {
                                        i_38 = pixels[(i_36 >> 12) * width + (i_35 >> 12)];
                                        if (i_38 != 0)
                                            staticIntArray130[i_34++] = i_38;
                                        else
                                            ++i_34;
                                    }

                                ++i_33;
                            }
                        else if (i_26 < 0)
                            for (i_33 = i_22; i_33 < 0; i_23 += staticInt312) {
                                i_34 = i_23;
                                i_35 = i_30;
                                i_36 = i_31 + (i_28 * i_26 >> 4);
                                i_37 = i_20;
                                if (i_30 >= 0 && i_30 - (width << 12) < 0) {
                                    if ((i_32 = i_36 - (height << 12)) >= 0) {
                                        i_32 = (i_26 - i_32) / i_26;
                                        i_37 = i_20 + i_32;
                                        i_36 += i_26 * i_32;
                                        i_34 = i_23 + i_32;
                                    }

                                    if ((i_32 = (i_36 - i_26) / i_26) > i_37)
                                        i_37 = i_32;

                                    while (i_37 < 0) {
                                        i_38 = pixels[(i_36 >> 12) * width + (i_35 >> 12)];
                                        if (i_38 != 0)
                                            staticIntArray130[i_34++] = i_38;
                                        else
                                            ++i_34;

                                        i_36 += i_26;
                                        ++i_37;
                                    }
                                }

                                ++i_33;
                                i_30 -= i_26;
                            }
                        else
                            for (i_33 = i_22; i_33 < 0; i_23 += staticInt312) {
                                i_34 = i_23;
                                i_35 = i_30;
                                i_36 = i_31 + (i_28 * i_26 >> 4);
                                i_37 = i_20;
                                if (i_30 >= 0 && i_30 - (width << 12) < 0) {
                                    if (i_36 < 0) {
                                        i_32 = (i_26 - 1 - i_36) / i_26;
                                        i_37 = i_20 + i_32;
                                        i_36 += i_26 * i_32;
                                        i_34 = i_23 + i_32;
                                    }

                                    if ((i_32 = (i_36 + 1 - (height << 12) - i_26) / i_26) > i_37)
                                        i_37 = i_32;

                                    while (i_37 < 0) {
                                        i_38 = pixels[(i_36 >> 12) * width + (i_35 >> 12)];
                                        if (i_38 != 0)
                                            staticIntArray130[i_34++] = i_38;
                                        else
                                            ++i_34;

                                        i_36 += i_26;
                                        ++i_37;
                                    }
                                }

                                ++i_33;
                                i_30 -= i_26;
                            }
                    } else if (i_27 < 0) {
                        if (i_26 == 0)
                            for (i_33 = i_22; i_33 < 0; i_23 += staticInt312) {
                                i_34 = i_23;
                                i_35 = i_30 + (i_28 * i_27 >> 4);
                                i_36 = i_31;
                                i_37 = i_20;
                                if (i_31 >= 0 && i_31 - (height << 12) < 0) {
                                    if ((i_32 = i_35 - (width << 12)) >= 0) {
                                        i_32 = (i_27 - i_32) / i_27;
                                        i_37 = i_20 + i_32;
                                        i_35 += i_27 * i_32;
                                        i_34 = i_23 + i_32;
                                    }

                                    if ((i_32 = (i_35 - i_27) / i_27) > i_37)
                                        i_37 = i_32;

                                    while (i_37 < 0) {
                                        i_38 = pixels[(i_36 >> 12) * width + (i_35 >> 12)];
                                        if (i_38 != 0)
                                            staticIntArray130[i_34++] = i_38;
                                        else
                                            ++i_34;

                                        i_35 += i_27;
                                        ++i_37;
                                    }
                                }

                                ++i_33;
                                i_31 += i_27;
                            }
                        else if (i_26 < 0)
                            for (i_33 = i_22; i_33 < 0; i_23 += staticInt312) {
                                i_34 = i_23;
                                i_35 = i_30 + (i_28 * i_27 >> 4);
                                i_36 = i_31 + (i_28 * i_26 >> 4);
                                i_37 = i_20;
                                if ((i_32 = i_35 - (width << 12)) >= 0) {
                                    i_32 = (i_27 - i_32) / i_27;
                                    i_37 = i_20 + i_32;
                                    i_35 += i_27 * i_32;
                                    i_36 += i_26 * i_32;
                                    i_34 = i_23 + i_32;
                                }

                                if ((i_32 = (i_35 - i_27) / i_27) > i_37)
                                    i_37 = i_32;

                                if ((i_32 = i_36 - (height << 12)) >= 0) {
                                    i_32 = (i_26 - i_32) / i_26;
                                    i_37 += i_32;
                                    i_35 += i_27 * i_32;
                                    i_36 += i_26 * i_32;
                                    i_34 += i_32;
                                }

                                if ((i_32 = (i_36 - i_26) / i_26) > i_37)
                                    i_37 = i_32;

                                while (i_37 < 0) {
                                    i_38 = pixels[(i_36 >> 12) * width + (i_35 >> 12)];
                                    if (i_38 != 0)
                                        staticIntArray130[i_34++] = i_38;
                                    else
                                        ++i_34;

                                    i_35 += i_27;
                                    i_36 += i_26;
                                    ++i_37;
                                }

                                ++i_33;
                                i_30 -= i_26;
                                i_31 += i_27;
                            }
                        else
                            for (i_33 = i_22; i_33 < 0; i_23 += staticInt312) {
                                i_34 = i_23;
                                i_35 = i_30 + (i_28 * i_27 >> 4);
                                i_36 = i_31 + (i_28 * i_26 >> 4);
                                i_37 = i_20;
                                if ((i_32 = i_35 - (width << 12)) >= 0) {
                                    i_32 = (i_27 - i_32) / i_27;
                                    i_37 = i_20 + i_32;
                                    i_35 += i_27 * i_32;
                                    i_36 += i_26 * i_32;
                                    i_34 = i_23 + i_32;
                                }

                                if ((i_32 = (i_35 - i_27) / i_27) > i_37)
                                    i_37 = i_32;

                                if (i_36 < 0) {
                                    i_32 = (i_26 - 1 - i_36) / i_26;
                                    i_37 += i_32;
                                    i_35 += i_27 * i_32;
                                    i_36 += i_26 * i_32;
                                    i_34 += i_32;
                                }

                                if ((i_32 = (i_36 + 1 - (height << 12) - i_26) / i_26) > i_37)
                                    i_37 = i_32;

                                while (i_37 < 0) {
                                    i_38 = pixels[(i_36 >> 12) * width + (i_35 >> 12)];
                                    if (i_38 != 0)
                                        staticIntArray130[i_34++] = i_38;
                                    else
                                        ++i_34;

                                    i_35 += i_27;
                                    i_36 += i_26;
                                    ++i_37;
                                }

                                ++i_33;
                                i_30 -= i_26;
                                i_31 += i_27;
                            }
                    } else if (i_26 == 0)
                        for (i_33 = i_22; i_33 < 0; i_23 += staticInt312) {
                            i_34 = i_23;
                            i_35 = i_30 + (i_28 * i_27 >> 4);
                            i_36 = i_31;
                            i_37 = i_20;
                            if (i_31 >= 0 && i_31 - (height << 12) < 0) {
                                if (i_35 < 0) {
                                    i_32 = (i_27 - 1 - i_35) / i_27;
                                    i_37 = i_20 + i_32;
                                    i_35 += i_27 * i_32;
                                    i_34 = i_23 + i_32;
                                }

                                if ((i_32 = (i_35 + 1 - (width << 12) - i_27) / i_27) > i_37)
                                    i_37 = i_32;

                                while (i_37 < 0) {
                                    i_38 = pixels[(i_36 >> 12) * width + (i_35 >> 12)];
                                    if (i_38 != 0)
                                        staticIntArray130[i_34++] = i_38;
                                    else
                                        ++i_34;

                                    i_35 += i_27;
                                    ++i_37;
                                }
                            }

                            ++i_33;
                            i_31 += i_27;
                        }
                    else if (i_26 < 0)
                        for (i_33 = i_22; i_33 < 0; i_23 += staticInt312) {
                            i_34 = i_23;
                            i_35 = i_30 + (i_28 * i_27 >> 4);
                            i_36 = i_31 + (i_28 * i_26 >> 4);
                            i_37 = i_20;
                            if (i_35 < 0) {
                                i_32 = (i_27 - 1 - i_35) / i_27;
                                i_37 = i_20 + i_32;
                                i_35 += i_27 * i_32;
                                i_36 += i_26 * i_32;
                                i_34 = i_23 + i_32;
                            }

                            if ((i_32 = (i_35 + 1 - (width << 12) - i_27) / i_27) > i_37)
                                i_37 = i_32;

                            if ((i_32 = i_36 - (height << 12)) >= 0) {
                                i_32 = (i_26 - i_32) / i_26;
                                i_37 += i_32;
                                i_35 += i_27 * i_32;
                                i_36 += i_26 * i_32;
                                i_34 += i_32;
                            }

                            if ((i_32 = (i_36 - i_26) / i_26) > i_37)
                                i_37 = i_32;

                            while (i_37 < 0) {
                                i_38 = pixels[(i_36 >> 12) * width + (i_35 >> 12)];
                                if (i_38 != 0)
                                    staticIntArray130[i_34++] = i_38;
                                else
                                    ++i_34;

                                i_35 += i_27;
                                i_36 += i_26;
                                ++i_37;
                            }

                            ++i_33;
                            i_30 -= i_26;
                            i_31 += i_27;
                        }
                    else
                        for (i_33 = i_22; i_33 < 0; i_23 += staticInt312) {
                            i_34 = i_23;
                            i_35 = i_30 + (i_28 * i_27 >> 4);
                            i_36 = i_31 + (i_28 * i_26 >> 4);
                            i_37 = i_20;
                            if (i_35 < 0) {
                                i_32 = (i_27 - 1 - i_35) / i_27;
                                i_37 = i_20 + i_32;
                                i_35 += i_27 * i_32;
                                i_36 += i_26 * i_32;
                                i_34 = i_23 + i_32;
                            }

                            if ((i_32 = (i_35 + 1 - (width << 12) - i_27) / i_27) > i_37)
                                i_37 = i_32;

                            if (i_36 < 0) {
                                i_32 = (i_26 - 1 - i_36) / i_26;
                                i_37 += i_32;
                                i_35 += i_27 * i_32;
                                i_36 += i_26 * i_32;
                                i_34 += i_32;
                            }

                            if ((i_32 = (i_36 + 1 - (height << 12) - i_26) / i_26) > i_37)
                                i_37 = i_32;

                            while (i_37 < 0) {
                                i_38 = pixels[(i_36 >> 12) * width + (i_35 >> 12)];
                                if (i_38 != 0)
                                    staticIntArray130[i_34++] = i_38;
                                else
                                    ++i_34;

                                i_35 += i_27;
                                i_36 += i_26;
                                ++i_37;
                            }

                            ++i_33;
                            i_30 -= i_26;
                            i_31 += i_27;
                        }

                }
            }
        }
    }

    public void method694(int i_1, int i_2, int i_3, int i_4) {
        if (i_3 <= newWidth && i_4 <= newHeight) {
            int i_5 = i_1 + xoffset * i_3 / newWidth;
            int i_6 = i_1 + ((xoffset + width) * i_3 + newWidth - 1) / newWidth;
            int i_7 = i_2 + yoffset * i_4 / newHeight;
            int i_8 = i_2 + ((yoffset + height) * i_4 + newHeight - 1) / newHeight;
            if (i_5 < staticInt316)
                i_5 = staticInt316;

            if (i_6 > staticInt314)
                i_6 = staticInt314;

            if (i_7 < staticInt311)
                i_7 = staticInt311;

            if (i_8 > staticInt315)
                i_8 = staticInt315;

            if (i_5 < i_6 && i_7 < i_8) {
                int i_9 = i_7 * staticInt312 + i_5;
                int i_10 = staticInt312 - (i_6 - i_5);
                if (i_9 < staticIntArray130.length)
                    for (int i_11 = i_7; i_11 < i_8; i_11++) {
                        for (int i_12 = i_5; i_12 < i_6; i_12++) {
                            int i_13 = i_12 - i_1 << 4;
                            int i_14 = i_11 - i_2 << 4;
                            int i_15 = i_13 * newWidth / i_3 - (xoffset << 4);
                            int i_16 = (i_13 + 16) * newWidth / i_3 - (xoffset << 4);
                            int i_17 = i_14 * newHeight / i_4 - (yoffset << 4);
                            int i_18 = (i_14 + 16) * newHeight / i_4 - (yoffset << 4);
                            int i_19 = (i_16 - i_15) * (i_18 - i_17) >> 1;
                            if (i_19 != 0) {
                                if (i_15 < 0)
                                    i_15 = 0;

                                if (i_16 >= width << 4)
                                    i_16 = width << 4;

                                if (i_17 < 0)
                                    i_17 = 0;

                                if (i_18 >= height << 4)
                                    i_18 = height << 4;

                                --i_16;
                                --i_18;
                                int i_20 = 16 - (i_15 & 0xf);
                                int i_21 = (i_16 & 0xf) + 1;
                                int i_22 = 16 - (i_17 & 0xf);
                                int i_23 = (i_18 & 0xf) + 1;
                                i_15 >>= 4;
                                i_16 >>= 4;
                                i_17 >>= 4;
                                i_18 >>= 4;
                                int i_24 = 0;
                                int i_25 = 0;
                                int i_26 = 0;
                                int i_27 = 0;

                                int i_28;
                                for (i_28 = i_17; i_28 <= i_18; i_28++) {
                                    int i_29 = 16;
                                    if (i_28 == i_17)
                                        i_29 = i_22;

                                    if (i_28 == i_18)
                                        i_29 = i_23;

                                    for (int i_30 = i_15; i_30 <= i_16; i_30++) {
                                        int i_31 = pixels[i_28 * width + i_30];
                                        if (i_31 != 0) {
                                            int i_32;
                                            if (i_30 == i_15)
                                                i_32 = i_29 * i_20;
                                            else if (i_30 == i_16)
                                                i_32 = i_29 * i_21;
                                            else
                                                i_32 = i_29 << 4;

                                            i_27 += i_32;
                                            i_24 += (i_31 >> 16 & 0xff) * i_32;
                                            i_25 += (i_31 >> 8 & 0xff) * i_32;
                                            i_26 += (i_31 & 0xff) * i_32;
                                        }
                                    }
                                }

                                if (i_27 >= i_19) {
                                    i_28 = (i_24 / i_27 << 16) + (i_25 / i_27 << 8) + i_26 / i_27;
                                    if (i_28 == 0)
                                        i_28 = 1;

                                    staticIntArray130[i_9] = i_28;
                                }

                                ++i_9;
                            }
                        }

                        i_9 += i_10;
                    }
            }
        } else
            throw new IllegalArgumentException();
    }

}

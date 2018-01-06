import java.util.Random;

public abstract class TypeFace extends Rasterizer2D {

    public static IndexedSprite[] staticIndexedSpriteArray9;
    static int staticInt337 = -1;
    static int staticInt335 = -1;
    static int staticInt338 = -1;
    static int staticInt342 = -1;
    static int staticInt339 = 0;
    static int staticInt340 = 0;
    static int staticInt341 = 256;
    static int staticInt334 = 0;
    static int staticInt336 = 0;
    static Random staticRandom1 = new Random();
    static String[] staticStringArray11 = new String[100];
    byte[][] characterPixels = new byte[256][];
    public int int674 = 0;
    int[] characterXOffsets;
    int[] characterYOffsets;
    int[] intArray113;
    int[] intArray114;
    public int int675;
    public int int676;
    int[] characterWidths;
    byte[] byteArray19;

    abstract void method658(byte[] var1, int var2, int var3, int var4, int var5, int var6);

    abstract void method659(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

    TypeFace(byte[] bytes_1, int[] ints_2, int[] ints_3, int[] ints_4, int[] ints_5, int[] ints_6, byte[][] bytes_7) {
        characterXOffsets = ints_2;
        characterYOffsets = ints_3;
        intArray113 = ints_4;
        intArray114 = ints_5;
        method660(bytes_1);
        characterPixels = bytes_7;
        int i_8 = Integer.MAX_VALUE;
        int i_9 = Integer.MIN_VALUE;

        for (int i_10 = 0; i_10 < 256; i_10++) {
            if (characterYOffsets[i_10] < i_8 && intArray114[i_10] != 0)
                i_8 = characterYOffsets[i_10];

            if (characterYOffsets[i_10] + intArray114[i_10] > i_9)
                i_9 = characterYOffsets[i_10] + intArray114[i_10];
        }

        int675 = int674 - i_8;
        int676 = i_9 - int674;
    }

    TypeFace(byte[] bytes_1) {
        method660(bytes_1);
    }

    void method660(byte[] bytes_1) {
        characterWidths = new int[256];
        int i_2;
        if (bytes_1.length == 257) {
            for (i_2 = 0; i_2 < characterWidths.length; i_2++)
                characterWidths[i_2] = bytes_1[i_2] & 0xff;

            int674 = bytes_1[256] & 0xff;
        } else {
            i_2 = 0;

            for (int i_3 = 0; i_3 < 256; i_3++)
                characterWidths[i_3] = bytes_1[i_2++] & 0xff;

            int[] ints_10 = new int[256];
            int[] ints_4 = new int[256];

            int i_5;
            for (i_5 = 0; i_5 < 256; i_5++)
                ints_10[i_5] = bytes_1[i_2++] & 0xff;

            for (i_5 = 0; i_5 < 256; i_5++)
                ints_4[i_5] = bytes_1[i_2++] & 0xff;

            byte[][] bytes_11 = new byte[256][];

            int i_8;
            for (int i_6 = 0; i_6 < 256; i_6++) {
                bytes_11[i_6] = new byte[ints_10[i_6]];
                byte b_7 = 0;

                for (i_8 = 0; i_8 < bytes_11[i_6].length; i_8++) {
                    b_7 += bytes_1[i_2++];
                    bytes_11[i_6][i_8] = b_7;
                }
            }

            byte[][] bytes_12 = new byte[256][];

            int i_13;
            for (i_13 = 0; i_13 < 256; i_13++) {
                bytes_12[i_13] = new byte[ints_10[i_13]];
                byte b_14 = 0;

                for (int i_9 = 0; i_9 < bytes_12[i_13].length; i_9++) {
                    b_14 += bytes_1[i_2++];
                    bytes_12[i_13][i_9] = b_14;
                }
            }

            byteArray19 = new byte[65536];

            for (i_13 = 0; i_13 < 256; i_13++)
                if (i_13 != 32 && i_13 != 160)
                    for (i_8 = 0; i_8 < 256; i_8++)
                        if (i_8 != 32 && i_8 != 160)
                            byteArray19[(i_13 << 8) + i_8] = (byte) staticMethod494(bytes_11, bytes_12, ints_4, characterWidths, ints_10, i_13, i_8);

            int674 = ints_4[32] + ints_10[32];
        }

    }

    static int staticMethod494(byte[][] bytes_0, byte[][] bytes_1, int[] ints_2, int[] ints_3, int[] ints_4, int i_5, int i_6) {
        int i_7 = ints_2[i_5];
        int i_8 = i_7 + ints_4[i_5];
        int i_9 = ints_2[i_6];
        int i_10 = i_9 + ints_4[i_6];
        int i_11 = i_7;
        if (i_9 > i_7)
            i_11 = i_9;

        int i_12 = i_8;
        if (i_10 < i_8)
            i_12 = i_10;

        int i_13 = ints_3[i_5];
        if (ints_3[i_6] < i_13)
            i_13 = ints_3[i_6];

        byte[] bytes_14 = bytes_1[i_5];
        byte[] bytes_15 = bytes_0[i_6];
        int i_16 = i_11 - i_7;
        int i_17 = i_11 - i_9;

        for (int i_18 = i_11; i_18 < i_12; i_18++) {
            int i_19 = bytes_14[i_16++] + bytes_15[i_17++];
            if (i_19 < i_13)
                i_13 = i_19;
        }

        return -i_13;
    }

    int charWidth(char var_1) {
        if (var_1 == 160)
            var_1 = 32;

        return characterWidths[StaticClass52.staticMethod217(var_1) & 0xff];
    }

    public int stringWidth(String string_1) {
        if (string_1 == null)
            return 0;
        else {
            int i_2 = -1;
            int i_3 = -1;
            int i_4 = 0;

            for (int i_5 = 0; i_5 < string_1.length(); i_5++) {
                char var_6 = string_1.charAt(i_5);
                if (var_6 == 60)
                    i_2 = i_5;
                else {
                    if (var_6 == 62 && i_2 != -1) {
                        String string_7 = string_1.substring(i_2 + 1, i_5);
                        i_2 = -1;
                        if (string_7.equals("lt"))
                            var_6 = 60;
                        else {
                            if (!string_7.equals("gt")) {
                                if (string_7.startsWith("img="))
                                    try {
                                        String string_9 = string_7.substring(4);
                                        int i_8 = StaticClass51.staticMethod212(string_9, 10, true);
                                        i_4 += staticIndexedSpriteArray9[i_8].int677;
                                        i_3 = -1;
                                    } catch (Exception exception_11) {
                                        ;
                                    }
                                continue;
                            }

                            var_6 = 62;
                        }
                    }

                    if (var_6 == 160)
                        var_6 = 32;

                    if (i_2 == -1) {
                        i_4 += characterWidths[(char) (StaticClass52.staticMethod217(var_6) & 0xff)];
                        if (byteArray19 != null && i_3 != -1)
                            i_4 += byteArray19[(i_3 << 8) + var_6];

                        i_3 = var_6;
                    }
                }
            }

            return i_4;
        }
    }

    public int method661(String string_1, int[] ints_2, String[] arr_3) {
        if (string_1 == null)
            return 0;
        else {
            int i_4 = 0;
            int i_5 = 0;
            StringBuilder stringbuilder_6 = new StringBuilder(100);
            int i_7 = -1;
            int i_8 = 0;
            byte b_9 = 0;
            int i_10 = -1;
            char var_11 = 0;
            int i_12 = 0;
            int i_13 = string_1.length();

            for (int i_14 = 0; i_14 < i_13; i_14++) {
                char var_15 = string_1.charAt(i_14);
                if (var_15 == 60)
                    i_10 = i_14;
                else {
                    if (var_15 == 62 && i_10 != -1) {
                        String string_16 = string_1.substring(i_10 + 1, i_14);
                        i_10 = -1;
                        stringbuilder_6.append('<');
                        stringbuilder_6.append(string_16);
                        stringbuilder_6.append('>');
                        if (string_16.equals("br")) {
                            arr_3[i_12] = stringbuilder_6.toString().substring(i_5, stringbuilder_6.length());
                            ++i_12;
                            i_5 = stringbuilder_6.length();
                            i_4 = 0;
                            i_7 = -1;
                            var_11 = 0;
                        } else if (string_16.equals("lt")) {
                            i_4 += charWidth('<');
                            if (byteArray19 != null && var_11 != -1)
                                i_4 += byteArray19[(var_11 << 8) + 60];

                            var_11 = 60;
                        } else if (string_16.equals("gt")) {
                            i_4 += charWidth('>');
                            if (byteArray19 != null && var_11 != -1)
                                i_4 += byteArray19[(var_11 << 8) + 62];

                            var_11 = 62;
                        } else if (string_16.startsWith("img="))
                            try {
                                String string_18 = string_16.substring(4);
                                int i_17 = StaticClass51.staticMethod212(string_18, 10, true);
                                i_4 += staticIndexedSpriteArray9[i_17].int677;
                                var_11 = 0;
                            } catch (Exception exception_20) {
                                ;
                            }

                        var_15 = 0;
                    }

                    if (i_10 == -1) {
                        if (var_15 != 0) {
                            stringbuilder_6.append(var_15);
                            i_4 += charWidth(var_15);
                            if (byteArray19 != null && var_11 != -1)
                                i_4 += byteArray19[(var_11 << 8) + var_15];

                            var_11 = var_15;
                        }

                        if (var_15 == 32) {
                            i_7 = stringbuilder_6.length();
                            i_8 = i_4;
                            b_9 = 1;
                        }

                        if (ints_2 != null && i_4 > ints_2[i_12 < ints_2.length ? i_12 : ints_2.length - 1] && i_7 >= 0) {
                            arr_3[i_12] = stringbuilder_6.toString().substring(i_5, i_7 - b_9);
                            ++i_12;
                            i_5 = i_7;
                            i_7 = -1;
                            i_4 -= i_8;
                            var_11 = 0;
                        }

                        if (var_15 == 45) {
                            i_7 = stringbuilder_6.length();
                            i_8 = i_4;
                            b_9 = 0;
                        }
                    }
                }
            }

            String string_21 = stringbuilder_6.toString();
            if (string_21.length() > i_5)
                arr_3[i_12++] = string_21.substring(i_5, string_21.length());

            return i_12;
        }
    }

    public int method662(String string_1, int i_2) {
        int i_3 = method661(string_1, new int[] { i_2 }, staticStringArray11);
        int i_4 = 0;

        for (int i_5 = 0; i_5 < i_3; i_5++) {
            int i_6 = stringWidth(staticStringArray11[i_5]);
            if (i_6 > i_4)
                i_4 = i_6;
        }

        return i_4;
    }

    public int method663(String string_1, int i_2) {
        return method661(string_1, new int[] { i_2 }, staticStringArray11);
    }

    public static String staticMethod495(String string_0) {
        int i_1 = string_0.length();
        int i_2 = 0;

        for (int i_3 = 0; i_3 < i_1; i_3++) {
            char var_4 = string_0.charAt(i_3);
            if (var_4 == 60 || var_4 == 62)
                i_2 += 3;
        }

        StringBuilder stringbuilder_6 = new StringBuilder(i_1 + i_2);

        for (int i_7 = 0; i_7 < i_1; i_7++) {
            char var_5 = string_0.charAt(i_7);
            if (var_5 == 60)
                stringbuilder_6.append("<lt>");
            else if (var_5 == 62)
                stringbuilder_6.append("<gt>");
            else
                stringbuilder_6.append(var_5);
        }

        return stringbuilder_6.toString();
    }

    public void method664(String string_1, int i_2, int i_3, int i_4, int i_5) {
        if (string_1 != null) {
            setCoords(i_4, i_5);
            drawCenteredString(string_1, i_2, i_3);
        }
    }

    public void method665(String string_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        if (string_1 != null) {
            setCoords(i_4, i_5);
            staticInt341 = i_6;
            drawCenteredString(string_1, i_2, i_3);
        }
    }

    public void method666(String string_1, int i_2, int i_3, int i_4, int i_5) {
        if (string_1 != null) {
            setCoords(i_4, i_5);
            drawCenteredString(string_1, i_2 - stringWidth(string_1), i_3);
        }
    }

    public void drawString(String string_1, int i_2, int i_3, int i_4, int i_5) {
        if (string_1 != null) {
            setCoords(i_4, i_5);
            drawCenteredString(string_1, i_2 - stringWidth(string_1) / 2, i_3);
        }
    }

    public int method667(String string_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10) {
        if (string_1 == null)
            return 0;
        else {
            setCoords(i_6, i_7);
            if (i_10 == 0)
                i_10 = int674;

            int[] ints_11 = new int[] { i_4 };
            if (i_5 < int675 + int676 + i_10 && i_5 < i_10 + i_10)
                ints_11 = null;

            int i_12 = method661(string_1, ints_11, staticStringArray11);
            if (i_9 == 3 && i_12 == 1)
                i_9 = 1;

            int i_13;
            int i_14;
            if (i_9 == 0)
                i_13 = i_3 + int675;
            else if (i_9 == 1)
                i_13 = i_3 + int675 + (i_5 - int675 - int676 - (i_12 - 1) * i_10) / 2;
            else if (i_9 == 2)
                i_13 = i_3 + i_5 - int676 - (i_12 - 1) * i_10;
            else {
                i_14 = (i_5 - int675 - int676 - (i_12 - 1) * i_10) / (i_12 + 1);
                if (i_14 < 0)
                    i_14 = 0;

                i_13 = i_3 + int675 + i_14;
                i_10 += i_14;
            }

            for (i_14 = 0; i_14 < i_12; i_14++) {
                if (i_8 == 0)
                    drawCenteredString(staticStringArray11[i_14], i_2, i_13);
                else if (i_8 == 1)
                    drawCenteredString(staticStringArray11[i_14], i_2 + (i_4 - stringWidth(staticStringArray11[i_14])) / 2, i_13);
                else if (i_8 == 2)
                    drawCenteredString(staticStringArray11[i_14], i_2 + i_4 - stringWidth(staticStringArray11[i_14]), i_13);
                else if (i_14 == i_12 - 1)
                    drawCenteredString(staticStringArray11[i_14], i_2, i_13);
                else {
                    method670(staticStringArray11[i_14], i_4);
                    drawCenteredString(staticStringArray11[i_14], i_2, i_13);
                    staticInt334 = 0;
                }

                i_13 += i_10;
            }

            return i_12;
        }
    }

    public void drawStringWave1(String string_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        if (string_1 != null) {
            setCoords(i_4, i_5);
            int[] ints_7 = new int[string_1.length()];

            for (int i_8 = 0; i_8 < string_1.length(); i_8++)
                ints_7[i_8] = (int) (Math.sin(i_8 / 2.0D + i_6 / 5.0D) * 5.0D);

            this.drawString(string_1, i_2 - stringWidth(string_1) / 2, i_3, (int[]) null, ints_7);
        }
    }

    public void drawStringWave2(String string_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        if (string_1 != null) {
            setCoords(i_4, i_5);
            int[] ints_7 = new int[string_1.length()];
            int[] ints_8 = new int[string_1.length()];

            for (int i_9 = 0; i_9 < string_1.length(); i_9++) {
                ints_7[i_9] = (int) (Math.sin(i_9 / 5.0D + i_6 / 5.0D) * 5.0D);
                ints_8[i_9] = (int) (Math.sin(i_9 / 3.0D + i_6 / 5.0D) * 5.0D);
            }

            this.drawString(string_1, i_2 - stringWidth(string_1) / 2, i_3, ints_7, ints_8);
        }
    }

    public void drawStringShake(String string_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
        if (string_1 != null) {
            setCoords(i_4, i_5);
            double d_8 = 7.0D - i_7 / 8.0D;
            if (d_8 < 0.0D)
                d_8 = 0.0D;

            int[] ints_10 = new int[string_1.length()];

            for (int i_11 = 0; i_11 < string_1.length(); i_11++)
                ints_10[i_11] = (int) (Math.sin(i_11 / 1.5D + i_6 / 1.0D) * d_8);

            this.drawString(string_1, i_2 - stringWidth(string_1) / 2, i_3, (int[]) null, ints_10);
        }
    }

    public void method668(String string_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        if (string_1 != null) {
            setCoords(i_4, i_5);
            staticRandom1.setSeed(i_6);
            staticInt341 = 192 + (staticRandom1.nextInt() & 0x1f);
            int[] ints_7 = new int[string_1.length()];
            int i_8 = 0;

            for (int i_9 = 0; i_9 < string_1.length(); i_9++) {
                ints_7[i_9] = i_8;
                if ((staticRandom1.nextInt() & 0x3) == 0)
                    ++i_8;
            }

            this.drawString(string_1, i_2, i_3, ints_7, (int[]) null);
        }
    }

    void setCoords(int i_1, int i_2) {
        staticInt337 = -1;
        staticInt335 = -1;
        staticInt338 = i_2;
        staticInt342 = i_2;
        staticInt339 = i_1;
        staticInt340 = i_1;
        staticInt341 = 256;
        staticInt334 = 0;
        staticInt336 = 0;
    }

    void method669(String string_1) {
        try {
            if (string_1.startsWith("col="))
                staticInt340 = StaticClass51.staticMethod211(string_1.substring(4), 16);
            else if (string_1.equals("/col"))
                staticInt340 = staticInt339;
            else if (string_1.startsWith("str="))
                staticInt337 = StaticClass51.staticMethod211(string_1.substring(4), 16);
            else if (string_1.equals("str"))
                staticInt337 = 8388608;
            else if (string_1.equals("/str"))
                staticInt337 = -1;
            else if (string_1.startsWith("u="))
                staticInt335 = StaticClass51.staticMethod211(string_1.substring(2), 16);
            else if (string_1.equals("u"))
                staticInt335 = 0;
            else if (string_1.equals("/u"))
                staticInt335 = -1;
            else if (string_1.startsWith("shad="))
                staticInt342 = StaticClass51.staticMethod211(string_1.substring(5), 16);
            else if (string_1.equals("shad"))
                staticInt342 = 0;
            else if (string_1.equals("/shad"))
                staticInt342 = staticInt338;
            else if (string_1.equals("br"))
                setCoords(staticInt339, staticInt338);
        } catch (Exception exception_3) {
            ;
        }

    }

    void method670(String string_1, int i_2) {
        int i_3 = 0;
        boolean bool_4 = false;

        for (int i_5 = 0; i_5 < string_1.length(); i_5++) {
            char var_6 = string_1.charAt(i_5);
            if (var_6 == 60)
                bool_4 = true;
            else if (var_6 == 62)
                bool_4 = false;
            else if (!bool_4 && var_6 == 32)
                ++i_3;
        }

        if (i_3 > 0)
            staticInt334 = (i_2 - stringWidth(string_1) << 8) / i_3;

    }

    void drawCenteredString(String string_1, int i_2, int i_3) {
        i_3 -= int674;
        int i_4 = -1;
        int i_5 = -1;

        for (int i_6 = 0; i_6 < string_1.length(); i_6++)
            if (string_1.charAt(i_6) != 0) {
                char var_7 = (char) (StaticClass52.staticMethod217(string_1.charAt(i_6)) & 0xff);
                if (var_7 == 60)
                    i_4 = i_6;
                else {
                    int i_9;
                    if (var_7 == 62 && i_4 != -1) {
                        String string_8 = string_1.substring(i_4 + 1, i_6);
                        i_4 = -1;
                        if (string_8.equals("lt"))
                            var_7 = 60;
                        else {
                            if (!string_8.equals("gt")) {
                                if (string_8.startsWith("img="))
                                    try {
                                        String string_15 = string_8.substring(4);
                                        i_9 = StaticClass51.staticMethod212(string_15, 10, true);
                                        IndexedSprite indexedsprite_12 = staticIndexedSpriteArray9[i_9];
                                        indexedsprite_12.method673(i_2, i_3 + int674 - indexedsprite_12.int678);
                                        i_2 += indexedsprite_12.int677;
                                        i_5 = -1;
                                    } catch (Exception exception_13) {
                                        ;
                                    }
                                else
                                    method669(string_8);
                                continue;
                            }

                            var_7 = 62;
                        }
                    }

                    if (var_7 == 160)
                        var_7 = 32;

                    if (i_4 == -1) {
                        if (byteArray19 != null && i_5 != -1)
                            i_2 += byteArray19[(i_5 << 8) + var_7];

                        int i_14 = intArray113[var_7];
                        i_9 = intArray114[var_7];
                        if (var_7 != 32) {
                            if (staticInt341 == 256) {
                                if (staticInt342 != -1)
                                    staticMethod496(characterPixels[var_7], i_2 + characterXOffsets[var_7] + 1, i_3 + characterYOffsets[var_7] + 1, i_14, i_9, staticInt342);

                                method658(characterPixels[var_7], i_2 + characterXOffsets[var_7], i_3 + characterYOffsets[var_7], i_14, i_9, staticInt340);
                            } else {
                                if (staticInt342 != -1)
                                    staticMethod498(characterPixels[var_7], i_2 + characterXOffsets[var_7] + 1, i_3 + characterYOffsets[var_7] + 1, i_14, i_9, staticInt342, staticInt341);

                                method659(characterPixels[var_7], i_2 + characterXOffsets[var_7], i_3 + characterYOffsets[var_7], i_14, i_9, staticInt340, staticInt341);
                            }
                        } else if (staticInt334 > 0) {
                            staticInt336 += staticInt334;
                            i_2 += staticInt336 >> 8;
                            staticInt336 &= 0xff;
                        }

                        int i_10 = characterWidths[var_7];
                        if (staticInt337 != -1)
                            staticMethod459(i_2, i_3 + (int) (int674 * 0.7D), i_10, staticInt337);

                        if (staticInt335 != -1)
                            staticMethod459(i_2, i_3 + int674 + 1, i_10, staticInt335);

                        i_2 += i_10;
                        i_5 = var_7;
                    }
                }
            }

    }

    void drawString(String string_1, int i_2, int i_3, int[] ints_4, int[] ints_5) {
        i_3 -= int674;
        int i_6 = -1;
        int i_7 = -1;
        int i_8 = 0;

        for (int i_9 = 0; i_9 < string_1.length(); i_9++)
            if (string_1.charAt(i_9) != 0) {
                char var_10 = (char) (StaticClass52.staticMethod217(string_1.charAt(i_9)) & 0xff);
                if (var_10 == 60)
                    i_6 = i_9;
                else {
                    int i_12;
                    int i_13;
                    int i_14;
                    if (var_10 == 62 && i_6 != -1) {
                        String string_11 = string_1.substring(i_6 + 1, i_9);
                        i_6 = -1;
                        if (string_11.equals("lt"))
                            var_10 = 60;
                        else {
                            if (!string_11.equals("gt")) {
                                if (string_11.startsWith("img="))
                                    try {
                                        if (ints_4 != null)
                                            i_12 = ints_4[i_8];
                                        else
                                            i_12 = 0;

                                        if (ints_5 != null)
                                            i_13 = ints_5[i_8];
                                        else
                                            i_13 = 0;

                                        ++i_8;
                                        String string_20 = string_11.substring(4);
                                        i_14 = StaticClass51.staticMethod212(string_20, 10, true);
                                        IndexedSprite indexedsprite_17 = staticIndexedSpriteArray9[i_14];
                                        indexedsprite_17.method673(i_2 + i_12, i_3 + int674 - indexedsprite_17.int678 + i_13);
                                        i_2 += indexedsprite_17.int677;
                                        i_7 = -1;
                                    } catch (Exception exception_18) {
                                        ;
                                    }
                                else
                                    method669(string_11);
                                continue;
                            }

                            var_10 = 62;
                        }
                    }

                    if (var_10 == 160)
                        var_10 = 32;

                    if (i_6 == -1) {
                        if (byteArray19 != null && i_7 != -1)
                            i_2 += byteArray19[(i_7 << 8) + var_10];

                        int i_19 = intArray113[var_10];
                        i_12 = intArray114[var_10];
                        if (ints_4 != null)
                            i_13 = ints_4[i_8];
                        else
                            i_13 = 0;

                        if (ints_5 != null)
                            i_14 = ints_5[i_8];
                        else
                            i_14 = 0;

                        ++i_8;
                        if (var_10 != 32) {
                            if (staticInt341 == 256) {
                                if (staticInt342 != -1)
                                    staticMethod496(characterPixels[var_10], i_2 + characterXOffsets[var_10] + 1 + i_13, i_3 + characterYOffsets[var_10] + 1 + i_14, i_19, i_12, staticInt342);

                                method658(characterPixels[var_10], i_2 + characterXOffsets[var_10] + i_13, i_3 + characterYOffsets[var_10] + i_14, i_19, i_12, staticInt340);
                            } else {
                                if (staticInt342 != -1)
                                    staticMethod498(characterPixels[var_10], i_2 + characterXOffsets[var_10] + 1 + i_13, i_3 + characterYOffsets[var_10] + 1 + i_14, i_19, i_12, staticInt342, staticInt341);

                                method659(characterPixels[var_10], i_2 + characterXOffsets[var_10] + i_13, i_3 + characterYOffsets[var_10] + i_14, i_19, i_12, staticInt340, staticInt341);
                            }
                        } else if (staticInt334 > 0) {
                            staticInt336 += staticInt334;
                            i_2 += staticInt336 >> 8;
                            staticInt336 &= 0xff;
                        }

                        int i_15 = characterWidths[var_10];
                        if (staticInt337 != -1)
                            staticMethod459(i_2, i_3 + (int) (int674 * 0.7D), i_15, staticInt337);

                        if (staticInt335 != -1)
                            staticMethod459(i_2, i_3 + int674, i_15, staticInt335);

                        i_2 += i_15;
                        i_7 = var_10;
                    }
                }
            }

    }

    static void staticMethod496(byte[] bytes_0, int i_1, int i_2, int i_3, int i_4, int i_5) {
        int i_6 = i_1 + i_2 * staticInt312;
        int i_7 = staticInt312 - i_3;
        int i_8 = 0;
        int i_9 = 0;
        int i_10;
        if (i_2 < staticInt311) {
            i_10 = staticInt311 - i_2;
            i_4 -= i_10;
            i_2 = staticInt311;
            i_9 += i_10 * i_3;
            i_6 += i_10 * staticInt312;
        }

        if (i_2 + i_4 > staticInt315)
            i_4 -= i_2 + i_4 - staticInt315;

        if (i_1 < staticInt316) {
            i_10 = staticInt316 - i_1;
            i_3 -= i_10;
            i_1 = staticInt316;
            i_9 += i_10;
            i_6 += i_10;
            i_8 += i_10;
            i_7 += i_10;
        }

        if (i_1 + i_3 > staticInt314) {
            i_10 = i_1 + i_3 - staticInt314;
            i_3 -= i_10;
            i_8 += i_10;
            i_7 += i_10;
        }

        if (i_3 > 0 && i_4 > 0)
            staticMethod497(staticIntArray130, bytes_0, i_5, i_9, i_6, i_3, i_4, i_7, i_8);
    }

    static void staticMethod497(int[] ints_0, byte[] bytes_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
        int i_9 = -(i_5 >> 2);
        i_5 = -(i_5 & 0x3);

        for (int i_10 = -i_6; i_10 < 0; i_10++) {
            int i_11;
            for (i_11 = i_9; i_11 < 0; i_11++) {
                if (bytes_1[i_3++] != 0)
                    ints_0[i_4++] = i_2;
                else
                    ++i_4;

                if (bytes_1[i_3++] != 0)
                    ints_0[i_4++] = i_2;
                else
                    ++i_4;

                if (bytes_1[i_3++] != 0)
                    ints_0[i_4++] = i_2;
                else
                    ++i_4;

                if (bytes_1[i_3++] != 0)
                    ints_0[i_4++] = i_2;
                else
                    ++i_4;
            }

            for (i_11 = i_5; i_11 < 0; i_11++)
                if (bytes_1[i_3++] != 0)
                    ints_0[i_4++] = i_2;
                else
                    ++i_4;

            i_4 += i_7;
            i_3 += i_8;
        }

    }

    static void staticMethod498(byte[] bytes_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        int i_7 = i_1 + i_2 * staticInt312;
        int i_8 = staticInt312 - i_3;
        int i_9 = 0;
        int i_10 = 0;
        int i_11;
        if (i_2 < staticInt311) {
            i_11 = staticInt311 - i_2;
            i_4 -= i_11;
            i_2 = staticInt311;
            i_10 += i_11 * i_3;
            i_7 += i_11 * staticInt312;
        }

        if (i_2 + i_4 > staticInt315)
            i_4 -= i_2 + i_4 - staticInt315;

        if (i_1 < staticInt316) {
            i_11 = staticInt316 - i_1;
            i_3 -= i_11;
            i_1 = staticInt316;
            i_10 += i_11;
            i_7 += i_11;
            i_9 += i_11;
            i_8 += i_11;
        }

        if (i_1 + i_3 > staticInt314) {
            i_11 = i_1 + i_3 - staticInt314;
            i_3 -= i_11;
            i_9 += i_11;
            i_8 += i_11;
        }

        if (i_3 > 0 && i_4 > 0)
            staticMethod499(staticIntArray130, bytes_0, i_5, i_10, i_7, i_3, i_4, i_8, i_9, i_6);
    }

    static void staticMethod499(int[] ints_0, byte[] bytes_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
        i_2 = ((i_2 & 0xff00ff) * i_9 & ~0xff00ff) + ((i_2 & 0xff00) * i_9 & 0xff0000) >> 8;
        i_9 = 256 - i_9;

        for (int i_10 = -i_6; i_10 < 0; i_10++) {
            for (int i_11 = -i_5; i_11 < 0; i_11++)
                if (bytes_1[i_3++] != 0) {
                    int i_12 = ints_0[i_4];
                    ints_0[i_4++] = (((i_12 & 0xff00ff) * i_9 & ~0xff00ff) + ((i_12 & 0xff00) * i_9 & 0xff0000) >> 8) + i_2;
                } else
                    ++i_4;

            i_4 += i_7;
            i_3 += i_8;
        }

    }

}

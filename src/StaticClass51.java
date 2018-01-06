
public final class StaticClass51 {

    static int staticInt148;

    StaticClass51() throws Throwable {
        throw new Error();
    }

    public static String staticMethod209(int i_0) {
        return (i_0 >> 24 & 0xff) + "." + (i_0 >> 16 & 0xff) + "." + (i_0 >> 8 & 0xff) + "." + (i_0 & 0xff);
    }

    public static boolean staticMethod210(CharSequence charsequence_0) {
        boolean bool_3 = false;
        boolean bool_4 = false;
        int i_5 = 0;
        int i_6 = charsequence_0.length();
        int i_7 = 0;

        boolean bool_2;
        while (true) {
            if (i_7 >= i_6) {
                bool_2 = bool_4;
                break;
            }

            label70: {
                char var_8 = charsequence_0.charAt(i_7);
                if (i_7 == 0) {
                    if (var_8 == 45) {
                        bool_3 = true;
                        break label70;
                    }

                    if (var_8 == 43)
                        break label70;
                }

                int i_10;
                if (var_8 >= 48 && var_8 <= 57)
                    i_10 = var_8 - 48;
                else if (var_8 >= 65 && var_8 <= 90)
                    i_10 = var_8 - 55;
                else {
                    if (var_8 < 97 || var_8 > 122) {
                        bool_2 = false;
                        break;
                    }

                    i_10 = var_8 - 87;
                }

                if (i_10 >= 10) {
                    bool_2 = false;
                    break;
                }

                if (bool_3)
                    i_10 = -i_10;

                int i_9 = i_5 * 10 + i_10;
                if (i_5 != i_9 / 10) {
                    bool_2 = false;
                    break;
                }

                i_5 = i_9;
                bool_4 = true;
            }

            ++i_7;
        }

        return bool_2;
    }

    public static int staticMethod211(CharSequence charsequence_0, int i_1) {
        return staticMethod212(charsequence_0, i_1, true);
    }

    public static int staticMethod212(CharSequence charsequence_0, int i_1, boolean bool_2) {
        if (i_1 >= 2 && i_1 <= 36) {
            boolean bool_4 = false;
            boolean bool_5 = false;
            int i_6 = 0;
            int i_7 = charsequence_0.length();

            for (int i_8 = 0; i_8 < i_7; i_8++) {
                char var_9 = charsequence_0.charAt(i_8);
                if (i_8 == 0) {
                    if (var_9 == 45) {
                        bool_4 = true;
                        continue;
                    }

                    if (var_9 == 43 && bool_2)
                        continue;
                }

                int i_11;
                if (var_9 >= 48 && var_9 <= 57)
                    i_11 = var_9 - 48;
                else if (var_9 >= 65 && var_9 <= 90)
                    i_11 = var_9 - 55;
                else {
                    if (var_9 < 97 || var_9 > 122)
                        throw new NumberFormatException();

                    i_11 = var_9 - 87;
                }

                if (i_11 >= i_1)
                    throw new NumberFormatException();

                if (bool_4)
                    i_11 = -i_11;

                int i_10 = i_6 * i_1 + i_11;
                if (i_10 / i_1 != i_6)
                    throw new NumberFormatException();

                i_6 = i_10;
                bool_5 = true;
            }

            if (!bool_5)
                throw new NumberFormatException();
            else
                return i_6;
        } else
            throw new IllegalArgumentException("");
    }

    public static int staticMethod213(CharSequence charsequence_0) {
        int i_2 = charsequence_0.length();
        int i_3 = 0;

        for (int i_4 = 0; i_4 < i_2; i_4++)
            i_3 = (i_3 << 5) - i_3 + StaticClass52.staticMethod217(charsequence_0.charAt(i_4));

        return i_3;
    }

    public static boolean staticMethod214(char var_0) {
        return var_0 >= 48 && var_0 <= 57 || var_0 >= 65 && var_0 <= 90 || var_0 >= 97 && var_0 <= 122;
    }

    public static String staticMethod215(String string_0) {
        int i_2 = string_0.length();
        char[] arr_3 = new char[i_2];
        byte b_4 = 2;

        for (int i_5 = 0; i_5 < i_2; i_5++) {
            char var_6 = string_0.charAt(i_5);
            if (b_4 == 0)
                var_6 = Character.toLowerCase(var_6);
            else if (b_4 == 2 || Character.isUpperCase(var_6)) {
                char var_7;
                if (var_6 != 181 && var_6 != 131)
                    var_7 = Character.toTitleCase(var_6);
                else
                    var_7 = var_6;

                var_6 = var_7;
            }

            if (Character.isLetter(var_6))
                b_4 = 0;
            else if (var_6 != 46 && var_6 != 63 && var_6 != 33) {
                if (Character.isSpaceChar(var_6)) {
                    if (b_4 != 2)
                        b_4 = 1;
                } else
                    b_4 = 1;
            } else
                b_4 = 2;

            arr_3[i_5] = var_6;
        }

        return new String(arr_3);
    }

    public static boolean staticMethod216(char var_0) {
        return var_0 >= 32 && var_0 <= 126 ? true : var_0 >= 160 && var_0 <= 255 ? true : var_0 == 8364 || var_0 == 338 || var_0 == 8212 || var_0 == 339 || var_0 == 376;
    }

}

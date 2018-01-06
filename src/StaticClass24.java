
public class StaticClass24 {

    static int staticInt130;

    StaticClass24() throws Throwable {
        throw new Error();
    }

    public static int staticMethod141(CharSequence charsequence_0, CharSequence charsequence_1, int i_2) {
        int i_4 = charsequence_0.length();
        int i_5 = charsequence_1.length();
        int i_6 = 0;
        int i_7 = 0;
        char var_8 = 0;
        char var_9 = 0;

        while (i_6 - var_8 < i_4 || i_7 - var_9 < i_5) {
            if (i_6 - var_8 >= i_4)
                return -1;

            if (i_7 - var_9 >= i_5)
                return 1;

            char var_10;
            if (var_8 != 0) {
                var_10 = var_8;
                boolean bool_15 = false;
            } else
                var_10 = charsequence_0.charAt(i_6++);

            char var_11;
            if (var_9 != 0) {
                var_11 = var_9;
                boolean bool_16 = false;
            } else
                var_11 = charsequence_1.charAt(i_7++);

            var_8 = staticMethod143(var_10);
            var_9 = staticMethod143(var_11);
            var_10 = staticMethod142(var_10, i_2);
            var_11 = staticMethod142(var_11, i_2);
            if (var_11 != var_10 && Character.toUpperCase(var_10) != Character.toUpperCase(var_11)) {
                var_10 = Character.toLowerCase(var_10);
                var_11 = Character.toLowerCase(var_11);
                if (var_10 != var_11)
                    return staticMethod144(var_10, i_2) - staticMethod144(var_11, i_2);
            }
        }

        int i_17 = Math.min(i_4, i_5);

        char var_13;
        int i_18;
        for (i_18 = 0; i_18 < i_17; i_18++) {
            char var_12 = charsequence_0.charAt(i_18);
            var_13 = charsequence_1.charAt(i_18);
            if (var_12 != var_13 && Character.toUpperCase(var_12) != Character.toUpperCase(var_13)) {
                var_12 = Character.toLowerCase(var_12);
                var_13 = Character.toLowerCase(var_13);
                if (var_12 != var_13)
                    return staticMethod144(var_12, i_2) - staticMethod144(var_13, i_2);
            }
        }

        i_18 = i_4 - i_5;
        if (i_18 != 0)
            return i_18;
        else {
            for (int i_19 = 0; i_19 < i_17; i_19++) {
                var_13 = charsequence_0.charAt(i_19);
                char var_14 = charsequence_1.charAt(i_19);
                if (var_13 != var_14)
                    return staticMethod144(var_13, i_2) - staticMethod144(var_14, i_2);
            }

            return 0;
        }
    }

    static char staticMethod142(char var_0, int i_1) {
        if (var_0 >= 192 && var_0 <= 255) {
            if (var_0 >= 192 && var_0 <= 198)
                return 'A';

            if (var_0 == 199)
                return 'C';

            if (var_0 >= 200 && var_0 <= 203)
                return 'E';

            if (var_0 >= 204 && var_0 <= 207)
                return 'I';

            if (var_0 >= 210 && var_0 <= 214)
                return 'O';

            if (var_0 >= 217 && var_0 <= 220)
                return 'U';

            if (var_0 == 221)
                return 'Y';

            if (var_0 == 223)
                return 's';

            if (var_0 >= 224 && var_0 <= 230)
                return 'a';

            if (var_0 == 231)
                return 'c';

            if (var_0 >= 232 && var_0 <= 235)
                return 'e';

            if (var_0 >= 236 && var_0 <= 239)
                return 'i';

            if (var_0 >= 242 && var_0 <= 246)
                return 'o';

            if (var_0 >= 249 && var_0 <= 252)
                return 'u';

            if (var_0 == 253 || var_0 == 255)
                return 'y';
        }

        if (var_0 == 338)
            return 'O';
        else if (var_0 == 339)
            return 'o';
        else if (var_0 == 376)
            return 'Y';
        else
            return var_0;
    }

    static char staticMethod143(char var_0) {
        return var_0 == 198 ? 'E' : var_0 == 230 ? 'e' : var_0 == 223 ? 's' : var_0 == 338 ? 'E' : var_0 == 339 ? 'e' : '\u0000';
    }

    static int staticMethod144(char var_0, int i_1) {
        int i_3 = var_0 << 4;
        if (Character.isUpperCase(var_0) || Character.isTitleCase(var_0)) {
            var_0 = Character.toLowerCase(var_0);
            i_3 = (var_0 << 4) + 1;
        }

        return i_3;
    }

}

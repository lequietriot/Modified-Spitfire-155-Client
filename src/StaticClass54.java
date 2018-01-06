import com.alex.store.Index;

public final class StaticClass54 {

    static Connection staticConnection4;
    static Index staticJs5IndexImpl11;
    public static final char[] staticCharArray5 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    StaticClass54() throws Throwable {
        throw new Error();
    }

    static long staticMethod225(CharSequence charsequence_0) {
        long long_2 = 0L;
        int i_4 = charsequence_0.length();

        for (int i_5 = 0; i_5 < i_4; i_5++) {
            long_2 *= 37L;
            char var_6 = charsequence_0.charAt(i_5);
            if (var_6 >= 65 && var_6 <= 90)
                long_2 += var_6 + 1 - 65;
            else if (var_6 >= 97 && var_6 <= 122)
                long_2 += var_6 + 1 - 97;
            else if (var_6 >= 48 && var_6 <= 57)
                long_2 += var_6 + 27 - 48;

            if (long_2 >= 177917621779460413L)
                break;
        }

        while (long_2 % 37L == 0L && long_2 != 0L)
            long_2 /= 37L;

        return long_2;
    }

    public static String staticMethod226(long long_0) {
        if (long_0 > 0L && long_0 < 6582952005840035281L) {
            if (long_0 % 37L == 0L)
                return null;
            else {
                int i_2 = 0;

                for (long long_3 = long_0; long_3 != 0L; long_3 /= 37L)
                    ++i_2;

                StringBuilder stringbuilder_5;
                char var_8;
                for (stringbuilder_5 = new StringBuilder(i_2); long_0 != 0L; stringbuilder_5.append(var_8)) {
                    long long_6 = long_0;
                    long_0 /= 37L;
                    var_8 = staticCharArray5[(int) (long_6 - long_0 * 37L)];
                    if (var_8 == 95) {
                        int i_9 = stringbuilder_5.length() - 1;
                        stringbuilder_5.setCharAt(i_9, Character.toUpperCase(stringbuilder_5.charAt(i_9)));
                        var_8 = 160;
                    }
                }

                stringbuilder_5.reverse();
                stringbuilder_5.setCharAt(0, Character.toUpperCase(stringbuilder_5.charAt(0)));
                return stringbuilder_5.toString();
            }
        } else
            return null;
    }

    public static String staticMethod227(CharSequence charsequence_0) {
        String string_2 = staticMethod226(staticMethod225(charsequence_0));
        if (string_2 == null)
            string_2 = "";

        return string_2;
    }

}

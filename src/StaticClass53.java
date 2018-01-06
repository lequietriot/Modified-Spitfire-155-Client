
public class StaticClass53 {

    public static int staticInt149;
    static final char[] staticCharArray3 = new char[] { ' ', '\u00a0', '_', '-', '\u00e0', '\u00e1', '\u00e2', '\u00e4', '\u00e3', '\u00c0', '\u00c1', '\u00c2', '\u00c4', '\u00c3', '\u00e8', '\u00e9', '\u00ea', '\u00eb', '\u00c8', '\u00c9', '\u00ca', '\u00cb', '\u00ed', '\u00ee', '\u00ef', '\u00cd', '\u00ce', '\u00cf', '\u00f2', '\u00f3', '\u00f4', '\u00f6', '\u00f5', '\u00d2', '\u00d3', '\u00d4', '\u00d6', '\u00d5', '\u00f9', '\u00fa', '\u00fb', '\u00fc', '\u00d9', '\u00da', '\u00db', '\u00dc', '\u00e7', '\u00c7', '\u00ff', '\u0178', '\u00f1', '\u00d1', '\u00df' };
    static final char[] staticCharArray4 = new char[] { '[', ']', '#' };

    StaticClass53() throws Throwable {
        throw new Error();
    }

    static final boolean staticMethod223(char var_0) {
        return var_0 == 160 || var_0 == 32 || var_0 == 95 || var_0 == 45;
    }

    public static String staticMethod224(CharSequence charsequence_0, Class12 class12_1) {
        if (charsequence_0 == null)
            return null;
        else {
            int i_3 = 0;

            int i_4;
            for (i_4 = charsequence_0.length(); i_3 < i_4 && staticMethod223(charsequence_0.charAt(i_3)); i_3++)
                ;

            while (i_4 > i_3 && staticMethod223(charsequence_0.charAt(i_4 - 1)))
                --i_4;

            int i_5 = i_4 - i_3;
            if (i_5 >= 1) {
                byte b_7;
                if (class12_1 == null)
                    b_7 = 12;
                else
                    switch (class12_1.int296) {
                    case 7:
                        b_7 = 20;
                        break;
                    default:
                        b_7 = 12;
                    }

                if (i_5 <= b_7) {
                    StringBuilder stringbuilder_6 = new StringBuilder(i_5);

                    for (int i_13 = i_3; i_13 < i_4; i_13++) {
                        char var_8 = charsequence_0.charAt(i_13);
                        boolean bool_9;
                        if (Character.isISOControl(var_8))
                            bool_9 = false;
                        else if (StaticClass51.staticMethod214(var_8))
                            bool_9 = true;
                        else {
                            char[] arr_10 = staticCharArray3;
                            int i_11 = 0;

                            label82: while (true) {
                                char var_12;
                                if (i_11 >= arr_10.length) {
                                    arr_10 = staticCharArray4;

                                    for (i_11 = 0; i_11 < arr_10.length; i_11++) {
                                        var_12 = arr_10[i_11];
                                        if (var_12 == var_8) {
                                            bool_9 = true;
                                            break label82;
                                        }
                                    }

                                    bool_9 = false;
                                    break;
                                }

                                var_12 = arr_10[i_11];
                                if (var_8 == var_12) {
                                    bool_9 = true;
                                    break;
                                }

                                ++i_11;
                            }
                        }

                        if (bool_9) {
                            char var_14;
                            switch (var_8) {
                            case ' ':
                            case '-':
                            case '_':
                            case '\u00a0':
                                var_14 = 95;
                                break;
                            case '#':
                            case '[':
                            case ']':
                                var_14 = var_8;
                                break;
                            case '\u00c0':
                            case '\u00c1':
                            case '\u00c2':
                            case '\u00c3':
                            case '\u00c4':
                            case '\u00e0':
                            case '\u00e1':
                            case '\u00e2':
                            case '\u00e3':
                            case '\u00e4':
                                var_14 = 97;
                                break;
                            case '\u00c7':
                            case '\u00e7':
                                var_14 = 99;
                                break;
                            case '\u00c8':
                            case '\u00c9':
                            case '\u00ca':
                            case '\u00cb':
                            case '\u00e8':
                            case '\u00e9':
                            case '\u00ea':
                            case '\u00eb':
                                var_14 = 101;
                                break;
                            case '\u00cd':
                            case '\u00ce':
                            case '\u00cf':
                            case '\u00ed':
                            case '\u00ee':
                            case '\u00ef':
                                var_14 = 105;
                                break;
                            case '\u00d1':
                            case '\u00f1':
                                var_14 = 110;
                                break;
                            case '\u00d2':
                            case '\u00d3':
                            case '\u00d4':
                            case '\u00d5':
                            case '\u00d6':
                            case '\u00f2':
                            case '\u00f3':
                            case '\u00f4':
                            case '\u00f5':
                            case '\u00f6':
                                var_14 = 111;
                                break;
                            case '\u00d9':
                            case '\u00da':
                            case '\u00db':
                            case '\u00dc':
                            case '\u00f9':
                            case '\u00fa':
                            case '\u00fb':
                            case '\u00fc':
                                var_14 = 117;
                                break;
                            case '\u00df':
                                var_14 = 98;
                                break;
                            case '\u00ff':
                            case '\u0178':
                                var_14 = 121;
                                break;
                            default:
                                var_14 = Character.toLowerCase(var_8);
                            }

                            if (var_14 != 0)
                                stringbuilder_6.append(var_14);
                        }
                    }

                    if (stringbuilder_6.length() == 0)
                        return null;

                    return stringbuilder_6.toString();
                }
            }

            return null;
        }
    }

}

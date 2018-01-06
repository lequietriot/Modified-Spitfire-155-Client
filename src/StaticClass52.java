
public class StaticClass52 {

    static IndexedSprite[] staticIndexedSpriteArray7;
    public static final char[] staticCharArray2 = new char[] { '\u20ac', '\u0000', '\u201a', '\u0192', '\u201e', '\u2026', '\u2020', '\u2021', '\u02c6', '\u2030', '\u0160', '\u2039', '\u0152', '\u0000', '\u017d', '\u0000', '\u0000', '\u2018', '\u2019', '\u201c', '\u201d', '\u2022', '\u2013', '\u2014', '\u02dc', '\u2122', '\u0161', '\u203a', '\u0153', '\u0000', '\u017e', '\u0178' };

    StaticClass52() throws Throwable {
        throw new Error();
    }

    public static byte staticMethod217(char var_0) {
        byte b_2;
        if ((var_0 <= 0 || var_0 >= 128) && (var_0 < 160 || var_0 > 255)) {
            if (var_0 == 8364)
                b_2 = -128;
            else if (var_0 == 8218)
                b_2 = -126;
            else if (var_0 == 402)
                b_2 = -125;
            else if (var_0 == 8222)
                b_2 = -124;
            else if (var_0 == 8230)
                b_2 = -123;
            else if (var_0 == 8224)
                b_2 = -122;
            else if (var_0 == 8225)
                b_2 = -121;
            else if (var_0 == 710)
                b_2 = -120;
            else if (var_0 == 8240)
                b_2 = -119;
            else if (var_0 == 352)
                b_2 = -118;
            else if (var_0 == 8249)
                b_2 = -117;
            else if (var_0 == 338)
                b_2 = -116;
            else if (var_0 == 381)
                b_2 = -114;
            else if (var_0 == 8216)
                b_2 = -111;
            else if (var_0 == 8217)
                b_2 = -110;
            else if (var_0 == 8220)
                b_2 = -109;
            else if (var_0 == 8221)
                b_2 = -108;
            else if (var_0 == 8226)
                b_2 = -107;
            else if (var_0 == 8211)
                b_2 = -106;
            else if (var_0 == 8212)
                b_2 = -105;
            else if (var_0 == 732)
                b_2 = -104;
            else if (var_0 == 8482)
                b_2 = -103;
            else if (var_0 == 353)
                b_2 = -102;
            else if (var_0 == 8250)
                b_2 = -101;
            else if (var_0 == 339)
                b_2 = -100;
            else if (var_0 == 382)
                b_2 = -98;
            else if (var_0 == 376)
                b_2 = -97;
            else
                b_2 = 63;
        } else
            b_2 = (byte) var_0;

        return b_2;
    }

    public static boolean staticMethod218(char var_0) {
        if ((var_0 <= 0 || var_0 >= 128) && (var_0 < 160 || var_0 > 255)) {
            if (var_0 != 0) {
                char[] arr_2 = staticCharArray2;

                for (int i_3 = 0; i_3 < arr_2.length; i_3++) {
                    char var_4 = arr_2[i_3];
                    if (var_0 == var_4)
                        return true;
                }
            }

            return false;
        } else
            return true;
    }

    public static byte[] staticMethod219(CharSequence charsequence_0) {
        int i_2 = charsequence_0.length();
        byte[] bytes_3 = new byte[i_2];

        for (int i_4 = 0; i_4 < i_2; i_4++) {
            char var_5 = charsequence_0.charAt(i_4);
            if ((var_5 <= 0 || var_5 >= 128) && (var_5 < 160 || var_5 > 255)) {
                if (var_5 == 8364)
                    bytes_3[i_4] = -128;
                else if (var_5 == 8218)
                    bytes_3[i_4] = -126;
                else if (var_5 == 402)
                    bytes_3[i_4] = -125;
                else if (var_5 == 8222)
                    bytes_3[i_4] = -124;
                else if (var_5 == 8230)
                    bytes_3[i_4] = -123;
                else if (var_5 == 8224)
                    bytes_3[i_4] = -122;
                else if (var_5 == 8225)
                    bytes_3[i_4] = -121;
                else if (var_5 == 710)
                    bytes_3[i_4] = -120;
                else if (var_5 == 8240)
                    bytes_3[i_4] = -119;
                else if (var_5 == 352)
                    bytes_3[i_4] = -118;
                else if (var_5 == 8249)
                    bytes_3[i_4] = -117;
                else if (var_5 == 338)
                    bytes_3[i_4] = -116;
                else if (var_5 == 381)
                    bytes_3[i_4] = -114;
                else if (var_5 == 8216)
                    bytes_3[i_4] = -111;
                else if (var_5 == 8217)
                    bytes_3[i_4] = -110;
                else if (var_5 == 8220)
                    bytes_3[i_4] = -109;
                else if (var_5 == 8221)
                    bytes_3[i_4] = -108;
                else if (var_5 == 8226)
                    bytes_3[i_4] = -107;
                else if (var_5 == 8211)
                    bytes_3[i_4] = -106;
                else if (var_5 == 8212)
                    bytes_3[i_4] = -105;
                else if (var_5 == 732)
                    bytes_3[i_4] = -104;
                else if (var_5 == 8482)
                    bytes_3[i_4] = -103;
                else if (var_5 == 353)
                    bytes_3[i_4] = -102;
                else if (var_5 == 8250)
                    bytes_3[i_4] = -101;
                else if (var_5 == 339)
                    bytes_3[i_4] = -100;
                else if (var_5 == 382)
                    bytes_3[i_4] = -98;
                else if (var_5 == 376)
                    bytes_3[i_4] = -97;
                else
                    bytes_3[i_4] = 63;
            } else
                bytes_3[i_4] = (byte) var_5;
        }

        return bytes_3;
    }

    public static int staticMethod220(CharSequence charsequence_0, int i_1, int i_2, byte[] bytes_3, int i_4) {
        int i_6 = i_2 - i_1;

        for (int i_7 = 0; i_7 < i_6; i_7++) {
            char var_8 = charsequence_0.charAt(i_1 + i_7);
            if (var_8 > 0 && var_8 < 128 || var_8 >= 160 && var_8 <= 255)
                bytes_3[i_7 + i_4] = (byte) var_8;
            else if (var_8 == 8364)
                bytes_3[i_4 + i_7] = -128;
            else if (var_8 == 8218)
                bytes_3[i_7 + i_4] = -126;
            else if (var_8 == 402)
                bytes_3[i_4 + i_7] = -125;
            else if (var_8 == 8222)
                bytes_3[i_7 + i_4] = -124;
            else if (var_8 == 8230)
                bytes_3[i_7 + i_4] = -123;
            else if (var_8 == 8224)
                bytes_3[i_7 + i_4] = -122;
            else if (var_8 == 8225)
                bytes_3[i_4 + i_7] = -121;
            else if (var_8 == 710)
                bytes_3[i_4 + i_7] = -120;
            else if (var_8 == 8240)
                bytes_3[i_4 + i_7] = -119;
            else if (var_8 == 352)
                bytes_3[i_4 + i_7] = -118;
            else if (var_8 == 8249)
                bytes_3[i_7 + i_4] = -117;
            else if (var_8 == 338)
                bytes_3[i_7 + i_4] = -116;
            else if (var_8 == 381)
                bytes_3[i_7 + i_4] = -114;
            else if (var_8 == 8216)
                bytes_3[i_7 + i_4] = -111;
            else if (var_8 == 8217)
                bytes_3[i_4 + i_7] = -110;
            else if (var_8 == 8220)
                bytes_3[i_7 + i_4] = -109;
            else if (var_8 == 8221)
                bytes_3[i_4 + i_7] = -108;
            else if (var_8 == 8226)
                bytes_3[i_7 + i_4] = -107;
            else if (var_8 == 8211)
                bytes_3[i_7 + i_4] = -106;
            else if (var_8 == 8212)
                bytes_3[i_4 + i_7] = -105;
            else if (var_8 == 732)
                bytes_3[i_4 + i_7] = -104;
            else if (var_8 == 8482)
                bytes_3[i_4 + i_7] = -103;
            else if (var_8 == 353)
                bytes_3[i_4 + i_7] = -102;
            else if (var_8 == 8250)
                bytes_3[i_4 + i_7] = -101;
            else if (var_8 == 339)
                bytes_3[i_7 + i_4] = -100;
            else if (var_8 == 382)
                bytes_3[i_4 + i_7] = -98;
            else if (var_8 == 376)
                bytes_3[i_7 + i_4] = -97;
            else
                bytes_3[i_7 + i_4] = 63;
        }

        return i_6;
    }

    public static String staticMethod221(byte[] bytes_0, int i_1, int i_2) {
        char[] arr_4 = new char[i_2];
        int i_5 = 0;

        for (int i_6 = 0; i_6 < i_2; i_6++) {
            int i_7 = bytes_0[i_1 + i_6] & 0xff;
            if (i_7 != 0) {
                if (i_7 >= 128 && i_7 < 160) {
                    char var_8 = staticCharArray2[i_7 - 128];
                    if (var_8 == 0)
                        var_8 = 63;

                    i_7 = var_8;
                }

                arr_4[i_5++] = (char) i_7;
            }
        }

        return new String(arr_4, 0, i_5);
    }

}

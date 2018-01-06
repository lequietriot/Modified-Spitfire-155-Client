
public final class StaticClass5 {

    public static int staticInt35;
    static int[][] staticIntArrayArray2;

    StaticClass5() throws Throwable {
        throw new Error();
    }

    public static int staticMethod33(CharSequence charsequence_0) {
        int i_2 = charsequence_0.length();
        int i_3 = 0;

        for (int i_4 = 0; i_4 < i_2; i_4++) {
            char var_5 = charsequence_0.charAt(i_4);
            if (var_5 <= 127)
                ++i_3;
            else if (var_5 <= 2047)
                i_3 += 2;
            else
                i_3 += 3;
        }

        return i_3;
    }

    public static String staticMethod34(byte[] bytes_0, int i_1, int i_2) {
        char[] arr_4 = new char[i_2];
        int i_5 = 0;
        int i_6 = i_1;

        int i_9;
        for (int i_7 = i_1 + i_2; i_6 < i_7; arr_4[i_5++] = (char) i_9) {
            int i_8 = bytes_0[i_6++] & 0xff;
            if (i_8 < 128) {
                if (i_8 == 0)
                    i_9 = 65533;
                else
                    i_9 = i_8;
            } else if (i_8 < 192)
                i_9 = 65533;
            else if (i_8 < 224) {
                if (i_6 < i_7 && (bytes_0[i_6] & 0xc0) == 128) {
                    i_9 = (i_8 & 0x1f) << 6 | bytes_0[i_6++] & 0x3f;
                    if (i_9 < 128)
                        i_9 = 65533;
                } else
                    i_9 = 65533;
            } else if (i_8 < 240) {
                if (i_6 + 1 < i_7 && (bytes_0[i_6] & 0xc0) == 128 && (bytes_0[i_6 + 1] & 0xc0) == 128) {
                    i_9 = (i_8 & 0xf) << 12 | (bytes_0[i_6++] & 0x3f) << 6 | bytes_0[i_6++] & 0x3f;
                    if (i_9 < 2048)
                        i_9 = 65533;
                } else
                    i_9 = 65533;
            } else if (i_8 < 248) {
                if (i_6 + 2 < i_7 && (bytes_0[i_6] & 0xc0) == 128 && (bytes_0[i_6 + 1] & 0xc0) == 128 && (bytes_0[i_6 + 2] & 0xc0) == 128) {
                    i_9 = (i_8 & 0x7) << 18 | (bytes_0[i_6++] & 0x3f) << 12 | (bytes_0[i_6++] & 0x3f) << 6 | bytes_0[i_6++] & 0x3f;
                    if (i_9 >= 65536 && i_9 <= 1114111)
                        i_9 = 65533;
                    else
                        i_9 = 65533;
                } else
                    i_9 = 65533;
            } else
                i_9 = 65533;
        }

        return new String(arr_4, 0, i_5);
    }

}


public class StaticClass25 {

    static IndexedSprite[] staticIndexedSpriteArray6;
    public static Widget[][] staticWidgetArrayArray1;

    StaticClass25() throws Throwable {
        throw new Error();
    }

    public static int staticMethod145(int i_0, int i_1) {
        int i_3;
        for (i_3 = 1; i_1 > 1; i_1 >>= 1) {
            if ((i_1 & 0x1) != 0)
                i_3 *= i_0;

            i_0 *= i_0;
        }

        if (i_1 == 1)
            return i_0 * i_3;
        else
            return i_3;
    }

    public static int staticMethod146(int i_0, int i_1) {
        int i_3;
        if (i_1 > i_0) {
            i_3 = i_0;
            i_0 = i_1;
            i_1 = i_3;
        }

        while (i_1 != 0) {
            i_3 = i_0 % i_1;
            i_0 = i_1;
            i_1 = i_3;
        }

        return i_0;
    }

    public static int staticMethod147(byte[] bytes_0, int i_1, CharSequence charsequence_2) {
        int i_4 = charsequence_2.length();
        int i_5 = i_1;

        for (int i_6 = 0; i_6 < i_4; i_6++) {
            char var_7 = charsequence_2.charAt(i_6);
            if (var_7 <= 127)
                bytes_0[i_5++] = (byte) var_7;
            else if (var_7 <= 2047) {
                bytes_0[i_5++] = (byte) (0xc0 | var_7 >> 6);
                bytes_0[i_5++] = (byte) (0x80 | var_7 & 0x3f);
            } else {
                bytes_0[i_5++] = (byte) (0xe0 | var_7 >> 12);
                bytes_0[i_5++] = (byte) (0x80 | var_7 >> 6 & 0x3f);
                bytes_0[i_5++] = (byte) (0x80 | var_7 & 0x3f);
            }
        }

        return i_5 - i_1;
    }

    public static int staticMethod148(int i_0) {
        i_0 = (i_0 & 0x55555555) + (i_0 >>> 1 & 0x55555555);
        i_0 = (i_0 >>> 2 & 0x33333333) + (i_0 & 0x33333333);
        i_0 = i_0 + (i_0 >>> 4) & 0xf0f0f0f;
        i_0 += i_0 >>> 8;
        i_0 += i_0 >>> 16;
        return i_0 & 0xff;
    }

    public static int staticMethod149(int i_0) {
        --i_0;
        i_0 |= i_0 >>> 1;
        i_0 |= i_0 >>> 2;
        i_0 |= i_0 >>> 4;
        i_0 |= i_0 >>> 8;
        i_0 |= i_0 >>> 16;
        return i_0 + 1;
    }

    public static int staticMethod150(int i_0) {
        int i_2 = 0;
        if (i_0 < 0 || i_0 >= 65536) {
            i_0 >>>= 16;
            i_2 += 16;
        }

        if (i_0 >= 256) {
            i_0 >>>= 8;
            i_2 += 8;
        }

        if (i_0 >= 16) {
            i_0 >>>= 4;
            i_2 += 4;
        }

        if (i_0 >= 4) {
            i_0 >>>= 2;
            i_2 += 2;
        }

        if (i_0 >= 1) {
            i_0 >>>= 1;
            ++i_2;
        }

        return i_0 + i_2;
    }

    public static int staticMethod151(int i_0, int i_1) {
        int i_3;
        for (i_3 = 0; i_1 > 0; --i_1) {
            i_3 = i_3 << 1 | i_0 & 0x1;
            i_0 >>>= 1;
        }

        return i_3;
    }

    public static int staticMethod152(int i_0, int i_1) {
        int i_3 = i_0 >>> 31;
        return (i_3 + i_0) / i_1 - i_3;
    }

}

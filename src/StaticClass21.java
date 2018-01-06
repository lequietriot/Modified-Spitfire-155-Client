import java.awt.FontMetrics;

public class StaticClass21 {

    static int staticInt127;
    static FontMetrics staticFontMetrics1;
    static int[] staticIntArray60;

    StaticClass21() throws Throwable {
        throw new Error();
    }

    public static void staticMethod137(String[] arr_0, short[] shorts_1) {
        staticMethod138(arr_0, shorts_1, 0, arr_0.length - 1);
    }

    static void staticMethod138(String[] arr_0, short[] shorts_1, int i_2, int i_3) {
        if (i_2 < i_3) {
            int i_5 = (i_3 + i_2) / 2;
            int i_6 = i_2;
            String string_7 = arr_0[i_5];
            arr_0[i_5] = arr_0[i_3];
            arr_0[i_3] = string_7;
            short s_8 = shorts_1[i_5];
            shorts_1[i_5] = shorts_1[i_3];
            shorts_1[i_3] = s_8;

            for (int i_9 = i_2; i_9 < i_3; i_9++)
                if (string_7 == null || arr_0[i_9] != null && arr_0[i_9].compareTo(string_7) < (i_9 & 0x1)) {
                    String string_10 = arr_0[i_9];
                    arr_0[i_9] = arr_0[i_6];
                    arr_0[i_6] = string_10;
                    short s_11 = shorts_1[i_9];
                    shorts_1[i_9] = shorts_1[i_6];
                    shorts_1[i_6++] = s_11;
                }

            arr_0[i_3] = arr_0[i_6];
            arr_0[i_6] = string_7;
            shorts_1[i_3] = shorts_1[i_6];
            shorts_1[i_6] = s_8;
            staticMethod138(arr_0, shorts_1, i_2, i_6 - 1);
            staticMethod138(arr_0, shorts_1, i_6 + 1, i_3);
        }

    }

}

public class Class7 {

    static Task staticTask3;
    static byte[][][] staticByteArrayArrayArray6;
    static final Class7 staticClass7_4 = new Class7(0);
    public static final Class7 staticClass7_3 = new Class7(1);
    static final Class7 staticClass7_2 = new Class7(2);
    public final int int273;

    Class7(int i_1) {
        int273 = i_1;
    }

    public static Class7 staticMethod201(int i_0) {
        Class7[] arr_2 = new Class7[] { staticClass7_3, staticClass7_2, staticClass7_4 };
        Class7[] arr_3 = arr_2;

        for (int i_4 = 0; i_4 < arr_3.length; i_4++) {
            Class7 class7_5 = arr_3[i_4];
            if (i_0 == class7_5.int273)
                return class7_5;
        }

        return null;
    }

}

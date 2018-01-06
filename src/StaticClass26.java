import java.util.HashMap;

public class StaticClass26 {

    static int[][][] staticIntArrayArrayArray2;

    static {
        new HashMap();
    }

    StaticClass26() throws Throwable {
        throw new Error();
    }

    public static Enum staticMethod155(Enum[] arr_0, int i_1) {
        Enum[] arr_3 = arr_0;

        for (int i_4 = 0; i_4 < arr_3.length; i_4++) {
            Enum enum_5 = arr_3[i_4];
            if (i_1 == enum_5.ordinal())
                return enum_5;
        }

        return null;
    }

}

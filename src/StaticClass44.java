
public class StaticClass44 {

    static int staticInt135;
    static int[] staticIntArray67 = new int[32];
    public static int[] staticIntArray66;
    public static int[] staticIntArray68;

    static {
        int i_0 = 2;

        for (int i_1 = 0; i_1 < 32; i_1++) {
            staticIntArray67[i_1] = i_0 - 1;
            i_0 += i_0;
        }

        staticIntArray66 = new int[2000];
        staticIntArray68 = new int[2000];
    }

    StaticClass44() throws Throwable {
        throw new Error();
    }

    public static int staticMethod183(int i_0) {
        Varbit varbit_3 = (Varbit) Varbit.staticCache19.get(i_0);
        Varbit varbit_2;
        if (varbit_3 != null)
            varbit_2 = varbit_3;
        else {
            byte[] bytes_4 = Varbit.staticJs5Index22.getFile(14, i_0);
            varbit_3 = new Varbit();
            if (bytes_4 != null)
                varbit_3.decode(new Buffer(bytes_4));

            Varbit.staticCache19.put(varbit_3, i_0);
            varbit_2 = varbit_3;
        }

        int i_8 = varbit_2.id;
        int i_5 = varbit_2.startBit;
        int i_6 = varbit_2.endBit;
        int i_7 = staticIntArray67[i_6 - i_5];
        return staticIntArray68[i_8] >> i_5 & i_7;
    }

    public static void staticMethod184(int i_0, int i_1) {
        Varbit varbit_4 = (Varbit) Varbit.staticCache19.get(i_0);
        Varbit varbit_3;
        if (varbit_4 != null)
            varbit_3 = varbit_4;
        else {
            byte[] bytes_5 = Varbit.staticJs5Index22.getFile(14, i_0);
            varbit_4 = new Varbit();
            if (bytes_5 != null)
                varbit_4.decode(new Buffer(bytes_5));

            Varbit.staticCache19.put(varbit_4, i_0);
            varbit_3 = varbit_4;
        }

        int i_9 = varbit_3.id;
        int i_6 = varbit_3.startBit;
        int i_7 = varbit_3.endBit;
        int i_8 = staticIntArray67[i_7 - i_6];
        if (i_1 < 0 || i_1 > i_8)
            i_1 = 0;

        i_8 <<= i_6;
        staticIntArray68[i_9] = staticIntArray68[i_9] & ~i_8 | i_1 << i_6 & i_8;
    }

}

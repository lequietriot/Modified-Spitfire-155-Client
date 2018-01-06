public class StaticClass38 {

    public static final boolean[] staticBoolArray3 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };
    public static int[] staticIntArray64 = new int[99];

    static {
        int i_0 = 0;

        for (int i_1 = 0; i_1 < 99; i_1++) {
            int i_2 = i_1 + 1;
            int i_3 = (int) (i_2 + 300.0D * Math.pow(2.0D, i_2 / 7.0D));
            i_0 += i_3;
            staticIntArray64[i_1] = i_0 / 4;
        }

    }

    StaticClass38() throws Throwable {
        throw new Error();
    }

}

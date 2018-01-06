
public class StaticClass34 {

    StaticClass34() throws Throwable {
        throw new Error();
    }

    public static int staticMethod170(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5) {
        if ((i_5 & 0x1) == 1) {
            int i_7 = i_3;
            i_3 = i_4;
            i_4 = i_7;
        }

        i_2 &= 0x3;
        return i_2 == 0 ? i_1 : i_2 == 1 ? 7 - i_0 - (i_3 - 1) : i_2 == 2 ? 7 - i_1 - (i_4 - 1) : i_0;
    }

}

public class Class6 implements Enum {

    static final Class6 staticClass6_6 = new Class6(0, -1, true, false, true);
    static final Class6 staticClass6_2 = new Class6(1, 0, true, true, true);
    static final Class6 staticClass6_4 = new Class6(2, 1, true, true, false);
    static final Class6 staticClass6_1 = new Class6(3, 2, false, false, true);
    static final Class6 staticClass6_3 = new Class6(4, 3, false, false, true);
    static final Class6 staticClass6_5 = new Class6(5, 10, false, false, true);
    final int int258;
    public final int int259;
    public final boolean bool16;
    public final boolean bool17;

    public static Class6[] staticMethod175() {
        return new Class6[] { staticClass6_2, staticClass6_6, staticClass6_4, staticClass6_1, staticClass6_3, staticClass6_5 };
    }

    Class6(int i_1, int i_2, boolean bool_3, boolean bool_4, boolean bool_5) {
        int258 = i_1;
        int259 = i_2;
        bool16 = bool_4;
        bool17 = bool_5;
    }

    @Override
    public int ordinal() {
        return int258;
    }

}

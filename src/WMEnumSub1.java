
public class WMEnumSub1 implements WMEnum {

    public static final WMEnumSub1 staticWMEnumSub1_10 = new WMEnumSub1("", 10);
    public static final WMEnumSub1 staticWMEnumSub1_1 = new WMEnumSub1("", 11);
    public static final WMEnumSub1 staticWMEnumSub1_2 = new WMEnumSub1("", 12);
    public static final WMEnumSub1 staticWMEnumSub1_3 = new WMEnumSub1("", 13);
    public static final WMEnumSub1 staticWMEnumSub1_4 = new WMEnumSub1("", 14);
    public static final WMEnumSub1 staticWMEnumSub1_8;
    public static final WMEnumSub1 staticWMEnumSub1_6;
    public static final WMEnumSub1 staticWMEnumSub1_7;
    static final WMEnumSub1 staticWMEnumSub1_9;
    public static final WMEnumSub1 staticWMEnumSub1_5;
    public final int int257;

    static {
        staticWMEnumSub1_8 = new WMEnumSub1("", 15, new WMEnum2[] { WMEnum2.staticWMEnum2_180, WMEnum2.staticWMEnum2_180 }, (WMEnum2[]) null);
        staticWMEnumSub1_6 = new WMEnumSub1("", 16, new WMEnum2[] { WMEnum2.staticWMEnum2_180, WMEnum2.staticWMEnum2_180 }, (WMEnum2[]) null);
        staticWMEnumSub1_7 = new WMEnumSub1("", 17, new WMEnum2[] { WMEnum2.staticWMEnum2_180, WMEnum2.staticWMEnum2_180 }, (WMEnum2[]) null);
        staticWMEnumSub1_9 = new WMEnumSub1("", 73, true, true);
        staticWMEnumSub1_5 = new WMEnumSub1("", 76, true, false);
    }

    WMEnumSub1(String string_1, int i_2) {
        this(string_1, i_2, false, (WMEnum2[]) null, false, (WMEnum2[]) null);
    }

    WMEnumSub1(String string_1, int i_2, boolean bool_3, boolean bool_4) {
        this(string_1, i_2, bool_3, (WMEnum2[]) null, bool_4, (WMEnum2[]) null);
    }

    WMEnumSub1(String string_1, int i_2, WMEnum2[] arr_3, WMEnum2[] arr_4) {
        this(string_1, i_2, arr_3 != null, arr_3, arr_4 != null, arr_4);
    }

    WMEnumSub1(String string_1, int i_2, boolean bool_3, WMEnum2[] arr_4, boolean bool_5, WMEnum2[] arr_6) {
        int257 = i_2;
    }

    public static boolean staticMethod174(WMEnumSub1 wmenumsub1_0) {
        return wmenumsub1_0 == staticWMEnumSub1_10 || staticWMEnumSub1_1 == wmenumsub1_0 || staticWMEnumSub1_2 == wmenumsub1_0 || staticWMEnumSub1_3 == wmenumsub1_0 || staticWMEnumSub1_4 == wmenumsub1_0 || staticWMEnumSub1_8 == wmenumsub1_0 || staticWMEnumSub1_6 == wmenumsub1_0 || staticWMEnumSub1_7 == wmenumsub1_0;
    }

    @Override
    public int ordinal() {
        return int257;
    }

}

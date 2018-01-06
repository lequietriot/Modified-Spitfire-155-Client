
public class WMEnum3 implements Enum {

    public static final WMEnum3 staticWMEnum3_7 = new WMEnum3(6, 0);
    public static final WMEnum3 staticWMEnum3_1 = new WMEnum3(5, 1);
    public static final WMEnum3 staticWMEnum3_2 = new WMEnum3(1, 2);
    public static final WMEnum3 staticWMEnum3_3 = new WMEnum3(0, 3);
    public static final WMEnum3 staticWMEnum3_8 = new WMEnum3(2, 4);
    public static final WMEnum3 staticWMEnum3_4 = new WMEnum3(4, 5);
    public static final WMEnum3 staticWMEnum3_6 = new WMEnum3(7, 6);
    public static final WMEnum3 staticWMEnum3_5 = new WMEnum3(3, 7);
    public final int int256;
    final int int255;

    public static WMEnum3[] staticMethod172() {
        return new WMEnum3[] { staticWMEnum3_7, staticWMEnum3_8, staticWMEnum3_5, staticWMEnum3_6, staticWMEnum3_2, staticWMEnum3_1, staticWMEnum3_4, staticWMEnum3_3 };
    }

    WMEnum3(int i_1, int i_2) {
        int256 = i_1;
        int255 = i_2;
    }

    @Override
    public int ordinal() {
        return int255;
    }

}


public class WMEnum4 implements Enum {

    static int staticInt136;
    public static final WMEnum4 staticWMEnum4_18 = new WMEnum4(0);
    static final WMEnum4 staticWMEnum4_2 = new WMEnum4(1);
    public static final WMEnum4 staticWMEnum4_3 = new WMEnum4(2);
    public static final WMEnum4 staticWMEnum4_4 = new WMEnum4(3);
    public static final WMEnum4 staticWMEnum4_5 = new WMEnum4(9);
    static final WMEnum4 staticWMEnum4_17 = new WMEnum4(4);
    static final WMEnum4 staticWMEnum4_1 = new WMEnum4(5);
    static final WMEnum4 staticWMEnum4_6 = new WMEnum4(6);
    static final WMEnum4 staticWMEnum4_15 = new WMEnum4(7);
    static final WMEnum4 staticWMEnum4_8 = new WMEnum4(8);
    static final WMEnum4 staticWMEnum4_9 = new WMEnum4(12);
    static final WMEnum4 staticWMEnum4_11 = new WMEnum4(13);
    static final WMEnum4 staticWMEnum4_19 = new WMEnum4(14);
    static final WMEnum4 staticWMEnum4_12 = new WMEnum4(15);
    static final WMEnum4 staticWMEnum4_13 = new WMEnum4(16);
    static final WMEnum4 staticWMEnum4_14 = new WMEnum4(17);
    static final WMEnum4 staticWMEnum4_7 = new WMEnum4(18);
    static final WMEnum4 staticWMEnum4_16 = new WMEnum4(19);
    static final WMEnum4 staticWMEnum4_23 = new WMEnum4(20);
    static final WMEnum4 staticWMEnum4_22 = new WMEnum4(21);
    static final WMEnum4 staticWMEnum4_10 = new WMEnum4(10);
    static final WMEnum4 staticWMEnum4_20 = new WMEnum4(11);
    static final WMEnum4 staticWMEnum4_21 = new WMEnum4(22);
    public final int ordinal;

    WMEnum4(int i_1) {
        ordinal = i_1;
    }

    @Override
    public int ordinal() {
        return ordinal;
    }

    public static boolean staticMethod185(int i_0) {
        return i_0 >= staticWMEnum4_10.ordinal && i_0 <= staticWMEnum4_20.ordinal;
    }

    public static boolean staticMethod186(int i_0) {
        return i_0 == staticWMEnum4_21.ordinal;
    }

}

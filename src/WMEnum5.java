public class WMEnum5 implements Enum {

    static Widget staticWidget1;
    static final WMEnum5 staticWMEnum5_3 = new WMEnum5(2, (byte) 0);
    static final WMEnum5 staticWMEnum5_4 = new WMEnum5(0, (byte) 1);
    static final WMEnum5 staticWMEnum5_1 = new WMEnum5(1, (byte) 2);
    static final WMEnum5 staticWMEnum5_2 = new WMEnum5(3, (byte) 3);
    final int int38;
    final byte byte1;

    static WMEnum5[] staticMethod1() {
        return new WMEnum5[] { staticWMEnum5_3, staticWMEnum5_1, staticWMEnum5_4, staticWMEnum5_2 };
    }

    WMEnum5(int i_1, byte b_2) {
        int38 = i_1;
        byte1 = b_2;
    }

    @Override
    public int ordinal() {
        return byte1;
    }

}

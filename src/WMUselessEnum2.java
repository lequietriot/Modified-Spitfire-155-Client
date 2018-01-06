
public class WMUselessEnum2 implements Enum {

    static final WMUselessEnum2 staticWMUselessEnum2_1 = new WMUselessEnum2(1, 0);
    static final WMUselessEnum2 staticWMUselessEnum2_3 = new WMUselessEnum2(0, 1);
    static final WMUselessEnum2 staticWMUselessEnum2_2 = new WMUselessEnum2(2, 2);
    public final int int264;
    final int int265;

    static WMUselessEnum2[] staticMethod199() {
        return new WMUselessEnum2[] { staticWMUselessEnum2_3, staticWMUselessEnum2_1, staticWMUselessEnum2_2 };
    }

    WMUselessEnum2(int i_1, int i_2) {
        int264 = i_1;
        int265 = i_2;
    }

    @Override
    public int ordinal() {
        return int265;
    }

}

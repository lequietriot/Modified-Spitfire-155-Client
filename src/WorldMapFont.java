public class WorldMapFont {

    public static final WorldMapFont staticWorldMapFont2 = new WorldMapFont("SMALL", 0, 0, 4);
    public static final WorldMapFont staticWorldMapFont1 = new WorldMapFont("MEDIUM", 1, 1, 2);
    public static final WorldMapFont staticWorldMapFont3 = new WorldMapFont("LARGE", 2, 2, 0);
    final String string18;
    final int int300;
    final int int299;
    final int int301;

    WorldMapFont(String string_1, int i_2, int i_3, int i_4) {
        string18 = string_1;
        int300 = i_2 * 1344060987;
        int299 = i_3;
        int301 = i_4;
    }

    boolean method383(float f_1) {
        return f_1 >= int301;
    }

}

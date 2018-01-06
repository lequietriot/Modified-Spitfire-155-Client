
public class StaticClass17 {

    public static boolean staticBool15 = false;
    public static int staticInt113 = 0;
    public static int staticInt112 = 0;
    public static boolean staticBool16 = false;
    public static int staticInt117 = 0;
    public static int[] staticIntArray56 = new int[1000];
    static int staticInt114;
    static int staticInt115;
    static int staticInt116;

    StaticClass17() throws Throwable {
        throw new Error();
    }

    static final boolean staticMethod122() {
        return staticBool15;
    }

    static final int staticMethod123() {
        return staticInt113;
    }

    static final int staticMethod124() {
        return staticInt112;
    }

    static final boolean staticMethod125(Model model_0, int i_1, int i_2, int i_3) {
        if (!staticMethod122())
            return false;
        else {
            int i_5;
            int i_6;
            int i_7;
            int i_8;
            int i_11;
            int i_12;
            int i_13;
            int i_16;
            int i_17;
            if (!staticBool16) {
                i_5 = Scene.staticInt92;
                i_6 = Scene.staticInt93;
                i_7 = Scene.staticInt108;
                i_8 = Scene.staticInt94;
                byte b_9 = 50;
                short s_10 = 3500;
                i_11 = (staticInt113 - Rasterizer3D.staticInt325) * b_9 / Rasterizer3D.staticInt326;
                i_12 = b_9 * (staticInt112 - Rasterizer3D.staticInt332) / Rasterizer3D.staticInt326;
                i_13 = s_10 * (staticInt113 - Rasterizer3D.staticInt325) / Rasterizer3D.staticInt326;
                int i_14 = (staticInt112 - Rasterizer3D.staticInt332) * s_10 / Rasterizer3D.staticInt326;
                int i_15 = Rasterizer3D.staticMethod492(i_12, b_9, i_6, i_5);
                i_16 = Rasterizer3D.staticMethod493(i_12, b_9, i_6, i_5);
                i_12 = i_15;
                i_15 = Rasterizer3D.staticMethod492(i_14, s_10, i_6, i_5);
                i_17 = Rasterizer3D.staticMethod493(i_14, s_10, i_6, i_5);
                i_14 = i_15;
                i_15 = Rasterizer3D.staticMethod490(i_11, i_16, i_8, i_7);
                i_16 = Rasterizer3D.staticMethod491(i_11, i_16, i_8, i_7);
                i_11 = i_15;
                i_15 = Rasterizer3D.staticMethod490(i_13, i_17, i_8, i_7);
                i_17 = Rasterizer3D.staticMethod491(i_13, i_17, i_8, i_7);
                staticInt114 = (i_15 + i_11) / 2;
                StaticClass12.staticInt55 = (i_14 + i_12) / 2;
                StaticClass51.staticInt148 = (i_17 + i_16) / 2;
                staticInt115 = (i_15 - i_11) / 2;
                BuildType.staticInt137 = (i_14 - i_12) / 2;
                staticInt116 = (i_17 - i_16) / 2;
                WorldMapTile.staticInt6 = Math.abs(staticInt115);
                ChatLine.staticInt305 = Math.abs(BuildType.staticInt137);
                Class2.staticInt17 = Math.abs(staticInt116);
            }

            i_5 = model_0.midx + i_1;
            i_6 = model_0.midy + i_2;
            i_7 = model_0.midz + i_3;
            i_8 = model_0.sizex;
            i_16 = model_0.sizey;
            i_17 = model_0.sizez;
            i_11 = staticInt114 - i_5;
            i_12 = StaticClass12.staticInt55 - i_6;
            i_13 = StaticClass51.staticInt148 - i_7;
            return Math.abs(i_11) > i_8 + WorldMapTile.staticInt6 ? false : Math.abs(i_12) > i_16 + ChatLine.staticInt305 ? false : Math.abs(i_13) > Class2.staticInt17 + i_17 ? false : Math.abs(BuildType.staticInt137 * i_13 - i_12 * staticInt116) > ChatLine.staticInt305 * i_17 + i_16 * Class2.staticInt17 ? false : Math.abs(staticInt116 * i_11 - i_13 * staticInt115) > i_17 * WorldMapTile.staticInt6 + i_8 * Class2.staticInt17 ? false : Math.abs(i_12 * staticInt115 - BuildType.staticInt137 * i_11) <= i_16 * WorldMapTile.staticInt6 + i_8 * ChatLine.staticInt305;
        }
    }

    static final void staticMethod126(NodeSub2 nodesub2_0) {
        int i_2 = 0;
        int i_3 = -1;
        int i_4 = 0;
        int i_5 = 0;
        if (nodesub2_0.int324 == 0)
            i_2 = LegacyClickboxDebug.staticScene1.method205(nodesub2_0.int330, nodesub2_0.int332, nodesub2_0.int326);

        if (nodesub2_0.int324 == 1)
            i_2 = LegacyClickboxDebug.staticScene1.method206(nodesub2_0.int330, nodesub2_0.int332, nodesub2_0.int326);

        if (nodesub2_0.int324 == 2)
            i_2 = LegacyClickboxDebug.staticScene1.method207(nodesub2_0.int330, nodesub2_0.int332, nodesub2_0.int326);

        if (nodesub2_0.int324 == 3)
            i_2 = LegacyClickboxDebug.staticScene1.method208(nodesub2_0.int330, nodesub2_0.int332, nodesub2_0.int326);

        if (i_2 != 0) {
            int i_6 = LegacyClickboxDebug.staticScene1.method209(nodesub2_0.int330, nodesub2_0.int332, nodesub2_0.int326, i_2);
            i_3 = i_2 >> 14 & 0x7fff;
            i_4 = i_6 & 0x1f;
            i_5 = i_6 >> 6 & 0x3;
        }

        nodesub2_0.int327 = i_3;
        nodesub2_0.int329 = i_4;
        nodesub2_0.int328 = i_5;
    }

}

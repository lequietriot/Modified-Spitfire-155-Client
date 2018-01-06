public final class AABBClickboxDebug extends DebugOverlay {

    static int[] staticIntArray131;
    static int staticInt317;
    final int minx;
    final int miny;
    final int minz;
    final int maxx;
    final int maxy;
    final int maxz;
    final int color;

    AABBClickboxDebug(Model model_1, int i_2, int i_3, int i_4, int i_5) {
        minx = i_2 + model_1.midx - model_1.sizex;
        miny = model_1.midy + i_3 - model_1.sizey;
        minz = i_4 + model_1.midz - model_1.sizez;
        maxx = model_1.sizex + i_2 + model_1.midx;
        maxy = model_1.sizey + i_3 + model_1.midy;
        maxz = model_1.sizez + i_4 + model_1.midz;
        color = i_5;
    }

    @Override
    public final void draw() {
        for (int i_5 = 0; i_5 < 8; i_5++) {
            int i_2 = (i_5 & 0x1) == 0 ? minx : maxx;
            int i_3 = (i_5 & 0x2) == 0 ? miny : maxy;
            int i_4 = (i_5 & 0x4) == 0 ? minz : maxz;
            if ((i_5 & 0x1) == 0)
                DebugOverlay.staticMethod386(i_2, i_3, i_4, maxx, i_3, i_4, color);

            if ((i_5 & 0x2) == 0)
                DebugOverlay.staticMethod386(i_2, i_3, i_4, i_2, maxy, i_4, color);

            if ((i_5 & 0x4) == 0)
                DebugOverlay.staticMethod386(i_2, i_3, i_4, i_2, i_3, maxz, color);
        }

    }

}

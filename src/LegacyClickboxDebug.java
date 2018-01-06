public final class LegacyClickboxDebug extends DebugOverlay {

    static Scene staticScene1;
    static Js5IndexImpl staticJs5IndexImpl16;
    final int minX;
    final int minY;
    final int maxX;
    final int maxY;
    final int color;

    LegacyClickboxDebug(int i_1, int i_2, int i_3, int i_4, int i_5) {
        minX = i_1;
        minY = i_2;
        maxX = i_3;
        maxY = i_4;
        color = i_5;
    }

    @Override
    public final void draw() {
        Rasterizer2D.staticMethod457(minX + Rasterizer2D.staticInt316, Rasterizer2D.staticInt311 + minY, maxX - minX, maxY - minY, color);
    }

}

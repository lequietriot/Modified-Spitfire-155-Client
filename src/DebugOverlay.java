public abstract class DebugOverlay extends Node {

    static int staticInt304;
    static FontFace staticFontFace3;

    public abstract void draw();

    static final void staticMethod386(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        int[] ints_8 = Scene.staticMethod121(i_0, i_1, i_2);
        int[] ints_9 = Scene.staticMethod121(i_3, i_4, i_5);
        Rasterizer2D.staticMethod463(ints_8[0], ints_8[1], ints_9[0], ints_9[1], i_6);
    }

}

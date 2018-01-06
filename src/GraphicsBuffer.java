public abstract class GraphicsBuffer {

    public int width;
    public int height;
    public int[] pixels;
    public static boolean staticBool23;

    public abstract void drawImageClip(int var1, int var2, int var3, int var4);

    public abstract void drawImage(int var1, int var2);

    public final void setRasterizerTarget() {
        Rasterizer2D.staticMethod440(pixels, width, height);
    }

}

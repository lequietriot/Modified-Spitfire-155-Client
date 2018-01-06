import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

public final class RasterGraphicsBuffer extends GraphicsBuffer {

    Image image1;
    Component component2;

    RasterGraphicsBuffer(int i_1, int i_2, Component component_3) {
        width = i_1;
        height = i_2;
        pixels = new int[i_1 * i_2 + 1];
        DataBufferInt databufferint_4 = new DataBufferInt(pixels, pixels.length);
        DirectColorModel directcolormodel_5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster writableraster_6 = Raster.createWritableRaster(directcolormodel_5.createCompatibleSampleModel(width, height), databufferint_4, (Point) null);
        image1 = new BufferedImage(directcolormodel_5, writableraster_6, false, new Hashtable());
        setComponent(component_3);
        setRasterizerTarget();
    }

    final void setComponent(Component component_1) {
        component2 = component_1;
    }

    @Override
    public final void drawImage(int i_1, int i_2) {
        this.drawImage(component2.getGraphics(), i_1, i_2);
    }

    @Override
    public final void drawImageClip(int i_1, int i_2, int i_3, int i_4) {
        this.drawImageClip(component2.getGraphics(), i_1, i_2, i_3, i_4);
    }

    final void drawImage(Graphics graphics_1, int i_2, int i_3) {
        try {
            graphics_1.drawImage(image1, i_2, i_3, component2);
        } catch (Exception exception_6) {
            component2.repaint();
        }

    }

    final void drawImageClip(Graphics graphics_1, int i_2, int i_3, int i_4, int i_5) {
        try {
            Shape shape_7 = graphics_1.getClip();
            graphics_1.clipRect(i_2, i_3, i_4, i_5);
            graphics_1.drawImage(image1, 0, 0, component2);
            graphics_1.setClip(shape_7);
        } catch (Exception exception_8) {
            component2.repaint();
        }

    }

}

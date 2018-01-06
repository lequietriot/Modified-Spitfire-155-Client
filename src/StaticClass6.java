import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

public class StaticClass6 {

    static int staticInt42;
    static Js5IndexImpl staticJs5IndexImpl6;
    static Sprite[] staticSpriteArray5;
    static Connection staticConnection2;

    static {
        ImageIO.setUseCache(false);
    }

    StaticClass6() throws Throwable {
        throw new Error();
    }

    public static final Sprite staticMethod36(byte[] bytes_0) {
        BufferedImage bufferedimage_2 = null;

        try {
            bufferedimage_2 = ImageIO.read(new ByteArrayInputStream(bytes_0));
            int i_3 = bufferedimage_2.getWidth();
            int i_4 = bufferedimage_2.getHeight();
            int[] ints_5 = new int[i_4 * i_3];
            PixelGrabber pixelgrabber_6 = new PixelGrabber(bufferedimage_2, 0, 0, i_3, i_4, ints_5, 0, i_3);
            pixelgrabber_6.grabPixels();
            return new Sprite(ints_5, i_3, i_4);
        } catch (IOException ioexception_7) {
            ;
        } catch (InterruptedException interruptedexception_8) {
            ;
        }

        return new Sprite(0, 0);
    }

}

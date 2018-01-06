import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

public final class GameCanvas extends Canvas {

    public static Buffer staticBuffer1;
    Component component1;

    GameCanvas(Component component_1) {
        component1 = component_1;
    }

    @Override
    public final void update(Graphics graphics_1) {
        component1.update(graphics_1);
    }

    @Override
    public final void paint(Graphics graphics_1) {
        component1.paint(graphics_1);
    }

}

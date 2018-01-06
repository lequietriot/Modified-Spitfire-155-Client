import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseHandler implements MouseListener, MouseMotionListener, FocusListener {

    static Sprite[] staticSpriteArray4;
    public static MouseHandler staticMouseHandler1 = new MouseHandler();
    static volatile int staticVolatileInt8 = 0;
    public static volatile int staticVolatileInt3 = 0;
    public static volatile int staticVolatileInt4 = -1;
    public static volatile int staticVolatileInt5 = -1;
    public static int staticInt26 = 0;
    public static int staticInt28 = 0;
    public static int staticInt29 = 0;
    public static volatile int staticVolatileInt7 = 0;
    public static volatile int staticVolatileInt6 = 0;
    public static volatile int staticVolatileInt2 = 0;
    public static volatile long staticVolatileLong1 = 0L;
    public static int staticInt27 = 0;
    public static int staticInt30 = 0;
    public static int staticInt31 = 0;
    public static long staticLong2 = 0L;

    static void staticMethod9(Component component_0) {
        component_0.addMouseListener(staticMouseHandler1);
        component_0.addMouseMotionListener(staticMouseHandler1);
        component_0.addFocusListener(staticMouseHandler1);
    }

    public static void staticMethod10() {
        if (staticMouseHandler1 != null) {
            MouseHandler mousehandler_1 = staticMouseHandler1;
            synchronized (staticMouseHandler1) {
                staticMouseHandler1 = null;
            }
        }

    }

    public static int staticMethod11() {
        return staticVolatileInt8++;
    }

    public static void staticMethod12(int i_0) {
        staticVolatileInt8 = i_0;
    }

    final int method96(MouseEvent mouseevent_1) {
        int i_3 = mouseevent_1.getButton();
        return !mouseevent_1.isAltDown() && i_3 != 2 ? !mouseevent_1.isMetaDown() && i_3 != 3 ? 1 : 2 : 4;
    }

    @Override
    public final synchronized void mousePressed(MouseEvent mouseevent_1) {
        if (staticMouseHandler1 != null) {
            staticVolatileInt8 = 0;
            staticVolatileInt6 = mouseevent_1.getX();
            staticVolatileInt2 = mouseevent_1.getY();
            staticVolatileLong1 = StaticClass27.synchronizedMethod7();
            staticVolatileInt7 = method96(mouseevent_1);
            if (staticVolatileInt7 != 0)
                staticVolatileInt3 = staticVolatileInt7;
        }

        if (mouseevent_1.isPopupTrigger())
            mouseevent_1.consume();

    }

    @Override
    public final synchronized void mouseReleased(MouseEvent mouseevent_1) {
        if (staticMouseHandler1 != null) {
            staticVolatileInt8 = 0;
            staticVolatileInt3 = 0;
        }

        if (mouseevent_1.isPopupTrigger())
            mouseevent_1.consume();

    }

    @Override
    public final void mouseClicked(MouseEvent mouseevent_1) {
        if (mouseevent_1.isPopupTrigger())
            mouseevent_1.consume();

    }

    @Override
    public final synchronized void mouseEntered(MouseEvent mouseevent_1) {
        if (staticMouseHandler1 != null) {
            staticVolatileInt8 = 0;
            staticVolatileInt4 = mouseevent_1.getX();
            staticVolatileInt5 = mouseevent_1.getY();
        }

    }

    @Override
    public final synchronized void mouseExited(MouseEvent mouseevent_1) {
        if (staticMouseHandler1 != null) {
            staticVolatileInt8 = 0;
            staticVolatileInt4 = -1;
            staticVolatileInt5 = -1;
        }

    }

    @Override
    public final synchronized void mouseDragged(MouseEvent mouseevent_1) {
        if (staticMouseHandler1 != null) {
            staticVolatileInt8 = 0;
            staticVolatileInt4 = mouseevent_1.getX();
            staticVolatileInt5 = mouseevent_1.getY();
        }

    }

    @Override
    public final synchronized void mouseMoved(MouseEvent mouseevent_1) {
        if (staticMouseHandler1 != null) {
            staticVolatileInt8 = 0;
            staticVolatileInt4 = mouseevent_1.getX();
            staticVolatileInt5 = mouseevent_1.getY();
        }

    }

    @Override
    public final void focusGained(FocusEvent focusevent_1) {
    }

    @Override
    public final synchronized void focusLost(FocusEvent focusevent_1) {
        if (staticMouseHandler1 != null)
            staticVolatileInt3 = 0;

    }

}

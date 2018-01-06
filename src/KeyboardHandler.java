import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public final class KeyboardHandler implements KeyListener, FocusListener {

    static Js5IndexImpl staticJs5IndexImpl5;
    public static KeyboardHandler staticKeyboardHandler1 = new KeyboardHandler();
    public static boolean[] staticBoolArray1 = new boolean[112];
    public static int[] staticIntArray4 = new int[128];
    public static int staticInt20 = 0;
    public static int staticInt19 = 0;
    static char[] staticCharArray1 = new char[128];
    static int[] staticIntArray3 = new int[128];
    public static int[] staticIntArray5 = new int[128];
    public static int staticInt21 = 0;
    public static int staticInt24 = 0;
    public static int staticInt22 = 0;
    public static int staticInt23 = 0;
    public static volatile int staticVolatileInt1 = 0;
    static int[] staticIntArray6 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    static void staticMethod5(Component component_0) {
        component_0.setFocusTraversalKeysEnabled(false);
        component_0.addKeyListener(staticKeyboardHandler1);
        component_0.addFocusListener(staticKeyboardHandler1);
    }

    static void staticMethod6(Component component_0) {
        component_0.removeKeyListener(staticKeyboardHandler1);
        component_0.removeFocusListener(staticKeyboardHandler1);
        staticInt19 = -1;
    }

    public static final boolean staticMethod7() {
        KeyboardHandler keyboardhandler_1 = staticKeyboardHandler1;
        synchronized (staticKeyboardHandler1) {
            if (staticInt23 == staticInt24)
                return false;
            else {
                StaticClass10.staticInt52 = staticIntArray3[staticInt24];
                ChatLog.staticChar1 = staticCharArray1[staticInt24];
                staticInt24 = staticInt24 + 1 & 0x7f;
                return true;
            }
        }
    }

    public static int staticMethod8() {
        return staticVolatileInt1;
    }

    @Override
    public final synchronized void keyPressed(KeyEvent keyevent_1) {
        if (staticKeyboardHandler1 != null) {
            int i_2 = keyevent_1.getKeyCode();
            if (i_2 >= 0 && i_2 < staticIntArray6.length) {
                i_2 = staticIntArray6[i_2];
                if ((i_2 & 0x80) != 0)
                    i_2 = -1;
            } else
                i_2 = -1;

            if (staticInt19 >= 0 && i_2 >= 0) {
                staticIntArray4[staticInt19] = i_2;
                staticInt19 = staticInt19 + 1 & 0x7f;
                if (staticInt19 == staticInt20)
                    staticInt19 = -1;
            }

            int i_3;
            if (i_2 >= 0) {
                i_3 = 1 + staticInt22 & 0x7f;
                if (staticInt24 != i_3) {
                    staticIntArray3[staticInt22] = i_2;
                    staticCharArray1[staticInt22] = 0;
                    staticInt22 = i_3;
                }
            }

            i_3 = keyevent_1.getModifiers();
            if ((i_3 & 0xa) != 0 || i_2 == 85 || i_2 == 10)
                keyevent_1.consume();
        }

    }

    @Override
    public final synchronized void keyReleased(KeyEvent keyevent_1) {
        if (staticKeyboardHandler1 != null) {
            int i_2 = keyevent_1.getKeyCode();
            if (i_2 >= 0 && i_2 < staticIntArray6.length)
                i_2 = staticIntArray6[i_2] & ~0x80;
            else
                i_2 = -1;

            if (staticInt19 >= 0 && i_2 >= 0) {
                staticIntArray4[staticInt19] = ~i_2;
                staticInt19 = staticInt19 + 1 & 0x7f;
                if (staticInt20 == staticInt19)
                    staticInt19 = -1;
            }
        }

        keyevent_1.consume();
    }

    @Override
    public final void keyTyped(KeyEvent keyevent_1) {
        if (staticKeyboardHandler1 != null) {
            char var_2 = keyevent_1.getKeyChar();
            if (var_2 != 0 && var_2 != 65535 && StaticClass52.staticMethod218(var_2)) {
                int i_3 = staticInt22 + 1 & 0x7f;
                if (staticInt24 != i_3) {
                    staticIntArray3[staticInt22] = -1;
                    staticCharArray1[staticInt22] = var_2;
                    staticInt22 = i_3;
                }
            }
        }

        keyevent_1.consume();
    }

    @Override
    public final void focusGained(FocusEvent focusevent_1) {
    }

    @Override
    public final synchronized void focusLost(FocusEvent focusevent_1) {
        if (staticKeyboardHandler1 != null)
            staticInt19 = -1;

    }

}

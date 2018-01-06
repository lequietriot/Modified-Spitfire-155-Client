import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.ImageObserver;
import java.net.URL;

public abstract class GameShell extends Applet implements Runnable, FocusListener, WindowListener {

    static String staticString1;
    int int79;
    int int82;
    Frame frame1;
    static GameShell staticGameShell1 = null;
    static int staticInt39 = 0;
    static long staticLong3 = 0L;
    static boolean staticBool4 = false;
    static int staticInt36 = 20;
    static int staticInt37 = 1;
    protected static int staticInt38 = 0;
    static long[] staticLongArray1 = new long[32];
    static long[] staticLongArray2 = new long[32];
    static int staticInt40 = 500;
    static volatile boolean staticVolatileBool1 = true;
    protected static long staticLong5 = -1L;
    protected static long staticLong4 = -1L;
    boolean bool4 = false;
    int int86 = 0;
    int int85 = 0;
    volatile boolean volatileBool1 = true;
    boolean bool5 = false;
    volatile boolean volatileBool2 = false;
    volatile long volatileLong1 = 0L;
    final EventQueue eventQueue1;
    int int83;
    int int84;
    MouseWheelHandler mouseWheelHandler1;
    Clipboard clipboard1;
    protected int int80;
    protected int int81;
    protected static TaskManager staticTaskManager1;
    Canvas canvas1;
    static Font staticFont1;

    protected abstract void onResize();

    protected abstract void method97(boolean var1);

    @Override
    public abstract void init();

    protected abstract void method98();

    protected abstract void method99();

    protected abstract void method100();

    protected abstract void method101();

    protected GameShell() {
        EventQueue eventqueue_1 = null;

        try {
            eventqueue_1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable throwable_3) {
            ;
        }

        eventQueue1 = eventqueue_1;
        JavaxSoundSystemProvider javaxsoundsystemprovider_2 = new JavaxSoundSystemProvider();
        SoundSystem.staticSoundSystemProvider1 = javaxsoundsystemprovider_2;
    }

    protected final void method102(int i_1, int i_2) {
        if (i_1 != int83 || int84 != i_2)
            method117();

        int83 = i_1;
        int84 = i_2;
    }

    final void method103(Object object_1) {
        if (eventQueue1 != null) {
            for (int i_3 = 0; i_3 < 50 && eventQueue1.peekEvent() != null; i_3++)
                StaticClass18.staticMethod127(1L);

            if (object_1 != null)
                eventQueue1.postEvent(new ActionEvent(object_1, 1001, "dummy"));

        }
    }

    protected WheelRotationProvider method104() {
        if (mouseWheelHandler1 == null) {
            mouseWheelHandler1 = new MouseWheelHandler();
            mouseWheelHandler1.addMouseWheelListener(canvas1);
        }

        return mouseWheelHandler1;
    }

    protected void method105() {
        clipboard1 = getToolkit().getSystemClipboard();
    }

    protected void method106(String string_1) {
        clipboard1.setContents(new StringSelection(string_1), (ClipboardOwner) null);
    }

    protected final void method107() {
        if (TaskManager.staticString27.toLowerCase().indexOf("microsoft") != -1) {
            KeyboardHandler.staticIntArray6[186] = 57;
            KeyboardHandler.staticIntArray6[187] = 27;
            KeyboardHandler.staticIntArray6[188] = 71;
            KeyboardHandler.staticIntArray6[189] = 26;
            KeyboardHandler.staticIntArray6[190] = 72;
            KeyboardHandler.staticIntArray6[191] = 73;
            KeyboardHandler.staticIntArray6[192] = 58;
            KeyboardHandler.staticIntArray6[219] = 42;
            KeyboardHandler.staticIntArray6[220] = 74;
            KeyboardHandler.staticIntArray6[221] = 43;
            KeyboardHandler.staticIntArray6[222] = 59;
            KeyboardHandler.staticIntArray6[223] = 28;
        } else {
            KeyboardHandler.staticIntArray6[44] = 71;
            KeyboardHandler.staticIntArray6[45] = 26;
            KeyboardHandler.staticIntArray6[46] = 72;
            KeyboardHandler.staticIntArray6[47] = 73;
            KeyboardHandler.staticIntArray6[59] = 57;
            KeyboardHandler.staticIntArray6[61] = 27;
            KeyboardHandler.staticIntArray6[91] = 42;
            KeyboardHandler.staticIntArray6[92] = 74;
            KeyboardHandler.staticIntArray6[93] = 43;
            KeyboardHandler.staticIntArray6[192] = 28;
            KeyboardHandler.staticIntArray6[222] = 58;
            KeyboardHandler.staticIntArray6[520] = 59;
        }

        KeyboardHandler.staticMethod5(canvas1);
    }

    protected final void method108() {
        Canvas canvas_2 = canvas1;
        canvas_2.addMouseListener(MouseHandler.staticMouseHandler1);
        canvas_2.addMouseMotionListener(MouseHandler.staticMouseHandler1);
        canvas_2.addFocusListener(MouseHandler.staticMouseHandler1);
    }

    final void method109() {
        Container container_2 = method121();
        if (container_2 != null) {
            Boundaries boundaries_3 = method122();
            int80 = Math.max(boundaries_3.width, int82);
            int81 = Math.max(boundaries_3.height, int79);
            if (int80 <= 0)
                int80 = 1;

            if (int81 <= 0)
                int81 = 1;

            StaticClass5.staticInt35 = Math.min(int80, int83);
            Class2.staticInt16 = Math.min(int81, int84);
            int86 = (int80 - StaticClass5.staticInt35) / 2;
            int85 = 0;
            canvas1.setSize(StaticClass5.staticInt35, Class2.staticInt16);
            ExchangeOfferComparator6.staticGraphicsBuffer1 = new RasterGraphicsBuffer(StaticClass5.staticInt35, Class2.staticInt16, canvas1);
            if (frame1 == container_2) {
                Insets insets_4 = frame1.getInsets();
                canvas1.setLocation(insets_4.left + int86, insets_4.top + int85);
            } else
                canvas1.setLocation(int86, int85);

            volatileBool1 = true;
            onResize();
        }
    }

    void method110() {
        int i_2 = int86;
        int i_3 = int85;
        int i_4 = int80 - StaticClass5.staticInt35 - i_2;
        int i_5 = int81 - Class2.staticInt16 - i_3;
        if (i_2 > 0 || i_4 > 0 || i_3 > 0 || i_5 > 0)
            try {
                Container container_6 = method121();
                int i_7 = 0;
                int i_8 = 0;
                if (frame1 == container_6) {
                    Insets insets_9 = frame1.getInsets();
                    i_7 = insets_9.left;
                    i_8 = insets_9.top;
                }

                Graphics graphics_11 = container_6.getGraphics();
                graphics_11.setColor(Color.black);
                if (i_2 > 0)
                    graphics_11.fillRect(i_7, i_8, i_2, int81);

                if (i_3 > 0)
                    graphics_11.fillRect(i_7, i_8, int80, i_3);

                if (i_4 > 0)
                    graphics_11.fillRect(i_7 + int80 - i_4, i_8, i_4, int81);

                if (i_5 > 0)
                    graphics_11.fillRect(i_7, i_8 + int81 - i_5, int80, i_5);
            } catch (Exception exception_10) {
                ;
            }

    }

    final void method111() {
        KeyboardHandler.staticMethod6(canvas1);
        Canvas canvas_2 = canvas1;
        canvas_2.removeMouseListener(MouseHandler.staticMouseHandler1);
        canvas_2.removeMouseMotionListener(MouseHandler.staticMouseHandler1);
        canvas_2.removeFocusListener(MouseHandler.staticMouseHandler1);
        MouseHandler.staticVolatileInt3 = 0;
        if (mouseWheelHandler1 != null)
            mouseWheelHandler1.removeMouseWheelListener(canvas1);

        synchronizedMethod1();
        KeyboardHandler.staticMethod5(canvas1);
        MouseHandler.staticMethod9(canvas1);
        if (mouseWheelHandler1 != null)
            mouseWheelHandler1.addMouseWheelListener(canvas1);

        method117();
    }

    protected final void method112(int i_1, int i_2, int i_3) {
        try {
            if (staticGameShell1 != null) {
                ++staticInt39;
                if (staticInt39 >= 3) {
                    method120("alreadyloaded");
                    return;
                }

                getAppletContext().showDocument(getDocumentBase(), "_self");
                return;
            }

            staticGameShell1 = this;
            StaticClass5.staticInt35 = i_1;
            Class2.staticInt16 = i_2;
            ClientError.staticInt79 = i_3;
            ClientError.staticApplet2 = this;
            if (staticTaskManager1 == null)
                staticTaskManager1 = new TaskManager();

            staticTaskManager1.submitRunnable(this, 1);
        } catch (Exception exception_6) {
            ClientError.staticMethod113((String) null, exception_6);
            method120("crash");
        }

    }

    final synchronized void synchronizedMethod1() {
        Container container_2 = method121();
        if (canvas1 != null) {
            canvas1.removeFocusListener(this);
            container_2.remove(canvas1);
        }

        StaticClass5.staticInt35 = Math.max(container_2.getWidth(), int82);
        Class2.staticInt16 = Math.max(container_2.getHeight(), int79);
        Insets insets_3;
        if (frame1 != null) {
            insets_3 = frame1.getInsets();
            StaticClass5.staticInt35 -= insets_3.left + insets_3.right;
            Class2.staticInt16 -= insets_3.top + insets_3.bottom;
        }

        canvas1 = new GameCanvas(this);
        container_2.add(canvas1);
        canvas1.setSize(StaticClass5.staticInt35, Class2.staticInt16);
        canvas1.setVisible(true);
        canvas1.setBackground(Color.BLACK);
        if (container_2 == frame1) {
            insets_3 = frame1.getInsets();
            canvas1.setLocation(insets_3.left + int86, int85 + insets_3.top);
        } else
            canvas1.setLocation(int86, int85);

        canvas1.addFocusListener(this);
        canvas1.requestFocus();
        volatileBool1 = true;
        if (ExchangeOfferComparator6.staticGraphicsBuffer1 != null && StaticClass5.staticInt35 == ExchangeOfferComparator6.staticGraphicsBuffer1.width && Class2.staticInt16 == ExchangeOfferComparator6.staticGraphicsBuffer1.height) {
            ((RasterGraphicsBuffer) ExchangeOfferComparator6.staticGraphicsBuffer1).setComponent(canvas1);
            ExchangeOfferComparator6.staticGraphicsBuffer1.drawImage(0, 0);
        } else
            ExchangeOfferComparator6.staticGraphicsBuffer1 = new RasterGraphicsBuffer(StaticClass5.staticInt35, Class2.staticInt16, canvas1);

        volatileBool2 = false;
        volatileLong1 = StaticClass27.synchronizedMethod7();
    }

    protected final boolean method113() {
        String string_2 = getDocumentBase().getHost().toLowerCase();
        if (!string_2.equals("jagex.com") && !string_2.endsWith(".jagex.com")) {
            if (!string_2.equals("runescape.com") && !string_2.endsWith(".runescape.com")) {
                if (string_2.endsWith("127.0.0.1"))
                    return true;
                else {
                    while (string_2.length() > 0 && string_2.charAt(string_2.length() - 1) >= 48 && string_2.charAt(string_2.length() - 1) <= 57)
                        string_2 = string_2.substring(0, string_2.length() - 1);

                    if (string_2.endsWith("192.168.1."))
                        return true;
                    else {
                        method120("invalidhost");
                        return false;
                    }
                }
            } else
                return true;
        } else
            return true;
    }

    @Override
    public void run() {
        try {
            if (TaskManager.staticString27 != null) {
                String string_1 = TaskManager.staticString27.toLowerCase();
                if (string_1.indexOf("sun") != -1 || string_1.indexOf("apple") != -1) {
                    String string_2 = TaskManager.staticString26;
                    if (string_2.equals("1.1") || string_2.startsWith("1.1.") || string_2.equals("1.2") || string_2.startsWith("1.2.") || string_2.equals("1.3") || string_2.startsWith("1.3.") || string_2.equals("1.4") || string_2.startsWith("1.4.") || string_2.equals("1.5") || string_2.startsWith("1.5.") || string_2.equals("1.6.0")) {
                        method120("wrongjava");
                        return;
                    }

                    if (string_2.startsWith("1.6.0_")) {
                        int i_3;
                        for (i_3 = 6; i_3 < string_2.length(); i_3++) {
                            char var_5 = string_2.charAt(i_3);
                            boolean bool_4 = var_5 >= 48 && var_5 <= 57;
                            if (!bool_4)
                                break;
                        }

                        String string_8 = string_2.substring(6, i_3);
                        if (StaticClass51.staticMethod210(string_8)) {
                            int i_9 = StaticClass51.staticMethod212(string_8, 10, true);
                            if (i_9 < 10) {
                                method120("wrongjava");
                                return;
                            }
                        }
                    }

                    staticInt37 = 5;
                }
            }

            setFocusCycleRoot(true);
            synchronizedMethod1();
            method98();
            Mus9.staticStopwatch1 = StaticClass62.staticMethod248();

            while (staticLong3 == 0L || StaticClass27.synchronizedMethod7() < staticLong3) {
                StaticClass8.staticInt44 = Mus9.staticStopwatch1.sleep(20, staticInt37);

                for (int i_7 = 0; i_7 < StaticClass8.staticInt44; i_7++)
                    method114();

                method115();
                method103(canvas1);
            }
        } catch (Exception exception_6) {
            ClientError.staticMethod113((String) null, exception_6);
            method120("crash");
        }

        synchronizedMethod2();
    }

    void method114() {
        long long_2 = StaticClass27.synchronizedMethod7();
        long long_4 = staticLongArray2[WMUnknown3.staticInt4];
        staticLongArray2[WMUnknown3.staticInt4] = long_2;
        WMUnknown3.staticInt4 = WMUnknown3.staticInt4 + 1 & 0x1f;
        if (long_4 != 0L && long_2 > long_4)
            ;

        synchronized (this) {
            WM7.staticBool2 = staticVolatileBool1;
        }

        method99();
    }

    void method115() {
        Container container_2 = method121();
        long long_3 = StaticClass27.synchronizedMethod7();
        long long_5 = staticLongArray1[ParamType.staticInt310];
        staticLongArray1[ParamType.staticInt310] = long_3;
        ParamType.staticInt310 = ParamType.staticInt310 + 1 & 0x1f;
        if (long_5 != 0L && long_3 > long_5) {
            int i_7 = (int) (long_3 - long_5);
            staticInt38 = (32000 + (i_7 >> 1)) / i_7;
        }

        if (staticInt40++ > 50) {
            staticInt40 -= 50;
            volatileBool1 = true;
            canvas1.setSize(StaticClass5.staticInt35, Class2.staticInt16);
            canvas1.setVisible(true);
            if (frame1 == container_2) {
                Insets insets_8 = frame1.getInsets();
                canvas1.setLocation(insets_8.left + int86, int85 + insets_8.top);
            } else
                canvas1.setLocation(int86, int85);
        }

        if (volatileBool2)
            method111();

        method116();
        method97(volatileBool1);
        if (volatileBool1)
            method110();

        volatileBool1 = false;
    }

    final void method116() {
        Boundaries boundaries_2 = method122();
        if (boundaries_2.width != int80 || int81 != boundaries_2.height || bool5) {
            method109();
            bool5 = false;
        }

    }

    final void method117() {
        bool5 = true;
    }

    final synchronized void synchronizedMethod2() {
        if (!staticBool4) {
            staticBool4 = true;

            try {
                canvas1.removeFocusListener(this);
            } catch (Exception exception_6) {
                ;
            }

            try {
                method100();
            } catch (Exception exception_5) {
                ;
            }

            if (frame1 != null)
                try {
                    System.exit(0);
                } catch (Throwable throwable_4) {
                    ;
                }

            if (staticTaskManager1 != null)
                try {
                    staticTaskManager1.shutdown();
                } catch (Exception exception_3) {
                    ;
                }

            method101();
        }
    }

    protected static final void staticMethod35() {
        Mus9.staticStopwatch1.set();

        int i_1;
        for (i_1 = 0; i_1 < 32; i_1++)
            staticLongArray1[i_1] = 0L;

        for (i_1 = 0; i_1 < 32; i_1++)
            staticLongArray2[i_1] = 0L;

        StaticClass8.staticInt44 = 0;
    }

    @Override
    public final void start() {
        if (this == staticGameShell1 && !staticBool4)
            staticLong3 = 0L;
    }

    @Override
    public final void stop() {
        if (staticGameShell1 == this && !staticBool4)
            staticLong3 = StaticClass27.synchronizedMethod7() + 4000L;
    }

    @Override
    public final void destroy() {
        if (staticGameShell1 == this && !staticBool4) {
            staticLong3 = StaticClass27.synchronizedMethod7();
            StaticClass18.staticMethod127(5000L);
            synchronizedMethod2();
        }
    }

    @Override
    public final void update(Graphics graphics_1) {
        paint(graphics_1);
    }

    @Override
    public final synchronized void paint(Graphics graphics_1) {
        if (this == staticGameShell1 && !staticBool4) {
            volatileBool1 = true;
            if (StaticClass27.synchronizedMethod7() - volatileLong1 > 1000L) {
                Rectangle rectangle_2 = graphics_1.getClipBounds();
                if (rectangle_2 == null || rectangle_2.width >= StaticClass5.staticInt35 && rectangle_2.height >= Class2.staticInt16)
                    volatileBool2 = true;
            }

        }
    }

    @Override
    public final void focusGained(FocusEvent focusevent_1) {
        staticVolatileBool1 = true;
        volatileBool1 = true;
    }

    @Override
    public final void focusLost(FocusEvent focusevent_1) {
        staticVolatileBool1 = false;
    }

    @Override
    public final void windowActivated(WindowEvent windowevent_1) {
    }

    @Override
    public final void windowClosed(WindowEvent windowevent_1) {
    }

    @Override
    public final void windowClosing(WindowEvent windowevent_1) {
        destroy();
    }

    @Override
    public final void windowDeactivated(WindowEvent windowevent_1) {
    }

    @Override
    public final void windowDeiconified(WindowEvent windowevent_1) {
    }

    @Override
    public final void windowIconified(WindowEvent windowevent_1) {
    }

    @Override
    public final void windowOpened(WindowEvent windowevent_1) {
    }

    protected final void method118(int i_1, String string_2, boolean bool_3) {
        try {
            Graphics graphics_5 = canvas1.getGraphics();
            if (staticFont1 == null) {
                staticFont1 = new Font("Helvetica", 1, 13);
                StaticClass21.staticFontMetrics1 = canvas1.getFontMetrics(staticFont1);
            }

            if (bool_3) {
                graphics_5.setColor(Color.black);
                graphics_5.fillRect(0, 0, StaticClass5.staticInt35, Class2.staticInt16);
            }

            Color color_6 = new Color(140, 17, 17);

            try {
                if (Class2.staticImage1 == null)
                    Class2.staticImage1 = canvas1.createImage(304, 34);

                Graphics graphics_7 = Class2.staticImage1.getGraphics();
                graphics_7.setColor(color_6);
                graphics_7.drawRect(0, 0, 303, 33);
                graphics_7.fillRect(2, 2, i_1 * 3, 30);
                graphics_7.setColor(Color.black);
                graphics_7.drawRect(1, 1, 301, 31);
                graphics_7.fillRect(i_1 * 3 + 2, 2, 300 - i_1 * 3, 30);
                graphics_7.setFont(staticFont1);
                graphics_7.setColor(Color.white);
                graphics_7.drawString(string_2, (304 - StaticClass21.staticFontMetrics1.stringWidth(string_2)) / 2, 22);
                graphics_5.drawImage(Class2.staticImage1, StaticClass5.staticInt35 / 2 - 152, Class2.staticInt16 / 2 - 18, (ImageObserver) null);
            } catch (Exception exception_10) {
                int i_8 = StaticClass5.staticInt35 / 2 - 152;
                int i_9 = Class2.staticInt16 / 2 - 18;
                graphics_5.setColor(color_6);
                graphics_5.drawRect(i_8, i_9, 303, 33);
                graphics_5.fillRect(i_8 + 2, i_9 + 2, i_1 * 3, 30);
                graphics_5.setColor(Color.black);
                graphics_5.drawRect(i_8 + 1, i_9 + 1, 301, 31);
                graphics_5.fillRect(i_8 + 2 + i_1 * 3, i_9 + 2, 300 - i_1 * 3, 30);
                graphics_5.setFont(staticFont1);
                graphics_5.setColor(Color.white);
                graphics_5.drawString(string_2, i_8 + (304 - StaticClass21.staticFontMetrics1.stringWidth(string_2)) / 2, i_9 + 22);
            }
        } catch (Exception exception_11) {
            canvas1.repaint();
        }

    }

    protected final void method119() {
        Class2.staticImage1 = null;
        staticFont1 = null;
        StaticClass21.staticFontMetrics1 = null;
    }

    protected void method120(String string_1) {
        if (!bool4) {
            bool4 = true;
            System.out.println("error_game_" + string_1);

            try {
                getAppletContext().showDocument(new URL(getCodeBase(), "error_game_" + string_1 + ".ws"), "_self");
            } catch (Exception exception_4) {
                ;
            }

        }
    }

    Container method121() {
        return frame1 != null ? frame1 : this;
    }

    Boundaries method122() {
        Container container_2 = method121();
        int i_3 = Math.max(container_2.getWidth(), int82);
        int i_4 = Math.max(container_2.getHeight(), int79);
        if (frame1 != null) {
            Insets insets_5 = frame1.getInsets();
            i_3 -= insets_5.left + insets_5.right;
            i_4 -= insets_5.top + insets_5.bottom;
        }

        return new Boundaries(i_3, i_4);
    }

    protected final boolean method123() {
        return frame1 != null;
    }

}

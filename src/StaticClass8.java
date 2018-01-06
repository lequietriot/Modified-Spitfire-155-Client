import java.applet.Applet;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;

public class StaticClass8 {

    static int staticInt44;
    static Applet staticApplet1 = null;
    static String staticString2 = null;

    StaticClass8() throws Throwable {
        throw new Error();
    }

    public static void staticMethod37(Applet applet_0, String string_1) {
        staticApplet1 = applet_0;
        staticString2 = string_1;
    }

    public static void staticMethod38(String string_0, boolean bool_1, boolean bool_2) {
        if (bool_1) {
            if (!bool_2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE))
                try {
                    Desktop.getDesktop().browse(new URI(string_0));
                    return;
                } catch (Exception exception_5) {
                    ;
                }

            if (staticString2.startsWith("win") && !bool_2)
                staticMethod39(string_0, 0);
            else if (staticString2.startsWith("mac"))
                staticMethod40(string_0, 1, "openjs");
            else
                staticMethod39(string_0, 2);
        } else
            staticMethod39(string_0, 3);

    }

    static boolean staticMethod39(String string_0, int i_1) {
        return staticMethod40(string_0, i_1, "openjs");
    }

    static boolean staticMethod40(String string_0, int i_1, String string_2) {
        if (i_1 == 0)
            try {
                if (!staticString2.startsWith("win"))
                    throw new Exception();
                else if (!string_0.startsWith("http://") && !string_0.startsWith("https://"))
                    throw new Exception();
                else {
                    String str_11 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

                    for (int i_5 = 0; i_5 < string_0.length(); i_5++)
                        if (str_11.indexOf(string_0.charAt(i_5)) == -1)
                            throw new Exception();

                    Runtime.getRuntime().exec("cmd /c start \"j\" \"" + string_0 + "\"");
                    return true;
                }
            } catch (Throwable throwable_6) {
                return false;
            }
        else if (i_1 == 1)
            try {
                Object object_4 = StaticClass4.staticMethod32(staticApplet1, string_2, new Object[] { new URL(staticApplet1.getCodeBase(), string_0).toString() });
                return object_4 != null;
            } catch (Throwable throwable_7) {
                return false;
            }
        else if (i_1 == 2)
            try {
                staticApplet1.getAppletContext().showDocument(new URL(staticApplet1.getCodeBase(), string_0), "_blank");
                return true;
            } catch (Exception exception_8) {
                return false;
            }
        else if (i_1 == 3) {
            try {
                StaticClass4.staticMethod31(staticApplet1, "loggedout");
            } catch (Throwable throwable_10) {
                ;
            }

            try {
                staticApplet1.getAppletContext().showDocument(new URL(staticApplet1.getCodeBase(), string_0), "_top");
                return true;
            } catch (Exception exception_9) {
                return false;
            }
        } else
            throw new IllegalArgumentException();
    }

}

import java.applet.Applet;
import netscape.javascript.JSObject;

public class StaticClass4 {

    StaticClass4() throws Throwable {
        throw new Error();
    }

    public static void staticMethod30(Applet applet_0, String string_1) throws Throwable {
        JSObject.getWindow(applet_0).eval(string_1);
    }

    public static Object staticMethod31(Applet applet_0, String string_1) throws Throwable {
        return JSObject.getWindow(applet_0).call(string_1, (Object[]) null);
    }

    public static Object staticMethod32(Applet applet_0, String string_1, Object[] arr_2) throws Throwable {
        return JSObject.getWindow(applet_0).call(string_1, arr_2);
    }

}

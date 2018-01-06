import java.applet.Applet;
import java.io.DataInputStream;
import java.net.URL;

public class ClientError extends RuntimeException {

    public static int staticInt79;
    public static String staticString24;
    public static short[] staticShortArray3;
    public static Applet staticApplet2;
    String string12;
    Throwable throwable1;

    ClientError(Throwable throwable_1, String string_2) {
        string12 = string_2;
        throwable1 = throwable_1;
    }

    public static void staticMethod113(String string_0, Throwable throwable_1) {
        try {
            String str_3 = "";
            if (throwable_1 != null)
                str_3 = HealthBar.staticMethod368(throwable_1);

            if (string_0 != null) {
                if (throwable_1 != null)
                    str_3 = str_3 + " | ";

                str_3 = str_3 + string_0;
            }

            System.out.println("Error: " + str_3);
            str_3 = str_3.replace(':', '.');
            str_3 = str_3.replace('@', '_');
            str_3 = str_3.replace('&', '_');
            str_3 = str_3.replace('#', '_');
            if (staticApplet2 == null)
                return;

            URL url_4 = new URL(staticApplet2.getCodeBase(), "clienterror.ws?c=" + staticInt79 + "&u=" + staticString24 + "&v1=" + TaskManager.staticString27 + "&v2=" + TaskManager.staticString26 + "&e=" + str_3);
            DataInputStream datainputstream_5 = new DataInputStream(url_4.openStream());
            datainputstream_5.read();
            datainputstream_5.close();
        } catch (Exception exception_6) {
            ;
        }

    }

    public static ClientError staticMethod114(Throwable throwable_0, String string_1) {
        ClientError clienterror_2;
        if (throwable_0 instanceof ClientError) {
            clienterror_2 = (ClientError) throwable_0;
            clienterror_2.string12 = clienterror_2.string12 + ' ' + string_1;
        } else
            clienterror_2 = new ClientError(throwable_0, string_1);

        return clienterror_2;
    }

}

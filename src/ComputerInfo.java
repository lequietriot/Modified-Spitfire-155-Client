public class ComputerInfo extends Node {

    int int467;
    int int474;
    int int476;
    int int477;
    int int478;
    int int479;
    int[] intArray64 = new int[3];
    int int466;
    String string33;
    String string31;
    String string32;
    String string34;
    String string30;
    String string29;
    boolean bool47;
    int int475;
    int int468;
    int int469;
    int int480;
    int int471;
    boolean bool48;
    int int472;
    int int470;
    int int473;

    public ComputerInfo(boolean bool_1) {
        if (bool_1) {
            if (SoundBank.staticString22.startsWith("win"))
                int466 = 1;
            else if (SoundBank.staticString22.startsWith("mac"))
                int466 = 2;
            else if (SoundBank.staticString22.startsWith("linux"))
                int466 = 3;
            else
                int466 = 4;

            String string_2;
            try {
                string_2 = System.getProperty("os.arch").toLowerCase();
            } catch (Exception exception_11) {
                string_2 = "";
            }

            String string_3;
            try {
                string_3 = System.getProperty("os.version").toLowerCase();
            } catch (Exception exception_10) {
                string_3 = "";
            }

            String str_4 = "Unknown";
            String str_5 = "1.1";

            try {
                str_4 = System.getProperty("java.vendor");
                str_5 = System.getProperty("java.version");
            } catch (Exception exception_9) {
                ;
            }

            if (!string_2.startsWith("amd64") && !string_2.startsWith("x86_64"))
                bool47 = false;
            else
                bool47 = true;

            if (int466 == 1) {
                if (string_3.indexOf("4.0") != -1)
                    int475 = 1;
                else if (string_3.indexOf("4.1") != -1)
                    int475 = 2;
                else if (string_3.indexOf("4.9") != -1)
                    int475 = 3;
                else if (string_3.indexOf("5.0") != -1)
                    int475 = 4;
                else if (string_3.indexOf("5.1") != -1)
                    int475 = 5;
                else if (string_3.indexOf("5.2") != -1)
                    int475 = 8;
                else if (string_3.indexOf("6.0") != -1)
                    int475 = 6;
                else if (string_3.indexOf("6.1") != -1)
                    int475 = 7;
                else if (string_3.indexOf("6.2") != -1)
                    int475 = 9;
                else if (string_3.indexOf("6.3") != -1)
                    int475 = 10;
                else if (string_3.indexOf("10.0") != -1)
                    int475 = 11;
            } else if (int466 == 2)
                if (string_3.indexOf("10.4") != -1)
                    int475 = 20;
                else if (string_3.indexOf("10.5") != -1)
                    int475 = 21;
                else if (string_3.indexOf("10.6") != -1)
                    int475 = 22;
                else if (string_3.indexOf("10.7") != -1)
                    int475 = 23;
                else if (string_3.indexOf("10.8") != -1)
                    int475 = 24;
                else if (string_3.indexOf("10.9") != -1)
                    int475 = 25;
                else if (string_3.indexOf("10.10") != -1)
                    int475 = 26;
                else if (string_3.indexOf("10.11") != -1)
                    int475 = 27;

            if (str_4.toLowerCase().indexOf("sun") != -1)
                int468 = 1;
            else if (str_4.toLowerCase().indexOf("microsoft") != -1)
                int468 = 2;
            else if (str_4.toLowerCase().indexOf("apple") != -1)
                int468 = 3;
            else if (str_4.toLowerCase().indexOf("oracle") != -1)
                int468 = 5;
            else
                int468 = 4;

            int i_6 = 2;
            int i_7 = 0;

            char var_8;
            try {
                while (i_6 < str_5.length()) {
                    var_8 = str_5.charAt(i_6);
                    if (var_8 < 48 || var_8 > 57)
                        break;

                    i_7 = var_8 - 48 + i_7 * 10;
                    ++i_6;
                }
            } catch (Exception exception_14) {
                ;
            }

            int469 = i_7;
            i_6 = str_5.indexOf(46, 2) + 1;
            i_7 = 0;

            try {
                while (i_6 < str_5.length()) {
                    var_8 = str_5.charAt(i_6);
                    if (var_8 < 48 || var_8 > 57)
                        break;

                    i_7 = i_7 * 10 + var_8 - 48;
                    ++i_6;
                }
            } catch (Exception exception_13) {
                ;
            }

            int480 = i_7;
            i_6 = str_5.indexOf(95, 4) + 1;
            i_7 = 0;

            try {
                while (i_6 < str_5.length()) {
                    var_8 = str_5.charAt(i_6);
                    if (var_8 < 48 || var_8 > 57)
                        break;

                    i_7 = var_8 - 48 + i_7 * 10;
                    ++i_6;
                }
            } catch (Exception exception_12) {
                ;
            }

            int471 = i_7;
            bool48 = false;
            int472 = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
            if (int469 > 3)
                int470 = Runtime.getRuntime().availableProcessors();
            else
                int470 = 0;

            int473 = 0;
        }

        if (string33 == null)
            string33 = "";

        if (string31 == null)
            string31 = "";

        if (string32 == null)
            string32 = "";

        if (string34 == null)
            string34 = "";

        if (string30 == null)
            string30 = "";

        if (string29 == null)
            string29 = "";

        method511();
    }

    void method511() {
        if (string33.length() > 40)
            string33 = string33.substring(0, 40);

        if (string31.length() > 40)
            string31 = string31.substring(0, 40);

        if (string32.length() > 10)
            string32 = string32.substring(0, 10);

        if (string34.length() > 10)
            string34 = string34.substring(0, 10);

    }

    public void method512(Buffer buffer_1) {
        buffer_1.writeByte(6);
        buffer_1.writeByte(int466);
        buffer_1.writeByte(bool47 ? 1 : 0);
        buffer_1.writeByte(int475);
        buffer_1.writeByte(int468);
        buffer_1.writeByte(int469);
        buffer_1.writeByte(int480);
        buffer_1.writeByte(int471);
        buffer_1.writeByte(bool48 ? 1 : 0);
        buffer_1.writeShort(int472);
        buffer_1.writeByte(int470);
        buffer_1.writeTriByte(int473);
        buffer_1.writeShort(int474);
        buffer_1.method431(string33);
        buffer_1.method431(string31);
        buffer_1.method431(string32);
        buffer_1.method431(string34);
        buffer_1.writeByte(int479);
        buffer_1.writeShort(int467);
        buffer_1.method431(string30);
        buffer_1.method431(string29);
        buffer_1.writeByte(int476);
        buffer_1.writeByte(int477);

        for (int i_3 = 0; i_3 < intArray64.length; i_3++)
            buffer_1.writeInt(intArray64[i_3]);

        buffer_1.writeInt(int478);
    }

    public int method513() {
        byte b_2 = 38;
        String string_5 = string33;
        int i_4 = string_5.length() + 2;
        int i_21 = i_4 + b_2;
        String string_8 = string31;
        int i_7 = string_8.length() + 2;
        i_21 += i_7;
        String string_11 = string32;
        int i_10 = string_11.length() + 2;
        i_21 += i_10;
        String string_14 = string34;
        int i_13 = string_14.length() + 2;
        i_21 += i_13;
        String string_17 = string30;
        int i_16 = string_17.length() + 2;
        i_21 += i_16;
        String string_20 = string29;
        int i_19 = string_20.length() + 2;
        i_21 += i_19;
        return i_21;
    }

}

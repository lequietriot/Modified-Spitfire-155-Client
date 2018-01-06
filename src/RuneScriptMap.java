public class RuneScriptMap extends Cacheable {

    public static Js5Index staticJs5Index23;
    public String string40 = "null";
    public int int557 = 0;
    public static Cache staticCache20 = new Cache(64);
    public char char3;
    public char char2;
    public int int558;
    public int[] intArray93;
    public String[] stringArray6;
    public int[] intArray92;

    public void decode(Buffer buffer_1) {
        while (true) {
            int i_3 = buffer_1.readUByte();
            if (i_3 == 0)
                return;

            this.decode(buffer_1, i_3);
        }
    }

    void decode(Buffer buffer_1, int i_2) {
        if (i_2 == 1)
            char3 = (char) buffer_1.readUByte();
        else if (i_2 == 2)
            char2 = (char) buffer_1.readUByte();
        else if (i_2 == 3)
            string40 = buffer_1.method448();
        else if (i_2 == 4)
            int558 = buffer_1.readInt();
        else {
            int i_4;
            if (i_2 == 5) {
                int557 = buffer_1.readUShort();
                intArray93 = new int[int557];
                stringArray6 = new String[int557];

                for (i_4 = 0; i_4 < int557; i_4++) {
                    intArray93[i_4] = buffer_1.readInt();
                    stringArray6[i_4] = buffer_1.method448();
                }
            } else if (i_2 == 6) {
                int557 = buffer_1.readUShort();
                intArray93 = new int[int557];
                intArray92 = new int[int557];

                for (i_4 = 0; i_4 < int557; i_4++) {
                    intArray93[i_4] = buffer_1.readInt();
                    intArray92[i_4] = buffer_1.readInt();
                }
            }
        }

    }

}

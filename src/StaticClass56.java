
public class StaticClass56 {

    static char[] staticCharArray7 = new char[64];
    static char[] staticCharArray6;
    static int[] staticIntArray72;

    static {
        int i_0;
        for (i_0 = 0; i_0 < 26; i_0++)
            staticCharArray7[i_0] = (char) (i_0 + 65);

        for (i_0 = 26; i_0 < 52; i_0++)
            staticCharArray7[i_0] = (char) (i_0 + 97 - 26);

        for (i_0 = 52; i_0 < 62; i_0++)
            staticCharArray7[i_0] = (char) (i_0 + 48 - 52);

        staticCharArray7[62] = 43;
        staticCharArray7[63] = 47;
        staticCharArray6 = new char[64];

        for (i_0 = 0; i_0 < 26; i_0++)
            staticCharArray6[i_0] = (char) (i_0 + 65);

        for (i_0 = 26; i_0 < 52; i_0++)
            staticCharArray6[i_0] = (char) (i_0 + 97 - 26);

        for (i_0 = 52; i_0 < 62; i_0++)
            staticCharArray6[i_0] = (char) (i_0 + 48 - 52);

        staticCharArray6[62] = 42;
        staticCharArray6[63] = 45;
        staticIntArray72 = new int[128];

        for (i_0 = 0; i_0 < staticIntArray72.length; i_0++)
            staticIntArray72[i_0] = -1;

        for (i_0 = 65; i_0 <= 90; i_0++)
            staticIntArray72[i_0] = i_0 - 65;

        for (i_0 = 97; i_0 <= 122; i_0++)
            staticIntArray72[i_0] = 26 + i_0 - 97;

        for (i_0 = 48; i_0 <= 57; i_0++)
            staticIntArray72[i_0] = i_0 - 48 + 52;

        int[] ints_2 = staticIntArray72;
        staticIntArray72[43] = 62;
        ints_2[42] = 62;
        int[] ints_1 = staticIntArray72;
        staticIntArray72[47] = 63;
        ints_1[45] = 63;
    }

    StaticClass56() throws Throwable {
        throw new Error();
    }

    public static String staticMethod228(byte[] bytes_0) {
        return staticMethod229(bytes_0, 0, bytes_0.length);
    }

    static String staticMethod229(byte[] bytes_0, int i_1, int i_2) {
        StringBuilder stringbuilder_4 = new StringBuilder();

        for (int i_5 = i_1; i_5 < i_2 + i_1; i_5 += 3) {
            int i_6 = bytes_0[i_5] & 0xff;
            stringbuilder_4.append(staticCharArray7[i_6 >>> 2]);
            if (i_5 < i_2 - 1) {
                int i_7 = bytes_0[i_5 + 1] & 0xff;
                stringbuilder_4.append(staticCharArray7[(i_6 & 0x3) << 4 | i_7 >>> 4]);
                if (i_5 < i_2 - 2) {
                    int i_8 = bytes_0[i_5 + 2] & 0xff;
                    stringbuilder_4.append(staticCharArray7[(i_7 & 0xf) << 2 | i_8 >>> 6]).append(staticCharArray7[i_8 & 0x3f]);
                } else
                    stringbuilder_4.append(staticCharArray7[(i_7 & 0xf) << 2]).append("=");
            } else
                stringbuilder_4.append(staticCharArray7[(i_6 & 0x3) << 4]).append("==");
        }

        return stringbuilder_4.toString();
    }

}

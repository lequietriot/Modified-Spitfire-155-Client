public class AudioEnvelope {

    int int108 = 2;
    int[] intArray7 = new int[2];
    int[] intArray6 = new int[2];
    int int109;
    int int107;
    int int105;
    int int106;
    int int110;
    int int112;
    int int113;
    int int111;

    AudioEnvelope() {
        intArray7[0] = 0;
        intArray7[1] = 65535;
        intArray6[0] = 0;
        intArray6[1] = 65535;
    }

    final void method144(Buffer buffer_1) {
        int109 = buffer_1.readUByte();
        int107 = buffer_1.readInt();
        int105 = buffer_1.readInt();
        method145(buffer_1);
    }

    final void method145(Buffer buffer_1) {
        int108 = buffer_1.readUByte();
        intArray7 = new int[int108];
        intArray6 = new int[int108];

        for (int i_2 = 0; i_2 < int108; i_2++) {
            intArray7[i_2] = buffer_1.readUShort();
            intArray6[i_2] = buffer_1.readUShort();
        }

    }

    final void method146() {
        int106 = 0;
        int110 = 0;
        int112 = 0;
        int113 = 0;
        int111 = 0;
    }

    final int method147(int i_1) {
        if (int111 >= int106) {
            int113 = intArray6[int110++] << 15;
            if (int110 >= int108)
                int110 = int108 - 1;

            int106 = (int) (intArray7[int110] / 65536.0D * i_1);
            if (int106 > int111)
                int112 = ((intArray6[int110] << 15) - int113) / (int106 - int111);
        }

        int113 += int112;
        ++int111;
        return int113 - int112 >> 15;
    }

}

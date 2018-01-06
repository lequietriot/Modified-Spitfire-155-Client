public class WM2 {

    static int staticInt18;
    public static boolean staticBool3;
    static byte staticByte1;
    int int76;
    byte[][][] byteArrayArrayArray3;

    WM2(int i_1) {
        int76 = i_1;
    }

    void method82(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
        if (i_7 != 0 && int76 != 0 && byteArrayArrayArray3 != null) {
            i_8 = method83(i_8, i_7);
            i_7 = method84(i_7);
            Rasterizer2D.staticMethod456(i_1, i_2, i_5, i_6, i_3, i_4, byteArrayArrayArray3[i_7 - 1][i_8], int76, true);
        }
    }

    int method83(int i_1, int i_2) {
        if (i_2 == 9)
            i_1 = i_1 + 1 & 0x3;

        if (i_2 == 10)
            i_1 = i_1 + 3 & 0x3;

        if (i_2 == 11)
            i_1 = i_1 + 3 & 0x3;

        return i_1;
    }

    int method84(int i_1) {
        return i_1 != 9 && i_1 != 10 ? i_1 == 11 ? 8 : i_1 : 1;
    }

    void method85() {
        if (byteArrayArrayArray3 == null) {
            byteArrayArrayArray3 = new byte[8][4][];
            method86();
            method87();
            method88();
            method89();
            method90();
            method91();
            method92();
            method93();
        }
    }

    void method86() {
        byte[] bytes_2 = new byte[int76 * int76];
        int i_3 = 0;

        int i_4;
        int i_5;
        for (i_4 = 0; i_4 < int76; i_4++)
            for (i_5 = 0; i_5 < int76; i_5++) {
                if (i_5 <= i_4)
                    bytes_2[i_3] = -1;

                ++i_3;
            }

        byteArrayArrayArray3[0][0] = bytes_2;
        bytes_2 = new byte[int76 * int76];
        i_3 = 0;

        for (i_4 = int76 - 1; i_4 >= 0; --i_4)
            for (i_5 = 0; i_5 < int76; i_5++) {
                if (i_5 <= i_4)
                    bytes_2[i_3] = -1;

                ++i_3;
            }

        byteArrayArrayArray3[0][1] = bytes_2;
        bytes_2 = new byte[int76 * int76];
        i_3 = 0;

        for (i_4 = 0; i_4 < int76; i_4++)
            for (i_5 = 0; i_5 < int76; i_5++) {
                if (i_5 >= i_4)
                    bytes_2[i_3] = -1;

                ++i_3;
            }

        byteArrayArrayArray3[0][2] = bytes_2;
        bytes_2 = new byte[int76 * int76];
        i_3 = 0;

        for (i_4 = int76 - 1; i_4 >= 0; --i_4)
            for (i_5 = 0; i_5 < int76; i_5++) {
                if (i_5 >= i_4)
                    bytes_2[i_3] = -1;

                ++i_3;
            }

        byteArrayArrayArray3[0][3] = bytes_2;
    }

    void method87() {
        byte[] bytes_2 = new byte[int76 * int76];
        int i_3 = 0;

        int i_4;
        int i_5;
        for (i_4 = int76 - 1; i_4 >= 0; --i_4)
            for (i_5 = 0; i_5 < int76; i_5++) {
                if (i_5 <= i_4 >> 1)
                    bytes_2[i_3] = -1;

                ++i_3;
            }

        byteArrayArrayArray3[1][0] = bytes_2;
        bytes_2 = new byte[int76 * int76];
        i_3 = 0;

        for (i_4 = 0; i_4 < int76; i_4++)
            for (i_5 = 0; i_5 < int76; i_5++)
                if (i_3 >= 0 && i_3 < bytes_2.length) {
                    if (i_5 >= i_4 << 1)
                        bytes_2[i_3] = -1;

                    ++i_3;
                } else
                    ++i_3;

        byteArrayArrayArray3[1][1] = bytes_2;
        bytes_2 = new byte[int76 * int76];
        i_3 = 0;

        for (i_4 = 0; i_4 < int76; i_4++)
            for (i_5 = int76 - 1; i_5 >= 0; --i_5) {
                if (i_5 <= i_4 >> 1)
                    bytes_2[i_3] = -1;

                ++i_3;
            }

        byteArrayArrayArray3[1][2] = bytes_2;
        bytes_2 = new byte[int76 * int76];
        i_3 = 0;

        for (i_4 = int76 - 1; i_4 >= 0; --i_4)
            for (i_5 = int76 - 1; i_5 >= 0; --i_5) {
                if (i_5 >= i_4 << 1)
                    bytes_2[i_3] = -1;

                ++i_3;
            }

        byteArrayArrayArray3[1][3] = bytes_2;
    }

    void method88() {
        byte[] bytes_2 = new byte[int76 * int76];
        int i_3 = 0;

        int i_4;
        int i_5;
        for (i_4 = int76 - 1; i_4 >= 0; --i_4)
            for (i_5 = int76 - 1; i_5 >= 0; --i_5) {
                if (i_5 <= i_4 >> 1)
                    bytes_2[i_3] = -1;

                ++i_3;
            }

        byteArrayArrayArray3[2][0] = bytes_2;
        bytes_2 = new byte[int76 * int76];
        i_3 = 0;

        for (i_4 = int76 - 1; i_4 >= 0; --i_4)
            for (i_5 = 0; i_5 < int76; i_5++) {
                if (i_5 >= i_4 << 1)
                    bytes_2[i_3] = -1;

                ++i_3;
            }

        byteArrayArrayArray3[2][1] = bytes_2;
        bytes_2 = new byte[int76 * int76];
        i_3 = 0;

        for (i_4 = 0; i_4 < int76; i_4++)
            for (i_5 = 0; i_5 < int76; i_5++) {
                if (i_5 <= i_4 >> 1)
                    bytes_2[i_3] = -1;

                ++i_3;
            }

        byteArrayArrayArray3[2][2] = bytes_2;
        bytes_2 = new byte[int76 * int76];
        i_3 = 0;

        for (i_4 = 0; i_4 < int76; i_4++)
            for (i_5 = int76 - 1; i_5 >= 0; --i_5) {
                if (i_5 >= i_4 << 1)
                    bytes_2[i_3] = -1;

                ++i_3;
            }

        byteArrayArrayArray3[2][3] = bytes_2;
    }

    void method89() {
        byte[] bytes_2 = new byte[int76 * int76];
        int i_3 = 0;

        int i_4;
        int i_5;
        for (i_4 = int76 - 1; i_4 >= 0; --i_4)
            for (i_5 = 0; i_5 < int76; i_5++) {
                if (i_5 >= i_4 >> 1)
                    bytes_2[i_3] = -1;

                ++i_3;
            }

        byteArrayArrayArray3[3][0] = bytes_2;
        bytes_2 = new byte[int76 * int76];
        i_3 = 0;

        for (i_4 = 0; i_4 < int76; i_4++)
            for (i_5 = 0; i_5 < int76; i_5++) {
                if (i_5 <= i_4 << 1)
                    bytes_2[i_3] = -1;

                ++i_3;
            }

        byteArrayArrayArray3[3][1] = bytes_2;
        bytes_2 = new byte[int76 * int76];
        i_3 = 0;

        for (i_4 = 0; i_4 < int76; i_4++)
            for (i_5 = int76 - 1; i_5 >= 0; --i_5) {
                if (i_5 >= i_4 >> 1)
                    bytes_2[i_3] = -1;

                ++i_3;
            }

        byteArrayArrayArray3[3][2] = bytes_2;
        bytes_2 = new byte[int76 * int76];
        i_3 = 0;

        for (i_4 = int76 - 1; i_4 >= 0; --i_4)
            for (i_5 = int76 - 1; i_5 >= 0; --i_5) {
                if (i_5 <= i_4 << 1)
                    bytes_2[i_3] = -1;

                ++i_3;
            }

        byteArrayArrayArray3[3][3] = bytes_2;
    }

    void method90() {
        byte[] bytes_2 = new byte[int76 * int76];
        int i_3 = 0;

        int i_4;
        int i_5;
        for (i_4 = int76 - 1; i_4 >= 0; --i_4)
            for (i_5 = int76 - 1; i_5 >= 0; --i_5) {
                if (i_5 >= i_4 >> 1)
                    bytes_2[i_3] = -1;

                ++i_3;
            }

        byteArrayArrayArray3[4][0] = bytes_2;
        bytes_2 = new byte[int76 * int76];
        i_3 = 0;

        for (i_4 = int76 - 1; i_4 >= 0; --i_4)
            for (i_5 = 0; i_5 < int76; i_5++) {
                if (i_5 <= i_4 << 1)
                    bytes_2[i_3] = -1;

                ++i_3;
            }

        byteArrayArrayArray3[4][1] = bytes_2;
        bytes_2 = new byte[int76 * int76];
        i_3 = 0;

        for (i_4 = 0; i_4 < int76; i_4++)
            for (i_5 = 0; i_5 < int76; i_5++) {
                if (i_5 >= i_4 >> 1)
                    bytes_2[i_3] = -1;

                ++i_3;
            }

        byteArrayArrayArray3[4][2] = bytes_2;
        bytes_2 = new byte[int76 * int76];
        i_3 = 0;

        for (i_4 = 0; i_4 < int76; i_4++)
            for (i_5 = int76 - 1; i_5 >= 0; --i_5) {
                if (i_5 <= i_4 << 1)
                    bytes_2[i_3] = -1;

                ++i_3;
            }

        byteArrayArrayArray3[4][3] = bytes_2;
    }

    void method91() {
        byte[] bytes_2 = new byte[int76 * int76];
        boolean bool_3 = false;
        bytes_2 = new byte[int76 * int76];
        int i_6 = 0;

        int i_4;
        int i_5;
        for (i_4 = 0; i_4 < int76; i_4++)
            for (i_5 = 0; i_5 < int76; i_5++) {
                if (i_5 <= int76 / 2)
                    bytes_2[i_6] = -1;

                ++i_6;
            }

        byteArrayArrayArray3[5][0] = bytes_2;
        bytes_2 = new byte[int76 * int76];
        i_6 = 0;

        for (i_4 = 0; i_4 < int76; i_4++)
            for (i_5 = 0; i_5 < int76; i_5++) {
                if (i_4 <= int76 / 2)
                    bytes_2[i_6] = -1;

                ++i_6;
            }

        byteArrayArrayArray3[5][1] = bytes_2;
        bytes_2 = new byte[int76 * int76];
        i_6 = 0;

        for (i_4 = 0; i_4 < int76; i_4++)
            for (i_5 = 0; i_5 < int76; i_5++) {
                if (i_5 >= int76 / 2)
                    bytes_2[i_6] = -1;

                ++i_6;
            }

        byteArrayArrayArray3[5][2] = bytes_2;
        bytes_2 = new byte[int76 * int76];
        i_6 = 0;

        for (i_4 = 0; i_4 < int76; i_4++)
            for (i_5 = 0; i_5 < int76; i_5++) {
                if (i_4 >= int76 / 2)
                    bytes_2[i_6] = -1;

                ++i_6;
            }

        byteArrayArrayArray3[5][3] = bytes_2;
    }

    void method92() {
        byte[] bytes_2 = new byte[int76 * int76];
        boolean bool_3 = false;
        bytes_2 = new byte[int76 * int76];
        int i_6 = 0;

        int i_4;
        int i_5;
        for (i_4 = 0; i_4 < int76; i_4++)
            for (i_5 = 0; i_5 < int76; i_5++) {
                if (i_5 <= i_4 - int76 / 2)
                    bytes_2[i_6] = -1;

                ++i_6;
            }

        byteArrayArrayArray3[6][0] = bytes_2;
        bytes_2 = new byte[int76 * int76];
        i_6 = 0;

        for (i_4 = int76 - 1; i_4 >= 0; --i_4)
            for (i_5 = 0; i_5 < int76; i_5++) {
                if (i_5 <= i_4 - int76 / 2)
                    bytes_2[i_6] = -1;

                ++i_6;
            }

        byteArrayArrayArray3[6][1] = bytes_2;
        bytes_2 = new byte[int76 * int76];
        i_6 = 0;

        for (i_4 = int76 - 1; i_4 >= 0; --i_4)
            for (i_5 = int76 - 1; i_5 >= 0; --i_5) {
                if (i_5 <= i_4 - int76 / 2)
                    bytes_2[i_6] = -1;

                ++i_6;
            }

        byteArrayArrayArray3[6][2] = bytes_2;
        bytes_2 = new byte[int76 * int76];
        i_6 = 0;

        for (i_4 = 0; i_4 < int76; i_4++)
            for (i_5 = int76 - 1; i_5 >= 0; --i_5) {
                if (i_5 <= i_4 - int76 / 2)
                    bytes_2[i_6] = -1;

                ++i_6;
            }

        byteArrayArrayArray3[6][3] = bytes_2;
    }

    void method93() {
        byte[] bytes_2 = new byte[int76 * int76];
        boolean bool_3 = false;
        bytes_2 = new byte[int76 * int76];
        int i_6 = 0;

        int i_4;
        int i_5;
        for (i_4 = 0; i_4 < int76; i_4++)
            for (i_5 = 0; i_5 < int76; i_5++) {
                if (i_5 >= i_4 - int76 / 2)
                    bytes_2[i_6] = -1;

                ++i_6;
            }

        byteArrayArrayArray3[7][0] = bytes_2;
        bytes_2 = new byte[int76 * int76];
        i_6 = 0;

        for (i_4 = int76 - 1; i_4 >= 0; --i_4)
            for (i_5 = 0; i_5 < int76; i_5++) {
                if (i_5 >= i_4 - int76 / 2)
                    bytes_2[i_6] = -1;

                ++i_6;
            }

        byteArrayArrayArray3[7][1] = bytes_2;
        bytes_2 = new byte[int76 * int76];
        i_6 = 0;

        for (i_4 = int76 - 1; i_4 >= 0; --i_4)
            for (i_5 = int76 - 1; i_5 >= 0; --i_5) {
                if (i_5 >= i_4 - int76 / 2)
                    bytes_2[i_6] = -1;

                ++i_6;
            }

        byteArrayArrayArray3[7][2] = bytes_2;
        bytes_2 = new byte[int76 * int76];
        i_6 = 0;

        for (i_4 = 0; i_4 < int76; i_4++)
            for (i_5 = int76 - 1; i_5 >= 0; --i_5) {
                if (i_5 >= i_4 - int76 / 2)
                    bytes_2[i_6] = -1;

                ++i_6;
            }

        byteArrayArrayArray3[7][3] = bytes_2;
    }

}

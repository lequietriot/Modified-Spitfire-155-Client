
public class StaticClass2 {

    static Js5IndexImpl staticJs5IndexImpl4;
    static IndexedSprite staticIndexedSprite2;
    static byte[][] staticByteArrayArray1;
    static int[][] staticIntArrayArray1;

    StaticClass2() throws Throwable {
        throw new Error();
    }

    static int staticMethod4(int i_0, int i_1) {
        Overlay overlay_3 = Overlay.staticMethod432(i_0);
        if (overlay_3 == null)
            return i_1;
        else if (overlay_3.int588 >= 0)
            return overlay_3.int588 | ~0xffffff;
        else {
            int i_5;
            int i_6;
            if (overlay_3.int587 >= 0) {
                i_5 = Rasterizer3D.staticInterface2_1.method151(overlay_3.int587);
                byte b_12 = 96;
                int i_4;
                if (i_5 == -2)
                    i_4 = 12345678;
                else if (i_5 == -1) {
                    if (b_12 < 0)
                        b_12 = 0;
                    else if (b_12 > 127)
                        b_12 = 127;

                    i_6 = 127 - b_12;
                    i_4 = i_6;
                } else {
                    i_6 = (i_5 & 0x7f) * b_12 / 128;
                    if (i_6 < 2)
                        i_6 = 2;
                    else if (i_6 > 126)
                        i_6 = 126;

                    i_4 = i_6 + (i_5 & 0xff80);
                }

                return Rasterizer3D.staticIntArray155[i_4] | ~0xffffff;
            } else if (overlay_3.int586 == 16711935)
                return i_1;
            else {
                i_5 = overlay_3.int593;
                i_6 = overlay_3.int589;
                int i_7 = overlay_3.int590;
                if (i_7 > 179)
                    i_6 /= 2;

                if (i_7 > 192)
                    i_6 /= 2;

                if (i_7 > 217)
                    i_6 /= 2;

                if (i_7 > 243)
                    i_6 /= 2;

                int i_8 = i_7 / 2 + (i_6 / 32 << 7) + (i_5 / 4 << 10);
                byte b_10 = 96;
                int i_9;
                if (i_8 == -2)
                    i_9 = 12345678;
                else {
                    int i_13;
                    if (i_8 == -1) {
                        if (b_10 < 0)
                            b_10 = 0;
                        else if (b_10 > 127)
                            b_10 = 127;

                        i_13 = 127 - b_10;
                        i_9 = i_13;
                    } else {
                        i_13 = b_10 * (i_8 & 0x7f) / 128;
                        if (i_13 < 2)
                            i_13 = 2;
                        else if (i_13 > 126)
                            i_13 = 126;

                        i_9 = i_13 + (i_8 & 0xff80);
                    }
                }

                return Rasterizer3D.staticIntArray155[i_9] | ~0xffffff;
            }
        }
    }

}

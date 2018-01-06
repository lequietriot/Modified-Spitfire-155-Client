public class Texture extends Node {

    boolean bool28 = false;
    int int355;
    boolean bool27;
    int[] intArray44;
    int[] intArray46;
    int[] intArray47;
    int[] intArray48;
    int int356;
    int int357;
    int[] intArray45;
    static int[] staticIntArray125;

    Texture(Buffer buffer_1) {
        int355 = buffer_1.readUShort();
        bool27 = buffer_1.readUByte() == 1;
        int i_2 = buffer_1.readUByte();
        if (i_2 >= 1 && i_2 <= 4) {
            intArray44 = new int[i_2];

            int i_3;
            for (i_3 = 0; i_3 < i_2; i_3++)
                intArray44[i_3] = buffer_1.readUShort();

            if (i_2 > 1) {
                intArray46 = new int[i_2 - 1];

                for (i_3 = 0; i_3 < i_2 - 1; i_3++)
                    intArray46[i_3] = buffer_1.readUByte();
            }

            if (i_2 > 1) {
                intArray47 = new int[i_2 - 1];

                for (i_3 = 0; i_3 < i_2 - 1; i_3++)
                    intArray47[i_3] = buffer_1.readUByte();
            }

            intArray48 = new int[i_2];

            for (i_3 = 0; i_3 < i_2; i_3++)
                intArray48[i_3] = buffer_1.readInt();

            int356 = buffer_1.readUByte();
            int357 = buffer_1.readUByte();
            intArray45 = null;
        } else
            throw new RuntimeException();
    }

    boolean method426(double d_1, int i_3, Js5Index js5index_4) {
        int i_5;
        for (i_5 = 0; i_5 < intArray44.length; i_5++)
            if (js5index_4.getFile2(intArray44[i_5]) == null)
                return false;

        i_5 = i_3 * i_3;
        intArray45 = new int[i_5];

        for (int i_6 = 0; i_6 < intArray44.length; i_6++) {
            int i_8 = intArray44[i_6];
            IndexedSprite indexedsprite_7;
            if (!StaticClass59.staticMethod243(js5index_4, i_8))
                indexedsprite_7 = null;
            else
                indexedsprite_7 = StaticClass59.staticMethod239();

            indexedsprite_7.method671();
            byte[] bytes_10 = indexedsprite_7.indices;
            int[] ints_11 = indexedsprite_7.intArray115;
            int i_12 = intArray48[i_6];
            if ((i_12 & ~0xffffff) == 16777216)
                ;

            if ((i_12 & ~0xffffff) == 33554432)
                ;

            int i_13;
            int i_14;
            int i_15;
            int i_16;
            if ((i_12 & ~0xffffff) == 50331648) {
                i_13 = i_12 & 0xff00ff;
                i_14 = i_12 >> 8 & 0xff;

                for (i_15 = 0; i_15 < ints_11.length; i_15++) {
                    i_16 = ints_11[i_15];
                    if ((i_16 & 0xffff) == i_16 >> 8) {
                        i_16 &= 0xff;
                        ints_11[i_15] = i_13 * i_16 >> 8 & 0xff00ff | i_14 * i_16 & 0xff00;
                    }
                }
            }

            for (i_13 = 0; i_13 < ints_11.length; i_13++)
                ints_11[i_13] = Rasterizer3D.staticMethod477(ints_11[i_13], d_1);

            if (i_6 == 0)
                i_13 = 0;
            else
                i_13 = intArray46[i_6 - 1];

            if (i_13 == 0)
                if (indexedsprite_7.width == i_3)
                    for (i_14 = 0; i_14 < i_5; i_14++)
                        intArray45[i_14] = ints_11[bytes_10[i_14] & 0xff];
                else if (indexedsprite_7.width == 64 && i_3 == 128) {
                    i_14 = 0;

                    for (i_15 = 0; i_15 < i_3; i_15++)
                        for (i_16 = 0; i_16 < i_3; i_16++)
                            intArray45[i_14++] = ints_11[bytes_10[(i_16 >> 1) + (i_15 >> 1 << 6)] & 0xff];
                } else {
                    if (indexedsprite_7.width != 128 || i_3 != 64)
                        throw new RuntimeException();

                    i_14 = 0;

                    for (i_15 = 0; i_15 < i_3; i_15++)
                        for (i_16 = 0; i_16 < i_3; i_16++)
                            intArray45[i_14++] = ints_11[bytes_10[(i_16 << 1) + (i_15 << 1 << 7)] & 0xff];
                }

            if (i_13 == 1)
                ;

            if (i_13 == 2)
                ;

            if (i_13 == 3)
                ;
        }

        return true;
    }

    void method427() {
        intArray45 = null;
    }

    void method428(int i_1) {
        if (intArray45 != null) {
            short s_2;
            int i_3;
            int i_4;
            int i_5;
            int i_6;
            int i_7;
            int[] ints_10;
            if (int356 == 1 || int356 == 3) {
                if (staticIntArray125 == null || staticIntArray125.length < intArray45.length)
                    staticIntArray125 = new int[intArray45.length];

                if (intArray45.length == 4096)
                    s_2 = 64;
                else
                    s_2 = 128;

                i_3 = intArray45.length;
                i_4 = s_2 * i_1 * int357;
                i_5 = i_3 - 1;
                if (int356 == 1)
                    i_4 = -i_4;

                for (i_6 = 0; i_6 < i_3; i_6++) {
                    i_7 = i_6 + i_4 & i_5;
                    staticIntArray125[i_6] = intArray45[i_7];
                }

                ints_10 = intArray45;
                intArray45 = staticIntArray125;
                staticIntArray125 = ints_10;
            }

            if (int356 == 2 || int356 == 4) {
                if (staticIntArray125 == null || staticIntArray125.length < intArray45.length)
                    staticIntArray125 = new int[intArray45.length];

                if (intArray45.length == 4096)
                    s_2 = 64;
                else
                    s_2 = 128;

                i_3 = intArray45.length;
                i_4 = i_1 * int357;
                i_5 = s_2 - 1;
                if (int356 == 2)
                    i_4 = -i_4;

                for (i_6 = 0; i_6 < i_3; i_6 += s_2)
                    for (i_7 = 0; i_7 < s_2; i_7++) {
                        int i_8 = i_6 + i_7;
                        int i_9 = i_6 + (i_7 + i_4 & i_5);
                        staticIntArray125[i_8] = intArray45[i_9];
                    }

                ints_10 = intArray45;
                intArray45 = staticIntArray125;
                staticIntArray125 = ints_10;
            }

        }
    }

}

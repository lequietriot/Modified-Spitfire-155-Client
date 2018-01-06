public class DataClass5 {

    static int[] staticIntArray34 = new int[500];
    static int[] staticIntArray33 = new int[500];
    static int[] staticIntArray36 = new int[500];
    static int[] staticIntArray35 = new int[500];
    AnimTransform animTransform1 = null;
    int int138 = -1;
    boolean bool15 = false;
    int[] intArray21;
    int[] intArray22;
    int[] intArray20;
    int[] intArray23;

    DataClass5(byte[] bytes_1, AnimTransform animtransform_2) {
        animTransform1 = animtransform_2;
        Buffer buffer_3 = new Buffer(bytes_1);
        Buffer buffer_4 = new Buffer(bytes_1);
        buffer_3.off = 2;
        int i_5 = buffer_3.readUByte();
        int i_6 = -1;
        int i_7 = 0;
        buffer_4.off = buffer_3.off + i_5;

        int i_8;
        for (i_8 = 0; i_8 < i_5; i_8++) {
            int i_9 = buffer_3.readUByte();
            if (i_9 > 0) {
                if (animTransform1.intArray49[i_8] != 0)
                    for (int i_10 = i_8 - 1; i_10 > i_6; --i_10)
                        if (animTransform1.intArray49[i_10] == 0) {
                            staticIntArray34[i_7] = i_10;
                            staticIntArray33[i_7] = 0;
                            staticIntArray36[i_7] = 0;
                            staticIntArray35[i_7] = 0;
                            ++i_7;
                            break;
                        }

                staticIntArray34[i_7] = i_8;
                short s_11 = 0;
                if (animTransform1.intArray49[i_8] == 3)
                    s_11 = 128;

                if ((i_9 & 0x1) != 0)
                    staticIntArray33[i_7] = buffer_4.method452();
                else
                    staticIntArray33[i_7] = s_11;

                if ((i_9 & 0x2) != 0)
                    staticIntArray36[i_7] = buffer_4.method452();
                else
                    staticIntArray36[i_7] = s_11;

                if ((i_9 & 0x4) != 0)
                    staticIntArray35[i_7] = buffer_4.method452();
                else
                    staticIntArray35[i_7] = s_11;

                i_6 = i_8;
                ++i_7;
                if (animTransform1.intArray49[i_8] == 5)
                    bool15 = true;
            }
        }

        if (buffer_4.off != bytes_1.length)
            throw new RuntimeException();
        else {
            int138 = i_7;
            intArray21 = new int[i_7];
            intArray22 = new int[i_7];
            intArray20 = new int[i_7];
            intArray23 = new int[i_7];

            for (i_8 = 0; i_8 < i_7; i_8++) {
                intArray21[i_8] = staticIntArray34[i_8];
                intArray22[i_8] = staticIntArray33[i_8];
                intArray20[i_8] = staticIntArray36[i_8];
                intArray23[i_8] = staticIntArray35[i_8];
            }

        }
    }

}

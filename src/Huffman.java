public class Huffman {

    static int[] staticIntArray59;
    int[] intArray37;
    byte[] byteArray1;
    int[] intArray36;

    public Huffman(byte[] bytes_1) {
        int i_2 = bytes_1.length;
        intArray37 = new int[i_2];
        byteArray1 = bytes_1;
        int[] ints_3 = new int[33];
        intArray36 = new int[8];
        int i_4 = 0;

        for (int i_5 = 0; i_5 < i_2; i_5++) {
            byte b_6 = bytes_1[i_5];
            if (b_6 != 0) {
                int i_7 = 1 << 32 - b_6;
                int i_8 = ints_3[b_6];
                intArray37[i_5] = i_8;
                int i_9;
                int i_10;
                int i_11;
                int i_12;
                if ((i_8 & i_7) != 0)
                    i_9 = ints_3[b_6 - 1];
                else {
                    i_9 = i_8 | i_7;

                    for (i_10 = b_6 - 1; i_10 >= 1; --i_10) {
                        i_11 = ints_3[i_10];
                        if (i_11 != i_8)
                            break;

                        i_12 = 1 << 32 - i_10;
                        if ((i_11 & i_12) != 0) {
                            ints_3[i_10] = ints_3[i_10 - 1];
                            break;
                        }

                        ints_3[i_10] = i_11 | i_12;
                    }
                }

                ints_3[b_6] = i_9;

                for (i_10 = b_6 + 1; i_10 <= 32; i_10++)
                    if (ints_3[i_10] == i_8)
                        ints_3[i_10] = i_9;

                i_10 = 0;

                for (i_11 = 0; i_11 < b_6; i_11++) {
                    i_12 = Integer.MIN_VALUE >>> i_11;
                    if ((i_8 & i_12) != 0) {
                        if (intArray36[i_10] == 0)
                            intArray36[i_10] = i_4;

                        i_10 = intArray36[i_10];
                    } else
                        ++i_10;

                    if (i_10 >= intArray36.length) {
                        int[] ints_13 = new int[intArray36.length * 2];

                        for (int i_14 = 0; i_14 < intArray36.length; i_14++)
                            ints_13[i_14] = intArray36[i_14];

                        intArray36 = ints_13;
                    }

                    i_12 >>>= 1;
                }

                intArray36[i_10] = ~i_5;
                if (i_10 >= i_4)
                    i_4 = i_10 + 1;
            }
        }

    }

    public int method232(byte[] bytes_1, int i_2, int i_3, byte[] bytes_4, int i_5) {
        int i_7 = 0;
        int i_8 = i_5 << 3;

        for (i_3 += i_2; i_2 < i_3; i_2++) {
            int i_9 = bytes_1[i_2] & 0xff;
            int i_10 = intArray37[i_9];
            byte b_11 = byteArray1[i_9];
            if (b_11 == 0)
                throw new RuntimeException("");

            int i_12 = i_8 >> 3;
            int i_13 = i_8 & 0x7;
            i_7 &= -i_13 >> 31;
            int i_14 = (b_11 + i_13 - 1 >> 3) + i_12;
            i_13 += 24;
            bytes_4[i_12] = (byte) (i_7 |= i_10 >>> i_13);
            if (i_12 < i_14) {
                ++i_12;
                i_13 -= 8;
                bytes_4[i_12] = (byte) (i_7 = i_10 >>> i_13);
                if (i_12 < i_14) {
                    ++i_12;
                    i_13 -= 8;
                    bytes_4[i_12] = (byte) (i_7 = i_10 >>> i_13);
                    if (i_12 < i_14) {
                        ++i_12;
                        i_13 -= 8;
                        bytes_4[i_12] = (byte) (i_7 = i_10 >>> i_13);
                        if (i_12 < i_14) {
                            ++i_12;
                            i_13 -= 8;
                            bytes_4[i_12] = (byte) (i_7 = i_10 << -i_13);
                        }
                    }
                }
            }

            i_8 += b_11;
        }

        return (i_8 + 7 >> 3) - i_5;
    }

    public int method233(byte[] bytes_1, int i_2, byte[] bytes_3, int i_4, int i_5) {
        if (i_5 == 0)
            return 0;
        else {
            int i_7 = 0;
            i_5 += i_4;
            int i_8 = i_2;

            while (true) {
                byte b_9 = bytes_1[i_8];
                if (b_9 < 0)
                    i_7 = intArray36[i_7];
                else
                    ++i_7;

                int i_10;
                if ((i_10 = intArray36[i_7]) < 0) {
                    bytes_3[i_4++] = (byte) ~i_10;
                    if (i_4 >= i_5)
                        break;

                    i_7 = 0;
                }

                if ((b_9 & 0x40) != 0)
                    i_7 = intArray36[i_7];
                else
                    ++i_7;

                if ((i_10 = intArray36[i_7]) < 0) {
                    bytes_3[i_4++] = (byte) ~i_10;
                    if (i_4 >= i_5)
                        break;

                    i_7 = 0;
                }

                if ((b_9 & 0x20) != 0)
                    i_7 = intArray36[i_7];
                else
                    ++i_7;

                if ((i_10 = intArray36[i_7]) < 0) {
                    bytes_3[i_4++] = (byte) ~i_10;
                    if (i_4 >= i_5)
                        break;

                    i_7 = 0;
                }

                if ((b_9 & 0x10) != 0)
                    i_7 = intArray36[i_7];
                else
                    ++i_7;

                if ((i_10 = intArray36[i_7]) < 0) {
                    bytes_3[i_4++] = (byte) ~i_10;
                    if (i_4 >= i_5)
                        break;

                    i_7 = 0;
                }

                if ((b_9 & 0x8) != 0)
                    i_7 = intArray36[i_7];
                else
                    ++i_7;

                if ((i_10 = intArray36[i_7]) < 0) {
                    bytes_3[i_4++] = (byte) ~i_10;
                    if (i_4 >= i_5)
                        break;

                    i_7 = 0;
                }

                if ((b_9 & 0x4) != 0)
                    i_7 = intArray36[i_7];
                else
                    ++i_7;

                if ((i_10 = intArray36[i_7]) < 0) {
                    bytes_3[i_4++] = (byte) ~i_10;
                    if (i_4 >= i_5)
                        break;

                    i_7 = 0;
                }

                if ((b_9 & 0x2) != 0)
                    i_7 = intArray36[i_7];
                else
                    ++i_7;

                if ((i_10 = intArray36[i_7]) < 0) {
                    bytes_3[i_4++] = (byte) ~i_10;
                    if (i_4 >= i_5)
                        break;

                    i_7 = 0;
                }

                if ((b_9 & 0x1) != 0)
                    i_7 = intArray36[i_7];
                else
                    ++i_7;

                if ((i_10 = intArray36[i_7]) < 0) {
                    bytes_3[i_4++] = (byte) ~i_10;
                    if (i_4 >= i_5)
                        break;

                    i_7 = 0;
                }

                ++i_8;
            }

            return i_8 + 1 - i_2;
        }
    }

}

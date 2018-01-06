public class Mus9 {

    static Stopwatch staticStopwatch1;
    int int150;
    int int149;
    int[][] intArrayArray7;

    public Mus9(int i_1, int i_2) {
        if (i_2 != i_1) {
            int i_3 = StaticClass25.staticMethod146(i_1, i_2);
            i_1 /= i_3;
            i_2 /= i_3;
            int150 = i_1;
            int149 = i_2;
            intArrayArray7 = new int[i_1][14];

            for (int i_4 = 0; i_4 < i_1; i_4++) {
                int[] ints_5 = intArrayArray7[i_4];
                double d_6 = (double) i_4 / (double) i_1 + 6.0D;
                int i_8 = (int) Math.floor(d_6 - 7.0D + 1.0D);
                if (i_8 < 0)
                    i_8 = 0;

                int i_9 = (int) Math.ceil(7.0D + d_6);
                if (i_9 > 14)
                    i_9 = 14;

                for (double d_10 = (double) i_2 / (double) i_1; i_8 < i_9; i_8++) {
                    double d_12 = (i_8 - d_6) * 3.141592653589793D;
                    double d_14 = d_10;
                    if (d_12 < -1.0E-4D || d_12 > 1.0E-4D)
                        d_14 = d_10 * (Math.sin(d_12) / d_12);

                    d_14 *= 0.54D + 0.46D * Math.cos((i_8 - d_6) * 0.2243994752564138D);
                    ints_5[i_8] = (int) Math.floor(0.5D + 65536.0D * d_14);
                }
            }

        }
    }

    byte[] method179(byte[] bytes_1) {
        if (intArrayArray7 != null) {
            int i_3 = 14 + (int) ((long) int149 * (long) bytes_1.length / int150);
            int[] ints_4 = new int[i_3];
            int i_5 = 0;
            int i_6 = 0;

            int i_7;
            for (i_7 = 0; i_7 < bytes_1.length; i_7++) {
                byte b_8 = bytes_1[i_7];
                int[] ints_9 = intArrayArray7[i_6];

                int i_10;
                for (i_10 = 0; i_10 < 14; i_10++)
                    ints_4[i_10 + i_5] += b_8 * ints_9[i_10];

                i_6 += int149;
                i_10 = i_6 / int150;
                i_5 += i_10;
                i_6 -= int150 * i_10;
            }

            bytes_1 = new byte[i_3];

            for (i_7 = 0; i_7 < i_3; i_7++) {
                int i_11 = 32768 + ints_4[i_7] >> 16;
                if (i_11 < -128)
                    bytes_1[i_7] = -128;
                else if (i_11 > 127)
                    bytes_1[i_7] = 127;
                else
                    bytes_1[i_7] = (byte) i_11;
            }
        }

        return bytes_1;
    }

    int method180(int i_1) {
        if (intArrayArray7 != null)
            i_1 = (int) ((long) i_1 * (long) int149 / int150);

        return i_1;
    }

    int method181(int i_1) {
        if (intArrayArray7 != null)
            i_1 = 6 + (int) ((long) int149 * (long) i_1 / int150);

        return i_1;
    }

}

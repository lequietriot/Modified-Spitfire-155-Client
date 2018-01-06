public class SoundFilter {

    static float[][] staticFloatArrayArray1 = new float[2][8];
    static int[][] staticIntArrayArray6 = new int[2][8];
    int[] intArray31 = new int[2];
    int[][][] intArrayArrayArray1 = new int[2][2][4];
    int[][][] intArrayArrayArray2 = new int[2][2][4];
    int[] intArray32 = new int[2];
    static float staticFloat1;
    static int staticInt76;

    float method169(int i_1, int i_2, float f_3) {
        float f_4 = intArrayArrayArray2[i_1][0][i_2] + f_3 * (intArrayArrayArray2[i_1][1][i_2] - intArrayArrayArray2[i_1][0][i_2]);
        f_4 *= 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0D, -f_4 / 20.0F);
    }

    static float staticMethod107(float f_0) {
        float f_1 = 32.703197F * (float) Math.pow(2.0D, f_0);
        return f_1 * 3.1415927F / 11025.0F;
    }

    float method170(int i_1, int i_2, float f_3) {
        float f_4 = intArrayArrayArray1[i_1][0][i_2] + f_3 * (intArrayArrayArray1[i_1][1][i_2] - intArrayArrayArray1[i_1][0][i_2]);
        f_4 *= 1.2207031E-4F;
        return staticMethod107(f_4);
    }

    int method171(int i_1, float f_2) {
        float f_3;
        if (i_1 == 0) {
            f_3 = intArray32[0] + (intArray32[1] - intArray32[0]) * f_2;
            f_3 *= 0.0030517578F;
            staticFloat1 = (float) Math.pow(0.1D, f_3 / 20.0F);
            staticInt76 = (int) (staticFloat1 * 65536.0F);
        }

        if (intArray31[i_1] == 0)
            return 0;
        else {
            f_3 = method169(i_1, 0, f_2);
            staticFloatArrayArray1[i_1][0] = -2.0F * f_3 * (float) Math.cos(method170(i_1, 0, f_2));
            staticFloatArrayArray1[i_1][1] = f_3 * f_3;

            int i_4;
            for (i_4 = 1; i_4 < intArray31[i_1]; i_4++) {
                f_3 = method169(i_1, i_4, f_2);
                float f_5 = -2.0F * f_3 * (float) Math.cos(method170(i_1, i_4, f_2));
                float f_6 = f_3 * f_3;
                staticFloatArrayArray1[i_1][i_4 * 2 + 1] = staticFloatArrayArray1[i_1][i_4 * 2 - 1] * f_6;
                staticFloatArrayArray1[i_1][i_4 * 2] = staticFloatArrayArray1[i_1][i_4 * 2 - 1] * f_5 + staticFloatArrayArray1[i_1][i_4 * 2 - 2] * f_6;

                for (int i_7 = i_4 * 2 - 1; i_7 >= 2; --i_7)
                    staticFloatArrayArray1[i_1][i_7] += staticFloatArrayArray1[i_1][i_7 - 1] * f_5 + staticFloatArrayArray1[i_1][i_7 - 2] * f_6;

                staticFloatArrayArray1[i_1][1] += staticFloatArrayArray1[i_1][0] * f_5 + f_6;
                staticFloatArrayArray1[i_1][0] += f_5;
            }

            if (i_1 == 0)
                for (i_4 = 0; i_4 < intArray31[0] * 2; i_4++)
                    staticFloatArrayArray1[0][i_4] *= staticFloat1;

            for (i_4 = 0; i_4 < intArray31[i_1] * 2; i_4++)
                staticIntArrayArray6[i_1][i_4] = (int) (staticFloatArrayArray1[i_1][i_4] * 65536.0F);

            return intArray31[i_1] * 2;
        }
    }

    final void method172(Buffer buffer_1, AudioEnvelope audioenvelope_2) {
        int i_3 = buffer_1.readUByte();
        intArray31[0] = i_3 >> 4;
        intArray31[1] = i_3 & 0xf;
        if (i_3 != 0) {
            intArray32[0] = buffer_1.readUShort();
            intArray32[1] = buffer_1.readUShort();
            int i_4 = buffer_1.readUByte();

            int i_5;
            int i_6;
            for (i_5 = 0; i_5 < 2; i_5++)
                for (i_6 = 0; i_6 < intArray31[i_5]; i_6++) {
                    intArrayArrayArray1[i_5][0][i_6] = buffer_1.readUShort();
                    intArrayArrayArray2[i_5][0][i_6] = buffer_1.readUShort();
                }

            for (i_5 = 0; i_5 < 2; i_5++)
                for (i_6 = 0; i_6 < intArray31[i_5]; i_6++)
                    if ((i_4 & 1 << i_5 * 4 << i_6) != 0) {
                        intArrayArrayArray1[i_5][1][i_6] = buffer_1.readUShort();
                        intArrayArrayArray2[i_5][1][i_6] = buffer_1.readUShort();
                    } else {
                        intArrayArrayArray1[i_5][1][i_6] = intArrayArrayArray1[i_5][0][i_6];
                        intArrayArrayArray2[i_5][1][i_6] = intArrayArrayArray2[i_5][0][i_6];
                    }

            if (i_4 != 0 || intArray32[1] != intArray32[0])
                audioenvelope_2.method145(buffer_1);
        } else {
            int[] ints_7 = intArray32;
            intArray32[1] = 0;
            ints_7[0] = 0;
        }

    }

}

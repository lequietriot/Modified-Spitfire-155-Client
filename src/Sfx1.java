import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.alex.io.InputStream;
import com.alex.store.Index;

public class Sfx1 extends Node {

    static boolean staticBool48 = false;
    static byte[] staticByteArray6;
    static int staticInt299;
    static int staticInt300;
    int int347;
    int int351;
    int int348;
    int int354;
    boolean bool25;
    byte[][] byteArrayArray1;
    static int staticInt301;
    static int staticInt302;
    static float[] staticFloatArray3;
    static Mus11[] staticMus11Array1;
    static Mus14[] staticMus14Array1;
    static Mus12[] staticMus12Array1;
    static Mus13[] staticMus13Array1;
    static boolean[] staticBoolArray10;
    static int[] staticIntArray123;
    static float[] staticFloatArray8;
    static float[] staticFloatArray6;
    static float[] staticFloatArray5;
    static int[] staticIntArray124;
    static float[] staticFloatArray7;
    static float[] staticFloatArray4;
    static float[] staticFloatArray2;
    static int[] staticIntArray122;
    float[] floatArray1;
    int int349;
    int int350;
    boolean bool26;
    static byte[] byteArray6;
    static int int353;
    int int352;
	static byte[] decodedInstrument;

    static float staticMethod369(int i_0) {
        int i_1 = i_0 & 0x1fffff;
        int i_2 = i_0 & ~0x7fffffff;
        int i_3 = (i_0 & 0x7fe00000) >> 21;
        if (i_2 != 0)
            i_1 = -i_1;

        return (float) (i_1 * Math.pow(2.0D, i_3 - 788));
    }

    static void staticMethod370(byte[] bytes_0, int i_1) {
        staticByteArray6 = bytes_0;
        staticInt299 = i_1;
        staticInt300 = 0;
    }

    static int staticMethod371() {
        int i_0 = staticByteArray6[staticInt299] >> staticInt300 & 0x1;
        ++staticInt300;
        staticInt299 += staticInt300 >> 3;
        staticInt300 &= 0x7;
        return i_0;
    }

    static int staticMethod372(int i_0) {
        int i_1 = 0;

        int i_2;
        int i_3;
        for (i_2 = 0; i_0 >= 8 - staticInt300; i_0 -= i_3) {
            i_3 = 8 - staticInt300;
            int i_4 = (1 << i_3) - 1;
            i_1 += (staticByteArray6[staticInt299] >> staticInt300 & i_4) << i_2;
            staticInt300 = 0;
            ++staticInt299;
            i_2 += i_3;
        }

        if (i_0 > 0) {
            i_3 = (1 << i_0) - 1;
            i_1 += (staticByteArray6[staticInt299] >> staticInt300 & i_3) << i_2;
            staticInt300 += i_0;
        }

        return i_1;
    }

    void method423(byte[] bytes_1) {
    		InputStream buffer_2 = new InputStream(bytes_1);
        //Buffer buffer_2 = new Buffer(bytes_1);
        int347 = buffer_2.readInt();
        int351 = buffer_2.readInt();
        int348 = buffer_2.readInt();
        int354 = buffer_2.readInt();
        if (int354 < 0) {
            int354 = ~int354;
            bool25 = true;
        }

        int i_3 = buffer_2.readInt();
        byteArrayArray1 = new byte[i_3][];

        for (int i_4 = 0; i_4 < i_3; i_4++) {
            int i_5 = 0;

            int i_6;
            do {
                i_6 = buffer_2.readUnsignedByte();
                i_5 += i_6;
            } while (i_6 >= 255);

            byte[] bytes_7 = new byte[i_5];
            buffer_2.readBytes(bytes_7, 0, i_5);
            byteArrayArray1[i_4] = bytes_7;
        }

    }

    static void staticMethod373(byte[] bytes_0) {
        staticMethod370(bytes_0, 0);
        staticInt301 = 1 << staticMethod372(4);
        staticInt302 = 1 << staticMethod372(4);
        staticFloatArray3 = new float[staticInt302];

        int i_1;
        int i_2;
        int i_3;
        int i_4;
        int i_5;
        for (i_1 = 0; i_1 < 2; i_1++) {
            i_2 = i_1 != 0 ? staticInt302 : staticInt301;
            i_3 = i_2 >> 1;
            i_4 = i_2 >> 2;
            i_5 = i_2 >> 3;
            float[] floats_6 = new float[i_3];

            for (int i_7 = 0; i_7 < i_4; i_7++) {
                floats_6[i_7 * 2] = (float) Math.cos(i_7 * 4 * 3.141592653589793D / i_2);
                floats_6[i_7 * 2 + 1] = -((float) Math.sin(i_7 * 4 * 3.141592653589793D / i_2));
            }

            float[] floats_13 = new float[i_3];

            for (int i_8 = 0; i_8 < i_4; i_8++) {
                floats_13[i_8 * 2] = (float) Math.cos((i_8 * 2 + 1) * 3.141592653589793D / (i_2 * 2));
                floats_13[i_8 * 2 + 1] = (float) Math.sin((i_8 * 2 + 1) * 3.141592653589793D / (i_2 * 2));
            }

            float[] floats_14 = new float[i_4];

            for (int i_9 = 0; i_9 < i_5; i_9++) {
                floats_14[i_9 * 2] = (float) Math.cos((i_9 * 4 + 2) * 3.141592653589793D / i_2);
                floats_14[i_9 * 2 + 1] = -((float) Math.sin((i_9 * 4 + 2) * 3.141592653589793D / i_2));
            }

            int[] ints_15 = new int[i_5];
            int i_10 = StaticClass25.staticMethod150(i_5 - 1);

            for (int i_11 = 0; i_11 < i_5; i_11++)
                ints_15[i_11] = StaticClass25.staticMethod151(i_11, i_10);

            if (i_1 != 0) {
                staticFloatArray7 = floats_6;
                staticFloatArray4 = floats_13;
                staticFloatArray2 = floats_14;
                staticIntArray122 = ints_15;
            } else {
                staticFloatArray8 = floats_6;
                staticFloatArray6 = floats_13;
                staticFloatArray5 = floats_14;
                staticIntArray124 = ints_15;
            }
        }

        i_1 = staticMethod372(8) + 1;
        staticMus11Array1 = new Mus11[i_1];

        for (i_2 = 0; i_2 < i_1; i_2++)
            staticMus11Array1[i_2] = new Mus11();

        i_2 = staticMethod372(6) + 1;

        for (i_3 = 0; i_3 < i_2; i_3++)
            staticMethod372(16);

        i_2 = staticMethod372(6) + 1;
        staticMus14Array1 = new Mus14[i_2];

        for (i_3 = 0; i_3 < i_2; i_3++)
            staticMus14Array1[i_3] = new Mus14();

        i_3 = staticMethod372(6) + 1;
        staticMus12Array1 = new Mus12[i_3];

        for (i_4 = 0; i_4 < i_3; i_4++)
            staticMus12Array1[i_4] = new Mus12();

        i_4 = staticMethod372(6) + 1;
        staticMus13Array1 = new Mus13[i_4];

        for (i_5 = 0; i_5 < i_4; i_5++)
            staticMus13Array1[i_5] = new Mus13();

        i_5 = staticMethod372(6) + 1;
        staticBoolArray10 = new boolean[i_5];
        staticIntArray123 = new int[i_5];

        for (int i_12 = 0; i_12 < i_5; i_12++) {
            staticBoolArray10[i_12] = staticMethod371() != 0;
            staticMethod372(16);
            staticMethod372(16);
            staticIntArray123[i_12] = staticMethod372(8);
        }

    }

    float[] method424(int i_1) {
        staticMethod370(byteArrayArray1[i_1], 0);
        staticMethod371();
        int i_2 = staticMethod372(StaticClass25.staticMethod150(staticIntArray123.length - 1));
        boolean bool_3 = staticBoolArray10[i_2];
        int i_4 = bool_3 ? staticInt302 : staticInt301;
        boolean bool_5 = false;
        boolean bool_6 = false;
        if (bool_3) {
            bool_5 = staticMethod371() != 0;
            bool_6 = staticMethod371() != 0;
        }

        int i_7 = i_4 >> 1;
        int i_8;
        int i_9;
        int i_10;
        if (bool_3 && !bool_5) {
            i_8 = (i_4 >> 2) - (staticInt301 >> 2);
            i_9 = (i_4 >> 2) + (staticInt301 >> 2);
            i_10 = staticInt301 >> 1;
        } else {
            i_8 = 0;
            i_9 = i_7;
            i_10 = i_4 >> 1;
        }

        int i_11;
        int i_12;
        int i_13;
        if (bool_3 && !bool_6) {
            i_11 = i_4 - (i_4 >> 2) - (staticInt301 >> 2);
            i_12 = i_4 - (i_4 >> 2) + (staticInt301 >> 2);
            i_13 = staticInt301 >> 1;
        } else {
            i_11 = i_7;
            i_12 = i_4;
            i_13 = i_4 >> 1;
        }

        Mus13 mus13_14 = staticMus13Array1[staticIntArray123[i_2]];
        int i_16 = mus13_14.int140;
        int i_17 = mus13_14.intArray24[i_16];
        boolean bool_15 = !staticMus14Array1[i_17].method167();
        boolean bool_40 = bool_15;

        for (i_17 = 0; i_17 < mus13_14.int139; i_17++) {
            Mus12 mus12_18 = staticMus12Array1[mus13_14.intArray25[i_17]];
            float[] floats_19 = staticFloatArray3;
            mus12_18.method148(floats_19, i_4 >> 1, bool_40);
        }

        int i_41;
        if (!bool_15) {
            i_17 = mus13_14.int140;
            i_41 = mus13_14.intArray24[i_17];
            staticMus14Array1[i_41].method168(staticFloatArray3, i_4 >> 1);
        }

        int i_42;
        if (bool_15)
            for (i_17 = i_4 >> 1; i_17 < i_4; i_17++)
                staticFloatArray3[i_17] = 0.0F;
        else {
            i_17 = i_4 >> 1;
            i_41 = i_4 >> 2;
            i_42 = i_4 >> 3;
            float[] floats_20 = staticFloatArray3;

            int i_21;
            for (i_21 = 0; i_21 < i_17; i_21++)
                floats_20[i_21] *= 0.5F;

            for (i_21 = i_17; i_21 < i_4; i_21++)
                floats_20[i_21] = -floats_20[i_4 - i_21 - 1];

            float[] floats_46 = bool_3 ? staticFloatArray7 : staticFloatArray8;
            float[] floats_22 = bool_3 ? staticFloatArray4 : staticFloatArray6;
            float[] floats_23 = bool_3 ? staticFloatArray2 : staticFloatArray5;
            int[] ints_24 = bool_3 ? staticIntArray122 : staticIntArray124;

            int i_25;
            float f_26;
            float f_27;
            float f_28;
            float f_29;
            for (i_25 = 0; i_25 < i_41; i_25++) {
                f_26 = floats_20[i_25 * 4] - floats_20[i_4 - i_25 * 4 - 1];
                f_27 = floats_20[i_25 * 4 + 2] - floats_20[i_4 - i_25 * 4 - 3];
                f_28 = floats_46[i_25 * 2];
                f_29 = floats_46[i_25 * 2 + 1];
                floats_20[i_4 - i_25 * 4 - 1] = f_26 * f_28 - f_27 * f_29;
                floats_20[i_4 - i_25 * 4 - 3] = f_26 * f_29 + f_27 * f_28;
            }

            float f_30;
            float f_31;
            for (i_25 = 0; i_25 < i_42; i_25++) {
                f_26 = floats_20[i_17 + 3 + i_25 * 4];
                f_27 = floats_20[i_17 + 1 + i_25 * 4];
                f_28 = floats_20[i_25 * 4 + 3];
                f_29 = floats_20[i_25 * 4 + 1];
                floats_20[i_17 + 3 + i_25 * 4] = f_26 + f_28;
                floats_20[i_17 + 1 + i_25 * 4] = f_27 + f_29;
                f_30 = floats_46[i_17 - 4 - i_25 * 4];
                f_31 = floats_46[i_17 - 3 - i_25 * 4];
                floats_20[i_25 * 4 + 3] = (f_26 - f_28) * f_30 - (f_27 - f_29) * f_31;
                floats_20[i_25 * 4 + 1] = (f_27 - f_29) * f_30 + (f_26 - f_28) * f_31;
            }

            i_25 = StaticClass25.staticMethod150(i_4 - 1);

            int i_47;
            int i_48;
            int i_49;
            int i_50;
            for (i_47 = 0; i_47 < i_25 - 3; i_47++) {
                i_48 = i_4 >> i_47 + 2;
                i_49 = 8 << i_47;

                for (i_50 = 0; i_50 < 2 << i_47; i_50++) {
                    int i_51 = i_4 - i_48 * 2 * i_50;
                    int i_52 = i_4 - i_48 * (i_50 * 2 + 1);

                    for (int i_32 = 0; i_32 < i_4 >> i_47 + 4; i_32++) {
                        int i_33 = i_32 * 4;
                        float f_34 = floats_20[i_51 - 1 - i_33];
                        float f_35 = floats_20[i_51 - 3 - i_33];
                        float f_36 = floats_20[i_52 - 1 - i_33];
                        float f_37 = floats_20[i_52 - 3 - i_33];
                        floats_20[i_51 - 1 - i_33] = f_34 + f_36;
                        floats_20[i_51 - 3 - i_33] = f_35 + f_37;
                        float f_38 = floats_46[i_32 * i_49];
                        float f_39 = floats_46[i_32 * i_49 + 1];
                        floats_20[i_52 - 1 - i_33] = (f_34 - f_36) * f_38 - (f_35 - f_37) * f_39;
                        floats_20[i_52 - 3 - i_33] = (f_35 - f_37) * f_38 + (f_34 - f_36) * f_39;
                    }
                }
            }

            for (i_47 = 1; i_47 < i_42 - 1; i_47++) {
                i_48 = ints_24[i_47];
                if (i_47 < i_48) {
                    i_49 = i_47 * 8;
                    i_50 = i_48 * 8;
                    f_30 = floats_20[i_49 + 1];
                    floats_20[i_49 + 1] = floats_20[i_50 + 1];
                    floats_20[i_50 + 1] = f_30;
                    f_30 = floats_20[i_49 + 3];
                    floats_20[i_49 + 3] = floats_20[i_50 + 3];
                    floats_20[i_50 + 3] = f_30;
                    f_30 = floats_20[i_49 + 5];
                    floats_20[i_49 + 5] = floats_20[i_50 + 5];
                    floats_20[i_50 + 5] = f_30;
                    f_30 = floats_20[i_49 + 7];
                    floats_20[i_49 + 7] = floats_20[i_50 + 7];
                    floats_20[i_50 + 7] = f_30;
                }
            }

            for (i_47 = 0; i_47 < i_17; i_47++)
                floats_20[i_47] = floats_20[i_47 * 2 + 1];

            for (i_47 = 0; i_47 < i_42; i_47++) {
                floats_20[i_4 - 1 - i_47 * 2] = floats_20[i_47 * 4];
                floats_20[i_4 - 2 - i_47 * 2] = floats_20[i_47 * 4 + 1];
                floats_20[i_4 - i_41 - 1 - i_47 * 2] = floats_20[i_47 * 4 + 2];
                floats_20[i_4 - i_41 - 2 - i_47 * 2] = floats_20[i_47 * 4 + 3];
            }

            for (i_47 = 0; i_47 < i_42; i_47++) {
                f_27 = floats_23[i_47 * 2];
                f_28 = floats_23[i_47 * 2 + 1];
                f_29 = floats_20[i_17 + i_47 * 2];
                f_30 = floats_20[i_17 + i_47 * 2 + 1];
                f_31 = floats_20[i_4 - 2 - i_47 * 2];
                float f_53 = floats_20[i_4 - 1 - i_47 * 2];
                float f_54 = f_28 * (f_29 - f_31) + f_27 * (f_30 + f_53);
                floats_20[i_17 + i_47 * 2] = (f_29 + f_31 + f_54) * 0.5F;
                floats_20[i_4 - 2 - i_47 * 2] = (f_29 + f_31 - f_54) * 0.5F;
                f_54 = f_28 * (f_30 + f_53) - f_27 * (f_29 - f_31);
                floats_20[i_17 + i_47 * 2 + 1] = (f_30 - f_53 + f_54) * 0.5F;
                floats_20[i_4 - 1 - i_47 * 2] = (-f_30 + f_53 + f_54) * 0.5F;
            }

            for (i_47 = 0; i_47 < i_41; i_47++) {
                floats_20[i_47] = floats_20[i_47 * 2 + i_17] * floats_22[i_47 * 2] + floats_20[i_47 * 2 + 1 + i_17] * floats_22[i_47 * 2 + 1];
                floats_20[i_17 - 1 - i_47] = floats_20[i_47 * 2 + i_17] * floats_22[i_47 * 2 + 1] - floats_20[i_47 * 2 + 1 + i_17] * floats_22[i_47 * 2];
            }

            for (i_47 = 0; i_47 < i_41; i_47++)
                floats_20[i_4 - i_41 + i_47] = -floats_20[i_47];

            for (i_47 = 0; i_47 < i_41; i_47++)
                floats_20[i_47] = floats_20[i_41 + i_47];

            for (i_47 = 0; i_47 < i_41; i_47++)
                floats_20[i_41 + i_47] = -floats_20[i_41 - i_47 - 1];

            for (i_47 = 0; i_47 < i_41; i_47++)
                floats_20[i_17 + i_47] = floats_20[i_4 - i_47 - 1];

            for (i_47 = i_8; i_47 < i_9; i_47++) {
                f_27 = (float) Math.sin((i_47 - i_8 + 0.5D) / i_10 * 0.5D * 3.141592653589793D);
                staticFloatArray3[i_47] *= (float) Math.sin(1.5707963267948966D * f_27 * f_27);
            }

            for (i_47 = i_11; i_47 < i_12; i_47++) {
                f_27 = (float) Math.sin((i_47 - i_11 + 0.5D) / i_13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                staticFloatArray3[i_47] *= (float) Math.sin(1.5707963267948966D * f_27 * f_27);
            }
        }

        float[] floats_43 = null;
        if (int349 > 0) {
            i_41 = int349 + i_4 >> 2;
            floats_43 = new float[i_41];
            int i_45;
            if (!bool26)
                for (i_42 = 0; i_42 < int350; i_42++) {
                    i_45 = (int349 >> 1) + i_42;
                    floats_43[i_42] += floatArray1[i_45];
                }

            if (!bool_15)
                for (i_42 = i_8; i_42 < i_4 >> 1; i_42++) {
                    i_45 = floats_43.length - (i_4 >> 1) + i_42;
                    floats_43[i_45] += staticFloatArray3[i_42];
                }
        }

        float[] floats_44 = floatArray1;
        floatArray1 = staticFloatArray3;
        staticFloatArray3 = floats_44;
        int349 = i_4;
        int350 = i_12 - (i_4 >> 1);
        bool26 = bool_15;
        return floats_43;
    }

    static boolean staticMethod374(Index js5index_0) {
        if (!staticBool48) {
            byte[] bytes_1 = js5index_0.getFile(0, 0);
            if (bytes_1 == null)
                return false;

            staticMethod373(bytes_1);
            staticBool48 = true;
        }

        return true;
    }

    static Sfx1 staticMethod375(Index js5index_0, int i_1, int i_2) {
        if (!staticMethod374(js5index_0)) {
            js5index_0.fileExists(i_1, i_2);
            return null;
        } else {
            byte[] bytes_3 = js5index_0.getFile(i_1, i_2);
            System.out.print("Sound2 (SampleID_NoteID): " + i_1 + "_");
            return bytes_3 == null ? null : new Sfx1(bytes_3);
        }
    }

    Sfx1(byte[] bytes_1) {
        method423(bytes_1);
    }

    MusicNote method425(int[] ints_1) throws IOException {

		File file = new File("./0.dat/");
		FileOutputStream fos = new FileOutputStream(file);
		DataOutputStream dos = new DataOutputStream(fos);
		
        if (ints_1 != null && ints_1[0] <= 0)
            return null;
        else {
            if (byteArray6 == null) {
                int349 = 0;
                floatArray1 = new float[staticInt302];
                byteArray6 = new byte[int351];
                int353 = 0;
                int352 = 0;
            }

            for (; int352 < byteArrayArray1.length; int352++) {
                if (ints_1 != null && ints_1[0] <= 0)
                    return null;

                float[] floats_2 = method424(int352);
                if (floats_2 != null) {
                    int i_3 = int353;
                    int i_4 = floats_2.length;
                    if (i_4 > int351 - i_3)
                        i_4 = int351 - i_3;

                    for (int i_5 = 0; i_5 < i_4; i_5++) {
                        int i_6 = (int) (128.0F + floats_2[i_5] * 128.0F);
                        if ((i_6 & ~0xff) != 0)
                            i_6 = ~i_6 >> 31;

                        byteArray6[i_3++] = (byte) (i_6 - 128);
                    }

                    if (ints_1 != null)
                        ints_1[0] -= i_3 - int353;

                    int353 = i_3;
                }
            }
            floatArray1 = null;
            byte[] bytes_7 = byteArray6;
            dos.write(bytes_7);
            byteArray6 = null;
            return new MusicNote(int347, bytes_7, int348, int354, bool25);
        }
    }

}

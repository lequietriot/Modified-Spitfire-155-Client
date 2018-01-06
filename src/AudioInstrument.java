import java.util.Random;

public class AudioInstrument {

    static int[] staticIntArray41 = new int[32768];
    static int[] staticIntArray40;
    static int[] staticIntArray42;
    static int[] staticIntArray43;
    static int[] staticIntArray46;
    static int[] staticIntArray47;
    static int[] staticIntArray44;
    static int[] staticIntArray45;
    int[] intArray34 = new int[] { 0, 0, 0, 0, 0 };
    int[] intArray33 = new int[] { 0, 0, 0, 0, 0 };
    int[] intArray35 = new int[] { 0, 0, 0, 0, 0 };
    int int145 = 0;
    int int146 = 100;
    int int147 = 500;
    int int148 = 0;
    AudioEnvelope audioEnvelope9;
    AudioEnvelope audioEnvelope5;
    AudioEnvelope audioEnvelope2;
    AudioEnvelope audioEnvelope3;
    AudioEnvelope audioEnvelope8;
    AudioEnvelope audioEnvelope1;
    AudioEnvelope audioEnvelope7;
    AudioEnvelope audioEnvelope4;
    SoundFilter soundFilter1;
    AudioEnvelope audioEnvelope6;

    static {
        Random random_0 = new Random(0L);

        int i_1;
        for (i_1 = 0; i_1 < 32768; i_1++)
            staticIntArray41[i_1] = (random_0.nextInt() & 0x2) - 1;

        staticIntArray40 = new int[32768];

        for (i_1 = 0; i_1 < 32768; i_1++)
            staticIntArray40[i_1] = (int) (Math.sin(i_1 / 5215.1903D) * 16384.0D);

        staticIntArray42 = new int[220500];
        staticIntArray43 = new int[5];
        staticIntArray46 = new int[5];
        staticIntArray47 = new int[5];
        staticIntArray44 = new int[5];
        staticIntArray45 = new int[5];
    }

    final int[] method173(int i_1, int i_2) {
        StaticClass30.staticMethod161(staticIntArray42, 0, i_1);
        if (i_2 < 10)
            return staticIntArray42;
        else {
            double d_3 = i_1 / (i_2 + 0.0D);
            audioEnvelope9.method146();
            audioEnvelope5.method146();
            int i_5 = 0;
            int i_6 = 0;
            int i_7 = 0;
            if (audioEnvelope2 != null) {
                audioEnvelope2.method146();
                audioEnvelope3.method146();
                i_5 = (int) ((audioEnvelope2.int105 - audioEnvelope2.int107) * 32.768D / d_3);
                i_6 = (int) (audioEnvelope2.int107 * 32.768D / d_3);
            }

            int i_8 = 0;
            int i_9 = 0;
            int i_10 = 0;
            if (audioEnvelope8 != null) {
                audioEnvelope8.method146();
                audioEnvelope1.method146();
                i_8 = (int) ((audioEnvelope8.int105 - audioEnvelope8.int107) * 32.768D / d_3);
                i_9 = (int) (audioEnvelope8.int107 * 32.768D / d_3);
            }

            int i_11;
            for (i_11 = 0; i_11 < 5; i_11++)
                if (intArray34[i_11] != 0) {
                    staticIntArray43[i_11] = 0;
                    staticIntArray46[i_11] = (int) (intArray35[i_11] * d_3);
                    staticIntArray47[i_11] = (intArray34[i_11] << 14) / 100;
                    staticIntArray44[i_11] = (int) ((audioEnvelope9.int105 - audioEnvelope9.int107) * 32.768D * Math.pow(1.0057929410678534D, intArray33[i_11]) / d_3);
                    staticIntArray45[i_11] = (int) (audioEnvelope9.int107 * 32.768D / d_3);
                }

            int i_12;
            int i_13;
            int i_14;
            int i_15;
            for (i_11 = 0; i_11 < i_1; i_11++) {
                i_12 = audioEnvelope9.method147(i_1);
                i_13 = audioEnvelope5.method147(i_1);
                if (audioEnvelope2 != null) {
                    i_14 = audioEnvelope2.method147(i_1);
                    i_15 = audioEnvelope3.method147(i_1);
                    i_12 += method174(i_7, i_15, audioEnvelope2.int109) >> 1;
                    i_7 += (i_14 * i_5 >> 16) + i_6;
                }

                if (audioEnvelope8 != null) {
                    i_14 = audioEnvelope8.method147(i_1);
                    i_15 = audioEnvelope1.method147(i_1);
                    i_13 = i_13 * ((method174(i_10, i_15, audioEnvelope8.int109) >> 1) + 32768) >> 15;
                    i_10 += (i_14 * i_8 >> 16) + i_9;
                }

                for (i_14 = 0; i_14 < 5; i_14++)
                    if (intArray34[i_14] != 0) {
                        i_15 = i_11 + staticIntArray46[i_14];
                        if (i_15 < i_1) {
                            staticIntArray42[i_15] += method174(staticIntArray43[i_14], i_13 * staticIntArray47[i_14] >> 15, audioEnvelope9.int109);
                            staticIntArray43[i_14] += (i_12 * staticIntArray44[i_14] >> 16) + staticIntArray45[i_14];
                        }
                    }
            }

            int i_16;
            if (audioEnvelope7 != null) {
                audioEnvelope7.method146();
                audioEnvelope4.method146();
                i_11 = 0;
                boolean bool_19 = false;
                boolean bool_20 = true;

                for (i_14 = 0; i_14 < i_1; i_14++) {
                    i_15 = audioEnvelope7.method147(i_1);
                    i_16 = audioEnvelope4.method147(i_1);
                    if (bool_20)
                        i_12 = audioEnvelope7.int107 + ((audioEnvelope7.int105 - audioEnvelope7.int107) * i_15 >> 8);
                    else
                        i_12 = audioEnvelope7.int107 + ((audioEnvelope7.int105 - audioEnvelope7.int107) * i_16 >> 8);

                    i_11 += 256;
                    if (i_11 >= i_12) {
                        i_11 = 0;
                        bool_20 = !bool_20;
                    }

                    if (bool_20)
                        staticIntArray42[i_14] = 0;
                }
            }

            if (int145 > 0 && int146 > 0) {
                i_11 = (int) (int145 * d_3);

                for (i_12 = i_11; i_12 < i_1; i_12++)
                    staticIntArray42[i_12] += staticIntArray42[i_12 - i_11] * int146 / 100;
            }

            if (soundFilter1.intArray31[0] > 0 || soundFilter1.intArray31[1] > 0) {
                audioEnvelope6.method146();
                i_11 = audioEnvelope6.method147(i_1 + 1);
                i_12 = soundFilter1.method171(0, i_11 / 65536.0F);
                i_13 = soundFilter1.method171(1, i_11 / 65536.0F);
                if (i_1 >= i_12 + i_13) {
                    i_14 = 0;
                    i_15 = i_13;
                    if (i_13 > i_1 - i_12)
                        i_15 = i_1 - i_12;

                    int i_17;
                    while (i_14 < i_15) {
                        i_16 = (int) ((long) staticIntArray42[i_14 + i_12] * (long) SoundFilter.staticInt76 >> 16);

                        for (i_17 = 0; i_17 < i_12; i_17++)
                            i_16 += (int) ((long) staticIntArray42[i_14 + i_12 - 1 - i_17] * (long) SoundFilter.staticIntArrayArray6[0][i_17] >> 16);

                        for (i_17 = 0; i_17 < i_14; i_17++)
                            i_16 -= (int) ((long) staticIntArray42[i_14 - 1 - i_17] * (long) SoundFilter.staticIntArrayArray6[1][i_17] >> 16);

                        staticIntArray42[i_14] = i_16;
                        i_11 = audioEnvelope6.method147(i_1 + 1);
                        ++i_14;
                    }

                    i_15 = 128;

                    while (true) {
                        if (i_15 > i_1 - i_12)
                            i_15 = i_1 - i_12;

                        int i_18;
                        while (i_14 < i_15) {
                            i_17 = (int) ((long) staticIntArray42[i_14 + i_12] * (long) SoundFilter.staticInt76 >> 16);

                            for (i_18 = 0; i_18 < i_12; i_18++)
                                i_17 += (int) ((long) staticIntArray42[i_14 + i_12 - 1 - i_18] * (long) SoundFilter.staticIntArrayArray6[0][i_18] >> 16);

                            for (i_18 = 0; i_18 < i_13; i_18++)
                                i_17 -= (int) ((long) staticIntArray42[i_14 - 1 - i_18] * (long) SoundFilter.staticIntArrayArray6[1][i_18] >> 16);

                            staticIntArray42[i_14] = i_17;
                            i_11 = audioEnvelope6.method147(i_1 + 1);
                            ++i_14;
                        }

                        if (i_14 >= i_1 - i_12) {
                            while (i_14 < i_1) {
                                i_17 = 0;

                                for (i_18 = i_14 + i_12 - i_1; i_18 < i_12; i_18++)
                                    i_17 += (int) ((long) staticIntArray42[i_14 + i_12 - 1 - i_18] * (long) SoundFilter.staticIntArrayArray6[0][i_18] >> 16);

                                for (i_18 = 0; i_18 < i_13; i_18++)
                                    i_17 -= (int) ((long) staticIntArray42[i_14 - 1 - i_18] * (long) SoundFilter.staticIntArrayArray6[1][i_18] >> 16);

                                staticIntArray42[i_14] = i_17;
                                audioEnvelope6.method147(i_1 + 1);
                                ++i_14;
                            }
                            break;
                        }

                        i_12 = soundFilter1.method171(0, i_11 / 65536.0F);
                        i_13 = soundFilter1.method171(1, i_11 / 65536.0F);
                        i_15 += 128;
                    }
                }
            }

            for (i_11 = 0; i_11 < i_1; i_11++) {
                if (staticIntArray42[i_11] < -32768)
                    staticIntArray42[i_11] = -32768;

                if (staticIntArray42[i_11] > 32767)
                    staticIntArray42[i_11] = 32767;
            }

            return staticIntArray42;
        }
    }

    final int method174(int i_1, int i_2, int i_3) {
        return i_3 == 1 ? (i_1 & 0x7fff) < 16384 ? i_2 : -i_2 : i_3 == 2 ? staticIntArray40[i_1 & 0x7fff] * i_2 >> 14 : i_3 == 3 ? ((i_1 & 0x7fff) * i_2 >> 14) - i_2 : i_3 == 4 ? staticIntArray41[i_1 / 2607 & 0x7fff] * i_2 : 0;
    }

    final void method175(Buffer buffer_1) {
        audioEnvelope9 = new AudioEnvelope();
        audioEnvelope9.method144(buffer_1);
        audioEnvelope5 = new AudioEnvelope();
        audioEnvelope5.method144(buffer_1);
        int i_2 = buffer_1.readUByte();
        if (i_2 != 0) {
            --buffer_1.off;
            audioEnvelope2 = new AudioEnvelope();
            audioEnvelope2.method144(buffer_1);
            audioEnvelope3 = new AudioEnvelope();
            audioEnvelope3.method144(buffer_1);
        }

        i_2 = buffer_1.readUByte();
        if (i_2 != 0) {
            --buffer_1.off;
            audioEnvelope8 = new AudioEnvelope();
            audioEnvelope8.method144(buffer_1);
            audioEnvelope1 = new AudioEnvelope();
            audioEnvelope1.method144(buffer_1);
        }

        i_2 = buffer_1.readUByte();
        if (i_2 != 0) {
            --buffer_1.off;
            audioEnvelope7 = new AudioEnvelope();
            audioEnvelope7.method144(buffer_1);
            audioEnvelope4 = new AudioEnvelope();
            audioEnvelope4.method144(buffer_1);
        }

        for (int i_3 = 0; i_3 < 10; i_3++) {
            int i_4 = buffer_1.method453();
            if (i_4 == 0)
                break;

            intArray34[i_3] = i_4;
            intArray33[i_3] = buffer_1.method452();
            intArray35[i_3] = buffer_1.method453();
        }

        int145 = buffer_1.method453();
        int146 = buffer_1.method453();
        int147 = buffer_1.readUShort();
        int148 = buffer_1.readUShort();
        soundFilter1 = new SoundFilter();
        audioEnvelope6 = new AudioEnvelope();
        soundFilter1.method172(buffer_1, audioEnvelope6);
    }

}

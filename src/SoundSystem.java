import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SoundSystem {

    public static SoundSystemProvider staticSoundSystemProvider1;
    static int staticInt75;
    int int136 = 32;
    long long3 = StaticClass27.synchronizedMethod7();
    long long5 = 0L;
    int int134 = 0;
    int int131 = 0;
    int int135 = 0;
    long long4 = 0L;
    boolean bool14 = true;
    int int137 = 0;
    Sequence[] sequenceArray1 = new Sequence[8];
    Sequence[] sequenceArray2 = new Sequence[8];
    protected int[] intArray19;
    int int132;
    int int133;
    static ScheduledExecutorService staticScheduledExecutorService1;
    Sequence sequence1;
    int int130;

    public static final SoundSystem staticMethod103(TaskManager taskmanager_0, int i_1, int i_2) {
        if (WorldMapTile.staticInt7 == 0)
            throw new IllegalStateException();
        else if (i_1 >= 0 && i_1 < 2) {
            if (i_2 < 256)
                i_2 = 256;

            try {
                SoundSystem soundsystem_4 = staticSoundSystemProvider1.getSoundSystem();
                soundsystem_4.intArray19 = new int[(WorldMapLabel.staticBool1 ? 2 : 1) * 256];
                soundsystem_4.int132 = i_2;
                soundsystem_4.init();
                soundsystem_4.int133 = (i_2 & ~0x3ff) + 1024;
                if (soundsystem_4.int133 > 16384)
                    soundsystem_4.int133 = 16384;

                soundsystem_4.start(soundsystem_4.int133);
                if (ExchangeOfferComparator3.staticInt157 > 0 && StaticClass11.staticSoundSystemRunnable1 == null) {
                    StaticClass11.staticSoundSystemRunnable1 = new SoundSystemRunnable();
                    staticScheduledExecutorService1 = Executors.newScheduledThreadPool(1);
                    staticScheduledExecutorService1.scheduleAtFixedRate(StaticClass11.staticSoundSystemRunnable1, 0L, 10L, TimeUnit.MILLISECONDS);
                }

                if (StaticClass11.staticSoundSystemRunnable1 != null) {
                    if (StaticClass11.staticSoundSystemRunnable1.volatileSoundSystemArray1[i_1] != null)
                        throw new IllegalArgumentException();

                    StaticClass11.staticSoundSystemRunnable1.volatileSoundSystemArray1[i_1] = soundsystem_4;
                }

                return soundsystem_4;
            } catch (Throwable throwable_5) {
                return new SoundSystem();
            }
        } else
            throw new IllegalArgumentException();
    }

    public final synchronized void synchronizedMethod3(Sequence sequence_1) {
        sequence1 = sequence_1;
    }

    public final synchronized void synchronizedMethod4() {
        if (intArray19 != null) {
            long long_2 = StaticClass27.synchronizedMethod7();

            try {
                if (long5 != 0L) {
                    if (long_2 < long5)
                        return;

                    start(int133);
                    long5 = 0L;
                    bool14 = true;
                }

                int i_4 = available();
                if (int135 - i_4 > int134)
                    int134 = int135 - i_4;

                int i_5 = int130 + int132;
                if (i_5 + 256 > 16384)
                    i_5 = 16128;

                if (i_5 + 256 > int133) {
                    int133 += 1024;
                    if (int133 > 16384)
                        int133 = 16384;

                    close();
                    start(int133);
                    i_4 = 0;
                    bool14 = true;
                    if (i_5 + 256 > int133) {
                        i_5 = int133 - 256;
                        int130 = i_5 - int132;
                    }
                }

                while (i_4 < i_5) {
                    method162(intArray19, 256);
                    flush();
                    i_4 += 256;
                }

                if (long_2 > long4) {
                    if (!bool14) {
                        if (int134 == 0 && int131 == 0) {
                            close();
                            long5 = 2000L + long_2;
                            return;
                        }

                        int130 = Math.min(int131, int134);
                        int131 = int134;
                    } else
                        bool14 = false;

                    int134 = 0;
                    long4 = 2000L + long_2;
                }

                int135 = i_4;
            } catch (Exception exception_7) {
                close();
                long5 = long_2 + 2000L;
            }

            try {
                if (long_2 > 500000L + long3)
                    long_2 = long3;

                while (long_2 > 5000L + long3) {
                    method161(256);
                    long3 += 256000 / WorldMapTile.staticInt7;
                }
            } catch (Exception exception_6) {
                long3 = long_2;
            }

        }
    }

    public final void method160() {
        bool14 = true;
    }

    public final synchronized void synchronizedMethod5() {
        bool14 = true;

        try {
            flushLine();
        } catch (Exception exception_3) {
            close();
            long5 = StaticClass27.synchronizedMethod7() + 2000L;
        }

    }

    public final synchronized void shutdown() {
        if (StaticClass11.staticSoundSystemRunnable1 != null) {
            boolean bool_2 = true;

            for (int i_3 = 0; i_3 < 2; i_3++) {
                if (StaticClass11.staticSoundSystemRunnable1.volatileSoundSystemArray1[i_3] == this)
                    StaticClass11.staticSoundSystemRunnable1.volatileSoundSystemArray1[i_3] = null;

                if (StaticClass11.staticSoundSystemRunnable1.volatileSoundSystemArray1[i_3] != null)
                    bool_2 = false;
            }

            if (bool_2) {
                staticScheduledExecutorService1.shutdownNow();
                staticScheduledExecutorService1 = null;
                StaticClass11.staticSoundSystemRunnable1 = null;
            }
        }

        close();
        intArray19 = null;
    }

    final void method161(int i_1) {
        int137 -= i_1;
        if (int137 < 0)
            int137 = 0;

        if (sequence1 != null)
            sequence1.method419(i_1);

    }

    final void method162(int[] ints_1, int i_2) {
        int i_3 = i_2;
        if (WorldMapLabel.staticBool1)
            i_3 = i_2 << 1;

        StaticClass30.staticMethod161(ints_1, 0, i_3);
        int137 -= i_2;
        if (sequence1 != null && int137 <= 0) {
            int137 += WorldMapTile.staticInt7 >> 4;
            staticMethod104(sequence1);
            method163(sequence1, sequence1.method421());
            int i_4 = 0;
            int i_5 = 255;

            int i_6;
            Sequence sequence_10;
            label103: for (i_6 = 7; i_5 != 0; --i_6) {
                int i_7;
                int i_8;
                if (i_6 < 0) {
                    i_7 = i_6 & 0x3;
                    i_8 = -(i_6 >> 2);
                } else {
                    i_7 = i_6;
                    i_8 = 0;
                }

                for (int i_9 = i_5 >>> i_7 & 0x11111111; i_9 != 0; i_9 >>>= 4) {
                    if ((i_9 & 0x1) != 0) {
                        i_5 &= ~(1 << i_7);
                        sequence_10 = null;
                        Sequence sequence_11 = sequenceArray1[i_7];

                        label97: while (true)
                            while (true) {
                                if (sequence_11 == null)
                                    break label97;

                                Mus10 mus10_12 = sequence_11.mus10_1;
                                if (mus10_12 != null && mus10_12.int358 > i_8) {
                                    i_5 |= 1 << i_7;
                                    sequence_10 = sequence_11;
                                    sequence_11 = sequence_11.sequence2;
                                } else {
                                    sequence_11.volatileBool5 = true;
                                    int i_13 = sequence_11.method417();
                                    i_4 += i_13;
                                    if (mus10_12 != null)
                                        mus10_12.int358 += i_13;

                                    if (i_4 >= int136)
                                        break label103;

                                    Sequence sequence_14 = sequence_11.method418();
                                    if (sequence_14 != null)
                                        for (int i_15 = sequence_11.int346; sequence_14 != null; sequence_14 = sequence_11.method416())
                                            method163(sequence_14, i_15 * sequence_14.method421() >> 8);

                                    Sequence sequence_18 = sequence_11.sequence2;
                                    sequence_11.sequence2 = null;
                                    if (sequence_10 == null)
                                        sequenceArray1[i_7] = sequence_18;
                                    else
                                        sequence_10.sequence2 = sequence_18;

                                    if (sequence_18 == null)
                                        sequenceArray2[i_7] = sequence_10;

                                    sequence_11 = sequence_18;
                                }
                            }
                    }

                    i_7 += 4;
                    ++i_8;
                }
            }

            for (i_6 = 0; i_6 < 8; i_6++) {
                Sequence sequence_16 = sequenceArray1[i_6];
                Sequence[] arr_17 = sequenceArray1;
                sequenceArray2[i_6] = null;

                for (arr_17[i_6] = null; sequence_16 != null; sequence_16 = sequence_10) {
                    sequence_10 = sequence_16.sequence2;
                    sequence_16.sequence2 = null;
                }
            }
        }

        if (int137 < 0)
            int137 = 0;

        if (sequence1 != null)
            sequence1.method420(ints_1, 0, i_2);

        long3 = StaticClass27.synchronizedMethod7();
    }

    static final void staticMethod104(Sequence sequence_0) {
        sequence_0.volatileBool5 = false;
        if (sequence_0.mus10_1 != null)
            sequence_0.mus10_1.int358 = 0;

        for (Sequence sequence_2 = sequence_0.method418(); sequence_2 != null; sequence_2 = sequence_0.method416())
            staticMethod104(sequence_2);

    }

    final void method163(Sequence sequence_1, int i_2) {
        int i_4 = i_2 >> 5;
        Sequence sequence_5 = sequenceArray2[i_4];
        if (sequence_5 == null)
            sequenceArray1[i_4] = sequence_1;
        else
            sequence_5.sequence2 = sequence_1;

        sequenceArray2[i_4] = sequence_1;
        sequence_1.int346 = i_2;
    }

    protected void init() throws Exception {
    }

    protected void start(int i_1) throws Exception {
    }

    protected int available() throws Exception {
        return int133;
    }

    protected void flush() throws Exception {
    }

    protected void close() {
    }

    protected void flushLine() throws Exception {
    }

}

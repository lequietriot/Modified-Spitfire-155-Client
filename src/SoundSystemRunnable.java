public class SoundSystemRunnable implements Runnable {

    public static short[][] staticShortArrayArray1;
    volatile SoundSystem[] volatileSoundSystemArray1 = new SoundSystem[2];

    @Override
    public void run() {
        try {
            for (int i_1 = 0; i_1 < 2; i_1++) {
                SoundSystem soundsystem_2 = volatileSoundSystemArray1[i_1];
                if (soundsystem_2 != null)
                    soundsystem_2.synchronizedMethod4();
            }
        } catch (Exception exception_3) {
            ClientError.staticMethod113((String) null, exception_3);
        }

    }

}

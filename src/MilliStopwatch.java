public class MilliStopwatch extends Stopwatch {

    long[] longArray1 = new long[10];
    int int371 = 256;
    int int369 = 1;
    int int370 = 0;
    long long19 = StaticClass27.synchronizedMethod7();
    int int368;

    MilliStopwatch() {
        for (int i_1 = 0; i_1 < 10; i_1++)
            longArray1[i_1] = long19;

    }

    @Override
    public void set() {
        for (int i_2 = 0; i_2 < 10; i_2++)
            longArray1[i_2] = 0L;

    }

    @Override
    public int sleep(int i_1, int i_2) {
        int i_4 = int371;
        int i_5 = int369;
        int371 = 300;
        int369 = 1;
        long19 = StaticClass27.synchronizedMethod7();
        if (longArray1[int368] == 0L) {
            int371 = i_4;
            int369 = i_5;
        } else if (long19 > longArray1[int368])
            int371 = (int) (i_1 * 2560 / (long19 - longArray1[int368]));

        if (int371 < 25)
            int371 = 25;

        if (int371 > 256) {
            int371 = 256;
            int369 = (int) (i_1 - (long19 - longArray1[int368]) / 10L);
        }

        if (int369 > i_1)
            int369 = i_1;

        longArray1[int368] = long19;
        int368 = (1 + int368) % 10;
        int i_6;
        if (int369 > 1)
            for (i_6 = 0; i_6 < 10; i_6++)
                if (longArray1[i_6] != 0L)
                    longArray1[i_6] += int369;

        if (int369 < i_2)
            int369 = i_2;

        StaticClass18.staticMethod127(int369);

        for (i_6 = 0; int370 < 256; int370 += int371)
            ++i_6;

        int370 &= 0xff;
        return i_6;
    }

}

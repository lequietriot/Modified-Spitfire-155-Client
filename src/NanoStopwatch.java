public class NanoStopwatch extends Stopwatch {

    long setTime = System.nanoTime();

    @Override
    public void set() {
        setTime = System.nanoTime();
    }

    @Override
    public int sleep(int i_1, int i_2) {
        long long_4 = i_2 * 1000000L;
        long long_6 = setTime - System.nanoTime();
        if (long_6 < long_4)
            long_6 = long_4;

        StaticClass18.staticMethod127(long_6 / 1000000L);
        long long_8 = System.nanoTime();

        int i_10;
        for (i_10 = 0; i_10 < 10 && (i_10 < 1 || setTime < long_8); setTime += i_1 * 1000000L)
            ++i_10;

        if (setTime < long_8)
            setTime = long_8;

        return i_10;
    }

}

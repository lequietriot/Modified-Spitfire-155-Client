
public class StaticClass18 {

    public static int staticInt121;
    static int staticInt122;
    public static int[] staticIntArray58;

    StaticClass18() throws Throwable {
        throw new Error();
    }

    public static final void staticMethod127(long long_0) {
        if (long_0 > 0L)
            if (long_0 % 10L == 0L) {
                staticMethod128(long_0 - 1L);
                staticMethod128(1L);
            } else
                staticMethod128(long_0);
    }

    static final void staticMethod128(long long_0) {
        try {
            Thread.sleep(long_0);
        } catch (InterruptedException interruptedexception_3) {
            ;
        }

    }

}

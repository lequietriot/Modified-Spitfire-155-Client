public class StaticClass62 {

    static int staticInt158;

    StaticClass62() throws Throwable {
        throw new Error();
    }

    public static Stopwatch staticMethod248() {
        try {
            return new NanoStopwatch();
        } catch (Throwable throwable_2) {
            return new MilliStopwatch();
        }
    }

}

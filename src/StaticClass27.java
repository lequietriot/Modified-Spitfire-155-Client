
public class StaticClass27 {

    static long staticLong6;
    static long staticLong7;

    StaticClass27() throws Throwable {
        throw new Error();
    }

    public static synchronized long synchronizedMethod7() {
        long long_1 = System.currentTimeMillis();
        if (long_1 < staticLong7)
            staticLong6 += staticLong7 - long_1;

        staticLong7 = long_1;
        return long_1 + staticLong6;
    }

}

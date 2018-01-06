public class Class10 {

    long long14 = -1L;
    long long17 = -1L;
    public boolean bool19 = false;
    long long15 = 0L;
    long long18 = 0L;
    long long16 = 0L;
    int int276 = 0;
    int int277 = 0;
    int int278 = 0;
    int int279 = 0;

    public void method317() {
        long14 = StaticClass27.synchronizedMethod7();
    }

    public void method318() {
        if (long14 != -1L) {
            long18 = StaticClass27.synchronizedMethod7() - long14;
            long14 = -1L;
        }

    }

    public void method319(int i_1) {
        long17 = StaticClass27.synchronizedMethod7();
        int276 = i_1;
    }

    public void method320() {
        if (long17 != -1L) {
            long15 = StaticClass27.synchronizedMethod7() - long17;
            long17 = -1L;
        }

        ++int278;
        bool19 = true;
    }

    public void method321() {
        bool19 = false;
        int277 = 0;
    }

    public void method322() {
        method320();
    }

    public void method323(Buffer buffer_1) {
        staticMethod231(buffer_1, long18);
        staticMethod231(buffer_1, long15);
        staticMethod231(buffer_1, long16);
        buffer_1.writeShort(int276);
        buffer_1.writeShort(int277);
        buffer_1.writeShort(int278);
        buffer_1.writeShort(int279);
    }

    static void staticMethod231(Buffer buffer_0, long long_1) {
        long_1 /= 10L;
        if (long_1 < 0L)
            long_1 = 0L;
        else if (long_1 > 65535L)
            long_1 = 65535L;

        buffer_0.writeShort((int) long_1);
    }

}

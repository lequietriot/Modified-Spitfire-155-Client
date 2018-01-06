public class CacheableSub2 extends Cacheable {

    static Cache staticCache29 = new Cache(64);
    static Js5Index staticJs5Index29;
    ParamList properties;

    public static void staticMethod428(Js5Index js5index_0) {
        staticJs5Index29 = js5index_0;
    }

    public static CacheableSub2 staticMethod429(int i_0) {
        CacheableSub2 cacheablesub2_2 = (CacheableSub2) staticCache29.get(i_0);
        if (cacheablesub2_2 != null)
            return cacheablesub2_2;
        else {
            byte[] bytes_3 = staticJs5Index29.getFile(34, i_0);
            cacheablesub2_2 = new CacheableSub2();
            if (bytes_3 != null)
                cacheablesub2_2.decode(new Buffer(bytes_3));

            cacheablesub2_2.method594();
            staticCache29.put(cacheablesub2_2, i_0);
            return cacheablesub2_2;
        }
    }

    void method594() {
    }

    void decode(Buffer buffer_1) {
        while (true) {
            int i_3 = buffer_1.readUByte();
            if (i_3 == 0)
                return;

            this.decode(buffer_1, i_3);
        }
    }

    void decode(Buffer buffer_1, int i_2) {
        if (i_2 == 249)
            properties = StaticClass46.staticMethod195(buffer_1, properties);

    }

    public int getIntProperty(int i_1, int i_2) {
        return StaticClass46.staticMethod196(properties, i_1, i_2);
    }

    public String getStringProperty(int i_1, String string_2) {
        return StaticClass46.staticMethod197(properties, i_1, string_2);
    }

    public static void staticMethod430() {
        staticCache29.method264();
    }

}


public class Varp extends Cacheable {

    static Cache staticCache27 = new Cache(64);
    public int value = 0;
    static Js5Index staticJs5Index27;

    public static void staticMethod423(Js5Index js5index_0) {
        staticJs5Index27 = js5index_0;
        StaticClass18.staticInt121 = staticJs5Index27.numFiles(16);
    }

    public static Varp staticMethod424(int i_0) {
        Varp varp_2 = (Varp) staticCache27.get(i_0);
        if (varp_2 != null)
            return varp_2;
        else {
            byte[] bytes_3 = staticJs5Index27.getFile(16, i_0);
            varp_2 = new Varp();
            if (bytes_3 != null)
                varp_2.decode(new Buffer(bytes_3));

            staticCache27.put(varp_2, i_0);
            return varp_2;
        }
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
        if (i_2 == 5)
            value = buffer_1.readUShort();

    }

    public static void staticMethod425() {
        staticCache27.method264();
    }

}

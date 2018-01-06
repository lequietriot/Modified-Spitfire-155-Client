public class InvType extends Cacheable {

    static Cache staticCache28 = new Cache(64);
    public int size = 0;
    static Js5Index staticJs5Index28;

    public static void staticMethod426(Js5Index js5index_0) {
        staticJs5Index28 = js5index_0;
    }

    public static InvType staticMethod427(int i_0) {
        InvType invtype_2 = (InvType) staticCache28.get(i_0);
        if (invtype_2 != null)
            return invtype_2;
        else {
            byte[] bytes_3 = staticJs5Index28.getFile(5, i_0);
            invtype_2 = new InvType();
            if (bytes_3 != null)
                invtype_2.decode(new Buffer(bytes_3));

            staticCache28.put(invtype_2, i_0);
            return invtype_2;
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
        if (i_2 == 2)
            size = buffer_1.readUShort();

    }

}

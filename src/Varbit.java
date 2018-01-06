public class Varbit extends Cacheable {

    public static Js5Index staticJs5Index22;
    static int[] staticIntArray129;
    public static Cache staticCache19 = new Cache(64);
    public int id;
    public int startBit;
    public int endBit;

    public void decode(Buffer buffer_1) {
        while (true) {
            int i_3 = buffer_1.readUByte();
            if (i_3 == 0)
                return;

            this.decode(buffer_1, i_3);
        }
    }

    void decode(Buffer buffer_1, int i_2) {
        if (i_2 == 1) {
            id = buffer_1.readUShort();
            startBit = buffer_1.readUByte();
            endBit = buffer_1.readUByte();
        }

    }

}

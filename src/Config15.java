public class Config15 extends Cacheable {

    public static Js5Index staticJs5Index11;
    public boolean bool52 = false;
    public static Cache staticCache7 = new Cache(64);

    public void decode(Buffer buffer_1) {
        while (true) {
            int i_3 = buffer_1.readUByte();
            if (i_3 == 0)
                return;

            this.decode(buffer_1, i_3);
        }
    }

    void decode(Buffer buffer_1, int i_2) {
        if (i_2 == 2)
            bool52 = true;

    }

}

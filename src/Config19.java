public class Config19 extends Cacheable {

    public static Js5Index staticJs5Index19;
    public boolean bool66 = false;
    public static Cache staticCache16 = new Cache(64);

    public void decode(Buffer buffer_1) {
        while (true) {
            int i_3 = buffer_1.readUByte();
            if (i_3 == 0)
                return;

            loadOverlay(buffer_1, i_3);
        }
    }

    void loadOverlay(Buffer buffer_1, int i_2) {
        if (i_2 == 2)
            bool66 = true;

    }

}

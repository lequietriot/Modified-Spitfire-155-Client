public class AbstractClass1Sub1 extends AbstractClass1 {

    public static String[] staticStringArray6;

    public static Underlay staticMethod249(int i_0) {
        Underlay underlay_2 = (Underlay) Underlay.staticCache30.get(i_0);
        if (underlay_2 != null)
            return underlay_2;
        else {
            byte[] bytes_3 = Underlay.staticJs5Index30.getFile(1, i_0);
            underlay_2 = new Underlay();
            if (bytes_3 != null)
                underlay_2.decode(new Buffer(bytes_3), i_0);

            underlay_2.method595();
            Underlay.staticCache30.put(underlay_2, i_0);
            return underlay_2;
        }
    }

    @Override
    protected boolean method246(int i_1, int i_2, int i_3, CollisionMap collisionmap_4) {
        return int237 == i_2 && i_3 == int238;
    }

}

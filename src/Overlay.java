
public class Overlay extends Cacheable {

    static Cache staticCache31 = new Cache(64);
    public int int586 = 0;
    public int int587 = -1;
    public boolean bool67 = true;
    public int int588 = -1;
    static Js5Index staticJs5Index31;
    public int int591;
    public int int585;
    public int int592;
    public int int593;
    public int int589;
    public int int590;

    public static void staticMethod431(Js5Index js5index_0) {
        staticJs5Index31 = js5index_0;
    }

    public static Overlay staticMethod432(int i_0) {
        Overlay overlay_2 = (Overlay) staticCache31.get(i_0);
        if (overlay_2 != null)
            return overlay_2;
        else {
            byte[] bytes_3 = staticJs5Index31.getFile(4, i_0);
            overlay_2 = new Overlay();
            if (bytes_3 != null)
                overlay_2.decode(new Buffer(bytes_3), i_0);

            overlay_2.method597();
            staticCache31.put(overlay_2, i_0);
            return overlay_2;
        }
    }

    void method597() {
        if (int588 != -1) {
            method598(int588);
            int591 = int593;
            int585 = int589;
            int592 = int590;
        }

        method598(int586);
    }

    void decode(Buffer buffer_1, int i_2) {
        while (true) {
            int i_4 = buffer_1.readUByte();
            if (i_4 == 0)
                return;

            this.decode(buffer_1, i_4, i_2);
        }
    }

    void decode(Buffer buffer_1, int i_2, int i_3) {
        if (i_2 == 1)
            int586 = buffer_1.method443();
        else if (i_2 == 2)
            int587 = buffer_1.readUByte();
        else if (i_2 == 5)
            bool67 = false;
        else if (i_2 == 7)
            int588 = buffer_1.method443();
        else if (i_2 == 8)
            ;

    }

    void method598(int i_1) {
        double d_3 = (i_1 >> 16 & 0xff) / 256.0D;
        double d_5 = (i_1 >> 8 & 0xff) / 256.0D;
        double d_7 = (i_1 & 0xff) / 256.0D;
        double d_9 = d_3;
        if (d_5 < d_3)
            d_9 = d_5;

        if (d_7 < d_9)
            d_9 = d_7;

        double d_11 = d_3;
        if (d_5 > d_3)
            d_11 = d_5;

        if (d_7 > d_11)
            d_11 = d_7;

        double d_13 = 0.0D;
        double d_15 = 0.0D;
        double d_17 = (d_11 + d_9) / 2.0D;
        if (d_9 != d_11) {
            if (d_17 < 0.5D)
                d_15 = (d_11 - d_9) / (d_11 + d_9);

            if (d_17 >= 0.5D)
                d_15 = (d_11 - d_9) / (2.0D - d_11 - d_9);

            if (d_11 == d_3)
                d_13 = (d_5 - d_7) / (d_11 - d_9);
            else if (d_5 == d_11)
                d_13 = (d_7 - d_3) / (d_11 - d_9) + 2.0D;
            else if (d_7 == d_11)
                d_13 = 4.0D + (d_3 - d_5) / (d_11 - d_9);
        }

        d_13 /= 6.0D;
        int593 = (int) (d_13 * 256.0D);
        int589 = (int) (256.0D * d_15);
        int590 = (int) (d_17 * 256.0D);
        if (int589 < 0)
            int589 = 0;
        else if (int589 > 255)
            int589 = 255;

        if (int590 < 0)
            int590 = 0;
        else if (int590 > 255)
            int590 = 255;

    }

    public static void staticMethod433() {
        staticCache31.method264();
    }

}

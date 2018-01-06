public class Underlay extends Cacheable {

    public static Js5Index staticJs5Index30;
    public static Cache staticCache30 = new Cache(64);
    int int581 = 0;
    public int int582;
    public int int583;
    public int int584;
    public int int580;

    void method595() {
        method596(int581);
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
            int581 = buffer_1.method443();

    }

    void method596(int i_1) {
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
        if (d_11 != d_9) {
            if (d_17 < 0.5D)
                d_15 = (d_11 - d_9) / (d_11 + d_9);

            if (d_17 >= 0.5D)
                d_15 = (d_11 - d_9) / (2.0D - d_11 - d_9);

            if (d_3 == d_11)
                d_13 = (d_5 - d_7) / (d_11 - d_9);
            else if (d_11 == d_5)
                d_13 = 2.0D + (d_7 - d_3) / (d_11 - d_9);
            else if (d_11 == d_7)
                d_13 = 4.0D + (d_3 - d_5) / (d_11 - d_9);
        }

        d_13 /= 6.0D;
        int582 = (int) (d_15 * 256.0D);
        int583 = (int) (256.0D * d_17);
        if (int582 < 0)
            int582 = 0;
        else if (int582 > 255)
            int582 = 255;

        if (int583 < 0)
            int583 = 0;
        else if (int583 > 255)
            int583 = 255;

        if (d_17 > 0.5D)
            int584 = (int) (512.0D * d_15 * (1.0D - d_17));
        else
            int584 = (int) (512.0D * d_15 * d_17);

        if (int584 < 1)
            int584 = 1;

        int580 = (int) (int584 * d_13);
    }

}

public class HealthBarType extends Cacheable {

    public static Js5Index staticJs5Index33;
    public int int596;
    public static Js5Index staticJs5Index34;
    public static Cache staticCache33 = new Cache(64);
    public static Cache staticCache34 = new Cache(64);
    public int int595 = 255;
    public int int599 = 255;
    public int int597 = -1;
    public int int600 = 1;
    public int int601 = 70;
    int int602 = -1;
    int int603 = -1;
    public int int604 = 30;
    public int int598 = 0;

    public static HealthBarType staticMethod437(int i_0) {
        HealthBarType healthbartype_2 = (HealthBarType) staticCache33.get(i_0);
        if (healthbartype_2 != null)
            return healthbartype_2;
        else {
            byte[] bytes_3 = staticJs5Index34.getFile(33, i_0);
            healthbartype_2 = new HealthBarType();
            if (bytes_3 != null)
                healthbartype_2.decode(new Buffer(bytes_3));

            staticCache33.put(healthbartype_2, i_0);
            return healthbartype_2;
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
        if (i_2 == 1)
            buffer_1.readUShort();
        else if (i_2 == 2)
            int595 = buffer_1.readUByte();
        else if (i_2 == 3)
            int599 = buffer_1.readUByte();
        else if (i_2 == 4)
            int597 = 0;
        else if (i_2 == 5)
            int601 = buffer_1.readUShort();
        else if (i_2 == 6)
            buffer_1.readUByte();
        else if (i_2 == 7)
            int602 = buffer_1.method455();
        else if (i_2 == 8)
            int603 = buffer_1.method455();
        else if (i_2 == 11)
            int597 = buffer_1.readUShort();
        else if (i_2 == 14)
            int604 = buffer_1.readUByte();
        else if (i_2 == 15)
            int598 = buffer_1.readUByte();

    }

    public Sprite method600() {
        if (int602 < 0)
            return null;
        else {
            Sprite sprite_2 = (Sprite) staticCache34.get(int602);
            if (sprite_2 != null)
                return sprite_2;
            else {
                sprite_2 = StaticClass59.staticMethod233(staticJs5Index33, int602, 0);
                if (sprite_2 != null)
                    staticCache34.put(sprite_2, int602);

                return sprite_2;
            }
        }
    }

    public Sprite method601() {
        if (int603 < 0)
            return null;
        else {
            Sprite sprite_2 = (Sprite) staticCache34.get(int603);
            if (sprite_2 != null)
                return sprite_2;
            else {
                sprite_2 = StaticClass59.staticMethod233(staticJs5Index33, int603, 0);
                if (sprite_2 != null)
                    staticCache34.put(sprite_2, int603);

                return sprite_2;
            }
        }
    }

}

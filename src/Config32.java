public class Config32 extends Cacheable {

    public static Js5Index staticJs5Index24;
    public static Js5Index staticJs5Index25;
    public static Js5Index staticJs5Index26;
    static Cache staticCache21 = new Cache(64);
    static Cache staticCache22 = new Cache(64);
    static Cache staticCache23 = new Cache(20);
    int int565 = -1;
    public int int568 = 16777215;
    public int int560 = 70;
    int int561 = -1;
    int int562 = -1;
    int int563 = -1;
    int int564 = -1;
    public int int572 = 0;
    public int int566 = 0;
    public int int567 = -1;
    String string41 = "";
    public int int571 = -1;
    public int int569 = 0;
    int int570 = -1;
    int int559 = -1;
    public int[] intArray94;

    public static Config32 staticMethod419(int i_0) {
        Config32 config32_2 = (Config32) staticCache21.get(i_0);
        if (config32_2 != null)
            return config32_2;
        else {
            byte[] bytes_3 = staticJs5Index26.getFile(32, i_0);
            config32_2 = new Config32();
            if (bytes_3 != null)
                config32_2.decode(new Buffer(bytes_3));

            staticCache21.put(config32_2, i_0);
            return config32_2;
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
            int565 = buffer_1.method455();
        else if (i_2 == 2)
            int568 = buffer_1.method443();
        else if (i_2 == 3)
            int561 = buffer_1.method455();
        else if (i_2 == 4)
            int563 = buffer_1.method455();
        else if (i_2 == 5)
            int562 = buffer_1.method455();
        else if (i_2 == 6)
            int564 = buffer_1.method455();
        else if (i_2 == 7)
            int572 = buffer_1.readShort();
        else if (i_2 == 8)
            string41 = buffer_1.method449();
        else if (i_2 == 9)
            int560 = buffer_1.readUShort();
        else if (i_2 == 10)
            int566 = buffer_1.readShort();
        else if (i_2 == 11)
            int567 = 0;
        else if (i_2 == 12)
            int571 = buffer_1.readUByte();
        else if (i_2 == 13)
            int569 = buffer_1.readShort();
        else if (i_2 == 14)
            int567 = buffer_1.readUShort();
        else if (i_2 == 17 || i_2 == 18) {
            int570 = buffer_1.readUShort();
            if (int570 == 65535)
                int570 = -1;

            int559 = buffer_1.readUShort();
            if (int559 == 65535)
                int559 = -1;

            int i_4 = -1;
            if (i_2 == 18) {
                i_4 = buffer_1.readUShort();
                if (i_4 == 65535)
                    i_4 = -1;
            }

            int i_5 = buffer_1.readUByte();
            intArray94 = new int[i_5 + 2];

            for (int i_6 = 0; i_6 <= i_5; i_6++) {
                intArray94[i_6] = buffer_1.readUShort();
                if (intArray94[i_6] == 65535)
                    intArray94[i_6] = -1;
            }

            intArray94[i_5 + 1] = i_4;
        }

    }

    public final Config32 method577() {
        int i_2 = -1;
        if (int570 != -1)
            i_2 = StaticClass44.staticMethod183(int570);
        else if (int559 != -1)
            i_2 = StaticClass44.staticIntArray68[int559];

        int i_3;
        if (i_2 >= 0 && i_2 < intArray94.length - 1)
            i_3 = intArray94[i_2];
        else
            i_3 = intArray94[intArray94.length - 1];

        return i_3 != -1 ? staticMethod419(i_3) : null;
    }

    public String method578(int i_1) {
        String string_3 = string41;

        while (true) {
            int i_4 = string_3.indexOf("%1");
            if (i_4 < 0)
                return string_3;

            String string_5 = string_3.substring(0, i_4);
            String string_6 = Integer.toString(i_1);
            string_3 = string_5 + string_6 + string_3.substring(i_4 + 2);
        }
    }

    public Sprite method579() {
        if (int561 < 0)
            return null;
        else {
            Sprite sprite_2 = (Sprite) staticCache22.get(int561);
            if (sprite_2 != null)
                return sprite_2;
            else {
                sprite_2 = StaticClass59.staticMethod233(staticJs5Index24, int561, 0);
                if (sprite_2 != null)
                    staticCache22.put(sprite_2, int561);

                return sprite_2;
            }
        }
    }

    public Sprite method580() {
        if (int562 < 0)
            return null;
        else {
            Sprite sprite_2 = (Sprite) staticCache22.get(int562);
            if (sprite_2 != null)
                return sprite_2;
            else {
                sprite_2 = StaticClass59.staticMethod233(staticJs5Index24, int562, 0);
                if (sprite_2 != null)
                    staticCache22.put(sprite_2, int562);

                return sprite_2;
            }
        }
    }

    public Sprite method581() {
        if (int563 < 0)
            return null;
        else {
            Sprite sprite_2 = (Sprite) staticCache22.get(int563);
            if (sprite_2 != null)
                return sprite_2;
            else {
                sprite_2 = StaticClass59.staticMethod233(staticJs5Index24, int563, 0);
                if (sprite_2 != null)
                    staticCache22.put(sprite_2, int563);

                return sprite_2;
            }
        }
    }

    public Sprite method582() {
        if (int564 < 0)
            return null;
        else {
            Sprite sprite_2 = (Sprite) staticCache22.get(int564);
            if (sprite_2 != null)
                return sprite_2;
            else {
                sprite_2 = StaticClass59.staticMethod233(staticJs5Index24, int564, 0);
                if (sprite_2 != null)
                    staticCache22.put(sprite_2, int564);

                return sprite_2;
            }
        }
    }

    public FontFace method583() {
        if (int565 == -1)
            return null;
        else {
            FontFace fontface_2 = (FontFace) staticCache23.get(int565);
            if (fontface_2 != null)
                return fontface_2;
            else {
                Js5Index js5index_4 = staticJs5Index24;
                Js5Index js5index_5 = staticJs5Index25;
                int i_6 = int565;
                FontFace fontface_3;
                if (!StaticClass59.staticMethod242(js5index_4, i_6, 0))
                    fontface_3 = null;
                else {
                    byte[] bytes_8 = js5index_5.getFile(i_6, 0);
                    FontFace fontface_7;
                    if (bytes_8 == null)
                        fontface_7 = null;
                    else {
                        FontFace fontface_9 = new FontFace(bytes_8, StaticClass59.staticIntArray74, World.staticIntArray17, Js5Worker.staticIntArray70, Js5CacheWriteRequest.staticIntArray127, StaticClass18.staticIntArray58, Mus5Sub4.staticByteArrayArray6);
                        StaticClass59.staticMethod245();
                        fontface_7 = fontface_9;
                    }

                    fontface_3 = fontface_7;
                }

                if (fontface_3 != null)
                    staticCache23.put(fontface_3, int565);

                return fontface_3;
            }
        }
    }

    public static void staticMethod420() {
        staticCache21.method264();
        staticCache22.method264();
        staticCache23.method264();
    }

}

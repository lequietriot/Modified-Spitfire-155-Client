
public class StaticClass59 {

    public static int[] staticIntArray74;
    static int staticInt151;

    StaticClass59() throws Throwable {
        throw new Error();
    }

    static IndexedSprite staticMethod232(Js5Index js5index_0, int i_1, int i_2) {
        return !staticMethod242(js5index_0, i_1, i_2) ? null : staticMethod239();
    }

    public static Sprite staticMethod233(Js5Index js5index_0, int i_1, int i_2) {
        return !staticMethod242(js5index_0, i_1, i_2) ? null : staticMethod241();
    }

    public static IndexedSprite[] staticMethod234(Js5Index js5index_0, String string_1, String string_2) {
        int i_4 = js5index_0.indexOf(string_1);
        int i_5 = js5index_0.indexOf(i_4, string_2);
        IndexedSprite[] arr_6;
        if (!staticMethod242(js5index_0, i_4, i_5))
            arr_6 = null;
        else {
            IndexedSprite[] arr_8 = new IndexedSprite[ExchangeOfferComparator1.staticInt119];

            for (int i_9 = 0; i_9 < ExchangeOfferComparator1.staticInt119; i_9++) {
                IndexedSprite indexedsprite_10 = arr_8[i_9] = new IndexedSprite();
                indexedsprite_10.int677 = staticInt151;
                indexedsprite_10.int678 = StaticClass24.staticInt130;
                indexedsprite_10.xoffset = staticIntArray74[i_9];
                indexedsprite_10.yoffset = World.staticIntArray17[i_9];
                indexedsprite_10.width = Js5Worker.staticIntArray70[i_9];
                indexedsprite_10.height = Js5CacheWriteRequest.staticIntArray127[i_9];
                indexedsprite_10.intArray115 = StaticClass18.staticIntArray58;
                indexedsprite_10.indices = Mus5Sub4.staticByteArrayArray6[i_9];
            }

            staticMethod245();
            arr_6 = arr_8;
        }

        return arr_6;
    }

    public static IndexedSprite staticMethod235(Js5Index js5index_0, String string_1, String string_2) {
        int i_4 = js5index_0.indexOf(string_1);
        int i_5 = js5index_0.indexOf(i_4, string_2);
        return staticMethod232(js5index_0, i_4, i_5);
    }

    public static Sprite[] staticMethod236(Js5Index js5index_0, String string_1, String string_2) {
        int i_4 = js5index_0.indexOf(string_1);
        int i_5 = js5index_0.indexOf(i_4, string_2);
        Sprite[] arr_6;
        if (!staticMethod242(js5index_0, i_4, i_5))
            arr_6 = null;
        else
            arr_6 = staticMethod240();

        return arr_6;
    }

    public static Sprite staticMethod237(Js5Index js5index_0, String string_1, String string_2) {
        int i_4 = js5index_0.indexOf(string_1);
        int i_5 = js5index_0.indexOf(i_4, string_2);
        return staticMethod233(js5index_0, i_4, i_5);
    }

    public static FontFace staticMethod238(Js5Index js5index_0, Js5Index js5index_1, String string_2, String string_3) {
        int i_5 = js5index_0.indexOf(string_2);
        int i_6 = js5index_0.indexOf(i_5, string_3);
        FontFace fontface_7;
        if (!staticMethod242(js5index_0, i_5, i_6))
            fontface_7 = null;
        else {
            byte[] bytes_9 = js5index_1.getFile(i_5, i_6);
            FontFace fontface_8;
            if (bytes_9 == null)
                fontface_8 = null;
            else {
                FontFace fontface_10 = new FontFace(bytes_9, staticIntArray74, World.staticIntArray17, Js5Worker.staticIntArray70, Js5CacheWriteRequest.staticIntArray127, StaticClass18.staticIntArray58, Mus5Sub4.staticByteArrayArray6);
                staticMethod245();
                fontface_8 = fontface_10;
            }

            fontface_7 = fontface_8;
        }

        return fontface_7;
    }

    public static IndexedSprite staticMethod239() {
        IndexedSprite indexedsprite_1 = new IndexedSprite();
        indexedsprite_1.int677 = staticInt151;
        indexedsprite_1.int678 = StaticClass24.staticInt130;
        indexedsprite_1.xoffset = staticIntArray74[0];
        indexedsprite_1.yoffset = World.staticIntArray17[0];
        indexedsprite_1.width = Js5Worker.staticIntArray70[0];
        indexedsprite_1.height = Js5CacheWriteRequest.staticIntArray127[0];
        indexedsprite_1.intArray115 = StaticClass18.staticIntArray58;
        indexedsprite_1.indices = Mus5Sub4.staticByteArrayArray6[0];
        staticMethod245();
        return indexedsprite_1;
    }

    static Sprite[] staticMethod240() {
        Sprite[] arr_1 = new Sprite[ExchangeOfferComparator1.staticInt119];

        for (int i_2 = 0; i_2 < ExchangeOfferComparator1.staticInt119; i_2++) {
            Sprite sprite_3 = arr_1[i_2] = new Sprite();
            sprite_3.newWidth = staticInt151;
            sprite_3.newHeight = StaticClass24.staticInt130;
            sprite_3.xoffset = staticIntArray74[i_2];
            sprite_3.yoffset = World.staticIntArray17[i_2];
            sprite_3.width = Js5Worker.staticIntArray70[i_2];
            sprite_3.height = Js5CacheWriteRequest.staticIntArray127[i_2];
            int i_4 = sprite_3.width * sprite_3.height;
            byte[] bytes_5 = Mus5Sub4.staticByteArrayArray6[i_2];
            sprite_3.pixels = new int[i_4];

            for (int i_6 = 0; i_6 < i_4; i_6++)
                sprite_3.pixels[i_6] = StaticClass18.staticIntArray58[bytes_5[i_6] & 0xff];
        }

        staticMethod245();
        return arr_1;
    }

    static Sprite staticMethod241() {
        Sprite sprite_1 = new Sprite();
        sprite_1.newWidth = staticInt151;
        sprite_1.newHeight = StaticClass24.staticInt130;
        sprite_1.xoffset = staticIntArray74[0];
        sprite_1.yoffset = World.staticIntArray17[0];
        sprite_1.width = Js5Worker.staticIntArray70[0];
        sprite_1.height = Js5CacheWriteRequest.staticIntArray127[0];
        int i_2 = sprite_1.height * sprite_1.width;
        byte[] bytes_3 = Mus5Sub4.staticByteArrayArray6[0];
        sprite_1.pixels = new int[i_2];

        for (int i_4 = 0; i_4 < i_2; i_4++)
            sprite_1.pixels[i_4] = StaticClass18.staticIntArray58[bytes_3[i_4] & 0xff];

        staticMethod245();
        return sprite_1;
    }

    public static boolean staticMethod242(Js5Index js5index_0, int i_1, int i_2) {
        byte[] bytes_4 = js5index_0.getFile(i_1, i_2);
        if (bytes_4 == null)
            return false;
        else {
            staticMethod244(bytes_4);
            return true;
        }
    }

    public static boolean staticMethod243(Js5Index js5index_0, int i_1) {
        byte[] bytes_3 = js5index_0.getFile(i_1);
        if (bytes_3 == null)
            return false;
        else {
            staticMethod244(bytes_3);
            return true;
        }
    }

    static void staticMethod244(byte[] bytes_0) {
        Buffer buffer_2 = new Buffer(bytes_0);
        buffer_2.off = bytes_0.length - 2;
        ExchangeOfferComparator1.staticInt119 = buffer_2.readUShort();
        staticIntArray74 = new int[ExchangeOfferComparator1.staticInt119];
        World.staticIntArray17 = new int[ExchangeOfferComparator1.staticInt119];
        Js5Worker.staticIntArray70 = new int[ExchangeOfferComparator1.staticInt119];
        Js5CacheWriteRequest.staticIntArray127 = new int[ExchangeOfferComparator1.staticInt119];
        Mus5Sub4.staticByteArrayArray6 = new byte[ExchangeOfferComparator1.staticInt119][];
        buffer_2.off = bytes_0.length - 7 - ExchangeOfferComparator1.staticInt119 * 8;
        staticInt151 = buffer_2.readUShort();
        StaticClass24.staticInt130 = buffer_2.readUShort();
        int i_3 = (buffer_2.readUByte() & 0xff) + 1;

        int i_4;
        for (i_4 = 0; i_4 < ExchangeOfferComparator1.staticInt119; i_4++)
            staticIntArray74[i_4] = buffer_2.readUShort();

        for (i_4 = 0; i_4 < ExchangeOfferComparator1.staticInt119; i_4++)
            World.staticIntArray17[i_4] = buffer_2.readUShort();

        for (i_4 = 0; i_4 < ExchangeOfferComparator1.staticInt119; i_4++)
            Js5Worker.staticIntArray70[i_4] = buffer_2.readUShort();

        for (i_4 = 0; i_4 < ExchangeOfferComparator1.staticInt119; i_4++)
            Js5CacheWriteRequest.staticIntArray127[i_4] = buffer_2.readUShort();

        buffer_2.off = bytes_0.length - 7 - ExchangeOfferComparator1.staticInt119 * 8 - (i_3 - 1) * 3;
        StaticClass18.staticIntArray58 = new int[i_3];

        for (i_4 = 1; i_4 < i_3; i_4++) {
            StaticClass18.staticIntArray58[i_4] = buffer_2.method443();
            if (StaticClass18.staticIntArray58[i_4] == 0)
                StaticClass18.staticIntArray58[i_4] = 1;
        }

        buffer_2.off = 0;

        for (i_4 = 0; i_4 < ExchangeOfferComparator1.staticInt119; i_4++) {
            int i_5 = Js5Worker.staticIntArray70[i_4];
            int i_6 = Js5CacheWriteRequest.staticIntArray127[i_4];
            int i_7 = i_5 * i_6;
            byte[] bytes_8 = new byte[i_7];
            Mus5Sub4.staticByteArrayArray6[i_4] = bytes_8;
            int i_9 = buffer_2.readUByte();
            int i_10;
            if (i_9 == 0)
                for (i_10 = 0; i_10 < i_7; i_10++)
                    bytes_8[i_10] = buffer_2.method440();
            else if (i_9 == 1)
                for (i_10 = 0; i_10 < i_5; i_10++)
                    for (int i_11 = 0; i_11 < i_6; i_11++)
                        bytes_8[i_10 + i_5 * i_11] = buffer_2.method440();
        }

    }

    public static void staticMethod245() {
        staticIntArray74 = null;
        World.staticIntArray17 = null;
        Js5Worker.staticIntArray70 = null;
        Js5CacheWriteRequest.staticIntArray127 = null;
        StaticClass18.staticIntArray58 = null;
        Mus5Sub4.staticByteArrayArray6 = null;
    }

}

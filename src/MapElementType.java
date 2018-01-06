
public class MapElementType extends Cacheable {

    static Cache staticCache14 = new Cache(256);
    public int spriteId = -1;
    int unused1 = -1;
    public int fontsize = 0;
    public String[] stupidoptions = new String[5];
    int min1 = Integer.MAX_VALUE;
    int min2 = Integer.MAX_VALUE;
    int max1 = Integer.MIN_VALUE;
    int max2 = Integer.MIN_VALUE;
    public WMUselessEnum1 wMUselessEnum1_1;
    public WMUselessEnum2 wMUselessEnum2_1;
    public int int548;
    public final int int547;
    static Js5Index staticJs5Index16;
    static int staticInt307;
    public String text;
    public int textcolor;
    int[] unused2;
    public String stupidname;
    int[] unused3;
    byte[] unused4;

    MapElementType(int i_1) {
        wMUselessEnum1_1 = WMUselessEnum1.staticWMUselessEnum1_1;
        wMUselessEnum2_1 = WMUselessEnum2.staticWMUselessEnum2_3;
        int548 = -1;
        int547 = i_1;
    }

    public static boolean staticMethod414(Js5Index js5index_0, Js5Index js5index_1) {
        staticJs5Index16 = js5index_1;
        if (!js5index_0.loaded())
            return false;
        else {
            staticInt307 = js5index_0.numFiles(35);
            DataClass13.staticMapElementTypeArray1 = new MapElementType[staticInt307];

            for (int i_3 = 0; i_3 < staticInt307; i_3++) {
                byte[] bytes_4 = js5index_0.getFile(35, i_3);
                if (bytes_4 != null) {
                    DataClass13.staticMapElementTypeArray1[i_3] = new MapElementType(i_3);
                    DataClass13.staticMapElementTypeArray1[i_3].decode(new Buffer(bytes_4));
                    DataClass13.staticMapElementTypeArray1[i_3].method570();
                }
            }

            return true;
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
            spriteId = buffer_1.method455();
        else if (i_2 == 2)
            unused1 = buffer_1.method455();
        else if (i_2 == 3)
            text = buffer_1.method448();
        else if (i_2 == 4)
            textcolor = buffer_1.method443();
        else if (i_2 == 5)
            buffer_1.method443();
        else if (i_2 == 6)
            fontsize = buffer_1.readUByte();
        else {
            int i_4;
            if (i_2 == 7) {
                i_4 = buffer_1.readUByte();
                if ((i_4 & 0x1) == 0)
                    ;

                if ((i_4 & 0x2) == 2)
                    ;
            } else if (i_2 == 8)
                buffer_1.readUByte();
            else if (i_2 >= 10 && i_2 <= 14)
                stupidoptions[i_2 - 10] = buffer_1.method448();
            else if (i_2 == 15) {
                i_4 = buffer_1.readUByte();
                unused2 = new int[i_4 * 2];

                int i_5;
                for (i_5 = 0; i_5 < i_4 * 2; i_5++)
                    unused2[i_5] = buffer_1.readShort();

                buffer_1.readInt();
                i_5 = buffer_1.readUByte();
                unused3 = new int[i_5];

                int i_6;
                for (i_6 = 0; i_6 < unused3.length; i_6++)
                    unused3[i_6] = buffer_1.readInt();

                unused4 = new byte[i_4];

                for (i_6 = 0; i_6 < i_4; i_6++)
                    unused4[i_6] = buffer_1.method440();
            } else if (i_2 != 16)
                if (i_2 == 17)
                    stupidname = buffer_1.method448();
                else if (i_2 == 18)
                    buffer_1.method455();
                else if (i_2 == 19)
                    int548 = buffer_1.readUShort();
                else if (i_2 == 21)
                    buffer_1.readInt();
                else if (i_2 == 22)
                    buffer_1.readInt();
                else if (i_2 == 23) {
                    buffer_1.readUByte();
                    buffer_1.readUByte();
                    buffer_1.readUByte();
                } else if (i_2 == 24) {
                    buffer_1.readShort();
                    buffer_1.readShort();
                } else if (i_2 == 25)
                    buffer_1.method455();
                else if (i_2 == 28)
                    buffer_1.readUByte();
                else if (i_2 == 29) {
                    WMUselessEnum1[] arr_7 = new WMUselessEnum1[] { WMUselessEnum1.staticWMUselessEnum1_3, WMUselessEnum1.staticWMUselessEnum1_1, WMUselessEnum1.staticWMUselessEnum1_2 };
                    wMUselessEnum1_1 = (WMUselessEnum1) StaticClass26.staticMethod155(arr_7, buffer_1.readUByte());
                } else if (i_2 == 30)
                    wMUselessEnum2_1 = (WMUselessEnum2) StaticClass26.staticMethod155(WMUselessEnum2.staticMethod199(), buffer_1.readUByte());
        }

    }

    void method570() {
        if (unused2 != null)
            for (int i_2 = 0; i_2 < unused2.length; i_2 += 2) {
                if (unused2[i_2] < min1)
                    min1 = unused2[i_2];
                else if (unused2[i_2] > max1)
                    max1 = unused2[i_2];

                if (unused2[i_2 + 1] < min2)
                    min2 = unused2[i_2 + 1];
                else if (unused2[i_2 + 1] > max2)
                    max2 = unused2[i_2 + 1];
            }

    }

    public Sprite getPOISprite(boolean bool_1) {
        int i_3 = bool_1 ? unused1 : spriteId;
        return loadSprite(i_3);
    }

    Sprite loadSprite(int i_1) {
        if (i_1 < 0)
            return null;
        else {
            Sprite sprite_3 = (Sprite) staticCache14.get(i_1);
            if (sprite_3 != null)
                return sprite_3;
            else {
                sprite_3 = StaticClass59.staticMethod233(staticJs5Index16, i_1, 0);
                if (sprite_3 != null)
                    staticCache14.put(sprite_3, i_1);

                return sprite_3;
            }
        }
    }

    public int method571() {
        return int547;
    }

    public static void staticMethod415() {
        staticCache14.method264();
    }

}

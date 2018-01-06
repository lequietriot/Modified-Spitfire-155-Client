import java.awt.Image;

public class Class2 implements WMUnknown {

    protected static int staticInt16;
    static Widget staticWidget2;
    static Image staticImage1;
    static int staticInt17;
    int int70;
    int int67;
    int int75;
    int int72;
    int int69;
    int int71;
    int int68;
    int int73;
    int int74;
    int int66;

    @Override
    public void method1(WorldMapAreaDescriptor worldmapareadescriptor_1) {
        if (worldmapareadescriptor_1.int62 > int68)
            worldmapareadescriptor_1.int62 = int68;

        if (worldmapareadescriptor_1.int63 < int68)
            worldmapareadescriptor_1.int63 = int68;

        if (worldmapareadescriptor_1.int64 > int74)
            worldmapareadescriptor_1.int64 = int74;

        if (worldmapareadescriptor_1.int65 < int74)
            worldmapareadescriptor_1.int65 = int74;

    }

    @Override
    public boolean method2(int i_1, int i_2, int i_3) {
        return i_1 >= int70 && i_1 < int67 + int70 ? i_2 >= (int72 << 3) + (int75 << 6) && i_2 <= (int72 << 3) + (int75 << 6) + 7 && i_3 >= (int71 << 3) + (int69 << 6) && i_3 <= 7 + (int71 << 3) + (int69 << 6) : false;
    }

    @Override
    public boolean method3(int i_1, int i_2) {
        return i_1 >= (int68 << 6) + (int73 << 3) && i_1 <= 7 + (int73 << 3) + (int68 << 6) && i_2 >= (int74 << 6) + (int66 << 3) && i_2 <= (int74 << 6) + (int66 << 3) + 7;
    }

    @Override
    public int[] method4(int i_1, int i_2, int i_3) {
        if (!method2(i_1, i_2, i_3))
            return null;
        else {
            int[] ints_5 = new int[] { i_2 + int68 * 64 - int75 * 64 + int73 * 8 - int72 * 8, int66 * 8 - int71 * 8 + i_3 + int74 * 64 - int69 * 64 };
            return ints_5;
        }
    }

    @Override
    public WorldMapCoord method5(int i_1, int i_2) {
        if (!method3(i_1, i_2))
            return null;
        else {
            int i_4 = int75 * 64 - int68 * 64 + i_1 + int72 * 8 - int73 * 8;
            int i_5 = i_2 + int69 * 64 - int74 * 64 + int71 * 8 - int66 * 8;
            return new WorldMapCoord(int70, i_4, i_5);
        }
    }

    @Override
    public void method6(Buffer buffer_1) {
        int70 = buffer_1.readUByte();
        int67 = buffer_1.readUByte();
        int75 = buffer_1.readUShort();
        int72 = buffer_1.readUByte();
        int69 = buffer_1.readUShort();
        int71 = buffer_1.readUByte();
        int68 = buffer_1.readUShort();
        int73 = buffer_1.readUByte();
        int74 = buffer_1.readUShort();
        int66 = buffer_1.readUByte();
        method81();
    }

    void method81() {
    }

}

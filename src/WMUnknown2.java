public class WMUnknown2 implements WMUnknown {

    static int staticInt12;
    int int48;
    int int49;
    int int45;
    int int46;
    int int47;
    int int44;

    @Override
    public void method1(WorldMapAreaDescriptor worldmapareadescriptor_1) {
        if (worldmapareadescriptor_1.int62 > int47)
            worldmapareadescriptor_1.int62 = int47;

        if (worldmapareadescriptor_1.int63 < int47)
            worldmapareadescriptor_1.int63 = int47;

        if (worldmapareadescriptor_1.int64 > int44)
            worldmapareadescriptor_1.int64 = int44;

        if (worldmapareadescriptor_1.int65 < int44)
            worldmapareadescriptor_1.int65 = int44;

    }

    @Override
    public boolean method2(int i_1, int i_2, int i_3) {
        return i_1 >= int48 && i_1 < int49 + int48 ? int45 == i_2 >> 6 && int46 == i_3 >> 6 : false;
    }

    @Override
    public boolean method3(int i_1, int i_2) {
        return int47 == i_1 >> 6 && int44 == i_2 >> 6;
    }

    @Override
    public int[] method4(int i_1, int i_2, int i_3) {
        if (!method2(i_1, i_2, i_3))
            return null;
        else {
            int[] ints_5 = new int[] { i_2 + int47 * 64 - int45 * 64, int44 * 64 - int46 * 64 + i_3 };
            return ints_5;
        }
    }

    @Override
    public WorldMapCoord method5(int i_1, int i_2) {
        if (!method3(i_1, i_2))
            return null;
        else {
            int i_4 = i_1 + int45 * 64 - int47 * 64;
            int i_5 = int46 * 64 - int44 * 64 + i_2;
            return new WorldMapCoord(int48, i_4, i_5);
        }
    }

    @Override
    public void method6(Buffer buffer_1) {
        int48 = buffer_1.readUByte();
        int49 = buffer_1.readUByte();
        int45 = buffer_1.readUShort();
        int46 = buffer_1.readUShort();
        int47 = buffer_1.readUShort();
        int44 = buffer_1.readUShort();
        method23();
    }

    void method23() {
    }

}

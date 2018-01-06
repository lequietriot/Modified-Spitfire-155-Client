public class Class1 implements WMUnknown {

    static ClanMember[] staticClanMemberArray1;
    static int staticInt3;
    int int10;
    int int15;
    int int11;
    int int7;
    int int9;
    int int6;
    int int14;
    int int12;
    int int13;
    int int8;

    @Override
    public void method1(WorldMapAreaDescriptor worldmapareadescriptor_1) {
        if (worldmapareadescriptor_1.int62 > int14)
            worldmapareadescriptor_1.int62 = int14;

        if (worldmapareadescriptor_1.int63 < int13)
            worldmapareadescriptor_1.int63 = int13;

        if (worldmapareadescriptor_1.int64 > int12)
            worldmapareadescriptor_1.int64 = int12;

        if (worldmapareadescriptor_1.int65 < int8)
            worldmapareadescriptor_1.int65 = int8;

    }

    @Override
    public boolean method2(int i_1, int i_2, int i_3) {
        return i_1 >= int10 && i_1 < int15 + int10 ? i_2 >> 6 >= int11 && i_2 >> 6 <= int9 && i_3 >> 6 >= int7 && i_3 >> 6 <= int6 : false;
    }

    @Override
    public boolean method3(int i_1, int i_2) {
        return i_1 >> 6 >= int14 && i_1 >> 6 <= int13 && i_2 >> 6 >= int12 && i_2 >> 6 <= int8;
    }

    @Override
    public int[] method4(int i_1, int i_2, int i_3) {
        if (!method2(i_1, i_2, i_3))
            return null;
        else {
            int[] ints_5 = new int[] { i_2 + int14 * 64 - int11 * 64, int12 * 64 - int7 * 64 + i_3 };
            return ints_5;
        }
    }

    @Override
    public WorldMapCoord method5(int i_1, int i_2) {
        if (!method3(i_1, i_2))
            return null;
        else {
            int i_4 = int11 * 64 - int14 * 64 + i_1;
            int i_5 = int7 * 64 - int12 * 64 + i_2;
            return new WorldMapCoord(int10, i_4, i_5);
        }
    }

    @Override
    public void method6(Buffer buffer_1) {
        int10 = buffer_1.readUByte();
        int15 = buffer_1.readUByte();
        int11 = buffer_1.readUShort();
        int7 = buffer_1.readUShort();
        int9 = buffer_1.readUShort();
        int6 = buffer_1.readUShort();
        int14 = buffer_1.readUShort();
        int12 = buffer_1.readUShort();
        int13 = buffer_1.readUShort();
        int8 = buffer_1.readUShort();
        method7();
    }

    void method7() {
    }

}

public class WMUnknown3 implements WMUnknown {

    static ComputerInfo staticComputerInfo1;
    static WheelRotationProvider staticWheelRotationProvider1;
    static int staticInt4;
    int int25;
    int int16;
    int int27;
    int int29;
    int int21;
    int int18;
    int int17;
    int int22;
    int int20;
    int int23;
    int int28;
    int int19;
    int int24;
    int int26;

    @Override
    public void method1(WorldMapAreaDescriptor worldmapareadescriptor_1) {
        if (worldmapareadescriptor_1.int62 > int20)
            worldmapareadescriptor_1.int62 = int20;

        if (worldmapareadescriptor_1.int63 < int20)
            worldmapareadescriptor_1.int63 = int20;

        if (worldmapareadescriptor_1.int64 > int19)
            worldmapareadescriptor_1.int64 = int19;

        if (worldmapareadescriptor_1.int65 < int19)
            worldmapareadescriptor_1.int65 = int19;

    }

    @Override
    public boolean method2(int i_1, int i_2, int i_3) {
        return i_1 >= int25 && i_1 < int25 + int16 ? i_2 >= (int29 << 3) + (int27 << 6) && i_2 <= 7 + (int27 << 6) + (int21 << 3) && i_3 >= (int17 << 3) + (int18 << 6) && i_3 <= 7 + (int18 << 6) + (int22 << 3) : false;
    }

    @Override
    public boolean method3(int i_1, int i_2) {
        return i_1 >= (int20 << 6) + (int23 << 3) && i_1 <= (int20 << 6) + (int28 << 3) + 7 && i_2 >= (int24 << 3) + (int19 << 6) && i_2 <= (int19 << 6) + (int26 << 3) + 7;
    }

    @Override
    public int[] method4(int i_1, int i_2, int i_3) {
        if (!method2(i_1, i_2, i_3))
            return null;
        else {
            int[] ints_5 = new int[] { int23 * 8 - int29 * 8 + int20 * 64 - int27 * 64 + i_2, int24 * 8 - int17 * 8 + i_3 + int19 * 64 - int18 * 64 };
            return ints_5;
        }
    }

    @Override
    public WorldMapCoord method5(int i_1, int i_2) {
        if (!method3(i_1, i_2))
            return null;
        else {
            int i_4 = int27 * 64 - int20 * 64 + i_1 + int29 * 8 - int23 * 8;
            int i_5 = int17 * 8 - int24 * 8 + i_2 + int18 * 64 - int19 * 64;
            return new WorldMapCoord(int25, i_4, i_5);
        }
    }

    @Override
    public void method6(Buffer buffer_1) {
        int25 = buffer_1.readUByte();
        int16 = buffer_1.readUByte();
        int27 = buffer_1.readUShort();
        int29 = buffer_1.readUByte();
        int21 = buffer_1.readUByte();
        int18 = buffer_1.readUShort();
        int17 = buffer_1.readUByte();
        int22 = buffer_1.readUByte();
        int20 = buffer_1.readUShort();
        int23 = buffer_1.readUByte();
        int28 = buffer_1.readUByte();
        int19 = buffer_1.readUShort();
        int24 = buffer_1.readUByte();
        int26 = buffer_1.readUByte();
        method8();
    }

    void method8() {
    }

}

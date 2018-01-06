
public class StaticClass29 {

    public static boolean staticBool20 = false;
    public static boolean staticBool19 = false;
    public static boolean staticBool21 = false;
    public static DataClass12 staticDataClass12_1;
    public static HitMarkList staticHitMarkList1;

    static {
        staticDataClass12_1 = DataClass12.staticDataClass12_3;
        staticHitMarkList1 = new HitMarkList();
    }

    StaticClass29() throws Throwable {
        throw new Error();
    }

    public static final void staticMethod156(Model model_0, int i_1) {
        for (int i_3 = 0; i_3 < model_0.triangleCount; i_3++)
            if (model_0.texZ[i_3] != -2) {
                int i_4 = model_0.triangleA[i_3];
                int i_5 = model_0.triangleB[i_3];
                int i_6 = model_0.triangleC[i_3];
                int i_7 = Model.staticIntArray139[i_4];
                int i_8 = Model.staticIntArray139[i_5];
                int i_9 = Model.staticIntArray139[i_6];
                staticMethod157(Model.staticIntArray140[i_4], Model.staticIntArray140[i_5], Model.staticIntArray140[i_6], i_7, i_8, i_9, i_1);
            }

    }

    static final void staticMethod157(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        int i_8 = Math.min(i_3, Math.min(i_4, i_5)) - i_6;
        int i_9 = Math.max(i_3, Math.max(i_4, i_5)) + i_6;
        int i_10 = Math.min(i_0, Math.min(i_1, i_2)) - i_6;
        int i_11 = Math.max(i_0, Math.max(i_1, i_2)) + i_6;
        staticMethod159(i_8, i_10, i_9, i_11, -49088);
    }

    public static final void staticMethod158(Model model_0, int i_1, int i_2, int i_3, int i_4) {
        staticHitMarkList1.add(new AABBClickboxDebug(model_0, i_1, i_2, i_3, i_4));
    }

    public static final void staticMethod159(int i_0, int i_1, int i_2, int i_3, int i_4) {
        staticHitMarkList1.add(new LegacyClickboxDebug(i_0, i_1, i_2, i_3, i_4));
    }

}

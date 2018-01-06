
public final class NodeSub3 extends Node {

    int int335;
    int int336;
    SampledSound sampledSound2;
    int int337;
    int int340;
    int int343;
    LocType locType1;
    int int344;
    static Deque staticDeque10 = new Deque();
    int int339;
    int int338;
    int int341;
    int int342;
    int[] intArray43;
    SampledSound sampledSound1;

    static void staticMethod367() {
        for (NodeSub3 nodesub3_1 = (NodeSub3) staticDeque10.method257(); nodesub3_1 != null; nodesub3_1 = (NodeSub3) staticDeque10.method259())
            if (nodesub3_1.locType1 != null)
                nodesub3_1.method410();

    }

    void method410() {
        int i_2 = int339;
        LocType loctype_3 = locType1.method563();
        if (loctype_3 != null) {
            int339 = loctype_3.int534;
            int338 = loctype_3.int535 * 128;
            int341 = loctype_3.int516;
            int342 = loctype_3.int525;
            intArray43 = loctype_3.intArray87;
        } else {
            int339 = -1;
            int338 = 0;
            int341 = 0;
            int342 = 0;
            intArray43 = null;
        }

        if (i_2 != int339 && sampledSound1 != null) {
            HealthBar.staticSequenceSub1_1.synchronizedMethod9(sampledSound1);
            sampledSound1 = null;
        }

    }

}

public class RenderableSub1 extends Renderable {

    int objectId;
    int int643;
    int int648;
    int int642;
    int int645;
    int int646;
    SeqType seqType1;
    int int647;
    int int644;

    RenderableSub1(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, boolean bool_8, Renderable renderable_9) {
        objectId = i_1;
        int643 = i_2;
        int648 = i_3;
        int642 = i_4;
        int645 = i_5;
        int646 = i_6;
        if (i_7 != -1) {
            seqType1 = SeqType.staticMethod438(i_7);
            int647 = 0;
            int644 = Client.staticInt166 - 1;
            if (seqType1.delayType == 0 && renderable_9 != null && renderable_9 instanceof RenderableSub1) {
                RenderableSub1 renderablesub1_10 = (RenderableSub1) renderable_9;
                if (renderablesub1_10.seqType1 == seqType1) {
                    int647 = renderablesub1_10.int647;
                    int644 = renderablesub1_10.int644;
                    return;
                }
            }

            if (bool_8 && seqType1.frameStep != -1) {
                int647 = (int) (Math.random() * seqType1.frameIds.length);
                int644 -= (int) (Math.random() * seqType1.frameLengths[int647]);
            }
        }

    }

    @Override
    protected final Model getModel() {
        if (seqType1 != null) {
            int i_2 = Client.staticInt166 - int644;
            if (i_2 > 100 && seqType1.frameStep > 0)
                i_2 = 100;

            label47: {
                do {
                    do {
                        if (i_2 <= seqType1.frameLengths[int647])
                            break label47;

                        i_2 -= seqType1.frameLengths[int647];
                        ++int647;
                    } while (int647 < seqType1.frameIds.length);

                    int647 -= seqType1.frameStep;
                } while (int647 >= 0 && int647 < seqType1.frameIds.length);

                seqType1 = null;
            }

            int644 = Client.staticInt166 - i_2;
        }

        LocType loctype_13 = LocType.staticMethod411(objectId);
        if (loctype_13.intArray86 != null)
            loctype_13 = loctype_13.method563();

        if (loctype_13 == null)
            return null;
        else {
            int i_3;
            int i_4;
            if (int648 != 1 && int648 != 3) {
                i_3 = loctype_13.int518;
                i_4 = loctype_13.int519;
            } else {
                i_3 = loctype_13.int519;
                i_4 = loctype_13.int518;
            }

            int i_5 = int645 + (i_3 >> 1);
            int i_6 = (i_3 + 1 >> 1) + int645;
            int i_7 = int646 + (i_4 >> 1);
            int i_8 = (i_4 + 1 >> 1) + int646;
            int[][] ints_9 = StaticClass3.staticIntArrayArrayArray1[int642];
            int i_10 = ints_9[i_6][i_8] + ints_9[i_6][i_7] + ints_9[i_5][i_7] + ints_9[i_5][i_8] >> 2;
            int i_11 = (i_3 << 6) + (int645 << 7);
            int i_12 = (int646 << 7) + (i_4 << 6);
            return loctype_13.method561(int643, int648, ints_9, i_11, i_10, i_12, seqType1, int647);
        }
    }

}

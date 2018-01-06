public final class RenderableSub2 extends Renderable {

    static Js5IndexImpl staticJs5IndexImpl17;
    static int staticInt319;
    int int653 = 0;
    int int656 = 0;
    boolean bool73 = false;
    int int654;
    int int651;
    int int650;
    int int655;
    int int652;
    int int649;
    SeqType seqType2;

    RenderableSub2(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
        int654 = i_1;
        int651 = i_2;
        int650 = i_3;
        int655 = i_4;
        int652 = i_5;
        int649 = i_7 + i_6;
        int i_8 = SpotAnim.staticMethod418(int654).anim;
        if (i_8 != -1) {
            bool73 = false;
            seqType2 = SeqType.staticMethod438(i_8);
        } else
            bool73 = true;

    }

    final void method613(int i_1) {
        if (!bool73) {
            int656 += i_1;

            while (int656 > seqType2.frameLengths[int653]) {
                int656 -= seqType2.frameLengths[int653];
                ++int653;
                if (int653 >= seqType2.frameIds.length) {
                    bool73 = true;
                    break;
                }
            }

        }
    }

    @Override
    protected final Model getModel() {
        SpotAnim spotanim_2 = SpotAnim.staticMethod418(int654);
        Model model_3;
        if (!bool73)
            model_3 = spotanim_2.method576(int653);
        else
            model_3 = spotanim_2.method576(-1);

        return model_3 == null ? null : model_3;
    }

}

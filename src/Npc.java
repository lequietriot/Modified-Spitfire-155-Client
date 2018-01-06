public final class Npc extends Actor {

    NpcType npcType1;

    final void method700(int i_1, byte b_2) {
        int i_4 = intArray103[0];
        int i_5 = intArray104[0];
        if (i_1 == 0) {
            --i_4;
            ++i_5;
        }

        if (i_1 == 1)
            ++i_5;

        if (i_1 == 2) {
            ++i_4;
            ++i_5;
        }

        if (i_1 == 3)
            --i_4;

        if (i_1 == 4)
            ++i_4;

        if (i_1 == 5) {
            --i_4;
            --i_5;
        }

        if (i_1 == 6)
            --i_5;

        if (i_1 == 7) {
            ++i_4;
            --i_5;
        }

        if (anim != -1 && SeqType.staticMethod438(anim).priority == 1)
            anim = -1;

        if (int611 < 9)
            ++int611;

        for (int i_6 = int611; i_6 > 0; --i_6) {
            intArray103[i_6] = intArray103[i_6 - 1];
            intArray104[i_6] = intArray104[i_6 - 1];
            byteArray12[i_6] = byteArray12[i_6 - 1];
        }

        intArray103[0] = i_4;
        intArray104[0] = i_5;
        byteArray12[0] = b_2;
    }

    final void method701(int i_1, int i_2, boolean bool_3) {
        if (anim != -1 && SeqType.staticMethod438(anim).priority == 1)
            anim = -1;

        if (!bool_3) {
            int i_5 = i_1 - intArray103[0];
            int i_6 = i_2 - intArray104[0];
            if (i_5 >= -8 && i_5 <= 8 && i_6 >= -8 && i_6 <= 8) {
                if (int611 < 9)
                    ++int611;

                for (int i_7 = int611; i_7 > 0; --i_7) {
                    intArray103[i_7] = intArray103[i_7 - 1];
                    intArray104[i_7] = intArray104[i_7 - 1];
                    byteArray12[i_7] = byteArray12[i_7 - 1];
                }

                intArray103[0] = i_1;
                intArray104[0] = i_2;
                byteArray12[0] = 1;
                return;
            }
        }

        int611 = 0;
        int625 = 0;
        int633 = 0;
        intArray103[0] = i_1;
        intArray104[0] = i_2;
        int626 = tiles * 64 + intArray103[0] * 128;
        int609 = intArray104[0] * 128 + tiles * 64;
    }

    @Override
    protected final Model getModel() {
        if (npcType1 == null)
            return null;
        else {
            SeqType seqtype_2 = anim != -1 && int628 == 0 ? SeqType.staticMethod438(anim) : null;
            SeqType seqtype_3 = stance == -1 || stance == idle && seqtype_2 != null ? null : SeqType.staticMethod438(stance);
            Model model_4 = npcType1.method566(seqtype_2, int624, seqtype_3, int618);
            if (model_4 == null)
                return null;
            else {
                model_4.method640();
                int638 = model_4.modelHeight;
                if (int640 != -1 && int631 != -1) {
                    Model model_5 = SpotAnim.staticMethod418(int640).method576(int631);
                    if (model_5 != null) {
                        model_5.method651(0, -int613, 0);
                        Model[] arr_6 = new Model[] { model_4, model_5 };
                        model_4 = new Model(arr_6, 2);
                    }
                }

                if (npcType1.name == 1)
                    model_4.bool75 = true;

                return model_4;
            }
        }
    }

    @Override
    final boolean method609() {
        return npcType1 != null;
    }

}

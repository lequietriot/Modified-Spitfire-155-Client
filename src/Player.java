public final class Player extends Actor {

    int int679;
    int int680;
    int playerIndex;
    int int682;
    int int683;
    int int684;
    int int685;
    int int686;
    int int687;
    int int688;
    int int689;
    int int690;
    int skullId = -1;
    int prayerId = -1;
    String[] op = new String[3];
    int combatLevel;
    int skillLevel;
    int minSomething;
    int maxSomething;
    boolean bool77;
    int team;
    boolean bool78;
    boolean bool76;
    String name;
    PlayerDef playerDef1;
    Model model3;

    Player() {
        for (int i_1 = 0; i_1 < 3; i_1++)
            op[i_1] = "";

        combatLevel = 0;
        skillLevel = 0;
        minSomething = 0;
        maxSomething = 0;
        bool77 = false;
        team = 0;
        bool78 = false;
        bool76 = false;
    }

    // player appearance
    final void appendAppearanceBlock(Buffer buffer_1) {
        buffer_1.off = 0;
        int i_3 = buffer_1.readUByte();

        skullId = buffer_1.method440();
        prayerId = buffer_1.method440();

        int i_4 = -1;
        team = 0;
        int[] ints_5 = new int[12];

        int i_7;
        int i_8;
        for (int i_6 = 0; i_6 < 12; i_6++) {
            i_7 = buffer_1.readUByte();

            if (i_7 == 0)
                ints_5[i_6] = 0;
            else {
                i_8 = buffer_1.readUByte();
                ints_5[i_6] = i_8 + (i_7 << 8);
                if (i_6 == 0 && ints_5[0] == 65535) {
                    i_4 = buffer_1.readUShort();
                    break;
                }

                if (ints_5[i_6] >= 512) {
                    int i_9 = ObjType.staticMethod421(ints_5[i_6] - 512).team;
                    if (i_9 != 0)
                        team = i_9;
                }
            }
        }

        int[] ints_10 = new int[5];

        for (i_7 = 0; i_7 < 5; i_7++) {
            i_8 = buffer_1.readUByte();
            if (i_8 < 0 || i_8 >= Mus5Sub4.staticShortArrayArray4[i_7].length)
                i_8 = 0;

            ints_10[i_7] = i_8;
        }

        idle = buffer_1.readUShort();

        if (idle == 65535)
            idle = -1;

        unknown2 = buffer_1.readUShort();
        if (unknown2 == 65535)
            unknown2 = -1;

        int612 = unknown2;
        walk = buffer_1.readUShort();
        if (walk == 65535)
            walk = -1;

        reverse = buffer_1.readUShort();
        if (reverse == 65535)
            reverse = -1;

        counterclockwise = buffer_1.readUShort();
        if (counterclockwise == 65535)
            counterclockwise = -1;

        clockwise = buffer_1.readUShort();
        if (clockwise == 65535)
            clockwise = -1;

        run = buffer_1.readUShort();
        if (run == 65535)
            run = -1;

        name = buffer_1.method448();

        if (this == BufferWrapper.staticPlayer1)
            ClientError.staticString24 = name;

        combatLevel = buffer_1.readUByte();
        skillLevel = buffer_1.readUShort();
        bool78 = buffer_1.readUByte() == 1;

        if (Client.staticInt162 == 0 && Client.staticInt246 >= 2) {
            bool78 = false;
        }

        if (playerDef1 == null) {
            playerDef1 = new PlayerDef();
        }

        playerDef1.method296(ints_5, ints_10, i_3 == 1, i_4);

    }

    int method696() {
        return playerDef1 != null && playerDef1.npcId != -1 ? NpcType.staticMethod413(playerDef1.npcId).name : 1;
    }

    @Override
    protected final Model getModel() {
        if (playerDef1 == null)
            return null;
        else {
            SeqType seqtype_2 = anim != -1 && int628 == 0 ? SeqType.staticMethod438(anim) : null;
            SeqType seqtype_3 = stance != -1 && !bool77 && (idle != stance || seqtype_2 == null) ? SeqType.staticMethod438(stance) : null;
            Model model_4 = playerDef1.method302(seqtype_2, int624, seqtype_3, int618);
            if (model_4 == null)
                return null;
            else {
                model_4.method640();
                int638 = model_4.modelHeight;
                Model model_5;
                Model[] arr_6;
                if (!bool77 && int640 != -1 && int631 != -1) {
                    model_5 = SpotAnim.staticMethod418(int640).method576(int631);
                    if (model_5 != null) {
                        model_5.method651(0, -int613, 0);
                        arr_6 = new Model[] { model_4, model_5 };
                        model_4 = new Model(arr_6, 2);
                    }
                }

                if (!bool77 && model3 != null) {
                    if (Client.staticInt166 >= maxSomething)
                        model3 = null;

                    if (Client.staticInt166 >= minSomething && Client.staticInt166 < maxSomething) {
                        model_5 = model3;
                        model_5.method651(int688 - int626, int684 - int682, int680 - int609);
                        if (int639 == 512) {
                            model_5.method647();
                            model_5.method647();
                            model_5.method647();
                        } else if (int639 == 1024) {
                            model_5.method647();
                            model_5.method647();
                        } else if (int639 == 1536)
                            model_5.method647();

                        arr_6 = new Model[] { model_4, model_5 };
                        model_4 = new Model(arr_6, 2);
                        if (int639 == 512)
                            model_5.method647();
                        else if (int639 == 1024) {
                            model_5.method647();
                            model_5.method647();
                        } else if (int639 == 1536) {
                            model_5.method647();
                            model_5.method647();
                            model_5.method647();
                        }

                        model_5.method651(int626 - int688, int682 - int684, int609 - int680);
                    }
                }

                model_4.bool75 = true;
                return model_4;
            }
        }
    }

    final void method697(int i_1, int i_2, byte b_3) {
        if (anim != -1 && SeqType.staticMethod438(anim).priority == 1)
            anim = -1;

        int621 = -1;
        if (i_1 >= 0 && i_1 < 104 && i_2 >= 0 && i_2 < 104) {
            if (intArray103[0] >= 0 && intArray103[0] < 104 && intArray104[0] >= 0 && intArray104[0] < 104) {
                if (b_3 == 2)
                    Client.staticMethod308(this, i_1, i_2, (byte) 2);

                method699(i_1, i_2, b_3);
            } else
                method698(i_1, i_2);
        } else
            method698(i_1, i_2);

    }

    void method698(int i_1, int i_2) {
        int611 = 0;
        int625 = 0;
        int633 = 0;
        intArray103[0] = i_1;
        intArray104[0] = i_2;
        int i_4 = method696();
        int626 = i_4 * 64 + intArray103[0] * 128;
        int609 = intArray104[0] * 128 + i_4 * 64;
    }

    final void method699(int i_1, int i_2, byte b_3) {
        if (int611 < 9)
            ++int611;

        for (int i_5 = int611; i_5 > 0; --i_5) {
            intArray103[i_5] = intArray103[i_5 - 1];
            intArray104[i_5] = intArray104[i_5 - 1];
            byteArray12[i_5] = byteArray12[i_5 - 1];
        }

        intArray103[0] = i_1;
        intArray104[0] = i_2;
        byteArray12[0] = b_3;
    }

    @Override
    final boolean method609() {
        return playerDef1 != null;
    }

}

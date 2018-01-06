public class PlayerDef {

    static final int[] staticIntArray65 = new int[] { 8, 11, 4, 6, 9, 7, 10 };
    public static Cache staticCache1 = new Cache(260);
    int[] appearanceIds;
    int[] appearanceColors;
    public boolean female;
    public int npcId;
    long long12;
    long long13;

    public void method296(int[] ints_1, int[] ints_2, boolean bool_3, int i_4) {
        if (ints_1 == null) {
            ints_1 = new int[12];

            for (int i_6 = 0; i_6 < 7; i_6++)
                for (int i_7 = 0; i_7 < Identikit.staticInt308; i_7++) {
                    Identikit identikit_8 = Identikit.staticMethod416(i_7);
                    if (identikit_8 != null && !identikit_8.bool65 && i_6 + (bool_3 ? 7 : 0) == identikit_8.int549) {
                        ints_1[staticIntArray65[i_6]] = i_7 + 256;
                        break;
                    }
                }
        }

        appearanceIds = ints_1;
        appearanceColors = ints_2;
        female = bool_3;
        npcId = i_4;
        method301();
    }

    public void method297(int i_1, boolean bool_2) {
        if (i_1 != 1 || !female) {
            int i_4 = appearanceIds[staticIntArray65[i_1]];
            if (i_4 != 0) {
                i_4 -= 256;

                Identikit identikit_5;
                do {
                    if (!bool_2) {
                        --i_4;
                        if (i_4 < 0)
                            i_4 = Identikit.staticInt308 - 1;
                    } else {
                        ++i_4;
                        if (i_4 >= Identikit.staticInt308)
                            i_4 = 0;
                    }

                    identikit_5 = Identikit.staticMethod416(i_4);
                } while (identikit_5 == null || identikit_5.bool65 || identikit_5.int549 != i_1 + (female ? 7 : 0));

                appearanceIds[staticIntArray65[i_1]] = i_4 + 256;
                method301();
            }
        }
    }

    public void method298(int i_1, boolean bool_2) {
        int i_4 = appearanceColors[i_1];
        boolean bool_5;
        if (bool_2)
            do {
                ++i_4;
                if (i_4 >= Mus5Sub4.staticShortArrayArray4[i_1].length)
                    i_4 = 0;
            } while (!StaticClass36.staticMethod173(i_1, i_4));
        else
            do {
                --i_4;
                if (i_4 < 0)
                    i_4 = Mus5Sub4.staticShortArrayArray4[i_1].length - 1;

                if (i_1 == 4 && i_4 >= 8)
                    bool_5 = false;
                else
                    bool_5 = true;
            } while (!bool_5);

        appearanceColors[i_1] = i_4;
        method301();
    }

    public void method299(boolean bool_1) {
        if (bool_1 != female)
            method296((int[]) null, appearanceColors, bool_1, -1);
    }

    public void method300(Buffer buffer_1) {
        buffer_1.writeByte(female ? 1 : 0);

        int i_3;
        for (i_3 = 0; i_3 < 7; i_3++) {
            int i_4 = appearanceIds[staticIntArray65[i_3]];
            if (i_4 == 0)
                buffer_1.writeByte(-1);
            else
                buffer_1.writeByte(i_4 - 256);
        }

        for (i_3 = 0; i_3 < 5; i_3++)
            buffer_1.writeByte(appearanceColors[i_3]);

    }

    void method301() {
        long long_2 = long12;
        int i_4 = appearanceIds[5];
        int i_5 = appearanceIds[9];
        appearanceIds[5] = i_5;
        appearanceIds[9] = i_4;
        long12 = 0L;

        int i_6;
        for (i_6 = 0; i_6 < 12; i_6++) {
            long12 <<= 4;
            if (appearanceIds[i_6] >= 256)
                long12 += appearanceIds[i_6] - 256;
        }

        if (appearanceIds[0] >= 256)
            long12 += appearanceIds[0] - 256 >> 4;

        if (appearanceIds[1] >= 256)
            long12 += appearanceIds[1] - 256 >> 8;

        for (i_6 = 0; i_6 < 5; i_6++) {
            long12 <<= 3;
            long12 += appearanceColors[i_6];
        }

        long12 <<= 1;
        long12 += female ? 1 : 0;
        appearanceIds[5] = i_4;
        appearanceIds[9] = i_5;
        if (long_2 != 0L && long12 != long_2)
            staticCache1.remove(long_2);

    }

    public Model method302(SeqType seqtype_1, int i_2, SeqType seqtype_3, int i_4) {
        if (npcId != -1)
            return NpcType.staticMethod413(npcId).method566(seqtype_1, i_2, seqtype_3, i_4);
        else {
            long long_6 = long12;
            int[] ints_8 = appearanceIds;
            if (seqtype_1 != null && (seqtype_1.leftHandItem >= 0 || seqtype_1.rightHandItem >= 0)) {
                ints_8 = new int[12];

                for (int i_9 = 0; i_9 < 12; i_9++)
                    ints_8[i_9] = appearanceIds[i_9];

                if (seqtype_1.leftHandItem >= 0) {
                    long_6 += seqtype_1.leftHandItem - appearanceIds[5] << 40;
                    ints_8[5] = seqtype_1.leftHandItem;
                }

                if (seqtype_1.rightHandItem >= 0) {
                    long_6 += seqtype_1.rightHandItem - appearanceIds[3] << 48;
                    ints_8[3] = seqtype_1.rightHandItem;
                }
            }

            Model model_16 = (Model) staticCache1.get(long_6);
            if (model_16 == null) {
                boolean bool_10 = false;

                int i_12;
                for (int i_11 = 0; i_11 < 12; i_11++) {
                    i_12 = ints_8[i_11];
                    if (i_12 >= 256 && i_12 < 512 && !Identikit.staticMethod416(i_12 - 256).method572())
                        bool_10 = true;

                    if (i_12 >= 512 && !ObjType.staticMethod421(i_12 - 512).method589(female))
                        bool_10 = true;
                }

                if (bool_10) {
                    if (long13 != -1L)
                        model_16 = (Model) staticCache1.get(long13);

                    if (model_16 == null)
                        return null;
                }

                if (model_16 == null) {
                    Mesh[] arr_18 = new Mesh[12];
                    i_12 = 0;

                    int i_14;
                    for (int i_13 = 0; i_13 < 12; i_13++) {
                        i_14 = ints_8[i_13];
                        Mesh mesh_15;
                        if (i_14 >= 256 && i_14 < 512) {
                            mesh_15 = Identikit.staticMethod416(i_14 - 256).method573();
                            if (mesh_15 != null)
                                arr_18[i_12++] = mesh_15;
                        }

                        if (i_14 >= 512) {
                            mesh_15 = ObjType.staticMethod421(i_14 - 512).method590(female);
                            if (mesh_15 != null)
                                arr_18[i_12++] = mesh_15;
                        }
                    }

                    Mesh mesh_19 = new Mesh(arr_18, i_12);

                    for (i_14 = 0; i_14 < 5; i_14++) {
                        if (appearanceColors[i_14] < Mus5Sub4.staticShortArrayArray4[i_14].length)
                            mesh_19.method627(ClientError.staticShortArray3[i_14], Mus5Sub4.staticShortArrayArray4[i_14][appearanceColors[i_14]]);

                        if (appearanceColors[i_14] < SoundSystemRunnable.staticShortArrayArray1[i_14].length)
                            mesh_19.method627(TextureLoader.staticShortArray2[i_14], SoundSystemRunnable.staticShortArrayArray1[i_14][appearanceColors[i_14]]);
                    }

                    model_16 = mesh_19.method634(64, 850, -30, -50, -30);
                    staticCache1.put(model_16, long_6);
                    long13 = long_6;
                }
            }

            if (seqtype_1 == null && seqtype_3 == null)
                return model_16;
            else {
                Model model_17;
                if (seqtype_1 != null && seqtype_3 != null)
                    model_17 = seqtype_1.method606(model_16, i_2, seqtype_3, i_4);
                else if (seqtype_1 != null)
                    model_17 = seqtype_1.method603(model_16, i_2);
                else
                    model_17 = seqtype_3.method603(model_16, i_4);

                return model_17;
            }
        }
    }

    Mesh method303() {
        if (npcId != -1)
            return NpcType.staticMethod413(npcId).method567();
        else {
            boolean bool_2 = false;

            int i_4;
            for (int i_3 = 0; i_3 < 12; i_3++) {
                i_4 = appearanceIds[i_3];
                if (i_4 >= 256 && i_4 < 512 && !Identikit.staticMethod416(i_4 - 256).method574())
                    bool_2 = true;

                if (i_4 >= 512 && !ObjType.staticMethod421(i_4 - 512).method591(female))
                    bool_2 = true;
            }

            if (bool_2)
                return null;
            else {
                Mesh[] arr_8 = new Mesh[12];
                i_4 = 0;

                int i_6;
                for (int i_5 = 0; i_5 < 12; i_5++) {
                    i_6 = appearanceIds[i_5];
                    Mesh mesh_7;
                    if (i_6 >= 256 && i_6 < 512) {
                        mesh_7 = Identikit.staticMethod416(i_6 - 256).method575();
                        if (mesh_7 != null)
                            arr_8[i_4++] = mesh_7;
                    }

                    if (i_6 >= 512) {
                        mesh_7 = ObjType.staticMethod421(i_6 - 512).method592(female);
                        if (mesh_7 != null)
                            arr_8[i_4++] = mesh_7;
                    }
                }

                Mesh mesh_9 = new Mesh(arr_8, i_4);

                for (i_6 = 0; i_6 < 5; i_6++) {
                    if (appearanceColors[i_6] < Mus5Sub4.staticShortArrayArray4[i_6].length)
                        mesh_9.method627(ClientError.staticShortArray3[i_6], Mus5Sub4.staticShortArrayArray4[i_6][appearanceColors[i_6]]);

                    if (appearanceColors[i_6] < SoundSystemRunnable.staticShortArrayArray1[i_6].length)
                        mesh_9.method627(TextureLoader.staticShortArray2[i_6], SoundSystemRunnable.staticShortArrayArray1[i_6][appearanceColors[i_6]]);
                }

                return mesh_9;
            }
        }
    }

    public int method304() {
        return npcId == -1 ? appearanceIds[1] + (appearanceColors[4] << 20) + (appearanceColors[0] << 25) + (appearanceIds[0] << 15) + (appearanceIds[8] << 10) + (appearanceIds[11] << 5) : 305419896 + NpcType.staticMethod413(npcId).int538;
    }

}

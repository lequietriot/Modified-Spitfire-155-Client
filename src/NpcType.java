
public class NpcType extends Cacheable {

    public static Cache staticCache13 = new Cache(64);
    public static Cache staticCache12 = new Cache(50);
    public String string39 = "null";
    public int name = 1;
    public int tiles = 1;
    public int walk = -1;
    public int int537 = -1;
    public int idle = -1;
    public int int543 = 1;
    public int reverse = -1;
    public int counterclockwise = -1;
    public String[] op = new String[5];
    public boolean bool60 = true;
    public int int539 = -1;
    int int536 = 128;
    int int540 = 128;
    public boolean bool61 = false;
    int int541 = 0;
    int int542 = 0;
    public int int545 = -1;
    public int int544 = 32;
    int ubn = -1;
    int int546 = -1;
    public boolean bool62 = true;
    public boolean bool64 = true;
    public boolean bool63 = false;
    static Js5Index staticJs5Index15;
    static Js5Index staticJs5Index14;
    public int int538;
    int[] intArray88;
    short[] shortArray6;
    short[] shortArray7;
    short[] shortArray8;
    short[] shortArray9;
    int[] intArray89;
    public int[] intArray90;
    ParamList paramList3;

    public static void staticMethod412(Js5Index js5index_0, Js5Index js5index_1) {
        staticJs5Index15 = js5index_0;
        staticJs5Index14 = js5index_1;
    }

    public static NpcType staticMethod413(int i_0) {
        NpcType npctype_2 = (NpcType) staticCache13.get(i_0);
        if (npctype_2 != null)
            return npctype_2;
        else {
            byte[] bytes_3 = staticJs5Index15.getFile(9, i_0);
            npctype_2 = new NpcType();
            npctype_2.int538 = i_0;
            if (bytes_3 != null)
                npctype_2.decode(new Buffer(bytes_3));

            npctype_2.method565();
            staticCache13.put(npctype_2, i_0);
            return npctype_2;
        }
    }

    void method565() {
    }

    void decode(Buffer buffer_1) {
        while (true) {
            int i_3 = buffer_1.readUByte();
            if (i_3 == 0)
                return;

            this.decode(buffer_1, i_3);
        }
    }

    void decode(Buffer buffer_1, int i_2) {
        int i_4;
        int i_5;
        if (i_2 == 1) {
            i_4 = buffer_1.readUByte();
            intArray88 = new int[i_4];

            for (i_5 = 0; i_5 < i_4; i_5++)
                intArray88[i_5] = buffer_1.readUShort();
        } else if (i_2 == 2)
            string39 = buffer_1.method448();
        else if (i_2 == 12)
            name = buffer_1.readUByte();
        else if (i_2 == 13)
            tiles = -buffer_1.readUShort();
        else if (i_2 == 14)
            idle = buffer_1.readUShort();
        else if (i_2 == 15)
            walk = buffer_1.readUShort();
        else if (i_2 == 16)
            int537 = buffer_1.readUShort();
        else if (i_2 == 17) {
            idle = buffer_1.readUShort();
            int543 = -buffer_1.readUShort();
            reverse = buffer_1.readUShort();
            counterclockwise = buffer_1.readUShort();
        } else if (i_2 >= 30 && i_2 < 35) {
            op[i_2 - 30] = buffer_1.method448();
            if (op[i_2 - 30].equalsIgnoreCase("Hidden"))
                op[i_2 - 30] = null;
        } else if (i_2 == 40) {
            i_4 = buffer_1.readUByte();
            shortArray6 = new short[i_4];
            shortArray7 = new short[i_4];

            for (i_5 = 0; i_5 < i_4; i_5++) {
                shortArray6[i_5] = (short) buffer_1.readUShort();
                shortArray7[i_5] = (short) buffer_1.readUShort();
            }
        } else if (i_2 == 41) {
            i_4 = buffer_1.readUByte();
            shortArray8 = new short[i_4];
            shortArray9 = new short[i_4];

            for (i_5 = 0; i_5 < i_4; i_5++) {
                shortArray8[i_5] = (short) buffer_1.readUShort();
                shortArray9[i_5] = (short) buffer_1.readUShort();
            }
        } else if (i_2 == 60) {
            i_4 = buffer_1.readUByte();
            intArray89 = new int[i_4];

            for (i_5 = 0; i_5 < i_4; i_5++)
                intArray89[i_5] = buffer_1.readUShort();
        } else if (i_2 == 93)
            bool60 = false;
        else if (i_2 == 95)
            int539 = buffer_1.readUShort();
        else if (i_2 == 97)
            int536 = buffer_1.readUShort();
        else if (i_2 == 98)
            int540 = buffer_1.readUShort();
        else if (i_2 == 99)
            bool61 = true;
        else if (i_2 == 100)
            int541 = buffer_1.method440();
        else if (i_2 == 101)
            int542 = buffer_1.method440() * 5;
        else if (i_2 == 102)
            int545 = buffer_1.readUShort();
        else if (i_2 == 103)
            int544 = buffer_1.readUShort();
        else if (i_2 != 106 && i_2 != 118) {
            if (i_2 == 107)
                bool62 = false;
            else if (i_2 == 109)
                bool64 = false;
            else if (i_2 == 111)
                bool63 = true;
            else if (i_2 == 249)
                paramList3 = StaticClass46.staticMethod195(buffer_1, paramList3);
        } else {
            ubn = buffer_1.readUShort();
            if (ubn == 65535)
                ubn = -1;

            int546 = buffer_1.readUShort();
            if (int546 == 65535)
                int546 = -1;

            i_4 = -1;
            if (i_2 == 118) {
                i_4 = buffer_1.readUShort();
                if (i_4 == 65535)
                    i_4 = -1;
            }

            i_5 = buffer_1.readUByte();
            intArray90 = new int[i_5 + 2];

            for (int i_6 = 0; i_6 <= i_5; i_6++) {
                intArray90[i_6] = buffer_1.readUShort();
                if (intArray90[i_6] == 65535)
                    intArray90[i_6] = -1;
            }

            intArray90[i_5 + 1] = i_4;
        }

    }

    public final Model method566(SeqType seqtype_1, int i_2, SeqType seqtype_3, int i_4) {
        if (intArray90 != null) {
            NpcType npctype_12 = method568();
            return npctype_12 == null ? null : npctype_12.method566(seqtype_1, i_2, seqtype_3, i_4);
        } else {
            Model model_6 = (Model) staticCache12.get(int538);
            if (model_6 == null) {
                boolean bool_7 = false;

                for (int i_8 = 0; i_8 < intArray88.length; i_8++)
                    if (!staticJs5Index14.contains(intArray88[i_8], 0))
                        bool_7 = true;

                if (bool_7)
                    return null;

                Mesh[] arr_9 = new Mesh[intArray88.length];

                int i_10;
                for (i_10 = 0; i_10 < intArray88.length; i_10++)
                    arr_9[i_10] = Mesh.staticMethod466(staticJs5Index14, intArray88[i_10], 0);

                Mesh mesh_13;
                if (arr_9.length == 1)
                    mesh_13 = arr_9[0];
                else
                    mesh_13 = new Mesh(arr_9, arr_9.length);

                if (shortArray6 != null)
                    for (i_10 = 0; i_10 < shortArray6.length; i_10++)
                        mesh_13.method627(shortArray6[i_10], shortArray7[i_10]);

                if (shortArray8 != null)
                    for (i_10 = 0; i_10 < shortArray8.length; i_10++)
                        mesh_13.method628(shortArray8[i_10], shortArray9[i_10]);

                model_6 = mesh_13.method634(64 + int541, int542 + 850, -30, -50, -30);
                staticCache12.put(model_6, int538);
            }

            Model model_11;
            if (seqtype_1 != null && seqtype_3 != null)
                model_11 = seqtype_1.method606(model_6, i_2, seqtype_3, i_4);
            else if (seqtype_1 != null)
                model_11 = seqtype_1.method603(model_6, i_2);
            else if (seqtype_3 != null)
                model_11 = seqtype_3.method603(model_6, i_4);
            else
                model_11 = model_6.method636(true);

            if (int536 != 128 || int540 != 128)
                model_11.method652(int536, int540, int536);

            return model_11;
        }
    }

    public final Mesh method567() {
        if (intArray90 != null) {
            NpcType npctype_6 = method568();
            return npctype_6 == null ? null : npctype_6.method567();
        } else if (intArray89 == null)
            return null;
        else {
            boolean bool_2 = false;

            for (int i_3 = 0; i_3 < intArray89.length; i_3++)
                if (!staticJs5Index14.contains(intArray89[i_3], 0))
                    bool_2 = true;

            if (bool_2)
                return null;
            else {
                Mesh[] arr_7 = new Mesh[intArray89.length];

                for (int i_4 = 0; i_4 < intArray89.length; i_4++)
                    arr_7[i_4] = Mesh.staticMethod466(staticJs5Index14, intArray89[i_4], 0);

                Mesh mesh_8;
                if (arr_7.length == 1)
                    mesh_8 = arr_7[0];
                else
                    mesh_8 = new Mesh(arr_7, arr_7.length);

                int i_5;
                if (shortArray6 != null)
                    for (i_5 = 0; i_5 < shortArray6.length; i_5++)
                        mesh_8.method627(shortArray6[i_5], shortArray7[i_5]);

                if (shortArray8 != null)
                    for (i_5 = 0; i_5 < shortArray8.length; i_5++)
                        mesh_8.method628(shortArray8[i_5], shortArray9[i_5]);

                return mesh_8;
            }
        }
    }

    public final NpcType method568() {
        int i_2 = -1;
        if (ubn != -1)
            i_2 = StaticClass44.staticMethod183(ubn);
        else if (int546 != -1)
            i_2 = StaticClass44.staticIntArray68[int546];

        int i_3;
        if (i_2 >= 0 && i_2 < intArray90.length - 1)
            i_3 = intArray90[i_2];
        else
            i_3 = intArray90[intArray90.length - 1];

        return i_3 != -1 ? staticMethod413(i_3) : null;
    }

    public boolean method569() {
        if (intArray90 == null)
            return true;
        else {
            int i_2 = -1;
            if (ubn != -1)
                i_2 = StaticClass44.staticMethod183(ubn);
            else if (int546 != -1)
                i_2 = StaticClass44.staticIntArray68[int546];

            return i_2 >= 0 && i_2 < intArray90.length ? intArray90[i_2] != -1 : intArray90[intArray90.length - 1] != -1;
        }
    }

    public int getIntProperty(int i_1, int i_2) {
        return StaticClass46.staticMethod196(paramList3, i_1, i_2);
    }

    public String getStringProperty(int i_1, String string_2) {
        return StaticClass46.staticMethod197(paramList3, i_1, string_2);
    }

}

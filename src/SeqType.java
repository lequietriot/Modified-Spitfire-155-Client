
public class SeqType extends Cacheable {

    public static Js5Index staticJs5Index35;
    public static Js5Index staticJs5Index36;
    public static Js5Index staticJs5Index37;
    public static Cache staticCache36 = new Cache(64);
    public static Cache staticCache35 = new Cache(100);
    public int frameStep = -1;
    public boolean bool68 = false;
    public int int605 = 5;
    public int leftHandItem = -1;
    public int rightHandItem = -1;
    public int int606 = 99;
    public int int607 = -1;
    public int priority = -1;
    public int delayType = 2;
    public int[] frameLengths;
    int[] intArray96;
    public int[] frameIds;
    int[] intArray95;
    public int[] intArray97;

    public static SeqType staticMethod438(int i_0) {
        SeqType seqtype_2 = (SeqType) staticCache36.get(i_0);
        if (seqtype_2 != null)
            return seqtype_2;
        else {
            byte[] bytes_3 = staticJs5Index36.getFile(12, i_0);
            seqtype_2 = new SeqType();
            if (bytes_3 != null)
                seqtype_2.decode(new Buffer(bytes_3));

            seqtype_2.method602();
            staticCache36.put(seqtype_2, i_0);
            return seqtype_2;
        }
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
            i_4 = buffer_1.readUShort();
            frameLengths = new int[i_4];

            for (i_5 = 0; i_5 < i_4; i_5++)
                frameLengths[i_5] = buffer_1.readUShort();

            frameIds = new int[i_4];

            for (i_5 = 0; i_5 < i_4; i_5++)
                frameIds[i_5] = buffer_1.readUShort();

            for (i_5 = 0; i_5 < i_4; i_5++)
                frameIds[i_5] += buffer_1.readUShort() << 16;
        } else if (i_2 == 2)
            frameStep = buffer_1.readUShort();
        else if (i_2 == 3) {
            i_4 = buffer_1.readUByte();
            intArray96 = new int[i_4 + 1];

            for (i_5 = 0; i_5 < i_4; i_5++)
                intArray96[i_5] = buffer_1.readUByte();

            intArray96[i_4] = 9999999;
        } else if (i_2 == 4)
            bool68 = true;
        else if (i_2 == 5)
            int605 = buffer_1.readUByte();
        else if (i_2 == 6)
            leftHandItem = buffer_1.readUShort();
        else if (i_2 == 7)
            rightHandItem = buffer_1.readUShort();
        else if (i_2 == 8)
            int606 = buffer_1.readUByte();
        else if (i_2 == 9)
            int607 = buffer_1.readUByte();
        else if (i_2 == 10)
            priority = buffer_1.readUByte();
        else if (i_2 == 11)
            delayType = buffer_1.readUByte();
        else if (i_2 == 12) {
            i_4 = buffer_1.readUByte();
            intArray95 = new int[i_4];

            for (i_5 = 0; i_5 < i_4; i_5++)
                intArray95[i_5] = buffer_1.readUShort();

            for (i_5 = 0; i_5 < i_4; i_5++)
                intArray95[i_5] += buffer_1.readUShort() << 16;
        } else if (i_2 == 13) {
            i_4 = buffer_1.readUByte();
            intArray97 = new int[i_4];

            for (i_5 = 0; i_5 < i_4; i_5++)
                intArray97[i_5] = buffer_1.method443();
        }

    }

    void method602() {
        if (int607 == -1)
            if (intArray96 != null)
                int607 = 2;
            else
                int607 = 0;

        if (priority == -1)
            if (intArray96 != null)
                priority = 2;
            else
                priority = 0;

    }

    public Model method603(Model model_1, int i_2) {
        i_2 = frameIds[i_2];
        AnimFrame animframe_4 = staticMethod439(i_2 >> 16);
        i_2 &= 0xffff;
        if (animframe_4 == null)
            return model_1.method636(true);
        else {
            Model model_5 = model_1.method636(!animframe_4.method529(i_2));
            model_5.method644(animframe_4, i_2);
            return model_5;
        }
    }

    Model method604(Model model_1, int i_2, int i_3) {
        i_2 = frameIds[i_2];
        AnimFrame animframe_5 = staticMethod439(i_2 >> 16);
        i_2 &= 0xffff;
        if (animframe_5 == null)
            return model_1.method636(true);
        else {
            Model model_6 = model_1.method636(!animframe_5.method529(i_2));
            i_3 &= 0x3;
            if (i_3 == 1)
                model_6.method649();
            else if (i_3 == 2)
                model_6.method648();
            else if (i_3 == 3)
                model_6.method647();

            model_6.method644(animframe_5, i_2);
            if (i_3 == 1)
                model_6.method647();
            else if (i_3 == 2)
                model_6.method648();
            else if (i_3 == 3)
                model_6.method649();

            return model_6;
        }
    }

    Model method605(Model model_1, int i_2) {
        i_2 = frameIds[i_2];
        AnimFrame animframe_4 = staticMethod439(i_2 >> 16);
        i_2 &= 0xffff;
        if (animframe_4 == null)
            return model_1.method637(true);
        else {
            Model model_5 = model_1.method637(!animframe_4.method529(i_2));
            model_5.method644(animframe_4, i_2);
            return model_5;
        }
    }

    public Model method606(Model model_1, int i_2, SeqType seqtype_3, int i_4) {
        i_2 = frameIds[i_2];
        AnimFrame animframe_6 = staticMethod439(i_2 >> 16);
        i_2 &= 0xffff;
        if (animframe_6 == null)
            return seqtype_3.method603(model_1, i_4);
        else {
            i_4 = seqtype_3.frameIds[i_4];
            AnimFrame animframe_7 = staticMethod439(i_4 >> 16);
            i_4 &= 0xffff;
            Model model_8;
            if (animframe_7 == null) {
                model_8 = model_1.method636(!animframe_6.method529(i_2));
                model_8.method644(animframe_6, i_2);
                return model_8;
            } else {
                model_8 = model_1.method636(!animframe_6.method529(i_2) & !animframe_7.method529(i_4));
                model_8.method645(animframe_6, i_2, animframe_7, i_4, intArray96);
                return model_8;
            }
        }
    }

    public Model method607(Model model_1, int i_2) {
        int i_4 = frameIds[i_2];
        AnimFrame animframe_5 = staticMethod439(i_4 >> 16);
        i_4 &= 0xffff;
        if (animframe_5 == null)
            return model_1.method636(true);
        else {
            AnimFrame animframe_6 = null;
            int i_7 = 0;
            if (intArray95 != null && i_2 < intArray95.length) {
                i_7 = intArray95[i_2];
                animframe_6 = staticMethod439(i_7 >> 16);
                i_7 &= 0xffff;
            }

            Model model_8;
            if (animframe_6 != null && i_7 != 65535) {
                model_8 = model_1.method636(!animframe_5.method529(i_4) & !animframe_6.method529(i_7));
                model_8.method644(animframe_5, i_4);
                model_8.method644(animframe_6, i_7);
                return model_8;
            } else {
                model_8 = model_1.method636(!animframe_5.method529(i_4));
                model_8.method644(animframe_5, i_4);
                return model_8;
            }
        }
    }

    static AnimFrame staticMethod439(int i_0) {
        AnimFrame animframe_2 = (AnimFrame) staticCache35.get(i_0);
        if (animframe_2 != null)
            return animframe_2;
        else {
            animframe_2 = AnimFrame.staticMethod409(staticJs5Index35, staticJs5Index37, i_0, false);
            if (animframe_2 != null)
                staticCache35.put(animframe_2, i_0);

            return animframe_2;
        }
    }

}

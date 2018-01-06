
public class SpotAnim extends Cacheable {

    static int staticInt309;
    public static Cache staticCache17 = new Cache(64);
    public static Cache staticCache18 = new Cache(30);
    public int anim = -1;
    int int551 = 128;
    int int552 = 128;
    int int553 = 0;
    int int554 = 0;
    int int555 = 0;
    static Js5Index staticJs5Index21;
    static Js5Index staticJs5Index20;
    int int550;
    int model;
    short[] shortArray14;
    short[] shortArray15;
    short[] shortArray16;
    short[] shortArray17;

    public static void staticMethod417(Js5Index js5index_0, Js5Index js5index_1) {
        staticJs5Index21 = js5index_0;
        staticJs5Index20 = js5index_1;
    }

    public static SpotAnim staticMethod418(int i_0) {
        SpotAnim spotanim_2 = (SpotAnim) staticCache17.get(i_0);
        if (spotanim_2 != null)
            return spotanim_2;
        else {
            byte[] bytes_3 = staticJs5Index21.getFile(13, i_0);
            spotanim_2 = new SpotAnim();
            spotanim_2.int550 = i_0;
            if (bytes_3 != null)
                spotanim_2.decode(new Buffer(bytes_3));

            staticCache17.put(spotanim_2, i_0);
            return spotanim_2;
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
        if (i_2 == 1)
            model = buffer_1.readUShort();
        else if (i_2 == 2)
            anim = buffer_1.readUShort();
        else if (i_2 == 4)
            int551 = buffer_1.readUShort();
        else if (i_2 == 5)
            int552 = buffer_1.readUShort();
        else if (i_2 == 6)
            int553 = buffer_1.readUShort();
        else if (i_2 == 7)
            int554 = buffer_1.readUByte();
        else if (i_2 == 8)
            int555 = buffer_1.readUByte();
        else {
            int i_4;
            int i_5;
            if (i_2 == 40) {
                i_4 = buffer_1.readUByte();
                shortArray14 = new short[i_4];
                shortArray15 = new short[i_4];

                for (i_5 = 0; i_5 < i_4; i_5++) {
                    shortArray14[i_5] = (short) buffer_1.readUShort();
                    shortArray15[i_5] = (short) buffer_1.readUShort();
                }
            } else if (i_2 == 41) {
                i_4 = buffer_1.readUByte();
                shortArray16 = new short[i_4];
                shortArray17 = new short[i_4];

                for (i_5 = 0; i_5 < i_4; i_5++) {
                    shortArray16[i_5] = (short) buffer_1.readUShort();
                    shortArray17[i_5] = (short) buffer_1.readUShort();
                }
            }
        }

    }

    public final Model method576(int i_1) {
        Model model_3 = (Model) staticCache18.get(int550);
        if (model_3 == null) {
            Mesh mesh_4 = Mesh.staticMethod466(staticJs5Index20, model, 0);
            if (mesh_4 == null)
                return null;

            int i_5;
            if (shortArray14 != null)
                for (i_5 = 0; i_5 < shortArray14.length; i_5++)
                    mesh_4.method627(shortArray14[i_5], shortArray15[i_5]);

            if (shortArray16 != null)
                for (i_5 = 0; i_5 < shortArray16.length; i_5++)
                    mesh_4.method628(shortArray16[i_5], shortArray17[i_5]);

            model_3 = mesh_4.method634(int554 + 64, int555 + 850, -30, -50, -30);
            staticCache18.put(model_3, int550);
        }

        Model model_6;
        if (anim != -1 && i_1 != -1)
            model_6 = SeqType.staticMethod438(anim).method605(model_3, i_1);
        else
            model_6 = model_3.method637(true);

        if (int551 != 128 || int552 != 128)
            model_6.method652(int551, int552, int551);

        if (int553 != 0) {
            if (int553 == 90)
                model_6.method647();

            if (int553 == 180) {
                model_6.method647();
                model_6.method647();
            }

            if (int553 == 270) {
                model_6.method647();
                model_6.method647();
                model_6.method647();
            }
        }

        return model_6;
    }

}

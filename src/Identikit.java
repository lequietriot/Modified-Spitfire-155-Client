public class Identikit extends Cacheable {

    public static Js5Index staticJs5Index17;
    public static int staticInt308;
    public static Js5Index staticJs5Index18;
    public static Cache staticCache15 = new Cache(64);
    public int int549 = -1;
    int[] intArray91 = new int[] { -1, -1, -1, -1, -1 };
    public boolean bool65 = false;
    int[] models;
    short[] shortArray10;
    short[] shortArray11;
    short[] shortArray12;
    short[] shortArray13;

    public static Identikit staticMethod416(int i_0) {
        Identikit identikit_2 = (Identikit) staticCache15.get(i_0);
        if (identikit_2 != null)
            return identikit_2;
        else {
            byte[] bytes_3 = staticJs5Index18.getFile(3, i_0);
            identikit_2 = new Identikit();
            if (bytes_3 != null)
                identikit_2.decode(new Buffer(bytes_3));

            staticCache15.put(identikit_2, i_0);
            return identikit_2;
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
            int549 = buffer_1.readUByte();
        else {
            int i_4;
            int i_5;
            if (i_2 == 2) {
                i_4 = buffer_1.readUByte();
                models = new int[i_4];

                for (i_5 = 0; i_5 < i_4; i_5++)
                    models[i_5] = buffer_1.readUShort();
            } else if (i_2 == 3)
                bool65 = true;
            else if (i_2 == 40) {
                i_4 = buffer_1.readUByte();
                shortArray10 = new short[i_4];
                shortArray11 = new short[i_4];

                for (i_5 = 0; i_5 < i_4; i_5++) {
                    shortArray10[i_5] = (short) buffer_1.readUShort();
                    shortArray11[i_5] = (short) buffer_1.readUShort();
                }
            } else if (i_2 == 41) {
                i_4 = buffer_1.readUByte();
                shortArray12 = new short[i_4];
                shortArray13 = new short[i_4];

                for (i_5 = 0; i_5 < i_4; i_5++) {
                    shortArray12[i_5] = (short) buffer_1.readUShort();
                    shortArray13[i_5] = (short) buffer_1.readUShort();
                }
            } else if (i_2 >= 60 && i_2 < 70)
                intArray91[i_2 - 60] = buffer_1.readUShort();
        }

    }

    public boolean method572() {
        if (models == null)
            return true;
        else {
            boolean bool_2 = true;

            for (int i_3 = 0; i_3 < models.length; i_3++)
                if (!staticJs5Index17.contains(models[i_3], 0))
                    bool_2 = false;

            return bool_2;
        }
    }

    public Mesh method573() {
        if (models == null)
            return null;
        else {
            Mesh[] arr_2 = new Mesh[models.length];

            for (int i_3 = 0; i_3 < models.length; i_3++)
                arr_2[i_3] = Mesh.staticMethod466(staticJs5Index17, models[i_3], 0);

            Mesh mesh_5;
            if (arr_2.length == 1)
                mesh_5 = arr_2[0];
            else
                mesh_5 = new Mesh(arr_2, arr_2.length);

            int i_4;
            if (shortArray10 != null)
                for (i_4 = 0; i_4 < shortArray10.length; i_4++)
                    mesh_5.method627(shortArray10[i_4], shortArray11[i_4]);

            if (shortArray12 != null)
                for (i_4 = 0; i_4 < shortArray12.length; i_4++)
                    mesh_5.method628(shortArray12[i_4], shortArray13[i_4]);

            return mesh_5;
        }
    }

    public boolean method574() {
        boolean bool_2 = true;

        for (int i_3 = 0; i_3 < 5; i_3++)
            if (intArray91[i_3] != -1 && !staticJs5Index17.contains(intArray91[i_3], 0))
                bool_2 = false;

        return bool_2;
    }

    public Mesh method575() {
        Mesh[] arr_2 = new Mesh[5];
        int i_3 = 0;

        for (int i_4 = 0; i_4 < 5; i_4++)
            if (intArray91[i_4] != -1)
                arr_2[i_3++] = Mesh.staticMethod466(staticJs5Index17, intArray91[i_4], 0);

        Mesh mesh_6 = new Mesh(arr_2, i_3);
        int i_5;
        if (shortArray10 != null)
            for (i_5 = 0; i_5 < shortArray10.length; i_5++)
                mesh_6.method627(shortArray10[i_5], shortArray11[i_5]);

        if (shortArray12 != null)
            for (i_5 = 0; i_5 < shortArray12.length; i_5++)
                mesh_6.method628(shortArray12[i_5], shortArray13[i_5]);

        return mesh_6;
    }

}

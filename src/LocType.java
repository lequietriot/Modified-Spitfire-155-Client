
public class LocType extends Cacheable {

    static boolean staticBool50 = false;
    public static Cache staticCache8 = new Cache(4096);
    public static Cache staticCache11 = new Cache(500);
    public static Cache staticCache9 = new Cache(30);
    public static Cache staticCache10 = new Cache(30);
    static Mesh[] staticMeshArray1 = new Mesh[4];
    public String string38 = "null";
    public int int518 = 1;
    public int int519 = 1;
    public int int520 = 2;
    public boolean bool54 = true;
    public int int514 = -1;
    int int523 = -1;
    boolean bool55 = false;
    public boolean bool56 = false;
    public int int532 = -1;
    public int int521 = 16;
    int int522 = 0;
    int recol_s = 0;
    public String[] op = new String[5];
    public int int524 = -1;
    public int int517 = -1;
    boolean bool53 = false;
    public boolean bool58 = true;
    int int513 = 128;
    int int526 = 128;
    int int527 = 128;
    int off = 0;
    int int529 = 0;
    int int530 = 0;
    public boolean bool59 = false;
    boolean bool57 = false;
    public int int531 = -1;
    int int533 = -1;
    int int528 = -1;
    public int int534 = -1;
    public int int535 = 0;
    public int int516 = 0;
    public int int525 = 0;
    static Js5Index staticJs5Index12;
    static Js5Index staticJs5Index13;
    public int int515;
    int[] intArray84;
    int[] intArray85;
    short[] shortArray5;
    short[] shortArray2;
    short[] shortArray3;
    short[] shortArray4;
    public int[] intArray87;
    public int[] intArray86;
    ParamList paramList2;

    public static void staticMethod410(Js5Index js5index_0, Js5Index js5index_1, boolean bool_2) {
        staticJs5Index12 = js5index_0;
        staticJs5Index13 = js5index_1;
        staticBool50 = bool_2;
    }

    public static LocType staticMethod411(int i_0) {
        LocType loctype_2 = (LocType) staticCache8.get(i_0);
        if (loctype_2 != null)
            return loctype_2;
        else {
            byte[] bytes_3 = staticJs5Index12.getFile(6, i_0);
            loctype_2 = new LocType();
            loctype_2.int515 = i_0;
            if (bytes_3 != null)
                loctype_2.decode(new Buffer(bytes_3));

            loctype_2.method556();
            if (loctype_2.bool57) {
                loctype_2.int520 = 0;
                loctype_2.bool54 = false;
            }

            staticCache8.put(loctype_2, i_0);
            return loctype_2;
        }
    }

    void method556() {
        if (int514 == -1) {
            int514 = 0;
            if (intArray85 != null && (intArray84 == null || intArray84[0] == 10))
                int514 = 1;

            for (int i_2 = 0; i_2 < 5; i_2++)
                if (op[i_2] != null)
                    int514 = 1;
        }

        if (int531 == -1)
            int531 = int520 != 0 ? 1 : 0;

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
            if (i_4 > 0)
                if (intArray85 != null && !staticBool50)
                    buffer_1.off += i_4 * 3;
                else {
                    intArray84 = new int[i_4];
                    intArray85 = new int[i_4];

                    for (i_5 = 0; i_5 < i_4; i_5++) {
                        intArray85[i_5] = buffer_1.readUShort();
                        intArray84[i_5] = buffer_1.readUByte();
                    }
                }
        } else if (i_2 == 2)
            string38 = buffer_1.method448();
        else if (i_2 == 5) {
            i_4 = buffer_1.readUByte();
            if (i_4 > 0)
                if (intArray85 != null && !staticBool50)
                    buffer_1.off += i_4 * 2;
                else {
                    intArray84 = null;
                    intArray85 = new int[i_4];

                    for (i_5 = 0; i_5 < i_4; i_5++)
                        intArray85[i_5] = buffer_1.readUShort();
                }
        } else if (i_2 == 14)
            int518 = buffer_1.readUByte();
        else if (i_2 == 15)
            int519 = buffer_1.readUByte();
        else if (i_2 == 17) {
            int520 = 0;
            bool54 = false;
        } else if (i_2 == 18)
            bool54 = false;
        else if (i_2 == 19)
            int514 = buffer_1.readUByte();
        else if (i_2 == 21)
            int523 = 0;
        else if (i_2 == 22)
            bool55 = true;
        else if (i_2 == 23)
            bool56 = true;
        else if (i_2 == 24) {
            int532 = buffer_1.readUShort();
            if (int532 == 65535)
                int532 = -1;
        } else if (i_2 == 27)
            int520 = 1;
        else if (i_2 == 28)
            int521 = buffer_1.readUByte();
        else if (i_2 == 29)
            int522 = buffer_1.method440();
        else if (i_2 == 39)
            recol_s = buffer_1.method440() * 25;
        else if (i_2 >= 30 && i_2 < 35) {
            op[i_2 - 30] = buffer_1.method448();
            if (op[i_2 - 30].equalsIgnoreCase("Hidden"))
                op[i_2 - 30] = null;
        } else if (i_2 == 40) {
            i_4 = buffer_1.readUByte();
            shortArray5 = new short[i_4];
            shortArray2 = new short[i_4];

            for (i_5 = 0; i_5 < i_4; i_5++) {
                shortArray5[i_5] = (short) buffer_1.readUShort();
                shortArray2[i_5] = (short) buffer_1.readUShort();
            }
        } else if (i_2 == 41) {
            i_4 = buffer_1.readUByte();
            shortArray3 = new short[i_4];
            shortArray4 = new short[i_4];

            for (i_5 = 0; i_5 < i_4; i_5++) {
                shortArray3[i_5] = (short) buffer_1.readUShort();
                shortArray4[i_5] = (short) buffer_1.readUShort();
            }
        } else if (i_2 == 62)
            bool53 = true;
        else if (i_2 == 64)
            bool58 = false;
        else if (i_2 == 65)
            int513 = buffer_1.readUShort();
        else if (i_2 == 66)
            int526 = buffer_1.readUShort();
        else if (i_2 == 67)
            int527 = buffer_1.readUShort();
        else if (i_2 == 68)
            int517 = buffer_1.readUShort();
        else if (i_2 == 69)
            buffer_1.readUByte();
        else if (i_2 == 70)
            off = buffer_1.readShort();
        else if (i_2 == 71)
            int529 = buffer_1.readShort();
        else if (i_2 == 72)
            int530 = buffer_1.readShort();
        else if (i_2 == 73)
            bool59 = true;
        else if (i_2 == 74)
            bool57 = true;
        else if (i_2 == 75)
            int531 = buffer_1.readUByte();
        else if (i_2 != 77 && i_2 != 92) {
            if (i_2 == 78) {
                int534 = buffer_1.readUShort();
                int535 = buffer_1.readUByte();
            } else if (i_2 == 79) {
                int516 = buffer_1.readUShort();
                int525 = buffer_1.readUShort();
                int535 = buffer_1.readUByte();
                i_4 = buffer_1.readUByte();
                intArray87 = new int[i_4];

                for (i_5 = 0; i_5 < i_4; i_5++)
                    intArray87[i_5] = buffer_1.readUShort();
            } else if (i_2 == 81)
                int523 = buffer_1.readUByte() * 256;
            else if (i_2 == 82)
                int524 = buffer_1.readUShort();
            else if (i_2 == 249)
                paramList2 = StaticClass46.staticMethod195(buffer_1, paramList2);
        } else {
            int533 = buffer_1.readUShort();
            if (int533 == 65535)
                int533 = -1;

            int528 = buffer_1.readUShort();
            if (int528 == 65535)
                int528 = -1;

            i_4 = -1;
            if (i_2 == 92) {
                i_4 = buffer_1.readUShort();
                if (i_4 == 65535)
                    i_4 = -1;
            }

            i_5 = buffer_1.readUByte();
            intArray86 = new int[i_5 + 2];

            for (int i_6 = 0; i_6 <= i_5; i_6++) {
                intArray86[i_6] = buffer_1.readUShort();
                if (intArray86[i_6] == 65535)
                    intArray86[i_6] = -1;
            }

            intArray86[i_5 + 1] = i_4;
        }

    }

    public final boolean method557(int i_1) {
        if (intArray84 != null) {
            for (int i_5 = 0; i_5 < intArray84.length; i_5++)
                if (i_1 == intArray84[i_5])
                    return staticJs5Index13.contains(intArray85[i_5] & 0xffff, 0);

            return true;
        } else if (intArray85 == null)
            return true;
        else if (i_1 != 10)
            return true;
        else {
            boolean bool_3 = true;

            for (int i_4 = 0; i_4 < intArray85.length; i_4++)
                bool_3 &= staticJs5Index13.contains(intArray85[i_4] & 0xffff, 0);

            return bool_3;
        }
    }

    public final boolean method558() {
        if (intArray85 == null)
            return true;
        else {
            boolean bool_2 = true;

            for (int i_3 = 0; i_3 < intArray85.length; i_3++)
                bool_2 &= staticJs5Index13.contains(intArray85[i_3] & 0xffff, 0);

            return bool_2;
        }
    }

    public final Renderable method559(int i_1, int i_2, int[][] ints_3, int i_4, int i_5, int i_6) {
        long long_8;
        if (intArray84 == null)
            long_8 = i_2 + (int515 << 10);
        else
            long_8 = i_2 + (i_1 << 3) + (int515 << 10);

        Object obj_10 = staticCache9.get(long_8);
        if (obj_10 == null) {
            Mesh mesh_11 = method562(i_1, i_2);
            if (mesh_11 == null)
                return null;

            if (!bool55)
                obj_10 = mesh_11.method634(64 + int522, 768 + recol_s, -50, -10, -50);
            else {
                mesh_11.short3 = (short) (64 + int522);
                mesh_11.short2 = (short) (768 + recol_s);
                mesh_11.method631();
                obj_10 = mesh_11;
            }

            staticCache9.put((Cacheable) obj_10, long_8);
        }

        if (bool55)
            obj_10 = ((Mesh) obj_10).method619();

        if (int523 >= 0)
            if (obj_10 instanceof Model)
                obj_10 = ((Model) obj_10).method635(ints_3, i_4, i_5, i_6, true, int523);
            else if (obj_10 instanceof Mesh)
                obj_10 = ((Mesh) obj_10).method620(ints_3, i_4, i_5, i_6, true, int523);

        return (Renderable) obj_10;
    }

    public final Model method560(int i_1, int i_2, int[][] ints_3, int i_4, int i_5, int i_6) {
        long long_8;
        if (intArray84 == null)
            long_8 = i_2 + (int515 << 10);
        else
            long_8 = (i_1 << 3) + (int515 << 10) + i_2;

        Model model_10 = (Model) staticCache10.get(long_8);
        if (model_10 == null) {
            Mesh mesh_11 = method562(i_1, i_2);
            if (mesh_11 == null)
                return null;

            model_10 = mesh_11.method634(int522 + 64, 768 + recol_s, -50, -10, -50);
            staticCache10.put(model_10, long_8);
        }

        if (int523 >= 0)
            model_10 = model_10.method635(ints_3, i_4, i_5, i_6, true, int523);

        return model_10;
    }

    public final Model method561(int i_1, int i_2, int[][] ints_3, int i_4, int i_5, int i_6, SeqType seqtype_7, int i_8) {
        long long_10;
        if (intArray84 == null)
            long_10 = i_2 + (int515 << 10);
        else
            long_10 = i_2 + (i_1 << 3) + (int515 << 10);

        Model model_12 = (Model) staticCache10.get(long_10);
        if (model_12 == null) {
            Mesh mesh_13 = method562(i_1, i_2);
            if (mesh_13 == null)
                return null;

            model_12 = mesh_13.method634(64 + int522, 768 + recol_s, -50, -10, -50);
            staticCache10.put(model_12, long_10);
        }

        if (seqtype_7 == null && int523 == -1)
            return model_12;
        else {
            if (seqtype_7 != null)
                model_12 = seqtype_7.method604(model_12, i_8, i_2);
            else
                model_12 = model_12.method636(true);

            if (int523 >= 0)
                model_12 = model_12.method635(ints_3, i_4, i_5, i_6, false, int523);

            return model_12;
        }
    }

    final Mesh method562(int i_1, int i_2) {
        Mesh mesh_4 = null;
        boolean bool_5;
        int i_6;
        int i_8;
        if (intArray84 == null) {
            if (i_1 != 10)
                return null;

            if (intArray85 == null)
                return null;

            bool_5 = bool53;
            if (i_1 == 2 && i_2 > 3)
                bool_5 = !bool_5;

            i_6 = intArray85.length;

            for (int i_7 = 0; i_7 < i_6; i_7++) {
                i_8 = intArray85[i_7];
                if (bool_5)
                    i_8 += 65536;

                mesh_4 = (Mesh) staticCache11.get(i_8);
                if (mesh_4 == null) {
                    mesh_4 = Mesh.staticMethod466(staticJs5Index13, i_8 & 0xffff, 0);
                    if (mesh_4 == null)
                        return null;

                    if (bool_5)
                        mesh_4.method629();

                    staticCache11.put(mesh_4, i_8);
                }

                if (i_6 > 1)
                    staticMeshArray1[i_7] = mesh_4;
            }

            if (i_6 > 1)
                mesh_4 = new Mesh(staticMeshArray1, i_6);
        } else {
            int i_9 = -1;

            for (i_6 = 0; i_6 < intArray84.length; i_6++)
                if (i_1 == intArray84[i_6]) {
                    i_9 = i_6;
                    break;
                }

            if (i_9 == -1)
                return null;

            i_6 = intArray85[i_9];
            boolean bool_10 = bool53 ^ i_2 > 3;
            if (bool_10)
                i_6 += 65536;

            mesh_4 = (Mesh) staticCache11.get(i_6);
            if (mesh_4 == null) {
                mesh_4 = Mesh.staticMethod466(staticJs5Index13, i_6 & 0xffff, 0);
                if (mesh_4 == null)
                    return null;

                if (bool_10)
                    mesh_4.method629();

                staticCache11.put(mesh_4, i_6);
            }
        }

        if (int513 == 128 && int526 == 128 && int527 == 128)
            bool_5 = false;
        else
            bool_5 = true;

        boolean bool_11;
        if (off == 0 && int529 == 0 && int530 == 0)
            bool_11 = false;
        else
            bool_11 = true;

        Mesh mesh_12 = new Mesh(mesh_4, i_2 == 0 && !bool_5 && !bool_11, shortArray5 == null, shortArray3 == null, true);
        if (i_1 == 4 && i_2 > 3) {
            mesh_12.method625(256);
            mesh_12.method626(45, 0, -45);
        }

        i_2 &= 0x3;
        if (i_2 == 1)
            mesh_12.method622();
        else if (i_2 == 2)
            mesh_12.method623();
        else if (i_2 == 3)
            mesh_12.method624();

        if (shortArray5 != null)
            for (i_8 = 0; i_8 < shortArray5.length; i_8++)
                mesh_12.method627(shortArray5[i_8], shortArray2[i_8]);

        if (shortArray3 != null)
            for (i_8 = 0; i_8 < shortArray3.length; i_8++)
                mesh_12.method628(shortArray3[i_8], shortArray4[i_8]);

        if (bool_5)
            mesh_12.method630(int513, int526, int527);

        if (bool_11)
            mesh_12.method626(off, int529, int530);

        return mesh_12;
    }

    public final LocType method563() {
        int i_2 = -1;
        if (int533 != -1)
            i_2 = StaticClass44.staticMethod183(int533);
        else if (int528 != -1)
            i_2 = StaticClass44.staticIntArray68[int528];

        int i_3;
        if (i_2 >= 0 && i_2 < intArray86.length - 1)
            i_3 = intArray86[i_2];
        else
            i_3 = intArray86[intArray86.length - 1];

        return i_3 != -1 ? staticMethod411(i_3) : null;
    }

    public int getIntProperty(int i_1, int i_2) {
        return StaticClass46.staticMethod196(paramList2, i_1, i_2);
    }

    public String getStringProperty(int i_1, String string_2) {
        return StaticClass46.staticMethod197(paramList2, i_1, string_2);
    }

    public boolean method564() {
        if (intArray86 == null)
            return int534 != -1 || intArray87 != null;
        else {
            for (int i_2 = 0; i_2 < intArray86.length; i_2++)
                if (intArray86[i_2] != -1) {
                    LocType loctype_3 = staticMethod411(intArray86[i_2]);
                    if (loctype_3.int534 != -1 || loctype_3.intArray87 != null)
                        return true;
                }

            return false;
        }
    }

}


public class ObjType extends Cacheable {

    public static FontFace staticFontFace4;
    public static Cache staticCache24 = new Cache(64);
    public static Cache staticCache25 = new Cache(50);
    public static Cache staticCache26 = new Cache(200);
    public String name = "null";
    public int zoom2d = 2000;
    public int xan2d = 0;
    public int yan2d = 0;
    public int zan2d = 0;
    public int xof2d = 0;
    public int yof2d = 0;
    public int stackable = 0;
    public int cost = 1;
    public boolean members = false;
    public String[] op = new String[] { null, null, "Take", null, null };
    public String[] iop = new String[] { null, null, null, null, "Drop" };
    int int575 = -2;
    int manmodel1 = -1;
    int manmodel2 = -1;
    int int576 = 0;
    int womanmodel1 = -1;
    int womanmodel2 = -1;
    int int577 = 0;
    int manmodel3 = -1;
    int womanmodel3 = -1;
    int manhead = -1;
    int manhead2 = -1;
    int womanhead = -1;
    int womanhead2 = -1;
    public int certlink = -1;
    public int certtemplate = -1;
    int resizex = 128;
    int resizey = 128;
    int model = 128;
    public int ambient = 0;
    public int contrast = 0;
    public int team = 0;
    public boolean stockmarket = false;
    int boughtlink = -1;
    int boughttemplate = -1;
    public int int578 = -1;
    public int int579 = -1;
    public int int573;
    ParamList paramList4;
    int int574;
    short[] recol_s;
    short[] recol_d;
    short[] retex_s;
    short[] retex_d;
    int[] countobj;
    int[] countco;

    public static ObjType staticMethod421(int i_0) {
        ObjType objtype_2 = (ObjType) staticCache24.get(i_0);
        if (objtype_2 != null)
            return objtype_2;
        else {
            byte[] bytes_3 = ExchangeOfferComparator1.staticJs5Index2.getFile(10, i_0);
            objtype_2 = new ObjType();
            objtype_2.int573 = i_0;
            if (bytes_3 != null)
                objtype_2.decode(new Buffer(bytes_3));

            objtype_2.method584();
            if (objtype_2.certtemplate != -1)
                objtype_2.copyCert(staticMethod421(objtype_2.certtemplate), staticMethod421(objtype_2.certlink));

            if (objtype_2.boughttemplate != -1)
                objtype_2.method585(staticMethod421(objtype_2.boughttemplate), staticMethod421(objtype_2.boughtlink));

            if (objtype_2.int579 != -1)
                objtype_2.method586(staticMethod421(objtype_2.int579), staticMethod421(objtype_2.int578));

            if (!WM2.staticBool3 && objtype_2.members) {
                objtype_2.name = "Members object";
                objtype_2.stockmarket = false;
                objtype_2.op = null;
                objtype_2.iop = null;
                objtype_2.int575 = -1;
                objtype_2.team = 0;
                if (objtype_2.paramList4 != null) {
                    boolean bool_4 = false;

                    for (Node node_5 = objtype_2.paramList4.method250(); node_5 != null; node_5 = objtype_2.paramList4.method251()) {
                        ParamType paramtype_6 = ParamType.staticMethod435((int) node_5.id);
                        if (paramtype_6.autodisable)
                            node_5.unlink();
                        else
                            bool_4 = true;
                    }

                    if (!bool_4)
                        objtype_2.paramList4 = null;
                }
            }

            staticCache24.put(objtype_2, i_0);
            return objtype_2;
        }
    }

    void method584() {
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
            int574 = buffer_1.readUShort();
        else if (i_2 == 2)
            name = buffer_1.method448();
        else if (i_2 == 4)
            zoom2d = buffer_1.readUShort();
        else if (i_2 == 5)
            xan2d = buffer_1.readUShort();
        else if (i_2 == 6)
            yan2d = buffer_1.readUShort();
        else if (i_2 == 7) {
            xof2d = buffer_1.readUShort();
            if (xof2d > 32767)
                xof2d -= 65536;
        } else if (i_2 == 8) {
            yof2d = buffer_1.readUShort();
            if (yof2d > 32767)
                yof2d -= 65536;
        } else if (i_2 == 11)
            stackable = 1;
        else if (i_2 == 12)
            cost = buffer_1.readInt();
        else if (i_2 == 16)
            members = true;
        else if (i_2 == 23) {
            manmodel1 = buffer_1.readUShort();
            int576 = buffer_1.readUByte();
        } else if (i_2 == 24)
            manmodel2 = buffer_1.readUShort();
        else if (i_2 == 25) {
            womanmodel1 = buffer_1.readUShort();
            int577 = buffer_1.readUByte();
        } else if (i_2 == 26)
            womanmodel2 = buffer_1.readUShort();
        else if (i_2 >= 30 && i_2 < 35) {
            op[i_2 - 30] = buffer_1.method448();
            if (op[i_2 - 30].equalsIgnoreCase("Hidden"))
                op[i_2 - 30] = null;
        } else if (i_2 >= 35 && i_2 < 40)
            iop[i_2 - 35] = buffer_1.method448();
        else {
            int i_4;
            int i_5;
            if (i_2 == 40) {
                i_4 = buffer_1.readUByte();
                recol_s = new short[i_4];
                recol_d = new short[i_4];

                for (i_5 = 0; i_5 < i_4; i_5++) {
                    recol_s[i_5] = (short) buffer_1.readUShort();
                    recol_d[i_5] = (short) buffer_1.readUShort();
                }
            } else if (i_2 == 41) {
                i_4 = buffer_1.readUByte();
                retex_s = new short[i_4];
                retex_d = new short[i_4];

                for (i_5 = 0; i_5 < i_4; i_5++) {
                    retex_s[i_5] = (short) buffer_1.readUShort();
                    retex_d[i_5] = (short) buffer_1.readUShort();
                }
            } else if (i_2 == 42)
                int575 = buffer_1.method440();
            else if (i_2 == 65)
                stockmarket = true;
            else if (i_2 == 78)
                manmodel3 = buffer_1.readUShort();
            else if (i_2 == 79)
                womanmodel3 = buffer_1.readUShort();
            else if (i_2 == 90)
                manhead = buffer_1.readUShort();
            else if (i_2 == 91)
                womanhead = buffer_1.readUShort();
            else if (i_2 == 92)
                manhead2 = buffer_1.readUShort();
            else if (i_2 == 93)
                womanhead2 = buffer_1.readUShort();
            else if (i_2 == 95)
                zan2d = buffer_1.readUShort();
            else if (i_2 == 97)
                certlink = buffer_1.readUShort();
            else if (i_2 == 98)
                certtemplate = buffer_1.readUShort();
            else if (i_2 >= 100 && i_2 < 110) {
                if (countobj == null) {
                    countobj = new int[10];
                    countco = new int[10];
                }

                countobj[i_2 - 100] = buffer_1.readUShort();
                countco[i_2 - 100] = buffer_1.readUShort();
            } else if (i_2 == 110)
                resizex = buffer_1.readUShort();
            else if (i_2 == 111)
                resizey = buffer_1.readUShort();
            else if (i_2 == 112)
                model = buffer_1.readUShort();
            else if (i_2 == 113)
                ambient = buffer_1.method440();
            else if (i_2 == 114)
                contrast = buffer_1.method440() * 5;
            else if (i_2 == 115)
                team = buffer_1.readUByte();
            else if (i_2 == 139)
                boughtlink = buffer_1.readUShort();
            else if (i_2 == 140)
                boughttemplate = buffer_1.readUShort();
            else if (i_2 == 148)
                int578 = buffer_1.readUShort();
            else if (i_2 == 149)
                int579 = buffer_1.readUShort();
            else if (i_2 == 249)
                paramList4 = StaticClass46.staticMethod195(buffer_1, paramList4);
        }

    }

    void copyCert(ObjType objtype_1, ObjType objtype_2) {
        int574 = objtype_1.int574;
        zoom2d = objtype_1.zoom2d;
        xan2d = objtype_1.xan2d;
        yan2d = objtype_1.yan2d;
        zan2d = objtype_1.zan2d;
        xof2d = objtype_1.xof2d;
        yof2d = objtype_1.yof2d;
        recol_s = objtype_1.recol_s;
        recol_d = objtype_1.recol_d;
        retex_s = objtype_1.retex_s;
        retex_d = objtype_1.retex_d;
        name = objtype_2.name;
        members = objtype_2.members;
        cost = objtype_2.cost;
        stackable = 1;
    }

    void method585(ObjType objtype_1, ObjType objtype_2) {
        int574 = objtype_1.int574;
        zoom2d = objtype_1.zoom2d;
        xan2d = objtype_1.xan2d;
        yan2d = objtype_1.yan2d;
        zan2d = objtype_1.zan2d;
        xof2d = objtype_1.xof2d;
        yof2d = objtype_1.yof2d;
        recol_s = objtype_2.recol_s;
        recol_d = objtype_2.recol_d;
        retex_s = objtype_2.retex_s;
        retex_d = objtype_2.retex_d;
        name = objtype_2.name;
        members = objtype_2.members;
        stackable = objtype_2.stackable;
        manmodel1 = objtype_2.manmodel1;
        manmodel2 = objtype_2.manmodel2;
        manmodel3 = objtype_2.manmodel3;
        womanmodel1 = objtype_2.womanmodel1;
        womanmodel2 = objtype_2.womanmodel2;
        womanmodel3 = objtype_2.womanmodel3;
        manhead = objtype_2.manhead;
        manhead2 = objtype_2.manhead2;
        womanhead = objtype_2.womanhead;
        womanhead2 = objtype_2.womanhead2;
        team = objtype_2.team;
        op = objtype_2.op;
        iop = new String[5];
        if (objtype_2.iop != null)
            for (int i_4 = 0; i_4 < 4; i_4++)
                iop[i_4] = objtype_2.iop[i_4];

        iop[4] = "Discard";
        cost = 0;
    }

    void method586(ObjType objtype_1, ObjType objtype_2) {
        int574 = objtype_1.int574;
        zoom2d = objtype_1.zoom2d;
        xan2d = objtype_1.xan2d;
        yan2d = objtype_1.yan2d;
        zan2d = objtype_1.zan2d;
        xof2d = objtype_1.xof2d;
        yof2d = objtype_1.yof2d;
        recol_s = objtype_1.recol_s;
        recol_d = objtype_1.recol_d;
        retex_s = objtype_1.retex_s;
        retex_d = objtype_1.retex_d;
        stackable = objtype_1.stackable;
        name = objtype_2.name;
        cost = 0;
        members = false;
        stockmarket = false;
    }

    public final Mesh method587(int i_1) {
        int i_4;
        if (countobj != null && i_1 > 1) {
            int i_3 = -1;

            for (i_4 = 0; i_4 < 10; i_4++)
                if (i_1 >= countco[i_4] && countco[i_4] != 0)
                    i_3 = countobj[i_4];

            if (i_3 != -1)
                return staticMethod421(i_3).method587(1);
        }

        Mesh mesh_5 = Mesh.staticMethod466(Class5.staticJs5Index1, int574, 0);
        if (mesh_5 == null)
            return null;
        else {
            if (resizex != 128 || resizey != 128 || model != 128)
                mesh_5.method630(resizex, resizey, model);

            if (recol_s != null)
                for (i_4 = 0; i_4 < recol_s.length; i_4++)
                    mesh_5.method627(recol_s[i_4], recol_d[i_4]);

            if (retex_s != null)
                for (i_4 = 0; i_4 < retex_s.length; i_4++)
                    mesh_5.method628(retex_s[i_4], retex_d[i_4]);

            return mesh_5;
        }
    }

    public final Model getModelForQuantity(int i_1) {
        if (countobj != null && i_1 > 1) {
            int i_3 = -1;

            for (int i_4 = 0; i_4 < 10; i_4++)
                if (i_1 >= countco[i_4] && countco[i_4] != 0)
                    i_3 = countobj[i_4];

            if (i_3 != -1)
                return staticMethod421(i_3).getModelForQuantity(1);
        }

        Model model_6 = (Model) staticCache25.get(int573);
        if (model_6 != null)
            return model_6;
        else {
            Mesh mesh_7 = Mesh.staticMethod466(Class5.staticJs5Index1, int574, 0);
            if (mesh_7 == null)
                return null;
            else {
                if (resizex != 128 || resizey != 128 || model != 128)
                    mesh_7.method630(resizex, resizey, model);

                int i_5;
                if (recol_s != null)
                    for (i_5 = 0; i_5 < recol_s.length; i_5++)
                        mesh_7.method627(recol_s[i_5], recol_d[i_5]);

                if (retex_s != null)
                    for (i_5 = 0; i_5 < retex_s.length; i_5++)
                        mesh_7.method628(retex_s[i_5], retex_d[i_5]);

                model_6 = mesh_7.method634(ambient + 64, contrast + 768, -50, -10, -50);
                model_6.bool75 = true;
                staticCache25.put(model_6, int573);
                return model_6;
            }
        }
    }

    public ObjType method588(int i_1) {
        if (countobj != null && i_1 > 1) {
            int i_3 = -1;

            for (int i_4 = 0; i_4 < 10; i_4++)
                if (i_1 >= countco[i_4] && countco[i_4] != 0)
                    i_3 = countobj[i_4];

            if (i_3 != -1)
                return staticMethod421(i_3);
        }

        return this;
    }

    public static final Sprite staticMethod422(int i_0, int i_1, int i_2, int i_3, int i_4, boolean bool_5) {
        if (i_1 == -1)
            i_4 = 0;
        else if (i_4 == 2 && i_1 != 1)
            i_4 = 1;

        long long_7 = i_0 + ((long) i_1 << 16) + ((long) i_2 << 38) + ((long) i_4 << 40) + ((long) i_3 << 42);
        Sprite sprite_9;
        if (!bool_5) {
            sprite_9 = (Sprite) staticCache26.get(long_7);
            if (sprite_9 != null)
                return sprite_9;
        }

        ObjType objtype_10 = staticMethod421(i_0);
        if (i_1 > 1 && objtype_10.countobj != null) {
            int i_11 = -1;

            for (int i_12 = 0; i_12 < 10; i_12++)
                if (i_1 >= objtype_10.countco[i_12] && objtype_10.countco[i_12] != 0)
                    i_11 = objtype_10.countobj[i_12];

            if (i_11 != -1)
                objtype_10 = staticMethod421(i_11);
        }

        Model model_22 = objtype_10.getModelForQuantity(1);
        if (model_22 == null)
            return null;
        else {
            Sprite sprite_23 = null;
            if (objtype_10.certtemplate != -1) {
                sprite_23 = staticMethod422(objtype_10.certlink, 10, 1, 0, 0, true);
                if (sprite_23 == null)
                    return null;
            } else if (objtype_10.boughttemplate != -1) {
                sprite_23 = staticMethod422(objtype_10.boughtlink, i_1, i_2, i_3, 0, false);
                if (sprite_23 == null)
                    return null;
            } else if (objtype_10.int579 != -1) {
                sprite_23 = staticMethod422(objtype_10.int578, i_1, 0, 0, 0, false);
                if (sprite_23 == null)
                    return null;
            }

            int[] ints_13 = Rasterizer2D.staticIntArray130;
            int i_14 = Rasterizer2D.staticInt312;
            int i_15 = Rasterizer2D.staticInt313;
            int[] ints_16 = new int[4];
            Rasterizer2D.staticMethod444(ints_16);
            sprite_9 = new Sprite(36, 32);
            Rasterizer2D.staticMethod440(sprite_9.pixels, 36, 32);
            Rasterizer2D.staticMethod446();
            Rasterizer3D.staticMethod470();
            Rasterizer3D.staticMethod473(16, 16);
            Rasterizer3D.staticBool53 = false;
            if (objtype_10.int579 != -1)
                sprite_23.method684(0, 0);

            int i_17 = objtype_10.zoom2d;
            if (bool_5)
                i_17 = (int) (1.5D * i_17);
            else if (i_2 == 2)
                i_17 = (int) (i_17 * 1.04D);

            int i_18 = Rasterizer3D.staticIntArray156[objtype_10.xan2d] * i_17 >> 16;
            int i_19 = Rasterizer3D.staticIntArray159[objtype_10.xan2d] * i_17 >> 16;
            model_22.method640();
            model_22.method653(0, objtype_10.yan2d, objtype_10.zan2d, objtype_10.xan2d, objtype_10.xof2d, i_18 + model_22.modelHeight / 2 + objtype_10.yof2d, i_19 + objtype_10.yof2d);
            if (objtype_10.boughttemplate != -1)
                sprite_23.method684(0, 0);

            if (i_2 >= 1)
                sprite_9.method681(1);

            if (i_2 >= 2)
                sprite_9.method681(16777215);

            if (i_3 != 0)
                sprite_9.method682(i_3);

            Rasterizer2D.staticMethod440(sprite_9.pixels, 36, 32);
            if (objtype_10.certtemplate != -1)
                sprite_23.method684(0, 0);

            if (i_4 == 1 || i_4 == 2 && objtype_10.stackable == 1) {
                FontFace fontface_20 = staticFontFace4;
                String string_21;
                if (i_1 < 100000)
                    string_21 = "<col=ffff00>" + i_1 + "</col>";
                else if (i_1 < 10000000)
                    string_21 = "<col=ffffff>" + i_1 / 1000 + "K" + "</col>";
                else
                    string_21 = "<col=00ff80>" + i_1 / 1000000 + "M" + "</col>";

                fontface_20.method664(string_21, 0, 9, 16776960, 1);
            }

            if (!bool_5)
                staticCache26.put(sprite_9, long_7);

            Rasterizer2D.staticMethod440(ints_13, i_14, i_15);
            Rasterizer2D.staticMethod445(ints_16);
            Rasterizer3D.staticMethod470();
            Rasterizer3D.staticBool53 = true;
            return sprite_9;
        }
    }

    public final boolean method589(boolean bool_1) {
        int i_3 = manmodel1;
        int i_4 = manmodel2;
        int i_5 = manmodel3;
        if (bool_1) {
            i_3 = womanmodel1;
            i_4 = womanmodel2;
            i_5 = womanmodel3;
        }

        if (i_3 == -1)
            return true;
        else {
            boolean bool_6 = true;
            if (!Class5.staticJs5Index1.contains(i_3, 0))
                bool_6 = false;

            if (i_4 != -1 && !Class5.staticJs5Index1.contains(i_4, 0))
                bool_6 = false;

            if (i_5 != -1 && !Class5.staticJs5Index1.contains(i_5, 0))
                bool_6 = false;

            return bool_6;
        }
    }

    public final Mesh method590(boolean bool_1) {
        int i_3 = manmodel1;
        int i_4 = manmodel2;
        int i_5 = manmodel3;
        if (bool_1) {
            i_3 = womanmodel1;
            i_4 = womanmodel2;
            i_5 = womanmodel3;
        }

        if (i_3 == -1)
            return null;
        else {
            Mesh mesh_6 = Mesh.staticMethod466(Class5.staticJs5Index1, i_3, 0);
            if (i_4 != -1) {
                Mesh mesh_7 = Mesh.staticMethod466(Class5.staticJs5Index1, i_4, 0);
                if (i_5 != -1) {
                    Mesh mesh_8 = Mesh.staticMethod466(Class5.staticJs5Index1, i_5, 0);
                    Mesh[] arr_9 = new Mesh[] { mesh_6, mesh_7, mesh_8 };
                    mesh_6 = new Mesh(arr_9, 3);
                } else {
                    Mesh[] arr_11 = new Mesh[] { mesh_6, mesh_7 };
                    mesh_6 = new Mesh(arr_11, 2);
                }
            }

            if (!bool_1 && int576 != 0)
                mesh_6.method626(0, int576, 0);

            if (bool_1 && int577 != 0)
                mesh_6.method626(0, int577, 0);

            int i_10;
            if (recol_s != null)
                for (i_10 = 0; i_10 < recol_s.length; i_10++)
                    mesh_6.method627(recol_s[i_10], recol_d[i_10]);

            if (retex_s != null)
                for (i_10 = 0; i_10 < retex_s.length; i_10++)
                    mesh_6.method628(retex_s[i_10], retex_d[i_10]);

            return mesh_6;
        }
    }

    public final boolean method591(boolean bool_1) {
        int i_3 = manhead;
        int i_4 = manhead2;
        if (bool_1) {
            i_3 = womanhead;
            i_4 = womanhead2;
        }

        if (i_3 == -1)
            return true;
        else {
            boolean bool_5 = true;
            if (!Class5.staticJs5Index1.contains(i_3, 0))
                bool_5 = false;

            if (i_4 != -1 && !Class5.staticJs5Index1.contains(i_4, 0))
                bool_5 = false;

            return bool_5;
        }
    }

    public final Mesh method592(boolean bool_1) {
        int i_3 = manhead;
        int i_4 = manhead2;
        if (bool_1) {
            i_3 = womanhead;
            i_4 = womanhead2;
        }

        if (i_3 == -1)
            return null;
        else {
            Mesh mesh_5 = Mesh.staticMethod466(Class5.staticJs5Index1, i_3, 0);
            if (i_4 != -1) {
                Mesh mesh_6 = Mesh.staticMethod466(Class5.staticJs5Index1, i_4, 0);
                Mesh[] arr_7 = new Mesh[] { mesh_5, mesh_6 };
                mesh_5 = new Mesh(arr_7, 2);
            }

            int i_8;
            if (recol_s != null)
                for (i_8 = 0; i_8 < recol_s.length; i_8++)
                    mesh_5.method627(recol_s[i_8], recol_d[i_8]);

            if (retex_s != null)
                for (i_8 = 0; i_8 < retex_s.length; i_8++)
                    mesh_5.method628(retex_s[i_8], retex_d[i_8]);

            return mesh_5;
        }
    }

    public int getIntProperty(int i_1, int i_2) {
        return StaticClass46.staticMethod196(paramList4, i_1, i_2);
    }

    public String getStringProperty(int i_1, String string_2) {
        return StaticClass46.staticMethod197(paramList4, i_1, string_2);
    }

    public int method593() {
        return int575 != -1 && iop != null ? int575 >= 0 ? iop[int575] != null ? int575 : -1 : "Drop".equalsIgnoreCase(iop[4]) ? 4 : -1 : -1;
    }

}

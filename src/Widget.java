
public class Widget extends Node {

    public static boolean[] staticBoolArray11;
    public static Js5Index staticJs5Index8;
    public Object[] objectArray2;
    public static Js5Index staticJs5Index9;
    public Object[] objectArray4;
    public Widget[] widgetArray1;
    public Object[] objectArray19;
    public Object[] objectArray20;
    public Object[] objectArray22;
    public Object[] objectArray23;
    public Object[] objectArray24;
    public Object[] objectArray25;
    public Object[] objectArray26;
    public Object[] objectArray27;
    public static Js5Index staticJs5Index10;
    public boolean bool34 = false;
    public int int444 = -1;
    public int int394 = -1;
    public int int395 = 0;
    public int int396 = 0;
    public int int390 = 0;
    public int int398 = 0;
    public int int399 = 0;
    public int int400 = 0;
    public int int401 = 0;
    public int int402 = 0;
    public int int403 = 0;
    public int int404 = 0;
    public int int405 = 0;
    public int int410 = 0;
    public int int406 = 0;
    public int int407 = 0;
    public int int408 = 1;
    public int int392 = 1;
    public int parentId = -1;
    public boolean hidden = false;
    public int int419 = 0;
    public int int451 = 0;
    public int int413 = 0;
    public int int411 = 0;
    public int int393 = 0;
    public int int454 = 0;
    public int int414 = 0;
    public int int415 = 0;
    public boolean bool32 = false;
    public Class8 class8_1;
    public int int416;
    public int int417;
    public int int424;
    public boolean bool39;
    public int int440;
    public int int412;
    public int int446;
    public boolean bool36;
    public int int420;
    public int int450;
    public int int423;
    public int int409;
    int int425;
    int int447;
    public int int391;
    public int int426;
    public int int427;
    public int int428;
    public int int429;
    public int int430;
    public int int442;
    public int int397;
    public int int432;
    public int int433;
    public boolean bool38;
    public int int434;
    public int int435;
    public String string25;
    public String string23;
    public int int437;
    public int int438;
    public int int439;
    public boolean bool43;
    public int int422;
    public int int441;
    public int int418;
    public String string24;
    public Widget widget3;
    public int int443;
    public int int448;
    public boolean bool40;
    public String string26;
    public boolean bool42;
    public int int445;
    public String string28;
    public String string27;
    public int int453;
    public int int456;
    public int int452;
    public int int455;
    public boolean bool35;
    public boolean bool41;
    public int int421;
    public int int449;
    public int int431;
    public int int436;
    public int int457;
    public int int458;
    public boolean bool44;
    public boolean bool45;
    static Cache staticCache2 = new Cache(200);
    static Cache staticCache4 = new Cache(50);
    static Cache staticCache3 = new Cache(20);
    static Cache staticCache5 = new Cache(8);
    public static boolean staticBool49 = false;
    public int type;
    public int[] intArray58;
    public int[] intArray51;
    public int[][] intArrayArray12;
    public int[] intArray57;
    public int[] intArray59;
    public int[] intArray52;
    public int[] intArray53;
    public int[] intArray54;
    public String[] stringArray4;
    public boolean bool37;
    public String[] stringArray3;
    public boolean bool33;
    public Object[] objectArray7;
    public Object[] objectArray10;
    public Object[] objectArray29;
    public Object[] objectArray15;
    public Object[] objectArray14;
    public Object[] objectArray16;
    public Object[] objectArray17;
    public Object[] objectArray6;
    public Object[] objectArray5;
    public Object[] objectArray18;
    public Object[] objectArray11;
    public Object[] objectArray3;
    public Object[] objectArray8;
    public Object[] objectArray9;
    public Object[] objectArray28;
    public Object[] objectArray12;
    public Object[] objectArray13;
    public Object[] objectArray21;
    public int[] intArray55;
    public int[] intArray60;
    public int[] intArray56;

    public Widget() {
        class8_1 = Class8.staticClass8_2;
        int416 = 0;
        int417 = 0;
        int424 = 1;
        bool39 = false;
        int440 = -1;
        int412 = -1;
        int446 = 0;
        bool36 = false;
        int420 = 0;
        int450 = 0;
        int423 = 1;
        int409 = -1;
        int425 = 1;
        int447 = -1;
        int391 = -1;
        int426 = -1;
        int427 = 0;
        int428 = 0;
        int429 = 0;
        int430 = 0;
        int442 = 0;
        int397 = 100;
        int432 = 0;
        int433 = 0;
        bool38 = false;
        int434 = 2;
        int435 = -1;
        string25 = "";
        string23 = "";
        int437 = 0;
        int438 = 0;
        int439 = 0;
        bool43 = false;
        int422 = 0;
        int441 = 0;
        int418 = 0;
        string24 = "";
        widget3 = null;
        int443 = 0;
        int448 = 0;
        bool40 = false;
        string26 = "";
        bool42 = false;
        int445 = -1;
        string28 = "";
        string27 = "Ok";
        int453 = -1;
        int456 = 0;
        int452 = 0;
        int455 = 0;
        bool35 = false;
        bool41 = false;
        int421 = -1;
        int449 = 0;
        int431 = 0;
        int436 = 0;
        int457 = -1;
        int458 = -1;
        bool44 = false;
        bool45 = false;
    }

    public static Widget staticMethod381(int i_0) {
        int i_2 = i_0 >> 16;
        int i_3 = i_0 & 0xffff;
        if (StaticClass25.staticWidgetArrayArray1[i_2] == null || StaticClass25.staticWidgetArrayArray1[i_2][i_3] == null) {
            boolean bool_4 = staticMethod383(i_2);
            if (!bool_4)
                return null;
        }

        return StaticClass25.staticWidgetArrayArray1[i_2][i_3];
    }

    public static Widget staticMethod382(int i_0, int i_1) {
        Widget widget_3 = staticMethod381(i_0);
        return i_1 == -1 ? widget_3 : widget_3 != null && widget_3.widgetArray1 != null && i_1 < widget_3.widgetArray1.length ? widget_3.widgetArray1[i_1] : null;
    }

    public static boolean staticMethod383(int i_0) {
        if (staticBoolArray11[i_0])
            return true;
        else if (!AnimTransform.staticJs5Index7.method306(i_0))
            return false;
        else {
            int i_2 = AnimTransform.staticJs5Index7.numFiles(i_0);
            if (i_2 == 0) {
                staticBoolArray11[i_0] = true;
                return true;
            } else {
                if (StaticClass25.staticWidgetArrayArray1[i_0] == null)
                    StaticClass25.staticWidgetArrayArray1[i_0] = new Widget[i_2];

                for (int i_3 = 0; i_3 < i_2; i_3++)
                    if (StaticClass25.staticWidgetArrayArray1[i_0][i_3] == null) {
                        byte[] bytes_4 = AnimTransform.staticJs5Index7.getFile(i_0, i_3);
                        if (bytes_4 != null) {
                            StaticClass25.staticWidgetArrayArray1[i_0][i_3] = new Widget();
                            StaticClass25.staticWidgetArrayArray1[i_0][i_3].int444 = i_3 + (i_0 << 16);
                            if (bytes_4[0] == -1)
                                StaticClass25.staticWidgetArrayArray1[i_0][i_3].method496(new Buffer(bytes_4));
                            else
                                StaticClass25.staticWidgetArrayArray1[i_0][i_3].method495(new Buffer(bytes_4));
                        }
                    }

                staticBoolArray11[i_0] = true;
                return true;
            }
        }
    }

    public static void staticMethod384(int i_0) {
        if (i_0 != -1)
            if (staticBoolArray11[i_0]) {
                AnimTransform.staticJs5Index7.clearGroup(i_0);
                if (StaticClass25.staticWidgetArrayArray1[i_0] != null) {
                    boolean bool_2 = true;

                    for (int i_3 = 0; i_3 < StaticClass25.staticWidgetArrayArray1[i_0].length; i_3++)
                        if (StaticClass25.staticWidgetArrayArray1[i_0][i_3] != null)
                            if (StaticClass25.staticWidgetArrayArray1[i_0][i_3].type != 2)
                                StaticClass25.staticWidgetArrayArray1[i_0][i_3] = null;
                            else
                                bool_2 = false;

                    if (bool_2)
                        StaticClass25.staticWidgetArrayArray1[i_0] = null;

                    staticBoolArray11[i_0] = false;
                }
            }
    }

    void method495(Buffer buffer_1) {
        bool34 = false;
        type = buffer_1.readUByte();
        int395 = buffer_1.readUByte();
        int396 = buffer_1.readUShort();
        int401 = buffer_1.readShort();
        int402 = buffer_1.readShort();
        int403 = buffer_1.readUShort();
        int404 = buffer_1.readUShort();
        int416 = buffer_1.readUByte();
        parentId = buffer_1.readUShort();
        if (parentId == 65535)
            parentId = -1;
        else
            parentId += int444 & ~0xffff;

        int445 = buffer_1.readUShort();
        if (int445 == 65535)
            int445 = -1;

        int i_3 = buffer_1.readUByte();
        int i_4;
        if (i_3 > 0) {
            intArray58 = new int[i_3];
            intArray51 = new int[i_3];

            for (i_4 = 0; i_4 < i_3; i_4++) {
                intArray58[i_4] = buffer_1.readUByte();
                intArray51[i_4] = buffer_1.readUShort();
            }
        }

        i_4 = buffer_1.readUByte();
        int i_5;
        int i_6;
        int i_7;
        if (i_4 > 0) {
            intArrayArray12 = new int[i_4][];

            for (i_5 = 0; i_5 < i_4; i_5++) {
                i_6 = buffer_1.readUShort();
                intArrayArray12[i_5] = new int[i_6];

                for (i_7 = 0; i_7 < i_6; i_7++) {
                    intArrayArray12[i_5][i_7] = buffer_1.readUShort();
                    if (intArrayArray12[i_5][i_7] == 65535)
                        intArrayArray12[i_5][i_7] = -1;
                }
            }
        }

        if (type == 0) {
            int411 = buffer_1.readUShort();
            hidden = buffer_1.readUByte() == 1;
        }

        if (type == 1) {
            buffer_1.readUShort();
            buffer_1.readUByte();
        }

        if (type == 2) {
            intArray57 = new int[int404 * int403];
            intArray59 = new int[int403 * int404];
            i_5 = buffer_1.readUByte();
            if (i_5 == 1)
                int418 |= 0x10000000;

            i_6 = buffer_1.readUByte();
            if (i_6 == 1)
                int418 |= 0x40000000;

            i_7 = buffer_1.readUByte();
            if (i_7 == 1)
                int418 |= ~0x7fffffff;

            int i_8 = buffer_1.readUByte();
            if (i_8 == 1)
                int418 |= 0x20000000;

            int422 = buffer_1.readUByte();
            int441 = buffer_1.readUByte();
            intArray52 = new int[20];
            intArray53 = new int[20];
            intArray54 = new int[20];

            int i_9;
            for (i_9 = 0; i_9 < 20; i_9++) {
                int i_10 = buffer_1.readUByte();
                if (i_10 == 1) {
                    intArray52[i_9] = buffer_1.readShort();
                    intArray53[i_9] = buffer_1.readShort();
                    intArray54[i_9] = buffer_1.readInt();
                } else
                    intArray54[i_9] = -1;
            }

            stringArray4 = new String[5];

            for (i_9 = 0; i_9 < 5; i_9++) {
                String string_12 = buffer_1.method448();
                if (string_12.length() > 0) {
                    stringArray4[i_9] = string_12;
                    int418 |= 1 << i_9 + 23;
                }
            }
        }

        if (type == 3)
            bool32 = buffer_1.readUByte() == 1;

        if (type == 4 || type == 1) {
            int438 = buffer_1.readUByte();
            int439 = buffer_1.readUByte();
            int437 = buffer_1.readUByte();
            int435 = buffer_1.readUShort();
            if (int435 == 65535)
                int435 = -1;

            bool43 = buffer_1.readUByte() == 1;
        }

        if (type == 4) {
            string25 = buffer_1.method448();
            string23 = buffer_1.method448();
        }

        if (type == 1 || type == 3 || type == 4)
            int393 = buffer_1.readInt();

        if (type == 3 || type == 4) {
            int454 = buffer_1.readInt();
            int414 = buffer_1.readInt();
            int415 = buffer_1.readInt();
        }

        if (type == 5) {
            int440 = buffer_1.readInt();
            int412 = buffer_1.readInt();
        }

        if (type == 6) {
            int423 = 1;
            int409 = buffer_1.readUShort();
            if (int409 == 65535)
                int409 = -1;

            int425 = 1;
            int447 = buffer_1.readUShort();
            if (int447 == 65535)
                int447 = -1;

            int391 = buffer_1.readUShort();
            if (int391 == 65535)
                int391 = -1;

            int426 = buffer_1.readUShort();
            if (int426 == 65535)
                int426 = -1;

            int397 = buffer_1.readUShort();
            int429 = buffer_1.readUShort();
            int430 = buffer_1.readUShort();
        }

        if (type == 7) {
            intArray57 = new int[int403 * int404];
            intArray59 = new int[int404 * int403];
            int438 = buffer_1.readUByte();
            int435 = buffer_1.readUShort();
            if (int435 == 65535)
                int435 = -1;

            bool43 = buffer_1.readUByte() == 1;
            int393 = buffer_1.readInt();
            int422 = buffer_1.readShort();
            int441 = buffer_1.readShort();
            i_5 = buffer_1.readUByte();
            if (i_5 == 1)
                int418 |= 0x40000000;

            stringArray4 = new String[5];

            for (i_6 = 0; i_6 < 5; i_6++) {
                String string_11 = buffer_1.method448();
                if (string_11.length() > 0) {
                    stringArray4[i_6] = string_11;
                    int418 |= 1 << i_6 + 23;
                }
            }
        }

        if (type == 8)
            string25 = buffer_1.method448();

        if (int395 == 2 || type == 2) {
            string26 = buffer_1.method448();
            string28 = buffer_1.method448();
            i_5 = buffer_1.readUShort() & 0x3f;
            int418 |= i_5 << 11;
        }

        if (int395 == 1 || int395 == 4 || int395 == 5 || int395 == 6) {
            string27 = buffer_1.method448();
            if (string27.length() == 0) {
                if (int395 == 1)
                    string27 = "Ok";

                if (int395 == 4)
                    string27 = "Select";

                if (int395 == 5)
                    string27 = "Select";

                if (int395 == 6)
                    string27 = "Continue";
            }
        }

        if (int395 == 1 || int395 == 4 || int395 == 5)
            int418 |= 0x400000;

        if (int395 == 6)
            int418 |= 0x1;

    }

    void method496(Buffer buffer_1) {
        buffer_1.readUByte();
        bool34 = true;
        type = buffer_1.readUByte();
        int396 = buffer_1.readUShort();
        int401 = buffer_1.readShort();
        int402 = buffer_1.readShort();
        int403 = buffer_1.readUShort();
        if (type == 9)
            int404 = buffer_1.readShort();
        else
            int404 = buffer_1.readUShort();

        int399 = buffer_1.method440();
        int400 = buffer_1.method440();
        int390 = buffer_1.method440();
        int398 = buffer_1.method440();
        parentId = buffer_1.readUShort();
        if (parentId == 65535)
            parentId = -1;
        else
            parentId += int444 & ~0xffff;

        hidden = buffer_1.readUByte() == 1;
        if (type == 0) {
            int413 = buffer_1.readUShort();
            int411 = buffer_1.readUShort();
            bool44 = buffer_1.readUByte() == 1;
        }

        if (type == 5) {
            int440 = buffer_1.readInt();
            int446 = buffer_1.readUShort();
            bool36 = buffer_1.readUByte() == 1;
            int416 = buffer_1.readUByte();
            int420 = buffer_1.readUByte();
            int450 = buffer_1.readInt();
            bool37 = buffer_1.readUByte() == 1;
            bool33 = buffer_1.readUByte() == 1;
        }

        if (type == 6) {
            int423 = 1;
            int409 = buffer_1.readUShort();
            if (int409 == 65535)
                int409 = -1;

            int427 = buffer_1.readShort();
            int428 = buffer_1.readShort();
            int429 = buffer_1.readUShort();
            int430 = buffer_1.readUShort();
            int442 = buffer_1.readUShort();
            int397 = buffer_1.readUShort();
            int391 = buffer_1.readUShort();
            if (int391 == 65535)
                int391 = -1;

            bool38 = buffer_1.readUByte() == 1;
            buffer_1.readUShort();
            if (int399 != 0)
                int432 = buffer_1.readUShort();

            if (int400 != 0)
                buffer_1.readUShort();
        }

        if (type == 4) {
            int435 = buffer_1.readUShort();
            if (int435 == 65535)
                int435 = -1;

            string25 = buffer_1.method448();
            int437 = buffer_1.readUByte();
            int438 = buffer_1.readUByte();
            int439 = buffer_1.readUByte();
            bool43 = buffer_1.readUByte() == 1;
            int393 = buffer_1.readInt();
        }

        if (type == 3) {
            int393 = buffer_1.readInt();
            bool32 = buffer_1.readUByte() == 1;
            int416 = buffer_1.readUByte();
        }

        if (type == 9) {
            int424 = buffer_1.readUByte();
            int393 = buffer_1.readInt();
            bool39 = buffer_1.readUByte() == 1;
        }

        int418 = buffer_1.method443();
        string24 = buffer_1.method448();
        int i_3 = buffer_1.readUByte();
        if (i_3 > 0) {
            stringArray3 = new String[i_3];

            for (int i_4 = 0; i_4 < i_3; i_4++)
                stringArray3[i_4] = buffer_1.method448();
        }

        int443 = buffer_1.readUByte();
        int448 = buffer_1.readUByte();
        bool40 = buffer_1.readUByte() == 1;
        string26 = buffer_1.method448();
        objectArray7 = method497(buffer_1);
        objectArray10 = method497(buffer_1);
        objectArray29 = method497(buffer_1);
        objectArray15 = method497(buffer_1);
        objectArray14 = method497(buffer_1);
        objectArray16 = method497(buffer_1);
        objectArray17 = method497(buffer_1);
        objectArray6 = method497(buffer_1);
        objectArray5 = method497(buffer_1);
        objectArray18 = method497(buffer_1);
        objectArray11 = method497(buffer_1);
        objectArray3 = method497(buffer_1);
        objectArray8 = method497(buffer_1);
        objectArray9 = method497(buffer_1);
        objectArray28 = method497(buffer_1);
        objectArray12 = method497(buffer_1);
        objectArray13 = method497(buffer_1);
        objectArray21 = method497(buffer_1);
        intArray55 = method498(buffer_1);
        intArray60 = method498(buffer_1);
        intArray56 = method498(buffer_1);
    }

    Object[] method497(Buffer buffer_1) {
        int i_3 = buffer_1.readUByte();
        if (i_3 == 0)
            return null;
        else {
            Object[] arr_4 = new Object[i_3];

            for (int i_5 = 0; i_5 < i_3; i_5++) {
                int i_6 = buffer_1.readUByte();
                if (i_6 == 0)
                    arr_4[i_5] = new Integer(buffer_1.readInt());
                else if (i_6 == 1)
                    arr_4[i_5] = buffer_1.method448();
            }

            bool42 = true;
            return arr_4;
        }
    }

    int[] method498(Buffer buffer_1) {
        int i_3 = buffer_1.readUByte();
        if (i_3 == 0)
            return null;
        else {
            int[] ints_4 = new int[i_3];

            for (int i_5 = 0; i_5 < i_3; i_5++)
                ints_4[i_5] = buffer_1.readInt();

            return ints_4;
        }
    }

    public void method499(int i_1, int i_2) {
        int i_4 = intArray57[i_2];
        intArray57[i_2] = intArray57[i_1];
        intArray57[i_1] = i_4;
        i_4 = intArray59[i_2];
        intArray59[i_2] = intArray59[i_1];
        intArray59[i_1] = i_4;
    }

    public Sprite method500(boolean bool_1) {
        staticBool49 = false;
        int i_3;
        if (bool_1)
            i_3 = int412;
        else
            i_3 = int440;

        if (i_3 == -1)
            return null;
        else {
            long long_4 = ((bool33 ? 1L : 0L) << 39) + ((bool37 ? 1L : 0L) << 38) + ((long) int420 << 36) + i_3 + ((long) int450 << 40);
            Sprite sprite_6 = (Sprite) staticCache2.get(long_4);
            if (sprite_6 != null)
                return sprite_6;
            else {
                sprite_6 = StaticClass59.staticMethod233(staticJs5Index9, i_3, 0);
                if (sprite_6 == null) {
                    staticBool49 = true;
                    return null;
                } else {
                    if (bool37)
                        sprite_6.method680();

                    if (bool33)
                        sprite_6.method679();

                    if (int420 > 0)
                        sprite_6.method678(int420);

                    if (int420 >= 1)
                        sprite_6.method681(1);

                    if (int420 >= 2)
                        sprite_6.method681(16777215);

                    if (int450 != 0)
                        sprite_6.method682(int450);

                    staticCache2.put(sprite_6, long_4);
                    return sprite_6;
                }
            }
        }
    }

    public FontFace method501() {
        staticBool49 = false;
        if (int435 == -1)
            return null;
        else {
            FontFace fontface_2 = (FontFace) staticCache3.get(int435);
            if (fontface_2 != null)
                return fontface_2;
            else {
                Js5Index js5index_4 = staticJs5Index9;
                Js5Index js5index_5 = staticJs5Index8;
                int i_6 = int435;
                FontFace fontface_3;
                if (!StaticClass59.staticMethod242(js5index_4, i_6, 0))
                    fontface_3 = null;
                else {
                    byte[] bytes_8 = js5index_5.getFile(i_6, 0);
                    FontFace fontface_7;
                    if (bytes_8 == null)
                        fontface_7 = null;
                    else {
                        FontFace fontface_9 = new FontFace(bytes_8, StaticClass59.staticIntArray74, World.staticIntArray17, Js5Worker.staticIntArray70, Js5CacheWriteRequest.staticIntArray127, StaticClass18.staticIntArray58, Mus5Sub4.staticByteArrayArray6);
                        StaticClass59.staticMethod245();
                        fontface_7 = fontface_9;
                    }

                    fontface_3 = fontface_7;
                }

                if (fontface_3 != null)
                    staticCache3.put(fontface_3, int435);
                else
                    staticBool49 = true;

                return fontface_3;
            }
        }
    }

    public Sprite method502(int i_1) {
        staticBool49 = false;
        if (i_1 >= 0 && i_1 < intArray54.length) {
            int i_3 = intArray54[i_1];
            if (i_3 == -1)
                return null;
            else {
                Sprite sprite_4 = (Sprite) staticCache2.get(i_3);
                if (sprite_4 != null)
                    return sprite_4;
                else {
                    sprite_4 = StaticClass59.staticMethod233(staticJs5Index9, i_3, 0);
                    if (sprite_4 != null)
                        staticCache2.put(sprite_4, i_3);
                    else
                        staticBool49 = true;

                    return sprite_4;
                }
            }
        } else
            return null;
    }

    public Model method503(SeqType seqtype_1, int i_2, boolean bool_3, PlayerDef playerdef_4) {
        staticBool49 = false;
        int i_6;
        int i_7;
        if (bool_3) {
            i_6 = int425;
            i_7 = int447;
        } else {
            i_6 = int423;
            i_7 = int409;
        }

        if (i_6 == 0)
            return null;
        else if (i_6 == 1 && i_7 == -1)
            return null;
        else {
            Model model_8 = (Model) staticCache4.get(i_7 + (i_6 << 16));
            if (model_8 == null) {
                Mesh mesh_9;
                if (i_6 == 1) {
                    mesh_9 = Mesh.staticMethod466(staticJs5Index10, i_7, 0);
                    if (mesh_9 == null) {
                        staticBool49 = true;
                        return null;
                    }

                    model_8 = mesh_9.method634(64, 768, -50, -10, -50);
                }

                if (i_6 == 2) {
                    mesh_9 = NpcType.staticMethod413(i_7).method567();
                    if (mesh_9 == null) {
                        staticBool49 = true;
                        return null;
                    }

                    model_8 = mesh_9.method634(64, 768, -50, -10, -50);
                }

                if (i_6 == 3) {
                    if (playerdef_4 == null)
                        return null;

                    mesh_9 = playerdef_4.method303();
                    if (mesh_9 == null) {
                        staticBool49 = true;
                        return null;
                    }

                    model_8 = mesh_9.method634(64, 768, -50, -10, -50);
                }

                if (i_6 == 4) {
                    ObjType objtype_10 = ObjType.staticMethod421(i_7);
                    mesh_9 = objtype_10.method587(10);
                    if (mesh_9 == null) {
                        staticBool49 = true;
                        return null;
                    }

                    model_8 = mesh_9.method634(objtype_10.ambient + 64, 768 + objtype_10.contrast, -50, -10, -50);
                }

                staticCache4.put(model_8, i_7 + (i_6 << 16));
            }

            if (seqtype_1 != null)
                model_8 = seqtype_1.method607(model_8, i_2);

            return model_8;
        }
    }

    public CacheableSub1 method504(boolean bool_1) {
        if (int412 == -1)
            bool_1 = false;

        int i_3 = bool_1 ? int412 : int440;
        if (i_3 == -1)
            return null;
        else {
            long long_4 = ((long) int450 << 40) + ((bool33 ? 1L : 0L) << 39) + ((bool37 ? 1L : 0L) << 38) + i_3 + ((long) int420 << 36);
            CacheableSub1 cacheablesub1_6 = (CacheableSub1) staticCache5.get(long_4);
            if (cacheablesub1_6 != null)
                return cacheablesub1_6;
            else {
                Sprite sprite_7 = method500(bool_1);
                if (sprite_7 == null)
                    return null;
                else {
                    Sprite sprite_8 = sprite_7.method676();
                    int[] ints_9 = new int[sprite_8.height];
                    int[] ints_10 = new int[sprite_8.height];

                    for (int i_11 = 0; i_11 < sprite_8.height; i_11++) {
                        int i_12 = 0;
                        int i_13 = sprite_8.width;

                        int i_14;
                        for (i_14 = 0; i_14 < sprite_8.width; i_14++)
                            if (sprite_8.pixels[i_14 + sprite_8.width * i_11] == 0) {
                                i_12 = i_14;
                                break;
                            }

                        for (i_14 = sprite_8.width - 1; i_14 >= i_12; --i_14)
                            if (sprite_8.pixels[i_11 * sprite_8.width + i_14] == 0) {
                                i_13 = i_14 + 1;
                                break;
                            }

                        ints_9[i_11] = i_12;
                        ints_10[i_11] = i_13 - i_12;
                    }

                    cacheablesub1_6 = new CacheableSub1(sprite_8.width, sprite_8.height, ints_10, ints_9, i_3);
                    staticCache5.put(cacheablesub1_6, long_4);
                    return cacheablesub1_6;
                }
            }
        }
    }

    public static void staticMethod385() {
        staticCache2.method264();
        staticCache4.method264();
        staticCache3.method264();
        staticCache5.method264();
    }

    public void method505(int i_1, String string_2) {
        if (stringArray3 == null || stringArray3.length <= i_1) {
            String[] arr_4 = new String[i_1 + 1];
            if (stringArray3 != null)
                for (int i_5 = 0; i_5 < stringArray3.length; i_5++)
                    arr_4[i_5] = stringArray3[i_5];

            stringArray3 = arr_4;
        }

        stringArray3[i_1] = string_2;
    }

}

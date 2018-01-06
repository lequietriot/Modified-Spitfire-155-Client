
public final class StaticClass3 {

    static byte[][][] staticByteArrayArrayArray2;
    static byte[][][] staticByteArrayArrayArray3;
    static byte[][][] staticByteArrayArrayArray4;
    static int[] staticIntArray7;
    static Connection staticConnection1;
    static int[][][] staticIntArrayArrayArray1 = new int[4][105][105];
    static byte[][][] staticByteArrayArrayArray1 = new byte[4][104][104];
    static int staticInt32 = 99;
    static final int[] staticIntArray13 = new int[] { 1, 2, 4, 8 };
    static final int[] staticIntArray9 = new int[] { 16, 32, 64, 128 };
    static final int[] staticIntArray12 = new int[] { 1, 0, -1, 0 };
    static final int[] staticIntArray8 = new int[] { 0, -1, 0, 1 };
    static final int[] staticIntArray10 = new int[] { 1, -1, -1, 1 };
    static final int[] staticIntArray11 = new int[] { -1, -1, 1, 1 };
    static int staticInt33 = (int) (Math.random() * 17.0D) - 8;
    static int staticInt34 = (int) (Math.random() * 33.0D) - 16;

    StaticClass3() throws Throwable {
        throw new Error();
    }

    static final void staticMethod13(int i_0, int i_1, int i_2, int i_3) {
        for (int i_5 = i_1; i_5 <= i_1 + i_3; i_5++)
            for (int i_6 = i_0; i_6 <= i_0 + i_2; i_6++)
                if (i_6 >= 0 && i_6 < 104 && i_5 >= 0 && i_5 < 104) {
                    StaticClass20.staticByteArrayArrayArray5[0][i_6][i_5] = 127;
                    if (i_0 == i_6 && i_6 > 0)
                        staticIntArrayArrayArray1[0][i_6][i_5] = staticIntArrayArrayArray1[0][i_6 - 1][i_5];

                    if (i_6 == i_0 + i_2 && i_6 < 103)
                        staticIntArrayArrayArray1[0][i_6][i_5] = staticIntArrayArrayArray1[0][i_6 + 1][i_5];

                    if (i_1 == i_5 && i_5 > 0)
                        staticIntArrayArrayArray1[0][i_6][i_5] = staticIntArrayArrayArray1[0][i_6][i_5 - 1];

                    if (i_1 + i_3 == i_5 && i_5 < 103)
                        staticIntArrayArrayArray1[0][i_6][i_5] = staticIntArrayArrayArray1[0][i_6][i_5 + 1];
                }

    }

    static final void staticMethod14(byte[] bytes_0, int i_1, int i_2, int i_3, int i_4, CollisionMap[] arr_5) {
        int i_8;
        int i_9;
        for (int i_7 = 0; i_7 < 4; i_7++)
            for (i_8 = 0; i_8 < 64; i_8++)
                for (i_9 = 0; i_9 < 64; i_9++)
                    if (i_1 + i_8 > 0 && i_1 + i_8 < 103 && i_2 + i_9 > 0 && i_2 + i_9 < 103)
                        arr_5[i_7].adjacencies[i_8 + i_1][i_9 + i_2] &= ~0x1000000;

        Buffer buffer_11 = new Buffer(bytes_0);

        for (i_8 = 0; i_8 < 4; i_8++)
            for (i_9 = 0; i_9 < 64; i_9++)
                for (int i_10 = 0; i_10 < 64; i_10++)
                    staticMethod17(buffer_11, i_8, i_1 + i_9, i_10 + i_2, i_3, i_4, 0);

    }

    static final void staticMethod15(byte[] bytes_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, CollisionMap[] arr_8) {
        int i_11;
        for (int i_10 = 0; i_10 < 8; i_10++)
            for (i_11 = 0; i_11 < 8; i_11++)
                if (i_2 + i_10 > 0 && i_10 + i_2 < 103 && i_11 + i_3 > 0 && i_3 + i_11 < 103)
                    arr_8[i_1].adjacencies[i_10 + i_2][i_11 + i_3] &= ~0x1000000;

        Buffer buffer_29 = new Buffer(bytes_0);

        for (i_11 = 0; i_11 < 4; i_11++)
            for (int i_12 = 0; i_12 < 64; i_12++)
                for (int i_13 = 0; i_13 < 64; i_13++)
                    if (i_4 == i_11 && i_12 >= i_5 && i_12 < i_5 + 8 && i_13 >= i_6 && i_13 < i_6 + 8) {
                        int i_18 = i_12 & 0x7;
                        int i_19 = i_13 & 0x7;
                        int i_20 = i_7 & 0x3;
                        int i_17;
                        if (i_20 == 0)
                            i_17 = i_18;
                        else if (i_20 == 1)
                            i_17 = i_19;
                        else if (i_20 == 2)
                            i_17 = 7 - i_18;
                        else
                            i_17 = 7 - i_19;

                        int i_23 = i_2 + i_17;
                        int i_26 = i_12 & 0x7;
                        int i_27 = i_13 & 0x7;
                        int i_28 = i_7 & 0x3;
                        int i_25;
                        if (i_28 == 0)
                            i_25 = i_27;
                        else if (i_28 == 1)
                            i_25 = 7 - i_26;
                        else if (i_28 == 2)
                            i_25 = 7 - i_27;
                        else
                            i_25 = i_26;

                        staticMethod17(buffer_29, i_1, i_23, i_25 + i_3, 0, 0, i_7);
                    } else
                        staticMethod17(buffer_29, 0, -1, -1, 0, 0, 0);

    }

    static final void staticMethod16(int i_0, int i_1, int i_2) {
        int i_4;
        for (i_4 = 0; i_4 < 8; i_4++)
            for (int i_5 = 0; i_5 < 8; i_5++)
                staticIntArrayArrayArray1[i_0][i_4 + i_1][i_2 + i_5] = 0;

        if (i_1 > 0)
            for (i_4 = 1; i_4 < 8; i_4++)
                staticIntArrayArrayArray1[i_0][i_1][i_2 + i_4] = staticIntArrayArrayArray1[i_0][i_1 - 1][i_4 + i_2];

        if (i_2 > 0)
            for (i_4 = 1; i_4 < 8; i_4++)
                staticIntArrayArrayArray1[i_0][i_4 + i_1][i_2] = staticIntArrayArrayArray1[i_0][i_4 + i_1][i_2 - 1];

        if (i_1 > 0 && staticIntArrayArrayArray1[i_0][i_1 - 1][i_2] != 0)
            staticIntArrayArrayArray1[i_0][i_1][i_2] = staticIntArrayArrayArray1[i_0][i_1 - 1][i_2];
        else if (i_2 > 0 && staticIntArrayArrayArray1[i_0][i_1][i_2 - 1] != 0)
            staticIntArrayArrayArray1[i_0][i_1][i_2] = staticIntArrayArrayArray1[i_0][i_1][i_2 - 1];
        else if (i_1 > 0 && i_2 > 0 && staticIntArrayArrayArray1[i_0][i_1 - 1][i_2 - 1] != 0)
            staticIntArrayArrayArray1[i_0][i_1][i_2] = staticIntArrayArrayArray1[i_0][i_1 - 1][i_2 - 1];

    }

    static final void staticMethod17(Buffer buffer_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        int i_8;
        if (i_2 >= 0 && i_2 < 104 && i_3 >= 0 && i_3 < 104) {
            staticByteArrayArrayArray1[i_1][i_2][i_3] = 0;

            while (true) {
                i_8 = buffer_0.readUByte();
                if (i_8 == 0) {
                    if (i_1 == 0)
                        staticIntArrayArrayArray1[0][i_2][i_3] = -staticMethod22(i_2 + 932731 + i_4, i_3 + 556238 + i_5) * 8;
                    else
                        staticIntArrayArrayArray1[i_1][i_2][i_3] = staticIntArrayArrayArray1[i_1 - 1][i_2][i_3] - 240;
                    break;
                }

                if (i_8 == 1) {
                    int i_9 = buffer_0.readUByte();
                    if (i_9 == 1)
                        i_9 = 0;

                    if (i_1 == 0)
                        staticIntArrayArrayArray1[0][i_2][i_3] = 8 * -i_9;
                    else
                        staticIntArrayArrayArray1[i_1][i_2][i_3] = staticIntArrayArrayArray1[i_1 - 1][i_2][i_3] - i_9 * 8;
                    break;
                }

                if (i_8 <= 49) {
                    staticByteArrayArrayArray3[i_1][i_2][i_3] = buffer_0.method440();
                    Class7.staticByteArrayArrayArray6[i_1][i_2][i_3] = (byte) ((i_8 - 2) / 4);
                    staticByteArrayArrayArray4[i_1][i_2][i_3] = (byte) (i_6 + i_8 - 2 & 0x3);
                } else if (i_8 <= 81)
                    staticByteArrayArrayArray1[i_1][i_2][i_3] = (byte) (i_8 - 49);
                else
                    staticByteArrayArrayArray2[i_1][i_2][i_3] = (byte) (i_8 - 81);
            }
        } else
            while (true) {
                i_8 = buffer_0.readUByte();
                if (i_8 == 0)
                    break;

                if (i_8 == 1) {
                    buffer_0.readUByte();
                    break;
                }

                if (i_8 <= 49)
                    buffer_0.readUByte();
            }

    }

    static final boolean staticMethod18(byte[] bytes_0, int i_1, int i_2) {
        boolean bool_4 = true;
        Buffer buffer_5 = new Buffer(bytes_0);
        int i_6 = -1;

        label57: while (true) {
            int i_7 = buffer_5.method453();
            if (i_7 == 0)
                return bool_4;

            i_6 += i_7;
            int i_8 = 0;
            boolean bool_9 = false;

            while (true) {
                int i_10;
                while (!bool_9) {
                    i_10 = buffer_5.method453();
                    if (i_10 == 0)
                        continue label57;

                    i_8 += i_10 - 1;
                    int i_11 = i_8 & 0x3f;
                    int i_12 = i_8 >> 6 & 0x3f;
                    int i_13 = buffer_5.readUByte() >> 2;
                    int i_14 = i_1 + i_12;
                    int i_15 = i_11 + i_2;
                    if (i_14 > 0 && i_15 > 0 && i_14 < 103 && i_15 < 103) {
                        LocType loctype_16 = LocType.staticMethod411(i_6);
                        if (i_13 != 22 || !Client.staticBool25 || loctype_16.int514 != 0 || loctype_16.int520 == 1 || loctype_16.bool59) {
                            if (!loctype_16.method558()) {
                                ++Client.staticInt199;
                                bool_4 = false;
                            }

                            bool_9 = true;
                        }
                    }
                }

                i_10 = buffer_5.method453();
                if (i_10 == 0)
                    break;

                buffer_5.readUByte();
            }
        }
    }

    static final void staticMethod19(byte[] bytes_0, int i_1, int i_2, Scene scene_3, CollisionMap[] arr_4) {
        Buffer buffer_6 = new Buffer(bytes_0);
        int i_7 = -1;

        while (true) {
            int i_8 = buffer_6.method453();
            if (i_8 == 0)
                return;

            i_7 += i_8;
            int i_9 = 0;

            while (true) {
                int i_10 = buffer_6.method453();
                if (i_10 == 0)
                    break;

                i_9 += i_10 - 1;
                int i_11 = i_9 & 0x3f;
                int i_12 = i_9 >> 6 & 0x3f;
                int i_13 = i_9 >> 12;
                int i_14 = buffer_6.readUByte();
                int i_15 = i_14 >> 2;
                int i_16 = i_14 & 0x3;
                int i_17 = i_12 + i_1;
                int i_18 = i_11 + i_2;
                if (i_17 > 0 && i_18 > 0 && i_17 < 103 && i_18 < 103) {
                    int i_19 = i_13;
                    if ((staticByteArrayArrayArray1[1][i_17][i_18] & 0x2) == 2)
                        i_19 = i_13 - 1;

                    CollisionMap collisionmap_20 = null;
                    if (i_19 >= 0)
                        collisionmap_20 = arr_4[i_19];

                    staticMethod20(i_13, i_17, i_18, i_7, i_16, i_15, scene_3, collisionmap_20);
                }
            }
        }
    }

    static final void staticMethod20(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, Scene scene_6, CollisionMap collisionmap_7) {
        if (!Client.staticBool25 || (staticByteArrayArrayArray1[0][i_1][i_2] & 0x2) != 0 || (staticByteArrayArrayArray1[i_0][i_1][i_2] & 0x10) == 0) {
            if (i_0 < staticInt32)
                staticInt32 = i_0;

            LocType loctype_9 = LocType.staticMethod411(i_3);
            int i_10;
            int i_11;
            if (i_4 != 1 && i_4 != 3) {
                i_10 = loctype_9.int518;
                i_11 = loctype_9.int519;
            } else {
                i_10 = loctype_9.int519;
                i_11 = loctype_9.int518;
            }

            int i_12;
            int i_13;
            if (i_10 + i_1 <= 104) {
                i_12 = (i_10 >> 1) + i_1;
                i_13 = (i_10 + 1 >> 1) + i_1;
            } else {
                i_12 = i_1;
                i_13 = i_1 + 1;
            }

            int i_14;
            int i_15;
            if (i_2 + i_11 <= 104) {
                i_14 = (i_11 >> 1) + i_2;
                i_15 = i_2 + (i_11 + 1 >> 1);
            } else {
                i_14 = i_2;
                i_15 = i_2 + 1;
            }

            int[][] ints_16 = staticIntArrayArrayArray1[i_0];
            int i_17 = ints_16[i_12][i_15] + ints_16[i_13][i_14] + ints_16[i_12][i_14] + ints_16[i_13][i_15] >> 2;
            int i_18 = (i_10 << 6) + (i_1 << 7);
            int i_19 = (i_11 << 6) + (i_2 << 7);
            int i_20 = 1073741824 + i_1 + (i_2 << 7) + (i_3 << 14);
            if (loctype_9.int514 == 0)
                i_20 -= Integer.MIN_VALUE;

            int i_21 = i_5 + (i_4 << 6);
            if (loctype_9.int531 == 1)
                i_21 += 256;

            int i_23;
            int i_24;
            if (loctype_9.method564()) {
                NodeSub3 nodesub3_22 = new NodeSub3();
                nodesub3_22.int336 = i_0;
                nodesub3_22.int335 = i_1 * 128;
                nodesub3_22.int344 = i_2 * 128;
                i_23 = loctype_9.int518;
                i_24 = loctype_9.int519;
                if (i_4 == 1 || i_4 == 3) {
                    i_23 = loctype_9.int519;
                    i_24 = loctype_9.int518;
                }

                nodesub3_22.int340 = (i_23 + i_1) * 128;
                nodesub3_22.int337 = (i_24 + i_2) * 128;
                nodesub3_22.int339 = loctype_9.int534;
                nodesub3_22.int338 = loctype_9.int535 * 128;
                nodesub3_22.int341 = loctype_9.int516;
                nodesub3_22.int342 = loctype_9.int525;
                nodesub3_22.intArray43 = loctype_9.intArray87;
                if (loctype_9.intArray86 != null) {
                    nodesub3_22.locType1 = loctype_9;
                    nodesub3_22.method410();
                }

                NodeSub3.staticDeque10.method253(nodesub3_22);
                if (nodesub3_22.intArray43 != null)
                    nodesub3_22.int343 = nodesub3_22.int341 + (int) (Math.random() * (nodesub3_22.int342 - nodesub3_22.int341));
            }

            Object obj_27;
            if (i_5 == 22) {
                if (!Client.staticBool25 || loctype_9.int514 != 0 || loctype_9.int520 == 1 || loctype_9.bool59) {
                    if (loctype_9.int532 == -1 && loctype_9.intArray86 == null)
                        obj_27 = loctype_9.method559(22, i_4, ints_16, i_18, i_17, i_19);
                    else
                        obj_27 = new RenderableSub1(i_3, 22, i_4, i_0, i_1, i_2, loctype_9.int532, true, (Renderable) null);

                    scene_6.addGroundDecoration(i_0, i_1, i_2, i_17, (Renderable) obj_27, i_20, i_21);
                    if (loctype_9.int520 == 1 && collisionmap_7 != null)
                        collisionmap_7.method238(i_1, i_2);

                }
            } else if (i_5 != 10 && i_5 != 11) {
                if (i_5 >= 12) {
                    if (loctype_9.int532 == -1 && loctype_9.intArray86 == null)
                        obj_27 = loctype_9.method559(i_5, i_4, ints_16, i_18, i_17, i_19);
                    else
                        obj_27 = new RenderableSub1(i_3, i_5, i_4, i_0, i_1, i_2, loctype_9.int532, true, (Renderable) null);

                    scene_6.method189(i_0, i_1, i_2, i_17, 1, 1, (Renderable) obj_27, 0, i_20, i_21);
                    if (i_5 >= 12 && i_5 <= 17 && i_5 != 13 && i_0 > 0)
                        StaticClass26.staticIntArrayArrayArray2[i_0][i_1][i_2] |= 0x924;

                    if (loctype_9.int520 != 0 && collisionmap_7 != null)
                        collisionmap_7.flagObject(i_1, i_2, i_10, i_11, loctype_9.bool54);

                } else if (i_5 == 0) {
                    if (loctype_9.int532 == -1 && loctype_9.intArray86 == null)
                        obj_27 = loctype_9.method559(0, i_4, ints_16, i_18, i_17, i_19);
                    else
                        obj_27 = new RenderableSub1(i_3, 0, i_4, i_0, i_1, i_2, loctype_9.int532, true, (Renderable) null);

                    scene_6.method188(i_0, i_1, i_2, i_17, (Renderable) obj_27, (Renderable) null, staticIntArray13[i_4], 0, i_20, i_21);
                    if (i_4 == 0) {
                        if (loctype_9.bool58) {
                            StaticClass20.staticByteArrayArrayArray5[i_0][i_1][i_2] = 50;
                            StaticClass20.staticByteArrayArrayArray5[i_0][i_1][i_2 + 1] = 50;
                        }

                        if (loctype_9.bool56)
                            StaticClass26.staticIntArrayArrayArray2[i_0][i_1][i_2] |= 0x249;
                    } else if (i_4 == 1) {
                        if (loctype_9.bool58) {
                            StaticClass20.staticByteArrayArrayArray5[i_0][i_1][i_2 + 1] = 50;
                            StaticClass20.staticByteArrayArrayArray5[i_0][i_1 + 1][i_2 + 1] = 50;
                        }

                        if (loctype_9.bool56)
                            StaticClass26.staticIntArrayArrayArray2[i_0][i_1][i_2 + 1] |= 0x492;
                    } else if (i_4 == 2) {
                        if (loctype_9.bool58) {
                            StaticClass20.staticByteArrayArrayArray5[i_0][i_1 + 1][i_2] = 50;
                            StaticClass20.staticByteArrayArrayArray5[i_0][i_1 + 1][i_2 + 1] = 50;
                        }

                        if (loctype_9.bool56)
                            StaticClass26.staticIntArrayArrayArray2[i_0][i_1 + 1][i_2] |= 0x249;
                    } else if (i_4 == 3) {
                        if (loctype_9.bool58) {
                            StaticClass20.staticByteArrayArrayArray5[i_0][i_1][i_2] = 50;
                            StaticClass20.staticByteArrayArrayArray5[i_0][i_1 + 1][i_2] = 50;
                        }

                        if (loctype_9.bool56)
                            StaticClass26.staticIntArrayArrayArray2[i_0][i_1][i_2] |= 0x492;
                    }

                    if (loctype_9.int520 != 0 && collisionmap_7 != null)
                        collisionmap_7.method235(i_1, i_2, i_5, i_4, loctype_9.bool54);

                    if (loctype_9.int521 != 16)
                        scene_6.method195(i_0, i_1, i_2, loctype_9.int521);

                } else if (i_5 == 1) {
                    if (loctype_9.int532 == -1 && loctype_9.intArray86 == null)
                        obj_27 = loctype_9.method559(1, i_4, ints_16, i_18, i_17, i_19);
                    else
                        obj_27 = new RenderableSub1(i_3, 1, i_4, i_0, i_1, i_2, loctype_9.int532, true, (Renderable) null);

                    scene_6.method188(i_0, i_1, i_2, i_17, (Renderable) obj_27, (Renderable) null, staticIntArray9[i_4], 0, i_20, i_21);
                    if (loctype_9.bool58)
                        if (i_4 == 0)
                            StaticClass20.staticByteArrayArrayArray5[i_0][i_1][i_2 + 1] = 50;
                        else if (i_4 == 1)
                            StaticClass20.staticByteArrayArrayArray5[i_0][i_1 + 1][i_2 + 1] = 50;
                        else if (i_4 == 2)
                            StaticClass20.staticByteArrayArrayArray5[i_0][i_1 + 1][i_2] = 50;
                        else if (i_4 == 3)
                            StaticClass20.staticByteArrayArrayArray5[i_0][i_1][i_2] = 50;

                    if (loctype_9.int520 != 0 && collisionmap_7 != null)
                        collisionmap_7.method235(i_1, i_2, i_5, i_4, loctype_9.bool54);

                } else {
                    int i_28;
                    Object obj_29;
                    if (i_5 == 2) {
                        i_28 = i_4 + 1 & 0x3;
                        Object obj_31;
                        if (loctype_9.int532 == -1 && loctype_9.intArray86 == null) {
                            obj_31 = loctype_9.method559(2, i_4 + 4, ints_16, i_18, i_17, i_19);
                            obj_29 = loctype_9.method559(2, i_28, ints_16, i_18, i_17, i_19);
                        } else {
                            obj_31 = new RenderableSub1(i_3, 2, i_4 + 4, i_0, i_1, i_2, loctype_9.int532, true, (Renderable) null);
                            obj_29 = new RenderableSub1(i_3, 2, i_28, i_0, i_1, i_2, loctype_9.int532, true, (Renderable) null);
                        }

                        scene_6.method188(i_0, i_1, i_2, i_17, (Renderable) obj_31, (Renderable) obj_29, staticIntArray13[i_4], staticIntArray13[i_28], i_20, i_21);
                        if (loctype_9.bool56)
                            if (i_4 == 0) {
                                StaticClass26.staticIntArrayArrayArray2[i_0][i_1][i_2] |= 0x249;
                                StaticClass26.staticIntArrayArrayArray2[i_0][i_1][i_2 + 1] |= 0x492;
                            } else if (i_4 == 1) {
                                StaticClass26.staticIntArrayArrayArray2[i_0][i_1][i_2 + 1] |= 0x492;
                                StaticClass26.staticIntArrayArrayArray2[i_0][i_1 + 1][i_2] |= 0x249;
                            } else if (i_4 == 2) {
                                StaticClass26.staticIntArrayArrayArray2[i_0][i_1 + 1][i_2] |= 0x249;
                                StaticClass26.staticIntArrayArrayArray2[i_0][i_1][i_2] |= 0x492;
                            } else if (i_4 == 3) {
                                StaticClass26.staticIntArrayArrayArray2[i_0][i_1][i_2] |= 0x492;
                                StaticClass26.staticIntArrayArrayArray2[i_0][i_1][i_2] |= 0x249;
                            }

                        if (loctype_9.int520 != 0 && collisionmap_7 != null)
                            collisionmap_7.method235(i_1, i_2, i_5, i_4, loctype_9.bool54);

                        if (loctype_9.int521 != 16)
                            scene_6.method195(i_0, i_1, i_2, loctype_9.int521);

                    } else if (i_5 == 3) {
                        if (loctype_9.int532 == -1 && loctype_9.intArray86 == null)
                            obj_27 = loctype_9.method559(3, i_4, ints_16, i_18, i_17, i_19);
                        else
                            obj_27 = new RenderableSub1(i_3, 3, i_4, i_0, i_1, i_2, loctype_9.int532, true, (Renderable) null);

                        scene_6.method188(i_0, i_1, i_2, i_17, (Renderable) obj_27, (Renderable) null, staticIntArray9[i_4], 0, i_20, i_21);
                        if (loctype_9.bool58)
                            if (i_4 == 0)
                                StaticClass20.staticByteArrayArrayArray5[i_0][i_1][i_2 + 1] = 50;
                            else if (i_4 == 1)
                                StaticClass20.staticByteArrayArrayArray5[i_0][i_1 + 1][i_2 + 1] = 50;
                            else if (i_4 == 2)
                                StaticClass20.staticByteArrayArrayArray5[i_0][i_1 + 1][i_2] = 50;
                            else if (i_4 == 3)
                                StaticClass20.staticByteArrayArrayArray5[i_0][i_1][i_2] = 50;

                        if (loctype_9.int520 != 0 && collisionmap_7 != null)
                            collisionmap_7.method235(i_1, i_2, i_5, i_4, loctype_9.bool54);

                    } else if (i_5 == 9) {
                        if (loctype_9.int532 == -1 && loctype_9.intArray86 == null)
                            obj_27 = loctype_9.method559(i_5, i_4, ints_16, i_18, i_17, i_19);
                        else
                            obj_27 = new RenderableSub1(i_3, i_5, i_4, i_0, i_1, i_2, loctype_9.int532, true, (Renderable) null);

                        scene_6.method189(i_0, i_1, i_2, i_17, 1, 1, (Renderable) obj_27, 0, i_20, i_21);
                        if (loctype_9.int520 != 0 && collisionmap_7 != null)
                            collisionmap_7.flagObject(i_1, i_2, i_10, i_11, loctype_9.bool54);

                        if (loctype_9.int521 != 16)
                            scene_6.method195(i_0, i_1, i_2, loctype_9.int521);

                    } else if (i_5 == 4) {
                        if (loctype_9.int532 == -1 && loctype_9.intArray86 == null)
                            obj_27 = loctype_9.method559(4, i_4, ints_16, i_18, i_17, i_19);
                        else
                            obj_27 = new RenderableSub1(i_3, 4, i_4, i_0, i_1, i_2, loctype_9.int532, true, (Renderable) null);

                        scene_6.addWallObject(i_0, i_1, i_2, i_17, (Renderable) obj_27, (Renderable) null, staticIntArray13[i_4], 0, 0, 0, i_20, i_21);
                    } else if (i_5 == 5) {
                        i_28 = 16;
                        i_23 = scene_6.method205(i_0, i_1, i_2);
                        if (i_23 != 0)
                            i_28 = LocType.staticMethod411(i_23 >> 14 & 0x7fff).int521;

                        if (loctype_9.int532 == -1 && loctype_9.intArray86 == null)
                            obj_29 = loctype_9.method559(4, i_4, ints_16, i_18, i_17, i_19);
                        else
                            obj_29 = new RenderableSub1(i_3, 4, i_4, i_0, i_1, i_2, loctype_9.int532, true, (Renderable) null);

                        scene_6.addWallObject(i_0, i_1, i_2, i_17, (Renderable) obj_29, (Renderable) null, staticIntArray13[i_4], 0, i_28 * staticIntArray12[i_4], staticIntArray8[i_4] * i_28, i_20, i_21);
                    } else if (i_5 == 6) {
                        i_28 = 8;
                        i_23 = scene_6.method205(i_0, i_1, i_2);
                        if (i_23 != 0)
                            i_28 = LocType.staticMethod411(i_23 >> 14 & 0x7fff).int521 / 2;

                        if (loctype_9.int532 == -1 && loctype_9.intArray86 == null)
                            obj_29 = loctype_9.method559(4, i_4 + 4, ints_16, i_18, i_17, i_19);
                        else
                            obj_29 = new RenderableSub1(i_3, 4, i_4 + 4, i_0, i_1, i_2, loctype_9.int532, true, (Renderable) null);

                        scene_6.addWallObject(i_0, i_1, i_2, i_17, (Renderable) obj_29, (Renderable) null, 256, i_4, i_28 * staticIntArray10[i_4], staticIntArray11[i_4] * i_28, i_20, i_21);
                    } else if (i_5 == 7) {
                        i_23 = i_4 + 2 & 0x3;
                        if (loctype_9.int532 == -1 && loctype_9.intArray86 == null)
                            obj_27 = loctype_9.method559(4, i_23 + 4, ints_16, i_18, i_17, i_19);
                        else
                            obj_27 = new RenderableSub1(i_3, 4, i_23 + 4, i_0, i_1, i_2, loctype_9.int532, true, (Renderable) null);

                        scene_6.addWallObject(i_0, i_1, i_2, i_17, (Renderable) obj_27, (Renderable) null, 256, i_23, 0, 0, i_20, i_21);
                    } else if (i_5 == 8) {
                        i_28 = 8;
                        i_23 = scene_6.method205(i_0, i_1, i_2);
                        if (i_23 != 0)
                            i_28 = LocType.staticMethod411(i_23 >> 14 & 0x7fff).int521 / 2;

                        int i_26 = i_4 + 2 & 0x3;
                        Object obj_30;
                        if (loctype_9.int532 == -1 && loctype_9.intArray86 == null) {
                            obj_29 = loctype_9.method559(4, i_4 + 4, ints_16, i_18, i_17, i_19);
                            obj_30 = loctype_9.method559(4, i_26 + 4, ints_16, i_18, i_17, i_19);
                        } else {
                            obj_29 = new RenderableSub1(i_3, 4, i_4 + 4, i_0, i_1, i_2, loctype_9.int532, true, (Renderable) null);
                            obj_30 = new RenderableSub1(i_3, 4, i_26 + 4, i_0, i_1, i_2, loctype_9.int532, true, (Renderable) null);
                        }

                        scene_6.addWallObject(i_0, i_1, i_2, i_17, (Renderable) obj_29, (Renderable) obj_30, 256, i_4, i_28 * staticIntArray10[i_4], i_28 * staticIntArray11[i_4], i_20, i_21);
                    }
                }
            } else {
                if (loctype_9.int532 == -1 && loctype_9.intArray86 == null)
                    obj_27 = loctype_9.method559(10, i_4, ints_16, i_18, i_17, i_19);
                else
                    obj_27 = new RenderableSub1(i_3, 10, i_4, i_0, i_1, i_2, loctype_9.int532, true, (Renderable) null);

                if (obj_27 != null && scene_6.method189(i_0, i_1, i_2, i_17, i_10, i_11, (Renderable) obj_27, i_5 == 11 ? 256 : 0, i_20, i_21) && loctype_9.bool58) {
                    i_23 = 15;
                    if (obj_27 instanceof Model) {
                        i_23 = ((Model) obj_27).method642() / 4;
                        if (i_23 > 30)
                            i_23 = 30;
                    }

                    for (i_24 = 0; i_24 <= i_10; i_24++)
                        for (int i_25 = 0; i_25 <= i_11; i_25++)
                            if (i_23 > StaticClass20.staticByteArrayArrayArray5[i_0][i_24 + i_1][i_25 + i_2])
                                StaticClass20.staticByteArrayArrayArray5[i_0][i_24 + i_1][i_25 + i_2] = (byte) i_23;
                }

                if (loctype_9.int520 != 0 && collisionmap_7 != null)
                    collisionmap_7.flagObject(i_1, i_2, i_10, i_11, loctype_9.bool54);

            }
        }
    }

    static final void staticMethod21(Scene scene_0, CollisionMap[] arr_1) {
        int i_3;
        int i_4;
        int i_5;
        int i_6;
        for (i_3 = 0; i_3 < 4; i_3++)
            for (i_4 = 0; i_4 < 104; i_4++)
                for (i_5 = 0; i_5 < 104; i_5++)
                    if ((staticByteArrayArrayArray1[i_3][i_4][i_5] & 0x1) == 1) {
                        i_6 = i_3;
                        if ((staticByteArrayArrayArray1[1][i_4][i_5] & 0x2) == 2)
                            i_6 = i_3 - 1;

                        if (i_6 >= 0)
                            arr_1[i_6].method237(i_4, i_5);
                    }

        staticInt33 += (int) (Math.random() * 5.0D) - 2;
        if (staticInt33 < -8)
            staticInt33 = -8;

        if (staticInt33 > 8)
            staticInt33 = 8;

        staticInt34 += (int) (Math.random() * 5.0D) - 2;
        if (staticInt34 < -16)
            staticInt34 = -16;

        if (staticInt34 > 16)
            staticInt34 = 16;

        int i_10;
        int i_11;
        int i_12;
        int i_13;
        int i_14;
        int i_15;
        int i_16;
        int i_17;
        int i_18;
        int i_19;
        for (i_3 = 0; i_3 < 4; i_3++) {
            byte[][] bytes_43 = StaticClass20.staticByteArrayArrayArray5[i_3];
            i_10 = (int) Math.sqrt(5100.0D);
            i_11 = i_10 * 768 >> 8;

            int i_20;
            int i_21;
            for (i_12 = 1; i_12 < 103; i_12++)
                for (i_13 = 1; i_13 < 103; i_13++) {
                    i_14 = staticIntArrayArrayArray1[i_3][i_13 + 1][i_12] - staticIntArrayArrayArray1[i_3][i_13 - 1][i_12];
                    i_15 = staticIntArrayArrayArray1[i_3][i_13][i_12 + 1] - staticIntArrayArrayArray1[i_3][i_13][i_12 - 1];
                    i_16 = (int) Math.sqrt(i_15 * i_15 + i_14 * i_14 + 65536);
                    i_17 = (i_14 << 8) / i_16;
                    i_18 = 65536 / i_16;
                    i_19 = (i_15 << 8) / i_16;
                    i_20 = 96 + (i_19 * -50 + i_17 * -50 + i_18 * -10) / i_11;
                    i_21 = (bytes_43[i_13][i_12] >> 1) + (bytes_43[i_13 + 1][i_12] >> 3) + (bytes_43[i_13 - 1][i_12] >> 2) + (bytes_43[i_13][i_12 - 1] >> 2) + (bytes_43[i_13][i_12 + 1] >> 3);
                    StaticClass5.staticIntArrayArray2[i_13][i_12] = i_20 - i_21;
                }

            for (i_12 = 0; i_12 < 104; i_12++) {
                StaticClass21.staticIntArray60[i_12] = 0;
                DataClass1.staticIntArray2[i_12] = 0;
                AABBClickboxDebug.staticIntArray131[i_12] = 0;
                staticIntArray7[i_12] = 0;
                Huffman.staticIntArray59[i_12] = 0;
            }

            for (i_12 = -5; i_12 < 109; i_12++) {
                for (i_13 = 0; i_13 < 104; i_13++) {
                    i_14 = i_12 + 5;
                    if (i_14 >= 0 && i_14 < 104) {
                        i_15 = staticByteArrayArrayArray2[i_3][i_14][i_13] & 0xff;
                        if (i_15 > 0) {
                            Underlay underlay_44 = AbstractClass1Sub1.staticMethod249(i_15 - 1);
                            StaticClass21.staticIntArray60[i_13] += underlay_44.int580;
                            DataClass1.staticIntArray2[i_13] += underlay_44.int582;
                            AABBClickboxDebug.staticIntArray131[i_13] += underlay_44.int583;
                            staticIntArray7[i_13] += underlay_44.int584;
                            ++Huffman.staticIntArray59[i_13];
                        }
                    }

                    i_15 = i_12 - 5;
                    if (i_15 >= 0 && i_15 < 104) {
                        i_16 = staticByteArrayArrayArray2[i_3][i_15][i_13] & 0xff;
                        if (i_16 > 0) {
                            Underlay underlay_45 = AbstractClass1Sub1.staticMethod249(i_16 - 1);
                            StaticClass21.staticIntArray60[i_13] -= underlay_45.int580;
                            DataClass1.staticIntArray2[i_13] -= underlay_45.int582;
                            AABBClickboxDebug.staticIntArray131[i_13] -= underlay_45.int583;
                            staticIntArray7[i_13] -= underlay_45.int584;
                            --Huffman.staticIntArray59[i_13];
                        }
                    }
                }

                if (i_12 >= 1 && i_12 < 103) {
                    i_13 = 0;
                    i_14 = 0;
                    i_15 = 0;
                    i_16 = 0;
                    i_17 = 0;

                    for (i_18 = -5; i_18 < 109; i_18++) {
                        i_19 = i_18 + 5;
                        if (i_19 >= 0 && i_19 < 104) {
                            i_13 += StaticClass21.staticIntArray60[i_19];
                            i_14 += DataClass1.staticIntArray2[i_19];
                            i_15 += AABBClickboxDebug.staticIntArray131[i_19];
                            i_16 += staticIntArray7[i_19];
                            i_17 += Huffman.staticIntArray59[i_19];
                        }

                        i_20 = i_18 - 5;
                        if (i_20 >= 0 && i_20 < 104) {
                            i_13 -= StaticClass21.staticIntArray60[i_20];
                            i_14 -= DataClass1.staticIntArray2[i_20];
                            i_15 -= AABBClickboxDebug.staticIntArray131[i_20];
                            i_16 -= staticIntArray7[i_20];
                            i_17 -= Huffman.staticIntArray59[i_20];
                        }

                        if (i_18 >= 1 && i_18 < 103 && (!Client.staticBool25 || (staticByteArrayArrayArray1[0][i_12][i_18] & 0x2) != 0 || (staticByteArrayArrayArray1[i_3][i_12][i_18] & 0x10) == 0)) {
                            if (i_3 < staticInt32)
                                staticInt32 = i_3;

                            i_21 = staticByteArrayArrayArray2[i_3][i_12][i_18] & 0xff;
                            int i_22 = staticByteArrayArrayArray3[i_3][i_12][i_18] & 0xff;
                            if (i_21 > 0 || i_22 > 0) {
                                int i_23 = staticIntArrayArrayArray1[i_3][i_12][i_18];
                                int i_24 = staticIntArrayArrayArray1[i_3][i_12 + 1][i_18];
                                int i_25 = staticIntArrayArrayArray1[i_3][i_12 + 1][i_18 + 1];
                                int i_26 = staticIntArrayArrayArray1[i_3][i_12][i_18 + 1];
                                int i_27 = StaticClass5.staticIntArrayArray2[i_12][i_18];
                                int i_28 = StaticClass5.staticIntArrayArray2[i_12 + 1][i_18];
                                int i_29 = StaticClass5.staticIntArrayArray2[i_12 + 1][i_18 + 1];
                                int i_30 = StaticClass5.staticIntArrayArray2[i_12][i_18 + 1];
                                int i_31 = -1;
                                int i_32 = -1;
                                int i_33;
                                int i_34;
                                if (i_21 > 0) {
                                    i_33 = i_13 * 256 / i_16;
                                    i_34 = i_14 / i_17;
                                    int i_35 = i_15 / i_17;
                                    i_31 = staticMethod28(i_33, i_34, i_35);
                                    i_33 = staticInt33 + i_33 & 0xff;
                                    i_35 += staticInt34;
                                    if (i_35 < 0)
                                        i_35 = 0;
                                    else if (i_35 > 255)
                                        i_35 = 255;

                                    i_32 = staticMethod28(i_33, i_34, i_35);
                                }

                                if (i_3 > 0) {
                                    boolean bool_47 = true;
                                    if (i_21 == 0 && Class7.staticByteArrayArrayArray6[i_3][i_12][i_18] != 0)
                                        bool_47 = false;

                                    if (i_22 > 0 && !Overlay.staticMethod432(i_22 - 1).bool67)
                                        bool_47 = false;

                                    if (bool_47 && i_24 == i_23 && i_23 == i_25 && i_26 == i_23)
                                        StaticClass26.staticIntArrayArrayArray2[i_3][i_12][i_18] |= 0x924;
                                }

                                i_33 = 0;
                                if (i_32 != -1)
                                    i_33 = Rasterizer3D.staticIntArray155[staticMethod26(i_32, 96)];

                                if (i_22 == 0)
                                    scene_0.method187(i_3, i_12, i_18, 0, 0, -1, i_23, i_24, i_25, i_26, staticMethod26(i_31, i_27), staticMethod26(i_31, i_28), staticMethod26(i_31, i_29), staticMethod26(i_31, i_30), 0, 0, 0, 0, i_33, 0);
                                else {
                                    i_34 = Class7.staticByteArrayArrayArray6[i_3][i_12][i_18] + 1;
                                    byte b_48 = staticByteArrayArrayArray4[i_3][i_12][i_18];
                                    Overlay overlay_36 = Overlay.staticMethod432(i_22 - 1);
                                    int i_37 = overlay_36.int587;
                                    int i_38;
                                    int i_39;
                                    int i_40;
                                    int i_41;
                                    if (i_37 >= 0) {
                                        i_39 = Rasterizer3D.staticInterface2_1.method151(i_37);
                                        i_38 = -1;
                                    } else if (overlay_36.int586 == 16711935) {
                                        i_38 = -2;
                                        i_37 = -1;
                                        i_39 = -2;
                                    } else {
                                        i_38 = staticMethod28(overlay_36.int593, overlay_36.int589, overlay_36.int590);
                                        i_40 = staticInt33 + overlay_36.int593 & 0xff;
                                        i_41 = overlay_36.int590 + staticInt34;
                                        if (i_41 < 0)
                                            i_41 = 0;
                                        else if (i_41 > 255)
                                            i_41 = 255;

                                        i_39 = staticMethod28(i_40, overlay_36.int589, i_41);
                                    }

                                    i_40 = 0;
                                    if (i_39 != -2)
                                        i_40 = Rasterizer3D.staticIntArray155[staticMethod27(i_39, 96)];

                                    if (overlay_36.int588 != -1) {
                                        i_41 = overlay_36.int591 + staticInt33 & 0xff;
                                        int i_42 = overlay_36.int592 + staticInt34;
                                        if (i_42 < 0)
                                            i_42 = 0;
                                        else if (i_42 > 255)
                                            i_42 = 255;

                                        i_39 = staticMethod28(i_41, overlay_36.int585, i_42);
                                        i_40 = Rasterizer3D.staticIntArray155[staticMethod27(i_39, 96)];
                                    }

                                    scene_0.method187(i_3, i_12, i_18, i_34, b_48, i_37, i_23, i_24, i_25, i_26, staticMethod26(i_31, i_27), staticMethod26(i_31, i_28), staticMethod26(i_31, i_29), staticMethod26(i_31, i_30), staticMethod27(i_38, i_27), staticMethod27(i_38, i_28), staticMethod27(i_38, i_29), staticMethod27(i_38, i_30), i_33, i_40);
                                }
                            }
                        }
                    }
                }
            }

            for (i_12 = 1; i_12 < 103; i_12++)
                for (i_13 = 1; i_13 < 103; i_13++) {
                    if ((staticByteArrayArrayArray1[i_3][i_13][i_12] & 0x8) != 0)
                        i_18 = 0;
                    else if (i_3 > 0 && (staticByteArrayArrayArray1[1][i_13][i_12] & 0x2) != 0)
                        i_18 = i_3 - 1;
                    else
                        i_18 = i_3;

                    scene_0.method186(i_3, i_13, i_12, i_18);
                }

            staticByteArrayArrayArray2[i_3] = null;
            staticByteArrayArrayArray3[i_3] = null;
            Class7.staticByteArrayArrayArray6[i_3] = null;
            staticByteArrayArrayArray4[i_3] = null;
            StaticClass20.staticByteArrayArrayArray5[i_3] = null;
        }

        scene_0.method210(-50, -10, -50);

        for (i_3 = 0; i_3 < 104; i_3++)
            for (i_4 = 0; i_4 < 104; i_4++)
                if ((staticByteArrayArrayArray1[1][i_3][i_4] & 0x2) == 2)
                    scene_0.method185(i_3, i_4);

        i_3 = 1;
        i_4 = 2;
        i_5 = 4;

        for (i_6 = 0; i_6 < 4; i_6++) {
            if (i_6 > 0) {
                i_3 <<= 3;
                i_4 <<= 3;
                i_5 <<= 3;
            }

            for (int i_7 = 0; i_7 <= i_6; i_7++)
                for (int i_8 = 0; i_8 <= 104; i_8++)
                    for (int i_9 = 0; i_9 <= 104; i_9++) {
                        short s_46;
                        if ((StaticClass26.staticIntArrayArrayArray2[i_7][i_9][i_8] & i_3) != 0) {
                            i_10 = i_8;
                            i_11 = i_8;
                            i_12 = i_7;

                            for (i_13 = i_7; i_10 > 0 && (StaticClass26.staticIntArrayArrayArray2[i_7][i_9][i_10 - 1] & i_3) != 0; --i_10)
                                ;

                            while (i_11 < 104 && (StaticClass26.staticIntArrayArrayArray2[i_7][i_9][i_11 + 1] & i_3) != 0)
                                ++i_11;

                            label338: while (i_12 > 0) {
                                for (i_14 = i_10; i_14 <= i_11; i_14++)
                                    if ((StaticClass26.staticIntArrayArrayArray2[i_12 - 1][i_9][i_14] & i_3) == 0)
                                        break label338;

                                --i_12;
                            }

                            label327: while (i_13 < i_6) {
                                for (i_14 = i_10; i_14 <= i_11; i_14++)
                                    if ((StaticClass26.staticIntArrayArrayArray2[i_13 + 1][i_9][i_14] & i_3) == 0)
                                        break label327;

                                ++i_13;
                            }

                            i_14 = (i_13 + 1 - i_12) * (i_11 - i_10 + 1);
                            if (i_14 >= 8) {
                                s_46 = 240;
                                i_16 = staticIntArrayArrayArray1[i_13][i_9][i_10] - s_46;
                                i_17 = staticIntArrayArrayArray1[i_12][i_9][i_10];
                                Scene.staticMethod115(i_6, 1, i_9 * 128, i_9 * 128, i_10 * 128, i_11 * 128 + 128, i_16, i_17);

                                for (i_18 = i_12; i_18 <= i_13; i_18++)
                                    for (i_19 = i_10; i_19 <= i_11; i_19++)
                                        StaticClass26.staticIntArrayArrayArray2[i_18][i_9][i_19] &= ~i_3;
                            }
                        }

                        if ((StaticClass26.staticIntArrayArrayArray2[i_7][i_9][i_8] & i_4) != 0) {
                            i_10 = i_9;
                            i_11 = i_9;
                            i_12 = i_7;

                            for (i_13 = i_7; i_10 > 0 && (StaticClass26.staticIntArrayArrayArray2[i_7][i_10 - 1][i_8] & i_4) != 0; --i_10)
                                ;

                            while (i_11 < 104 && (StaticClass26.staticIntArrayArrayArray2[i_7][i_11 + 1][i_8] & i_4) != 0)
                                ++i_11;

                            label391: while (i_12 > 0) {
                                for (i_14 = i_10; i_14 <= i_11; i_14++)
                                    if ((StaticClass26.staticIntArrayArrayArray2[i_12 - 1][i_14][i_8] & i_4) == 0)
                                        break label391;

                                --i_12;
                            }

                            label380: while (i_13 < i_6) {
                                for (i_14 = i_10; i_14 <= i_11; i_14++)
                                    if ((StaticClass26.staticIntArrayArrayArray2[i_13 + 1][i_14][i_8] & i_4) == 0)
                                        break label380;

                                ++i_13;
                            }

                            i_14 = (i_13 + 1 - i_12) * (1 + i_11 - i_10);
                            if (i_14 >= 8) {
                                s_46 = 240;
                                i_16 = staticIntArrayArrayArray1[i_13][i_10][i_8] - s_46;
                                i_17 = staticIntArrayArrayArray1[i_12][i_10][i_8];
                                Scene.staticMethod115(i_6, 2, i_10 * 128, 128 + i_11 * 128, i_8 * 128, i_8 * 128, i_16, i_17);

                                for (i_18 = i_12; i_18 <= i_13; i_18++)
                                    for (i_19 = i_10; i_19 <= i_11; i_19++)
                                        StaticClass26.staticIntArrayArrayArray2[i_18][i_19][i_8] &= ~i_4;
                            }
                        }

                        if ((StaticClass26.staticIntArrayArrayArray2[i_7][i_9][i_8] & i_5) != 0) {
                            i_10 = i_9;
                            i_11 = i_9;
                            i_12 = i_8;

                            for (i_13 = i_8; i_12 > 0 && (StaticClass26.staticIntArrayArrayArray2[i_7][i_9][i_12 - 1] & i_5) != 0; --i_12)
                                ;

                            while (i_13 < 104 && (StaticClass26.staticIntArrayArrayArray2[i_7][i_9][i_13 + 1] & i_5) != 0)
                                ++i_13;

                            label444: while (i_10 > 0) {
                                for (i_14 = i_12; i_14 <= i_13; i_14++)
                                    if ((StaticClass26.staticIntArrayArrayArray2[i_7][i_10 - 1][i_14] & i_5) == 0)
                                        break label444;

                                --i_10;
                            }

                            label433: while (i_11 < 104) {
                                for (i_14 = i_12; i_14 <= i_13; i_14++)
                                    if ((StaticClass26.staticIntArrayArrayArray2[i_7][i_11 + 1][i_14] & i_5) == 0)
                                        break label433;

                                ++i_11;
                            }

                            if ((1 + i_11 - i_10) * (1 + i_13 - i_12) >= 4) {
                                i_14 = staticIntArrayArrayArray1[i_7][i_10][i_12];
                                Scene.staticMethod115(i_6, 4, i_10 * 128, i_11 * 128 + 128, i_12 * 128, i_13 * 128 + 128, i_14, i_14);

                                for (i_15 = i_10; i_15 <= i_11; i_15++)
                                    for (i_16 = i_12; i_16 <= i_13; i_16++)
                                        StaticClass26.staticIntArrayArrayArray2[i_7][i_15][i_16] &= ~i_5;
                            }
                        }
                    }
        }

    }

    static final int staticMethod22(int i_0, int i_1) {
        int i_3 = staticMethod23(i_0 + 45365, i_1 + 91923, 4) - 128 + (staticMethod23(i_0 + 10294, i_1 + 37821, 2) - 128 >> 1) + (staticMethod23(i_0, i_1, 1) - 128 >> 2);
        i_3 = 35 + (int) (i_3 * 0.3D);
        if (i_3 < 10)
            i_3 = 10;
        else if (i_3 > 60)
            i_3 = 60;

        return i_3;
    }

    static final int staticMethod23(int i_0, int i_1, int i_2) {
        int i_4 = i_0 / i_2;
        int i_5 = i_0 & i_2 - 1;
        int i_6 = i_1 / i_2;
        int i_7 = i_1 & i_2 - 1;
        int i_8 = staticMethod24(i_4, i_6);
        int i_9 = staticMethod24(i_4 + 1, i_6);
        int i_10 = staticMethod24(i_4, i_6 + 1);
        int i_11 = staticMethod24(i_4 + 1, i_6 + 1);
        int i_13 = 65536 - Rasterizer3D.staticIntArray159[i_5 * 1024 / i_2] >> 1;
        int i_12 = (i_8 * (65536 - i_13) >> 16) + (i_13 * i_9 >> 16);
        int i_15 = 65536 - Rasterizer3D.staticIntArray159[i_5 * 1024 / i_2] >> 1;
        int i_14 = (i_15 * i_11 >> 16) + ((65536 - i_15) * i_10 >> 16);
        int i_17 = 65536 - Rasterizer3D.staticIntArray159[i_7 * 1024 / i_2] >> 1;
        int i_16 = ((65536 - i_17) * i_12 >> 16) + (i_17 * i_14 >> 16);
        return i_16;
    }

    static final int staticMethod24(int i_0, int i_1) {
        int i_3 = staticMethod25(i_0 - 1, i_1 - 1) + staticMethod25(i_0 + 1, i_1 - 1) + staticMethod25(i_0 - 1, i_1 + 1) + staticMethod25(i_0 + 1, i_1 + 1);
        int i_4 = staticMethod25(i_0 - 1, i_1) + staticMethod25(i_0 + 1, i_1) + staticMethod25(i_0, i_1 - 1) + staticMethod25(i_0, i_1 + 1);
        int i_5 = staticMethod25(i_0, i_1);
        return i_4 / 8 + i_3 / 16 + i_5 / 4;
    }

    static final int staticMethod25(int i_0, int i_1) {
        int i_3 = i_0 + i_1 * 57;
        i_3 ^= i_3 << 13;
        int i_4 = 1376312589 + (789221 + i_3 * i_3 * 15731) * i_3 & 0x7fffffff;
        return i_4 >> 19 & 0xff;
    }

    static final int staticMethod26(int i_0, int i_1) {
        if (i_0 == -1)
            return 12345678;
        else {
            i_1 = (i_0 & 0x7f) * i_1 / 128;
            if (i_1 < 2)
                i_1 = 2;
            else if (i_1 > 126)
                i_1 = 126;

            return (i_0 & 0xff80) + i_1;
        }
    }

    static final int staticMethod27(int i_0, int i_1) {
        if (i_0 == -2)
            return 12345678;
        else if (i_0 == -1) {
            if (i_1 < 2)
                i_1 = 2;
            else if (i_1 > 126)
                i_1 = 126;

            return i_1;
        } else {
            i_1 = (i_0 & 0x7f) * i_1 / 128;
            if (i_1 < 2)
                i_1 = 2;
            else if (i_1 > 126)
                i_1 = 126;

            return (i_0 & 0xff80) + i_1;
        }
    }

    static final int staticMethod28(int i_0, int i_1, int i_2) {
        if (i_2 > 179)
            i_1 /= 2;

        if (i_2 > 192)
            i_1 /= 2;

        if (i_2 > 217)
            i_1 /= 2;

        if (i_2 > 243)
            i_1 /= 2;

        int i_4 = (i_0 / 4 << 10) + (i_1 / 32 << 7) + i_2 / 2;
        return i_4;
    }

    static final void staticMethod29(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, Scene scene_7, CollisionMap collisionmap_8) {
        LocType loctype_10 = LocType.staticMethod411(i_4);
        int i_11;
        int i_12;
        if (i_5 != 1 && i_5 != 3) {
            i_11 = loctype_10.int518;
            i_12 = loctype_10.int519;
        } else {
            i_11 = loctype_10.int519;
            i_12 = loctype_10.int518;
        }

        int i_13;
        int i_14;
        if (i_11 + i_2 <= 104) {
            i_13 = i_2 + (i_11 >> 1);
            i_14 = i_2 + (i_11 + 1 >> 1);
        } else {
            i_13 = i_2;
            i_14 = i_2 + 1;
        }

        int i_15;
        int i_16;
        if (i_3 + i_12 <= 104) {
            i_15 = (i_12 >> 1) + i_3;
            i_16 = i_3 + (i_12 + 1 >> 1);
        } else {
            i_15 = i_3;
            i_16 = i_3 + 1;
        }

        int[][] ints_17 = staticIntArrayArrayArray1[i_1];
        int i_18 = ints_17[i_14][i_16] + ints_17[i_14][i_15] + ints_17[i_13][i_15] + ints_17[i_13][i_16] >> 2;
        int i_19 = (i_11 << 6) + (i_2 << 7);
        int i_20 = (i_12 << 6) + (i_3 << 7);
        int i_21 = (i_4 << 14) + (i_3 << 7) + i_2 + 1073741824;
        if (loctype_10.int514 == 0)
            i_21 -= Integer.MIN_VALUE;

        int i_22 = i_6 + (i_5 << 6);
        if (loctype_10.int531 == 1)
            i_22 += 256;

        Object obj_23;
        if (i_6 == 22) {
            if (loctype_10.int532 == -1 && loctype_10.intArray86 == null)
                obj_23 = loctype_10.method560(22, i_5, ints_17, i_19, i_18, i_20);
            else
                obj_23 = new RenderableSub1(i_4, 22, i_5, i_1, i_2, i_3, loctype_10.int532, true, (Renderable) null);

            scene_7.addGroundDecoration(i_0, i_2, i_3, i_18, (Renderable) obj_23, i_21, i_22);
            if (loctype_10.int520 == 1)
                collisionmap_8.method238(i_2, i_3);

        } else if (i_6 != 10 && i_6 != 11) {
            if (i_6 >= 12) {
                if (loctype_10.int532 == -1 && loctype_10.intArray86 == null)
                    obj_23 = loctype_10.method560(i_6, i_5, ints_17, i_19, i_18, i_20);
                else
                    obj_23 = new RenderableSub1(i_4, i_6, i_5, i_1, i_2, i_3, loctype_10.int532, true, (Renderable) null);

                scene_7.method189(i_0, i_2, i_3, i_18, 1, 1, (Renderable) obj_23, 0, i_21, i_22);
                if (loctype_10.int520 != 0)
                    collisionmap_8.flagObject(i_2, i_3, i_11, i_12, loctype_10.bool54);

            } else if (i_6 == 0) {
                if (loctype_10.int532 == -1 && loctype_10.intArray86 == null)
                    obj_23 = loctype_10.method560(0, i_5, ints_17, i_19, i_18, i_20);
                else
                    obj_23 = new RenderableSub1(i_4, 0, i_5, i_1, i_2, i_3, loctype_10.int532, true, (Renderable) null);

                scene_7.method188(i_0, i_2, i_3, i_18, (Renderable) obj_23, (Renderable) null, staticIntArray13[i_5], 0, i_21, i_22);
                if (loctype_10.int520 != 0)
                    collisionmap_8.method235(i_2, i_3, i_6, i_5, loctype_10.bool54);

            } else if (i_6 == 1) {
                if (loctype_10.int532 == -1 && loctype_10.intArray86 == null)
                    obj_23 = loctype_10.method560(1, i_5, ints_17, i_19, i_18, i_20);
                else
                    obj_23 = new RenderableSub1(i_4, 1, i_5, i_1, i_2, i_3, loctype_10.int532, true, (Renderable) null);

                scene_7.method188(i_0, i_2, i_3, i_18, (Renderable) obj_23, (Renderable) null, staticIntArray9[i_5], 0, i_21, i_22);
                if (loctype_10.int520 != 0)
                    collisionmap_8.method235(i_2, i_3, i_6, i_5, loctype_10.bool54);

            } else {
                Object obj_25;
                int i_28;
                if (i_6 == 2) {
                    i_28 = i_5 + 1 & 0x3;
                    Object obj_29;
                    if (loctype_10.int532 == -1 && loctype_10.intArray86 == null) {
                        obj_29 = loctype_10.method560(2, i_5 + 4, ints_17, i_19, i_18, i_20);
                        obj_25 = loctype_10.method560(2, i_28, ints_17, i_19, i_18, i_20);
                    } else {
                        obj_29 = new RenderableSub1(i_4, 2, i_5 + 4, i_1, i_2, i_3, loctype_10.int532, true, (Renderable) null);
                        obj_25 = new RenderableSub1(i_4, 2, i_28, i_1, i_2, i_3, loctype_10.int532, true, (Renderable) null);
                    }

                    scene_7.method188(i_0, i_2, i_3, i_18, (Renderable) obj_29, (Renderable) obj_25, staticIntArray13[i_5], staticIntArray13[i_28], i_21, i_22);
                    if (loctype_10.int520 != 0)
                        collisionmap_8.method235(i_2, i_3, i_6, i_5, loctype_10.bool54);

                } else if (i_6 == 3) {
                    if (loctype_10.int532 == -1 && loctype_10.intArray86 == null)
                        obj_23 = loctype_10.method560(3, i_5, ints_17, i_19, i_18, i_20);
                    else
                        obj_23 = new RenderableSub1(i_4, 3, i_5, i_1, i_2, i_3, loctype_10.int532, true, (Renderable) null);

                    scene_7.method188(i_0, i_2, i_3, i_18, (Renderable) obj_23, (Renderable) null, staticIntArray9[i_5], 0, i_21, i_22);
                    if (loctype_10.int520 != 0)
                        collisionmap_8.method235(i_2, i_3, i_6, i_5, loctype_10.bool54);

                } else if (i_6 == 9) {
                    if (loctype_10.int532 == -1 && loctype_10.intArray86 == null)
                        obj_23 = loctype_10.method560(i_6, i_5, ints_17, i_19, i_18, i_20);
                    else
                        obj_23 = new RenderableSub1(i_4, i_6, i_5, i_1, i_2, i_3, loctype_10.int532, true, (Renderable) null);

                    scene_7.method189(i_0, i_2, i_3, i_18, 1, 1, (Renderable) obj_23, 0, i_21, i_22);
                    if (loctype_10.int520 != 0)
                        collisionmap_8.flagObject(i_2, i_3, i_11, i_12, loctype_10.bool54);

                } else if (i_6 == 4) {
                    if (loctype_10.int532 == -1 && loctype_10.intArray86 == null)
                        obj_23 = loctype_10.method560(4, i_5, ints_17, i_19, i_18, i_20);
                    else
                        obj_23 = new RenderableSub1(i_4, 4, i_5, i_1, i_2, i_3, loctype_10.int532, true, (Renderable) null);

                    scene_7.addWallObject(i_0, i_2, i_3, i_18, (Renderable) obj_23, (Renderable) null, staticIntArray13[i_5], 0, 0, 0, i_21, i_22);
                } else {
                    int i_24;
                    if (i_6 == 5) {
                        i_28 = 16;
                        i_24 = scene_7.method205(i_0, i_2, i_3);
                        if (i_24 != 0)
                            i_28 = LocType.staticMethod411(i_24 >> 14 & 0x7fff).int521;

                        if (loctype_10.int532 == -1 && loctype_10.intArray86 == null)
                            obj_25 = loctype_10.method560(4, i_5, ints_17, i_19, i_18, i_20);
                        else
                            obj_25 = new RenderableSub1(i_4, 4, i_5, i_1, i_2, i_3, loctype_10.int532, true, (Renderable) null);

                        scene_7.addWallObject(i_0, i_2, i_3, i_18, (Renderable) obj_25, (Renderable) null, staticIntArray13[i_5], 0, staticIntArray12[i_5] * i_28, staticIntArray8[i_5] * i_28, i_21, i_22);
                    } else if (i_6 == 6) {
                        i_28 = 8;
                        i_24 = scene_7.method205(i_0, i_2, i_3);
                        if (i_24 != 0)
                            i_28 = LocType.staticMethod411(i_24 >> 14 & 0x7fff).int521 / 2;

                        if (loctype_10.int532 == -1 && loctype_10.intArray86 == null)
                            obj_25 = loctype_10.method560(4, i_5 + 4, ints_17, i_19, i_18, i_20);
                        else
                            obj_25 = new RenderableSub1(i_4, 4, i_5 + 4, i_1, i_2, i_3, loctype_10.int532, true, (Renderable) null);

                        scene_7.addWallObject(i_0, i_2, i_3, i_18, (Renderable) obj_25, (Renderable) null, 256, i_5, staticIntArray10[i_5] * i_28, staticIntArray11[i_5] * i_28, i_21, i_22);
                    } else if (i_6 == 7) {
                        i_24 = i_5 + 2 & 0x3;
                        if (loctype_10.int532 == -1 && loctype_10.intArray86 == null)
                            obj_23 = loctype_10.method560(4, i_24 + 4, ints_17, i_19, i_18, i_20);
                        else
                            obj_23 = new RenderableSub1(i_4, 4, i_24 + 4, i_1, i_2, i_3, loctype_10.int532, true, (Renderable) null);

                        scene_7.addWallObject(i_0, i_2, i_3, i_18, (Renderable) obj_23, (Renderable) null, 256, i_24, 0, 0, i_21, i_22);
                    } else if (i_6 == 8) {
                        i_28 = 8;
                        i_24 = scene_7.method205(i_0, i_2, i_3);
                        if (i_24 != 0)
                            i_28 = LocType.staticMethod411(i_24 >> 14 & 0x7fff).int521 / 2;

                        int i_27 = i_5 + 2 & 0x3;
                        Object obj_26;
                        if (loctype_10.int532 == -1 && loctype_10.intArray86 == null) {
                            obj_25 = loctype_10.method560(4, i_5 + 4, ints_17, i_19, i_18, i_20);
                            obj_26 = loctype_10.method560(4, i_27 + 4, ints_17, i_19, i_18, i_20);
                        } else {
                            obj_25 = new RenderableSub1(i_4, 4, i_5 + 4, i_1, i_2, i_3, loctype_10.int532, true, (Renderable) null);
                            obj_26 = new RenderableSub1(i_4, 4, i_27 + 4, i_1, i_2, i_3, loctype_10.int532, true, (Renderable) null);
                        }

                        scene_7.addWallObject(i_0, i_2, i_3, i_18, (Renderable) obj_25, (Renderable) obj_26, 256, i_5, i_28 * staticIntArray10[i_5], staticIntArray11[i_5] * i_28, i_21, i_22);
                    }
                }
            }
        } else {
            if (loctype_10.int532 == -1 && loctype_10.intArray86 == null)
                obj_23 = loctype_10.method560(10, i_5, ints_17, i_19, i_18, i_20);
            else
                obj_23 = new RenderableSub1(i_4, 10, i_5, i_1, i_2, i_3, loctype_10.int532, true, (Renderable) null);

            if (obj_23 != null)
                scene_7.method189(i_0, i_2, i_3, i_18, i_11, i_12, (Renderable) obj_23, i_6 == 11 ? 256 : 0, i_21, i_22);

            if (loctype_10.int520 != 0)
                collisionmap_8.flagObject(i_2, i_3, i_11, i_12, loctype_10.bool54);

        }
    }

}

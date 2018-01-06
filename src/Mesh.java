public class Mesh extends Renderable {

    static int[] staticIntArray133 = new int[10000];
    static int[] staticIntArray132 = new int[10000];
    static int staticInt320 = 0;
    static int[] staticIntArray134;
    static int[] staticIntArray135;
    int int667 = 0;
    int int664 = 0;
    byte byte6 = 0;
    boolean bool74 = false;
    byte[] byteArray15;
    int int666;
    int[] intArray105;
    int[] intArray106;
    int[] intArray112;
    int[] intArray107;
    int[] intArray108;
    int[] intArray109;
    int[] intArray111;
    byte[] byteArray17;
    byte[] byteArray13;
    byte[] byteArray18;
    int[] intArray110;
    short[] shortArray20;
    short[] shortArray19;
    byte[] byteArray14;
    short[] shortArray22;
    short[] shortArray23;
    short[] shortArray24;
    short[] shortArray18;
    short[] shortArray25;
    short[] shortArray21;
    short[] shortArray28;
    byte[] byteArray16;
    short[] shortArray27;
    short[] shortArray26;
    int[][] intArrayArray13;
    int[][] intArrayArray14;
    VertexNormal[] vertexNormalArray1;
    DataClass11[] dataClass11Array1;
    VertexNormal[] vertexNormalArray2;
    public short short3;
    public short short2;
    int int665;
    int int669;
    int int663;
    int int668;
    int int670;

    static {
        staticIntArray134 = Rasterizer3D.staticIntArray156;
        staticIntArray135 = Rasterizer3D.staticIntArray159;
    }

    Mesh() {
    }

    public static Mesh staticMethod466(Js5Index js5index_0, int i_1, int i_2) {
        byte[] bytes_3 = js5index_0.getFile(i_1, i_2);
        return bytes_3 == null ? null : new Mesh(bytes_3);
    }

    Mesh(byte[] bytes_1) {
        if (bytes_1[bytes_1.length - 1] == -1 && bytes_1[bytes_1.length - 2] == -1)
            method616(bytes_1);
        else
            method617(bytes_1);

    }

    void method616(byte[] bytes_1) {
        Buffer buffer_2 = new Buffer(bytes_1);
        Buffer buffer_3 = new Buffer(bytes_1);
        Buffer buffer_4 = new Buffer(bytes_1);
        Buffer buffer_5 = new Buffer(bytes_1);
        Buffer buffer_6 = new Buffer(bytes_1);
        Buffer buffer_7 = new Buffer(bytes_1);
        Buffer buffer_8 = new Buffer(bytes_1);
        buffer_2.off = bytes_1.length - 23;
        int i_9 = buffer_2.readUShort();
        int i_10 = buffer_2.readUShort();
        int i_11 = buffer_2.readUByte();
        int i_12 = buffer_2.readUByte();
        int i_13 = buffer_2.readUByte();
        int i_14 = buffer_2.readUByte();
        int i_15 = buffer_2.readUByte();
        int i_16 = buffer_2.readUByte();
        int i_17 = buffer_2.readUByte();
        int i_18 = buffer_2.readUShort();
        int i_19 = buffer_2.readUShort();
        int i_20 = buffer_2.readUShort();
        int i_21 = buffer_2.readUShort();
        int i_22 = buffer_2.readUShort();
        int i_23 = 0;
        int i_24 = 0;
        int i_25 = 0;
        int i_26;
        if (i_11 > 0) {
            byteArray15 = new byte[i_11];
            buffer_2.off = 0;

            for (i_26 = 0; i_26 < i_11; i_26++) {
                byte b_27 = byteArray15[i_26] = buffer_2.method440();
                if (b_27 == 0)
                    ++i_23;

                if (b_27 >= 1 && b_27 <= 3)
                    ++i_24;

                if (b_27 == 2)
                    ++i_25;
            }
        }

        i_26 = i_11 + i_9;
        int i_28 = i_26;
        if (i_12 == 1)
            i_26 += i_10;

        int i_29 = i_26;
        i_26 += i_10;
        int i_30 = i_26;
        if (i_13 == 255)
            i_26 += i_10;

        int i_31 = i_26;
        if (i_15 == 1)
            i_26 += i_10;

        int i_32 = i_26;
        if (i_17 == 1)
            i_26 += i_9;

        int i_33 = i_26;
        if (i_14 == 1)
            i_26 += i_10;

        int i_34 = i_26;
        i_26 += i_21;
        int i_35 = i_26;
        if (i_16 == 1)
            i_26 += i_10 * 2;

        int i_36 = i_26;
        i_26 += i_22;
        int i_37 = i_26;
        i_26 += i_10 * 2;
        int i_38 = i_26;
        i_26 += i_18;
        int i_39 = i_26;
        i_26 += i_19;
        int i_40 = i_26;
        i_26 += i_20;
        int i_41 = i_26;
        i_26 += i_23 * 6;
        int i_42 = i_26;
        i_26 += i_24 * 6;
        int i_43 = i_26;
        i_26 += i_24 * 6;
        int i_44 = i_26;
        i_26 += i_24 * 2;
        int i_45 = i_26;
        i_26 += i_24;
        int i_46 = i_26;
        i_26 += i_24 * 2 + i_25 * 2;
        int667 = i_9;
        int664 = i_10;
        int666 = i_11;
        intArray105 = new int[i_9];
        intArray106 = new int[i_9];
        intArray112 = new int[i_9];
        intArray107 = new int[i_10];
        intArray108 = new int[i_10];
        intArray109 = new int[i_10];
        if (i_17 == 1)
            intArray111 = new int[i_9];

        if (i_12 == 1)
            byteArray17 = new byte[i_10];

        if (i_13 == 255)
            byteArray13 = new byte[i_10];
        else
            byte6 = (byte) i_13;

        if (i_14 == 1)
            byteArray18 = new byte[i_10];

        if (i_15 == 1)
            intArray110 = new int[i_10];

        if (i_16 == 1)
            shortArray20 = new short[i_10];

        if (i_16 == 1 && i_11 > 0)
            byteArray14 = new byte[i_10];

        shortArray19 = new short[i_10];
        if (i_11 > 0) {
            shortArray22 = new short[i_11];
            shortArray23 = new short[i_11];
            shortArray24 = new short[i_11];
            if (i_24 > 0) {
                shortArray18 = new short[i_24];
                shortArray25 = new short[i_24];
                shortArray21 = new short[i_24];
                shortArray28 = new short[i_24];
                byteArray16 = new byte[i_24];
                shortArray27 = new short[i_24];
            }

            if (i_25 > 0)
                shortArray26 = new short[i_25];
        }

        buffer_2.off = i_11;
        buffer_3.off = i_38;
        buffer_4.off = i_39;
        buffer_5.off = i_40;
        buffer_6.off = i_32;
        int i_48 = 0;
        int i_49 = 0;
        int i_50 = 0;

        int i_51;
        int i_52;
        int i_53;
        int i_54;
        int i_55;
        for (i_51 = 0; i_51 < i_9; i_51++) {
            i_52 = buffer_2.readUByte();
            i_53 = 0;
            if ((i_52 & 0x1) != 0)
                i_53 = buffer_3.method452();

            i_54 = 0;
            if ((i_52 & 0x2) != 0)
                i_54 = buffer_4.method452();

            i_55 = 0;
            if ((i_52 & 0x4) != 0)
                i_55 = buffer_5.method452();

            intArray105[i_51] = i_48 + i_53;
            intArray106[i_51] = i_49 + i_54;
            intArray112[i_51] = i_50 + i_55;
            i_48 = intArray105[i_51];
            i_49 = intArray106[i_51];
            i_50 = intArray112[i_51];
            if (i_17 == 1)
                intArray111[i_51] = buffer_6.readUByte();
        }

        buffer_2.off = i_37;
        buffer_3.off = i_28;
        buffer_4.off = i_30;
        buffer_5.off = i_33;
        buffer_6.off = i_31;
        buffer_7.off = i_35;
        buffer_8.off = i_36;

        for (i_51 = 0; i_51 < i_10; i_51++) {
            shortArray19[i_51] = (short) buffer_2.readUShort();
            if (i_12 == 1)
                byteArray17[i_51] = buffer_3.method440();

            if (i_13 == 255)
                byteArray13[i_51] = buffer_4.method440();

            if (i_14 == 1)
                byteArray18[i_51] = buffer_5.method440();

            if (i_15 == 1)
                intArray110[i_51] = buffer_6.readUByte();

            if (i_16 == 1)
                shortArray20[i_51] = (short) (buffer_7.readUShort() - 1);

            if (byteArray14 != null && shortArray20[i_51] != -1)
                byteArray14[i_51] = (byte) (buffer_8.readUByte() - 1);
        }

        buffer_2.off = i_34;
        buffer_3.off = i_29;
        i_51 = 0;
        i_52 = 0;
        i_53 = 0;
        i_54 = 0;

        int i_56;
        for (i_55 = 0; i_55 < i_10; i_55++) {
            i_56 = buffer_3.readUByte();
            if (i_56 == 1) {
                i_51 = buffer_2.method452() + i_54;
                i_52 = buffer_2.method452() + i_51;
                i_53 = buffer_2.method452() + i_52;
                i_54 = i_53;
                intArray107[i_55] = i_51;
                intArray108[i_55] = i_52;
                intArray109[i_55] = i_53;
            }

            if (i_56 == 2) {
                i_52 = i_53;
                i_53 = buffer_2.method452() + i_54;
                i_54 = i_53;
                intArray107[i_55] = i_51;
                intArray108[i_55] = i_52;
                intArray109[i_55] = i_53;
            }

            if (i_56 == 3) {
                i_51 = i_53;
                i_53 = buffer_2.method452() + i_54;
                i_54 = i_53;
                intArray107[i_55] = i_51;
                intArray108[i_55] = i_52;
                intArray109[i_55] = i_53;
            }

            if (i_56 == 4) {
                int i_57 = i_51;
                i_51 = i_52;
                i_52 = i_57;
                i_53 = buffer_2.method452() + i_54;
                i_54 = i_53;
                intArray107[i_55] = i_51;
                intArray108[i_55] = i_57;
                intArray109[i_55] = i_53;
            }
        }

        buffer_2.off = i_41;
        buffer_3.off = i_42;
        buffer_4.off = i_43;
        buffer_5.off = i_44;
        buffer_6.off = i_45;
        buffer_7.off = i_46;

        for (i_55 = 0; i_55 < i_11; i_55++) {
            i_56 = byteArray15[i_55] & 0xff;
            if (i_56 == 0) {
                shortArray22[i_55] = (short) buffer_2.readUShort();
                shortArray23[i_55] = (short) buffer_2.readUShort();
                shortArray24[i_55] = (short) buffer_2.readUShort();
            }

            if (i_56 == 1) {
                shortArray22[i_55] = (short) buffer_3.readUShort();
                shortArray23[i_55] = (short) buffer_3.readUShort();
                shortArray24[i_55] = (short) buffer_3.readUShort();
                shortArray18[i_55] = (short) buffer_4.readUShort();
                shortArray25[i_55] = (short) buffer_4.readUShort();
                shortArray21[i_55] = (short) buffer_4.readUShort();
                shortArray28[i_55] = (short) buffer_5.readUShort();
                byteArray16[i_55] = buffer_6.method440();
                shortArray27[i_55] = (short) buffer_7.readUShort();
            }

            if (i_56 == 2) {
                shortArray22[i_55] = (short) buffer_3.readUShort();
                shortArray23[i_55] = (short) buffer_3.readUShort();
                shortArray24[i_55] = (short) buffer_3.readUShort();
                shortArray18[i_55] = (short) buffer_4.readUShort();
                shortArray25[i_55] = (short) buffer_4.readUShort();
                shortArray21[i_55] = (short) buffer_4.readUShort();
                shortArray28[i_55] = (short) buffer_5.readUShort();
                byteArray16[i_55] = buffer_6.method440();
                shortArray27[i_55] = (short) buffer_7.readUShort();
                shortArray26[i_55] = (short) buffer_7.readUShort();
            }

            if (i_56 == 3) {
                shortArray22[i_55] = (short) buffer_3.readUShort();
                shortArray23[i_55] = (short) buffer_3.readUShort();
                shortArray24[i_55] = (short) buffer_3.readUShort();
                shortArray18[i_55] = (short) buffer_4.readUShort();
                shortArray25[i_55] = (short) buffer_4.readUShort();
                shortArray21[i_55] = (short) buffer_4.readUShort();
                shortArray28[i_55] = (short) buffer_5.readUShort();
                byteArray16[i_55] = buffer_6.method440();
                shortArray27[i_55] = (short) buffer_7.readUShort();
            }
        }

        buffer_2.off = i_26;
        i_55 = buffer_2.readUByte();
        if (i_55 != 0) {
            new DataClass8();
            buffer_2.readUShort();
            buffer_2.readUShort();
            buffer_2.readUShort();
            buffer_2.readInt();
        }

    }

    void method617(byte[] bytes_1) {
        boolean bool_2 = false;
        boolean bool_3 = false;
        Buffer buffer_4 = new Buffer(bytes_1);
        Buffer buffer_5 = new Buffer(bytes_1);
        Buffer buffer_6 = new Buffer(bytes_1);
        Buffer buffer_7 = new Buffer(bytes_1);
        Buffer buffer_8 = new Buffer(bytes_1);
        buffer_4.off = bytes_1.length - 18;
        int i_9 = buffer_4.readUShort();
        int i_10 = buffer_4.readUShort();
        int i_11 = buffer_4.readUByte();
        int i_12 = buffer_4.readUByte();
        int i_13 = buffer_4.readUByte();
        int i_14 = buffer_4.readUByte();
        int i_15 = buffer_4.readUByte();
        int i_16 = buffer_4.readUByte();
        int i_17 = buffer_4.readUShort();
        int i_18 = buffer_4.readUShort();
        int i_19 = buffer_4.readUShort();
        int i_20 = buffer_4.readUShort();
        byte b_21 = 0;
        int i_45 = b_21 + i_9;
        int i_23 = i_45;
        i_45 += i_10;
        int i_24 = i_45;
        if (i_13 == 255)
            i_45 += i_10;

        int i_25 = i_45;
        if (i_15 == 1)
            i_45 += i_10;

        int i_26 = i_45;
        if (i_12 == 1)
            i_45 += i_10;

        int i_27 = i_45;
        if (i_16 == 1)
            i_45 += i_9;

        int i_28 = i_45;
        if (i_14 == 1)
            i_45 += i_10;

        int i_29 = i_45;
        i_45 += i_20;
        int i_30 = i_45;
        i_45 += i_10 * 2;
        int i_31 = i_45;
        i_45 += i_11 * 6;
        int i_32 = i_45;
        i_45 += i_17;
        int i_33 = i_45;
        i_45 += i_18;
        int i_10000 = i_45 + i_19;
        int667 = i_9;
        int664 = i_10;
        int666 = i_11;
        intArray105 = new int[i_9];
        intArray106 = new int[i_9];
        intArray112 = new int[i_9];
        intArray107 = new int[i_10];
        intArray108 = new int[i_10];
        intArray109 = new int[i_10];
        if (i_11 > 0) {
            byteArray15 = new byte[i_11];
            shortArray22 = new short[i_11];
            shortArray23 = new short[i_11];
            shortArray24 = new short[i_11];
        }

        if (i_16 == 1)
            intArray111 = new int[i_9];

        if (i_12 == 1) {
            byteArray17 = new byte[i_10];
            byteArray14 = new byte[i_10];
            shortArray20 = new short[i_10];
        }

        if (i_13 == 255)
            byteArray13 = new byte[i_10];
        else
            byte6 = (byte) i_13;

        if (i_14 == 1)
            byteArray18 = new byte[i_10];

        if (i_15 == 1)
            intArray110 = new int[i_10];

        shortArray19 = new short[i_10];
        buffer_4.off = b_21;
        buffer_5.off = i_32;
        buffer_6.off = i_33;
        buffer_7.off = i_45;
        buffer_8.off = i_27;
        int i_35 = 0;
        int i_36 = 0;
        int i_37 = 0;

        int i_38;
        int i_39;
        int i_40;
        int i_41;
        int i_42;
        for (i_38 = 0; i_38 < i_9; i_38++) {
            i_39 = buffer_4.readUByte();
            i_40 = 0;
            if ((i_39 & 0x1) != 0)
                i_40 = buffer_5.method452();

            i_41 = 0;
            if ((i_39 & 0x2) != 0)
                i_41 = buffer_6.method452();

            i_42 = 0;
            if ((i_39 & 0x4) != 0)
                i_42 = buffer_7.method452();

            intArray105[i_38] = i_35 + i_40;
            intArray106[i_38] = i_36 + i_41;
            intArray112[i_38] = i_37 + i_42;
            i_35 = intArray105[i_38];
            i_36 = intArray106[i_38];
            i_37 = intArray112[i_38];
            if (i_16 == 1)
                intArray111[i_38] = buffer_8.readUByte();
        }

        buffer_4.off = i_30;
        buffer_5.off = i_26;
        buffer_6.off = i_24;
        buffer_7.off = i_28;
        buffer_8.off = i_25;

        for (i_38 = 0; i_38 < i_10; i_38++) {
            shortArray19[i_38] = (short) buffer_4.readUShort();
            if (i_12 == 1) {
                i_39 = buffer_5.readUByte();
                if ((i_39 & 0x1) == 1) {
                    byteArray17[i_38] = 1;
                    bool_2 = true;
                } else
                    byteArray17[i_38] = 0;

                if ((i_39 & 0x2) == 2) {
                    byteArray14[i_38] = (byte) (i_39 >> 2);
                    shortArray20[i_38] = shortArray19[i_38];
                    shortArray19[i_38] = 127;
                    if (shortArray20[i_38] != -1)
                        bool_3 = true;
                } else {
                    byteArray14[i_38] = -1;
                    shortArray20[i_38] = -1;
                }
            }

            if (i_13 == 255)
                byteArray13[i_38] = buffer_6.method440();

            if (i_14 == 1)
                byteArray18[i_38] = buffer_7.method440();

            if (i_15 == 1)
                intArray110[i_38] = buffer_8.readUByte();
        }

        buffer_4.off = i_29;
        buffer_5.off = i_23;
        i_38 = 0;
        i_39 = 0;
        i_40 = 0;
        i_41 = 0;

        int i_43;
        int i_44;
        for (i_42 = 0; i_42 < i_10; i_42++) {
            i_43 = buffer_5.readUByte();
            if (i_43 == 1) {
                i_38 = buffer_4.method452() + i_41;
                i_39 = buffer_4.method452() + i_38;
                i_40 = buffer_4.method452() + i_39;
                i_41 = i_40;
                intArray107[i_42] = i_38;
                intArray108[i_42] = i_39;
                intArray109[i_42] = i_40;
            }

            if (i_43 == 2) {
                i_39 = i_40;
                i_40 = buffer_4.method452() + i_41;
                i_41 = i_40;
                intArray107[i_42] = i_38;
                intArray108[i_42] = i_39;
                intArray109[i_42] = i_40;
            }

            if (i_43 == 3) {
                i_38 = i_40;
                i_40 = buffer_4.method452() + i_41;
                i_41 = i_40;
                intArray107[i_42] = i_38;
                intArray108[i_42] = i_39;
                intArray109[i_42] = i_40;
            }

            if (i_43 == 4) {
                i_44 = i_38;
                i_38 = i_39;
                i_39 = i_44;
                i_40 = buffer_4.method452() + i_41;
                i_41 = i_40;
                intArray107[i_42] = i_38;
                intArray108[i_42] = i_44;
                intArray109[i_42] = i_40;
            }
        }

        buffer_4.off = i_31;

        for (i_42 = 0; i_42 < i_11; i_42++) {
            byteArray15[i_42] = 0;
            shortArray22[i_42] = (short) buffer_4.readUShort();
            shortArray23[i_42] = (short) buffer_4.readUShort();
            shortArray24[i_42] = (short) buffer_4.readUShort();
        }

        if (byteArray14 != null) {
            boolean bool_46 = false;

            for (i_43 = 0; i_43 < i_10; i_43++) {
                i_44 = byteArray14[i_43] & 0xff;
                if (i_44 != 255)
                    if ((shortArray22[i_44] & 0xffff) == intArray107[i_43] && (shortArray23[i_44] & 0xffff) == intArray108[i_43] && (shortArray24[i_44] & 0xffff) == intArray109[i_43])
                        byteArray14[i_43] = -1;
                    else
                        bool_46 = true;
            }

            if (!bool_46)
                byteArray14 = null;
        }

        if (!bool_3)
            shortArray20 = null;

        if (!bool_2)
            byteArray17 = null;

    }

    public Mesh(Mesh[] arr_1, int i_2) {
        boolean bool_3 = false;
        boolean bool_4 = false;
        boolean bool_5 = false;
        boolean bool_6 = false;
        boolean bool_7 = false;
        boolean bool_8 = false;
        int667 = 0;
        int664 = 0;
        int666 = 0;
        byte6 = -1;

        int i_9;
        Mesh mesh_10;
        for (i_9 = 0; i_9 < i_2; i_9++) {
            mesh_10 = arr_1[i_9];
            if (mesh_10 != null) {
                int667 += mesh_10.int667;
                int664 += mesh_10.int664;
                int666 += mesh_10.int666;
                if (mesh_10.byteArray13 != null)
                    bool_4 = true;
                else {
                    if (byte6 == -1)
                        byte6 = mesh_10.byte6;

                    if (byte6 != mesh_10.byte6)
                        bool_4 = true;
                }

                bool_3 |= mesh_10.byteArray17 != null;
                bool_5 |= mesh_10.byteArray18 != null;
                bool_6 |= mesh_10.intArray110 != null;
                bool_7 |= mesh_10.shortArray20 != null;
                bool_8 |= mesh_10.byteArray14 != null;
            }
        }

        intArray105 = new int[int667];
        intArray106 = new int[int667];
        intArray112 = new int[int667];
        intArray111 = new int[int667];
        intArray107 = new int[int664];
        intArray108 = new int[int664];
        intArray109 = new int[int664];
        if (bool_3)
            byteArray17 = new byte[int664];

        if (bool_4)
            byteArray13 = new byte[int664];

        if (bool_5)
            byteArray18 = new byte[int664];

        if (bool_6)
            intArray110 = new int[int664];

        if (bool_7)
            shortArray20 = new short[int664];

        if (bool_8)
            byteArray14 = new byte[int664];

        shortArray19 = new short[int664];
        if (int666 > 0) {
            byteArray15 = new byte[int666];
            shortArray22 = new short[int666];
            shortArray23 = new short[int666];
            shortArray24 = new short[int666];
            shortArray18 = new short[int666];
            shortArray25 = new short[int666];
            shortArray21 = new short[int666];
            shortArray28 = new short[int666];
            byteArray16 = new byte[int666];
            shortArray27 = new short[int666];
            shortArray26 = new short[int666];
        }

        int667 = 0;
        int664 = 0;
        int666 = 0;

        for (i_9 = 0; i_9 < i_2; i_9++) {
            mesh_10 = arr_1[i_9];
            if (mesh_10 != null) {
                int i_11;
                for (i_11 = 0; i_11 < mesh_10.int664; i_11++) {
                    if (bool_3 && mesh_10.byteArray17 != null)
                        byteArray17[int664] = mesh_10.byteArray17[i_11];

                    if (bool_4)
                        if (mesh_10.byteArray13 != null)
                            byteArray13[int664] = mesh_10.byteArray13[i_11];
                        else
                            byteArray13[int664] = mesh_10.byte6;

                    if (bool_5 && mesh_10.byteArray18 != null)
                        byteArray18[int664] = mesh_10.byteArray18[i_11];

                    if (bool_6 && mesh_10.intArray110 != null)
                        intArray110[int664] = mesh_10.intArray110[i_11];

                    if (bool_7)
                        if (mesh_10.shortArray20 != null)
                            shortArray20[int664] = mesh_10.shortArray20[i_11];
                        else
                            shortArray20[int664] = -1;

                    if (bool_8)
                        if (mesh_10.byteArray14 != null && mesh_10.byteArray14[i_11] != -1)
                            byteArray14[int664] = (byte) (mesh_10.byteArray14[i_11] + int666);
                        else
                            byteArray14[int664] = -1;

                    shortArray19[int664] = mesh_10.shortArray19[i_11];
                    intArray107[int664] = method618(mesh_10, mesh_10.intArray107[i_11]);
                    intArray108[int664] = method618(mesh_10, mesh_10.intArray108[i_11]);
                    intArray109[int664] = method618(mesh_10, mesh_10.intArray109[i_11]);
                    ++int664;
                }

                for (i_11 = 0; i_11 < mesh_10.int666; i_11++) {
                    byte b_12 = byteArray15[int666] = mesh_10.byteArray15[i_11];
                    if (b_12 == 0) {
                        shortArray22[int666] = (short) method618(mesh_10, mesh_10.shortArray22[i_11]);
                        shortArray23[int666] = (short) method618(mesh_10, mesh_10.shortArray23[i_11]);
                        shortArray24[int666] = (short) method618(mesh_10, mesh_10.shortArray24[i_11]);
                    }

                    if (b_12 >= 1 && b_12 <= 3) {
                        shortArray22[int666] = mesh_10.shortArray22[i_11];
                        shortArray23[int666] = mesh_10.shortArray23[i_11];
                        shortArray24[int666] = mesh_10.shortArray24[i_11];
                        shortArray18[int666] = mesh_10.shortArray18[i_11];
                        shortArray25[int666] = mesh_10.shortArray25[i_11];
                        shortArray21[int666] = mesh_10.shortArray21[i_11];
                        shortArray28[int666] = mesh_10.shortArray28[i_11];
                        byteArray16[int666] = mesh_10.byteArray16[i_11];
                        shortArray27[int666] = mesh_10.shortArray27[i_11];
                    }

                    if (b_12 == 2)
                        shortArray26[int666] = mesh_10.shortArray26[i_11];

                    ++int666;
                }
            }
        }

    }

    final int method618(Mesh mesh_1, int i_2) {
        int i_3 = -1;
        int i_4 = mesh_1.intArray105[i_2];
        int i_5 = mesh_1.intArray106[i_2];
        int i_6 = mesh_1.intArray112[i_2];

        for (int i_7 = 0; i_7 < int667; i_7++)
            if (i_4 == intArray105[i_7] && i_5 == intArray106[i_7] && i_6 == intArray112[i_7]) {
                i_3 = i_7;
                break;
            }

        if (i_3 == -1) {
            intArray105[int667] = i_4;
            intArray106[int667] = i_5;
            intArray112[int667] = i_6;
            if (mesh_1.intArray111 != null)
                intArray111[int667] = mesh_1.intArray111[i_2];

            i_3 = int667++;
        }

        return i_3;
    }

    public Mesh(Mesh mesh_1, boolean bool_2, boolean bool_3, boolean bool_4, boolean bool_5) {
        int667 = mesh_1.int667;
        int664 = mesh_1.int664;
        int666 = mesh_1.int666;
        int i_6;
        if (bool_2) {
            intArray105 = mesh_1.intArray105;
            intArray106 = mesh_1.intArray106;
            intArray112 = mesh_1.intArray112;
        } else {
            intArray105 = new int[int667];
            intArray106 = new int[int667];
            intArray112 = new int[int667];

            for (i_6 = 0; i_6 < int667; i_6++) {
                intArray105[i_6] = mesh_1.intArray105[i_6];
                intArray106[i_6] = mesh_1.intArray106[i_6];
                intArray112[i_6] = mesh_1.intArray112[i_6];
            }
        }

        if (bool_3)
            shortArray19 = mesh_1.shortArray19;
        else {
            shortArray19 = new short[int664];

            for (i_6 = 0; i_6 < int664; i_6++)
                shortArray19[i_6] = mesh_1.shortArray19[i_6];
        }

        if (!bool_4 && mesh_1.shortArray20 != null) {
            shortArray20 = new short[int664];

            for (i_6 = 0; i_6 < int664; i_6++)
                shortArray20[i_6] = mesh_1.shortArray20[i_6];
        } else
            shortArray20 = mesh_1.shortArray20;

        if (bool_5)
            byteArray18 = mesh_1.byteArray18;
        else {
            byteArray18 = new byte[int664];
            if (mesh_1.byteArray18 == null)
                for (i_6 = 0; i_6 < int664; i_6++)
                    byteArray18[i_6] = 0;
            else
                for (i_6 = 0; i_6 < int664; i_6++)
                    byteArray18[i_6] = mesh_1.byteArray18[i_6];
        }

        intArray107 = mesh_1.intArray107;
        intArray108 = mesh_1.intArray108;
        intArray109 = mesh_1.intArray109;
        byteArray17 = mesh_1.byteArray17;
        byteArray13 = mesh_1.byteArray13;
        byteArray14 = mesh_1.byteArray14;
        byte6 = mesh_1.byte6;
        byteArray15 = mesh_1.byteArray15;
        shortArray22 = mesh_1.shortArray22;
        shortArray23 = mesh_1.shortArray23;
        shortArray24 = mesh_1.shortArray24;
        shortArray18 = mesh_1.shortArray18;
        shortArray25 = mesh_1.shortArray25;
        shortArray21 = mesh_1.shortArray21;
        shortArray28 = mesh_1.shortArray28;
        byteArray16 = mesh_1.byteArray16;
        shortArray27 = mesh_1.shortArray27;
        shortArray26 = mesh_1.shortArray26;
        intArray111 = mesh_1.intArray111;
        intArray110 = mesh_1.intArray110;
        intArrayArray13 = mesh_1.intArrayArray13;
        intArrayArray14 = mesh_1.intArrayArray14;
        vertexNormalArray1 = mesh_1.vertexNormalArray1;
        dataClass11Array1 = mesh_1.dataClass11Array1;
        vertexNormalArray2 = mesh_1.vertexNormalArray2;
        short3 = mesh_1.short3;
        short2 = mesh_1.short2;
    }

    public Mesh method619() {
        Mesh mesh_1 = new Mesh();
        if (byteArray17 != null) {
            mesh_1.byteArray17 = new byte[int664];

            for (int i_2 = 0; i_2 < int664; i_2++)
                mesh_1.byteArray17[i_2] = byteArray17[i_2];
        }

        mesh_1.int667 = int667;
        mesh_1.int664 = int664;
        mesh_1.int666 = int666;
        mesh_1.intArray105 = intArray105;
        mesh_1.intArray106 = intArray106;
        mesh_1.intArray112 = intArray112;
        mesh_1.intArray107 = intArray107;
        mesh_1.intArray108 = intArray108;
        mesh_1.intArray109 = intArray109;
        mesh_1.byteArray13 = byteArray13;
        mesh_1.byteArray18 = byteArray18;
        mesh_1.byteArray14 = byteArray14;
        mesh_1.shortArray19 = shortArray19;
        mesh_1.shortArray20 = shortArray20;
        mesh_1.byte6 = byte6;
        mesh_1.byteArray15 = byteArray15;
        mesh_1.shortArray22 = shortArray22;
        mesh_1.shortArray23 = shortArray23;
        mesh_1.shortArray24 = shortArray24;
        mesh_1.shortArray18 = shortArray18;
        mesh_1.shortArray25 = shortArray25;
        mesh_1.shortArray21 = shortArray21;
        mesh_1.shortArray28 = shortArray28;
        mesh_1.byteArray16 = byteArray16;
        mesh_1.shortArray27 = shortArray27;
        mesh_1.shortArray26 = shortArray26;
        mesh_1.intArray111 = intArray111;
        mesh_1.intArray110 = intArray110;
        mesh_1.intArrayArray13 = intArrayArray13;
        mesh_1.intArrayArray14 = intArrayArray14;
        mesh_1.vertexNormalArray1 = vertexNormalArray1;
        mesh_1.dataClass11Array1 = dataClass11Array1;
        mesh_1.short3 = short3;
        mesh_1.short2 = short2;
        return mesh_1;
    }

    public Mesh method620(int[][] ints_1, int i_2, int i_3, int i_4, boolean bool_5, int i_6) {
        method633();
        int i_7 = i_2 + int669;
        int i_8 = i_2 + int663;
        int i_9 = i_4 + int670;
        int i_10 = i_4 + int668;
        if (i_7 >= 0 && i_8 + 128 >> 7 < ints_1.length && i_9 >= 0 && i_10 + 128 >> 7 < ints_1[0].length) {
            i_7 >>= 7;
            i_8 = i_8 + 127 >> 7;
            i_9 >>= 7;
            i_10 = i_10 + 127 >> 7;
            if (ints_1[i_7][i_9] == i_3 && ints_1[i_8][i_9] == i_3 && ints_1[i_7][i_10] == i_3 && ints_1[i_8][i_10] == i_3)
                return this;
            else {
                Mesh mesh_11;
                if (bool_5) {
                    mesh_11 = new Mesh();
                    mesh_11.int667 = int667;
                    mesh_11.int664 = int664;
                    mesh_11.int666 = int666;
                    mesh_11.intArray105 = intArray105;
                    mesh_11.intArray112 = intArray112;
                    mesh_11.intArray107 = intArray107;
                    mesh_11.intArray108 = intArray108;
                    mesh_11.intArray109 = intArray109;
                    mesh_11.byteArray17 = byteArray17;
                    mesh_11.byteArray13 = byteArray13;
                    mesh_11.byteArray18 = byteArray18;
                    mesh_11.byteArray14 = byteArray14;
                    mesh_11.shortArray19 = shortArray19;
                    mesh_11.shortArray20 = shortArray20;
                    mesh_11.byte6 = byte6;
                    mesh_11.byteArray15 = byteArray15;
                    mesh_11.shortArray22 = shortArray22;
                    mesh_11.shortArray23 = shortArray23;
                    mesh_11.shortArray24 = shortArray24;
                    mesh_11.shortArray18 = shortArray18;
                    mesh_11.shortArray25 = shortArray25;
                    mesh_11.shortArray21 = shortArray21;
                    mesh_11.shortArray28 = shortArray28;
                    mesh_11.byteArray16 = byteArray16;
                    mesh_11.shortArray27 = shortArray27;
                    mesh_11.shortArray26 = shortArray26;
                    mesh_11.intArray111 = intArray111;
                    mesh_11.intArray110 = intArray110;
                    mesh_11.intArrayArray13 = intArrayArray13;
                    mesh_11.intArrayArray14 = intArrayArray14;
                    mesh_11.short3 = short3;
                    mesh_11.short2 = short2;
                    mesh_11.intArray106 = new int[mesh_11.int667];
                } else
                    mesh_11 = this;

                int i_12;
                int i_13;
                int i_14;
                int i_15;
                int i_16;
                int i_17;
                int i_18;
                int i_19;
                int i_20;
                int i_21;
                if (i_6 == 0)
                    for (i_12 = 0; i_12 < mesh_11.int667; i_12++) {
                        i_13 = intArray105[i_12] + i_2;
                        i_14 = intArray112[i_12] + i_4;
                        i_15 = i_13 & 0x7f;
                        i_16 = i_14 & 0x7f;
                        i_17 = i_13 >> 7;
                        i_18 = i_14 >> 7;
                        i_19 = ints_1[i_17][i_18] * (128 - i_15) + ints_1[i_17 + 1][i_18] * i_15 >> 7;
                        i_20 = ints_1[i_17][i_18 + 1] * (128 - i_15) + ints_1[i_17 + 1][i_18 + 1] * i_15 >> 7;
                        i_21 = i_19 * (128 - i_16) + i_20 * i_16 >> 7;
                        mesh_11.intArray106[i_12] = intArray106[i_12] + i_21 - i_3;
                    }
                else
                    for (i_12 = 0; i_12 < mesh_11.int667; i_12++) {
                        i_13 = (-intArray106[i_12] << 16) / modelHeight;
                        if (i_13 < i_6) {
                            i_14 = intArray105[i_12] + i_2;
                            i_15 = intArray112[i_12] + i_4;
                            i_16 = i_14 & 0x7f;
                            i_17 = i_15 & 0x7f;
                            i_18 = i_14 >> 7;
                            i_19 = i_15 >> 7;
                            i_20 = ints_1[i_18][i_19] * (128 - i_16) + ints_1[i_18 + 1][i_19] * i_16 >> 7;
                            i_21 = ints_1[i_18][i_19 + 1] * (128 - i_16) + ints_1[i_18 + 1][i_19 + 1] * i_16 >> 7;
                            int i_22 = i_20 * (128 - i_17) + i_21 * i_17 >> 7;
                            mesh_11.intArray106[i_12] = intArray106[i_12] + (i_22 - i_3) * (i_6 - i_13) / i_6;
                        }
                    }

                mesh_11.method632();
                return mesh_11;
            }
        } else
            return this;
    }

    void method621() {
        int[] ints_1;
        int i_2;
        int i_3;
        int i_4;
        if (intArray111 != null) {
            ints_1 = new int[256];
            i_2 = 0;

            for (i_3 = 0; i_3 < int667; i_3++) {
                i_4 = intArray111[i_3];
                ++ints_1[i_4];
                if (i_4 > i_2)
                    i_2 = i_4;
            }

            intArrayArray13 = new int[i_2 + 1][];

            for (i_3 = 0; i_3 <= i_2; i_3++) {
                intArrayArray13[i_3] = new int[ints_1[i_3]];
                ints_1[i_3] = 0;
            }

            for (i_3 = 0; i_3 < int667; intArrayArray13[i_4][ints_1[i_4]++] = i_3++)
                i_4 = intArray111[i_3];

            intArray111 = null;
        }

        if (intArray110 != null) {
            ints_1 = new int[256];
            i_2 = 0;

            for (i_3 = 0; i_3 < int664; i_3++) {
                i_4 = intArray110[i_3];
                ++ints_1[i_4];
                if (i_4 > i_2)
                    i_2 = i_4;
            }

            intArrayArray14 = new int[i_2 + 1][];

            for (i_3 = 0; i_3 <= i_2; i_3++) {
                intArrayArray14[i_3] = new int[ints_1[i_3]];
                ints_1[i_3] = 0;
            }

            for (i_3 = 0; i_3 < int664; intArrayArray14[i_4][ints_1[i_4]++] = i_3++)
                i_4 = intArray110[i_3];

            intArray110 = null;
        }

    }

    public void method622() {
        for (int i_1 = 0; i_1 < int667; i_1++) {
            int i_2 = intArray105[i_1];
            intArray105[i_1] = intArray112[i_1];
            intArray112[i_1] = -i_2;
        }

        method632();
    }

    public void method623() {
        for (int i_1 = 0; i_1 < int667; i_1++) {
            intArray105[i_1] = -intArray105[i_1];
            intArray112[i_1] = -intArray112[i_1];
        }

        method632();
    }

    public void method624() {
        for (int i_1 = 0; i_1 < int667; i_1++) {
            int i_2 = intArray112[i_1];
            intArray112[i_1] = intArray105[i_1];
            intArray105[i_1] = -i_2;
        }

        method632();
    }

    public void method625(int i_1) {
        int i_2 = staticIntArray134[i_1];
        int i_3 = staticIntArray135[i_1];

        for (int i_4 = 0; i_4 < int667; i_4++) {
            int i_5 = intArray112[i_4] * i_2 + intArray105[i_4] * i_3 >> 16;
            intArray112[i_4] = intArray112[i_4] * i_3 - intArray105[i_4] * i_2 >> 16;
            intArray105[i_4] = i_5;
        }

        method632();
    }

    public void method626(int i_1, int i_2, int i_3) {
        for (int i_4 = 0; i_4 < int667; i_4++) {
            intArray105[i_4] += i_1;
            intArray106[i_4] += i_2;
            intArray112[i_4] += i_3;
        }

        method632();
    }

    public void method627(short s_1, short s_2) {
        for (int i_3 = 0; i_3 < int664; i_3++)
            if (shortArray19[i_3] == s_1)
                shortArray19[i_3] = s_2;

    }

    public void method628(short s_1, short s_2) {
        if (shortArray20 != null)
            for (int i_3 = 0; i_3 < int664; i_3++)
                if (shortArray20[i_3] == s_1)
                    shortArray20[i_3] = s_2;
    }

    public void method629() {
        int i_1;
        for (i_1 = 0; i_1 < int667; i_1++)
            intArray112[i_1] = -intArray112[i_1];

        for (i_1 = 0; i_1 < int664; i_1++) {
            int i_2 = intArray107[i_1];
            intArray107[i_1] = intArray109[i_1];
            intArray109[i_1] = i_2;
        }

        method632();
    }

    public void method630(int i_1, int i_2, int i_3) {
        for (int i_4 = 0; i_4 < int667; i_4++) {
            intArray105[i_4] = intArray105[i_4] * i_1 / 128;
            intArray106[i_4] = intArray106[i_4] * i_2 / 128;
            intArray112[i_4] = intArray112[i_4] * i_3 / 128;
        }

        method632();
    }

    public void method631() {
        if (vertexNormalArray1 == null) {
            vertexNormalArray1 = new VertexNormal[int667];

            int i_1;
            for (i_1 = 0; i_1 < int667; i_1++)
                vertexNormalArray1[i_1] = new VertexNormal();

            for (i_1 = 0; i_1 < int664; i_1++) {
                int i_2 = intArray107[i_1];
                int i_3 = intArray108[i_1];
                int i_4 = intArray109[i_1];
                int i_5 = intArray105[i_3] - intArray105[i_2];
                int i_6 = intArray106[i_3] - intArray106[i_2];
                int i_7 = intArray112[i_3] - intArray112[i_2];
                int i_8 = intArray105[i_4] - intArray105[i_2];
                int i_9 = intArray106[i_4] - intArray106[i_2];
                int i_10 = intArray112[i_4] - intArray112[i_2];
                int i_11 = i_6 * i_10 - i_9 * i_7;
                int i_12 = i_7 * i_8 - i_10 * i_5;

                int i_13;
                for (i_13 = i_5 * i_9 - i_8 * i_6; i_11 > 8192 || i_12 > 8192 || i_13 > 8192 || i_11 < -8192 || i_12 < -8192 || i_13 < -8192; i_13 >>= 1) {
                    i_11 >>= 1;
                    i_12 >>= 1;
                }

                int i_14 = (int) Math.sqrt(i_11 * i_11 + i_12 * i_12 + i_13 * i_13);
                if (i_14 <= 0)
                    i_14 = 1;

                i_11 = i_11 * 256 / i_14;
                i_12 = i_12 * 256 / i_14;
                i_13 = i_13 * 256 / i_14;
                byte b_15;
                if (byteArray17 == null)
                    b_15 = 0;
                else
                    b_15 = byteArray17[i_1];

                if (b_15 == 0) {
                    VertexNormal vertexnormal_16 = vertexNormalArray1[i_2];
                    vertexnormal_16.int186 += i_11;
                    vertexnormal_16.int185 += i_12;
                    vertexnormal_16.int188 += i_13;
                    ++vertexnormal_16.int187;
                    vertexnormal_16 = vertexNormalArray1[i_3];
                    vertexnormal_16.int186 += i_11;
                    vertexnormal_16.int185 += i_12;
                    vertexnormal_16.int188 += i_13;
                    ++vertexnormal_16.int187;
                    vertexnormal_16 = vertexNormalArray1[i_4];
                    vertexnormal_16.int186 += i_11;
                    vertexnormal_16.int185 += i_12;
                    vertexnormal_16.int188 += i_13;
                    ++vertexnormal_16.int187;
                } else if (b_15 == 1) {
                    if (dataClass11Array1 == null)
                        dataClass11Array1 = new DataClass11[int664];

                    DataClass11 dataclass11_17 = dataClass11Array1[i_1] = new DataClass11();
                    dataclass11_17.int210 = i_11;
                    dataclass11_17.int209 = i_12;
                    dataclass11_17.int211 = i_13;
                }
            }

        }
    }

    void method632() {
        vertexNormalArray1 = null;
        vertexNormalArray2 = null;
        dataClass11Array1 = null;
        bool74 = false;
    }

    void method633() {
        if (!bool74) {
            modelHeight = 0;
            int665 = 0;
            int669 = 999999;
            int663 = -999999;
            int668 = -99999;
            int670 = 99999;

            for (int i_1 = 0; i_1 < int667; i_1++) {
                int i_2 = intArray105[i_1];
                int i_3 = intArray106[i_1];
                int i_4 = intArray112[i_1];
                if (i_2 < int669)
                    int669 = i_2;

                if (i_2 > int663)
                    int663 = i_2;

                if (i_4 < int670)
                    int670 = i_4;

                if (i_4 > int668)
                    int668 = i_4;

                if (-i_3 > modelHeight)
                    modelHeight = -i_3;

                if (i_3 > int665)
                    int665 = i_3;
            }

            bool74 = true;
        }
    }

    static void staticMethod467(Mesh mesh_0, Mesh mesh_1, int i_2, int i_3, int i_4, boolean bool_5) {
        mesh_0.method633();
        mesh_0.method631();
        mesh_1.method633();
        mesh_1.method631();
        ++staticInt320;
        int i_6 = 0;
        int[] ints_7 = mesh_1.intArray105;
        int i_8 = mesh_1.int667;

        int i_9;
        for (i_9 = 0; i_9 < mesh_0.int667; i_9++) {
            VertexNormal vertexnormal_10 = mesh_0.vertexNormalArray1[i_9];
            if (vertexnormal_10.int187 != 0) {
                int i_11 = mesh_0.intArray106[i_9] - i_3;
                if (i_11 <= mesh_1.int665) {
                    int i_12 = mesh_0.intArray105[i_9] - i_2;
                    if (i_12 >= mesh_1.int669 && i_12 <= mesh_1.int663) {
                        int i_13 = mesh_0.intArray112[i_9] - i_4;
                        if (i_13 >= mesh_1.int670 && i_13 <= mesh_1.int668)
                            for (int i_14 = 0; i_14 < i_8; i_14++) {
                                VertexNormal vertexnormal_15 = mesh_1.vertexNormalArray1[i_14];
                                if (i_12 == ints_7[i_14] && i_13 == mesh_1.intArray112[i_14] && i_11 == mesh_1.intArray106[i_14] && vertexnormal_15.int187 != 0) {
                                    if (mesh_0.vertexNormalArray2 == null)
                                        mesh_0.vertexNormalArray2 = new VertexNormal[mesh_0.int667];

                                    if (mesh_1.vertexNormalArray2 == null)
                                        mesh_1.vertexNormalArray2 = new VertexNormal[i_8];

                                    VertexNormal vertexnormal_16 = mesh_0.vertexNormalArray2[i_9];
                                    if (vertexnormal_16 == null)
                                        vertexnormal_16 = mesh_0.vertexNormalArray2[i_9] = new VertexNormal(vertexnormal_10);

                                    VertexNormal vertexnormal_17 = mesh_1.vertexNormalArray2[i_14];
                                    if (vertexnormal_17 == null)
                                        vertexnormal_17 = mesh_1.vertexNormalArray2[i_14] = new VertexNormal(vertexnormal_15);

                                    vertexnormal_16.int186 += vertexnormal_15.int186;
                                    vertexnormal_16.int185 += vertexnormal_15.int185;
                                    vertexnormal_16.int188 += vertexnormal_15.int188;
                                    vertexnormal_16.int187 += vertexnormal_15.int187;
                                    vertexnormal_17.int186 += vertexnormal_10.int186;
                                    vertexnormal_17.int185 += vertexnormal_10.int185;
                                    vertexnormal_17.int188 += vertexnormal_10.int188;
                                    vertexnormal_17.int187 += vertexnormal_10.int187;
                                    ++i_6;
                                    staticIntArray133[i_9] = staticInt320;
                                    staticIntArray132[i_14] = staticInt320;
                                }
                            }
                    }
                }
            }
        }

        if (i_6 >= 3 && bool_5) {
            for (i_9 = 0; i_9 < mesh_0.int664; i_9++)
                if (staticIntArray133[mesh_0.intArray107[i_9]] == staticInt320 && staticIntArray133[mesh_0.intArray108[i_9]] == staticInt320 && staticIntArray133[mesh_0.intArray109[i_9]] == staticInt320) {
                    if (mesh_0.byteArray17 == null)
                        mesh_0.byteArray17 = new byte[mesh_0.int664];

                    mesh_0.byteArray17[i_9] = 2;
                }

            for (i_9 = 0; i_9 < mesh_1.int664; i_9++)
                if (staticIntArray132[mesh_1.intArray107[i_9]] == staticInt320 && staticIntArray132[mesh_1.intArray108[i_9]] == staticInt320 && staticIntArray132[mesh_1.intArray109[i_9]] == staticInt320) {
                    if (mesh_1.byteArray17 == null)
                        mesh_1.byteArray17 = new byte[mesh_1.int664];

                    mesh_1.byteArray17[i_9] = 2;
                }

        }
    }

    public final Model method634(int i_1, int i_2, int i_3, int i_4, int i_5) {
        method631();
        int i_6 = (int) Math.sqrt(i_3 * i_3 + i_4 * i_4 + i_5 * i_5);
        int i_7 = i_2 * i_6 >> 8;
        Model model_8 = new Model();
        model_8.texX = new int[int664];
        model_8.texY = new int[int664];
        model_8.texZ = new int[int664];
        if (int666 > 0 && byteArray14 != null) {
            int[] ints_9 = new int[int666];

            int i_10;
            for (i_10 = 0; i_10 < int664; i_10++)
                if (byteArray14[i_10] != -1)
                    ++ints_9[byteArray14[i_10] & 0xff];

            model_8.texTriangleCount = 0;

            for (i_10 = 0; i_10 < int666; i_10++)
                if (ints_9[i_10] > 0 && byteArray15[i_10] == 0)
                    ++model_8.texTriangleCount;

            model_8.texTriangleA = new int[model_8.texTriangleCount];
            model_8.texTriangleB = new int[model_8.texTriangleCount];
            model_8.texTriangleC = new int[model_8.texTriangleCount];
            i_10 = 0;

            int i_11;
            for (i_11 = 0; i_11 < int666; i_11++)
                if (ints_9[i_11] > 0 && byteArray15[i_11] == 0) {
                    model_8.texTriangleA[i_10] = shortArray22[i_11] & 0xffff;
                    model_8.texTriangleB[i_10] = shortArray23[i_11] & 0xffff;
                    model_8.texTriangleC[i_10] = shortArray24[i_11] & 0xffff;
                    ints_9[i_11] = i_10++;
                } else
                    ints_9[i_11] = -1;

            model_8.triangleSkinValues = new byte[int664];

            for (i_11 = 0; i_11 < int664; i_11++)
                if (byteArray14[i_11] != -1)
                    model_8.triangleSkinValues[i_11] = (byte) ints_9[byteArray14[i_11] & 0xff];
                else
                    model_8.triangleSkinValues[i_11] = -1;
        }

        for (int i_16 = 0; i_16 < int664; i_16++) {
            byte b_17;
            if (byteArray17 == null)
                b_17 = 0;
            else
                b_17 = byteArray17[i_16];

            byte b_18;
            if (byteArray18 == null)
                b_18 = 0;
            else
                b_18 = byteArray18[i_16];

            short s_12;
            if (shortArray20 == null)
                s_12 = -1;
            else
                s_12 = shortArray20[i_16];

            if (b_18 == -2)
                b_17 = 3;

            if (b_18 == -1)
                b_17 = 2;

            VertexNormal vertexnormal_13;
            int i_14;
            DataClass11 dataclass11_19;
            if (s_12 == -1) {
                if (b_17 != 0) {
                    if (b_17 == 1) {
                        dataclass11_19 = dataClass11Array1[i_16];
                        i_14 = i_1 + (i_3 * dataclass11_19.int210 + i_4 * dataclass11_19.int209 + i_5 * dataclass11_19.int211) / (i_7 + i_7 / 2);
                        model_8.texX[i_16] = staticMethod468(shortArray19[i_16] & 0xffff, i_14);
                        model_8.texZ[i_16] = -1;
                    } else if (b_17 == 3) {
                        model_8.texX[i_16] = 128;
                        model_8.texZ[i_16] = -1;
                    } else
                        model_8.texZ[i_16] = -2;
                } else {
                    int i_15 = shortArray19[i_16] & 0xffff;
                    if (vertexNormalArray2 != null && vertexNormalArray2[intArray107[i_16]] != null)
                        vertexnormal_13 = vertexNormalArray2[intArray107[i_16]];
                    else
                        vertexnormal_13 = vertexNormalArray1[intArray107[i_16]];

                    i_14 = i_1 + (i_3 * vertexnormal_13.int186 + i_4 * vertexnormal_13.int185 + i_5 * vertexnormal_13.int188) / (i_7 * vertexnormal_13.int187);
                    model_8.texX[i_16] = staticMethod468(i_15, i_14);
                    if (vertexNormalArray2 != null && vertexNormalArray2[intArray108[i_16]] != null)
                        vertexnormal_13 = vertexNormalArray2[intArray108[i_16]];
                    else
                        vertexnormal_13 = vertexNormalArray1[intArray108[i_16]];

                    i_14 = i_1 + (i_3 * vertexnormal_13.int186 + i_4 * vertexnormal_13.int185 + i_5 * vertexnormal_13.int188) / (i_7 * vertexnormal_13.int187);
                    model_8.texY[i_16] = staticMethod468(i_15, i_14);
                    if (vertexNormalArray2 != null && vertexNormalArray2[intArray109[i_16]] != null)
                        vertexnormal_13 = vertexNormalArray2[intArray109[i_16]];
                    else
                        vertexnormal_13 = vertexNormalArray1[intArray109[i_16]];

                    i_14 = i_1 + (i_3 * vertexnormal_13.int186 + i_4 * vertexnormal_13.int185 + i_5 * vertexnormal_13.int188) / (i_7 * vertexnormal_13.int187);
                    model_8.texZ[i_16] = staticMethod468(i_15, i_14);
                }
            } else if (b_17 != 0) {
                if (b_17 == 1) {
                    dataclass11_19 = dataClass11Array1[i_16];
                    i_14 = i_1 + (i_3 * dataclass11_19.int210 + i_4 * dataclass11_19.int209 + i_5 * dataclass11_19.int211) / (i_7 + i_7 / 2);
                    model_8.texX[i_16] = staticMethod469(i_14);
                    model_8.texZ[i_16] = -1;
                } else
                    model_8.texZ[i_16] = -2;
            } else {
                if (vertexNormalArray2 != null && vertexNormalArray2[intArray107[i_16]] != null)
                    vertexnormal_13 = vertexNormalArray2[intArray107[i_16]];
                else
                    vertexnormal_13 = vertexNormalArray1[intArray107[i_16]];

                i_14 = i_1 + (i_3 * vertexnormal_13.int186 + i_4 * vertexnormal_13.int185 + i_5 * vertexnormal_13.int188) / (i_7 * vertexnormal_13.int187);
                model_8.texX[i_16] = staticMethod469(i_14);
                if (vertexNormalArray2 != null && vertexNormalArray2[intArray108[i_16]] != null)
                    vertexnormal_13 = vertexNormalArray2[intArray108[i_16]];
                else
                    vertexnormal_13 = vertexNormalArray1[intArray108[i_16]];

                i_14 = i_1 + (i_3 * vertexnormal_13.int186 + i_4 * vertexnormal_13.int185 + i_5 * vertexnormal_13.int188) / (i_7 * vertexnormal_13.int187);
                model_8.texY[i_16] = staticMethod469(i_14);
                if (vertexNormalArray2 != null && vertexNormalArray2[intArray109[i_16]] != null)
                    vertexnormal_13 = vertexNormalArray2[intArray109[i_16]];
                else
                    vertexnormal_13 = vertexNormalArray1[intArray109[i_16]];

                i_14 = i_1 + (i_3 * vertexnormal_13.int186 + i_4 * vertexnormal_13.int185 + i_5 * vertexnormal_13.int188) / (i_7 * vertexnormal_13.int187);
                model_8.texZ[i_16] = staticMethod469(i_14);
            }
        }

        method621();
        model_8.vertexCount = int667;
        model_8.verticesX = intArray105;
        model_8.verticesY = intArray106;
        model_8.verticesZ = intArray112;
        model_8.triangleCount = int664;
        model_8.triangleA = intArray107;
        model_8.triangleB = intArray108;
        model_8.triangleC = intArray109;
        model_8.texturePoints = byteArray13;
        model_8.trianglePriorities = byteArray18;
        model_8.byte7 = byte6;
        model_8.intArrayArray15 = intArrayArray13;
        model_8.intArrayArray16 = intArrayArray14;
        model_8.triangleAlphaValues = shortArray20;
        return model_8;
    }

    static final int staticMethod468(int i_0, int i_1) {
        i_1 = i_1 * (i_0 & 0x7f) >> 7;
        if (i_1 < 2)
            i_1 = 2;
        else if (i_1 > 126)
            i_1 = 126;

        return (i_0 & 0xff80) + i_1;
    }

    static final int staticMethod469(int i_0) {
        if (i_0 < 2)
            i_0 = 2;
        else if (i_0 > 126)
            i_0 = 126;

        return i_0;
    }

}

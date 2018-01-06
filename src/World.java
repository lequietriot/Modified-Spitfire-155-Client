import java.net.URL;

public class World {

    public static int[] staticIntArray17;
    static int staticInt47 = 0;
    static int staticInt48 = 0;
    static int[] staticIntArray16 = new int[] { 1, 1, 1, 1 };
    static int[] staticIntArray15 = new int[] { 0, 1, 2, 3 };
    static WorldMap staticWorldMap1;
    int int94;
    int int95;
    String string8;
    String string9;
    int int97;
    int int96;
    int int98;

    static boolean staticMethod45() {
        try {
            if (staticWorldMap1 == null)
                staticWorldMap1 = FriendLogin.staticRunnableImpl1_1.method229(new URL(BZip2Context.staticString28));
            else if (staticWorldMap1.method227()) {
                byte[] bytes_1 = staticWorldMap1.method228();
                Buffer buffer_2 = new Buffer(bytes_1);
                buffer_2.readInt();
                staticInt47 = buffer_2.readUShort();
                DataClass8.staticWorldArray1 = new World[staticInt47];

                World world_4;
                for (int i_3 = 0; i_3 < staticInt47; world_4.int98 = i_3++) {
                    world_4 = DataClass8.staticWorldArray1[i_3] = new World();
                    world_4.int94 = buffer_2.readUShort();
                    world_4.int95 = buffer_2.readInt();
                    world_4.string8 = buffer_2.method448();
                    world_4.string9 = buffer_2.method448();
                    world_4.int97 = buffer_2.readUByte();
                    world_4.int96 = buffer_2.readShort();
                }

                staticMethod47(DataClass8.staticWorldArray1, 0, DataClass8.staticWorldArray1.length - 1, staticIntArray15, staticIntArray16);
                staticWorldMap1 = null;
                return true;
            }
        } catch (Exception exception_5) {
            exception_5.printStackTrace();
            staticWorldMap1 = null;
        }

        return false;
    }

    static void staticMethod46(int i_0, int i_1) {
        int[] ints_3 = new int[4];
        int[] ints_4 = new int[4];
        ints_3[0] = i_0;
        ints_4[0] = i_1;
        int i_5 = 1;

        for (int i_6 = 0; i_6 < 4; i_6++)
            if (i_0 != staticIntArray15[i_6]) {
                ints_3[i_5] = staticIntArray15[i_6];
                ints_4[i_5] = staticIntArray16[i_6];
                ++i_5;
            }

        staticIntArray15 = ints_3;
        staticIntArray16 = ints_4;
        staticMethod47(DataClass8.staticWorldArray1, 0, DataClass8.staticWorldArray1.length - 1, staticIntArray15, staticIntArray16);
    }

    static void staticMethod47(World[] arr_0, int i_1, int i_2, int[] ints_3, int[] ints_4) {
        if (i_1 < i_2) {
            int i_6 = i_1 - 1;
            int i_7 = i_2 + 1;
            int i_8 = (i_1 + i_2) / 2;
            World world_9 = arr_0[i_8];
            arr_0[i_8] = arr_0[i_1];
            arr_0[i_1] = world_9;

            while (i_6 < i_7) {
                boolean bool_10 = true;

                int i_11;
                int i_12;
                int i_13;
                do {
                    --i_7;

                    for (i_11 = 0; i_11 < 4; i_11++) {
                        if (ints_3[i_11] == 2) {
                            i_12 = arr_0[i_7].int98;
                            i_13 = world_9.int98;
                        } else if (ints_3[i_11] == 1) {
                            i_12 = arr_0[i_7].int96;
                            i_13 = world_9.int96;
                            if (i_12 == -1 && ints_4[i_11] == 1)
                                i_12 = 2001;

                            if (i_13 == -1 && ints_4[i_11] == 1)
                                i_13 = 2001;
                        } else if (ints_3[i_11] == 3) {
                            i_12 = arr_0[i_7].isMembers() ? 1 : 0;
                            i_13 = world_9.isMembers() ? 1 : 0;
                        } else {
                            i_12 = arr_0[i_7].int94;
                            i_13 = world_9.int94;
                        }

                        if (i_12 != i_13) {
                            if ((ints_4[i_11] != 1 || i_12 <= i_13) && (ints_4[i_11] != 0 || i_12 >= i_13))
                                bool_10 = false;
                            break;
                        }

                        if (i_11 == 3)
                            bool_10 = false;
                    }
                } while (bool_10);

                bool_10 = true;

                do {
                    ++i_6;

                    for (i_11 = 0; i_11 < 4; i_11++) {
                        if (ints_3[i_11] == 2) {
                            i_12 = arr_0[i_6].int98;
                            i_13 = world_9.int98;
                        } else if (ints_3[i_11] == 1) {
                            i_12 = arr_0[i_6].int96;
                            i_13 = world_9.int96;
                            if (i_12 == -1 && ints_4[i_11] == 1)
                                i_12 = 2001;

                            if (i_13 == -1 && ints_4[i_11] == 1)
                                i_13 = 2001;
                        } else if (ints_3[i_11] == 3) {
                            i_12 = arr_0[i_6].isMembers() ? 1 : 0;
                            i_13 = world_9.isMembers() ? 1 : 0;
                        } else {
                            i_12 = arr_0[i_6].int94;
                            i_13 = world_9.int94;
                        }

                        if (i_13 != i_12) {
                            if ((ints_4[i_11] != 1 || i_12 >= i_13) && (ints_4[i_11] != 0 || i_12 <= i_13))
                                bool_10 = false;
                            break;
                        }

                        if (i_11 == 3)
                            bool_10 = false;
                    }
                } while (bool_10);

                if (i_6 < i_7) {
                    World world_14 = arr_0[i_6];
                    arr_0[i_6] = arr_0[i_7];
                    arr_0[i_7] = world_14;
                }
            }

            staticMethod47(arr_0, i_1, i_7, ints_3, ints_4);
            staticMethod47(arr_0, i_7 + 1, i_2, ints_3, ints_4);
        }

    }

    static void staticMethod48(int i_0, boolean bool_1, int i_2, boolean bool_3) {
        if (DataClass8.staticWorldArray1 != null)
            staticMethod49(0, DataClass8.staticWorldArray1.length - 1, i_0, bool_1, i_2, bool_3);

    }

    static void staticMethod49(int i_0, int i_1, int i_2, boolean bool_3, int i_4, boolean bool_5) {
        if (i_0 < i_1) {
            int i_7 = (i_1 + i_0) / 2;
            int i_8 = i_0;
            World world_9 = DataClass8.staticWorldArray1[i_7];
            DataClass8.staticWorldArray1[i_7] = DataClass8.staticWorldArray1[i_1];
            DataClass8.staticWorldArray1[i_1] = world_9;

            for (int i_10 = i_0; i_10 < i_1; i_10++) {
                World world_12 = DataClass8.staticWorldArray1[i_10];
                int i_13 = staticMethod50(world_12, world_9, i_2, bool_3);
                int i_11;
                if (i_13 != 0) {
                    if (bool_3)
                        i_11 = -i_13;
                    else
                        i_11 = i_13;
                } else if (i_4 == -1)
                    i_11 = 0;
                else {
                    int i_14 = staticMethod50(world_12, world_9, i_4, bool_5);
                    if (bool_5)
                        i_11 = -i_14;
                    else
                        i_11 = i_14;
                }

                if (i_11 <= 0) {
                    World world_15 = DataClass8.staticWorldArray1[i_10];
                    DataClass8.staticWorldArray1[i_10] = DataClass8.staticWorldArray1[i_8];
                    DataClass8.staticWorldArray1[i_8++] = world_15;
                }
            }

            DataClass8.staticWorldArray1[i_1] = DataClass8.staticWorldArray1[i_8];
            DataClass8.staticWorldArray1[i_8] = world_9;
            staticMethod49(i_0, i_8 - 1, i_2, bool_3, i_4, bool_5);
            staticMethod49(i_8 + 1, i_1, i_2, bool_3, i_4, bool_5);
        }

    }

    static int staticMethod50(World world_0, World world_1, int i_2, boolean bool_3) {
        if (i_2 == 1) {
            int i_5 = world_0.int96;
            int i_6 = world_1.int96;
            if (!bool_3) {
                if (i_5 == -1)
                    i_5 = 2001;

                if (i_6 == -1)
                    i_6 = 2001;
            }

            return i_5 - i_6;
        } else
            return i_2 == 2 ? world_0.int97 - world_1.int97 : i_2 == 3 ? world_0.string9.equals("-") ? world_1.string9.equals("-") ? 0 : bool_3 ? -1 : 1 : world_1.string9.equals("-") ? bool_3 ? 1 : -1 : world_0.string9.compareTo(world_1.string9) : i_2 == 4 ? world_0.method133() ? world_1.method133() ? 0 : 1 : world_1.method133() ? -1 : 0 : i_2 == 5 ? world_0.method132() ? world_1.method132() ? 0 : 1 : world_1.method132() ? -1 : 0 : i_2 == 6 ? world_0.isPvpWorld() ? world_1.isPvpWorld() ? 0 : 1 : world_1.isPvpWorld() ? -1 : 0 : i_2 == 7 ? world_0.isMembers() ? world_1.isMembers() ? 0 : 1 : world_1.isMembers() ? -1 : 0 : world_0.int94 - world_1.int94;
    }

    static World staticMethod51() {
        return staticInt48 < staticInt47 ? DataClass8.staticWorldArray1[staticInt48++] : null;
    }

    boolean isMembers() {
        return (0x1 & int95) != 0;
    }

    boolean method132() {
        return (0x2 & int95) != 0;
    }

    boolean isPvpWorld() {
        return (0x4 & int95) != 0;
    }

    boolean method133() {
        return (0x8 & int95) != 0;
    }

    boolean isDeadmanSeasonal() {
        return (0x20000000 & int95) != 0;
    }

    boolean isDeadman() {
        return (0x2000000 & int95) != 0;
    }

}

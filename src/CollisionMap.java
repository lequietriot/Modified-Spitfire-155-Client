public class CollisionMap {

    private static final int BLOCKED_TILE = 0x200000;
    private static final int OBJECT_TILE = 0x100;
    private static final int WALL_EAST = 0x8;
    private static final int WALL_NORTH = 0x2;
    private static final int WALL_NORTHEAST = 0x4;
    private static final int WALL_NORTHWEST = 0x1;
    private static final int WALL_SOUTH = 0x20;
    private static final int WALL_SOUTHEAST = 0x10;
    private static final int WALL_SOUTHWEST = 0x40;
    private static final int WALL_WEST = 0x80;

    int xOffset = 0;
    int yOffset = 0;
    int width;
    int height;
    public int[][] adjacencies;

    public CollisionMap(int width, int height) {
        this.width = width;
        this.height = height;
        adjacencies = new int[width][height];
        init();
    }

    public void init() {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++)
                if (x != 0 && y != 0 && x < width - 5 && y < height - 5) {
                    adjacencies[x][y] = 0x1000000;
                } else {
                    adjacencies[x][y] = 0xFFFFFF;
                }
        }

    }

    public void method235(int x, int y, int group, int orientation, boolean impenetrable) {
        x -= xOffset;
        y -= yOffset;
        if (group == 0) {
            if (orientation == 0) {
                flag(x, y, 128);
                flag(x - 1, y, 8);
            }

            if (orientation == 1) {
                flag(x, y, 2);
                flag(x, y + 1, 32);
            }

            if (orientation == 2) {
                flag(x, y, 8);
                flag(x + 1, y, 128);
            }

            if (orientation == 3) {
                flag(x, y, 32);
                flag(x, y - 1, 2);
            }
        }

        if (group == 1 || group == 3) {
            if (orientation == 0) {
                flag(x, y, 1);
                flag(x - 1, y + 1, 16);
            }

            if (orientation == 1) {
                flag(x, y, 4);
                flag(x + 1, y + 1, 64);
            }

            if (orientation == 2) {
                flag(x, y, 16);
                flag(x + 1, y - 1, 1);
            }

            if (orientation == 3) {
                flag(x, y, 64);
                flag(x - 1, y - 1, 4);
            }
        }

        if (group == 2) {
            if (orientation == 0) {
                flag(x, y, 130);
                flag(x - 1, y, 8);
                flag(x, y + 1, 32);
            }

            if (orientation == 1) {
                flag(x, y, 10);
                flag(x, y + 1, 32);
                flag(x + 1, y, 128);
            }

            if (orientation == 2) {
                flag(x, y, 40);
                flag(x + 1, y, 128);
                flag(x, y - 1, 2);
            }

            if (orientation == 3) {
                flag(x, y, 160);
                flag(x, y - 1, 2);
                flag(x - 1, y, 8);
            }
        }

        if (impenetrable) {
            if (group == 0) {
                if (orientation == 0) {
                    flag(x, y, 65536);
                    flag(x - 1, y, 4096);
                }

                if (orientation == 1) {
                    flag(x, y, 1024);
                    flag(x, y + 1, 16384);
                }

                if (orientation == 2) {
                    flag(x, y, 4096);
                    flag(x + 1, y, 65536);
                }

                if (orientation == 3) {
                    flag(x, y, 16384);
                    flag(x, y - 1, 1024);
                }
            }

            if (group == 1 || group == 3) {
                if (orientation == 0) {
                    flag(x, y, 512);
                    flag(x - 1, y + 1, 8192);
                }

                if (orientation == 1) {
                    flag(x, y, 2048);
                    flag(x + 1, y + 1, 32768);
                }

                if (orientation == 2) {
                    flag(x, y, 8192);
                    flag(x + 1, y - 1, 512);
                }

                if (orientation == 3) {
                    flag(x, y, 32768);
                    flag(x - 1, y - 1, 2048);
                }
            }

            if (group == 2) {
                if (orientation == 0) {
                    flag(x, y, 66560);
                    flag(x - 1, y, 4096);
                    flag(x, y + 1, 16384);
                }

                if (orientation == 1) {
                    flag(x, y, 5120);
                    flag(x, y + 1, 16384);
                    flag(x + 1, y, 65536);
                }

                if (orientation == 2) {
                    flag(x, y, 20480);
                    flag(x + 1, y, 65536);
                    flag(x, y - 1, 1024);
                }

                if (orientation == 3) {
                    flag(x, y, 81920);
                    flag(x, y - 1, 1024);
                    flag(x - 1, y, 4096);
                }
            }
        }

    }

    public void flagObject(int initialX, int initialY, int width, int height, boolean impenetrable) {
        int value = 0x100;

        if (impenetrable) {
            value += 0x20000;
        }

        initialX -= xOffset;
        initialY -= yOffset;

        for (int x = initialX; x < initialX + width; x++) {
            if (x >= 0 && x < width) {
                for (int y = initialY; y < height + initialY; y++) {
                    if (y >= 0 && y < height) {
                        flag(x, y, value);
                    }
                }
            }
        }
    }

    public void method237(int x, int y) {
        x -= xOffset;
        y -= yOffset;
        adjacencies[x][y] |= BLOCKED_TILE;
    }

    public void method238(int i_1, int i_2) {
        i_1 -= xOffset;
        i_2 -= yOffset;
        adjacencies[i_1][i_2] |= 0x40000;
    }

    void flag(int x, int y, int value) {
        adjacencies[x][y] |= value;
    }

    public void method240(int i_1, int i_2, int i_3, int i_4, boolean bool_5) {
        i_1 -= xOffset;
        i_2 -= yOffset;
        if (i_3 == 0) {
            if (i_4 == 0) {
                method242(i_1, i_2, 128);
                method242(i_1 - 1, i_2, 8);
            }

            if (i_4 == 1) {
                method242(i_1, i_2, 2);
                method242(i_1, i_2 + 1, 32);
            }

            if (i_4 == 2) {
                method242(i_1, i_2, 8);
                method242(i_1 + 1, i_2, 128);
            }

            if (i_4 == 3) {
                method242(i_1, i_2, 32);
                method242(i_1, i_2 - 1, 2);
            }
        }

        if (i_3 == 1 || i_3 == 3) {
            if (i_4 == 0) {
                method242(i_1, i_2, 1);
                method242(i_1 - 1, i_2 + 1, 16);
            }

            if (i_4 == 1) {
                method242(i_1, i_2, 4);
                method242(i_1 + 1, i_2 + 1, 64);
            }

            if (i_4 == 2) {
                method242(i_1, i_2, 16);
                method242(i_1 + 1, i_2 - 1, 1);
            }

            if (i_4 == 3) {
                method242(i_1, i_2, 64);
                method242(i_1 - 1, i_2 - 1, 4);
            }
        }

        if (i_3 == 2) {
            if (i_4 == 0) {
                method242(i_1, i_2, 130);
                method242(i_1 - 1, i_2, 8);
                method242(i_1, i_2 + 1, 32);
            }

            if (i_4 == 1) {
                method242(i_1, i_2, 10);
                method242(i_1, i_2 + 1, 32);
                method242(i_1 + 1, i_2, 128);
            }

            if (i_4 == 2) {
                method242(i_1, i_2, 40);
                method242(i_1 + 1, i_2, 128);
                method242(i_1, i_2 - 1, 2);
            }

            if (i_4 == 3) {
                method242(i_1, i_2, 160);
                method242(i_1, i_2 - 1, 2);
                method242(i_1 - 1, i_2, 8);
            }
        }

        if (bool_5) {
            if (i_3 == 0) {
                if (i_4 == 0) {
                    method242(i_1, i_2, 0x10000);
                    method242(i_1 - 1, i_2, 0x1000);
                }

                if (i_4 == 1) {
                    method242(i_1, i_2, 1024);
                    method242(i_1, i_2 + 1, 16384);
                }

                if (i_4 == 2) {
                    method242(i_1, i_2, 4096);
                    method242(i_1 + 1, i_2, 65536);
                }

                if (i_4 == 3) {
                    method242(i_1, i_2, 16384);
                    method242(i_1, i_2 - 1, 1024);
                }
            }

            if (i_3 == 1 || i_3 == 3) {
                if (i_4 == 0) {
                    method242(i_1, i_2, 512);
                    method242(i_1 - 1, i_2 + 1, 8192);
                }

                if (i_4 == 1) {
                    method242(i_1, i_2, 2048);
                    method242(i_1 + 1, i_2 + 1, 32768);
                }

                if (i_4 == 2) {
                    method242(i_1, i_2, 8192);
                    method242(i_1 + 1, i_2 - 1, 512);
                }

                if (i_4 == 3) {
                    method242(i_1, i_2, 32768);
                    method242(i_1 - 1, i_2 - 1, 2048);
                }
            }

            if (i_3 == 2) {
                if (i_4 == 0) {
                    method242(i_1, i_2, 66560);
                    method242(i_1 - 1, i_2, 4096);
                    method242(i_1, i_2 + 1, 16384);
                }

                if (i_4 == 1) {
                    method242(i_1, i_2, 5120);
                    method242(i_1, i_2 + 1, 16384);
                    method242(i_1 + 1, i_2, 65536);
                }

                if (i_4 == 2) {
                    method242(i_1, i_2, 20480);
                    method242(i_1 + 1, i_2, 65536);
                    method242(i_1, i_2 - 1, 1024);
                }

                if (i_4 == 3) {
                    method242(i_1, i_2, 81920);
                    method242(i_1, i_2 - 1, 1024);
                    method242(i_1 - 1, i_2, 4096);
                }
            }
        }

    }

    public void method241(int i_1, int i_2, int i_3, int i_4, int i_5, boolean bool_6) {
        int i_8 = 256;
        if (bool_6)
            i_8 += 131072;

        i_1 -= xOffset;
        i_2 -= yOffset;
        int i_9;
        if (i_5 == 1 || i_5 == 3) {
            i_9 = i_3;
            i_3 = i_4;
            i_4 = i_9;
        }

        for (i_9 = i_1; i_9 < i_3 + i_1; i_9++)
            if (i_9 >= 0 && i_9 < width)
                for (int i_10 = i_2; i_10 < i_4 + i_2; i_10++)
                    if (i_10 >= 0 && i_10 < height)
                        method242(i_9, i_10, i_8);

    }

    void method242(int i_1, int i_2, int i_3) {
        adjacencies[i_1][i_2] &= ~i_3;
    }

    public void method243(int i_1, int i_2) {
        i_1 -= xOffset;
        i_2 -= yOffset;
        adjacencies[i_1][i_2] &= ~0x40000;
    }

}

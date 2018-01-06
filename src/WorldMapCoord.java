public class WorldMapCoord {

    public int int261;
    public int int262;
    public int int260;

    public WorldMapCoord() {
        int261 = -1;
    }

    public WorldMapCoord(int i_1, int i_2, int i_3) {
        int261 = i_1;
        int262 = i_2;
        int260 = i_3;
    }

    public WorldMapCoord(WorldMapCoord worldmapcoord_1) {
        int261 = worldmapcoord_1.int261;
        int262 = worldmapcoord_1.int262;
        int260 = worldmapcoord_1.int260;
    }

    public WorldMapCoord(int i_1) {
        if (i_1 == -1)
            int261 = -1;
        else {
            int261 = i_1 >> 28 & 0x3;
            int262 = i_1 >> 14 & 0x3fff;
            int260 = i_1 & 0x3fff;
        }

    }

    public void method294(int i_1, int i_2, int i_3) {
        int261 = i_1;
        int262 = i_2;
        int260 = i_3;
    }

    public int method295() {
        return int261 << 28 | int262 << 14 | int260;
    }

    @Override
    public boolean equals(Object object_1) {
        return object_1 == this ? true : !(object_1 instanceof WorldMapCoord) ? false : coordsEquals((WorldMapCoord) object_1);
    }

    boolean coordsEquals(WorldMapCoord worldmapcoord_1) {
        return int261 != worldmapcoord_1.int261 ? false : worldmapcoord_1.int262 != int262 ? false : worldmapcoord_1.int260 == int260;
    }

    @Override
    public int hashCode() {
        return method295();
    }

    @Override
    public String toString() {
        return int261 + "," + (int262 >> 6) + "," + (int260 >> 6) + "," + (int262 & 0x3f) + "," + (int260 & 0x3f);
    }

}

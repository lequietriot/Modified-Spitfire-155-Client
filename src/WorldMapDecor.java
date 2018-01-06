public class WorldMapDecor {

    static int staticInt14;
    static Class7 staticClass7_1;
    int int57;
    static int staticInt15;
    int int58;
    public final int int56;
    public final WorldMapCoord worldMapCoord4;
    public final WorldMapCoord worldMapCoord3;
    final WorldMapLabel worldMapLabel1;
    final int iconWidth;
    final int iconHeight;

    WorldMapDecor(int i_1, WorldMapCoord worldmapcoord_2, WorldMapCoord worldmapcoord_3, WorldMapLabel worldmaplabel_4) {
        int56 = i_1;
        worldMapCoord4 = worldmapcoord_2;
        worldMapCoord3 = worldmapcoord_3;
        worldMapLabel1 = worldmaplabel_4;
        MapElementType mapelementtype_5 = DataClass13.staticMapElementTypeArray1[int56];
        Sprite sprite_6 = mapelementtype_5.getPOISprite(false);
        if (sprite_6 != null) {
            iconWidth = sprite_6.width;
            iconHeight = sprite_6.height;
        } else {
            iconWidth = 0;
            iconHeight = 0;
        }

    }

    boolean method61(int i_1, int i_2) {
        return method62(i_1, i_2) ? true : method63(i_1, i_2);
    }

    boolean method62(int i_1, int i_2) {
        MapElementType mapelementtype_4 = DataClass13.staticMapElementTypeArray1[int56];
        switch (mapelementtype_4.wMUselessEnum1_1.int266) {
        case 0:
            if (i_1 > int58 - iconWidth && i_1 <= int58)
                break;

            return false;
        case 1:
            if (i_1 < int58 - iconWidth / 2 || i_1 > int58 + iconWidth / 2)
                return false;
            break;
        case 2:
            if (i_1 < int58 || i_1 >= iconWidth + int58)
                return false;
        }

        switch (mapelementtype_4.wMUselessEnum2_1.int264) {
        case 0:
            if (i_2 >= int57 - iconHeight / 2 && i_2 <= int57 + iconHeight / 2)
                break;

            return false;
        case 1:
            if (i_2 > int57 - iconHeight && i_2 <= int57)
                break;

            return false;
        case 2:
            if (i_2 < int57 || i_2 >= iconHeight + int57)
                return false;
        }

        return true;
    }

    boolean method63(int i_1, int i_2) {
        return worldMapLabel1 == null ? false : i_1 >= int58 - worldMapLabel1.int31 / 2 && i_1 <= int58 + worldMapLabel1.int31 / 2 ? i_2 >= int57 && i_2 <= worldMapLabel1.int30 + int57 : false;
    }

}

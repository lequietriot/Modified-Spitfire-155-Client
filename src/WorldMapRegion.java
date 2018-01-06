import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

public class WorldMapRegion {

    static final WorldMapCoord staticWorldMapCoord1 = new WorldMapCoord();
    int int52;
    int int53;
    LinkedList linkedList1;
    List list1;
    HashMap hashMap4;
    int int55;
    final HashMap hashMap5;
    WorldMapRegionStorageSub1 worldMapRegionStorageSub1_1;
    int int54;
    Sprite icon;
    int[][] intArrayArray5;

    WorldMapRegion(int i_1, int i_2, int i_3, HashMap hashmap_4) {
        int52 = i_1;
        int53 = i_2;
        linkedList1 = new LinkedList();
        list1 = new LinkedList();
        hashMap4 = new HashMap();
        int55 = i_3 | ~0xffffff;
        hashMap5 = hashmap_4;
    }

    void method26(int i_1, int i_2, int i_3) {
        if (icon != null)
            if (i_3 == int54 * 64)
                icon.method683(i_1, i_2);
            else
                icon.method694(i_1, i_2, i_3, i_3);
    }

    void method27(WorldMapRegionStorageSub1 worldmapregionstoragesub1_1, List list_2) {
        hashMap4.clear();
        worldMapRegionStorageSub1_1 = worldmapregionstoragesub1_1;
        method29(0, 0, 64, 64, worldMapRegionStorageSub1_1);
        method30(list_2);
    }

    void method28(HashSet hashset_1, List list_2) {
        hashMap4.clear();
        Iterator iterator_4 = hashset_1.iterator();

        while (iterator_4.hasNext()) {
            WorldMapRegionStorageSub2 worldmapregionstoragesub2_5 = (WorldMapRegionStorageSub2) iterator_4.next();
            if (worldmapregionstoragesub2_5.method13() == int52 && worldmapregionstoragesub2_5.method14() == int53) {
                linkedList1.add(worldmapregionstoragesub2_5);
                method29(worldmapregionstoragesub2_5.method392() * 8, worldmapregionstoragesub2_5.method393() * 8, 8, 8, worldmapregionstoragesub2_5);
            }
        }

        method30(list_2);
    }

    void method29(int i_1, int i_2, int i_3, int i_4, WorldMapRegionStorage worldmapregionstorage_5) {
        for (int i_7 = i_1; i_7 < i_1 + i_3; i_7++)
            label49: for (int i_8 = i_2; i_8 < i_2 + i_4; i_8++) {
                WorldMapCoord worldmapcoord_9 = new WorldMapCoord(0, i_7, i_8);

                for (int i_10 = 0; i_10 < worldmapregionstorage_5.int35; i_10++) {
                    WorldMapTile[] arr_11 = worldmapregionstorage_5.tiles[i_10][i_7][i_8];
                    if (arr_11 != null && arr_11.length != 0) {
                        WorldMapTile[] arr_12 = arr_11;

                        for (int i_13 = 0; i_13 < arr_12.length; i_13++) {
                            WorldMapTile worldmaptile_14 = arr_12[i_13];
                            MapElementType mapelementtype_15 = getMapElementForDecorObject(worldmaptile_14.objectId);
                            if (mapelementtype_15 != null) {
                                WorldMapCoord worldmapcoord_16 = new WorldMapCoord(i_10, int52 * 64 + i_7, i_8 + int53 * 64);
                                WorldMapCoord worldmapcoord_17 = null;
                                if (worldMapRegionStorageSub1_1 != null)
                                    worldmapcoord_17 = new WorldMapCoord(worldMapRegionStorageSub1_1.int36 + i_10, worldMapRegionStorageSub1_1.int34 * 64 + i_7, worldMapRegionStorageSub1_1.int37 * 64 + i_8);
                                else {
                                    WorldMapRegionStorageSub2 worldmapregionstoragesub2_18 = (WorldMapRegionStorageSub2) worldmapregionstorage_5;
                                    worldmapcoord_17 = new WorldMapCoord(i_10 + worldmapregionstoragesub2_18.int36, worldmapregionstoragesub2_18.int34 * 64 + i_7 + worldmapregionstoragesub2_18.method390() * 8, i_8 + worldmapregionstoragesub2_18.int37 * 64 + worldmapregionstoragesub2_18.method391() * 8);
                                }

                                WorldMapDecor worldmapdecor_19 = new WorldMapDecor(mapelementtype_15.int547, worldmapcoord_17, worldmapcoord_16, method57(mapelementtype_15));
                                hashMap4.put(worldmapcoord_9, worldmapdecor_19);
                                continue label49;
                            }
                        }
                    }
                }
            }

    }

    void method30(List list_1) {
        Iterator iterator_3 = list_1.iterator();

        while (iterator_3.hasNext()) {
            WM3 wm3_4 = (WM3) iterator_3.next();
            if (wm3_4.worldMapCoord7.int262 >> 6 == int52 && wm3_4.worldMapCoord7.int260 >> 6 == int53) {
                WorldMapDecor worldmapdecor_5 = new WorldMapDecor(wm3_4.int298, wm3_4.worldMapCoord7, wm3_4.worldMapCoord7, method56(wm3_4.int298));
                list1.add(worldmapdecor_5);
            }
        }

    }

    boolean draw(int i_1, WM2 wm2_2, WorldMapRegion[] arr_3, IndexedSprite[] arr_4) {
        if (!method33(i_1))
            return false;
        else if (worldMapRegionStorageSub1_1 == null && linkedList1.isEmpty())
            return false;
        else {
            method37(arr_3);
            icon.setRasterizerTarget();
            if (worldMapRegionStorageSub1_1 != null)
                draw1(wm2_2, arr_3, arr_4);
            else
                draw2(wm2_2, arr_4);

            return true;
        }
    }

    void method31(int i_1, int i_2, int i_3, HashSet hashset_4) {
        if (hashset_4 == null)
            hashset_4 = new HashSet();

        method45(i_1, i_2, hashset_4, i_3);
        method51(i_1, i_2, hashset_4, i_3);
    }

    void method32(HashSet hashset_1, int i_2, int i_3) {
        Iterator iterator_5 = hashMap4.values().iterator();

        while (iterator_5.hasNext()) {
            WorldMapDecor worldmapdecor_6 = (WorldMapDecor) iterator_5.next();
            if (hashset_1.contains(Integer.valueOf(worldmapdecor_6.int56))) {
                MapElementType mapelementtype_7 = DataClass13.staticMapElementTypeArray1[worldmapdecor_6.int56];
                method47(mapelementtype_7, worldmapdecor_6.int58, worldmapdecor_6.int57, i_2, i_3);
            }
        }

        method46(hashset_1, i_2, i_3);
    }

    boolean method33(int i_1) {
        if (icon != null && i_1 == int54)
            return false;
        else {
            int54 = i_1;
            icon = new Sprite(int54 * 64, int54 * 64);
            return true;
        }
    }

    void draw1(WM2 wm2_1, WorldMapRegion[] arr_2, IndexedSprite[] arr_3) {
        int i_5;
        int i_6;
        for (i_5 = 0; i_5 < 64; i_5++)
            for (i_6 = 0; i_6 < 64; i_6++) {
                method35(i_5, i_6, worldMapRegionStorageSub1_1, wm2_1);
                method36(i_5, i_6, worldMapRegionStorageSub1_1, wm2_1);
            }

        for (i_5 = 0; i_5 < 64; i_5++)
            for (i_6 = 0; i_6 < 64; i_6++)
                method34(i_5, i_6, worldMapRegionStorageSub1_1, wm2_1, arr_3);

    }

    void draw2(WM2 wm2_1, IndexedSprite[] arr_2) {
        Iterator iterator_4 = linkedList1.iterator();

        WorldMapRegionStorageSub2 worldmapregionstoragesub2_5;
        int i_6;
        int i_7;
        while (iterator_4.hasNext()) {
            worldmapregionstoragesub2_5 = (WorldMapRegionStorageSub2) iterator_4.next();

            for (i_6 = worldmapregionstoragesub2_5.method392() * 8; i_6 < worldmapregionstoragesub2_5.method392() * 8 + 8; i_6++)
                for (i_7 = worldmapregionstoragesub2_5.method393() * 8; i_7 < worldmapregionstoragesub2_5.method393() * 8 + 8; i_7++) {
                    method35(i_6, i_7, worldmapregionstoragesub2_5, wm2_1);
                    method36(i_6, i_7, worldmapregionstoragesub2_5, wm2_1);
                }
        }

        iterator_4 = linkedList1.iterator();

        while (iterator_4.hasNext()) {
            worldmapregionstoragesub2_5 = (WorldMapRegionStorageSub2) iterator_4.next();

            for (i_6 = worldmapregionstoragesub2_5.method392() * 8; i_6 < worldmapregionstoragesub2_5.method392() * 8 + 8; i_6++)
                for (i_7 = worldmapregionstoragesub2_5.method393() * 8; i_7 < worldmapregionstoragesub2_5.method393() * 8 + 8; i_7++)
                    method34(i_6, i_7, worldmapregionstoragesub2_5, wm2_1, arr_2);
        }

    }

    void method34(int i_1, int i_2, WorldMapRegionStorage worldmapregionstorage_3, WM2 wm2_4, IndexedSprite[] arr_5) {
        method44(i_1, i_2, worldmapregionstorage_3);
        method43(i_1, i_2, worldmapregionstorage_3, arr_5);
    }

    void method35(int i_1, int i_2, WorldMapRegionStorage worldmapregionstorage_3, WM2 wm2_4) {
        int i_6 = worldmapregionstorage_3.shortArrayArrayArray1[0][i_1][i_2] - 1;
        int i_7 = worldmapregionstorage_3.shortArrayArrayArray2[0][i_1][i_2] - 1;
        if (i_6 == -1 && i_7 == -1)
            Rasterizer2D.staticMethod450(int54 * i_1, int54 * (63 - i_2), int54, int54, int55);

        int i_8 = 16711935;
        if (i_7 != -1)
            i_8 = StaticClass2.staticMethod4(i_7, int55);

        if (i_7 > -1 && worldmapregionstorage_3.byteArrayArrayArray1[0][i_1][i_2] == 0)
            Rasterizer2D.staticMethod450(int54 * i_1, int54 * (63 - i_2), int54, int54, i_8);
        else {
            int i_9 = method42(i_1, i_2, worldmapregionstorage_3);
            if (i_7 == -1)
                Rasterizer2D.staticMethod450(i_1 * int54, (63 - i_2) * int54, int54, int54, i_9);
            else
                wm2_4.method82(int54 * i_1, (63 - i_2) * int54, i_9, i_8, int54, int54, worldmapregionstorage_3.byteArrayArrayArray1[0][i_1][i_2], worldmapregionstorage_3.byteArrayArrayArray2[0][i_1][i_2]);
        }
    }

    void method36(int i_1, int i_2, WorldMapRegionStorage worldmapregionstorage_3, WM2 wm2_4) {
        for (int i_6 = 1; i_6 < worldmapregionstorage_3.int35; i_6++) {
            int i_7 = worldmapregionstorage_3.shortArrayArrayArray2[i_6][i_1][i_2] - 1;
            if (i_7 > -1) {
                int i_8 = StaticClass2.staticMethod4(i_7, int55);
                if (worldmapregionstorage_3.byteArrayArrayArray1[i_6][i_1][i_2] == 0)
                    Rasterizer2D.staticMethod450(int54 * i_1, (63 - i_2) * int54, int54, int54, i_8);
                else
                    wm2_4.method82(i_1 * int54, int54 * (63 - i_2), 0, i_8, int54, int54, worldmapregionstorage_3.byteArrayArrayArray1[i_6][i_1][i_2], worldmapregionstorage_3.byteArrayArrayArray2[i_6][i_1][i_2]);
            }
        }

    }

    boolean method37(WorldMapRegion[] arr_1) {
        if (intArrayArray5 != null)
            return false;
        else {
            WM7 wm7_3 = new WM7(64, 64);
            if (worldMapRegionStorageSub1_1 != null)
                method40(0, 0, 64, 64, worldMapRegionStorageSub1_1, wm7_3);
            else {
                Iterator iterator_4 = linkedList1.iterator();

                while (iterator_4.hasNext()) {
                    WorldMapRegionStorageSub2 worldmapregionstoragesub2_5 = (WorldMapRegionStorageSub2) iterator_4.next();
                    method40(worldmapregionstoragesub2_5.method392() * 8, worldmapregionstoragesub2_5.method393() * 8, 8, 8, worldmapregionstoragesub2_5, wm7_3);
                }
            }

            method39(arr_1, wm7_3);
            method38(wm7_3);
            return true;
        }
    }

    void method38(WM7 wm7_1) {
        intArrayArray5 = new int[64][64];

        for (int i_3 = 0; i_3 < 64; i_3++)
            for (int i_4 = 0; i_4 < 64; i_4++)
                intArrayArray5[i_3][i_4] = wm7_1.method25(i_3, i_4) | ~0xffffff;

    }

    void method39(WorldMapRegion[] arr_1, WM7 wm7_2) {
        WMEnum3[] arr_4 = WMEnum3.staticMethod172();
        WMEnum3[] arr_5 = arr_4;

        for (int i_6 = 0; i_6 < arr_5.length; i_6++) {
            WMEnum3 wmenum3_7 = arr_5[i_6];
            if (arr_1[wmenum3_7.ordinal()] != null) {
                byte b_8 = 0;
                byte b_9 = 0;
                byte b_10 = 64;
                byte b_11 = 64;
                byte b_12 = 0;
                byte b_13 = 0;
                switch (wmenum3_7.int256) {
                case 0:
                    b_13 = 59;
                    b_11 = 5;
                    b_8 = 59;
                    b_10 = 5;
                    break;
                case 1:
                    b_8 = 59;
                    b_10 = 5;
                    break;
                case 2:
                    b_13 = 59;
                    b_11 = 5;
                    break;
                case 3:
                    b_9 = 59;
                    b_11 = 5;
                    b_12 = 59;
                    b_10 = 5;
                    break;
                case 4:
                    b_12 = 59;
                    b_13 = 59;
                    b_10 = 5;
                    b_11 = 5;
                    break;
                case 5:
                    b_9 = 59;
                    b_11 = 5;
                    b_8 = 59;
                    b_10 = 5;
                    break;
                case 6:
                    b_9 = 59;
                    b_11 = 5;
                    break;
                case 7:
                    b_12 = 59;
                    b_10 = 5;
                }

                method41(b_12, b_13, b_8, b_9, b_10, b_11, arr_1[wmenum3_7.ordinal()], wm7_2);
            }
        }

    }

    void method40(int i_1, int i_2, int i_3, int i_4, WorldMapRegionStorage worldmapregionstorage_5, WM7 wm7_6) {
        for (int i_8 = i_1; i_8 < i_3 + i_1; i_8++)
            for (int i_9 = i_2; i_9 < i_2 + i_4; i_9++) {
                int i_10 = worldmapregionstorage_5.shortArrayArrayArray1[0][i_8][i_9] - 1;
                if (i_10 != -1) {
                    Underlay underlay_11 = AbstractClass1Sub1.staticMethod249(i_10);
                    wm7_6.method24(i_8, i_9, 5, underlay_11);
                }
            }

    }

    void method41(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, WorldMapRegion worldmapregion_7, WM7 wm7_8) {
        for (int i_10 = 0; i_10 < i_5; i_10++)
            for (int i_11 = 0; i_11 < i_6; i_11++) {
                int i_12 = worldmapregion_7.method60(i_10 + i_1, i_2 + i_11);
                if (i_12 != -1) {
                    Underlay underlay_13 = AbstractClass1Sub1.staticMethod249(i_12);
                    wm7_8.method24(i_3 + i_10, i_4 + i_11, 5, underlay_13);
                }
            }

    }

    int method42(int i_1, int i_2, WorldMapRegionStorage worldmapregionstorage_3) {
        return worldmapregionstorage_3.shortArrayArrayArray1[0][i_1][i_2] == 0 ? int55 : intArrayArray5[i_1][i_2];
    }

    void method43(int i_1, int i_2, WorldMapRegionStorage worldmapregionstorage_3, IndexedSprite[] arr_4) {
        for (int i_6 = 0; i_6 < worldmapregionstorage_3.int35; i_6++) {
            WorldMapTile[] arr_7 = worldmapregionstorage_3.tiles[i_6][i_1][i_2];
            if (arr_7 != null && arr_7.length != 0) {
                WorldMapTile[] arr_8 = arr_7;

                for (int i_9 = 0; i_9 < arr_8.length; i_9++) {
                    WorldMapTile worldmaptile_10 = arr_8[i_9];
                    if (WMEnum4.staticMethod185(worldmaptile_10.type) || WMEnum4.staticMethod186(worldmaptile_10.type)) {
                        LocType loctype_11 = LocType.staticMethod411(worldmaptile_10.objectId);
                        if (loctype_11.int517 != -1)
                            if (loctype_11.int517 != 46 && loctype_11.int517 != 52)
                                arr_4[loctype_11.int517].method674(i_1 * int54, int54 * (63 - i_2), int54 * 2, int54 * 2);
                            else
                                arr_4[loctype_11.int517].method674(i_1 * int54, (63 - i_2) * int54, int54 * 2 + 1, int54 * 2 + 1);
                    }
                }
            }
        }

    }

    void method44(int i_1, int i_2, WorldMapRegionStorage worldmapregionstorage_3) {
        for (int i_5 = 0; i_5 < worldmapregionstorage_3.int35; i_5++) {
            WorldMapTile[] arr_6 = worldmapregionstorage_3.tiles[i_5][i_1][i_2];
            if (arr_6 != null && arr_6.length != 0) {
                WorldMapTile[] arr_7 = arr_6;

                for (int i_8 = 0; i_8 < arr_7.length; i_8++) {
                    WorldMapTile worldmaptile_9 = arr_7[i_8];
                    int i_11 = worldmaptile_9.type;
                    boolean bool_10 = i_11 >= WMEnum4.staticWMEnum4_18.ordinal && i_11 <= WMEnum4.staticWMEnum4_4.ordinal || WMEnum4.staticWMEnum4_5.ordinal == i_11;
                    if (bool_10) {
                        LocType loctype_12 = LocType.staticMethod411(worldmaptile_9.objectId);
                        int i_13 = loctype_12.int514 != 0 ? -3407872 : -3355444;
                        if (WMEnum4.staticWMEnum4_18.ordinal == worldmaptile_9.type)
                            drawWall(i_1, i_2, worldmaptile_9.orient, i_13);

                        if (WMEnum4.staticWMEnum4_3.ordinal == worldmaptile_9.type) {
                            drawWall(i_1, i_2, worldmaptile_9.orient, -3355444);
                            drawWall(i_1, i_2, worldmaptile_9.orient + 1, i_13);
                        }

                        if (worldmaptile_9.type == WMEnum4.staticWMEnum4_4.ordinal) {
                            if (worldmaptile_9.orient == 0)
                                Rasterizer2D.staticMethod459(i_1 * int54, (63 - i_2) * int54, 1, i_13);

                            if (worldmaptile_9.orient == 1)
                                Rasterizer2D.staticMethod459(i_1 * int54 + int54 - 1, (63 - i_2) * int54, 1, i_13);

                            if (worldmaptile_9.orient == 2)
                                Rasterizer2D.staticMethod459(int54 + int54 * i_1 - 1, int54 * (63 - i_2) + int54 - 1, 1, i_13);

                            if (worldmaptile_9.orient == 3)
                                Rasterizer2D.staticMethod459(int54 * i_1, (63 - i_2) * int54 + int54 - 1, 1, i_13);
                        }

                        if (worldmaptile_9.type == WMEnum4.staticWMEnum4_5.ordinal) {
                            int i_14 = worldmaptile_9.orient % 2;
                            int i_15;
                            if (i_14 == 0)
                                for (i_15 = 0; i_15 < int54; i_15++)
                                    Rasterizer2D.staticMethod459(i_15 + i_1 * int54, (64 - i_2) * int54 - 1 - i_15, 1, i_13);
                            else
                                for (i_15 = 0; i_15 < int54; i_15++)
                                    Rasterizer2D.staticMethod459(i_15 + int54 * i_1, i_15 + int54 * (63 - i_2), 1, i_13);
                        }
                    }
                }
            }
        }

    }

    void method45(int i_1, int i_2, HashSet hashset_3, int i_4) {
        float f_6 = i_4 / 64.0F;
        float f_7 = f_6 / 2.0F;
        Iterator iterator_8 = hashMap4.entrySet().iterator();

        while (iterator_8.hasNext()) {
            Entry map$entry_9 = (Entry) iterator_8.next();
            WorldMapCoord worldmapcoord_10 = (WorldMapCoord) map$entry_9.getKey();
            int i_11 = (int) (worldmapcoord_10.int262 * f_6 + i_1 - f_7);
            int i_12 = (int) (i_2 + i_4 - f_6 * worldmapcoord_10.int260 - f_7);
            WorldMapDecor worldmapdecor_13 = (WorldMapDecor) map$entry_9.getValue();
            if (worldmapdecor_13 != null) {
                worldmapdecor_13.int58 = i_11;
                worldmapdecor_13.int57 = i_12;
                MapElementType mapelementtype_14 = DataClass13.staticMapElementTypeArray1[worldmapdecor_13.int56];
                if (!hashset_3.contains(Integer.valueOf(mapelementtype_14.method571())))
                    method48(worldmapdecor_13, i_11, i_12, f_6);
            }
        }

    }

    void method46(HashSet hashset_1, int i_2, int i_3) {
        Iterator iterator_5 = list1.iterator();

        while (iterator_5.hasNext()) {
            WorldMapDecor worldmapdecor_6 = (WorldMapDecor) iterator_5.next();
            MapElementType mapelementtype_7 = DataClass13.staticMapElementTypeArray1[worldmapdecor_6.int56];
            if (mapelementtype_7 != null && hashset_1.contains(Integer.valueOf(mapelementtype_7.method571())))
                method47(mapelementtype_7, worldmapdecor_6.int58, worldmapdecor_6.int57, i_2, i_3);
        }

    }

    void method47(MapElementType mapelementtype_1, int i_2, int i_3, int i_4, int i_5) {
        Sprite sprite_7 = mapelementtype_1.getPOISprite(false);
        if (sprite_7 != null) {
            sprite_7.method684(i_2 - sprite_7.width / 2, i_3 - sprite_7.height / 2);
            if (i_4 % i_5 < i_5 / 2) {
                Rasterizer2D.staticMethod448(i_2, i_3, 15, 16776960, 128);
                Rasterizer2D.staticMethod448(i_2, i_3, 7, 16777215, 256);
            }

        }
    }

    void method48(WorldMapDecor worldmapdecor_1, int i_2, int i_3, float f_4) {
        MapElementType mapelementtype_6 = DataClass13.staticMapElementTypeArray1[worldmapdecor_1.int56];
        method49(mapelementtype_6, i_2, i_3);
        method50(worldmapdecor_1, mapelementtype_6, i_2, i_3, f_4);
    }

    void method49(MapElementType mapelementtype_1, int i_2, int i_3) {
        Sprite sprite_5 = mapelementtype_1.getPOISprite(false);
        if (sprite_5 != null) {
            int i_6 = method54(sprite_5, mapelementtype_1.wMUselessEnum1_1);
            int i_7 = method55(sprite_5, mapelementtype_1.wMUselessEnum2_1);
            sprite_5.method684(i_6 + i_2, i_3 + i_7);
        }

    }

    void method50(WorldMapDecor worldmapdecor_1, MapElementType mapelementtype_2, int i_3, int i_4, float f_5) {
        if (worldmapdecor_1.worldMapLabel1 != null)
            if (worldmapdecor_1.worldMapLabel1.worldMapFont1.method383(f_5)) {
                FontFace fontface_7 = (FontFace) hashMap5.get(worldmapdecor_1.worldMapLabel1.worldMapFont1);
                fontface_7.method667(worldmapdecor_1.worldMapLabel1.string1, i_3 - worldmapdecor_1.worldMapLabel1.int31 / 2, i_4, worldmapdecor_1.worldMapLabel1.int31, worldmapdecor_1.worldMapLabel1.int30, ~0xffffff | mapelementtype_2.textcolor, 0, 1, 0, fontface_7.int674 / 2);
            }
    }

    void method51(int i_1, int i_2, HashSet hashset_3, int i_4) {
        float f_6 = i_4 / 64.0F;
        Iterator iterator_7 = list1.iterator();

        while (iterator_7.hasNext()) {
            WorldMapDecor worldmapdecor_8 = (WorldMapDecor) iterator_7.next();
            int i_9 = worldmapdecor_8.worldMapCoord3.int262 % 64;
            int i_10 = worldmapdecor_8.worldMapCoord3.int260 % 64;
            worldmapdecor_8.int58 = (int) (f_6 * i_9 + i_1);
            worldmapdecor_8.int57 = (int) (i_2 + (63 - i_10) * f_6);
            if (!hashset_3.contains(Integer.valueOf(worldmapdecor_8.int56)))
                method48(worldmapdecor_8, worldmapdecor_8.int58, worldmapdecor_8.int57, f_6);
        }

    }

    void method52() {
        if (worldMapRegionStorageSub1_1 != null)
            for (int i_2 = 0; i_2 < 64; i_2++)
                for (int i_3 = 0; i_3 < 64; i_3++)
                    method53(i_2, i_3, worldMapRegionStorageSub1_1);
        else {
            Iterator iterator_6 = linkedList1.iterator();

            while (iterator_6.hasNext()) {
                WorldMapRegionStorageSub2 worldmapregionstoragesub2_7 = (WorldMapRegionStorageSub2) iterator_6.next();

                for (int i_4 = worldmapregionstoragesub2_7.method392() * 8; i_4 < worldmapregionstoragesub2_7.method392() * 8 + 8; i_4++)
                    for (int i_5 = worldmapregionstoragesub2_7.method393() * 8; i_5 < worldmapregionstoragesub2_7.method393() * 8 + 8; i_5++)
                        method53(i_4, i_5, worldmapregionstoragesub2_7);
            }
        }

    }

    void method53(int i_1, int i_2, WorldMapRegionStorage worldmapregionstorage_3) {
        staticWorldMapCoord1.method294(0, i_1, i_2);

        for (int i_5 = 0; i_5 < worldmapregionstorage_3.int35; i_5++) {
            WorldMapTile[] arr_6 = worldmapregionstorage_3.tiles[i_5][i_1][i_2];
            if (arr_6 != null && arr_6.length != 0) {
                WorldMapTile[] arr_7 = arr_6;

                for (int i_8 = 0; i_8 < arr_7.length; i_8++) {
                    WorldMapTile worldmaptile_9 = arr_7[i_8];
                    MapElementType mapelementtype_10 = getMapElementForDecorObject(worldmaptile_9.objectId);
                    if (mapelementtype_10 != null) {
                        WorldMapDecor worldmapdecor_11 = (WorldMapDecor) hashMap4.get(staticWorldMapCoord1);
                        if (worldmapdecor_11 != null) {
                            if (worldmapdecor_11.int56 != mapelementtype_10.int547) {
                                WorldMapDecor worldmapdecor_16 = new WorldMapDecor(mapelementtype_10.int547, worldmapdecor_11.worldMapCoord4, worldmapdecor_11.worldMapCoord3, method57(mapelementtype_10));
                                hashMap4.put(new WorldMapCoord(staticWorldMapCoord1), worldmapdecor_16);
                                worldmapdecor_11 = worldmapdecor_16;
                            }

                            int i_17 = worldmapdecor_11.worldMapCoord4.int261 - worldmapdecor_11.worldMapCoord3.int261;
                            worldmapdecor_11.worldMapCoord3.int261 = i_5;
                            worldmapdecor_11.worldMapCoord4.int261 = i_17 + i_5;
                            return;
                        }

                        WorldMapCoord worldmapcoord_12 = new WorldMapCoord(i_5, int52 * 64 + i_1, i_2 + int53 * 64);
                        WorldMapCoord worldmapcoord_13 = null;
                        if (worldMapRegionStorageSub1_1 != null)
                            worldmapcoord_13 = new WorldMapCoord(i_5 + worldMapRegionStorageSub1_1.int36, worldMapRegionStorageSub1_1.int34 * 64 + i_1, worldMapRegionStorageSub1_1.int37 * 64 + i_2);
                        else {
                            Iterator iterator_14 = linkedList1.iterator();

                            while (iterator_14.hasNext()) {
                                WorldMapRegionStorageSub2 worldmapregionstoragesub2_15 = (WorldMapRegionStorageSub2) iterator_14.next();
                                if (worldmapregionstoragesub2_15.method389(i_1, i_2)) {
                                    worldmapcoord_13 = new WorldMapCoord(worldmapregionstoragesub2_15.int36 + i_5, i_1 + worldmapregionstoragesub2_15.int34 * 64 + worldmapregionstoragesub2_15.method390() * 8, i_2 + worldmapregionstoragesub2_15.int37 * 64 + worldmapregionstoragesub2_15.method391() * 8);
                                    break;
                                }
                            }
                        }

                        if (worldmapcoord_13 != null) {
                            worldmapdecor_11 = new WorldMapDecor(mapelementtype_10.int547, worldmapcoord_13, worldmapcoord_12, method57(mapelementtype_10));
                            hashMap4.put(new WorldMapCoord(staticWorldMapCoord1), worldmapdecor_11);
                            return;
                        }
                    }
                }
            }
        }

        hashMap4.remove(staticWorldMapCoord1);
    }

    int method54(Sprite sprite_1, WMUselessEnum1 wmuselessenum1_2) {
        switch (wmuselessenum1_2.int266) {
        case 0:
            return 0;
        case 1:
            return -sprite_1.width / 2;
        default:
            return -sprite_1.width;
        }
    }

    int method55(Sprite sprite_1, WMUselessEnum2 wmuselessenum2_2) {
        switch (wmuselessenum2_2.int264) {
        case 0:
            return -sprite_1.height / 2;
        case 1:
            return 0;
        default:
            return -sprite_1.height;
        }
    }

    MapElementType getMapElementForDecorObject(int i_1) {
        LocType loctype_3 = LocType.staticMethod411(i_1);
        if (loctype_3.intArray86 != null) {
            loctype_3 = loctype_3.method563();
            if (loctype_3 == null)
                return null;
        }

        return loctype_3.int524 != -1 ? DataClass13.staticMapElementTypeArray1[loctype_3.int524] : null;
    }

    WorldMapLabel method56(int i_1) {
        MapElementType mapelementtype_3 = DataClass13.staticMapElementTypeArray1[i_1];
        return method57(mapelementtype_3);
    }

    WorldMapLabel method57(MapElementType mapelementtype_1) {
        if (mapelementtype_1.text != null && hashMap5 != null && hashMap5.get(WorldMapFont.staticWorldMapFont2) != null) {
            int i_4 = mapelementtype_1.fontsize;
            WorldMapFont[] arr_5 = new WorldMapFont[] { WorldMapFont.staticWorldMapFont2, WorldMapFont.staticWorldMapFont3, WorldMapFont.staticWorldMapFont1 };
            WorldMapFont[] arr_6 = arr_5;
            int i_7 = 0;

            WorldMapFont worldmapfont_3;
            while (true) {
                if (i_7 >= arr_6.length) {
                    worldmapfont_3 = null;
                    break;
                }

                WorldMapFont worldmapfont_8 = arr_6[i_7];
                if (i_4 == worldmapfont_8.int299) {
                    worldmapfont_3 = worldmapfont_8;
                    break;
                }

                ++i_7;
            }

            if (worldmapfont_3 == null)
                return null;
            else {
                FontFace fontface_15 = (FontFace) hashMap5.get(worldmapfont_3);
                if (fontface_15 == null)
                    return null;
                else {
                    i_7 = fontface_15.method663(mapelementtype_1.text, 1000000);
                    String[] arr_16 = new String[i_7];
                    fontface_15.method661(mapelementtype_1.text, (int[]) null, arr_16);
                    int i_9 = arr_16.length * fontface_15.int674 / 2;
                    int i_10 = 0;
                    String[] arr_11 = arr_16;

                    for (int i_12 = 0; i_12 < arr_11.length; i_12++) {
                        String string_13 = arr_11[i_12];
                        int i_14 = fontface_15.stringWidth(string_13);
                        if (i_14 > i_10)
                            i_10 = i_14;
                    }

                    return new WorldMapLabel(mapelementtype_1.text, i_10, i_9, worldmapfont_3);
                }
            }
        } else
            return null;
    }

    List method58(int i_1, int i_2, int i_3, int i_4, int i_5) {
        LinkedList linkedlist_7 = new LinkedList();
        if (i_4 >= i_1 && i_5 >= i_2) {
            if (i_4 < i_3 + i_1 && i_5 < i_2 + i_3) {
                Iterator iterator_8 = hashMap4.values().iterator();

                WorldMapDecor worldmapdecor_9;
                while (iterator_8.hasNext()) {
                    worldmapdecor_9 = (WorldMapDecor) iterator_8.next();
                    if (worldmapdecor_9.method61(i_4, i_5))
                        linkedlist_7.add(worldmapdecor_9);
                }

                iterator_8 = list1.iterator();

                while (iterator_8.hasNext()) {
                    worldmapdecor_9 = (WorldMapDecor) iterator_8.next();
                    if (worldmapdecor_9.method61(i_4, i_5))
                        linkedlist_7.add(worldmapdecor_9);
                }

                return linkedlist_7;
            } else
                return linkedlist_7;
        } else
            return linkedlist_7;
    }

    List method59() {
        LinkedList linkedlist_2 = new LinkedList();
        linkedlist_2.addAll(list1);
        linkedlist_2.addAll(hashMap4.values());
        return linkedlist_2;
    }

    void drawWall(int i_1, int i_2, int i_3, int i_4) {
        i_3 %= 4;
        if (i_3 == 0)
            Rasterizer2D.staticMethod461(i_1 * int54, int54 * (63 - i_2), int54, i_4);

        if (i_3 == 1)
            Rasterizer2D.staticMethod459(int54 * i_1, int54 * (63 - i_2), int54, i_4);

        if (i_3 == 2)
            Rasterizer2D.staticMethod461(int54 + i_1 * int54 - 1, int54 * (63 - i_2), int54, i_4);

        if (i_3 == 3)
            Rasterizer2D.staticMethod459(i_1 * int54, int54 + (63 - i_2) * int54 - 1, int54, i_4);

    }

    int method60(int i_1, int i_2) {
        if (worldMapRegionStorageSub1_1 != null)
            return worldMapRegionStorageSub1_1.method12(i_1, i_2);
        else {
            if (!linkedList1.isEmpty()) {
                Iterator iterator_4 = linkedList1.iterator();

                while (iterator_4.hasNext()) {
                    WorldMapRegionStorageSub2 worldmapregionstoragesub2_5 = (WorldMapRegionStorageSub2) iterator_4.next();
                    if (worldmapregionstoragesub2_5.method389(i_1, i_2))
                        return worldmapregionstoragesub2_5.method12(i_1, i_2);
                }
            }

            return -1;
        }
    }

}

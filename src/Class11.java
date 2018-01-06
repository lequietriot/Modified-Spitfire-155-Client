import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Class11 {

    int int284 = -1;
    int int285 = -1;
    int int287 = -1;
    int int283 = -1;
    int int289 = -1;
    int int281 = -1;
    int int288 = 3;
    int int290 = 50;
    boolean bool21 = false;
    HashSet hashSet6 = null;
    int int295 = -1;
    int int286 = -1;
    int int291 = -1;
    int int292 = -1;
    HashSet hashSet4 = new HashSet();
    HashSet hashSet1 = new HashSet();
    HashSet hashSet5 = new HashSet();
    HashSet hashSet3 = new HashSet();
    boolean bool20 = false;
    int int294 = 0;
    final int[] intArray42 = new int[] { 1008, 1009, 1010, 1011, 1012 };
    HashSet hashSet2 = new HashSet();
    WorldMapCoord worldMapCoord6 = null;
    static final FontDescriptor staticFontDescriptor7;
    static final FontDescriptor staticFontDescriptor9;
    static final FontDescriptor staticFontDescriptor8;
    IndexedSprite[] indexedSpriteArray1;
    Js5Index js5Index4;
    FontFace fontFace1;
    HashMap hashMap8;
    WorldMapLoadingProgress worldMapLoadingProgress1;
    HashMap hashMap7;
    WorldMapAreaDescriptor worldMapAreaDescriptor3;
    WorldMapAreaDescriptor worldMapAreaDescriptor1;
    int int282;
    int int293;
    float float2;
    WorldMapAreaDescriptor worldMapAreaDescriptor2;
    WorldMapArea worldMapArea2;
    float float1;
    List list2;
    Iterator iterator1;

    static {
        staticFontDescriptor7 = FontDescriptor.staticFontDescriptor3;
        staticFontDescriptor9 = FontDescriptor.staticFontDescriptor4;
        staticFontDescriptor8 = FontDescriptor.staticFontDescriptor6;
    }

    public void method324(Js5Index js5index_1, FontFace fontface_2, HashMap hashmap_3, IndexedSprite[] arr_4) {
        indexedSpriteArray1 = arr_4;
        js5Index4 = js5index_1;
        fontFace1 = fontface_2;
        hashMap8 = new HashMap();
        hashMap8.put(WorldMapFont.staticWorldMapFont2, hashmap_3.get(staticFontDescriptor7));
        hashMap8.put(WorldMapFont.staticWorldMapFont1, hashmap_3.get(staticFontDescriptor9));
        hashMap8.put(WorldMapFont.staticWorldMapFont3, hashmap_3.get(staticFontDescriptor8));
        worldMapLoadingProgress1 = new WorldMapLoadingProgress(js5index_1);
        int i_6 = js5Index4.indexOf(WorldMapResource.staticWorldMapResource2.filename);
        int[] ints_7 = js5Index4.getFileIds(i_6);
        hashMap7 = new HashMap(ints_7.length);

        for (int i_8 = 0; i_8 < ints_7.length; i_8++) {
            Buffer buffer_9 = new Buffer(js5Index4.getFile(i_6, ints_7[i_8]));
            WorldMapAreaDescriptor worldmapareadescriptor_10 = new WorldMapAreaDescriptor();
            worldmapareadescriptor_10.method64(buffer_9, ints_7[i_8]);
            hashMap7.put(worldmapareadescriptor_10.filename(), worldmapareadescriptor_10);
            if (worldmapareadescriptor_10.method72())
                worldMapAreaDescriptor1 = worldmapareadescriptor_10;
        }

        method337(worldMapAreaDescriptor1);
        worldMapAreaDescriptor3 = null;
    }

    public int method325() {
        return js5Index4.method308(worldMapAreaDescriptor1.filename(), WorldMapResource.staticWorldMapResource3.filename) ? 100 : js5Index4.getLoadedPercentage(worldMapAreaDescriptor1.filename());
    }

    public void method326(int i_1, int i_2, boolean bool_3, int i_4, int i_5, int i_6, int i_7) {
        if (worldMapLoadingProgress1.method381()) {
            method329();
            method330();
            if (bool_3) {
                int i_9 = (int) Math.ceil(i_6 / float2);
                int i_10 = (int) Math.ceil(i_7 / float2);
                List list_11 = worldMapArea2.method18(int282 - i_9 / 2 - 1, int293 - i_10 / 2 - 1, int282 + i_9 / 2 + 1, int293 + i_10 / 2 + 1, i_4, i_5, i_6, i_7, i_1, i_2);
                HashSet hashset_12 = new HashSet();

                Iterator iterator_13;
                WorldMapDecor worldmapdecor_14;
                RuneScript runescript_15;
                WM4 wm4_16;
                for (iterator_13 = list_11.iterator(); iterator_13.hasNext(); StaticClass15.staticMethod79(runescript_15)) {
                    worldmapdecor_14 = (WorldMapDecor) iterator_13.next();
                    hashset_12.add(worldmapdecor_14);
                    runescript_15 = new RuneScript();
                    wm4_16 = new WM4(worldmapdecor_14.int56, worldmapdecor_14.worldMapCoord4, worldmapdecor_14.worldMapCoord3);
                    runescript_15.method394(new Object[] { wm4_16, Integer.valueOf(i_1), Integer.valueOf(i_2) });
                    if (hashSet2.contains(worldmapdecor_14))
                        runescript_15.method395(WMEnumSub1.staticWMEnumSub1_7);
                    else
                        runescript_15.method395(WMEnumSub1.staticWMEnumSub1_8);
                }

                iterator_13 = hashSet2.iterator();

                while (iterator_13.hasNext()) {
                    worldmapdecor_14 = (WorldMapDecor) iterator_13.next();
                    if (!hashset_12.contains(worldmapdecor_14)) {
                        runescript_15 = new RuneScript();
                        wm4_16 = new WM4(worldmapdecor_14.int56, worldmapdecor_14.worldMapCoord4, worldmapdecor_14.worldMapCoord3);
                        runescript_15.method394(new Object[] { wm4_16, Integer.valueOf(i_1), Integer.valueOf(i_2) });
                        runescript_15.method395(WMEnumSub1.staticWMEnumSub1_6);
                        StaticClass15.staticMethod79(runescript_15);
                    }
                }

                hashSet2 = hashset_12;
            }
        }
    }

    public void method327(int i_1, int i_2, boolean bool_3, boolean bool_4) {
        method328(i_1, i_2, bool_4);
        if (int291 == -1)
            int291 = i_1;

        if (int292 == -1)
            int292 = i_2;

        int i_6 = i_1 - int291;
        int i_7 = i_2 - int292;
        int291 = i_1;
        int292 = i_2;
        if (bool_3 && !method331()) {
            int282 -= (int) (i_6 / float1);
            int293 += (int) (i_7 / float1);
        }

    }

    void method328(int i_1, int i_2, boolean bool_3) {
        boolean bool_5 = Client.staticInt246 >= 2;
        if (bool_5)
            if (worldMapAreaDescriptor2 != null) {
                int i_6 = (int) (int282 + (i_1 - int289 - method357() * float2 / 2.0F) / float2);
                int i_7 = (int) (int293 - (i_2 - int281 - method358() * float2 / 2.0F) / float2);
                worldMapCoord6 = worldMapAreaDescriptor2.method69(i_6 + worldMapAreaDescriptor2.getX() * 64, i_7 + worldMapAreaDescriptor2.getY() * 64);
                if (worldMapCoord6 != null && bool_3 && KeyboardHandler.staticBoolArray1[82] && KeyboardHandler.staticBoolArray1[81] && bool_3) {
                    int i_8 = worldMapCoord6.int262;
                    int i_9 = worldMapCoord6.int260;
                    int i_10 = worldMapCoord6.int261;
                    Client.staticPacket1.writeOpcode(201);
                    Client.staticPacket1.method473(i_9); // 2
                    Client.staticPacket1.method474(i_8); // 2
                    Client.staticPacket1.method466(i_10); // 1
                }
            } else
                worldMapCoord6 = null;

    }

    void method329() {
        if (float2 < float1)
            float2 = Math.min(float1, float2 + float2 / 30.0F);

        if (float2 > float1)
            float2 = Math.max(float1, float2 - float2 / 30.0F);

    }

    void method330() {
        if (method331()) {
            int i_2 = int284 - int282;
            int i_3 = int285 - int293;
            if (i_2 != 0)
                i_2 /= Math.min(8, Math.abs(i_2));

            if (i_3 != 0)
                i_3 /= Math.min(8, Math.abs(i_3));

            int282 += i_2;
            int293 += i_3;
            if (int284 == int282 && int293 == int285) {
                int284 = -1;
                int285 = -1;
            }

        }
    }

    boolean method331() {
        return int284 != -1 && int285 != -1;
    }

    public WorldMapAreaDescriptor method332(int i_1, int i_2, int i_3) {
        Iterator iterator_5 = hashMap7.values().iterator();

        WorldMapAreaDescriptor worldmapareadescriptor_6;
        do {
            if (!iterator_5.hasNext())
                return null;

            worldmapareadescriptor_6 = (WorldMapAreaDescriptor) iterator_5.next();
        } while (!worldmapareadescriptor_6.method66(i_1, i_2, i_3));

        return worldmapareadescriptor_6;
    }

    public void method333(int i_1, int i_2, int i_3, boolean bool_4) {
        WorldMapAreaDescriptor worldmapareadescriptor_6 = method332(i_1, i_2, i_3);
        if (worldmapareadescriptor_6 == null) {
            if (!bool_4)
                return;

            worldmapareadescriptor_6 = worldMapAreaDescriptor1;
        }

        boolean bool_7 = false;
        if (worldmapareadescriptor_6 != worldMapAreaDescriptor3 || bool_4) {
            worldMapAreaDescriptor3 = worldmapareadescriptor_6;
            method337(worldmapareadescriptor_6);
            bool_7 = true;
        }

        if (bool_7 || bool_4)
            method340(i_1, i_2, i_3);

    }

    public void method334(int i_1) {
        WorldMapAreaDescriptor worldmapareadescriptor_3 = method349(i_1);
        if (worldmapareadescriptor_3 != null)
            method337(worldmapareadescriptor_3);

    }

    public int method335() {
        return worldMapAreaDescriptor2 == null ? -1 : worldMapAreaDescriptor2.method71();
    }

    public WorldMapAreaDescriptor method336() {
        return worldMapAreaDescriptor2;
    }

    void method337(WorldMapAreaDescriptor worldmapareadescriptor_1) {
        if (worldMapAreaDescriptor2 == null || worldMapAreaDescriptor2 != worldmapareadescriptor_1) {
            method338(worldmapareadescriptor_1);
            method340(-1, -1, -1);
        }
    }

    void method338(WorldMapAreaDescriptor worldmapareadescriptor_1) {
        worldMapAreaDescriptor2 = worldmapareadescriptor_1;
        worldMapArea2 = new WorldMapArea(indexedSpriteArray1, hashMap8);
        worldMapLoadingProgress1.method379(worldMapAreaDescriptor2.filename());
    }

    public void method339(WorldMapAreaDescriptor worldmapareadescriptor_1, WorldMapCoord worldmapcoord_2, WorldMapCoord worldmapcoord_3, boolean bool_4) {
        if (worldmapareadescriptor_1 != null) {
            if (worldMapAreaDescriptor2 == null || worldMapAreaDescriptor2 != worldmapareadescriptor_1)
                method338(worldmapareadescriptor_1);

            if (!bool_4 && worldMapAreaDescriptor2.method66(worldmapcoord_2.int261, worldmapcoord_2.int262, worldmapcoord_2.int260))
                method340(worldmapcoord_2.int261, worldmapcoord_2.int262, worldmapcoord_2.int260);
            else
                method340(worldmapcoord_3.int261, worldmapcoord_3.int262, worldmapcoord_3.int260);

        }
    }

    void method340(int i_1, int i_2, int i_3) {
        if (worldMapAreaDescriptor2 != null) {
            int[] ints_5 = worldMapAreaDescriptor2.method68(i_1, i_2, i_3);
            if (ints_5 == null)
                ints_5 = worldMapAreaDescriptor2.method68(worldMapAreaDescriptor2.method78(), worldMapAreaDescriptor2.method77(), worldMapAreaDescriptor2.method79());

            int282 = ints_5[0] - worldMapAreaDescriptor2.getX() * 64;
            int293 = ints_5[1] - worldMapAreaDescriptor2.getY() * 64;
            int284 = -1;
            int285 = -1;
            float2 = method345(worldMapAreaDescriptor2.method74());
            float1 = float2;
            list2 = null;
            iterator1 = null;
            worldMapArea2.setMapToNull();
        }
    }

    public void method341(int i_1, int i_2, int i_3, int i_4, int i_5) {
        int[] ints_7 = new int[4];
        Rasterizer2D.staticMethod444(ints_7);
        Rasterizer2D.staticMethod442(i_1, i_2, i_1 + i_3, i_4 + i_2);
        Rasterizer2D.staticMethod450(i_1, i_2, i_3, i_4, -16777216);
        int i_8 = worldMapLoadingProgress1.method382();
        if (i_8 < 100)
            method344(i_1, i_2, i_3, i_4, i_8);
        else {
            if (!worldMapArea2.method20()) {
                worldMapArea2.init(js5Index4, worldMapAreaDescriptor2.filename(), Client.staticBool24);
                if (!worldMapArea2.method20())
                    return;
            }

            if (hashSet6 != null) {
                ++int286;
                if (int286 % int290 == 0) {
                    int286 = 0;
                    ++int295;
                }

                if (int295 >= int288 && !bool21)
                    hashSet6 = null;
            }

            int i_9 = (int) Math.ceil(i_3 / float2);
            int i_10 = (int) Math.ceil(i_4 / float2);
            worldMapArea2.draw(int282 - i_9 / 2, int293 - i_10 / 2, int282 + i_9 / 2, i_10 / 2 + int293, i_1, i_2, i_1 + i_3, i_2 + i_4);
            boolean bool_11;
            if (!bool20) {
                bool_11 = false;
                if (i_5 - int294 > 100) {
                    int294 = i_5;
                    bool_11 = true;
                }

                worldMapArea2.method15(int282 - i_9 / 2, int293 - i_10 / 2, int282 + i_9 / 2, int293 + i_10 / 2, i_1, i_2, i_1 + i_3, i_2 + i_4, hashSet3, hashSet6, int286, int290, bool_11);
            }

            bool_11 = Client.staticInt246 >= 2;
            if (bool_11 && worldMapCoord6 != null)
                fontFace1.method664("Coord: " + worldMapCoord6, Rasterizer2D.staticInt316 + 10, 20 + Rasterizer2D.staticInt311, 16776960, -1);

            int287 = i_9;
            int283 = i_10;
            int289 = i_1;
            int281 = i_2;
            Rasterizer2D.staticMethod445(ints_7);
        }
    }

    public void method342(int i_1, int i_2, int i_3, int i_4) {
        if (worldMapLoadingProgress1.method381()) {
            if (!worldMapArea2.method20()) {
                worldMapArea2.init(js5Index4, worldMapAreaDescriptor2.filename(), Client.staticBool24);
                if (!worldMapArea2.method20())
                    return;
            }

            worldMapArea2.method17(i_1, i_2, i_3, i_4, hashSet6, int286, int290);
        }
    }

    public void method343(int i_1) {
        float1 = method345(i_1);
    }

    void method344(int i_1, int i_2, int i_3, int i_4, int i_5) {
        byte b_7 = 20;
        int i_8 = i_3 / 2 + i_1;
        int i_9 = i_4 / 2 + i_2 - 18 - b_7;
        Rasterizer2D.staticMethod450(i_1, i_2, i_3, i_4, -16777216);
        Rasterizer2D.staticMethod457(i_8 - 152, i_9, 304, 34, -65536);
        Rasterizer2D.staticMethod450(i_8 - 150, i_9 + 2, i_5 * 3, 30, -65536);
        fontFace1.drawString("Loading...", i_8, b_7 + i_9, -1, -1);
    }

    float method345(int i_1) {
        return i_1 == 25 ? 1.0F : i_1 == 37 ? 1.5F : i_1 == 50 ? 2.0F : i_1 == 75 ? 3.0F : i_1 == 100 ? 4.0F : 8.0F;
    }

    public int method346() {
        return float1 == 1.0D ? 25 : float1 == 1.5D ? 37 : float1 == 2.0D ? 50 : float1 == 3.0D ? 75 : float1 == 4.0D ? 100 : 200;
    }

    public void method347() {
        worldMapLoadingProgress1.method380();
    }

    public boolean method348() {
        return worldMapLoadingProgress1.method381();
    }

    public WorldMapAreaDescriptor method349(int i_1) {
        Iterator iterator_3 = hashMap7.values().iterator();

        WorldMapAreaDescriptor worldmapareadescriptor_4;
        do {
            if (!iterator_3.hasNext())
                return null;

            worldmapareadescriptor_4 = (WorldMapAreaDescriptor) iterator_3.next();
        } while (worldmapareadescriptor_4.method71() != i_1);

        return worldmapareadescriptor_4;
    }

    public void method350(int i_1, int i_2) {
        if (worldMapAreaDescriptor2 != null && worldMapAreaDescriptor2.method67(i_1, i_2)) {
            int284 = i_1 - worldMapAreaDescriptor2.getX() * 64;
            int285 = i_2 - worldMapAreaDescriptor2.getY() * 64;
        }
    }

    public void method351(int i_1, int i_2) {
        if (worldMapAreaDescriptor2 != null) {
            int282 = i_1 - worldMapAreaDescriptor2.getX() * 64;
            int293 = i_2 - worldMapAreaDescriptor2.getY() * 64;
            int284 = -1;
            int285 = -1;
        }
    }

    public void method352(int i_1, int i_2, int i_3) {
        if (worldMapAreaDescriptor2 != null) {
            int[] ints_5 = worldMapAreaDescriptor2.method68(i_1, i_2, i_3);
            if (ints_5 != null)
                method350(ints_5[0], ints_5[1]);

        }
    }

    public void method353(int i_1, int i_2, int i_3) {
        if (worldMapAreaDescriptor2 != null) {
            int[] ints_5 = worldMapAreaDescriptor2.method68(i_1, i_2, i_3);
            if (ints_5 != null)
                method351(ints_5[0], ints_5[1]);

        }
    }

    public int method354() {
        return worldMapAreaDescriptor2 == null ? -1 : int282 + worldMapAreaDescriptor2.getX() * 64;
    }

    public int method355() {
        return worldMapAreaDescriptor2 == null ? -1 : int293 + worldMapAreaDescriptor2.getY() * 64;
    }

    public WorldMapCoord method356() {
        return worldMapAreaDescriptor2 == null ? null : worldMapAreaDescriptor2.method69(method354(), method355());
    }

    public int method357() {
        return int287;
    }

    public int method358() {
        return int283;
    }

    public void method359(int i_1) {
        if (i_1 >= 1)
            int288 = i_1;

    }

    public void method360() {
        int288 = 3;
    }

    public void method361(int i_1) {
        if (i_1 >= 1)
            int290 = i_1;

    }

    public void method362() {
        int290 = 50;
    }

    public void method363(boolean bool_1) {
        bool21 = bool_1;
    }

    public void method364(int i_1) {
        hashSet6 = new HashSet();
        hashSet6.add(Integer.valueOf(i_1));
        int295 = 0;
        int286 = 0;
    }

    public void method365(int i_1) {
        hashSet6 = new HashSet();
        int295 = 0;
        int286 = 0;

        for (int i_3 = 0; i_3 < DataClass13.staticMapElementTypeArray1.length; i_3++)
            if (DataClass13.staticMapElementTypeArray1[i_3] != null && i_1 == DataClass13.staticMapElementTypeArray1[i_3].int548)
                hashSet6.add(Integer.valueOf(DataClass13.staticMapElementTypeArray1[i_3].int547));

    }

    public void method366() {
        hashSet6 = null;
    }

    public void method367(boolean bool_1) {
        bool20 = !bool_1;
    }

    public void method368(int i_1, boolean bool_2) {
        if (!bool_2)
            hashSet4.add(Integer.valueOf(i_1));
        else
            hashSet4.remove(Integer.valueOf(i_1));

        method373();
    }

    public void method369(int i_1, boolean bool_2) {
        if (!bool_2)
            hashSet1.add(Integer.valueOf(i_1));
        else
            hashSet1.remove(Integer.valueOf(i_1));

        for (int i_4 = 0; i_4 < DataClass13.staticMapElementTypeArray1.length; i_4++)
            if (DataClass13.staticMapElementTypeArray1[i_4] != null && i_1 == DataClass13.staticMapElementTypeArray1[i_4].int548) {
                int i_5 = DataClass13.staticMapElementTypeArray1[i_4].int547;
                if (!bool_2)
                    hashSet5.add(Integer.valueOf(i_5));
                else
                    hashSet5.remove(Integer.valueOf(i_5));
            }

        method373();
    }

    public boolean method370() {
        return !bool20;
    }

    public boolean method371(int i_1) {
        return !hashSet4.contains(Integer.valueOf(i_1));
    }

    public boolean method372(int i_1) {
        return !hashSet1.contains(Integer.valueOf(i_1));
    }

    void method373() {
        hashSet3.clear();
        hashSet3.addAll(hashSet4);
        hashSet3.addAll(hashSet5);
    }

    public void method374(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        if (worldMapLoadingProgress1.method381()) {
            int i_8 = (int) Math.ceil(i_3 / float2);
            int i_9 = (int) Math.ceil(i_4 / float2);
            List list_10 = worldMapArea2.method18(int282 - i_8 / 2 - 1, int293 - i_9 / 2 - 1, 1 + i_8 / 2 + int282, i_9 / 2 + int293 + 1, i_1, i_2, i_3, i_4, i_5, i_6);
            if (!list_10.isEmpty()) {
                Iterator iterator_11 = list_10.iterator();

                boolean bool_14;
                do {
                    if (!iterator_11.hasNext())
                        return;

                    WorldMapDecor worldmapdecor_12 = (WorldMapDecor) iterator_11.next();
                    MapElementType mapelementtype_13 = DataClass13.staticMapElementTypeArray1[worldmapdecor_12.int56];
                    bool_14 = false;

                    for (int i_15 = intArray42.length - 1; i_15 >= 0; --i_15)
                        if (mapelementtype_13.stupidoptions[i_15] != null) {
                            Client.staticMethod318(mapelementtype_13.stupidoptions[i_15], mapelementtype_13.stupidname, intArray42[i_15], worldmapdecor_12.int56, worldmapdecor_12.worldMapCoord4.method295(), worldmapdecor_12.worldMapCoord3.method295());
                            bool_14 = true;
                        }
                } while (!bool_14);

            }
        }
    }

    public WorldMapCoord method375(int i_1, WorldMapCoord worldmapcoord_2) {
        if (!worldMapLoadingProgress1.method381())
            return null;
        else if (!worldMapArea2.method20())
            return null;
        else if (!worldMapAreaDescriptor2.method67(worldmapcoord_2.int262, worldmapcoord_2.int260))
            return null;
        else {
            HashMap hashmap_4 = worldMapArea2.method21();
            List list_5 = (List) hashmap_4.get(Integer.valueOf(i_1));
            if (list_5 != null && !list_5.isEmpty()) {
                WorldMapDecor worldmapdecor_6 = null;
                int i_7 = -1;
                Iterator iterator_8 = list_5.iterator();

                while (true) {
                    WorldMapDecor worldmapdecor_9;
                    int i_12;
                    do {
                        if (!iterator_8.hasNext())
                            return worldmapdecor_6.worldMapCoord3;

                        worldmapdecor_9 = (WorldMapDecor) iterator_8.next();
                        int i_10 = worldmapdecor_9.worldMapCoord3.int262 - worldmapcoord_2.int262;
                        int i_11 = worldmapdecor_9.worldMapCoord3.int260 - worldmapcoord_2.int260;
                        i_12 = i_11 * i_11 + i_10 * i_10;
                        if (i_12 == 0)
                            return worldmapdecor_9.worldMapCoord3;
                    } while (i_12 >= i_7 && worldmapdecor_6 != null);

                    worldmapdecor_6 = worldmapdecor_9;
                    i_7 = i_12;
                }
            } else
                return null;
        }
    }

    public void method376(int i_1, int i_2, WorldMapCoord worldmapcoord_3, WorldMapCoord worldmapcoord_4) {
        RuneScript runescript_6 = new RuneScript();
        WM4 wm4_7 = new WM4(i_2, worldmapcoord_3, worldmapcoord_4);
        runescript_6.method394(new Object[] { wm4_7 });
        switch (i_1) {
        case 1008:
            runescript_6.method395(WMEnumSub1.staticWMEnumSub1_10);
        case 1010:
            runescript_6.method395(WMEnumSub1.staticWMEnumSub1_2);
            break;
        case 1009:
            runescript_6.method395(WMEnumSub1.staticWMEnumSub1_1);
            break;
        case 1011:
            runescript_6.method395(WMEnumSub1.staticWMEnumSub1_3);
            break;
        case 1012:
            runescript_6.method395(WMEnumSub1.staticWMEnumSub1_4);
        }

        StaticClass15.staticMethod79(runescript_6);
    }

    public WorldMapDecor method377() {
        if (!worldMapLoadingProgress1.method381())
            return null;
        else if (!worldMapArea2.method20())
            return null;
        else {
            HashMap hashmap_2 = worldMapArea2.method21();
            list2 = new LinkedList();
            Iterator iterator_3 = hashmap_2.values().iterator();

            while (iterator_3.hasNext()) {
                List list_4 = (List) iterator_3.next();
                list2.addAll(list_4);
            }

            iterator1 = list2.iterator();
            return method378();
        }
    }

    public WorldMapDecor method378() {
        return iterator1 == null ? null : !iterator1.hasNext() ? null : (WorldMapDecor) iterator1.next();
    }

}

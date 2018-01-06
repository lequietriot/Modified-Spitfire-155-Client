import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class WorldMapArea {

    static int[] staticIntArray1;
    static Js5IndexImpl staticJs5IndexImpl2;
    boolean bool2 = false;
    boolean bool1 = false;
    HashMap hashMap1 = new HashMap();
    IndexedSprite[] sprites;
    final HashMap hashMap3;
    WorldMapAreaDescriptorSub worldMapAreaDescriptorSub1;
    int int39;
    int int40;
    int int42;
    int int41;
    WorldMapRegion[][] icons;
    Sprite sprite1;
    HashMap hashMap2;

    public WorldMapArea(IndexedSprite[] arr_1, HashMap hashmap_2) {
        sprites = arr_1;
        hashMap3 = hashmap_2;
    }

    public void init(Js5Index js5index_1, String string_2, boolean bool_3) {
        if (!bool1) {
            bool2 = false;
            bool1 = true;
            System.nanoTime();
            int i_5 = js5index_1.indexOf(WorldMapResource.staticWorldMapResource2.filename);
            int i_6 = js5index_1.indexOf(i_5, string_2);
            Buffer buffer_7 = new Buffer(js5index_1.getFile(WorldMapResource.staticWorldMapResource2.filename, string_2));
            Buffer buffer_8 = new Buffer(js5index_1.getFile(WorldMapResource.staticWorldMapResource1.filename, string_2));
            Buffer buffer_9 = new Buffer(js5index_1.getFile(string_2, WorldMapResource.staticWorldMapResource3.filename));
            System.nanoTime();
            System.nanoTime();
            worldMapAreaDescriptorSub1 = new WorldMapAreaDescriptorSub();

            try {
                worldMapAreaDescriptorSub1.method386(buffer_7, buffer_9, buffer_8, i_6, bool_3);
            } catch (IllegalStateException illegalstateexception_18) {
                return;
            }

            worldMapAreaDescriptorSub1.method77();
            worldMapAreaDescriptorSub1.method78();
            worldMapAreaDescriptorSub1.method79();
            int39 = worldMapAreaDescriptorSub1.getX() * 64;
            int40 = worldMapAreaDescriptorSub1.getY() * 64;
            int42 = (worldMapAreaDescriptorSub1.method75() - worldMapAreaDescriptorSub1.getX() + 1) * 64;
            int41 = (worldMapAreaDescriptorSub1.method76() - worldMapAreaDescriptorSub1.getY() + 1) * 64;
            int i_10 = worldMapAreaDescriptorSub1.method75() - worldMapAreaDescriptorSub1.getX() + 1;
            int i_11 = worldMapAreaDescriptorSub1.method76() - worldMapAreaDescriptorSub1.getY() + 1;
            System.nanoTime();
            System.nanoTime();
            icons = new WorldMapRegion[i_10][i_11];
            Iterator iterator_12 = worldMapAreaDescriptorSub1.hashSet8.iterator();

            while (iterator_12.hasNext()) {
                WorldMapRegionStorageSub1 worldmapregionstoragesub1_13 = (WorldMapRegionStorageSub1) iterator_12.next();
                int i_14 = worldmapregionstoragesub1_13.int34;
                int i_15 = worldmapregionstoragesub1_13.int37;
                int i_16 = i_14 - worldMapAreaDescriptorSub1.getX();
                int i_17 = i_15 - worldMapAreaDescriptorSub1.getY();
                icons[i_16][i_17] = new WorldMapRegion(i_14, i_15, worldMapAreaDescriptorSub1.method73(), hashMap3);
                icons[i_16][i_17].method27(worldmapregionstoragesub1_13, worldMapAreaDescriptorSub1.list4);
            }

            for (int i_19 = 0; i_19 < i_10; i_19++)
                for (int i_21 = 0; i_21 < i_11; i_21++)
                    if (icons[i_19][i_21] == null) {
                        icons[i_19][i_21] = new WorldMapRegion(worldMapAreaDescriptorSub1.getX() + i_19, worldMapAreaDescriptorSub1.getY() + i_21, worldMapAreaDescriptorSub1.method73(), hashMap3);
                        icons[i_19][i_21].method28(worldMapAreaDescriptorSub1.hashSet7, worldMapAreaDescriptorSub1.list4);
                    }

            System.nanoTime();
            System.nanoTime();
            if (js5index_1.contains(WorldMapResource.staticWorldMapResource5.filename, string_2)) {
                byte[] bytes_20 = js5index_1.getFile(WorldMapResource.staticWorldMapResource5.filename, string_2);
                sprite1 = StaticClass6.staticMethod36(bytes_20);
            }

            System.nanoTime();
            bool2 = true;
        }
    }

    public final void setMapToNull() {
        hashMap2 = null;
    }

    public final void draw(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
        int[] ints_10 = Rasterizer2D.staticIntArray130;
        int i_11 = Rasterizer2D.staticInt312;
        int i_12 = Rasterizer2D.staticInt313;
        int[] ints_13 = new int[4];
        Rasterizer2D.staticMethod444(ints_13);
        WM1 wm1_14 = method19(i_1, i_2, i_3, i_4);
        float f_15 = aspectRatio(i_7 - i_5, i_3 - i_1);
        int i_16 = (int) Math.ceil(f_15);
        if (!hashMap1.containsKey(Integer.valueOf(i_16))) {
            WM2 wm2_17 = new WM2(i_16);
            wm2_17.method85();
            hashMap1.put(Integer.valueOf(i_16), wm2_17);
        }

        WorldMapRegion[] arr_23 = new WorldMapRegion[8];

        int i_18;
        int i_19;
        for (i_18 = wm1_14.int4; i_18 < wm1_14.int3 + wm1_14.int4; i_18++)
            for (i_19 = wm1_14.int1; i_19 < wm1_14.int2 + wm1_14.int1; i_19++) {
                method16(i_18, i_19, arr_23);
                icons[i_18][i_19].draw(i_16, (WM2) hashMap1.get(Integer.valueOf(i_16)), arr_23, sprites);
            }

        Rasterizer2D.staticMethod440(ints_10, i_11, i_12);
        Rasterizer2D.staticMethod445(ints_13);
        i_18 = (int) (64.0F * f_15);
        i_19 = int39 + i_1;
        int i_20 = int40 + i_2;

        for (int i_21 = wm1_14.int4; i_21 < wm1_14.int3 + wm1_14.int4; i_21++)
            for (int i_22 = wm1_14.int1; i_22 < wm1_14.int2 + wm1_14.int1; i_22++)
                icons[i_21][i_22].method26(i_5 + (icons[i_21][i_22].int52 * 64 - i_19) * i_18 / 64, i_8 - i_18 * (64 + icons[i_21][i_22].int53 * 64 - i_20) / 64, i_18);

    }

    public final void method15(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, HashSet hashset_9, HashSet hashset_10, int i_11, int i_12, boolean bool_13) {
        WM1 wm1_15 = method19(i_1, i_2, i_3, i_4);
        float f_16 = aspectRatio(i_7 - i_5, i_3 - i_1);
        int i_17 = (int) (f_16 * 64.0F);
        int i_18 = i_1 + int39;
        int i_19 = i_2 + int40;

        int i_20;
        int i_21;
        for (i_20 = wm1_15.int4; i_20 < wm1_15.int3 + wm1_15.int4; i_20++)
            for (i_21 = wm1_15.int1; i_21 < wm1_15.int1 + wm1_15.int2; i_21++) {
                if (bool_13)
                    icons[i_20][i_21].method52();

                icons[i_20][i_21].method31((icons[i_20][i_21].int52 * 64 - i_18) * i_17 / 64 + i_5, i_8 - (64 + icons[i_20][i_21].int53 * 64 - i_19) * i_17 / 64, i_17, hashset_9);
            }

        if (hashset_10 != null && i_11 > 0)
            for (i_20 = wm1_15.int4; i_20 < wm1_15.int4 + wm1_15.int3; i_20++)
                for (i_21 = wm1_15.int1; i_21 < wm1_15.int1 + wm1_15.int2; i_21++)
                    icons[i_20][i_21].method32(hashset_10, i_11, i_12);

    }

    void method16(int i_1, int i_2, WorldMapRegion[] arr_3) {
        boolean bool_5 = i_1 <= 0;
        boolean bool_6 = i_1 >= icons.length - 1;
        boolean bool_7 = i_2 <= 0;
        boolean bool_8 = i_2 >= icons[0].length - 1;
        if (bool_8)
            arr_3[WMEnum3.staticWMEnum3_7.ordinal()] = null;
        else
            arr_3[WMEnum3.staticWMEnum3_7.ordinal()] = icons[i_1][i_2 + 1];

        arr_3[WMEnum3.staticWMEnum3_1.ordinal()] = !bool_8 && !bool_6 ? icons[i_1 + 1][i_2 + 1] : null;
        arr_3[WMEnum3.staticWMEnum3_5.ordinal()] = !bool_8 && !bool_5 ? icons[i_1 - 1][i_2 + 1] : null;
        arr_3[WMEnum3.staticWMEnum3_2.ordinal()] = bool_6 ? null : icons[i_1 + 1][i_2];
        arr_3[WMEnum3.staticWMEnum3_6.ordinal()] = bool_5 ? null : icons[i_1 - 1][i_2];
        arr_3[WMEnum3.staticWMEnum3_8.ordinal()] = bool_7 ? null : icons[i_1][i_2 - 1];
        arr_3[WMEnum3.staticWMEnum3_3.ordinal()] = !bool_7 && !bool_6 ? icons[i_1 + 1][i_2 - 1] : null;
        arr_3[WMEnum3.staticWMEnum3_4.ordinal()] = !bool_7 && !bool_5 ? icons[i_1 - 1][i_2 - 1] : null;
    }

    public void method17(int i_1, int i_2, int i_3, int i_4, HashSet hashset_5, int i_6, int i_7) {
        if (sprite1 != null) {
            sprite1.method685(i_1, i_2, i_3, i_4);
            if (i_6 > 0 && i_6 % i_7 < i_7 / 2) {
                if (hashMap2 == null)
                    method22();

                Iterator iterator_9 = hashset_5.iterator();

                while (true) {
                    List list_11;
                    do {
                        if (!iterator_9.hasNext())
                            return;

                        int i_10 = ((Integer) iterator_9.next()).intValue();
                        list_11 = (List) hashMap2.get(Integer.valueOf(i_10));
                    } while (list_11 == null);

                    Iterator iterator_12 = list_11.iterator();

                    while (iterator_12.hasNext()) {
                        WorldMapDecor worldmapdecor_13 = (WorldMapDecor) iterator_12.next();
                        int i_14 = i_3 * (worldmapdecor_13.worldMapCoord3.int262 - int39) / int42;
                        int i_15 = i_4 - (worldmapdecor_13.worldMapCoord3.int260 - int40) * i_4 / int41;
                        Rasterizer2D.staticMethod448(i_14 + i_1, i_15 + i_2, 2, 16776960, 256);
                    }
                }
            }
        }
    }

    public List method18(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10) {
        LinkedList linkedlist_12 = new LinkedList();
        if (!bool2)
            return linkedlist_12;
        else {
            WM1 wm1_13 = method19(i_1, i_2, i_3, i_4);
            float f_14 = aspectRatio(i_7, i_3 - i_1);
            int i_15 = (int) (f_14 * 64.0F);
            int i_16 = int39 + i_1;
            int i_17 = i_2 + int40;

            for (int i_18 = wm1_13.int4; i_18 < wm1_13.int3 + wm1_13.int4; i_18++)
                for (int i_19 = wm1_13.int1; i_19 < wm1_13.int1 + wm1_13.int2; i_19++) {
                    List list_20 = icons[i_18][i_19].method58(i_5 + (icons[i_18][i_19].int52 * 64 - i_16) * i_15 / 64, i_8 + i_6 - (icons[i_18][i_19].int53 * 64 - i_17 + 64) * i_15 / 64, i_15, i_9, i_10);
                    if (!list_20.isEmpty())
                        linkedlist_12.addAll(list_20);
                }

            return linkedlist_12;
        }
    }

    WM1 method19(int i_1, int i_2, int i_3, int i_4) {
        WM1 wm1_6 = new WM1(this);
        int i_7 = i_1 + int39;
        int i_8 = i_2 + int40;
        int i_9 = i_3 + int39;
        int i_10 = int40 + i_4;
        int i_11 = i_7 / 64;
        int i_12 = i_8 / 64;
        int i_13 = i_9 / 64;
        int i_14 = i_10 / 64;
        wm1_6.int3 = 1 + i_13 - i_11;
        wm1_6.int2 = i_14 - i_12 + 1;
        wm1_6.int4 = i_11 - worldMapAreaDescriptorSub1.getX();
        wm1_6.int1 = i_12 - worldMapAreaDescriptorSub1.getY();
        if (wm1_6.int4 < 0) {
            wm1_6.int3 += wm1_6.int4;
            wm1_6.int4 = 0;
        }

        if (wm1_6.int4 > icons.length - wm1_6.int3)
            wm1_6.int3 = icons.length - wm1_6.int4;

        if (wm1_6.int1 < 0) {
            wm1_6.int2 += wm1_6.int1;
            wm1_6.int1 = 0;
        }

        if (wm1_6.int1 > icons[0].length - wm1_6.int2)
            wm1_6.int2 = icons[0].length - wm1_6.int1;

        wm1_6.int3 = Math.min(wm1_6.int3, icons.length);
        wm1_6.int2 = Math.min(wm1_6.int2, icons[0].length);
        return wm1_6;
    }

    public boolean method20() {
        return bool2;
    }

    public HashMap method21() {
        method22();
        return hashMap2;
    }

    void method22() {
        if (hashMap2 == null)
            hashMap2 = new HashMap();

        hashMap2.clear();

        for (int i_2 = 0; i_2 < icons.length; i_2++)
            for (int i_3 = 0; i_3 < icons[i_2].length; i_3++) {
                List list_4 = icons[i_2][i_3].method59();
                Iterator iterator_5 = list_4.iterator();

                while (iterator_5.hasNext()) {
                    WorldMapDecor worldmapdecor_6 = (WorldMapDecor) iterator_5.next();
                    if (!hashMap2.containsKey(Integer.valueOf(worldmapdecor_6.int56))) {
                        LinkedList linkedlist_7 = new LinkedList();
                        linkedlist_7.add(worldmapdecor_6);
                        hashMap2.put(Integer.valueOf(worldmapdecor_6.int56), linkedlist_7);
                    } else {
                        List list_8 = (List) hashMap2.get(Integer.valueOf(worldmapdecor_6.int56));
                        list_8.add(worldmapdecor_6);
                    }
                }
            }

    }

    float aspectRatio(int i_1, int i_2) {
        float f_4 = (float) i_1 / (float) i_2;
        if (f_4 > 8.0F)
            return 8.0F;
        else if (f_4 < 1.0F)
            return 1.0F;
        else {
            int i_5 = Math.round(f_4);
            return Math.abs(i_5 - f_4) < 0.05F ? (float) i_5 : f_4;
        }
    }

    static int staticMethod2(int i_0, RuneScriptDef runescriptdef_1, boolean bool_2) {
        int i_4;
        int i_5;
        if (i_0 == 3400) {
            StaticClass15.staticInt70 -= 2;
            i_4 = StaticClass15.staticIntArray26[StaticClass15.staticInt70];
            i_5 = StaticClass15.staticIntArray26[StaticClass15.staticInt70 + 1];
            RuneScriptMap runescriptmap_12 = (RuneScriptMap) RuneScriptMap.staticCache20.get(i_4);
            RuneScriptMap runescriptmap_11;
            if (runescriptmap_12 != null)
                runescriptmap_11 = runescriptmap_12;
            else {
                byte[] bytes_13 = RuneScriptMap.staticJs5Index23.getFile(8, i_4);
                runescriptmap_12 = new RuneScriptMap();
                if (bytes_13 != null)
                    runescriptmap_12.decode(new Buffer(bytes_13));

                RuneScriptMap.staticCache20.put(runescriptmap_12, i_4);
                runescriptmap_11 = runescriptmap_12;
            }

            runescriptmap_12 = runescriptmap_11;
            if (runescriptmap_11.char2 != 115)
                ;

            for (int i_14 = 0; i_14 < runescriptmap_12.int557; i_14++)
                if (runescriptmap_12.intArray93[i_14] == i_5) {
                    StaticClass15.staticStringArray2[StaticClass15.staticInt72++] = runescriptmap_12.stringArray6[i_14];
                    runescriptmap_12 = null;
                    break;
                }

            if (runescriptmap_12 != null)
                StaticClass15.staticStringArray2[StaticClass15.staticInt72++] = runescriptmap_12.string40;

            return 1;
        } else if (i_0 == 3408) {
            StaticClass15.staticInt70 -= 4;
            i_4 = StaticClass15.staticIntArray26[StaticClass15.staticInt70];
            i_5 = StaticClass15.staticIntArray26[1 + StaticClass15.staticInt70];
            int i_6 = StaticClass15.staticIntArray26[2 + StaticClass15.staticInt70];
            int i_7 = StaticClass15.staticIntArray26[StaticClass15.staticInt70 + 3];
            RuneScriptMap runescriptmap_9 = (RuneScriptMap) RuneScriptMap.staticCache20.get(i_6);
            RuneScriptMap runescriptmap_8;
            if (runescriptmap_9 != null)
                runescriptmap_8 = runescriptmap_9;
            else {
                byte[] bytes_10 = RuneScriptMap.staticJs5Index23.getFile(8, i_6);
                runescriptmap_9 = new RuneScriptMap();
                if (bytes_10 != null)
                    runescriptmap_9.decode(new Buffer(bytes_10));

                RuneScriptMap.staticCache20.put(runescriptmap_9, i_6);
                runescriptmap_8 = runescriptmap_9;
            }

            runescriptmap_9 = runescriptmap_8;
            if (i_4 == runescriptmap_8.char3 && i_5 == runescriptmap_8.char2) {
                for (int i_15 = 0; i_15 < runescriptmap_9.int557; i_15++)
                    if (i_7 == runescriptmap_9.intArray93[i_15]) {
                        if (i_5 == 115)
                            StaticClass15.staticStringArray2[StaticClass15.staticInt72++] = runescriptmap_9.stringArray6[i_15];
                        else
                            StaticClass15.staticIntArray26[StaticClass15.staticInt70++] = runescriptmap_9.intArray92[i_15];

                        runescriptmap_9 = null;
                        break;
                    }

                if (runescriptmap_9 != null)
                    if (i_5 == 115)
                        StaticClass15.staticStringArray2[StaticClass15.staticInt72++] = runescriptmap_9.string40;
                    else
                        StaticClass15.staticIntArray26[StaticClass15.staticInt70++] = runescriptmap_9.int558;

                return 1;
            } else {
                if (i_5 == 115)
                    StaticClass15.staticStringArray2[StaticClass15.staticInt72++] = "null";
                else
                    StaticClass15.staticIntArray26[StaticClass15.staticInt70++] = 0;

                return 1;
            }
        } else
            return 2;
    }

}

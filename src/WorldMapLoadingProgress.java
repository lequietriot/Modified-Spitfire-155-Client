public class WorldMapLoadingProgress {

    public static int staticInt150;
    static IndexedSprite[] staticIndexedSpriteArray8;
    int int297 = 0;
    boolean bool22 = false;
    Js5Index js5Index5;
    String string17;

    WorldMapLoadingProgress(Js5Index js5index_1) {
        js5Index5 = js5index_1;
    }

    void method379(String string_1) {
        if (string_1 != null && !string_1.isEmpty())
            if (string_1 != string17) {
                string17 = string_1;
                int297 = 0;
                bool22 = false;
                method380();
            }
    }

    int method380() {
        if (int297 < 25) {
            if (!js5Index5.method308(WorldMapResource.staticWorldMapResource1.filename, string17))
                return int297;

            int297 = 25;
        }

        if (int297 == 25) {
            if (!js5Index5.method308(string17, WorldMapResource.staticWorldMapResource3.filename))
                return 25 + js5Index5.getLoadedPercentage(string17) * 25 / 100;

            int297 = 50;
        }

        if (int297 == 50) {
            if (js5Index5.contains(WorldMapResource.staticWorldMapResource5.filename, string17) && !js5Index5.method308(WorldMapResource.staticWorldMapResource5.filename, string17))
                return 50;

            int297 = 75;
        }

        if (int297 == 75) {
            if (!js5Index5.method308(string17, WorldMapResource.staticWorldMapResource4.filename))
                return 75;

            int297 = 100;
            bool22 = true;
        }

        return int297;
    }

    boolean method381() {
        return bool22;
    }

    int method382() {
        return int297;
    }

}

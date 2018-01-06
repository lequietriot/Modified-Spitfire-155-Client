import com.alex.store.Index;

public class StaticClass32 {

    public static Index staticJs5Index3; //sfx1 index
    public static Index staticJs5Index4; //sfx3 index
    public static Index staticJs5Index5; //sfx2 index
    public static MidiSequence staticMidiSequence1;
    public static int staticInt133 = 0;
    public static Index staticJs5Index6; //midi1 index?
    public static int staticInt132;
    public static SoundBank staticSoundBank1;

    StaticClass32() throws Throwable {
        throw new Error();
    }

    public static void staticMethod164(Index js5index_0, int i_1, int i_2, int i_3, boolean bool_4) {
        staticInt133 = 1;
        staticJs5Index6 = js5index_0;
        staticInt132 = i_1;
        AnimFrame.staticInt306 = i_2;
        WorldMap.staticInt109 = i_3;
        GraphicsBuffer.staticBool23 = bool_4;
        WorldMapLoadingProgress.staticInt150 = 10000;
    }

    public static void staticMethod165(int i_0) {
        if (staticInt133 != 0)
            WorldMap.staticInt109 = i_0;
        else
            staticMidiSequence1.synchronizedMethod23(i_0);

    }

    public static void staticMethod166() {
        staticMidiSequence1.synchronizedMethod28();
        staticInt133 = 1;
        staticJs5Index6 = null;
    }

    public static void staticMethod167(int i_0, Index js5index_1, String string_2, String string_3, int i_4, boolean bool_5) {
        int i_7 = js5index_1.getArchiveId(string_2);
        int i_8 = js5index_1.getFileId(i_7, string_3);
        staticInt133 = 1;
        staticJs5Index6 = js5index_1;
        staticInt132 = i_7;
        AnimFrame.staticInt306 = i_8;
        WorldMap.staticInt109 = i_4;
        GraphicsBuffer.staticBool23 = bool_5;
        WorldMapLoadingProgress.staticInt150 = i_0;
    }

    public static void staticMethod168(int i_0) {
        staticInt133 = 1;
        staticJs5Index6 = null;
        staticInt132 = -1;
        AnimFrame.staticInt306 = -1;
        WorldMap.staticInt109 = 0;
        GraphicsBuffer.staticBool23 = false;
        WorldMapLoadingProgress.staticInt150 = i_0;
    }

    public static boolean staticMethod169() {
        try {
            if (staticInt133 == 2) {
                if (DataClass1.staticCompressedMidi1 == null) {
                    DataClass1.staticCompressedMidi1 = CompressedMidi.staticMethod380(staticJs5Index6, staticInt132, AnimFrame.staticInt306);
                    if (DataClass1.staticCompressedMidi1 == null)
                        return false;
                }

                if (staticSoundBank1 == null)
                    staticSoundBank1 = new SoundBank(staticJs5Index3, staticJs5Index5);

                if (staticMidiSequence1.synchronizedMethod24(DataClass1.staticCompressedMidi1, staticJs5Index4, staticSoundBank1, 22050)) {
                    staticMidiSequence1.synchronizedMethod25();
                    staticMidiSequence1.synchronizedMethod23(WorldMap.staticInt109);
                    staticMidiSequence1.synchronizedMethod27(DataClass1.staticCompressedMidi1, GraphicsBuffer.staticBool23);
                    staticInt133 = 0;
                    DataClass1.staticCompressedMidi1 = null;
                    staticSoundBank1 = null;
                    staticJs5Index6 = null;
                    return true;
                }
            }
        } catch (Exception exception_2) {
            exception_2.printStackTrace();
            staticMidiSequence1.synchronizedMethod28();
            staticInt133 = 0;
            DataClass1.staticCompressedMidi1 = null;
            staticSoundBank1 = null;
            staticJs5Index6 = null;
        }

        return false;
    }

}

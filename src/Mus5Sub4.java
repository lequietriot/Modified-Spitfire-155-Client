public class Mus5Sub4 extends Sequence {

    static Sprite staticSprite5;
    public static short[][] staticShortArrayArray4;
    public static byte[][] staticByteArrayArray6;
    Deque deque4 = new Deque();
    SequenceSub1 sequenceSub1_1 = new SequenceSub1();
    MidiSequence midiSequence1;

    Mus5Sub4(MidiSequence midisequence_1) {
        midiSequence1 = midisequence_1;
    }

    @Override
    protected Sequence method418() {
        MidiNote midinote_1 = (MidiNote) deque4.method257();
        return midinote_1 == null ? null : midinote_1.sampledSound3 != null ? midinote_1.sampledSound3 : method416();
    }

    @Override
    protected Sequence method416() {
        MidiNote midinote_1;
        do {
            midinote_1 = (MidiNote) deque4.method259();
            if (midinote_1 == null)
                return null;
        } while (midinote_1.sampledSound3 == null);

        return midinote_1.sampledSound3;
    }

    @Override
    protected int method417() {
        return 0;
    }

    @Override
    protected void method420(int[] ints_1, int i_2, int i_3) {
        sequenceSub1_1.method420(ints_1, i_2, i_3);

        for (MidiNote midinote_6 = (MidiNote) deque4.method257(); midinote_6 != null; midinote_6 = (MidiNote) deque4.method259())
            if (!midiSequence1.method551(midinote_6)) {
                int i_4 = i_2;
                int i_5 = i_3;

                do {
                    if (i_5 <= midinote_6.int387) {
                        method553(midinote_6, ints_1, i_4, i_5, i_5 + i_4);
                        midinote_6.int387 -= i_5;
                        break;
                    }

                    method553(midinote_6, ints_1, i_4, midinote_6.int387, i_4 + i_5);
                    i_4 += midinote_6.int387;
                    i_5 -= midinote_6.int387;
                } while (!midiSequence1.method552(midinote_6, ints_1, i_4, i_5));
            }

    }

    @Override
    protected void method419(int i_1) {
        sequenceSub1_1.method419(i_1);

        for (MidiNote midinote_3 = (MidiNote) deque4.method257(); midinote_3 != null; midinote_3 = (MidiNote) deque4.method259())
            if (!midiSequence1.method551(midinote_3)) {
                int i_2 = i_1;

                do {
                    if (i_2 <= midinote_3.int387) {
                        method554(midinote_3, i_2);
                        midinote_3.int387 -= i_2;
                        break;
                    }

                    method554(midinote_3, midinote_3.int387);
                    i_2 -= midinote_3.int387;
                } while (!midiSequence1.method552(midinote_3, (int[]) null, 0, i_2));
            }

    }

    void method553(MidiNote midinote_1, int[] ints_2, int i_3, int i_4, int i_5) {
        if ((midiSequence1.intArray75[midinote_1.int376] & 0x4) != 0 && midinote_1.int383 < 0) {
            int i_7 = midiSequence1.intArray80[midinote_1.int376] / WorldMapTile.staticInt7;

            while (true) {
                int i_8 = (i_7 + 1048575 - midinote_1.int389) / i_7;
                if (i_8 > i_4) {
                    midinote_1.int389 += i_4 * i_7;
                    break;
                }

                midinote_1.sampledSound3.method420(ints_2, i_3, i_8);
                i_3 += i_8;
                i_4 -= i_8;
                midinote_1.int389 += i_8 * i_7 - 1048576;
                int i_9 = WorldMapTile.staticInt7 / 100;
                int i_10 = 262144 / i_7;
                if (i_10 < i_9)
                    i_9 = i_10;

                SampledSound sampledsound_11 = midinote_1.sampledSound3;
                if (midiSequence1.intArray76[midinote_1.int376] == 0)
                    midinote_1.sampledSound3 = SampledSound.staticMethod392(midinote_1.musicNote1, sampledsound_11.synchronizedMethod22(), sampledsound_11.synchronizedMethod14(), sampledsound_11.synchronizedMethod15());
                else {
                    midinote_1.sampledSound3 = SampledSound.staticMethod392(midinote_1.musicNote1, sampledsound_11.synchronizedMethod22(), 0, sampledsound_11.synchronizedMethod15());
                    midiSequence1.method534(midinote_1, midinote_1.instrumentDef1.shortArray1[midinote_1.int386] < 0);
                    midinote_1.sampledSound3.synchronizedMethod18(i_9, sampledsound_11.synchronizedMethod14());
                }

                if (midinote_1.instrumentDef1.shortArray1[midinote_1.int386] < 0)
                    midinote_1.sampledSound3.synchronizedMethod10(-1);

                sampledsound_11.synchronizedMethod20(i_9);
                sampledsound_11.method420(ints_2, i_3, i_5 - i_3);
                if (sampledsound_11.method525())
                    sequenceSub1_1.synchronizedMethod8(sampledsound_11);
            }
        }

        midinote_1.sampledSound3.method420(ints_2, i_3, i_4);
    }

    void method554(MidiNote midinote_1, int i_2) {
        if ((midiSequence1.intArray75[midinote_1.int376] & 0x4) != 0 && midinote_1.int383 < 0) {
            int i_4 = midiSequence1.intArray80[midinote_1.int376] / WorldMapTile.staticInt7;
            int i_5 = (i_4 + 1048575 - midinote_1.int389) / i_4;
            midinote_1.int389 = i_2 * i_4 + midinote_1.int389 & 0xfffff;
            if (i_5 <= i_2) {
                if (midiSequence1.intArray76[midinote_1.int376] == 0)
                    midinote_1.sampledSound3 = SampledSound.staticMethod392(midinote_1.musicNote1, midinote_1.sampledSound3.synchronizedMethod22(), midinote_1.sampledSound3.synchronizedMethod14(), midinote_1.sampledSound3.synchronizedMethod15());
                else {
                    midinote_1.sampledSound3 = SampledSound.staticMethod392(midinote_1.musicNote1, midinote_1.sampledSound3.synchronizedMethod22(), 0, midinote_1.sampledSound3.synchronizedMethod15());
                    midiSequence1.method534(midinote_1, midinote_1.instrumentDef1.shortArray1[midinote_1.int386] < 0);
                }

                if (midinote_1.instrumentDef1.shortArray1[midinote_1.int386] < 0)
                    midinote_1.sampledSound3.synchronizedMethod10(-1);

                i_2 = midinote_1.int389 / i_4;
            }
        }

        midinote_1.sampledSound3.method419(i_2);
    }

}

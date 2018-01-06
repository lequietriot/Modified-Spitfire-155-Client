import java.io.IOException;

import com.alex.store.Index;

public class MidiSequence extends Sequence {

    static Js5DiskCache staticJs5DiskCache1;
    int int507 = 256;
    int int508 = 1000000;
    int[] intArray67 = new int[16];
    int[] intArray69 = new int[16];
    int[] intArray70 = new int[16];
    int[] intArray78 = new int[16];
    int[] intArray81 = new int[16];
    int[] intArray71 = new int[16];
    int[] intArray72 = new int[16];
    int[] intArray73 = new int[16];
    int[] intArray68 = new int[16];
    int[] intArray75 = new int[16];
    int[] intArray74 = new int[16];
    int[] intArray77 = new int[16];
    int[] intArray76 = new int[16];
    int[] intArray79 = new int[16];
    int[] intArray80 = new int[16];
    MidiNote[][] midiNoteArrayArray1 = new MidiNote[16][128];
    MidiNote[][] midiNoteArrayArray2 = new MidiNote[16][128];
    MidiFile midiFile1 = new MidiFile();
    Mus5Sub4 mus5Sub4_1 = new Mus5Sub4(this);
    HashTable hashTable5 = new HashTable(128);
    boolean bool51;
    long long20;
    int int509;
    int int510;
    long long21;

    public MidiSequence() {
        method542();
    }

    public synchronized void synchronizedMethod23(int i_1) {
        int507 = i_1;
    }

    public int method530() {
        return int507;
    }

    synchronized boolean synchronizedMethod24(CompressedMidi compressedmidi_1, Index staticJs5Index4, SoundBank soundbank_3, int i_4) throws IOException {
        compressedmidi_1.method493();
        boolean bool_6 = true;
        int[] ints_7 = null;
        if (i_4 > 0)
            ints_7 = new int[] { i_4 };

        for (MidiInstrument midiinstrument_8 = (MidiInstrument) compressedmidi_1.hashTable4.method267(); midiinstrument_8 != null; midiinstrument_8 = (MidiInstrument) compressedmidi_1.hashTable4.method268()) {
            int i_9 = (int) midiinstrument_8.id;
            InstrumentDef instrumentdef_10 = (InstrumentDef) hashTable5.get(i_9);
            if (instrumentdef_10 == null) {
                instrumentdef_10 = InstrumentDef.staticMethod379(staticJs5Index4, i_9);
                if (instrumentdef_10 == null) {
                    bool_6 = false;
                    continue;
                }

                hashTable5.put(instrumentdef_10, i_9);
            }

            if (!instrumentdef_10.method490(soundbank_3, midiinstrument_8.byteArray10, ints_7))
                bool_6 = false;
        }

        if (bool_6)
            compressedmidi_1.method494();

        return bool_6;
    }

    synchronized void synchronizedMethod25() {
        for (InstrumentDef instrumentdef_2 = (InstrumentDef) hashTable5.method267(); instrumentdef_2 != null; instrumentdef_2 = (InstrumentDef) hashTable5.method268())
            instrumentdef_2.method491();

    }

    public synchronized void synchronizedMethod26() {
        for (InstrumentDef instrumentdef_2 = (InstrumentDef) hashTable5.method267(); instrumentdef_2 != null; instrumentdef_2 = (InstrumentDef) hashTable5.method268())
            instrumentdef_2.unlink();

    }

    synchronized void synchronizedMethod27(CompressedMidi compressedmidi_1, boolean bool_2) {
        synchronizedMethod28();
        midiFile1.readMidi(compressedmidi_1.midiData);
        bool51 = bool_2;
        long20 = 0L;
        int i_4 = midiFile1.method271();

        for (int i_5 = 0; i_5 < i_4; i_5++) {
            midiFile1.method272(i_5);
            midiFile1.method275(i_5);
            midiFile1.method273(i_5);
        }

        int509 = midiFile1.method280();
        int510 = midiFile1.intArray40[int509];
        long21 = midiFile1.method279(int510);
    }

    public synchronized void synchronizedMethod28() {
        midiFile1.method269();
        method542();
    }

    public synchronized boolean synchronizedMethod29() {
        return midiFile1.method270();
    }

    public synchronized void synchronizedMethod30(int i_1, int i_2) {
        method531(i_1, i_2);
    }

    void method531(int i_1, int i_2) {
        intArray78[i_1] = i_2;
        intArray71[i_1] = i_2 & ~0x7f;
        method532(i_1, i_2);
    }

    void method532(int i_1, int i_2) {
        if (intArray81[i_1] != i_2) {
            intArray81[i_1] = i_2;

            for (int i_4 = 0; i_4 < 128; i_4++)
                midiNoteArrayArray2[i_1][i_4] = null;
        }

    }

    void method533(int i_1, int i_2, int i_3) {
        method535(i_1, i_2, 64);
        if ((intArray75[i_1] & 0x2) != 0)
            for (MidiNote midinote_5 = (MidiNote) mus5Sub4_1.deque4.method258(); midinote_5 != null; midinote_5 = (MidiNote) mus5Sub4_1.deque4.method260())
                if (i_1 == midinote_5.int376 && midinote_5.int383 < 0) {
                    midiNoteArrayArray1[i_1][midinote_5.int386] = null;
                    midiNoteArrayArray1[i_1][i_2] = midinote_5;
                    int i_6 = (midinote_5.int380 * midinote_5.int379 >> 12) + midinote_5.int378;
                    midinote_5.int378 += i_2 - midinote_5.int386 << 8;
                    midinote_5.int379 = i_6 - midinote_5.int378;
                    midinote_5.int380 = 4096;
                    midinote_5.int386 = i_2;
                    return;
                }

        InstrumentDef instrumentdef_9 = (InstrumentDef) hashTable5.get(intArray81[i_1]);
        if (instrumentdef_9 != null) {
            MusicNote musicnote_10 = instrumentdef_9.musicNoteArray1[i_2];
            if (musicnote_10 != null) {
                MidiNote midinote_7 = new MidiNote();
                midinote_7.int376 = i_1;
                midinote_7.instrumentDef1 = instrumentdef_9;
                midinote_7.musicNote1 = musicnote_10;
                midinote_7.mus4_1 = instrumentdef_9.mus4Array1[i_2];
                midinote_7.int374 = instrumentdef_9.byteArray7[i_2];
                midinote_7.int386 = i_2;
                midinote_7.int388 = 1024 + instrumentdef_9.byteArray8[i_2] * instrumentdef_9.int372 * i_3 * i_3 >> 11;
                midinote_7.int373 = instrumentdef_9.byteArray9[i_2] & 0xff;
                midinote_7.int378 = (i_2 << 8) - (instrumentdef_9.shortArray1[i_2] & 0x7fff);
                midinote_7.int381 = 0;
                midinote_7.int382 = 0;
                midinote_7.int375 = 0;
                midinote_7.int383 = -1;
                midinote_7.int384 = 0;
                if (intArray76[i_1] == 0)
                    midinote_7.sampledSound3 = SampledSound.staticMethod392(musicnote_10, method547(midinote_7), method548(midinote_7), method549(midinote_7));
                else {
                    midinote_7.sampledSound3 = SampledSound.staticMethod392(musicnote_10, method547(midinote_7), 0, method549(midinote_7));
                    method534(midinote_7, instrumentdef_9.shortArray1[i_2] < 0);
                }

                if (instrumentdef_9.shortArray1[i_2] < 0)
                    midinote_7.sampledSound3.synchronizedMethod10(-1);

                if (midinote_7.int374 >= 0) {
                    MidiNote midinote_8 = midiNoteArrayArray2[i_1][midinote_7.int374];
                    if (midinote_8 != null && midinote_8.int383 < 0) {
                        midiNoteArrayArray1[i_1][midinote_8.int386] = null;
                        midinote_8.int383 = 0;
                    }

                    midiNoteArrayArray2[i_1][midinote_7.int374] = midinote_7;
                }

                mus5Sub4_1.deque4.method253(midinote_7);
                midiNoteArrayArray1[i_1][i_2] = midinote_7;
            }
        }
    }

    void method534(MidiNote midinote_1, boolean bool_2) {
        int i_4 = midinote_1.musicNote1.byteArray11.length;
        int i_5;
        if (bool_2 && midinote_1.musicNote1.bool49) {
            int i_6 = i_4 + i_4 - midinote_1.musicNote1.int492;
            i_5 = (int) ((long) i_6 * (long) intArray76[midinote_1.int376] >> 6);
            i_4 <<= 8;
            if (i_5 >= i_4) {
                i_5 = i_4 + i_4 - 1 - i_5;
                midinote_1.sampledSound3.synchronizedMethod17(true);
            }
        } else
            i_5 = (int) ((long) intArray76[midinote_1.int376] * (long) i_4 >> 6);

        midinote_1.sampledSound3.synchronizedMethod16(i_5);
    }

    void method535(int i_1, int i_2, int i_3) {
        MidiNote midinote_5 = midiNoteArrayArray1[i_1][i_2];
        if (midinote_5 != null) {
            midiNoteArrayArray1[i_1][i_2] = null;
            if ((intArray75[i_1] & 0x2) != 0) {
                for (MidiNote midinote_6 = (MidiNote) mus5Sub4_1.deque4.method257(); midinote_6 != null; midinote_6 = (MidiNote) mus5Sub4_1.deque4.method259())
                    if (midinote_5.int376 == midinote_6.int376 && midinote_6.int383 < 0 && midinote_5 != midinote_6) {
                        midinote_5.int383 = 0;
                        break;
                    }
            } else
                midinote_5.int383 = 0;

        }
    }

    void method536(int i_1, int i_2, int i_3) {
    }

    void method537(int i_1, int i_2) {
    }

    void method538(int i_1, int i_2) {
        intArray72[i_1] = i_2;
    }

    void method539(int i_1) {
        for (MidiNote midinote_3 = (MidiNote) mus5Sub4_1.deque4.method257(); midinote_3 != null; midinote_3 = (MidiNote) mus5Sub4_1.deque4.method259())
            if (i_1 < 0 || i_1 == midinote_3.int376) {
                if (midinote_3.sampledSound3 != null) {
                    midinote_3.sampledSound3.synchronizedMethod20(WorldMapTile.staticInt7 / 100);
                    if (midinote_3.sampledSound3.method525())
                        mus5Sub4_1.sequenceSub1_1.synchronizedMethod8(midinote_3.sampledSound3);

                    midinote_3.method492();
                }

                if (midinote_3.int383 < 0)
                    midiNoteArrayArray1[midinote_3.int376][midinote_3.int386] = null;

                midinote_3.unlink();
            }

    }

    void method540(int i_1) {
        if (i_1 >= 0) {
            intArray67[i_1] = 12800;
            intArray69[i_1] = 8192;
            intArray70[i_1] = 16383;
            intArray72[i_1] = 8192;
            intArray73[i_1] = 0;
            intArray68[i_1] = 8192;
            method543(i_1);
            method544(i_1);
            intArray75[i_1] = 0;
            intArray74[i_1] = 32767;
            intArray77[i_1] = 256;
            intArray76[i_1] = 0;
            method546(i_1, 8192);
        } else
            for (i_1 = 0; i_1 < 16; i_1++)
                method540(i_1);
    }

    void method541(int i_1) {
        for (MidiNote midinote_3 = (MidiNote) mus5Sub4_1.deque4.method257(); midinote_3 != null; midinote_3 = (MidiNote) mus5Sub4_1.deque4.method259())
            if ((i_1 < 0 || midinote_3.int376 == i_1) && midinote_3.int383 < 0) {
                midiNoteArrayArray1[midinote_3.int376][midinote_3.int386] = null;
                midinote_3.int383 = 0;
            }

    }

    void method542() {
        method539(-1);
        method540(-1);

        int i_2;
        for (i_2 = 0; i_2 < 16; i_2++)
            intArray81[i_2] = intArray78[i_2];

        for (i_2 = 0; i_2 < 16; i_2++)
            intArray71[i_2] = intArray78[i_2] & ~0x7f;

    }

    void method543(int i_1) {
        if ((intArray75[i_1] & 0x2) != 0)
            for (MidiNote midinote_3 = (MidiNote) mus5Sub4_1.deque4.method257(); midinote_3 != null; midinote_3 = (MidiNote) mus5Sub4_1.deque4.method259())
                if (midinote_3.int376 == i_1 && midiNoteArrayArray1[i_1][midinote_3.int386] == null && midinote_3.int383 < 0)
                    midinote_3.int383 = 0;

    }

    void method544(int i_1) {
        if ((intArray75[i_1] & 0x4) != 0)
            for (MidiNote midinote_3 = (MidiNote) mus5Sub4_1.deque4.method257(); midinote_3 != null; midinote_3 = (MidiNote) mus5Sub4_1.deque4.method259())
                if (midinote_3.int376 == i_1)
                    midinote_3.int389 = 0;

    }

    void method545(int i_1) {
        int i_3 = i_1 & 0xf0;
        int i_4;
        int i_5;
        int i_6;
        if (i_3 == 128) {
            i_4 = i_1 & 0xf;
            i_5 = i_1 >> 8 & 0x7f;
            i_6 = i_1 >> 16 & 0x7f;
            method535(i_4, i_5, i_6);
        } else if (i_3 == 144) {
            i_4 = i_1 & 0xf;
            i_5 = i_1 >> 8 & 0x7f;
            i_6 = i_1 >> 16 & 0x7f;
            if (i_6 > 0)
                method533(i_4, i_5, i_6);
            else
                method535(i_4, i_5, 64);

        } else if (i_3 == 160) {
            i_4 = i_1 & 0xf;
            i_5 = i_1 >> 8 & 0x7f;
            i_6 = i_1 >> 16 & 0x7f;
            method536(i_4, i_5, i_6);
        } else if (i_3 == 176) {
            i_4 = i_1 & 0xf;
            i_5 = i_1 >> 8 & 0x7f;
            i_6 = i_1 >> 16 & 0x7f;
            if (i_5 == 0)
                intArray71[i_4] = (i_6 << 14) + (intArray71[i_4] & ~0x1fc000);

            if (i_5 == 32)
                intArray71[i_4] = (i_6 << 7) + (intArray71[i_4] & ~0x3f80);

            if (i_5 == 1)
                intArray73[i_4] = (intArray73[i_4] & ~0x3f80) + (i_6 << 7);

            if (i_5 == 33)
                intArray73[i_4] = (intArray73[i_4] & ~0x7f) + i_6;

            if (i_5 == 5)
                intArray68[i_4] = (i_6 << 7) + (intArray68[i_4] & ~0x3f80);

            if (i_5 == 37)
                intArray68[i_4] = i_6 + (intArray68[i_4] & ~0x7f);

            if (i_5 == 7)
                intArray67[i_4] = (i_6 << 7) + (intArray67[i_4] & ~0x3f80);

            if (i_5 == 39)
                intArray67[i_4] = i_6 + (intArray67[i_4] & ~0x7f);

            if (i_5 == 10)
                intArray69[i_4] = (i_6 << 7) + (intArray69[i_4] & ~0x3f80);

            if (i_5 == 42)
                intArray69[i_4] = (intArray69[i_4] & ~0x7f) + i_6;

            if (i_5 == 11)
                intArray70[i_4] = (i_6 << 7) + (intArray70[i_4] & ~0x3f80);

            if (i_5 == 43)
                intArray70[i_4] = i_6 + (intArray70[i_4] & ~0x7f);

            if (i_5 == 64)
                if (i_6 >= 64)
                    intArray75[i_4] |= 0x1;
                else
                    intArray75[i_4] &= ~0x1;

            if (i_5 == 65)
                if (i_6 >= 64)
                    intArray75[i_4] |= 0x2;
                else {
                    method543(i_4);
                    intArray75[i_4] &= ~0x2;
                }

            if (i_5 == 99)
                intArray74[i_4] = (intArray74[i_4] & 0x7f) + (i_6 << 7);

            if (i_5 == 98)
                intArray74[i_4] = (intArray74[i_4] & 0x3f80) + i_6;

            if (i_5 == 101)
                intArray74[i_4] = (i_6 << 7) + (intArray74[i_4] & 0x7f) + 16384;

            if (i_5 == 100)
                intArray74[i_4] = 16384 + (intArray74[i_4] & 0x3f80) + i_6;

            if (i_5 == 120)
                method539(i_4);

            if (i_5 == 121)
                method540(i_4);

            if (i_5 == 123)
                method541(i_4);

            int i_7;
            if (i_5 == 6) {
                i_7 = intArray74[i_4];
                if (i_7 == 16384)
                    intArray77[i_4] = (intArray77[i_4] & ~0x3f80) + (i_6 << 7);
            }

            if (i_5 == 38) {
                i_7 = intArray74[i_4];
                if (i_7 == 16384)
                    intArray77[i_4] = (intArray77[i_4] & ~0x7f) + i_6;
            }

            if (i_5 == 16)
                intArray76[i_4] = (intArray76[i_4] & ~0x3f80) + (i_6 << 7);

            if (i_5 == 48)
                intArray76[i_4] = (intArray76[i_4] & ~0x7f) + i_6;

            if (i_5 == 81)
                if (i_6 >= 64)
                    intArray75[i_4] |= 0x4;
                else {
                    method544(i_4);
                    intArray75[i_4] &= ~0x4;
                }

            if (i_5 == 17)
                method546(i_4, (i_6 << 7) + (intArray79[i_4] & ~0x3f80));

            if (i_5 == 49)
                method546(i_4, i_6 + (intArray79[i_4] & ~0x7f));

        } else if (i_3 == 192) {
            i_4 = i_1 & 0xf;
            i_5 = i_1 >> 8 & 0x7f;
            method532(i_4, i_5 + intArray71[i_4]);
        } else if (i_3 == 208) {
            i_4 = i_1 & 0xf;
            i_5 = i_1 >> 8 & 0x7f;
            method537(i_4, i_5);
        } else if (i_3 == 224) {
            i_4 = i_1 & 0xf;
            i_5 = (i_1 >> 8 & 0x7f) + (i_1 >> 9 & 0x3f80);
            method538(i_4, i_5);
        } else {
            i_3 = i_1 & 0xff;
            if (i_3 == 255)
                method542();
        }
    }

    void method546(int i_1, int i_2) {
        intArray79[i_1] = i_2;
        intArray80[i_1] = (int) (2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * i_2) + 0.5D);
    }

    int method547(MidiNote midinote_1) {
        int i_3 = midinote_1.int378 + (midinote_1.int380 * midinote_1.int379 >> 12);
        i_3 += (intArray72[midinote_1.int376] - 8192) * intArray77[midinote_1.int376] >> 12;
        Mus4 mus4_4 = midinote_1.mus4_1;
        int i_5;
        if (mus4_4.int250 > 0 && (mus4_4.int249 > 0 || intArray73[midinote_1.int376] > 0)) {
            i_5 = mus4_4.int249 << 2;
            int i_6 = mus4_4.int251 << 1;
            if (midinote_1.int385 < i_6)
                i_5 = i_5 * midinote_1.int385 / i_6;

            i_5 += intArray73[midinote_1.int376] >> 7;
            double d_7 = Math.sin((midinote_1.int377 & 0x1ff) * 0.01227184630308513D);
            i_3 += (int) (d_7 * i_5);
        }

        i_5 = (int) (midinote_1.musicNote1.int491 * 256 * Math.pow(2.0D, 3.255208333333333E-4D * i_3) / WorldMapTile.staticInt7 + 0.5D);
        return i_5 < 1 ? 1 : i_5;
    }

    int method548(MidiNote midinote_1) {
        Mus4 mus4_3 = midinote_1.mus4_1;
        int i_4 = intArray67[midinote_1.int376] * intArray70[midinote_1.int376] + 4096 >> 13;
        i_4 = 16384 + i_4 * i_4 >> 15;
        i_4 = 16384 + midinote_1.int388 * i_4 >> 15;
        i_4 = i_4 * int507 + 128 >> 8;
        if (mus4_3.int247 > 0)
            i_4 = (int) (i_4 * Math.pow(0.5D, midinote_1.int381 * 1.953125E-5D * mus4_3.int247) + 0.5D);

        int i_5;
        int i_6;
        int i_7;
        int i_8;
        if (mus4_3.byteArray5 != null) {
            i_5 = midinote_1.int382;
            i_6 = mus4_3.byteArray5[midinote_1.int375 + 1];
            if (midinote_1.int375 < mus4_3.byteArray5.length - 2) {
                i_7 = (mus4_3.byteArray5[midinote_1.int375] & 0xff) << 8;
                i_8 = (mus4_3.byteArray5[2 + midinote_1.int375] & 0xff) << 8;
                i_6 += (i_5 - i_7) * (mus4_3.byteArray5[3 + midinote_1.int375] - i_6) / (i_8 - i_7);
            }

            i_4 = 32 + i_6 * i_4 >> 6;
        }

        if (midinote_1.int383 > 0 && mus4_3.byteArray4 != null) {
            i_5 = midinote_1.int383;
            i_6 = mus4_3.byteArray4[midinote_1.int384 + 1];
            if (midinote_1.int384 < mus4_3.byteArray4.length - 2) {
                i_7 = (mus4_3.byteArray4[midinote_1.int384] & 0xff) << 8;
                i_8 = (mus4_3.byteArray4[midinote_1.int384 + 2] & 0xff) << 8;
                i_6 += (i_5 - i_7) * (mus4_3.byteArray4[midinote_1.int384 + 3] - i_6) / (i_8 - i_7);
            }

            i_4 = 32 + i_4 * i_6 >> 6;
        }

        return i_4;
    }

    int method549(MidiNote midinote_1) {
        int i_3 = intArray69[midinote_1.int376];
        return i_3 < 8192 ? 32 + i_3 * midinote_1.int373 >> 6 : 16384 - ((128 - midinote_1.int373) * (16384 - i_3) + 32 >> 6);
    }

    @Override
    protected synchronized Sequence method418() {
        return mus5Sub4_1;
    }

    @Override
    protected synchronized Sequence method416() {
        return null;
    }

    @Override
    protected synchronized int method417() {
        return 0;
    }

    @Override
    protected synchronized void method420(int[] ints_1, int i_2, int i_3) {
        if (midiFile1.method270()) {
            int i_4 = midiFile1.int244 * int508 / WorldMapTile.staticInt7;

            do {
                long long_5 = (long) i_4 * (long) i_3 + long20;
                if (long21 - long_5 >= 0L) {
                    long20 = long_5;
                    break;
                }

                int i_7 = (int) ((i_4 + long21 - long20 - 1L) / i_4);
                long20 += (long) i_4 * (long) i_7;
                mus5Sub4_1.method420(ints_1, i_2, i_7);
                i_2 += i_7;
                i_3 -= i_7;
                method550();
            } while (midiFile1.method270());
        }

        mus5Sub4_1.method420(ints_1, i_2, i_3);
    }

    @Override
    protected synchronized void method419(int i_1) {
        if (midiFile1.method270()) {
            int i_2 = midiFile1.int244 * int508 / WorldMapTile.staticInt7;

            do {
                long long_3 = long20 + (long) i_2 * (long) i_1;
                if (long21 - long_3 >= 0L) {
                    long20 = long_3;
                    break;
                }

                int i_5 = (int) ((long21 - long20 + i_2 - 1L) / i_2);
                long20 += (long) i_2 * (long) i_5;
                mus5Sub4_1.method419(i_5);
                i_1 -= i_5;
                method550();
            } while (midiFile1.method270());
        }

        mus5Sub4_1.method419(i_1);
    }

    void method550() {
        int i_2 = int509;
        int i_3 = int510;

        long long_4;
        for (long_4 = long21; int510 == i_3; long_4 = midiFile1.method279(i_3)) {
            while (i_3 == midiFile1.intArray40[i_2]) {
                midiFile1.method272(i_2);
                int i_6 = midiFile1.method276(i_2);
                if (i_6 == 1) {
                    midiFile1.method274();
                    midiFile1.method273(i_2);
                    if (midiFile1.method281()) {
                        if (!bool51 || i_3 == 0) {
                            method542();
                            midiFile1.method269();
                            return;
                        }

                        midiFile1.method282(long_4);
                    }
                    break;
                }

                if ((i_6 & 0x80) != 0)
                    method545(i_6);

                midiFile1.method275(i_2);
                midiFile1.method273(i_2);
            }

            i_2 = midiFile1.method280();
            i_3 = midiFile1.intArray40[i_2];
        }

        int509 = i_2;
        int510 = i_3;
        long21 = long_4;
    }

    boolean method551(MidiNote midinote_1) {
        if (midinote_1.sampledSound3 == null) {
            if (midinote_1.int383 >= 0) {
                midinote_1.unlink();
                if (midinote_1.int374 > 0 && midinote_1 == midiNoteArrayArray2[midinote_1.int376][midinote_1.int374])
                    midiNoteArrayArray2[midinote_1.int376][midinote_1.int374] = null;
            }

            return true;
        } else
            return false;
    }

    boolean method552(MidiNote midinote_1, int[] ints_2, int i_3, int i_4) {
        midinote_1.int387 = WorldMapTile.staticInt7 / 100;
        if (midinote_1.int383 < 0 || midinote_1.sampledSound3 != null && !midinote_1.sampledSound3.method524()) {
            int i_6 = midinote_1.int380;
            if (i_6 > 0) {
                i_6 -= (int) (16.0D * Math.pow(2.0D, intArray68[midinote_1.int376] * 4.921259842519685E-4D) + 0.5D);
                if (i_6 < 0)
                    i_6 = 0;

                midinote_1.int380 = i_6;
            }

            midinote_1.sampledSound3.synchronizedMethod21(method547(midinote_1));
            Mus4 mus4_7 = midinote_1.mus4_1;
            boolean bool_8 = false;
            ++midinote_1.int385;
            midinote_1.int377 += mus4_7.int250;
            double d_9 = 5.086263020833333E-6D * ((midinote_1.int380 * midinote_1.int379 >> 12) + (midinote_1.int386 - 60 << 8));
            if (mus4_7.int247 > 0)
                if (mus4_7.int248 > 0)
                    midinote_1.int381 += (int) (128.0D * Math.pow(2.0D, d_9 * mus4_7.int248) + 0.5D);
                else
                    midinote_1.int381 += 128;

            if (mus4_7.byteArray5 != null) {
                if (mus4_7.int252 > 0)
                    midinote_1.int382 += (int) (128.0D * Math.pow(2.0D, mus4_7.int252 * d_9) + 0.5D);
                else
                    midinote_1.int382 += 128;

                while (midinote_1.int375 < mus4_7.byteArray5.length - 2 && midinote_1.int382 > (mus4_7.byteArray5[2 + midinote_1.int375] & 0xff) << 8)
                    midinote_1.int375 += 2;

                if (midinote_1.int375 == mus4_7.byteArray5.length - 2 && mus4_7.byteArray5[midinote_1.int375 + 1] == 0)
                    bool_8 = true;
            }

            if (midinote_1.int383 >= 0 && mus4_7.byteArray4 != null && (intArray75[midinote_1.int376] & 0x1) == 0 && (midinote_1.int374 < 0 || midinote_1 != midiNoteArrayArray2[midinote_1.int376][midinote_1.int374])) {
                if (mus4_7.int246 > 0)
                    midinote_1.int383 += (int) (128.0D * Math.pow(2.0D, d_9 * mus4_7.int246) + 0.5D);
                else
                    midinote_1.int383 += 128;

                while (midinote_1.int384 < mus4_7.byteArray4.length - 2 && midinote_1.int383 > (mus4_7.byteArray4[2 + midinote_1.int384] & 0xff) << 8)
                    midinote_1.int384 += 2;

                if (midinote_1.int384 == mus4_7.byteArray4.length - 2)
                    bool_8 = true;
            }

            if (bool_8) {
                midinote_1.sampledSound3.synchronizedMethod20(midinote_1.int387);
                if (ints_2 != null)
                    midinote_1.sampledSound3.method420(ints_2, i_3, i_4);
                else
                    midinote_1.sampledSound3.method419(i_4);

                if (midinote_1.sampledSound3.method525())
                    mus5Sub4_1.sequenceSub1_1.synchronizedMethod8(midinote_1.sampledSound3);

                midinote_1.method492();
                if (midinote_1.int383 >= 0) {
                    midinote_1.unlink();
                    if (midinote_1.int374 > 0 && midinote_1 == midiNoteArrayArray2[midinote_1.int376][midinote_1.int374])
                        midiNoteArrayArray2[midinote_1.int376][midinote_1.int374] = null;
                }

                return true;
            } else {
                midinote_1.sampledSound3.synchronizedMethod19(midinote_1.int387, method548(midinote_1), method549(midinote_1));
                return false;
            }
        } else {
            midinote_1.method492();
            midinote_1.unlink();
            if (midinote_1.int374 > 0 && midinote_1 == midiNoteArrayArray2[midinote_1.int376][midinote_1.int374])
                midiNoteArrayArray2[midinote_1.int376][midinote_1.int374] = null;

            return true;
        }
    }

}

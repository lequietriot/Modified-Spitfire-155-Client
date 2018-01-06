import com.alex.store.Index;

public class CompressedMidi extends Node {

    byte[] midiData;
    static HashTable hashTable4;

    static CompressedMidi staticMethod380(Index staticJs5Index6, int i_1, int i_2) {
        byte[] bytes_3 = staticJs5Index6.getFile(i_1, i_2);
        return bytes_3 == null ? null : new CompressedMidi(new Buffer(bytes_3));
    }

    CompressedMidi(Buffer buffer_1) {
        buffer_1.off = buffer_1.buf.length - 3;
        int i_2 = buffer_1.readUByte();
        int i_3 = buffer_1.readUShort();
        int i_4 = 14 + i_2 * 10;
        buffer_1.off = 0;
        int i_5 = 0;
        int i_6 = 0;
        int i_7 = 0;
        int i_8 = 0;
        int i_9 = 0;
        int i_10 = 0;
        int i_11 = 0;
        int i_12 = 0;

        int i_13;
        int i_14;
        int i_15;
        for (i_13 = 0; i_13 < i_2; i_13++) {
            i_14 = -1;

                i_15 = buffer_1.readUByte();
                if (i_15 != i_14)
                    ++i_4;

                i_14 = i_15 & 0xf;
                if (i_15 == 7)
                    break;

                if (i_15 == 23)
                    ++i_5;
                else if (i_14 == 0)
                    ++i_7;
                else if (i_14 == 1)
                    ++i_8;
                else if (i_14 == 2)
                    ++i_6;
                else if (i_14 == 3)
                    ++i_9;
                else if (i_14 == 4)
                    ++i_10;
                else if (i_14 == 5)
                    ++i_11;
                else {
                    if (i_14 != 6)
                        continue;

                    ++i_12;
                }
            }

        i_4 += i_5 * 5;
        i_4 += (i_7 + i_8 + i_6 + i_9 + i_11) * 2;
        i_4 += i_10 + i_12;
        i_13 = buffer_1.off;
        i_14 = i_2 + i_5 + i_6 + i_7 + i_8 + i_9 + i_10 + i_11 + i_12;

        for (i_15 = 0; i_15 < i_14; i_15++)
            buffer_1.method456();

        i_4 += buffer_1.off - i_13;
        i_15 = buffer_1.off;
        int i_16 = 0;
        int i_17 = 0;
        int i_18 = 0;
        int i_19 = 0;
        int i_20 = 0;
        int i_21 = 0;
        int i_22 = 0;
        int i_23 = 0;
        int i_24 = 0;
        int i_25 = 0;
        int i_26 = 0;
        int i_27 = 0;
        int i_28 = 0;

        int i_29;
        for (i_29 = 0; i_29 < i_6; i_29++) {
            i_28 = i_28 + buffer_1.readUByte() & 0x7f;
            if (i_28 != 0 && i_28 != 32) {
                if (i_28 == 1)
                    ++i_16;
                else if (i_28 == 33)
                    ++i_17;
                else if (i_28 == 7)
                    ++i_18;
                else if (i_28 == 39)
                    ++i_19;
                else if (i_28 == 10)
                    ++i_20;
                else if (i_28 == 42)
                    ++i_21;
                else if (i_28 == 99)
                    ++i_22;
                else if (i_28 == 98)
                    ++i_23;
                else if (i_28 == 101)
                    ++i_24;
                else if (i_28 == 100)
                    ++i_25;
                else if (i_28 != 64 && i_28 != 65 && i_28 != 120 && i_28 != 121 && i_28 != 123)
                    ++i_27;
                else
                    ++i_26;
            } else
                ++i_12;
        }

        i_29 = 0;
        int i_30 = buffer_1.off;
        buffer_1.off += i_26;
        int i_31 = buffer_1.off;
        buffer_1.off += i_11;
        int i_32 = buffer_1.off;
        buffer_1.off += i_10;
        int i_33 = buffer_1.off;
        buffer_1.off += i_9;
        int i_34 = buffer_1.off;
        buffer_1.off += i_16;
        int i_35 = buffer_1.off;
        buffer_1.off += i_18;
        int i_36 = buffer_1.off;
        buffer_1.off += i_20;
        int i_37 = buffer_1.off;
        buffer_1.off += i_7 + i_8 + i_11;
        int i_38 = buffer_1.off;
        buffer_1.off += i_7;
        int i_39 = buffer_1.off;
        buffer_1.off += i_27;
        int i_40 = buffer_1.off;
        buffer_1.off += i_8;
        int i_41 = buffer_1.off;
        buffer_1.off += i_17;
        int i_42 = buffer_1.off;
        buffer_1.off += i_19;
        int i_43 = buffer_1.off;
        buffer_1.off += i_21;
        int i_44 = buffer_1.off;
        buffer_1.off += i_12;
        int i_45 = buffer_1.off;
        buffer_1.off += i_9;
        int i_46 = buffer_1.off;
        buffer_1.off += i_22;
        int i_47 = buffer_1.off;
        buffer_1.off += i_23;
        int i_48 = buffer_1.off;
        buffer_1.off += i_24;
        int i_49 = buffer_1.off;
        buffer_1.off += i_25;
        int i_50 = buffer_1.off;
        buffer_1.off += i_5 * 3;
        midiData = new byte[i_4];
        Buffer buffer_51 = new Buffer(midiData);
        buffer_51.writeInt(1297377380);
        buffer_51.writeInt(6);
        buffer_51.writeShort(i_2 > 1 ? 1 : 0);
        buffer_51.writeShort(i_2);
        buffer_51.writeShort(i_3);
        buffer_1.off = i_13;
        int i_52 = 0;
        int i_53 = 0;
        int i_54 = 0;
        int i_55 = 0;
        int i_56 = 0;
        int i_57 = 0;
        int i_58 = 0;
        int[] ints_59 = new int[128];
        i_28 = 0;

        label219: for (int i_60 = 0; i_60 < i_2; i_60++) {
            buffer_51.writeInt(1297379947);
            buffer_51.off += 4;
            int i_61 = buffer_51.off;
            int i_62 = -1;

            while (true) {
                    int i_63 = buffer_1.method456();
                    buffer_51.method438(i_63);
                    int i_64 = buffer_1.buf[i_29++] & 0xff;
                    i_62 = i_64 & 0xf;
                    if (i_64 == 7) {
                    	
                            buffer_51.writeByte(255);

                        buffer_51.writeByte(47);
                        buffer_51.writeByte(0);
                        buffer_51.method434(buffer_51.off - i_61);
                        continue label219;
                    }

                    if (i_64 == 23) {
                    	
                            buffer_51.writeByte(255);

                        buffer_51.writeByte(81);
                        buffer_51.writeByte(3);
                        buffer_51.writeByte(buffer_1.buf[i_50++]);
                        buffer_51.writeByte(buffer_1.buf[i_50++]);
                        buffer_51.writeByte(buffer_1.buf[i_50++]);
                    } else {
                        i_52 ^= i_64 >> 4;
                        if (i_62 == 0) {

                                buffer_51.writeByte(i_52 + 144);

                            i_53 += buffer_1.buf[i_37++];
                            i_54 += buffer_1.buf[i_38++];
                            buffer_51.writeByte(i_53 & 0x7f);
                            buffer_51.writeByte(i_54 & 0x7f);
                        } else if (i_62 == 1) {

                                buffer_51.writeByte(i_52 + 128);

                            i_53 += buffer_1.buf[i_37++];
                            i_55 += buffer_1.buf[i_40++];
                            buffer_51.writeByte(i_53 & 0x7f);
                            buffer_51.writeByte(i_55 & 0x7f);
                        } else if (i_62 == 2) {

                                buffer_51.writeByte(i_52 + 176);

                            i_28 = i_28 + buffer_1.buf[i_15++] & 0x7f;
                            buffer_51.writeByte(i_28);
                            byte b_66;
                            if (i_28 != 0 && i_28 != 32) {
                                if (i_28 == 1)
                                    b_66 = buffer_1.buf[i_34++];
                                else if (i_28 == 33)
                                    b_66 = buffer_1.buf[i_41++];
                                else if (i_28 == 7)
                                    b_66 = buffer_1.buf[i_35++];
                                else if (i_28 == 39)
                                    b_66 = buffer_1.buf[i_42++];
                                else if (i_28 == 10)
                                    b_66 = buffer_1.buf[i_36++];
                                else if (i_28 == 42)
                                    b_66 = buffer_1.buf[i_43++];
                                else if (i_28 == 99)
                                    b_66 = buffer_1.buf[i_46++];
                                else if (i_28 == 98)
                                    b_66 = buffer_1.buf[i_47++];
                                else if (i_28 == 101)
                                    b_66 = buffer_1.buf[i_48++];
                                else if (i_28 == 100)
                                    b_66 = buffer_1.buf[i_49++];
                                else if (i_28 != 64 && i_28 != 65 && i_28 != 120 && i_28 != 121 && i_28 != 123)
                                    b_66 = buffer_1.buf[i_39++];
                                else
                                    b_66 = buffer_1.buf[i_30++];
                            } else
                                b_66 = buffer_1.buf[i_44++];

                            int i_67 = b_66 + ints_59[i_28];
                            ints_59[i_28] = i_67;
                            buffer_51.writeByte(i_67 & 0x7f);
                        } else if (i_62 == 3) {

                                buffer_51.writeByte(i_52 + 224);

                            i_56 += buffer_1.buf[i_45++];
                            i_56 += buffer_1.buf[i_33++] << 7;
                            buffer_51.writeByte(i_56 & 0x7f);
                            buffer_51.writeByte(i_56 >> 7 & 0x7f);
                        } else if (i_62 == 4) {
                        	
                                buffer_51.writeByte(i_52 + 208);

                            i_57 += buffer_1.buf[i_32++];
                            buffer_51.writeByte(i_57 & 0x7f);
                        } else if (i_62 == 5) {

                                buffer_51.writeByte(i_52 + 160);

                            i_53 += buffer_1.buf[i_37++];
                            i_58 += buffer_1.buf[i_31++];
                            buffer_51.writeByte(i_53 & 0x7f);
                            buffer_51.writeByte(i_58 & 0x7f);
                        } else {
                            if (i_62 != 6)
                                continue;

                                buffer_51.writeByte(i_52 + 192);

                            buffer_51.writeByte(buffer_1.buf[i_44++]);
                        }
                    }
                }
        }

    }

    void method493() {
        if (hashTable4 == null) {
            hashTable4 = new HashTable(16);
            int[] ints_1 = new int[16];
            int[] ints_2 = new int[16];
            ints_2[9] = 128;
            ints_1[9] = 128;
            MidiFile midifile_4 = new MidiFile(midiData);
            int i_5 = midifile_4.method271();

            int i_6;
            for (i_6 = 0; i_6 < i_5; i_6++) {
                midifile_4.method272(i_6);
                midifile_4.method275(i_6);
                midifile_4.method273(i_6);
            }

            label52: do
                while (true) {
                    i_6 = midifile_4.method280();
                    int i_7 = midifile_4.intArray40[i_6];

                    while (midifile_4.intArray40[i_6] == i_7) {
                        midifile_4.method272(i_6);
                        int i_8 = midifile_4.method276(i_6);
                        if (i_8 == 1) {
                            midifile_4.method274();
                            midifile_4.method273(i_6);
                            continue label52;
                        }

                        int i_9 = i_8 & 0xf0;
                        int i_10;
                        int i_11;
                        int i_12;
                        if (i_9 == 176) {
                            i_10 = i_8 & 0xf;
                            i_11 = i_8 >> 8 & 0x7f;
                            i_12 = i_8 >> 16 & 0x7f;
                            if (i_11 == 0)
                                ints_1[i_10] = (ints_1[i_10] & ~0x1fc000) + (i_12 << 14);

                            if (i_11 == 32)
                                ints_1[i_10] = (ints_1[i_10] & ~0x3f80) + (i_12 << 7);
                        }

                        if (i_9 == 192) {
                            i_10 = i_8 & 0xf;
                            i_11 = i_8 >> 8 & 0x7f;
                            ints_2[i_10] = ints_1[i_10] + i_11;
                        }

                        if (i_9 == 144) {
                            i_10 = i_8 & 0xf;
                            i_11 = i_8 >> 8 & 0x7f;
                            i_12 = i_8 >> 16 & 0x7f;
                            if (i_12 > 0) {
                                int i_13 = ints_2[i_10];
                                MidiInstrument midiinstrument_14 = (MidiInstrument) hashTable4.get(i_13);
                                if (midiinstrument_14 == null) {
                                    midiinstrument_14 = new MidiInstrument(new byte[128]);
                                    hashTable4.put(midiinstrument_14, i_13);
                                }

                                midiinstrument_14.byteArray10[i_11] = 1;
                            }
                        }

                        midifile_4.method275(i_6);
                        midifile_4.method273(i_6);
                    }
                }
            while (!midifile_4.method281());

        }
    }

    void method494() {
        hashTable4 = null;
    }

}

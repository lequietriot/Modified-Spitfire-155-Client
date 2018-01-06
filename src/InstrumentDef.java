import java.io.IOException;

import com.alex.store.Index;

public class InstrumentDef extends Node {

    static MusicNote[] musicNoteArray1 = new MusicNote[128];
    short[] shortArray1 = new short[128];
    byte[] byteArray8 = new byte[128];
    byte[] byteArray9 = new byte[128];
    Mus4[] mus4Array1 = new Mus4[128];
    byte[] byteArray7 = new byte[128];
    static int[] intArray50 = new int[128];
    int int372;

    static InstrumentDef staticMethod379(Index staticJs5Index4, int i_1) {
        byte[] bytes_3 = staticJs5Index4.getFile(i_1);
        return bytes_3 == null ? null : new InstrumentDef(bytes_3);
    }

    InstrumentDef(byte[] bytes_1) {
        Buffer buffer_2 = new Buffer(bytes_1);

        int i_3;
        for (i_3 = 0; buffer_2.buf[buffer_2.off + i_3] != 0; i_3++)
            ;

        byte[] bytes_4 = new byte[i_3];

        int i_5;
        for (i_5 = 0; i_5 < i_3; i_5++)
            bytes_4[i_5] = buffer_2.method440();

        ++buffer_2.off;
        ++i_3;
        i_5 = buffer_2.off;
        buffer_2.off += i_3;

        int i_6;
        for (i_6 = 0; buffer_2.buf[i_6 + buffer_2.off] != 0; i_6++)
            ;

        byte[] bytes_7 = new byte[i_6];

        int i_8;
        for (i_8 = 0; i_8 < i_6; i_8++)
            bytes_7[i_8] = buffer_2.method440();

        ++buffer_2.off;
        ++i_6;
        i_8 = buffer_2.off;
        buffer_2.off += i_6;

        int i_9;
        for (i_9 = 0; buffer_2.buf[i_9 + buffer_2.off] != 0; i_9++)
            ;

        byte[] bytes_10 = new byte[i_9];

        for (int i_11 = 0; i_11 < i_9; i_11++)
            bytes_10[i_11] = buffer_2.method440();

        ++buffer_2.off;
        ++i_9;
        byte[] bytes_36 = new byte[i_9];
        int i_12;
        int i_14;
        if (i_9 > 1) {
            bytes_36[1] = 1;
            int i_13 = 1;
            i_12 = 2;

            for (i_14 = 2; i_14 < i_9; i_14++) {
                int i_15 = buffer_2.readUByte();
                if (i_15 == 0)
                    i_13 = i_12++;
                else {
                    if (i_15 <= i_13)
                        --i_15;

                    i_13 = i_15;
                }

                bytes_36[i_14] = (byte) i_13;
            }
        } else
            i_12 = i_9;

        Mus4[] arr_37 = new Mus4[i_12];

        Mus4 mus4_38;
        for (i_14 = 0; i_14 < arr_37.length; i_14++) {
            mus4_38 = arr_37[i_14] = new Mus4();
            int i_16 = buffer_2.readUByte();
            if (i_16 > 0)
                mus4_38.byteArray5 = new byte[i_16 * 2];

            i_16 = buffer_2.readUByte();
            if (i_16 > 0) {
                mus4_38.byteArray4 = new byte[i_16 * 2 + 2];
                mus4_38.byteArray4[1] = 64;
            }
        }

        i_14 = buffer_2.readUByte();
        byte[] bytes_39 = i_14 > 0 ? new byte[i_14 * 2] : null;
        i_14 = buffer_2.readUByte();
        byte[] bytes_40 = i_14 > 0 ? new byte[i_14 * 2] : null;

        int i_17;
        for (i_17 = 0; buffer_2.buf[i_17 + buffer_2.off] != 0; i_17++)
            ;

        byte[] bytes_18 = new byte[i_17];

        int i_19;
        for (i_19 = 0; i_19 < i_17; i_19++)
            bytes_18[i_19] = buffer_2.method440();

        ++buffer_2.off;
        ++i_17;
        i_19 = 0;

        int i_20;
        for (i_20 = 0; i_20 < 128; i_20++) {
            i_19 += buffer_2.readUByte();
            shortArray1[i_20] = (short) i_19;
        }

        i_19 = 0;

        for (i_20 = 0; i_20 < 128; i_20++) {
            i_19 += buffer_2.readUByte();
            shortArray1[i_20] = (short) (shortArray1[i_20] + (i_19 << 8));
        }

        i_20 = 0;
        int i_21 = 0;
        int i_22 = 0;

        int i_23;
        for (i_23 = 0; i_23 < 128; i_23++) {
            if (i_20 == 0) {
                if (i_21 < bytes_18.length)
                    i_20 = bytes_18[i_21++];
                else
                    i_20 = -1;

                i_22 = buffer_2.method456();
            }

            shortArray1[i_23] = (short) (shortArray1[i_23] + ((i_22 - 1 & 0x2) << 14));
            intArray50[i_23] = i_22;
            --i_20;
        }

        i_20 = 0;
        i_21 = 0;
        i_23 = 0;

        int i_24;
        for (i_24 = 0; i_24 < 128; i_24++)
            if (intArray50[i_24] != 0) {
                if (i_20 == 0) {
                    if (i_21 < bytes_4.length)
                        i_20 = bytes_4[i_21++];
                    else
                        i_20 = -1;

                    i_23 = buffer_2.buf[i_5++] - 1;
                }

                byteArray7[i_24] = (byte) i_23;
                --i_20;
            }

        i_20 = 0;
        i_21 = 0;
        i_24 = 0;

        for (int i_25 = 0; i_25 < 128; i_25++)
            if (intArray50[i_25] != 0) {
                if (i_20 == 0) {
                    if (i_21 < bytes_7.length)
                        i_20 = bytes_7[i_21++];
                    else
                        i_20 = -1;

                    i_24 = buffer_2.buf[i_8++] + 16 << 2;
                }

                byteArray9[i_25] = (byte) i_24;
                --i_20;
            }

        i_20 = 0;
        i_21 = 0;
        Mus4 mus4_42 = null;

        int i_26;
        for (i_26 = 0; i_26 < 128; i_26++)
            if (intArray50[i_26] != 0) {
                if (i_20 == 0) {
                    mus4_42 = arr_37[bytes_36[i_21]];
                    if (i_21 < bytes_10.length)
                        i_20 = bytes_10[i_21++];
                    else
                        i_20 = -1;
                }

                mus4Array1[i_26] = mus4_42;
                --i_20;
            }

        i_20 = 0;
        i_21 = 0;
        i_26 = 0;

        int i_27;
        for (i_27 = 0; i_27 < 128; i_27++) {
            if (i_20 == 0) {
                if (i_21 < bytes_18.length)
                    i_20 = bytes_18[i_21++];
                else
                    i_20 = -1;

                if (intArray50[i_27] > 0)
                    i_26 = buffer_2.readUByte() + 1;
            }

            byteArray8[i_27] = (byte) i_26;
            --i_20;
        }

        int372 = buffer_2.readUByte() + 1;

        Mus4 mus4_28;
        int i_29;
        for (i_27 = 0; i_27 < i_12; i_27++) {
            mus4_28 = arr_37[i_27];
            if (mus4_28.byteArray5 != null)
                for (i_29 = 1; i_29 < mus4_28.byteArray5.length; i_29 += 2)
                    mus4_28.byteArray5[i_29] = buffer_2.method440();

            if (mus4_28.byteArray4 != null)
                for (i_29 = 3; i_29 < mus4_28.byteArray4.length - 2; i_29 += 2)
                    mus4_28.byteArray4[i_29] = buffer_2.method440();
        }

        if (bytes_39 != null)
            for (i_27 = 1; i_27 < bytes_39.length; i_27 += 2)
                bytes_39[i_27] = buffer_2.method440();

        if (bytes_40 != null)
            for (i_27 = 1; i_27 < bytes_40.length; i_27 += 2)
                bytes_40[i_27] = buffer_2.method440();

        for (i_27 = 0; i_27 < i_12; i_27++) {
            mus4_28 = arr_37[i_27];
            if (mus4_28.byteArray4 != null) {
                i_19 = 0;

                for (i_29 = 2; i_29 < mus4_28.byteArray4.length; i_29 += 2) {
                    i_19 = i_19 + 1 + buffer_2.readUByte();
                    mus4_28.byteArray4[i_29] = (byte) i_19;
                }
            }
        }

        for (i_27 = 0; i_27 < i_12; i_27++) {
            mus4_28 = arr_37[i_27];
            if (mus4_28.byteArray5 != null) {
                i_19 = 0;

                for (i_29 = 2; i_29 < mus4_28.byteArray5.length; i_29 += 2) {
                    i_19 = i_19 + 1 + buffer_2.readUByte();
                    mus4_28.byteArray5[i_29] = (byte) i_19;
                }
            }
        }

        byte b_30;
        int i_32;
        int i_33;
        int i_34;
        int i_45;
        byte b_47;
        if (bytes_39 != null) {
            i_19 = buffer_2.readUByte();
            bytes_39[0] = (byte) i_19;

            for (i_27 = 2; i_27 < bytes_39.length; i_27 += 2) {
                i_19 = i_19 + 1 + buffer_2.readUByte();
                bytes_39[i_27] = (byte) i_19;
            }

            b_47 = bytes_39[0];
            byte b_43 = bytes_39[1];

            for (i_29 = 0; i_29 < b_47; i_29++)
                byteArray8[i_29] = (byte) (byteArray8[i_29] * b_43 + 32 >> 6);

            for (i_29 = 2; i_29 < bytes_39.length; i_29 += 2) {
                b_30 = bytes_39[i_29];
                byte b_31 = bytes_39[i_29 + 1];
                i_32 = (b_30 - b_47) / 2 + (b_30 - b_47) * b_43;

                for (i_33 = b_47; i_33 < b_30; i_33++) {
                    i_34 = StaticClass25.staticMethod152(i_32, b_30 - b_47);
                    byteArray8[i_33] = (byte) (32 + i_34 * byteArray8[i_33] >> 6);
                    i_32 += b_31 - b_43;
                }

                b_47 = b_30;
                b_43 = b_31;
            }

            for (i_45 = b_47; i_45 < 128; i_45++)
                byteArray8[i_45] = (byte) (32 + b_43 * byteArray8[i_45] >> 6);

            mus4_38 = null;
        }

        if (bytes_40 != null) {
            i_19 = buffer_2.readUByte();
            bytes_40[0] = (byte) i_19;

            for (i_27 = 2; i_27 < bytes_40.length; i_27 += 2) {
                i_19 = i_19 + 1 + buffer_2.readUByte();
                bytes_40[i_27] = (byte) i_19;
            }

            b_47 = bytes_40[0];
            int i_44 = bytes_40[1] << 1;

            for (i_29 = 0; i_29 < b_47; i_29++) {
                i_45 = (byteArray9[i_29] & 0xff) + i_44;
                if (i_45 < 0)
                    i_45 = 0;

                if (i_45 > 128)
                    i_45 = 128;

                byteArray9[i_29] = (byte) i_45;
            }

            int i_46;
            for (i_29 = 2; i_29 < bytes_40.length; i_29 += 2) {
                b_30 = bytes_40[i_29];
                i_46 = bytes_40[i_29 + 1] << 1;
                i_32 = i_44 * (b_30 - b_47) + (b_30 - b_47) / 2;

                for (i_33 = b_47; i_33 < b_30; i_33++) {
                    i_34 = StaticClass25.staticMethod152(i_32, b_30 - b_47);
                    int i_35 = i_34 + (byteArray9[i_33] & 0xff);
                    if (i_35 < 0)
                        i_35 = 0;

                    if (i_35 > 128)
                        i_35 = 128;

                    byteArray9[i_33] = (byte) i_35;
                    i_32 += i_46 - i_44;
                }

                b_47 = b_30;
                i_44 = i_46;
            }

            for (i_45 = b_47; i_45 < 128; i_45++) {
                i_46 = (byteArray9[i_45] & 0xff) + i_44;
                if (i_46 < 0)
                    i_46 = 0;

                if (i_46 > 128)
                    i_46 = 128;

                byteArray9[i_45] = (byte) i_46;
            }

            Object obj_41 = null;
        }

        for (i_27 = 0; i_27 < i_12; i_27++)
            arr_37[i_27].int247 = buffer_2.readUByte();

        for (i_27 = 0; i_27 < i_12; i_27++) {
            mus4_28 = arr_37[i_27];
            if (mus4_28.byteArray5 != null)
                mus4_28.int252 = buffer_2.readUByte();

            if (mus4_28.byteArray4 != null)
                mus4_28.int246 = buffer_2.readUByte();

            if (mus4_28.int247 > 0)
                mus4_28.int248 = buffer_2.readUByte();
        }

        for (i_27 = 0; i_27 < i_12; i_27++)
            arr_37[i_27].int250 = buffer_2.readUByte();

        for (i_27 = 0; i_27 < i_12; i_27++) {
            mus4_28 = arr_37[i_27];
            if (mus4_28.int250 > 0)
                mus4_28.int249 = buffer_2.readUByte();
        }

        for (i_27 = 0; i_27 < i_12; i_27++) {
            mus4_28 = arr_37[i_27];
            if (mus4_28.int249 > 0)
                mus4_28.int251 = buffer_2.readUByte();
        }
    }

    static boolean method490(SoundBank soundbank_1, byte[] bytes_2, int[] ints_3) throws IOException {
        boolean bool_5 = true;
        int i_6 = 0;
        MusicNote musicnote_7 = null;

        for (int i_8 = 0; i_8 < 128; i_8++)
            if (bytes_2 == null || bytes_2[i_8] != 0) {
                int i_9 = intArray50[i_8];
                if (i_9 != 0) {
                    if (i_9 != i_6) {
                        i_6 = i_9--;
                        if ((i_9 & 0x1) == 0) {
                            musicnote_7 = soundbank_1.method158(i_9 >> 2, ints_3);
                 	   	   System.out.print(i_8 + " "); 
                 	   	   }
                        else {
                            musicnote_7 = soundbank_1.method159(i_9 >> 2, ints_3);
                        	   System.out.print(i_8 + " ");
                        }

                        if (musicnote_7 == null)
                            bool_5 = false;
                    }

                    if (musicnote_7 != null) {
                        musicNoteArray1[i_8] = musicnote_7;
                        intArray50[i_8] = 0;
                    }
            }
            }
        return bool_5;
    }

    void method491() {
        intArray50 = null;
    }

}

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import com.alex.store.Index;

public class SoundEffect {

    AudioInstrument[] audioInstrumentArray1 = new AudioInstrument[10];
    int int92;
    int int93;

    public static SoundEffect staticMethod44(Index js5index_0, int i_1, int i_2) {
        byte[] bytes_3 = js5index_0.getFile(i_1, i_2);
        System.out.println("Sound 1 (SampleID_NoteID): " + i_1 + "_");
        return bytes_3 == null ? null : new SoundEffect(new Buffer(bytes_3));
    }

    SoundEffect(Buffer buffer_1) {
        for (int i_2 = 0; i_2 < 10; i_2++) {
            int i_3 = buffer_1.readUByte();
            if (i_3 != 0) {
                --buffer_1.off;
                audioInstrumentArray1[i_2] = new AudioInstrument();
                audioInstrumentArray1[i_2].method175(buffer_1);
            }
        }

        int92 = buffer_1.readUShort();
        int93 = buffer_1.readUShort();
    }

    public MusicNote method129() throws IOException {
        byte[] bytes_1 = method131();
        return new MusicNote(22050, bytes_1, int92 * 22050 / 1000, int93 * 22050 / 1000);
    }

    public final int method130() {
        int i_1 = 9999999;

        int i_2;
        for (i_2 = 0; i_2 < 10; i_2++)
            if (audioInstrumentArray1[i_2] != null && audioInstrumentArray1[i_2].int148 / 20 < i_1)
                i_1 = audioInstrumentArray1[i_2].int148 / 20;

        if (int92 < int93 && int92 / 20 < i_1)
            i_1 = int92 / 20;

        if (i_1 != 9999999 && i_1 != 0) {
            for (i_2 = 0; i_2 < 10; i_2++)
                if (audioInstrumentArray1[i_2] != null)
                    audioInstrumentArray1[i_2].int148 -= i_1 * 20;

            if (int92 < int93) {
                int92 -= i_1 * 20;
                int93 -= i_1 * 20;
            }

            return i_1;
        } else
            return 0;
    }

    final byte[] method131() throws IOException {
        int i_1 = 0;

        int i_2;
        for (i_2 = 0; i_2 < 10; i_2++)
            if (audioInstrumentArray1[i_2] != null && audioInstrumentArray1[i_2].int147 + audioInstrumentArray1[i_2].int148 > i_1)
                i_1 = audioInstrumentArray1[i_2].int147 + audioInstrumentArray1[i_2].int148;

        if (i_1 == 0)
            return new byte[0];
        else {
            i_2 = i_1 * 22050 / 1000;
            byte[] bytes_3 = new byte[i_2];

            for (int i_4 = 0; i_4 < 10; i_4++)
                if (audioInstrumentArray1[i_4] != null) {
                    int i_5 = audioInstrumentArray1[i_4].int147 * 22050 / 1000;
                    int i_6 = audioInstrumentArray1[i_4].int148 * 22050 / 1000;
                    int[] ints_7 = audioInstrumentArray1[i_4].method173(i_5, audioInstrumentArray1[i_4].int147);

                    for (int i_8 = 0; i_8 < i_5; i_8++) {
                        int i_9 = bytes_3[i_8 + i_6] + (ints_7[i_8] >> 8);
                        if ((i_9 + 128 & ~0xff) != 0)
                            i_9 = i_9 >> 31 ^ 0x7f;

                        bytes_3[i_8 + i_6] = (byte) i_9;
                    }
                }
            return bytes_3;
        }
    }

}

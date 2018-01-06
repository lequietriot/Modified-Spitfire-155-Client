import java.io.IOException;

import com.alex.store.Index;

public class SoundBank {

    static boolean staticBool11;
    static MouseCapturer staticMouseCapturer1;
    static int staticInt74;
    public static String staticString22;
    HashTable hashTable2 = new HashTable(256);
    HashTable hashTable3 = new HashTable(256);
    Index sfx;
    Index sfx1;

    public SoundBank(Index js5index_1, Index js5index_2) {
        sfx = js5index_1;
        sfx1 = js5index_2;
    }

    MusicNote method156(int i_1, int i_2, int[] ints_3) throws IOException {
        int i_5 = i_2 ^ (i_1 << 4 & 0xffff | i_1 >>> 12);
        i_5 |= i_1 << 16;
        long long_6 = i_5;
        MusicNote musicnote_8 = (MusicNote) hashTable3.get(long_6);
        if (musicnote_8 != null)
            return musicnote_8;
        else if (ints_3 != null && ints_3[0] <= 0)
            return null;
        else {
            SoundEffect soundeffect_9 = SoundEffect.staticMethod44(sfx, i_1, i_2);
            if (soundeffect_9 == null)
                return null;
            else {
                musicnote_8 = soundeffect_9.method129();
                hashTable3.put(musicnote_8, long_6);
                if (ints_3 != null)
                    ints_3[0] -= musicnote_8.byteArray11.length;

                return musicnote_8;
            }
        }
    }

    MusicNote method157(int i_1, int i_2, int[] ints_3) throws IOException {
        int i_5 = i_2 ^ (i_1 << 4 & 0xffff | i_1 >>> 12);
        i_5 |= i_1 << 16;
        long long_6 = i_5 ^ 0x100000000L;
        MusicNote musicnote_8 = (MusicNote) hashTable3.get(long_6);
        if (musicnote_8 != null)
            return musicnote_8;
        else if (ints_3 != null && ints_3[0] <= 0)
            return null;
        else {
            Sfx1 sfx1_9 = (Sfx1) hashTable2.get(long_6);
            if (sfx1_9 == null) {
                sfx1_9 = Sfx1.staticMethod375(sfx1, i_1, i_2);
                if (sfx1_9 == null)
                    return null;

                hashTable2.put(sfx1_9, long_6);
            }

            musicnote_8 = sfx1_9.method425(ints_3);
            if (musicnote_8 == null)
                return null;
            else {
                sfx1_9.unlink();
                hashTable3.put(musicnote_8, long_6);
                return musicnote_8;
            }
        }
    }

    public MusicNote method158(int i_1, int[] ints_2) throws IOException {
        if (sfx.getValidArchivesCount() == 1)
            return method156(0, i_1, ints_2);
        else if (sfx.getValidFilesCount(i_1) == 1)
            return method156(i_1, 0, ints_2);
        else
            throw new RuntimeException();
    }

    public MusicNote method159(int i_1, int[] ints_2) throws IOException {
        if (sfx1.getValidArchivesCount() == 1)
            return method157(0, i_1, ints_2);
        else if (sfx1.getValidFilesCount(i_1) == 1)
            return method157(i_1, 0, ints_2);
        else
            throw new RuntimeException();
    }

}

public class MusicNote extends Mus10 {

    public int int491;
    public byte[] byteArray11;
    public int int492;
    int int490;
    public boolean bool49;

    MusicNote(int i_1, byte[] bytes_2, int i_3, int i_4) {
        int491 = i_1;
        byteArray11 = bytes_2;
        int492 = i_3;
        int490 = i_4;
    }

    MusicNote(int i_1, byte[] bytes_2, int i_3, int i_4, boolean bool_5) {
        int491 = i_1;
        byteArray11 = bytes_2;
        int492 = i_3;
        int490 = i_4;
        bool49 = bool_5;
    }

    public MusicNote method521(Mus9 mus9_1) {
        byteArray11 = mus9_1.method179(byteArray11);
        int491 = mus9_1.method180(int491);
        if (int492 == int490)
            int492 = int490 = mus9_1.method181(int492);
        else {
            int492 = mus9_1.method181(int492);
            int490 = mus9_1.method181(int490);
            if (int492 == int490)
                --int492;
        }

        return this;
    }

}

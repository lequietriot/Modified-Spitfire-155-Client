public class TextureLoader implements Interface2 {

    static IndexedSprite staticIndexedSprite8;
    public static short[] staticShortArray2;
    Deque deque1 = new Deque();
    int int126 = 0;
    double double1 = 1.0D;
    int int125 = 128;
    Js5Index js5Index1;
    int int124;
    Texture[] textures;

    public TextureLoader(Js5Index js5index_1, Js5Index js5index_2, int i_3, double d_4, int i_6) {
        js5Index1 = js5index_2;
        int124 = i_3;
        int126 = int124;
        double1 = d_4;
        int125 = i_6;
        int[] ints_7 = js5index_1.getFileIds(0);
        int i_8 = ints_7.length;
        textures = new Texture[js5index_1.numFiles(0)];

        for (int i_9 = 0; i_9 < i_8; i_9++) {
            Buffer buffer_10 = new Buffer(js5index_1.getFile(0, ints_7[i_9]));
            textures[ints_7[i_9]] = new Texture(buffer_10);
        }

    }

    public void method149(double d_1) {
        double1 = d_1;
        method154();
    }

    @Override
    public int[] method150(int i_1) {
        Texture texture_3 = textures[i_1];
        if (texture_3 != null) {
            if (texture_3.intArray45 != null) {
                deque1.method254(texture_3);
                texture_3.bool28 = true;
                return texture_3.intArray45;
            }

            boolean bool_4 = texture_3.method426(double1, int125, js5Index1);
            if (bool_4) {
                if (int126 == 0) {
                    Texture texture_5 = (Texture) deque1.method256();
                    texture_5.method427();
                } else
                    --int126;

                deque1.method254(texture_3);
                texture_3.bool28 = true;
                return texture_3.intArray45;
            }
        }

        return null;
    }

    @Override
    public int method151(int i_1) {
        return textures[i_1] != null ? textures[i_1].int355 : 0;
    }

    @Override
    public boolean method152(int i_1) {
        return textures[i_1].bool27;
    }

    @Override
    public boolean method153(int i_1) {
        return int125 == 64;
    }

    public void method154() {
        for (int i_2 = 0; i_2 < textures.length; i_2++)
            if (textures[i_2] != null)
                textures[i_2].method427();

        deque1 = new Deque();
        int126 = int124;
    }

    public void method155(int i_1) {
        for (int i_3 = 0; i_3 < textures.length; i_3++) {
            Texture texture_4 = textures[i_3];
            if (texture_4 != null && texture_4.int356 != 0 && texture_4.bool28) {
                texture_4.method428(i_1);
                texture_4.bool28 = false;
            }
        }

    }

}

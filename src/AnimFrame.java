public class AnimFrame extends Cacheable {

    public static int staticInt306;
    DataClass5[] dataClass5Array1;

    public static AnimFrame staticMethod409(Js5Index js5index_0, Js5Index js5index_1, int i_2, boolean bool_3) {
        boolean bool_5 = true;
        int[] ints_6 = js5index_0.getFileIds(i_2);

        for (int i_7 = 0; i_7 < ints_6.length; i_7++) {
            byte[] bytes_8 = js5index_0.getFile2(i_2, ints_6[i_7]);
            if (bytes_8 == null)
                bool_5 = false;
            else {
                int i_9 = (bytes_8[0] & 0xff) << 8 | bytes_8[1] & 0xff;
                byte[] bytes_10;
                if (bool_3)
                    bytes_10 = js5index_1.getFile2(0, i_9);
                else
                    bytes_10 = js5index_1.getFile2(i_9, 0);

                if (bytes_10 == null)
                    bool_5 = false;
            }
        }

        if (!bool_5)
            return null;
        else
            try {
                return new AnimFrame(js5index_0, js5index_1, i_2, bool_3);
            } catch (Exception exception_11) {
                return null;
            }
    }

    AnimFrame(Js5Index js5index_1, Js5Index js5index_2, int i_3, boolean bool_4) {
        Deque deque_5 = new Deque();
        int i_6 = js5index_1.numFiles(i_3);
        dataClass5Array1 = new DataClass5[i_6];
        int[] ints_7 = js5index_1.getFileIds(i_3);

        for (int i_8 = 0; i_8 < ints_7.length; i_8++) {
            byte[] bytes_9 = js5index_1.getFile(i_3, ints_7[i_8]);
            AnimTransform animtransform_10 = null;
            int i_11 = (bytes_9[0] & 0xff) << 8 | bytes_9[1] & 0xff;

            for (AnimTransform animtransform_12 = (AnimTransform) deque_5.method257(); animtransform_12 != null; animtransform_12 = (AnimTransform) deque_5.method259())
                if (animtransform_12.int367 == i_11) {
                    animtransform_10 = animtransform_12;
                    break;
                }

            if (animtransform_10 == null) {
                byte[] bytes_13;
                if (bool_4)
                    bytes_13 = js5index_2.getFile2(0, i_11);
                else
                    bytes_13 = js5index_2.getFile2(i_11, 0);

                animtransform_10 = new AnimTransform(i_11, bytes_13);
                deque_5.method253(animtransform_10);
            }

            dataClass5Array1[ints_7[i_8]] = new DataClass5(bytes_9, animtransform_10);
        }

    }

    public boolean method529(int i_1) {
        return dataClass5Array1[i_1].bool15;
    }

}

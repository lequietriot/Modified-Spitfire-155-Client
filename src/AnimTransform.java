public class AnimTransform extends Node {

    static int staticInt303;
    public static Js5Index staticJs5Index7;
    int int367;
    int int366;
    int[] intArray49;
    int[][] intArrayArray11;

    AnimTransform(int i_1, byte[] bytes_2) {
        int367 = i_1;
        Buffer buffer_3 = new Buffer(bytes_2);
        int366 = buffer_3.readUByte();
        intArray49 = new int[int366];
        intArrayArray11 = new int[int366][];

        int i_4;
        for (i_4 = 0; i_4 < int366; i_4++)
            intArray49[i_4] = buffer_3.readUByte();

        for (i_4 = 0; i_4 < int366; i_4++)
            intArrayArray11[i_4] = new int[buffer_3.readUByte()];

        for (i_4 = 0; i_4 < int366; i_4++)
            for (int i_5 = 0; i_5 < intArrayArray11[i_4].length; i_5++)
                intArrayArray11[i_4][i_5] = buffer_3.readUByte();

    }

}

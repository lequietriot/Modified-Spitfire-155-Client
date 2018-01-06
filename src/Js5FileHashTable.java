public class Js5FileHashTable {

    int[] buckets;

    public Js5FileHashTable(int[] ints_1) {
        int i_2;
        for (i_2 = 1; i_2 <= ints_1.length + (ints_1.length >> 1); i_2 <<= 1)
            ;

        buckets = new int[i_2 + i_2];

        int i_3;
        for (i_3 = 0; i_3 < i_2 + i_2; i_3++)
            buckets[i_3] = -1;

        int i_4;
        for (i_3 = 0; i_3 < ints_1.length; buckets[i_4 + i_4 + 1] = i_3++) {
            for (i_4 = ints_1[i_3] & i_2 - 1; buckets[i_4 + i_4 + 1] != -1; i_4 = i_4 + 1 & i_2 - 1)
                ;

            buckets[i_4 + i_4] = ints_1[i_3];
        }

    }

    public int indexOf(int i_1) {
        int i_2 = (buckets.length >> 1) - 1;
        int i_3 = i_1 & i_2;

        while (true) {
            int i_4 = buckets[i_3 + i_3 + 1];
            if (i_4 == -1)
                return -1;

            if (buckets[i_3 + i_3] == i_1)
                return i_4;

            i_3 = i_3 + 1 & i_2;
        }
    }

}

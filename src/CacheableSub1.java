public class CacheableSub1 extends Cacheable {

    static BuildType staticBuildType5;
    public final int int512;
    public final int int511;
    public final int[] intArray82;
    public final int[] intArray83;

    CacheableSub1(int i_1, int i_2, int[] ints_3, int[] ints_4, int i_5) {
        int512 = i_1;
        int511 = i_2;
        intArray82 = ints_3;
        intArray83 = ints_4;
    }

    public boolean method555(int i_1, int i_2) {
        if (i_2 >= 0 && i_2 < intArray83.length) {
            int i_4 = intArray83[i_2];
            if (i_1 >= i_4 && i_1 <= i_4 + intArray82[i_2])
                return true;
        }

        return false;
    }

}

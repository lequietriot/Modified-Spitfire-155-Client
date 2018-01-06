public class StaticClass20 {

    static byte[][][] staticByteArrayArrayArray5;
    static int staticInt126;
    static int staticInt124 = 0;
    static int staticInt123 = 0;
    static int staticInt125 = 0;
    static byte[][] staticByteArrayArray3 = new byte[1000][];
    static byte[][] staticByteArrayArray4 = new byte[250][];
    static byte[][] staticByteArrayArray2 = new byte[50][];

    StaticClass20() throws Throwable {
        throw new Error();
    }

    static synchronized byte[] synchronizedMethod6(int i_0) {
        byte[] bytes_2;
        if (i_0 == 100 && staticInt124 > 0) {
            bytes_2 = staticByteArrayArray3[--staticInt124];
            staticByteArrayArray3[staticInt124] = null;
            return bytes_2;
        } else if (i_0 == 5000 && staticInt123 > 0) {
            bytes_2 = staticByteArrayArray4[--staticInt123];
            staticByteArrayArray4[staticInt123] = null;
            return bytes_2;
        } else if (i_0 == 30000 && staticInt125 > 0) {
            bytes_2 = staticByteArrayArray2[--staticInt125];
            staticByteArrayArray2[staticInt125] = null;
            return bytes_2;
        } else
            return new byte[i_0];
    }

}

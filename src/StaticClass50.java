import java.util.Arrays;

public class StaticClass50 {

    public static Huffman staticHuffman1;

    StaticClass50() throws Throwable {
        throw new Error();
    }

    public static void staticMethod206(Huffman huffman_0) {
        staticHuffman1 = huffman_0;
    }

    public static String staticMethod207(Buffer buffer_0) {
        return staticMethod208(buffer_0, 32767);
    }

    static String staticMethod208(Buffer buffer_0, int i_1) {
        try {

            int i_3 = buffer_0.method453();

            if (i_3 > i_1)
                i_3 = i_1;

            byte[] bytes_4 = new byte[i_3];
            buffer_0.off += staticHuffman1.method233(buffer_0.buf, buffer_0.off, bytes_4, 0, i_3);
            String string_5 = StaticClass52.staticMethod221(bytes_4, 0, i_3);
            return string_5;
        } catch (Exception exception_6) {
            return "Cabbage";
        }
    }

}

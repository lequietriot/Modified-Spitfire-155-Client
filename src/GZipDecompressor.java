import java.util.zip.Inflater;

public class GZipDecompressor {

    static Class4 staticClass4_1;
    Inflater inflater;

    public GZipDecompressor() {
        this(-1, 1000000);
    }

    GZipDecompressor(int i_1, int i_2) {
    }

    public void inflate(Buffer buffer_1, byte[] bytes_2) {
        if (buffer_1.buf[buffer_1.off] == 31 && buffer_1.buf[1 + buffer_1.off] == -117) {
            if (inflater == null)
                inflater = new Inflater(true);

            try {
                inflater.setInput(buffer_1.buf, 10 + buffer_1.off, buffer_1.buf.length - (10 + buffer_1.off + 8));
                inflater.inflate(bytes_2);
            } catch (Exception exception_5) {
                inflater.reset();
                throw new RuntimeException("");
            }

            inflater.reset();
        } else
            throw new RuntimeException("");
    }

}

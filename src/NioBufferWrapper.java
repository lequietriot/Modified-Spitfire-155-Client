import java.nio.ByteBuffer;

public class NioBufferWrapper extends BufferWrapper {

    ByteBuffer byteBuffer;

    @Override
    byte[] method244() {
        byte[] bytes_2 = new byte[byteBuffer.capacity()];
        byteBuffer.position(0);
        byteBuffer.get(bytes_2);
        return bytes_2;
    }

    @Override
    void method245(byte[] bytes_1) {
        byteBuffer = ByteBuffer.allocateDirect(bytes_1.length);
        byteBuffer.position(0);
        byteBuffer.put(bytes_1);
    }

}

public abstract class BufferWrapper {

    static Player staticPlayer1;
    static boolean staticBool18 = false;

    abstract byte[] method244();

    abstract void method245(byte[] var1);

    public static Object staticMethod153(byte[] bytes_0, boolean bool_1) {
        if (bytes_0 == null)
            return null;
        else {
            if (bytes_0.length > 136 && !staticBool18)
                try {
                    NioBufferWrapper niobufferwrapper_3 = new NioBufferWrapper();
                    niobufferwrapper_3.method245(bytes_0);
                    return niobufferwrapper_3;
                } catch (Throwable throwable_6) {
                    staticBool18 = true;
                }

            if (bool_1) {
                int i_4 = bytes_0.length;
                byte[] bytes_5 = new byte[i_4];
                System.arraycopy(bytes_0, 0, bytes_5, 0, i_4);
                return bytes_5;
            } else
                return bytes_0;
        }
    }

    public static byte[] staticMethod154(Object object_0, boolean bool_1) {
        if (object_0 == null)
            return null;
        else if (object_0 instanceof byte[]) {
            byte[] bytes_7 = (byte[]) object_0;
            if (bool_1) {
                int i_5 = bytes_7.length;
                byte[] bytes_6 = new byte[i_5];
                System.arraycopy(bytes_7, 0, bytes_6, 0, i_5);
                return bytes_6;
            } else
                return bytes_7;
        } else if (object_0 instanceof BufferWrapper) {
            BufferWrapper bufferwrapper_3 = (BufferWrapper) object_0;
            return bufferwrapper_3.method244();
        } else
            throw new IllegalArgumentException();
    }

}

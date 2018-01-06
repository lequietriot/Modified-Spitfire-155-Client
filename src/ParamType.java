
public class ParamType extends Cacheable {

    static int staticInt310;
    static Cache staticCache32 = new Cache(64);
    boolean autodisable = true;
    static Js5Index staticJs5Index32;
    public int int594;
    char type;
    public String string42;

    public static void staticMethod434(Js5Index js5index_0) {
        staticJs5Index32 = js5index_0;
    }

    public static ParamType staticMethod435(int i_0) {
        ParamType paramtype_2 = (ParamType) staticCache32.get(i_0);
        if (paramtype_2 != null)
            return paramtype_2;
        else {
            byte[] bytes_3 = staticJs5Index32.getFile(11, i_0);
            paramtype_2 = new ParamType();
            if (bytes_3 != null)
                paramtype_2.decode(new Buffer(bytes_3));

            paramtype_2.method599();
            staticCache32.put(paramtype_2, i_0);
            return paramtype_2;
        }
    }

    void method599() {
    }

    void decode(Buffer buffer_1) {
        while (true) {
            int i_3 = buffer_1.readUByte();
            if (i_3 == 0)
                return;

            this.decode(buffer_1, i_3);
        }
    }

    void decode(Buffer buffer_1, int i_2) {
        if (i_2 == 1) {
            byte b_5 = buffer_1.method440();
            int i_6 = b_5 & 0xff;
            if (i_6 == 0)
                throw new IllegalArgumentException("");

            if (i_6 >= 128 && i_6 < 160) {
                char var_7 = StaticClass52.staticCharArray2[i_6 - 128];
                if (var_7 == 0)
                    var_7 = 63;

                i_6 = var_7;
            }

            char var_4 = (char) i_6;
            type = var_4;
        } else if (i_2 == 2)
            int594 = buffer_1.readInt();
        else if (i_2 == 4)
            autodisable = false;
        else if (i_2 == 5)
            string42 = buffer_1.method448();

    }

    public boolean isStringType() {
        return type == 115;
    }

    public static void staticMethod436() {
        staticCache32.method264();
    }

}

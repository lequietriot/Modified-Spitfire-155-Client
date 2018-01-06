
public class StaticClass46 {

    StaticClass46() throws Throwable {
        throw new Error();
    }

    static final ParamList staticMethod195(Buffer buffer_0, ParamList paramlist_1) {
        int i_3 = buffer_0.readUByte();
        int i_4;
        if (paramlist_1 == null) {
            i_4 = StaticClass25.staticMethod149(i_3);
            paramlist_1 = new ParamList(i_4);
        }

        for (i_4 = 0; i_4 < i_3; i_4++) {
            boolean bool_5 = buffer_0.readUByte() == 1;
            int i_6 = buffer_0.method443();
            Object obj_7;
            if (bool_5)
                obj_7 = new StringProperty(buffer_0.method448());
            else
                obj_7 = new IntProperty(buffer_0.readInt());

            paramlist_1.method248((Node) obj_7, (long) i_6);
        }

        return paramlist_1;
    }

    static int staticMethod196(ParamList paramlist_0, int i_1, int i_2) {
        if (paramlist_0 == null)
            return i_2;
        else {
            IntProperty intproperty_4 = (IntProperty) paramlist_0.method247(i_1);
            return intproperty_4 == null ? i_2 : intproperty_4.value;
        }
    }

    static String staticMethod197(ParamList paramlist_0, int i_1, String string_2) {
        if (paramlist_0 == null)
            return string_2;
        else {
            StringProperty stringproperty_4 = (StringProperty) paramlist_0.method247(i_1);
            return stringproperty_4 == null ? string_2 : (String) stringproperty_4.value;
        }
    }

}

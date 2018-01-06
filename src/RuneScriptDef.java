
public class RuneScriptDef extends Cacheable {

    static Cache staticCache6 = new Cache(128);
    int int486;
    int int487;
    int int489;
    int int488;
    ParamList[] paramListArray1;
    int[] intArray66;
    int[] intArray65;
    String[] stringArray5;

    static RuneScriptDef staticMethod387(int i_0, WMEnumSub1 wmenumsub1_1) {
        RuneScriptDef runescriptdef_3 = (RuneScriptDef) staticCache6.get(i_0 << 16);
        if (runescriptdef_3 != null)
            return runescriptdef_3;
        else {
            String string_4 = String.valueOf(i_0);
            int i_5 = JavaxSoundSystemProvider.staticJs5IndexImpl3.indexOf(string_4);
            if (i_5 == -1)
                return null;
            else {
                byte[] bytes_6 = JavaxSoundSystemProvider.staticJs5IndexImpl3.getFile(i_5);
                if (bytes_6 != null) {
                    if (bytes_6.length <= 1)
                        return null;

                    runescriptdef_3 = staticMethod388(bytes_6);
                    if (runescriptdef_3 != null) {
                        staticCache6.put(runescriptdef_3, i_0 << 16);
                        return runescriptdef_3;
                    }
                }

                return null;
            }
        }
    }

    static RuneScriptDef staticMethod388(byte[] bytes_0) {
        RuneScriptDef runescriptdef_2 = new RuneScriptDef();
        Buffer buffer_3 = new Buffer(bytes_0);
        buffer_3.off = buffer_3.buf.length - 2;
        int i_4 = buffer_3.readUShort();
        int i_5 = buffer_3.buf.length - 2 - i_4 - 12;
        buffer_3.off = i_5;
        int i_6 = buffer_3.readInt();
        runescriptdef_2.int486 = buffer_3.readUShort();
        runescriptdef_2.int487 = buffer_3.readUShort();
        runescriptdef_2.int489 = buffer_3.readUShort();
        runescriptdef_2.int488 = buffer_3.readUShort();
        int i_7 = buffer_3.readUByte();
        int i_8;
        int i_9;
        if (i_7 > 0) {
            runescriptdef_2.paramListArray1 = runescriptdef_2.method520(i_7);

            for (i_8 = 0; i_8 < i_7; i_8++) {
                i_9 = buffer_3.readUShort();
                ParamList paramlist_10 = new ParamList(StaticClass25.staticMethod149(i_9));
                runescriptdef_2.paramListArray1[i_8] = paramlist_10;

                while (i_9-- > 0) {
                    int i_11 = buffer_3.readInt();
                    int i_12 = buffer_3.readInt();
                    paramlist_10.method248(new IntProperty(i_12), i_11);
                }
            }
        }

        buffer_3.off = 0;
        buffer_3.method447();
        runescriptdef_2.intArray66 = new int[i_6];
        runescriptdef_2.intArray65 = new int[i_6];
        runescriptdef_2.stringArray5 = new String[i_6];

        for (i_8 = 0; buffer_3.off < i_5; runescriptdef_2.intArray66[i_8++] = i_9) {
            i_9 = buffer_3.readUShort();
            if (i_9 == 3)
                runescriptdef_2.stringArray5[i_8] = buffer_3.method448();
            else if (i_9 < 100 && i_9 != 21 && i_9 != 38 && i_9 != 39)
                runescriptdef_2.intArray65[i_8] = buffer_3.readInt();
            else
                runescriptdef_2.intArray65[i_8] = buffer_3.readUByte();
        }

        return runescriptdef_2;
    }

    ParamList[] method520(int i_1) {
        return new ParamList[i_1];
    }

}

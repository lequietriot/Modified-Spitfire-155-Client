import java.util.Calendar;
import java.util.Date;

import com.alex.store.Index;

public class StaticClass15 {

    static int[] staticIntArray25 = new int[5];
    static int[][] staticIntArrayArray3 = new int[5][5000];
    static int[] staticIntArray26 = new int[1000];
    static String[] staticStringArray2 = new String[1000];
    static int staticInt71 = 0;
    static DataClass3[] staticDataClass3Array1 = new DataClass3[50];
    static Calendar staticCalendar1 = Calendar.getInstance();
    static final String[] staticStringArray1 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
    static int staticInt73 = 0;
    static int staticInt70;
    static int staticInt72;
    static int[] staticIntArray27;
    static Widget staticWidget3;
    static Widget staticWidget4;

    StaticClass15() throws Throwable {
        throw new Error();
    }

    public static void staticMethod79(RuneScript runescript_0) {
        staticMethod80(runescript_0, 200000);
    }

    static void staticMethod80(RuneScript runescript_0, int i_1) {
        Object[] arr_3 = runescript_0.objectArray1;
        RuneScriptDef runescriptdef_4;
        RuneScriptDef runescriptdef_6;
        int i_8;
        int i_9;
        int i_10;
        int i_12;
        int i_24;
        if (WMEnumSub1.staticMethod174(runescript_0.wMEnumSub1_1)) {
            RunnableImpl1.staticWM4_1 = (WM4) arr_3[0];
            MapElementType mapelementtype_5 = DataClass13.staticMapElementTypeArray1[RunnableImpl1.staticWM4_1.int5];
            WMEnumSub1 wmenumsub1_7 = runescript_0.wMEnumSub1_1;
            i_8 = mapelementtype_5.int547;
            i_9 = mapelementtype_5.int548;
            i_10 = StaticClass35.staticMethod171(i_8, wmenumsub1_7);
            RuneScriptDef runescriptdef_11 = RuneScriptDef.staticMethod387(i_10, wmenumsub1_7);
            if (runescriptdef_11 != null)
                runescriptdef_6 = runescriptdef_11;
            else {
                i_12 = (i_9 + 40000 << 8) + wmenumsub1_7.int257;
                runescriptdef_11 = RuneScriptDef.staticMethod387(i_12, wmenumsub1_7);
                if (runescriptdef_11 != null)
                    runescriptdef_6 = runescriptdef_11;
                else
                    runescriptdef_6 = null;
            }

            runescriptdef_4 = runescriptdef_6;
        } else {
            i_24 = ((Integer) arr_3[0]).intValue();
            RuneScriptDef runescriptdef_25 = (RuneScriptDef) RuneScriptDef.staticCache6.get(i_24);
            if (runescriptdef_25 != null)
                runescriptdef_6 = runescriptdef_25;
            else {
                byte[] bytes_27 = JavaxSoundSystemProvider.staticJs5IndexImpl3.getFile(i_24, 0);
                if (bytes_27 == null)
                    runescriptdef_6 = null;
                else {
                    runescriptdef_25 = RuneScriptDef.staticMethod388(bytes_27);
                    RuneScriptDef.staticCache6.put(runescriptdef_25, i_24);
                    runescriptdef_6 = runescriptdef_25;
                }
            }

            runescriptdef_4 = runescriptdef_6;
        }

        if (runescriptdef_4 != null) {
            staticInt70 = 0;
            staticInt72 = 0;
            i_24 = -1;
            int[] ints_28 = runescriptdef_4.intArray66;
            int[] ints_26 = runescriptdef_4.intArray65;
            byte b_29 = -1;
            staticInt71 = 0;

            int i_31;
            try {
                staticIntArray27 = new int[runescriptdef_4.int486];
                i_9 = 0;
                FileOnDisk.staticStringArray3 = new String[runescriptdef_4.int487];
                i_10 = 0;

                String string_37;
                for (i_31 = 1; i_31 < arr_3.length; i_31++)
                    if (arr_3[i_31] instanceof Integer) {
                        i_12 = ((Integer) arr_3[i_31]).intValue();
                        if (i_12 == -2147483647)
                            i_12 = runescript_0.int312;

                        if (i_12 == -2147483646)
                            i_12 = runescript_0.int313;

                        if (i_12 == -2147483645)
                            i_12 = runescript_0.widget2 != null ? runescript_0.widget2.int444 : -1;

                        if (i_12 == -2147483644)
                            i_12 = runescript_0.int314;

                        if (i_12 == -2147483643)
                            i_12 = runescript_0.widget2 != null ? runescript_0.widget2.int394 : -1;

                        if (i_12 == -2147483642)
                            i_12 = runescript_0.widget1 != null ? runescript_0.widget1.int444 : -1;

                        if (i_12 == -2147483641)
                            i_12 = runescript_0.widget1 != null ? runescript_0.widget1.int394 : -1;

                        if (i_12 == -2147483640)
                            i_12 = runescript_0.int315;

                        if (i_12 == -2147483639)
                            i_12 = runescript_0.int311;

                        staticIntArray27[i_9++] = i_12;
                    } else if (arr_3[i_31] instanceof String) {
                        string_37 = (String) arr_3[i_31];
                        if (string_37.equals("event_opbase"))
                            string_37 = runescript_0.string21;

                        FileOnDisk.staticStringArray3[i_10++] = string_37;
                    }

                i_31 = 0;
                staticInt73 = runescript_0.int316;

                while (true)
                    while (true)
                        while (true)
                            while (true)
                                while (true)
                                    while (true)
                                        while (true)
                                            while (true)
                                                while (true)
                                                    while (true)
                                                        while (true)
                                                            while (true)
                                                                while (true)
                                                                    while (true)
                                                                        while (true)
                                                                            while (true)
                                                                                while (true)
                                                                                    while (true)
                                                                                        while (true)
                                                                                            while (true)
                                                                                                while (true)
                                                                                                    while (true)
                                                                                                        while (true)
                                                                                                            while (true)
                                                                                                                while (true)
                                                                                                                    label1496: while (true) {
                                                                                                                        ++i_31;
                                                                                                                        if (i_31 > i_1)
                                                                                                                            throw new RuntimeException();

                                                                                                                        ++i_24;
                                                                                                                        i_8 = ints_28[i_24];
                                                                                                                        int i_13;
                                                                                                                        int i_15;
                                                                                                                        int i_16;
                                                                                                                        int i_34;
                                                                                                                        int i_36;
                                                                                                                        String string_38;
                                                                                                                        int i_44;
                                                                                                                        String string_53;
                                                                                                                        String str_60;
                                                                                                                        if (i_8 < 100) {
                                                                                                                            if (i_8 != 0) {
                                                                                                                                if (i_8 != 1) {
                                                                                                                                    if (i_8 != 2) {
                                                                                                                                        if (i_8 != 3) {
                                                                                                                                            if (i_8 != 6) {
                                                                                                                                                if (i_8 != 7) {
                                                                                                                                                    if (i_8 != 8) {
                                                                                                                                                        if (i_8 != 9) {
                                                                                                                                                            if (i_8 != 10) {
                                                                                                                                                                if (i_8 != 21) {
                                                                                                                                                                    if (i_8 != 25) {
                                                                                                                                                                        if (i_8 != 27) {
                                                                                                                                                                            if (i_8 != 31) {
                                                                                                                                                                                if (i_8 != 32) {
                                                                                                                                                                                    if (i_8 != 33) {
                                                                                                                                                                                        if (i_8 != 34) {
                                                                                                                                                                                            if (i_8 != 35) {
                                                                                                                                                                                                if (i_8 != 36) {
                                                                                                                                                                                                    if (i_8 != 37) {
                                                                                                                                                                                                        if (i_8 != 38) {
                                                                                                                                                                                                            if (i_8 != 39) {
                                                                                                                                                                                                                if (i_8 != 40) {
                                                                                                                                                                                                                    if (i_8 != 42) {
                                                                                                                                                                                                                        if (i_8 != 43) {
                                                                                                                                                                                                                            if (i_8 == 44) {
                                                                                                                                                                                                                                i_12 = ints_26[i_24] >> 16;
                                                                                                                                                                                                                                i_13 = ints_26[i_24] & 0xffff;
                                                                                                                                                                                                                                int i_72 = staticIntArray26[--staticInt70];
                                                                                                                                                                                                                                if (i_72 >= 0 && i_72 <= 5000) {
                                                                                                                                                                                                                                    staticIntArray25[i_12] = i_72;
                                                                                                                                                                                                                                    byte b_69 = -1;
                                                                                                                                                                                                                                    if (i_13 == 105)
                                                                                                                                                                                                                                        b_69 = 0;

                                                                                                                                                                                                                                    i_16 = 0;

                                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                                        if (i_16 >= i_72)
                                                                                                                                                                                                                                            continue label1496;

                                                                                                                                                                                                                                        staticIntArrayArray3[i_12][i_16] = b_69;
                                                                                                                                                                                                                                        ++i_16;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }

                                                                                                                                                                                                                                throw new RuntimeException();
                                                                                                                                                                                                                            } else if (i_8 == 45) {
                                                                                                                                                                                                                                i_12 = ints_26[i_24];
                                                                                                                                                                                                                                i_13 = staticIntArray26[--staticInt70];
                                                                                                                                                                                                                                if (i_13 < 0 || i_13 >= staticIntArray25[i_12])
                                                                                                                                                                                                                                    throw new RuntimeException();

                                                                                                                                                                                                                                staticIntArray26[staticInt70++] = staticIntArrayArray3[i_12][i_13];
                                                                                                                                                                                                                            } else if (i_8 == 46) {
                                                                                                                                                                                                                                i_12 = ints_26[i_24];
                                                                                                                                                                                                                                staticInt70 -= 2;
                                                                                                                                                                                                                                i_13 = staticIntArray26[staticInt70];
                                                                                                                                                                                                                                if (i_13 < 0 || i_13 >= staticIntArray25[i_12])
                                                                                                                                                                                                                                    throw new RuntimeException();

                                                                                                                                                                                                                                staticIntArrayArray3[i_12][i_13] = staticIntArray26[1 + staticInt70];
                                                                                                                                                                                                                            } else if (i_8 == 47) {
                                                                                                                                                                                                                                string_37 = GZipDecompressor.staticClass4_1.method137(ints_26[i_24]);
                                                                                                                                                                                                                                if (string_37 == null)
                                                                                                                                                                                                                                    string_37 = "null";

                                                                                                                                                                                                                                staticStringArray2[staticInt72++] = string_37;
                                                                                                                                                                                                                            } else if (i_8 == 48)
                                                                                                                                                                                                                                GZipDecompressor.staticClass4_1.method136(ints_26[i_24], staticStringArray2[--staticInt72]);
                                                                                                                                                                                                                            else {
                                                                                                                                                                                                                                if (i_8 != 60)
                                                                                                                                                                                                                                    throw new IllegalStateException();

                                                                                                                                                                                                                                ParamList paramlist_66 = runescriptdef_4.paramListArray1[ints_26[i_24]];
                                                                                                                                                                                                                                IntProperty intproperty_64 = (IntProperty) paramlist_66.method247(staticIntArray26[--staticInt70]);
                                                                                                                                                                                                                                if (intproperty_64 != null)
                                                                                                                                                                                                                                    i_24 += intproperty_64.value;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        } else
                                                                                                                                                                                                                            GZipDecompressor.staticClass4_1.method134(ints_26[i_24], staticIntArray26[--staticInt70]);
                                                                                                                                                                                                                    } else
                                                                                                                                                                                                                        staticIntArray26[staticInt70++] = GZipDecompressor.staticClass4_1.method135(ints_26[i_24]);
                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                    i_12 = ints_26[i_24];
                                                                                                                                                                                                                    RuneScriptDef runescriptdef_71 = (RuneScriptDef) RuneScriptDef.staticCache6.get(i_12);
                                                                                                                                                                                                                    RuneScriptDef runescriptdef_61;
                                                                                                                                                                                                                    if (runescriptdef_71 != null)
                                                                                                                                                                                                                        runescriptdef_61 = runescriptdef_71;
                                                                                                                                                                                                                    else {
                                                                                                                                                                                                                        byte[] bytes_67 = JavaxSoundSystemProvider.staticJs5IndexImpl3.getFile(i_12, 0);
                                                                                                                                                                                                                        if (bytes_67 == null)
                                                                                                                                                                                                                            runescriptdef_61 = null;
                                                                                                                                                                                                                        else {
                                                                                                                                                                                                                            runescriptdef_71 = RuneScriptDef.staticMethod388(bytes_67);
                                                                                                                                                                                                                            RuneScriptDef.staticCache6.put(runescriptdef_71, i_12);
                                                                                                                                                                                                                            runescriptdef_61 = runescriptdef_71;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }

                                                                                                                                                                                                                    runescriptdef_71 = runescriptdef_61;
                                                                                                                                                                                                                    int[] ints_68 = new int[runescriptdef_61.int486];
                                                                                                                                                                                                                    String[] arr_63 = new String[runescriptdef_61.int487];

                                                                                                                                                                                                                    for (i_34 = 0; i_34 < runescriptdef_71.int489; i_34++)
                                                                                                                                                                                                                        ints_68[i_34] = staticIntArray26[i_34 + staticInt70 - runescriptdef_71.int489];

                                                                                                                                                                                                                    for (i_34 = 0; i_34 < runescriptdef_71.int488; i_34++)
                                                                                                                                                                                                                        arr_63[i_34] = staticStringArray2[i_34 + staticInt72 - runescriptdef_71.int488];

                                                                                                                                                                                                                    staticInt70 -= runescriptdef_71.int489;
                                                                                                                                                                                                                    staticInt72 -= runescriptdef_71.int488;
                                                                                                                                                                                                                    DataClass3 dataclass3_62 = new DataClass3();
                                                                                                                                                                                                                    dataclass3_62.runeScriptDef1 = runescriptdef_4;
                                                                                                                                                                                                                    dataclass3_62.int87 = i_24;
                                                                                                                                                                                                                    dataclass3_62.intArray1 = staticIntArray27;
                                                                                                                                                                                                                    dataclass3_62.stringArray1 = FileOnDisk.staticStringArray3;
                                                                                                                                                                                                                    staticDataClass3Array1[staticInt71++] = dataclass3_62;
                                                                                                                                                                                                                    runescriptdef_4 = runescriptdef_71;
                                                                                                                                                                                                                    ints_28 = runescriptdef_71.intArray66;
                                                                                                                                                                                                                    ints_26 = runescriptdef_71.intArray65;
                                                                                                                                                                                                                    i_24 = -1;
                                                                                                                                                                                                                    staticIntArray27 = ints_68;
                                                                                                                                                                                                                    FileOnDisk.staticStringArray3 = arr_63;
                                                                                                                                                                                                                }
                                                                                                                                                                                                            } else
                                                                                                                                                                                                                --staticInt72;
                                                                                                                                                                                                        } else
                                                                                                                                                                                                            --staticInt70;
                                                                                                                                                                                                    } else {
                                                                                                                                                                                                        i_12 = ints_26[i_24];
                                                                                                                                                                                                        staticInt72 -= i_12;
                                                                                                                                                                                                        String[] arr_70 = staticStringArray2;
                                                                                                                                                                                                        i_15 = staticInt72;
                                                                                                                                                                                                        String str_58;
                                                                                                                                                                                                        if (i_12 == 0)
                                                                                                                                                                                                            str_58 = "";
                                                                                                                                                                                                        else if (i_12 == 1) {
                                                                                                                                                                                                            string_38 = arr_70[i_15];
                                                                                                                                                                                                            if (string_38 == null)
                                                                                                                                                                                                                str_58 = "null";
                                                                                                                                                                                                            else
                                                                                                                                                                                                                str_58 = string_38.toString();
                                                                                                                                                                                                        } else {
                                                                                                                                                                                                            i_16 = i_15 + i_12;
                                                                                                                                                                                                            i_34 = 0;

                                                                                                                                                                                                            for (i_36 = i_15; i_36 < i_16; i_36++) {
                                                                                                                                                                                                                str_60 = arr_70[i_36];
                                                                                                                                                                                                                if (str_60 == null)
                                                                                                                                                                                                                    i_34 += 4;
                                                                                                                                                                                                                else
                                                                                                                                                                                                                    i_34 += str_60.length();
                                                                                                                                                                                                            }

                                                                                                                                                                                                            StringBuilder stringbuilder_55 = new StringBuilder(i_34);

                                                                                                                                                                                                            for (i_44 = i_15; i_44 < i_16; i_44++) {
                                                                                                                                                                                                                string_53 = arr_70[i_44];
                                                                                                                                                                                                                if (string_53 == null)
                                                                                                                                                                                                                    stringbuilder_55.append("null");
                                                                                                                                                                                                                else
                                                                                                                                                                                                                    stringbuilder_55.append(string_53);
                                                                                                                                                                                                            }

                                                                                                                                                                                                            str_58 = stringbuilder_55.toString();
                                                                                                                                                                                                        }

                                                                                                                                                                                                        staticStringArray2[staticInt72++] = str_58;
                                                                                                                                                                                                    }
                                                                                                                                                                                                } else
                                                                                                                                                                                                    FileOnDisk.staticStringArray3[ints_26[i_24]] = staticStringArray2[--staticInt72];
                                                                                                                                                                                            } else
                                                                                                                                                                                                staticStringArray2[staticInt72++] = FileOnDisk.staticStringArray3[ints_26[i_24]];
                                                                                                                                                                                        } else
                                                                                                                                                                                            staticIntArray27[ints_26[i_24]] = staticIntArray26[--staticInt70];
                                                                                                                                                                                    } else
                                                                                                                                                                                        staticIntArray26[staticInt70++] = staticIntArray27[ints_26[i_24]];
                                                                                                                                                                                } else {
                                                                                                                                                                                    staticInt70 -= 2;
                                                                                                                                                                                    if (staticIntArray26[staticInt70] >= staticIntArray26[staticInt70 + 1])
                                                                                                                                                                                        i_24 += ints_26[i_24];
                                                                                                                                                                                }
                                                                                                                                                                            } else {
                                                                                                                                                                                staticInt70 -= 2;
                                                                                                                                                                                if (staticIntArray26[staticInt70] <= staticIntArray26[staticInt70 + 1])
                                                                                                                                                                                    i_24 += ints_26[i_24];
                                                                                                                                                                            }
                                                                                                                                                                        } else {
                                                                                                                                                                            i_12 = ints_26[i_24];
                                                                                                                                                                            StaticClass44.staticMethod184(i_12, staticIntArray26[--staticInt70]);
                                                                                                                                                                        }
                                                                                                                                                                    } else {
                                                                                                                                                                        i_12 = ints_26[i_24];
                                                                                                                                                                        staticIntArray26[staticInt70++] = StaticClass44.staticMethod183(i_12);
                                                                                                                                                                    }
                                                                                                                                                                } else {
                                                                                                                                                                    if (staticInt71 == 0)
                                                                                                                                                                        return;

                                                                                                                                                                    DataClass3 dataclass3_65 = staticDataClass3Array1[--staticInt71];
                                                                                                                                                                    runescriptdef_4 = dataclass3_65.runeScriptDef1;
                                                                                                                                                                    ints_28 = runescriptdef_4.intArray66;
                                                                                                                                                                    ints_26 = runescriptdef_4.intArray65;
                                                                                                                                                                    i_24 = dataclass3_65.int87;
                                                                                                                                                                    staticIntArray27 = dataclass3_65.intArray1;
                                                                                                                                                                    FileOnDisk.staticStringArray3 = dataclass3_65.stringArray1;
                                                                                                                                                                }
                                                                                                                                                            } else {
                                                                                                                                                                staticInt70 -= 2;
                                                                                                                                                                if (staticIntArray26[staticInt70] > staticIntArray26[staticInt70 + 1])
                                                                                                                                                                    i_24 += ints_26[i_24];
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            staticInt70 -= 2;
                                                                                                                                                            if (staticIntArray26[staticInt70] < staticIntArray26[1 + staticInt70])
                                                                                                                                                                i_24 += ints_26[i_24];
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        staticInt70 -= 2;
                                                                                                                                                        if (staticIntArray26[staticInt70 + 1] == staticIntArray26[staticInt70])
                                                                                                                                                            i_24 += ints_26[i_24];
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    staticInt70 -= 2;
                                                                                                                                                    if (staticIntArray26[staticInt70] != staticIntArray26[1 + staticInt70])
                                                                                                                                                        i_24 += ints_26[i_24];
                                                                                                                                                }
                                                                                                                                            } else
                                                                                                                                                i_24 += ints_26[i_24];
                                                                                                                                        } else
                                                                                                                                            staticStringArray2[staticInt72++] = runescriptdef_4.stringArray5[i_24];
                                                                                                                                    } else {
                                                                                                                                        i_12 = ints_26[i_24];
                                                                                                                                        StaticClass44.staticIntArray68[i_12] = staticIntArray26[--staticInt70];
                                                                                                                                        Client.staticMethod348(i_12);
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    i_12 = ints_26[i_24];
                                                                                                                                    staticIntArray26[staticInt70++] = StaticClass44.staticIntArray68[i_12];
                                                                                                                                }
                                                                                                                            } else
                                                                                                                                staticIntArray26[staticInt70++] = ints_26[i_24];
                                                                                                                        } else {
                                                                                                                            boolean bool_43;
                                                                                                                            if (runescriptdef_4.intArray65[i_24] == 1)
                                                                                                                                bool_43 = true;
                                                                                                                            else
                                                                                                                                bool_43 = false;

                                                                                                                            byte b_14;
                                                                                                                            Widget widget_17;
                                                                                                                            Widget widget_18;
                                                                                                                            int i_20;
                                                                                                                            Widget widget_32;
                                                                                                                            if (i_8 < 1000) {
                                                                                                                                if (i_8 == 100) {
                                                                                                                                    staticInt70 -= 3;
                                                                                                                                    i_15 = staticIntArray26[staticInt70];
                                                                                                                                    i_16 = staticIntArray26[staticInt70 + 1];
                                                                                                                                    i_34 = staticIntArray26[2 + staticInt70];
                                                                                                                                    if (i_16 == 0)
                                                                                                                                        throw new RuntimeException();

                                                                                                                                    widget_18 = Widget.staticMethod381(i_15);
                                                                                                                                    if (widget_18.widgetArray1 == null)
                                                                                                                                        widget_18.widgetArray1 = new Widget[i_34 + 1];

                                                                                                                                    if (widget_18.widgetArray1.length <= i_34) {
                                                                                                                                        Widget[] arr_19 = new Widget[i_34 + 1];

                                                                                                                                        for (i_20 = 0; i_20 < widget_18.widgetArray1.length; i_20++)
                                                                                                                                            arr_19[i_20] = widget_18.widgetArray1[i_20];

                                                                                                                                        widget_18.widgetArray1 = arr_19;
                                                                                                                                    }

                                                                                                                                    if (i_34 > 0 && widget_18.widgetArray1[i_34 - 1] == null)
                                                                                                                                        throw new RuntimeException("" + (i_34 - 1));

                                                                                                                                    Widget widget_41 = new Widget();
                                                                                                                                    widget_41.type = i_16;
                                                                                                                                    widget_41.parentId = widget_41.int444 = widget_18.int444;
                                                                                                                                    widget_41.int394 = i_34;
                                                                                                                                    widget_41.bool34 = true;
                                                                                                                                    widget_18.widgetArray1[i_34] = widget_41;
                                                                                                                                    if (bool_43)
                                                                                                                                        staticWidget4 = widget_41;
                                                                                                                                    else
                                                                                                                                        staticWidget3 = widget_41;

                                                                                                                                    Client.staticMethod342(widget_18);
                                                                                                                                    b_14 = 1;
                                                                                                                                } else if (i_8 == 101) {
                                                                                                                                    widget_32 = bool_43 ? staticWidget4 : staticWidget3;
                                                                                                                                    Widget widget_33 = Widget.staticMethod381(widget_32.int444);
                                                                                                                                    widget_33.widgetArray1[widget_32.int394] = null;
                                                                                                                                    Client.staticMethod342(widget_33);
                                                                                                                                    b_14 = 1;
                                                                                                                                } else if (i_8 == 102) {
                                                                                                                                    widget_32 = Widget.staticMethod381(staticIntArray26[--staticInt70]);
                                                                                                                                    widget_32.widgetArray1 = null;
                                                                                                                                    Client.staticMethod342(widget_32);
                                                                                                                                    b_14 = 1;
                                                                                                                                } else if (i_8 != 200) {
                                                                                                                                    if (i_8 == 201) {
                                                                                                                                        widget_32 = Widget.staticMethod381(staticIntArray26[--staticInt70]);
                                                                                                                                        if (widget_32 != null) {
                                                                                                                                            staticIntArray26[staticInt70++] = 1;
                                                                                                                                            if (bool_43)
                                                                                                                                                staticWidget4 = widget_32;
                                                                                                                                            else
                                                                                                                                                staticWidget3 = widget_32;
                                                                                                                                        } else
                                                                                                                                            staticIntArray26[staticInt70++] = 0;

                                                                                                                                        b_14 = 1;
                                                                                                                                    } else
                                                                                                                                        b_14 = 2;
                                                                                                                                } else {
                                                                                                                                    staticInt70 -= 2;
                                                                                                                                    i_15 = staticIntArray26[staticInt70];
                                                                                                                                    i_16 = staticIntArray26[staticInt70 + 1];
                                                                                                                                    widget_17 = Widget.staticMethod382(i_15, i_16);
                                                                                                                                    if (widget_17 != null && i_16 != -1) {
                                                                                                                                        staticIntArray26[staticInt70++] = 1;
                                                                                                                                        if (bool_43)
                                                                                                                                            staticWidget4 = widget_17;
                                                                                                                                        else
                                                                                                                                            staticWidget3 = widget_17;
                                                                                                                                    } else
                                                                                                                                        staticIntArray26[staticInt70++] = 0;

                                                                                                                                    b_14 = 1;
                                                                                                                                }

                                                                                                                                i_13 = b_14;
                                                                                                                            } else if (i_8 < 1100)
                                                                                                                                i_13 = staticMethod81(i_8, runescriptdef_4, bool_43);
                                                                                                                            else if (i_8 < 1200)
                                                                                                                                i_13 = staticMethod82(i_8, runescriptdef_4, bool_43);
                                                                                                                            else if (i_8 < 1300)
                                                                                                                                i_13 = staticMethod83(i_8, runescriptdef_4, bool_43);
                                                                                                                            else if (i_8 < 1400)
                                                                                                                                i_13 = staticMethod84(i_8, runescriptdef_4, bool_43);
                                                                                                                            else if (i_8 < 1500)
                                                                                                                                i_13 = staticMethod85(i_8, runescriptdef_4, bool_43);
                                                                                                                            else if (i_8 < 1600)
                                                                                                                                i_13 = staticMethod86(i_8, runescriptdef_4, bool_43);
                                                                                                                            else if (i_8 < 1700) {
                                                                                                                                widget_32 = bool_43 ? staticWidget4 : staticWidget3;
                                                                                                                                if (i_8 == 1600) {
                                                                                                                                    staticIntArray26[staticInt70++] = widget_32.int419;
                                                                                                                                    b_14 = 1;
                                                                                                                                } else if (i_8 == 1601) {
                                                                                                                                    staticIntArray26[staticInt70++] = widget_32.int451;
                                                                                                                                    b_14 = 1;
                                                                                                                                } else if (i_8 == 1602) {
                                                                                                                                    staticStringArray2[staticInt72++] = widget_32.string25;
                                                                                                                                    b_14 = 1;
                                                                                                                                } else if (i_8 == 1603) {
                                                                                                                                    staticIntArray26[staticInt70++] = widget_32.int413;
                                                                                                                                    b_14 = 1;
                                                                                                                                } else if (i_8 == 1604) {
                                                                                                                                    staticIntArray26[staticInt70++] = widget_32.int411;
                                                                                                                                    b_14 = 1;
                                                                                                                                } else if (i_8 == 1605) {
                                                                                                                                    staticIntArray26[staticInt70++] = widget_32.int397;
                                                                                                                                    b_14 = 1;
                                                                                                                                } else if (i_8 == 1606) {
                                                                                                                                    staticIntArray26[staticInt70++] = widget_32.int429;
                                                                                                                                    b_14 = 1;
                                                                                                                                } else if (i_8 == 1607) {
                                                                                                                                    staticIntArray26[staticInt70++] = widget_32.int442;
                                                                                                                                    b_14 = 1;
                                                                                                                                } else if (i_8 == 1608) {
                                                                                                                                    staticIntArray26[staticInt70++] = widget_32.int430;
                                                                                                                                    b_14 = 1;
                                                                                                                                } else if (i_8 == 1609) {
                                                                                                                                    staticIntArray26[staticInt70++] = widget_32.int416;
                                                                                                                                    b_14 = 1;
                                                                                                                                } else if (i_8 == 1610) {
                                                                                                                                    staticIntArray26[staticInt70++] = widget_32.int417;
                                                                                                                                    b_14 = 1;
                                                                                                                                } else if (i_8 == 1611) {
                                                                                                                                    staticIntArray26[staticInt70++] = widget_32.int393;
                                                                                                                                    b_14 = 1;
                                                                                                                                } else if (i_8 == 1612) {
                                                                                                                                    staticIntArray26[staticInt70++] = widget_32.int454;
                                                                                                                                    b_14 = 1;
                                                                                                                                } else if (i_8 == 1613) {
                                                                                                                                    staticIntArray26[staticInt70++] = widget_32.class8_1.ordinal();
                                                                                                                                    b_14 = 1;
                                                                                                                                } else
                                                                                                                                    b_14 = 2;

                                                                                                                                i_13 = b_14;
                                                                                                                            } else if (i_8 < 1800)
                                                                                                                                i_13 = staticMethod87(i_8, runescriptdef_4, bool_43);
                                                                                                                            else {
                                                                                                                                int[] ints_35;
                                                                                                                                if (i_8 < 1900) {
                                                                                                                                    widget_32 = bool_43 ? staticWidget4 : staticWidget3;
                                                                                                                                    if (i_8 == 1800) {
                                                                                                                                        ints_35 = staticIntArray26;
                                                                                                                                        i_34 = staticInt70++;
                                                                                                                                        i_44 = Client.staticMethod360(widget_32);
                                                                                                                                        i_36 = i_44 >> 11 & 0x3f;
                                                                                                                                        ints_35[i_34] = i_36;
                                                                                                                                        b_14 = 1;
                                                                                                                                    } else if (i_8 != 1801) {
                                                                                                                                        if (i_8 == 1802) {
                                                                                                                                            if (widget_32.string24 == null)
                                                                                                                                                staticStringArray2[staticInt72++] = "";
                                                                                                                                            else
                                                                                                                                                staticStringArray2[staticInt72++] = widget_32.string24;

                                                                                                                                            b_14 = 1;
                                                                                                                                        } else
                                                                                                                                            b_14 = 2;
                                                                                                                                    } else {
                                                                                                                                        i_16 = staticIntArray26[--staticInt70];
                                                                                                                                        --i_16;
                                                                                                                                        if (widget_32.stringArray3 != null && i_16 < widget_32.stringArray3.length && widget_32.stringArray3[i_16] != null)
                                                                                                                                            staticStringArray2[staticInt72++] = widget_32.stringArray3[i_16];
                                                                                                                                        else
                                                                                                                                            staticStringArray2[staticInt72++] = "";

                                                                                                                                        b_14 = 1;
                                                                                                                                    }

                                                                                                                                    i_13 = b_14;
                                                                                                                                } else if (i_8 < 2000)
                                                                                                                                    i_13 = staticMethod88(i_8, runescriptdef_4, bool_43);
                                                                                                                                else if (i_8 < 2100)
                                                                                                                                    i_13 = staticMethod81(i_8, runescriptdef_4, bool_43);
                                                                                                                                else if (i_8 < 2200)
                                                                                                                                    i_13 = staticMethod82(i_8, runescriptdef_4, bool_43);
                                                                                                                                else if (i_8 < 2300)
                                                                                                                                    i_13 = staticMethod83(i_8, runescriptdef_4, bool_43);
                                                                                                                                else if (i_8 < 2400)
                                                                                                                                    i_13 = staticMethod84(i_8, runescriptdef_4, bool_43);
                                                                                                                                else if (i_8 < 2500)
                                                                                                                                    i_13 = staticMethod85(i_8, runescriptdef_4, bool_43);
                                                                                                                                else if (i_8 < 2600)
                                                                                                                                    i_13 = staticMethod89(i_8, runescriptdef_4, bool_43);
                                                                                                                                else if (i_8 < 2700) {
                                                                                                                                    widget_32 = Widget.staticMethod381(staticIntArray26[--staticInt70]);
                                                                                                                                    if (i_8 == 2600) {
                                                                                                                                        staticIntArray26[staticInt70++] = widget_32.int419;
                                                                                                                                        b_14 = 1;
                                                                                                                                    } else if (i_8 == 2601) {
                                                                                                                                        staticIntArray26[staticInt70++] = widget_32.int451;
                                                                                                                                        b_14 = 1;
                                                                                                                                    } else if (i_8 == 2602) {
                                                                                                                                        staticStringArray2[staticInt72++] = widget_32.string25;
                                                                                                                                        b_14 = 1;
                                                                                                                                    } else if (i_8 == 2603) {
                                                                                                                                        staticIntArray26[staticInt70++] = widget_32.int413;
                                                                                                                                        b_14 = 1;
                                                                                                                                    } else if (i_8 == 2604) {
                                                                                                                                        staticIntArray26[staticInt70++] = widget_32.int411;
                                                                                                                                        b_14 = 1;
                                                                                                                                    } else if (i_8 == 2605) {
                                                                                                                                        staticIntArray26[staticInt70++] = widget_32.int397;
                                                                                                                                        b_14 = 1;
                                                                                                                                    } else if (i_8 == 2606) {
                                                                                                                                        staticIntArray26[staticInt70++] = widget_32.int429;
                                                                                                                                        b_14 = 1;
                                                                                                                                    } else if (i_8 == 2607) {
                                                                                                                                        staticIntArray26[staticInt70++] = widget_32.int442;
                                                                                                                                        b_14 = 1;
                                                                                                                                    } else if (i_8 == 2608) {
                                                                                                                                        staticIntArray26[staticInt70++] = widget_32.int430;
                                                                                                                                        b_14 = 1;
                                                                                                                                    } else if (i_8 == 2609) {
                                                                                                                                        staticIntArray26[staticInt70++] = widget_32.int416;
                                                                                                                                        b_14 = 1;
                                                                                                                                    } else if (i_8 == 2610) {
                                                                                                                                        staticIntArray26[staticInt70++] = widget_32.int417;
                                                                                                                                        b_14 = 1;
                                                                                                                                    } else if (i_8 == 2611) {
                                                                                                                                        staticIntArray26[staticInt70++] = widget_32.int393;
                                                                                                                                        b_14 = 1;
                                                                                                                                    } else if (i_8 == 2612) {
                                                                                                                                        staticIntArray26[staticInt70++] = widget_32.int454;
                                                                                                                                        b_14 = 1;
                                                                                                                                    } else if (i_8 == 2613) {
                                                                                                                                        staticIntArray26[staticInt70++] = widget_32.class8_1.ordinal();
                                                                                                                                        b_14 = 1;
                                                                                                                                    } else
                                                                                                                                        b_14 = 2;

                                                                                                                                    i_13 = b_14;
                                                                                                                                } else if (i_8 < 2800)
                                                                                                                                    i_13 = staticMethod90(i_8, runescriptdef_4, bool_43);
                                                                                                                                else if (i_8 < 2900) {
                                                                                                                                    widget_32 = Widget.staticMethod381(staticIntArray26[--staticInt70]);
                                                                                                                                    if (i_8 == 2800) {
                                                                                                                                        ints_35 = staticIntArray26;
                                                                                                                                        i_34 = staticInt70++;
                                                                                                                                        i_44 = Client.staticMethod360(widget_32);
                                                                                                                                        i_36 = i_44 >> 11 & 0x3f;
                                                                                                                                        ints_35[i_34] = i_36;
                                                                                                                                        b_14 = 1;
                                                                                                                                    } else if (i_8 != 2801) {
                                                                                                                                        if (i_8 == 2802) {
                                                                                                                                            if (widget_32.string24 == null)
                                                                                                                                                staticStringArray2[staticInt72++] = "";
                                                                                                                                            else
                                                                                                                                                staticStringArray2[staticInt72++] = widget_32.string24;

                                                                                                                                            b_14 = 1;
                                                                                                                                        } else
                                                                                                                                            b_14 = 2;
                                                                                                                                    } else {
                                                                                                                                        i_16 = staticIntArray26[--staticInt70];
                                                                                                                                        --i_16;
                                                                                                                                        if (widget_32.stringArray3 != null && i_16 < widget_32.stringArray3.length && widget_32.stringArray3[i_16] != null)
                                                                                                                                            staticStringArray2[staticInt72++] = widget_32.stringArray3[i_16];
                                                                                                                                        else
                                                                                                                                            staticStringArray2[staticInt72++] = "";

                                                                                                                                        b_14 = 1;
                                                                                                                                    }

                                                                                                                                    i_13 = b_14;
                                                                                                                                } else if (i_8 < 3000)
                                                                                                                                    i_13 = staticMethod88(i_8, runescriptdef_4, bool_43);
                                                                                                                                else {
                                                                                                                                    String string_40;
                                                                                                                                    String string_42;
                                                                                                                                    if (i_8 < 3200) {
                                                                                                                                        if (i_8 == 3100) {
                                                                                                                                            string_40 = staticStringArray2[--staticInt72];
                                                                                                                                            StaticClass12.staticMethod59(0, "", string_40);
                                                                                                                                            b_14 = 1;
                                                                                                                                        } else if (i_8 == 3101) {
                                                                                                                                            staticInt70 -= 2;
                                                                                                                                            Client.staticMethod275(BufferWrapper.staticPlayer1, staticIntArray26[staticInt70], staticIntArray26[1 + staticInt70]);
                                                                                                                                            b_14 = 1;
                                                                                                                                        } else if (i_8 == 3103) {
                                                                                                                                            Client.staticMethod349();
                                                                                                                                            b_14 = 1;
                                                                                                                                        } else if (i_8 == 3104) {
                                                                                                                                            string_40 = staticStringArray2[--staticInt72];
                                                                                                                                            i_16 = 0;
                                                                                                                                            if (StaticClass51.staticMethod210(string_40)) {
                                                                                                                                                i_34 = StaticClass51.staticMethod212(string_40, 10, true);
                                                                                                                                                i_16 = i_34;
                                                                                                                                            }

                                                                                                                                            Client.staticPacket1.writeOpcode(54);
                                                                                                                                            Client.staticPacket1.writeInt(i_16);
                                                                                                                                            b_14 = 1;
                                                                                                                                        } else if (i_8 == 3105) {
                                                                                                                                            string_40 = staticStringArray2[--staticInt72];
                                                                                                                                            Client.staticPacket1.writeOpcode(198);
                                                                                                                                            Client.staticPacket1.writeByte(string_40.length() + 1);
                                                                                                                                            Client.staticPacket1.method430(string_40);
                                                                                                                                            b_14 = 1;
                                                                                                                                        } else if (i_8 == 3106) {
                                                                                                                                            string_40 = staticStringArray2[--staticInt72];
                                                                                                                                            Client.staticPacket1.writeOpcode(94);
                                                                                                                                            Client.staticPacket1.writeByte(string_40.length() + 1);
                                                                                                                                            Client.staticPacket1.method430(string_40);
                                                                                                                                            b_14 = 1;
                                                                                                                                        } else if (i_8 != 3107) {
                                                                                                                                            if (i_8 == 3108) {
                                                                                                                                                staticInt70 -= 3;
                                                                                                                                                i_15 = staticIntArray26[staticInt70];
                                                                                                                                                i_16 = staticIntArray26[staticInt70 + 1];
                                                                                                                                                i_34 = staticIntArray26[2 + staticInt70];
                                                                                                                                                widget_18 = Widget.staticMethod381(i_34);
                                                                                                                                                Client.staticMethod340(widget_18, i_15, i_16);
                                                                                                                                                b_14 = 1;
                                                                                                                                            } else if (i_8 == 3109) {
                                                                                                                                                staticInt70 -= 2;
                                                                                                                                                i_15 = staticIntArray26[staticInt70];
                                                                                                                                                i_16 = staticIntArray26[staticInt70 + 1];
                                                                                                                                                widget_17 = bool_43 ? staticWidget4 : staticWidget3;
                                                                                                                                                Client.staticMethod340(widget_17, i_15, i_16);
                                                                                                                                                b_14 = 1;
                                                                                                                                            } else if (i_8 == 3110) {
                                                                                                                                                SoundBank.staticBool11 = staticIntArray26[--staticInt70] == 1;
                                                                                                                                                b_14 = 1;
                                                                                                                                            } else if (i_8 == 3111) {
                                                                                                                                                staticIntArray26[staticInt70++] = StaticClass61.staticClientPreferences1.bool11 ? 1 : 0;
                                                                                                                                                b_14 = 1;
                                                                                                                                            } else if (i_8 == 3112) {
                                                                                                                                                StaticClass61.staticClientPreferences1.bool11 = staticIntArray26[--staticInt70] == 1;
                                                                                                                                                ClientPreferences.staticMethod63();
                                                                                                                                                b_14 = 1;
                                                                                                                                            } else if (i_8 == 3113) {
                                                                                                                                                string_40 = staticStringArray2[--staticInt72];
                                                                                                                                                boolean bool_45 = staticIntArray26[--staticInt70] == 1;
                                                                                                                                                StaticClass8.staticMethod38(string_40, bool_45, false);
                                                                                                                                                b_14 = 1;
                                                                                                                                            } else if (i_8 == 3115) {
                                                                                                                                                i_15 = staticIntArray26[--staticInt70];
                                                                                                                                                Client.staticPacket1.writeOpcode(113);
                                                                                                                                                Client.staticPacket1.writeShort(i_15);
                                                                                                                                                b_14 = 1;
                                                                                                                                            } else if (i_8 == 3116) {
                                                                                                                                                i_15 = staticIntArray26[--staticInt70];
                                                                                                                                                staticInt72 -= 2;
                                                                                                                                                string_38 = staticStringArray2[staticInt72];
                                                                                                                                                string_42 = staticStringArray2[staticInt72 + 1];
                                                                                                                                                if (string_38.length() > 500)
                                                                                                                                                    b_14 = 1;
                                                                                                                                                else if (string_42.length() > 500)
                                                                                                                                                    b_14 = 1;
                                                                                                                                                else {
                                                                                                                                                    Client.staticPacket1.writeOpcode(58);
                                                                                                                                                    Client.staticPacket1.writeShort(1 + Buffer.staticMethod378(string_38) + Buffer.staticMethod378(string_42));
                                                                                                                                                    Client.staticPacket1.method465(i_15);
                                                                                                                                                    Client.staticPacket1.method430(string_42);
                                                                                                                                                    Client.staticPacket1.method430(string_38);
                                                                                                                                                    b_14 = 1;
                                                                                                                                                }
                                                                                                                                            } else if (i_8 == 3117) {
                                                                                                                                                Client.staticBool46 = staticIntArray26[--staticInt70] == 1;
                                                                                                                                                b_14 = 1;
                                                                                                                                            } else
                                                                                                                                                b_14 = 2;
                                                                                                                                        } else {
                                                                                                                                            i_15 = staticIntArray26[--staticInt70];
                                                                                                                                            string_38 = staticStringArray2[--staticInt72];
                                                                                                                                            i_34 = StaticClass10.playersInsideViewportCount;
                                                                                                                                            int[] ints_39 = StaticClass10.playerIndexesInsideViewport;
                                                                                                                                            boolean bool_47 = false;

                                                                                                                                            for (i_20 = 0; i_20 < i_34; i_20++) {
                                                                                                                                                Player player_21 = Client.players[ints_39[i_20]];
                                                                                                                                                if (player_21 != null && BufferWrapper.staticPlayer1 != player_21 && player_21.name != null && player_21.name.equalsIgnoreCase(string_38)) {
                                                                                                                                                    if (i_15 == 1) {
                                                                                                                                                        Client.staticPacket1.writeOpcode(166);
                                                                                                                                                        Client.staticPacket1.method465(0);
                                                                                                                                                        Client.staticPacket1.method473(ints_39[i_20]);
                                                                                                                                                    } else if (i_15 == 4) {
                                                                                                                                                        Client.staticPacket1.writeOpcode(120);
                                                                                                                                                        Client.staticPacket1.method474(ints_39[i_20]);
                                                                                                                                                        Client.staticPacket1.method465(0);
                                                                                                                                                    } else if (i_15 == 6) {
                                                                                                                                                        Client.staticPacket1.writeOpcode(5);
                                                                                                                                                        Client.staticPacket1.method465(0);
                                                                                                                                                        Client.staticPacket1.method474(ints_39[i_20]);
                                                                                                                                                    } else if (i_15 == 7) {
                                                                                                                                                        Client.staticPacket1.writeOpcode(4);
                                                                                                                                                        Client.staticPacket1.method465(0);
                                                                                                                                                        Client.staticPacket1.method474(ints_39[i_20]);
                                                                                                                                                    }

                                                                                                                                                    bool_47 = true;
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                            }

                                                                                                                                            if (!bool_47)
                                                                                                                                                StaticClass12.staticMethod59(4, "", "Unable to find " + string_38);

                                                                                                                                            b_14 = 1;
                                                                                                                                        }

                                                                                                                                        i_13 = b_14;
                                                                                                                                    } else if (i_8 < 3300)
                                                                                                                                        i_13 = staticMethod91(i_8, runescriptdef_4, bool_43);
                                                                                                                                    else {
                                                                                                                                        int i_22;
                                                                                                                                        int i_50;
                                                                                                                                        if (i_8 < 3400) {
                                                                                                                                            if (i_8 == 3300) {
                                                                                                                                                staticIntArray26[staticInt70++] = Client.staticInt166;
                                                                                                                                                b_14 = 1;
                                                                                                                                            } else if (i_8 == 3301) {
                                                                                                                                                staticInt70 -= 2;
                                                                                                                                                i_15 = staticIntArray26[staticInt70];
                                                                                                                                                i_16 = staticIntArray26[staticInt70 + 1];
                                                                                                                                                staticIntArray26[staticInt70++] = ItemContainer.staticMethod250(i_15, i_16);
                                                                                                                                                b_14 = 1;
                                                                                                                                            } else {
                                                                                                                                                int[] ints_46;
                                                                                                                                                ItemContainer itemcontainer_49;
                                                                                                                                                if (i_8 == 3302) {
                                                                                                                                                    staticInt70 -= 2;
                                                                                                                                                    i_15 = staticIntArray26[staticInt70];
                                                                                                                                                    i_16 = staticIntArray26[staticInt70 + 1];
                                                                                                                                                    ints_46 = staticIntArray26;
                                                                                                                                                    i_36 = staticInt70++;
                                                                                                                                                    itemcontainer_49 = (ItemContainer) ItemContainer.staticHashTable5.get(i_15);
                                                                                                                                                    if (itemcontainer_49 == null)
                                                                                                                                                        i_44 = 0;
                                                                                                                                                    else if (i_16 >= 0 && i_16 < itemcontainer_49.itemQuantities.length)
                                                                                                                                                        i_44 = itemcontainer_49.itemQuantities[i_16];
                                                                                                                                                    else
                                                                                                                                                        i_44 = 0;

                                                                                                                                                    ints_46[i_36] = i_44;
                                                                                                                                                    b_14 = 1;
                                                                                                                                                } else if (i_8 == 3303) {
                                                                                                                                                    staticInt70 -= 2;
                                                                                                                                                    i_15 = staticIntArray26[staticInt70];
                                                                                                                                                    i_16 = staticIntArray26[staticInt70 + 1];
                                                                                                                                                    ints_46 = staticIntArray26;
                                                                                                                                                    i_36 = staticInt70++;
                                                                                                                                                    itemcontainer_49 = (ItemContainer) ItemContainer.staticHashTable5.get(i_15);
                                                                                                                                                    if (itemcontainer_49 == null)
                                                                                                                                                        i_44 = 0;
                                                                                                                                                    else if (i_16 == -1)
                                                                                                                                                        i_44 = 0;
                                                                                                                                                    else {
                                                                                                                                                        i_50 = 0;

                                                                                                                                                        for (i_22 = 0; i_22 < itemcontainer_49.itemQuantities.length; i_22++)
                                                                                                                                                            if (i_16 == itemcontainer_49.itemIds[i_22])
                                                                                                                                                                i_50 += itemcontainer_49.itemQuantities[i_22];

                                                                                                                                                        i_44 = i_50;
                                                                                                                                                    }

                                                                                                                                                    ints_46[i_36] = i_44;
                                                                                                                                                    b_14 = 1;
                                                                                                                                                } else if (i_8 == 3304) {
                                                                                                                                                    i_15 = staticIntArray26[--staticInt70];
                                                                                                                                                    staticIntArray26[staticInt70++] = InvType.staticMethod427(i_15).size;
                                                                                                                                                    b_14 = 1;
                                                                                                                                                } else if (i_8 == 3305) {
                                                                                                                                                    i_15 = staticIntArray26[--staticInt70];
                                                                                                                                                    staticIntArray26[staticInt70++] = Client.staticIntArray84[i_15];
                                                                                                                                                    b_14 = 1;
                                                                                                                                                } else if (i_8 == 3306) {
                                                                                                                                                    i_15 = staticIntArray26[--staticInt70];
                                                                                                                                                    staticIntArray26[staticInt70++] = Client.staticIntArray95[i_15];
                                                                                                                                                    b_14 = 1;
                                                                                                                                                } else if (i_8 == 3307) {
                                                                                                                                                    i_15 = staticIntArray26[--staticInt70];
                                                                                                                                                    staticIntArray26[staticInt70++] = Client.staticIntArray96[i_15];
                                                                                                                                                    b_14 = 1;
                                                                                                                                                } else if (i_8 == 3308) {
                                                                                                                                                    i_15 = DataClass14.staticInt156;
                                                                                                                                                    i_16 = DataClass10.staticInt111 + (BufferWrapper.staticPlayer1.int626 >> 7);
                                                                                                                                                    i_34 = (BufferWrapper.staticPlayer1.int609 >> 7) + Class4.staticInt53;
                                                                                                                                                    staticIntArray26[staticInt70++] = i_34 + (i_16 << 14) + (i_15 << 28);
                                                                                                                                                    b_14 = 1;
                                                                                                                                                } else if (i_8 == 3309) {
                                                                                                                                                    i_15 = staticIntArray26[--staticInt70];
                                                                                                                                                    staticIntArray26[staticInt70++] = i_15 >> 14 & 0x3fff;
                                                                                                                                                    b_14 = 1;
                                                                                                                                                } else if (i_8 == 3310) {
                                                                                                                                                    i_15 = staticIntArray26[--staticInt70];
                                                                                                                                                    staticIntArray26[staticInt70++] = i_15 >> 28;
                                                                                                                                                    b_14 = 1;
                                                                                                                                                } else if (i_8 == 3311) {
                                                                                                                                                    i_15 = staticIntArray26[--staticInt70];
                                                                                                                                                    staticIntArray26[staticInt70++] = i_15 & 0x3fff;
                                                                                                                                                    b_14 = 1;
                                                                                                                                                } else if (i_8 == 3312) {
                                                                                                                                                    staticIntArray26[staticInt70++] = Client.staticBool24 ? 1 : 0;
                                                                                                                                                    b_14 = 1;
                                                                                                                                                } else if (i_8 == 3313) {
                                                                                                                                                    staticInt70 -= 2;
                                                                                                                                                    i_15 = staticIntArray26[staticInt70] + 32768;
                                                                                                                                                    i_16 = staticIntArray26[staticInt70 + 1];
                                                                                                                                                    staticIntArray26[staticInt70++] = ItemContainer.staticMethod250(i_15, i_16);
                                                                                                                                                    b_14 = 1;
                                                                                                                                                } else if (i_8 == 3314) {
                                                                                                                                                    staticInt70 -= 2;
                                                                                                                                                    i_15 = 32768 + staticIntArray26[staticInt70];
                                                                                                                                                    i_16 = staticIntArray26[1 + staticInt70];
                                                                                                                                                    ints_46 = staticIntArray26;
                                                                                                                                                    i_36 = staticInt70++;
                                                                                                                                                    itemcontainer_49 = (ItemContainer) ItemContainer.staticHashTable5.get(i_15);
                                                                                                                                                    if (itemcontainer_49 == null)
                                                                                                                                                        i_44 = 0;
                                                                                                                                                    else if (i_16 >= 0 && i_16 < itemcontainer_49.itemQuantities.length)
                                                                                                                                                        i_44 = itemcontainer_49.itemQuantities[i_16];
                                                                                                                                                    else
                                                                                                                                                        i_44 = 0;

                                                                                                                                                    ints_46[i_36] = i_44;
                                                                                                                                                    b_14 = 1;
                                                                                                                                                } else if (i_8 != 3315) {
                                                                                                                                                    if (i_8 == 3316) {
                                                                                                                                                        if (Client.staticInt246 >= 2)
                                                                                                                                                            staticIntArray26[staticInt70++] = Client.staticInt246;
                                                                                                                                                        else
                                                                                                                                                            staticIntArray26[staticInt70++] = 0;

                                                                                                                                                        b_14 = 1;
                                                                                                                                                    } else if (i_8 == 3317) {
                                                                                                                                                        staticIntArray26[staticInt70++] = Client.staticInt201;
                                                                                                                                                        b_14 = 1;
                                                                                                                                                    } else if (i_8 == 3318) {
                                                                                                                                                        staticIntArray26[staticInt70++] = Client.staticInt271;
                                                                                                                                                        b_14 = 1;
                                                                                                                                                    } else if (i_8 == 3321) {
                                                                                                                                                        staticIntArray26[staticInt70++] = Client.staticInt244;
                                                                                                                                                        b_14 = 1;
                                                                                                                                                    } else if (i_8 == 3322) {
                                                                                                                                                        staticIntArray26[staticInt70++] = Client.staticInt245;
                                                                                                                                                        b_14 = 1;
                                                                                                                                                    } else if (i_8 == 3323) {
                                                                                                                                                        if (Client.staticBool37)
                                                                                                                                                            staticIntArray26[staticInt70++] = 1;
                                                                                                                                                        else
                                                                                                                                                            staticIntArray26[staticInt70++] = 0;

                                                                                                                                                        b_14 = 1;
                                                                                                                                                    } else if (i_8 == 3324) {
                                                                                                                                                        staticIntArray26[staticInt70++] = Client.staticInt182;
                                                                                                                                                        b_14 = 1;
                                                                                                                                                    } else if (i_8 == 3325) {
                                                                                                                                                        staticInt70 -= 4;
                                                                                                                                                        i_15 = staticIntArray26[staticInt70];
                                                                                                                                                        i_16 = staticIntArray26[staticInt70 + 1];
                                                                                                                                                        i_34 = staticIntArray26[2 + staticInt70];
                                                                                                                                                        i_36 = staticIntArray26[3 + staticInt70];
                                                                                                                                                        i_15 += i_16 << 14;
                                                                                                                                                        i_15 += i_34 << 28;
                                                                                                                                                        i_15 += i_36;
                                                                                                                                                        staticIntArray26[staticInt70++] = i_15;
                                                                                                                                                        b_14 = 1;
                                                                                                                                                    } else
                                                                                                                                                        b_14 = 2;
                                                                                                                                                } else {
                                                                                                                                                    staticInt70 -= 2;
                                                                                                                                                    i_15 = staticIntArray26[staticInt70] + 32768;
                                                                                                                                                    i_16 = staticIntArray26[staticInt70 + 1];
                                                                                                                                                    ints_46 = staticIntArray26;
                                                                                                                                                    i_36 = staticInt70++;
                                                                                                                                                    itemcontainer_49 = (ItemContainer) ItemContainer.staticHashTable5.get(i_15);
                                                                                                                                                    if (itemcontainer_49 == null)
                                                                                                                                                        i_44 = 0;
                                                                                                                                                    else if (i_16 == -1)
                                                                                                                                                        i_44 = 0;
                                                                                                                                                    else {
                                                                                                                                                        i_50 = 0;

                                                                                                                                                        for (i_22 = 0; i_22 < itemcontainer_49.itemQuantities.length; i_22++)
                                                                                                                                                            if (itemcontainer_49.itemIds[i_22] == i_16)
                                                                                                                                                                i_50 += itemcontainer_49.itemQuantities[i_22];

                                                                                                                                                        i_44 = i_50;
                                                                                                                                                    }

                                                                                                                                                    ints_46[i_36] = i_44;
                                                                                                                                                    b_14 = 1;
                                                                                                                                                }
                                                                                                                                            }

                                                                                                                                            i_13 = b_14;
                                                                                                                                        } else if (i_8 < 3500)
                                                                                                                                            i_13 = WorldMapArea.staticMethod2(i_8, runescriptdef_4, bool_43);
                                                                                                                                        else if (i_8 < 3700) {
                                                                                                                                            if (i_8 == 3600) {
                                                                                                                                                if (Client.staticInt294 == 0)
                                                                                                                                                    staticIntArray26[staticInt70++] = -2;
                                                                                                                                                else if (Client.staticInt294 == 1)
                                                                                                                                                    staticIntArray26[staticInt70++] = -1;
                                                                                                                                                else
                                                                                                                                                    staticIntArray26[staticInt70++] = Client.staticInt180;

                                                                                                                                                b_14 = 1;
                                                                                                                                            } else if (i_8 == 3601) {
                                                                                                                                                i_15 = staticIntArray26[--staticInt70];
                                                                                                                                                if (Client.staticInt294 == 2 && i_15 < Client.staticInt180) {
                                                                                                                                                    staticStringArray2[staticInt72++] = Client.staticFriendArray1[i_15].string7;
                                                                                                                                                    staticStringArray2[staticInt72++] = Client.staticFriendArray1[i_15].string6;
                                                                                                                                                } else {
                                                                                                                                                    staticStringArray2[staticInt72++] = "";
                                                                                                                                                    staticStringArray2[staticInt72++] = "";
                                                                                                                                                }

                                                                                                                                                b_14 = 1;
                                                                                                                                            } else if (i_8 == 3602) {
                                                                                                                                                i_15 = staticIntArray26[--staticInt70];
                                                                                                                                                if (Client.staticInt294 == 2 && i_15 < Client.staticInt180)
                                                                                                                                                    staticIntArray26[staticInt70++] = Client.staticFriendArray1[i_15].int88;
                                                                                                                                                else
                                                                                                                                                    staticIntArray26[staticInt70++] = 0;

                                                                                                                                                b_14 = 1;
                                                                                                                                            } else if (i_8 == 3603) {
                                                                                                                                                i_15 = staticIntArray26[--staticInt70];
                                                                                                                                                if (Client.staticInt294 == 2 && i_15 < Client.staticInt180)
                                                                                                                                                    staticIntArray26[staticInt70++] = Client.staticFriendArray1[i_15].int89;
                                                                                                                                                else
                                                                                                                                                    staticIntArray26[staticInt70++] = 0;

                                                                                                                                                b_14 = 1;
                                                                                                                                            } else if (i_8 == 3604) {
                                                                                                                                                string_40 = staticStringArray2[--staticInt72];
                                                                                                                                                i_16 = staticIntArray26[--staticInt70];
                                                                                                                                                Client.staticMethod358(string_40, i_16);
                                                                                                                                                b_14 = 1;
                                                                                                                                            } else if (i_8 == 3605) {
                                                                                                                                                string_40 = staticStringArray2[--staticInt72];
                                                                                                                                                Client.staticMethod357(string_40);
                                                                                                                                                b_14 = 1;
                                                                                                                                            } else {
                                                                                                                                                Friend friend_52;
                                                                                                                                                boolean bool_54;
                                                                                                                                                if (i_8 == 3606) {
                                                                                                                                                    string_40 = staticStringArray2[--staticInt72];
                                                                                                                                                    if (string_40 != null) {
                                                                                                                                                        string_38 = StaticClass53.staticMethod224(string_40, DataClass14.staticClass12_10);
                                                                                                                                                        if (string_38 != null)
                                                                                                                                                            for (i_34 = 0; i_34 < Client.staticInt180; i_34++) {
                                                                                                                                                                friend_52 = Client.staticFriendArray1[i_34];
                                                                                                                                                                str_60 = friend_52.string7;
                                                                                                                                                                string_53 = StaticClass53.staticMethod224(str_60, DataClass14.staticClass12_10);
                                                                                                                                                                if (string_40 != null && str_60 != null) {
                                                                                                                                                                    if (!string_40.startsWith("#") && !str_60.startsWith("#"))
                                                                                                                                                                        bool_54 = string_38.equals(string_53);
                                                                                                                                                                    else
                                                                                                                                                                        bool_54 = string_40.equals(str_60);
                                                                                                                                                                } else
                                                                                                                                                                    bool_54 = false;

                                                                                                                                                                if (bool_54) {
                                                                                                                                                                    --Client.staticInt180;

                                                                                                                                                                    for (i_22 = i_34; i_22 < Client.staticInt180; i_22++)
                                                                                                                                                                        Client.staticFriendArray1[i_22] = Client.staticFriendArray1[i_22 + 1];

                                                                                                                                                                    Client.staticInt260 = Client.staticInt256;
                                                                                                                                                                    Client.staticPacket1.writeOpcode(242);
                                                                                                                                                                    Client.staticPacket1.writeByte(Buffer.staticMethod378(string_40));
                                                                                                                                                                    Client.staticPacket1.method430(string_40);
                                                                                                                                                                    break;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                    }

                                                                                                                                                    b_14 = 1;
                                                                                                                                                } else {
                                                                                                                                                    Ignore ignore_51;
                                                                                                                                                    if (i_8 == 3607) {
                                                                                                                                                        string_40 = staticStringArray2[--staticInt72];
                                                                                                                                                        if (string_40 != null)
                                                                                                                                                            if ((Client.staticInt295 < 100 || Client.staticInt229 == 1) && Client.staticInt295 < 400) {
                                                                                                                                                                string_38 = StaticClass53.staticMethod224(string_40, DataClass14.staticClass12_10);
                                                                                                                                                                if (string_38 != null) {
                                                                                                                                                                    i_34 = 0;

                                                                                                                                                                    label1218: while (true) {
                                                                                                                                                                        if (i_34 >= Client.staticInt295) {
                                                                                                                                                                            for (i_34 = 0; i_34 < Client.staticInt180; i_34++) {
                                                                                                                                                                                friend_52 = Client.staticFriendArray1[i_34];
                                                                                                                                                                                str_60 = StaticClass53.staticMethod224(friend_52.string7, DataClass14.staticClass12_10);
                                                                                                                                                                                if (str_60 != null && str_60.equals(string_38)) {
                                                                                                                                                                                    StaticClass12.staticMethod59(31, "", "Please remove " + string_40 + " from your friend list first");
                                                                                                                                                                                    break label1218;
                                                                                                                                                                                }

                                                                                                                                                                                if (friend_52.string6 != null) {
                                                                                                                                                                                    string_53 = StaticClass53.staticMethod224(friend_52.string6, DataClass14.staticClass12_10);
                                                                                                                                                                                    if (string_53 != null && string_53.equals(string_38)) {
                                                                                                                                                                                        StaticClass12.staticMethod59(31, "", "Please remove " + string_40 + " from your friend list first");
                                                                                                                                                                                        break label1218;
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }

                                                                                                                                                                            if (StaticClass53.staticMethod224(BufferWrapper.staticPlayer1.name, DataClass14.staticClass12_10).equals(string_38))
                                                                                                                                                                                StaticClass12.staticMethod59(31, "", "You can\'t add yourself to your own ignore list");
                                                                                                                                                                            else {
                                                                                                                                                                                Client.staticPacket1.writeOpcode(159);
                                                                                                                                                                                Client.staticPacket1.writeByte(Buffer.staticMethod378(string_40));
                                                                                                                                                                                Client.staticPacket1.method430(string_40);
                                                                                                                                                                            }
                                                                                                                                                                            break;
                                                                                                                                                                        }

                                                                                                                                                                        ignore_51 = Client.staticIgnoreArray1[i_34];
                                                                                                                                                                        str_60 = StaticClass53.staticMethod224(ignore_51.string4, DataClass14.staticClass12_10);
                                                                                                                                                                        if (str_60 != null && str_60.equals(string_38)) {
                                                                                                                                                                            StaticClass12.staticMethod59(31, "", string_40 + " is already on your ignore list");
                                                                                                                                                                            break;
                                                                                                                                                                        }

                                                                                                                                                                        if (ignore_51.string5 != null) {
                                                                                                                                                                            string_53 = StaticClass53.staticMethod224(ignore_51.string5, DataClass14.staticClass12_10);
                                                                                                                                                                            if (string_53 != null && string_53.equals(string_38)) {
                                                                                                                                                                                StaticClass12.staticMethod59(31, "", string_40 + " is already on your ignore list");
                                                                                                                                                                                break;
                                                                                                                                                                            }
                                                                                                                                                                        }

                                                                                                                                                                        ++i_34;
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            } else
                                                                                                                                                                StaticClass12.staticMethod59(31, "", "Your ignore list is full. Max of 100 for free users, and 400 for members");

                                                                                                                                                        b_14 = 1;
                                                                                                                                                    } else if (i_8 == 3608) {
                                                                                                                                                        string_40 = staticStringArray2[--staticInt72];
                                                                                                                                                        if (string_40 != null) {
                                                                                                                                                            string_38 = StaticClass53.staticMethod224(string_40, DataClass14.staticClass12_10);
                                                                                                                                                            if (string_38 != null)
                                                                                                                                                                for (i_34 = 0; i_34 < Client.staticInt295; i_34++) {
                                                                                                                                                                    ignore_51 = Client.staticIgnoreArray1[i_34];
                                                                                                                                                                    str_60 = ignore_51.string4;
                                                                                                                                                                    string_53 = StaticClass53.staticMethod224(str_60, DataClass14.staticClass12_10);
                                                                                                                                                                    if (string_40 != null && str_60 != null) {
                                                                                                                                                                        if (!string_40.startsWith("#") && !str_60.startsWith("#"))
                                                                                                                                                                            bool_54 = string_38.equals(string_53);
                                                                                                                                                                        else
                                                                                                                                                                            bool_54 = string_40.equals(str_60);
                                                                                                                                                                    } else
                                                                                                                                                                        bool_54 = false;

                                                                                                                                                                    if (bool_54) {
                                                                                                                                                                        --Client.staticInt295;

                                                                                                                                                                        for (i_22 = i_34; i_22 < Client.staticInt295; i_22++)
                                                                                                                                                                            Client.staticIgnoreArray1[i_22] = Client.staticIgnoreArray1[i_22 + 1];

                                                                                                                                                                        Client.staticInt260 = Client.staticInt256;
                                                                                                                                                                        Client.staticPacket1.writeOpcode(79);
                                                                                                                                                                        Client.staticPacket1.writeByte(Buffer.staticMethod378(string_40));
                                                                                                                                                                        Client.staticPacket1.method430(string_40);
                                                                                                                                                                        break;
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                        }

                                                                                                                                                        b_14 = 1;
                                                                                                                                                    } else if (i_8 == 3609) {
                                                                                                                                                        string_40 = staticStringArray2[--staticInt72];
                                                                                                                                                        Class6[] arr_56 = Class6.staticMethod175();

                                                                                                                                                        for (i_34 = 0; i_34 < arr_56.length; i_34++) {
                                                                                                                                                            Class6 class6_48 = arr_56[i_34];
                                                                                                                                                            if (class6_48.int259 != -1) {
                                                                                                                                                                i_50 = class6_48.int259;
                                                                                                                                                                string_53 = "<img=" + i_50 + ">";
                                                                                                                                                                if (string_40.startsWith(string_53)) {
                                                                                                                                                                    string_40 = string_40.substring(6 + Integer.toString(class6_48.int259).length());
                                                                                                                                                                    break;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }

                                                                                                                                                        staticIntArray26[staticInt70++] = Client.staticMethod355(string_40, false) ? 1 : 0;
                                                                                                                                                        b_14 = 1;
                                                                                                                                                    } else if (i_8 == 3611) {
                                                                                                                                                        if (Client.staticString314 != null)
                                                                                                                                                            staticStringArray2[staticInt72++] = StaticClass54.staticMethod227(Client.staticString314);
                                                                                                                                                        else
                                                                                                                                                            staticStringArray2[staticInt72++] = "";

                                                                                                                                                        b_14 = 1;
                                                                                                                                                    } else if (i_8 == 3612) {
                                                                                                                                                        if (Client.staticString314 != null)
                                                                                                                                                            staticIntArray26[staticInt70++] = StaticClass62.staticInt158;
                                                                                                                                                        else
                                                                                                                                                            staticIntArray26[staticInt70++] = 0;

                                                                                                                                                        b_14 = 1;
                                                                                                                                                    } else if (i_8 == 3613) {
                                                                                                                                                        i_15 = staticIntArray26[--staticInt70];
                                                                                                                                                        if (Client.staticString314 != null && i_15 < StaticClass62.staticInt158)
                                                                                                                                                            staticStringArray2[staticInt72++] = Class1.staticClanMemberArray1[i_15].string19;
                                                                                                                                                        else
                                                                                                                                                            staticStringArray2[staticInt72++] = "";

                                                                                                                                                        b_14 = 1;
                                                                                                                                                    } else if (i_8 == 3614) {
                                                                                                                                                        i_15 = staticIntArray26[--staticInt70];
                                                                                                                                                        if (Client.staticString314 != null && i_15 < StaticClass62.staticInt158)
                                                                                                                                                            staticIntArray26[staticInt70++] = Class1.staticClanMemberArray1[i_15].int310;
                                                                                                                                                        else
                                                                                                                                                            staticIntArray26[staticInt70++] = 0;

                                                                                                                                                        b_14 = 1;
                                                                                                                                                    } else if (i_8 == 3615) {
                                                                                                                                                        i_15 = staticIntArray26[--staticInt70];
                                                                                                                                                        if (Client.staticString314 != null && i_15 < StaticClass62.staticInt158)
                                                                                                                                                            staticIntArray26[staticInt70++] = Class1.staticClanMemberArray1[i_15].byte3;
                                                                                                                                                        else
                                                                                                                                                            staticIntArray26[staticInt70++] = 0;

                                                                                                                                                        b_14 = 1;
                                                                                                                                                    } else if (i_8 == 3616) {
                                                                                                                                                        staticIntArray26[staticInt70++] = WM2.staticByte1;
                                                                                                                                                        b_14 = 1;
                                                                                                                                                    } else if (i_8 == 3617) {
                                                                                                                                                        string_40 = staticStringArray2[--staticInt72];
                                                                                                                                                        Client.staticMethod359(string_40);
                                                                                                                                                        b_14 = 1;
                                                                                                                                                    } else if (i_8 == 3618) {
                                                                                                                                                        staticIntArray26[staticInt70++] = DataClass7.staticByte2;
                                                                                                                                                        b_14 = 1;
                                                                                                                                                    } else if (i_8 == 3619) {
                                                                                                                                                        string_40 = staticStringArray2[--staticInt72];
                                                                                                                                                        if (!string_40.equals("")) {
                                                                                                                                                            Client.staticPacket1.writeOpcode(141);
                                                                                                                                                            Client.staticPacket1.writeByte(Buffer.staticMethod378(string_40));
                                                                                                                                                            Client.staticPacket1.method430(string_40);
                                                                                                                                                        }

                                                                                                                                                        b_14 = 1;
                                                                                                                                                    } else if (i_8 == 3620) {
                                                                                                                                                        Client.staticPacket1.writeOpcode(141);
                                                                                                                                                        Client.staticPacket1.writeByte(0);
                                                                                                                                                        b_14 = 1;
                                                                                                                                                    } else if (i_8 == 3621) {
                                                                                                                                                        if (Client.staticInt294 == 0)
                                                                                                                                                            staticIntArray26[staticInt70++] = -1;
                                                                                                                                                        else
                                                                                                                                                            staticIntArray26[staticInt70++] = Client.staticInt295;

                                                                                                                                                        b_14 = 1;
                                                                                                                                                    } else if (i_8 == 3622) {
                                                                                                                                                        i_15 = staticIntArray26[--staticInt70];
                                                                                                                                                        if (Client.staticInt294 != 0 && i_15 < Client.staticInt295) {
                                                                                                                                                            staticStringArray2[staticInt72++] = Client.staticIgnoreArray1[i_15].string4;
                                                                                                                                                            staticStringArray2[staticInt72++] = Client.staticIgnoreArray1[i_15].string5;
                                                                                                                                                        } else {
                                                                                                                                                            staticStringArray2[staticInt72++] = "";
                                                                                                                                                            staticStringArray2[staticInt72++] = "";
                                                                                                                                                        }

                                                                                                                                                        b_14 = 1;
                                                                                                                                                    } else if (i_8 == 3623) {
                                                                                                                                                        label1300: {
                                                                                                                                                            string_40 = staticStringArray2[--staticInt72];
                                                                                                                                                            string_42 = "<img=0>";
                                                                                                                                                            if (!string_40.startsWith(string_42)) {
                                                                                                                                                                str_60 = "<img=1>";
                                                                                                                                                                if (!string_40.startsWith(str_60))
                                                                                                                                                                    break label1300;
                                                                                                                                                            }

                                                                                                                                                            string_40 = string_40.substring(7);
                                                                                                                                                        }

                                                                                                                                                        staticIntArray26[staticInt70++] = Client.staticMethod356(string_40) ? 1 : 0;
                                                                                                                                                        b_14 = 1;
                                                                                                                                                    } else if (i_8 != 3624) {
                                                                                                                                                        if (i_8 == 3625) {
                                                                                                                                                            if (Client.staticString318 != null)
                                                                                                                                                                staticStringArray2[staticInt72++] = StaticClass54.staticMethod227(Client.staticString318);
                                                                                                                                                            else
                                                                                                                                                                staticStringArray2[staticInt72++] = "";

                                                                                                                                                            b_14 = 1;
                                                                                                                                                        } else
                                                                                                                                                            b_14 = 2;
                                                                                                                                                    } else {
                                                                                                                                                        i_15 = staticIntArray26[--staticInt70];
                                                                                                                                                        if (Class1.staticClanMemberArray1 != null && i_15 < StaticClass62.staticInt158 && Class1.staticClanMemberArray1[i_15].string19.equalsIgnoreCase(BufferWrapper.staticPlayer1.name))
                                                                                                                                                            staticIntArray26[staticInt70++] = 1;
                                                                                                                                                        else
                                                                                                                                                            staticIntArray26[staticInt70++] = 0;

                                                                                                                                                        b_14 = 1;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }

                                                                                                                                            i_13 = b_14;
                                                                                                                                        } else if (i_8 < 4000)
                                                                                                                                            i_13 = staticMethod92(i_8, runescriptdef_4, bool_43);
                                                                                                                                        else if (i_8 < 4100)
                                                                                                                                            i_13 = staticMethod93(i_8, runescriptdef_4, bool_43);
                                                                                                                                        else if (i_8 < 4200)
                                                                                                                                            i_13 = staticMethod94(i_8, runescriptdef_4, bool_43);
                                                                                                                                        else if (i_8 < 4300) {
                                                                                                                                            if (i_8 == 4200) {
                                                                                                                                                i_15 = staticIntArray26[--staticInt70];
                                                                                                                                                staticStringArray2[staticInt72++] = ObjType.staticMethod421(i_15).name;
                                                                                                                                                b_14 = 1;
                                                                                                                                            } else {
                                                                                                                                                ObjType objtype_57;
                                                                                                                                                if (i_8 == 4201) {
                                                                                                                                                    staticInt70 -= 2;
                                                                                                                                                    i_15 = staticIntArray26[staticInt70];
                                                                                                                                                    i_16 = staticIntArray26[staticInt70 + 1];
                                                                                                                                                    objtype_57 = ObjType.staticMethod421(i_15);
                                                                                                                                                    if (i_16 >= 1 && i_16 <= 5 && objtype_57.op[i_16 - 1] != null)
                                                                                                                                                        staticStringArray2[staticInt72++] = objtype_57.op[i_16 - 1];
                                                                                                                                                    else
                                                                                                                                                        staticStringArray2[staticInt72++] = "";

                                                                                                                                                    b_14 = 1;
                                                                                                                                                } else if (i_8 == 4202) {
                                                                                                                                                    staticInt70 -= 2;
                                                                                                                                                    i_15 = staticIntArray26[staticInt70];
                                                                                                                                                    i_16 = staticIntArray26[1 + staticInt70];
                                                                                                                                                    objtype_57 = ObjType.staticMethod421(i_15);
                                                                                                                                                    if (i_16 >= 1 && i_16 <= 5 && objtype_57.iop[i_16 - 1] != null)
                                                                                                                                                        staticStringArray2[staticInt72++] = objtype_57.iop[i_16 - 1];
                                                                                                                                                    else
                                                                                                                                                        staticStringArray2[staticInt72++] = "";

                                                                                                                                                    b_14 = 1;
                                                                                                                                                } else if (i_8 == 4203) {
                                                                                                                                                    i_15 = staticIntArray26[--staticInt70];
                                                                                                                                                    staticIntArray26[staticInt70++] = ObjType.staticMethod421(i_15).cost;
                                                                                                                                                    b_14 = 1;
                                                                                                                                                } else if (i_8 == 4204) {
                                                                                                                                                    i_15 = staticIntArray26[--staticInt70];
                                                                                                                                                    staticIntArray26[staticInt70++] = ObjType.staticMethod421(i_15).stackable == 1 ? 1 : 0;
                                                                                                                                                    b_14 = 1;
                                                                                                                                                } else {
                                                                                                                                                    ObjType objtype_59;
                                                                                                                                                    if (i_8 == 4205) {
                                                                                                                                                        i_15 = staticIntArray26[--staticInt70];
                                                                                                                                                        objtype_59 = ObjType.staticMethod421(i_15);
                                                                                                                                                        if (objtype_59.certtemplate == -1 && objtype_59.certlink >= 0)
                                                                                                                                                            staticIntArray26[staticInt70++] = objtype_59.certlink;
                                                                                                                                                        else
                                                                                                                                                            staticIntArray26[staticInt70++] = i_15;

                                                                                                                                                        b_14 = 1;
                                                                                                                                                    } else if (i_8 == 4206) {
                                                                                                                                                        i_15 = staticIntArray26[--staticInt70];
                                                                                                                                                        objtype_59 = ObjType.staticMethod421(i_15);
                                                                                                                                                        if (objtype_59.certtemplate >= 0 && objtype_59.certlink >= 0)
                                                                                                                                                            staticIntArray26[staticInt70++] = objtype_59.certlink;
                                                                                                                                                        else
                                                                                                                                                            staticIntArray26[staticInt70++] = i_15;

                                                                                                                                                        b_14 = 1;
                                                                                                                                                    } else if (i_8 == 4207) {
                                                                                                                                                        i_15 = staticIntArray26[--staticInt70];
                                                                                                                                                        staticIntArray26[staticInt70++] = ObjType.staticMethod421(i_15).members ? 1 : 0;
                                                                                                                                                        b_14 = 1;
                                                                                                                                                    } else if (i_8 == 4208) {
                                                                                                                                                        i_15 = staticIntArray26[--staticInt70];
                                                                                                                                                        objtype_59 = ObjType.staticMethod421(i_15);
                                                                                                                                                        if (objtype_59.int579 == -1 && objtype_59.int578 >= 0)
                                                                                                                                                            staticIntArray26[staticInt70++] = objtype_59.int578;
                                                                                                                                                        else
                                                                                                                                                            staticIntArray26[staticInt70++] = i_15;

                                                                                                                                                        b_14 = 1;
                                                                                                                                                    } else if (i_8 == 4209) {
                                                                                                                                                        i_15 = staticIntArray26[--staticInt70];
                                                                                                                                                        objtype_59 = ObjType.staticMethod421(i_15);
                                                                                                                                                        if (objtype_59.int579 >= 0 && objtype_59.int578 >= 0)
                                                                                                                                                            staticIntArray26[staticInt70++] = objtype_59.int578;
                                                                                                                                                        else
                                                                                                                                                            staticIntArray26[staticInt70++] = i_15;

                                                                                                                                                        b_14 = 1;
                                                                                                                                                    } else if (i_8 == 4210) {
                                                                                                                                                        string_40 = staticStringArray2[--staticInt72];
                                                                                                                                                        i_16 = staticIntArray26[--staticInt70];
                                                                                                                                                        Client.staticMethod365(string_40, i_16 == 1);
                                                                                                                                                        staticIntArray26[staticInt70++] = WM3.staticInt152;
                                                                                                                                                        b_14 = 1;
                                                                                                                                                    } else if (i_8 != 4211) {
                                                                                                                                                        if (i_8 == 4212) {
                                                                                                                                                            WMEnum2.staticInt155 = 0;
                                                                                                                                                            b_14 = 1;
                                                                                                                                                        } else
                                                                                                                                                            b_14 = 2;
                                                                                                                                                    } else {
                                                                                                                                                        if (WorldMapLabel.staticShortArray1 != null && WMEnum2.staticInt155 < WM3.staticInt152)
                                                                                                                                                            staticIntArray26[staticInt70++] = WorldMapLabel.staticShortArray1[WMEnum2.staticInt155++] & 0xffff;
                                                                                                                                                        else
                                                                                                                                                            staticIntArray26[staticInt70++] = -1;

                                                                                                                                                        b_14 = 1;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }

                                                                                                                                            i_13 = b_14;
                                                                                                                                        } else if (i_8 < 5100)
                                                                                                                                            i_13 = staticMethod95(i_8, runescriptdef_4, bool_43);
                                                                                                                                        else if (i_8 < 5400) {
                                                                                                                                            if (i_8 == 5306) {
                                                                                                                                                staticIntArray26[staticInt70++] = Client.staticMethod276();
                                                                                                                                                b_14 = 1;
                                                                                                                                            } else if (i_8 == 5307) {
                                                                                                                                                i_15 = staticIntArray26[--staticInt70];
                                                                                                                                                if (i_15 == 1 || i_15 == 2)
                                                                                                                                                    Client.staticMethod277(i_15);

                                                                                                                                                b_14 = 1;
                                                                                                                                            } else if (i_8 == 5308) {
                                                                                                                                                staticIntArray26[staticInt70++] = StaticClass61.staticClientPreferences1.int104;
                                                                                                                                                b_14 = 1;
                                                                                                                                            } else if (i_8 != 5309)
                                                                                                                                                b_14 = 2;
                                                                                                                                            else {
                                                                                                                                                i_15 = staticIntArray26[--staticInt70];
                                                                                                                                                if (i_15 == 1 || i_15 == 2) {
                                                                                                                                                    StaticClass61.staticClientPreferences1.int104 = i_15;
                                                                                                                                                    ClientPreferences.staticMethod63();
                                                                                                                                                }

                                                                                                                                                b_14 = 1;
                                                                                                                                            }

                                                                                                                                            i_13 = b_14;
                                                                                                                                        } else if (i_8 < 5600)
                                                                                                                                            i_13 = staticMethod96(i_8, runescriptdef_4, bool_43);
                                                                                                                                        else if (i_8 < 5700)
                                                                                                                                            i_13 = staticMethod97(i_8, runescriptdef_4, bool_43);
                                                                                                                                        else if (i_8 < 6300)
                                                                                                                                            i_13 = staticMethod98(i_8, runescriptdef_4, bool_43);
                                                                                                                                        else if (i_8 < 6600)
                                                                                                                                            i_13 = staticMethod99(i_8, runescriptdef_4, bool_43);
                                                                                                                                        else if (i_8 < 6700)
                                                                                                                                            i_13 = staticMethod100(i_8, runescriptdef_4, bool_43);
                                                                                                                                        else
                                                                                                                                            i_13 = 2;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }

                                                                                                                            switch (i_13) {
                                                                                                                            case 0:
                                                                                                                                return;
                                                                                                                            case 1:
                                                                                                                            default:
                                                                                                                                break;
                                                                                                                            case 2:
                                                                                                                                throw new IllegalStateException();
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
            } catch (Exception exception_23) {
                StringBuilder stringbuilder_30 = new StringBuilder(30);
                stringbuilder_30.append("").append(runescriptdef_4.id).append(" ");

                for (i_31 = staticInt71 - 1; i_31 >= 0; --i_31)
                    stringbuilder_30.append("").append(staticDataClass3Array1[i_31].runeScriptDef1.id).append(" ");

                stringbuilder_30.append("").append(b_29);
                ClientError.staticMethod113(stringbuilder_30.toString(), exception_23);
            }
        }
    }

    static int staticMethod81(int i_0, RuneScriptDef runescriptdef_1, boolean bool_2) {
        int i_4 = -1;
        Widget widget_5;
        if (i_0 >= 2000) {
            i_0 -= 1000;
            i_4 = staticIntArray26[--staticInt70];
            widget_5 = Widget.staticMethod381(i_4);
        } else
            widget_5 = bool_2 ? staticWidget4 : staticWidget3;

        if (i_0 == 1000) {
            staticInt70 -= 4;
            widget_5.int401 = staticIntArray26[staticInt70];
            widget_5.int402 = staticIntArray26[1 + staticInt70];
            widget_5.int390 = staticIntArray26[2 + staticInt70];
            widget_5.int398 = staticIntArray26[staticInt70 + 3];
            Client.staticMethod342(widget_5);
            NodeSub2.staticClient1.method408(widget_5);
            if (i_4 != -1 && widget_5.type == 0)
                Client.staticMethod328(StaticClass25.staticWidgetArrayArray1[i_4 >> 16], widget_5, false);

            return 1;
        } else if (i_0 == 1001) {
            staticInt70 -= 4;
            widget_5.int403 = staticIntArray26[staticInt70];
            widget_5.int404 = staticIntArray26[1 + staticInt70];
            widget_5.int399 = staticIntArray26[2 + staticInt70];
            widget_5.int400 = staticIntArray26[staticInt70 + 3];
            Client.staticMethod342(widget_5);
            NodeSub2.staticClient1.method408(widget_5);
            if (i_4 != -1 && widget_5.type == 0)
                Client.staticMethod328(StaticClass25.staticWidgetArrayArray1[i_4 >> 16], widget_5, false);

            return 1;
        } else if (i_0 == 1003) {
            boolean bool_6 = staticIntArray26[--staticInt70] == 1;
            if (widget_5.hidden != bool_6) {
                widget_5.hidden = bool_6;
                Client.staticMethod342(widget_5);
            }

            return 1;
        } else if (i_0 == 1005) {
            widget_5.bool44 = staticIntArray26[--staticInt70] == 1;
            return 1;
        } else if (i_0 == 1006) {
            widget_5.bool45 = staticIntArray26[--staticInt70] == 1;
            return 1;
        } else
            return 2;
    }

    static int staticMethod82(int i_0, RuneScriptDef runescriptdef_1, boolean bool_2) {
        int i_5 = -1;
        Widget widget_4;
        if (i_0 >= 2000) {
            i_0 -= 1000;
            i_5 = staticIntArray26[--staticInt70];
            widget_4 = Widget.staticMethod381(i_5);
        } else
            widget_4 = bool_2 ? staticWidget4 : staticWidget3;

        if (i_0 == 1100) {
            staticInt70 -= 2;
            widget_4.int419 = staticIntArray26[staticInt70];
            if (widget_4.int419 > widget_4.int413 - widget_4.int406)
                widget_4.int419 = widget_4.int413 - widget_4.int406;

            if (widget_4.int419 < 0)
                widget_4.int419 = 0;

            widget_4.int451 = staticIntArray26[staticInt70 + 1];
            if (widget_4.int451 > widget_4.int411 - widget_4.int407)
                widget_4.int451 = widget_4.int411 - widget_4.int407;

            if (widget_4.int451 < 0)
                widget_4.int451 = 0;

            Client.staticMethod342(widget_4);
            return 1;
        } else if (i_0 == 1101) {
            widget_4.int393 = staticIntArray26[--staticInt70];
            Client.staticMethod342(widget_4);
            return 1;
        } else if (i_0 == 1102) {
            widget_4.bool32 = staticIntArray26[--staticInt70] == 1;
            Client.staticMethod342(widget_4);
            return 1;
        } else if (i_0 == 1103) {
            widget_4.int416 = staticIntArray26[--staticInt70];
            Client.staticMethod342(widget_4);
            return 1;
        } else if (i_0 == 1104) {
            widget_4.int424 = staticIntArray26[--staticInt70];
            Client.staticMethod342(widget_4);
            return 1;
        } else if (i_0 == 1105) {
            widget_4.int440 = staticIntArray26[--staticInt70];
            Client.staticMethod342(widget_4);
            return 1;
        } else if (i_0 == 1106) {
            widget_4.int446 = staticIntArray26[--staticInt70];
            Client.staticMethod342(widget_4);
            return 1;
        } else if (i_0 == 1107) {
            widget_4.bool36 = staticIntArray26[--staticInt70] == 1;
            Client.staticMethod342(widget_4);
            return 1;
        } else if (i_0 == 1108) {
            widget_4.int423 = 1;
            widget_4.int409 = staticIntArray26[--staticInt70];
            Client.staticMethod342(widget_4);
            return 1;
        } else if (i_0 == 1109) {
            staticInt70 -= 6;
            widget_4.int427 = staticIntArray26[staticInt70];
            widget_4.int428 = staticIntArray26[1 + staticInt70];
            widget_4.int429 = staticIntArray26[2 + staticInt70];
            widget_4.int430 = staticIntArray26[3 + staticInt70];
            widget_4.int442 = staticIntArray26[staticInt70 + 4];
            widget_4.int397 = staticIntArray26[staticInt70 + 5];
            Client.staticMethod342(widget_4);
            return 1;
        } else {
            int i_9;
            if (i_0 == 1110) {
                i_9 = staticIntArray26[--staticInt70];
                if (i_9 != widget_4.int391) {
                    widget_4.int391 = i_9;
                    widget_4.int452 = 0;
                    widget_4.int455 = 0;
                    Client.staticMethod342(widget_4);
                }

                return 1;
            } else if (i_0 == 1111) {
                widget_4.bool38 = staticIntArray26[--staticInt70] == 1;
                Client.staticMethod342(widget_4);
                return 1;
            } else if (i_0 == 1112) {
                String string_10 = staticStringArray2[--staticInt72];
                if (!string_10.equals(widget_4.string25)) {
                    widget_4.string25 = string_10;
                    Client.staticMethod342(widget_4);
                }

                return 1;
            } else if (i_0 == 1113) {
                widget_4.int435 = staticIntArray26[--staticInt70];
                Client.staticMethod342(widget_4);
                return 1;
            } else if (i_0 == 1114) {
                staticInt70 -= 3;
                widget_4.int438 = staticIntArray26[staticInt70];
                widget_4.int439 = staticIntArray26[staticInt70 + 1];
                widget_4.int437 = staticIntArray26[staticInt70 + 2];
                Client.staticMethod342(widget_4);
                return 1;
            } else if (i_0 == 1115) {
                widget_4.bool43 = staticIntArray26[--staticInt70] == 1;
                Client.staticMethod342(widget_4);
                return 1;
            } else if (i_0 == 1116) {
                widget_4.int420 = staticIntArray26[--staticInt70];
                Client.staticMethod342(widget_4);
                return 1;
            } else if (i_0 == 1117) {
                widget_4.int450 = staticIntArray26[--staticInt70];
                Client.staticMethod342(widget_4);
                return 1;
            } else if (i_0 == 1118) {
                widget_4.bool37 = staticIntArray26[--staticInt70] == 1;
                Client.staticMethod342(widget_4);
                return 1;
            } else if (i_0 == 1119) {
                widget_4.bool33 = staticIntArray26[--staticInt70] == 1;
                Client.staticMethod342(widget_4);
                return 1;
            } else if (i_0 == 1120) {
                staticInt70 -= 2;
                widget_4.int413 = staticIntArray26[staticInt70];
                widget_4.int411 = staticIntArray26[staticInt70 + 1];
                Client.staticMethod342(widget_4);
                if (i_5 != -1 && widget_4.type == 0)
                    Client.staticMethod328(StaticClass25.staticWidgetArrayArray1[i_5 >> 16], widget_4, false);

                return 1;
            } else if (i_0 == 1121) {
                i_9 = widget_4.int444;
                int i_11 = widget_4.int394;
                Client.staticPacket1.writeOpcode(250);
                Client.staticPacket1.writeInt(i_9);
                Client.staticPacket1.method473(i_11);
                Client.staticWidget11 = widget_4;
                Client.staticMethod342(widget_4);
                return 1;
            } else if (i_0 == 1122) {
                widget_4.int412 = staticIntArray26[--staticInt70];
                Client.staticMethod342(widget_4);
                return 1;
            } else if (i_0 == 1123) {
                widget_4.int454 = staticIntArray26[--staticInt70];
                Client.staticMethod342(widget_4);
                return 1;
            } else if (i_0 == 1124) {
                widget_4.int417 = staticIntArray26[--staticInt70];
                Client.staticMethod342(widget_4);
                return 1;
            } else if (i_0 == 1125) {
                i_9 = staticIntArray26[--staticInt70];
                Class8[] arr_7 = new Class8[] { Class8.staticClass8_2, Class8.staticClass8_1, Class8.staticClass8_3, Class8.staticClass8_4, Class8.staticClass8_5 };
                Class8 class8_8 = (Class8) StaticClass26.staticMethod155(arr_7, i_9);
                if (class8_8 != null) {
                    widget_4.class8_1 = class8_8;
                    Client.staticMethod342(widget_4);
                }

                return 1;
            } else if (i_0 == 1126) {
                boolean bool_6 = staticIntArray26[--staticInt70] == 1;
                widget_4.bool39 = bool_6;
                return 1;
            } else
                return 2;
        }
    }

    static int staticMethod83(int i_0, RuneScriptDef runescriptdef_1, boolean bool_2) {
        Widget widget_4;
        if (i_0 >= 2000) {
            i_0 -= 1000;
            widget_4 = Widget.staticMethod381(staticIntArray26[--staticInt70]);
        } else
            widget_4 = bool_2 ? staticWidget4 : staticWidget3;

        Client.staticMethod342(widget_4);
        if (i_0 != 1200 && i_0 != 1205 && i_0 != 1212) {
            if (i_0 == 1201) {
                widget_4.int423 = 2;
                widget_4.int409 = staticIntArray26[--staticInt70];
                return 1;
            } else if (i_0 == 1202) {
                widget_4.int423 = 3;
                widget_4.int409 = BufferWrapper.staticPlayer1.playerDef1.method304();
                return 1;
            } else
                return 2;
        } else {
            staticInt70 -= 2;
            int i_5 = staticIntArray26[staticInt70];
            int i_6 = staticIntArray26[1 + staticInt70];
            widget_4.int453 = i_5;
            widget_4.int456 = i_6;
            ObjType objtype_7 = ObjType.staticMethod421(i_5);
            widget_4.int429 = objtype_7.xan2d;
            widget_4.int430 = objtype_7.yan2d;
            widget_4.int442 = objtype_7.zan2d;
            widget_4.int427 = objtype_7.xof2d;
            widget_4.int428 = objtype_7.yof2d;
            widget_4.int397 = objtype_7.zoom2d;
            if (i_0 == 1205)
                widget_4.int434 = 0;
            else if (i_0 == 1212 | objtype_7.stackable == 1)
                widget_4.int434 = 1;
            else
                widget_4.int434 = 2;

            if (widget_4.int432 > 0)
                widget_4.int397 = widget_4.int397 * 32 / widget_4.int432;
            else if (widget_4.int403 > 0)
                widget_4.int397 = widget_4.int397 * 32 / widget_4.int403;

            return 1;
        }
    }

    static int staticMethod84(int i_0, RuneScriptDef runescriptdef_1, boolean bool_2) {
        Widget widget_4;
        if (i_0 >= 2000) {
            i_0 -= 1000;
            widget_4 = Widget.staticMethod381(staticIntArray26[--staticInt70]);
        } else
            widget_4 = bool_2 ? staticWidget4 : staticWidget3;

        int i_5;
        if (i_0 == 1300) {
            i_5 = staticIntArray26[--staticInt70] - 1;
            if (i_5 >= 0 && i_5 <= 9) {
                widget_4.method505(i_5, staticStringArray2[--staticInt72]);
                return 1;
            } else {
                --staticInt72;
                return 1;
            }
        } else if (i_0 == 1301) {
            staticInt70 -= 2;
            i_5 = staticIntArray26[staticInt70];
            int i_6 = staticIntArray26[staticInt70 + 1];
            widget_4.widget3 = Widget.staticMethod382(i_5, i_6);
            return 1;
        } else if (i_0 == 1302) {
            widget_4.bool40 = staticIntArray26[--staticInt70] == 1;
            return 1;
        } else if (i_0 == 1303) {
            widget_4.int443 = staticIntArray26[--staticInt70];
            return 1;
        } else if (i_0 == 1304) {
            widget_4.int448 = staticIntArray26[--staticInt70];
            return 1;
        } else if (i_0 == 1305) {
            widget_4.string24 = staticStringArray2[--staticInt72];
            return 1;
        } else if (i_0 == 1306) {
            widget_4.string26 = staticStringArray2[--staticInt72];
            return 1;
        } else if (i_0 == 1307) {
            widget_4.stringArray3 = null;
            return 1;
        } else
            return 2;
    }

    static int staticMethod85(int i_0, RuneScriptDef runescriptdef_1, boolean bool_2) {
        Widget widget_4;
        if (i_0 >= 2000) {
            i_0 -= 1000;
            widget_4 = Widget.staticMethod381(staticIntArray26[--staticInt70]);
        } else
            widget_4 = bool_2 ? staticWidget4 : staticWidget3;

        String string_5 = staticStringArray2[--staticInt72];
        int[] ints_6 = null;
        if (string_5.length() > 0 && string_5.charAt(string_5.length() - 1) == 89) {
            int i_7 = staticIntArray26[--staticInt70];
            if (i_7 > 0)
                for (ints_6 = new int[i_7]; i_7-- > 0; ints_6[i_7] = staticIntArray26[--staticInt70])
                    ;

            string_5 = string_5.substring(0, string_5.length() - 1);
        }

        Object[] arr_9 = new Object[string_5.length() + 1];

        int i_8;
        for (i_8 = arr_9.length - 1; i_8 >= 1; --i_8)
            if (string_5.charAt(i_8 - 1) == 115)
                arr_9[i_8] = staticStringArray2[--staticInt72];
            else
                arr_9[i_8] = new Integer(staticIntArray26[--staticInt70]);

        i_8 = staticIntArray26[--staticInt70];
        if (i_8 != -1)
            arr_9[0] = new Integer(i_8);
        else
            arr_9 = null;

        if (i_0 == 1400)
            widget_4.objectArray3 = arr_9;
        else if (i_0 == 1401)
            widget_4.objectArray28 = arr_9;
        else if (i_0 == 1402)
            widget_4.objectArray9 = arr_9;
        else if (i_0 == 1403)
            widget_4.objectArray10 = arr_9;
        else if (i_0 == 1404)
            widget_4.objectArray29 = arr_9;
        else if (i_0 == 1405)
            widget_4.objectArray12 = arr_9;
        else if (i_0 == 1406)
            widget_4.objectArray15 = arr_9;
        else if (i_0 == 1407) {
            widget_4.objectArray16 = arr_9;
            widget_4.intArray55 = ints_6;
        } else if (i_0 == 1408)
            widget_4.objectArray5 = arr_9;
        else if (i_0 == 1409)
            widget_4.objectArray18 = arr_9;
        else if (i_0 == 1410)
            widget_4.objectArray13 = arr_9;
        else if (i_0 == 1411)
            widget_4.objectArray8 = arr_9;
        else if (i_0 == 1412)
            widget_4.objectArray11 = arr_9;
        else if (i_0 == 1414) {
            widget_4.objectArray17 = arr_9;
            widget_4.intArray60 = ints_6;
        } else if (i_0 == 1415) {
            widget_4.objectArray6 = arr_9;
            widget_4.intArray56 = ints_6;
        } else if (i_0 == 1416)
            widget_4.objectArray14 = arr_9;
        else if (i_0 == 1417)
            widget_4.objectArray21 = arr_9;
        else if (i_0 == 1418)
            widget_4.objectArray19 = arr_9;
        else if (i_0 == 1419)
            widget_4.objectArray20 = arr_9;
        else if (i_0 == 1420)
            widget_4.objectArray2 = arr_9;
        else if (i_0 == 1421)
            widget_4.objectArray4 = arr_9;
        else if (i_0 == 1422)
            widget_4.objectArray27 = arr_9;
        else if (i_0 == 1423)
            widget_4.objectArray22 = arr_9;
        else if (i_0 == 1424)
            widget_4.objectArray23 = arr_9;
        else if (i_0 == 1425)
            widget_4.objectArray25 = arr_9;
        else if (i_0 == 1426)
            widget_4.objectArray26 = arr_9;
        else {
            if (i_0 != 1427)
                return 2;

            widget_4.objectArray24 = arr_9;
        }

        widget_4.bool42 = true;
        return 1;
    }

    static int staticMethod86(int i_0, RuneScriptDef runescriptdef_1, boolean bool_2) {
        Widget widget_4 = bool_2 ? staticWidget4 : staticWidget3;
        if (i_0 == 1500) {
            staticIntArray26[staticInt70++] = widget_4.int405;
            return 1;
        } else if (i_0 == 1501) {
            staticIntArray26[staticInt70++] = widget_4.int410;
            return 1;
        } else if (i_0 == 1502) {
            staticIntArray26[staticInt70++] = widget_4.int406;
            return 1;
        } else if (i_0 == 1503) {
            staticIntArray26[staticInt70++] = widget_4.int407;
            return 1;
        } else if (i_0 == 1504) {
            staticIntArray26[staticInt70++] = widget_4.hidden ? 1 : 0;
            return 1;
        } else if (i_0 == 1505) {
            staticIntArray26[staticInt70++] = widget_4.parentId;
            return 1;
        } else
            return 2;
    }

    static int staticMethod87(int i_0, RuneScriptDef runescriptdef_1, boolean bool_2) {
        Widget widget_4 = bool_2 ? staticWidget4 : staticWidget3;
        if (i_0 == 1700) {
            staticIntArray26[staticInt70++] = widget_4.int453;
            return 1;
        } else if (i_0 == 1701) {
            if (widget_4.int453 != -1)
                staticIntArray26[staticInt70++] = widget_4.int456;
            else
                staticIntArray26[staticInt70++] = 0;

            return 1;
        } else if (i_0 == 1702) {
            staticIntArray26[staticInt70++] = widget_4.int394;
            return 1;
        } else
            return 2;
    }

    static int staticMethod88(int i_0, RuneScriptDef runescriptdef_1, boolean bool_2) {
        Widget widget_4;
        if (i_0 >= 2000) {
            i_0 -= 1000;
            widget_4 = Widget.staticMethod381(staticIntArray26[--staticInt70]);
        } else
            widget_4 = bool_2 ? staticWidget4 : staticWidget3;

        if (i_0 == 1927) {
            if (staticInt73 >= 10)
                throw new RuntimeException();
            else if (widget_4.objectArray24 == null)
                return 0;
            else {
                RuneScript runescript_5 = new RuneScript();
                runescript_5.widget2 = widget_4;
                runescript_5.objectArray1 = widget_4.objectArray24;
                runescript_5.int316 = staticInt73 + 1;
                Client.staticDeque8.method253(runescript_5);
                return 1;
            }
        } else
            return 2;
    }

    static int staticMethod89(int i_0, RuneScriptDef runescriptdef_1, boolean bool_2) {
        Widget widget_4 = Widget.staticMethod381(staticIntArray26[--staticInt70]);
        if (i_0 == 2500) {
            staticIntArray26[staticInt70++] = widget_4.int405;
            return 1;
        } else if (i_0 == 2501) {
            staticIntArray26[staticInt70++] = widget_4.int410;
            return 1;
        } else if (i_0 == 2502) {
            staticIntArray26[staticInt70++] = widget_4.int406;
            return 1;
        } else if (i_0 == 2503) {
            staticIntArray26[staticInt70++] = widget_4.int407;
            return 1;
        } else if (i_0 == 2504) {
            staticIntArray26[staticInt70++] = widget_4.hidden ? 1 : 0;
            return 1;
        } else if (i_0 == 2505) {
            staticIntArray26[staticInt70++] = widget_4.parentId;
            return 1;
        } else
            return 2;
    }

    static int staticMethod90(int i_0, RuneScriptDef runescriptdef_1, boolean bool_2) {
        Widget widget_6;
        if (i_0 == 2700) {
            widget_6 = Widget.staticMethod381(staticIntArray26[--staticInt70]);
            staticIntArray26[staticInt70++] = widget_6.int453;
            return 1;
        } else if (i_0 == 2701) {
            widget_6 = Widget.staticMethod381(staticIntArray26[--staticInt70]);
            if (widget_6.int453 != -1)
                staticIntArray26[staticInt70++] = widget_6.int456;
            else
                staticIntArray26[staticInt70++] = 0;

            return 1;
        } else if (i_0 == 2702) {
            int i_4 = staticIntArray26[--staticInt70];
            NodeSub1 nodesub1_5 = (NodeSub1) Client.staticHashTable7.get(i_4);
            if (nodesub1_5 != null)
                staticIntArray26[staticInt70++] = 1;
            else
                staticIntArray26[staticInt70++] = 0;

            return 1;
        } else if (i_0 == 2706) {
            staticIntArray26[staticInt70++] = Client.staticInt241;
            return 1;
        } else
            return 2;
    }

    static int staticMethod91(int i_0, RuneScriptDef runescriptdef_1, boolean bool_2) {
        if (i_0 == 3200) {
            staticInt70 -= 3;
            Client.staticMethod266(staticIntArray26[staticInt70], staticIntArray26[1 + staticInt70], staticIntArray26[staticInt70 + 2]);
            return 1;
        } else {
            int i_4;
            if (i_0 != 3201) {
                if (i_0 == 3202) {
                    staticInt70 -= 2;
                    i_4 = staticIntArray26[staticInt70];
                    int i_7 = staticIntArray26[staticInt70 + 1];
                    if (Client.staticInt197 != 0 && i_4 != -1) {
                        StaticClass32.staticMethod164(Renderable.staticJs5IndexImpl15, i_4, 0, Client.staticInt197, false);
                        Client.staticBool43 = true;
                    }

                    return 1;
                } else
                    return 2;
            } else {
                i_4 = staticIntArray26[--staticInt70];
                if (i_4 == -1 && !Client.staticBool43)
                    StaticClass32.staticMethod166();
                else if (i_4 != -1 && i_4 != Client.staticInt248 && Client.staticInt197 != 0 && !Client.staticBool43) {
                    Index js5indeximpl_5 = StaticClass54.staticJs5IndexImpl11;
                    int i_6 = Client.staticInt197;
                    StaticClass32.staticInt133 = 1;
                    StaticClass32.staticJs5Index6 = js5indeximpl_5;
                    StaticClass32.staticInt132 = i_4;
                    AnimFrame.staticInt306 = 0;
                    WorldMap.staticInt109 = i_6;
                    GraphicsBuffer.staticBool23 = false;
                    WorldMapLoadingProgress.staticInt150 = 2;
                }

                Client.staticInt248 = i_4;
                return 1;
            }
        }
    }

    static int staticMethod92(int i_0, RuneScriptDef runescriptdef_1, boolean bool_2) {
        int i_4;
        if (i_0 == 3903) {
            i_4 = staticIntArray26[--staticInt70];
            staticIntArray26[staticInt70++] = Client.staticExchangeOfferArray1[i_4].method312();
            return 1;
        } else if (i_0 == 3904) {
            i_4 = staticIntArray26[--staticInt70];
            staticIntArray26[staticInt70++] = Client.staticExchangeOfferArray1[i_4].int272;
            return 1;
        } else if (i_0 == 3905) {
            i_4 = staticIntArray26[--staticInt70];
            staticIntArray26[staticInt70++] = Client.staticExchangeOfferArray1[i_4].int268;
            return 1;
        } else if (i_0 == 3906) {
            i_4 = staticIntArray26[--staticInt70];
            staticIntArray26[staticInt70++] = Client.staticExchangeOfferArray1[i_4].int269;
            return 1;
        } else if (i_0 == 3907) {
            i_4 = staticIntArray26[--staticInt70];
            staticIntArray26[staticInt70++] = Client.staticExchangeOfferArray1[i_4].int270;
            return 1;
        } else if (i_0 == 3908) {
            i_4 = staticIntArray26[--staticInt70];
            staticIntArray26[staticInt70++] = Client.staticExchangeOfferArray1[i_4].int271;
            return 1;
        } else {
            int i_14;
            if (i_0 == 3910) {
                i_4 = staticIntArray26[--staticInt70];
                i_14 = Client.staticExchangeOfferArray1[i_4].method311();
                staticIntArray26[staticInt70++] = i_14 == 0 ? 1 : 0;
                return 1;
            } else if (i_0 == 3911) {
                i_4 = staticIntArray26[--staticInt70];
                i_14 = Client.staticExchangeOfferArray1[i_4].method311();
                staticIntArray26[staticInt70++] = i_14 == 2 ? 1 : 0;
                return 1;
            } else if (i_0 == 3912) {
                i_4 = staticIntArray26[--staticInt70];
                i_14 = Client.staticExchangeOfferArray1[i_4].method311();
                staticIntArray26[staticInt70++] = i_14 == 5 ? 1 : 0;
                return 1;
            } else if (i_0 == 3913) {
                i_4 = staticIntArray26[--staticInt70];
                i_14 = Client.staticExchangeOfferArray1[i_4].method311();
                staticIntArray26[staticInt70++] = i_14 == 1 ? 1 : 0;
                return 1;
            } else {
                boolean bool_12;
                if (i_0 == 3914) {
                    bool_12 = staticIntArray26[--staticInt70] == 1;
                    if (ExchangeOfferComparator2.staticClass13_1 != null)
                        ExchangeOfferComparator2.staticClass13_1.method384(Class13.staticComparator4, bool_12);

                    return 1;
                } else if (i_0 == 3915) {
                    bool_12 = staticIntArray26[--staticInt70] == 1;
                    if (ExchangeOfferComparator2.staticClass13_1 != null)
                        ExchangeOfferComparator2.staticClass13_1.method384(Class13.staticComparator1, bool_12);

                    return 1;
                } else if (i_0 == 3916) {
                    staticInt70 -= 2;
                    bool_12 = staticIntArray26[staticInt70] == 1;
                    boolean bool_13 = staticIntArray26[1 + staticInt70] == 1;
                    if (ExchangeOfferComparator2.staticClass13_1 != null)
                        ExchangeOfferComparator2.staticClass13_1.method384(new ExchangeOfferComparator4(bool_13), bool_12);

                    return 1;
                } else if (i_0 == 3917) {
                    bool_12 = staticIntArray26[--staticInt70] == 1;
                    if (ExchangeOfferComparator2.staticClass13_1 != null)
                        ExchangeOfferComparator2.staticClass13_1.method384(Class13.staticComparator2, bool_12);

                    return 1;
                } else if (i_0 == 3918) {
                    bool_12 = staticIntArray26[--staticInt70] == 1;
                    if (ExchangeOfferComparator2.staticClass13_1 != null)
                        ExchangeOfferComparator2.staticClass13_1.method384(Class13.staticComparator3, bool_12);

                    return 1;
                } else if (i_0 == 3919) {
                    staticIntArray26[staticInt70++] = ExchangeOfferComparator2.staticClass13_1 == null ? 0 : ExchangeOfferComparator2.staticClass13_1.list3.size();
                    return 1;
                } else {
                    Class3 class3_5;
                    if (i_0 == 3920) {
                        i_4 = staticIntArray26[--staticInt70];
                        class3_5 = (Class3) ExchangeOfferComparator2.staticClass13_1.list3.get(i_4);
                        staticIntArray26[staticInt70++] = class3_5.int78;
                        return 1;
                    } else if (i_0 == 3921) {
                        i_4 = staticIntArray26[--staticInt70];
                        class3_5 = (Class3) ExchangeOfferComparator2.staticClass13_1.list3.get(i_4);
                        staticStringArray2[staticInt72++] = class3_5.method94();
                        return 1;
                    } else if (i_0 == 3922) {
                        i_4 = staticIntArray26[--staticInt70];
                        class3_5 = (Class3) ExchangeOfferComparator2.staticClass13_1.list3.get(i_4);
                        staticStringArray2[staticInt72++] = class3_5.method95();
                        return 1;
                    } else if (i_0 == 3923) {
                        i_4 = staticIntArray26[--staticInt70];
                        class3_5 = (Class3) ExchangeOfferComparator2.staticClass13_1.list3.get(i_4);
                        long long_6 = StaticClass27.synchronizedMethod7() - JavaxSoundSystemProvider.staticLong1 - class3_5.long1;
                        int i_8 = (int) (long_6 / 3600000L);
                        int i_9 = (int) ((long_6 - i_8 * 3600000) / 60000L);
                        int i_10 = (int) ((long_6 - i_8 * 3600000 - i_9 * 60000) / 1000L);
                        String string_11 = i_8 + ":" + i_9 / 10 + i_9 % 10 + ":" + i_10 / 10 + i_10 % 10;
                        staticStringArray2[staticInt72++] = string_11;
                        return 1;
                    } else if (i_0 == 3924) {
                        i_4 = staticIntArray26[--staticInt70];
                        class3_5 = (Class3) ExchangeOfferComparator2.staticClass13_1.list3.get(i_4);
                        staticIntArray26[staticInt70++] = class3_5.exchangeOffer1.int269;
                        return 1;
                    } else if (i_0 == 3925) {
                        i_4 = staticIntArray26[--staticInt70];
                        class3_5 = (Class3) ExchangeOfferComparator2.staticClass13_1.list3.get(i_4);
                        staticIntArray26[staticInt70++] = class3_5.exchangeOffer1.int268;
                        return 1;
                    } else if (i_0 == 3926) {
                        i_4 = staticIntArray26[--staticInt70];
                        class3_5 = (Class3) ExchangeOfferComparator2.staticClass13_1.list3.get(i_4);
                        staticIntArray26[staticInt70++] = class3_5.exchangeOffer1.int272;
                        return 1;
                    } else
                        return 2;
                }
            }
        }
    }

    static int staticMethod93(int i_0, RuneScriptDef runescriptdef_1, boolean bool_2) {
        int i_5;
        int i_10;
        if (i_0 == 4000) {
            staticInt70 -= 2;
            i_10 = staticIntArray26[staticInt70];
            i_5 = staticIntArray26[1 + staticInt70];
            staticIntArray26[staticInt70++] = i_10 + i_5;
            return 1;
        } else if (i_0 == 4001) {
            staticInt70 -= 2;
            i_10 = staticIntArray26[staticInt70];
            i_5 = staticIntArray26[1 + staticInt70];
            staticIntArray26[staticInt70++] = i_10 - i_5;
            return 1;
        } else if (i_0 == 4002) {
            staticInt70 -= 2;
            i_10 = staticIntArray26[staticInt70];
            i_5 = staticIntArray26[staticInt70 + 1];
            staticIntArray26[staticInt70++] = i_5 * i_10;
            return 1;
        } else if (i_0 == 4003) {
            staticInt70 -= 2;
            i_10 = staticIntArray26[staticInt70];
            i_5 = staticIntArray26[staticInt70 + 1];
            staticIntArray26[staticInt70++] = i_10 / i_5;
            return 1;
        } else if (i_0 == 4004) {
            i_10 = staticIntArray26[--staticInt70];
            staticIntArray26[staticInt70++] = (int) (Math.random() * i_10);
            return 1;
        } else if (i_0 == 4005) {
            i_10 = staticIntArray26[--staticInt70];
            staticIntArray26[staticInt70++] = (int) (Math.random() * (i_10 + 1));
            return 1;
        } else if (i_0 == 4006) {
            staticInt70 -= 5;
            i_10 = staticIntArray26[staticInt70];
            i_5 = staticIntArray26[1 + staticInt70];
            int i_11 = staticIntArray26[2 + staticInt70];
            int i_7 = staticIntArray26[3 + staticInt70];
            int i_12 = staticIntArray26[staticInt70 + 4];
            staticIntArray26[staticInt70++] = i_10 + (i_5 - i_10) * (i_12 - i_11) / (i_7 - i_11);
            return 1;
        } else if (i_0 == 4007) {
            staticInt70 -= 2;
            i_10 = staticIntArray26[staticInt70];
            i_5 = staticIntArray26[1 + staticInt70];
            staticIntArray26[staticInt70++] = i_10 + i_5 * i_10 / 100;
            return 1;
        } else if (i_0 == 4008) {
            staticInt70 -= 2;
            i_10 = staticIntArray26[staticInt70];
            i_5 = staticIntArray26[1 + staticInt70];
            staticIntArray26[staticInt70++] = i_10 | 1 << i_5;
            return 1;
        } else if (i_0 == 4009) {
            staticInt70 -= 2;
            i_10 = staticIntArray26[staticInt70];
            i_5 = staticIntArray26[1 + staticInt70];
            staticIntArray26[staticInt70++] = i_10 & -1 - (1 << i_5);
            return 1;
        } else if (i_0 == 4010) {
            staticInt70 -= 2;
            i_10 = staticIntArray26[staticInt70];
            i_5 = staticIntArray26[1 + staticInt70];
            staticIntArray26[staticInt70++] = (i_10 & 1 << i_5) != 0 ? 1 : 0;
            return 1;
        } else if (i_0 == 4011) {
            staticInt70 -= 2;
            i_10 = staticIntArray26[staticInt70];
            i_5 = staticIntArray26[staticInt70 + 1];
            staticIntArray26[staticInt70++] = i_10 % i_5;
            return 1;
        } else if (i_0 == 4012) {
            staticInt70 -= 2;
            i_10 = staticIntArray26[staticInt70];
            i_5 = staticIntArray26[staticInt70 + 1];
            if (i_10 == 0)
                staticIntArray26[staticInt70++] = 0;
            else
                staticIntArray26[staticInt70++] = (int) Math.pow(i_10, i_5);

            return 1;
        } else if (i_0 == 4013) {
            staticInt70 -= 2;
            i_10 = staticIntArray26[staticInt70];
            i_5 = staticIntArray26[staticInt70 + 1];
            if (i_10 == 0) {
                staticIntArray26[staticInt70++] = 0;
                return 1;
            } else {
                switch (i_5) {
                case 0:
                    staticIntArray26[staticInt70++] = Integer.MAX_VALUE;
                    break;
                case 1:
                    staticIntArray26[staticInt70++] = i_10;
                    break;
                case 2:
                    staticIntArray26[staticInt70++] = (int) Math.sqrt(i_10);
                    break;
                case 3:
                    staticIntArray26[staticInt70++] = (int) Math.cbrt(i_10);
                    break;
                case 4:
                    staticIntArray26[staticInt70++] = (int) Math.sqrt(Math.sqrt(i_10));
                    break;
                default:
                    staticIntArray26[staticInt70++] = (int) Math.pow(i_10, 1.0D / i_5);
                }

                return 1;
            }
        } else if (i_0 == 4014) {
            staticInt70 -= 2;
            i_10 = staticIntArray26[staticInt70];
            i_5 = staticIntArray26[staticInt70 + 1];
            staticIntArray26[staticInt70++] = i_10 & i_5;
            return 1;
        } else if (i_0 == 4015) {
            staticInt70 -= 2;
            i_10 = staticIntArray26[staticInt70];
            i_5 = staticIntArray26[1 + staticInt70];
            staticIntArray26[staticInt70++] = i_10 | i_5;
            return 1;
        } else if (i_0 == 4018) {
            staticInt70 -= 3;
            long long_4 = staticIntArray26[staticInt70];
            long long_6 = staticIntArray26[1 + staticInt70];
            long long_8 = staticIntArray26[staticInt70 + 2];
            staticIntArray26[staticInt70++] = (int) (long_8 * long_4 / long_6);
            return 1;
        } else
            return 2;
    }

    static int staticMethod94(int i_0, RuneScriptDef runescriptdef_1, boolean bool_2) {
        String string_18;
        int i_20;
        if (i_0 == 4100) {
            string_18 = staticStringArray2[--staticInt72];
            i_20 = staticIntArray26[--staticInt70];
            staticStringArray2[staticInt72++] = string_18 + i_20;
            return 1;
        } else {
            String string_19;
            if (i_0 == 4101) {
                staticInt72 -= 2;
                string_18 = staticStringArray2[staticInt72];
                string_19 = staticStringArray2[1 + staticInt72];
                staticStringArray2[staticInt72++] = string_18 + string_19;
                return 1;
            } else {
                int i_23;
                if (i_0 == 4102) {
                    string_18 = staticStringArray2[--staticInt72];
                    i_20 = staticIntArray26[--staticInt70];
                    String[] arr_31 = staticStringArray2;
                    i_23 = staticInt72++;
                    String string_29;
                    if (i_20 < 0)
                        string_29 = Integer.toString(i_20);
                    else {
                        int i_11 = i_20;
                        String string_10;
                        if (i_20 < 0)
                            string_10 = Integer.toString(i_20, 10);
                        else {
                            int i_12 = 2;

                            for (int i_13 = i_20 / 10; i_13 != 0; i_12++)
                                i_13 /= 10;

                            char[] arr_14 = new char[i_12];
                            arr_14[0] = 43;

                            for (int i_15 = i_12 - 1; i_15 > 0; --i_15) {
                                int i_16 = i_11;
                                i_11 /= 10;
                                int i_17 = i_16 - i_11 * 10;
                                if (i_17 >= 10)
                                    arr_14[i_15] = (char) (i_17 + 87);
                                else
                                    arr_14[i_15] = (char) (i_17 + 48);
                            }

                            string_10 = new String(arr_14);
                        }

                        string_29 = string_10;
                    }

                    arr_31[i_23] = string_18 + string_29;
                    return 1;
                } else if (i_0 == 4103) {
                    string_18 = staticStringArray2[--staticInt72];
                    staticStringArray2[staticInt72++] = string_18.toLowerCase();
                    return 1;
                } else {
                    int i_4;
                    if (i_0 == 4104) {
                        i_4 = staticIntArray26[--staticInt70];
                        long long_26 = (i_4 + 11745L) * 86400000L;
                        staticCalendar1.setTime(new Date(long_26));
                        i_23 = staticCalendar1.get(5);
                        int i_30 = staticCalendar1.get(2);
                        int i_9 = staticCalendar1.get(1);
                        staticStringArray2[staticInt72++] = i_23 + "-" + staticStringArray1[i_30] + "-" + i_9;
                        return 1;
                    } else if (i_0 == 4105) {
                        staticInt72 -= 2;
                        string_18 = staticStringArray2[staticInt72];
                        string_19 = staticStringArray2[1 + staticInt72];
                        if (BufferWrapper.staticPlayer1.playerDef1 != null && BufferWrapper.staticPlayer1.playerDef1.female)
                            staticStringArray2[staticInt72++] = string_19;
                        else
                            staticStringArray2[staticInt72++] = string_18;

                        return 1;
                    } else if (i_0 == 4106) {
                        i_4 = staticIntArray26[--staticInt70];
                        staticStringArray2[staticInt72++] = Integer.toString(i_4);
                        return 1;
                    } else if (i_0 == 4107) {
                        staticInt72 -= 2;
                        int[] ints_25 = staticIntArray26;
                        i_20 = staticInt70++;
                        i_23 = StaticClass24.staticMethod141(staticStringArray2[staticInt72], staticStringArray2[1 + staticInt72], Client.staticInt163);
                        byte b_27;
                        if (i_23 > 0)
                            b_27 = 1;
                        else if (i_23 < 0)
                            b_27 = -1;
                        else
                            b_27 = 0;

                        ints_25[i_20] = b_27;
                        return 1;
                    } else {
                        int i_6;
                        byte[] bytes_24;
                        FontFace fontface_28;
                        if (i_0 == 4108) {
                            string_18 = staticStringArray2[--staticInt72];
                            staticInt70 -= 2;
                            i_20 = staticIntArray26[staticInt70];
                            i_6 = staticIntArray26[staticInt70 + 1];
                            bytes_24 = WorldMapTile.staticJs5IndexImpl1.getFile(i_6, 0);
                            fontface_28 = new FontFace(bytes_24);
                            staticIntArray26[staticInt70++] = fontface_28.method663(string_18, i_20);
                            return 1;
                        } else if (i_0 == 4109) {
                            string_18 = staticStringArray2[--staticInt72];
                            staticInt70 -= 2;
                            i_20 = staticIntArray26[staticInt70];
                            i_6 = staticIntArray26[1 + staticInt70];
                            bytes_24 = WorldMapTile.staticJs5IndexImpl1.getFile(i_6, 0);
                            fontface_28 = new FontFace(bytes_24);
                            staticIntArray26[staticInt70++] = fontface_28.method662(string_18, i_20);
                            return 1;
                        } else if (i_0 == 4110) {
                            staticInt72 -= 2;
                            string_18 = staticStringArray2[staticInt72];
                            string_19 = staticStringArray2[1 + staticInt72];
                            if (staticIntArray26[--staticInt70] == 1)
                                staticStringArray2[staticInt72++] = string_18;
                            else
                                staticStringArray2[staticInt72++] = string_19;

                            return 1;
                        } else if (i_0 == 4111) {
                            string_18 = staticStringArray2[--staticInt72];
                            staticStringArray2[staticInt72++] = TypeFace.staticMethod495(string_18);
                            return 1;
                        } else if (i_0 == 4112) {
                            string_18 = staticStringArray2[--staticInt72];
                            i_20 = staticIntArray26[--staticInt70];
                            staticStringArray2[staticInt72++] = string_18 + (char) i_20;
                            return 1;
                        } else if (i_0 == 4113) {
                            i_4 = staticIntArray26[--staticInt70];
                            staticIntArray26[staticInt70++] = StaticClass51.staticMethod216((char) i_4) ? 1 : 0;
                            return 1;
                        } else if (i_0 == 4114) {
                            i_4 = staticIntArray26[--staticInt70];
                            staticIntArray26[staticInt70++] = StaticClass51.staticMethod214((char) i_4) ? 1 : 0;
                            return 1;
                        } else {
                            int[] ints_5;
                            boolean bool_7;
                            char var_8;
                            if (i_0 == 4115) {
                                i_4 = staticIntArray26[--staticInt70];
                                ints_5 = staticIntArray26;
                                i_6 = staticInt70++;
                                var_8 = (char) i_4;
                                bool_7 = var_8 >= 65 && var_8 <= 90 || var_8 >= 97 && var_8 <= 122;
                                ints_5[i_6] = bool_7 ? 1 : 0;
                                return 1;
                            } else if (i_0 != 4116) {
                                if (i_0 == 4117) {
                                    string_18 = staticStringArray2[--staticInt72];
                                    if (string_18 != null)
                                        staticIntArray26[staticInt70++] = string_18.length();
                                    else
                                        staticIntArray26[staticInt70++] = 0;

                                    return 1;
                                } else if (i_0 == 4118) {
                                    string_18 = staticStringArray2[--staticInt72];
                                    staticInt70 -= 2;
                                    i_20 = staticIntArray26[staticInt70];
                                    i_6 = staticIntArray26[1 + staticInt70];
                                    staticStringArray2[staticInt72++] = string_18.substring(i_20, i_6);
                                    return 1;
                                } else if (i_0 == 4119) {
                                    string_18 = staticStringArray2[--staticInt72];
                                    StringBuilder stringbuilder_21 = new StringBuilder(string_18.length());
                                    boolean bool_22 = false;

                                    for (i_23 = 0; i_23 < string_18.length(); i_23++) {
                                        var_8 = string_18.charAt(i_23);
                                        if (var_8 == 60)
                                            bool_22 = true;
                                        else if (var_8 == 62)
                                            bool_22 = false;
                                        else if (!bool_22)
                                            stringbuilder_21.append(var_8);
                                    }

                                    staticStringArray2[staticInt72++] = stringbuilder_21.toString();
                                    return 1;
                                } else if (i_0 == 4120) {
                                    string_18 = staticStringArray2[--staticInt72];
                                    i_20 = staticIntArray26[--staticInt70];
                                    staticIntArray26[staticInt70++] = string_18.indexOf(i_20);
                                    return 1;
                                } else if (i_0 == 4121) {
                                    staticInt72 -= 2;
                                    string_18 = staticStringArray2[staticInt72];
                                    string_19 = staticStringArray2[1 + staticInt72];
                                    i_6 = staticIntArray26[--staticInt70];
                                    staticIntArray26[staticInt70++] = string_18.indexOf(string_19, i_6);
                                    return 1;
                                } else
                                    return 2;
                            } else {
                                i_4 = staticIntArray26[--staticInt70];
                                ints_5 = staticIntArray26;
                                i_6 = staticInt70++;
                                var_8 = (char) i_4;
                                bool_7 = var_8 >= 48 && var_8 <= 57;
                                ints_5[i_6] = bool_7 ? 1 : 0;
                                return 1;
                            }
                        }
                    }
                }
            }
        }
    }

    static int staticMethod95(int i_0, RuneScriptDef runescriptdef_1, boolean bool_2) {
        if (i_0 == 5000) {
            staticIntArray26[staticInt70++] = Client.staticInt275;
            return 1;
        } else if (i_0 == 5001) {
            staticInt70 -= 3;
            Client.staticInt275 = staticIntArray26[staticInt70];
            WorldMapDecor.staticClass7_1 = Class7.staticMethod201(staticIntArray26[staticInt70 + 1]);
            if (WorldMapDecor.staticClass7_1 == null)
                WorldMapDecor.staticClass7_1 = Class7.staticClass7_3;

            Client.staticInt217 = staticIntArray26[2 + staticInt70];
            Client.staticPacket1.writeOpcode(140);
            Client.staticPacket1.writeByte(Client.staticInt275);
            Client.staticPacket1.writeByte(WorldMapDecor.staticClass7_1.int273);
            Client.staticPacket1.writeByte(Client.staticInt217);
            return 1;
        } else {
            String string_4;
            int i_6;
            int i_15;
            if (i_0 == 5002) {
                string_4 = staticStringArray2[--staticInt72];
                staticInt70 -= 2;
                i_15 = staticIntArray26[staticInt70];
                i_6 = staticIntArray26[staticInt70 + 1];
                Client.staticPacket1.writeOpcode(49);
                Client.staticPacket1.writeByte(Buffer.staticMethod378(string_4) + 2);
                Client.staticPacket1.method430(string_4);
                Client.staticPacket1.writeByte(i_15 - 1);
                Client.staticPacket1.writeByte(i_6);
                return 1;
            } else {
                int i_13;
                if (i_0 == 5003) {
                    staticInt70 -= 2;
                    i_13 = staticIntArray26[staticInt70];
                    i_15 = staticIntArray26[1 + staticInt70];
                    ChatLog chatlog_25 = (ChatLog) StaticClass12.staticMap1.get(Integer.valueOf(i_13));
                    ChatLine chatline_18 = chatlog_25.get(i_15);
                    if (chatline_18 != null) {
                        staticIntArray26[staticInt70++] = chatline_18.int483;
                        staticIntArray26[staticInt70++] = chatline_18.int481;
                        staticStringArray2[staticInt72++] = chatline_18.string35 != null ? chatline_18.string35 : "";
                        staticStringArray2[staticInt72++] = chatline_18.string36 != null ? chatline_18.string36 : "";
                        staticStringArray2[staticInt72++] = chatline_18.string37 != null ? chatline_18.string37 : "";
                    } else {
                        staticIntArray26[staticInt70++] = -1;
                        staticIntArray26[staticInt70++] = 0;
                        staticStringArray2[staticInt72++] = "";
                        staticStringArray2[staticInt72++] = "";
                        staticStringArray2[staticInt72++] = "";
                    }

                    return 1;
                } else if (i_0 == 5004) {
                    i_13 = staticIntArray26[--staticInt70];
                    ChatLine chatline_16 = (ChatLine) StaticClass12.staticParamList1.method247(i_13);
                    if (chatline_16 != null) {
                        staticIntArray26[staticInt70++] = chatline_16.int482;
                        staticIntArray26[staticInt70++] = chatline_16.int481;
                        staticStringArray2[staticInt72++] = chatline_16.string35 != null ? chatline_16.string35 : "";
                        staticStringArray2[staticInt72++] = chatline_16.string36 != null ? chatline_16.string36 : "";
                        staticStringArray2[staticInt72++] = chatline_16.string37 != null ? chatline_16.string37 : "";
                    } else {
                        staticIntArray26[staticInt70++] = -1;
                        staticIntArray26[staticInt70++] = 0;
                        staticStringArray2[staticInt72++] = "";
                        staticStringArray2[staticInt72++] = "";
                        staticStringArray2[staticInt72++] = "";
                    }

                    return 1;
                } else if (i_0 == 5005) {
                    if (WorldMapDecor.staticClass7_1 == null)
                        staticIntArray26[staticInt70++] = -1;
                    else
                        staticIntArray26[staticInt70++] = WorldMapDecor.staticClass7_1.int273;

                    return 1;
                } else if (i_0 == 5008) {
                    string_4 = staticStringArray2[--staticInt72];
                    i_15 = staticIntArray26[--staticInt70];
                    String string_17 = string_4.toLowerCase();
                    byte b_24 = 0;
                    if (string_17.startsWith("yellow:")) {
                        b_24 = 0;
                        string_4 = string_4.substring("yellow:".length());
                    } else if (string_17.startsWith("red:")) {
                        b_24 = 1;
                        string_4 = string_4.substring("red:".length());
                    } else if (string_17.startsWith("green:")) {
                        b_24 = 2;
                        string_4 = string_4.substring("green:".length());
                    } else if (string_17.startsWith("cyan:")) {
                        b_24 = 3;
                        string_4 = string_4.substring("cyan:".length());
                    } else if (string_17.startsWith("purple:")) {
                        b_24 = 4;
                        string_4 = string_4.substring("purple:".length());
                    } else if (string_17.startsWith("white:")) {
                        b_24 = 5;
                        string_4 = string_4.substring("white:".length());
                    } else if (string_17.startsWith("flash1:")) {
                        b_24 = 6;
                        string_4 = string_4.substring("flash1:".length());
                    } else if (string_17.startsWith("flash2:")) {
                        b_24 = 7;
                        string_4 = string_4.substring("flash2:".length());
                    } else if (string_17.startsWith("flash3:")) {
                        b_24 = 8;
                        string_4 = string_4.substring("flash3:".length());
                    } else if (string_17.startsWith("glow1:")) {
                        b_24 = 9;
                        string_4 = string_4.substring("glow1:".length());
                    } else if (string_17.startsWith("glow2:")) {
                        b_24 = 10;
                        string_4 = string_4.substring("glow2:".length());
                    } else if (string_17.startsWith("glow3:")) {
                        b_24 = 11;
                        string_4 = string_4.substring("glow3:".length());
                    } else if (Client.staticInt163 != 0)
                        if (string_17.startsWith("yellow:")) {
                            b_24 = 0;
                            string_4 = string_4.substring("yellow:".length());
                        } else if (string_17.startsWith("red:")) {
                            b_24 = 1;
                            string_4 = string_4.substring("red:".length());
                        } else if (string_17.startsWith("green:")) {
                            b_24 = 2;
                            string_4 = string_4.substring("green:".length());
                        } else if (string_17.startsWith("cyan:")) {
                            b_24 = 3;
                            string_4 = string_4.substring("cyan:".length());
                        } else if (string_17.startsWith("purple:")) {
                            b_24 = 4;
                            string_4 = string_4.substring("purple:".length());
                        } else if (string_17.startsWith("white:")) {
                            b_24 = 5;
                            string_4 = string_4.substring("white:".length());
                        } else if (string_17.startsWith("flash1:")) {
                            b_24 = 6;
                            string_4 = string_4.substring("flash1:".length());
                        } else if (string_17.startsWith("flash2:")) {
                            b_24 = 7;
                            string_4 = string_4.substring("flash2:".length());
                        } else if (string_17.startsWith("flash3:")) {
                            b_24 = 8;
                            string_4 = string_4.substring("flash3:".length());
                        } else if (string_17.startsWith("glow1:")) {
                            b_24 = 9;
                            string_4 = string_4.substring("glow1:".length());
                        } else if (string_17.startsWith("glow2:")) {
                            b_24 = 10;
                            string_4 = string_4.substring("glow2:".length());
                        } else if (string_17.startsWith("glow3:")) {
                            b_24 = 11;
                            string_4 = string_4.substring("glow3:".length());
                        }

                    string_17 = string_4.toLowerCase();
                    byte b_21 = 0;
                    if (string_17.startsWith("wave:")) {
                        b_21 = 1;
                        string_4 = string_4.substring("wave:".length());
                    } else if (string_17.startsWith("wave2:")) {
                        b_21 = 2;
                        string_4 = string_4.substring("wave2:".length());
                    } else if (string_17.startsWith("shake:")) {
                        b_21 = 3;
                        string_4 = string_4.substring("shake:".length());
                    } else if (string_17.startsWith("scroll:")) {
                        b_21 = 4;
                        string_4 = string_4.substring("scroll:".length());
                    } else if (string_17.startsWith("slide:")) {
                        b_21 = 5;
                        string_4 = string_4.substring("slide:".length());
                    } else if (Client.staticInt163 != 0)
                        if (string_17.startsWith("wave:")) {
                            b_21 = 1;
                            string_4 = string_4.substring("wave:".length());
                        } else if (string_17.startsWith("wave2:")) {
                            b_21 = 2;
                            string_4 = string_4.substring("wave2:".length());
                        } else if (string_17.startsWith("shake:")) {
                            b_21 = 3;
                            string_4 = string_4.substring("shake:".length());
                        } else if (string_17.startsWith("scroll:")) {
                            b_21 = 4;
                            string_4 = string_4.substring("scroll:".length());
                        } else if (string_17.startsWith("slide:")) {
                            b_21 = 5;
                            string_4 = string_4.substring("slide:".length());
                        }

                    Client.staticPacket1.writeOpcode(82);
                    Client.staticPacket1.writeByte(0);
                    int i_23 = Client.staticPacket1.off;
                    Client.staticPacket1.writeByte(i_15);
                    Client.staticPacket1.writeByte(b_24);
                    Client.staticPacket1.writeByte(b_21);
                    Packet packet_10 = Client.staticPacket1;
                    int i_11 = packet_10.off;
                    byte[] bytes_12 = StaticClass52.staticMethod219(string_4);
                    packet_10.method437(bytes_12.length);
                    packet_10.off += StaticClass50.staticHuffman1.method232(bytes_12, 0, bytes_12.length, packet_10.buf, packet_10.off);
                    Client.staticPacket1.method436(Client.staticPacket1.off - i_23);
                    return 1;
                } else if (i_0 == 5009) {
                    staticInt72 -= 2;
                    string_4 = staticStringArray2[staticInt72];
                    String string_14 = staticStringArray2[staticInt72 + 1];
                    Client.staticPacket1.writeOpcode(176);
                    Client.staticPacket1.writeShort(0);
                    i_6 = Client.staticPacket1.off;
                    Client.staticPacket1.method430(string_4);
                    Packet packet_22 = Client.staticPacket1;
                    int i_20 = packet_22.off;
                    byte[] bytes_9 = StaticClass52.staticMethod219(string_14);
                    packet_22.method437(bytes_9.length);
                    packet_22.off += StaticClass50.staticHuffman1.method232(bytes_9, 0, bytes_9.length, packet_22.buf, packet_22.off);
                    Client.staticPacket1.method435(Client.staticPacket1.off - i_6);
                    return 1;
                } else if (i_0 != 5015) {
                    if (i_0 == 5016) {
                        staticIntArray26[staticInt70++] = Client.staticInt217;
                        return 1;
                    } else {
                        int[] ints_5;
                        int i_7;
                        if (i_0 == 5017) {
                            i_13 = staticIntArray26[--staticInt70];
                            ints_5 = staticIntArray26;
                            i_6 = staticInt70++;
                            ChatLog chatlog_19 = (ChatLog) StaticClass12.staticMap1.get(Integer.valueOf(i_13));
                            if (chatlog_19 == null)
                                i_7 = 0;
                            else
                                i_7 = chatlog_19.size();

                            ints_5[i_6] = i_7;
                            return 1;
                        } else if (i_0 == 5018) {
                            i_13 = staticIntArray26[--staticInt70];
                            ints_5 = staticIntArray26;
                            i_6 = staticInt70++;
                            ChatLine chatline_8 = (ChatLine) StaticClass12.staticParamList1.method247(i_13);
                            if (chatline_8 == null)
                                i_7 = -1;
                            else if (chatline_8.next == StaticClass12.staticChatLineList1.cacheable4)
                                i_7 = -1;
                            else
                                i_7 = ((ChatLine) chatline_8.next).int483;

                            ints_5[i_6] = i_7;
                            return 1;
                        } else if (i_0 == 5019) {
                            i_13 = staticIntArray26[--staticInt70];
                            staticIntArray26[staticInt70++] = StaticClass12.staticMethod61(i_13);
                            return 1;
                        } else if (i_0 == 5020) {
                            string_4 = staticStringArray2[--staticInt72];
                            Client.staticMethod269(string_4);
                            return 1;
                        } else if (i_0 == 5021) {
                            Client.staticString317 = staticStringArray2[--staticInt72].toLowerCase().trim();
                            return 1;
                        } else if (i_0 == 5022) {
                            staticStringArray2[staticInt72++] = Client.staticString317;
                            return 1;
                        } else
                            return 2;
                    }
                } else {
                    if (BufferWrapper.staticPlayer1 != null && BufferWrapper.staticPlayer1.name != null)
                        string_4 = BufferWrapper.staticPlayer1.name;
                    else
                        string_4 = "";

                    staticStringArray2[staticInt72++] = string_4;
                    return 1;
                }
            }
        }
    }

    static int staticMethod96(int i_0, RuneScriptDef runescriptdef_1, boolean bool_2) {
        int i_4;
        if (i_0 == 5504) {
            staticInt70 -= 2;
            i_4 = staticIntArray26[staticInt70];
            int i_5 = staticIntArray26[1 + staticInt70];
            if (!Client.staticBool45) {
                Client.staticInt161 = i_4;
                Client.staticInt207 = i_5;
            }

            return 1;
        } else if (i_0 == 5505) {
            staticIntArray26[staticInt70++] = Client.staticInt161;
            return 1;
        } else if (i_0 == 5506) {
            staticIntArray26[staticInt70++] = Client.staticInt207;
            return 1;
        } else if (i_0 == 5530) {
            i_4 = staticIntArray26[--staticInt70];
            if (i_4 < 0)
                i_4 = 0;

            Client.staticInt210 = i_4;
            return 1;
        } else if (i_0 == 5531) {
            staticIntArray26[staticInt70++] = Client.staticInt210;
            return 1;
        } else
            return 2;
    }

    static int staticMethod97(int i_0, RuneScriptDef runescriptdef_1, boolean bool_2) {
        if (i_0 == 5630) {
            Client.staticInt195 = 250;
            return 1;
        } else
            return 2;
    }

    static int staticMethod98(int i_0, RuneScriptDef runescriptdef_1, boolean bool_2) {
        if (i_0 == 6200) {
            staticInt70 -= 2;
            Client.staticShort4 = (short) staticIntArray26[staticInt70];
            if (Client.staticShort4 <= 0)
                Client.staticShort4 = 256;

            Client.staticShort5 = (short) staticIntArray26[staticInt70 + 1];
            if (Client.staticShort5 <= 0)
                Client.staticShort5 = 205;

            return 1;
        } else if (i_0 == 6201) {
            staticInt70 -= 2;
            Client.staticShort6 = (short) staticIntArray26[staticInt70];
            if (Client.staticShort6 <= 0)
                Client.staticShort6 = 256;

            Client.staticShort7 = (short) staticIntArray26[staticInt70 + 1];
            if (Client.staticShort7 <= 0)
                Client.staticShort7 = 320;

            return 1;
        } else if (i_0 == 6202) {
            staticInt70 -= 4;
            Client.staticShort1 = (short) staticIntArray26[staticInt70];
            if (Client.staticShort1 <= 0)
                Client.staticShort1 = 1;

            Client.staticShort2 = (short) staticIntArray26[staticInt70 + 1];
            if (Client.staticShort2 <= 0)
                Client.staticShort2 = 32767;
            else if (Client.staticShort2 < Client.staticShort1)
                Client.staticShort2 = Client.staticShort1;

            Client.staticShort8 = (short) staticIntArray26[2 + staticInt70];
            if (Client.staticShort8 <= 0)
                Client.staticShort8 = 1;

            Client.staticShort3 = (short) staticIntArray26[staticInt70 + 3];
            if (Client.staticShort3 <= 0)
                Client.staticShort3 = 32767;
            else if (Client.staticShort3 < Client.staticShort8)
                Client.staticShort3 = Client.staticShort8;

            return 1;
        } else if (i_0 == 6203) {
            if (Client.staticWidget12 != null) {
                Client.staticMethod280(0, 0, Client.staticWidget12.int406, Client.staticWidget12.int407, false);
                staticIntArray26[staticInt70++] = Client.staticInt286;
                staticIntArray26[staticInt70++] = Client.staticInt292;
            } else {
                staticIntArray26[staticInt70++] = -1;
                staticIntArray26[staticInt70++] = -1;
            }

            return 1;
        } else if (i_0 == 6204) {
            staticIntArray26[staticInt70++] = Client.staticShort6;
            staticIntArray26[staticInt70++] = Client.staticShort7;
            return 1;
        } else if (i_0 == 6205) {
            staticIntArray26[staticInt70++] = Client.staticShort4;
            staticIntArray26[staticInt70++] = Client.staticShort5;
            return 1;
        } else
            return 2;
    }

    static int staticMethod99(int i_0, RuneScriptDef runescriptdef_1, boolean bool_2) {
        if (i_0 == 6500) {
            staticIntArray26[staticInt70++] = World.staticMethod45() ? 1 : 0;
            return 1;
        } else {
            World world_9;
            if (i_0 == 6501) {
                World.staticInt48 = 0;
                world_9 = World.staticMethod51();
                if (world_9 != null) {
                    staticIntArray26[staticInt70++] = world_9.int94;
                    staticIntArray26[staticInt70++] = world_9.int95;
                    staticStringArray2[staticInt72++] = world_9.string9;
                    staticIntArray26[staticInt70++] = world_9.int97;
                    staticIntArray26[staticInt70++] = world_9.int96;
                    staticStringArray2[staticInt72++] = world_9.string8;
                } else {
                    staticIntArray26[staticInt70++] = -1;
                    staticIntArray26[staticInt70++] = 0;
                    staticStringArray2[staticInt72++] = "";
                    staticIntArray26[staticInt70++] = 0;
                    staticIntArray26[staticInt70++] = 0;
                    staticStringArray2[staticInt72++] = "";
                }

                return 1;
            } else if (i_0 == 6502) {
                world_9 = World.staticMethod51();
                if (world_9 != null) {
                    staticIntArray26[staticInt70++] = world_9.int94;
                    staticIntArray26[staticInt70++] = world_9.int95;
                    staticStringArray2[staticInt72++] = world_9.string9;
                    staticIntArray26[staticInt70++] = world_9.int97;
                    staticIntArray26[staticInt70++] = world_9.int96;
                    staticStringArray2[staticInt72++] = world_9.string8;
                } else {
                    staticIntArray26[staticInt70++] = -1;
                    staticIntArray26[staticInt70++] = 0;
                    staticStringArray2[staticInt72++] = "";
                    staticIntArray26[staticInt70++] = 0;
                    staticIntArray26[staticInt70++] = 0;
                    staticStringArray2[staticInt72++] = "";
                }

                return 1;
            } else {
                int i_4;
                World world_5;
                int i_11;
                if (i_0 == 6506) {
                    i_4 = staticIntArray26[--staticInt70];
                    world_5 = null;

                    for (i_11 = 0; i_11 < World.staticInt47; i_11++)
                        if (DataClass8.staticWorldArray1[i_11].int94 == i_4) {
                            world_5 = DataClass8.staticWorldArray1[i_11];
                            break;
                        }

                    if (world_5 != null) {
                        staticIntArray26[staticInt70++] = world_5.int94;
                        staticIntArray26[staticInt70++] = world_5.int95;
                        staticStringArray2[staticInt72++] = world_5.string9;
                        staticIntArray26[staticInt70++] = world_5.int97;
                        staticIntArray26[staticInt70++] = world_5.int96;
                        staticStringArray2[staticInt72++] = world_5.string8;
                    } else {
                        staticIntArray26[staticInt70++] = -1;
                        staticIntArray26[staticInt70++] = 0;
                        staticStringArray2[staticInt72++] = "";
                        staticIntArray26[staticInt70++] = 0;
                        staticIntArray26[staticInt70++] = 0;
                        staticStringArray2[staticInt72++] = "";
                    }

                    return 1;
                } else if (i_0 == 6507) {
                    staticInt70 -= 4;
                    i_4 = staticIntArray26[staticInt70];
                    boolean bool_10 = staticIntArray26[1 + staticInt70] == 1;
                    i_11 = staticIntArray26[staticInt70 + 2];
                    boolean bool_7 = staticIntArray26[3 + staticInt70] == 1;
                    World.staticMethod48(i_4, bool_10, i_11, bool_7);
                    return 1;
                } else if (i_0 != 6511) {
                    if (i_0 == 6512) {
                        Client.staticBool35 = staticIntArray26[--staticInt70] == 1;
                        return 1;
                    } else {
                        ParamType paramtype_6;
                        int i_8;
                        if (i_0 == 6513) {
                            staticInt70 -= 2;
                            i_4 = staticIntArray26[staticInt70];
                            i_8 = staticIntArray26[staticInt70 + 1];
                            paramtype_6 = ParamType.staticMethod435(i_8);
                            if (paramtype_6.isStringType())
                                staticStringArray2[staticInt72++] = NpcType.staticMethod413(i_4).getStringProperty(i_8, paramtype_6.string42);
                            else
                                staticIntArray26[staticInt70++] = NpcType.staticMethod413(i_4).getIntProperty(i_8, paramtype_6.int594);

                            return 1;
                        } else if (i_0 == 6514) {
                            staticInt70 -= 2;
                            i_4 = staticIntArray26[staticInt70];
                            i_8 = staticIntArray26[1 + staticInt70];
                            paramtype_6 = ParamType.staticMethod435(i_8);
                            if (paramtype_6.isStringType())
                                staticStringArray2[staticInt72++] = LocType.staticMethod411(i_4).getStringProperty(i_8, paramtype_6.string42);
                            else
                                staticIntArray26[staticInt70++] = LocType.staticMethod411(i_4).getIntProperty(i_8, paramtype_6.int594);

                            return 1;
                        } else if (i_0 == 6515) {
                            staticInt70 -= 2;
                            i_4 = staticIntArray26[staticInt70];
                            i_8 = staticIntArray26[1 + staticInt70];
                            paramtype_6 = ParamType.staticMethod435(i_8);
                            if (paramtype_6.isStringType())
                                staticStringArray2[staticInt72++] = ObjType.staticMethod421(i_4).getStringProperty(i_8, paramtype_6.string42);
                            else
                                staticIntArray26[staticInt70++] = ObjType.staticMethod421(i_4).getIntProperty(i_8, paramtype_6.int594);

                            return 1;
                        } else if (i_0 == 6516) {
                            staticInt70 -= 2;
                            i_4 = staticIntArray26[staticInt70];
                            i_8 = staticIntArray26[1 + staticInt70];
                            paramtype_6 = ParamType.staticMethod435(i_8);
                            if (paramtype_6.isStringType())
                                staticStringArray2[staticInt72++] = CacheableSub2.staticMethod429(i_4).getStringProperty(i_8, paramtype_6.string42);
                            else
                                staticIntArray26[staticInt70++] = CacheableSub2.staticMethod429(i_4).getIntProperty(i_8, paramtype_6.int594);

                            return 1;
                        } else if (i_0 == 6518) {
                            staticIntArray26[staticInt70++] = 0;
                            return 1;
                        } else
                            return i_0 == 6520 ? 1 : i_0 == 6521 ? 1 : 2;
                    }
                } else {
                    i_4 = staticIntArray26[--staticInt70];
                    if (i_4 >= 0 && i_4 < World.staticInt47) {
                        world_5 = DataClass8.staticWorldArray1[i_4];
                        staticIntArray26[staticInt70++] = world_5.int94;
                        staticIntArray26[staticInt70++] = world_5.int95;
                        staticStringArray2[staticInt72++] = world_5.string9;
                        staticIntArray26[staticInt70++] = world_5.int97;
                        staticIntArray26[staticInt70++] = world_5.int96;
                        staticStringArray2[staticInt72++] = world_5.string8;
                    } else {
                        staticIntArray26[staticInt70++] = -1;
                        staticIntArray26[staticInt70++] = 0;
                        staticStringArray2[staticInt72++] = "";
                        staticIntArray26[staticInt70++] = 0;
                        staticIntArray26[staticInt70++] = 0;
                        staticStringArray2[staticInt72++] = "";
                    }

                    return 1;
                }
            }
        }
    }

    static int staticMethod100(int i_0, RuneScriptDef runescriptdef_1, boolean bool_2) {
        int i_4;
        if (i_0 == 6600) {
            i_4 = DataClass14.staticInt156;
            int i_17 = DataClass10.staticInt111 + (BufferWrapper.staticPlayer1.int626 >> 7);
            int i_13 = (BufferWrapper.staticPlayer1.int609 >> 7) + Class4.staticInt53;
            Client.staticMethod252().method333(i_4, i_17, i_13, true);
            return 1;
        } else {
            WorldMapAreaDescriptor worldmapareadescriptor_8;
            if (i_0 == 6601) {
                i_4 = staticIntArray26[--staticInt70];
                String str_16 = "";
                worldmapareadescriptor_8 = Client.staticMethod252().method349(i_4);
                if (worldmapareadescriptor_8 != null)
                    str_16 = worldmapareadescriptor_8.name();

                staticStringArray2[staticInt72++] = str_16;
                return 1;
            } else if (i_0 == 6602) {
                i_4 = staticIntArray26[--staticInt70];
                Client.staticMethod252().method334(i_4);
                return 1;
            } else if (i_0 == 6603) {
                staticIntArray26[staticInt70++] = Client.staticMethod252().method346();
                return 1;
            } else if (i_0 == 6604) {
                i_4 = staticIntArray26[--staticInt70];
                Client.staticMethod252().method343(i_4);
                return 1;
            } else if (i_0 == 6605) {
                staticIntArray26[staticInt70++] = Client.staticMethod252().method348() ? 1 : 0;
                return 1;
            } else {
                WorldMapCoord worldmapcoord_15;
                if (i_0 == 6606) {
                    worldmapcoord_15 = new WorldMapCoord(staticIntArray26[--staticInt70]);
                    Client.staticMethod252().method350(worldmapcoord_15.int262, worldmapcoord_15.int260);
                    return 1;
                } else if (i_0 == 6607) {
                    worldmapcoord_15 = new WorldMapCoord(staticIntArray26[--staticInt70]);
                    Client.staticMethod252().method351(worldmapcoord_15.int262, worldmapcoord_15.int260);
                    return 1;
                } else if (i_0 == 6608) {
                    worldmapcoord_15 = new WorldMapCoord(staticIntArray26[--staticInt70]);
                    Client.staticMethod252().method352(worldmapcoord_15.int261, worldmapcoord_15.int262, worldmapcoord_15.int260);
                    return 1;
                } else if (i_0 == 6609) {
                    worldmapcoord_15 = new WorldMapCoord(staticIntArray26[--staticInt70]);
                    Client.staticMethod252().method353(worldmapcoord_15.int261, worldmapcoord_15.int262, worldmapcoord_15.int260);
                    return 1;
                } else if (i_0 == 6610) {
                    staticIntArray26[staticInt70++] = Client.staticMethod252().method354();
                    staticIntArray26[staticInt70++] = Client.staticMethod252().method355();
                    return 1;
                } else {
                    WorldMapAreaDescriptor worldmapareadescriptor_12;
                    if (i_0 == 6611) {
                        i_4 = staticIntArray26[--staticInt70];
                        worldmapareadescriptor_12 = Client.staticMethod252().method349(i_4);
                        if (worldmapareadescriptor_12 == null)
                            staticIntArray26[staticInt70++] = 0;
                        else
                            staticIntArray26[staticInt70++] = worldmapareadescriptor_12.method80().method295();

                        return 1;
                    } else if (i_0 == 6612) {
                        i_4 = staticIntArray26[--staticInt70];
                        worldmapareadescriptor_12 = Client.staticMethod252().method349(i_4);
                        if (worldmapareadescriptor_12 == null) {
                            staticIntArray26[staticInt70++] = 0;
                            staticIntArray26[staticInt70++] = 0;
                        } else {
                            staticIntArray26[staticInt70++] = (worldmapareadescriptor_12.method75() - worldmapareadescriptor_12.getX() + 1) * 64;
                            staticIntArray26[staticInt70++] = (worldmapareadescriptor_12.method76() - worldmapareadescriptor_12.getY() + 1) * 64;
                        }

                        return 1;
                    } else if (i_0 == 6613) {
                        i_4 = staticIntArray26[--staticInt70];
                        worldmapareadescriptor_12 = Client.staticMethod252().method349(i_4);
                        if (worldmapareadescriptor_12 == null) {
                            staticIntArray26[staticInt70++] = 0;
                            staticIntArray26[staticInt70++] = 0;
                            staticIntArray26[staticInt70++] = 0;
                            staticIntArray26[staticInt70++] = 0;
                        } else {
                            staticIntArray26[staticInt70++] = worldmapareadescriptor_12.getX() * 64;
                            staticIntArray26[staticInt70++] = worldmapareadescriptor_12.getY() * 64;
                            staticIntArray26[staticInt70++] = worldmapareadescriptor_12.method75() * 64 + 64 - 1;
                            staticIntArray26[staticInt70++] = worldmapareadescriptor_12.method76() * 64 + 64 - 1;
                        }

                        return 1;
                    } else if (i_0 == 6614) {
                        i_4 = staticIntArray26[--staticInt70];
                        worldmapareadescriptor_12 = Client.staticMethod252().method349(i_4);
                        if (worldmapareadescriptor_12 == null)
                            staticIntArray26[staticInt70++] = -1;
                        else
                            staticIntArray26[staticInt70++] = worldmapareadescriptor_12.method74();

                        return 1;
                    } else if (i_0 == 6615) {
                        worldmapcoord_15 = Client.staticMethod252().method356();
                        if (worldmapcoord_15 == null) {
                            staticIntArray26[staticInt70++] = -1;
                            staticIntArray26[staticInt70++] = -1;
                        } else {
                            staticIntArray26[staticInt70++] = worldmapcoord_15.int262;
                            staticIntArray26[staticInt70++] = worldmapcoord_15.int260;
                        }

                        return 1;
                    } else if (i_0 == 6616) {
                        staticIntArray26[staticInt70++] = Client.staticMethod252().method335();
                        return 1;
                    } else if (i_0 == 6617) {
                        worldmapcoord_15 = new WorldMapCoord(staticIntArray26[--staticInt70]);
                        worldmapareadescriptor_12 = Client.staticMethod252().method336();
                        if (worldmapareadescriptor_12 == null) {
                            staticIntArray26[staticInt70++] = -1;
                            staticIntArray26[staticInt70++] = -1;
                            return 1;
                        } else {
                            int[] ints_11 = worldmapareadescriptor_12.method68(worldmapcoord_15.int261, worldmapcoord_15.int262, worldmapcoord_15.int260);
                            if (ints_11 == null) {
                                staticIntArray26[staticInt70++] = -1;
                                staticIntArray26[staticInt70++] = -1;
                            } else {
                                staticIntArray26[staticInt70++] = ints_11[0];
                                staticIntArray26[staticInt70++] = ints_11[1];
                            }

                            return 1;
                        }
                    } else {
                        WorldMapCoord worldmapcoord_6;
                        if (i_0 == 6618) {
                            worldmapcoord_15 = new WorldMapCoord(staticIntArray26[--staticInt70]);
                            worldmapareadescriptor_12 = Client.staticMethod252().method336();
                            if (worldmapareadescriptor_12 == null) {
                                staticIntArray26[staticInt70++] = -1;
                                staticIntArray26[staticInt70++] = -1;
                                return 1;
                            } else {
                                worldmapcoord_6 = worldmapareadescriptor_12.method69(worldmapcoord_15.int262, worldmapcoord_15.int260);
                                if (worldmapcoord_6 == null)
                                    staticIntArray26[staticInt70++] = -1;
                                else
                                    staticIntArray26[staticInt70++] = worldmapcoord_6.method295();

                                return 1;
                            }
                        } else {
                            WorldMapCoord worldmapcoord_9;
                            if (i_0 == 6619) {
                                staticInt70 -= 2;
                                i_4 = staticIntArray26[staticInt70];
                                worldmapcoord_9 = new WorldMapCoord(staticIntArray26[staticInt70 + 1]);
                                staticMethod102(i_4, worldmapcoord_9, false);
                                return 1;
                            } else if (i_0 == 6620) {
                                staticInt70 -= 2;
                                i_4 = staticIntArray26[staticInt70];
                                worldmapcoord_9 = new WorldMapCoord(staticIntArray26[staticInt70 + 1]);
                                staticMethod102(i_4, worldmapcoord_9, true);
                                return 1;
                            } else if (i_0 == 6621) {
                                staticInt70 -= 2;
                                i_4 = staticIntArray26[staticInt70];
                                worldmapcoord_9 = new WorldMapCoord(staticIntArray26[1 + staticInt70]);
                                worldmapareadescriptor_8 = Client.staticMethod252().method349(i_4);
                                if (worldmapareadescriptor_8 == null) {
                                    staticIntArray26[staticInt70++] = 0;
                                    return 1;
                                } else {
                                    staticIntArray26[staticInt70++] = worldmapareadescriptor_8.method66(worldmapcoord_9.int261, worldmapcoord_9.int262, worldmapcoord_9.int260) ? 1 : 0;
                                    return 1;
                                }
                            } else if (i_0 == 6622) {
                                staticIntArray26[staticInt70++] = Client.staticMethod252().method357();
                                staticIntArray26[staticInt70++] = Client.staticMethod252().method358();
                                return 1;
                            } else if (i_0 == 6623) {
                                worldmapcoord_15 = new WorldMapCoord(staticIntArray26[--staticInt70]);
                                worldmapareadescriptor_12 = Client.staticMethod252().method332(worldmapcoord_15.int261, worldmapcoord_15.int262, worldmapcoord_15.int260);
                                if (worldmapareadescriptor_12 == null)
                                    staticIntArray26[staticInt70++] = -1;
                                else
                                    staticIntArray26[staticInt70++] = worldmapareadescriptor_12.method71();

                                return 1;
                            } else if (i_0 == 6624) {
                                Client.staticMethod252().method359(staticIntArray26[--staticInt70]);
                                return 1;
                            } else if (i_0 == 6625) {
                                Client.staticMethod252().method360();
                                return 1;
                            } else if (i_0 == 6626) {
                                Client.staticMethod252().method361(staticIntArray26[--staticInt70]);
                                return 1;
                            } else if (i_0 == 6627) {
                                Client.staticMethod252().method362();
                                return 1;
                            } else {
                                boolean bool_14;
                                if (i_0 == 6628) {
                                    bool_14 = staticIntArray26[--staticInt70] == 1;
                                    Client.staticMethod252().method363(bool_14);
                                    return 1;
                                } else if (i_0 == 6629) {
                                    i_4 = staticIntArray26[--staticInt70];
                                    Client.staticMethod252().method364(i_4);
                                    return 1;
                                } else if (i_0 == 6630) {
                                    i_4 = staticIntArray26[--staticInt70];
                                    Client.staticMethod252().method365(i_4);
                                    return 1;
                                } else if (i_0 == 6631) {
                                    Client.staticMethod252().method366();
                                    return 1;
                                } else if (i_0 == 6632) {
                                    bool_14 = staticIntArray26[--staticInt70] == 1;
                                    Client.staticMethod252().method367(bool_14);
                                    return 1;
                                } else {
                                    boolean bool_10;
                                    if (i_0 == 6633) {
                                        staticInt70 -= 2;
                                        i_4 = staticIntArray26[staticInt70];
                                        bool_10 = staticIntArray26[staticInt70 + 1] == 1;
                                        Client.staticMethod252().method368(i_4, bool_10);
                                        return 1;
                                    } else if (i_0 == 6634) {
                                        staticInt70 -= 2;
                                        i_4 = staticIntArray26[staticInt70];
                                        bool_10 = staticIntArray26[1 + staticInt70] == 1;
                                        Client.staticMethod252().method369(i_4, bool_10);
                                        return 1;
                                    } else if (i_0 == 6635) {
                                        staticIntArray26[staticInt70++] = Client.staticMethod252().method370() ? 1 : 0;
                                        return 1;
                                    } else if (i_0 == 6636) {
                                        i_4 = staticIntArray26[--staticInt70];
                                        staticIntArray26[staticInt70++] = Client.staticMethod252().method371(i_4) ? 1 : 0;
                                        return 1;
                                    } else if (i_0 == 6637) {
                                        i_4 = staticIntArray26[--staticInt70];
                                        staticIntArray26[staticInt70++] = Client.staticMethod252().method372(i_4) ? 1 : 0;
                                        return 1;
                                    } else if (i_0 == 6638) {
                                        staticInt70 -= 2;
                                        i_4 = staticIntArray26[staticInt70];
                                        worldmapcoord_9 = new WorldMapCoord(staticIntArray26[1 + staticInt70]);
                                        worldmapcoord_6 = Client.staticMethod252().method375(i_4, worldmapcoord_9);
                                        if (worldmapcoord_6 == null)
                                            staticIntArray26[staticInt70++] = -1;
                                        else
                                            staticIntArray26[staticInt70++] = worldmapcoord_6.method295();

                                        return 1;
                                    } else {
                                        WorldMapDecor worldmapdecor_7;
                                        if (i_0 == 6639) {
                                            worldmapdecor_7 = Client.staticMethod252().method377();
                                            if (worldmapdecor_7 == null) {
                                                staticIntArray26[staticInt70++] = -1;
                                                staticIntArray26[staticInt70++] = -1;
                                            } else {
                                                staticIntArray26[staticInt70++] = worldmapdecor_7.int56;
                                                staticIntArray26[staticInt70++] = worldmapdecor_7.worldMapCoord3.method295();
                                            }

                                            return 1;
                                        } else if (i_0 == 6640) {
                                            worldmapdecor_7 = Client.staticMethod252().method378();
                                            if (worldmapdecor_7 == null) {
                                                staticIntArray26[staticInt70++] = -1;
                                                staticIntArray26[staticInt70++] = -1;
                                            } else {
                                                staticIntArray26[staticInt70++] = worldmapdecor_7.int56;
                                                staticIntArray26[staticInt70++] = worldmapdecor_7.worldMapCoord3.method295();
                                            }

                                            return 1;
                                        } else {
                                            MapElementType mapelementtype_5;
                                            if (i_0 == 6693) {
                                                i_4 = staticIntArray26[--staticInt70];
                                                mapelementtype_5 = DataClass13.staticMapElementTypeArray1[i_4];
                                                if (mapelementtype_5.text == null)
                                                    staticStringArray2[staticInt72++] = "";
                                                else
                                                    staticStringArray2[staticInt72++] = mapelementtype_5.text;

                                                return 1;
                                            } else if (i_0 == 6694) {
                                                i_4 = staticIntArray26[--staticInt70];
                                                mapelementtype_5 = DataClass13.staticMapElementTypeArray1[i_4];
                                                staticIntArray26[staticInt70++] = mapelementtype_5.fontsize;
                                                return 1;
                                            } else if (i_0 == 6695) {
                                                i_4 = staticIntArray26[--staticInt70];
                                                mapelementtype_5 = DataClass13.staticMapElementTypeArray1[i_4];
                                                if (mapelementtype_5 == null)
                                                    staticIntArray26[staticInt70++] = -1;
                                                else
                                                    staticIntArray26[staticInt70++] = mapelementtype_5.int548;

                                                return 1;
                                            } else if (i_0 == 6696) {
                                                i_4 = staticIntArray26[--staticInt70];
                                                mapelementtype_5 = DataClass13.staticMapElementTypeArray1[i_4];
                                                if (mapelementtype_5 == null)
                                                    staticIntArray26[staticInt70++] = -1;
                                                else
                                                    staticIntArray26[staticInt70++] = mapelementtype_5.spriteId;

                                                return 1;
                                            } else if (i_0 == 6697) {
                                                staticIntArray26[staticInt70++] = RunnableImpl1.staticWM4_1.int5;
                                                return 1;
                                            } else if (i_0 == 6698) {
                                                staticIntArray26[staticInt70++] = RunnableImpl1.staticWM4_1.worldMapCoord2.method295();
                                                return 1;
                                            } else if (i_0 == 6699) {
                                                staticIntArray26[staticInt70++] = RunnableImpl1.staticWM4_1.worldMapCoord1.method295();
                                                return 1;
                                            } else
                                                return 2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    static void staticMethod101(int i_0) {
        if (i_0 != -1)
            if (Widget.staticMethod383(i_0)) {
                Widget[] arr_2 = StaticClass25.staticWidgetArrayArray1[i_0];

                for (int i_3 = 0; i_3 < arr_2.length; i_3++) {
                    Widget widget_4 = arr_2[i_3];
                    if (widget_4.objectArray7 != null) {
                        RuneScript runescript_5 = new RuneScript();
                        runescript_5.widget2 = widget_4;
                        runescript_5.objectArray1 = widget_4.objectArray7;
                        staticMethod80(runescript_5, 2000000);
                    }
                }

            }
    }

    static void staticMethod102(int i_0, WorldMapCoord worldmapcoord_1, boolean bool_2) {
        WorldMapAreaDescriptor worldmapareadescriptor_4 = Client.staticMethod252().method349(i_0);
        int i_5 = BufferWrapper.staticPlayer1.int683 * 649046179;
        int i_6 = DataClass10.staticInt111 + (BufferWrapper.staticPlayer1.int626 >> 7);
        int i_7 = Class4.staticInt53 + (BufferWrapper.staticPlayer1.int609 >> 7);
        WorldMapCoord worldmapcoord_8 = new WorldMapCoord(i_5, i_6, i_7);
        Client.staticMethod252().method339(worldmapareadescriptor_4, worldmapcoord_8, worldmapcoord_1, bool_2);
    }

}

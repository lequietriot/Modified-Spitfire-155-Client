import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.*;

public final class Client extends GameShell {

    static boolean staticBool47 = true;
    static int staticInt271 = 1;
    static int staticInt182 = 0;
    static int staticInt162 = 0;
    public static boolean staticBool24 = false;
    static boolean staticBool25 = false;
    static int staticInt163 = 0;
    static int staticInt165 = 0;
    static boolean staticBool41 = true;
    static int staticInt166 = 0;
    static long staticLong12 = 1L;
    static int staticInt213 = -1;
    static int staticInt168 = -1;
    static int staticInt169 = -1;
    static boolean staticBool26 = true;
    static boolean staticBool27 = false;
    static int staticInt201 = 0;
    static int staticInt170 = 0;
    static int staticInt171 = 0;
    static int staticInt172 = 0;
    static int staticInt214 = 0;
    static int staticInt188 = 0;
    static int staticInt175 = 0;
    static int staticInt176 = 0;
    static int staticInt177 = 0;
    static Class5 staticClass5_5;
    static Class5 staticClass5_6;
    static int staticInt178;
    static int staticInt231;
    static int staticInt282;
    static int staticInt185;
    static int staticInt181;
    static int staticInt227;
    static int staticInt278;
    static int staticInt216;
    static AuthenticatorState staticAuthenticatorState5;
    static byte[] staticByteArray5;
    static Npc[] staticNpcArray1;
    static int staticInt186;
    static int[] staticIntArray91;
    static int staticInt187;
    static int[] staticIntArray81;
    public static Packet staticPacket1;
    static Packet staticPacket2;
    static Packet staticPacket3;
    static int staticInt287;
    static int staticInt189;
    static int staticInt190;
    static int staticInt268;
    static int staticInt192;
    static int staticInt193;
    static int staticInt255;
    static int staticInt195;
    static boolean staticBool42;
    static Class10 staticClass10_1;
    static HashMap staticHashMap1;
    static int staticInt200;
    static int staticInt198;
    static int staticInt199;
    static int staticInt289;
    static int staticInt228;
    static CollisionMap[] staticCollisionMapArray1;
    static boolean staticBool30;
    static int[][][] staticIntArrayArrayArray3;
    static final int[] staticIntArray82;
    static int staticInt272;
    static int staticInt203;
    static int staticInt204;
    static int staticInt240;
    static int staticInt205;
    static boolean staticBool31;
    static int staticInt206;
    static int staticInt161;
    static int staticInt207;
    static int staticInt283;
    static int staticInt173;
    static int staticInt284;
    static int staticInt209;
    static int staticInt210;
    static int staticInt191;
    static boolean staticBool32;
    static int staticInt273;
    static int staticInt211;
    static int staticInt212;
    static int[] staticIntArray85;
    static int[] staticIntArray86;
    static int[] staticIntArray87;
    static int[] staticIntArray100;
    static int[] staticIntArray88;
    static int[] staticIntArray89;
    static int[] staticIntArray99;
    static String[] staticStringArray10;
    static int[][] staticIntArrayArray9;
    static int staticInt215;
    static int staticInt202;
    static int staticInt208;
    static int staticInt218;
    static int staticInt219;
    static int staticInt288;
    static int staticInt220;
    static int staticInt221;
    static int staticInt222;
    static int staticInt223;
    static int staticInt224;
    static int staticInt277;
    static int staticInt266;
    static boolean staticBool40;
    static int staticInt274;
    static int staticInt291;
    static Player[] players;
    static int staticInt293;
    static int staticInt229;
    static int staticInt230;
    static int[] staticIntArray92;
    static final int[] staticIntArray93;
    static String[] staticStringArray7;
    static boolean[] staticBoolArray6;
    static int[] staticIntArray94;
    static int staticInt234;
    static Deque[][][] staticDequeArrayArrayArray1;
    static Deque staticDeque4;
    static Deque staticDeque5;
    static Deque staticDeque6;
    static int[] staticIntArray84;
    static int[] staticIntArray95;
    static int[] staticIntArray96;
    static int staticInt232;
    static boolean staticBool34;
    static int staticInt225;
    static int[] staticIntArray79;
    static int[] staticIntArray101;
    static int[] staticIntArray97;
    static int[] staticIntArray80;
    static String[] staticStringArray8;
    static String[] staticStringArray9;
    static boolean[] staticBoolArray4;
    static boolean staticBool35;
    static boolean staticBool46;
    static int staticInt226;
    static int staticInt235;
    static int staticInt236;
    static int staticInt237;
    static int staticInt194;
    static String staticString315;
    static boolean staticBool36;
    static int staticInt238;
    static int staticInt239;
    static String staticString316;
    static String staticString313;
    static int staticInt241;
    static HashTable staticHashTable7;
    static int staticInt242;
    static int staticInt243;
    static Widget staticWidget11;
    static int staticInt244;
    static int staticInt245;
    public static int staticInt246;
    static int staticInt247;
    static boolean staticBool37;
    static boolean staticBool28;
    static boolean staticBool29;
    static Widget staticWidget12;
    static Widget staticWidget10;
    static Widget staticWidget9;
    static int staticInt249;
    static int staticInt250;
    static Widget staticWidget8;
    static boolean staticBool38;
    static int staticInt251;
    static int staticInt252;
    static boolean staticBool39;
    static int staticInt253;
    static int staticInt254;
    static boolean staticBool44;
    static int staticInt256;
    static int[] staticIntArray103;
    static int staticInt257;
    static int[] staticIntArray104;
    static int staticInt258;
    static int[] staticIntArray111;
    static int staticInt259;
    static int staticInt290;
    static int staticInt260;
    static int staticInt261;
    static int staticInt262;
    static int staticInt263;
    static int staticInt264;
    static int staticInt265;
    static Deque staticDeque8;
    static Deque staticDeque9;
    static Deque staticDeque7;
    static HashTable staticHashTable6;
    static int staticInt269;
    static int staticInt270;
    static boolean[] staticBoolArray7;
    static boolean[] staticBoolArray8;
    static boolean[] staticBoolArray5;
    static int[] staticIntArray105;
    static int[] staticIntArray90;
    static int[] staticIntArray102;
    static int[] staticIntArray107;
    static int staticInt183;
    static long staticLong10;
    static boolean staticBool33;
    static int[] staticIntArray106;
    static int staticInt275;
    static int staticInt217;
    static String staticString317;
    static long[] staticLongArray3;
    static int staticInt233;
    static int staticInt276;
    static int[] staticIntArray119;
    static int[] staticIntArray108;
    static long staticLong11;
    static String staticString314;
    static String staticString318;
    static int staticInt279;
    static int staticInt280;
    static int[] staticIntArray109;
    static int[] staticIntArray110;
    static Sprite[] staticSpriteArray8;
    static int staticInt179;
    static int staticInt281;
    static int staticInt296;
    static int staticInt197;
    static int staticInt248;
    static boolean staticBool43;
    static int staticInt174;
    static int staticInt267;
    static int staticInt285;
    static int[] staticIntArray112;
    static int[] staticIntArray113;
    static int[] staticIntArray114;
    static int[] staticIntArray115;
    static SoundEffect[] staticSoundEffectArray1;
    static boolean staticBool45;
    static boolean[] staticBoolArray9;
    static int[] staticIntArray116;
    static int[] staticIntArray98;
    static int[] staticIntArray117;
    static int[] staticIntArray118;
    static short staticShort4;
    static short staticShort5;
    static short staticShort6;
    static short staticShort7;
    static short staticShort1;
    static short staticShort2;
    static short staticShort8;
    static short staticShort3;
    static int staticInt167;
    static int staticInt184;
    static int staticInt286;
    static int staticInt292;
    static int staticInt196;
    static int staticInt180;
    static int staticInt294;
    static Friend[] staticFriendArray1;
    static Node2List staticNode2List1;
    static int staticInt295;
    static Ignore[] staticIgnoreArray1;
    static PlayerDef staticPlayerDef1;
    static int staticInt297;
    static int staticInt298;
    static ExchangeOffer[] staticExchangeOfferArray1;
    static final AbstractClass1Sub1 staticAbstractClass1Sub1_1;
    static int[] staticIntArray120;
    static int[] staticIntArray121;
    static GameType staticGameType7;
    static int staticInt164;
    static Js5IndexImpl staticJs5IndexImpl14;
    static int[] staticIntArray83;

    static {
        staticClass5_5 = Class5.staticClass5_3;
        staticClass5_6 = Class5.staticClass5_3;
        staticInt178 = 0;
        staticInt231 = 0;
        staticInt282 = 0;
        staticInt185 = 0;
        staticInt181 = 0;
        staticInt227 = 0;
        staticInt278 = 0;
        staticInt216 = 0;
        staticAuthenticatorState5 = AuthenticatorState.staticAuthenticatorState2;
        staticByteArray5 = null;
        staticNpcArray1 = new Npc[32768];
        staticInt186 = 0;
        staticIntArray91 = new int[32768];
        staticInt187 = 0;
        staticIntArray81 = new int[250];
        staticPacket1 = new Packet(5000);
        staticPacket2 = new Packet(5000);
        staticPacket3 = new Packet(15000);
        staticInt287 = 0;
        staticInt189 = 0;
        staticInt190 = 0;
        staticInt268 = 0;
        staticInt192 = 0;
        staticInt193 = 0;
        staticInt255 = 0;
        staticInt195 = 0;
        staticBool42 = false;
        staticClass10_1 = new Class10();
        staticHashMap1 = new HashMap();
        staticInt200 = 0;
        staticInt198 = 1;
        staticInt199 = 0;
        staticInt289 = 1;
        staticInt228 = 0;
        staticCollisionMapArray1 = new CollisionMap[4];
        staticBool30 = false;
        staticIntArrayArrayArray3 = new int[4][13][13];
        staticIntArray82 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
        staticInt272 = 0;
        staticInt203 = 1;
        staticInt204 = 1;
        staticInt240 = 3353893;
        staticInt205 = 7759444;
        staticBool31 = false;
        staticInt206 = 0;
        staticInt161 = 128;
        staticInt207 = 0;
        staticInt283 = 0;
        staticInt173 = 0;
        staticInt284 = 0;
        staticInt209 = 0;
        staticInt210 = 50;
        staticInt191 = 0;
        staticBool32 = false;
        staticInt273 = 0;
        staticInt211 = 0;
        staticInt212 = 50;
        staticIntArray85 = new int[50];
        staticIntArray86 = new int[50];
        staticIntArray87 = new int[50];
        staticIntArray100 = new int[50];
        staticIntArray88 = new int[50];
        staticIntArray89 = new int[50];
        staticIntArray99 = new int[50];
        staticStringArray10 = new String[50];
        staticIntArrayArray9 = new int[104][104];
        staticInt215 = 0;
        staticInt202 = -1;
        staticInt208 = -1;
        staticInt218 = 0;
        staticInt219 = 0;
        staticInt288 = 0;
        staticInt220 = 0;
        staticInt221 = 0;
        staticInt222 = 0;
        staticInt223 = 0;
        staticInt224 = 0;
        staticInt277 = 0;
        staticInt266 = 0;
        staticBool40 = false;
        staticInt274 = 0;
        staticInt291 = 0;
        players = new Player[2048];
        staticInt293 = -1;
        staticInt229 = 0;
        staticInt230 = 0;
        staticIntArray92 = new int[1000];
        staticIntArray93 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };
        staticStringArray7 = new String[8];
        staticBoolArray6 = new boolean[8];
        staticIntArray94 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };
        staticInt234 = -1;
        staticDequeArrayArrayArray1 = new Deque[4][104][104];
        staticDeque4 = new Deque();
        staticDeque5 = new Deque();
        staticDeque6 = new Deque();
        staticIntArray84 = new int[25];
        staticIntArray95 = new int[25];
        staticIntArray96 = new int[25];
        staticInt232 = 0;
        staticBool34 = false;
        staticInt225 = 0;
        staticIntArray79 = new int[500];
        staticIntArray101 = new int[500];
        staticIntArray97 = new int[500];
        staticIntArray80 = new int[500];
        staticStringArray8 = new String[500];
        staticStringArray9 = new String[500];
        staticBoolArray4 = new boolean[500];
        staticBool35 = false;
        staticBool46 = false;
        staticInt226 = -1;
        staticInt235 = -1;
        staticInt236 = 0;
        staticInt237 = 50;
        staticInt194 = 0;
        staticString315 = null;
        staticBool36 = false;
        staticInt238 = -1;
        staticInt239 = -1;
        staticString316 = null;
        staticString313 = null;
        staticInt241 = -1;
        staticHashTable7 = new HashTable(8);
        staticInt242 = 0;
        staticInt243 = 0;
        staticWidget11 = null;
        staticInt244 = 0;
        staticInt245 = 0;
        staticInt246 = 0;
        staticInt247 = -1;
        staticBool37 = false;
        staticBool28 = false;
        staticBool29 = false;
        staticWidget12 = null;
        staticWidget10 = null;
        staticWidget9 = null;
        staticInt249 = 0;
        staticInt250 = 0;
        staticWidget8 = null;
        staticBool38 = false;
        staticInt251 = -1;
        staticInt252 = -1;
        staticBool39 = false;
        staticInt253 = -1;
        staticInt254 = -1;
        staticBool44 = false;
        staticInt256 = 1;
        staticIntArray103 = new int[32];
        staticInt257 = 0;
        staticIntArray104 = new int[32];
        staticInt258 = 0;
        staticIntArray111 = new int[32];
        staticInt259 = 0;
        staticInt290 = 0;
        staticInt260 = 0;
        staticInt261 = 0;
        staticInt262 = 0;
        staticInt263 = 0;
        staticInt264 = 0;
        staticInt265 = 0;
        staticDeque8 = new Deque();
        staticDeque9 = new Deque();
        staticDeque7 = new Deque();
        staticHashTable6 = new HashTable(512);
        staticInt269 = 0;
        staticInt270 = -2;
        staticBoolArray7 = new boolean[100];
        staticBoolArray8 = new boolean[100];
        staticBoolArray5 = new boolean[100];
        staticIntArray105 = new int[100];
        staticIntArray90 = new int[100];
        staticIntArray102 = new int[100];
        staticIntArray107 = new int[100];
        staticInt183 = 0;
        staticLong10 = 0L;
        staticBool33 = true;
        staticIntArray106 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
        staticInt275 = 0;
        staticInt217 = 0;
        staticString317 = "";
        staticLongArray3 = new long[100];
        staticInt233 = 0;
        staticInt276 = 0;
        staticIntArray119 = new int[128];
        staticIntArray108 = new int[128];
        staticLong11 = -1L;
        staticString314 = null;
        staticString318 = null;
        staticInt279 = 1;
        staticInt280 = 0;
        staticIntArray109 = new int[1000];
        staticIntArray110 = new int[1000];
        staticSpriteArray8 = new Sprite[1000];
        staticInt179 = 0;
        staticInt281 = 0;
        staticInt296 = 0;
        staticInt197 = 255;
        staticInt248 = -1;
        staticBool43 = false;
        staticInt174 = 127;
        staticInt267 = 127;
        staticInt285 = 0;
        staticIntArray112 = new int[50];
        staticIntArray113 = new int[50];
        staticIntArray114 = new int[50];
        staticIntArray115 = new int[50];
        staticSoundEffectArray1 = new SoundEffect[50];
        staticBool45 = false;
        staticBoolArray9 = new boolean[5];
        staticIntArray116 = new int[5];
        staticIntArray98 = new int[5];
        staticIntArray117 = new int[5];
        staticIntArray118 = new int[5];
        staticShort4 = 256;
        staticShort5 = 205;
        staticShort6 = 256;
        staticShort7 = 320;
        staticShort1 = 1;
        staticShort2 = 32767;
        staticShort8 = 1;
        staticShort3 = 32767;
        staticInt167 = 0;
        staticInt184 = 0;
        staticInt286 = 0;
        staticInt292 = 0;
        staticInt196 = 0;
        staticInt180 = 0;
        staticInt294 = 0;
        staticFriendArray1 = new Friend[400];
        staticNode2List1 = new Node2List();
        staticInt295 = 0;
        staticIgnoreArray1 = new Ignore[400];
        staticPlayerDef1 = new PlayerDef();
        staticInt297 = -1;
        staticInt298 = 1;
        staticExchangeOfferArray1 = new ExchangeOffer[8];
        staticAbstractClass1Sub1_1 = new AbstractClass1Sub1();
        staticIntArray120 = new int[50];
        staticIntArray121 = new int[50];
    }

    static Class11 staticMethod252() {
        return GameObject.staticClass11_1;
    }

    @Override
    protected final void method101() {
    }

    @Override
    public final void init() {
        if (method113()) {
            Class9[] arr_1 = Class9.staticMethod230();

            int i_6;
            for (int i_2 = 0; i_2 < arr_1.length; i_2++) {
                Class9 class9_3 = arr_1[i_2];
                String string_4 = getParameter(class9_3.string15);
                if (string_4 != null)
                    switch (Integer.parseInt(class9_3.string15)) {
                    case 1:
                        if (string_4.equalsIgnoreCase("true"))
                            staticBool24 = true;
                        else
                            staticBool24 = false;
                        break;
                    case 2:
                        if (string_4.equalsIgnoreCase("true"))
                            ;
                    case 3:
                    case 9:
                    case 13:
                    default:
                        break;
                    case 4:
                        GameType[] arr_22 = new GameType[] { GameType.staticGameType6, GameType.staticGameType3, GameType.staticGameType1, GameType.staticGameType4, GameType.staticGameType2, GameType.staticGameType5 };
                        staticGameType7 = (GameType) StaticClass26.staticMethod155(arr_22, Integer.parseInt(string_4));
                        if (GameType.staticGameType5 == staticGameType7)
                            DataClass14.staticClass12_10 = Class12.staticClass12_2;
                        else
                            DataClass14.staticClass12_10 = Class12.staticClass12_5;
                        break;
                    case 5:
                        i_6 = Integer.parseInt(string_4);
                        BuildType[] arr_7 = BuildType.staticMethod187();
                        int i_8 = 0;

                        BuildType buildtype_5;
                        while (true) {
                            if (i_8 >= arr_7.length) {
                                buildtype_5 = null;
                                break;
                            }

                            BuildType buildtype_9 = arr_7[i_8];
                            if (buildtype_9.int263 == i_6) {
                                buildtype_5 = buildtype_9;
                                break;
                            }

                            ++i_8;
                        }

                        CacheableSub1.staticBuildType5 = buildtype_5;
                        break;
                    case 6:
                        staticInt164 = Integer.parseInt(string_4);
                        break;
                    case 7:
                        BZip2Context.staticString28 = string_4;
                        break;
                    case 8:
                        staticInt271 = Integer.parseInt(string_4);
                        break;
                    case 10:
                        staticInt163 = Integer.parseInt(string_4);
                        break;
                    case 11:
                        WorldMap.staticString25 = string_4;
                        break;
                    case 12:
                        StaticClass9.staticInt46 = Integer.parseInt(string_4);
                        break;
                    case 14:
                        staticInt182 = Integer.parseInt(string_4);
                        break;
                    case 15:
                        staticInt162 = Integer.parseInt(string_4);
                    }
            }

            Scene.staticBool12 = false;
            staticBool25 = false;
            GameShell.staticString1 = getCodeBase().getHost();
            String string_15 = CacheableSub1.staticBuildType5.string14;
            byte b_16 = 0;

            try {
                StaticClass53.staticInt149 = 17;
                Ignore.staticInt25 = b_16;

                try {
                    DataClass6.staticString23 = System.getProperty("os.name");
                } catch (Exception exception_12) {
                    DataClass6.staticString23 = "Unknown";
                }

                SoundBank.staticString22 = DataClass6.staticString23.toLowerCase();

                try {
                    Class5.staticString3 = System.getProperty("user.home");
                    if (Class5.staticString3 != null)
                        Class5.staticString3 = Class5.staticString3 + "/";
                } catch (Exception exception_11) {
                    ;
                }

                try {
                    if (SoundBank.staticString22.startsWith("win")) {
                        if (Class5.staticString3 == null)
                            Class5.staticString3 = System.getenv("USERPROFILE");
                    } else if (Class5.staticString3 == null)
                        Class5.staticString3 = System.getenv("HOME");

                    if (Class5.staticString3 != null)
                        Class5.staticString3 = Class5.staticString3 + "/";
                } catch (Exception exception_10) {
                    ;
                }

                if (Class5.staticString3 == null)
                    Class5.staticString3 = "~/";

                ExchangeOfferComparator3.staticStringArray5 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Class5.staticString3, "/tmp/", "" };
                AbstractClass1Sub1.staticStringArray6 = new String[] { ".jagex_cache_" + Ignore.staticInt25, ".file_store_" + Ignore.staticInt25 };

                File file_25;
                label159: for (int i_17 = 0; i_17 < 4; i_17++) {
                    StaticClass16.staticFile2 = StaticClass16.staticMethod108("oldschool", string_15, i_17);
                    if (!StaticClass16.staticFile2.exists())
                        StaticClass16.staticFile2.mkdirs();

                    File[] arr_19 = StaticClass16.staticFile2.listFiles();
                    if (arr_19 == null)
                        break;

                    File[] arr_23 = arr_19;
                    i_6 = 0;

                    while (true) {
                        if (i_6 >= arr_23.length)
                            break label159;

                        file_25 = arr_23[i_6];
                        if (!StaticClass16.staticMethod110(file_25, false))
                            break;

                        ++i_6;
                    }
                }

                File file_18 = StaticClass16.staticFile2;
                StaticClass22.staticFile3 = file_18;
                if (!StaticClass22.staticFile3.exists())
                    throw new RuntimeException("");

                StaticClass22.staticBool17 = true;

                try {
                    File file_20 = new File(Class5.staticString3, "random.dat");
                    if (file_20.exists())
                        StaticClass16.staticBufferedFile1 = new BufferedFile(new FileOnDisk(file_20, "rw", 25L), 24, 0);
                    else
                        label137: for (int i_24 = 0; i_24 < AbstractClass1Sub1.staticStringArray6.length; i_24++)
                            for (i_6 = 0; i_6 < ExchangeOfferComparator3.staticStringArray5.length; i_6++) {
                                file_25 = new File(ExchangeOfferComparator3.staticStringArray5[i_6] + AbstractClass1Sub1.staticStringArray6[i_24] + File.separatorChar + "random.dat");
                                if (file_25.exists()) {
                                    StaticClass16.staticBufferedFile1 = new BufferedFile(new FileOnDisk(file_25, "rw", 25L), 24, 0);
                                    break label137;
                                }
                            }

                    if (StaticClass16.staticBufferedFile1 == null) {
                        RandomAccessFile randomaccessfile_26 = new RandomAccessFile(file_20, "rw");
                        i_6 = randomaccessfile_26.read();
                        randomaccessfile_26.seek(0L);
                        randomaccessfile_26.write(i_6);
                        randomaccessfile_26.seek(0L);
                        randomaccessfile_26.close();
                        StaticClass16.staticBufferedFile1 = new BufferedFile(new FileOnDisk(file_20, "rw", 25L), 24, 0);
                    }
                } catch (IOException ioexception_13) {
                    ;
                }

                StaticClass16.staticBufferedFile3 = new BufferedFile(new FileOnDisk(StaticClass22.staticMethod139("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
                StaticClass16.staticBufferedFile2 = new BufferedFile(new FileOnDisk(StaticClass22.staticMethod139("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
                StaticClass12.staticBufferedFileArray1 = new BufferedFile[StaticClass53.staticInt149];

                for (int i_21 = 0; i_21 < StaticClass53.staticInt149; i_21++)
                    StaticClass12.staticBufferedFileArray1[i_21] = new BufferedFile(new FileOnDisk(StaticClass22.staticMethod139("main_file_cache.idx" + i_21), "rw", 1048576L), 6000, 0);
            } catch (Exception exception_14) {
                ClientError.staticMethod113((String) null, exception_14);
            }

            NodeSub2.staticClient1 = this;
            method112(765, 503, 155);
        }
    }

    @Override
    protected final void method98() {
        DataClass9.staticInt110 = staticInt162 == 0 ? 43594 : staticInt271 + 40000;
        SoundSystem.staticInt75 = staticInt162 == 0 ? 443 : 50000 + staticInt271;
        ExchangeOfferComparator5.staticInt45 = DataClass9.staticInt110;
        ClientError.staticShortArray3 = StaticClass36.staticShortArray5;
        Mus5Sub4.staticShortArrayArray4 = StaticClass36.staticShortArrayArray2;
        TextureLoader.staticShortArray2 = StaticClass36.staticShortArray4;
        SoundSystemRunnable.staticShortArrayArray1 = StaticClass36.staticShortArrayArray3;
        FriendLogin.staticRunnableImpl1_1 = new RunnableImpl1();
        method107();
        method108();
        WMUnknown3.staticWheelRotationProvider1 = method104();
        MidiSequence.staticJs5DiskCache1 = new Js5DiskCache(255, StaticClass16.staticBufferedFile3, StaticClass16.staticBufferedFile2, 500000);
        StaticClass61.staticClientPreferences1 = ExchangeOfferComparator5.staticMethod41();
        method105();
        StaticClass8.staticMethod37(this, Js5CacheWriteRequest.staticString319);
        if (staticInt162 != 0)
            staticBool27 = true;

        staticMethod277(StaticClass61.staticClientPreferences1.int104);
    }

    @Override
    protected final void method99() {
        ++staticInt166;
        method397();

        while (true) {
            Deque deque_3 = Js5Worker.staticDeque3;
            Js5CacheWriteRequest js5cachewriterequest_2;
            synchronized (Js5Worker.staticDeque3) {
                js5cachewriterequest_2 = (Js5CacheWriteRequest) Js5Worker.staticDeque2.method255();
            }

            if (js5cachewriterequest_2 == null) {
                int i_48;
                try {
                    if (StaticClass32.staticInt133 == 1) {
                        i_48 = StaticClass32.staticMidiSequence1.method530();
                        if (i_48 > 0 && StaticClass32.staticMidiSequence1.synchronizedMethod29()) {
                            i_48 -= WorldMapLoadingProgress.staticInt150;
                            if (i_48 < 0)
                                i_48 = 0;

                            StaticClass32.staticMidiSequence1.synchronizedMethod23(i_48);
                        } else {
                            StaticClass32.staticMidiSequence1.synchronizedMethod28();
                            StaticClass32.staticMidiSequence1.synchronizedMethod26();
                            if (StaticClass32.staticJs5Index6 != null)
                                StaticClass32.staticInt133 = 2;
                            else
                                StaticClass32.staticInt133 = 0;

                            DataClass1.staticCompressedMidi1 = null;
                            StaticClass32.staticSoundBank1 = null;
                        }
                    }
                } catch (Exception exception_47) {
                    exception_47.printStackTrace();
                    StaticClass32.staticMidiSequence1.synchronizedMethod28();
                    StaticClass32.staticInt133 = 0;
                    DataClass1.staticCompressedMidi1 = null;
                    StaticClass32.staticSoundBank1 = null;
                    StaticClass32.staticJs5Index6 = null;
                }

                staticMethod263();
                KeyboardHandler keyboardhandler_50 = KeyboardHandler.staticKeyboardHandler1;
                int i_49;
                synchronized (KeyboardHandler.staticKeyboardHandler1) {
                    ++KeyboardHandler.staticVolatileInt1;
                    KeyboardHandler.staticInt24 = KeyboardHandler.staticInt23;
                    KeyboardHandler.staticInt21 = 0;
                    if (KeyboardHandler.staticInt19 >= 0)
                        while (KeyboardHandler.staticInt20 != KeyboardHandler.staticInt19) {
                            i_49 = KeyboardHandler.staticIntArray4[KeyboardHandler.staticInt20];
                            KeyboardHandler.staticInt20 = KeyboardHandler.staticInt20 + 1 & 0x7f;
                            if (i_49 < 0)
                                KeyboardHandler.staticBoolArray1[~i_49] = false;
                            else {
                                if (!KeyboardHandler.staticBoolArray1[i_49] && KeyboardHandler.staticInt21 < KeyboardHandler.staticIntArray5.length - 1)
                                    KeyboardHandler.staticIntArray5[KeyboardHandler.staticInt21++] = i_49;

                                KeyboardHandler.staticBoolArray1[i_49] = true;
                            }
                        }
                    else {
                        for (i_49 = 0; i_49 < 112; i_49++)
                            KeyboardHandler.staticBoolArray1[i_49] = false;

                        KeyboardHandler.staticInt19 = KeyboardHandler.staticInt20;
                    }

                    if (KeyboardHandler.staticInt21 > 0)
                        KeyboardHandler.staticVolatileInt1 = 0;

                    KeyboardHandler.staticInt23 = KeyboardHandler.staticInt22;
                }

                MouseHandler mousehandler_51 = MouseHandler.staticMouseHandler1;
                synchronized (MouseHandler.staticMouseHandler1) {
                    MouseHandler.staticInt26 = MouseHandler.staticVolatileInt3;
                    MouseHandler.staticInt28 = MouseHandler.staticVolatileInt4;
                    MouseHandler.staticInt29 = MouseHandler.staticVolatileInt5;
                    MouseHandler.staticInt27 = MouseHandler.staticVolatileInt7;
                    MouseHandler.staticInt30 = MouseHandler.staticVolatileInt6;
                    MouseHandler.staticInt31 = MouseHandler.staticVolatileInt2;
                    MouseHandler.staticLong2 = MouseHandler.staticVolatileLong1;
                    MouseHandler.staticVolatileInt7 = 0;
                }

                if (WMUnknown3.staticWheelRotationProvider1 != null) {
                    i_48 = WMUnknown3.staticWheelRotationProvider1.getWheelRotation();
                    staticInt265 = i_48;
                }

                if (staticInt165 == 0) {
                    staticMethod254();
                    GameShell.staticMethod35();
                } else if (staticInt165 == 5) {
                    StaticClass14.staticMethod70(this);
                    staticMethod254();
                    GameShell.staticMethod35();
                } else if (staticInt165 != 10 && staticInt165 != 11) {
                    if (staticInt165 == 20) {
                        StaticClass14.staticMethod70(this);
                        method400();
                    } else if (staticInt165 == 25) {
                        staticMethod297(false);
                        staticInt200 = 0;
                        boolean bool_53 = true;

                        for (i_49 = 0; i_49 < StaticClass2.staticByteArrayArray1.length; i_49++) {
                            if (BuildType.staticIntArray69[i_49] != -1 && StaticClass2.staticByteArrayArray1[i_49] == null) {
                                StaticClass2.staticByteArrayArray1[i_49] = StaticClass43.staticJs5IndexImpl10.getFile(BuildType.staticIntArray69[i_49], 0);
                                if (StaticClass2.staticByteArrayArray1[i_49] == null) {
                                    bool_53 = false;
                                    ++staticInt200;
                                }
                            }

                            if (staticIntArray83[i_49] != -1 && ExchangeOfferComparator6.staticByteArrayArray5[i_49] == null) {
                                ExchangeOfferComparator6.staticByteArrayArray5[i_49] = StaticClass43.staticJs5IndexImpl10.getFile(staticIntArray83[i_49], 0, StaticClass2.staticIntArrayArray1[i_49]);
                                if (ExchangeOfferComparator6.staticByteArrayArray5[i_49] == null) {
                                    bool_53 = false;
                                    ++staticInt200;
                                }
                            }
                        }

                        if (!bool_53)
                            staticInt228 = 1;
                        else {
                            staticInt199 = 0;
                            bool_53 = true;

                            int i_5;
                            int i_6;
                            for (i_49 = 0; i_49 < StaticClass2.staticByteArrayArray1.length; i_49++) {
                                byte[] bytes_4 = ExchangeOfferComparator6.staticByteArrayArray5[i_49];
                                if (bytes_4 != null) {
                                    i_5 = (HitMark.staticIntArray78[i_49] >> 8) * 64 - DataClass10.staticInt111;
                                    i_6 = (HitMark.staticIntArray78[i_49] & 0xff) * 64 - Class4.staticInt53;
                                    if (staticBool30) {
                                        i_5 = 10;
                                        i_6 = 10;
                                    }

                                    bool_53 &= StaticClass3.staticMethod18(bytes_4, i_5, i_6);
                                }
                            }

                            if (!bool_53)
                                staticInt228 = 2;
                            else {
                                if (staticInt228 != 0)
                                    staticMethod278("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);

                                staticMethod263();
                                staticMethod260();
                                staticMethod263();
                                LegacyClickboxDebug.staticScene1.method183();
                                staticMethod263();
                                System.gc();

                                for (i_49 = 0; i_49 < 4; i_49++)
                                    staticCollisionMapArray1[i_49].init();

                                int i_52;
                                for (i_49 = 0; i_49 < 4; i_49++)
                                    for (i_52 = 0; i_52 < 104; i_52++)
                                        for (i_5 = 0; i_5 < 104; i_5++)
                                            StaticClass3.staticByteArrayArrayArray1[i_49][i_52][i_5] = 0;

                                staticMethod263();
                                StaticClass3.staticInt32 = 99;
                                StaticClass3.staticByteArrayArrayArray2 = new byte[4][104][104];
                                StaticClass3.staticByteArrayArrayArray3 = new byte[4][104][104];
                                Class7.staticByteArrayArrayArray6 = new byte[4][104][104];
                                StaticClass3.staticByteArrayArrayArray4 = new byte[4][104][104];
                                StaticClass26.staticIntArrayArrayArray2 = new int[4][105][105];
                                StaticClass20.staticByteArrayArrayArray5 = new byte[4][105][105];
                                StaticClass5.staticIntArrayArray2 = new int[105][105];
                                StaticClass21.staticIntArray60 = new int[104];
                                DataClass1.staticIntArray2 = new int[104];
                                AABBClickboxDebug.staticIntArray131 = new int[104];
                                StaticClass3.staticIntArray7 = new int[104];
                                Huffman.staticIntArray59 = new int[104];
                                i_49 = StaticClass2.staticByteArrayArray1.length;

                                for (NodeSub3 nodesub3_54 = (NodeSub3) NodeSub3.staticDeque10.method257(); nodesub3_54 != null; nodesub3_54 = (NodeSub3) NodeSub3.staticDeque10.method259()) {
                                    if (nodesub3_54.sampledSound1 != null) {
                                        HealthBar.staticSequenceSub1_1.synchronizedMethod9(nodesub3_54.sampledSound1);
                                        nodesub3_54.sampledSound1 = null;
                                    }

                                    if (nodesub3_54.sampledSound2 != null) {
                                        HealthBar.staticSequenceSub1_1.synchronizedMethod9(nodesub3_54.sampledSound2);
                                        nodesub3_54.sampledSound2 = null;
                                    }
                                }

                                NodeSub3.staticDeque10.method252();
                                staticMethod297(true);
                                int i_56;
                                if (!staticBool30) {
                                    byte[] bytes_7;
                                    for (i_52 = 0; i_52 < i_49; i_52++) {
                                        i_5 = (HitMark.staticIntArray78[i_52] >> 8) * 64 - DataClass10.staticInt111;
                                        i_6 = (HitMark.staticIntArray78[i_52] & 0xff) * 64 - Class4.staticInt53;
                                        bytes_7 = StaticClass2.staticByteArrayArray1[i_52];
                                        if (bytes_7 != null) {
                                            staticMethod263();
                                            StaticClass3.staticMethod14(bytes_7, i_5, i_6, WM7.staticInt13 * 8 - 48, TaskManager.staticInt118 * 8 - 48, staticCollisionMapArray1);
                                        }
                                    }

                                    for (i_52 = 0; i_52 < i_49; i_52++) {
                                        i_5 = (HitMark.staticIntArray78[i_52] >> 8) * 64 - DataClass10.staticInt111;
                                        i_6 = (HitMark.staticIntArray78[i_52] & 0xff) * 64 - Class4.staticInt53;
                                        bytes_7 = StaticClass2.staticByteArrayArray1[i_52];
                                        if (bytes_7 == null && TaskManager.staticInt118 < 800) {
                                            staticMethod263();
                                            StaticClass3.staticMethod13(i_5, i_6, 64, 64);
                                        }
                                    }

                                    staticMethod297(true);

                                    for (i_52 = 0; i_52 < i_49; i_52++) {
                                        byte[] bytes_55 = ExchangeOfferComparator6.staticByteArrayArray5[i_52];
                                        if (bytes_55 != null) {
                                            i_6 = (HitMark.staticIntArray78[i_52] >> 8) * 64 - DataClass10.staticInt111;
                                            i_56 = (HitMark.staticIntArray78[i_52] & 0xff) * 64 - Class4.staticInt53;
                                            staticMethod263();
                                            StaticClass3.staticMethod19(bytes_55, i_6, i_56, LegacyClickboxDebug.staticScene1, staticCollisionMapArray1);
                                        }
                                    }
                                }

                                int i_8;
                                int i_9;
                                int i_10;
                                if (staticBool30) {
                                    i_52 = 0;

                                    label421: while (true) {
                                        int i_11;
                                        int i_12;
                                        int i_13;
                                        if (i_52 >= 4) {
                                            for (i_52 = 0; i_52 < 13; i_52++)
                                                for (i_5 = 0; i_5 < 13; i_5++) {
                                                    i_6 = staticIntArrayArrayArray3[0][i_52][i_5];
                                                    if (i_6 == -1)
                                                        StaticClass3.staticMethod13(i_52 * 8, i_5 * 8, 8, 8);
                                                }

                                            staticMethod297(true);
                                            i_52 = 0;

                                            while (true) {
                                                if (i_52 >= 4)
                                                    break label421;

                                                staticMethod263();

                                                for (i_5 = 0; i_5 < 13; i_5++)
                                                    label378: for (i_6 = 0; i_6 < 13; i_6++) {
                                                        i_56 = staticIntArrayArrayArray3[i_52][i_5][i_6];
                                                        if (i_56 != -1) {
                                                            i_8 = i_56 >> 24 & 0x3;
                                                            i_9 = i_56 >> 1 & 0x3;
                                                            i_10 = i_56 >> 14 & 0x3ff;
                                                            i_11 = i_56 >> 3 & 0x7ff;
                                                            i_12 = i_11 / 8 + (i_10 / 8 << 8);

                                                            for (i_13 = 0; i_13 < HitMark.staticIntArray78.length; i_13++)
                                                                if (HitMark.staticIntArray78[i_13] == i_12 && ExchangeOfferComparator6.staticByteArrayArray5[i_13] != null) {
                                                                    byte[] bytes_58 = ExchangeOfferComparator6.staticByteArrayArray5[i_13];
                                                                    int i_15 = i_5 * 8;
                                                                    int i_16 = i_6 * 8;
                                                                    int i_17 = (i_10 & 0x7) * 8;
                                                                    int i_18 = (i_11 & 0x7) * 8;
                                                                    Scene scene_19 = LegacyClickboxDebug.staticScene1;
                                                                    CollisionMap[] arr_20 = staticCollisionMapArray1;
                                                                    Buffer buffer_21 = new Buffer(bytes_58);
                                                                    int i_22 = -1;

                                                                    while (true) {
                                                                        int i_23 = buffer_21.method453();
                                                                        if (i_23 == 0)
                                                                            continue label378;

                                                                        i_22 += i_23;
                                                                        int i_24 = 0;

                                                                        while (true) {
                                                                            int i_25 = buffer_21.method453();
                                                                            if (i_25 == 0)
                                                                                break;

                                                                            i_24 += i_25 - 1;
                                                                            int i_26 = i_24 & 0x3f;
                                                                            int i_27 = i_24 >> 6 & 0x3f;
                                                                            int i_28 = i_24 >> 12;
                                                                            int i_29 = buffer_21.readUByte();
                                                                            int i_30 = i_29 >> 2;
                                                                            int i_31 = i_29 & 0x3;
                                                                            if (i_8 == i_28 && i_27 >= i_17 && i_27 < i_17 + 8 && i_26 >= i_18 && i_26 < i_18 + 8) {
                                                                                LocType loctype_32 = LocType.staticMethod411(i_22);
                                                                                int i_35 = i_27 & 0x7;
                                                                                int i_36 = i_26 & 0x7;
                                                                                int i_38 = loctype_32.int518;
                                                                                int i_39 = loctype_32.int519;
                                                                                int i_40;
                                                                                if ((i_31 & 0x1) == 1) {
                                                                                    i_40 = i_38;
                                                                                    i_38 = i_39;
                                                                                    i_39 = i_40;
                                                                                }

                                                                                int i_37 = i_9 & 0x3;
                                                                                int i_34;
                                                                                if (i_37 == 0)
                                                                                    i_34 = i_35;
                                                                                else if (i_37 == 1)
                                                                                    i_34 = i_36;
                                                                                else if (i_37 == 2)
                                                                                    i_34 = 7 - i_35 - (i_38 - 1);
                                                                                else
                                                                                    i_34 = 7 - i_36 - (i_39 - 1);

                                                                                i_40 = i_15 + i_34;
                                                                                int i_41 = i_16 + StaticClass34.staticMethod170(i_27 & 0x7, i_26 & 0x7, i_9, loctype_32.int518, loctype_32.int519, i_31);
                                                                                if (i_40 > 0 && i_41 > 0 && i_40 < 103 && i_41 < 103) {
                                                                                    int i_42 = i_52;
                                                                                    if ((StaticClass3.staticByteArrayArrayArray1[1][i_40][i_41] & 0x2) == 2)
                                                                                        i_42 = i_52 - 1;

                                                                                    CollisionMap collisionmap_43 = null;
                                                                                    if (i_42 >= 0)
                                                                                        collisionmap_43 = arr_20[i_42];

                                                                                    StaticClass3.staticMethod20(i_52, i_40, i_41, i_22, i_9 + i_31 & 0x3, i_30, scene_19, collisionmap_43);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                        }
                                                    }

                                                ++i_52;
                                            }
                                        }

                                        staticMethod263();

                                        for (i_5 = 0; i_5 < 13; i_5++)
                                            for (i_6 = 0; i_6 < 13; i_6++) {
                                                boolean bool_57 = false;
                                                i_8 = staticIntArrayArrayArray3[i_52][i_5][i_6];
                                                if (i_8 != -1) {
                                                    i_9 = i_8 >> 24 & 0x3;
                                                    i_10 = i_8 >> 1 & 0x3;
                                                    i_11 = i_8 >> 14 & 0x3ff;
                                                    i_12 = i_8 >> 3 & 0x7ff;
                                                    i_13 = (i_11 / 8 << 8) + i_12 / 8;

                                                    for (int i_14 = 0; i_14 < HitMark.staticIntArray78.length; i_14++)
                                                        if (i_13 == HitMark.staticIntArray78[i_14] && StaticClass2.staticByteArrayArray1[i_14] != null) {
                                                            StaticClass3.staticMethod15(StaticClass2.staticByteArrayArray1[i_14], i_52, i_5 * 8, i_6 * 8, i_9, (i_11 & 0x7) * 8, (i_12 & 0x7) * 8, i_10, staticCollisionMapArray1);
                                                            bool_57 = true;
                                                            break;
                                                        }
                                                }

                                                if (!bool_57)
                                                    StaticClass3.staticMethod16(i_52, i_5 * 8, i_6 * 8);
                                            }

                                        ++i_52;
                                    }
                                }

                                staticMethod297(true);
                                staticMethod260();
                                staticMethod263();
                                StaticClass3.staticMethod21(LegacyClickboxDebug.staticScene1, staticCollisionMapArray1);
                                staticMethod297(true);
                                i_52 = StaticClass3.staticInt32;
                                if (i_52 > DataClass14.staticInt156)
                                    i_52 = DataClass14.staticInt156;

                                if (i_52 < DataClass14.staticInt156 - 1)
                                    i_52 = DataClass14.staticInt156 - 1;

                                if (staticBool25)
                                    LegacyClickboxDebug.staticScene1.method184(StaticClass3.staticInt32);
                                else
                                    LegacyClickboxDebug.staticScene1.method184(0);

                                for (i_5 = 0; i_5 < 104; i_5++)
                                    for (i_6 = 0; i_6 < 104; i_6++)
                                        staticMethod304(i_5, i_6);

                                staticMethod263();
                                staticMethod301();
                                LocType.staticCache11.method264();
                                if (NodeSub2.staticClient1.method123()) {

                                    // dummy or anticheat
                                    staticPacket1.writeOpcode(64);
                                    staticPacket1.writeInt(1057001181);
                                }

                                if (!staticBool30) {
                                    i_5 = (WM7.staticInt13 - 6) / 8;
                                    i_6 = (WM7.staticInt13 + 6) / 8;
                                    i_56 = (TaskManager.staticInt118 - 6) / 8;
                                    i_8 = (TaskManager.staticInt118 + 6) / 8;

                                    for (i_9 = i_5 - 1; i_9 <= i_6 + 1; i_9++)
                                        for (i_10 = i_56 - 1; i_10 <= i_8 + 1; i_10++)
                                            if (i_9 < i_5 || i_9 > i_6 || i_10 < i_56 || i_10 > i_8) {
                                                StaticClass43.staticJs5IndexImpl10.request("m" + i_9 + "_" + i_10);
                                                StaticClass43.staticJs5IndexImpl10.request("l" + i_9 + "_" + i_10);
                                            }
                                }

                                staticMethod253(30);
                                staticMethod263();
                                StaticClass3.staticByteArrayArrayArray2 = null;
                                StaticClass3.staticByteArrayArrayArray3 = null;
                                Class7.staticByteArrayArrayArray6 = null;
                                StaticClass3.staticByteArrayArrayArray4 = null;
                                StaticClass26.staticIntArrayArrayArray2 = null;
                                StaticClass20.staticByteArrayArrayArray5 = null;
                                StaticClass5.staticIntArrayArray2 = null;
                                StaticClass21.staticIntArray60 = null;
                                DataClass1.staticIntArray2 = null;
                                AABBClickboxDebug.staticIntArray131 = null;
                                StaticClass3.staticIntArray7 = null;
                                Huffman.staticIntArray59 = null;
                                staticPacket1.writeOpcode(254);
                                GameShell.staticMethod35();
                            }
                        }
                    }
                } else
                    StaticClass14.staticMethod70(this);

                if (staticInt165 == 30)
                    method401();
                else if (staticInt165 == 40 || staticInt165 == 45)
                    method400();

                return;
            }

            js5cachewriterequest_2.js5IndexImpl1.method509(js5cachewriterequest_2.js5DiskCache1, (int) js5cachewriterequest_2.id, js5cachewriterequest_2.buffer, false);
        }
    }

    @Override
    protected final void method97(boolean bool_1) {
        boolean bool_3 = StaticClass32.staticMethod169();
        if (bool_3 && staticBool43 && WM8.staticSoundSystem2 != null)
            WM8.staticSoundSystem2.synchronizedMethod5();

        if ((staticInt165 == 10 || staticInt165 == 20 || staticInt165 == 30) && staticLong10 != 0L && StaticClass27.synchronizedMethod7() > staticLong10)
            staticMethod277(staticMethod276());

        int i_4;
        if (bool_1)
            for (i_4 = 0; i_4 < 100; i_4++)
                staticBoolArray7[i_4] = true;

        if (staticInt165 == 0)
            method118(StaticClass14.staticInt64, StaticClass14.staticString14, bool_1);
        else if (staticInt165 == 5)
            StaticClass14.staticMethod73(Friend.staticFontFace2, DebugOverlay.staticFontFace3, StaticClass1.staticFontFace1, bool_1);
        else if (staticInt165 != 10 && staticInt165 != 11) {
            if (staticInt165 == 20)
                StaticClass14.staticMethod73(Friend.staticFontFace2, DebugOverlay.staticFontFace3, StaticClass1.staticFontFace1, bool_1);
            else if (staticInt165 == 25) {
                if (staticInt228 == 1) {
                    if (staticInt200 > staticInt198)
                        staticInt198 = staticInt200;

                    i_4 = (staticInt198 * 50 - staticInt200 * 50) / staticInt198;
                    staticMethod278("Loading - please wait." + "<br>" + " (" + i_4 + "%" + ")", false);
                } else if (staticInt228 == 2) {
                    if (staticInt199 > staticInt289)
                        staticInt289 = staticInt199;

                    i_4 = 50 + (staticInt289 * 50 - staticInt199 * 50) / staticInt289;
                    staticMethod278("Loading - please wait." + "<br>" + " (" + i_4 + "%" + ")", false);
                } else
                    staticMethod278("Loading - please wait.", false);
            } else if (staticInt165 == 30)
                method402();
            else if (staticInt165 == 40)
                staticMethod278("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
            else if (staticInt165 == 45)
                staticMethod278("Please wait...", false);
        } else
            StaticClass14.staticMethod73(Friend.staticFontFace2, DebugOverlay.staticFontFace3, StaticClass1.staticFontFace1, bool_1);

        if (staticInt165 == 30 && staticInt183 == 0 && !bool_1 && !staticBool33) {
            for (i_4 = 0; i_4 < staticInt269; i_4++)
                if (staticBoolArray8[i_4]) {
                    ExchangeOfferComparator6.staticGraphicsBuffer1.drawImageClip(staticIntArray105[i_4], staticIntArray90[i_4], staticIntArray102[i_4], staticIntArray107[i_4]);
                    staticBoolArray8[i_4] = false;
                }
        } else if (staticInt165 > 0) {
            ExchangeOfferComparator6.staticGraphicsBuffer1.drawImage(0, 0);

            for (i_4 = 0; i_4 < staticInt269; i_4++)
                staticBoolArray8[i_4] = false;
        }

    }

    @Override
    protected final void method100() {
        if (GZipDecompressor.staticClass4_1.running())
            GZipDecompressor.staticClass4_1.shutdown();

        if (SoundBank.staticMouseCapturer1 != null)
            SoundBank.staticMouseCapturer1.running = false;

        SoundBank.staticMouseCapturer1 = null;
        if (StaticClass54.staticConnection4 != null) {
            StaticClass54.staticConnection4.shutdown();
            StaticClass54.staticConnection4 = null;
        }

        if (KeyboardHandler.staticKeyboardHandler1 != null) {
            KeyboardHandler keyboardhandler_2 = KeyboardHandler.staticKeyboardHandler1;
            synchronized (KeyboardHandler.staticKeyboardHandler1) {
                KeyboardHandler.staticKeyboardHandler1 = null;
            }
        }

        MouseHandler.staticMethod10();
        WMUnknown3.staticWheelRotationProvider1 = null;
        if (WM8.staticSoundSystem2 != null)
            WM8.staticSoundSystem2.shutdown();

        if (WorldMapResource.staticSoundSystem1 != null)
            WorldMapResource.staticSoundSystem1.shutdown();

        StaticClass45.staticMethod194();
        Object object_9 = Js5Worker.staticObject1;
        synchronized (Js5Worker.staticObject1) {
            if (Js5Worker.staticInt146 != 0) {
                Js5Worker.staticInt146 = 1;

                try {
                    Js5Worker.staticObject1.wait();
                } catch (InterruptedException interruptedexception_5) {
                    ;
                }
            }
        }

        if (FriendLogin.staticRunnableImpl1_1 != null) {
            FriendLogin.staticRunnableImpl1_1.method230();
            FriendLogin.staticRunnableImpl1_1 = null;
        }

        try {
            StaticClass16.staticBufferedFile3.close();

            for (int i_10 = 0; i_10 < StaticClass53.staticInt149; i_10++)
                StaticClass12.staticBufferedFileArray1[i_10].close();

            StaticClass16.staticBufferedFile2.close();
            StaticClass16.staticBufferedFile1.close();
        } catch (Exception exception_7) {
            ;
        }

    }

    static void staticMethod253(int i_0) {
        if (i_0 != staticInt165) {
            if (staticInt165 == 0)
                NodeSub2.staticClient1.method119();

            if (i_0 == 20 || i_0 == 40 || i_0 == 45) {
                staticInt181 = 0;
                staticInt227 = 0;
                staticInt278 = 0;
                staticClass10_1.method319(i_0);
                if (i_0 != 20)
                    staticMethod262(false);
            }

            if (i_0 != 20 && i_0 != 40 && StaticClass6.staticConnection2 != null) {
                StaticClass6.staticConnection2.shutdown();
                StaticClass6.staticConnection2 = null;
            }

            if (staticInt165 == 25) {
                staticInt228 = 0;
                staticInt200 = 0;
                staticInt198 = 1;
                staticInt199 = 0;
                staticInt289 = 1;
            }

            if (i_0 != 5 && i_0 != 10) {
                if (i_0 == 20)
                    StaticClass14.staticMethod65(staticJs5IndexImpl14, StaticClass2.staticJs5IndexImpl4, true, staticInt165 == 11 ? 4 : 0);
                else if (i_0 == 11)
                    StaticClass14.staticMethod65(staticJs5IndexImpl14, StaticClass2.staticJs5IndexImpl4, false, 4);
                else
                    StaticClass14.staticMethod68();
            } else
                StaticClass14.staticMethod65(staticJs5IndexImpl14, StaticClass2.staticJs5IndexImpl4, true, 0);

            staticInt165 = i_0;
        }
    }

    void method397() {
        if (staticInt165 != 1000) {
            boolean bool_2 = StaticClass45.staticMethod188();
            if (!bool_2)
                method398();

        }
    }

    void method398() {
        if (StaticClass45.staticInt142 >= 4) {
            method120("js5crc");
            staticInt165 = 1000;
        } else {
            if (StaticClass45.staticInt145 >= 4) {
                if (staticInt165 <= 5) {
                    method120("js5io");
                    staticInt165 = 1000;
                    return;
                }

                staticInt282 = 3000;
                StaticClass45.staticInt145 = 3;
            }

            if (--staticInt282 + 1 <= 0)
                try {
                    if (staticInt231 == 0) {
                        Class7.staticTask3 = staticTaskManager1.submitOpenSocket(GameShell.staticString1, ExchangeOfferComparator5.staticInt45);
                        ++staticInt231;
                    }

                    if (staticInt231 == 1) {
                        if (Class7.staticTask3.status == 2) {
                            method399(-1);
                            return;
                        }

                        if (Class7.staticTask3.status == 1)
                            ++staticInt231;
                    }

                    if (staticInt231 == 2) {
                        StaticClass3.staticConnection1 = new Connection((Socket) Class7.staticTask3.result, staticTaskManager1);
                        Buffer buffer_2 = new Buffer(5);
                        buffer_2.writeByte(15);
                        buffer_2.writeInt(155);
                        StaticClass3.staticConnection1.write(buffer_2.buf, 0, 5);
                        ++staticInt231;
                        NodeSub1.staticLong9 = StaticClass27.synchronizedMethod7();
                    }

                    if (staticInt231 == 3)
                        if (staticInt165 > 5 && StaticClass3.staticConnection1.available() <= 0) {
                            if (StaticClass27.synchronizedMethod7() - NodeSub1.staticLong9 > 30000L) {
                                method399(-2);
                                return;
                            }
                        } else {
                            int i_10 = StaticClass3.staticConnection1.read();
                            if (i_10 != 0) {
                                method399(i_10);
                                return;
                            }

                            ++staticInt231;
                        }

                    if (staticInt231 == 4) {
                        Connection connection_11 = StaticClass3.staticConnection1;
                        boolean bool_3 = staticInt165 > 20;
                        if (StaticClass45.staticConnection3 != null) {
                            try {
                                StaticClass45.staticConnection3.shutdown();
                            } catch (Exception exception_8) {
                                ;
                            }

                            StaticClass45.staticConnection3 = null;
                        }

                        StaticClass45.staticConnection3 = connection_11;
                        StaticClass45.staticMethod189(bool_3);
                        StaticClass45.staticBuffer4.off = 0;
                        StaticClass45.staticJs5DownloadRequest1 = null;
                        GameCanvas.staticBuffer1 = null;
                        StaticClass45.staticInt144 = 0;

                        while (true) {
                            Js5DownloadRequest js5downloadrequest_4 = (Js5DownloadRequest) StaticClass45.staticHashTable2.method267();
                            if (js5downloadrequest_4 == null)
                                while (true) {
                                    js5downloadrequest_4 = (Js5DownloadRequest) StaticClass45.staticHashTable4.method267();
                                    if (js5downloadrequest_4 == null) {
                                        if (StaticClass45.staticByte3 != 0)
                                            try {
                                                Buffer buffer_12 = new Buffer(4);
                                                buffer_12.writeByte(4);
                                                buffer_12.writeByte(StaticClass45.staticByte3);
                                                buffer_12.writeShort(0);
                                                StaticClass45.staticConnection3.write(buffer_12.buf, 0, 4);
                                            } catch (IOException ioexception_7) {
                                                try {
                                                    StaticClass45.staticConnection3.shutdown();
                                                } catch (Exception exception_6) {
                                                    ;
                                                }

                                                ++StaticClass45.staticInt145;
                                                StaticClass45.staticConnection3 = null;
                                            }

                                        StaticClass45.staticInt138 = 0;
                                        StaticClass45.staticLong8 = StaticClass27.synchronizedMethod7();
                                        Class7.staticTask3 = null;
                                        StaticClass3.staticConnection1 = null;
                                        staticInt231 = 0;
                                        staticInt185 = 0;
                                        return;
                                    }

                                    StaticClass45.staticQueue1.method265(js5downloadrequest_4);
                                    StaticClass45.staticHashTable3.put(js5downloadrequest_4, js5downloadrequest_4.id);
                                    ++StaticClass45.staticInt140;
                                    --StaticClass45.staticInt143;
                                }

                            StaticClass45.staticHashTable1.put(js5downloadrequest_4, js5downloadrequest_4.id);
                            ++StaticClass45.staticInt141;
                            --StaticClass45.staticInt139;
                        }
                    }
                } catch (IOException ioexception_9) {
                    method399(-3);
                }
        }
    }

    void method399(int i_1) {
        Class7.staticTask3 = null;
        StaticClass3.staticConnection1 = null;
        staticInt231 = 0;
        if (DataClass9.staticInt110 == ExchangeOfferComparator5.staticInt45)
            ExchangeOfferComparator5.staticInt45 = SoundSystem.staticInt75;
        else
            ExchangeOfferComparator5.staticInt45 = DataClass9.staticInt110;

        ++staticInt185;
        if (staticInt185 < 2 || i_1 != 7 && i_1 != 9) {
            if (staticInt185 >= 2 && i_1 == 6) {
                method120("js5connect_outofdate");
                staticInt165 = 1000;
            } else if (staticInt185 >= 4)
                if (staticInt165 <= 5) {
                    method120("js5connect");
                    staticInt165 = 1000;
                } else
                    staticInt282 = 3000;
        } else if (staticInt165 <= 5) {
            method120("js5connect_full");
            staticInt165 = 1000;
        } else
            staticInt282 = 3000;

    }

    static void staticMethod254() {
        int i_24;
        if (staticInt178 == 0) {
            LegacyClickboxDebug.staticScene1 = new Scene(4, 104, 104, StaticClass3.staticIntArrayArrayArray1);

            for (i_24 = 0; i_24 < 4; i_24++)
                staticCollisionMapArray1[i_24] = new CollisionMap(104, 104);

            WMEnum6.staticSprite4 = new Sprite(512, 512);
            StaticClass14.staticString14 = "Starting game engine...";
            StaticClass14.staticInt64 = 5;
            staticInt178 = 20;
        } else {
            int i_2;
            int i_3;
            int i_4;
            int i_5;
            if (staticInt178 != 20) {
                if (staticInt178 == 30) {
                    StaticClass7.staticJs5IndexImpl7 = staticMethod255(0, false, true, true);
                    Class4.staticJs5IndexImpl8 = staticMethod255(1, false, true, true);
                    DataClass11.staticJs5IndexImpl9 = staticMethod255(2, true, false, true);
                    ClanMember.staticJs5IndexImpl13 = staticMethod255(3, false, true, true);
                    WMEnum6.staticJs5IndexImpl12 = staticMethod255(4, false, true, true);
                    StaticClass43.staticJs5IndexImpl10 = staticMethod255(5, true, true, true);
                    StaticClass54.staticJs5IndexImpl11 = staticMethod255(6, true, true, false);
                    RenderableSub2.staticJs5IndexImpl17 = staticMethod255(7, false, true, true);
                    StaticClass2.staticJs5IndexImpl4 = staticMethod255(8, false, true, true);
                    LegacyClickboxDebug.staticJs5IndexImpl16 = staticMethod255(9, false, true, true);
                    staticJs5IndexImpl14 = staticMethod255(10, false, true, true);
                    Renderable.staticJs5IndexImpl15 = staticMethod255(11, false, true, true);
                    JavaxSoundSystemProvider.staticJs5IndexImpl3 = staticMethod255(12, false, true, true);
                    WorldMapTile.staticJs5IndexImpl1 = staticMethod255(13, true, false, true);
                    KeyboardHandler.staticJs5IndexImpl5 = staticMethod255(14, false, true, false);
                    StaticClass6.staticJs5IndexImpl6 = staticMethod255(15, false, true, true);
                    WorldMapArea.staticJs5IndexImpl2 = staticMethod255(16, false, true, false);
                    StaticClass14.staticString14 = "Connecting to update server";
                    StaticClass14.staticInt64 = 20;
                    staticInt178 = 40;
                } else if (staticInt178 == 40) {
                    byte b_35 = 0;
                    i_24 = b_35 + StaticClass7.staticJs5IndexImpl7.method506() * 4 / 100;
                    i_24 += Class4.staticJs5IndexImpl8.method506() * 4 / 100;
                    i_24 += DataClass11.staticJs5IndexImpl9.method506() * 2 / 100;
                    i_24 += ClanMember.staticJs5IndexImpl13.method506() * 2 / 100;
                    i_24 += WMEnum6.staticJs5IndexImpl12.method506() * 6 / 100;
                    i_24 += StaticClass43.staticJs5IndexImpl10.method506() * 4 / 100;
                    i_24 += StaticClass54.staticJs5IndexImpl11.method506() * 2 / 100;
                    i_24 += RenderableSub2.staticJs5IndexImpl17.method506() * 58 / 100;
                    i_24 += StaticClass2.staticJs5IndexImpl4.method506() * 2 / 100;
                    i_24 += LegacyClickboxDebug.staticJs5IndexImpl16.method506() * 2 / 100;
                    i_24 += staticJs5IndexImpl14.method506() * 2 / 100;
                    i_24 += Renderable.staticJs5IndexImpl15.method506() * 2 / 100;
                    i_24 += JavaxSoundSystemProvider.staticJs5IndexImpl3.method506() * 2 / 100;
                    i_24 += WorldMapTile.staticJs5IndexImpl1.method506() * 2 / 100;
                    i_24 += KeyboardHandler.staticJs5IndexImpl5.method506() * 2 / 100;
                    i_24 += StaticClass6.staticJs5IndexImpl6.method506() * 2 / 100;
                    i_24 += WorldMapArea.staticJs5IndexImpl2.method506() * 2 / 100;
                    if (i_24 != 100) {
                        if (i_24 != 0)
                            StaticClass14.staticString14 = "Checking for updates - " + i_24 + "%";

                        StaticClass14.staticInt64 = 30;
                    } else {
                        StaticClass14.staticString14 = "Loaded update list";
                        StaticClass14.staticInt64 = 30;
                        staticInt178 = 45;
                    }
                } else {
                    Js5IndexImpl js5indeximpl_29;
                    Js5IndexImpl js5indeximpl_30;
                    Js5IndexImpl js5indeximpl_31;
                    if (staticInt178 == 45) {
                        boolean bool_34 = !staticBool25;
                        WorldMapTile.staticInt7 = 22050;
                        WorldMapLabel.staticBool1 = bool_34;
                        ExchangeOfferComparator3.staticInt157 = 2;
                        MidiSequence midisequence_28 = new MidiSequence();
                        midisequence_28.synchronizedMethod30(9, 128);
                        WM8.staticSoundSystem2 = SoundSystem.staticMethod103(staticTaskManager1, 0, 22050);
                        WM8.staticSoundSystem2.synchronizedMethod3(midisequence_28);
                        js5indeximpl_29 = StaticClass6.staticJs5IndexImpl6;
                        js5indeximpl_30 = KeyboardHandler.staticJs5IndexImpl5;
                        js5indeximpl_31 = WMEnum6.staticJs5IndexImpl12;
                        StaticClass32.staticJs5Index4 = js5indeximpl_29;
                        StaticClass32.staticJs5Index5 = js5indeximpl_30;
                        StaticClass32.staticJs5Index3 = js5indeximpl_31;
                        StaticClass32.staticMidiSequence1 = midisequence_28;
                        WorldMapResource.staticSoundSystem1 = SoundSystem.staticMethod103(staticTaskManager1, 1, 2048);
                        HealthBar.staticSequenceSub1_1 = new SequenceSub1();
                        WorldMapResource.staticSoundSystem1.synchronizedMethod3(HealthBar.staticSequenceSub1_1);
                        Renderable.staticMus9_1 = new Mus9(22050, WorldMapTile.staticInt7);
                        StaticClass14.staticString14 = "Prepared sound engine";
                        StaticClass14.staticInt64 = 35;
                        staticInt178 = 50;
                        ItemContainer.staticFontLoader1 = new FontLoader(StaticClass2.staticJs5IndexImpl4, WorldMapTile.staticJs5IndexImpl1);
                    } else if (staticInt178 == 50) {
                        i_24 = FontDescriptor.staticMethod222().length;
                        staticHashMap1 = ItemContainer.staticFontLoader1.loadFonts(FontDescriptor.staticMethod222());
                        if (staticHashMap1.size() < i_24) {
                            StaticClass14.staticString14 = "Loading fonts - " + staticHashMap1.size() * 100 / i_24 + "%";
                            StaticClass14.staticInt64 = 40;
                        } else {
                            DebugOverlay.staticFontFace3 = (FontFace) staticHashMap1.get(FontDescriptor.staticFontDescriptor5);
                            StaticClass1.staticFontFace1 = (FontFace) staticHashMap1.get(FontDescriptor.staticFontDescriptor1);
                            Friend.staticFontFace2 = (FontFace) staticHashMap1.get(FontDescriptor.staticFontDescriptor2);
                            WMUnknown3.staticComputerInfo1 = new ComputerInfo(true);
                            StaticClass14.staticString14 = "Loaded fonts";
                            StaticClass14.staticInt64 = 40;
                            staticInt178 = 60;
                        }
                    } else {
                        Js5IndexImpl js5indeximpl_27;
                        if (staticInt178 == 60) {
                            js5indeximpl_27 = staticJs5IndexImpl14;
                            js5indeximpl_29 = StaticClass2.staticJs5IndexImpl4;
                            i_4 = 0;
                            if (js5indeximpl_27.method308("title.jpg", ""))
                                ++i_4;

                            if (js5indeximpl_29.method308("logo", ""))
                                ++i_4;

                            if (js5indeximpl_29.method308("logo_deadman_mode", ""))
                                ++i_4;

                            if (js5indeximpl_29.method308("titlebox", ""))
                                ++i_4;

                            if (js5indeximpl_29.method308("titlebutton", ""))
                                ++i_4;

                            if (js5indeximpl_29.method308("runes", ""))
                                ++i_4;

                            if (js5indeximpl_29.method308("title_mute", ""))
                                ++i_4;

                            if (js5indeximpl_29.method308("options_radio_buttons,0", ""))
                                ++i_4;

                            if (js5indeximpl_29.method308("options_radio_buttons,2", ""))
                                ++i_4;

                            if (js5indeximpl_29.method308("options_radio_buttons,4", ""))
                                ++i_4;

                            if (js5indeximpl_29.method308("options_radio_buttons,6", ""))
                                ++i_4;

                            js5indeximpl_29.method308("sl_back", "");
                            js5indeximpl_29.method308("sl_flags", "");
                            js5indeximpl_29.method308("sl_arrows", "");
                            js5indeximpl_29.method308("sl_stars", "");
                            js5indeximpl_29.method308("sl_button", "");
                            byte b_32 = 11;
                            if (i_4 < b_32) {
                                StaticClass14.staticString14 = "Loading title screen - " + i_4 * 100 / b_32 + "%";
                                StaticClass14.staticInt64 = 50;
                            } else {
                                StaticClass14.staticString14 = "Loaded title screen";
                                StaticClass14.staticInt64 = 50;
                                staticMethod253(5);
                                staticInt178 = 70;
                            }
                        } else if (staticInt178 == 70) {
                            if (!DataClass11.staticJs5IndexImpl9.loaded()) {
                                StaticClass14.staticString14 = "Loading config - " + DataClass11.staticJs5IndexImpl9.getLoadedPercentage() + "%";
                                StaticClass14.staticInt64 = 60;
                            } else {
                                Overlay.staticMethod431(DataClass11.staticJs5IndexImpl9);
                                Js5IndexImpl js5indeximpl_33 = DataClass11.staticJs5IndexImpl9;
                                Underlay.staticJs5Index30 = js5indeximpl_33;
                                js5indeximpl_27 = DataClass11.staticJs5IndexImpl9;
                                js5indeximpl_29 = RenderableSub2.staticJs5IndexImpl17;
                                Identikit.staticJs5Index18 = js5indeximpl_27;
                                Identikit.staticJs5Index17 = js5indeximpl_29;
                                Identikit.staticInt308 = Identikit.staticJs5Index18.numFiles(3);
                                LocType.staticMethod410(DataClass11.staticJs5IndexImpl9, RenderableSub2.staticJs5IndexImpl17, staticBool25);
                                NpcType.staticMethod412(DataClass11.staticJs5IndexImpl9, RenderableSub2.staticJs5IndexImpl17);
                                CacheableSub2.staticMethod428(DataClass11.staticJs5IndexImpl9);
                                js5indeximpl_30 = DataClass11.staticJs5IndexImpl9;
                                js5indeximpl_31 = RenderableSub2.staticJs5IndexImpl17;
                                boolean bool_6 = staticBool24;
                                FontFace fontface_7 = DebugOverlay.staticFontFace3;
                                ExchangeOfferComparator1.staticJs5Index2 = js5indeximpl_30;
                                Class5.staticJs5Index1 = js5indeximpl_31;
                                WM2.staticBool3 = bool_6;
                                StaticClass43.staticInt134 = ExchangeOfferComparator1.staticJs5Index2.numFiles(10);
                                ObjType.staticFontFace4 = fontface_7;
                                Js5IndexImpl js5indeximpl_8 = DataClass11.staticJs5IndexImpl9;
                                Js5IndexImpl js5indeximpl_9 = StaticClass7.staticJs5IndexImpl7;
                                Js5IndexImpl js5indeximpl_10 = Class4.staticJs5IndexImpl8;
                                SeqType.staticJs5Index36 = js5indeximpl_8;
                                SeqType.staticJs5Index35 = js5indeximpl_9;
                                SeqType.staticJs5Index37 = js5indeximpl_10;
                                SpotAnim.staticMethod417(DataClass11.staticJs5IndexImpl9, RenderableSub2.staticJs5IndexImpl17);
                                Js5IndexImpl js5indeximpl_11 = DataClass11.staticJs5IndexImpl9;
                                Varbit.staticJs5Index22 = js5indeximpl_11;
                                Varp.staticMethod423(DataClass11.staticJs5IndexImpl9);
                                Js5IndexImpl js5indeximpl_12 = ClanMember.staticJs5IndexImpl13;
                                Js5IndexImpl js5indeximpl_13 = RenderableSub2.staticJs5IndexImpl17;
                                Js5IndexImpl js5indeximpl_14 = StaticClass2.staticJs5IndexImpl4;
                                Js5IndexImpl js5indeximpl_15 = WorldMapTile.staticJs5IndexImpl1;
                                AnimTransform.staticJs5Index7 = js5indeximpl_12;
                                Widget.staticJs5Index10 = js5indeximpl_13;
                                Widget.staticJs5Index9 = js5indeximpl_14;
                                Widget.staticJs5Index8 = js5indeximpl_15;
                                StaticClass25.staticWidgetArrayArray1 = new Widget[AnimTransform.staticJs5Index7.numGroups()][];
                                Widget.staticBoolArray11 = new boolean[AnimTransform.staticJs5Index7.numGroups()];
                                InvType.staticMethod426(DataClass11.staticJs5IndexImpl9);
                                Js5IndexImpl js5indeximpl_16 = DataClass11.staticJs5IndexImpl9;
                                RuneScriptMap.staticJs5Index23 = js5indeximpl_16;
                                Js5IndexImpl js5indeximpl_17 = DataClass11.staticJs5IndexImpl9;
                                Config19.staticJs5Index19 = js5indeximpl_17;
                                Js5IndexImpl js5indeximpl_18 = DataClass11.staticJs5IndexImpl9;
                                Config15.staticJs5Index11 = js5indeximpl_18;
                                ParamType.staticMethod434(DataClass11.staticJs5IndexImpl9);
                                GZipDecompressor.staticClass4_1 = new Class4();
                                Js5IndexImpl js5indeximpl_19 = DataClass11.staticJs5IndexImpl9;
                                Js5IndexImpl js5indeximpl_20 = StaticClass2.staticJs5IndexImpl4;
                                Js5IndexImpl js5indeximpl_21 = WorldMapTile.staticJs5IndexImpl1;
                                Config32.staticJs5Index26 = js5indeximpl_19;
                                Config32.staticJs5Index24 = js5indeximpl_20;
                                Config32.staticJs5Index25 = js5indeximpl_21;
                                Js5IndexImpl js5indeximpl_22 = DataClass11.staticJs5IndexImpl9;
                                Js5IndexImpl js5indeximpl_23 = StaticClass2.staticJs5IndexImpl4;
                                HealthBarType.staticJs5Index34 = js5indeximpl_22;
                                HealthBarType.staticJs5Index33 = js5indeximpl_23;
                                MapElementType.staticMethod414(DataClass11.staticJs5IndexImpl9, StaticClass2.staticJs5IndexImpl4);
                                StaticClass14.staticString14 = "Loaded config";
                                StaticClass14.staticInt64 = 60;
                                staticInt178 = 80;
                            }
                        } else if (staticInt178 == 80) {
                            i_24 = 0;
                            if (ExchangeOfferComparator1.staticSprite3 == null)
                                ExchangeOfferComparator1.staticSprite3 = StaticClass59.staticMethod237(StaticClass2.staticJs5IndexImpl4, "compass", "");
                            else
                                ++i_24;

                            if (ExchangeOfferComparator1.staticSprite2 == null)
                                ExchangeOfferComparator1.staticSprite2 = StaticClass59.staticMethod237(StaticClass2.staticJs5IndexImpl4, "mapedge", "");
                            else
                                ++i_24;

                            if (WorldMapLoadingProgress.staticIndexedSpriteArray8 == null)
                                WorldMapLoadingProgress.staticIndexedSpriteArray8 = StaticClass59.staticMethod234(StaticClass2.staticJs5IndexImpl4, "mapscene", "");
                            else
                                ++i_24;

                            if (DataClass11.staticSpriteArray6 == null)
                                DataClass11.staticSpriteArray6 = StaticClass59.staticMethod236(StaticClass2.staticJs5IndexImpl4, "headicons_pk", "");
                            else
                                ++i_24;

                            if (DataClass1.staticSpriteArray3 == null)
                                DataClass1.staticSpriteArray3 = StaticClass59.staticMethod236(StaticClass2.staticJs5IndexImpl4, "headicons_prayer", "");
                            else
                                ++i_24;

                            if (WorldMapRegionStorage.staticSpriteArray2 == null)
                                WorldMapRegionStorage.staticSpriteArray2 = StaticClass59.staticMethod236(StaticClass2.staticJs5IndexImpl4, "headicons_hint", "");
                            else
                                ++i_24;

                            if (StaticClass6.staticSpriteArray5 == null)
                                StaticClass6.staticSpriteArray5 = StaticClass59.staticMethod236(StaticClass2.staticJs5IndexImpl4, "mapmarker", "");
                            else
                                ++i_24;

                            if (StaticClass1.staticSpriteArray1 == null)
                                StaticClass1.staticSpriteArray1 = StaticClass59.staticMethod236(StaticClass2.staticJs5IndexImpl4, "cross", "");
                            else
                                ++i_24;

                            if (MouseHandler.staticSpriteArray4 == null)
                                MouseHandler.staticSpriteArray4 = StaticClass59.staticMethod236(StaticClass2.staticJs5IndexImpl4, "mapdots", "");
                            else
                                ++i_24;

                            if (WM1.staticIndexedSpriteArray1 == null)
                                WM1.staticIndexedSpriteArray1 = StaticClass59.staticMethod234(StaticClass2.staticJs5IndexImpl4, "scrollbar", "");
                            else
                                ++i_24;

                            if (DataClass6.staticIndexedSpriteArray4 == null)
                                DataClass6.staticIndexedSpriteArray4 = StaticClass59.staticMethod234(StaticClass2.staticJs5IndexImpl4, "mod_icons", "");
                            else
                                ++i_24;

                            if (i_24 < 11) {
                                StaticClass14.staticString14 = "Loading sprites - " + i_24 * 100 / 12 + "%";
                                StaticClass14.staticInt64 = 70;
                            } else {
                                TypeFace.staticIndexedSpriteArray9 = DataClass6.staticIndexedSpriteArray4;
                                ExchangeOfferComparator1.staticSprite2.method677();
                                i_2 = (int) (Math.random() * 21.0D) - 10;
                                i_3 = (int) (Math.random() * 21.0D) - 10;
                                i_4 = (int) (Math.random() * 21.0D) - 10;
                                i_5 = (int) (Math.random() * 41.0D) - 20;
                                WorldMapLoadingProgress.staticIndexedSpriteArray8[0].method672(i_5 + i_2, i_5 + i_3, i_4 + i_5);
                                StaticClass14.staticString14 = "Loaded sprites";
                                StaticClass14.staticInt64 = 70;
                                staticInt178 = 90;
                            }
                        } else if (staticInt178 == 90) {
                            if (!LegacyClickboxDebug.staticJs5IndexImpl16.loaded()) {
                                StaticClass14.staticString14 = "Loading textures - " + LegacyClickboxDebug.staticJs5IndexImpl16.getLoadedPercentage() + "%";
                                StaticClass14.staticInt64 = 90;
                            } else {
                                TextureLoader textureloader_26 = new TextureLoader(LegacyClickboxDebug.staticJs5IndexImpl16, StaticClass2.staticJs5IndexImpl4, 20, 0.8D, staticBool25 ? 64 : 128);
                                Rasterizer3D.staticMethod474(textureloader_26);
                                Rasterizer3D.staticMethod475(0.8D);
                                StaticClass14.staticString14 = "Loaded textures";
                                StaticClass14.staticInt64 = 90;
                                staticInt178 = 110;
                            }
                        } else if (staticInt178 == 110) {
                            SoundBank.staticMouseCapturer1 = new MouseCapturer();
                            staticTaskManager1.submitRunnable(SoundBank.staticMouseCapturer1, 10);
                            StaticClass14.staticString14 = "Loaded input handler";
                            StaticClass14.staticInt64 = 92;
                            staticInt178 = 120;
                        } else if (staticInt178 == 120) {
                            if (!staticJs5IndexImpl14.method308("huffman", "")) {
                                StaticClass14.staticString14 = "Loading wordpack - " + 0 + "%";
                                StaticClass14.staticInt64 = 94;
                            } else {
                                Huffman huffman_25 = new Huffman(staticJs5IndexImpl14.getFile("huffman", ""));
                                StaticClass50.staticMethod206(huffman_25);
                                StaticClass14.staticString14 = "Loaded wordpack";
                                StaticClass14.staticInt64 = 94;
                                staticInt178 = 130;
                            }
                        } else if (staticInt178 == 130) {
                            if (!ClanMember.staticJs5IndexImpl13.loaded()) {
                                StaticClass14.staticString14 = "Loading interfaces - " + ClanMember.staticJs5IndexImpl13.getLoadedPercentage() * 4 / 5 + "%";
                                StaticClass14.staticInt64 = 96;
                            } else if (!JavaxSoundSystemProvider.staticJs5IndexImpl3.loaded()) {
                                StaticClass14.staticString14 = "Loading interfaces - " + (80 + JavaxSoundSystemProvider.staticJs5IndexImpl3.getLoadedPercentage() / 6) + "%";
                                StaticClass14.staticInt64 = 96;
                            } else if (!WorldMapTile.staticJs5IndexImpl1.loaded()) {
                                StaticClass14.staticString14 = "Loading interfaces - " + (96 + WorldMapTile.staticJs5IndexImpl1.getLoadedPercentage() / 50) + "%";
                                StaticClass14.staticInt64 = 96;
                            } else {
                                StaticClass14.staticString14 = "Loaded interfaces";
                                StaticClass14.staticInt64 = 98;
                                staticInt178 = 140;
                            }
                        } else if (staticInt178 == 140) {
                            StaticClass14.staticInt64 = 100;
                            if (!WorldMapArea.staticJs5IndexImpl2.method309(WorldMapResource.staticWorldMapResource2.filename))
                                StaticClass14.staticString14 = "Loading world map - " + WorldMapArea.staticJs5IndexImpl2.getLoadedPercentage(WorldMapResource.staticWorldMapResource2.filename) / 10 + "%";
                            else {
                                if (GameObject.staticClass11_1 == null) {
                                    GameObject.staticClass11_1 = new Class11();
                                    GameObject.staticClass11_1.method324(WorldMapArea.staticJs5IndexImpl2, Friend.staticFontFace2, staticHashMap1, WorldMapLoadingProgress.staticIndexedSpriteArray8);
                                }

                                i_24 = GameObject.staticClass11_1.method325();
                                if (i_24 < 100)
                                    StaticClass14.staticString14 = "Loading world map - " + (10 + i_24 * 9 / 10) + "%";
                                else {
                                    StaticClass14.staticString14 = "Loaded world map";
                                    staticInt178 = 150;
                                }
                            }
                        } else if (staticInt178 == 150)
                            staticMethod253(10);
                    }
                }
            } else {
                int[] ints_1 = new int[9];

                for (i_2 = 0; i_2 < 9; i_2++) {
                    i_3 = 128 + i_2 * 32 + 15;
                    i_4 = 600 + i_3 * 3;
                    i_5 = Rasterizer3D.staticIntArray156[i_3];
                    ints_1[i_2] = i_5 * i_4 >> 16;
                }

                Scene.staticMethod116(ints_1, 500, 800, 512, 334);
                StaticClass14.staticString14 = "Prepared visibility map";
                StaticClass14.staticInt64 = 10;
                staticInt178 = 30;
            }
        }
    }

    static Js5IndexImpl staticMethod255(int i_0, boolean bool_1, boolean bool_2, boolean bool_3) {
        Js5DiskCache js5diskcache_5 = null;
        if (StaticClass16.staticBufferedFile3 != null)
            js5diskcache_5 = new Js5DiskCache(i_0, StaticClass16.staticBufferedFile3, StaticClass12.staticBufferedFileArray1[i_0], 1000000);

        return new Js5IndexImpl(js5diskcache_5, MidiSequence.staticJs5DiskCache1, i_0, bool_1, bool_2, bool_3);
    }

    final void method400() {
        try {
            if (staticInt181 == 0) {
                if (StaticClass54.staticConnection4 != null) {
                    StaticClass54.staticConnection4.shutdown();
                    StaticClass54.staticConnection4 = null;
                }

                JavaxSoundSystemProvider.staticTask2 = null;
                staticBool42 = false;
                staticInt227 = 0;
                staticInt181 = 1;
            }

            if (staticInt181 == 1) {
                if (JavaxSoundSystemProvider.staticTask2 == null)
                    JavaxSoundSystemProvider.staticTask2 = staticTaskManager1.submitOpenSocket(GameShell.staticString1, ExchangeOfferComparator5.staticInt45);

                if (JavaxSoundSystemProvider.staticTask2.status == 2)
                    throw new IOException();

                if (JavaxSoundSystemProvider.staticTask2.status == 1) {
                    StaticClass54.staticConnection4 = new Connection((Socket) JavaxSoundSystemProvider.staticTask2.result, staticTaskManager1);
                    JavaxSoundSystemProvider.staticTask2 = null;
                    staticInt181 = 2;
                }
            }

            if (staticInt181 == 2) {
                staticPacket1.off = 0;
                staticPacket1.writeByte(14);
                StaticClass54.staticConnection4.write(staticPacket1.buf, 0, 1);
                staticPacket3.off = 0;
                staticInt181 = 3;
            }

            int i_2;
            if (staticInt181 == 3) {
                if (WM8.staticSoundSystem2 != null)
                    WM8.staticSoundSystem2.method160();

                if (WorldMapResource.staticSoundSystem1 != null)
                    WorldMapResource.staticSoundSystem1.method160();

                i_2 = StaticClass54.staticConnection4.read();
                if (WM8.staticSoundSystem2 != null)
                    WM8.staticSoundSystem2.method160();

                if (WorldMapResource.staticSoundSystem1 != null)
                    WorldMapResource.staticSoundSystem1.method160();

                if (i_2 != 0) {
                    staticMethod258(i_2);
                    return;
                }

                staticPacket3.off = 0;
                staticInt181 = 4;
            }

            if (staticInt181 == 4) {
                if (staticPacket3.off < 8) {
                    i_2 = StaticClass54.staticConnection4.available();
                    if (i_2 > 8 - staticPacket3.off)
                        i_2 = 8 - staticPacket3.off;

                    if (i_2 > 0) {
                        StaticClass54.staticConnection4.read(staticPacket3.buf, staticPacket3.off, i_2);
                        staticPacket3.off += i_2;
                    }
                }

                if (staticPacket3.off == 8) {
                    staticPacket3.off = 0;
                    ChatLine.staticLong13 = staticPacket3.method445();
                    staticInt181 = 5;
                }
            }

            int i_8;
            int i_13;
            if (staticInt181 == 5) {
                int[] ints_12 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (ChatLine.staticLong13 >> 32), (int) (ChatLine.staticLong13 & ~0x0L) };
                staticPacket1.off = 0;
                staticPacket1.writeByte(1);
                staticPacket1.writeByte(staticAuthenticatorState5.ordinal());
                staticPacket1.writeInt(ints_12[0]);
                staticPacket1.writeInt(ints_12[1]);
                staticPacket1.writeInt(ints_12[2]);
                staticPacket1.writeInt(ints_12[3]);
                int i_7;
                switch (staticAuthenticatorState5.int179) {
                case 0:
                    staticPacket1.off += 8;
                    break;
                case 1:
                case 3:
                    staticPacket1.writeTriByte(AnimTransform.staticInt303);
                    staticPacket1.off += 5;
                    break;
                case 2:
                    Packet packet_3 = staticPacket1;
                    LinkedHashMap linkedhashmap_4 = StaticClass61.staticClientPreferences1.linkedHashMap1;
                    String string_6 = StaticClass14.staticString17;
                    i_7 = string_6.length();
                    i_8 = 0;

                    for (int i_9 = 0; i_9 < i_7; i_9++)
                        i_8 = (i_8 << 5) - i_8 + string_6.charAt(i_9);

                    packet_3.writeInt(((Integer) linkedhashmap_4.get(Integer.valueOf(i_8))).intValue());
                    staticPacket1.off += 4;
                }

                staticPacket1.method430(StaticClass14.staticString18);
                staticPacket1.method461(StaticClass11.RSA_EXPONENT, StaticClass11.RSA_MODULUS);
                staticPacket2.off = 0;
                if (staticInt165 == 40)
                    staticPacket2.writeByte(18);
                else
                    staticPacket2.writeByte(16);

                staticPacket2.writeShort(0);
                i_13 = staticPacket2.off;
                staticPacket2.writeInt(155);
                staticPacket2.method433(staticPacket1.buf, 0, staticPacket1.off);
                int i_16 = staticPacket2.off;
                staticPacket2.method430(StaticClass14.staticString17);
                staticPacket2.writeByte((staticBool33 ? 1 : 0) << 1 | (staticBool25 ? 1 : 0));
                staticPacket2.writeShort(StaticClass5.staticInt35);
                staticPacket2.writeShort(Class2.staticInt16);
                Packet packet_5 = staticPacket2;
                if (staticByteArray5 != null)
                    packet_5.method433(staticByteArray5, 0, staticByteArray5.length);
                else {
                    byte[] bytes_21 = StaticClass16.staticMethod112();
                    packet_5.method433(bytes_21, 0, bytes_21.length);
                }

                staticPacket2.method430(WorldMap.staticString25);
                staticPacket2.writeInt(StaticClass9.staticInt46);
                Buffer buffer_22 = new Buffer(WMUnknown3.staticComputerInfo1.method513());
                WMUnknown3.staticComputerInfo1.method512(buffer_22);
                staticPacket2.method433(buffer_22.buf, 0, buffer_22.buf.length);
                staticPacket2.writeByte(staticInt164);
                staticPacket2.writeInt(0);
                staticPacket2.writeInt(StaticClass7.staticJs5IndexImpl7.crc);
                staticPacket2.writeInt(Class4.staticJs5IndexImpl8.crc);
                staticPacket2.writeInt(DataClass11.staticJs5IndexImpl9.crc);
                staticPacket2.writeInt(ClanMember.staticJs5IndexImpl13.crc);
                staticPacket2.writeInt(WMEnum6.staticJs5IndexImpl12.crc);
                staticPacket2.writeInt(StaticClass43.staticJs5IndexImpl10.crc);
                staticPacket2.writeInt(StaticClass54.staticJs5IndexImpl11.crc);
                staticPacket2.writeInt(RenderableSub2.staticJs5IndexImpl17.crc);
                staticPacket2.writeInt(StaticClass2.staticJs5IndexImpl4.crc);
                staticPacket2.writeInt(LegacyClickboxDebug.staticJs5IndexImpl16.crc);
                staticPacket2.writeInt(staticJs5IndexImpl14.crc);
                staticPacket2.writeInt(Renderable.staticJs5IndexImpl15.crc);
                staticPacket2.writeInt(JavaxSoundSystemProvider.staticJs5IndexImpl3.crc);
                staticPacket2.writeInt(WorldMapTile.staticJs5IndexImpl1.crc);
                staticPacket2.writeInt(KeyboardHandler.staticJs5IndexImpl5.crc);
                staticPacket2.writeInt(StaticClass6.staticJs5IndexImpl6.crc);
                staticPacket2.writeInt(WorldMapArea.staticJs5IndexImpl2.crc);
                staticPacket2.method459(ints_12, i_16, staticPacket2.off);
                staticPacket2.method435(staticPacket2.off - i_13);
                StaticClass54.staticConnection4.write(staticPacket2.buf, 0, staticPacket2.off);
                staticPacket1.initCipher(ints_12);

                for (i_7 = 0; i_7 < 4; i_7++)
                    ints_12[i_7] += 50;

                staticPacket3.initCipher(ints_12);
                staticInt181 = 6;
            }

            if (staticInt181 == 6 && StaticClass54.staticConnection4.available() > 0) {
                i_2 = StaticClass54.staticConnection4.read();
                if (i_2 == 21 && staticInt165 == 20)
                    staticInt181 = 7;
                else if (i_2 == 2)
                    staticInt181 = 9;
                else if (i_2 == 15 && staticInt165 == 40) {
                    staticInt287 = -1;
                    staticInt181 = 13;
                } else if (i_2 == 23 && staticInt278 < 1) {
                    ++staticInt278;
                    staticInt181 = 0;
                } else {
                    if (i_2 != 29) {
                        staticMethod258(i_2);
                        return;
                    }

                    staticInt181 = 11;
                }
            }

            if (staticInt181 == 7 && StaticClass54.staticConnection4.available() > 0) {
                staticInt216 = (StaticClass54.staticConnection4.read() + 3) * 60;
                staticInt181 = 8;
            }

            if (staticInt181 == 8) {
                staticInt227 = 0;
                StaticClass14.staticMethod74("You have only just left another world.", "Your profile will be transferred in:", staticInt216 / 60 + " seconds.");
                if (--staticInt216 <= 0)
                    staticInt181 = 0;

            } else {
                if (staticInt181 == 9 && StaticClass54.staticConnection4.available() >= 13) {
                    boolean bool_15 = StaticClass54.staticConnection4.read() == 1;
                    StaticClass54.staticConnection4.read(staticPacket3.buf, 0, 4);
                    staticPacket3.off = 0;
                    boolean bool_14 = false;
                    if (bool_15) {
                        i_13 = staticPacket3.readOpcode() << 24;
                        i_13 |= staticPacket3.readOpcode() << 16;
                        i_13 |= staticPacket3.readOpcode() << 8;
                        i_13 |= staticPacket3.readOpcode();
                        String string_19 = StaticClass14.staticString17;
                        int i_23 = string_19.length();
                        int i = 0;

                        for (i_8 = 0; i_8 < i_23; i_8++)
                            i = (i << 5) - i + string_19.charAt(i_8);

                        if (StaticClass61.staticClientPreferences1.linkedHashMap1.size() >= 10 && !StaticClass61.staticClientPreferences1.linkedHashMap1.containsKey(Integer.valueOf(i))) {
                            Iterator iterator_24 = StaticClass61.staticClientPreferences1.linkedHashMap1.entrySet().iterator();
                            iterator_24.next();
                            iterator_24.remove();
                        }

                        StaticClass61.staticClientPreferences1.linkedHashMap1.put(Integer.valueOf(i), Integer.valueOf(i_13));
                    }

                    if (StaticClass14.staticBool6)
                        StaticClass61.staticClientPreferences1.string11 = StaticClass14.staticString17;
                    else
                        StaticClass61.staticClientPreferences1.string11 = null;

                    ClientPreferences.staticMethod63();
                    staticInt246 = StaticClass54.staticConnection4.read();
                    staticBool37 = StaticClass54.staticConnection4.read() == 1;
                    staticInt293 = StaticClass54.staticConnection4.read();
                    staticInt293 <<= 8;
                    staticInt293 += StaticClass54.staticConnection4.read();
                    staticInt229 = StaticClass54.staticConnection4.read();
                    StaticClass54.staticConnection4.read(staticPacket3.buf, 0, 1);
                    staticPacket3.off = 0;
                    staticInt189 = staticPacket3.readOpcode();
                    StaticClass54.staticConnection4.read(staticPacket3.buf, 0, 2);
                    staticPacket3.off = 0;
                    staticInt287 = staticPacket3.readUShort();

                    try {
                        StaticClass4.staticMethod31(NodeSub2.staticClient1, "zap");
                    } catch (Throwable throwable_10) {
                        ;
                    }

                    staticInt181 = 10;
                }

                if (staticInt181 == 10) {
                    if (StaticClass54.staticConnection4.available() >= staticInt287) {
                        staticPacket3.off = 0;
                        StaticClass54.staticConnection4.read(staticPacket3.buf, 0, staticInt287);
                        staticClass10_1.method320();
                        staticMethod256();

                        // gpi init
                        StaticClass10.initGPI(staticPacket3);
                        WM7.staticInt13 = -1;
                        staticMethod295(false);
                        staticInt189 = -1;
                    }

                } else {
                    if (staticInt181 == 11 && StaticClass54.staticConnection4.available() >= 2) {
                        staticPacket3.off = 0;
                        StaticClass54.staticConnection4.read(staticPacket3.buf, 0, 2);
                        staticPacket3.off = 0;
                        WM2.staticInt18 = staticPacket3.readUShort();
                        staticInt181 = 12;
                    }

                    if (staticInt181 == 12 && StaticClass54.staticConnection4.available() >= WM2.staticInt18) {
                        staticPacket3.off = 0;
                        StaticClass54.staticConnection4.read(staticPacket3.buf, 0, WM2.staticInt18);
                        staticPacket3.off = 0;
                        String string_17 = staticPacket3.method448();
                        String string_20 = staticPacket3.method448();
                        String string_18 = staticPacket3.method448();
                        StaticClass14.staticMethod74(string_17, string_20, string_18);
                        staticMethod253(10);
                    }

                    if (staticInt181 == 13) {
                        if (staticInt287 == -1) {
                            if (StaticClass54.staticConnection4.available() < 2)
                                return;

                            StaticClass54.staticConnection4.read(staticPacket3.buf, 0, 2);
                            staticPacket3.off = 0;
                            staticInt287 = staticPacket3.readUShort();
                        }

                        if (StaticClass54.staticConnection4.available() >= staticInt287) {
                            StaticClass54.staticConnection4.read(staticPacket3.buf, 0, staticInt287);
                            staticPacket3.off = 0;
                            i_2 = staticInt287;
                            staticClass10_1.method322();
                            staticMethod257();
                            StaticClass10.initGPI(staticPacket3);
                            if (staticPacket3.off != i_2)
                                throw new RuntimeException();
                        }
                    } else {
                        ++staticInt227;
                        if (staticInt227 > 2000)
                            if (staticInt278 < 1) {
                                if (ExchangeOfferComparator5.staticInt45 == DataClass9.staticInt110)
                                    ExchangeOfferComparator5.staticInt45 = SoundSystem.staticInt75;
                                else
                                    ExchangeOfferComparator5.staticInt45 = DataClass9.staticInt110;

                                ++staticInt278;
                                staticInt181 = 0;
                            } else
                                staticMethod258(-3);
                    }
                }
            }
        } catch (IOException ioexception_11) {
            if (staticInt278 < 1) {
                if (ExchangeOfferComparator5.staticInt45 == DataClass9.staticInt110)
                    ExchangeOfferComparator5.staticInt45 = SoundSystem.staticInt75;
                else
                    ExchangeOfferComparator5.staticInt45 = DataClass9.staticInt110;

                ++staticInt278;
                staticInt181 = 0;
            } else
                staticMethod258(-2);
        }
    }

    static void staticMethod256() {
        staticLong12 = 1L;
        staticInt169 = -1;
        SoundBank.staticMouseCapturer1.offset = 0;
        WM7.staticBool2 = true;
        staticBool26 = true;
        staticLong11 = -1L;
        StaticClass48.staticMethod202();
        staticPacket1.off = 0;
        staticPacket3.off = 0;
        staticInt189 = -1;
        staticInt192 = 1;
        staticInt193 = -1;
        staticInt255 = -1;
        staticInt190 = 0;
        staticInt201 = 0;
        staticInt195 = 0;
        staticInt170 = 0;
        staticInt225 = 0;
        staticBool34 = false;
        MouseHandler.staticMethod12(0);
        StaticClass12.staticMap1.clear();
        StaticClass12.staticParamList1.method249();
        StaticClass12.staticChatLineList1.method289();
        StaticClass12.staticInt54 = 0;
        staticInt194 = 0;
        staticBool36 = false;
        staticInt285 = 0;
        staticInt207 = 0;
        staticInt296 = 0;
        staticInt279 = 1;
        staticInt179 = 0;
        staticInt281 = 0;
        staticClass5_5 = Class5.staticClass5_3;
        staticClass5_6 = Class5.staticClass5_3;
        staticInt186 = 0;
        StaticClass10.playersInsideViewportCount = 0;

        int i_1;
        for (i_1 = 0; i_1 < 2048; i_1++) {
            StaticClass10.staticBufferArray1[i_1] = null;
            StaticClass10.staticByteArray2[i_1] = 1;
        }

        for (i_1 = 0; i_1 < 2048; i_1++)
            players[i_1] = null;

        for (i_1 = 0; i_1 < 32768; i_1++)
            staticNpcArray1[i_1] = null;

        staticInt234 = -1;
        staticDeque5.method252();
        staticDeque6.method252();

        for (i_1 = 0; i_1 < 4; i_1++)
            for (int i_2 = 0; i_2 < 104; i_2++)
                for (int i_3 = 0; i_3 < 104; i_3++)
                    staticDequeArrayArrayArray1[i_1][i_2][i_3] = null;

        staticDeque4 = new Deque();
        staticInt294 = 0;
        staticInt180 = 0;
        staticInt295 = 0;

        for (i_1 = 0; i_1 < StaticClass18.staticInt121; i_1++) {
            Varp varp_4 = Varp.staticMethod424(i_1);
            if (varp_4 != null) {
                StaticClass44.staticIntArray66[i_1] = 0;
                StaticClass44.staticIntArray68[i_1] = 0;
            }
        }

        GZipDecompressor.staticClass4_1.method138();
        staticInt247 = -1;
        if (staticInt241 != -1)
            Widget.staticMethod384(staticInt241);

        for (NodeSub1 nodesub1_5 = (NodeSub1) staticHashTable7.method267(); nodesub1_5 != null; nodesub1_5 = (NodeSub1) staticHashTable7.method268())
            staticMethod350(nodesub1_5, true);

        staticInt241 = -1;
        staticHashTable7 = new HashTable(8);
        staticWidget11 = null;
        staticInt225 = 0;
        staticBool34 = false;
        staticPlayerDef1.method296((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);

        for (i_1 = 0; i_1 < 8; i_1++) {
            staticStringArray7[i_1] = null;
            staticBoolArray6[i_1] = false;
        }

        ItemContainer.staticHashTable5 = new HashTable(32);
        staticBool41 = true;

        for (i_1 = 0; i_1 < 100; i_1++)
            staticBoolArray7[i_1] = true;

        staticPacket1.writeOpcode(151);
        staticPacket1.writeByte(staticMethod276());
        staticPacket1.writeShort(StaticClass5.staticInt35);
        staticPacket1.writeShort(Class2.staticInt16);
        staticString314 = null;
        StaticClass62.staticInt158 = 0;
        Class1.staticClanMemberArray1 = null;

        for (i_1 = 0; i_1 < 8; i_1++)
            staticExchangeOfferArray1[i_1] = new ExchangeOffer();

        ExchangeOfferComparator2.staticClass13_1 = null;
    }

    static void staticMethod257() {
        staticPacket1.off = 0;
        staticPacket3.off = 0;
        staticInt189 = -1;
        staticInt192 = 1;
        staticInt193 = -1;
        staticInt255 = -1;
        staticInt287 = 0;
        staticInt190 = 0;
        staticInt201 = 0;
        staticInt225 = 0;
        staticBool34 = false;
        staticInt296 = 0;
        staticInt179 = 0;

        int i_1;
        for (i_1 = 0; i_1 < 2048; i_1++)
            players[i_1] = null;

        BufferWrapper.staticPlayer1 = null;

        for (i_1 = 0; i_1 < staticNpcArray1.length; i_1++) {
            Npc npc_2 = staticNpcArray1[i_1];
            if (npc_2 != null) {
                npc_2.int620 = -1;
                npc_2.bool72 = false;
            }
        }

        ItemContainer.staticHashTable5 = new HashTable(32);
        staticMethod253(30);

        for (i_1 = 0; i_1 < 100; i_1++)
            staticBoolArray7[i_1] = true;

        staticPacket1.writeOpcode(151);
        staticPacket1.writeByte(staticMethod276());
        staticPacket1.writeShort(StaticClass5.staticInt35);
        staticPacket1.writeShort(Class2.staticInt16);
    }

    static void staticMethod258(int i_0) {
        if (i_0 == -3)
            StaticClass14.staticMethod74("Connection timed out.", "Please try using a different world.", "");
        else if (i_0 == -2)
            StaticClass14.staticMethod74("", "Error connecting to server.", "");
        else if (i_0 == -1)
            StaticClass14.staticMethod74("No response from server.", "Please try using a different world.", "");
        else if (i_0 == 3)
            StaticClass14.staticInt66 = 3;
        else if (i_0 == 4)
            StaticClass14.staticMethod74("Your account has been disabled.", "Please check your message-centre for details.", "");
        else if (i_0 == 5)
            StaticClass14.staticMethod74("Your account has not logged out from its last", "session or the server is too busy right now.", "Please try again in a few minutes.");
        else if (i_0 == 6)
            StaticClass14.staticMethod74("RuneScape has been updated!", "Please reload this page.", "");
        else if (i_0 == 7)
            StaticClass14.staticMethod74("This world is full.", "Please use a different world.", "");
        else if (i_0 == 8)
            StaticClass14.staticMethod74("Unable to connect.", "Login server offline.", "");
        else if (i_0 == 9)
            StaticClass14.staticMethod74("Login limit exceeded.", "Too many connections from your address.", "");
        else if (i_0 == 10)
            StaticClass14.staticMethod74("Unable to connect.", "Bad session id.", "");
        else if (i_0 == 11)
            StaticClass14.staticMethod74("We suspect someone knows your password.", "Press \'change your password\' on front page.", "");
        else if (i_0 == 12)
            StaticClass14.staticMethod74("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
        else if (i_0 == 13)
            StaticClass14.staticMethod74("Could not complete login.", "Please try using a different world.", "");
        else if (i_0 == 14)
            StaticClass14.staticMethod74("The server is being updated.", "Please wait 1 minute and try again.", "");
        else if (i_0 == 16)
            StaticClass14.staticMethod74("Too many login attempts.", "Please wait a few minutes before trying again.", "");
        else if (i_0 == 17)
            StaticClass14.staticMethod74("You are standing in a members-only area.", "To play on this world move to a free area first", "");
        else if (i_0 == 18)
            StaticClass14.staticMethod74("Account locked as we suspect it has been stolen.", "Press \'recover a locked account\' on front page.", "");
        else if (i_0 == 19)
            StaticClass14.staticMethod74("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
        else if (i_0 == 20)
            StaticClass14.staticMethod74("Invalid loginserver requested.", "Please try using a different world.", "");
        else if (i_0 == 22)
            StaticClass14.staticMethod74("Malformed login packet.", "Please try again.", "");
        else if (i_0 == 23)
            StaticClass14.staticMethod74("No reply from loginserver.", "Please wait 1 minute and try again.", "");
        else if (i_0 == 24)
            StaticClass14.staticMethod74("Error loading your profile.", "Please contact customer support.", "");
        else if (i_0 == 25)
            StaticClass14.staticMethod74("Unexpected loginserver response.", "Please try using a different world.", "");
        else if (i_0 == 26)
            StaticClass14.staticMethod74("This computers address has been blocked", "as it was used to break our rules.", "");
        else if (i_0 == 27)
            StaticClass14.staticMethod74("", "Service unavailable.", "");
        else if (i_0 == 31)
            StaticClass14.staticMethod74("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
        else if (i_0 == 32)
            StaticClass14.staticMethod74("Your attempt to log into your account was", "unsuccessful.  Don\'t worry, you can sort", "this out by visiting the billing system.");
        else if (i_0 == 37)
            StaticClass14.staticMethod74("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
        else if (i_0 == 38)
            StaticClass14.staticMethod74("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
        else if (i_0 == 55)
            StaticClass14.staticMethod74("Sorry, but your account is not eligible to", "play this version of the game.  Please try", "playing the main game instead!");
        else {
            if (i_0 == 56) {
                StaticClass14.staticMethod74("Enter the 6-digit code generated by your", "authenticator app.", "");
                staticMethod253(11);
                return;
            }

            if (i_0 == 57) {
                StaticClass14.staticMethod74("The code you entered was incorrect.", "Please try again.", "");
                staticMethod253(11);
                return;
            }

            StaticClass14.staticMethod74("Unexpected server response", "Please try using a different world.", "");
        }

        staticMethod253(10);
    }

    static final void staticMethod259() {
        if (StaticClass54.staticConnection4 != null) {
            StaticClass54.staticConnection4.shutdown();
            StaticClass54.staticConnection4 = null;
        }

        staticMethod260();
        LegacyClickboxDebug.staticScene1.method183();

        for (int i_1 = 0; i_1 < 4; i_1++)
            staticCollisionMapArray1[i_1].init();

        System.gc();
        StaticClass32.staticMethod168(2);
        staticInt248 = -1;
        staticBool43 = false;

        for (NodeSub3 nodesub3_2 = (NodeSub3) NodeSub3.staticDeque10.method257(); nodesub3_2 != null; nodesub3_2 = (NodeSub3) NodeSub3.staticDeque10.method259()) {
            if (nodesub3_2.sampledSound1 != null) {
                HealthBar.staticSequenceSub1_1.synchronizedMethod9(nodesub3_2.sampledSound1);
                nodesub3_2.sampledSound1 = null;
            }

            if (nodesub3_2.sampledSound2 != null) {
                HealthBar.staticSequenceSub1_1.synchronizedMethod9(nodesub3_2.sampledSound2);
                nodesub3_2.sampledSound2 = null;
            }
        }

        NodeSub3.staticDeque10.method252();
        staticMethod253(10);
    }

    static final void staticMethod260() {
        Overlay.staticMethod433();
        Underlay.staticCache30.method264();
        Identikit.staticCache15.method264();
        LocType.staticCache8.method264();
        LocType.staticCache11.method264();
        LocType.staticCache9.method264();
        LocType.staticCache10.method264();
        NpcType.staticCache13.method264();
        NpcType.staticCache12.method264();
        ObjType.staticCache24.method264();
        ObjType.staticCache25.method264();
        ObjType.staticCache26.method264();
        SeqType.staticCache36.method264();
        SeqType.staticCache35.method264();
        SpotAnim.staticCache17.method264();
        SpotAnim.staticCache18.method264();
        Varbit.staticCache19.method264();
        Varp.staticMethod425();
        Config32.staticMethod420();
        HealthBarType.staticCache33.method264();
        HealthBarType.staticCache34.method264();
        CacheableSub2.staticMethod430();
        ParamType.staticMethod436();
        MapElementType.staticMethod415();
        PlayerDef.staticCache1.method264();
        Widget.staticMethod385();
        ((TextureLoader) Rasterizer3D.staticInterface2_1).method154();
        RuneScriptDef.staticCache6.method264();
        StaticClass7.staticJs5IndexImpl7.clear();
        Class4.staticJs5IndexImpl8.clear();
        ClanMember.staticJs5IndexImpl13.clear();
        WMEnum6.staticJs5IndexImpl12.clear();
        StaticClass43.staticJs5IndexImpl10.clear();
        StaticClass54.staticJs5IndexImpl11.clear();
        RenderableSub2.staticJs5IndexImpl17.clear();
        StaticClass2.staticJs5IndexImpl4.clear();
        LegacyClickboxDebug.staticJs5IndexImpl16.clear();
        staticJs5IndexImpl14.clear();
        Renderable.staticJs5IndexImpl15.clear();
        JavaxSoundSystemProvider.staticJs5IndexImpl3.clear();
    }

    static final void staticMethod261() {
        if (staticInt195 > 0)
            staticMethod259();
        else {
            staticClass10_1.method318();
            staticMethod253(40);
            StaticClass6.staticConnection2 = StaticClass54.staticConnection4;
            StaticClass54.staticConnection4 = null;
        }
    }

    static final void staticMethod262(boolean bool_0) {
        if (bool_0)
            staticAuthenticatorState5 = StaticClass14.staticBool9 ? AuthenticatorState.staticAuthenticatorState1 : AuthenticatorState.staticAuthenticatorState4;
        else {
            LinkedHashMap linkedhashmap_2 = StaticClass61.staticClientPreferences1.linkedHashMap1;
            String string_4 = StaticClass14.staticString17;
            int i_5 = string_4.length();
            int i_6 = 0;

            for (int i_7 = 0; i_7 < i_5; i_7++)
                i_6 = (i_6 << 5) - i_6 + string_4.charAt(i_7);

            staticAuthenticatorState5 = linkedhashmap_2.containsKey(Integer.valueOf(i_6)) ? AuthenticatorState.staticAuthenticatorState3 : AuthenticatorState.staticAuthenticatorState2;
        }

    }

    final void method401() {
        if (staticInt201 > 1)
            --staticInt201;

        if (staticInt195 > 0)
            --staticInt195;

        if (staticBool42) {
            staticBool42 = false;
            staticMethod261();
        } else {
            if (!staticBool34) {
                staticInt225 = 0;
                staticBool34 = false;
                staticStringArray8[0] = "Cancel";
                staticStringArray9[0] = "";
                staticIntArray97[0] = 1006;
                staticBoolArray4[0] = false;
                staticInt225 = 1;
            }

            int i_2;
            for (i_2 = 0; i_2 < 100 && method403(); i_2++)
                ;

            if (staticInt165 == 30) {
                while (StaticClass48.staticMethod203()) {
                    staticPacket1.writeOpcode(255);
                    staticPacket1.writeByte(0);
                    i_2 = staticPacket1.off;
                    StaticClass48.staticMethod204(staticPacket1);
                    staticPacket1.method436(staticPacket1.off - i_2);
                }

                if (staticClass10_1.bool19) {
                    staticPacket1.writeOpcode(70);
                    staticPacket1.writeByte(0);
                    i_2 = staticPacket1.off;
                    staticClass10_1.method323(staticPacket1);
                    staticPacket1.method436(staticPacket1.off - i_2);
                    staticClass10_1.method321();
                }

                Object object_18 = SoundBank.staticMouseCapturer1.lock;
                int i_3;
                int i_4;
                int i_5;
                int i_6;
                int i_7;
                int i_8;
                int i_9;
                int i_10;
                synchronized (SoundBank.staticMouseCapturer1.lock) {
                    if (!staticBool47)
                        SoundBank.staticMouseCapturer1.offset = 0;
                    else if (MouseHandler.staticInt27 != 0 || SoundBank.staticMouseCapturer1.offset >= 40) {
                        staticPacket1.writeOpcode(212);
                        staticPacket1.writeByte(0);
                        i_3 = staticPacket1.off;
                        i_4 = 0;

                        for (i_5 = 0; i_5 < SoundBank.staticMouseCapturer1.offset && staticPacket1.off - i_3 < 240; i_5++) {
                            ++i_4;
                            i_6 = SoundBank.staticMouseCapturer1.ycoords[i_5];
                            if (i_6 < 0)
                                i_6 = 0;
                            else if (i_6 > 502)
                                i_6 = 502;

                            i_7 = SoundBank.staticMouseCapturer1.xcoords[i_5];
                            if (i_7 < 0)
                                i_7 = 0;
                            else if (i_7 > 764)
                                i_7 = 764;

                            i_8 = i_7 + i_6 * 765;
                            if (SoundBank.staticMouseCapturer1.ycoords[i_5] == -1 && SoundBank.staticMouseCapturer1.xcoords[i_5] == -1) {
                                i_7 = -1;
                                i_6 = -1;
                                i_8 = 524287;
                            }

                            if (staticInt213 == i_7 && staticInt168 == i_6) {
                                if (staticInt169 < 2047)
                                    ++staticInt169;
                            } else {
                                i_9 = i_7 - staticInt213;
                                staticInt213 = i_7;
                                i_10 = i_6 - staticInt168;
                                staticInt168 = i_6;
                                if (staticInt169 < 8 && i_9 >= -32 && i_9 <= 31 && i_10 >= -32 && i_10 <= 31) {
                                    i_9 += 32;
                                    i_10 += 32;
                                    staticPacket1.writeShort((i_9 << 6) + (staticInt169 << 12) + i_10);
                                    staticInt169 = 0;
                                } else if (staticInt169 < 8) {
                                    staticPacket1.writeTriByte(8388608 + (staticInt169 << 19) + i_8);
                                    staticInt169 = 0;
                                } else {
                                    staticPacket1.writeInt(-1073741824 + (staticInt169 << 19) + i_8);
                                    staticInt169 = 0;
                                }
                            }
                        }

                        staticPacket1.method436(staticPacket1.off - i_3);
                        if (i_4 >= SoundBank.staticMouseCapturer1.offset)
                            SoundBank.staticMouseCapturer1.offset = 0;
                        else {
                            SoundBank.staticMouseCapturer1.offset -= i_4;

                            for (i_5 = 0; i_5 < SoundBank.staticMouseCapturer1.offset; i_5++) {
                                SoundBank.staticMouseCapturer1.xcoords[i_5] = SoundBank.staticMouseCapturer1.xcoords[i_4 + i_5];
                                SoundBank.staticMouseCapturer1.ycoords[i_5] = SoundBank.staticMouseCapturer1.ycoords[i_4 + i_5];
                            }
                        }
                    }
                }

                if (MouseHandler.staticInt27 == 1 || !SoundBank.staticBool11 && MouseHandler.staticInt27 == 4 || MouseHandler.staticInt27 == 2) {
                    long long_20 = (MouseHandler.staticLong2 - -staticLong12) / 50L;
                    if (long_20 > 4095L)
                        long_20 = 4095L;

                    staticLong12 = -MouseHandler.staticLong2;
                    i_4 = MouseHandler.staticInt31;
                    if (i_4 < 0)
                        i_4 = 0;
                    else if (i_4 > Class2.staticInt16)
                        i_4 = Class2.staticInt16;

                    i_5 = MouseHandler.staticInt30;
                    if (i_5 < 0)
                        i_5 = 0;
                    else if (i_5 > StaticClass5.staticInt35)
                        i_5 = StaticClass5.staticInt35;

                    i_6 = (int) long_20;
                    staticPacket1.writeOpcode(24);
                    staticPacket1.writeShort((i_6 << 1) + (MouseHandler.staticInt27 == 2 ? 1 : 0));
                    staticPacket1.writeShort(i_5);
                    staticPacket1.writeShort(i_4);
                }

                if (KeyboardHandler.staticInt21 > 0) {
                    staticPacket1.writeOpcode(55);
                    staticPacket1.writeShort(0);
                    i_2 = staticPacket1.off;
                    long long_19 = StaticClass27.synchronizedMethod7();

                    for (i_5 = 0; i_5 < KeyboardHandler.staticInt21; i_5++) {
                        long long_27 = long_19 - staticLong11;
                        if (long_27 > 16777215L)
                            long_27 = 16777215L;

                        staticLong11 = long_19;
                        staticPacket1.method480((int) long_27);
                        staticPacket1.method466(KeyboardHandler.staticIntArray5[i_5]);
                    }

                    staticPacket1.method435(staticPacket1.off - i_2);
                }

                if (staticInt191 > 0)
                    --staticInt191;

                if (KeyboardHandler.staticBoolArray1[96] || KeyboardHandler.staticBoolArray1[97] || KeyboardHandler.staticBoolArray1[98] || KeyboardHandler.staticBoolArray1[99])
                    staticBool32 = true;

                if (staticBool32 && staticInt191 <= 0) {
                    staticInt191 = 20;
                    staticBool32 = false;
                    staticPacket1.writeOpcode(56);
                    staticPacket1.method475(staticInt207); // 2
                    staticPacket1.method473(staticInt161); // 2
                }

                if (WM7.staticBool2 && !staticBool26) {
                    staticBool26 = true;
                    staticPacket1.writeOpcode(41);
                    staticPacket1.writeByte(1);
                }

                if (!WM7.staticBool2 && staticBool26) {
                    staticBool26 = false;
                    staticPacket1.writeOpcode(41);
                    staticPacket1.writeByte(0);
                }

                int[] ints_21;
                if (-staticInt279 != DataClass14.staticInt156) {
                    staticInt279 = -DataClass14.staticInt156;
                    i_2 = DataClass14.staticInt156;
                    ints_21 = WMEnum6.staticSprite4.pixels;
                    i_4 = ints_21.length;

                    for (i_5 = 0; i_5 < i_4; i_5++)
                        ints_21[i_5] = 0;

                    for (i_5 = 1; i_5 < 103; i_5++) {
                        i_6 = 24628 + (103 - i_5) * 2048;

                        for (i_7 = 1; i_7 < 103; i_7++) {
                            if ((StaticClass3.staticByteArrayArrayArray1[i_2][i_7][i_5] & 0x18) == 0)
                                LegacyClickboxDebug.staticScene1.method213(ints_21, i_6, 512, i_2, i_7, i_5);

                            if (i_2 < 3 && (StaticClass3.staticByteArrayArrayArray1[i_2 + 1][i_7][i_5] & 0x8) != 0)
                                LegacyClickboxDebug.staticScene1.method213(ints_21, i_6, 512, i_2 + 1, i_7, i_5);

                            i_6 += 4;
                        }
                    }

                    i_5 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + 238 + (int) (Math.random() * 20.0D) - 10;
                    i_6 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
                    WMEnum6.staticSprite4.setRasterizerTarget();

                    for (i_7 = 1; i_7 < 103; i_7++)
                        for (i_8 = 1; i_8 < 103; i_8++) {
                            if ((StaticClass3.staticByteArrayArrayArray1[i_2][i_8][i_7] & 0x18) == 0)
                                staticMethod298(i_2, i_8, i_7, i_5, i_6);

                            if (i_2 < 3 && (StaticClass3.staticByteArrayArrayArray1[i_2 + 1][i_8][i_7] & 0x8) != 0)
                                staticMethod298(i_2 + 1, i_8, i_7, i_5, i_6);
                        }

                    staticInt280 = 0;

                    for (i_7 = 0; i_7 < 104; i_7++)
                        for (i_8 = 0; i_8 < 104; i_8++) {
                            i_9 = LegacyClickboxDebug.staticScene1.method208(DataClass14.staticInt156, i_7, i_8);
                            if (i_9 != 0) {
                                i_9 = i_9 >> 14 & 0x7fff;
                                i_10 = LocType.staticMethod411(i_9).int524;
                                if (i_10 >= 0) {
                                    staticSpriteArray8[staticInt280] = DataClass13.staticMapElementTypeArray1[i_10].getPOISprite(false);
                                    staticIntArray109[staticInt280] = i_7;
                                    staticIntArray110[staticInt280] = i_8;
                                    ++staticInt280;
                                }
                            }
                        }

                    ExchangeOfferComparator6.staticGraphicsBuffer1.setRasterizerTarget();
                }

                if (staticInt165 == 30) {
                    staticMethod302();
                    staticMethod264();
                    ++staticInt190;
                    if (staticInt190 > 750)
                        staticMethod261();
                    else {
                        i_2 = StaticClass10.playersInsideViewportCount;
                        ints_21 = StaticClass10.playerIndexesInsideViewport;

                        for (i_4 = 0; i_4 < i_2; i_4++) {
                            Player player_28 = players[ints_21[i_4]];
                            if (player_28 != null)
                                staticMethod271(player_28, 1);
                        }

                        for (i_2 = 0; i_2 < staticInt186; i_2++) {
                            i_3 = staticIntArray91[i_2];
                            Npc npc_24 = staticNpcArray1[i_3];
                            if (npc_24 != null)
                                staticMethod271(npc_24, npc_24.npcType1.name);
                        }

                        staticMethod268();
                        ++staticInt272;
                        if (staticInt220 != 0) {
                            staticInt288 += 20;
                            if (staticInt288 >= 400)
                                staticInt220 = 0;
                        }

                        if (DataClass9.staticWidget5 != null) {
                            ++staticInt221;
                            if (staticInt221 >= 15) {
                                staticMethod342(DataClass9.staticWidget5);
                                DataClass9.staticWidget5 = null;
                            }
                        }

                        Widget widget_23 = WMEnum5.staticWidget1;
                        Widget widget_22 = Class2.staticWidget2;
                        WMEnum5.staticWidget1 = null;
                        Class2.staticWidget2 = null;
                        staticWidget8 = null;
                        staticBool39 = false;
                        staticBool38 = false;
                        staticInt276 = 0;

                        while (KeyboardHandler.staticMethod7() && staticInt276 < 128)
                            if (staticInt246 >= 2 && KeyboardHandler.staticBoolArray1[82] && StaticClass10.staticInt52 == 66) {
                                String string_25 = StaticClass12.staticMethod62();
                                NodeSub2.staticClient1.method106(string_25);
                            } else {
                                staticIntArray108[staticInt276] = StaticClass10.staticInt52;
                                staticIntArray119[staticInt276] = ChatLog.staticChar1;
                                ++staticInt276;
                            }

                        boolean bool_26 = staticInt246 >= 2;
                        if (bool_26 && KeyboardHandler.staticBoolArray1[82] && KeyboardHandler.staticBoolArray1[81] && staticInt265 != 0) {
                            i_5 = BufferWrapper.staticPlayer1.int683 * 649046179 - staticInt265;
                            if (i_5 < 0)
                                i_5 = 0;
                            else if (i_5 > 3)
                                i_5 = 3;

                            if (BufferWrapper.staticPlayer1.int683 * 649046179 != i_5) {
                                i_6 = DataClass10.staticInt111 + BufferWrapper.staticPlayer1.intArray103[0];
                                i_7 = Class4.staticInt53 + BufferWrapper.staticPlayer1.intArray104[0];
                                staticPacket1.writeOpcode(201);
                                staticPacket1.method473(i_7); //2
                                staticPacket1.method474(i_6); // 2
                                staticPacket1.method466(i_5); //1
                            }

                            staticInt265 = 0;
                        }

                        if (staticInt241 != -1) {
                            i_5 = staticInt241;
                            i_6 = StaticClass5.staticInt35;
                            i_7 = Class2.staticInt16;
                            if (Widget.staticMethod383(i_5))
                                staticMethod338(StaticClass25.staticWidgetArrayArray1[i_5], -1, 0, 0, i_6, i_7, 0, 0);
                        }

                        ++staticInt256;

                        while (true) {
                            Widget widget_29;
                            Widget widget_30;
                            RuneScript runescript_31;
                            do {
                                runescript_31 = (RuneScript) staticDeque9.method255();
                                if (runescript_31 == null)
                                    while (true) {
                                        do {
                                            runescript_31 = (RuneScript) staticDeque7.method255();
                                            if (runescript_31 == null)
                                                while (true) {
                                                    do {
                                                        runescript_31 = (RuneScript) staticDeque8.method255();
                                                        if (runescript_31 == null) {
                                                            method404();
                                                            if (GameObject.staticClass11_1 != null) {
                                                                GameObject.staticClass11_1.method333(DataClass14.staticInt156, DataClass10.staticInt111 + (BufferWrapper.staticPlayer1.int626 >> 7), (BufferWrapper.staticPlayer1.int609 >> 7) + Class4.staticInt53, false);
                                                                GameObject.staticClass11_1.method347();
                                                            }

                                                            if (staticWidget10 != null)
                                                                method409();

                                                            if (ClanMember.staticWidget7 != null) {
                                                                staticMethod342(ClanMember.staticWidget7);
                                                                ++staticInt274;
                                                                if (MouseHandler.staticInt26 == 0) {
                                                                    if (staticBool40) {
                                                                        if (Stopwatch.staticWidget6 == ClanMember.staticWidget7 && staticInt266 != staticInt223) {
                                                                            Widget widget_33 = ClanMember.staticWidget7;
                                                                            byte b_32 = 0;
                                                                            if (staticInt243 == 1 && widget_33.int396 == 206)
                                                                                b_32 = 1;

                                                                            if (widget_33.intArray57[staticInt266] <= 0)
                                                                                b_32 = 0;

                                                                            if (StaticClass39.staticMethod180(staticMethod360(widget_33))) {
                                                                                i_7 = staticInt223;
                                                                                i_8 = staticInt266;
                                                                                widget_33.intArray57[i_8] = widget_33.intArray57[i_7];
                                                                                widget_33.intArray59[i_8] = widget_33.intArray59[i_7];
                                                                                widget_33.intArray57[i_7] = -1;
                                                                                widget_33.intArray59[i_7] = 0;
                                                                            } else if (b_32 == 1) {
                                                                                i_7 = staticInt223;
                                                                                i_8 = staticInt266;

                                                                                while (i_7 != i_8)
                                                                                    if (i_7 > i_8) {
                                                                                        widget_33.method499(i_7 - 1, i_7);
                                                                                        --i_7;
                                                                                    } else if (i_7 < i_8) {
                                                                                        widget_33.method499(i_7 + 1, i_7);
                                                                                        ++i_7;
                                                                                    }
                                                                            } else
                                                                                widget_33.method499(staticInt266, staticInt223);

                                                                            staticPacket1.writeOpcode(185);
                                                                            staticPacket1.method474(staticInt266); //2
                                                                            staticPacket1.method483(ClanMember.staticWidget7.int444); // 4
                                                                            staticPacket1.method475(staticInt223); // 2
                                                                            staticPacket1.method464(b_32); // 1
                                                                        }
                                                                    } else if (method405())
                                                                        method406(staticInt224, staticInt277);
                                                                    else if (staticInt225 > 0)
                                                                        staticMethod341(staticInt224, staticInt277);

                                                                    staticInt221 = 10;
                                                                    MouseHandler.staticInt27 = 0;
                                                                    ClanMember.staticWidget7 = null;
                                                                } else if (staticInt274 >= 5 && (MouseHandler.staticInt28 > 5 + staticInt224 || MouseHandler.staticInt28 < staticInt224 - 5 || MouseHandler.staticInt29 > 5 + staticInt277 || MouseHandler.staticInt29 < staticInt277 - 5))
                                                                    staticBool40 = true;
                                                            }

                                                            if (Scene.staticMethod118()) {
                                                                i_5 = Scene.staticInt103;
                                                                i_6 = Scene.staticInt99;
                                                                staticPacket1.writeOpcode(99);
                                                                staticPacket1.writeByte(5);
                                                                staticPacket1.method464(KeyboardHandler.staticBoolArray1[82] ? KeyboardHandler.staticBoolArray1[81] ? 2 : 1 : 0);
                                                                staticPacket1.method475(DataClass10.staticInt111 + i_5);
                                                                staticPacket1.writeShort(i_6 + Class4.staticInt53);
                                                                Scene.staticMethod119();
                                                                staticInt218 = MouseHandler.staticInt30;
                                                                staticInt219 = MouseHandler.staticInt31;
                                                                staticInt220 = 1;
                                                                staticInt288 = 0;
                                                                staticInt179 = i_5;
                                                                staticInt281 = i_6;
                                                            }

                                                            if (widget_23 != WMEnum5.staticWidget1) {
                                                                if (widget_23 != null)
                                                                    staticMethod342(widget_23);

                                                                if (WMEnum5.staticWidget1 != null)
                                                                    staticMethod342(WMEnum5.staticWidget1);
                                                            }

                                                            if (Class2.staticWidget2 != widget_22 && staticInt236 == 50) {
                                                                if (widget_22 != null)
                                                                    staticMethod342(widget_22);

                                                                if (Class2.staticWidget2 != null)
                                                                    staticMethod342(Class2.staticWidget2);
                                                            }

                                                            if (Class2.staticWidget2 != null) {
                                                                if (staticInt236 < 50) {
                                                                    ++staticInt236;
                                                                    if (staticInt236 == 50)
                                                                        staticMethod342(Class2.staticWidget2);
                                                                }
                                                            } else if (staticInt236 > 0)
                                                                --staticInt236;

                                                            staticMethod270();
                                                            if (staticBool45) {
                                                                i_5 = SoundBank.staticInt74 * 128 + 64;
                                                                i_6 = ItemContainer.staticInt160 * 128 + 64;
                                                                i_7 = staticMethod293(i_5, i_6, DataClass14.staticInt156) - ExchangeOfferComparator1.staticInt120;
                                                                if (StaticClass44.staticInt135 < i_5) {
                                                                    StaticClass44.staticInt135 += FriendLogin.staticInt159 * (i_5 - StaticClass44.staticInt135) / 1000 + WMEnum4.staticInt136;
                                                                    if (StaticClass44.staticInt135 > i_5)
                                                                        StaticClass44.staticInt135 = i_5;
                                                                }

                                                                if (StaticClass44.staticInt135 > i_5) {
                                                                    StaticClass44.staticInt135 -= (StaticClass44.staticInt135 - i_5) * FriendLogin.staticInt159 / 1000 + WMEnum4.staticInt136;
                                                                    if (StaticClass44.staticInt135 < i_5)
                                                                        StaticClass44.staticInt135 = i_5;
                                                                }

                                                                if (DataClass3.staticInt41 < i_7) {
                                                                    DataClass3.staticInt41 += WMEnum4.staticInt136 + (i_7 - DataClass3.staticInt41) * FriendLogin.staticInt159 / 1000;
                                                                    if (DataClass3.staticInt41 > i_7)
                                                                        DataClass3.staticInt41 = i_7;
                                                                }

                                                                if (DataClass3.staticInt41 > i_7) {
                                                                    DataClass3.staticInt41 -= (DataClass3.staticInt41 - i_7) * FriendLogin.staticInt159 / 1000 + WMEnum4.staticInt136;
                                                                    if (DataClass3.staticInt41 < i_7)
                                                                        DataClass3.staticInt41 = i_7;
                                                                }

                                                                if (ChatLog.staticInt69 < i_6) {
                                                                    ChatLog.staticInt69 += WMEnum4.staticInt136 + FriendLogin.staticInt159 * (i_6 - ChatLog.staticInt69) / 1000;
                                                                    if (ChatLog.staticInt69 > i_6)
                                                                        ChatLog.staticInt69 = i_6;
                                                                }

                                                                if (ChatLog.staticInt69 > i_6) {
                                                                    ChatLog.staticInt69 -= (ChatLog.staticInt69 - i_6) * FriendLogin.staticInt159 / 1000 + WMEnum4.staticInt136;
                                                                    if (ChatLog.staticInt69 < i_6)
                                                                        ChatLog.staticInt69 = i_6;
                                                                }

                                                                i_5 = JavaxSoundSystemProvider.staticInt10 * 128 + 64;
                                                                i_6 = 64 + DataClass1.staticInt11 * 128;
                                                                i_7 = staticMethod293(i_5, i_6, DataClass14.staticInt156) - StaticClass21.staticInt127;
                                                                i_8 = i_5 - StaticClass44.staticInt135;
                                                                i_9 = i_7 - DataClass3.staticInt41;
                                                                i_10 = i_6 - ChatLog.staticInt69;
                                                                int i_11 = (int) Math.sqrt(i_10 * i_10 + i_8 * i_8);
                                                                int i_12 = (int) (Math.atan2(i_9, i_11) * 325.949D) & 0x7ff;
                                                                int i_13 = (int) (Math.atan2(i_8, i_10) * -325.949D) & 0x7ff;
                                                                if (i_12 < 128)
                                                                    i_12 = 128;

                                                                if (i_12 > 383)
                                                                    i_12 = 383;

                                                                if (DebugOverlay.staticInt304 < i_12) {
                                                                    DebugOverlay.staticInt304 += WorldMapRegionStorage.staticInt8 * (i_12 - DebugOverlay.staticInt304) / 1000 + StaticClass18.staticInt122;
                                                                    if (DebugOverlay.staticInt304 > i_12)
                                                                        DebugOverlay.staticInt304 = i_12;
                                                                }

                                                                if (DebugOverlay.staticInt304 > i_12) {
                                                                    DebugOverlay.staticInt304 -= StaticClass18.staticInt122 + WorldMapRegionStorage.staticInt8 * (DebugOverlay.staticInt304 - i_12) / 1000;
                                                                    if (DebugOverlay.staticInt304 < i_12)
                                                                        DebugOverlay.staticInt304 = i_12;
                                                                }

                                                                int i_14 = i_13 - StaticClass20.staticInt126;
                                                                if (i_14 > 1024)
                                                                    i_14 -= 2048;

                                                                if (i_14 < -1024)
                                                                    i_14 += 2048;

                                                                if (i_14 > 0) {
                                                                    StaticClass20.staticInt126 += StaticClass18.staticInt122 + WorldMapRegionStorage.staticInt8 * i_14 / 1000;
                                                                    StaticClass20.staticInt126 &= 0x7ff;
                                                                }

                                                                if (i_14 < 0) {
                                                                    StaticClass20.staticInt126 -= WorldMapRegionStorage.staticInt8 * -i_14 / 1000 + StaticClass18.staticInt122;
                                                                    StaticClass20.staticInt126 &= 0x7ff;
                                                                }

                                                                int i_15 = i_13 - StaticClass20.staticInt126;
                                                                if (i_15 > 1024)
                                                                    i_15 -= 2048;

                                                                if (i_15 < -1024)
                                                                    i_15 += 2048;

                                                                if (i_15 < 0 && i_14 > 0 || i_15 > 0 && i_14 < 0)
                                                                    StaticClass20.staticInt126 = i_13;
                                                            }

                                                            for (i_5 = 0; i_5 < 5; i_5++)
                                                                ++staticIntArray118[i_5];

                                                            GZipDecompressor.staticClass4_1.method141();
                                                            i_5 = MouseHandler.staticMethod11();
                                                            i_6 = KeyboardHandler.staticMethod8();
                                                            if (i_5 > 15000 && i_6 > 15000) {
                                                                staticInt195 = 250;
                                                                MouseHandler.staticMethod12(14500);
                                                                staticPacket1.writeOpcode(149);
                                                            }

                                                            for (FriendLogin friendlogin_34 = (FriendLogin) staticNode2List1.method262(); friendlogin_34 != null; friendlogin_34 = (FriendLogin) staticNode2List1.method263())
                                                                if (friendlogin_34.int322 < StaticClass27.synchronizedMethod7() / 1000L - 5L) {
                                                                    if (friendlogin_34.short1 > 0)
                                                                        StaticClass12.staticMethod59(5, "", friendlogin_34.string22 + " has logged in.");

                                                                    if (friendlogin_34.short1 == 0)
                                                                        StaticClass12.staticMethod59(5, "", friendlogin_34.string22 + " has logged out.");

                                                                    friendlogin_34.method292();
                                                                }

                                                            ++staticInt268;
                                                            if (staticInt268 > 50)
                                                                staticPacket1.writeOpcode(40);

                                                            try {
                                                                if (StaticClass54.staticConnection4 != null && staticPacket1.off > 0) {
                                                                    StaticClass54.staticConnection4.write(staticPacket1.buf, 0, staticPacket1.off);
                                                                    staticPacket1.off = 0;
                                                                    staticInt268 = 0;
                                                                }
                                                            } catch (IOException ioexception_16) {
                                                                staticMethod261();
                                                            }

                                                            return;
                                                        }

                                                        widget_29 = runescript_31.widget2;
                                                        if (widget_29.int394 < 0)
                                                            break;

                                                        widget_30 = Widget.staticMethod381(widget_29.parentId);
                                                    } while (widget_30 == null || widget_30.widgetArray1 == null || widget_29.int394 >= widget_30.widgetArray1.length || widget_30.widgetArray1[widget_29.int394] != widget_29);

                                                    StaticClass15.staticMethod79(runescript_31);
                                                }

                                            widget_29 = runescript_31.widget2;
                                            if (widget_29.int394 < 0)
                                                break;

                                            widget_30 = Widget.staticMethod381(widget_29.parentId);
                                        } while (widget_30 == null || widget_30.widgetArray1 == null || widget_29.int394 >= widget_30.widgetArray1.length || widget_30.widgetArray1[widget_29.int394] != widget_29);

                                        StaticClass15.staticMethod79(runescript_31);
                                    }

                                widget_29 = runescript_31.widget2;
                                if (widget_29.int394 < 0)
                                    break;

                                widget_30 = Widget.staticMethod381(widget_29.parentId);
                            } while (widget_30 == null || widget_30.widgetArray1 == null || widget_29.int394 >= widget_30.widgetArray1.length || widget_29 != widget_30.widgetArray1[widget_29.int394]);

                            StaticClass15.staticMethod79(runescript_31);
                        }
                    }
                }
            }
        }
    }

    static final void staticMethod263() {
        if (WorldMapResource.staticSoundSystem1 != null)
            WorldMapResource.staticSoundSystem1.synchronizedMethod4();

        if (WM8.staticSoundSystem2 != null)
            WM8.staticSoundSystem2.synchronizedMethod4();

    }

    static final void staticMethod264() {
        for (int i_1 = 0; i_1 < staticInt285; i_1++) {
            --staticIntArray114[i_1];
            if (staticIntArray114[i_1] >= -10) {
                SoundEffect soundeffect_11 = staticSoundEffectArray1[i_1];
                if (soundeffect_11 == null) {
                    SoundEffect soundeffect_10000 = null;
                    soundeffect_11 = SoundEffect.staticMethod44(WMEnum6.staticJs5IndexImpl12, staticIntArray112[i_1], 0);
                    if (soundeffect_11 == null)
                        continue;

                    staticIntArray114[i_1] += soundeffect_11.method130();
                    staticSoundEffectArray1[i_1] = soundeffect_11;
                }

                if (staticIntArray114[i_1] < 0) {
                    int i_3;
                    if (staticIntArray115[i_1] != 0) {
                        int i_4 = (staticIntArray115[i_1] & 0xff) * 128;
                        int i_5 = staticIntArray115[i_1] >> 16 & 0xff;
                        int i_6 = 64 + i_5 * 128 - BufferWrapper.staticPlayer1.int626;
                        if (i_6 < 0)
                            i_6 = -i_6;

                        int i_7 = staticIntArray115[i_1] >> 8 & 0xff;
                        int i_8 = i_7 * 128 + 64 - BufferWrapper.staticPlayer1.int609;
                        if (i_8 < 0)
                            i_8 = -i_8;

                        int i_9 = i_8 + i_6 - 128;
                        if (i_9 > i_4) {
                            staticIntArray114[i_1] = -100;
                            continue;
                        }

                        if (i_9 < 0)
                            i_9 = 0;

                        i_3 = (i_4 - i_9) * staticInt267 / i_4;
                    } else
                        i_3 = staticInt174;

                    if (i_3 > 0) {
                        MusicNote musicnote_12 = soundeffect_11.method129().method521(Renderable.staticMus9_1);
                        SampledSound sampledsound_13 = SampledSound.staticMethod391(musicnote_12, 100, i_3);
                        sampledsound_13.synchronizedMethod10(staticIntArray113[i_1] - 1);
                        HealthBar.staticSequenceSub1_1.synchronizedMethod8(sampledsound_13);
                    }

                    staticIntArray114[i_1] = -100;
                }
            } else {
                --staticInt285;

                for (int i_2 = i_1; i_2 < staticInt285; i_2++) {
                    staticIntArray112[i_2] = staticIntArray112[i_2 + 1];
                    staticSoundEffectArray1[i_2] = staticSoundEffectArray1[i_2 + 1];
                    staticIntArray113[i_2] = staticIntArray113[i_2 + 1];
                    staticIntArray114[i_2] = staticIntArray114[i_2 + 1];
                    staticIntArray115[i_2] = staticIntArray115[i_2 + 1];
                }

                --i_1;
            }
        }

        if (staticBool43) {
            boolean bool_10;
            if (StaticClass32.staticInt133 != 0)
                bool_10 = true;
            else
                bool_10 = StaticClass32.staticMidiSequence1.synchronizedMethod29();

            if (!bool_10) {
                if (staticInt197 != 0 && staticInt248 != -1)
                    StaticClass32.staticMethod164(StaticClass54.staticJs5IndexImpl11, staticInt248, 0, staticInt197, false);

                staticBool43 = false;
            }
        }

    }

    static void staticMethod265(SeqType seqtype_0, int i_1, int i_2, int i_3) {
        if (staticInt285 < 50 && staticInt267 != 0)
            if (seqtype_0.intArray97 != null && i_1 < seqtype_0.intArray97.length) {
                int i_5 = seqtype_0.intArray97[i_1];
                if (i_5 != 0) {
                    int i_6 = i_5 >> 8;
                    int i_7 = i_5 >> 4 & 0x7;
                    int i_8 = i_5 & 0xf;
                    staticIntArray112[staticInt285] = i_6;
                    staticIntArray113[staticInt285] = i_7;
                    staticIntArray114[staticInt285] = 0;
                    staticSoundEffectArray1[staticInt285] = null;
                    int i_9 = (i_2 - 64) / 128;
                    int i_10 = (i_3 - 64) / 128;
                    staticIntArray115[staticInt285] = i_8 + (i_10 << 8) + (i_9 << 16);
                    ++staticInt285;
                }
            }
    }

    static void staticMethod266(int i_0, int i_1, int i_2) {
        if (staticInt174 != 0 && i_1 != 0 && staticInt285 < 50) {
            staticIntArray112[staticInt285] = i_0;
            staticIntArray113[staticInt285] = i_1;
            staticIntArray114[staticInt285] = i_2;
            staticSoundEffectArray1[staticInt285] = null;
            staticIntArray115[staticInt285] = 0;
            ++staticInt285;
        }

    }

    static final void staticMethod267(Widget widget_0, int i_1, int i_2) {
        if (staticInt296 == 0 || staticInt296 == 3)
            if (MouseHandler.staticInt27 == 1 || !SoundBank.staticBool11 && MouseHandler.staticInt27 == 4) {
                CacheableSub1 cacheablesub1_4 = widget_0.method504(true);
                if (cacheablesub1_4 == null)
                    return;

                int i_5 = MouseHandler.staticInt30 - i_1;
                int i_6 = MouseHandler.staticInt31 - i_2;
                if (cacheablesub1_4.method555(i_5, i_6)) {
                    i_5 -= cacheablesub1_4.int512 / 2;
                    i_6 -= cacheablesub1_4.int511 / 2;
                    int i_7 = staticInt207 & 0x7ff;
                    int i_8 = Rasterizer3D.staticIntArray156[i_7];
                    int i_9 = Rasterizer3D.staticIntArray159[i_7];
                    int i_10 = i_6 * i_8 + i_9 * i_5 >> 11;
                    int i_11 = i_6 * i_9 - i_5 * i_8 >> 11;
                    int i_12 = BufferWrapper.staticPlayer1.int626 + i_10 >> 7;
                    int i_13 = BufferWrapper.staticPlayer1.int609 - i_11 >> 7;
                    staticPacket1.writeOpcode(116);
                    staticPacket1.writeByte(18); // 1
                    staticPacket1.method464(KeyboardHandler.staticBoolArray1[82] ? KeyboardHandler.staticBoolArray1[81] ? 2 : 1 : 0); // 1
                    staticPacket1.method475(i_12 + DataClass10.staticInt111); // 2
                    staticPacket1.writeShort(Class4.staticInt53 + i_13); // 2
                    staticPacket1.writeByte(i_5); // 1
                    staticPacket1.writeByte(i_6); // 1
                    staticPacket1.writeShort(staticInt207);
                    staticPacket1.writeByte(57);
                    staticPacket1.writeByte(0);
                    staticPacket1.writeByte(0);
                    staticPacket1.writeByte(89);
                    staticPacket1.writeShort(BufferWrapper.staticPlayer1.int626);
                    staticPacket1.writeShort(BufferWrapper.staticPlayer1.int609);
                    staticPacket1.writeByte(63);
                    staticInt179 = i_12;
                    staticInt281 = i_13;
                }
            }
    }

    static final void staticMethod268() {
        int[] ints_1 = StaticClass10.playerIndexesInsideViewport;

        int i_2;
        for (i_2 = 0; i_2 < StaticClass10.playersInsideViewportCount; i_2++) {
            Player player_3 = players[ints_1[i_2]];
            if (player_3 != null && player_3.int615 > 0) {
                --player_3.int615;
                if (player_3.int615 == 0)
                    player_3.string43 = null;
            }
        }

        for (i_2 = 0; i_2 < staticInt186; i_2++) {
            int i_5 = staticIntArray91[i_2];
            Npc npc_4 = staticNpcArray1[i_5];
            if (npc_4 != null && npc_4.int615 > 0) {
                --npc_4.int615;
                if (npc_4.int615 == 0)
                    npc_4.string43 = null;
            }
        }

    }

    static final void staticMethod269(String string_0) {
        if (string_0.equalsIgnoreCase("toggleroof")) {
            StaticClass61.staticClientPreferences1.bool11 = !StaticClass61.staticClientPreferences1.bool11;
            ClientPreferences.staticMethod63();
            if (StaticClass61.staticClientPreferences1.bool11)
                StaticClass12.staticMethod59(99, "", "Roofs are now all hidden");
            else
                StaticClass12.staticMethod59(99, "", "Roofs will only be removed selectively");
        }

        if (string_0.equalsIgnoreCase("displayfps"))
            staticBool27 = !staticBool27;

        if (staticInt246 >= 2) {
            if (string_0.equalsIgnoreCase("aabb"))
                if (!StaticClass29.staticBool20) {
                    StaticClass29.staticBool20 = true;
                    StaticClass29.staticDataClass12_1 = DataClass12.staticDataClass12_2;
                } else if (StaticClass29.staticDataClass12_1 == DataClass12.staticDataClass12_2) {
                    StaticClass29.staticBool20 = true;
                    StaticClass29.staticDataClass12_1 = DataClass12.staticDataClass12_3;
                } else
                    StaticClass29.staticBool20 = false;

            if (string_0.equalsIgnoreCase("fpson"))
                staticBool27 = true;

            if (string_0.equalsIgnoreCase("fpsoff"))
                staticBool27 = false;

            if (string_0.equalsIgnoreCase("gc"))
                System.gc();

            if (string_0.equalsIgnoreCase("clientdrop"))
                staticMethod261();

            if (string_0.equalsIgnoreCase("errortest") && staticInt162 == 2)
                throw new RuntimeException();
        }

        staticPacket1.writeOpcode(153);
        staticPacket1.writeByte(string_0.length() + 1);
        staticPacket1.method430(string_0);
    }

    static final void staticMethod270() {
        int i_1 = BufferWrapper.staticPlayer1.int626;
        int i_2 = BufferWrapper.staticPlayer1.int609;
        if (DataClass7.staticInt78 - i_1 < -500 || DataClass7.staticInt78 - i_1 > 500 || WorldMapResource.staticInt2 - i_2 < -500 || WorldMapResource.staticInt2 - i_2 > 500) {
            DataClass7.staticInt78 = i_1;
            WorldMapResource.staticInt2 = i_2;
        }

        if (DataClass7.staticInt78 != i_1)
            DataClass7.staticInt78 += (i_1 - DataClass7.staticInt78) / 16;

        if (WorldMapResource.staticInt2 != i_2)
            WorldMapResource.staticInt2 += (i_2 - WorldMapResource.staticInt2) / 16;

        int i_3;
        int i_4;
        if (MouseHandler.staticInt26 == 4 && SoundBank.staticBool11) {
            i_3 = MouseHandler.staticInt29 - staticInt209;
            staticInt173 = i_3 * 2;
            staticInt209 = i_3 != -1 && i_3 != 1 ? (staticInt209 + MouseHandler.staticInt29) / 2 : MouseHandler.staticInt29;
            i_4 = staticInt284 - MouseHandler.staticInt28;
            staticInt283 = i_4 * 2;
            staticInt284 = i_4 != -1 && i_4 != 1 ? (staticInt284 + MouseHandler.staticInt28) / 2 : MouseHandler.staticInt28;
        } else {
            if (KeyboardHandler.staticBoolArray1[96])
                staticInt283 += (-24 - staticInt283) / 2;
            else if (KeyboardHandler.staticBoolArray1[97])
                staticInt283 += (24 - staticInt283) / 2;
            else
                staticInt283 /= 2;

            if (KeyboardHandler.staticBoolArray1[98])
                staticInt173 += (12 - staticInt173) / 2;
            else if (KeyboardHandler.staticBoolArray1[99])
                staticInt173 += (-12 - staticInt173) / 2;
            else
                staticInt173 /= 2;

            staticInt209 = MouseHandler.staticInt29;
            staticInt284 = MouseHandler.staticInt28;
        }

        staticInt207 = staticInt283 / 2 + staticInt207 & 0x7ff;
        staticInt161 += staticInt173 / 2;
        if (staticInt161 < 128)
            staticInt161 = 128;

        if (staticInt161 > 383)
            staticInt161 = 383;

        i_3 = DataClass7.staticInt78 >> 7;
        i_4 = WorldMapResource.staticInt2 >> 7;
        int i_5 = staticMethod293(DataClass7.staticInt78, WorldMapResource.staticInt2, DataClass14.staticInt156);
        int i_6 = 0;
        int i_7;
        if (i_3 > 3 && i_4 > 3 && i_3 < 100 && i_4 < 100)
            for (i_7 = i_3 - 4; i_7 <= i_3 + 4; i_7++)
                for (int i_8 = i_4 - 4; i_8 <= i_4 + 4; i_8++) {
                    int i_9 = DataClass14.staticInt156;
                    if (i_9 < 3 && (StaticClass3.staticByteArrayArrayArray1[1][i_7][i_8] & 0x2) == 2)
                        ++i_9;

                    int i_10 = i_5 - StaticClass3.staticIntArrayArrayArray1[i_9][i_7][i_8];
                    if (i_10 > i_6)
                        i_6 = i_10;
                }

        i_7 = i_6 * 192;
        if (i_7 > 98048)
            i_7 = 98048;

        if (i_7 < 32768)
            i_7 = 32768;

        if (i_7 > staticInt273)
            staticInt273 += (i_7 - staticInt273) / 24;
        else if (i_7 < staticInt273)
            staticInt273 += (i_7 - staticInt273) / 80;

    }

    static final void staticMethod271(Actor actor_0, int i_1) {
        int i_4;
        int i_5;
        int i_12;
        if (actor_0.int636 > staticInt166)
            staticMethod272(actor_0);
        else if (actor_0.int635 >= staticInt166)
            staticMethod273(actor_0);
        else {
            actor_0.stance = actor_0.idle;
            if (actor_0.int611 == 0)
                actor_0.int633 = 0;
            else
                label307: {
                    if (actor_0.anim != -1 && actor_0.int628 == 0) {
                        SeqType seqtype_3 = SeqType.staticMethod438(actor_0.anim);
                        if (actor_0.int625 > 0 && seqtype_3.int607 == 0) {
                            ++actor_0.int633;
                            break label307;
                        }

                        if (actor_0.int625 <= 0 && seqtype_3.priority == 0) {
                            ++actor_0.int633;
                            break label307;
                        }
                    }

                    i_12 = actor_0.int626;
                    i_4 = actor_0.int609;
                    i_5 = actor_0.tiles * 64 + actor_0.intArray103[actor_0.int611 - 1] * 128;
                    int i_6 = actor_0.tiles * 64 + actor_0.intArray104[actor_0.int611 - 1] * 128;
                    if (i_12 < i_5) {
                        if (i_4 < i_6)
                            actor_0.int639 = 1280;
                        else if (i_4 > i_6)
                            actor_0.int639 = 1792;
                        else
                            actor_0.int639 = 1536;
                    } else if (i_12 > i_5) {
                        if (i_4 < i_6)
                            actor_0.int639 = 768;
                        else if (i_4 > i_6)
                            actor_0.int639 = 256;
                        else
                            actor_0.int639 = 512;
                    } else if (i_4 < i_6)
                        actor_0.int639 = 1024;
                    else if (i_4 > i_6)
                        actor_0.int639 = 0;

                    byte b_7 = actor_0.byteArray12[actor_0.int611 - 1];
                    if (i_5 - i_12 <= 256 && i_5 - i_12 >= -256 && i_6 - i_4 <= 256 && i_6 - i_4 >= -256) {
                        int i_8 = actor_0.int639 - actor_0.int610 & 0x7ff;
                        if (i_8 > 1024)
                            i_8 -= 2048;

                        int i_9 = actor_0.reverse;
                        if (i_8 >= -256 && i_8 <= 256)
                            i_9 = actor_0.walk;
                        else if (i_8 >= 256 && i_8 < 768)
                            i_9 = actor_0.clockwise;
                        else if (i_8 >= -768 && i_8 <= -256)
                            i_9 = actor_0.counterclockwise;

                        if (i_9 == -1)
                            i_9 = actor_0.walk;

                        actor_0.stance = i_9;
                        int i_10 = 4;
                        boolean bool_11 = true;
                        if (actor_0 instanceof Npc)
                            bool_11 = ((Npc) actor_0).npcType1.bool64;

                        if (bool_11) {
                            if (actor_0.int610 != actor_0.int639 && actor_0.int620 == -1 && actor_0.ubn != 0)
                                i_10 = 2;

                            if (actor_0.int611 > 2)
                                i_10 = 6;

                            if (actor_0.int611 > 3)
                                i_10 = 8;

                            if (actor_0.int633 > 0 && actor_0.int611 > 1) {
                                i_10 = 8;
                                --actor_0.int633;
                            }
                        } else {
                            if (actor_0.int611 > 1)
                                i_10 = 6;

                            if (actor_0.int611 > 2)
                                i_10 = 8;

                            if (actor_0.int633 > 0 && actor_0.int611 > 1) {
                                i_10 = 8;
                                --actor_0.int633;
                            }
                        }

                        if (b_7 == 2)
                            i_10 <<= 1;

                        if (i_10 >= 8 && actor_0.stance == actor_0.walk && actor_0.run != -1)
                            actor_0.stance = actor_0.run;

                        if (i_12 != i_5 || i_4 != i_6) {
                            if (i_12 < i_5) {
                                actor_0.int626 += i_10;
                                if (actor_0.int626 > i_5)
                                    actor_0.int626 = i_5;
                            } else if (i_12 > i_5) {
                                actor_0.int626 -= i_10;
                                if (actor_0.int626 < i_5)
                                    actor_0.int626 = i_5;
                            }

                            if (i_4 < i_6) {
                                actor_0.int609 += i_10;
                                if (actor_0.int609 > i_6)
                                    actor_0.int609 = i_6;
                            } else if (i_4 > i_6) {
                                actor_0.int609 -= i_10;
                                if (actor_0.int609 < i_6)
                                    actor_0.int609 = i_6;
                            }
                        }

                        if (actor_0.int626 == i_5 && i_6 == actor_0.int609) {
                            --actor_0.int611;
                            if (actor_0.int625 > 0)
                                --actor_0.int625;
                        }
                    } else {
                        actor_0.int626 = i_5;
                        actor_0.int609 = i_6;
                        --actor_0.int611;
                        if (actor_0.int625 > 0)
                            --actor_0.int625;
                    }
                }
        }

        if (actor_0.int626 < 128 || actor_0.int609 < 128 || actor_0.int626 >= 13184 || actor_0.int609 >= 13184) {
            actor_0.anim = -1;
            actor_0.int640 = -1;
            actor_0.int636 = 0;
            actor_0.int635 = 0;
            actor_0.int626 = actor_0.intArray103[0] * 128 + actor_0.tiles * 64;
            actor_0.int609 = actor_0.tiles * 64 + actor_0.intArray104[0] * 128;
            actor_0.method608();
        }

        if (BufferWrapper.staticPlayer1 == actor_0 && (actor_0.int626 < 1536 || actor_0.int609 < 1536 || actor_0.int626 >= 11776 || actor_0.int609 >= 11776)) {
            actor_0.anim = -1;
            actor_0.int640 = -1;
            actor_0.int636 = 0;
            actor_0.int635 = 0;
            actor_0.int626 = actor_0.tiles * 64 + actor_0.intArray103[0] * 128;
            actor_0.int609 = actor_0.intArray104[0] * 128 + actor_0.tiles * 64;
            actor_0.method608();
        }

        if (actor_0.ubn != 0) {
            if (actor_0.int620 != -1) {
                Object obj_13 = null;
                if (actor_0.int620 < 32768)
                    obj_13 = staticNpcArray1[actor_0.int620];
                else if (actor_0.int620 >= 32768)
                    obj_13 = players[actor_0.int620 - 32768];

                if (obj_13 != null) {
                    i_4 = actor_0.int626 - ((Actor) obj_13).int626;
                    i_5 = actor_0.int609 - ((Actor) obj_13).int609;
                    if (i_4 != 0 || i_5 != 0)
                        actor_0.int639 = (int) (Math.atan2(i_4, i_5) * 325.949D) & 0x7ff;
                } else if (actor_0.bool72) {
                    actor_0.int620 = -1;
                    actor_0.bool72 = false;
                }
            }

            if (actor_0.int621 != -1 && (actor_0.int611 == 0 || actor_0.int633 > 0)) {
                actor_0.int639 = actor_0.int621;
                actor_0.int621 = -1;
            }

            i_12 = actor_0.int639 - actor_0.int610 & 0x7ff;
            if (i_12 == 0 && actor_0.bool72) {
                actor_0.int620 = -1;
                actor_0.bool72 = false;
            }

            if (i_12 != 0) {
                ++actor_0.int634;
                boolean bool_14;
                if (i_12 > 1024) {
                    actor_0.int610 -= actor_0.ubn;
                    bool_14 = true;
                    if (i_12 < actor_0.ubn || i_12 > 2048 - actor_0.ubn) {
                        actor_0.int610 = actor_0.int639;
                        bool_14 = false;
                    }

                    if (actor_0.idle == actor_0.stance && (actor_0.int634 > 25 || bool_14))
                        if (actor_0.unknown2 != -1)
                            actor_0.stance = actor_0.unknown2;
                        else
                            actor_0.stance = actor_0.walk;
                } else {
                    actor_0.int610 += actor_0.ubn;
                    bool_14 = true;
                    if (i_12 < actor_0.ubn || i_12 > 2048 - actor_0.ubn) {
                        actor_0.int610 = actor_0.int639;
                        bool_14 = false;
                    }

                    if (actor_0.stance == actor_0.idle && (actor_0.int634 > 25 || bool_14))
                        if (actor_0.int612 != -1)
                            actor_0.stance = actor_0.int612;
                        else
                            actor_0.stance = actor_0.walk;
                }

                actor_0.int610 &= 0x7ff;
            } else
                actor_0.int634 = 0;
        }

        staticMethod274(actor_0);
    }

    static final void staticMethod272(Actor actor_0) {
        int i_2 = actor_0.int636 - staticInt166;
        int i_3 = actor_0.tiles * 64 + actor_0.int622 * 128;
        int i_4 = actor_0.tiles * 64 + actor_0.int619 * 128;
        actor_0.int626 += (i_3 - actor_0.int626) / i_2;
        actor_0.int609 += (i_4 - actor_0.int609) / i_2;
        actor_0.int633 = 0;
        actor_0.int639 = actor_0.int641;
    }

    static final void staticMethod273(Actor actor_0) {
        if (actor_0.int635 == staticInt166 || actor_0.anim == -1 || actor_0.int628 != 0 || actor_0.int608 + 1 > SeqType.staticMethod438(actor_0.anim).frameLengths[actor_0.int624]) {
            int i_2 = actor_0.int635 - actor_0.int636;
            int i_3 = staticInt166 - actor_0.int636;
            int i_4 = actor_0.int622 * 128 + actor_0.tiles * 64;
            int i_5 = actor_0.tiles * 64 + actor_0.int619 * 128;
            int i_6 = actor_0.int632 * 128 + actor_0.tiles * 64;
            int i_7 = actor_0.int614 * 128 + actor_0.tiles * 64;
            actor_0.int626 = (i_6 * i_3 + i_4 * (i_2 - i_3)) / i_2;
            actor_0.int609 = (i_3 * i_7 + (i_2 - i_3) * i_5) / i_2;
        }

        actor_0.int633 = 0;
        actor_0.int639 = actor_0.int641;
        actor_0.int610 = actor_0.int639;
    }

    static final void staticMethod274(Actor actor_0) {
        actor_0.bool69 = false;
        SeqType seqtype_2;
        if (actor_0.stance != -1) {
            seqtype_2 = SeqType.staticMethod438(actor_0.stance);
            if (seqtype_2 != null && seqtype_2.frameIds != null) {
                ++actor_0.int623;
                if (actor_0.int618 < seqtype_2.frameIds.length && actor_0.int623 > seqtype_2.frameLengths[actor_0.int618]) {
                    actor_0.int623 = 1;
                    ++actor_0.int618;
                    staticMethod265(seqtype_2, actor_0.int618, actor_0.int626, actor_0.int609);
                }

                if (actor_0.int618 >= seqtype_2.frameIds.length) {
                    actor_0.int623 = 0;
                    actor_0.int618 = 0;
                    staticMethod265(seqtype_2, actor_0.int618, actor_0.int626, actor_0.int609);
                }
            } else
                actor_0.stance = -1;
        }

        if (actor_0.int640 != -1 && staticInt166 >= actor_0.int630) {
            if (actor_0.int631 < 0)
                actor_0.int631 = 0;

            int i_4 = SpotAnim.staticMethod418(actor_0.int640).anim;
            if (i_4 != -1) {
                SeqType seqtype_3 = SeqType.staticMethod438(i_4);
                if (seqtype_3 != null && seqtype_3.frameIds != null) {
                    ++actor_0.int629;
                    if (actor_0.int631 < seqtype_3.frameIds.length && actor_0.int629 > seqtype_3.frameLengths[actor_0.int631]) {
                        actor_0.int629 = 1;
                        ++actor_0.int631;
                        staticMethod265(seqtype_3, actor_0.int631, actor_0.int626, actor_0.int609);
                    }

                    if (actor_0.int631 >= seqtype_3.frameIds.length && (actor_0.int631 < 0 || actor_0.int631 >= seqtype_3.frameIds.length))
                        actor_0.int640 = -1;
                } else
                    actor_0.int640 = -1;
            } else
                actor_0.int640 = -1;
        }

        if (actor_0.anim != -1 && actor_0.int628 <= 1) {
            seqtype_2 = SeqType.staticMethod438(actor_0.anim);
            if (seqtype_2.int607 == 1 && actor_0.int625 > 0 && actor_0.int636 <= staticInt166 && actor_0.int635 < staticInt166) {
                actor_0.int628 = 1;
                return;
            }
        }

        if (actor_0.anim != -1 && actor_0.int628 == 0) {
            seqtype_2 = SeqType.staticMethod438(actor_0.anim);
            if (seqtype_2 != null && seqtype_2.frameIds != null) {
                ++actor_0.int608;
                if (actor_0.int624 < seqtype_2.frameIds.length && actor_0.int608 > seqtype_2.frameLengths[actor_0.int624]) {
                    actor_0.int608 = 1;
                    ++actor_0.int624;
                    staticMethod265(seqtype_2, actor_0.int624, actor_0.int626, actor_0.int609);
                }

                if (actor_0.int624 >= seqtype_2.frameIds.length) {
                    actor_0.int624 -= seqtype_2.frameStep;
                    ++actor_0.int627;
                    if (actor_0.int627 >= seqtype_2.int606)
                        actor_0.anim = -1;
                    else if (actor_0.int624 >= 0 && actor_0.int624 < seqtype_2.frameIds.length)
                        staticMethod265(seqtype_2, actor_0.int624, actor_0.int626, actor_0.int609);
                    else
                        actor_0.anim = -1;
                }

                actor_0.bool69 = seqtype_2.bool68;
            } else
                actor_0.anim = -1;
        }

        if (actor_0.int628 > 0)
            --actor_0.int628;

    }

    static void staticMethod275(Player player_0, int i_1, int i_2) {
        if (player_0.anim == i_1 && i_1 != -1) {
            int i_4 = SeqType.staticMethod438(i_1).delayType;
            if (i_4 == 1) {
                player_0.int624 = 0;
                player_0.int608 = 0;
                player_0.int628 = i_2;
                player_0.int627 = 0;
            }

            if (i_4 == 2)
                player_0.int627 = 0;
        } else if (i_1 == -1 || player_0.anim == -1 || SeqType.staticMethod438(i_1).int605 >= SeqType.staticMethod438(player_0.anim).int605) {
            player_0.anim = i_1;
            player_0.int624 = 0;
            player_0.int608 = 0;
            player_0.int628 = i_2;
            player_0.int627 = 0;
            player_0.int625 = player_0.int611;
        }

    }

    static int staticMethod276() {
        return staticBool33 ? 2 : 1;
    }

    static void staticMethod277(int i_0) {
        staticLong10 = 0L;
        if (i_0 >= 2)
            staticBool33 = true;
        else
            staticBool33 = false;

        if (staticMethod276() == 1)
            NodeSub2.staticClient1.method102(765, 503);
        else
            NodeSub2.staticClient1.method102(7680, 2160);

        if (staticInt165 >= 25) {
            staticPacket1.writeOpcode(151);
            staticPacket1.writeByte(staticMethod276());
            staticPacket1.writeShort(StaticClass5.staticInt35);
            staticPacket1.writeShort(Class2.staticInt16);
        }

    }

    @Override
    protected final void onResize() {
        staticLong10 = StaticClass27.synchronizedMethod7() + 500L;
        callJSResize();
        if (staticInt241 != -1)
            method407(true);

    }

    void callJSResize() {
        int i_2 = StaticClass5.staticInt35;
        int i_3 = Class2.staticInt16;
        if (int80 < i_2)
            i_2 = int80;

        if (int81 < i_3)
            i_3 = int81;

        if (StaticClass61.staticClientPreferences1 != null)
            try {
                StaticClass4.staticMethod32(NodeSub2.staticClient1, "resize", new Object[] { Integer.valueOf(staticMethod276()) });
            } catch (Throwable throwable_5) {
                ;
            }

    }

    final void method402() {
        int i_2;
        if (staticInt241 != -1) {
            i_2 = staticInt241;
            if (Widget.staticMethod383(i_2))
                staticMethod347(StaticClass25.staticWidgetArrayArray1[i_2], -1);
        }

        for (i_2 = 0; i_2 < staticInt269; i_2++) {
            if (staticBoolArray7[i_2])
                staticBoolArray8[i_2] = true;

            staticBoolArray5[i_2] = staticBoolArray7[i_2];
            staticBoolArray7[i_2] = false;
        }

        staticInt270 = staticInt166;
        staticInt226 = -1;
        staticInt235 = -1;
        Stopwatch.staticWidget6 = null;
        if (staticInt241 != -1) {
            staticInt269 = 0;
            staticMethod323(staticInt241, 0, 0, StaticClass5.staticInt35, Class2.staticInt16, 0, 0, -1);
        }

        Rasterizer2D.staticMethod441();
        int i_3;
        int i_4;
        int i_5;
        int i_7;
        int i_8;
        int i_9;
        if (!staticBool34) {
            if (staticInt226 != -1)
                staticMethod310(staticInt226, staticInt235);
        } else {
            i_2 = StaticClass6.staticInt42;
            i_3 = AABBClickboxDebug.staticInt317;
            i_4 = StaticClass1.staticInt1;
            i_5 = WorldMapRegionStorage.staticInt9;
            int i_6 = 6116423;
            Rasterizer2D.staticMethod450(i_2, i_3, i_4, i_5, i_6);
            Rasterizer2D.staticMethod450(i_2 + 1, i_3 + 1, i_4 - 2, 16, 0);
            Rasterizer2D.staticMethod457(i_2 + 1, i_3 + 18, i_4 - 2, i_5 - 19, 0);
            Friend.staticFontFace2.method664("Choose Option", i_2 + 3, i_3 + 14, i_6, -1);
            i_7 = MouseHandler.staticInt28;
            i_8 = MouseHandler.staticInt29;

            int i_10;
            int i_11;
            for (i_9 = 0; i_9 < staticInt225; i_9++) {
                i_10 = i_3 + 31 + (staticInt225 - 1 - i_9) * 15;
                i_11 = 16777215;
                if (i_7 > i_2 && i_7 < i_4 + i_2 && i_8 > i_10 - 13 && i_8 < i_10 + 3)
                    i_11 = 16776960;

                Friend.staticFontFace2.method664(staticMethod320(i_9), i_2 + 3, i_10, i_11, 0);
            }

            i_9 = StaticClass6.staticInt42;
            i_10 = AABBClickboxDebug.staticInt317;
            i_11 = StaticClass1.staticInt1;
            int i_12 = WorldMapRegionStorage.staticInt9;

            for (int i_13 = 0; i_13 < staticInt269; i_13++)
                if (staticIntArray102[i_13] + staticIntArray105[i_13] > i_9 && staticIntArray105[i_13] < i_11 + i_9 && staticIntArray107[i_13] + staticIntArray90[i_13] > i_10 && staticIntArray90[i_13] < i_12 + i_10)
                    staticBoolArray8[i_13] = true;
        }

        if (staticInt183 == 3)
            for (i_2 = 0; i_2 < staticInt269; i_2++)
                if (staticBoolArray5[i_2])
                    Rasterizer2D.staticMethod449(staticIntArray105[i_2], staticIntArray90[i_2], staticIntArray102[i_2], staticIntArray107[i_2], 16711935, 128);
                else if (staticBoolArray8[i_2])
                    Rasterizer2D.staticMethod449(staticIntArray105[i_2], staticIntArray90[i_2], staticIntArray102[i_2], staticIntArray107[i_2], 16711680, 128);

        i_2 = DataClass14.staticInt156;
        i_3 = BufferWrapper.staticPlayer1.int626;
        i_4 = BufferWrapper.staticPlayer1.int609;
        i_5 = staticInt272;

        for (NodeSub3 nodesub3_14 = (NodeSub3) NodeSub3.staticDeque10.method257(); nodesub3_14 != null; nodesub3_14 = (NodeSub3) NodeSub3.staticDeque10.method259())
            if (nodesub3_14.int339 != -1 || nodesub3_14.intArray43 != null) {
                i_7 = 0;
                if (i_3 > nodesub3_14.int340)
                    i_7 += i_3 - nodesub3_14.int340;
                else if (i_3 < nodesub3_14.int335)
                    i_7 += nodesub3_14.int335 - i_3;

                if (i_4 > nodesub3_14.int337)
                    i_7 += i_4 - nodesub3_14.int337;
                else if (i_4 < nodesub3_14.int344)
                    i_7 += nodesub3_14.int344 - i_4;

                if (i_7 - 64 <= nodesub3_14.int338 && staticInt267 != 0 && nodesub3_14.int336 == i_2) {
                    i_7 -= 64;
                    if (i_7 < 0)
                        i_7 = 0;

                    i_8 = staticInt267 * (nodesub3_14.int338 - i_7) / nodesub3_14.int338;
                    SoundEffect soundeffect_10000;
                    if (nodesub3_14.sampledSound1 == null) {
                        if (nodesub3_14.int339 >= 0) {
                            soundeffect_10000 = null;
                            SoundEffect soundeffect_15 = SoundEffect.staticMethod44(WMEnum6.staticJs5IndexImpl12, nodesub3_14.int339, 0);
                            if (soundeffect_15 != null) {
                                MusicNote musicnote_16 = soundeffect_15.method129().method521(Renderable.staticMus9_1);
                                SampledSound sampledsound_18 = SampledSound.staticMethod391(musicnote_16, 100, i_8);
                                sampledsound_18.synchronizedMethod10(-1);
                                HealthBar.staticSequenceSub1_1.synchronizedMethod8(sampledsound_18);
                                nodesub3_14.sampledSound1 = sampledsound_18;
                            }
                        }
                    } else
                        nodesub3_14.sampledSound1.synchronizedMethod11(i_8);

                    if (nodesub3_14.sampledSound2 == null) {
                        if (nodesub3_14.intArray43 != null && (nodesub3_14.int343 -= i_5) <= 0) {
                            i_9 = (int) (Math.random() * nodesub3_14.intArray43.length);
                            soundeffect_10000 = null;
                            SoundEffect soundeffect_17 = SoundEffect.staticMethod44(WMEnum6.staticJs5IndexImpl12, nodesub3_14.intArray43[i_9], 0);
                            if (soundeffect_17 != null) {
                                MusicNote musicnote_20 = soundeffect_17.method129().method521(Renderable.staticMus9_1);
                                SampledSound sampledsound_19 = SampledSound.staticMethod391(musicnote_20, 100, i_8);
                                sampledsound_19.synchronizedMethod10(0);
                                HealthBar.staticSequenceSub1_1.synchronizedMethod8(sampledsound_19);
                                nodesub3_14.sampledSound2 = sampledsound_19;
                                nodesub3_14.int343 = nodesub3_14.int341 + (int) (Math.random() * (nodesub3_14.int342 - nodesub3_14.int341));
                            }
                        }
                    } else {
                        nodesub3_14.sampledSound2.synchronizedMethod11(i_8);
                        if (!nodesub3_14.sampledSound2.hasPrevious())
                            nodesub3_14.sampledSound2 = null;
                    }
                } else {
                    if (nodesub3_14.sampledSound1 != null) {
                        HealthBar.staticSequenceSub1_1.synchronizedMethod9(nodesub3_14.sampledSound1);
                        nodesub3_14.sampledSound1 = null;
                    }

                    if (nodesub3_14.sampledSound2 != null) {
                        HealthBar.staticSequenceSub1_1.synchronizedMethod9(nodesub3_14.sampledSound2);
                        nodesub3_14.sampledSound2 = null;
                    }
                }
            }

        staticInt272 = 0;
    }

    static final void staticMethod278(String string_0, boolean bool_1) {
        byte b_3 = 4;
        int i_4 = b_3 + 6;
        int i_5 = b_3 + 6;
        int i_6 = StaticClass1.staticFontFace1.method662(string_0, 250);
        int i_7 = StaticClass1.staticFontFace1.method663(string_0, 250) * 13;
        Rasterizer2D.staticMethod450(i_4 - b_3, i_5 - b_3, b_3 + i_6 + b_3, b_3 + b_3 + i_7, 0);
        Rasterizer2D.staticMethod457(i_4 - b_3, i_5 - b_3, b_3 + b_3 + i_6, b_3 + i_7 + b_3, 16777215);
        StaticClass1.staticFontFace1.method667(string_0, i_4, i_5, i_6, i_7, 16777215, -1, 1, 1, 0);
        staticMethod311(i_4 - b_3, i_5 - b_3, b_3 + i_6 + b_3, b_3 + b_3 + i_7);
        if (bool_1)
            ExchangeOfferComparator6.staticGraphicsBuffer1.drawImage(0, 0);
        else
            staticMethod312(i_4, i_5, i_6, i_7);

    }

    static final void staticMethod279(int i_0, int i_1, int i_2, int i_3) {
        ++staticInt215;
        if (BufferWrapper.staticPlayer1.int626 >> 7 == staticInt179 && staticInt281 == BufferWrapper.staticPlayer1.int609 >> 7)
            staticInt179 = 0;

        staticMethod281(BufferWrapper.staticPlayer1, false);
        if (staticInt234 >= 0 && players[staticInt234] != null)
            staticMethod281(players[staticInt234], false);

        staticMethod282(true);
        int i_5 = StaticClass10.playersInsideViewportCount;
        int[] ints_6 = StaticClass10.playerIndexesInsideViewport;

        int i_7;
        for (i_7 = 0; i_7 < i_5; i_7++)
            if (ints_6[i_7] != staticInt234 && staticInt293 != ints_6[i_7])
                staticMethod281(players[ints_6[i_7]], true);

        staticMethod282(false);
        staticMethod283();
        staticMethod284();
        staticMethod280(i_0, i_1, i_2, i_3, true);
        i_0 = staticInt167;
        i_1 = staticInt184;
        i_2 = staticInt286;
        i_3 = staticInt292;
        Rasterizer2D.staticMethod442(i_0, i_1, i_2 + i_0, i_3 + i_1);
        Rasterizer3D.staticMethod470();
        int i_15;
        if (!staticBool45) {
            i_5 = staticInt161;
            if (staticInt273 / 256 > i_5)
                i_5 = staticInt273 / 256;

            if (staticBoolArray9[4] && 128 + staticIntArray98[4] > i_5)
                i_5 = 128 + staticIntArray98[4];

            i_15 = staticInt207 & 0x7ff;
            staticMethod294(DataClass7.staticInt78, staticMethod293(BufferWrapper.staticPlayer1.int626, BufferWrapper.staticPlayer1.int609, DataClass14.staticInt156) - staticInt210, WorldMapResource.staticInt2, i_5, i_15, 600 + i_5 * 3);
        }

        if (!staticBool45)
            i_5 = staticMethod285();
        else {
            if (StaticClass61.staticClientPreferences1.bool11)
                i_15 = DataClass14.staticInt156;
            else {
                i_7 = staticMethod293(StaticClass44.staticInt135, ChatLog.staticInt69, DataClass14.staticInt156);
                if (i_7 - DataClass3.staticInt41 < 800 && (StaticClass3.staticByteArrayArrayArray1[DataClass14.staticInt156][StaticClass44.staticInt135 >> 7][ChatLog.staticInt69 >> 7] & 0x4) != 0)
                    i_15 = DataClass14.staticInt156;
                else
                    i_15 = 3;
            }

            i_5 = i_15;
        }

        i_15 = StaticClass44.staticInt135;
        i_7 = DataClass3.staticInt41;
        int i_8 = ChatLog.staticInt69;
        int i_9 = DebugOverlay.staticInt304;
        int i_10 = StaticClass20.staticInt126;

        int i_11;
        int i_12;
        for (i_11 = 0; i_11 < 5; i_11++)
            if (staticBoolArray9[i_11]) {
                i_12 = (int) (Math.random() * (1 + staticIntArray116[i_11] * 2) - staticIntArray116[i_11] + Math.sin(staticIntArray117[i_11] / 100.0D * staticIntArray118[i_11]) * staticIntArray98[i_11]);
                if (i_11 == 0)
                    StaticClass44.staticInt135 += i_12;

                if (i_11 == 1)
                    DataClass3.staticInt41 += i_12;

                if (i_11 == 2)
                    ChatLog.staticInt69 += i_12;

                if (i_11 == 3)
                    StaticClass20.staticInt126 = i_12 + StaticClass20.staticInt126 & 0x7ff;

                if (i_11 == 4) {
                    DebugOverlay.staticInt304 += i_12;
                    if (DebugOverlay.staticInt304 < 128)
                        DebugOverlay.staticInt304 = 128;

                    if (DebugOverlay.staticInt304 > 383)
                        DebugOverlay.staticInt304 = 383;
                }
            }

        i_11 = MouseHandler.staticInt28;
        i_12 = MouseHandler.staticInt29;
        if (MouseHandler.staticInt27 != 0) {
            i_11 = MouseHandler.staticInt30;
            i_12 = MouseHandler.staticInt31;
        }

        int i_13;
        if (i_11 >= i_0 && i_11 < i_0 + i_2 && i_12 >= i_1 && i_12 < i_3 + i_1) {
            i_13 = i_11 - i_0;
            int i_14 = i_12 - i_1;
            StaticClass17.staticInt113 = i_13;
            StaticClass17.staticInt112 = i_14;
            StaticClass17.staticBool15 = true;
            StaticClass17.staticInt117 = 0;
            StaticClass17.staticBool16 = false;
        } else {
            StaticClass17.staticBool15 = false;
            StaticClass17.staticInt117 = 0;
        }

        staticMethod263();
        Rasterizer2D.staticMethod450(i_0, i_1, i_2, i_3, 0);
        staticMethod263();
        i_13 = Rasterizer3D.staticInt326;
        Rasterizer3D.staticInt326 = staticInt196;
        LegacyClickboxDebug.staticScene1.method216(StaticClass44.staticInt135, DataClass3.staticInt41, ChatLog.staticInt69, DebugOverlay.staticInt304, StaticClass20.staticInt126, i_5);

        while (true) {
            DebugOverlay debugoverlay_16 = (DebugOverlay) StaticClass29.staticHitMarkList1.method284();
            if (debugoverlay_16 == null) {
                Rasterizer3D.staticInt326 = i_13;
                staticMethod263();
                LegacyClickboxDebug.staticScene1.method193();
                staticMethod288(i_0, i_1, i_2, i_3);
                staticMethod286(i_0, i_1);
                ((TextureLoader) Rasterizer3D.staticInterface2_1).method155(staticInt272);
                staticMethod290(i_0, i_1, i_2, i_3);
                StaticClass44.staticInt135 = i_15;
                DataClass3.staticInt41 = i_7;
                ChatLog.staticInt69 = i_8;
                DebugOverlay.staticInt304 = i_9;
                StaticClass20.staticInt126 = i_10;
                if (staticBool41 && StaticClass45.staticMethod193(true, false) == 0)
                    staticBool41 = false;

                if (staticBool41) {
                    Rasterizer2D.staticMethod450(i_0, i_1, i_2, i_3, 0);
                    staticMethod278("Loading - please wait.", false);
                }

                return;
            }

            debugoverlay_16.draw();
        }
    }

    static final void staticMethod280(int i_0, int i_1, int i_2, int i_3, boolean bool_4) {
        if (i_2 < 1)
            i_2 = 1;

        if (i_3 < 1)
            i_3 = 1;

        int i_6 = i_3 - 334;
        if (i_6 < 0)
            i_6 = 0;
        else if (i_6 > 100)
            i_6 = 100;

        int i_7 = (staticShort5 - staticShort4) * i_6 / 100 + staticShort4;
        int i_8 = i_3 * i_7 * 512 / (i_2 * 334);
        int i_9;
        int i_10;
        short s_15;
        if (i_8 < staticShort8) {
            s_15 = staticShort8;
            i_7 = i_2 * s_15 * 334 / (i_3 * 512);
            if (i_7 > staticShort2) {
                i_7 = staticShort2;
                i_9 = i_7 * i_3 * 512 / (s_15 * 334);
                i_10 = (i_2 - i_9) / 2;
                if (bool_4) {
                    Rasterizer2D.staticMethod441();
                    Rasterizer2D.staticMethod450(i_0, i_1, i_10, i_3, -16777216);
                    Rasterizer2D.staticMethod450(i_2 + i_0 - i_10, i_1, i_10, i_3, -16777216);
                }

                i_0 += i_10;
                i_2 -= i_10 * 2;
            }
        } else if (i_8 > staticShort3) {
            s_15 = staticShort3;
            i_7 = i_2 * s_15 * 334 / (i_3 * 512);
            if (i_7 < staticShort1) {
                i_7 = staticShort1;
                i_9 = s_15 * i_2 * 334 / (i_7 * 512);
                i_10 = (i_3 - i_9) / 2;
                if (bool_4) {
                    Rasterizer2D.staticMethod441();
                    Rasterizer2D.staticMethod450(i_0, i_1, i_2, i_10, -16777216);
                    Rasterizer2D.staticMethod450(i_0, i_3 + i_1 - i_10, i_2, i_10, -16777216);
                }

                i_1 += i_10;
                i_3 -= i_10 * 2;
            }
        }

        i_9 = staticShort6 + i_6 * (staticShort7 - staticShort6) / 100;
        staticInt196 = i_7 * i_3 * i_9 / 85504 << 1;
        if (i_2 != staticInt286 || staticInt292 != i_3) {
            int[] ints_16 = new int[9];

            for (int i_11 = 0; i_11 < 9; i_11++) {
                int i_12 = 15 + i_11 * 32 + 128;
                int i_13 = 600 + i_12 * 3;
                int i_14 = Rasterizer3D.staticIntArray156[i_12];
                ints_16[i_11] = i_13 * i_14 >> 16;
            }

            Scene.staticMethod116(ints_16, 500, 800, i_2, i_3);
        }

        staticInt167 = i_0;
        staticInt184 = i_1;
        staticInt286 = i_2;
        staticInt292 = i_3;
    }

    static void staticMethod281(Player player_0, boolean bool_1) {
        if (player_0 != null && player_0.method609() && !player_0.bool78) {
            int i_3 = player_0.playerIndex << 14;
            player_0.bool77 = false;
            if ((staticBool25 && StaticClass10.playersInsideViewportCount > 50 || StaticClass10.playersInsideViewportCount > 200) && bool_1 && player_0.stance == player_0.idle)
                player_0.bool77 = true;

            int i_4 = player_0.int626 >> 7;
            int i_5 = player_0.int609 >> 7;
            if (i_4 >= 0 && i_4 < 104 && i_5 >= 0 && i_5 < 104)
                if (player_0.model3 != null && staticInt166 >= player_0.minSomething && staticInt166 < player_0.maxSomething) {
                    player_0.bool77 = false;
                    player_0.int682 = staticMethod293(player_0.int626, player_0.int609, DataClass14.staticInt156);
                    LegacyClickboxDebug.staticScene1.method191(DataClass14.staticInt156, player_0.int626, player_0.int609, player_0.int682, 60, player_0, player_0.int610, i_3, player_0.int687, player_0.int685, player_0.int679, player_0.int686);
                } else {
                    if ((player_0.int626 & 0x7f) == 64 && (player_0.int609 & 0x7f) == 64) {
                        if (staticInt215 == staticIntArrayArray9[i_4][i_5])
                            return;

                        staticIntArrayArray9[i_4][i_5] = staticInt215;
                    }

                    player_0.int682 = staticMethod293(player_0.int626, player_0.int609, DataClass14.staticInt156);
                    LegacyClickboxDebug.staticScene1.method190(DataClass14.staticInt156, player_0.int626, player_0.int609, player_0.int682, 60, player_0, player_0.int610, i_3, player_0.bool69);
                }
        }

    }

    static final void staticMethod282(boolean bool_0) {
        for (int i_2 = 0; i_2 < staticInt186; i_2++) {
            Npc npc_3 = staticNpcArray1[staticIntArray91[i_2]];
            int i_4 = 536870912 + (staticIntArray91[i_2] << 14);
            if (npc_3 != null && npc_3.method609() && bool_0 == npc_3.npcType1.bool61 && npc_3.npcType1.method569()) {
                int i_5 = npc_3.int626 >> 7;
                int i_6 = npc_3.int609 >> 7;
                if (i_5 >= 0 && i_5 < 104 && i_6 >= 0 && i_6 < 104) {
                    if (npc_3.tiles == 1 && (npc_3.int626 & 0x7f) == 64 && (npc_3.int609 & 0x7f) == 64) {
                        if (staticIntArrayArray9[i_5][i_6] == staticInt215)
                            continue;

                        staticIntArrayArray9[i_5][i_6] = staticInt215;
                    }

                    if (!npc_3.npcType1.bool62)
                        i_4 -= Integer.MIN_VALUE;

                    LegacyClickboxDebug.staticScene1.method190(DataClass14.staticInt156, npc_3.int626, npc_3.int609, staticMethod293(npc_3.tiles * 64 - 64 + npc_3.int626, npc_3.tiles * 64 - 64 + npc_3.int609, DataClass14.staticInt156), 60 + npc_3.tiles * 64 - 64, npc_3, npc_3.int610, i_4, npc_3.bool69);
                }
            }
        }

    }

    static final void staticMethod283() {
        for (Projectile projectile_1 = (Projectile) staticDeque5.method257(); projectile_1 != null; projectile_1 = (Projectile) staticDeque5.method259())
            if (DataClass14.staticInt156 == projectile_1.int660 && staticInt166 <= projectile_1.endCycle) {
                if (staticInt166 >= projectile_1.int662) {
                    if (projectile_1.int661 > 0) {
                        Npc npc_2 = staticNpcArray1[projectile_1.int661 - 1];
                        if (npc_2 != null && npc_2.int626 >= 0 && npc_2.int626 < 13312 && npc_2.int609 >= 0 && npc_2.int609 < 13312)
                            projectile_1.method614(npc_2.int626, npc_2.int609, staticMethod293(npc_2.int626, npc_2.int609, projectile_1.int660) - projectile_1.int659, staticInt166);
                    }

                    if (projectile_1.int661 < 0) {
                        int i_3 = -projectile_1.int661 - 1;
                        Player player_4;
                        if (staticInt293 == i_3)
                            player_4 = BufferWrapper.staticPlayer1;
                        else
                            player_4 = players[i_3];

                        if (player_4 != null && player_4.int626 >= 0 && player_4.int626 < 13312 && player_4.int609 >= 0 && player_4.int609 < 13312)
                            projectile_1.method614(player_4.int626, player_4.int609, staticMethod293(player_4.int626, player_4.int609, projectile_1.int660) - projectile_1.int659, staticInt166);
                    }

                    projectile_1.method615(staticInt272);
                    LegacyClickboxDebug.staticScene1.method190(DataClass14.staticInt156, (int) projectile_1.x, (int) projectile_1.y, (int) projectile_1.z, 60, projectile_1, projectile_1.rotX, -1, false);
                }
            } else
                projectile_1.unlink();

    }

    static final void staticMethod284() {
        for (RenderableSub2 renderablesub2_1 = (RenderableSub2) staticDeque6.method257(); renderablesub2_1 != null; renderablesub2_1 = (RenderableSub2) staticDeque6.method259())
            if (renderablesub2_1.int651 == DataClass14.staticInt156 && !renderablesub2_1.bool73) {
                if (staticInt166 >= renderablesub2_1.int649) {
                    renderablesub2_1.method613(staticInt272);
                    if (renderablesub2_1.bool73)
                        renderablesub2_1.unlink();
                    else
                        LegacyClickboxDebug.staticScene1.method190(renderablesub2_1.int651, renderablesub2_1.int650, renderablesub2_1.int655, renderablesub2_1.int652, 60, renderablesub2_1, 0, -1, false);
                }
            } else
                renderablesub2_1.unlink();

    }

    static final int staticMethod285() {
        if (StaticClass61.staticClientPreferences1.bool11)
            return DataClass14.staticInt156;
        else {
            int i_1 = 3;
            if (DebugOverlay.staticInt304 < 310) {
                int i_2 = StaticClass44.staticInt135 >> 7;
                int i_3 = ChatLog.staticInt69 >> 7;
                int i_4 = BufferWrapper.staticPlayer1.int626 >> 7;
                int i_5 = BufferWrapper.staticPlayer1.int609 >> 7;
                if (i_2 < 0 || i_3 < 0 || i_2 >= 104 || i_3 >= 104)
                    return DataClass14.staticInt156;

                if ((StaticClass3.staticByteArrayArrayArray1[DataClass14.staticInt156][i_2][i_3] & 0x4) != 0)
                    i_1 = DataClass14.staticInt156;

                int i_6;
                if (i_4 > i_2)
                    i_6 = i_4 - i_2;
                else
                    i_6 = i_2 - i_4;

                int i_7;
                if (i_5 > i_3)
                    i_7 = i_5 - i_3;
                else
                    i_7 = i_3 - i_5;

                int i_8;
                int i_9;
                if (i_6 > i_7) {
                    i_8 = i_7 * 65536 / i_6;
                    i_9 = 32768;

                    while (i_2 != i_4) {
                        if (i_2 < i_4)
                            ++i_2;
                        else if (i_2 > i_4)
                            --i_2;

                        if ((StaticClass3.staticByteArrayArrayArray1[DataClass14.staticInt156][i_2][i_3] & 0x4) != 0)
                            i_1 = DataClass14.staticInt156;

                        i_9 += i_8;
                        if (i_9 >= 65536) {
                            i_9 -= 65536;
                            if (i_3 < i_5)
                                ++i_3;
                            else if (i_3 > i_5)
                                --i_3;

                            if ((StaticClass3.staticByteArrayArrayArray1[DataClass14.staticInt156][i_2][i_3] & 0x4) != 0)
                                i_1 = DataClass14.staticInt156;
                        }
                    }
                } else {
                    i_8 = i_6 * 65536 / i_7;
                    i_9 = 32768;

                    while (i_3 != i_5) {
                        if (i_3 < i_5)
                            ++i_3;
                        else if (i_3 > i_5)
                            --i_3;

                        if ((StaticClass3.staticByteArrayArrayArray1[DataClass14.staticInt156][i_2][i_3] & 0x4) != 0)
                            i_1 = DataClass14.staticInt156;

                        i_9 += i_8;
                        if (i_9 >= 65536) {
                            i_9 -= 65536;
                            if (i_2 < i_4)
                                ++i_2;
                            else if (i_2 > i_4)
                                --i_2;

                            if ((StaticClass3.staticByteArrayArrayArray1[DataClass14.staticInt156][i_2][i_3] & 0x4) != 0)
                                i_1 = DataClass14.staticInt156;
                        }
                    }
                }
            }

            if (BufferWrapper.staticPlayer1.int626 >= 0 && BufferWrapper.staticPlayer1.int609 >= 0 && BufferWrapper.staticPlayer1.int626 < 13312 && BufferWrapper.staticPlayer1.int609 < 13312) {
                if ((StaticClass3.staticByteArrayArrayArray1[DataClass14.staticInt156][BufferWrapper.staticPlayer1.int626 >> 7][BufferWrapper.staticPlayer1.int609 >> 7] & 0x4) != 0)
                    i_1 = DataClass14.staticInt156;

                return i_1;
            } else
                return DataClass14.staticInt156;
        }
    }

    static final void staticMethod286(int i_0, int i_1) {
        if (staticInt170 == 2) {
            staticMethod292((staticInt214 - DataClass10.staticInt111 << 7) + staticInt176, (staticInt188 - Class4.staticInt53 << 7) + staticInt177, staticInt175 * 2);
            if (staticInt202 > -1 && staticInt166 % 20 < 10)
                WorldMapRegionStorage.staticSpriteArray2[0].method684(staticInt202 + i_0 - 12, staticInt208 + i_1 - 28);

        }
    }

    static final void staticMethod287(Actor actor_0, int i_1, int i_2, int i_3, int i_4, int i_5) {
        if (actor_0 != null && actor_0.method609()) {
            if (actor_0 instanceof Npc) {
                NpcType npctype_7 = ((Npc) actor_0).npcType1;
                if (npctype_7.intArray90 != null)
                    npctype_7 = npctype_7.method568();

                if (npctype_7 == null)
                    return;
            }

            int i_75 = StaticClass10.playersInsideViewportCount;
            int[] ints_8 = StaticClass10.playerIndexesInsideViewport;
            int i_9 = 3;
            int i_15;
            int i_22;
            int i_23;
            if (!actor_0.hitMarkList3.method288()) {
                staticMethod291(actor_0, 15 + actor_0.int638);

                for (HealthBar healthbar_10 = (HealthBar) actor_0.hitMarkList3.method285(); healthbar_10 != null; healthbar_10 = (HealthBar) actor_0.hitMarkList3.method287()) {
                    HitMark hitmark_11 = healthbar_10.method412(staticInt166);
                    if (hitmark_11 == null) {
                        if (healthbar_10.method413())
                            healthbar_10.unlink();
                    } else {
                        HealthBarType healthbartype_12 = healthbar_10.healthBarType1;
                        Sprite sprite_13 = healthbartype_12.method601();
                        Sprite sprite_14 = healthbartype_12.method600();
                        int i_16 = 0;
                        if (sprite_13 != null && sprite_14 != null) {
                            if (healthbartype_12.int598 * 2 < sprite_14.width)
                                i_16 = healthbartype_12.int598;

                            i_15 = sprite_14.width - i_16 * 2;
                        } else
                            i_15 = healthbartype_12.int604;

                        int i_17 = 255;
                        boolean bool_18 = true;
                        int i_19 = staticInt166 - hitmark_11.int319;
                        int i_20 = hitmark_11.healthRemaining2 * i_15 / healthbartype_12.int604;
                        int i_21;
                        int i_84;
                        if (hitmark_11.int321 > i_19) {
                            i_21 = healthbartype_12.int600 == 0 ? 0 : healthbartype_12.int600 * (i_19 / healthbartype_12.int600);
                            i_22 = hitmark_11.int320 * i_15 / healthbartype_12.int604;
                            i_84 = (i_20 - i_22) * i_21 / hitmark_11.int321 + i_22;
                        } else {
                            i_84 = i_20;
                            i_21 = hitmark_11.int321 + healthbartype_12.int601 - i_19;
                            if (healthbartype_12.int597 >= 0)
                                i_17 = (i_21 << 8) / (healthbartype_12.int601 - healthbartype_12.int597);
                        }

                        if (hitmark_11.healthRemaining2 > 0 && i_84 < 1)
                            i_84 = 1;

                        i_21 = staticInt202 + i_2 - (i_15 >> 1);
                        i_22 = staticInt208 + i_3 - i_9;
                        if (sprite_13 != null && sprite_14 != null) {
                            i_21 -= i_16;
                            if (i_84 == i_15)
                                i_84 += i_16 * 2;
                            else
                                i_84 += i_16;

                            i_23 = sprite_13.height;
                            i_9 += i_23;
                            if (i_17 >= 0 && i_17 < 255) {
                                sprite_13.method687(i_21, i_22, i_17);
                                Rasterizer2D.staticMethod443(i_21, i_22, i_21 + i_84, i_23 + i_22);
                                sprite_14.method687(i_21, i_22, i_17);
                            } else {
                                sprite_13.method684(i_21, i_22);
                                Rasterizer2D.staticMethod443(i_21, i_22, i_84 + i_21, i_23 + i_22);
                                sprite_14.method684(i_21, i_22);
                            }

                            Rasterizer2D.staticMethod442(i_2, i_3, i_4 + i_2, i_5 + i_3);
                            i_9 += 2;
                        } else {
                            if (staticInt202 > -1) {
                                Rasterizer2D.staticMethod450(i_21, i_22, i_84, 5, 65280);
                                Rasterizer2D.staticMethod450(i_84 + i_21, i_22, i_15 - i_84, 5, 16711680);
                            }

                            i_9 += 7;
                        }
                    }
                }
            }

            if (i_9 < 30)
                i_9 = 30;

            if (i_1 < i_75) {
                Player player_76 = (Player) actor_0;
                if (player_76.bool78)
                    return;

                if (player_76.skullId != -1 || player_76.prayerId != -1) {
                    staticMethod291(actor_0, 15 + actor_0.int638);
                    if (staticInt202 > -1) {
                        if (player_76.skullId != -1) {
                            DataClass11.staticSpriteArray6[player_76.skullId].method684(i_2 + staticInt202 - 12, staticInt208 + i_3 - i_9);
                            i_9 += 25;
                        }

                        if (player_76.prayerId != -1) {
                            DataClass1.staticSpriteArray3[player_76.prayerId].method684(staticInt202 + i_2 - 12, i_3 + staticInt208 - i_9);
                            i_9 += 25;
                        }
                    }
                }

                if (i_1 >= 0 && staticInt170 == 10 && ints_8[i_1] == staticInt172) {
                    staticMethod291(actor_0, actor_0.int638 + 15);
                    if (staticInt202 > -1)
                        WorldMapRegionStorage.staticSpriteArray2[1].method684(staticInt202 + i_2 - 12, staticInt208 + i_3 - i_9);
                }
            } else {
                NpcType npctype_77 = ((Npc) actor_0).npcType1;
                if (npctype_77.intArray90 != null)
                    npctype_77 = npctype_77.method568();

                if (npctype_77.int545 >= 0 && npctype_77.int545 < DataClass1.staticSpriteArray3.length) {
                    staticMethod291(actor_0, actor_0.int638 + 15);
                    if (staticInt202 > -1)
                        DataClass1.staticSpriteArray3[npctype_77.int545].method684(staticInt202 + i_2 - 12, i_3 + staticInt208 - 30);
                }

                if (staticInt170 == 1 && staticIntArray91[i_1 - i_75] == staticInt171 && staticInt166 % 20 < 10) {
                    staticMethod291(actor_0, 15 + actor_0.int638);
                    if (staticInt202 > -1)
                        WorldMapRegionStorage.staticSpriteArray2[0].method684(staticInt202 + i_2 - 12, staticInt208 + i_3 - 28);
                }
            }

            if (actor_0.string43 != null && (i_1 >= i_75 || !actor_0.bool71 && (staticInt275 == 4 || !actor_0.bool70 && (staticInt275 == 0 || staticInt275 == 3 || staticInt275 == 1 && staticMethod355(((Player) actor_0).name, false))))) {
                staticMethod291(actor_0, actor_0.int638);
                if (staticInt202 > -1 && staticInt211 < 50) {
                    staticIntArray100[staticInt211] = Friend.staticFontFace2.stringWidth(actor_0.string43) / 2;
                    staticIntArray87[staticInt211] = Friend.staticFontFace2.int674;
                    staticIntArray85[staticInt211] = staticInt202;
                    staticIntArray86[staticInt211] = staticInt208;
                    staticIntArray88[staticInt211] = actor_0.int616;
                    staticIntArray89[staticInt211] = actor_0.int617;
                    staticIntArray99[staticInt211] = actor_0.int615;
                    staticStringArray10[staticInt211] = actor_0.string43;
                    ++staticInt211;
                }
            }

            for (int i_79 = 0; i_79 < 4; i_79++) {
                int i_78 = actor_0.intArray101[i_79];
                int i_80 = actor_0.intArray102[i_79];
                Config32 config32_81 = null;
                int i_82 = 0;
                if (i_80 >= 0) {
                    if (i_78 <= staticInt166)
                        continue;

                    config32_81 = Config32.staticMethod419(actor_0.intArray102[i_79]);
                    i_82 = config32_81.int560;
                    if (config32_81 != null && config32_81.intArray94 != null) {
                        config32_81 = config32_81.method577();
                        if (config32_81 == null) {
                            actor_0.intArray101[i_79] = -1;
                            continue;
                        }
                    }
                } else if (i_78 < 0)
                    continue;

                i_15 = actor_0.intArray99[i_79];
                Config32 config32_83 = null;
                if (i_15 >= 0) {
                    config32_83 = Config32.staticMethod419(i_15);
                    if (config32_83 != null && config32_83.intArray94 != null)
                        config32_83 = config32_83.method577();
                }

                if (i_78 - i_82 <= staticInt166)
                    if (config32_81 == null)
                        actor_0.intArray101[i_79] = -1;
                    else {
                        staticMethod291(actor_0, actor_0.int638 / 2);
                        if (staticInt202 > -1) {
                            if (i_79 == 1)
                                staticInt208 -= 20;

                            if (i_79 == 2) {
                                staticInt202 -= 15;
                                staticInt208 -= 10;
                            }

                            if (i_79 == 3) {
                                staticInt202 += 15;
                                staticInt208 -= 10;
                            }

                            Sprite sprite_87 = null;
                            Sprite sprite_85 = null;
                            Sprite sprite_86 = null;
                            Sprite sprite_88 = null;
                            i_22 = 0;
                            i_23 = 0;
                            int i_24 = 0;
                            int i_25 = 0;
                            int i_26 = 0;
                            int i_27 = 0;
                            int i_28 = 0;
                            int i_29 = 0;
                            Sprite sprite_30 = null;
                            Sprite sprite_31 = null;
                            Sprite sprite_32 = null;
                            Sprite sprite_33 = null;
                            int i_34 = 0;
                            int i_35 = 0;
                            int i_36 = 0;
                            int i_37 = 0;
                            int i_38 = 0;
                            int i_39 = 0;
                            int i_40 = 0;
                            int i_41 = 0;
                            int i_42 = 0;
                            sprite_87 = config32_81.method579();
                            int i_43;
                            if (sprite_87 != null) {
                                i_22 = sprite_87.width;
                                i_43 = sprite_87.height;
                                if (i_43 > i_42)
                                    i_42 = i_43;

                                i_26 = sprite_87.xoffset;
                            }

                            sprite_85 = config32_81.method580();
                            if (sprite_85 != null) {
                                i_23 = sprite_85.width;
                                i_43 = sprite_85.height;
                                if (i_43 > i_42)
                                    i_42 = i_43;

                                i_27 = sprite_85.xoffset;
                            }

                            sprite_86 = config32_81.method581();
                            if (sprite_86 != null) {
                                i_24 = sprite_86.width;
                                i_43 = sprite_86.height;
                                if (i_43 > i_42)
                                    i_42 = i_43;

                                i_28 = sprite_86.xoffset;
                            }

                            sprite_88 = config32_81.method582();
                            if (sprite_88 != null) {
                                i_25 = sprite_88.width;
                                i_43 = sprite_88.height;
                                if (i_43 > i_42)
                                    i_42 = i_43;

                                i_29 = sprite_88.xoffset;
                            }

                            if (config32_83 != null) {
                                sprite_30 = config32_83.method579();
                                if (sprite_30 != null) {
                                    i_34 = sprite_30.width;
                                    i_43 = sprite_30.height;
                                    if (i_43 > i_42)
                                        i_42 = i_43;

                                    i_38 = sprite_30.xoffset;
                                }

                                sprite_31 = config32_83.method580();
                                if (sprite_31 != null) {
                                    i_35 = sprite_31.width;
                                    i_43 = sprite_31.height;
                                    if (i_43 > i_42)
                                        i_42 = i_43;

                                    i_39 = sprite_31.xoffset;
                                }

                                sprite_32 = config32_83.method581();
                                if (sprite_32 != null) {
                                    i_36 = sprite_32.width;
                                    i_43 = sprite_32.height;
                                    if (i_43 > i_42)
                                        i_42 = i_43;

                                    i_40 = sprite_32.xoffset;
                                }

                                sprite_33 = config32_83.method582();
                                if (sprite_33 != null) {
                                    i_37 = sprite_33.width;
                                    i_43 = sprite_33.height;
                                    if (i_43 > i_42)
                                        i_42 = i_43;

                                    i_41 = sprite_33.xoffset;
                                }
                            }

                            FontFace fontface_89 = config32_81.method583();
                            if (fontface_89 == null)
                                fontface_89 = DebugOverlay.staticFontFace3;

                            FontFace fontface_44;
                            if (config32_83 != null) {
                                fontface_44 = config32_83.method583();
                                if (fontface_44 == null)
                                    fontface_44 = DebugOverlay.staticFontFace3;
                            } else
                                fontface_44 = DebugOverlay.staticFontFace3;

                            String string_45 = null;
                            String string_46 = null;
                            boolean bool_47 = false;
                            int i_48 = 0;
                            string_45 = config32_81.method578(actor_0.intArray98[i_79]);
                            int i_90 = fontface_89.stringWidth(string_45);
                            if (config32_83 != null) {
                                string_46 = config32_83.method578(actor_0.intArray100[i_79]);
                                i_48 = fontface_44.stringWidth(string_46);
                            }

                            int i_49 = 0;
                            int i_50 = 0;
                            if (i_23 > 0)
                                if (sprite_86 == null && sprite_88 == null)
                                    i_49 = 1;
                                else
                                    i_49 = i_90 / i_23 + 1;

                            if (config32_83 != null && i_35 > 0)
                                if (sprite_32 == null && sprite_33 == null)
                                    i_50 = 1;
                                else
                                    i_50 = i_48 / i_35 + 1;

                            int i_51 = 0;
                            int i_52 = i_51;
                            if (i_22 > 0)
                                i_51 += i_22;

                            i_51 += 2;
                            int i_53 = i_51;
                            if (i_24 > 0)
                                i_51 += i_24;

                            int i_54 = i_51;
                            int i_55 = i_51;
                            int i_56;
                            if (i_23 > 0) {
                                i_56 = i_49 * i_23;
                                i_51 += i_56;
                                i_55 += (i_56 - i_90) / 2;
                            } else
                                i_51 += i_90;

                            i_56 = i_51;
                            if (i_25 > 0)
                                i_51 += i_25;

                            int i_57 = 0;
                            int i_58 = 0;
                            int i_59 = 0;
                            int i_60 = 0;
                            int i_61 = 0;
                            int i_62;
                            if (config32_83 != null) {
                                i_51 += 2;
                                i_57 = i_51;
                                if (i_34 > 0)
                                    i_51 += i_34;

                                i_51 += 2;
                                i_58 = i_51;
                                if (i_36 > 0)
                                    i_51 += i_36;

                                i_59 = i_51;
                                i_61 = i_51;
                                if (i_35 > 0) {
                                    i_62 = i_35 * i_50;
                                    i_51 += i_62;
                                    i_61 += (i_62 - i_48) / 2;
                                } else
                                    i_51 += i_48;

                                i_60 = i_51;
                                if (i_37 > 0)
                                    i_51 += i_37;
                            }

                            i_62 = actor_0.intArray101[i_79] - staticInt166;
                            int i_63 = config32_81.int572 - i_62 * config32_81.int572 / config32_81.int560;
                            int i_64 = -config32_81.int566 + config32_81.int566 * i_62 / config32_81.int560;
                            int i_65 = i_2 + staticInt202 - (i_51 >> 1) + i_63;
                            int i_66 = i_3 + staticInt208 - 12 + i_64;
                            int i_67 = i_66;
                            int i_68 = i_66 + i_42;
                            int i_69 = i_66 + 15 + config32_81.int569;
                            int i_70 = i_69 - fontface_89.int675;
                            int i_71 = i_69 + fontface_89.int676;
                            if (i_70 < i_66)
                                i_67 = i_70;

                            if (i_71 > i_68)
                                i_68 = i_71;

                            int i_72 = 0;
                            int i_73;
                            int i_74;
                            if (config32_83 != null) {
                                i_72 = i_66 + 15 + config32_83.int569;
                                i_73 = i_72 - fontface_44.int675;
                                i_74 = fontface_44.int676 + i_72;
                                if (i_73 < i_67)
                                    ;

                                if (i_74 > i_68)
                                    ;
                            }

                            i_73 = 255;
                            if (config32_81.int567 >= 0)
                                i_73 = (i_62 << 8) / (config32_81.int560 - config32_81.int567);

                            if (i_73 >= 0 && i_73 < 255) {
                                if (sprite_87 != null)
                                    sprite_87.method687(i_52 + i_65 - i_26, i_66, i_73);

                                if (sprite_86 != null)
                                    sprite_86.method687(i_53 + i_65 - i_28, i_66, i_73);

                                if (sprite_85 != null)
                                    for (i_74 = 0; i_74 < i_49; i_74++)
                                        sprite_85.method687(i_23 * i_74 + i_65 + i_54 - i_27, i_66, i_73);

                                if (sprite_88 != null)
                                    sprite_88.method687(i_56 + i_65 - i_29, i_66, i_73);

                                fontface_89.method665(string_45, i_65 + i_55, i_69, config32_81.int568, 0, i_73);
                                if (config32_83 != null) {
                                    if (sprite_30 != null)
                                        sprite_30.method687(i_57 + i_65 - i_38, i_66, i_73);

                                    if (sprite_32 != null)
                                        sprite_32.method687(i_65 + i_58 - i_40, i_66, i_73);

                                    if (sprite_31 != null)
                                        for (i_74 = 0; i_74 < i_50; i_74++)
                                            sprite_31.method687(i_35 * i_74 + i_65 + i_59 - i_39, i_66, i_73);

                                    if (sprite_33 != null)
                                        sprite_33.method687(i_60 + i_65 - i_41, i_66, i_73);

                                    fontface_44.method665(string_46, i_65 + i_61, i_72, config32_83.int568, 0, i_73);
                                }
                            } else {
                                if (sprite_87 != null)
                                    sprite_87.method684(i_52 + i_65 - i_26, i_66);

                                if (sprite_86 != null)
                                    sprite_86.method684(i_53 + i_65 - i_28, i_66);

                                if (sprite_85 != null)
                                    for (i_74 = 0; i_74 < i_49; i_74++)
                                        sprite_85.method684(i_23 * i_74 + i_65 + i_54 - i_27, i_66);

                                if (sprite_88 != null)
                                    sprite_88.method684(i_56 + i_65 - i_29, i_66);

                                fontface_89.method664(string_45, i_55 + i_65, i_69, config32_81.int568 | ~0xffffff, 0);
                                if (config32_83 != null) {
                                    if (sprite_30 != null)
                                        sprite_30.method684(i_57 + i_65 - i_38, i_66);

                                    if (sprite_32 != null)
                                        sprite_32.method684(i_65 + i_58 - i_40, i_66);

                                    if (sprite_31 != null)
                                        for (i_74 = 0; i_74 < i_50; i_74++)
                                            sprite_31.method684(i_65 + i_59 - i_39 + i_35 * i_74, i_66);

                                    if (sprite_33 != null)
                                        sprite_33.method684(i_60 + i_65 - i_41, i_66);

                                    fontface_44.method664(string_46, i_61 + i_65, i_72, config32_83.int568 | ~0xffffff, 0);
                                }
                            }
                        }
                    }
            }

        }
    }

    static final void staticMethod288(int i_0, int i_1, int i_2, int i_3) {
        staticInt211 = 0;
        boolean bool_5 = false;
        int i_6 = -1;
        int i_7 = StaticClass10.playersInsideViewportCount;
        int[] ints_8 = StaticClass10.playerIndexesInsideViewport;

        int i_9;
        for (i_9 = 0; i_9 < i_7 + staticInt186; i_9++) {
            Object obj_10;
            if (i_9 < i_7) {
                obj_10 = players[ints_8[i_9]];
                if (ints_8[i_9] == staticInt234) {
                    bool_5 = true;
                    i_6 = i_9;
                    continue;
                }
            } else
                obj_10 = staticNpcArray1[staticIntArray91[i_9 - i_7]];

            staticMethod287((Actor) obj_10, i_9, i_0, i_1, i_2, i_3);
        }

        if (bool_5)
            staticMethod287(players[staticInt234], i_6, i_0, i_1, i_2, i_3);

        for (i_9 = 0; i_9 < staticInt211; i_9++) {
            int i_19 = staticIntArray85[i_9];
            int i_11 = staticIntArray86[i_9];
            int i_12 = staticIntArray100[i_9];
            int i_13 = staticIntArray87[i_9];
            boolean bool_14 = true;

            while (bool_14) {
                bool_14 = false;

                for (int i_15 = 0; i_15 < i_9; i_15++)
                    if (i_11 + 2 > staticIntArray86[i_15] - staticIntArray87[i_15] && i_11 - i_13 < staticIntArray86[i_15] + 2 && i_19 - i_12 < staticIntArray100[i_15] + staticIntArray85[i_15] && i_19 + i_12 > staticIntArray85[i_15] - staticIntArray100[i_15] && staticIntArray86[i_15] - staticIntArray87[i_15] < i_11) {
                        i_11 = staticIntArray86[i_15] - staticIntArray87[i_15];
                        bool_14 = true;
                    }
            }

            staticInt202 = staticIntArray85[i_9];
            staticInt208 = staticIntArray86[i_9] = i_11;
            String string_20 = staticStringArray10[i_9];
            if (staticInt242 == 0) {
                int i_16 = 16776960;
                if (staticIntArray88[i_9] < 6)
                    i_16 = staticIntArray106[staticIntArray88[i_9]];

                if (staticIntArray88[i_9] == 6)
                    i_16 = staticInt215 % 20 < 10 ? 16711680 : 16776960;

                if (staticIntArray88[i_9] == 7)
                    i_16 = staticInt215 % 20 < 10 ? 255 : 65535;

                if (staticIntArray88[i_9] == 8)
                    i_16 = staticInt215 % 20 < 10 ? 45056 : 8454016;

                int i_17;
                if (staticIntArray88[i_9] == 9) {
                    i_17 = 150 - staticIntArray99[i_9];
                    if (i_17 < 50)
                        i_16 = 16711680 + i_17 * 1280;
                    else if (i_17 < 100)
                        i_16 = 16776960 - (i_17 - 50) * 327680;
                    else if (i_17 < 150)
                        i_16 = (i_17 - 100) * 5 + 65280;
                }

                if (staticIntArray88[i_9] == 10) {
                    i_17 = 150 - staticIntArray99[i_9];
                    if (i_17 < 50)
                        i_16 = i_17 * 5 + 16711680;
                    else if (i_17 < 100)
                        i_16 = 16711935 - (i_17 - 50) * 327680;
                    else if (i_17 < 150)
                        i_16 = 255 + (i_17 - 100) * 327680 - (i_17 - 100) * 5;
                }

                if (staticIntArray88[i_9] == 11) {
                    i_17 = 150 - staticIntArray99[i_9];
                    if (i_17 < 50)
                        i_16 = 16777215 - i_17 * 327685;
                    else if (i_17 < 100)
                        i_16 = (i_17 - 50) * 327685 + 65280;
                    else if (i_17 < 150)
                        i_16 = 16777215 - (i_17 - 100) * 327680;
                }

                if (staticIntArray89[i_9] == 0)
                    Friend.staticFontFace2.drawString(string_20, staticInt202 + i_0, staticInt208 + i_1, i_16, 0);

                if (staticIntArray89[i_9] == 1)
                    Friend.staticFontFace2.drawStringWave1(string_20, i_0 + staticInt202, i_1 + staticInt208, i_16, 0, staticInt215);

                if (staticIntArray89[i_9] == 2)
                    Friend.staticFontFace2.drawStringWave2(string_20, i_0 + staticInt202, staticInt208 + i_1, i_16, 0, staticInt215);

                if (staticIntArray89[i_9] == 3)
                    Friend.staticFontFace2.drawStringShake(string_20, i_0 + staticInt202, staticInt208 + i_1, i_16, 0, staticInt215, 150 - staticIntArray99[i_9]);

                if (staticIntArray89[i_9] == 4) {
                    i_17 = (150 - staticIntArray99[i_9]) * (Friend.staticFontFace2.stringWidth(string_20) + 100) / 150;
                    Rasterizer2D.staticMethod443(i_0 + staticInt202 - 50, i_1, staticInt202 + i_0 + 50, i_3 + i_1);
                    Friend.staticFontFace2.method664(string_20, staticInt202 + i_0 + 50 - i_17, i_1 + staticInt208, i_16, 0);
                    Rasterizer2D.staticMethod442(i_0, i_1, i_0 + i_2, i_3 + i_1);
                }

                if (staticIntArray89[i_9] == 5) {
                    i_17 = 150 - staticIntArray99[i_9];
                    int i_18 = 0;
                    if (i_17 < 25)
                        i_18 = i_17 - 25;
                    else if (i_17 > 125)
                        i_18 = i_17 - 125;

                    Rasterizer2D.staticMethod443(i_0, i_1 + staticInt208 - Friend.staticFontFace2.int674 - 1, i_0 + i_2, 5 + i_1 + staticInt208);
                    Friend.staticFontFace2.drawString(string_20, i_0 + staticInt202, i_18 + i_1 + staticInt208, i_16, 0);
                    Rasterizer2D.staticMethod442(i_0, i_1, i_0 + i_2, i_3 + i_1);
                }
            } else
                Friend.staticFontFace2.drawString(string_20, staticInt202 + i_0, i_1 + staticInt208, 16776960, 0);
        }

    }

    static final void staticMethod289() {
        staticInt291 = 0;
        int i_1 = (BufferWrapper.staticPlayer1.int626 >> 7) + DataClass10.staticInt111;
        int i_2 = Class4.staticInt53 + (BufferWrapper.staticPlayer1.int609 >> 7);
        if (i_1 >= 3053 && i_1 <= 3156 && i_2 >= 3056 && i_2 <= 3136)
            staticInt291 = 1;

        if (i_1 >= 3072 && i_1 <= 3118 && i_2 >= 9492 && i_2 <= 9535)
            staticInt291 = 1;

        if (staticInt291 == 1 && i_1 >= 3139 && i_1 <= 3199 && i_2 >= 3008 && i_2 <= 3062)
            staticInt291 = 0;

    }

    static final void staticMethod290(int i_0, int i_1, int i_2, int i_3) {
        if (staticInt220 == 1)
            StaticClass1.staticSpriteArray1[staticInt288 / 100].method684(staticInt218 - 8, staticInt219 - 8);

        if (staticInt220 == 2)
            StaticClass1.staticSpriteArray1[4 + staticInt288 / 100].method684(staticInt218 - 8, staticInt219 - 8);

        staticMethod289();
    }

    static final void staticMethod291(Actor actor_0, int i_1) {
        staticMethod292(actor_0.int626, actor_0.int609, i_1);
    }

    static final void staticMethod292(int i_0, int i_1, int i_2) {
        if (i_0 >= 128 && i_1 >= 128 && i_0 <= 13056 && i_1 <= 13056) {
            int i_4 = staticMethod293(i_0, i_1, DataClass14.staticInt156) - i_2;
            i_0 -= StaticClass44.staticInt135;
            i_4 -= DataClass3.staticInt41;
            i_1 -= ChatLog.staticInt69;
            int i_5 = Rasterizer3D.staticIntArray156[DebugOverlay.staticInt304];
            int i_6 = Rasterizer3D.staticIntArray159[DebugOverlay.staticInt304];
            int i_7 = Rasterizer3D.staticIntArray156[StaticClass20.staticInt126];
            int i_8 = Rasterizer3D.staticIntArray159[StaticClass20.staticInt126];
            int i_9 = i_8 * i_0 + i_1 * i_7 >> 16;
            i_1 = i_8 * i_1 - i_7 * i_0 >> 16;
            i_0 = i_9;
            i_9 = i_4 * i_6 - i_1 * i_5 >> 16;
            i_1 = i_1 * i_6 + i_4 * i_5 >> 16;
            if (i_1 >= 50) {
                staticInt202 = staticInt286 / 2 + i_0 * staticInt196 / i_1;
                staticInt208 = staticInt292 / 2 + i_9 * staticInt196 / i_1;
            } else {
                staticInt202 = -1;
                staticInt208 = -1;
            }

        } else {
            staticInt202 = -1;
            staticInt208 = -1;
        }
    }

    static final int staticMethod293(int i_0, int i_1, int i_2) {
        int i_4 = i_0 >> 7;
        int i_5 = i_1 >> 7;
        if (i_4 >= 0 && i_5 >= 0 && i_4 <= 103 && i_5 <= 103) {
            int i_6 = i_2;
            if (i_2 < 3 && (StaticClass3.staticByteArrayArrayArray1[1][i_4][i_5] & 0x2) == 2)
                i_6 = i_2 + 1;

            int i_7 = i_0 & 0x7f;
            int i_8 = i_1 & 0x7f;
            int i_9 = StaticClass3.staticIntArrayArrayArray1[i_6][i_4 + 1][i_5] * i_7 + StaticClass3.staticIntArrayArrayArray1[i_6][i_4][i_5] * (128 - i_7) >> 7;
            int i_10 = i_7 * StaticClass3.staticIntArrayArrayArray1[i_6][i_4 + 1][i_5 + 1] + (128 - i_7) * StaticClass3.staticIntArrayArrayArray1[i_6][i_4][i_5 + 1] >> 7;
            return i_9 * (128 - i_8) + i_8 * i_10 >> 7;
        } else
            return 0;
    }

    static final void staticMethod294(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5) {
        int i_7 = 2048 - i_3 & 0x7ff;
        int i_8 = 2048 - i_4 & 0x7ff;
        int i_9 = 0;
        int i_10 = 0;
        int i_11 = i_5;
        int i_12;
        int i_13;
        int i_14;
        if (i_7 != 0) {
            i_12 = Rasterizer3D.staticIntArray156[i_7];
            i_13 = Rasterizer3D.staticIntArray159[i_7];
            i_14 = i_13 * i_10 - i_5 * i_12 >> 16;
            i_11 = i_12 * i_10 + i_5 * i_13 >> 16;
            i_10 = i_14;
        }

        if (i_8 != 0) {
            i_12 = Rasterizer3D.staticIntArray156[i_8];
            i_13 = Rasterizer3D.staticIntArray159[i_8];
            i_14 = i_13 * i_9 + i_11 * i_12 >> 16;
            i_11 = i_13 * i_11 - i_9 * i_12 >> 16;
            i_9 = i_14;
        }

        StaticClass44.staticInt135 = i_0 - i_9;
        DataClass3.staticInt41 = i_1 - i_10;
        ChatLog.staticInt69 = i_2 - i_11;
        DebugOverlay.staticInt304 = i_3;
        StaticClass20.staticInt126 = i_4;
    }

    static final void staticMethod295(boolean bool_0) {
        staticBool30 = bool_0;
        int i_2;
        int i_4;
        int i_5;
        int i_6;
        int i_7;
        int i_8;
        if (!staticBool30) {
            i_2 = staticPacket3.readUShortLEA();
            int i_3 = staticPacket3.readUShortA();
            i_4 = staticPacket3.readUShort();
            StaticClass2.staticIntArrayArray1 = new int[i_4][4];

            for (i_5 = 0; i_5 < i_4; i_5++)
                for (i_6 = 0; i_6 < 4; i_6++)
                    StaticClass2.staticIntArrayArray1[i_5][i_6] = staticPacket3.readInt();

            HitMark.staticIntArray78 = new int[i_4];
            BuildType.staticIntArray69 = new int[i_4];
            staticIntArray83 = new int[i_4];
            StaticClass2.staticByteArrayArray1 = new byte[i_4][];
            ExchangeOfferComparator6.staticByteArrayArray5 = new byte[i_4][];
            boolean bool_16 = false;
            if ((i_2 / 8 == 48 || i_2 / 8 == 49) && i_3 / 8 == 48)
                bool_16 = true;

            if (i_2 / 8 == 48 && i_3 / 8 == 148)
                bool_16 = true;

            i_4 = 0;

            for (i_6 = (i_2 - 6) / 8; i_6 <= (i_2 + 6) / 8; i_6++)
                for (i_7 = (i_3 - 6) / 8; i_7 <= (i_3 + 6) / 8; i_7++) {
                    i_8 = i_7 + (i_6 << 8);
                    if (!bool_16 || i_7 != 49 && i_7 != 149 && i_7 != 147 && i_6 != 50 && (i_6 != 49 || i_7 != 47)) {
                        HitMark.staticIntArray78[i_4] = i_8;
                        BuildType.staticIntArray69[i_4] = StaticClass43.staticJs5IndexImpl10.indexOf("m" + i_6 + "_" + i_7);
                        staticIntArray83[i_4] = StaticClass43.staticJs5IndexImpl10.indexOf("l" + i_6 + "_" + i_7);
                        ++i_4;
                    }
                }

            staticMethod296(i_2, i_3, true);
        } else {
            i_2 = staticPacket3.readUShortLEA();
            boolean bool_15 = staticPacket3.readUByteN() == 1;
            i_4 = staticPacket3.readUShort();
            i_5 = staticPacket3.readUShort();
            staticPacket3.initBitAccess();

            int i_9;
            for (i_6 = 0; i_6 < 4; i_6++)
                for (i_7 = 0; i_7 < 13; i_7++)
                    for (i_8 = 0; i_8 < 13; i_8++) {
                        i_9 = staticPacket3.readBits(1);
                        if (i_9 == 1)
                            staticIntArrayArrayArray3[i_6][i_7][i_8] = staticPacket3.readBits(26);
                        else
                            staticIntArrayArrayArray3[i_6][i_7][i_8] = -1;
                    }

            staticPacket3.finishBitAccess();
            StaticClass2.staticIntArrayArray1 = new int[i_5][4];

            for (i_6 = 0; i_6 < i_5; i_6++)
                for (i_7 = 0; i_7 < 4; i_7++)
                    StaticClass2.staticIntArrayArray1[i_6][i_7] = staticPacket3.readInt();

            HitMark.staticIntArray78 = new int[i_5];
            BuildType.staticIntArray69 = new int[i_5];
            staticIntArray83 = new int[i_5];
            StaticClass2.staticByteArrayArray1 = new byte[i_5][];
            ExchangeOfferComparator6.staticByteArrayArray5 = new byte[i_5][];
            i_5 = 0;

            for (i_6 = 0; i_6 < 4; i_6++)
                for (i_7 = 0; i_7 < 13; i_7++)
                    for (i_8 = 0; i_8 < 13; i_8++) {
                        i_9 = staticIntArrayArrayArray3[i_6][i_7][i_8];
                        if (i_9 != -1) {
                            int i_10 = i_9 >> 14 & 0x3ff;
                            int i_11 = i_9 >> 3 & 0x7ff;
                            int i_12 = i_11 / 8 + (i_10 / 8 << 8);

                            int i_13;
                            for (i_13 = 0; i_13 < i_5; i_13++)
                                if (HitMark.staticIntArray78[i_13] == i_12) {
                                    i_12 = -1;
                                    break;
                                }

                            if (i_12 != -1) {
                                HitMark.staticIntArray78[i_5] = i_12;
                                i_13 = i_12 >> 8 & 0xff;
                                int i_14 = i_12 & 0xff;
                                BuildType.staticIntArray69[i_5] = StaticClass43.staticJs5IndexImpl10.indexOf("m" + i_13 + "_" + i_14);
                                staticIntArray83[i_5] = StaticClass43.staticJs5IndexImpl10.indexOf("l" + i_13 + "_" + i_14);
                                ++i_5;
                            }
                        }
                    }

            staticMethod296(i_4, i_2, !bool_15);
        }

    }

    static final void staticMethod296(int i_0, int i_1, boolean bool_2) {
        if (!bool_2 || WM7.staticInt13 != i_0 || TaskManager.staticInt118 != i_1) {
            WM7.staticInt13 = i_0;
            TaskManager.staticInt118 = i_1;
            staticMethod253(25);
            staticMethod278("Loading - please wait.", true);
            int i_4 = DataClass10.staticInt111;
            int i_5 = Class4.staticInt53;
            DataClass10.staticInt111 = (i_0 - 6) * 8;
            Class4.staticInt53 = (i_1 - 6) * 8;
            int i_6 = DataClass10.staticInt111 - i_4;
            int i_7 = Class4.staticInt53 - i_5;
            i_4 = DataClass10.staticInt111;
            i_5 = Class4.staticInt53;

            int i_8;
            int i_10;
            for (i_8 = 0; i_8 < 32768; i_8++) {
                Npc npc_9 = staticNpcArray1[i_8];
                if (npc_9 != null) {
                    for (i_10 = 0; i_10 < 10; i_10++) {
                        npc_9.intArray103[i_10] -= i_6;
                        npc_9.intArray104[i_10] -= i_7;
                    }

                    npc_9.int626 -= i_6 * 128;
                    npc_9.int609 -= i_7 * 128;
                }
            }

            for (i_8 = 0; i_8 < 2048; i_8++) {
                Player player_20 = players[i_8];
                if (player_20 != null) {
                    for (i_10 = 0; i_10 < 10; i_10++) {
                        player_20.intArray103[i_10] -= i_6;
                        player_20.intArray104[i_10] -= i_7;
                    }

                    player_20.int626 -= i_6 * 128;
                    player_20.int609 -= i_7 * 128;
                }
            }

            byte b_19 = 0;
            byte b_21 = 104;
            byte b_22 = 1;
            if (i_6 < 0) {
                b_19 = 103;
                b_21 = -1;
                b_22 = -1;
            }

            byte b_11 = 0;
            byte b_12 = 104;
            byte b_13 = 1;
            if (i_7 < 0) {
                b_11 = 103;
                b_12 = -1;
                b_13 = -1;
            }

            int i_15;
            for (int i_14 = b_19; i_14 != b_21; i_14 += b_22)
                for (i_15 = b_11; i_15 != b_12; i_15 += b_13) {
                    int i_16 = i_14 + i_6;
                    int i_17 = i_7 + i_15;

                    for (int i_18 = 0; i_18 < 4; i_18++)
                        if (i_16 >= 0 && i_17 >= 0 && i_16 < 104 && i_17 < 104)
                            staticDequeArrayArrayArray1[i_18][i_14][i_15] = staticDequeArrayArrayArray1[i_18][i_16][i_17];
                        else
                            staticDequeArrayArrayArray1[i_18][i_14][i_15] = null;
                }

            for (NodeSub2 nodesub2_23 = (NodeSub2) staticDeque4.method257(); nodesub2_23 != null; nodesub2_23 = (NodeSub2) staticDeque4.method259()) {
                nodesub2_23.int332 -= i_6;
                nodesub2_23.int326 -= i_7;
                if (nodesub2_23.int332 < 0 || nodesub2_23.int326 < 0 || nodesub2_23.int332 >= 104 || nodesub2_23.int326 >= 104)
                    nodesub2_23.unlink();
            }

            if (staticInt179 != 0) {
                staticInt179 -= i_6;
                staticInt281 -= i_7;
            }

            staticInt285 = 0;
            staticBool45 = false;
            staticInt279 = 1;
            staticDeque6.method252();
            staticDeque5.method252();

            for (i_15 = 0; i_15 < 4; i_15++)
                staticCollisionMapArray1[i_15].init();

        }
    }

    static final void staticMethod297(boolean bool_0) {
        staticMethod263();
        ++staticInt268;
        if (staticInt268 >= 50 || bool_0) {
            staticInt268 = 0;
            if (!staticBool42 && StaticClass54.staticConnection4 != null) {
                staticPacket1.writeOpcode(40);

                try {
                    StaticClass54.staticConnection4.write(staticPacket1.buf, 0, staticPacket1.off);
                    staticPacket1.off = 0;
                } catch (IOException ioexception_3) {
                    staticBool42 = true;
                }
            }

        }
    }

    static final void staticMethod298(int i_0, int i_1, int i_2, int i_3, int i_4) {
        int i_6 = LegacyClickboxDebug.staticScene1.method205(i_0, i_1, i_2);
        int i_7;
        int i_8;
        int i_9;
        int i_10;
        int i_12;
        int i_13;
        if (i_6 != 0) {
            i_7 = LegacyClickboxDebug.staticScene1.method209(i_0, i_1, i_2, i_6);
            i_8 = i_7 >> 6 & 0x3;
            i_9 = i_7 & 0x1f;
            i_10 = i_3;
            if (i_6 > 0)
                i_10 = i_4;

            int[] ints_11 = WMEnum6.staticSprite4.pixels;
            i_12 = 24624 + i_1 * 4 + (103 - i_2) * 2048;
            i_13 = i_6 >> 14 & 0x7fff;
            LocType loctype_14 = LocType.staticMethod411(i_13);
            if (loctype_14.int517 != -1) {
                IndexedSprite indexedsprite_15 = WorldMapLoadingProgress.staticIndexedSpriteArray8[loctype_14.int517];
                if (indexedsprite_15 != null) {
                    int i_16 = (loctype_14.int518 * 4 - indexedsprite_15.width) / 2;
                    int i_17 = (loctype_14.int519 * 4 - indexedsprite_15.height) / 2;
                    indexedsprite_15.method673(48 + i_1 * 4 + i_16, i_17 + 48 + (104 - i_2 - loctype_14.int519) * 4);
                }
            } else {
                if (i_9 == 0 || i_9 == 2)
                    if (i_8 == 0) {
                        ints_11[i_12] = i_10;
                        ints_11[i_12 + 512] = i_10;
                        ints_11[i_12 + 1024] = i_10;
                        ints_11[i_12 + 1536] = i_10;
                    } else if (i_8 == 1) {
                        ints_11[i_12] = i_10;
                        ints_11[i_12 + 1] = i_10;
                        ints_11[i_12 + 2] = i_10;
                        ints_11[i_12 + 3] = i_10;
                    } else if (i_8 == 2) {
                        ints_11[i_12 + 3] = i_10;
                        ints_11[512 + i_12 + 3] = i_10;
                        ints_11[i_12 + 3 + 1024] = i_10;
                        ints_11[1536 + i_12 + 3] = i_10;
                    } else if (i_8 == 3) {
                        ints_11[i_12 + 1536] = i_10;
                        ints_11[i_12 + 1536 + 1] = i_10;
                        ints_11[i_12 + 1536 + 2] = i_10;
                        ints_11[3 + i_12 + 1536] = i_10;
                    }

                if (i_9 == 3)
                    if (i_8 == 0)
                        ints_11[i_12] = i_10;
                    else if (i_8 == 1)
                        ints_11[i_12 + 3] = i_10;
                    else if (i_8 == 2)
                        ints_11[i_12 + 3 + 1536] = i_10;
                    else if (i_8 == 3)
                        ints_11[i_12 + 1536] = i_10;

                if (i_9 == 2)
                    if (i_8 == 3) {
                        ints_11[i_12] = i_10;
                        ints_11[i_12 + 512] = i_10;
                        ints_11[i_12 + 1024] = i_10;
                        ints_11[i_12 + 1536] = i_10;
                    } else if (i_8 == 0) {
                        ints_11[i_12] = i_10;
                        ints_11[i_12 + 1] = i_10;
                        ints_11[i_12 + 2] = i_10;
                        ints_11[i_12 + 3] = i_10;
                    } else if (i_8 == 1) {
                        ints_11[i_12 + 3] = i_10;
                        ints_11[512 + i_12 + 3] = i_10;
                        ints_11[1024 + i_12 + 3] = i_10;
                        ints_11[1536 + i_12 + 3] = i_10;
                    } else if (i_8 == 2) {
                        ints_11[i_12 + 1536] = i_10;
                        ints_11[i_12 + 1536 + 1] = i_10;
                        ints_11[2 + i_12 + 1536] = i_10;
                        ints_11[i_12 + 1536 + 3] = i_10;
                    }
            }
        }

        i_6 = LegacyClickboxDebug.staticScene1.method207(i_0, i_1, i_2);
        if (i_6 != 0) {
            i_7 = LegacyClickboxDebug.staticScene1.method209(i_0, i_1, i_2, i_6);
            i_8 = i_7 >> 6 & 0x3;
            i_9 = i_7 & 0x1f;
            i_10 = i_6 >> 14 & 0x7fff;
            LocType loctype_20 = LocType.staticMethod411(i_10);
            int i_24;
            if (loctype_20.int517 != -1) {
                IndexedSprite indexedsprite_22 = WorldMapLoadingProgress.staticIndexedSpriteArray8[loctype_20.int517];
                if (indexedsprite_22 != null) {
                    i_13 = (loctype_20.int518 * 4 - indexedsprite_22.width) / 2;
                    i_24 = (loctype_20.int519 * 4 - indexedsprite_22.height) / 2;
                    indexedsprite_22.method673(i_1 * 4 + 48 + i_13, (104 - i_2 - loctype_20.int519) * 4 + 48 + i_24);
                }
            } else if (i_9 == 9) {
                i_12 = 15658734;
                if (i_6 > 0)
                    i_12 = 15597568;

                int[] ints_23 = WMEnum6.staticSprite4.pixels;
                i_24 = 24624 + i_1 * 4 + (103 - i_2) * 2048;
                if (i_8 != 0 && i_8 != 2) {
                    ints_23[i_24] = i_12;
                    ints_23[i_24 + 512 + 1] = i_12;
                    ints_23[i_24 + 1024 + 2] = i_12;
                    ints_23[i_24 + 1536 + 3] = i_12;
                } else {
                    ints_23[i_24 + 1536] = i_12;
                    ints_23[1 + i_24 + 1024] = i_12;
                    ints_23[2 + i_24 + 512] = i_12;
                    ints_23[i_24 + 3] = i_12;
                }
            }
        }

        i_6 = LegacyClickboxDebug.staticScene1.method208(i_0, i_1, i_2);
        if (i_6 != 0) {
            i_7 = i_6 >> 14 & 0x7fff;
            LocType loctype_18 = LocType.staticMethod411(i_7);
            if (loctype_18.int517 != -1) {
                IndexedSprite indexedsprite_19 = WorldMapLoadingProgress.staticIndexedSpriteArray8[loctype_18.int517];
                if (indexedsprite_19 != null) {
                    i_10 = (loctype_18.int518 * 4 - indexedsprite_19.width) / 2;
                    int i_21 = (loctype_18.int519 * 4 - indexedsprite_19.height) / 2;
                    indexedsprite_19.method673(i_10 + i_1 * 4 + 48, i_21 + (104 - i_2 - loctype_18.int519) * 4 + 48);
                }
            }
        }

    }

    // read packets
    final boolean method403() {
        if (StaticClass54.staticConnection4 == null)
            return false;
        else {
            String string_3;
            int i_4;
            try {
                int i_2 = StaticClass54.staticConnection4.available();
                if (i_2 == 0)
                    return false;

                if (staticInt189 == -1) {
                    StaticClass54.staticConnection4.read(staticPacket3.buf, 0, 1);
                    staticPacket3.off = 0;
                    staticInt189 = staticPacket3.readOpcode();
                    staticInt287 = StaticClass49.staticIntArray71[staticInt189];
                    --i_2;
                }

                if (staticInt287 == -1) {
                    if (i_2 <= 0)
                        return false;

                    StaticClass54.staticConnection4.read(staticPacket3.buf, 0, 1);
                    staticInt287 = staticPacket3.buf[0] & 0xff;
                    --i_2;
                }

                if (staticInt287 == -2) {

                    if (i_2 <= 1)
                        return false;

                    StaticClass54.staticConnection4.read(staticPacket3.buf, 0, 2);
                    staticPacket3.off = 0;
                    staticInt287 = staticPacket3.readUShort();
                    i_2 -= 2;
                }

                if (i_2 < staticInt287)
                    return false;

                staticPacket3.off = 0;
                StaticClass54.staticConnection4.read(staticPacket3.buf, 0, staticInt287);
                staticClass10_1.method317();
                staticInt190 = 0;
                staticInt255 = staticInt193;
                staticInt193 = -staticInt192;
                staticInt192 = -staticInt189;
                int i_33;
                String string_36;

                // player options
                if (staticInt189 == 117) {
                    i_33 = staticPacket3.readUByteS();
                    i_4 = staticPacket3.readUByteN();
                    string_36 = staticPacket3.method448();
                    if (i_4 >= 1 && i_4 <= 8) {
                        if (string_36.equalsIgnoreCase("null"))
                            string_36 = null;

                        staticStringArray7[i_4 - 1] = string_36;
                        staticBoolArray6[i_4 - 1] = i_33 == 0;
                    }

                    staticInt189 = -1;
                    return true;
                }

                Widget widget_5;
                String string_38;

                // interface text
                if (staticInt189 == 42) {
                    int packed = staticPacket3.readInt();
                    String message = staticPacket3.method448();
                    widget_5 = Widget.staticMethod381(packed);
                    if (!message.equals(widget_5.string25)) {
                        widget_5.string25 = message;
                        staticMethod342(widget_5);
                    }

                    System.out.println(String.format("setInterfaceText(%d, %d, %s)", packed >> 16, packed & 0xFF, message));

                    staticInt189 = -1;
                    return true;
                }

                if (staticInt189 == 126) {
                    Actor.staticInt318 = staticPacket3.readUByteA();
                    WorldMapTile.staticInt5 = staticPacket3.readUByteA();

                    for (i_33 = WorldMapTile.staticInt5; i_33 < WorldMapTile.staticInt5 + 8; i_33++)
                        for (i_4 = Actor.staticInt318; i_4 < 8 + Actor.staticInt318; i_4++)
                            if (staticDequeArrayArrayArray1[DataClass14.staticInt156][i_33][i_4] != null) {
                                staticDequeArrayArrayArray1[DataClass14.staticInt156][i_33][i_4] = null;
                                staticMethod304(i_33, i_4);
                            }

                    for (NodeSub2 nodesub2_109 = (NodeSub2) staticDeque4.method257(); nodesub2_109 != null; nodesub2_109 = (NodeSub2) staticDeque4.method259())
                        if (nodesub2_109.int332 >= WorldMapTile.staticInt5 && nodesub2_109.int332 < WorldMapTile.staticInt5 + 8 && nodesub2_109.int326 >= Actor.staticInt318 && nodesub2_109.int326 < 8 + Actor.staticInt318 && nodesub2_109.int330 == DataClass14.staticInt156)
                            nodesub2_109.int333 = 0;

                    staticInt189 = -1;
                    return true;
                }

                int i_35;
                int i_52;
                NodeSub1 nodesub1_75;

                // set interface
                if (staticInt189 == 127) {
                    i_33 = staticPacket3.readUByteS();
                    i_4 = staticPacket3.readUShortLE();
                    i_35 = staticPacket3.readIntIM();

                    System.out.println(String.format("setInterface(%d, %d, %d, %b)", i_35 >> 16, i_35 & 0xFF, i_4, i_33 == 1));

                    nodesub1_75 = (NodeSub1) staticHashTable7.get(i_35);
                    if (nodesub1_75 != null)
                        staticMethod350(nodesub1_75, nodesub1_75.int317 != i_4);

                    NodeSub1 nodesub1_103 = new NodeSub1();
                    nodesub1_103.int317 = i_4;
                    nodesub1_103.int318 = i_33;
                    staticHashTable7.put(nodesub1_103, i_35);
                    staticMethod346(i_4);
                    Widget widget_95 = Widget.staticMethod381(i_35);
                    staticMethod342(widget_95);
                    if (staticWidget11 != null) {
                        staticMethod342(staticWidget11);
                        staticWidget11 = null;
                    }

                    staticMethod319();
                    staticMethod328(StaticClass25.staticWidgetArrayArray1[i_35 >> 16], widget_95, false);
                    StaticClass15.staticMethod101(i_4);
                    if (staticInt241 != -1) {
                        i_52 = staticInt241;
                        if (Widget.staticMethod383(i_52))
                            staticMethod339(StaticClass25.staticWidgetArrayArray1[i_52], 1);
                    }

                    staticInt189 = -1;
                    return true;
                }

                // force logout
                if (staticInt189 == 28) {
                    staticMethod259();
                    staticInt189 = -1;
                    return false;
                }

                // TODO find
                if (staticInt189 == 254) {
                    i_33 = staticPacket3.readIntME();
                    i_4 = staticPacket3.method479();
                    widget_5 = Widget.staticMethod381(i_33);
                    if (i_4 != widget_5.int391 || i_4 == -1) {
                        widget_5.int391 = i_4;
                        widget_5.int452 = 0;
                        widget_5.int455 = 0;
                        staticMethod342(widget_5);
                    }
                    staticInt189 = -1;
                    return true;
                }

                // static region
                if (staticInt189 == 150) {

                    System.out.println("recieved static region!!!");


                    staticMethod295(false);
                    staticPacket3.readOpcode();
                    i_33 = staticPacket3.readUShort();

                    StaticClass10.updatePlayers(staticPacket3, i_33);
                    staticInt189 = -1;
                    return true;
                }

                // TODO find
                if (staticInt189 == 88) {
                    staticInt179 = staticPacket3.readUByte();
                    if (staticInt179 == 255)
                        staticInt179 = 0;

                    staticInt281 = staticPacket3.readUByte();
                    if (staticInt281 == 255)
                        staticInt281 = 0;

                    staticInt189 = -1;
                    return true;
                }

                // root interface
                if (staticInt189 == 30) {
                    int rootInterfaceId = staticPacket3.readUShort();
                    staticInt241 = rootInterfaceId;
                    method407(false);
                    staticMethod346(rootInterfaceId);
                    StaticClass15.staticMethod101(staticInt241);

                    for (i_4 = 0; i_4 < 100; i_4++)
                        staticBoolArray7[i_4] = true;

                    System.out.println(String.format("setRootInterface(%d)", rootInterfaceId));

                    staticInt189 = -1;
                    return true;
                }

                // dynamic region
                if (staticInt189 == 148) {
                    staticMethod295(true);
                    staticPacket3.readOpcode();
                    i_33 = staticPacket3.readUShort();
                    StaticClass10.updatePlayers(staticPacket3, i_33);
                    staticInt189 = -1;
                    return true;
                }

                String string_37;
                int i_42;
                boolean bool_49;

                // something to do with ignores, rename ignores??
                if (staticInt189 == 86) {
                    while (staticPacket3.off < staticInt287) {
                        i_33 = staticPacket3.readUByte();
                        bool_49 = (i_33 & 0x1) == 1;
                        string_36 = staticPacket3.method448();
                        string_37 = staticPacket3.method448();
                        staticPacket3.method448();

                        for (i_42 = 0; i_42 < staticInt295; i_42++) {
                            Ignore ignore_93 = staticIgnoreArray1[i_42];
                            if (bool_49) {
                                if (string_37.equals(ignore_93.string4)) {
                                    ignore_93.string4 = string_36;
                                    ignore_93.string5 = string_37;
                                    string_36 = null;
                                    break;
                                }
                            } else if (string_36.equals(ignore_93.string4)) {
                                ignore_93.string4 = string_36;
                                ignore_93.string5 = string_37;
                                string_36 = null;
                                break;
                            }
                        }

                        if (string_36 != null && staticInt295 < 400) {
                            Ignore ignore_100 = new Ignore();
                            staticIgnoreArray1[staticInt295] = ignore_100;
                            ignore_100.string4 = string_36;
                            ignore_100.string5 = string_37;
                            ++staticInt295;
                        }
                    }

                    staticInt260 = staticInt256;
                    staticInt189 = -1;
                    return true;
                }

                Widget widget_6;
                if (staticInt189 == 188) {
                    i_33 = staticPacket3.method479();
                    i_4 = staticPacket3.readIntME();
                    i_35 = staticPacket3.readShort();
                    widget_6 = Widget.staticMethod381(i_4);
                    if (i_35 != widget_6.int401 || widget_6.int402 != i_33 || widget_6.int390 != 0 || widget_6.int398 != 0) {
                        widget_6.int401 = i_35;
                        widget_6.int402 = i_33;
                        widget_6.int390 = 0;
                        widget_6.int398 = 0;
                        staticMethod342(widget_6);
                        method408(widget_6);
                        if (widget_6.type == 0)
                            staticMethod328(StaticClass25.staticWidgetArrayArray1[i_4 >> 16], widget_6, false);
                    }

                    staticInt189 = -1;
                    return true;
                }

                int i_45;
                if (staticInt189 == 33) {
                    staticMethod343();
                    i_33 = staticPacket3.readUByte();
                    i_4 = staticPacket3.readUByte();
                    i_35 = staticPacket3.readIntIM();
                    staticIntArray96[i_4] = i_35;
                    staticIntArray84[i_4] = i_33;
                    staticIntArray95[i_4] = 1;

                    for (i_45 = 0; i_45 < 98; i_45++)
                        if (i_35 >= StaticClass38.staticIntArray64[i_45])
                            staticIntArray95[i_4] = i_45 + 2;

                    staticIntArray111[staticInt259++ & 0x1f] = i_4;
                    staticInt189 = -1;
                    return true;
                }

                long long_50;

                // interface settings
                if (staticInt189 == 72) {
                    i_33 = staticPacket3.readUShortA(); // from slot
                    if (i_33 == 65535)
                        i_33 = -1;

                    i_4 = staticPacket3.readIntIM(); // setting
                    i_35 = staticPacket3.readInt(); // packed
                    i_45 = staticPacket3.readUShortA(); // to slot
                    if (i_45 == 65535)
                        i_45 = -1;

                    final int root = i_35 >> 16;
                    final int component = i_35 & 0xFF;

                    System.out.println(String.format("setInterfaceSettings(%d, %d, %d, %d, %d)", root, component, i_33, i_45, i_4));

                    for (i_42 = i_33; i_42 <= i_45; i_42++) {
                        long_50 = i_42 + ((long) i_35 << 32);
                        Node node_81 = staticHashTable6.get(long_50);
                        if (node_81 != null)
                            node_81.unlink();

                        staticHashTable6.put(new IntProperty(i_4), long_50);
                    }

                    staticInt189 = -1;
                    return true;
                }

                if (staticInt189 == 97) {
                    i_33 = staticPacket3.readUByte();
                    if (staticPacket3.readUByte() == 0) {
                        staticExchangeOfferArray1[i_33] = new ExchangeOffer();
                        staticPacket3.off += 18;
                    } else {
                        --staticPacket3.off;
                        staticExchangeOfferArray1[i_33] = new ExchangeOffer(staticPacket3, false);
                    }

                    staticInt262 = staticInt256;
                    staticInt189 = -1;
                    return true;
                }

                if (staticInt189 == 24) {
                    i_33 = staticPacket3.readInt();
                    i_4 = staticPacket3.readUShort();
                    widget_5 = Widget.staticMethod381(i_33);
                    if (widget_5 != null && widget_5.type == 0) {
                        if (i_4 > widget_5.int411 - widget_5.int407)
                            i_4 = widget_5.int411 - widget_5.int407;

                        if (i_4 < 0)
                            i_4 = 0;

                        if (i_4 != widget_5.int451) {
                            widget_5.int451 = i_4;
                            staticMethod342(widget_5);
                        }
                    }

                    staticInt189 = -1;
                    return true;
                }

                // npc updating
                if (staticInt189 == 108) {
                    staticMethod305(true);
                    staticInt189 = -1;
                    return true;
                }

                if (staticInt189 == 109) {
                    Actor.staticInt318 = staticPacket3.readUByte();
                    WorldMapTile.staticInt5 = staticPacket3.readUByte();


                    staticInt189 = -1;
                    return true;
                }

                if (staticInt189 == 159) {
                    staticInt275 = staticPacket3.readUByte();
                    staticInt217 = staticPacket3.readUByte();
                    System.out.println(String.format(".setCamera(%d, %d)", staticInt275, staticInt217));
                    staticInt189 = -1;
                    return true;
                }

                // weight
                if (staticInt189 == 249) {
                    staticMethod343();
                    staticInt245 = staticPacket3.readShort();
                    staticInt264 = staticInt256;
                    staticInt189 = -1;
                    return true;
                }

                if (staticInt189 == 114) {
                    staticBool45 = false;

                    for (i_33 = 0; i_33 < 5; i_33++)
                        staticBoolArray9[i_33] = false;

                    staticInt189 = -1;
                    return true;
                }

                if (staticInt189 == 76) {
                    staticMethod305(false);
                    staticInt189 = -1;
                    return true;
                }

                Widget widget_66;
                if (staticInt189 == 27) {
                    i_33 = staticPacket3.readInt();
                    i_4 = staticPacket3.readUShortLE();
                    i_35 = staticPacket3.readUShort();
                    i_45 = staticPacket3.readUShort();
                    widget_66 = Widget.staticMethod381(i_33);
                    if (i_35 != widget_66.int429 || i_4 != widget_66.int430 || i_45 != widget_66.int397) {
                        widget_66.int429 = i_35;
                        widget_66.int430 = i_4;
                        widget_66.int397 = i_45;
                        staticMethod342(widget_66);
                    }

                    staticInt189 = -1;
                    return true;
                }

                if (staticInt189 == 70) {
                    i_33 = staticPacket3.readUByte();
                    i_4 = staticPacket3.readUByte();
                    i_35 = staticPacket3.readUByte();
                    i_45 = staticPacket3.readUByte();
                    staticBoolArray9[i_33] = true;
                    staticIntArray116[i_33] = i_4;
                    staticIntArray98[i_33] = i_35;
                    staticIntArray117[i_33] = i_45;
                    staticIntArray118[i_33] = 0;
                    staticInt189 = -1;
                    return true;
                }

                if (staticInt189 == 222) {
                    i_33 = staticPacket3.readUShortA();
                    i_33 = -1;
                    if (i_33 == 65535)
                        i_33 = -1;

                    if (i_33 == -1 && !staticBool43)
                        StaticClass32.staticMethod166();
                    else if (i_33 != -1 && staticInt248 != i_33 && staticInt197 != 0 && !staticBool43) {
                        Js5IndexImpl js5indeximpl_108 = StaticClass54.staticJs5IndexImpl11;
                        i_35 = staticInt197;
                        StaticClass32.staticInt133 = 1;
                        StaticClass32.staticJs5Index6 = js5indeximpl_108;
                        StaticClass32.staticInt132 = i_33;
                        AnimFrame.staticInt306 = 0;
                        WorldMap.staticInt109 = i_35;
                        GraphicsBuffer.staticBool23 = false;
                        WorldMapLoadingProgress.staticInt150 = 2;
                    }

                    staticInt248 = i_33;
                    staticInt189 = -1;
                    return true;
                }

                // play song
                if (staticInt189 == 90) {
                    int songId = staticPacket3.readUShortA();

                    if (songId == 65535) {
                        songId = -1;
                    }

                    i_4 = staticPacket3.readU24Int();

                    if (staticInt197 != 0 && songId != -1) {
                        StaticClass32.staticMethod164(Renderable.staticJs5IndexImpl15, songId, 0, staticInt197, false);
                        staticBool43 = true;
                    }

                    System.out.println(String.format("playSong(%d)", songId));

                    staticInt189 = -1;
                    return true;
                }

                // varp small
                if (staticInt189 == 185) {
                    byte state = staticPacket3.method472();
                    int id = staticPacket3.readUShortLEA();
                    StaticClass44.staticIntArray66[id] = state;
                    if (StaticClass44.staticIntArray68[id] != state) {
                        StaticClass44.staticIntArray68[id] = state;
                    }

                    System.out.println(String.format("setVarp(%d, %d)", id, state));

                    staticMethod348(id);
                    staticIntArray103[staticInt257++ & 0x1f] = id;
                    staticInt189 = -1;
                    return true;
                }

                if (staticInt189 == 219) {
                    for (i_33 = 0; i_33 < players.length; i_33++)
                        if (players[i_33] != null)
                            players[i_33].anim = -1;

                    for (i_33 = 0; i_33 < staticNpcArray1.length; i_33++)
                        if (staticNpcArray1[i_33] != null)
                            staticNpcArray1[i_33].anim = -1;

                    staticInt189 = -1;
                    return true;
                }

                if (staticInt189 == 226) {
                    staticMethod343();
                    staticInt244 = staticPacket3.readUByte();
                    staticInt264 = staticInt256;
                    staticInt189 = -1;
                    return true;
                }

                String string_8;
                int i_12;
                int i_14;
                int i_15;
                int i_54;
                Packet packet_71;
                String string_73;
                if (staticInt189 == 233) {
                    packet_71 = staticPacket3;
                    i_4 = staticInt287;
                    Config34 config34_96 = new Config34();
                    config34_96.int465 = packet_71.readUByte();
                    config34_96.int464 = packet_71.readInt();
                    config34_96.intArray62 = new int[config34_96.int465];
                    config34_96.intArray61 = new int[config34_96.int465];
                    config34_96.fieldArray1 = new Field[config34_96.int465];
                    config34_96.intArray63 = new int[config34_96.int465];
                    config34_96.methodArray1 = new Method[config34_96.int465];
                    config34_96.byteArrayArrayArray4 = new byte[config34_96.int465][][];

                    for (i_45 = 0; i_45 < config34_96.int465; i_45++)
                        try {
                            i_42 = packet_71.readUByte();
                            String string_97;
                            if (i_42 != 0 && i_42 != 1 && i_42 != 2) {
                                if (i_42 == 3 || i_42 == 4) {
                                    string_8 = packet_71.method448();
                                    string_97 = packet_71.method448();
                                    i_54 = packet_71.readUByte();
                                    String[] arr_91 = new String[i_54];

                                    for (i_12 = 0; i_12 < i_54; i_12++)
                                        arr_91[i_12] = packet_71.method448();

                                    string_73 = packet_71.method448();
                                    byte[][] bytes_106 = new byte[i_54][];
                                    if (i_42 == 3)
                                        for (i_14 = 0; i_14 < i_54; i_14++) {
                                            i_15 = packet_71.readInt();
                                            bytes_106[i_14] = new byte[i_15];
                                            packet_71.method451(bytes_106[i_14], 0, i_15);
                                        }

                                    config34_96.intArray62[i_45] = i_42;
                                    Class[] arr_98 = new Class[i_54];

                                    for (i_15 = 0; i_15 < i_54; i_15++)
                                        arr_98[i_15] = StaticClass48.staticMethod205(arr_91[i_15]);

                                    Class class_101 = StaticClass48.staticMethod205(string_73);
                                    if (StaticClass48.staticMethod205(string_8).getClassLoader() == null)
                                        throw new SecurityException();

                                    Method[] arr_102 = StaticClass48.staticMethod205(string_8).getDeclaredMethods();
                                    Method[] arr_104 = arr_102;

                                    for (int i_18 = 0; i_18 < arr_104.length; i_18++) {
                                        Method method_19 = arr_104[i_18];
                                        if (method_19.getName().equals(string_97)) {
                                            Class[] arr_20 = method_19.getParameterTypes();
                                            if (arr_98.length == arr_20.length) {
                                                boolean bool_21 = true;

                                                for (int i_22 = 0; i_22 < arr_98.length; i_22++)
                                                    if (arr_20[i_22] != arr_98[i_22]) {
                                                        bool_21 = false;
                                                        break;
                                                    }

                                                if (bool_21 && class_101 == method_19.getReturnType())
                                                    config34_96.methodArray1[i_45] = method_19;
                                            }
                                        }
                                    }

                                    config34_96.byteArrayArrayArray4[i_45] = bytes_106;
                                }
                            } else {
                                string_8 = packet_71.method448();
                                string_97 = packet_71.method448();
                                i_54 = 0;
                                if (i_42 == 1)
                                    i_54 = packet_71.readInt();

                                config34_96.intArray62[i_45] = i_42;
                                config34_96.intArray63[i_45] = i_54;
                                if (StaticClass48.staticMethod205(string_8).getClassLoader() == null)
                                    throw new SecurityException();

                                config34_96.fieldArray1[i_45] = StaticClass48.staticMethod205(string_8).getDeclaredField(string_97);
                            }
                        } catch (ClassNotFoundException classnotfoundexception_26) {
                            config34_96.intArray61[i_45] = -1;
                        } catch (SecurityException securityexception_27) {
                            config34_96.intArray61[i_45] = -2;
                        } catch (NullPointerException nullpointerexception_28) {
                            config34_96.intArray61[i_45] = -3;
                        } catch (Exception exception_29) {
                            config34_96.intArray61[i_45] = -4;
                        } catch (Throwable throwable_30) {
                            config34_96.intArray61[i_45] = -5;
                        }

                    StaticClass48.staticHitMarkList2.add(config34_96);
                    staticInt189 = -1;
                    return true;
                }

                if (staticInt189 == 190) {
                    if (staticInt241 != -1) {
                        i_33 = staticInt241;
                        if (Widget.staticMethod383(i_33))
                            staticMethod339(StaticClass25.staticWidgetArrayArray1[i_33], 0);
                    }

                    staticInt189 = -1;
                    return true;
                }

                if (staticInt189 == 58) {
                    staticInt294 = 1;
                    staticInt260 = staticInt256;
                    staticInt189 = -1;
                    return true;
                }

                boolean bool_48;
                if (staticInt189 == 14) {
                    bool_48 = staticPacket3.readUByte() == 1;
                    if (bool_48) {
                        JavaxSoundSystemProvider.staticLong1 = StaticClass27.synchronizedMethod7() - staticPacket3.method445();
                        ExchangeOfferComparator2.staticClass13_1 = new Class13(staticPacket3, true);
                    } else
                        ExchangeOfferComparator2.staticClass13_1 = null;

                    staticInt263 = staticInt256;
                    staticInt189 = -1;
                    return true;
                }

                // camera packet?
                if (staticInt189 == 11) {
                    staticBool45 = true;
                    SoundBank.staticInt74 = staticPacket3.readUByte();
                    ItemContainer.staticInt160 = staticPacket3.readUByte();
                    ExchangeOfferComparator1.staticInt120 = staticPacket3.readUShort();
                    WMEnum4.staticInt136 = staticPacket3.readUByte();
                    FriendLogin.staticInt159 = staticPacket3.readUByte();
                    if (FriendLogin.staticInt159 >= 100) {
                        StaticClass44.staticInt135 = SoundBank.staticInt74 * 128 + 64;
                        ChatLog.staticInt69 = ItemContainer.staticInt160 * 128 + 64;
                        DataClass3.staticInt41 = staticMethod293(StaticClass44.staticInt135, ChatLog.staticInt69, DataClass14.staticInt156) - ExchangeOfferComparator1.staticInt120;
                    }

                    staticInt189 = -1;
                    return true;
                }

                int i_47;
                boolean bool_51;
                if (staticInt189 == 54) {
                    string_3 = staticPacket3.method448();
                    i_4 = staticPacket3.readUShort();
                    byte b_94 = staticPacket3.method440();
                    bool_51 = false;
                    if (b_94 == -128)
                        bool_51 = true;

                    if (bool_51) {
                        if (StaticClass62.staticInt158 == 0) {
                            staticInt189 = -1;
                            return true;
                        }

                        boolean bool_79 = false;

                        for (i_42 = 0; i_42 < StaticClass62.staticInt158 && (!Class1.staticClanMemberArray1[i_42].string19.equals(string_3) || i_4 != Class1.staticClanMemberArray1[i_42].int310); i_42++)
                            ;

                        if (i_42 < StaticClass62.staticInt158) {
                            while (i_42 < StaticClass62.staticInt158 - 1) {
                                Class1.staticClanMemberArray1[i_42] = Class1.staticClanMemberArray1[i_42 + 1];
                                ++i_42;
                            }

                            --StaticClass62.staticInt158;
                            Class1.staticClanMemberArray1[StaticClass62.staticInt158] = null;
                        }
                    } else {
                        staticPacket3.method448();
                        ClanMember clanmember_74 = new ClanMember();
                        clanmember_74.string19 = string_3;
                        clanmember_74.string20 = StaticClass53.staticMethod224(clanmember_74.string19, DataClass14.staticClass12_10);
                        clanmember_74.int310 = i_4;
                        clanmember_74.byte3 = b_94;

                        for (i_47 = StaticClass62.staticInt158 - 1; i_47 >= 0; --i_47) {
                            i_52 = Class1.staticClanMemberArray1[i_47].string20.compareTo(clanmember_74.string20);
                            if (i_52 == 0) {
                                Class1.staticClanMemberArray1[i_47].int310 = i_4;
                                Class1.staticClanMemberArray1[i_47].byte3 = b_94;
                                if (string_3.equals(BufferWrapper.staticPlayer1.name))
                                    DataClass7.staticByte2 = b_94;

                                staticInt261 = staticInt256;
                                staticInt189 = -1;
                                return true;
                            }

                            if (i_52 < 0)
                                break;
                        }

                        if (StaticClass62.staticInt158 >= Class1.staticClanMemberArray1.length) {
                            staticInt189 = -1;
                            return true;
                        }

                        for (i_52 = StaticClass62.staticInt158 - 1; i_52 > i_47; --i_52)
                            Class1.staticClanMemberArray1[i_52 + 1] = Class1.staticClanMemberArray1[i_52];

                        if (StaticClass62.staticInt158 == 0)
                            Class1.staticClanMemberArray1 = new ClanMember[100];

                        Class1.staticClanMemberArray1[i_47 + 1] = clanmember_74;
                        ++StaticClass62.staticInt158;
                        if (string_3.equals(BufferWrapper.staticPlayer1.name))
                            DataClass7.staticByte2 = b_94;
                    }

                    staticInt261 = staticInt256;
                    staticInt189 = -1;
                    return true;
                }

                // sound effects
                if (staticInt189 == 152) {
                    i_33 = staticPacket3.readUShort();
                    i_4 = staticPacket3.readUByte();
                    i_35 = staticPacket3.readUShort();
                    staticMethod266(i_33, i_4, i_35);
                    staticInt189 = -1;
                    return true;
                }

                // CS2 script
                if (staticInt189 == 144) {
                    string_3 = staticPacket3.method448();
                    Object[] arr_105 = new Object[string_3.length() + 1];

                    for (i_35 = string_3.length() - 1; i_35 >= 0; --i_35)
                        if (string_3.charAt(i_35) == 115)
                            arr_105[i_35 + 1] = staticPacket3.method448();
                        else
                            arr_105[i_35 + 1] = new Integer(staticPacket3.readInt());

                    arr_105[0] = new Integer(staticPacket3.readInt());

                    {
                        Object[] args = new Object[arr_105.length - 1];
                        System.arraycopy(arr_105, 1, args, 0, args.length);
                        System.out.println("cs2Script(" + arr_105[0] + ", " + Arrays.toString(args) + ", " + string_3 + ");");
                    }

                    RuneScript runescript_92 = new RuneScript();
                    runescript_92.objectArray1 = arr_105;
                    StaticClass15.staticMethod79(runescript_92);
                    staticInt189 = -1;
                    return true;
                }

                // set item on interface
                if (staticInt189 == 197) {
                    staticInt170 = staticPacket3.readUByte();
                    if (staticInt170 == 1)
                        staticInt171 = staticPacket3.readUShort();

                    if (staticInt170 >= 2 && staticInt170 <= 6) {
                        if (staticInt170 == 2) {
                            staticInt176 = 64;
                            staticInt177 = 64;
                        }

                        if (staticInt170 == 3) {
                            staticInt176 = 0;
                            staticInt177 = 64;
                        }

                        if (staticInt170 == 4) {
                            staticInt176 = 128;
                            staticInt177 = 64;
                        }

                        if (staticInt170 == 5) {
                            staticInt176 = 64;
                            staticInt177 = 0;
                        }

                        if (staticInt170 == 6) {
                            staticInt176 = 64;
                            staticInt177 = 128;
                        }

                        staticInt170 = 2;
                        staticInt214 = staticPacket3.readUShort();
                        staticInt188 = staticPacket3.readUShort();
                        staticInt175 = staticPacket3.readUByte();
                    }

                    if (staticInt170 == 10)
                        staticInt172 = staticPacket3.readUShort();

                    staticInt189 = -1;
                    return true;
                }

                Widget widget_34;
                if (staticInt189 == 2) {
                    i_33 = staticPacket3.readInt();
                    widget_34 = Widget.staticMethod381(i_33);

                    for (i_35 = 0; i_35 < widget_34.intArray57.length; i_35++) {
                        widget_34.intArray57[i_35] = -1;
                        widget_34.intArray57[i_35] = 0;
                    }

                    staticMethod342(widget_34);
                    staticInt189 = -1;
                    return true;
                }

                // varp large
                if (staticInt189 == 9) {
                    int id = staticPacket3.readUShort();
                    int state = staticPacket3.readIntME();
                    StaticClass44.staticIntArray66[id] = state;
                    if (StaticClass44.staticIntArray68[id] != state) {
                        StaticClass44.staticIntArray68[id] = state;
                    }

                    System.out.println(String.format("setVarp(%d, %d)", id, state));

                    staticMethod348(id);
                    staticIntArray103[staticInt257++ & 0x1f] = id;
                    staticInt189 = -1;
                    return true;
                }

                if (staticInt189 == 65) {
                    i_33 = staticPacket3.readInt();
                    i_4 = staticPacket3.readUShort();
                    if (i_33 < -70000)
                        i_4 += 32768;

                    if (i_33 >= 0)
                        widget_5 = Widget.staticMethod381(i_33);
                    else
                        widget_5 = null;

                    for (; staticPacket3.off < staticInt287; ItemContainer.staticMethod251(i_4, i_45, i_42 - 1, i_47)) {
                        i_45 = staticPacket3.method453();
                        i_42 = staticPacket3.readUShort();
                        i_47 = 0;
                        if (i_42 != 0) {
                            i_47 = staticPacket3.readUByte();
                            if (i_47 == 255)
                                i_47 = staticPacket3.readInt();
                        }

                        if (widget_5 != null && i_45 >= 0 && i_45 < widget_5.intArray57.length) {
                            widget_5.intArray57[i_45] = i_42;
                            widget_5.intArray59[i_45] = i_47;
                        }
                    }

                    if (widget_5 != null)
                        staticMethod342(widget_5);

                    staticMethod343();
                    staticIntArray104[staticInt258++ & 0x1f] = i_4 & 0x7fff;
                    staticInt189 = -1;
                    return true;
                }

                if (staticInt189 == 16) {
                    i_33 = staticPacket3.readInt();
                    i_4 = staticPacket3.readIntME();

                    System.out.println(String.format("setInterfaceSets(%d, %d, %d, %d)", i_33 >> 16, i_33 & 0xFF, i_4 >> 16, i_4 & 0xFF));

                    NodeSub1 nodesub1_68 = (NodeSub1) staticHashTable7.get(i_33);
                    nodesub1_75 = (NodeSub1) staticHashTable7.get(i_4);
                    if (nodesub1_75 != null)
                        staticMethod350(nodesub1_75, nodesub1_68 == null || nodesub1_68.int317 != nodesub1_75.int317);

                    if (nodesub1_68 != null) {
                        nodesub1_68.unlink();
                        staticHashTable7.put(nodesub1_68, i_4);
                    }

                    widget_66 = Widget.staticMethod381(i_33);
                    if (widget_66 != null)
                        staticMethod342(widget_66);

                    widget_66 = Widget.staticMethod381(i_4);
                    if (widget_66 != null) {
                        staticMethod342(widget_66);
                        staticMethod328(StaticClass25.staticWidgetArrayArray1[widget_66.int444 >>> 16], widget_66, true);
                    }

                    if (staticInt241 != -1) {
                        i_47 = staticInt241;
                        if (Widget.staticMethod383(i_47))
                            staticMethod339(StaticClass25.staticWidgetArrayArray1[i_47], 1);
                    }

                    staticInt189 = -1;
                    return true;
                }

                int i_11;
                boolean bool_57;
                boolean bool_84;
                if (staticInt189 == 18) {
                    while (staticPacket3.off < staticInt287) {
                        bool_48 = staticPacket3.readUByte() == 1;
                        string_38 = staticPacket3.method448();
                        string_36 = staticPacket3.method448();
                        i_45 = staticPacket3.readUShort();
                        i_42 = staticPacket3.readUByte();
                        i_47 = staticPacket3.readUByte();
                        boolean bool_85 = (i_47 & 0x2) != 0;
                        bool_57 = (i_47 & 0x1) != 0;
                        if (i_45 > 0) {
                            staticPacket3.method448();
                            staticPacket3.readUByte();
                            staticPacket3.readInt();
                        }

                        staticPacket3.method448();

                        for (i_11 = 0; i_11 < staticInt180; i_11++) {
                            Friend friend_83 = staticFriendArray1[i_11];
                            if (!bool_48) {
                                if (string_38.equals(friend_83.string7)) {
                                    if (friend_83.int88 != i_45) {
                                        bool_84 = true;

                                        for (FriendLogin friendlogin_87 = (FriendLogin) staticNode2List1.method262(); friendlogin_87 != null; friendlogin_87 = (FriendLogin) staticNode2List1.method263())
                                            if (friendlogin_87.string22.equals(string_38))
                                                if (i_45 != 0 && friendlogin_87.short1 == 0) {
                                                    friendlogin_87.method292();
                                                    bool_84 = false;
                                                } else if (i_45 == 0 && friendlogin_87.short1 != 0) {
                                                    friendlogin_87.method292();
                                                    bool_84 = false;
                                                }

                                        if (bool_84)
                                            staticNode2List1.method261(new FriendLogin(string_38, i_45));

                                        friend_83.int88 = i_45;
                                    }

                                    friend_83.string6 = string_36;
                                    friend_83.int89 = i_42;
                                    friend_83.bool6 = bool_85;
                                    friend_83.bool7 = bool_57;
                                    string_38 = null;
                                    break;
                                }
                            } else if (string_36.equals(friend_83.string7)) {
                                friend_83.string7 = string_38;
                                friend_83.string6 = string_36;
                                string_38 = null;
                                break;
                            }
                        }

                        if (string_38 != null && staticInt180 < 400) {
                            Friend friend_88 = new Friend();
                            staticFriendArray1[staticInt180] = friend_88;
                            friend_88.string7 = string_38;
                            friend_88.string6 = string_36;
                            friend_88.int88 = i_45;
                            friend_88.int89 = i_42;
                            friend_88.bool6 = bool_85;
                            friend_88.bool7 = bool_57;
                            ++staticInt180;
                        }
                    }

                    staticInt294 = 2;
                    staticInt260 = staticInt256;
                    bool_48 = false;
                    i_4 = staticInt180;

                    while (i_4 > 0) {
                        bool_48 = true;
                        --i_4;

                        for (i_35 = 0; i_35 < i_4; i_35++) {
                            bool_51 = false;
                            Friend friend_64 = staticFriendArray1[i_35];
                            Friend friend_67 = staticFriendArray1[i_35 + 1];
                            if (staticInt271 != friend_64.int88 && staticInt271 == friend_67.int88)
                                bool_51 = true;

                            if (!bool_51 && friend_64.int88 == 0 && friend_67.int88 != 0)
                                bool_51 = true;

                            if (!bool_51 && !friend_64.bool6 && friend_67.bool6)
                                bool_51 = true;

                            if (!bool_51 && !friend_64.bool7 && friend_67.bool7)
                                bool_51 = true;

                            if (bool_51) {
                                Friend friend_89 = staticFriendArray1[i_35];
                                staticFriendArray1[i_35] = staticFriendArray1[i_35 + 1];
                                staticFriendArray1[i_35 + 1] = friend_89;
                                bool_48 = false;
                            }
                        }

                        if (bool_48)
                            break;
                    }

                    staticInt189 = -1;
                    return true;
                }

                long long_9;
                long long_70;
                if (staticInt189 == 129) {
                    i_33 = staticPacket3.readInt();
                    i_4 = staticPacket3.readInt();
                    i_45 = 0;
                    if (StaticClass61.staticGarbageCollectorMXBean1 == null || !StaticClass61.staticGarbageCollectorMXBean1.isValid())
                        try {
                            Iterator iterator_55 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

                            while (iterator_55.hasNext()) {
                                GarbageCollectorMXBean garbagecollectormxbean_61 = (GarbageCollectorMXBean) iterator_55.next();
                                if (garbagecollectormxbean_61.isValid()) {
                                    StaticClass61.staticGarbageCollectorMXBean1 = garbagecollectormxbean_61;
                                    staticLong4 = -1L;
                                    staticLong5 = -1L;
                                }
                            }
                        } catch (Throwable throwable_25) {
                            ;
                        }

                    if (StaticClass61.staticGarbageCollectorMXBean1 != null) {
                        long long_58 = StaticClass27.synchronizedMethod7();
                        long_9 = StaticClass61.staticGarbageCollectorMXBean1.getCollectionTime();
                        if (staticLong5 != -1L) {
                            long_70 = long_9 - staticLong5;
                            long long_99 = long_58 - staticLong4;
                            if (long_99 != 0L)
                                i_45 = (int) (long_70 * 100L / long_99);
                        }

                        staticLong5 = long_9;
                        staticLong4 = long_58;
                    }

                    staticPacket1.writeOpcode(228);
                    staticPacket1.method466(staticInt38); // 1
                    staticPacket1.method465(i_45); // 1
                    staticPacket1.writeInt(i_33);
                    staticPacket1.writeInt(i_4);
                    staticInt189 = -1;
                    return true;
                }

                // update uid
                if (staticInt189 == 203) {
                    staticPacket3.off += 28;
                    if (staticPacket3.method463()) {
                        packet_71 = staticPacket3;
                        i_4 = staticPacket3.off - 28;
                        staticMethod366(packet_71.buf, i_4);
                        if (StaticClass16.staticBufferedFile1 != null)
                            try {
                                StaticClass16.staticBufferedFile1.seek(0L);
                                StaticClass16.staticBufferedFile1.write(packet_71.buf, i_4, 24);
                            } catch (Exception exception_24) {
                                ;
                            }
                    }

                    staticInt189 = -1;
                    return true;
                }

                if (staticInt189 == 186) {
                    WorldMapDecor.staticClass7_1 = Class7.staticMethod201(staticPacket3.readUByte());
                    staticInt189 = -1;
                    return true;
                }

                if (staticInt189 == 153) {
                    i_33 = staticPacket3.readUShortA();
                    i_4 = staticPacket3.readIntME();
                    widget_5 = Widget.staticMethod381(i_4);
                    if (widget_5.int423 != 2 || widget_5.int409 != i_33) {
                        widget_5.int423 = 2;
                        widget_5.int409 = i_33;
                        staticMethod342(widget_5);
                    }

                    staticInt189 = -1;
                    return true;
                }

                if (staticInt189 == 221) {
                    for (i_33 = 0; i_33 < StaticClass44.staticIntArray68.length; i_33++)
                        if (StaticClass44.staticIntArray66[i_33] != StaticClass44.staticIntArray68[i_33]) {
                            StaticClass44.staticIntArray68[i_33] = StaticClass44.staticIntArray66[i_33];
                            staticMethod348(i_33);
                            staticIntArray103[staticInt257++ & 0x1f] = i_33;
                        }

                    staticInt189 = -1;
                    return true;
                }

                if (staticInt189 == 235) {
                    i_33 = staticPacket3.readUShort();
                    ItemContainer itemcontainer_65 = (ItemContainer) ItemContainer.staticHashTable5.get(i_33);
                    if (itemcontainer_65 != null)
                        itemcontainer_65.unlink();

                    staticIntArray104[staticInt258++ & 0x1f] = i_33 & 0x7fff;
                    staticInt189 = -1;
                    return true;
                }

                if (staticInt189 == 57 || staticInt189 == 40 || staticInt189 == 163 || staticInt189 == 143 || staticInt189 == 44 || staticInt189 == 195 || staticInt189 == 187 || staticInt189 == 23 || staticInt189 == 19 || staticInt189 == 178) {
                    staticMethod299();
                    staticInt189 = -1;
                    return true;
                }

                if (staticInt189 == 141) {
                    i_33 = staticPacket3.readInt();
                    NodeSub1 nodesub1_62 = (NodeSub1) staticHashTable7.get(i_33);
                    if (nodesub1_62 != null)
                        staticMethod350(nodesub1_62, true);

                    if (staticWidget11 != null) {
                        staticMethod342(staticWidget11);
                        staticWidget11 = null;
                    }

                    System.out.println(String.format("removeInterface(%d)", i_33));

                    staticInt189 = -1;
                    return true;
                }

                // varp reset
                if (staticInt189 == 182) {
                    for (i_33 = 0; i_33 < StaticClass18.staticInt121; i_33++) {
                        Varp varp_59 = Varp.staticMethod424(i_33);
                        if (varp_59 != null) {
                            StaticClass44.staticIntArray66[i_33] = 0;
                            StaticClass44.staticIntArray68[i_33] = 0;
                        }
                    }

                    staticMethod343();
                    staticInt257 += 32;
                    staticInt189 = -1;
                    return true;
                }

                if (staticInt189 == 208) {
                    StaticClass10.playersInsideViewportCount = 0;

                    for (i_33 = 0; i_33 < 2048; i_33++) {
                        StaticClass10.staticBufferArray1[i_33] = null;
                        StaticClass10.staticByteArray2[i_33] = 1;
                    }

                    for (i_33 = 0; i_33 < 2048; i_33++)
                        players[i_33] = null;

                    StaticClass10.initGPI(staticPacket3);
                    staticInt189 = -1;
                    return true;
                }

                if (staticInt189 == 133) {
                    staticInt296 = staticPacket3.readUByte();
                    staticInt189 = -1;
                    return true;
                }

                if (staticInt189 == 55) {
                    bool_48 = staticPacket3.readUByteN() == 1;
                    i_4 = staticPacket3.readIntIM();
                    widget_5 = Widget.staticMethod381(i_4);
                    if (widget_5.hidden != bool_48) {
                        widget_5.hidden = bool_48;
                        staticMethod342(widget_5);
                    }

                    staticInt189 = -1;
                    return true;
                }

                int i_13;
                if (staticInt189 == 17) {
                    i_33 = staticPacket3.off + staticInt287;
                    i_4 = staticPacket3.readUShort();
                    i_35 = staticPacket3.readUShort();
                    if (staticInt241 != i_4) {
                        staticInt241 = i_4;
                        method407(false);
                        staticMethod346(staticInt241);
                        StaticClass15.staticMethod101(staticInt241);

                        for (i_45 = 0; i_45 < 100; i_45++)
                            staticBoolArray7[i_45] = true;
                    }

                    NodeSub1 nodesub1_69;
                    for (; i_35-- > 0; nodesub1_69.bool24 = true) {
                        i_45 = staticPacket3.readInt();
                        i_42 = staticPacket3.readUShort();
                        i_47 = staticPacket3.readUByte();
                        nodesub1_69 = (NodeSub1) staticHashTable7.get(i_45);
                        if (nodesub1_69 != null && i_42 != nodesub1_69.int317) {
                            staticMethod350(nodesub1_69, true);
                            nodesub1_69 = null;
                        }

                        if (nodesub1_69 == null) {
                            NodeSub1 nodesub1_80 = new NodeSub1();
                            nodesub1_80.int317 = i_42;
                            nodesub1_80.int318 = i_47;
                            staticHashTable7.put(nodesub1_80, i_45);
                            staticMethod346(i_42);
                            Widget widget_82 = Widget.staticMethod381(i_45);
                            staticMethod342(widget_82);
                            if (staticWidget11 != null) {
                                staticMethod342(staticWidget11);
                                staticWidget11 = null;
                            }

                            staticMethod319();
                            staticMethod328(StaticClass25.staticWidgetArrayArray1[i_45 >> 16], widget_82, false);
                            StaticClass15.staticMethod101(i_42);
                            if (staticInt241 != -1) {
                                i_13 = staticInt241;
                                if (Widget.staticMethod383(i_13))
                                    staticMethod339(StaticClass25.staticWidgetArrayArray1[i_13], 1);
                            }

                            nodesub1_69 = nodesub1_80;
                        }
                    }

                    for (nodesub1_75 = (NodeSub1) staticHashTable7.method267(); nodesub1_75 != null; nodesub1_75 = (NodeSub1) staticHashTable7.method268())
                        if (nodesub1_75.bool24)
                            nodesub1_75.bool24 = false;
                        else
                            staticMethod350(nodesub1_75, true);

                    staticHashTable6 = new HashTable(512);

                    while (staticPacket3.off < i_33) {
                        i_45 = staticPacket3.readInt();
                        i_42 = staticPacket3.readUShort();
                        i_47 = staticPacket3.readUShort();
                        i_52 = staticPacket3.readInt();

                        for (i_54 = i_42; i_54 <= i_47; i_54++) {
                            long_70 = ((long) i_45 << 32) + i_54;
                            staticHashTable6.put(new IntProperty(i_52), long_70);
                        }
                    }

                    staticInt189 = -1;
                    return true;
                }

                if (staticInt189 == 155) {
                    World world_44 = new World();
                    world_44.string8 = staticPacket3.method448();
                    world_44.int94 = staticPacket3.readUShort();
                    i_4 = staticPacket3.readInt();
                    world_44.int95 = i_4;
                    staticMethod253(45);
                    StaticClass54.staticConnection4.shutdown();
                    StaticClass54.staticConnection4 = null;
                    StaticClass14.staticMethod78(world_44);
                    staticInt189 = -1;
                    return false;
                }

                if (staticInt189 == 89) {
                    i_33 = staticPacket3.readInt();
                    i_4 = staticPacket3.readUShort();
                    if (i_33 < -70000)
                        i_4 += 32768;

                    if (i_33 >= 0)
                        widget_5 = Widget.staticMethod381(i_33);
                    else
                        widget_5 = null;

                    if (widget_5 != null)
                        for (i_45 = 0; i_45 < widget_5.intArray57.length; i_45++) {
                            widget_5.intArray57[i_45] = 0;
                            widget_5.intArray59[i_45] = 0;
                        }

                    ItemContainer itemcontainer_63 = (ItemContainer) ItemContainer.staticHashTable5.get(i_4);
                    if (itemcontainer_63 != null)
                        for (i_42 = 0; i_42 < itemcontainer_63.itemIds.length; i_42++) {
                            itemcontainer_63.itemIds[i_42] = -1;
                            itemcontainer_63.itemQuantities[i_42] = 0;
                        }

                    i_45 = staticPacket3.readUShort();

                    for (i_42 = 0; i_42 < i_45; i_42++) {
                        i_47 = staticPacket3.readUShortLE();
                        i_52 = staticPacket3.readUByte();
                        if (i_52 == 255)
                            i_52 = staticPacket3.readInt();

                        if (widget_5 != null && i_42 < widget_5.intArray57.length) {
                            widget_5.intArray57[i_42] = i_47;
                            widget_5.intArray59[i_42] = i_52;
                        }

                        ItemContainer.staticMethod251(i_4, i_42, i_47 - 1, i_52);
                    }

                    if (widget_5 != null)
                        staticMethod342(widget_5);

                    staticMethod343();
                    staticIntArray104[staticInt258++ & 0x1f] = i_4 & 0x7fff;
                    staticInt189 = -1;
                    return true;
                }

                long long_43;
                if (staticInt189 == 115) {
                    staticInt261 = staticInt256;
                    if (staticInt287 == 0) {
                        staticString314 = null;
                        staticString318 = null;
                        StaticClass62.staticInt158 = 0;
                        Class1.staticClanMemberArray1 = null;
                        staticInt189 = -1;
                        return true;
                    }

                    staticString318 = staticPacket3.method448();
                    long long_39 = staticPacket3.method445();
                    long_43 = long_39;
                    if (long_39 > 0L && long_39 < 6582952005840035281L) {
                        if (long_39 % 37L == 0L)
                            string_36 = null;
                        else {
                            i_47 = 0;

                            for (long_9 = long_39; long_9 != 0L; long_9 /= 37L)
                                ++i_47;

                            StringBuilder stringbuilder_72 = new StringBuilder(i_47);

                            while (long_43 != 0L) {
                                long long_76 = long_43;
                                long_43 /= 37L;
                                stringbuilder_72.append(StaticClass54.staticCharArray5[(int) (long_76 - long_43 * 37L)]);
                            }

                            string_36 = stringbuilder_72.reverse().toString();
                        }
                    } else
                        string_36 = null;

                    staticString314 = string_36;
                    WM2.staticByte1 = staticPacket3.method440();
                    i_47 = staticPacket3.readUByte();
                    if (i_47 == 255) {
                        staticInt189 = -1;
                        return true;
                    }

                    StaticClass62.staticInt158 = i_47;
                    ClanMember[] arr_56 = new ClanMember[100];

                    for (i_54 = 0; i_54 < StaticClass62.staticInt158; i_54++) {
                        arr_56[i_54] = new ClanMember();
                        arr_56[i_54].string19 = staticPacket3.method448();
                        arr_56[i_54].string20 = StaticClass53.staticMethod224(arr_56[i_54].string19, DataClass14.staticClass12_10);
                        arr_56[i_54].int310 = staticPacket3.readUShort();
                        arr_56[i_54].byte3 = staticPacket3.method440();
                        staticPacket3.method448();
                        if (arr_56[i_54].string19.equals(BufferWrapper.staticPlayer1.name))
                            DataClass7.staticByte2 = arr_56[i_54].byte3;
                    }

                    bool_57 = false;
                    i_12 = StaticClass62.staticInt158;

                    while (i_12 > 0) {
                        bool_57 = true;
                        --i_12;

                        for (i_13 = 0; i_13 < i_12; i_13++)
                            if (arr_56[i_13].string20.compareTo(arr_56[i_13 + 1].string20) > 0) {
                                ClanMember clanmember_77 = arr_56[i_13];
                                arr_56[i_13] = arr_56[i_13 + 1];
                                arr_56[i_13 + 1] = clanmember_77;
                                bool_57 = false;
                            }

                        if (bool_57)
                            break;
                    }

                    Class1.staticClanMemberArray1 = arr_56;
                    staticInt189 = -1;
                    return true;
                }

                String string_41;

                // server message
                if (staticInt189 == 100) {
                    i_33 = staticPacket3.method453();
                    bool_49 = staticPacket3.readUByte() == 1;
                    string_36 = "";
                    bool_51 = false;
                    if (bool_49) {
                        string_36 = staticPacket3.method448();
                        if (staticMethod356(string_36))
                            bool_51 = true;
                    }

                    string_41 = staticPacket3.method448();
                    if (!bool_51)
                        StaticClass12.staticMethod59(i_33, string_36, string_41);

                    staticInt189 = -1;
                    return true;
                }

                if (staticInt189 == 49) {
                    i_33 = staticPacket3.readUShortLE();
                    i_4 = staticPacket3.readIntME();
                    i_35 = i_33 >> 10 & 0x1f;
                    i_45 = i_33 >> 5 & 0x1f;
                    i_42 = i_33 & 0x1f;
                    i_47 = (i_45 << 11) + (i_35 << 19) + (i_42 << 3);
                    Widget widget_53 = Widget.staticMethod381(i_4);
                    if (widget_53.int393 != i_47) {
                        widget_53.int393 = i_47;
                        staticMethod342(widget_53);
                    }

                    staticInt189 = -1;
                    return true;
                }

                int i_16;
                long long_40;
                String string_90;
                if (staticInt189 == 168) {
                    string_3 = staticPacket3.method448();
                    long_40 = staticPacket3.method445();
                    long_43 = staticPacket3.readUShort();
                    long_50 = staticPacket3.method443();
                    Class6 class6_10 = (Class6) StaticClass26.staticMethod155(Class6.staticMethod175(), staticPacket3.readUByte());
                    long_70 = (long_43 << 32) + long_50;
                    bool_84 = false;

                    for (i_14 = 0; i_14 < 100; i_14++)
                        if (staticLongArray3[i_14] == long_70) {
                            bool_84 = true;
                            break;
                        }

                    if (class6_10.bool17 && staticMethod356(string_3))
                        bool_84 = true;

                    if (!bool_84 && staticInt291 == 0) {
                        staticLongArray3[staticInt233] = long_70;
                        staticInt233 = (1 + staticInt233) % 100;
                        String string_86 = TypeFace.staticMethod495(StaticClass51.staticMethod215(StaticClass50.staticMethod207(staticPacket3)));
                        if (class6_10.int259 != -1) {
                            i_16 = class6_10.int259;
                            string_90 = "<img=" + i_16 + ">";
                            StaticClass12.staticMethod60(9, string_90 + string_3, string_86, StaticClass54.staticMethod226(long_40));
                        } else
                            StaticClass12.staticMethod60(9, string_3, string_86, StaticClass54.staticMethod226(long_40));
                    }

                    staticInt189 = -1;
                    return true;
                }

                // player updating
                if (staticInt189 == 83) {
                    StaticClass10.updatePlayers(staticPacket3, staticInt287);
                    staticInt189 = -1;
                    return true;
                }

                // camera packet
                if (staticInt189 == 180) {
                    staticBool45 = true;
                    JavaxSoundSystemProvider.staticInt10 = staticPacket3.readUByte();
                    DataClass1.staticInt11 = staticPacket3.readUByte();
                    StaticClass21.staticInt127 = staticPacket3.readUShort();
                    StaticClass18.staticInt122 = staticPacket3.readUByte();
                    WorldMapRegionStorage.staticInt8 = staticPacket3.readUByte();
                    if (WorldMapRegionStorage.staticInt8 >= 100) {
                        i_33 = 64 + JavaxSoundSystemProvider.staticInt10 * 128;
                        i_4 = DataClass1.staticInt11 * 128 + 64;
                        i_35 = staticMethod293(i_33, i_4, DataClass14.staticInt156) - StaticClass21.staticInt127;
                        i_45 = i_33 - StaticClass44.staticInt135;
                        i_42 = i_35 - DataClass3.staticInt41;
                        i_47 = i_4 - ChatLog.staticInt69;
                        i_52 = (int) Math.sqrt(i_47 * i_47 + i_45 * i_45);
                        DebugOverlay.staticInt304 = (int) (Math.atan2(i_42, i_52) * 325.949D) & 0x7ff;
                        StaticClass20.staticInt126 = (int) (Math.atan2(i_45, i_47) * -325.949D) & 0x7ff;
                        if (DebugOverlay.staticInt304 < 128)
                            DebugOverlay.staticInt304 = 128;

                        if (DebugOverlay.staticInt304 > 383)
                            DebugOverlay.staticInt304 = 383;
                    }

                    staticInt189 = -1;
                    return true;
                }

                if (staticInt189 == 37) {
                    string_3 = staticPacket3.method448();
                    long_40 = staticPacket3.readUShort();
                    long_43 = staticPacket3.method443();
                    Class6 class6_46 = (Class6) StaticClass26.staticMethod155(Class6.staticMethod175(), staticPacket3.readUByte());
                    long_9 = long_43 + (long_40 << 32);
                    boolean bool_60 = false;

                    for (i_12 = 0; i_12 < 100; i_12++)
                        if (staticLongArray3[i_12] == long_9) {
                            bool_60 = true;
                            break;
                        }

                    if (staticMethod356(string_3))
                        bool_60 = true;

                    if (!bool_60 && staticInt291 == 0) {
                        staticLongArray3[staticInt233] = long_9;
                        staticInt233 = (1 + staticInt233) % 100;
                        string_73 = TypeFace.staticMethod495(StaticClass51.staticMethod215(StaticClass50.staticMethod207(staticPacket3)));
                        byte b_78;
                        if (class6_46.bool16)
                            b_78 = 7;
                        else
                            b_78 = 3;

                        if (class6_46.int259 != -1) {
                            i_16 = class6_46.int259;
                            string_90 = "<img=" + i_16 + ">";
                            StaticClass12.staticMethod59(b_78, string_90 + string_3, string_73);
                        } else
                            StaticClass12.staticMethod59(b_78, string_3, string_73);
                    }

                    staticInt189 = -1;
                    return true;
                }

                // dns lookup
                if (staticInt189 == 193) {
                    i_33 = staticPacket3.readIntLE();
                    WM1.staticTask1 = staticTaskManager1.submitDNS(i_33);
                    staticInt189 = -1;
                    return true;
                }

                // get params
                if (staticInt189 == 128) {
                    string_3 = staticPacket3.method448();
                    WorldMap.staticString25 = string_3;

                    try {
                        string_38 = NodeSub2.staticClient1.getParameter(Class9.staticClass9_12.string15);
                        string_36 = NodeSub2.staticClient1.getParameter(Class9.staticClass9_13.string15);
                        string_37 = string_38 + "settings=" + string_3 + "; version=1; path=/; domain=" + string_36;
                        if (string_3.length() == 0)
                            string_37 = string_37 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                        else {
                            string_41 = string_37 + "; Expires=";
                            long_9 = StaticClass27.synchronizedMethod7() + 94608000000L;
                            StaticClass31.staticCalendar2.setTime(new Date(long_9));
                            i_11 = StaticClass31.staticCalendar2.get(7);
                            i_12 = StaticClass31.staticCalendar2.get(5);
                            i_13 = StaticClass31.staticCalendar2.get(2);
                            i_14 = StaticClass31.staticCalendar2.get(1);
                            i_15 = StaticClass31.staticCalendar2.get(11);
                            i_16 = StaticClass31.staticCalendar2.get(12);
                            int i_17 = StaticClass31.staticCalendar2.get(13);
                            string_8 = StaticClass31.staticStringArray4[i_11 - 1] + ", " + i_12 / 10 + i_12 % 10 + "-" + StaticClass31.staticStringArrayArray1[0][i_13] + "-" + i_14 + " " + i_15 / 10 + i_15 % 10 + ":" + i_16 / 10 + i_16 % 10 + ":" + i_17 / 10 + i_17 % 10 + " GMT";
                            string_37 = string_41 + string_8 + "; Max-Age=" + 94608000L;
                        }

                        StaticClass4.staticMethod30(NodeSub2.staticClient1, "document.cookie=\"" + string_37 + "\"");
                    } catch (Throwable throwable_23) {
                        ;
                    }

                    staticInt189 = -1;
                    return true;
                }

                // TODO find packet
                if (staticInt189 == 146) {
                    string_3 = staticPacket3.method448();
                    string_38 = TypeFace.staticMethod495(StaticClass51.staticMethod215(StaticClass50.staticMethod207(staticPacket3)));
                    StaticClass12.staticMethod59(6, string_3, string_38);
                    staticInt189 = -1;
                    return true;
                }

                // TODO find packet
                if (staticInt189 == 64) {
                    i_33 = staticPacket3.readUShort();
                    i_4 = staticPacket3.readUShortLE();
                    i_35 = staticPacket3.readIntLE();
                    widget_6 = Widget.staticMethod381(i_35);
                    widget_6.int433 = (i_4 << 16) + i_33;
                    staticInt189 = -1;
                    return true;
                }

                // TODO ground item
                if (staticInt189 == 20) {
                    i_33 = staticPacket3.readIntLE();
                    i_4 = staticPacket3.readUShortLE();
                    if (i_4 == 65535)
                        i_4 = -1;

                    i_35 = staticPacket3.readIntLE();
                    widget_6 = Widget.staticMethod381(i_33);
                    ObjType objtype_7;
                    if (!widget_6.bool34) {
                        if (i_4 == -1) {
                            widget_6.int423 = 0;
                            staticInt189 = -1;
                            return true;
                        }

                        objtype_7 = ObjType.staticMethod421(i_4);
                        widget_6.int423 = 4;
                        widget_6.int409 = i_4;
                        widget_6.int429 = objtype_7.xan2d;
                        widget_6.int430 = objtype_7.yan2d;
                        widget_6.int397 = objtype_7.zoom2d * 100 / i_35;
                        staticMethod342(widget_6);
                    } else {
                        widget_6.int453 = i_4;
                        widget_6.int456 = i_35;
                        objtype_7 = ObjType.staticMethod421(i_4);
                        widget_6.int429 = objtype_7.xan2d;
                        widget_6.int430 = objtype_7.yan2d;
                        widget_6.int442 = objtype_7.zan2d;
                        widget_6.int427 = objtype_7.xof2d;
                        widget_6.int428 = objtype_7.yof2d;
                        widget_6.int397 = objtype_7.zoom2d;
                        if (objtype_7.stackable == 1)
                            widget_6.int434 = 1;
                        else
                            widget_6.int434 = 2;

                        if (widget_6.int432 > 0)
                            widget_6.int397 = widget_6.int397 * 32 / widget_6.int432;
                        else if (widget_6.int403 > 0)
                            widget_6.int397 = widget_6.int397 * 32 / widget_6.int403;

                        staticMethod342(widget_6);
                    }

                    staticInt189 = -1;
                    return true;
                }

                // system update
                if (staticInt189 == 174) {
                    staticInt201 = staticPacket3.readUShort() * 30;
                    staticInt264 = staticInt256;
                    staticInt189 = -1;
                    return true;
                }

                // TODO find
                if (staticInt189 == 244) {
                    i_33 = staticPacket3.readUShortLE();
                    i_4 = staticPacket3.readIntLE();
                    widget_5 = Widget.staticMethod381(i_4);
                    if (widget_5.int423 != 1 || widget_5.int409 != i_33) {
                        widget_5.int423 = 1;
                        widget_5.int409 = i_33;
                        staticMethod342(widget_5);
                    }

                    staticInt189 = -1;
                    return true;
                }

                // TODO find
                if (staticInt189 == 120) {
                    i_33 = staticPacket3.readIntIM();
                    widget_34 = Widget.staticMethod381(i_33);
                    widget_34.int423 = 3;
                    widget_34.int409 = BufferWrapper.staticPlayer1.playerDef1.method304();
                    staticMethod342(widget_34);
                    staticInt189 = -1;
                    return true;
                }

                if (staticInt189 == 104) {
                    WorldMapTile.staticInt5 = staticPacket3.readUByteA();
                    Actor.staticInt318 = staticPacket3.readUByteS();

                    while (staticPacket3.off < staticInt287) {
                        staticInt189 = staticPacket3.readUByte();
                        staticMethod299();
                    }

                    staticInt189 = -1;
                    return true;
                }

                ClientError.staticMethod113("" + staticInt189 + "," + staticInt193 + "," + staticInt255 + "," + staticInt287, (Throwable) null);
                staticMethod259();
            } catch (IOException ioexception_31) {
                staticMethod261();
            } catch (Exception exception_32) {
                string_3 = "" + staticInt189 + "," + staticInt193 + "," + staticInt255 + "," + staticInt287 + "," + (BufferWrapper.staticPlayer1.intArray103[0] + DataClass10.staticInt111) + "," + (BufferWrapper.staticPlayer1.intArray104[0] + Class4.staticInt53) + ",";

                for (i_4 = 0; i_4 < staticInt287 && i_4 < 50; i_4++)
                    string_3 = string_3 + staticPacket3.buf[i_4] + ",";

                ClientError.staticMethod113(string_3, exception_32);
                staticMethod259();
            }

            return true;
        }
    }

    static final void staticMethod299() {
        int i_2;
        int i_30;
        int i_31;
        int i_32;
        Item item_35;
        if (staticInt189 == 195) {
            i_30 = staticPacket3.readUByteA();
            i_2 = (i_30 >> 4 & 0x7) + WorldMapTile.staticInt5;
            i_31 = (i_30 & 0x7) + Actor.staticInt318;
            i_32 = staticPacket3.readUShort();
            if (i_2 >= 0 && i_31 >= 0 && i_2 < 104 && i_31 < 104) {
                Deque deque_34 = staticDequeArrayArrayArray1[DataClass14.staticInt156][i_2][i_31];
                if (deque_34 != null) {
                    for (item_35 = (Item) deque_34.method257(); item_35 != null; item_35 = (Item) deque_34.method259())
                        if ((i_32 & 0x7fff) == item_35.int657) {
                            item_35.unlink();
                            break;
                        }

                    if (deque_34.method257() == null)
                        staticDequeArrayArrayArray1[DataClass14.staticInt156][i_2][i_31] = null;

                    staticMethod304(i_2, i_31);
                }
            }

        } else {
            int i_5;
            int i_33;
            if (staticInt189 == 40) {
                i_30 = staticPacket3.readUByte();
                i_2 = (i_30 >> 4 & 0x7) + WorldMapTile.staticInt5;
                i_31 = (i_30 & 0x7) + Actor.staticInt318;
                i_32 = staticPacket3.readUShort();
                i_5 = staticPacket3.readUShort();
                i_33 = staticPacket3.readUShort();
                if (i_2 >= 0 && i_31 >= 0 && i_2 < 104 && i_31 < 104) {
                    Deque deque_37 = staticDequeArrayArrayArray1[DataClass14.staticInt156][i_2][i_31];
                    if (deque_37 != null) {
                        for (Item item_38 = (Item) deque_37.method257(); item_38 != null; item_38 = (Item) deque_37.method259())
                            if ((i_32 & 0x7fff) == item_38.int657 && item_38.int658 == i_5) {
                                item_38.int658 = i_33;
                                break;
                            }

                        staticMethod304(i_2, i_31);
                    }
                }

            } else if (staticInt189 == 143) {
                i_30 = staticPacket3.readUByte();
                i_2 = (i_30 >> 4 & 0x7) + WorldMapTile.staticInt5;
                i_31 = Actor.staticInt318 + (i_30 & 0x7);
                i_32 = staticPacket3.readUShort();
                i_5 = staticPacket3.readUByte();
                i_33 = staticPacket3.readUShort();
                if (i_2 >= 0 && i_31 >= 0 && i_2 < 104 && i_31 < 104) {
                    i_2 = i_2 * 128 + 64;
                    i_31 = i_31 * 128 + 64;
                    RenderableSub2 renderablesub2_36 = new RenderableSub2(i_32, DataClass14.staticInt156, i_2, i_31, staticMethod293(i_2, i_31, DataClass14.staticInt156) - i_5, i_33, staticInt166);
                    staticDeque6.method253(renderablesub2_36);
                }

            } else {
                int i_7;
                if (staticInt189 == 19) {
                    i_30 = staticPacket3.readUByteA();
                    i_2 = i_30 >> 2;
                    i_31 = i_30 & 0x3;
                    i_32 = staticIntArray82[i_2];
                    i_5 = staticPacket3.readUByteS();
                    i_33 = (i_5 >> 4 & 0x7) + WorldMapTile.staticInt5;
                    i_7 = Actor.staticInt318 + (i_5 & 0x7);
                    if (i_33 >= 0 && i_7 >= 0 && i_33 < 104 && i_7 < 104)
                        staticMethod300(DataClass14.staticInt156, i_33, i_7, i_32, -1, i_2, i_31, 0, -1);

                } else {
                    int i_8;
                    int i_9;
                    int i_10;
                    int i_11;
                    int i_12;
                    int i_13;
                    if (staticInt189 == 44) {
                        i_30 = staticPacket3.readUByte();
                        i_2 = (i_30 >> 4 & 0x7) + WorldMapTile.staticInt5;
                        i_31 = Actor.staticInt318 + (i_30 & 0x7);
                        i_32 = i_2 + staticPacket3.method440();
                        i_5 = i_31 + staticPacket3.method440();
                        i_33 = staticPacket3.readShort();
                        i_7 = staticPacket3.readUShort();
                        i_8 = staticPacket3.readUByte() * 4;
                        i_9 = staticPacket3.readUByte() * 4;
                        i_10 = staticPacket3.readUShort();
                        i_11 = staticPacket3.readUShort();
                        i_12 = staticPacket3.readUByte();
                        i_13 = staticPacket3.readUByte();
                        if (i_2 >= 0 && i_31 >= 0 && i_2 < 104 && i_31 < 104 && i_32 >= 0 && i_5 >= 0 && i_32 < 104 && i_5 < 104 && i_7 != 65535) {
                            i_2 = i_2 * 128 + 64;
                            i_31 = 64 + i_31 * 128;
                            i_32 = 64 + i_32 * 128;
                            i_5 = 64 + i_5 * 128;
                            Projectile projectile_43 = new Projectile(i_7, DataClass14.staticInt156, i_2, i_31, staticMethod293(i_2, i_31, DataClass14.staticInt156) - i_8, staticInt166 + i_10, i_11 + staticInt166, i_12, i_13, i_33, i_9);
                            projectile_43.method614(i_32, i_5, staticMethod293(i_32, i_5, DataClass14.staticInt156) - i_9, i_10 + staticInt166);
                            staticDeque5.method253(projectile_43);
                        }

                    } else {
                        if (staticInt189 == 163) {
                            byte b_1 = staticPacket3.method471();
                            i_2 = staticPacket3.readUShortLEA();
                            byte b_3 = staticPacket3.method471();
                            byte b_4 = staticPacket3.method471();
                            i_5 = staticPacket3.readUShortA();
                            byte b_6 = staticPacket3.method440();
                            i_7 = staticPacket3.readUByteN();
                            i_8 = WorldMapTile.staticInt5 + (i_7 >> 4 & 0x7);
                            i_9 = Actor.staticInt318 + (i_7 & 0x7);
                            i_10 = staticPacket3.readUShortA();
                            i_11 = staticPacket3.readUShortA();
                            i_12 = staticPacket3.readUByteS();
                            i_13 = i_12 >> 2;
                            int i_14 = i_12 & 0x3;
                            int i_15 = staticIntArray82[i_13];
                            Player player_16;
                            if (staticInt293 == i_10)
                                player_16 = BufferWrapper.staticPlayer1;
                            else
                                player_16 = players[i_10];

                            if (player_16 != null) {
                                LocType loctype_17 = LocType.staticMethod411(i_2);
                                int i_18;
                                int i_19;
                                if (i_14 != 1 && i_14 != 3) {
                                    i_18 = loctype_17.int518;
                                    i_19 = loctype_17.int519;
                                } else {
                                    i_18 = loctype_17.int519;
                                    i_19 = loctype_17.int518;
                                }

                                int i_20 = (i_18 >> 1) + i_8;
                                int i_21 = i_8 + (i_18 + 1 >> 1);
                                int i_22 = (i_19 >> 1) + i_9;
                                int i_23 = (i_19 + 1 >> 1) + i_9;
                                int[][] ints_24 = StaticClass3.staticIntArrayArrayArray1[DataClass14.staticInt156];
                                int i_25 = ints_24[i_21][i_22] + ints_24[i_20][i_22] + ints_24[i_20][i_23] + ints_24[i_21][i_23] >> 2;
                                int i_26 = (i_18 << 6) + (i_8 << 7);
                                int i_27 = (i_19 << 6) + (i_9 << 7);
                                Model model_28 = loctype_17.method560(i_13, i_14, ints_24, i_26, i_25, i_27);
                                if (model_28 != null) {
                                    staticMethod300(DataClass14.staticInt156, i_8, i_9, i_15, -1, 0, 0, i_5 + 1, i_11 + 1);
                                    player_16.minSomething = staticInt166 + i_5;
                                    player_16.maxSomething = staticInt166 + i_11;
                                    player_16.model3 = model_28;
                                    player_16.int688 = i_18 * 64 + i_8 * 128;
                                    player_16.int680 = i_9 * 128 + i_19 * 64;
                                    player_16.int684 = i_25;
                                    byte b_29;
                                    if (b_1 > b_4) {
                                        b_29 = b_1;
                                        b_1 = b_4;
                                        b_4 = b_29;
                                    }

                                    if (b_3 > b_6) {
                                        b_29 = b_3;
                                        b_3 = b_6;
                                        b_6 = b_29;
                                    }

                                    player_16.int687 = i_8 + b_1;
                                    player_16.int679 = i_8 + b_4;
                                    player_16.int685 = b_3 + i_9;
                                    player_16.int686 = i_9 + b_6;
                                }
                            }
                        }

                        if (staticInt189 == 178) {
                            i_30 = staticPacket3.readUByteN();
                            i_2 = (i_30 >> 4 & 0x7) + WorldMapTile.staticInt5;
                            i_31 = Actor.staticInt318 + (i_30 & 0x7);
                            i_32 = staticPacket3.readUShortLEA();
                            i_5 = staticPacket3.readUByteS();
                            i_33 = i_5 >> 2;
                            i_7 = i_5 & 0x3;
                            i_8 = staticIntArray82[i_33];
                            if (i_2 >= 0 && i_31 >= 0 && i_2 < 104 && i_31 < 104)
                                staticMethod300(DataClass14.staticInt156, i_2, i_31, i_8, i_32, i_33, i_7, 0, -1);

                        } else {
                            if (staticInt189 == 57) {
                                i_30 = staticPacket3.readUByte();
                                i_2 = (i_30 >> 4 & 0x7) + WorldMapTile.staticInt5;
                                i_31 = (i_30 & 0x7) + Actor.staticInt318;
                                i_32 = staticPacket3.readUShort();
                                i_5 = staticPacket3.readUByte();
                                i_33 = i_5 >> 4 & 0xf;
                                i_7 = i_5 & 0x7;
                                i_8 = staticPacket3.readUByte();
                                if (i_2 >= 0 && i_31 >= 0 && i_2 < 104 && i_31 < 104) {
                                    i_9 = i_33 + 1;
                                    if (BufferWrapper.staticPlayer1.intArray103[0] >= i_2 - i_9 && BufferWrapper.staticPlayer1.intArray103[0] <= i_2 + i_9 && BufferWrapper.staticPlayer1.intArray104[0] >= i_31 - i_9 && BufferWrapper.staticPlayer1.intArray104[0] <= i_9 + i_31 && staticInt267 != 0 && i_7 > 0 && staticInt285 < 50) {
                                        staticIntArray112[staticInt285] = i_32;
                                        staticIntArray113[staticInt285] = i_7;
                                        staticIntArray114[staticInt285] = i_8;
                                        staticSoundEffectArray1[staticInt285] = null;
                                        staticIntArray115[staticInt285] = i_33 + (i_2 << 16) + (i_31 << 8);
                                        ++staticInt285;
                                    }
                                }
                            }

                            if (staticInt189 != 23) {
                                if (staticInt189 == 187) {
                                    i_30 = staticPacket3.readUShortA();
                                    i_2 = staticPacket3.readUShort();
                                    i_31 = staticPacket3.readUByteA();
                                    i_32 = WorldMapTile.staticInt5 + (i_31 >> 4 & 0x7);
                                    i_5 = Actor.staticInt318 + (i_31 & 0x7);
                                    if (i_32 >= 0 && i_5 >= 0 && i_32 < 104 && i_5 < 104) {
                                        item_35 = new Item();
                                        item_35.int657 = i_30;
                                        item_35.int658 = i_2;
                                        if (staticDequeArrayArrayArray1[DataClass14.staticInt156][i_32][i_5] == null)
                                            staticDequeArrayArrayArray1[DataClass14.staticInt156][i_32][i_5] = new Deque();

                                        staticDequeArrayArrayArray1[DataClass14.staticInt156][i_32][i_5].method253(item_35);
                                        staticMethod304(i_32, i_5);
                                    }

                                }
                            } else {
                                i_30 = staticPacket3.readUByteA();
                                i_2 = (i_30 >> 4 & 0x7) + WorldMapTile.staticInt5;
                                i_31 = (i_30 & 0x7) + Actor.staticInt318;
                                i_32 = staticPacket3.readUShortLE();
                                i_5 = staticPacket3.readUByteN();
                                i_33 = i_5 >> 2;
                                i_7 = i_5 & 0x3;
                                i_8 = staticIntArray82[i_33];
                                if (i_2 >= 0 && i_31 >= 0 && i_2 < 103 && i_31 < 103) {
                                    if (i_8 == 0) {
                                        DataClass10 dataclass10_39 = LegacyClickboxDebug.staticScene1.method201(DataClass14.staticInt156, i_2, i_31);
                                        if (dataclass10_39 != null) {
                                            i_10 = dataclass10_39.int193 >> 14 & 0x7fff;
                                            if (i_33 == 2) {
                                                dataclass10_39.renderable4 = new RenderableSub1(i_10, 2, i_7 + 4, DataClass14.staticInt156, i_2, i_31, i_32, false, dataclass10_39.renderable4);
                                                dataclass10_39.renderable3 = new RenderableSub1(i_10, 2, i_7 + 1 & 0x3, DataClass14.staticInt156, i_2, i_31, i_32, false, dataclass10_39.renderable3);
                                            } else
                                                dataclass10_39.renderable4 = new RenderableSub1(i_10, i_33, i_7, DataClass14.staticInt156, i_2, i_31, i_32, false, dataclass10_39.renderable4);
                                        }
                                    }

                                    if (i_8 == 1) {
                                        WallObject wallobject_40 = LegacyClickboxDebug.staticScene1.method202(DataClass14.staticInt156, i_2, i_31);
                                        if (wallobject_40 != null) {
                                            i_10 = wallobject_40.int153 >> 14 & 0x7fff;
                                            if (i_33 != 4 && i_33 != 5) {
                                                if (i_33 == 6)
                                                    wallobject_40.renderable1 = new RenderableSub1(i_10, 4, i_7 + 4, DataClass14.staticInt156, i_2, i_31, i_32, false, wallobject_40.renderable1);
                                                else if (i_33 == 7)
                                                    wallobject_40.renderable1 = new RenderableSub1(i_10, 4, (i_7 + 2 & 0x3) + 4, DataClass14.staticInt156, i_2, i_31, i_32, false, wallobject_40.renderable1);
                                                else if (i_33 == 8) {
                                                    wallobject_40.renderable1 = new RenderableSub1(i_10, 4, i_7 + 4, DataClass14.staticInt156, i_2, i_31, i_32, false, wallobject_40.renderable1);
                                                    wallobject_40.renderable2 = new RenderableSub1(i_10, 4, (i_7 + 2 & 0x3) + 4, DataClass14.staticInt156, i_2, i_31, i_32, false, wallobject_40.renderable2);
                                                }
                                            } else
                                                wallobject_40.renderable1 = new RenderableSub1(i_10, 4, i_7, DataClass14.staticInt156, i_2, i_31, i_32, false, wallobject_40.renderable1);
                                        }
                                    }

                                    if (i_8 == 2) {
                                        GameObject gameobject_41 = LegacyClickboxDebug.staticScene1.method203(DataClass14.staticInt156, i_2, i_31);
                                        if (i_33 == 11)
                                            i_33 = 10;

                                        if (gameobject_41 != null)
                                            gameobject_41.renderable5 = new RenderableSub1(gameobject_41.int206 >> 14 & 0x7fff, i_33, i_7, DataClass14.staticInt156, i_2, i_31, i_32, false, gameobject_41.renderable5);
                                    }

                                    if (i_8 == 3) {
                                        GroundDecoration grounddecoration_42 = LegacyClickboxDebug.staticScene1.method204(DataClass14.staticInt156, i_2, i_31);
                                        if (grounddecoration_42 != null)
                                            grounddecoration_42.gameObject = new RenderableSub1(grounddecoration_42.int142 >> 14 & 0x7fff, 22, i_7, DataClass14.staticInt156, i_2, i_31, i_32, false, grounddecoration_42.gameObject);
                                    }
                                }

                            }
                        }
                    }
                }
            }
        }
    }

    static final void staticMethod300(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
        NodeSub2 nodesub2_10 = null;

        for (NodeSub2 nodesub2_11 = (NodeSub2) staticDeque4.method257(); nodesub2_11 != null; nodesub2_11 = (NodeSub2) staticDeque4.method259())
            if (i_0 == nodesub2_11.int330 && i_1 == nodesub2_11.int332 && i_2 == nodesub2_11.int326 && i_3 == nodesub2_11.int324) {
                nodesub2_10 = nodesub2_11;
                break;
            }

        if (nodesub2_10 == null) {
            nodesub2_10 = new NodeSub2();
            nodesub2_10.int330 = i_0;
            nodesub2_10.int324 = i_3;
            nodesub2_10.int332 = i_1;
            nodesub2_10.int326 = i_2;
            StaticClass17.staticMethod126(nodesub2_10);
            staticDeque4.method253(nodesub2_10);
        }

        nodesub2_10.int325 = i_4;
        nodesub2_10.int331 = i_5;
        nodesub2_10.int334 = i_6;
        nodesub2_10.int323 = i_7;
        nodesub2_10.int333 = i_8;
    }

    static final void staticMethod301() {
        for (NodeSub2 nodesub2_1 = (NodeSub2) staticDeque4.method257(); nodesub2_1 != null; nodesub2_1 = (NodeSub2) staticDeque4.method259())
            if (nodesub2_1.int333 == -1) {
                nodesub2_1.int323 = 0;
                StaticClass17.staticMethod126(nodesub2_1);
            } else
                nodesub2_1.unlink();

    }

    static final void staticMethod302() {
        for (NodeSub2 nodesub2_1 = (NodeSub2) staticDeque4.method257(); nodesub2_1 != null; nodesub2_1 = (NodeSub2) staticDeque4.method259()) {
            if (nodesub2_1.int333 > 0)
                --nodesub2_1.int333;

            boolean bool_2;
            int i_3;
            int i_4;
            LocType loctype_5;
            if (nodesub2_1.int333 == 0) {
                if (nodesub2_1.int327 >= 0) {
                    i_3 = nodesub2_1.int327;
                    i_4 = nodesub2_1.int329;
                    loctype_5 = LocType.staticMethod411(i_3);
                    if (i_4 == 11)
                        i_4 = 10;

                    if (i_4 >= 5 && i_4 <= 8)
                        i_4 = 4;

                    bool_2 = loctype_5.method557(i_4);
                    if (!bool_2)
                        continue;
                }

                staticMethod303(nodesub2_1.int330, nodesub2_1.int324, nodesub2_1.int332, nodesub2_1.int326, nodesub2_1.int327, nodesub2_1.int328, nodesub2_1.int329);
                nodesub2_1.unlink();
            } else {
                if (nodesub2_1.int323 > 0)
                    --nodesub2_1.int323;

                if (nodesub2_1.int323 == 0 && nodesub2_1.int332 >= 1 && nodesub2_1.int326 >= 1 && nodesub2_1.int332 <= 102 && nodesub2_1.int326 <= 102) {
                    if (nodesub2_1.int325 >= 0) {
                        i_3 = nodesub2_1.int325;
                        i_4 = nodesub2_1.int331;
                        loctype_5 = LocType.staticMethod411(i_3);
                        if (i_4 == 11)
                            i_4 = 10;

                        if (i_4 >= 5 && i_4 <= 8)
                            i_4 = 4;

                        bool_2 = loctype_5.method557(i_4);
                        if (!bool_2)
                            continue;
                    }

                    staticMethod303(nodesub2_1.int330, nodesub2_1.int324, nodesub2_1.int332, nodesub2_1.int326, nodesub2_1.int325, nodesub2_1.int334, nodesub2_1.int331);
                    nodesub2_1.int323 = -1;
                    if (nodesub2_1.int325 == nodesub2_1.int327 && nodesub2_1.int327 == -1)
                        nodesub2_1.unlink();
                    else if (nodesub2_1.int327 == nodesub2_1.int325 && nodesub2_1.int328 == nodesub2_1.int334 && nodesub2_1.int331 == nodesub2_1.int329)
                        nodesub2_1.unlink();
                }
            }
        }

    }

    static final void staticMethod303(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        if (i_2 >= 1 && i_3 >= 1 && i_2 <= 102 && i_3 <= 102) {
            if (staticBool25 && i_0 != DataClass14.staticInt156)
                return;

            int i_8 = 0;
            boolean bool_9 = true;
            boolean bool_10 = false;
            boolean bool_11 = false;
            if (i_1 == 0)
                i_8 = LegacyClickboxDebug.staticScene1.method205(i_0, i_2, i_3);

            if (i_1 == 1)
                i_8 = LegacyClickboxDebug.staticScene1.method206(i_0, i_2, i_3);

            if (i_1 == 2)
                i_8 = LegacyClickboxDebug.staticScene1.method207(i_0, i_2, i_3);

            if (i_1 == 3)
                i_8 = LegacyClickboxDebug.staticScene1.method208(i_0, i_2, i_3);

            int i_12;
            if (i_8 != 0) {
                i_12 = LegacyClickboxDebug.staticScene1.method209(i_0, i_2, i_3, i_8);
                int i_14 = i_8 >> 14 & 0x7fff;
                int i_15 = i_12 & 0x1f;
                int i_16 = i_12 >> 6 & 0x3;
                LocType loctype_13;
                if (i_1 == 0) {
                    LegacyClickboxDebug.staticScene1.method196(i_0, i_2, i_3);
                    loctype_13 = LocType.staticMethod411(i_14);
                    if (loctype_13.int520 != 0)
                        staticCollisionMapArray1[i_0].method240(i_2, i_3, i_15, i_16, loctype_13.bool54);
                }

                if (i_1 == 1)
                    LegacyClickboxDebug.staticScene1.method197(i_0, i_2, i_3);

                if (i_1 == 2) {
                    LegacyClickboxDebug.staticScene1.method198(i_0, i_2, i_3);
                    loctype_13 = LocType.staticMethod411(i_14);
                    if (i_2 + loctype_13.int518 > 103 || i_3 + loctype_13.int518 > 103 || loctype_13.int519 + i_2 > 103 || i_3 + loctype_13.int519 > 103)
                        return;

                    if (loctype_13.int520 != 0)
                        staticCollisionMapArray1[i_0].method241(i_2, i_3, loctype_13.int518, loctype_13.int519, i_16, loctype_13.bool54);
                }

                if (i_1 == 3) {
                    LegacyClickboxDebug.staticScene1.method199(i_0, i_2, i_3);
                    loctype_13 = LocType.staticMethod411(i_14);
                    if (loctype_13.int520 == 1)
                        staticCollisionMapArray1[i_0].method243(i_2, i_3);
                }
            }

            if (i_4 >= 0) {
                i_12 = i_0;
                if (i_0 < 3 && (StaticClass3.staticByteArrayArrayArray1[1][i_2][i_3] & 0x2) == 2)
                    i_12 = i_0 + 1;

                StaticClass3.staticMethod29(i_0, i_12, i_2, i_3, i_4, i_5, i_6, LegacyClickboxDebug.staticScene1, staticCollisionMapArray1[i_0]);
            }
        }

    }

    static final void staticMethod304(int i_0, int i_1) {
        Deque deque_3 = staticDequeArrayArrayArray1[DataClass14.staticInt156][i_0][i_1];
        if (deque_3 == null)
            LegacyClickboxDebug.staticScene1.method200(DataClass14.staticInt156, i_0, i_1);
        else {
            long long_4 = -99999999L;
            Item item_6 = null;

            Item item_7;
            for (item_7 = (Item) deque_3.method257(); item_7 != null; item_7 = (Item) deque_3.method259()) {
                ObjType objtype_8 = ObjType.staticMethod421(item_7.int657);
                long long_9 = objtype_8.cost;
                if (objtype_8.stackable == 1)
                    long_9 *= item_7.int658 + 1;

                if (long_9 > long_4) {
                    long_4 = long_9;
                    item_6 = item_7;
                }
            }

            if (item_6 == null)
                LegacyClickboxDebug.staticScene1.method200(DataClass14.staticInt156, i_0, i_1);
            else {
                deque_3.method254(item_6);
                Item item_11 = null;
                Item item_12 = null;

                for (item_7 = (Item) deque_3.method257(); item_7 != null; item_7 = (Item) deque_3.method259())
                    if (item_6.int657 != item_7.int657) {
                        if (item_11 == null)
                            item_11 = item_7;

                        if (item_11.int657 != item_7.int657 && item_12 == null)
                            item_12 = item_7;
                    }

                int i_10 = 1610612736 + (i_1 << 7) + i_0;
                LegacyClickboxDebug.staticScene1.addGroundItemPile(DataClass14.staticInt156, i_0, i_1, staticMethod293(i_0 * 128 + 64, i_1 * 128 + 64, DataClass14.staticInt156), item_6, i_10, item_11, item_12);
            }
        }
    }

    static final void staticMethod305(boolean bool_0) {
        staticInt230 = 0;
        staticInt187 = 0;
        staticMethod306();
        staticMethod307(bool_0);

        int i_2;
        int i_3;
        for (i_2 = 0; i_2 < staticInt187; i_2++) {
            i_3 = staticIntArray81[i_2];
            Npc npc_4 = staticNpcArray1[i_3];
            int i_5 = staticPacket3.readUByte();
            int i_6;

            // TODO npc masks

            if ((i_5 & 0x4) != 0) {
                npc_4.int640 = staticPacket3.readUShortA();
                i_6 = staticPacket3.readIntLE();
                npc_4.int613 = i_6 >> 16;
                npc_4.int630 = (i_6 & 0xffff) + staticInt166;
                npc_4.int631 = 0;
                npc_4.int629 = 0;
                if (npc_4.int630 > staticInt166)
                    npc_4.int631 = -1;

                if (npc_4.int640 == 65535)
                    npc_4.int640 = -1;
            }

            if ((i_5 & 0x1) != 0) {
                npc_4.npcType1 = NpcType.staticMethod413(staticPacket3.readUShortLEA());
                npc_4.tiles = npc_4.npcType1.name;
                npc_4.ubn = npc_4.npcType1.int544;
                npc_4.walk = npc_4.npcType1.idle;
                npc_4.reverse = -npc_4.npcType1.int543;
                npc_4.counterclockwise = npc_4.npcType1.reverse;
                npc_4.clockwise = npc_4.npcType1.counterclockwise;
                npc_4.idle = -npc_4.npcType1.tiles;
                npc_4.unknown2 = npc_4.npcType1.walk;
                npc_4.int612 = npc_4.npcType1.int537;
            }

            int i_7;
            int i_8;
            if ((i_5 & 0x8) != 0) {
                i_6 = staticPacket3.readUShort();
                if (i_6 == 65535)
                    i_6 = -1;

                i_7 = staticPacket3.readUByteA();
                if (npc_4.anim == i_6 && i_6 != -1) {
                    i_8 = SeqType.staticMethod438(i_6).delayType;
                    if (i_8 == 1) {
                        npc_4.int624 = 0;
                        npc_4.int608 = 0;
                        npc_4.int628 = i_7;
                        npc_4.int627 = 0;
                    }

                    if (i_8 == 2)
                        npc_4.int627 = 0;
                } else if (i_6 == -1 || npc_4.anim == -1 || SeqType.staticMethod438(i_6).int605 >= SeqType.staticMethod438(npc_4.anim).int605) {
                    npc_4.anim = i_6;
                    npc_4.int624 = 0;
                    npc_4.int608 = 0;
                    npc_4.int628 = i_7;
                    npc_4.int627 = 0;
                    npc_4.int625 = npc_4.int611;
                }
            }

            int i_9;
            if ((i_5 & 0x20) != 0) {
                i_6 = staticPacket3.readUShortLE();
                i_7 = staticPacket3.readUShortLEA();
                i_8 = npc_4.int626 - (i_6 - DataClass10.staticInt111 - DataClass10.staticInt111) * 64;
                i_9 = npc_4.int609 - (i_7 - Class4.staticInt53 - Class4.staticInt53) * 64;
                if (i_8 != 0 || i_9 != 0)
                    npc_4.int621 = (int) (Math.atan2(i_8, i_9) * 325.949D) & 0x7ff;
            }

            if ((i_5 & 0x10) != 0) {
                npc_4.int620 = staticPacket3.readUShortLEA();
                if (npc_4.int620 == 65535)
                    npc_4.int620 = -1;
            }

            if ((i_5 & 0x2) != 0) {
                npc_4.string43 = staticPacket3.method448();
                npc_4.int615 = 100;
            }

            if ((i_5 & 0x40) != 0) {
                i_6 = staticPacket3.readUByteA();
                int i_10;
                int i_11;
                int i_12;
                if (i_6 > 0)
                    for (i_7 = 0; i_7 < i_6; i_7++) {
                        i_9 = -1;
                        i_10 = -1;
                        i_11 = -1;
                        i_8 = staticPacket3.method453();
                        if (i_8 == 32767) {
                            i_8 = staticPacket3.method453();
                            i_10 = staticPacket3.method453();
                            i_9 = staticPacket3.method453();
                            i_11 = staticPacket3.method453();
                        } else if (i_8 != 32766)
                            i_10 = staticPacket3.method453();
                        else
                            i_8 = -1;

                        i_12 = staticPacket3.method453();
                        npc_4.method610(i_8, i_10, i_9, i_11, staticInt166, i_12);
                    }

                i_7 = staticPacket3.readUByteA();
                if (i_7 > 0)
                    for (i_8 = 0; i_8 < i_7; i_8++) {
                        i_9 = staticPacket3.method453();
                        i_10 = staticPacket3.method453();
                        if (i_10 != 32767) {
                            i_11 = staticPacket3.method453();
                            i_12 = staticPacket3.readUByteA();
                            int i_13 = i_10 > 0 ? staticPacket3.readUByteN() : i_12;
                            npc_4.method611(i_9, staticInt166, i_10, i_11, i_12, i_13);
                        } else
                            npc_4.method612(i_9);
                    }
            }
        }

        for (i_2 = 0; i_2 < staticInt230; i_2++) {
            i_3 = staticIntArray92[i_2];
            if (staticInt166 != staticNpcArray1[i_3].int637) {
                staticNpcArray1[i_3].npcType1 = null;
                staticNpcArray1[i_3] = null;
            }
        }

        if (staticPacket3.off != staticInt287)
            throw new RuntimeException(staticPacket3.off + "," + staticInt287);
        else
            for (i_2 = 0; i_2 < staticInt186; i_2++)
                if (staticNpcArray1[staticIntArray91[i_2]] == null)
                    throw new RuntimeException(i_2 + "," + staticInt186);
    }

    static final void staticMethod306() {
        staticPacket3.initBitAccess();
        int i_1 = staticPacket3.readBits(8);
        int i_2;
        if (i_1 < staticInt186)
            for (i_2 = i_1; i_2 < staticInt186; i_2++)
                staticIntArray92[staticInt230++] = staticIntArray91[i_2];

        if (i_1 > staticInt186)
            throw new RuntimeException("");
        else {
            staticInt186 = 0;

            for (i_2 = 0; i_2 < i_1; i_2++) {
                int i_3 = staticIntArray91[i_2];
                Npc npc_4 = staticNpcArray1[i_3];
                int i_5 = staticPacket3.readBits(1);
                if (i_5 == 0) {
                    staticIntArray91[staticInt186++] = i_3;
                    npc_4.int637 = staticInt166;
                } else {
                    int i_6 = staticPacket3.readBits(2);
                    if (i_6 == 0) {
                        staticIntArray91[staticInt186++] = i_3;
                        npc_4.int637 = staticInt166;
                        staticIntArray81[staticInt187++] = i_3;
                    } else {
                        int i_7;
                        int i_8;
                        if (i_6 == 1) {
                            staticIntArray91[staticInt186++] = i_3;
                            npc_4.int637 = staticInt166;
                            i_7 = staticPacket3.readBits(3);
                            npc_4.method700(i_7, (byte) 1);
                            i_8 = staticPacket3.readBits(1);
                            if (i_8 == 1)
                                staticIntArray81[staticInt187++] = i_3;
                        } else if (i_6 == 2) {
                            staticIntArray91[staticInt186++] = i_3;
                            npc_4.int637 = staticInt166;
                            i_7 = staticPacket3.readBits(3);
                            npc_4.method700(i_7, (byte) 2);
                            i_8 = staticPacket3.readBits(3);
                            npc_4.method700(i_8, (byte) 2);
                            int i_9 = staticPacket3.readBits(1);
                            if (i_9 == 1)
                                staticIntArray81[staticInt187++] = i_3;
                        } else if (i_6 == 3)
                            staticIntArray92[staticInt230++] = i_3;
                    }
                }
            }

        }
    }

    static final void staticMethod307(boolean bool_0) {
        while (true) {
            if (staticPacket3.remainingBits(staticInt287) >= 27) {
                int i_2 = staticPacket3.readBits(15);
                if (i_2 != 32767) {
                    boolean bool_3 = false;
                    if (staticNpcArray1[i_2] == null) {
                        staticNpcArray1[i_2] = new Npc();
                        bool_3 = true;
                    }

                    Npc npc_4 = staticNpcArray1[i_2];
                    staticIntArray91[staticInt186++] = i_2;
                    npc_4.int637 = staticInt166;
                    int i_5;
                    if (bool_0) {
                        i_5 = staticPacket3.readBits(8);
                        if (i_5 > 127)
                            i_5 -= 256;
                    } else {
                        i_5 = staticPacket3.readBits(5);
                        if (i_5 > 15)
                            i_5 -= 32;
                    }

                    int i_6 = staticPacket3.readBits(1);
                    int i_7 = staticPacket3.readBits(1);
                    if (i_7 == 1)
                        staticIntArray81[staticInt187++] = i_2;

                    int i_8 = staticIntArray94[staticPacket3.readBits(3)];
                    if (bool_3)
                        npc_4.int639 = npc_4.int610 = i_8;

                    npc_4.npcType1 = NpcType.staticMethod413(staticPacket3.readBits(14));
                    int i_9;
                    if (bool_0) {
                        i_9 = staticPacket3.readBits(8);
                        if (i_9 > 127)
                            i_9 -= 256;
                    } else {
                        i_9 = staticPacket3.readBits(5);
                        if (i_9 > 15)
                            i_9 -= 32;
                    }

                    npc_4.tiles = npc_4.npcType1.name;
                    npc_4.ubn = npc_4.npcType1.int544;
                    if (npc_4.ubn == 0)
                        npc_4.int610 = 0;

                    npc_4.walk = npc_4.npcType1.idle;
                    npc_4.reverse = -npc_4.npcType1.int543;
                    npc_4.counterclockwise = npc_4.npcType1.reverse;
                    npc_4.clockwise = npc_4.npcType1.counterclockwise;
                    npc_4.idle = -npc_4.npcType1.tiles;
                    npc_4.unknown2 = npc_4.npcType1.walk;
                    npc_4.int612 = npc_4.npcType1.int537;
                    npc_4.method701(BufferWrapper.staticPlayer1.intArray103[0] + i_5, i_9 + BufferWrapper.staticPlayer1.intArray104[0], i_6 == 1);
                    continue;
                }
            }

            staticPacket3.finishBitAccess();
            return;
        }
    }

    static final void staticMethod308(Player player_0, int i_1, int i_2, byte b_3) {
        int i_5 = player_0.intArray103[0];
        int i_6 = player_0.intArray104[0];
        int i_7 = player_0.method696();
        if (i_5 >= i_7 && i_5 < 104 - i_7 && i_6 >= i_7 && i_6 < 104 - i_7)
            if (i_1 >= i_7 && i_1 < 104 - i_7 && i_2 >= i_7 && i_2 < 104 - i_7) {
                int i_8 = StaticClass23.staticMethod140(i_5, i_6, player_0.method696(), staticMethod309(i_1, i_2), staticCollisionMapArray1[player_0.int683 * 649046179], true, staticIntArray120, staticIntArray121);
                if (i_8 >= 1)
                    for (int i_9 = 0; i_9 < i_8 - 1; i_9++)
                        player_0.method699(staticIntArray120[i_9], staticIntArray121[i_9], b_3);
            }
    }

    static AbstractClass1 staticMethod309(int i_0, int i_1) {
        staticAbstractClass1Sub1_1.int237 = i_0;
        staticAbstractClass1Sub1_1.int238 = i_1;
        staticAbstractClass1Sub1_1.int239 = 1;
        staticAbstractClass1Sub1_1.int240 = 1;
        return staticAbstractClass1Sub1_1;
    }

    static final void staticMethod310(int i_0, int i_1) {
        if (staticInt225 >= 2 || staticInt194 != 0 || staticBool36) {
            int i_3 = staticInt225 - 1;
            String string_5;
            if (staticInt194 == 1 && staticInt225 < 2)
                string_5 = "Use" + " " + staticString315 + " " + "->";
            else if (staticBool36 && staticInt225 < 2)
                string_5 = staticString316 + " " + staticString313 + " " + "->";
            else
                string_5 = staticMethod320(i_3);

            if (staticInt225 > 2)
                string_5 = string_5 + StaticClass13.staticMethod64(16777215) + " " + '/' + " " + (staticInt225 - 2) + " more options";

            Friend.staticFontFace2.method668(string_5, i_0 + 4, i_1 + 15, 16777215, 0, staticInt166 / 1000);
        }
    }

    static final void staticMethod311(int i_0, int i_1, int i_2, int i_3) {
        for (int i_5 = 0; i_5 < staticInt269; i_5++)
            if (staticIntArray105[i_5] + staticIntArray102[i_5] > i_0 && staticIntArray105[i_5] < i_2 + i_0 && staticIntArray90[i_5] + staticIntArray107[i_5] > i_1 && staticIntArray90[i_5] < i_1 + i_3)
                staticBoolArray7[i_5] = true;

    }

    static final void staticMethod312(int i_0, int i_1, int i_2, int i_3) {
        for (int i_5 = 0; i_5 < staticInt269; i_5++)
            if (staticIntArray102[i_5] + staticIntArray105[i_5] > i_0 && staticIntArray105[i_5] < i_2 + i_0 && staticIntArray90[i_5] + staticIntArray107[i_5] > i_1 && staticIntArray90[i_5] < i_3 + i_1)
                staticBoolArray8[i_5] = true;

    }

    final void method404() {
        staticMethod317();
        if (ClanMember.staticWidget7 == null)
            if (staticWidget10 == null) {
                int i_3;
                int i_6;
                int i_7;
                label190: {
                    int i_2 = MouseHandler.staticInt27;
                    int i_5;
                    int i_10;
                    int i_15;
                    if (staticBool34) {
                        int i_4;
                        if (i_2 != 1 && (SoundBank.staticBool11 || i_2 != 4)) {
                            i_3 = MouseHandler.staticInt28;
                            i_4 = MouseHandler.staticInt29;
                            if (i_3 < StaticClass6.staticInt42 - 10 || i_3 > 10 + StaticClass6.staticInt42 + StaticClass1.staticInt1 || i_4 < AABBClickboxDebug.staticInt317 - 10 || i_4 > AABBClickboxDebug.staticInt317 + WorldMapRegionStorage.staticInt9 + 10) {
                                staticBool34 = false;
                                staticMethod311(StaticClass6.staticInt42, AABBClickboxDebug.staticInt317, StaticClass1.staticInt1, WorldMapRegionStorage.staticInt9);
                            }
                        }

                        if (i_2 == 1 || !SoundBank.staticBool11 && i_2 == 4) {
                            i_3 = StaticClass6.staticInt42;
                            i_4 = AABBClickboxDebug.staticInt317;
                            i_5 = StaticClass1.staticInt1;
                            i_6 = MouseHandler.staticInt30;
                            i_7 = MouseHandler.staticInt31;
                            i_15 = -1;

                            int i_17;
                            for (i_17 = 0; i_17 < staticInt225; i_17++) {
                                i_10 = (staticInt225 - 1 - i_17) * 15 + i_4 + 31;
                                if (i_6 > i_3 && i_6 < i_3 + i_5 && i_7 > i_10 - 13 && i_7 < i_10 + 3)
                                    i_15 = i_17;
                            }

                            if (i_15 != -1 && i_15 >= 0) {
                                i_17 = staticIntArray79[i_15];
                                i_10 = staticIntArray101[i_15];
                                int i_11 = staticIntArray97[i_15];
                                int i_12 = staticIntArray80[i_15];
                                String string_13 = staticStringArray8[i_15];
                                String string_14 = staticStringArray9[i_15];
                                staticMethod314(i_17, i_10, i_11, i_12, string_13, string_14, MouseHandler.staticInt30, MouseHandler.staticInt31);
                            }

                            staticBool34 = false;
                            staticMethod311(StaticClass6.staticInt42, AABBClickboxDebug.staticInt317, StaticClass1.staticInt1, WorldMapRegionStorage.staticInt9);
                        }
                    } else {
                        i_3 = staticInt225 - 1;
                        if ((i_2 == 1 || !SoundBank.staticBool11 && i_2 == 4) && i_3 >= 0) {
                            i_5 = staticIntArray97[i_3];
                            if (i_5 == 39 || i_5 == 40 || i_5 == 41 || i_5 == 42 || i_5 == 43 || i_5 == 33 || i_5 == 34 || i_5 == 35 || i_5 == 36 || i_5 == 37 || i_5 == 38 || i_5 == 1005) {
                                i_6 = staticIntArray79[i_3];
                                i_7 = staticIntArray101[i_3];
                                Widget widget_8 = Widget.staticMethod381(i_7);
                                i_10 = staticMethod360(widget_8);
                                boolean bool_9 = (i_10 >> 28 & 0x1) != 0;
                                if (bool_9)
                                    break label190;

                                StaticClass39 staticclass39_10000 = null;
                                if (StaticClass39.staticMethod180(staticMethod360(widget_8)))
                                    break label190;
                            }
                        }

                        if ((i_2 == 1 || !SoundBank.staticBool11 && i_2 == 4) && method405())
                            i_2 = 2;

                        if ((i_2 == 1 || !SoundBank.staticBool11 && i_2 == 4) && staticInt225 > 0 && i_3 >= 0) {
                            i_5 = staticIntArray79[i_3];
                            i_6 = staticIntArray101[i_3];
                            i_7 = staticIntArray97[i_3];
                            i_15 = staticIntArray80[i_3];
                            String string_16 = staticStringArray8[i_3];
                            String string_18 = staticStringArray9[i_3];
                            staticMethod314(i_5, i_6, i_7, i_15, string_16, string_18, MouseHandler.staticInt30, MouseHandler.staticInt31);
                        }

                        if (i_2 == 2 && staticInt225 > 0)
                            method406(MouseHandler.staticInt30, MouseHandler.staticInt31);
                    }

                    return;
                }

                if (ClanMember.staticWidget7 != null && !staticBool40 && staticInt225 > 0 && !method405())
                    staticMethod341(staticInt224, staticInt277);

                staticBool40 = false;
                staticInt274 = 0;
                if (ClanMember.staticWidget7 != null)
                    staticMethod342(ClanMember.staticWidget7);

                ClanMember.staticWidget7 = Widget.staticMethod381(i_7);
                staticInt223 = i_6;
                staticInt224 = MouseHandler.staticInt30;
                staticInt277 = MouseHandler.staticInt31;
                if (i_3 >= 0) {
                    WMEnum2.staticContextMenuItem1 = new ContextMenuItem();
                    WMEnum2.staticContextMenuItem1.int102 = staticIntArray79[i_3];
                    WMEnum2.staticContextMenuItem1.int101 = staticIntArray101[i_3];
                    WMEnum2.staticContextMenuItem1.int100 = staticIntArray97[i_3];
                    WMEnum2.staticContextMenuItem1.int103 = staticIntArray80[i_3];
                    WMEnum2.staticContextMenuItem1.string10 = staticStringArray8[i_3];
                }

                staticMethod342(ClanMember.staticWidget7);
            }
    }

    final boolean method405() {
        int i_2 = staticInt225 - 1;
        if (staticInt225 > 2) {
            if (staticInt232 != 1 || staticBoolArray4[i_2]) {
                boolean bool_4;
                if (i_2 < 0)
                    bool_4 = false;
                else {
                    int i_5 = staticIntArray97[i_2];
                    if (i_5 >= 2000)
                        i_5 -= 2000;

                    if (i_5 == 1007)
                        bool_4 = true;
                    else
                        bool_4 = false;
                }

                if (!bool_4)
                    return false;
            }

            return true;
        } else
            return false;
    }

    final void method406(int i_1, int i_2) {
        int i_4 = Friend.staticFontFace2.stringWidth("Choose Option");

        int i_5;
        int i_6;
        for (i_5 = 0; i_5 < staticInt225; i_5++) {
            i_6 = Friend.staticFontFace2.stringWidth(staticMethod320(i_5));
            if (i_6 > i_4)
                i_4 = i_6;
        }

        i_4 += 8;
        i_5 = 22 + staticInt225 * 15;
        i_6 = i_1 - i_4 / 2;
        if (i_6 + i_4 > StaticClass5.staticInt35)
            i_6 = StaticClass5.staticInt35 - i_4;

        if (i_6 < 0)
            i_6 = 0;

        int i_7 = i_2;
        if (i_2 + i_5 > Class2.staticInt16)
            i_7 = Class2.staticInt16 - i_5;

        if (i_7 < 0)
            i_7 = 0;

        LegacyClickboxDebug.staticScene1.method214(DataClass14.staticInt156, i_1, i_2, false);
        staticBool34 = true;
        StaticClass6.staticInt42 = i_6;
        AABBClickboxDebug.staticInt317 = i_7;
        StaticClass1.staticInt1 = i_4;
        WorldMapRegionStorage.staticInt9 = staticInt225 * 15 + 22;
    }

    static final void staticMethod313(ContextMenuItem contextmenuitem_0, int i_1, int i_2) {
        staticMethod314(contextmenuitem_0.int102, contextmenuitem_0.int101, contextmenuitem_0.int100, contextmenuitem_0.int103, contextmenuitem_0.string10, contextmenuitem_0.string10, i_1, i_2);
    }

    static final void staticMethod314(int i_0, int i_1, int i_2, int i_3, String string_4, String string_5, int i_6, int i_7) {
        if (i_2 >= 2000)
            i_2 -= 2000;

        if (i_2 == 37) {
            staticPacket1.writeOpcode(80);
            staticPacket1.method474(i_0);
            staticPacket1.method483(i_1);
            staticPacket1.method473(i_3);
            staticInt221 = 0;
            DataClass9.staticWidget5 = Widget.staticMethod381(i_1);
            staticInt222 = i_0;
        }

        Player player_9;
        if (i_2 == 50) {
            player_9 = players[i_3];
            if (player_9 != null) {
                staticInt218 = i_6;
                staticInt219 = i_7;
                staticInt220 = 2;
                staticInt288 = 0;
                staticInt179 = i_0;
                staticInt281 = i_1;
                staticPacket1.writeOpcode(4);
                staticPacket1.method465(KeyboardHandler.staticBoolArray1[82] ? 1 : 0);
                staticPacket1.method474(i_3);
            }
        }

        if (i_2 == 20) {
            staticInt218 = i_6;
            staticInt219 = i_7;
            staticInt220 = 2;
            staticInt288 = 0;
            staticInt179 = i_0;
            staticInt281 = i_1;
            staticPacket1.writeOpcode(186);
            staticPacket1.method474(Class4.staticInt53 + i_1);
            staticPacket1.writeShort(i_3);
            staticPacket1.method474(i_0 + DataClass10.staticInt111);
            staticPacket1.method465(KeyboardHandler.staticBoolArray1[82] ? 1 : 0);
        }

        int i_10;
        Widget widget_13;
        if (i_2 == 28) {
            staticPacket1.writeOpcode(221);
            staticPacket1.writeInt(i_1);

            System.out.println(String.format("buttonClick: interface=%d button=%d", i_1 << 16, i_1 & 0xFFFF));

            widget_13 = Widget.staticMethod381(i_1);
            if (widget_13.intArrayArray12 != null && widget_13.intArrayArray12[0][0] == 5) {
                i_10 = widget_13.intArrayArray12[0][1];
                StaticClass44.staticIntArray68[i_10] = 1 - StaticClass44.staticIntArray68[i_10];
                staticMethod348(i_10);
            }
        }

        if (i_2 == 47) {
            player_9 = players[i_3];
            if (player_9 != null) {
                staticInt218 = i_6;
                staticInt219 = i_7;
                staticInt220 = 2;
                staticInt288 = 0;
                staticInt179 = i_0;
                staticInt281 = i_1;
                staticPacket1.writeOpcode(120);
                staticPacket1.method474(i_3);
                staticPacket1.method465(KeyboardHandler.staticBoolArray1[82] ? 1 : 0);
            }
        }

        if (i_2 == 21) {
            staticInt218 = i_6;
            staticInt219 = i_7;
            staticInt220 = 2;
            staticInt288 = 0;
            staticInt179 = i_0;
            staticInt281 = i_1;
            staticPacket1.writeOpcode(193);
            staticPacket1.method473(i_3);
            staticPacket1.method475(Class4.staticInt53 + i_1);
            staticPacket1.writeByte(KeyboardHandler.staticBoolArray1[82] ? 1 : 0);
            staticPacket1.method474(i_0 + DataClass10.staticInt111);
        }

        if (i_2 == 44) {
            player_9 = players[i_3];
            if (player_9 != null) {
                staticInt218 = i_6;
                staticInt219 = i_7;
                staticInt220 = 2;
                staticInt288 = 0;
                staticInt179 = i_0;
                staticInt281 = i_1;
                staticPacket1.writeOpcode(166);
                staticPacket1.method465(KeyboardHandler.staticBoolArray1[82] ? 1 : 0);
                staticPacket1.method473(i_3);
            }
        }

        if (i_2 == 2) {
            staticInt218 = i_6;
            staticInt219 = i_7;
            staticInt220 = 2;
            staticInt288 = 0;
            staticInt179 = i_0;
            staticInt281 = i_1;
            staticPacket1.writeOpcode(189);
            staticPacket1.writeShort(i_3 >> 14 & 0x7fff);
            staticPacket1.method474(i_0 + DataClass10.staticInt111);
            staticPacket1.method483(WM3.staticInt154);
            staticPacket1.method474(staticInt238);
            staticPacket1.method474(Class4.staticInt53 + i_1);
            staticPacket1.method466(KeyboardHandler.staticBoolArray1[82] ? 1 : 0);
        }

        if (i_2 == 18) {
            staticInt218 = i_6;
            staticInt219 = i_7;
            staticInt220 = 2;
            staticInt288 = 0;
            staticInt179 = i_0;
            staticInt281 = i_1;
            staticPacket1.writeOpcode(21);
            staticPacket1.method474(DataClass10.staticInt111 + i_0);
            staticPacket1.writeByte(KeyboardHandler.staticBoolArray1[82] ? 1 : 0);
            staticPacket1.method475(i_3);
            staticPacket1.method473(i_1 + Class4.staticInt53);
        }

        if (i_2 == 32) {
            staticPacket1.writeOpcode(26);
            staticPacket1.method474(i_3);
            staticPacket1.method484(WM3.staticInt154);
            staticPacket1.writeShort(i_0);
            staticPacket1.method474(staticInt238);
            staticPacket1.method482(i_1);
            staticInt221 = 0;
            DataClass9.staticWidget5 = Widget.staticMethod381(i_1);
            staticInt222 = i_0;
        }

        Npc npc_14;
        if (i_2 == 11) {
            npc_14 = staticNpcArray1[i_3];
            if (npc_14 != null) {
                staticInt218 = i_6;
                staticInt219 = i_7;
                staticInt220 = 2;
                staticInt288 = 0;
                staticInt179 = i_0;
                staticInt281 = i_1;
                staticPacket1.writeOpcode(161);
                staticPacket1.method466(KeyboardHandler.staticBoolArray1[82] ? 1 : 0);
                staticPacket1.method473(i_3);
            }
        }

        if (i_2 == 13) {
            npc_14 = staticNpcArray1[i_3];
            if (npc_14 != null) {
                staticInt218 = i_6;
                staticInt219 = i_7;
                staticInt220 = 2;
                staticInt288 = 0;
                staticInt179 = i_0;
                staticInt281 = i_1;
                staticPacket1.writeOpcode(239);
                staticPacket1.method465(KeyboardHandler.staticBoolArray1[82] ? 1 : 0);
                staticPacket1.method473(i_3);
            }
        }

        if (i_2 == 43) {
            staticPacket1.writeOpcode(42);
            staticPacket1.method482(i_1);
            staticPacket1.writeShort(i_0);
            staticPacket1.method475(i_3);
            staticInt221 = 0;
            DataClass9.staticWidget5 = Widget.staticMethod381(i_1);
            staticInt222 = i_0;
        }

        if (i_2 == 3) {
            staticInt218 = i_6;
            staticInt219 = i_7;
            staticInt220 = 2;
            staticInt288 = 0;
            staticInt179 = i_0;
            staticInt281 = i_1;
            staticPacket1.writeOpcode(160);
            staticPacket1.method474(i_3 >> 14 & 0x7fff);
            staticPacket1.method473(DataClass10.staticInt111 + i_0);
            staticPacket1.writeByte(KeyboardHandler.staticBoolArray1[82] ? 1 : 0);
            staticPacket1.method474(Class4.staticInt53 + i_1);
        }

        if (i_2 == 51) {
            player_9 = players[i_3];
            if (player_9 != null) {
                staticInt218 = i_6;
                staticInt219 = i_7;
                staticInt220 = 2;
                staticInt288 = 0;
                staticInt179 = i_0;
                staticInt281 = i_1;
                staticPacket1.writeOpcode(65);
                staticPacket1.writeByte(KeyboardHandler.staticBoolArray1[82] ? 1 : 0);
                staticPacket1.method473(i_3);
            }
        }

        if (i_2 == 4) {
            staticInt218 = i_6;
            staticInt219 = i_7;
            staticInt220 = 2;
            staticInt288 = 0;
            staticInt179 = i_0;
            staticInt281 = i_1;
            staticPacket1.writeOpcode(130);
            staticPacket1.method475(Class4.staticInt53 + i_1);
            staticPacket1.method466(KeyboardHandler.staticBoolArray1[82] ? 1 : 0);
            staticPacket1.writeShort(i_3 >> 14 & 0x7fff);
            staticPacket1.method473(DataClass10.staticInt111 + i_0);
        }

        if (i_2 == 1003) {
            staticInt218 = i_6;
            staticInt219 = i_7;
            staticInt220 = 2;
            staticInt288 = 0;
            npc_14 = staticNpcArray1[i_3];
            if (npc_14 != null) {
                NpcType npctype_15 = npc_14.npcType1;
                if (npctype_15.intArray90 != null)
                    npctype_15 = npctype_15.method568();

                if (npctype_15 != null) {
                    staticPacket1.writeOpcode(236);
                    staticPacket1.writeShort(npctype_15.int538);
                }
            }
        }

        if (i_2 == 10) {
            npc_14 = staticNpcArray1[i_3];
            if (npc_14 != null) {
                staticInt218 = i_6;
                staticInt219 = i_7;
                staticInt220 = 2;
                staticInt288 = 0;
                staticInt179 = i_0;
                staticInt281 = i_1;
                staticPacket1.writeOpcode(220);
                staticPacket1.writeShort(i_3);
                staticPacket1.method465(KeyboardHandler.staticBoolArray1[82] ? 1 : 0);
            }
        }

        if (i_2 == 1001) {
            staticInt218 = i_6;
            staticInt219 = i_7;
            staticInt220 = 2;
            staticInt288 = 0;
            staticInt179 = i_0;
            staticInt281 = i_1;
            staticPacket1.writeOpcode(111);
            staticPacket1.method473(i_1 + Class4.staticInt53);
            staticPacket1.writeByte(KeyboardHandler.staticBoolArray1[82] ? 1 : 0);
            staticPacket1.method473(i_3 >> 14 & 0x7fff);
            staticPacket1.method473(i_0 + DataClass10.staticInt111);
        }

        if (i_2 == 17) {
            staticInt218 = i_6;
            staticInt219 = i_7;
            staticInt220 = 2;
            staticInt288 = 0;
            staticInt179 = i_0;
            staticInt281 = i_1;
            staticPacket1.writeOpcode(25);
            staticPacket1.method475(Class4.staticInt53 + i_1);
            staticPacket1.method473(staticInt238);
            staticPacket1.writeInt(WM3.staticInt154);
            staticPacket1.writeShort(i_0 + DataClass10.staticInt111);
            staticPacket1.method465(KeyboardHandler.staticBoolArray1[82] ? 1 : 0);
            staticPacket1.method473(i_3);
        }

        if (i_2 == 42) {
            staticPacket1.writeOpcode(241);
            staticPacket1.method475(i_3);
            staticPacket1.method482(i_1);
            staticPacket1.method473(i_0);
            staticInt221 = 0;
            DataClass9.staticWidget5 = Widget.staticMethod381(i_1);
            staticInt222 = i_0;
        }

        if (i_2 == 31) {
            staticPacket1.writeOpcode(213);
            staticPacket1.method483(WM3.staticInt153);
            staticPacket1.writeShort(i_0);
            staticPacket1.method474(i_3);
            staticPacket1.method473(Friend.staticInt43);
            staticPacket1.method482(i_1);
            staticPacket1.method475(WorldMapDecor.staticInt15);
            staticInt221 = 0;
            DataClass9.staticWidget5 = Widget.staticMethod381(i_1);
            staticInt222 = i_0;
        }

        if (i_2 == 19) {
            staticInt218 = i_6;
            staticInt219 = i_7;
            staticInt220 = 2;
            staticInt288 = 0;
            staticInt179 = i_0;
            staticInt281 = i_1;
            staticPacket1.writeOpcode(11);
            staticPacket1.writeShort(i_1 + Class4.staticInt53);
            staticPacket1.method466(KeyboardHandler.staticBoolArray1[82] ? 1 : 0);
            staticPacket1.method473(i_3);
            staticPacket1.method474(i_0 + DataClass10.staticInt111);
        }

        if (i_2 == 40) {
            staticPacket1.writeOpcode(202);
            staticPacket1.method484(i_1);
            staticPacket1.method474(i_3);
            staticPacket1.method475(i_0);
            staticInt221 = 0;
            DataClass9.staticWidget5 = Widget.staticMethod381(i_1);
            staticInt222 = i_0;
        }

        if (i_2 == 8) {
            npc_14 = staticNpcArray1[i_3];
            if (npc_14 != null) {
                staticInt218 = i_6;
                staticInt219 = i_7;
                staticInt220 = 2;
                staticInt288 = 0;
                staticInt179 = i_0;
                staticInt281 = i_1;
                staticPacket1.writeOpcode(181);
                staticPacket1.method465(KeyboardHandler.staticBoolArray1[82] ? 1 : 0);
                staticPacket1.method473(i_3);
                staticPacket1.method473(staticInt238);
                staticPacket1.method484(WM3.staticInt154);
            }
        }

        if (i_2 == 29) {
            staticPacket1.writeOpcode(221);
            staticPacket1.writeInt(i_1);
            widget_13 = Widget.staticMethod381(i_1);
            if (widget_13.intArrayArray12 != null && widget_13.intArrayArray12[0][0] == 5) {
                i_10 = widget_13.intArrayArray12[0][1];
                if (StaticClass44.staticIntArray68[i_10] != widget_13.intArray51[0]) {
                    StaticClass44.staticIntArray68[i_10] = widget_13.intArray51[0];
                    staticMethod348(i_10);
                }
            }
        }

        if (i_2 == 26)
            staticMethod349();

        if (i_2 == 14) {
            player_9 = players[i_3];
            if (player_9 != null) {
                staticInt218 = i_6;
                staticInt219 = i_7;
                staticInt220 = 2;
                staticInt288 = 0;
                staticInt179 = i_0;
                staticInt281 = i_1;
                staticPacket1.writeOpcode(104);
                staticPacket1.writeShort(WorldMapDecor.staticInt15);
                staticPacket1.writeShort(i_3);
                staticPacket1.method483(WM3.staticInt153);
                staticPacket1.writeByte(KeyboardHandler.staticBoolArray1[82] ? 1 : 0);
                staticPacket1.method473(Friend.staticInt43);
            }
        }

        if (i_2 == 58) {
            widget_13 = Widget.staticMethod382(i_1, i_0);
            if (widget_13 != null) {
                staticPacket1.writeOpcode(253);
                staticPacket1.method474(staticInt239);
                staticPacket1.writeInt(i_1);
                staticPacket1.method474(widget_13.int453);
                staticPacket1.method474(staticInt238);
                staticPacket1.method482(WM3.staticInt154);
                staticPacket1.method475(i_0);
            }
        }

        if (i_2 == 16) {
            staticInt218 = i_6;
            staticInt219 = i_7;
            staticInt220 = 2;
            staticInt288 = 0;
            staticInt179 = i_0;
            staticInt281 = i_1;
            staticPacket1.writeOpcode(1);
            staticPacket1.method474(i_3);
            staticPacket1.method483(WM3.staticInt153);
            staticPacket1.method475(i_1 + Class4.staticInt53);
            staticPacket1.method473(i_0 + DataClass10.staticInt111);
            staticPacket1.method466(KeyboardHandler.staticBoolArray1[82] ? 1 : 0);
            staticPacket1.writeShort(WorldMapDecor.staticInt15);
            staticPacket1.writeShort(Friend.staticInt43);
        }

        if (i_2 == 48) {
            player_9 = players[i_3];
            if (player_9 != null) {
                staticInt218 = i_6;
                staticInt219 = i_7;
                staticInt220 = 2;
                staticInt288 = 0;
                staticInt179 = i_0;
                staticInt281 = i_1;
                staticPacket1.writeOpcode(214);
                staticPacket1.method475(i_3);
                staticPacket1.method465(KeyboardHandler.staticBoolArray1[82] ? 1 : 0);
            }
        }

        if (i_2 == 7) {
            npc_14 = staticNpcArray1[i_3];
            if (npc_14 != null) {
                staticInt218 = i_6;
                staticInt219 = i_7;
                staticInt220 = 2;
                staticInt288 = 0;
                staticInt179 = i_0;
                staticInt281 = i_1;
                staticPacket1.writeOpcode(46);
                staticPacket1.method483(WM3.staticInt153);
                staticPacket1.writeByte(KeyboardHandler.staticBoolArray1[82] ? 1 : 0);
                staticPacket1.writeShort(i_3);
                staticPacket1.method473(Friend.staticInt43);
                staticPacket1.method473(WorldMapDecor.staticInt15);
            }
        }

        if (i_2 == 34) {
            staticPacket1.writeOpcode(218);
            staticPacket1.writeShort(i_3);
            staticPacket1.method482(i_1);
            staticPacket1.writeShort(i_0);
            staticInt221 = 0;
            DataClass9.staticWidget5 = Widget.staticMethod381(i_1);
            staticInt222 = i_0;
        }

        if (i_2 == 22) {
            staticInt218 = i_6;
            staticInt219 = i_7;
            staticInt220 = 2;
            staticInt288 = 0;
            staticInt179 = i_0;
            staticInt281 = i_1;
            staticPacket1.writeOpcode(205);
            staticPacket1.method475(i_3);
            staticPacket1.method464(KeyboardHandler.staticBoolArray1[82] ? 1 : 0);
            staticPacket1.method475(i_1 + Class4.staticInt53);
            staticPacket1.method475(i_0 + DataClass10.staticInt111);
        }

        if (i_2 == 30 && staticWidget11 == null) {
            staticPacket1.writeOpcode(250);
            staticPacket1.writeInt(i_1);
            staticPacket1.method473(i_0);
            staticWidget11 = Widget.staticMethod382(i_1, i_0);
            staticMethod342(staticWidget11);
        }

        if (i_2 == 23)
            if (staticBool34)
                LegacyClickboxDebug.staticScene1.method215();
            else
                LegacyClickboxDebug.staticScene1.method214(DataClass14.staticInt156, i_0, i_1, true);

        if (i_2 == 24) {
            widget_13 = Widget.staticMethod381(i_1);
            boolean bool_16 = true;
            if (widget_13.int396 > 0)
                bool_16 = staticMethod351(widget_13);

            if (bool_16) {
                staticPacket1.writeOpcode(221);
                staticPacket1.writeInt(i_1);
            }
        }

        if (i_2 == 45) {
            player_9 = players[i_3];
            if (player_9 != null) {
                staticInt218 = i_6;
                staticInt219 = i_7;
                staticInt220 = 2;
                staticInt288 = 0;
                staticInt179 = i_0;
                staticInt281 = i_1;
                staticPacket1.writeOpcode(231);
                staticPacket1.method464(KeyboardHandler.staticBoolArray1[82] ? 1 : 0);
                staticPacket1.method474(i_3);
            }
        }

        if (i_2 == 12) {
            npc_14 = staticNpcArray1[i_3];
            if (npc_14 != null) {
                staticInt218 = i_6;
                staticInt219 = i_7;
                staticInt220 = 2;
                staticInt288 = 0;
                staticInt179 = i_0;
                staticInt281 = i_1;
                staticPacket1.writeOpcode(61);
                staticPacket1.method473(i_3);
                staticPacket1.writeByte(KeyboardHandler.staticBoolArray1[82] ? 1 : 0);
            }
        }

        if (i_2 == 1002) {
            staticInt218 = i_6;
            staticInt219 = i_7;
            staticInt220 = 2;
            staticInt288 = 0;
            staticPacket1.writeOpcode(204);
            staticPacket1.writeShort(i_3 >> 14 & 0x7fff);
        }

        if (i_2 == 41) {
            staticPacket1.writeOpcode(102);
            staticPacket1.method474(i_0);
            staticPacket1.method475(i_3);
            staticPacket1.method482(i_1);
            staticInt221 = 0;
            DataClass9.staticWidget5 = Widget.staticMethod381(i_1);
            staticInt222 = i_0;
        }

        if (i_2 == 38) {
            staticMethod316();
            widget_13 = Widget.staticMethod381(i_1);
            staticInt194 = 1;
            WorldMapDecor.staticInt15 = i_0;
            WM3.staticInt153 = i_1;
            Friend.staticInt43 = i_3;
            staticMethod342(widget_13);
            staticString315 = StaticClass13.staticMethod64(16748608) + ObjType.staticMethod421(i_3).name + StaticClass13.staticMethod64(16777215);
            if (staticString315 == null)
                staticString315 = "null";

        } else {
            if (i_2 == 57 || i_2 == 1007) {
                widget_13 = Widget.staticMethod382(i_1, i_0);
                if (widget_13 != null) {
                    i_10 = widget_13.int453;
                    Widget widget_11 = Widget.staticMethod382(i_1, i_0);
                    if (widget_11 != null) {
                        if (widget_11.objectArray18 != null) {
                            RuneScript runescript_12 = new RuneScript();
                            runescript_12.widget2 = widget_11;
                            runescript_12.int314 = i_3;
                            runescript_12.string21 = string_5;
                            runescript_12.objectArray1 = widget_11.objectArray18;
                            StaticClass15.staticMethod79(runescript_12);
                        }

                        boolean bool_17 = true;
                        if (widget_11.int396 > 0)
                            bool_17 = staticMethod351(widget_11);

                        if (bool_17 && StaticClass39.staticMethod176(staticMethod360(widget_11), i_3 - 1)) {
                            if (i_3 == 1) {
                                staticPacket1.writeOpcode(77);
                                staticPacket1.writeInt(i_1);
                                staticPacket1.writeShort(i_0);
                                staticPacket1.writeShort(i_10);
                            }

                            if (i_3 == 2) {
                                staticPacket1.writeOpcode(60);
                                staticPacket1.writeInt(i_1);
                                staticPacket1.writeShort(i_0);
                                staticPacket1.writeShort(i_10);
                            }

                            if (i_3 == 3) {
                                staticPacket1.writeOpcode(135);
                                staticPacket1.writeInt(i_1);
                                staticPacket1.writeShort(i_0);
                                staticPacket1.writeShort(i_10);
                            }

                            if (i_3 == 4) {
                                staticPacket1.writeOpcode(246);
                                staticPacket1.writeInt(i_1);
                                staticPacket1.writeShort(i_0);
                                staticPacket1.writeShort(i_10);
                            }

                            if (i_3 == 5) {
                                staticPacket1.writeOpcode(152);
                                staticPacket1.writeInt(i_1);
                                staticPacket1.writeShort(i_0);
                                staticPacket1.writeShort(i_10);
                            }

                            if (i_3 == 6) {
                                staticPacket1.writeOpcode(177);
                                staticPacket1.writeInt(i_1);
                                staticPacket1.writeShort(i_0);
                                staticPacket1.writeShort(i_10);
                            }

                            if (i_3 == 7) {
                                staticPacket1.writeOpcode(244);
                                staticPacket1.writeInt(i_1);
                                staticPacket1.writeShort(i_0);
                                staticPacket1.writeShort(i_10);
                            }

                            if (i_3 == 8) {
                                staticPacket1.writeOpcode(109);
                                staticPacket1.writeInt(i_1);
                                staticPacket1.writeShort(i_0);
                                staticPacket1.writeShort(i_10);
                            }

                            if (i_3 == 9) {
                                staticPacket1.writeOpcode(142);
                                staticPacket1.writeInt(i_1);
                                staticPacket1.writeShort(i_0);
                                staticPacket1.writeShort(i_10);
                            }

                            if (i_3 == 10) {
                                staticPacket1.writeOpcode(195);
                                staticPacket1.writeInt(i_1);
                                staticPacket1.writeShort(i_0);
                                staticPacket1.writeShort(i_10);
                            }
                        }
                    }
                }
            }

            if (i_2 == 39) {
                staticPacket1.writeOpcode(44);
                staticPacket1.writeShort(i_3);
                staticPacket1.method474(i_0);
                staticPacket1.method482(i_1);
                staticInt221 = 0;
                DataClass9.staticWidget5 = Widget.staticMethod381(i_1);
                staticInt222 = i_0;
            }

            if (i_2 == 36) {
                staticPacket1.writeOpcode(0);
                staticPacket1.method473(i_0);
                staticPacket1.method475(i_3);
                staticPacket1.method482(i_1);
                staticInt221 = 0;
                DataClass9.staticWidget5 = Widget.staticMethod381(i_1);
                staticInt222 = i_0;
            }

            if (i_2 == 35) {
                staticPacket1.writeOpcode(93);
                staticPacket1.method473(i_3);
                staticPacket1.method475(i_0);
                staticPacket1.method483(i_1);
                staticInt221 = 0;
                DataClass9.staticWidget5 = Widget.staticMethod381(i_1);
                staticInt222 = i_0;
            }

            if (i_2 == 6) {
                staticInt218 = i_6;
                staticInt219 = i_7;
                staticInt220 = 2;
                staticInt288 = 0;
                staticInt179 = i_0;
                staticInt281 = i_1;
                staticPacket1.writeOpcode(167);
                staticPacket1.method473(i_3 >> 14 & 0x7fff);
                staticPacket1.method473(i_1 + Class4.staticInt53);
                staticPacket1.method475(DataClass10.staticInt111 + i_0);
                staticPacket1.method465(KeyboardHandler.staticBoolArray1[82] ? 1 : 0);
            }

            if (i_2 == 46) {
                player_9 = players[i_3];
                if (player_9 != null) {
                    staticInt218 = i_6;
                    staticInt219 = i_7;
                    staticInt220 = 2;
                    staticInt288 = 0;
                    staticInt179 = i_0;
                    staticInt281 = i_1;
                    staticPacket1.writeOpcode(9);
                    staticPacket1.method464(KeyboardHandler.staticBoolArray1[82] ? 1 : 0);
                    staticPacket1.method475(i_3);
                }
            }

            if (i_2 == 15) {
                player_9 = players[i_3];
                if (player_9 != null) {
                    staticInt218 = i_6;
                    staticInt219 = i_7;
                    staticInt220 = 2;
                    staticInt288 = 0;
                    staticInt179 = i_0;
                    staticInt281 = i_1;
                    staticPacket1.writeOpcode(148);
                    staticPacket1.method475(staticInt238);
                    staticPacket1.writeInt(WM3.staticInt154);
                    staticPacket1.writeByte(KeyboardHandler.staticBoolArray1[82] ? 1 : 0);
                    staticPacket1.method473(i_3);
                }
            }

            if (i_2 == 25) {
                widget_13 = Widget.staticMethod382(i_1, i_0);
                if (widget_13 != null) {
                    staticMethod316();
                    staticMethod315(i_1, i_0, StaticClass39.staticMethod177(staticMethod360(widget_13)), widget_13.int453);
                    staticInt194 = 0;
                    staticString316 = staticMethod363(widget_13);
                    if (staticString316 == null)
                        staticString316 = "Null";

                    if (widget_13.bool34)
                        staticString313 = widget_13.string24 + StaticClass13.staticMethod64(16777215);
                    else
                        staticString313 = StaticClass13.staticMethod64(65280) + widget_13.string28 + StaticClass13.staticMethod64(16777215);
                }

            } else {
                if (i_2 == 1008 || i_2 == 1009 || i_2 == 1010 || i_2 == 1011 || i_2 == 1012)
                    GameObject.staticClass11_1.method376(i_2, i_3, new WorldMapCoord(i_0), new WorldMapCoord(i_1));

                if (i_2 == 5) {
                    staticInt218 = i_6;
                    staticInt219 = i_7;
                    staticInt220 = 2;
                    staticInt288 = 0;
                    staticInt179 = i_0;
                    staticInt281 = i_1;
                    staticPacket1.writeOpcode(86);
                    staticPacket1.method473(Class4.staticInt53 + i_1);
                    staticPacket1.method475(i_3 >> 14 & 0x7fff);
                    staticPacket1.method465(KeyboardHandler.staticBoolArray1[82] ? 1 : 0);
                    staticPacket1.method475(DataClass10.staticInt111 + i_0);
                }

                if (i_2 == 49) {
                    player_9 = players[i_3];
                    if (player_9 != null) {
                        staticInt218 = i_6;
                        staticInt219 = i_7;
                        staticInt220 = 2;
                        staticInt288 = 0;
                        staticInt179 = i_0;
                        staticInt281 = i_1;
                        staticPacket1.writeOpcode(5);
                        staticPacket1.method465(KeyboardHandler.staticBoolArray1[82] ? 1 : 0);
                        staticPacket1.method474(i_3);
                    }
                }

                if (i_2 == 33) {
                    staticPacket1.writeOpcode(171);
                    staticPacket1.method482(i_1);
                    staticPacket1.method475(i_3);
                    staticPacket1.method473(i_0);
                    staticInt221 = 0;
                    DataClass9.staticWidget5 = Widget.staticMethod381(i_1);
                    staticInt222 = i_0;
                }

                if (i_2 == 9) {
                    npc_14 = staticNpcArray1[i_3];
                    if (npc_14 != null) {
                        staticInt218 = i_6;
                        staticInt219 = i_7;
                        staticInt220 = 2;
                        staticInt288 = 0;
                        staticInt179 = i_0;
                        staticInt281 = i_1;
                        staticPacket1.writeOpcode(29);
                        staticPacket1.method464(KeyboardHandler.staticBoolArray1[82] ? 1 : 0);
                        staticPacket1.method473(i_3);
                    }
                }

                if (i_2 == 1004) {
                    staticInt218 = i_6;
                    staticInt219 = i_7;
                    staticInt220 = 2;
                    staticInt288 = 0;
                    staticPacket1.writeOpcode(158);
                    staticPacket1.method473(i_3);
                }

                if (i_2 == 1) {
                    staticInt218 = i_6;
                    staticInt219 = i_7;
                    staticInt220 = 2;
                    staticInt288 = 0;
                    staticInt179 = i_0;
                    staticInt281 = i_1;
                    staticPacket1.writeOpcode(162);
                    staticPacket1.method466(KeyboardHandler.staticBoolArray1[82] ? 1 : 0);
                    staticPacket1.method475(i_3 >> 14 & 0x7fff);
                    staticPacket1.method473(Friend.staticInt43);
                    staticPacket1.writeShort(i_1 + Class4.staticInt53);
                    staticPacket1.writeShort(DataClass10.staticInt111 + i_0);
                    staticPacket1.method474(WorldMapDecor.staticInt15);
                    staticPacket1.method482(WM3.staticInt153);
                }

                if (i_2 == 1005) {
                    widget_13 = Widget.staticMethod381(i_1);
                    if (widget_13 != null && widget_13.intArray59[i_0] >= 100000)
                        StaticClass12.staticMethod59(27, "", widget_13.intArray59[i_0] + " x " + ObjType.staticMethod421(i_3).name);
                    else {
                        staticPacket1.writeOpcode(158);
                        staticPacket1.method473(i_3);
                    }

                    staticInt221 = 0;
                    DataClass9.staticWidget5 = Widget.staticMethod381(i_1);
                    staticInt222 = i_0;
                }

                if (staticInt194 != 0) {
                    staticInt194 = 0;
                    staticMethod342(Widget.staticMethod381(WM3.staticInt153));
                }

                if (staticBool36)
                    staticMethod316();

                if (DataClass9.staticWidget5 != null && staticInt221 == 0)
                    staticMethod342(DataClass9.staticWidget5);

            }
        }
    }

    static void staticMethod315(int i_0, int i_1, int i_2, int i_3) {
        Widget widget_5 = Widget.staticMethod382(i_0, i_1);
        if (widget_5 != null && widget_5.objectArray14 != null) {
            RuneScript runescript_6 = new RuneScript();
            runescript_6.widget2 = widget_5;
            runescript_6.objectArray1 = widget_5.objectArray14;
            StaticClass15.staticMethod79(runescript_6);
        }

        staticInt239 = i_3;
        staticBool36 = true;
        WM3.staticInt154 = i_0;
        staticInt238 = i_1;
        Class1.staticInt3 = i_2;
        staticMethod342(widget_5);
    }

    static void staticMethod316() {
        if (staticBool36) {
            Widget widget_1 = Widget.staticMethod382(WM3.staticInt154, staticInt238);
            if (widget_1 != null && widget_1.objectArray15 != null) {
                RuneScript runescript_2 = new RuneScript();
                runescript_2.widget2 = widget_1;
                runescript_2.objectArray1 = widget_1.objectArray15;
                StaticClass15.staticMethod79(runescript_2);
            }

            staticBool36 = false;
            staticMethod342(widget_1);
        }
    }

    static final void staticMethod317() {
        boolean bool_1 = false;

        while (!bool_1) {
            bool_1 = true;

            for (int i_2 = 0; i_2 < staticInt225 - 1; i_2++)
                if (staticIntArray97[i_2] < 1000 && staticIntArray97[i_2 + 1] > 1000) {
                    String string_3 = staticStringArray9[i_2];
                    staticStringArray9[i_2] = staticStringArray9[i_2 + 1];
                    staticStringArray9[i_2 + 1] = string_3;
                    String string_4 = staticStringArray8[i_2];
                    staticStringArray8[i_2] = staticStringArray8[i_2 + 1];
                    staticStringArray8[i_2 + 1] = string_4;
                    int i_5 = staticIntArray97[i_2];
                    staticIntArray97[i_2] = staticIntArray97[i_2 + 1];
                    staticIntArray97[i_2 + 1] = i_5;
                    i_5 = staticIntArray79[i_2];
                    staticIntArray79[i_2] = staticIntArray79[i_2 + 1];
                    staticIntArray79[i_2 + 1] = i_5;
                    i_5 = staticIntArray101[i_2];
                    staticIntArray101[i_2] = staticIntArray101[i_2 + 1];
                    staticIntArray101[i_2 + 1] = i_5;
                    i_5 = staticIntArray80[i_2];
                    staticIntArray80[i_2] = staticIntArray80[i_2 + 1];
                    staticIntArray80[i_2 + 1] = i_5;
                    boolean bool_6 = staticBoolArray4[i_2];
                    staticBoolArray4[i_2] = staticBoolArray4[i_2 + 1];
                    staticBoolArray4[i_2 + 1] = bool_6;
                    bool_1 = false;
                }
        }

    }

    public static final void staticMethod318(String string_0, String string_1, int i_2, int i_3, int i_4, int i_5) {
        boolean bool_13 = false;
        if (!staticBool34 && staticInt225 < 500) {
            staticStringArray8[staticInt225] = string_0;
            staticStringArray9[staticInt225] = string_1;
            staticIntArray97[staticInt225] = i_2;
            staticIntArray80[staticInt225] = i_3;
            staticIntArray79[staticInt225] = i_4;
            staticIntArray101[staticInt225] = i_5;
            staticBoolArray4[staticInt225] = bool_13;
            ++staticInt225;
        }

    }

    static void staticMethod319() {
        for (int i_1 = 0; i_1 < staticInt225; i_1++) {
            int i_3 = staticIntArray97[i_1];
            boolean bool_2 = i_3 == 57 || i_3 == 58 || i_3 == 1007 || i_3 == 25 || i_3 == 30;
            if (bool_2) {
                if (i_1 < staticInt225 - 1)
                    for (int i_4 = i_1; i_4 < staticInt225 - 1; i_4++) {
                        staticStringArray8[i_4] = staticStringArray8[i_4 + 1];
                        staticStringArray9[i_4] = staticStringArray9[i_4 + 1];
                        staticIntArray97[i_4] = staticIntArray97[i_4 + 1];
                        staticIntArray80[i_4] = staticIntArray80[i_4 + 1];
                        staticIntArray79[i_4] = staticIntArray79[i_4 + 1];
                        staticIntArray101[i_4] = staticIntArray101[i_4 + 1];
                        staticBoolArray4[i_4] = staticBoolArray4[i_4 + 1];
                    }

                --staticInt225;
            }
        }

    }

    static String staticMethod320(int i_0) {
        return i_0 < 0 ? "" : staticStringArray9[i_0].length() > 0 ? staticStringArray8[i_0] + " " + staticStringArray9[i_0] : staticStringArray8[i_0];
    }

    static final void staticMethod321(NpcType npctype_0, int i_1, int i_2, int i_3) {
        if (staticInt225 < 400) {
            if (npctype_0.intArray90 != null)
                npctype_0 = npctype_0.method568();

            if (npctype_0 != null)
                if (npctype_0.bool62)
                    if (!npctype_0.bool63 || i_1 == staticInt247) {
                        String string_5 = npctype_0.string39;
                        int i_8;
                        int i_9;
                        if (npctype_0.int539 != 0) {
                            i_8 = npctype_0.int539;
                            i_9 = BufferWrapper.staticPlayer1.combatLevel;
                            int i_10 = i_9 - i_8;
                            String string_7;
                            if (i_10 < -9)
                                string_7 = StaticClass13.staticMethod64(16711680);
                            else if (i_10 < -6)
                                string_7 = StaticClass13.staticMethod64(16723968);
                            else if (i_10 < -3)
                                string_7 = StaticClass13.staticMethod64(16740352);
                            else if (i_10 < 0)
                                string_7 = StaticClass13.staticMethod64(16756736);
                            else if (i_10 > 9)
                                string_7 = StaticClass13.staticMethod64(65280);
                            else if (i_10 > 6)
                                string_7 = StaticClass13.staticMethod64(4259584);
                            else if (i_10 > 3)
                                string_7 = StaticClass13.staticMethod64(8453888);
                            else if (i_10 > 0)
                                string_7 = StaticClass13.staticMethod64(12648192);
                            else
                                string_7 = StaticClass13.staticMethod64(16776960);

                            string_5 = string_5 + string_7 + " " + " (" + "level-" + npctype_0.int539 + ")";
                        }

                        if (npctype_0.bool63 && staticBool35)
                            staticMethod318("Examine", StaticClass13.staticMethod64(16776960) + string_5, 1003, i_1, i_2, i_3);

                        if (staticInt194 == 1)
                            staticMethod318("Use", staticString315 + " " + "->" + " " + StaticClass13.staticMethod64(16776960) + string_5, 7, i_1, i_2, i_3);
                        else if (staticBool36) {
                            if ((Class1.staticInt3 & 0x2) == 2)
                                staticMethod318(staticString316, staticString313 + " " + "->" + " " + StaticClass13.staticMethod64(16776960) + string_5, 8, i_1, i_2, i_3);
                        } else {
                            int i_6 = npctype_0.bool63 && staticBool35 ? 2000 : 0;
                            String[] arr_12 = npctype_0.op;
                            if (staticBool29)
                                arr_12 = staticMethod345(arr_12);

                            if (arr_12 != null)
                                for (i_8 = 4; i_8 >= 0; --i_8)
                                    if (arr_12[i_8] != null && !arr_12[i_8].equalsIgnoreCase("Attack")) {
                                        i_9 = 0;
                                        if (i_8 == 0)
                                            i_9 = i_6 + 9;

                                        if (i_8 == 1)
                                            i_9 = i_6 + 10;

                                        if (i_8 == 2)
                                            i_9 = i_6 + 11;

                                        if (i_8 == 3)
                                            i_9 = i_6 + 12;

                                        if (i_8 == 4)
                                            i_9 = i_6 + 13;

                                        staticMethod318(arr_12[i_8], StaticClass13.staticMethod64(16776960) + string_5, i_9, i_1, i_2, i_3);
                                    }

                            if (arr_12 != null)
                                for (i_8 = 4; i_8 >= 0; --i_8)
                                    if (arr_12[i_8] != null && arr_12[i_8].equalsIgnoreCase("Attack")) {
                                        short s_11 = 0;
                                        if (Class5.staticClass5_3 != staticClass5_6) {
                                            if (Class5.staticClass5_1 == staticClass5_6 || staticClass5_6 == Class5.staticClass5_4 && npctype_0.int539 > BufferWrapper.staticPlayer1.combatLevel)
                                                s_11 = 2000;

                                            i_9 = 0;
                                            if (i_8 == 0)
                                                i_9 = s_11 + 9;

                                            if (i_8 == 1)
                                                i_9 = s_11 + 10;

                                            if (i_8 == 2)
                                                i_9 = s_11 + 11;

                                            if (i_8 == 3)
                                                i_9 = s_11 + 12;

                                            if (i_8 == 4)
                                                i_9 = s_11 + 13;

                                            staticMethod318(arr_12[i_8], StaticClass13.staticMethod64(16776960) + string_5, i_9, i_1, i_2, i_3);
                                        }
                                    }

                            if (!npctype_0.bool63 || !staticBool35)
                                staticMethod318("Examine", StaticClass13.staticMethod64(16776960) + string_5, 1003, i_1, i_2, i_3);
                        }

                    }
        }
    }

    static final void staticMethod322(Player player_0, int i_1, int i_2, int i_3) {
        if (player_0 != BufferWrapper.staticPlayer1)
            if (staticInt225 < 400) {
                String string_5;
                int i_8;
                if (player_0.skillLevel == 0) {
                    String string_6 = player_0.op[0] + player_0.name + player_0.op[1];
                    i_8 = player_0.combatLevel;
                    int i_9 = BufferWrapper.staticPlayer1.combatLevel;
                    int i_10 = i_9 - i_8;
                    String string_7;
                    if (i_10 < -9)
                        string_7 = StaticClass13.staticMethod64(16711680);
                    else if (i_10 < -6)
                        string_7 = StaticClass13.staticMethod64(16723968);
                    else if (i_10 < -3)
                        string_7 = StaticClass13.staticMethod64(16740352);
                    else if (i_10 < 0)
                        string_7 = StaticClass13.staticMethod64(16756736);
                    else if (i_10 > 9)
                        string_7 = StaticClass13.staticMethod64(65280);
                    else if (i_10 > 6)
                        string_7 = StaticClass13.staticMethod64(4259584);
                    else if (i_10 > 3)
                        string_7 = StaticClass13.staticMethod64(8453888);
                    else if (i_10 > 0)
                        string_7 = StaticClass13.staticMethod64(12648192);
                    else
                        string_7 = StaticClass13.staticMethod64(16776960);

                    string_5 = string_6 + string_7 + " " + " (" + "level-" + player_0.combatLevel + ")" + player_0.op[2];
                } else
                    string_5 = player_0.op[0] + player_0.name + player_0.op[1] + " " + " (" + "skill-" + player_0.skillLevel + ")" + player_0.op[2];

                int i_11;
                if (staticInt194 == 1)
                    staticMethod318("Use", staticString315 + " " + "->" + " " + StaticClass13.staticMethod64(16777215) + string_5, 14, i_1, i_2, i_3);
                else if (staticBool36) {
                    if ((Class1.staticInt3 & 0x8) == 8)
                        staticMethod318(staticString316, staticString313 + " " + "->" + " " + StaticClass13.staticMethod64(16777215) + string_5, 15, i_1, i_2, i_3);
                } else
                    for (i_11 = 7; i_11 >= 0; --i_11)
                        if (staticStringArray7[i_11] != null) {
                            short s_13 = 0;
                            if (staticStringArray7[i_11].equalsIgnoreCase("Attack")) {
                                if (staticClass5_5 == Class5.staticClass5_3)
                                    continue;

                                if (staticClass5_5 == Class5.staticClass5_1 || Class5.staticClass5_4 == staticClass5_5 && player_0.combatLevel > BufferWrapper.staticPlayer1.combatLevel)
                                    s_13 = 2000;

                                if (BufferWrapper.staticPlayer1.team != 0 && player_0.team != 0)
                                    if (player_0.team == BufferWrapper.staticPlayer1.team)
                                        s_13 = 2000;
                                    else
                                        s_13 = 0;
                            } else if (staticBoolArray6[i_11])
                                s_13 = 2000;

                            boolean bool_12 = false;
                            i_8 = s_13 + staticIntArray93[i_11];
                            staticMethod318(staticStringArray7[i_11], StaticClass13.staticMethod64(16777215) + string_5, i_8, i_1, i_2, i_3);
                        }

                for (i_11 = 0; i_11 < staticInt225; i_11++)
                    if (staticIntArray97[i_11] == 23) {
                        staticStringArray9[i_11] = StaticClass13.staticMethod64(16777215) + string_5;
                        break;
                    }

            }
    }

    static final void staticMethod323(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
        if (Widget.staticMethod383(i_0)) {
            WorldMapTile.staticWidgetArray1 = null;
            staticMethod324(StaticClass25.staticWidgetArrayArray1[i_0], -1, i_1, i_2, i_3, i_4, i_5, i_6, i_7);
            if (WorldMapTile.staticWidgetArray1 != null) {
                staticMethod324(WorldMapTile.staticWidgetArray1, -1412584499, i_1, i_2, i_3, i_4, RenderableSub2.staticInt319, WorldMapDecor.staticInt14, i_7);
                WorldMapTile.staticWidgetArray1 = null;
            }

        } else if (i_7 != -1)
            staticBoolArray7[i_7] = true;
        else
            for (int i_9 = 0; i_9 < 100; i_9++)
                staticBoolArray7[i_9] = true;
    }

    static final void staticMethod324(Widget[] arr_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
        Rasterizer2D.staticMethod442(i_2, i_3, i_4, i_5);
        Rasterizer3D.staticMethod470();

        for (int i_10 = 0; i_10 < arr_0.length; i_10++) {
            Widget widget_11 = arr_0[i_10];
            if (widget_11 != null && (widget_11.parentId == i_1 || i_1 == -1412584499 && widget_11 == staticWidget10)) {
                int i_12;
                if (i_8 == -1) {
                    staticIntArray105[staticInt269] = i_6 + widget_11.int405;
                    staticIntArray90[staticInt269] = i_7 + widget_11.int410;
                    staticIntArray102[staticInt269] = widget_11.int406;
                    staticIntArray107[staticInt269] = widget_11.int407;
                    i_12 = staticInt269++;
                } else
                    i_12 = i_8;

                widget_11.int457 = i_12;
                widget_11.int458 = staticInt166;
                if (!widget_11.bool34 || !staticMethod362(widget_11)) {
                    int i_13;
                    if (widget_11.int396 > 0) {
                        i_13 = widget_11.int396;
                        if (i_13 == 324) {
                            if (staticInt297 == -1) {
                                staticInt297 = widget_11.int440;
                                staticInt298 = -widget_11.int412;
                            }

                            if (staticPlayerDef1.female)
                                widget_11.int440 = staticInt297;
                            else
                                widget_11.int440 = -staticInt298;
                        } else if (i_13 == 325) {
                            if (staticInt297 == -1) {
                                staticInt297 = widget_11.int440;
                                staticInt298 = -widget_11.int412;
                            }

                            if (staticPlayerDef1.female)
                                widget_11.int440 = -staticInt298;
                            else
                                widget_11.int440 = staticInt297;
                        } else if (i_13 == 327) {
                            widget_11.int429 = 150;
                            widget_11.int430 = (int) (Math.sin(staticInt166 / 40.0D) * 256.0D) & 0x7ff;
                            widget_11.int423 = 5;
                            widget_11.int409 = 0;
                        } else if (i_13 == 328) {
                            widget_11.int429 = 150;
                            widget_11.int430 = (int) (Math.sin(staticInt166 / 40.0D) * 256.0D) & 0x7ff;
                            widget_11.int423 = 5;
                            widget_11.int409 = 1;
                        }
                    }

                    i_13 = widget_11.int405 + i_6;
                    int i_14 = i_7 + widget_11.int410;
                    int i_15 = widget_11.int416;
                    int i_16;
                    int i_17;
                    if (widget_11 == staticWidget10) {
                        if (i_1 != -1412584499 && !widget_11.bool40) {
                            WorldMapTile.staticWidgetArray1 = arr_0;
                            RenderableSub2.staticInt319 = i_6;
                            WorldMapDecor.staticInt14 = i_7;
                            continue;
                        }

                        if (staticBool44 && staticBool38) {
                            i_16 = MouseHandler.staticInt28;
                            i_17 = MouseHandler.staticInt29;
                            i_16 -= staticInt249;
                            i_17 -= staticInt250;
                            if (i_16 < staticInt251)
                                i_16 = staticInt251;

                            if (widget_11.int406 + i_16 > staticWidget9.int406 + staticInt251)
                                i_16 = staticWidget9.int406 + staticInt251 - widget_11.int406;

                            if (i_17 < staticInt252)
                                i_17 = staticInt252;

                            if (i_17 + widget_11.int407 > staticInt252 + staticWidget9.int407)
                                i_17 = staticInt252 + staticWidget9.int407 - widget_11.int407;

                            i_13 = i_16;
                            i_14 = i_17;
                        }

                        if (!widget_11.bool40)
                            i_15 = 128;
                    }

                    int i_18;
                    int i_19;
                    int i_20;
                    int i_21;
                    int i_22;
                    int i_23;
                    if (widget_11.type == 2) {
                        i_16 = i_2;
                        i_17 = i_3;
                        i_18 = i_4;
                        i_19 = i_5;
                    } else if (widget_11.type == 9) {
                        i_20 = i_13;
                        i_21 = i_14;
                        i_22 = i_13 + widget_11.int406;
                        i_23 = widget_11.int407 + i_14;
                        if (i_22 < i_13) {
                            i_20 = i_22;
                            i_22 = i_13;
                        }

                        if (i_23 < i_14) {
                            i_21 = i_23;
                            i_23 = i_14;
                        }

                        ++i_22;
                        ++i_23;
                        i_16 = i_20 > i_2 ? i_20 : i_2;
                        i_17 = i_21 > i_3 ? i_21 : i_3;
                        i_18 = i_22 < i_4 ? i_22 : i_4;
                        i_19 = i_23 < i_5 ? i_23 : i_5;
                    } else {
                        i_20 = widget_11.int406 + i_13;
                        i_21 = widget_11.int407 + i_14;
                        i_16 = i_13 > i_2 ? i_13 : i_2;
                        i_17 = i_14 > i_3 ? i_14 : i_3;
                        i_18 = i_20 < i_4 ? i_20 : i_4;
                        i_19 = i_21 < i_5 ? i_21 : i_5;
                    }

                    if (!widget_11.bool34 || i_16 < i_18 && i_17 < i_19) {
                        if (widget_11.int396 != 0) {
                            if (widget_11.int396 == 1336) {
                                if (staticBool27) {
                                    i_14 += 15;
                                    StaticClass1.staticFontFace1.method666("Fps:" + staticInt38, widget_11.int406 + i_13, i_14, 16776960, -1);
                                    i_14 += 15;
                                    Runtime runtime_45 = Runtime.getRuntime();
                                    i_21 = (int) ((runtime_45.totalMemory() - runtime_45.freeMemory()) / 1024L);
                                    i_22 = 16776960;
                                    if (i_21 > 32768 && staticBool25)
                                        i_22 = 16711680;

                                    if (i_21 > 65536 && !staticBool25)
                                        i_22 = 16711680;

                                    StaticClass1.staticFontFace1.method666("Mem:" + i_21 + "k", i_13 + widget_11.int406, i_14, i_22, -1);
                                    i_14 += 15;
                                }
                                continue;
                            }

                            if (widget_11.int396 == 1337) {
                                staticInt226 = i_13;
                                staticInt235 = i_14;
                                staticMethod279(i_13, i_14, widget_11.int406, widget_11.int407);
                                staticBoolArray7[widget_11.int457] = true;
                                Rasterizer2D.staticMethod442(i_2, i_3, i_4, i_5);
                                continue;
                            }

                            if (widget_11.int396 == 1338) {
                                staticMethod352(widget_11, i_13, i_14, i_12);
                                Rasterizer2D.staticMethod442(i_2, i_3, i_4, i_5);
                                continue;
                            }

                            if (widget_11.int396 == 1339) {
                                staticMethod353(widget_11, i_13, i_14, i_12);
                                Rasterizer2D.staticMethod442(i_2, i_3, i_4, i_5);
                                continue;
                            }

                            if (widget_11.int396 == 1400)
                                GameObject.staticClass11_1.method341(i_13, i_14, widget_11.int406, widget_11.int407, staticInt166);

                            if (widget_11.int396 == 1401)
                                GameObject.staticClass11_1.method342(i_13, i_14, widget_11.int406, widget_11.int407);
                        }

                        if (widget_11.type == 0) {
                            if (!widget_11.bool34 && staticMethod362(widget_11) && widget_11 != WMEnum5.staticWidget1)
                                continue;

                            if (!widget_11.bool34) {
                                if (widget_11.int451 > widget_11.int411 - widget_11.int407)
                                    widget_11.int451 = widget_11.int411 - widget_11.int407;

                                if (widget_11.int451 < 0)
                                    widget_11.int451 = 0;
                            }

                            staticMethod324(arr_0, widget_11.int444, i_16, i_17, i_18, i_19, i_13 - widget_11.int419, i_14 - widget_11.int451, i_12);
                            if (widget_11.widgetArray1 != null)
                                staticMethod324(widget_11.widgetArray1, widget_11.int444, i_16, i_17, i_18, i_19, i_13 - widget_11.int419, i_14 - widget_11.int451, i_12);

                            NodeSub1 nodesub1_31 = (NodeSub1) staticHashTable7.get(widget_11.int444);
                            if (nodesub1_31 != null)
                                staticMethod323(nodesub1_31.int317, i_16, i_17, i_18, i_19, i_13, i_14, i_12);

                            Rasterizer2D.staticMethod442(i_2, i_3, i_4, i_5);
                            Rasterizer3D.staticMethod470();
                        }

                        if (staticBool33 || staticBoolArray5[i_12] || staticInt183 > 1) {
                            int i_24;
                            int i_25;
                            if (widget_11.type == 0 && !widget_11.bool34 && widget_11.int411 > widget_11.int407) {
                                i_20 = i_13 + widget_11.int406;
                                i_21 = widget_11.int451;
                                i_22 = widget_11.int407;
                                i_23 = widget_11.int411;
                                WM1.staticIndexedSpriteArray1[0].method673(i_20, i_14);
                                WM1.staticIndexedSpriteArray1[1].method673(i_20, i_22 + i_14 - 16);
                                Rasterizer2D.staticMethod450(i_20, i_14 + 16, 16, i_22 - 32, 1 * 2301979);
                                i_24 = i_22 * (i_22 - 32) / i_23;
                                if (i_24 < 8)
                                    i_24 = 8;

                                i_25 = (i_22 - 32 - i_24) * i_21 / (i_23 - i_22);
                                Rasterizer2D.staticMethod450(i_20, i_25 + i_14 + 16, 16, i_24, 1 * 5063219);
                                Rasterizer2D.staticMethod461(i_20, i_25 + i_14 + 16, i_24, 7759444);
                                Rasterizer2D.staticMethod461(i_20 + 1, i_25 + i_14 + 16, i_24, 7759444);
                                Rasterizer2D.staticMethod459(i_20, i_14 + 16 + i_25, 16, 7759444);
                                Rasterizer2D.staticMethod459(i_20, i_14 + 17 + i_25, 16, 7759444);
                                Rasterizer2D.staticMethod461(i_20 + 15, i_25 + i_14 + 16, i_24, 3353893);
                                Rasterizer2D.staticMethod461(i_20 + 14, i_25 + i_14 + 17, i_24 - 1, 3353893);
                                Rasterizer2D.staticMethod459(i_20, i_25 + i_14 + 15 + i_24, 16, 3353893);
                                Rasterizer2D.staticMethod459(i_20 + 1, i_25 + i_14 + 14 + i_24, 15, 3353893);
                            }

                            if (widget_11.type != 1) {
                                int i_26;
                                int i_27;
                                if (widget_11.type == 2) {
                                    i_20 = 0;

                                    for (i_21 = 0; i_21 < widget_11.int404; i_21++)
                                        for (i_22 = 0; i_22 < widget_11.int403; i_22++) {
                                            i_23 = i_13 + (widget_11.int422 + 32) * i_22;
                                            i_24 = (32 + widget_11.int441) * i_21 + i_14;
                                            if (i_20 < 20) {
                                                i_23 += widget_11.intArray52[i_20];
                                                i_24 += widget_11.intArray53[i_20];
                                            }

                                            if (widget_11.intArray57[i_20] <= 0) {
                                                if (widget_11.intArray54 != null && i_20 < 20) {
                                                    Sprite sprite_48 = widget_11.method502(i_20);
                                                    if (sprite_48 != null)
                                                        sprite_48.method684(i_23, i_24);
                                                    else if (Widget.staticBool49)
                                                        staticMethod342(widget_11);
                                                }
                                            } else {
                                                boolean bool_46 = false;
                                                boolean bool_42 = false;
                                                i_27 = widget_11.intArray57[i_20] - 1;
                                                if (i_23 + 32 > i_2 && i_23 < i_4 && i_24 + 32 > i_3 && i_24 < i_5 || widget_11 == ClanMember.staticWidget7 && staticInt223 == i_20) {
                                                    Sprite sprite_43;
                                                    if (staticInt194 == 1 && i_20 == WorldMapDecor.staticInt15 && WM3.staticInt153 == widget_11.int444)
                                                        sprite_43 = ObjType.staticMethod422(i_27, widget_11.intArray59[i_20], 2, 0, 2, false);
                                                    else
                                                        sprite_43 = ObjType.staticMethod422(i_27, widget_11.intArray59[i_20], 1, 3153952, 2, false);

                                                    if (sprite_43 != null) {
                                                        if (ClanMember.staticWidget7 == widget_11 && staticInt223 == i_20) {
                                                            i_25 = MouseHandler.staticInt28 - staticInt224;
                                                            i_26 = MouseHandler.staticInt29 - staticInt277;
                                                            if (i_25 < 5 && i_25 > -5)
                                                                i_25 = 0;

                                                            if (i_26 < 5 && i_26 > -5)
                                                                i_26 = 0;

                                                            if (staticInt274 < 5) {
                                                                i_25 = 0;
                                                                i_26 = 0;
                                                            }

                                                            sprite_43.method687(i_23 + i_25, i_24 + i_26, 128);
                                                            if (i_1 != -1) {
                                                                Widget widget_29 = arr_0[i_1 & 0xffff];
                                                                int i_30;
                                                                if (i_26 + i_24 < Rasterizer2D.staticInt311 && widget_29.int451 > 0) {
                                                                    i_30 = staticInt272 * (Rasterizer2D.staticInt311 - i_24 - i_26) / 3;
                                                                    if (i_30 > staticInt272 * 10)
                                                                        i_30 = staticInt272 * 10;

                                                                    if (i_30 > widget_29.int451)
                                                                        i_30 = widget_29.int451;

                                                                    widget_29.int451 -= i_30;
                                                                    staticInt277 += i_30;
                                                                    staticMethod342(widget_29);
                                                                }

                                                                if (32 + i_24 + i_26 > Rasterizer2D.staticInt315 && widget_29.int451 < widget_29.int411 - widget_29.int407) {
                                                                    i_30 = staticInt272 * (i_24 + i_26 + 32 - Rasterizer2D.staticInt315) / 3;
                                                                    if (i_30 > staticInt272 * 10)
                                                                        i_30 = staticInt272 * 10;

                                                                    if (i_30 > widget_29.int411 - widget_29.int407 - widget_29.int451)
                                                                        i_30 = widget_29.int411 - widget_29.int407 - widget_29.int451;

                                                                    widget_29.int451 += i_30;
                                                                    staticInt277 -= i_30;
                                                                    staticMethod342(widget_29);
                                                                }
                                                            }
                                                        } else if (widget_11 == DataClass9.staticWidget5 && staticInt222 == i_20)
                                                            sprite_43.method687(i_23, i_24, 128);
                                                        else
                                                            sprite_43.method684(i_23, i_24);
                                                    } else
                                                        staticMethod342(widget_11);
                                                }
                                            }

                                            ++i_20;
                                        }
                                } else if (widget_11.type == 3) {
                                    if (staticMethod334(widget_11)) {
                                        i_20 = widget_11.int454;
                                        if (widget_11 == WMEnum5.staticWidget1 && widget_11.int415 != 0)
                                            i_20 = widget_11.int415;
                                    } else {
                                        i_20 = widget_11.int393;
                                        if (widget_11 == WMEnum5.staticWidget1 && widget_11.int414 != 0)
                                            i_20 = widget_11.int414;
                                    }

                                    if (widget_11.bool32)
                                        switch (widget_11.class8_1.int275) {
                                        case 1:
                                            Rasterizer2D.staticMethod451(i_13, i_14, widget_11.int406, widget_11.int407, widget_11.int393, widget_11.int454, 256 - (widget_11.int416 & 0xff), 256 - (widget_11.int417 & 0xff));
                                            break;
                                        case 2:
                                            Rasterizer2D.staticMethod452(i_13, i_14, widget_11.int406, widget_11.int407, widget_11.int393, widget_11.int454, 256 - (widget_11.int416 & 0xff), 256 - (widget_11.int417 & 0xff));
                                            break;
                                        case 3:
                                            Rasterizer2D.staticMethod453(i_13, i_14, widget_11.int406, widget_11.int407, widget_11.int393, widget_11.int454, 256 - (widget_11.int416 & 0xff), 256 - (widget_11.int417 & 0xff));
                                            break;
                                        case 4:
                                            Rasterizer2D.staticMethod454(i_13, i_14, widget_11.int406, widget_11.int407, widget_11.int393, widget_11.int454, 256 - (widget_11.int416 & 0xff), 256 - (widget_11.int417 & 0xff));
                                            break;
                                        default:
                                            if (i_15 == 0)
                                                Rasterizer2D.staticMethod450(i_13, i_14, widget_11.int406, widget_11.int407, i_20);
                                            else
                                                Rasterizer2D.staticMethod449(i_13, i_14, widget_11.int406, widget_11.int407, i_20, 256 - (i_15 & 0xff));
                                        }
                                    else if (i_15 == 0)
                                        Rasterizer2D.staticMethod457(i_13, i_14, widget_11.int406, widget_11.int407, i_20);
                                    else
                                        Rasterizer2D.staticMethod458(i_13, i_14, widget_11.int406, widget_11.int407, i_20, 256 - (i_15 & 0xff));
                                } else {
                                    FontFace fontface_32;
                                    if (widget_11.type == 4) {
                                        fontface_32 = widget_11.method501();
                                        if (fontface_32 == null) {
                                            if (Widget.staticBool49)
                                                staticMethod342(widget_11);
                                        } else {
                                            String string_44 = widget_11.string25;
                                            if (staticMethod334(widget_11)) {
                                                i_21 = widget_11.int454;
                                                if (WMEnum5.staticWidget1 == widget_11 && widget_11.int415 != 0)
                                                    i_21 = widget_11.int415;

                                                if (widget_11.string23.length() > 0)
                                                    string_44 = widget_11.string23;
                                            } else {
                                                i_21 = widget_11.int393;
                                                if (WMEnum5.staticWidget1 == widget_11 && widget_11.int414 != 0)
                                                    i_21 = widget_11.int414;
                                            }

                                            if (widget_11.bool34 && widget_11.int453 != -1) {
                                                ObjType objtype_47 = ObjType.staticMethod421(widget_11.int453);
                                                string_44 = objtype_47.name;
                                                if (string_44 == null)
                                                    string_44 = "null";

                                                if ((objtype_47.stackable == 1 || widget_11.int456 != 1) && widget_11.int456 != -1)
                                                    string_44 = StaticClass13.staticMethod64(16748608) + string_44 + "</col>" + " " + 'x' + staticMethod327(widget_11.int456);
                                            }

                                            if (widget_11 == staticWidget11) {
                                                StaticClass37 staticclass37_10000 = null;
                                                string_44 = "Please wait...";
                                                i_21 = widget_11.int393;
                                            }

                                            if (!widget_11.bool34)
                                                string_44 = staticMethod326(string_44, widget_11);

                                            fontface_32.method667(string_44, i_13, i_14, widget_11.int406, widget_11.int407, i_21, widget_11.bool43 ? 0 : -1, widget_11.int438, widget_11.int439, widget_11.int437);
                                        }
                                    } else if (widget_11.type == 5) {
                                        Sprite sprite_35;
                                        if (!widget_11.bool34) {
                                            sprite_35 = widget_11.method500(staticMethod334(widget_11));
                                            if (sprite_35 != null)
                                                sprite_35.method684(i_13, i_14);
                                            else if (Widget.staticBool49)
                                                staticMethod342(widget_11);
                                        } else {
                                            if (widget_11.int453 != -1)
                                                sprite_35 = ObjType.staticMethod422(widget_11.int453, widget_11.int456, widget_11.int420, widget_11.int450, widget_11.int434, false);
                                            else
                                                sprite_35 = widget_11.method500(false);

                                            if (sprite_35 == null) {
                                                if (Widget.staticBool49)
                                                    staticMethod342(widget_11);
                                            } else {
                                                i_21 = sprite_35.newWidth;
                                                i_22 = sprite_35.newHeight;
                                                if (!widget_11.bool36) {
                                                    i_23 = widget_11.int406 * 4096 / i_21;
                                                    if (widget_11.int446 != 0)
                                                        sprite_35.method692(i_13 + widget_11.int406 / 2, widget_11.int407 / 2 + i_14, widget_11.int446, i_23);
                                                    else if (i_15 != 0)
                                                        sprite_35.method688(i_13, i_14, widget_11.int406, widget_11.int407, 256 - (i_15 & 0xff));
                                                    else if (i_21 == widget_11.int406 && i_22 == widget_11.int407)
                                                        sprite_35.method684(i_13, i_14);
                                                    else
                                                        sprite_35.method685(i_13, i_14, widget_11.int406, widget_11.int407);
                                                } else {
                                                    Rasterizer2D.staticMethod443(i_13, i_14, widget_11.int406 + i_13, widget_11.int407 + i_14);
                                                    i_23 = (i_21 - 1 + widget_11.int406) / i_21;
                                                    i_24 = (i_22 - 1 + widget_11.int407) / i_22;

                                                    for (i_25 = 0; i_25 < i_23; i_25++)
                                                        for (i_26 = 0; i_26 < i_24; i_26++)
                                                            if (widget_11.int446 != 0)
                                                                sprite_35.method692(i_21 / 2 + i_25 * i_21 + i_13, i_22 / 2 + i_14 + i_22 * i_26, widget_11.int446, 4096);
                                                            else if (i_15 != 0)
                                                                sprite_35.method687(i_25 * i_21 + i_13, i_22 * i_26 + i_14, 256 - (i_15 & 0xff));
                                                            else
                                                                sprite_35.method684(i_13 + i_21 * i_25, i_14 + i_22 * i_26);

                                                    Rasterizer2D.staticMethod442(i_2, i_3, i_4, i_5);
                                                }
                                            }
                                        }
                                    } else {
                                        ObjType objtype_36;
                                        if (widget_11.type == 6) {
                                            boolean bool_34 = staticMethod334(widget_11);
                                            if (bool_34)
                                                i_21 = widget_11.int426;
                                            else
                                                i_21 = widget_11.int391;

                                            Model model_40 = null;
                                            i_23 = 0;
                                            if (widget_11.int453 != -1) {
                                                objtype_36 = ObjType.staticMethod421(widget_11.int453);
                                                if (objtype_36 != null) {
                                                    objtype_36 = objtype_36.method588(widget_11.int456);
                                                    model_40 = objtype_36.getModelForQuantity(1);
                                                    if (model_40 != null) {
                                                        model_40.method640();
                                                        i_23 = model_40.modelHeight / 2;
                                                    } else
                                                        staticMethod342(widget_11);
                                                }
                                            } else if (widget_11.int423 == 5) {
                                                if (widget_11.int409 == 0)
                                                    model_40 = staticPlayerDef1.method302((SeqType) null, -1, (SeqType) null, -1);
                                                else
                                                    model_40 = BufferWrapper.staticPlayer1.getModel();
                                            } else if (i_21 == -1) {
                                                model_40 = widget_11.method503((SeqType) null, -1, bool_34, BufferWrapper.staticPlayer1.playerDef1);
                                                if (model_40 == null && Widget.staticBool49)
                                                    staticMethod342(widget_11);
                                            } else {
                                                SeqType seqtype_41 = SeqType.staticMethod438(i_21);
                                                model_40 = widget_11.method503(seqtype_41, widget_11.int452, bool_34, BufferWrapper.staticPlayer1.playerDef1);
                                                if (model_40 == null && Widget.staticBool49)
                                                    staticMethod342(widget_11);
                                            }

                                            Rasterizer3D.staticMethod473(widget_11.int406 / 2 + i_13, i_14 + widget_11.int407 / 2);
                                            i_24 = Rasterizer3D.staticIntArray156[widget_11.int429] * widget_11.int397 >> 16;
                                            i_25 = Rasterizer3D.staticIntArray159[widget_11.int429] * widget_11.int397 >> 16;
                                            if (model_40 != null)
                                                if (!widget_11.bool34)
                                                    model_40.method653(0, widget_11.int430, 0, widget_11.int429, 0, i_24, i_25);
                                                else {
                                                    model_40.method640();
                                                    if (widget_11.bool38)
                                                        model_40.method654(0, widget_11.int430, widget_11.int442, widget_11.int429, widget_11.int427, i_23 + i_24 + widget_11.int428, widget_11.int428 + i_25, widget_11.int397);
                                                    else
                                                        model_40.method653(0, widget_11.int430, widget_11.int442, widget_11.int429, widget_11.int427, widget_11.int428 + i_23 + i_24, i_25 + widget_11.int428);
                                                }

                                            Rasterizer3D.staticMethod472();
                                        } else {
                                            if (widget_11.type == 7) {
                                                fontface_32 = widget_11.method501();
                                                if (fontface_32 == null) {
                                                    if (Widget.staticBool49)
                                                        staticMethod342(widget_11);
                                                    continue;
                                                }

                                                i_21 = 0;

                                                for (i_22 = 0; i_22 < widget_11.int404; i_22++)
                                                    for (i_23 = 0; i_23 < widget_11.int403; i_23++) {
                                                        if (widget_11.intArray57[i_21] > 0) {
                                                            objtype_36 = ObjType.staticMethod421(widget_11.intArray57[i_21] - 1);
                                                            String string_39;
                                                            if (objtype_36.stackable != 1 && widget_11.intArray59[i_21] == 1)
                                                                string_39 = StaticClass13.staticMethod64(16748608) + objtype_36.name + "</col>";
                                                            else
                                                                string_39 = StaticClass13.staticMethod64(16748608) + objtype_36.name + "</col>" + " " + 'x' + staticMethod327(widget_11.intArray59[i_21]);

                                                            i_26 = i_13 + i_23 * (115 + widget_11.int422);
                                                            i_27 = (widget_11.int441 + 12) * i_22 + i_14;
                                                            if (widget_11.int438 == 0)
                                                                fontface_32.method664(string_39, i_26, i_27, widget_11.int393, widget_11.bool43 ? 0 : -1);
                                                            else if (widget_11.int438 == 1)
                                                                fontface_32.drawString(string_39, i_26 + widget_11.int406 / 2, i_27, widget_11.int393, widget_11.bool43 ? 0 : -1);
                                                            else
                                                                fontface_32.method666(string_39, i_26 + widget_11.int406 - 1, i_27, widget_11.int393, widget_11.bool43 ? 0 : -1);
                                                        }

                                                        ++i_21;
                                                    }
                                            }

                                            if (widget_11.type == 8 && widget_11 == Class2.staticWidget2 && staticInt236 == 50) {
                                                i_20 = 0;
                                                i_21 = 0;
                                                FontFace fontface_33 = StaticClass1.staticFontFace1;
                                                String string_37 = widget_11.string25;

                                                String string_38;
                                                for (string_37 = staticMethod326(string_37, widget_11); string_37.length() > 0; i_21 += fontface_33.int674 + 1) {
                                                    i_25 = string_37.indexOf("<br>");
                                                    if (i_25 != -1) {
                                                        string_38 = string_37.substring(0, i_25);
                                                        string_37 = string_37.substring(i_25 + 4);
                                                    } else {
                                                        string_38 = string_37;
                                                        string_37 = "";
                                                    }

                                                    i_26 = fontface_33.stringWidth(string_38);
                                                    if (i_26 > i_20)
                                                        i_20 = i_26;
                                                }

                                                i_20 += 6;
                                                i_21 += 7;
                                                i_25 = i_13 + widget_11.int406 - 5 - i_20;
                                                i_26 = 5 + widget_11.int407 + i_14;
                                                if (i_25 < i_13 + 5)
                                                    i_25 = i_13 + 5;

                                                if (i_25 + i_20 > i_4)
                                                    i_25 = i_4 - i_20;

                                                if (i_26 + i_21 > i_5)
                                                    i_26 = i_5 - i_21;

                                                Rasterizer2D.staticMethod450(i_25, i_26, i_20, i_21, 16777120);
                                                Rasterizer2D.staticMethod457(i_25, i_26, i_20, i_21, 0);
                                                string_37 = widget_11.string25;
                                                i_27 = 2 + fontface_33.int674 + i_26;

                                                for (string_37 = staticMethod326(string_37, widget_11); string_37.length() > 0; i_27 += 1 + fontface_33.int674) {
                                                    int i_28 = string_37.indexOf("<br>");
                                                    if (i_28 != -1) {
                                                        string_38 = string_37.substring(0, i_28);
                                                        string_37 = string_37.substring(i_28 + 4);
                                                    } else {
                                                        string_38 = string_37;
                                                        string_37 = "";
                                                    }

                                                    fontface_33.method664(string_38, i_25 + 3, i_27, 0, -1);
                                                }
                                            }

                                            if (widget_11.type == 9) {
                                                if (widget_11.bool39) {
                                                    i_20 = i_13;
                                                    i_21 = widget_11.int407 + i_14;
                                                    i_22 = i_13 + widget_11.int406;
                                                    i_23 = i_14;
                                                } else {
                                                    i_20 = i_13;
                                                    i_21 = i_14;
                                                    i_22 = widget_11.int406 + i_13;
                                                    i_23 = i_14 + widget_11.int407;
                                                }

                                                if (widget_11.int424 == 1)
                                                    Rasterizer2D.staticMethod463(i_20, i_21, i_22, i_23, widget_11.int393);
                                                else
                                                    staticMethod325(i_20, i_21, i_22, i_23, widget_11.int393, widget_11.int424);
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

    }

    static final void staticMethod325(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5) {
        int i_7 = i_2 - i_0;
        int i_8 = i_3 - i_1;
        int i_9 = i_7 >= 0 ? i_7 : -i_7;
        int i_10 = i_8 >= 0 ? i_8 : -i_8;
        int i_11 = i_9;
        if (i_9 < i_10)
            i_11 = i_10;

        if (i_11 != 0) {
            int i_12 = (i_7 << 16) / i_11;
            int i_13 = (i_8 << 16) / i_11;
            if (i_13 <= i_12)
                i_12 = -i_12;
            else
                i_13 = -i_13;

            int i_14 = i_13 * i_5 >> 17;
            int i_15 = i_5 * i_13 + 1 >> 17;
            int i_16 = i_12 * i_5 >> 17;
            int i_17 = 1 + i_12 * i_5 >> 17;
            i_0 -= Rasterizer2D.staticInt316;
            i_1 -= Rasterizer2D.staticInt311;
            int i_18 = i_14 + i_0;
            int i_19 = i_0 - i_15;
            int i_20 = i_0 + i_7 - i_15;
            int i_21 = i_14 + i_7 + i_0;
            int i_22 = i_16 + i_1;
            int i_23 = i_1 - i_17;
            int i_24 = i_8 + i_1 - i_17;
            int i_25 = i_16 + i_1 + i_8;
            Rasterizer3D.staticMethod478(i_18, i_19, i_20);
            Rasterizer3D.staticMethod481(i_22, i_23, i_24, i_18, i_19, i_20, i_4);
            Rasterizer3D.staticMethod478(i_18, i_20, i_21);
            Rasterizer3D.staticMethod481(i_22, i_24, i_25, i_18, i_20, i_21, i_4);
        }
    }

    static String staticMethod326(String string_0, Widget widget_1) {
        if (string_0.indexOf("%") != -1) {
            int i_3;
            for (i_3 = 1; i_3 <= 5; i_3++)
                while (true) {
                    int i_4 = string_0.indexOf("%" + i_3);
                    if (i_4 == -1)
                        break;

                    string_0 = string_0.substring(0, i_4) + staticMethod333(staticMethod335(widget_1, i_3 - 1)) + string_0.substring(i_4 + 2);
                }

            while (true) {
                i_3 = string_0.indexOf("%dns");
                if (i_3 == -1)
                    break;

                String str_5 = "";
                if (WM1.staticTask1 != null) {
                    str_5 = StaticClass51.staticMethod209(WM1.staticTask1.intArg);
                    if (WM1.staticTask1.result != null)
                        str_5 = (String) WM1.staticTask1.result;
                }

                string_0 = string_0.substring(0, i_3) + str_5 + string_0.substring(i_3 + 4);
            }
        }

        return string_0;
    }

    static final String staticMethod327(int i_0) {
        String string_2 = Integer.toString(i_0);

        for (int i_3 = string_2.length() - 3; i_3 > 0; i_3 -= 3)
            string_2 = string_2.substring(0, i_3) + "," + string_2.substring(i_3);

        return string_2.length() > 9 ? " " + StaticClass13.staticMethod64(65408) + string_2.substring(0, string_2.length() - 8) + "M" + " " + " (" + string_2 + ")" + "</col>" : string_2.length() > 6 ? " " + StaticClass13.staticMethod64(16777215) + string_2.substring(0, string_2.length() - 4) + "K" + " " + " (" + string_2 + ")" + "</col>" : " " + StaticClass13.staticMethod64(16776960) + string_2 + "</col>";
    }

    final void method407(boolean bool_1) {
        int i_3 = staticInt241;
        int i_4 = StaticClass5.staticInt35;
        int i_5 = Class2.staticInt16;
        if (Widget.staticMethod383(i_3))
            staticMethod329(StaticClass25.staticWidgetArrayArray1[i_3], -1, i_4, i_5, bool_1);

    }

    void method408(Widget widget_1) {
        Widget widget_3 = widget_1.parentId == -1 ? null : Widget.staticMethod381(widget_1.parentId);
        int i_4;
        int i_5;
        if (widget_3 == null) {
            i_4 = StaticClass5.staticInt35;
            i_5 = Class2.staticInt16;
        } else {
            i_4 = widget_3.int406;
            i_5 = widget_3.int407;
        }

        staticMethod330(widget_1, i_4, i_5, false);
        staticMethod331(widget_1, i_4, i_5);
    }

    static void staticMethod328(Widget[] arr_0, Widget widget_1, boolean bool_2) {
        int i_4 = widget_1.int413 != 0 ? widget_1.int413 : widget_1.int406;
        int i_5 = widget_1.int411 != 0 ? widget_1.int411 : widget_1.int407;
        staticMethod329(arr_0, widget_1.int444, i_4, i_5, bool_2);
        if (widget_1.widgetArray1 != null)
            staticMethod329(widget_1.widgetArray1, widget_1.int444, i_4, i_5, bool_2);

        NodeSub1 nodesub1_6 = (NodeSub1) staticHashTable7.get(widget_1.int444);
        if (nodesub1_6 != null) {
            int i_7 = nodesub1_6.int317;
            if (Widget.staticMethod383(i_7))
                staticMethod329(StaticClass25.staticWidgetArrayArray1[i_7], -1, i_4, i_5, bool_2);
        }

        if (widget_1.int396 == 1337)
            ;

    }

    static void staticMethod329(Widget[] arr_0, int i_1, int i_2, int i_3, boolean bool_4) {
        for (int i_6 = 0; i_6 < arr_0.length; i_6++) {
            Widget widget_7 = arr_0[i_6];
            if (widget_7 != null && widget_7.parentId == i_1) {
                staticMethod330(widget_7, i_2, i_3, bool_4);
                staticMethod331(widget_7, i_2, i_3);
                if (widget_7.int419 > widget_7.int413 - widget_7.int406)
                    widget_7.int419 = widget_7.int413 - widget_7.int406;

                if (widget_7.int419 < 0)
                    widget_7.int419 = 0;

                if (widget_7.int451 > widget_7.int411 - widget_7.int407)
                    widget_7.int451 = widget_7.int411 - widget_7.int407;

                if (widget_7.int451 < 0)
                    widget_7.int451 = 0;

                if (widget_7.type == 0)
                    staticMethod328(arr_0, widget_7, bool_4);
            }
        }

    }

    static void staticMethod330(Widget widget_0, int i_1, int i_2, boolean bool_3) {
        int i_5 = widget_0.int406;
        int i_6 = widget_0.int407;
        if (widget_0.int399 == 0)
            widget_0.int406 = widget_0.int403;
        else if (widget_0.int399 == 1)
            widget_0.int406 = i_1 - widget_0.int403;
        else if (widget_0.int399 == 2)
            widget_0.int406 = widget_0.int403 * i_1 >> 14;

        if (widget_0.int400 == 0)
            widget_0.int407 = widget_0.int404;
        else if (widget_0.int400 == 1)
            widget_0.int407 = i_2 - widget_0.int404;
        else if (widget_0.int400 == 2)
            widget_0.int407 = widget_0.int404 * i_2 >> 14;

        if (widget_0.int399 == 4)
            widget_0.int406 = widget_0.int407 * widget_0.int408 / widget_0.int392;

        if (widget_0.int400 == 4)
            widget_0.int407 = widget_0.int392 * widget_0.int406 / widget_0.int408;

        if (staticBool28 && widget_0.type == 0)
            if (widget_0.int407 < 5 && widget_0.int406 < 5) {
                widget_0.int407 = 5;
                widget_0.int406 = 5;
            } else {
                if (widget_0.int407 <= 0)
                    widget_0.int407 = 5;

                if (widget_0.int406 <= 0)
                    widget_0.int406 = 5;
            }

        if (widget_0.int396 == 1337)
            staticWidget12 = widget_0;

        if (bool_3 && widget_0.objectArray24 != null && (widget_0.int406 != i_5 || i_6 != widget_0.int407)) {
            RuneScript runescript_7 = new RuneScript();
            runescript_7.widget2 = widget_0;
            runescript_7.objectArray1 = widget_0.objectArray24;
            staticDeque8.method253(runescript_7);
        }

    }

    static void staticMethod331(Widget widget_0, int i_1, int i_2) {
        if (widget_0.int390 == 0)
            widget_0.int405 = widget_0.int401;
        else if (widget_0.int390 == 1)
            widget_0.int405 = widget_0.int401 + (i_1 - widget_0.int406) / 2;
        else if (widget_0.int390 == 2)
            widget_0.int405 = i_1 - widget_0.int406 - widget_0.int401;
        else if (widget_0.int390 == 3)
            widget_0.int405 = widget_0.int401 * i_1 >> 14;
        else if (widget_0.int390 == 4)
            widget_0.int405 = (widget_0.int401 * i_1 >> 14) + (i_1 - widget_0.int406) / 2;
        else
            widget_0.int405 = i_1 - widget_0.int406 - (widget_0.int401 * i_1 >> 14);

        if (widget_0.int398 == 0)
            widget_0.int410 = widget_0.int402;
        else if (widget_0.int398 == 1)
            widget_0.int410 = widget_0.int402 + (i_2 - widget_0.int407) / 2;
        else if (widget_0.int398 == 2)
            widget_0.int410 = i_2 - widget_0.int407 - widget_0.int402;
        else if (widget_0.int398 == 3)
            widget_0.int410 = widget_0.int402 * i_2 >> 14;
        else if (widget_0.int398 == 4)
            widget_0.int410 = (i_2 - widget_0.int407) / 2 + (widget_0.int402 * i_2 >> 14);
        else
            widget_0.int410 = i_2 - widget_0.int407 - (widget_0.int402 * i_2 >> 14);

        if (staticBool28 && widget_0.type == 0) {
            if (widget_0.int405 < 0)
                widget_0.int405 = 0;
            else if (widget_0.int405 + widget_0.int406 > i_1)
                widget_0.int405 = i_1 - widget_0.int406;

            if (widget_0.int410 < 0)
                widget_0.int410 = 0;
            else if (widget_0.int407 + widget_0.int410 > i_2)
                widget_0.int410 = i_2 - widget_0.int407;
        }

    }

    static final void staticMethod332(Widget widget_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        if (staticBool31)
            staticInt206 = 32;
        else
            staticInt206 = 0;

        staticBool31 = false;
        int i_8;
        if (MouseHandler.staticInt26 == 1 || !SoundBank.staticBool11 && MouseHandler.staticInt26 == 4)
            if (i_5 >= i_1 && i_5 < i_1 + 16 && i_6 >= i_2 && i_6 < i_2 + 16) {
                widget_0.int451 -= 4;
                staticMethod342(widget_0);
            } else if (i_5 >= i_1 && i_5 < i_1 + 16 && i_6 >= i_2 + i_3 - 16 && i_6 < i_3 + i_2) {
                widget_0.int451 += 4;
                staticMethod342(widget_0);
            } else if (i_5 >= i_1 - staticInt206 && i_5 < i_1 + 16 + staticInt206 && i_6 >= i_2 + 16 && i_6 < i_2 + i_3 - 16) {
                i_8 = (i_3 - 32) * i_3 / i_4;
                if (i_8 < 8)
                    i_8 = 8;

                int i_9 = i_6 - i_2 - 16 - i_8 / 2;
                int i_10 = i_3 - 32 - i_8;
                widget_0.int451 = (i_4 - i_3) * i_9 / i_10;
                staticMethod342(widget_0);
                staticBool31 = true;
            }

        if (staticInt265 != 0) {
            i_8 = widget_0.int406;
            if (i_5 >= i_1 - i_8 && i_6 >= i_2 && i_5 < i_1 + 16 && i_6 <= i_3 + i_2) {
                widget_0.int451 += staticInt265 * 45;
                staticMethod342(widget_0);
            }
        }

    }

    static final String staticMethod333(int i_0) {
        return i_0 < 999999999 ? Integer.toString(i_0) : "*";
    }

    static final boolean staticMethod334(Widget widget_0) {
        if (widget_0.intArray58 == null)
            return false;
        else {
            for (int i_2 = 0; i_2 < widget_0.intArray58.length; i_2++) {
                int i_3 = staticMethod335(widget_0, i_2);
                int i_4 = widget_0.intArray51[i_2];
                if (widget_0.intArray58[i_2] == 2) {
                    if (i_3 >= i_4)
                        return false;
                } else if (widget_0.intArray58[i_2] == 3) {
                    if (i_3 <= i_4)
                        return false;
                } else if (widget_0.intArray58[i_2] == 4) {
                    if (i_4 == i_3)
                        return false;
                } else if (i_3 != i_4)
                    return false;
            }

            return true;
        }
    }

    static final int staticMethod335(Widget widget_0, int i_1) {
        if (widget_0.intArrayArray12 != null && i_1 < widget_0.intArrayArray12.length)
            try {
                int[] ints_3 = widget_0.intArrayArray12[i_1];
                int i_4 = 0;
                int i_5 = 0;
                byte b_6 = 0;

                while (true) {
                    int i_7 = ints_3[i_5++];
                    int i_8 = 0;
                    byte b_9 = 0;
                    if (i_7 == 0)
                        return i_4;

                    if (i_7 == 1)
                        i_8 = staticIntArray84[ints_3[i_5++]];

                    if (i_7 == 2)
                        i_8 = staticIntArray95[ints_3[i_5++]];

                    if (i_7 == 3)
                        i_8 = staticIntArray96[ints_3[i_5++]];

                    int i_10;
                    Widget widget_11;
                    int i_12;
                    int i_13;
                    if (i_7 == 4) {
                        i_10 = ints_3[i_5++] << 16;
                        i_10 += ints_3[i_5++];
                        widget_11 = Widget.staticMethod381(i_10);
                        i_12 = ints_3[i_5++];
                        if (i_12 != -1 && (!ObjType.staticMethod421(i_12).members || staticBool24))
                            for (i_13 = 0; i_13 < widget_11.intArray57.length; i_13++)
                                if (i_12 + 1 == widget_11.intArray57[i_13])
                                    i_8 += widget_11.intArray59[i_13];
                    }

                    if (i_7 == 5)
                        i_8 = StaticClass44.staticIntArray68[ints_3[i_5++]];

                    if (i_7 == 6)
                        i_8 = StaticClass38.staticIntArray64[staticIntArray95[ints_3[i_5++]] - 1];

                    if (i_7 == 7)
                        i_8 = StaticClass44.staticIntArray68[ints_3[i_5++]] * 100 / 46875;

                    if (i_7 == 8)
                        i_8 = BufferWrapper.staticPlayer1.combatLevel;

                    if (i_7 == 9)
                        for (i_10 = 0; i_10 < 25; i_10++)
                            if (StaticClass38.staticBoolArray3[i_10])
                                i_8 += staticIntArray95[i_10];

                    if (i_7 == 10) {
                        i_10 = ints_3[i_5++] << 16;
                        i_10 += ints_3[i_5++];
                        widget_11 = Widget.staticMethod381(i_10);
                        i_12 = ints_3[i_5++];
                        if (i_12 != -1 && (!ObjType.staticMethod421(i_12).members || staticBool24))
                            for (i_13 = 0; i_13 < widget_11.intArray57.length; i_13++)
                                if (i_12 + 1 == widget_11.intArray57[i_13]) {
                                    i_8 = 999999999;
                                    break;
                                }
                    }

                    if (i_7 == 11)
                        i_8 = staticInt244;

                    if (i_7 == 12)
                        i_8 = staticInt245;

                    if (i_7 == 13) {
                        i_10 = StaticClass44.staticIntArray68[ints_3[i_5++]];
                        int i_15 = ints_3[i_5++];
                        i_8 = (i_10 & 1 << i_15) != 0 ? 1 : 0;
                    }

                    if (i_7 == 14) {
                        i_10 = ints_3[i_5++];
                        i_8 = StaticClass44.staticMethod183(i_10);
                    }

                    if (i_7 == 15)
                        b_9 = 1;

                    if (i_7 == 16)
                        b_9 = 2;

                    if (i_7 == 17)
                        b_9 = 3;

                    if (i_7 == 18)
                        i_8 = (BufferWrapper.staticPlayer1.int626 >> 7) + DataClass10.staticInt111;

                    if (i_7 == 19)
                        i_8 = (BufferWrapper.staticPlayer1.int609 >> 7) + Class4.staticInt53;

                    if (i_7 == 20)
                        i_8 = ints_3[i_5++];

                    if (b_9 == 0) {
                        if (b_6 == 0)
                            i_4 += i_8;

                        if (b_6 == 1)
                            i_4 -= i_8;

                        if (b_6 == 2 && i_8 != 0)
                            i_4 /= i_8;

                        if (b_6 == 3)
                            i_4 *= i_8;

                        b_6 = 0;
                    } else
                        b_6 = b_9;
                }
            } catch (Exception exception_14) {
                return -1;
            }
        else
            return -2;
    }

    static final void staticMethod336(Widget widget_0, ObjType objtype_1, int i_2, int i_3, boolean bool_4) {
        String[] arr_6 = objtype_1.iop;
        byte b_7 = -1;
        String str_8 = null;
        if (arr_6 != null && arr_6[i_3] != null) {
            if (i_3 == 0)
                b_7 = 33;
            else if (i_3 == 1)
                b_7 = 34;
            else if (i_3 == 2)
                b_7 = 35;
            else if (i_3 == 3)
                b_7 = 36;
            else
                b_7 = 37;

            str_8 = arr_6[i_3];
        } else if (i_3 == 4) {
            b_7 = 37;
            str_8 = "Drop";
        }

        if (b_7 != -1 && str_8 != null) {
            String string_10 = StaticClass13.staticMethod64(16748608) + objtype_1.name;
            int i_12 = objtype_1.int573;
            int i_14 = widget_0.int444;
            if (!staticBool34 && staticInt225 < 500) {
                staticStringArray8[staticInt225] = str_8;
                staticStringArray9[staticInt225] = string_10;
                staticIntArray97[staticInt225] = b_7;
                staticIntArray80[staticInt225] = i_12;
                staticIntArray79[staticInt225] = i_2;
                staticIntArray101[staticInt225] = i_14;
                staticBoolArray4[staticInt225] = bool_4;
                ++staticInt225;
            }
        }

    }

    static final void staticMethod337(Widget widget_0, int i_1, int i_2) {
        if (widget_0.int395 == 1)
            staticMethod318(widget_0.string27, "", 24, 0, 0, widget_0.int444);

        String string_4;
        if (widget_0.int395 == 2 && !staticBool36) {
            string_4 = staticMethod363(widget_0);
            if (string_4 != null)
                staticMethod318(string_4, StaticClass13.staticMethod64(65280) + widget_0.string28, 25, 0, -1, widget_0.int444);
        }

        if (widget_0.int395 == 3)
            staticMethod318("Close", "", 26, 0, 0, widget_0.int444);

        if (widget_0.int395 == 4)
            staticMethod318(widget_0.string27, "", 28, 0, 0, widget_0.int444);

        if (widget_0.int395 == 5)
            staticMethod318(widget_0.string27, "", 29, 0, 0, widget_0.int444);

        if (widget_0.int395 == 6 && staticWidget11 == null)
            staticMethod318(widget_0.string27, "", 30, 0, -1, widget_0.int444);

        int i_5;
        int i_6;
        int i_14;
        if (widget_0.type == 2) {
            i_14 = 0;

            for (i_5 = 0; i_5 < widget_0.int407; i_5++)
                for (i_6 = 0; i_6 < widget_0.int406; i_6++) {
                    int i_7 = (32 + widget_0.int422) * i_6;
                    int i_8 = i_5 * (widget_0.int441 + 32);
                    if (i_14 < 20) {
                        i_7 += widget_0.intArray52[i_14];
                        i_8 += widget_0.intArray53[i_14];
                    }

                    if (i_1 >= i_7 && i_2 >= i_8 && i_1 < i_7 + 32 && i_2 < i_8 + 32) {
                        staticInt266 = i_14;
                        Stopwatch.staticWidget6 = widget_0;
                        if (widget_0.intArray57[i_14] > 0) {
                            ObjType objtype_9 = ObjType.staticMethod421(widget_0.intArray57[i_14] - 1);
                            if (staticInt194 == 1 && StaticClass39.staticMethod181(staticMethod360(widget_0))) {
                                if (widget_0.int444 != WM3.staticInt153 || i_14 != WorldMapDecor.staticInt15)
                                    staticMethod318("Use", staticString315 + " " + "->" + " " + StaticClass13.staticMethod64(16748608) + objtype_9.name, 31, objtype_9.int573, i_14, widget_0.int444);
                            } else if (staticBool36 && StaticClass39.staticMethod181(staticMethod360(widget_0))) {
                                if ((Class1.staticInt3 & 0x10) == 16)
                                    staticMethod318(staticString316, staticString313 + " " + "->" + " " + StaticClass13.staticMethod64(16748608) + objtype_9.name, 32, objtype_9.int573, i_14, widget_0.int444);
                            } else {
                                String[] arr_10 = objtype_9.iop;
                                if (staticBool29)
                                    arr_10 = staticMethod345(arr_10);

                                int i_11 = -1;
                                if (staticBool46 && KeyboardHandler.staticBoolArray1[81])
                                    i_11 = objtype_9.method593();

                                int i_12;
                                if (StaticClass39.staticMethod181(staticMethod360(widget_0)))
                                    for (i_12 = 4; i_12 >= 3; --i_12)
                                        if (i_12 != i_11)
                                            staticMethod336(widget_0, objtype_9, i_14, i_12, false);

                                if (StaticClass39.staticMethod182(staticMethod360(widget_0)))
                                    staticMethod318("Use", StaticClass13.staticMethod64(16748608) + objtype_9.name, 38, objtype_9.int573, i_14, widget_0.int444);

                                if (StaticClass39.staticMethod181(staticMethod360(widget_0))) {
                                    for (i_12 = 2; i_12 >= 0; --i_12)
                                        if (i_12 != i_11)
                                            staticMethod336(widget_0, objtype_9, i_14, i_12, false);

                                    if (i_11 >= 0)
                                        staticMethod336(widget_0, objtype_9, i_14, i_11, true);
                                }

                                arr_10 = widget_0.stringArray4;
                                if (staticBool29)
                                    arr_10 = staticMethod345(arr_10);

                                if (arr_10 != null)
                                    for (i_12 = 4; i_12 >= 0; --i_12)
                                        if (arr_10[i_12] != null) {
                                            byte b_13 = 0;
                                            if (i_12 == 0)
                                                b_13 = 39;

                                            if (i_12 == 1)
                                                b_13 = 40;

                                            if (i_12 == 2)
                                                b_13 = 41;

                                            if (i_12 == 3)
                                                b_13 = 42;

                                            if (i_12 == 4)
                                                b_13 = 43;

                                            staticMethod318(arr_10[i_12], StaticClass13.staticMethod64(16748608) + objtype_9.name, b_13, objtype_9.int573, i_14, widget_0.int444);
                                        }

                                staticMethod318("Examine", StaticClass13.staticMethod64(16748608) + objtype_9.name, 1005, objtype_9.int573, i_14, widget_0.int444);
                            }
                        }
                    }

                    ++i_14;
                }
        }

        if (widget_0.bool34)
            if (staticBool36) {
                if (StaticClass39.staticMethod179(staticMethod360(widget_0)) && (Class1.staticInt3 & 0x20) == 32)
                    staticMethod318(staticString316, staticString313 + " " + "->" + " " + widget_0.string24, 58, 0, widget_0.int394, widget_0.int444);
            } else {
                for (i_14 = 9; i_14 >= 5; --i_14) {
                    String string_15;
                    if (!StaticClass39.staticMethod176(staticMethod360(widget_0), i_14) && widget_0.objectArray18 == null)
                        string_15 = null;
                    else if (widget_0.stringArray3 != null && widget_0.stringArray3.length > i_14 && widget_0.stringArray3[i_14] != null && widget_0.stringArray3[i_14].trim().length() != 0)
                        string_15 = widget_0.stringArray3[i_14];
                    else
                        string_15 = null;

                    if (string_15 != null)
                        staticMethod318(string_15, widget_0.string24, 1007, i_14 + 1, widget_0.int394, widget_0.int444);
                }

                string_4 = staticMethod363(widget_0);
                if (string_4 != null)
                    staticMethod318(string_4, widget_0.string24, 25, 0, widget_0.int394, widget_0.int444);

                for (i_5 = 4; i_5 >= 0; --i_5) {
                    String string_16;
                    if (!StaticClass39.staticMethod176(staticMethod360(widget_0), i_5) && widget_0.objectArray18 == null)
                        string_16 = null;
                    else if (widget_0.stringArray3 != null && widget_0.stringArray3.length > i_5 && widget_0.stringArray3[i_5] != null && widget_0.stringArray3[i_5].trim().length() != 0)
                        string_16 = widget_0.stringArray3[i_5];
                    else
                        string_16 = null;

                    if (string_16 != null)
                        staticMethod318(string_16, widget_0.string24, 57, i_5 + 1, widget_0.int394, widget_0.int444);
                }

                i_6 = staticMethod360(widget_0);
                boolean bool_17 = (i_6 & 0x1) != 0;
                if (bool_17)
                    staticMethod318("Continue", "", 30, 0, widget_0.int394, widget_0.int444);
            }

    }

    static final void staticMethod338(Widget[] arr_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
        for (int i_9 = 0; i_9 < arr_0.length; i_9++) {
            Widget widget_10 = arr_0[i_9];
            if (widget_10 != null && (!widget_10.bool34 || widget_10.type == 0 || widget_10.bool42 || staticMethod360(widget_10) != 0 || staticWidget9 == widget_10 || widget_10.int396 == 1338) && i_1 == widget_10.parentId && (!widget_10.bool34 || !staticMethod362(widget_10))) {
                int i_11 = i_6 + widget_10.int405;
                int i_12 = widget_10.int410 + i_7;
                int i_13;
                int i_14;
                int i_15;
                int i_16;
                int i_17;
                int i_18;
                int i_20;
                if (widget_10.type == 2) {
                    i_13 = i_2;
                    i_14 = i_3;
                    i_15 = i_4;
                    i_16 = i_5;
                } else if (widget_10.type == 9) {
                    i_17 = i_11;
                    i_18 = i_12;
                    int i_19 = widget_10.int406 + i_11;
                    i_20 = i_12 + widget_10.int407;
                    if (i_19 < i_11) {
                        i_17 = i_19;
                        i_19 = i_11;
                    }

                    if (i_20 < i_12) {
                        i_18 = i_20;
                        i_20 = i_12;
                    }

                    ++i_19;
                    ++i_20;
                    i_13 = i_17 > i_2 ? i_17 : i_2;
                    i_14 = i_18 > i_3 ? i_18 : i_3;
                    i_15 = i_19 < i_4 ? i_19 : i_4;
                    i_16 = i_20 < i_5 ? i_20 : i_5;
                } else {
                    i_17 = widget_10.int406 + i_11;
                    i_18 = widget_10.int407 + i_12;
                    i_13 = i_11 > i_2 ? i_11 : i_2;
                    i_14 = i_12 > i_3 ? i_12 : i_3;
                    i_15 = i_17 < i_4 ? i_17 : i_4;
                    i_16 = i_18 < i_5 ? i_18 : i_5;
                }

                if (widget_10 == staticWidget10) {
                    staticBool39 = true;
                    staticInt253 = i_11;
                    staticInt254 = i_12;
                }

                if (!widget_10.bool34 || i_13 < i_15 && i_14 < i_16) {
                    i_17 = MouseHandler.staticInt28;
                    i_18 = MouseHandler.staticInt29;
                    if (MouseHandler.staticInt27 != 0) {
                        i_17 = MouseHandler.staticInt30;
                        i_18 = MouseHandler.staticInt31;
                    }

                    boolean bool_34 = i_17 >= i_13 && i_18 >= i_14 && i_17 < i_15 && i_18 < i_16;
                    int i_23;
                    int i_24;
                    int i_37;
                    int i_42;
                    if (widget_10.int396 == 1337) {
                        if (!staticBool41 && !staticBool34 && bool_34) {
                            if (staticInt194 == 0 && !staticBool36)
                                staticMethod318("Walk here", "", 23, 0, i_17 - i_13, i_18 - i_14);

                            i_20 = -1;
                            i_37 = -1;

                            for (i_42 = 0; i_42 < StaticClass17.staticInt117; i_42++) {
                                i_23 = StaticClass17.staticIntArray56[i_42];
                                i_24 = i_23 & 0x7f;
                                int i_43 = i_23 >> 7 & 0x7f;
                                int i_26 = i_23 >> 29 & 0x3;
                                int i_27 = i_23 >> 14 & 0x7fff;
                                if (i_23 != i_37) {
                                    i_37 = i_23;
                                    if (i_26 == 2 && LegacyClickboxDebug.staticScene1.method209(DataClass14.staticInt156, i_24, i_43, i_23) >= 0) {
                                        LocType loctype_28 = LocType.staticMethod411(i_27);
                                        if (loctype_28.intArray86 != null)
                                            loctype_28 = loctype_28.method563();

                                        if (loctype_28 == null)
                                            continue;

                                        if (staticInt194 == 1)
                                            staticMethod318("Use", staticString315 + " " + "->" + " " + StaticClass13.staticMethod64(65535) + loctype_28.string38, 1, i_23, i_24, i_43);
                                        else if (staticBool36) {
                                            if ((Class1.staticInt3 & 0x4) == 4)
                                                staticMethod318(staticString316, staticString313 + " " + "->" + " " + StaticClass13.staticMethod64(65535) + loctype_28.string38, 2, i_23, i_24, i_43);
                                        } else {
                                            String[] arr_29 = loctype_28.op;
                                            if (staticBool29)
                                                arr_29 = staticMethod345(arr_29);

                                            if (arr_29 != null)
                                                for (int i_30 = 4; i_30 >= 0; --i_30)
                                                    if (arr_29[i_30] != null) {
                                                        short s_31 = 0;
                                                        if (i_30 == 0)
                                                            s_31 = 3;

                                                        if (i_30 == 1)
                                                            s_31 = 4;

                                                        if (i_30 == 2)
                                                            s_31 = 5;

                                                        if (i_30 == 3)
                                                            s_31 = 6;

                                                        if (i_30 == 4)
                                                            s_31 = 1001;

                                                        staticMethod318(arr_29[i_30], StaticClass13.staticMethod64(65535) + loctype_28.string38, s_31, i_23, i_24, i_43);
                                                    }

                                            staticMethod318("Examine", StaticClass13.staticMethod64(65535) + loctype_28.string38, 1002, loctype_28.int515 << 14, i_24, i_43);
                                        }
                                    }

                                    Player player_32;
                                    int i_48;
                                    Npc npc_49;
                                    int[] ints_50;
                                    int i_54;
                                    if (i_26 == 1) {
                                        Npc npc_45 = staticNpcArray1[i_27];
                                        if (npc_45 == null)
                                            continue;

                                        if (npc_45.npcType1.name == 1 && (npc_45.int626 & 0x7f) == 64 && (npc_45.int609 & 0x7f) == 64) {
                                            for (i_48 = 0; i_48 < staticInt186; i_48++) {
                                                npc_49 = staticNpcArray1[staticIntArray91[i_48]];
                                                if (npc_49 != null && npc_45 != npc_49 && npc_49.npcType1.name == 1 && npc_45.int626 == npc_49.int626 && npc_49.int609 == npc_45.int609)
                                                    staticMethod321(npc_49.npcType1, staticIntArray91[i_48], i_24, i_43);
                                            }

                                            i_48 = StaticClass10.playersInsideViewportCount;
                                            ints_50 = StaticClass10.playerIndexesInsideViewport;

                                            for (i_54 = 0; i_54 < i_48; i_54++) {
                                                player_32 = players[ints_50[i_54]];
                                                if (player_32 != null && player_32.int626 == npc_45.int626 && npc_45.int609 == player_32.int609)
                                                    staticMethod322(player_32, ints_50[i_54], i_24, i_43);
                                            }
                                        }

                                        staticMethod321(npc_45.npcType1, i_27, i_24, i_43);
                                    }

                                    if (i_26 == 0) {
                                        Player player_46 = players[i_27];
                                        if (player_46 == null)
                                            continue;

                                        if ((player_46.int626 & 0x7f) == 64 && (player_46.int609 & 0x7f) == 64) {
                                            for (i_48 = 0; i_48 < staticInt186; i_48++) {
                                                npc_49 = staticNpcArray1[staticIntArray91[i_48]];
                                                if (npc_49 != null && npc_49.npcType1.name == 1 && player_46.int626 == npc_49.int626 && npc_49.int609 == player_46.int609)
                                                    staticMethod321(npc_49.npcType1, staticIntArray91[i_48], i_24, i_43);
                                            }

                                            i_48 = StaticClass10.playersInsideViewportCount;
                                            ints_50 = StaticClass10.playerIndexesInsideViewport;

                                            for (i_54 = 0; i_54 < i_48; i_54++) {
                                                player_32 = players[ints_50[i_54]];
                                                if (player_32 != null && player_46 != player_32 && player_46.int626 == player_32.int626 && player_46.int609 == player_32.int609)
                                                    staticMethod322(player_32, ints_50[i_54], i_24, i_43);
                                            }
                                        }

                                        if (i_27 != staticInt234)
                                            staticMethod322(player_46, i_27, i_24, i_43);
                                        else
                                            i_20 = i_23;
                                    }

                                    if (i_26 == 3) {
                                        Deque deque_47 = staticDequeArrayArrayArray1[DataClass14.staticInt156][i_24][i_43];
                                        if (deque_47 != null)
                                            for (Item item_51 = (Item) deque_47.method258(); item_51 != null; item_51 = (Item) deque_47.method260()) {
                                                ObjType objtype_52 = ObjType.staticMethod421(item_51.int657);
                                                if (staticInt194 == 1)
                                                    staticMethod318("Use", staticString315 + " " + "->" + " " + StaticClass13.staticMethod64(16748608) + objtype_52.name, 16, item_51.int657, i_24, i_43);
                                                else if (staticBool36) {
                                                    if ((Class1.staticInt3 & 0x1) == 1)
                                                        staticMethod318(staticString316, staticString313 + " " + "->" + " " + StaticClass13.staticMethod64(16748608) + objtype_52.name, 17, item_51.int657, i_24, i_43);
                                                } else {
                                                    String[] arr_55 = objtype_52.op;
                                                    if (staticBool29)
                                                        arr_55 = staticMethod345(arr_55);

                                                    for (int i_53 = 4; i_53 >= 0; --i_53)
                                                        if (arr_55 != null && arr_55[i_53] != null) {
                                                            byte b_33 = 0;
                                                            if (i_53 == 0)
                                                                b_33 = 18;

                                                            if (i_53 == 1)
                                                                b_33 = 19;

                                                            if (i_53 == 2)
                                                                b_33 = 20;

                                                            if (i_53 == 3)
                                                                b_33 = 21;

                                                            if (i_53 == 4)
                                                                b_33 = 22;

                                                            staticMethod318(arr_55[i_53], StaticClass13.staticMethod64(16748608) + objtype_52.name, b_33, item_51.int657, i_24, i_43);
                                                        } else if (i_53 == 2)
                                                            staticMethod318("Take", StaticClass13.staticMethod64(16748608) + objtype_52.name, 20, item_51.int657, i_24, i_43);

                                                    staticMethod318("Examine", StaticClass13.staticMethod64(16748608) + objtype_52.name, 1004, item_51.int657, i_24, i_43);
                                                }
                                            }
                                    }
                                }
                            }

                            if (i_20 != -1) {
                                i_42 = i_20 & 0x7f;
                                i_23 = i_20 >> 7 & 0x7f;
                                Player player_44 = players[staticInt234];
                                staticMethod322(player_44, staticInt234, i_42, i_23);
                            }
                        }
                    } else if (widget_10.int396 == 1338)
                        staticMethod267(widget_10, i_11, i_12);
                    else {
                        if (widget_10.int396 == 1400)
                            GameObject.staticClass11_1.method326(MouseHandler.staticInt28, MouseHandler.staticInt29, bool_34, i_11, i_12, widget_10.int406, widget_10.int407);

                        if (!staticBool34 && bool_34)
                            if (widget_10.int396 == 1400)
                                GameObject.staticClass11_1.method374(i_11, i_12, widget_10.int406, widget_10.int407, i_17, i_18);
                            else
                                staticMethod337(widget_10, i_17 - i_11, i_18 - i_12);

                        if (widget_10.type == 0) {
                            if (!widget_10.bool34 && staticMethod362(widget_10) && widget_10 != WMEnum5.staticWidget1)
                                continue;

                            staticMethod338(arr_0, widget_10.int444, i_13, i_14, i_15, i_16, i_11 - widget_10.int419, i_12 - widget_10.int451);
                            if (widget_10.widgetArray1 != null)
                                staticMethod338(widget_10.widgetArray1, widget_10.int444, i_13, i_14, i_15, i_16, i_11 - widget_10.int419, i_12 - widget_10.int451);

                            NodeSub1 nodesub1_35 = (NodeSub1) staticHashTable7.get(widget_10.int444);
                            if (nodesub1_35 != null) {
                                if (nodesub1_35.int318 == 0 && MouseHandler.staticInt28 >= i_13 && MouseHandler.staticInt29 >= i_14 && MouseHandler.staticInt28 < i_15 && MouseHandler.staticInt29 < i_16 && !staticBool34 && !staticBool28) {
                                    for (RuneScript runescript_21 = (RuneScript) staticDeque8.method257(); runescript_21 != null; runescript_21 = (RuneScript) staticDeque8.method259())
                                        if (runescript_21.bool23) {
                                            runescript_21.unlink();
                                            runescript_21.widget2.bool35 = false;
                                        }

                                    if (Stopwatch.staticInt131 == 0) {
                                        staticWidget10 = null;
                                        staticWidget9 = null;
                                    }

                                    if (!staticBool34) {
                                        staticInt225 = 0;
                                        staticBool34 = false;
                                        staticStringArray8[0] = "Cancel";
                                        staticStringArray9[0] = "";
                                        staticIntArray97[0] = 1006;
                                        staticBoolArray4[0] = false;
                                        staticInt225 = 1;
                                    }
                                }

                                i_37 = nodesub1_35.int317;
                                if (Widget.staticMethod383(i_37))
                                    staticMethod338(StaticClass25.staticWidgetArrayArray1[i_37], -1, i_13, i_14, i_15, i_16, i_11, i_12);
                            }
                        }

                        if (widget_10.bool34) {
                            RuneScript runescript_36;
                            if (!widget_10.bool44) {
                                if (widget_10.bool45 && MouseHandler.staticInt28 >= i_13 && MouseHandler.staticInt29 >= i_14 && MouseHandler.staticInt28 < i_15 && MouseHandler.staticInt29 < i_16)
                                    for (runescript_36 = (RuneScript) staticDeque8.method257(); runescript_36 != null; runescript_36 = (RuneScript) staticDeque8.method259())
                                        if (runescript_36.bool23 && runescript_36.widget2.objectArray21 == runescript_36.objectArray1)
                                            runescript_36.unlink();
                            } else if (MouseHandler.staticInt28 >= i_13 && MouseHandler.staticInt29 >= i_14 && MouseHandler.staticInt28 < i_15 && MouseHandler.staticInt29 < i_16) {
                                for (runescript_36 = (RuneScript) staticDeque8.method257(); runescript_36 != null; runescript_36 = (RuneScript) staticDeque8.method259())
                                    if (runescript_36.bool23) {
                                        runescript_36.unlink();
                                        runescript_36.widget2.bool35 = false;
                                    }

                                if (Stopwatch.staticInt131 == 0) {
                                    staticWidget10 = null;
                                    staticWidget9 = null;
                                }

                                if (!staticBool34) {
                                    staticInt225 = 0;
                                    staticBool34 = false;
                                    staticStringArray8[0] = "Cancel";
                                    staticStringArray9[0] = "";
                                    staticIntArray97[0] = 1006;
                                    staticBoolArray4[0] = false;
                                    staticInt225 = 1;
                                }
                            }

                            if (MouseHandler.staticInt28 >= i_13 && MouseHandler.staticInt29 >= i_14 && MouseHandler.staticInt28 < i_15 && MouseHandler.staticInt29 < i_16)
                                bool_34 = true;
                            else
                                bool_34 = false;

                            boolean bool_40 = false;
                            if ((MouseHandler.staticInt26 == 1 || !SoundBank.staticBool11 && MouseHandler.staticInt26 == 4) && bool_34)
                                bool_40 = true;

                            boolean bool_38 = false;
                            if ((MouseHandler.staticInt27 == 1 || !SoundBank.staticBool11 && MouseHandler.staticInt27 == 4) && MouseHandler.staticInt30 >= i_13 && MouseHandler.staticInt31 >= i_14 && MouseHandler.staticInt30 < i_15 && MouseHandler.staticInt31 < i_16)
                                bool_38 = true;

                            if (bool_38)
                                staticMethod340(widget_10, MouseHandler.staticInt30 - i_11, MouseHandler.staticInt31 - i_12);

                            if (widget_10.int396 == 1400)
                                GameObject.staticClass11_1.method327(MouseHandler.staticInt28, MouseHandler.staticInt29, bool_34 & bool_40, bool_34 & bool_38);

                            if (staticWidget10 != null && staticWidget10 != widget_10 && bool_34) {
                                i_23 = staticMethod360(widget_10);
                                boolean bool_22 = (i_23 >> 20 & 0x1) != 0;
                                if (bool_22)
                                    staticWidget8 = widget_10;
                            }

                            if (staticWidget9 == widget_10) {
                                staticBool38 = true;
                                staticInt251 = i_11;
                                staticInt252 = i_12;
                            }

                            if (widget_10.bool42) {
                                RuneScript runescript_39;
                                if (bool_34 && staticInt265 != 0 && widget_10.objectArray21 != null) {
                                    runescript_39 = new RuneScript();
                                    runescript_39.bool23 = true;
                                    runescript_39.widget2 = widget_10;
                                    runescript_39.int313 = staticInt265;
                                    runescript_39.objectArray1 = widget_10.objectArray21;
                                    staticDeque8.method253(runescript_39);
                                }

                                if (staticWidget10 != null || ClanMember.staticWidget7 != null || staticBool34) {
                                    bool_38 = false;
                                    bool_40 = false;
                                    bool_34 = false;
                                }

                                if (!widget_10.bool41 && bool_38) {
                                    widget_10.bool41 = true;
                                    if (widget_10.objectArray3 != null) {
                                        runescript_39 = new RuneScript();
                                        runescript_39.bool23 = true;
                                        runescript_39.widget2 = widget_10;
                                        runescript_39.int312 = MouseHandler.staticInt30 - i_11;
                                        runescript_39.int313 = MouseHandler.staticInt31 - i_12;
                                        runescript_39.objectArray1 = widget_10.objectArray3;
                                        staticDeque8.method253(runescript_39);
                                    }
                                }

                                if (widget_10.bool41 && bool_40 && widget_10.objectArray8 != null) {
                                    runescript_39 = new RuneScript();
                                    runescript_39.bool23 = true;
                                    runescript_39.widget2 = widget_10;
                                    runescript_39.int312 = MouseHandler.staticInt28 - i_11;
                                    runescript_39.int313 = MouseHandler.staticInt29 - i_12;
                                    runescript_39.objectArray1 = widget_10.objectArray8;
                                    staticDeque8.method253(runescript_39);
                                }

                                if (widget_10.bool41 && !bool_40) {
                                    widget_10.bool41 = false;
                                    if (widget_10.objectArray9 != null) {
                                        runescript_39 = new RuneScript();
                                        runescript_39.bool23 = true;
                                        runescript_39.widget2 = widget_10;
                                        runescript_39.int312 = MouseHandler.staticInt28 - i_11;
                                        runescript_39.int313 = MouseHandler.staticInt29 - i_12;
                                        runescript_39.objectArray1 = widget_10.objectArray9;
                                        staticDeque7.method253(runescript_39);
                                    }
                                }

                                if (bool_40 && widget_10.objectArray28 != null) {
                                    runescript_39 = new RuneScript();
                                    runescript_39.bool23 = true;
                                    runescript_39.widget2 = widget_10;
                                    runescript_39.int312 = MouseHandler.staticInt28 - i_11;
                                    runescript_39.int313 = MouseHandler.staticInt29 - i_12;
                                    runescript_39.objectArray1 = widget_10.objectArray28;
                                    staticDeque8.method253(runescript_39);
                                }

                                if (!widget_10.bool35 && bool_34) {
                                    widget_10.bool35 = true;
                                    if (widget_10.objectArray10 != null) {
                                        runescript_39 = new RuneScript();
                                        runescript_39.bool23 = true;
                                        runescript_39.widget2 = widget_10;
                                        runescript_39.int312 = MouseHandler.staticInt28 - i_11;
                                        runescript_39.int313 = MouseHandler.staticInt29 - i_12;
                                        runescript_39.objectArray1 = widget_10.objectArray10;
                                        staticDeque8.method253(runescript_39);
                                    }
                                }

                                if (widget_10.bool35 && bool_34 && widget_10.objectArray11 != null) {
                                    runescript_39 = new RuneScript();
                                    runescript_39.bool23 = true;
                                    runescript_39.widget2 = widget_10;
                                    runescript_39.int312 = MouseHandler.staticInt28 - i_11;
                                    runescript_39.int313 = MouseHandler.staticInt29 - i_12;
                                    runescript_39.objectArray1 = widget_10.objectArray11;
                                    staticDeque8.method253(runescript_39);
                                }

                                if (widget_10.bool35 && !bool_34) {
                                    widget_10.bool35 = false;
                                    if (widget_10.objectArray29 != null) {
                                        runescript_39 = new RuneScript();
                                        runescript_39.bool23 = true;
                                        runescript_39.widget2 = widget_10;
                                        runescript_39.int312 = MouseHandler.staticInt28 - i_11;
                                        runescript_39.int313 = MouseHandler.staticInt29 - i_12;
                                        runescript_39.objectArray1 = widget_10.objectArray29;
                                        staticDeque7.method253(runescript_39);
                                    }
                                }

                                if (widget_10.objectArray5 != null) {
                                    runescript_39 = new RuneScript();
                                    runescript_39.widget2 = widget_10;
                                    runescript_39.objectArray1 = widget_10.objectArray5;
                                    staticDeque9.method253(runescript_39);
                                }

                                RuneScript runescript_25;
                                if (widget_10.objectArray16 != null && staticInt257 > widget_10.int449) {
                                    if (widget_10.intArray55 != null && staticInt257 - widget_10.int449 <= 32)
                                        label762: for (i_42 = widget_10.int449; i_42 < staticInt257; i_42++) {
                                            i_23 = staticIntArray103[i_42 & 0x1f];

                                            for (i_24 = 0; i_24 < widget_10.intArray55.length; i_24++)
                                                if (widget_10.intArray55[i_24] == i_23) {
                                                    runescript_25 = new RuneScript();
                                                    runescript_25.widget2 = widget_10;
                                                    runescript_25.objectArray1 = widget_10.objectArray16;
                                                    staticDeque8.method253(runescript_25);
                                                    break label762;
                                                }
                                        }
                                    else {
                                        runescript_39 = new RuneScript();
                                        runescript_39.widget2 = widget_10;
                                        runescript_39.objectArray1 = widget_10.objectArray16;
                                        staticDeque8.method253(runescript_39);
                                    }

                                    widget_10.int449 = staticInt257;
                                }

                                if (widget_10.objectArray17 != null && staticInt258 > widget_10.int431) {
                                    if (widget_10.intArray60 != null && staticInt258 - widget_10.int431 <= 32)
                                        label738: for (i_42 = widget_10.int431; i_42 < staticInt258; i_42++) {
                                            i_23 = staticIntArray104[i_42 & 0x1f];

                                            for (i_24 = 0; i_24 < widget_10.intArray60.length; i_24++)
                                                if (widget_10.intArray60[i_24] == i_23) {
                                                    runescript_25 = new RuneScript();
                                                    runescript_25.widget2 = widget_10;
                                                    runescript_25.objectArray1 = widget_10.objectArray17;
                                                    staticDeque8.method253(runescript_25);
                                                    break label738;
                                                }
                                        }
                                    else {
                                        runescript_39 = new RuneScript();
                                        runescript_39.widget2 = widget_10;
                                        runescript_39.objectArray1 = widget_10.objectArray17;
                                        staticDeque8.method253(runescript_39);
                                    }

                                    widget_10.int431 = staticInt258;
                                }

                                if (widget_10.objectArray6 != null && staticInt259 > widget_10.int436) {
                                    if (widget_10.intArray56 != null && staticInt259 - widget_10.int436 <= 32)
                                        label714: for (i_42 = widget_10.int436; i_42 < staticInt259; i_42++) {
                                            i_23 = staticIntArray111[i_42 & 0x1f];

                                            for (i_24 = 0; i_24 < widget_10.intArray56.length; i_24++)
                                                if (widget_10.intArray56[i_24] == i_23) {
                                                    runescript_25 = new RuneScript();
                                                    runescript_25.widget2 = widget_10;
                                                    runescript_25.objectArray1 = widget_10.objectArray6;
                                                    staticDeque8.method253(runescript_25);
                                                    break label714;
                                                }
                                        }
                                    else {
                                        runescript_39 = new RuneScript();
                                        runescript_39.widget2 = widget_10;
                                        runescript_39.objectArray1 = widget_10.objectArray6;
                                        staticDeque8.method253(runescript_39);
                                    }

                                    widget_10.int436 = staticInt259;
                                }

                                if (staticInt290 > widget_10.int421 && widget_10.objectArray19 != null) {
                                    runescript_39 = new RuneScript();
                                    runescript_39.widget2 = widget_10;
                                    runescript_39.objectArray1 = widget_10.objectArray19;
                                    staticDeque8.method253(runescript_39);
                                }

                                if (staticInt260 > widget_10.int421 && widget_10.objectArray2 != null) {
                                    runescript_39 = new RuneScript();
                                    runescript_39.widget2 = widget_10;
                                    runescript_39.objectArray1 = widget_10.objectArray2;
                                    staticDeque8.method253(runescript_39);
                                }

                                if (staticInt261 > widget_10.int421 && widget_10.objectArray4 != null) {
                                    runescript_39 = new RuneScript();
                                    runescript_39.widget2 = widget_10;
                                    runescript_39.objectArray1 = widget_10.objectArray4;
                                    staticDeque8.method253(runescript_39);
                                }

                                if (staticInt262 > widget_10.int421 && widget_10.objectArray25 != null) {
                                    runescript_39 = new RuneScript();
                                    runescript_39.widget2 = widget_10;
                                    runescript_39.objectArray1 = widget_10.objectArray25;
                                    staticDeque8.method253(runescript_39);
                                }

                                if (staticInt263 > widget_10.int421 && widget_10.objectArray26 != null) {
                                    runescript_39 = new RuneScript();
                                    runescript_39.widget2 = widget_10;
                                    runescript_39.objectArray1 = widget_10.objectArray26;
                                    staticDeque8.method253(runescript_39);
                                }

                                if (staticInt264 > widget_10.int421 && widget_10.objectArray27 != null) {
                                    runescript_39 = new RuneScript();
                                    runescript_39.widget2 = widget_10;
                                    runescript_39.objectArray1 = widget_10.objectArray27;
                                    staticDeque8.method253(runescript_39);
                                }

                                widget_10.int421 = staticInt256;
                                if (widget_10.objectArray20 != null)
                                    for (i_42 = 0; i_42 < staticInt276; i_42++) {
                                        RuneScript runescript_41 = new RuneScript();
                                        runescript_41.widget2 = widget_10;
                                        runescript_41.int315 = staticIntArray108[i_42];
                                        runescript_41.int311 = staticIntArray119[i_42];
                                        runescript_41.objectArray1 = widget_10.objectArray20;
                                        staticDeque8.method253(runescript_41);
                                    }
                            }
                        }

                        if (!widget_10.bool34 && staticWidget10 == null && ClanMember.staticWidget7 == null && !staticBool34) {
                            if ((widget_10.int445 >= 0 || widget_10.int414 != 0) && MouseHandler.staticInt28 >= i_13 && MouseHandler.staticInt29 >= i_14 && MouseHandler.staticInt28 < i_15 && MouseHandler.staticInt29 < i_16)
                                if (widget_10.int445 >= 0)
                                    WMEnum5.staticWidget1 = arr_0[widget_10.int445];
                                else
                                    WMEnum5.staticWidget1 = widget_10;

                            if (widget_10.type == 8 && MouseHandler.staticInt28 >= i_13 && MouseHandler.staticInt29 >= i_14 && MouseHandler.staticInt28 < i_15 && MouseHandler.staticInt29 < i_16)
                                Class2.staticWidget2 = widget_10;

                            if (widget_10.int411 > widget_10.int407)
                                staticMethod332(widget_10, i_11 + widget_10.int406, i_12, widget_10.int407, widget_10.int411, MouseHandler.staticInt28, MouseHandler.staticInt29);
                        }
                    }
                }
            }
        }

    }

    static final void staticMethod339(Widget[] arr_0, int i_1) {
        for (int i_3 = 0; i_3 < arr_0.length; i_3++) {
            Widget widget_4 = arr_0[i_3];
            if (widget_4 != null) {
                if (widget_4.type == 0) {
                    if (widget_4.widgetArray1 != null)
                        staticMethod339(widget_4.widgetArray1, i_1);

                    NodeSub1 nodesub1_5 = (NodeSub1) staticHashTable7.get(widget_4.int444);
                    if (nodesub1_5 != null) {
                        int i_6 = nodesub1_5.int317;
                        if (Widget.staticMethod383(i_6))
                            staticMethod339(StaticClass25.staticWidgetArrayArray1[i_6], i_1);
                    }
                }

                RuneScript runescript_7;
                if (i_1 == 0 && widget_4.objectArray22 != null) {
                    runescript_7 = new RuneScript();
                    runescript_7.widget2 = widget_4;
                    runescript_7.objectArray1 = widget_4.objectArray22;
                    StaticClass15.staticMethod79(runescript_7);
                }

                if (i_1 == 1 && widget_4.objectArray23 != null) {
                    if (widget_4.int394 >= 0) {
                        Widget widget_8 = Widget.staticMethod381(widget_4.int444);
                        if (widget_8 == null || widget_8.widgetArray1 == null || widget_4.int394 >= widget_8.widgetArray1.length || widget_4 != widget_8.widgetArray1[widget_4.int394])
                            continue;
                    }

                    runescript_7 = new RuneScript();
                    runescript_7.widget2 = widget_4;
                    runescript_7.objectArray1 = widget_4.objectArray23;
                    StaticClass15.staticMethod79(runescript_7);
                }
            }
        }

    }

    static final void staticMethod340(Widget widget_0, int i_1, int i_2) {
        if (staticWidget10 == null && !staticBool34)
            if (widget_0 != null && staticMethod344(widget_0) != null) {
                staticWidget10 = widget_0;
                Widget widget_5 = staticMethod361(widget_0);
                if (widget_5 == null)
                    widget_5 = widget_0.widget3;

                staticWidget9 = widget_5;
                staticInt249 = i_1;
                staticInt250 = i_2;
                Stopwatch.staticInt131 = 0;
                staticBool44 = false;
                int i_7 = staticInt225 - 1;
                if (i_7 != -1) {
                    WMEnum2.staticContextMenuItem1 = new ContextMenuItem();
                    WMEnum2.staticContextMenuItem1.int102 = staticIntArray79[i_7];
                    WMEnum2.staticContextMenuItem1.int101 = staticIntArray101[i_7];
                    WMEnum2.staticContextMenuItem1.int100 = staticIntArray97[i_7];
                    WMEnum2.staticContextMenuItem1.int103 = staticIntArray80[i_7];
                    WMEnum2.staticContextMenuItem1.string10 = staticStringArray8[i_7];
                }

            }
    }

    final void method409() {
        staticMethod342(staticWidget10);
        ++Stopwatch.staticInt131;
        if (staticBool39 && staticBool38) {
            int i_2 = MouseHandler.staticInt28;
            int i_3 = MouseHandler.staticInt29;
            i_2 -= staticInt249;
            i_3 -= staticInt250;
            if (i_2 < staticInt251)
                i_2 = staticInt251;

            if (staticWidget10.int406 + i_2 > staticWidget9.int406 + staticInt251)
                i_2 = staticInt251 + staticWidget9.int406 - staticWidget10.int406;

            if (i_3 < staticInt252)
                i_3 = staticInt252;

            if (staticWidget10.int407 + i_3 > staticInt252 + staticWidget9.int407)
                i_3 = staticInt252 + staticWidget9.int407 - staticWidget10.int407;

            int i_4 = i_2 - staticInt253;
            int i_5 = i_3 - staticInt254;
            int i_6 = staticWidget10.int443;
            if (Stopwatch.staticInt131 > staticWidget10.int448 && (i_4 > i_6 || i_4 < -i_6 || i_5 > i_6 || i_5 < -i_6))
                staticBool44 = true;

            int i_7 = staticWidget9.int419 + i_2 - staticInt251;
            int i_8 = staticWidget9.int451 + i_3 - staticInt252;
            RuneScript runescript_9;
            if (staticWidget10.objectArray12 != null && staticBool44) {
                runescript_9 = new RuneScript();
                runescript_9.widget2 = staticWidget10;
                runescript_9.int312 = i_7;
                runescript_9.int313 = i_8;
                runescript_9.objectArray1 = staticWidget10.objectArray12;
                StaticClass15.staticMethod79(runescript_9);
            }

            if (MouseHandler.staticInt26 == 0) {
                if (staticBool44) {
                    if (staticWidget10.objectArray13 != null) {
                        runescript_9 = new RuneScript();
                        runescript_9.widget2 = staticWidget10;
                        runescript_9.int312 = i_7;
                        runescript_9.int313 = i_8;
                        runescript_9.widget1 = staticWidget8;
                        runescript_9.objectArray1 = staticWidget10.objectArray13;
                        StaticClass15.staticMethod79(runescript_9);
                    }

                    if (staticWidget8 != null && staticMethod361(staticWidget10) != null) {
                        staticPacket1.writeOpcode(173);
                        staticPacket1.method474(staticWidget8.int394); // 2
                        staticPacket1.writeShort(staticWidget8.int453);
                        staticPacket1.method483(staticWidget8.int444); // 4
                        staticPacket1.method475(staticWidget10.int453); // 2
                        staticPacket1.method473(staticWidget10.int394); // 2
                        staticPacket1.method483(staticWidget10.int444); // 4
                    }
                } else if (method405())
                    method406(staticInt249 + staticInt253, staticInt254 + staticInt250);
                else if (staticInt225 > 0)
                    staticMethod341(staticInt249 + staticInt253, staticInt254 + staticInt250);

                staticWidget10 = null;
            }

        } else if (Stopwatch.staticInt131 > 1)
            staticWidget10 = null;
    }

    static void staticMethod341(int i_0, int i_1) {
        staticMethod313(WMEnum2.staticContextMenuItem1, i_0, i_1);
        WMEnum2.staticContextMenuItem1 = null;
    }

    static void staticMethod342(Widget widget_0) {
        if (staticInt270 == widget_0.int458)
            staticBoolArray7[widget_0.int457] = true;

    }

    static void staticMethod343() {
        for (NodeSub1 nodesub1_1 = (NodeSub1) staticHashTable7.method267(); nodesub1_1 != null; nodesub1_1 = (NodeSub1) staticHashTable7.method268()) {
            int i_2 = nodesub1_1.int317;
            if (Widget.staticMethod383(i_2)) {
                boolean bool_3 = true;
                Widget[] arr_4 = StaticClass25.staticWidgetArrayArray1[i_2];

                int i_5;
                for (i_5 = 0; i_5 < arr_4.length; i_5++)
                    if (arr_4[i_5] != null) {
                        bool_3 = arr_4[i_5].bool34;
                        break;
                    }

                if (!bool_3) {
                    i_5 = (int) nodesub1_1.id;
                    Widget widget_6 = Widget.staticMethod381(i_5);
                    if (widget_6 != null)
                        staticMethod342(widget_6);
                }
            }
        }

    }

    static Widget staticMethod344(Widget widget_0) {
        Widget widget_2 = staticMethod361(widget_0);
        if (widget_2 == null)
            widget_2 = widget_0.widget3;

        return widget_2;
    }

    static final String[] staticMethod345(String[] arr_0) {
        String[] arr_2 = new String[5];

        for (int i_3 = 0; i_3 < 5; i_3++) {
            arr_2[i_3] = i_3 + ": ";
            if (arr_0 != null && arr_0[i_3] != null)
                arr_2[i_3] = arr_2[i_3] + arr_0[i_3];
        }

        return arr_2;
    }

    static final void staticMethod346(int i_0) {
        if (Widget.staticMethod383(i_0)) {
            Widget[] arr_2 = StaticClass25.staticWidgetArrayArray1[i_0];

            for (int i_3 = 0; i_3 < arr_2.length; i_3++) {
                Widget widget_4 = arr_2[i_3];
                if (widget_4 != null) {
                    widget_4.int452 = 0;
                    widget_4.int455 = 0;
                }
            }

        }
    }

    static final void staticMethod347(Widget[] arr_0, int i_1) {
        for (int i_3 = 0; i_3 < arr_0.length; i_3++) {
            Widget widget_4 = arr_0[i_3];
            if (widget_4 != null && widget_4.parentId == i_1 && (!widget_4.bool34 || !staticMethod362(widget_4))) {
                int i_6;
                if (widget_4.type == 0) {
                    if (!widget_4.bool34 && staticMethod362(widget_4) && WMEnum5.staticWidget1 != widget_4)
                        continue;

                    staticMethod347(arr_0, widget_4.int444);
                    if (widget_4.widgetArray1 != null)
                        staticMethod347(widget_4.widgetArray1, widget_4.int444);

                    NodeSub1 nodesub1_5 = (NodeSub1) staticHashTable7.get(widget_4.int444);
                    if (nodesub1_5 != null) {
                        i_6 = nodesub1_5.int317;
                        if (Widget.staticMethod383(i_6))
                            staticMethod347(StaticClass25.staticWidgetArrayArray1[i_6], -1);
                    }
                }

                if (widget_4.type == 6) {
                    if (widget_4.int391 != -1 || widget_4.int426 != -1) {
                        boolean bool_8 = staticMethod334(widget_4);
                        if (bool_8)
                            i_6 = widget_4.int426;
                        else
                            i_6 = widget_4.int391;

                        if (i_6 != -1) {
                            SeqType seqtype_7 = SeqType.staticMethod438(i_6);

                            for (widget_4.int455 += staticInt272; widget_4.int455 > seqtype_7.frameLengths[widget_4.int452]; staticMethod342(widget_4)) {
                                widget_4.int455 -= seqtype_7.frameLengths[widget_4.int452];
                                ++widget_4.int452;
                                if (widget_4.int452 >= seqtype_7.frameIds.length) {
                                    widget_4.int452 -= seqtype_7.frameStep;
                                    if (widget_4.int452 < 0 || widget_4.int452 >= seqtype_7.frameIds.length)
                                        widget_4.int452 = 0;
                                }
                            }
                        }
                    }

                    if (widget_4.int433 != 0 && !widget_4.bool34) {
                        int i_9 = widget_4.int433 >> 16;
                        i_6 = widget_4.int433 << 16 >> 16;
                        i_9 *= staticInt272;
                        i_6 *= staticInt272;
                        widget_4.int429 = i_9 + widget_4.int429 & 0x7ff;
                        widget_4.int430 = i_6 + widget_4.int430 & 0x7ff;
                        staticMethod342(widget_4);
                    }
                }
            }
        }

    }

    static final void staticMethod348(int i_0) {
        staticMethod343();
        NodeSub3.staticMethod367();
        int i_2 = Varp.staticMethod424(i_0).value;
        if (i_2 != 0) {
            int i_3 = StaticClass44.staticIntArray68[i_0];
            if (i_2 == 1) {
                if (i_3 == 1) {
                    Rasterizer3D.staticMethod475(0.9D);
                    ((TextureLoader) Rasterizer3D.staticInterface2_1).method149(0.9D);
                }

                if (i_3 == 2) {
                    Rasterizer3D.staticMethod475(0.8D);
                    ((TextureLoader) Rasterizer3D.staticInterface2_1).method149(0.8D);
                }

                if (i_3 == 3) {
                    Rasterizer3D.staticMethod475(0.7D);
                    ((TextureLoader) Rasterizer3D.staticInterface2_1).method149(0.7D);
                }

                if (i_3 == 4) {
                    Rasterizer3D.staticMethod475(0.6D);
                    ((TextureLoader) Rasterizer3D.staticInterface2_1).method149(0.6D);
                }

                ObjType.staticCache26.method264();
            }

            if (i_2 == 3) {
                short s_4 = 0;
                if (i_3 == 0)
                    s_4 = 255;

                if (i_3 == 1)
                    s_4 = 192;

                if (i_3 == 2)
                    s_4 = 128;

                if (i_3 == 3)
                    s_4 = 64;

                if (i_3 == 4)
                    s_4 = 0;

                if (staticInt197 != s_4) {
                    if (staticInt197 == 0 && staticInt248 != -1) {
                        StaticClass32.staticMethod164(StaticClass54.staticJs5IndexImpl11, staticInt248, 0, s_4, false);
                        staticBool43 = false;
                    } else if (s_4 == 0) {
                        StaticClass32.staticMethod166();
                        staticBool43 = false;
                    } else
                        StaticClass32.staticMethod165(s_4);

                    staticInt197 = s_4;
                }
            }

            if (i_2 == 4) {
                if (i_3 == 0)
                    staticInt174 = 127;

                if (i_3 == 1)
                    staticInt174 = 96;

                if (i_3 == 2)
                    staticInt174 = 64;

                if (i_3 == 3)
                    staticInt174 = 32;

                if (i_3 == 4)
                    staticInt174 = 0;
            }

            if (i_2 == 5)
                staticInt232 = i_3;

            if (i_2 == 6)
                staticInt242 = i_3;

            if (i_2 == 9)
                staticInt243 = i_3;

            if (i_2 == 10) {
                if (i_3 == 0)
                    staticInt267 = 127;

                if (i_3 == 1)
                    staticInt267 = 96;

                if (i_3 == 2)
                    staticInt267 = 64;

                if (i_3 == 3)
                    staticInt267 = 32;

                if (i_3 == 4)
                    staticInt267 = 0;
            }

            if (i_2 == 17)
                staticInt247 = i_3 & 0xffff;

            Class5[] arr_5;
            if (i_2 == 18) {
                arr_5 = new Class5[] { Class5.staticClass5_2, Class5.staticClass5_3, Class5.staticClass5_4, Class5.staticClass5_1 };
                staticClass5_5 = (Class5) StaticClass26.staticMethod155(arr_5, i_3);
                if (staticClass5_5 == null)
                    staticClass5_5 = Class5.staticClass5_4;
            }

            if (i_2 == 19)
                if (i_3 == -1)
                    staticInt234 = -1;
                else
                    staticInt234 = i_3 & 0x7ff;

            if (i_2 == 22) {
                arr_5 = new Class5[] { Class5.staticClass5_2, Class5.staticClass5_3, Class5.staticClass5_4, Class5.staticClass5_1 };
                staticClass5_6 = (Class5) StaticClass26.staticMethod155(arr_5, i_3);
                if (staticClass5_6 == null)
                    staticClass5_6 = Class5.staticClass5_4;
            }

        }
    }

    static final void staticMethod349() {
        staticPacket1.writeOpcode(124);

        for (NodeSub1 nodesub1_1 = (NodeSub1) staticHashTable7.method267(); nodesub1_1 != null; nodesub1_1 = (NodeSub1) staticHashTable7.method268())
            if (nodesub1_1.int318 == 0 || nodesub1_1.int318 == 3)
                staticMethod350(nodesub1_1, true);

        if (staticWidget11 != null) {
            staticMethod342(staticWidget11);
            staticWidget11 = null;
        }

    }

    static final void staticMethod350(NodeSub1 nodesub1_0, boolean bool_1) {
        int i_3 = nodesub1_0.int317;
        int i_4 = (int) nodesub1_0.id;
        nodesub1_0.unlink();
        if (bool_1)
            Widget.staticMethod384(i_3);

        for (IntProperty intproperty_5 = (IntProperty) staticHashTable6.method267(); intproperty_5 != null; intproperty_5 = (IntProperty) staticHashTable6.method268())
            if ((intproperty_5.id >> 48 & 0xffffL) == i_3)
                intproperty_5.unlink();

        Widget widget_7 = Widget.staticMethod381(i_4);
        if (widget_7 != null)
            staticMethod342(widget_7);

        staticMethod319();
        if (staticInt241 != -1) {
            int i_6 = staticInt241;
            if (Widget.staticMethod383(i_6))
                staticMethod339(StaticClass25.staticWidgetArrayArray1[i_6], 1);
        }

    }

    static final boolean staticMethod351(Widget widget_0) {
        int i_2 = widget_0.int396;
        if (i_2 == 205) {
            staticInt195 = 250;
            return true;
        } else {
            int i_3;
            int i_4;
            if (i_2 >= 300 && i_2 <= 313) {
                i_3 = (i_2 - 300) / 2;
                i_4 = i_2 & 0x1;
                staticPlayerDef1.method297(i_3, i_4 == 1);
            }

            if (i_2 >= 314 && i_2 <= 323) {
                i_3 = (i_2 - 314) / 2;
                i_4 = i_2 & 0x1;
                staticPlayerDef1.method298(i_3, i_4 == 1);
            }

            if (i_2 == 324)
                staticPlayerDef1.method299(false);

            if (i_2 == 325)
                staticPlayerDef1.method299(true);

            if (i_2 == 326) {
                staticPacket1.writeOpcode(155);
                staticPlayerDef1.method300(staticPacket1);
                return true;
            } else
                return false;
        }
    }

    static final void staticMethod352(Widget widget_0, int i_1, int i_2, int i_3) {
        staticMethod263();
        CacheableSub1 cacheablesub1_5 = widget_0.method504(false);
        if (cacheablesub1_5 != null) {
            Rasterizer2D.staticMethod442(i_1, i_2, cacheablesub1_5.int512 + i_1, i_2 + cacheablesub1_5.int511);
            if (staticInt296 != 2 && staticInt296 != 5) {
                int i_6 = staticInt207 & 0x7ff;
                int i_7 = 48 + BufferWrapper.staticPlayer1.int626 / 32;
                int i_8 = 464 - BufferWrapper.staticPlayer1.int609 / 32;
                WMEnum6.staticSprite4.method690(i_1, i_2, cacheablesub1_5.int512, cacheablesub1_5.int511, i_7, i_8, i_6, 256, cacheablesub1_5.intArray83, cacheablesub1_5.intArray82);

                int i_9;
                int i_10;
                int i_11;
                for (i_9 = 0; i_9 < staticInt280; i_9++) {
                    i_10 = staticIntArray109[i_9] * 4 + 2 - BufferWrapper.staticPlayer1.int626 / 32;
                    i_11 = staticIntArray110[i_9] * 4 + 2 - BufferWrapper.staticPlayer1.int609 / 32;
                    WM7.staticMethod3(i_1, i_2, i_10, i_11, staticSpriteArray8[i_9], cacheablesub1_5);
                }

                int i_12;
                int i_13;
                for (i_9 = 0; i_9 < 104; i_9++)
                    for (i_10 = 0; i_10 < 104; i_10++) {
                        Deque deque_20 = staticDequeArrayArrayArray1[DataClass14.staticInt156][i_9][i_10];
                        if (deque_20 != null) {
                            i_12 = 2 + i_9 * 4 - BufferWrapper.staticPlayer1.int626 / 32;
                            i_13 = 2 + i_10 * 4 - BufferWrapper.staticPlayer1.int609 / 32;
                            WM7.staticMethod3(i_1, i_2, i_12, i_13, MouseHandler.staticSpriteArray4[0], cacheablesub1_5);
                        }
                    }

                for (i_9 = 0; i_9 < staticInt186; i_9++) {
                    Npc npc_18 = staticNpcArray1[staticIntArray91[i_9]];
                    if (npc_18 != null && npc_18.method609()) {
                        NpcType npctype_21 = npc_18.npcType1;
                        if (npctype_21 != null && npctype_21.intArray90 != null)
                            npctype_21 = npctype_21.method568();

                        if (npctype_21 != null && npctype_21.bool60 && npctype_21.bool62) {
                            i_12 = npc_18.int626 / 32 - BufferWrapper.staticPlayer1.int626 / 32;
                            i_13 = npc_18.int609 / 32 - BufferWrapper.staticPlayer1.int609 / 32;
                            WM7.staticMethod3(i_1, i_2, i_12, i_13, MouseHandler.staticSpriteArray4[1], cacheablesub1_5);
                        }
                    }
                }

                i_9 = StaticClass10.playersInsideViewportCount;
                int[] ints_19 = StaticClass10.playerIndexesInsideViewport;

                for (i_11 = 0; i_11 < i_9; i_11++) {
                    Player player_22 = players[ints_19[i_11]];
                    if (player_22 != null && player_22.method609() && !player_22.bool78 && BufferWrapper.staticPlayer1 != player_22) {
                        i_13 = player_22.int626 / 32 - BufferWrapper.staticPlayer1.int626 / 32;
                        int i_14 = player_22.int609 / 32 - BufferWrapper.staticPlayer1.int609 / 32;
                        boolean bool_15 = false;
                        if (staticMethod355(player_22.name, true))
                            bool_15 = true;

                        boolean bool_16 = false;

                        for (int i_17 = 0; i_17 < StaticClass62.staticInt158; i_17++)
                            if (player_22.name.equals(Class1.staticClanMemberArray1[i_17].string19)) {
                                bool_16 = true;
                                break;
                            }

                        boolean bool_25 = false;
                        if (BufferWrapper.staticPlayer1.team != 0 && player_22.team != 0 && player_22.team == BufferWrapper.staticPlayer1.team)
                            bool_25 = true;

                        if (bool_15)
                            WM7.staticMethod3(i_1, i_2, i_13, i_14, MouseHandler.staticSpriteArray4[3], cacheablesub1_5);
                        else if (bool_25)
                            WM7.staticMethod3(i_1, i_2, i_13, i_14, MouseHandler.staticSpriteArray4[4], cacheablesub1_5);
                        else if (bool_16)
                            WM7.staticMethod3(i_1, i_2, i_13, i_14, MouseHandler.staticSpriteArray4[5], cacheablesub1_5);
                        else
                            WM7.staticMethod3(i_1, i_2, i_13, i_14, MouseHandler.staticSpriteArray4[2], cacheablesub1_5);
                    }
                }

                if (staticInt170 != 0 && staticInt166 % 20 < 10) {
                    if (staticInt170 == 1 && staticInt171 >= 0 && staticInt171 < staticNpcArray1.length) {
                        Npc npc_23 = staticNpcArray1[staticInt171];
                        if (npc_23 != null) {
                            i_12 = npc_23.int626 / 32 - BufferWrapper.staticPlayer1.int626 / 32;
                            i_13 = npc_23.int609 / 32 - BufferWrapper.staticPlayer1.int609 / 32;
                            staticMethod354(i_1, i_2, i_12, i_13, StaticClass6.staticSpriteArray5[1], cacheablesub1_5);
                        }
                    }

                    if (staticInt170 == 2) {
                        i_11 = staticInt214 * 4 - DataClass10.staticInt111 * 4 + 2 - BufferWrapper.staticPlayer1.int626 / 32;
                        i_12 = staticInt188 * 4 - Class4.staticInt53 * 4 + 2 - BufferWrapper.staticPlayer1.int609 / 32;
                        staticMethod354(i_1, i_2, i_11, i_12, StaticClass6.staticSpriteArray5[1], cacheablesub1_5);
                    }

                    if (staticInt170 == 10 && staticInt172 >= 0 && staticInt172 < players.length) {
                        Player player_24 = players[staticInt172];
                        if (player_24 != null) {
                            i_12 = player_24.int626 / 32 - BufferWrapper.staticPlayer1.int626 / 32;
                            i_13 = player_24.int609 / 32 - BufferWrapper.staticPlayer1.int609 / 32;
                            staticMethod354(i_1, i_2, i_12, i_13, StaticClass6.staticSpriteArray5[1], cacheablesub1_5);
                        }
                    }
                }

                if (staticInt179 != 0) {
                    i_11 = staticInt179 * 4 + 2 - BufferWrapper.staticPlayer1.int626 / 32;
                    i_12 = staticInt281 * 4 + 2 - BufferWrapper.staticPlayer1.int609 / 32;
                    WM7.staticMethod3(i_1, i_2, i_11, i_12, StaticClass6.staticSpriteArray5[0], cacheablesub1_5);
                }

                if (!BufferWrapper.staticPlayer1.bool78)
                    Rasterizer2D.staticMethod450(cacheablesub1_5.int512 / 2 + i_1 - 1, i_2 + cacheablesub1_5.int511 / 2 - 1, 3, 3, 16777215);
            } else
                Rasterizer2D.staticMethod465(i_1, i_2, 0, cacheablesub1_5.intArray83, cacheablesub1_5.intArray82);

            staticBoolArray8[i_3] = true;
        }
    }

    static final void staticMethod353(Widget widget_0, int i_1, int i_2, int i_3) {
        CacheableSub1 cacheablesub1_5 = widget_0.method504(false);
        if (cacheablesub1_5 != null)
            if (staticInt296 < 3)
                ExchangeOfferComparator1.staticSprite3.method690(i_1, i_2, cacheablesub1_5.int512, cacheablesub1_5.int511, 25, 25, staticInt207, 256, cacheablesub1_5.intArray83, cacheablesub1_5.intArray82);
            else
                Rasterizer2D.staticMethod465(i_1, i_2, 0, cacheablesub1_5.intArray83, cacheablesub1_5.intArray82);
    }

    static final void staticMethod354(int i_0, int i_1, int i_2, int i_3, Sprite sprite_4, CacheableSub1 cacheablesub1_5) {
        int i_7 = i_2 * i_2 + i_3 * i_3;
        if (i_7 > 4225 && i_7 < 90000) {
            int i_8 = staticInt207 & 0x7ff;
            int i_9 = Rasterizer3D.staticIntArray156[i_8];
            int i_10 = Rasterizer3D.staticIntArray159[i_8];
            int i_11 = i_10 * i_2 + i_3 * i_9 >> 16;
            int i_12 = i_10 * i_3 - i_9 * i_2 >> 16;
            double d_13 = Math.atan2(i_11, i_12);
            int i_15 = cacheablesub1_5.int512 / 2 - 25;
            int i_16 = (int) (Math.sin(d_13) * i_15);
            int i_17 = (int) (Math.cos(d_13) * i_15);
            byte b_18 = 20;
            ExchangeOfferComparator1.staticSprite2.method691(cacheablesub1_5.int512 / 2 + i_0 - b_18 / 2 + i_16, cacheablesub1_5.int511 / 2 + i_1 - b_18 / 2 - i_17 - 10, b_18, b_18, 15, 15, d_13, 256);
        } else
            WM7.staticMethod3(i_0, i_1, i_2, i_3, sprite_4, cacheablesub1_5);

    }

    static boolean staticMethod355(String string_0, boolean bool_1) {
        if (string_0 == null)
            return false;
        else {
            String string_3 = StaticClass53.staticMethod224(string_0, DataClass14.staticClass12_10);

            for (int i_4 = 0; i_4 < staticInt180; i_4++)
                if (string_3.equalsIgnoreCase(StaticClass53.staticMethod224(staticFriendArray1[i_4].string7, DataClass14.staticClass12_10)) && (!bool_1 || staticFriendArray1[i_4].int88 != 0))
                    return true;

            if (string_3.equalsIgnoreCase(StaticClass53.staticMethod224(BufferWrapper.staticPlayer1.name, DataClass14.staticClass12_10)))
                return true;
            else
                return false;
        }
    }

    static boolean staticMethod356(String string_0) {
        if (string_0 == null)
            return false;
        else {
            String string_2 = StaticClass53.staticMethod224(string_0, DataClass14.staticClass12_10);

            for (int i_3 = 0; i_3 < staticInt295; i_3++) {
                Ignore ignore_4 = staticIgnoreArray1[i_3];
                if (string_2.equalsIgnoreCase(StaticClass53.staticMethod224(ignore_4.string4, DataClass14.staticClass12_10)))
                    return true;

                if (string_2.equalsIgnoreCase(StaticClass53.staticMethod224(ignore_4.string5, DataClass14.staticClass12_10)))
                    return true;
            }

            return false;
        }
    }

    static final void staticMethod357(String string_0) {
        if (string_0 != null)
            if ((staticInt180 < 200 || staticInt229 == 1) && staticInt180 < 400) {
                String string_2 = StaticClass53.staticMethod224(string_0, DataClass14.staticClass12_10);
                if (string_2 != null) {
                    int i_3;
                    String string_5;
                    String string_6;
                    for (i_3 = 0; i_3 < staticInt180; i_3++) {
                        Friend friend_4 = staticFriendArray1[i_3];
                        string_5 = StaticClass53.staticMethod224(friend_4.string7, DataClass14.staticClass12_10);
                        if (string_5 != null && string_5.equals(string_2)) {
                            StaticClass12.staticMethod59(30, "", string_0 + " is already on your friend list");
                            return;
                        }

                        if (friend_4.string6 != null) {
                            string_6 = StaticClass53.staticMethod224(friend_4.string6, DataClass14.staticClass12_10);
                            if (string_6 != null && string_6.equals(string_2)) {
                                StaticClass12.staticMethod59(30, "", string_0 + " is already on your friend list");
                                return;
                            }
                        }
                    }

                    for (i_3 = 0; i_3 < staticInt295; i_3++) {
                        Ignore ignore_7 = staticIgnoreArray1[i_3];
                        string_5 = StaticClass53.staticMethod224(ignore_7.string4, DataClass14.staticClass12_10);
                        if (string_5 != null && string_5.equals(string_2)) {
                            StaticClass12.staticMethod59(30, "", "Please remove " + string_0 + " from your ignore list first");
                            return;
                        }

                        if (ignore_7.string5 != null) {
                            string_6 = StaticClass53.staticMethod224(ignore_7.string5, DataClass14.staticClass12_10);
                            if (string_6 != null && string_6.equals(string_2)) {
                                StaticClass12.staticMethod59(30, "", "Please remove " + string_0 + " from your ignore list first");
                                return;
                            }
                        }
                    }

                    if (StaticClass53.staticMethod224(BufferWrapper.staticPlayer1.name, DataClass14.staticClass12_10).equals(string_2))
                        StaticClass12.staticMethod59(30, "", "You can\'t add yourself to your own friend list");
                    else {
                        staticPacket1.writeOpcode(163);
                        staticPacket1.writeByte(Buffer.staticMethod378(string_0));
                        staticPacket1.method430(string_0);
                    }
                }
            } else
                StaticClass12.staticMethod59(30, "", "Your friend list is full. Max of 200 for free users, and 400 for members");
    }

    static final void staticMethod358(String string_0, int i_1) {
        staticPacket1.writeOpcode(139);
        staticPacket1.writeByte(Buffer.staticMethod378(string_0) + 1);
        staticPacket1.method464(i_1);
        staticPacket1.method430(string_0);
    }

    static final void staticMethod359(String string_0) {
        if (Class1.staticClanMemberArray1 != null) {
            staticPacket1.writeOpcode(216);
            staticPacket1.writeByte(Buffer.staticMethod378(string_0));
            staticPacket1.method430(string_0);
        }
    }

    static int staticMethod360(Widget widget_0) {
        IntProperty intproperty_2 = (IntProperty) staticHashTable6.get(widget_0.int394 + ((long) widget_0.int444 << 32));
        return intproperty_2 != null ? intproperty_2.value : widget_0.int418;
    }

    static Widget staticMethod361(Widget widget_0) {
        int i_2 = StaticClass39.staticMethod178(staticMethod360(widget_0));
        if (i_2 == 0)
            return null;
        else {
            for (int i_3 = 0; i_3 < i_2; i_3++) {
                widget_0 = Widget.staticMethod381(widget_0.parentId);
                if (widget_0 == null)
                    return null;
            }

            return widget_0;
        }
    }

    static boolean staticMethod362(Widget widget_0) {
        if (staticBool28) {
            if (staticMethod360(widget_0) != 0)
                return false;

            if (widget_0.type == 0)
                return false;
        }

        return widget_0.hidden;
    }

    static String staticMethod363(Widget widget_0) {
        int i_3 = staticMethod360(widget_0);
        int i_2 = i_3 >> 11 & 0x3f;
        return i_2 == 0 ? null : widget_0.string26 != null && widget_0.string26.trim().length() != 0 ? widget_0.string26 : null;
    }

    static String staticMethod364(String string_0, boolean bool_1) {
        String str_3 = bool_1 ? "https://" : "http://";
        if (staticInt162 == 1)
            string_0 = string_0 + "-wtrc";
        else if (staticInt162 == 2)
            string_0 = string_0 + "-wtqa";
        else if (staticInt162 == 3)
            string_0 = string_0 + "-wtwip";
        else if (staticInt162 == 5)
            string_0 = string_0 + "-wti";
        else if (staticInt162 == 4)
            string_0 = "local";

        String str_4 = "";
        if (WorldMap.staticString25 != null)
            str_4 = "/p=" + WorldMap.staticString25;

        String str_5 = "runescape.com";
        return str_3 + string_0 + "." + str_5 + "/l=" + staticInt163 + "/a=" + StaticClass9.staticInt46 + str_4 + "/";
    }

    static void staticMethod365(String string_0, boolean bool_1) {
        string_0 = string_0.toLowerCase();
        short[] shorts_3 = new short[16];
        int i_4 = 0;

        for (int i_5 = 0; i_5 < StaticClass43.staticInt134; i_5++) {
            ObjType objtype_6 = ObjType.staticMethod421(i_5);
            if ((!bool_1 || objtype_6.stockmarket) && objtype_6.certtemplate == -1 && objtype_6.name.toLowerCase().indexOf(string_0) != -1) {
                if (i_4 >= 250) {
                    WM3.staticInt152 = -1;
                    WorldMapLabel.staticShortArray1 = null;
                    return;
                }

                if (i_4 >= shorts_3.length) {
                    short[] shorts_7 = new short[shorts_3.length * 2];

                    for (int i_8 = 0; i_8 < i_4; i_8++)
                        shorts_7[i_8] = shorts_3[i_8];

                    shorts_3 = shorts_7;
                }

                shorts_3[i_4++] = (short) i_5;
            }
        }

        WorldMapLabel.staticShortArray1 = shorts_3;
        WMEnum2.staticInt155 = 0;
        WM3.staticInt152 = i_4;
        String[] arr_9 = new String[WM3.staticInt152];

        for (int i_10 = 0; i_10 < WM3.staticInt152; i_10++)
            arr_9[i_10] = ObjType.staticMethod421(shorts_3[i_10]).name;

        StaticClass21.staticMethod137(arr_9, WorldMapLabel.staticShortArray1);
    }

    static void staticMethod366(byte[] bytes_0, int i_1) {
        if (staticByteArray5 == null)
            staticByteArray5 = new byte[24];

        StaticClass30.staticMethod160(bytes_0, i_1, staticByteArray5, 0, 24);
    }

}

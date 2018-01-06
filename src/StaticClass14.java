import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

import com.alex.store.Index;

public class StaticClass14 {

    static int staticInt59 = 0;
    static int staticInt58;
    static int[] staticIntArray24;
    static int staticInt63;
    static int staticInt60;
    static int staticInt61;
    static int staticInt68;
    static int staticInt57;
    static int staticInt62;
    static int staticInt64;
    static String staticString14;
    static int staticInt66;
    static String staticString15;
    static String staticString12;
    static String staticString16;
    static String staticString21;
    static String staticString17;
    static String staticString18;
    static boolean staticBool6;
    static boolean staticBool7;
    static boolean staticBool8;
    static boolean staticBool9;
    static int staticInt67;
    static String staticString20;
    static String staticString13;
    static boolean staticBool10;
    static int staticInt65;
    static IndexedSprite staticIndexedSprite7;
    static IndexedSprite staticIndexedSprite4;
    static IndexedSprite staticIndexedSprite5;
    static IndexedSprite[] staticIndexedSpriteArray3;
    static IndexedSprite staticIndexedSprite6;
    static String staticString19;
    static boolean staticBool5;

    static {
        staticInt58 = staticInt59 + 202;
        staticIntArray24 = new int[256];
        staticInt63 = 0;
        staticInt60 = 0;
        staticInt61 = 0;
        staticInt68 = 0;
        staticInt57 = 0;
        staticInt62 = 0;
        staticInt64 = 10;
        staticString14 = "";
        staticInt66 = 0;
        staticString15 = "";
        staticString12 = "";
        staticString16 = "";
        staticString21 = "";
        staticString17 = "";
        staticString18 = "";
        staticBool6 = false;
        staticBool7 = false;
        staticBool8 = false;
        staticBool9 = true;
        staticInt67 = 0;
        staticString20 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ";
        staticString13 = "1234567890";
        staticBool10 = false;
        staticInt65 = -1;
    }

    StaticClass14() throws Throwable {
        throw new Error();
    }

    static void staticMethod65(Js5Index js5index_0, Js5Index js5index_1, boolean bool_2, int i_3) {
        if (staticBool5) {
            if (i_3 == 4)
                staticInt66 = 4;

        } else {
            staticInt66 = i_3;
            Rasterizer2D.staticMethod446();
            byte[] bytes_5 = js5index_0.getFile("title.jpg", "");
            Mus5Sub4.staticSprite5 = StaticClass6.staticMethod36(bytes_5);
            DataClass3.staticSprite1 = Mus5Sub4.staticSprite5.method675();
            if ((Client.staticInt182 & 0x20000000) != 0)
                staticIndexedSprite7 = StaticClass59.staticMethod235(js5index_1, "logo_deadman_mode", "");
            else
                staticIndexedSprite7 = StaticClass59.staticMethod235(js5index_1, "logo", "");

            staticIndexedSprite4 = StaticClass59.staticMethod235(js5index_1, "titlebox", "");
            staticIndexedSprite5 = StaticClass59.staticMethod235(js5index_1, "titlebutton", "");
            StaticClass52.staticIndexedSpriteArray7 = StaticClass59.staticMethod234(js5index_1, "runes", "");
            staticIndexedSpriteArray3 = StaticClass59.staticMethod234(js5index_1, "title_mute", "");
            TextureLoader.staticIndexedSprite8 = StaticClass59.staticMethod235(js5index_1, "options_radio_buttons,0", "");
            WM1.staticIndexedSprite1 = StaticClass59.staticMethod235(js5index_1, "options_radio_buttons,4", "");
            staticIndexedSprite6 = StaticClass59.staticMethod235(js5index_1, "options_radio_buttons,2", "");
            StaticClass2.staticIndexedSprite2 = StaticClass59.staticMethod235(js5index_1, "options_radio_buttons,6", "");
            BufferedFile.staticInt77 = TextureLoader.staticIndexedSprite8.width;
            SpotAnim.staticInt309 = TextureLoader.staticIndexedSprite8.height;
            NodeSub1.staticIntArray77 = new int[256];

            int i_6;
            for (i_6 = 0; i_6 < 64; i_6++)
                NodeSub1.staticIntArray77[i_6] = i_6 * 262144;

            for (i_6 = 0; i_6 < 64; i_6++)
                NodeSub1.staticIntArray77[i_6 + 64] = i_6 * 1024 + 16711680;

            for (i_6 = 0; i_6 < 64; i_6++)
                NodeSub1.staticIntArray77[i_6 + 128] = i_6 * 4 + 16776960;

            for (i_6 = 0; i_6 < 64; i_6++)
                NodeSub1.staticIntArray77[i_6 + 192] = 16777215;

            DataClass14.staticIntArray75 = new int[256];

            for (i_6 = 0; i_6 < 64; i_6++)
                DataClass14.staticIntArray75[i_6] = i_6 * 1024;

            for (i_6 = 0; i_6 < 64; i_6++)
                DataClass14.staticIntArray75[i_6 + 64] = i_6 * 4 + 65280;

            for (i_6 = 0; i_6 < 64; i_6++)
                DataClass14.staticIntArray75[i_6 + 128] = 65535 + i_6 * 262144;

            for (i_6 = 0; i_6 < 64; i_6++)
                DataClass14.staticIntArray75[i_6 + 192] = 16777215;

            WM8.staticIntArray73 = new int[256];

            for (i_6 = 0; i_6 < 64; i_6++)
                WM8.staticIntArray73[i_6] = i_6 * 4;

            for (i_6 = 0; i_6 < 64; i_6++)
                WM8.staticIntArray73[i_6 + 64] = 255 + i_6 * 262144;

            for (i_6 = 0; i_6 < 64; i_6++)
                WM8.staticIntArray73[i_6 + 128] = 16711935 + i_6 * 1024;

            for (i_6 = 0; i_6 < 64; i_6++)
                WM8.staticIntArray73[i_6 + 192] = 16777215;

            WorldMapArea.staticIntArray1 = new int[256];
            DataClass3.staticIntArray14 = new int[32768];
            Varbit.staticIntArray129 = new int[32768];
            staticMethod75((IndexedSprite) null);
            ClanMember.staticIntArray76 = new int[32768];
            StaticClass35.staticIntArray63 = new int[32768];
            if (bool_2) {
                staticString17 = "";
                staticString18 = "";
            }

            AnimTransform.staticInt303 = 0;
            staticString19 = "";
            staticBool9 = true;
            staticBool10 = false;
            if (!StaticClass61.staticClientPreferences1.bool10)
                StaticClass32.staticMethod167(2, StaticClass54.staticJs5IndexImpl11, "scape main", "", 255, false);
            else
                StaticClass32.staticMethod168(2);

            StaticClass45.staticMethod189(false);
            staticBool5 = true;
            staticInt59 = (StaticClass5.staticInt35 - 765) / 2;
            staticInt58 = staticInt59 + 202;
            WMUnknown2.staticInt12 = 180 + staticInt58;
            Mus5Sub4.staticSprite5.method683(staticInt59, 0);
            DataClass3.staticSprite1.method683(382 + staticInt59, 0);
            staticIndexedSprite7.method673(staticInt59 + 382 - staticIndexedSprite7.width / 2, 18);
        }
    }

    static IndexedSprite staticMethod66(boolean bool_0, boolean bool_1) {
        return bool_0 ? bool_1 ? StaticClass2.staticIndexedSprite2 : staticIndexedSprite6 : bool_1 ? WM1.staticIndexedSprite1 : TextureLoader.staticIndexedSprite8;
    }

    static void staticMethod67() {
        if (staticString17 == null || staticString17.length() <= 0)
            if (StaticClass61.staticClientPreferences1.string11 != null) {
                staticString17 = StaticClass61.staticClientPreferences1.string11;
                staticBool6 = true;
            } else
                staticBool6 = false;
    }

    static void staticMethod68() {
        if (staticBool5) {
            staticIndexedSprite4 = null;
            staticIndexedSprite5 = null;
            StaticClass52.staticIndexedSpriteArray7 = null;
            Mus5Sub4.staticSprite5 = null;
            DataClass3.staticSprite1 = null;
            staticIndexedSprite7 = null;
            staticIndexedSpriteArray3 = null;
            TextureLoader.staticIndexedSprite8 = null;
            staticIndexedSprite6 = null;
            ClanMember.staticSpriteArray7 = null;
            WorldMapLabel.staticIndexedSpriteArray2 = null;
            StaticClass25.staticIndexedSpriteArray6 = null;
            AuthenticatorState.staticIndexedSpriteArray5 = null;
            StaticClass7.staticIndexedSprite3 = null;
            NodeSub1.staticIntArray77 = null;
            DataClass14.staticIntArray75 = null;
            WM8.staticIntArray73 = null;
            WorldMapArea.staticIntArray1 = null;
            DataClass3.staticIntArray14 = null;
            Varbit.staticIntArray129 = null;
            ClanMember.staticIntArray76 = null;
            StaticClass35.staticIntArray63 = null;
            StaticClass32.staticMethod168(2);
            StaticClass45.staticMethod189(true);
            staticBool5 = false;
        }
    }

    static void staticMethod69() {
        if (staticBool6 && staticString17 != null && staticString17.length() > 0)
            staticInt67 = 1;
        else
            staticInt67 = 0;

    }

    static void staticMethod70(GameShell gameshell_0) {
        int i_3;
        int i_4;
        int i_10;
        int i_14;
        if (staticBool10) {
            if (MouseHandler.staticInt27 == 1 || !SoundBank.staticBool11 && MouseHandler.staticInt27 == 4) {
                i_10 = staticInt59 + 280;
                if (MouseHandler.staticInt30 >= i_10 && MouseHandler.staticInt30 <= i_10 + 14 && MouseHandler.staticInt31 >= 4 && MouseHandler.staticInt31 <= 18)
                    World.staticMethod46(0, 0);
                else if (MouseHandler.staticInt30 >= i_10 + 15 && MouseHandler.staticInt30 <= i_10 + 80 && MouseHandler.staticInt31 >= 4 && MouseHandler.staticInt31 <= 18)
                    World.staticMethod46(0, 1);
                else {
                    i_3 = 390 + staticInt59;
                    if (MouseHandler.staticInt30 >= i_3 && MouseHandler.staticInt30 <= i_3 + 14 && MouseHandler.staticInt31 >= 4 && MouseHandler.staticInt31 <= 18)
                        World.staticMethod46(1, 0);
                    else if (MouseHandler.staticInt30 >= i_3 + 15 && MouseHandler.staticInt30 <= i_3 + 80 && MouseHandler.staticInt31 >= 4 && MouseHandler.staticInt31 <= 18)
                        World.staticMethod46(1, 1);
                    else {
                        i_4 = staticInt59 + 500;
                        if (MouseHandler.staticInt30 >= i_4 && MouseHandler.staticInt30 <= i_4 + 14 && MouseHandler.staticInt31 >= 4 && MouseHandler.staticInt31 <= 18)
                            World.staticMethod46(2, 0);
                        else if (MouseHandler.staticInt30 >= i_4 + 15 && MouseHandler.staticInt30 <= i_4 + 80 && MouseHandler.staticInt31 >= 4 && MouseHandler.staticInt31 <= 18)
                            World.staticMethod46(2, 1);
                        else {
                            i_14 = staticInt59 + 610;
                            if (MouseHandler.staticInt30 >= i_14 && MouseHandler.staticInt30 <= i_14 + 14 && MouseHandler.staticInt31 >= 4 && MouseHandler.staticInt31 <= 18)
                                World.staticMethod46(3, 0);
                            else if (MouseHandler.staticInt30 >= i_14 + 15 && MouseHandler.staticInt30 <= i_14 + 80 && MouseHandler.staticInt31 >= 4 && MouseHandler.staticInt31 <= 18)
                                World.staticMethod46(3, 1);
                            else if (MouseHandler.staticInt30 >= staticInt59 + 708 && MouseHandler.staticInt31 >= 4 && MouseHandler.staticInt30 <= 50 + staticInt59 + 708 && MouseHandler.staticInt31 <= 20) {
                                staticBool10 = false;
                                Mus5Sub4.staticSprite5.method683(staticInt59, 0);
                                DataClass3.staticSprite1.method683(382 + staticInt59, 0);
                                staticIndexedSprite7.method673(staticInt59 + 382 - staticIndexedSprite7.width / 2, 18);
                            } else if (staticInt65 != -1) {
                                World world_19 = DataClass8.staticWorldArray1[staticInt65];
                                staticMethod78(world_19);
                                staticBool10 = false;
                                Mus5Sub4.staticSprite5.method683(staticInt59, 0);
                                DataClass3.staticSprite1.method683(382 + staticInt59, 0);
                                staticIndexedSprite7.method673(382 + staticInt59 - staticIndexedSprite7.width / 2, 18);
                            }
                        }
                    }
                }
            }

        } else {
            if ((MouseHandler.staticInt27 == 1 || !SoundBank.staticBool11 && MouseHandler.staticInt27 == 4) && MouseHandler.staticInt30 >= staticInt59 + 765 - 50 && MouseHandler.staticInt31 >= 453) {
                StaticClass61.staticClientPreferences1.bool10 = !StaticClass61.staticClientPreferences1.bool10;
                ClientPreferences.staticMethod63();
                if (!StaticClass61.staticClientPreferences1.bool10) {
                    Index js5indeximpl_2 = StaticClass54.staticJs5IndexImpl11;
                    i_3 = js5indeximpl_2.getArchiveId("scape main");
                    i_4 = js5indeximpl_2.getFileId(i_3, "");
                    StaticClass32.staticMethod164(js5indeximpl_2, i_3, i_4, 255, false);
                } else
                    StaticClass32.staticMethod166();
            }

            if (Client.staticInt165 != 5) {
                ++staticInt57;
                if (Client.staticInt165 == 10 || Client.staticInt165 == 11) {
                    if (Client.staticInt163 == 0) {
                        if (MouseHandler.staticInt27 == 1 || !SoundBank.staticBool11 && MouseHandler.staticInt27 == 4) {
                            i_10 = staticInt59 + 5;
                            short s_11 = 463;
                            byte b_12 = 100;
                            byte b_5 = 35;
                            if (MouseHandler.staticInt30 >= i_10 && MouseHandler.staticInt30 <= i_10 + b_12 && MouseHandler.staticInt31 >= s_11 && MouseHandler.staticInt31 <= b_5 + s_11) {
                                if (World.staticMethod45())
                                    staticBool10 = true;

                                return;
                            }
                        }

                        if (World.staticWorldMap1 != null && World.staticMethod45())
                            staticBool10 = true;
                    }

                    i_10 = MouseHandler.staticInt27;
                    i_3 = MouseHandler.staticInt30;
                    i_4 = MouseHandler.staticInt31;
                    if (i_10 == 0) {
                        i_3 = MouseHandler.staticInt28;
                        i_4 = MouseHandler.staticInt29;
                    }

                    if (!SoundBank.staticBool11 && i_10 == 4)
                        i_10 = 1;

                    int i_6;
                    short s_7;
                    if (staticInt66 == 0) {
                        boolean bool_13 = false;

                        while (KeyboardHandler.staticMethod7())
                            if (StaticClass10.staticInt52 == 84)
                                bool_13 = true;

                        i_6 = WMUnknown2.staticInt12 - 80;
                        s_7 = 291;
                        if (i_10 == 1 && i_3 >= i_6 - 75 && i_3 <= i_6 + 75 && i_4 >= s_7 - 20 && i_4 <= s_7 + 20)
                            StaticClass8.staticMethod38(Client.staticMethod364("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);

                        i_6 = WMUnknown2.staticInt12 + 80;
                        if (i_10 == 1 && i_3 >= i_6 - 75 && i_3 <= i_6 + 75 && i_4 >= s_7 - 20 && i_4 <= s_7 + 20 || bool_13)
                            if ((Client.staticInt182 & 0x2000000) != 0) {
                                staticString15 = "";
                                staticString12 = "This is a <col=00ffff>Beta<col=ffffff> world.";
                                staticString16 = "Your normal account will not be affected.";
                                staticString21 = "";
                                staticInt66 = 1;
                                staticMethod69();
                            } else if ((Client.staticInt182 & 0x4) != 0) {
                                if ((Client.staticInt182 & 0x400) != 0) {
                                    staticString12 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world.";
                                    staticString16 = "Players can attack each other almost everywhere";
                                    staticString21 = "and the Protect Item prayer won\'t work.";
                                } else {
                                    staticString12 = "This is a <col=ff0000>PvP<col=ffffff> world.";
                                    staticString16 = "Players can attack each other";
                                    staticString21 = "almost everywhere.";
                                }

                                staticString15 = "Warning!";
                                staticInt66 = 1;
                                staticMethod69();
                            } else if ((Client.staticInt182 & 0x400) != 0) {
                                staticString12 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
                                staticString16 = "The Protect Item prayer will";
                                staticString21 = "not work on this world.";
                                staticString15 = "Warning!";
                                staticInt66 = 1;
                                staticMethod69();
                            } else
                                staticMethod71(false);
                    } else {
                        short s_16;
                        if (staticInt66 != 1) {
                            short s_15;
                            if (staticInt66 == 2) {
                                s_15 = 201;
                                i_14 = s_15 + 52;
                                if (i_10 == 1 && i_4 >= i_14 - 12 && i_4 < i_14 + 2)
                                    staticInt67 = 0;

                                i_14 += 15;
                                if (i_10 == 1 && i_4 >= i_14 - 12 && i_4 < i_14 + 2)
                                    staticInt67 = 1;

                                i_14 += 15;
                                s_15 = 361;
                                if (i_10 == 1 && i_4 >= s_15 - 15 && i_4 < s_15) {
                                    staticMethod74("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
                                    staticInt66 = 5;
                                    return;
                                }

                                i_6 = WMUnknown2.staticInt12 - 80;
                                s_7 = 321;
                                if (i_10 == 1 && i_3 >= i_6 - 75 && i_3 <= i_6 + 75 && i_4 >= s_7 - 20 && i_4 <= s_7 + 20) {
                                    staticString17 = staticString17.trim();
                                    if (staticString17.length() == 0) {
                                        staticMethod74("", "Please enter your username/email address.", "");
                                        return;
                                    }

                                    if (staticString18.length() == 0) {
                                        staticMethod74("", "Please enter your password.", "");
                                        return;
                                    }

                                    staticMethod74("", "Connecting to server...", "");
                                    Client.staticMethod262(false);
                                    Client.staticMethod253(20);
                                    return;
                                }

                                i_6 = 80 + staticInt58 + 180;
                                if (i_10 == 1 && i_3 >= i_6 - 75 && i_3 <= i_6 + 75 && i_4 >= s_7 - 20 && i_4 <= s_7 + 20) {
                                    staticInt66 = 0;
                                    staticString17 = "";
                                    staticString18 = "";
                                    AnimTransform.staticInt303 = 0;
                                    staticString19 = "";
                                    staticBool9 = true;
                                }

                                i_6 = -117 + WMUnknown2.staticInt12;
                                s_7 = 277;
                                staticBool7 = i_3 >= i_6 && i_3 < i_6 + BufferedFile.staticInt77 && i_4 >= s_7 && i_4 < SpotAnim.staticInt309 + s_7;
                                if (i_10 == 1 && staticBool7) {
                                    staticBool6 = !staticBool6;
                                    if (!staticBool6 && StaticClass61.staticClientPreferences1.string11 != null) {
                                        StaticClass61.staticClientPreferences1.string11 = null;
                                        ClientPreferences.staticMethod63();
                                    }
                                }

                                i_6 = WMUnknown2.staticInt12 + 24;
                                s_7 = 277;
                                staticBool8 = i_3 >= i_6 && i_3 < i_6 + BufferedFile.staticInt77 && i_4 >= s_7 && i_4 < s_7 + SpotAnim.staticInt309;
                                if (i_10 == 1 && staticBool8) {
                                    StaticClass61.staticClientPreferences1.bool12 = !StaticClass61.staticClientPreferences1.bool12;
                                    if (!StaticClass61.staticClientPreferences1.bool12) {
                                        staticString17 = "";
                                        StaticClass61.staticClientPreferences1.string11 = null;
                                        staticMethod69();
                                    }

                                    ClientPreferences.staticMethod63();
                                }

                                while (true) {
                                    while (KeyboardHandler.staticMethod7()) {
                                        boolean bool_8 = false;

                                        for (int i_9 = 0; i_9 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".length(); i_9++)
                                            if (ChatLog.staticChar1 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".charAt(i_9)) {
                                                bool_8 = true;
                                                break;
                                            }

                                        if (StaticClass10.staticInt52 == 13) {
                                            staticInt66 = 0;
                                            staticString17 = "";
                                            staticString18 = "";
                                            AnimTransform.staticInt303 = 0;
                                            staticString19 = "";
                                            staticBool9 = true;
                                        } else if (staticInt67 == 0) {
                                            if (StaticClass10.staticInt52 == 85 && staticString17.length() > 0)
                                                staticString17 = staticString17.substring(0, staticString17.length() - 1);

                                            if (StaticClass10.staticInt52 == 84 || StaticClass10.staticInt52 == 80)
                                                staticInt67 = 1;

                                            if (bool_8 && staticString17.length() < 320)
                                                staticString17 = staticString17 + ChatLog.staticChar1;
                                        } else if (staticInt67 == 1) {
                                            if (StaticClass10.staticInt52 == 85 && staticString18.length() > 0)
                                                staticString18 = staticString18.substring(0, staticString18.length() - 1);

                                            if (StaticClass10.staticInt52 == 84 || StaticClass10.staticInt52 == 80)
                                                staticInt67 = 0;

                                            if (StaticClass10.staticInt52 == 84) {
                                                staticString17 = staticString17.trim();
                                                if (staticString17.length() == 0) {
                                                    staticMethod74("", "Please enter your username/email address.", "");
                                                    return;
                                                }

                                                if (staticString18.length() == 0) {
                                                    staticMethod74("", "Please enter your password.", "");
                                                    return;
                                                }

                                                staticMethod74("", "Connecting to server...", "");
                                                Client.staticMethod262(false);
                                                Client.staticMethod253(20);
                                                return;
                                            }

                                            if (bool_8 && staticString18.length() < 20)
                                                staticString18 = staticString18 + ChatLog.staticChar1;
                                        }
                                    }

                                    return;
                                }
                            } else if (staticInt66 == 3) {
                                i_14 = staticInt58 + 180;
                                s_16 = 276;
                                if (i_10 == 1 && i_3 >= i_14 - 75 && i_3 <= i_14 + 75 && i_4 >= s_16 - 20 && i_4 <= s_16 + 20)
                                    staticMethod71(false);

                                i_14 = 180 + staticInt58;
                                s_16 = 326;
                                if (i_10 == 1 && i_3 >= i_14 - 75 && i_3 <= i_14 + 75 && i_4 >= s_16 - 20 && i_4 <= s_16 + 20) {
                                    staticMethod74("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
                                    staticInt66 = 5;
                                    return;
                                }
                            } else {
                                boolean bool_17;
                                int i_18;
                                if (staticInt66 == 4) {
                                    i_14 = 180 + staticInt58 - 80;
                                    s_16 = 321;
                                    if (i_10 == 1 && i_3 >= i_14 - 75 && i_3 <= i_14 + 75 && i_4 >= s_16 - 20 && i_4 <= s_16 + 20) {
                                        staticString19.trim();
                                        if (staticString19.length() != 6) {
                                            staticMethod74("", "Please enter a 6-digit PIN.", "");
                                            return;
                                        }

                                        AnimTransform.staticInt303 = Integer.parseInt(staticString19);
                                        staticString19 = "";
                                        Client.staticMethod262(true);
                                        staticMethod74("", "Connecting to server...", "");
                                        Client.staticMethod253(20);
                                        return;
                                    }

                                    if (i_10 == 1 && i_3 >= 180 + staticInt58 - 9 && i_3 <= staticInt58 + 180 + 130 && i_4 >= 263 && i_4 <= 296)
                                        staticBool9 = !staticBool9;

                                    if (i_10 == 1 && i_3 >= 180 + staticInt58 - 34 && i_3 <= staticInt58 + 180 + 34 && i_4 >= 351 && i_4 <= 363)
                                        StaticClass8.staticMethod38(Client.staticMethod364("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);

                                    i_14 = staticInt58 + 180 + 80;
                                    if (i_10 == 1 && i_3 >= i_14 - 75 && i_3 <= i_14 + 75 && i_4 >= s_16 - 20 && i_4 <= s_16 + 20) {
                                        staticInt66 = 0;
                                        staticString17 = "";
                                        staticString18 = "";
                                        AnimTransform.staticInt303 = 0;
                                        staticString19 = "";
                                    }

                                    while (KeyboardHandler.staticMethod7()) {
                                        bool_17 = false;

                                        for (i_18 = 0; i_18 < "1234567890".length(); i_18++)
                                            if (ChatLog.staticChar1 == "1234567890".charAt(i_18)) {
                                                bool_17 = true;
                                                break;
                                            }

                                        if (StaticClass10.staticInt52 == 13) {
                                            staticInt66 = 0;
                                            staticString17 = "";
                                            staticString18 = "";
                                            AnimTransform.staticInt303 = 0;
                                            staticString19 = "";
                                        } else {
                                            if (StaticClass10.staticInt52 == 85 && staticString19.length() > 0)
                                                staticString19 = staticString19.substring(0, staticString19.length() - 1);

                                            if (StaticClass10.staticInt52 == 84) {
                                                staticString19.trim();
                                                if (staticString19.length() != 6) {
                                                    staticMethod74("", "Please enter a 6-digit PIN.", "");
                                                    return;
                                                }

                                                AnimTransform.staticInt303 = Integer.parseInt(staticString19);
                                                staticString19 = "";
                                                Client.staticMethod262(true);
                                                staticMethod74("", "Connecting to server...", "");
                                                Client.staticMethod253(20);
                                                return;
                                            }

                                            if (bool_17 && staticString19.length() < 6)
                                                staticString19 = staticString19 + ChatLog.staticChar1;
                                        }
                                    }
                                } else if (staticInt66 == 5) {
                                    i_14 = staticInt58 + 180 - 80;
                                    s_16 = 321;
                                    if (i_10 == 1 && i_3 >= i_14 - 75 && i_3 <= i_14 + 75 && i_4 >= s_16 - 20 && i_4 <= s_16 + 20) {
                                        staticMethod72();
                                        return;
                                    }

                                    i_14 = 180 + staticInt58 + 80;
                                    if (i_10 == 1 && i_3 >= i_14 - 75 && i_3 <= i_14 + 75 && i_4 >= s_16 - 20 && i_4 <= s_16 + 20)
                                        staticMethod71(true);

                                    while (KeyboardHandler.staticMethod7()) {
                                        bool_17 = false;

                                        for (i_18 = 0; i_18 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".length(); i_18++)
                                            if (ChatLog.staticChar1 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".charAt(i_18)) {
                                                bool_17 = true;
                                                break;
                                            }

                                        if (StaticClass10.staticInt52 == 13)
                                            staticMethod71(true);
                                        else {
                                            if (StaticClass10.staticInt52 == 85 && staticString17.length() > 0)
                                                staticString17 = staticString17.substring(0, staticString17.length() - 1);

                                            if (StaticClass10.staticInt52 == 84) {
                                                staticMethod72();
                                                return;
                                            }

                                            if (bool_17 && staticString17.length() < 320)
                                                staticString17 = staticString17 + ChatLog.staticChar1;
                                        }
                                    }
                                } else if (staticInt66 == 6)
                                    while (true) {
                                        do
                                            if (!KeyboardHandler.staticMethod7()) {
                                                s_15 = 321;
                                                if (i_10 == 1 && i_4 >= s_15 - 20 && i_4 <= s_15 + 20)
                                                    staticMethod71(true);

                                                return;
                                            }
                                        while (StaticClass10.staticInt52 != 84 && StaticClass10.staticInt52 != 13);

                                        staticMethod71(true);
                                    }
                            }
                        } else {
                            while (KeyboardHandler.staticMethod7())
                                if (StaticClass10.staticInt52 == 84)
                                    staticMethod71(false);
                                else if (StaticClass10.staticInt52 == 13)
                                    staticInt66 = 0;

                            i_14 = WMUnknown2.staticInt12 - 80;
                            s_16 = 321;
                            if (i_10 == 1 && i_3 >= i_14 - 75 && i_3 <= i_14 + 75 && i_4 >= s_16 - 20 && i_4 <= s_16 + 20)
                                staticMethod71(false);

                            i_14 = 80 + WMUnknown2.staticInt12;
                            if (i_10 == 1 && i_3 >= i_14 - 75 && i_3 <= i_14 + 75 && i_4 >= s_16 - 20 && i_4 <= s_16 + 20)
                                staticInt66 = 0;
                        }
                    }

                }
            }
        }
    }

    static void staticMethod71(boolean bool_0) {
        staticString12 = "";
        staticString16 = "Enter your username/email & password.";
        staticString21 = "";
        staticInt66 = 2;
        if (bool_0)
            staticString18 = "";

        staticMethod67();
        staticMethod69();
    }

    static void staticMethod72() {
        staticString17 = staticString17.trim();
        if (staticString17.length() == 0)
            staticMethod74("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
        else {
            long long_2 = StaticClass9.staticMethod42();
            byte b_1;
            if (long_2 == 0L)
                b_1 = 5;
            else {
                String string_5 = staticString17;
                Random random_6 = new Random();
                Buffer buffer_7 = new Buffer(128);
                Buffer buffer_8 = new Buffer(128);
                int[] ints_9 = new int[] { random_6.nextInt(), random_6.nextInt(), (int) (long_2 >> 32), (int) long_2 };
                buffer_7.writeByte(10);

                int i_10;
                for (i_10 = 0; i_10 < 4; i_10++)
                    buffer_7.writeInt(random_6.nextInt());

                buffer_7.writeInt(ints_9[0]);
                buffer_7.writeInt(ints_9[1]);
                buffer_7.writeLong(long_2);
                buffer_7.writeLong(0L);

                for (i_10 = 0; i_10 < 4; i_10++)
                    buffer_7.writeInt(random_6.nextInt());

                buffer_7.method461(StaticClass9.staticBigInteger2, StaticClass9.staticBigInteger1);
                buffer_8.writeByte(10);

                for (i_10 = 0; i_10 < 3; i_10++)
                    buffer_8.writeInt(random_6.nextInt());

                buffer_8.writeLong(random_6.nextLong());
                buffer_8.writeHexByte(random_6.nextLong());
                if (Client.staticByteArray5 != null)
                    buffer_8.method433(Client.staticByteArray5, 0, Client.staticByteArray5.length);
                else {
                    byte[] bytes_23 = StaticClass16.staticMethod112();
                    buffer_8.method433(bytes_23, 0, bytes_23.length);
                }

                buffer_8.writeLong(random_6.nextLong());
                buffer_8.method461(StaticClass9.staticBigInteger2, StaticClass9.staticBigInteger1);
                i_10 = Buffer.staticMethod378(string_5);
                if (i_10 % 8 != 0)
                    i_10 += 8 - i_10 % 8;

                Buffer buffer_11 = new Buffer(i_10);
                buffer_11.method430(string_5);
                buffer_11.off = i_10;
                buffer_11.method457(ints_9);
                Buffer buffer_12 = new Buffer(buffer_8.off + buffer_7.off + 5 + buffer_11.off);
                buffer_12.writeByte(2);
                buffer_12.writeByte(buffer_7.off);
                buffer_12.method433(buffer_7.buf, 0, buffer_7.off);
                buffer_12.writeByte(buffer_8.off);
                buffer_12.method433(buffer_8.buf, 0, buffer_8.off);
                buffer_12.writeShort(buffer_11.off);
                buffer_12.method433(buffer_11.buf, 0, buffer_11.off);
                String string_13 = StaticClass56.staticMethod228(buffer_12.buf);

                byte b_4;
                try {
                    URL url_14 = new URL(Client.staticMethod364("services", false) + "m=accountappeal/login.ws");
                    URLConnection urlconnection_15 = url_14.openConnection();
                    urlconnection_15.setDoInput(true);
                    urlconnection_15.setDoOutput(true);
                    urlconnection_15.setConnectTimeout(5000);
                    OutputStreamWriter outputstreamwriter_16 = new OutputStreamWriter(urlconnection_15.getOutputStream());
                    outputstreamwriter_16.write("data2=" + StaticClass60.staticMethod246(string_13) + "&dest=" + StaticClass60.staticMethod246("passwordchoice.ws"));
                    outputstreamwriter_16.flush();
                    InputStream inputstream_17 = urlconnection_15.getInputStream();
                    buffer_12 = new Buffer(new byte[1000]);

                    while (true) {
                        int i_18 = inputstream_17.read(buffer_12.buf, buffer_12.off, 1000 - buffer_12.off);
                        if (i_18 == -1) {
                            outputstreamwriter_16.close();
                            inputstream_17.close();
                            String string_24 = new String(buffer_12.buf);
                            if (string_24.startsWith("OFFLINE"))
                                b_4 = 4;
                            else if (string_24.startsWith("WRONG"))
                                b_4 = 7;
                            else if (string_24.startsWith("RELOAD"))
                                b_4 = 3;
                            else if (string_24.startsWith("Not permitted for social network accounts."))
                                b_4 = 6;
                            else {
                                buffer_12.method458(ints_9);

                                while (buffer_12.off > 0 && buffer_12.buf[buffer_12.off - 1] == 0)
                                    --buffer_12.off;

                                string_24 = new String(buffer_12.buf, 0, buffer_12.off);
                                boolean bool_19;
                                if (string_24 == null)
                                    bool_19 = false;
                                else
                                    label93: {
                                        try {
                                            new URL(string_24);
                                        } catch (MalformedURLException malformedurlexception_21) {
                                            bool_19 = false;
                                            break label93;
                                        }

                                        bool_19 = true;
                                    }

                                if (bool_19) {
                                    StaticClass8.staticMethod38(string_24, true, false);
                                    b_4 = 2;
                                } else
                                    b_4 = 5;
                            }
                            break;
                        }

                        buffer_12.off += i_18;
                        if (buffer_12.off >= 1000) {
                            b_4 = 5;
                            break;
                        }
                    }
                } catch (Throwable throwable_22) {
                    throwable_22.printStackTrace();
                    b_4 = 5;
                }

                b_1 = b_4;
            }

            switch (b_1) {
            case 2:
                staticMethod74("", "Page has opened in a new window.", "(Please check your popup blocker.)");
                staticInt66 = 6;
                break;
            case 3:
                staticMethod74("", "Error connecting to server.", "");
                break;
            case 4:
                staticMethod74("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
                break;
            case 5:
                staticMethod74("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
                break;
            case 6:
                staticMethod74("", "Error connecting to server.", "");
                break;
            case 7:
                staticMethod74("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
            }

        }
    }

    static void staticMethod73(FontFace fontface_0, FontFace fontface_1, FontFace fontface_2, boolean bool_3) {
        if (bool_3) {
            staticInt59 = (StaticClass5.staticInt35 - 765) / 2;
            staticInt58 = 202 + staticInt59;
            WMUnknown2.staticInt12 = 180 + staticInt58;
        }

        if (staticBool10)
            staticMethod77(fontface_0, fontface_1);
        else {
            if (bool_3) {
                Mus5Sub4.staticSprite5.method683(staticInt59, 0);
                DataClass3.staticSprite1.method683(staticInt59 + 382, 0);
                staticIndexedSprite7.method673(staticInt59 + 382 - staticIndexedSprite7.width / 2, 18);
            }

            int i_6;
            if (Client.staticInt165 == 0 || Client.staticInt165 == 5) {
                byte b_5 = 20;
                fontface_0.drawString("RuneScape is loading - please wait...", staticInt58 + 180, 245 - b_5, 16777215, -1);
                i_6 = 253 - b_5;
                Rasterizer2D.staticMethod457(180 + staticInt58 - 152, i_6, 304, 34, 9179409);
                Rasterizer2D.staticMethod457(staticInt58 + 180 - 151, i_6 + 1, 302, 32, 0);
                Rasterizer2D.staticMethod450(staticInt58 + 180 - 150, i_6 + 2, staticInt64, 30, 9179409);
                Rasterizer2D.staticMethod450(180 + staticInt58 - 150 + staticInt64, i_6 + 2, 300 - staticInt64, 30, 0);
                fontface_0.drawString(staticString14, staticInt58 + 180, 276 - b_5, 16777215, -1);
            }

            String string_8;
            String string_10;
            String string_11;
            int i_12;
            char[] arr_13;
            int i_14;
            char[] arr_15;
            int i_16;
            short s_17;
            int i_18;
            short s_19;
            String string_25;
            String string_29;
            if (Client.staticInt165 == 20) {
                staticIndexedSprite4.method673(180 + staticInt58 - staticIndexedSprite4.width / 2, 271 - staticIndexedSprite4.height / 2);
                s_17 = 201;
                fontface_0.drawString(staticString12, 180 + staticInt58, s_17, 16776960, 0);
                i_18 = s_17 + 15;
                fontface_0.drawString(staticString16, staticInt58 + 180, i_18, 16776960, 0);
                i_18 += 15;
                fontface_0.drawString(staticString21, staticInt58 + 180, i_18, 16776960, 0);
                i_18 += 15;
                i_18 += 7;
                if (staticInt66 != 4) {
                    fontface_0.method664("Login: ", staticInt58 + 180 - 110, i_18, 16777215, 0);
                    s_19 = 200;
                    if (!StaticClass61.staticClientPreferences1.bool12)
                        string_8 = staticString17;
                    else {
                        string_10 = staticString17;
                        i_12 = string_10.length();
                        arr_13 = new char[i_12];

                        for (i_14 = 0; i_14 < i_12; i_14++)
                            arr_13[i_14] = 42;

                        string_11 = new String(arr_13);
                        string_8 = string_11;
                    }

                    for (string_8 = string_8; fontface_0.stringWidth(string_8) > s_19; string_8 = string_8.substring(0, string_8.length() - 1))
                        ;

                    fontface_0.method664(TypeFace.staticMethod495(string_8), staticInt58 + 180 - 70, i_18, 16777215, 0);
                    i_18 += 15;
                    string_10 = "Password: ";
                    string_25 = staticString18;
                    i_14 = string_25.length();
                    arr_15 = new char[i_14];

                    for (i_16 = 0; i_16 < i_14; i_16++)
                        arr_15[i_16] = 42;

                    string_29 = new String(arr_15);
                    fontface_0.method664(string_10 + string_29, 180 + staticInt58 - 108, i_18, 16777215, 0);
                    i_18 += 15;
                }
            }

            int i_22;
            int i_23;
            int i_24;
            int i_32;
            int i_34;
            if (Client.staticInt165 == 10 || Client.staticInt165 == 11) {
                staticIndexedSprite4.method673(staticInt58, 171);
                short s_7;
                if (staticInt66 == 0) {
                    s_17 = 251;
                    fontface_0.drawString("Welcome to RuneScape", staticInt58 + 180, s_17, 16776960, 0);
                    i_18 = s_17 + 30;
                    i_6 = staticInt58 + 180 - 80;
                    s_7 = 291;
                    staticIndexedSprite5.method673(i_6 - 73, s_7 - 20);
                    fontface_0.method667("New User", i_6 - 73, s_7 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                    i_6 = 80 + staticInt58 + 180;
                    staticIndexedSprite5.method673(i_6 - 73, s_7 - 20);
                    fontface_0.method667("Existing User", i_6 - 73, s_7 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                } else if (staticInt66 == 1) {
                    fontface_0.drawString(staticString15, 180 + staticInt58, 201, 16776960, 0);
                    s_17 = 236;
                    fontface_0.drawString(staticString12, staticInt58 + 180, s_17, 16777215, 0);
                    i_18 = s_17 + 15;
                    fontface_0.drawString(staticString16, staticInt58 + 180, i_18, 16777215, 0);
                    i_18 += 15;
                    fontface_0.drawString(staticString21, staticInt58 + 180, i_18, 16777215, 0);
                    i_18 += 15;
                    i_6 = 180 + staticInt58 - 80;
                    s_7 = 321;
                    staticIndexedSprite5.method673(i_6 - 73, s_7 - 20);
                    fontface_0.drawString("Continue", i_6, s_7 + 5, 16777215, 0);
                    i_6 = 80 + staticInt58 + 180;
                    staticIndexedSprite5.method673(i_6 - 73, s_7 - 20);
                    fontface_0.drawString("Cancel", i_6, s_7 + 5, 16777215, 0);
                } else if (staticInt66 == 2) {
                    s_17 = 201;
                    fontface_0.drawString(staticString12, WMUnknown2.staticInt12, s_17, 16776960, 0);
                    i_18 = s_17 + 15;
                    fontface_0.drawString(staticString16, WMUnknown2.staticInt12, i_18, 16776960, 0);
                    i_18 += 15;
                    fontface_0.drawString(staticString21, WMUnknown2.staticInt12, i_18, 16776960, 0);
                    i_18 += 15;
                    i_18 += 7;
                    fontface_0.method664("Login: ", WMUnknown2.staticInt12 - 110, i_18, 16777215, 0);
                    s_19 = 200;
                    if (!StaticClass61.staticClientPreferences1.bool12)
                        string_8 = staticString17;
                    else {
                        string_10 = staticString17;
                        i_12 = string_10.length();
                        arr_13 = new char[i_12];

                        for (i_14 = 0; i_14 < i_12; i_14++)
                            arr_13[i_14] = 42;

                        string_11 = new String(arr_13);
                        string_8 = string_11;
                    }

                    for (string_8 = string_8; fontface_0.stringWidth(string_8) > s_19; string_8 = string_8.substring(1))
                        ;

                    fontface_0.method664(TypeFace.staticMethod495(string_8) + (staticInt67 == 0 & Client.staticInt166 % 40 < 20 ? StaticClass13.staticMethod64(16776960) + "|" : ""), WMUnknown2.staticInt12 - 70, i_18, 16777215, 0);
                    i_18 += 15;
                    string_10 = "Password: ";
                    string_25 = staticString18;
                    i_14 = string_25.length();
                    arr_15 = new char[i_14];

                    for (i_16 = 0; i_16 < i_14; i_16++)
                        arr_15[i_16] = 42;

                    string_29 = new String(arr_15);
                    fontface_0.method664(string_10 + string_29 + (staticInt67 == 1 & Client.staticInt166 % 40 < 20 ? StaticClass13.staticMethod64(16776960) + "|" : ""), WMUnknown2.staticInt12 - 108, i_18, 16777215, 0);
                    i_18 += 15;
                    s_17 = 277;
                    i_32 = WMUnknown2.staticInt12 + -117;
                    IndexedSprite indexedsprite_35 = staticMethod66(staticBool6, staticBool7);
                    indexedsprite_35.method673(i_32, s_17);
                    i_32 += indexedsprite_35.width + 5;
                    fontface_1.method664("Remember username", i_32, s_17 + 13, 16776960, 0);
                    i_32 = WMUnknown2.staticInt12 + 24;
                    indexedsprite_35 = staticMethod66(StaticClass61.staticClientPreferences1.bool12, staticBool8);
                    indexedsprite_35.method673(i_32, s_17);
                    i_32 += 5 + indexedsprite_35.width;
                    fontface_1.method664("Hide username", i_32, s_17 + 13, 16776960, 0);
                    i_18 = s_17 + 15;
                    i_34 = WMUnknown2.staticInt12 - 80;
                    short s_37 = 321;
                    staticIndexedSprite5.method673(i_34 - 73, s_37 - 20);
                    fontface_0.drawString("Login", i_34, s_37 + 5, 16777215, 0);
                    i_34 = 80 + WMUnknown2.staticInt12;
                    staticIndexedSprite5.method673(i_34 - 73, s_37 - 20);
                    fontface_0.drawString("Cancel", i_34, s_37 + 5, 16777215, 0);
                    s_17 = 357;
                    fontface_1.drawString("Forgotten your password? <col=ffffff>Click here.", WMUnknown2.staticInt12, s_17, 16776960, 0);
                } else if (staticInt66 == 3) {
                    s_17 = 201;
                    fontface_0.drawString("Invalid username or password.", 180 + staticInt58, s_17, 16776960, 0);
                    i_18 = s_17 + 20;
                    fontface_1.drawString("For accounts created after 24th November 2010, please use your", staticInt58 + 180, i_18, 16776960, 0);
                    i_18 += 15;
                    fontface_1.drawString("email address to login. Otherwise please login with your username.", staticInt58 + 180, i_18, 16776960, 0);
                    i_18 += 15;
                    i_6 = staticInt58 + 180;
                    s_7 = 276;
                    staticIndexedSprite5.method673(i_6 - 73, s_7 - 20);
                    fontface_2.drawString("Try again", i_6, s_7 + 5, 16777215, 0);
                    i_6 = 180 + staticInt58;
                    s_7 = 326;
                    staticIndexedSprite5.method673(i_6 - 73, s_7 - 20);
                    fontface_2.drawString("Forgotten password?", i_6, s_7 + 5, 16777215, 0);
                } else if (staticInt66 == 4) {
                    fontface_0.drawString("Authenticator", 180 + staticInt58, 201, 16776960, 0);
                    s_17 = 236;
                    fontface_0.drawString(staticString12, 180 + staticInt58, s_17, 16777215, 0);
                    i_18 = s_17 + 15;
                    fontface_0.drawString(staticString16, staticInt58 + 180, i_18, 16777215, 0);
                    i_18 += 15;
                    fontface_0.drawString(staticString21, staticInt58 + 180, i_18, 16777215, 0);
                    i_18 += 15;
                    String str_20 = "PIN: ";
                    String string_9 = staticString19;
                    i_23 = string_9.length();
                    char[] arr_30 = new char[i_23];

                    for (i_32 = 0; i_32 < i_23; i_32++)
                        arr_30[i_32] = 42;

                    string_10 = new String(arr_30);
                    fontface_0.method664(str_20 + string_10 + (Client.staticInt166 % 40 < 20 ? StaticClass13.staticMethod64(16776960) + "|" : ""), staticInt58 + 180 - 108, i_18, 16777215, 0);
                    i_18 -= 8;
                    fontface_0.method664("Trust this computer", 180 + staticInt58 - 9, i_18, 16776960, 0);
                    i_18 += 15;
                    fontface_0.method664("for 30 days: ", 180 + staticInt58 - 9, i_18, 16776960, 0);
                    i_24 = 180 + staticInt58 - 9 + fontface_0.stringWidth("for 30 days: ") + 15;
                    i_23 = i_18 - fontface_0.int674;
                    IndexedSprite indexedsprite_31;
                    if (staticBool9)
                        indexedsprite_31 = staticIndexedSprite6;
                    else
                        indexedsprite_31 = TextureLoader.staticIndexedSprite8;

                    indexedsprite_31.method673(i_24, i_23);
                    i_18 += 15;
                    i_32 = 180 + staticInt58 - 80;
                    short s_36 = 321;
                    staticIndexedSprite5.method673(i_32 - 73, s_36 - 20);
                    fontface_0.drawString("Continue", i_32, s_36 + 5, 16777215, 0);
                    i_32 = staticInt58 + 180 + 80;
                    staticIndexedSprite5.method673(i_32 - 73, s_36 - 20);
                    fontface_0.drawString("Cancel", i_32, s_36 + 5, 16777215, 0);
                    fontface_1.drawString("<u=ff>Can\'t Log In?</u>", 180 + staticInt58, s_36 + 36, 255, 0);
                } else if (staticInt66 == 5) {
                    fontface_0.drawString("Forgotten your password?", 180 + staticInt58, 201, 16776960, 0);
                    s_17 = 221;
                    fontface_2.drawString(staticString12, 180 + staticInt58, s_17, 16776960, 0);
                    i_18 = s_17 + 15;
                    fontface_2.drawString(staticString16, 180 + staticInt58, i_18, 16776960, 0);
                    i_18 += 15;
                    fontface_2.drawString(staticString21, 180 + staticInt58, i_18, 16776960, 0);
                    i_18 += 15;
                    i_18 += 14;
                    fontface_0.method664("Username/email: ", 180 + staticInt58 - 145, i_18, 16777215, 0);
                    s_19 = 174;
                    if (!StaticClass61.staticClientPreferences1.bool12)
                        string_8 = staticString17;
                    else {
                        string_10 = staticString17;
                        i_12 = string_10.length();
                        arr_13 = new char[i_12];

                        for (i_14 = 0; i_14 < i_12; i_14++)
                            arr_13[i_14] = 42;

                        string_11 = new String(arr_13);
                        string_8 = string_11;
                    }

                    for (string_8 = string_8; fontface_0.stringWidth(string_8) > s_19; string_8 = string_8.substring(1))
                        ;

                    fontface_0.method664(TypeFace.staticMethod495(string_8) + (Client.staticInt166 % 40 < 20 ? StaticClass13.staticMethod64(16776960) + "|" : ""), staticInt58 + 180 - 34, i_18, 16777215, 0);
                    i_18 += 15;
                    i_22 = staticInt58 + 180 - 80;
                    short s_26 = 321;
                    staticIndexedSprite5.method673(i_22 - 73, s_26 - 20);
                    fontface_0.drawString("Recover", i_22, s_26 + 5, 16777215, 0);
                    i_22 = 180 + staticInt58 + 80;
                    staticIndexedSprite5.method673(i_22 - 73, s_26 - 20);
                    fontface_0.drawString("Back", i_22, s_26 + 5, 16777215, 0);
                } else if (staticInt66 == 6) {
                    s_17 = 201;
                    fontface_0.drawString(staticString12, 180 + staticInt58, s_17, 16776960, 0);
                    i_18 = s_17 + 15;
                    fontface_0.drawString(staticString16, 180 + staticInt58, i_18, 16776960, 0);
                    i_18 += 15;
                    fontface_0.drawString(staticString21, 180 + staticInt58, i_18, 16776960, 0);
                    i_18 += 15;
                    i_6 = staticInt58 + 180;
                    s_7 = 321;
                    staticIndexedSprite5.method673(i_6 - 73, s_7 - 20);
                    fontface_0.drawString("Back", i_6, s_7 + 5, 16777215, 0);
                }
            }

            int i_21;
            int i_27;
            if (staticInt57 > 0) {
                i_18 = staticInt57;
                s_19 = 256;
                staticInt61 += i_18 * 128;
                if (staticInt61 > DataClass3.staticIntArray14.length) {
                    staticInt61 -= DataClass3.staticIntArray14.length;
                    i_21 = (int) (Math.random() * 12.0D);
                    staticMethod75(StaticClass52.staticIndexedSpriteArray7[i_21]);
                }

                i_21 = 0;
                i_27 = i_18 * 128;
                i_22 = (s_19 - i_18) * 128;

                for (i_24 = 0; i_24 < i_22; i_24++) {
                    i_23 = ClanMember.staticIntArray76[i_27 + i_21] - DataClass3.staticIntArray14[i_21 + staticInt61 & DataClass3.staticIntArray14.length - 1] * i_18 / 6;
                    if (i_23 < 0)
                        i_23 = 0;

                    ClanMember.staticIntArray76[i_21++] = i_23;
                }

                for (i_24 = s_19 - i_18; i_24 < s_19; i_24++) {
                    i_23 = i_24 * 128;

                    for (i_12 = 0; i_12 < 128; i_12++) {
                        i_32 = (int) (Math.random() * 100.0D);
                        if (i_32 < 50 && i_12 > 10 && i_12 < 118)
                            ClanMember.staticIntArray76[i_23 + i_12] = 255;
                        else
                            ClanMember.staticIntArray76[i_12 + i_23] = 0;
                    }
                }

                if (staticInt63 > 0)
                    staticInt63 -= i_18 * 4;

                if (staticInt60 > 0)
                    staticInt60 -= i_18 * 4;

                if (staticInt63 == 0 && staticInt60 == 0) {
                    i_24 = (int) (Math.random() * (2000 / i_18));
                    if (i_24 == 0)
                        staticInt63 = 1024;

                    if (i_24 == 1)
                        staticInt60 = 1024;
                }

                for (i_24 = 0; i_24 < s_19 - i_18; i_24++)
                    staticIntArray24[i_24] = staticIntArray24[i_24 + i_18];

                for (i_24 = s_19 - i_18; i_24 < s_19; i_24++) {
                    staticIntArray24[i_24] = (int) (Math.sin(staticInt62 / 14.0D) * 16.0D + Math.sin(staticInt62 / 15.0D) * 14.0D + Math.sin(staticInt62 / 16.0D) * 12.0D);
                    ++staticInt62;
                }

                staticInt68 += i_18;
                i_24 = ((Client.staticInt166 & 0x1) + i_18) / 2;
                if (i_24 > 0) {
                    for (i_23 = 0; i_23 < staticInt68 * 100; i_23++) {
                        i_12 = (int) (Math.random() * 124.0D) + 2;
                        i_32 = (int) (Math.random() * 128.0D) + 128;
                        ClanMember.staticIntArray76[(i_32 << 7) + i_12] = 192;
                    }

                    staticInt68 = 0;
                    i_23 = 0;

                    label337: while (true) {
                        if (i_23 >= s_19) {
                            i_23 = 0;

                            while (true) {
                                if (i_23 >= 128)
                                    break label337;

                                i_12 = 0;

                                for (i_32 = -i_24; i_32 < s_19; i_32++) {
                                    i_14 = i_32 * 128;
                                    if (i_24 + i_32 < s_19)
                                        i_12 += StaticClass35.staticIntArray63[i_23 + i_14 + i_24 * 128];

                                    if (i_32 - (i_24 + 1) >= 0)
                                        i_12 -= StaticClass35.staticIntArray63[i_23 + i_14 - (i_24 + 1) * 128];

                                    if (i_32 >= 0)
                                        ClanMember.staticIntArray76[i_23 + i_14] = i_12 / (1 + i_24 * 2);
                                }

                                ++i_23;
                            }
                        }

                        i_12 = 0;
                        i_32 = i_23 * 128;

                        for (i_14 = -i_24; i_14 < 128; i_14++) {
                            if (i_24 + i_14 < 128)
                                i_12 += ClanMember.staticIntArray76[i_24 + i_32 + i_14];

                            if (i_14 - (i_24 + 1) >= 0)
                                i_12 -= ClanMember.staticIntArray76[i_14 + i_32 - (i_24 + 1)];

                            if (i_14 >= 0)
                                StaticClass35.staticIntArray63[i_32 + i_14] = i_12 / (1 + i_24 * 2);
                        }

                        ++i_23;
                    }
                }

                staticInt57 = 0;
            }

            s_17 = 256;
            if (staticInt63 > 0) {
                for (i_6 = 0; i_6 < 256; i_6++)
                    if (staticInt63 > 768)
                        WorldMapArea.staticIntArray1[i_6] = staticMethod76(NodeSub1.staticIntArray77[i_6], DataClass14.staticIntArray75[i_6], 1024 - staticInt63);
                    else if (staticInt63 > 256)
                        WorldMapArea.staticIntArray1[i_6] = DataClass14.staticIntArray75[i_6];
                    else
                        WorldMapArea.staticIntArray1[i_6] = staticMethod76(DataClass14.staticIntArray75[i_6], NodeSub1.staticIntArray77[i_6], 256 - staticInt63);
            } else if (staticInt60 > 0) {
                for (i_6 = 0; i_6 < 256; i_6++)
                    if (staticInt60 > 768)
                        WorldMapArea.staticIntArray1[i_6] = staticMethod76(NodeSub1.staticIntArray77[i_6], WM8.staticIntArray73[i_6], 1024 - staticInt60);
                    else if (staticInt60 > 256)
                        WorldMapArea.staticIntArray1[i_6] = WM8.staticIntArray73[i_6];
                    else
                        WorldMapArea.staticIntArray1[i_6] = staticMethod76(WM8.staticIntArray73[i_6], NodeSub1.staticIntArray77[i_6], 256 - staticInt60);
            } else
                for (i_6 = 0; i_6 < 256; i_6++)
                    WorldMapArea.staticIntArray1[i_6] = NodeSub1.staticIntArray77[i_6];

            Rasterizer2D.staticMethod442(staticInt59, 9, staticInt59 + 128, s_17 + 7);
            Mus5Sub4.staticSprite5.method683(staticInt59, 0);
            Rasterizer2D.staticMethod441();
            i_6 = 0;
            i_21 = staticInt59 + ExchangeOfferComparator6.staticGraphicsBuffer1.width * 9;

            for (i_27 = 1; i_27 < s_17 - 1; i_27++) {
                i_22 = (s_17 - i_27) * staticIntArray24[i_27] / s_17;
                i_24 = i_22 + 22;
                if (i_24 < 0)
                    i_24 = 0;

                i_6 += i_24;

                for (i_23 = i_24; i_23 < 128; i_23++) {
                    i_12 = ClanMember.staticIntArray76[i_6++];
                    if (i_12 != 0) {
                        i_32 = i_12;
                        i_14 = 256 - i_12;
                        i_12 = WorldMapArea.staticIntArray1[i_12];
                        i_34 = ExchangeOfferComparator6.staticGraphicsBuffer1.pixels[i_21];
                        ExchangeOfferComparator6.staticGraphicsBuffer1.pixels[i_21++] = (i_14 * (i_34 & 0xff00) + i_32 * (i_12 & 0xff00) & 0xff0000) + ((i_12 & 0xff00ff) * i_32 + (i_34 & 0xff00ff) * i_14 & ~0xff00ff) >> 8;
                    } else
                        ++i_21;
                }

                i_21 += ExchangeOfferComparator6.staticGraphicsBuffer1.width + i_24 - 128;
            }

            Rasterizer2D.staticMethod442(765 + staticInt59 - 128, 9, 765 + staticInt59, s_17 + 7);
            DataClass3.staticSprite1.method683(382 + staticInt59, 0);
            Rasterizer2D.staticMethod441();
            i_6 = 0;
            i_21 = staticInt59 + 637 + 24 + ExchangeOfferComparator6.staticGraphicsBuffer1.width * 9;

            for (i_27 = 1; i_27 < s_17 - 1; i_27++) {
                i_22 = (s_17 - i_27) * staticIntArray24[i_27] / s_17;
                i_24 = 103 - i_22;
                i_21 += i_22;

                for (i_23 = 0; i_23 < i_24; i_23++) {
                    i_12 = ClanMember.staticIntArray76[i_6++];
                    if (i_12 != 0) {
                        i_32 = i_12;
                        i_14 = 256 - i_12;
                        i_12 = WorldMapArea.staticIntArray1[i_12];
                        i_34 = ExchangeOfferComparator6.staticGraphicsBuffer1.pixels[i_21];
                        ExchangeOfferComparator6.staticGraphicsBuffer1.pixels[i_21++] = ((i_34 & 0xff00) * i_14 + (i_12 & 0xff00) * i_32 & 0xff0000) + (i_32 * (i_12 & 0xff00ff) + i_14 * (i_34 & 0xff00ff) & ~0xff00ff) >> 8;
                    } else
                        ++i_21;
                }

                i_6 += 128 - i_24;
                i_21 += ExchangeOfferComparator6.staticGraphicsBuffer1.width - i_24 - i_22;
            }

            staticIndexedSpriteArray3[StaticClass61.staticClientPreferences1.bool10 ? 1 : 0].method673(765 + staticInt59 - 40, 463);
            if (Client.staticInt165 > 5 && Client.staticInt163 == 0)
                if (StaticClass7.staticIndexedSprite3 != null) {
                    i_18 = staticInt59 + 5;
                    s_19 = 463;
                    byte b_28 = 100;
                    byte b_33 = 35;
                    StaticClass7.staticIndexedSprite3.method673(i_18, s_19);
                    fontface_0.drawString("World" + " " + Client.staticInt271, i_18 + b_28 / 2, b_33 / 2 + s_19 - 2, 16777215, 0);
                    if (World.staticWorldMap1 != null)
                        fontface_1.drawString("Loading...", b_28 / 2 + i_18, b_33 / 2 + s_19 + 12, 16777215, 0);
                    else
                        fontface_1.drawString("Click to switch", i_18 + b_28 / 2, s_19 + b_33 / 2 + 12, 16777215, 0);
                } else
                    StaticClass7.staticIndexedSprite3 = StaticClass59.staticMethod235(StaticClass2.staticJs5IndexImpl4, "sl_button", "");

        }
    }

    static void staticMethod74(String string_0, String string_1, String string_2) {
        staticString12 = string_0;
        staticString16 = string_1;
        staticString21 = string_2;
    }

    static final void staticMethod75(IndexedSprite indexedsprite_0) {
        short s_2 = 256;

        int i_3;
        for (i_3 = 0; i_3 < DataClass3.staticIntArray14.length; i_3++)
            DataClass3.staticIntArray14[i_3] = 0;

        int i_4;
        for (i_3 = 0; i_3 < 5000; i_3++) {
            i_4 = (int) (Math.random() * 128.0D * s_2);
            DataClass3.staticIntArray14[i_4] = (int) (Math.random() * 256.0D);
        }

        int i_5;
        int i_6;
        for (i_3 = 0; i_3 < 20; i_3++) {
            for (i_4 = 1; i_4 < s_2 - 1; i_4++)
                for (i_5 = 1; i_5 < 127; i_5++) {
                    i_6 = i_5 + (i_4 << 7);
                    Varbit.staticIntArray129[i_6] = (DataClass3.staticIntArray14[i_6 - 128] + DataClass3.staticIntArray14[i_6 - 1] + DataClass3.staticIntArray14[i_6 + 1] + DataClass3.staticIntArray14[i_6 + 128]) / 4;
                }

            int[] ints_9 = DataClass3.staticIntArray14;
            DataClass3.staticIntArray14 = Varbit.staticIntArray129;
            Varbit.staticIntArray129 = ints_9;
        }

        if (indexedsprite_0 != null) {
            i_3 = 0;

            for (i_4 = 0; i_4 < indexedsprite_0.height; i_4++)
                for (i_5 = 0; i_5 < indexedsprite_0.width; i_5++)
                    if (indexedsprite_0.indices[i_3++] != 0) {
                        i_6 = i_5 + 16 + indexedsprite_0.xoffset;
                        int i_7 = indexedsprite_0.yoffset + i_4 + 16;
                        int i_8 = i_6 + (i_7 << 7);
                        DataClass3.staticIntArray14[i_8] = 0;
                    }
        }

    }

    static final int staticMethod76(int i_0, int i_1, int i_2) {
        int i_4 = 256 - i_2;
        return (i_4 * (i_0 & 0xff00) + i_2 * (i_1 & 0xff00) & 0xff0000) + ((i_0 & 0xff00ff) * i_4 + i_2 * (i_1 & 0xff00ff) & ~0xff00ff) >> 8;
    }

    static void staticMethod77(FontFace fontface_0, FontFace fontface_1) {
        if (ClanMember.staticSpriteArray7 == null)
            ClanMember.staticSpriteArray7 = StaticClass59.staticMethod236(StaticClass2.staticJs5IndexImpl4, "sl_back", "");

        if (WorldMapLabel.staticIndexedSpriteArray2 == null)
            WorldMapLabel.staticIndexedSpriteArray2 = StaticClass59.staticMethod234(StaticClass2.staticJs5IndexImpl4, "sl_flags", "");

        if (StaticClass25.staticIndexedSpriteArray6 == null)
            StaticClass25.staticIndexedSpriteArray6 = StaticClass59.staticMethod234(StaticClass2.staticJs5IndexImpl4, "sl_arrows", "");

        if (AuthenticatorState.staticIndexedSpriteArray5 == null)
            AuthenticatorState.staticIndexedSpriteArray5 = StaticClass59.staticMethod234(StaticClass2.staticJs5IndexImpl4, "sl_stars", "");

        Rasterizer2D.staticMethod450(staticInt59, 23, 765, 480, 0);
        Rasterizer2D.staticMethod455(staticInt59, 0, 125, 23, 12425273, 9135624);
        Rasterizer2D.staticMethod455(staticInt59 + 125, 0, 640, 23, 5197647, 2697513);
        fontface_0.drawString("Select a world", staticInt59 + 62, 15, 0, -1);
        if (AuthenticatorState.staticIndexedSpriteArray5 != null) {
            AuthenticatorState.staticIndexedSpriteArray5[1].method673(140 + staticInt59, 1);
            fontface_1.method664("Members only world", 152 + staticInt59, 10, 16777215, -1);
            AuthenticatorState.staticIndexedSpriteArray5[0].method673(140 + staticInt59, 12);
            fontface_1.method664("Free world", staticInt59 + 152, 21, 16777215, -1);
        }

        int i_5;
        int i_6;
        if (StaticClass25.staticIndexedSpriteArray6 != null) {
            int i_3 = staticInt59 + 280;
            if (World.staticIntArray15[0] == 0 && World.staticIntArray16[0] == 0)
                StaticClass25.staticIndexedSpriteArray6[2].method673(i_3, 4);
            else
                StaticClass25.staticIndexedSpriteArray6[0].method673(i_3, 4);

            if (World.staticIntArray15[0] == 0 && World.staticIntArray16[0] == 1)
                StaticClass25.staticIndexedSpriteArray6[3].method673(i_3 + 15, 4);
            else
                StaticClass25.staticIndexedSpriteArray6[1].method673(i_3 + 15, 4);

            fontface_0.method664("World", i_3 + 32, 17, 16777215, -1);
            int i_4 = 390 + staticInt59;
            if (World.staticIntArray15[0] == 1 && World.staticIntArray16[0] == 0)
                StaticClass25.staticIndexedSpriteArray6[2].method673(i_4, 4);
            else
                StaticClass25.staticIndexedSpriteArray6[0].method673(i_4, 4);

            if (World.staticIntArray15[0] == 1 && World.staticIntArray16[0] == 1)
                StaticClass25.staticIndexedSpriteArray6[3].method673(i_4 + 15, 4);
            else
                StaticClass25.staticIndexedSpriteArray6[1].method673(i_4 + 15, 4);

            fontface_0.method664("Players", i_4 + 32, 17, 16777215, -1);
            i_5 = staticInt59 + 500;
            if (World.staticIntArray15[0] == 2 && World.staticIntArray16[0] == 0)
                StaticClass25.staticIndexedSpriteArray6[2].method673(i_5, 4);
            else
                StaticClass25.staticIndexedSpriteArray6[0].method673(i_5, 4);

            if (World.staticIntArray15[0] == 2 && World.staticIntArray16[0] == 1)
                StaticClass25.staticIndexedSpriteArray6[3].method673(i_5 + 15, 4);
            else
                StaticClass25.staticIndexedSpriteArray6[1].method673(i_5 + 15, 4);

            fontface_0.method664("Location", i_5 + 32, 17, 16777215, -1);
            i_6 = staticInt59 + 610;
            if (World.staticIntArray15[0] == 3 && World.staticIntArray16[0] == 0)
                StaticClass25.staticIndexedSpriteArray6[2].method673(i_6, 4);
            else
                StaticClass25.staticIndexedSpriteArray6[0].method673(i_6, 4);

            if (World.staticIntArray15[0] == 3 && World.staticIntArray16[0] == 1)
                StaticClass25.staticIndexedSpriteArray6[3].method673(i_6 + 15, 4);
            else
                StaticClass25.staticIndexedSpriteArray6[1].method673(i_6 + 15, 4);

            fontface_0.method664("Type", i_6 + 32, 17, 16777215, -1);
        }

        Rasterizer2D.staticMethod450(staticInt59 + 708, 4, 50, 16, 0);
        fontface_1.drawString("Cancel", 25 + 708 + staticInt59, 16, 16777215, -1);
        staticInt65 = -1;
        if (ClanMember.staticSpriteArray7 != null) {
            byte b_21 = 88;
            byte b_22 = 19;
            i_5 = 765 / (b_21 + 1);
            i_6 = 480 / (b_22 + 1);

            int i_7;
            int i_8;
            do {
                i_7 = i_6;
                i_8 = i_5;
                if ((i_5 - 1) * i_6 >= World.staticInt47)
                    --i_5;

                if ((i_6 - 1) * i_5 >= World.staticInt47)
                    --i_6;

                if (i_5 * (i_6 - 1) >= World.staticInt47)
                    --i_6;
            } while (i_7 != i_6 || i_5 != i_8);

            i_7 = (765 - i_5 * b_21) / (i_5 + 1);
            if (i_7 > 5)
                i_7 = 5;

            i_8 = (480 - b_22 * i_6) / (i_6 + 1);
            if (i_8 > 5)
                i_8 = 5;

            int i_9 = (765 - b_21 * i_5 - (i_5 - 1) * i_7) / 2;
            int i_10 = (480 - i_6 * b_22 - (i_6 - 1) * i_8) / 2;
            int i_11 = i_10 + 23;
            int i_12 = staticInt59 + i_9;
            int i_13 = 0;
            boolean bool_14 = false;

            int i_15;
            for (i_15 = 0; i_15 < World.staticInt47; i_15++) {
                World world_16 = DataClass8.staticWorldArray1[i_15];
                boolean bool_17 = true;
                String string_18 = Integer.toString(world_16.int96);
                if (world_16.int96 == -1) {
                    string_18 = "OFF";
                    bool_17 = false;
                } else if (world_16.int96 > 1980) {
                    string_18 = "FULL";
                    bool_17 = false;
                }

                int i_20 = 0;
                byte b_19;
                if (world_16.isDeadman()) {
                    if (world_16.isMembers())
                        b_19 = 7;
                    else
                        b_19 = 6;
                } else if (world_16.isDeadmanSeasonal()) {
                    i_20 = 16711680;
                    if (world_16.isMembers())
                        b_19 = 5;
                    else
                        b_19 = 4;
                } else if (world_16.isPvpWorld()) {
                    if (world_16.isMembers())
                        b_19 = 3;
                    else
                        b_19 = 2;
                } else if (world_16.isMembers())
                    b_19 = 1;
                else
                    b_19 = 0;

                if (MouseHandler.staticInt28 >= i_12 && MouseHandler.staticInt29 >= i_11 && MouseHandler.staticInt28 < i_12 + b_21 && MouseHandler.staticInt29 < i_11 + b_22 && bool_17) {
                    staticInt65 = i_15;
                    ClanMember.staticSpriteArray7[b_19].method686(i_12, i_11, 128, 16777215);
                    bool_14 = true;
                } else
                    ClanMember.staticSpriteArray7[b_19].method683(i_12, i_11);

                if (WorldMapLabel.staticIndexedSpriteArray2 != null)
                    WorldMapLabel.staticIndexedSpriteArray2[(world_16.isMembers() ? 8 : 0) + world_16.int97].method673(i_12 + 29, i_11);

                fontface_0.drawString(Integer.toString(world_16.int94), i_12 + 15, b_22 / 2 + i_11 + 5, i_20, -1);
                fontface_1.drawString(string_18, i_12 + 60, i_11 + b_22 / 2 + 5, 268435455, -1);
                i_11 += b_22 + i_8;
                ++i_13;
                if (i_13 >= i_6) {
                    i_11 = i_10 + 23;
                    i_12 += i_7 + b_21;
                    i_13 = 0;
                }
            }

            if (bool_14) {
                i_15 = fontface_1.stringWidth(DataClass8.staticWorldArray1[staticInt65].string9) + 6;
                int i_23 = fontface_1.int674 + 8;
                Rasterizer2D.staticMethod450(MouseHandler.staticInt28 - i_15 / 2, 20 + MouseHandler.staticInt29 + 5, i_15, i_23, 16777120);
                Rasterizer2D.staticMethod457(MouseHandler.staticInt28 - i_15 / 2, 20 + MouseHandler.staticInt29 + 5, i_15, i_23, 0);
                fontface_1.drawString(DataClass8.staticWorldArray1[staticInt65].string9, MouseHandler.staticInt28, fontface_1.int674 + 5 + 20 + MouseHandler.staticInt29 + 4, 0, -1);
            }
        }

        ExchangeOfferComparator6.staticGraphicsBuffer1.drawImage(0, 0);
    }

    static void staticMethod78(World world_0) {
        if (world_0.isMembers() != Client.staticBool24) {
            Client.staticBool24 = world_0.isMembers();
            boolean bool_2 = world_0.isMembers();
            if (bool_2 != WM2.staticBool3) {
                ObjType.staticCache24.method264();
                ObjType.staticCache25.method264();
                ObjType.staticCache26.method264();
                WM2.staticBool3 = bool_2;
            }
        }

        GameShell.staticString1 = world_0.string8;
        Client.staticInt271 = world_0.int94;
        Client.staticInt182 = world_0.int95;
        DataClass9.staticInt110 = Client.staticInt162 == 0 ? 43594 : world_0.int94 + 40000;
        SoundSystem.staticInt75 = Client.staticInt162 == 0 ? 443 : 50000 + world_0.int94;
        ExchangeOfferComparator5.staticInt45 = DataClass9.staticInt110;
    }

}

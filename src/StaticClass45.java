import java.io.IOException;
import java.util.zip.CRC32;

public class StaticClass45 {

    public static int staticInt138 = 0;
    public static HashTable staticHashTable1 = new HashTable(4096);
    public static int staticInt141 = 0;
    public static HashTable staticHashTable2 = new HashTable(32);
    public static int staticInt139 = 0;
    public static Queue staticQueue1 = new Queue();
    public static HashTable staticHashTable3 = new HashTable(4096);
    public static int staticInt140 = 0;
    public static HashTable staticHashTable4 = new HashTable(4096);
    public static int staticInt143 = 0;
    public static Buffer staticBuffer4 = new Buffer(8);
    public static int staticInt144 = 0;
    static CRC32 staticCRC32_1 = new CRC32();
    static Js5IndexImpl[] staticJs5IndexImplArray1 = new Js5IndexImpl[256];
    public static byte staticByte3 = 0;
    public static int staticInt142 = 0;
    public static int staticInt145 = 0;
    public static long staticLong8;
    public static Connection staticConnection3;
    static boolean staticBool22;
    public static Js5DownloadRequest staticJs5DownloadRequest1;

    StaticClass45() throws Throwable {
        throw new Error();
    }

    public static boolean staticMethod188() {
        long long_1 = StaticClass27.synchronizedMethod7();
        int i_3 = (int) (long_1 - staticLong8);
        staticLong8 = long_1;
        if (i_3 > 200)
            i_3 = 200;

        staticInt138 += i_3;
        if (staticInt143 == 0 && staticInt139 == 0 && staticInt140 == 0 && staticInt141 == 0)
            return true;
        else if (staticConnection3 == null)
            return false;
        else
            try {
                if (staticInt138 > 30000)
                    throw new IOException();
                else {
                    Js5DownloadRequest js5downloadrequest_4;
                    Buffer buffer_5;
                    while (staticInt139 < 20 && staticInt141 > 0) {
                        js5downloadrequest_4 = (Js5DownloadRequest) staticHashTable1.method267();
                        buffer_5 = new Buffer(4);
                        buffer_5.writeByte(1);
                        buffer_5.writeTriByte((int) js5downloadrequest_4.id);
                        staticConnection3.write(buffer_5.buf, 0, 4);
                        staticHashTable2.put(js5downloadrequest_4, js5downloadrequest_4.id);
                        --staticInt141;
                        ++staticInt139;
                    }

                    while (staticInt143 < 20 && staticInt140 > 0) {
                        js5downloadrequest_4 = (Js5DownloadRequest) staticQueue1.method266();
                        buffer_5 = new Buffer(4);
                        buffer_5.writeByte(0);
                        buffer_5.writeTriByte((int) js5downloadrequest_4.id);
                        staticConnection3.write(buffer_5.buf, 0, 4);
                        js5downloadrequest_4.unlinkCacheable();
                        staticHashTable4.put(js5downloadrequest_4, js5downloadrequest_4.id);
                        --staticInt140;
                        ++staticInt143;
                    }

                    for (int i_19 = 0; i_19 < 100; i_19++) {
                        int i_20 = staticConnection3.available();
                        if (i_20 < 0)
                            throw new IOException();

                        if (i_20 == 0)
                            break;

                        staticInt138 = 0;
                        byte b_6 = 0;
                        if (staticJs5DownloadRequest1 == null)
                            b_6 = 8;
                        else if (staticInt144 == 0)
                            b_6 = 1;

                        int i_7;
                        int i_8;
                        int i_9;
                        int i_11;
                        if (b_6 > 0) {
                            i_7 = b_6 - staticBuffer4.off;
                            if (i_7 > i_20)
                                i_7 = i_20;

                            staticConnection3.read(staticBuffer4.buf, staticBuffer4.off, i_7);
                            if (staticByte3 != 0)
                                for (i_8 = 0; i_8 < i_7; i_8++)
                                    staticBuffer4.buf[staticBuffer4.off + i_8] ^= staticByte3;

                            staticBuffer4.off += i_7;
                            if (staticBuffer4.off < b_6)
                                break;

                            if (staticJs5DownloadRequest1 == null) {
                                staticBuffer4.off = 0;
                                i_8 = staticBuffer4.readUByte();
                                i_9 = staticBuffer4.readUShort();
                                int i_10 = staticBuffer4.readUByte();
                                i_11 = staticBuffer4.readInt();
                                long long_12 = (i_8 << 16) + i_9;
                                Js5DownloadRequest js5downloadrequest_14 = (Js5DownloadRequest) staticHashTable2.get(long_12);
                                staticBool22 = true;
                                if (js5downloadrequest_14 == null) {
                                    js5downloadrequest_14 = (Js5DownloadRequest) staticHashTable4.get(long_12);
                                    staticBool22 = false;
                                }

                                if (js5downloadrequest_14 == null)
                                    throw new IOException();

                                int i_15 = i_10 == 0 ? 5 : 9;
                                staticJs5DownloadRequest1 = js5downloadrequest_14;
                                GameCanvas.staticBuffer1 = new Buffer(i_15 + i_11 + staticJs5DownloadRequest1.byte4);
                                GameCanvas.staticBuffer1.writeByte(i_10);
                                GameCanvas.staticBuffer1.writeInt(i_11);
                                staticInt144 = 8;
                                staticBuffer4.off = 0;
                            } else if (staticInt144 == 0)
                                if (staticBuffer4.buf[0] == -1) {
                                    staticInt144 = 1;
                                    staticBuffer4.off = 0;
                                } else
                                    staticJs5DownloadRequest1 = null;
                        } else {
                            i_7 = GameCanvas.staticBuffer1.buf.length - staticJs5DownloadRequest1.byte4;
                            i_8 = 512 - staticInt144;
                            if (i_8 > i_7 - GameCanvas.staticBuffer1.off)
                                i_8 = i_7 - GameCanvas.staticBuffer1.off;

                            if (i_8 > i_20)
                                i_8 = i_20;

                            staticConnection3.read(GameCanvas.staticBuffer1.buf, GameCanvas.staticBuffer1.off, i_8);
                            if (staticByte3 != 0)
                                for (i_9 = 0; i_9 < i_8; i_9++)
                                    GameCanvas.staticBuffer1.buf[GameCanvas.staticBuffer1.off + i_9] ^= staticByte3;

                            GameCanvas.staticBuffer1.off += i_8;
                            staticInt144 += i_8;
                            if (GameCanvas.staticBuffer1.off == i_7) {
                                if (staticJs5DownloadRequest1.id == 16711935L) {
                                    DataClass9.staticBuffer3 = GameCanvas.staticBuffer1;

                                    for (i_9 = 0; i_9 < 256; i_9++) {
                                        Js5IndexImpl js5indeximpl_21 = staticJs5IndexImplArray1[i_9];
                                        if (js5indeximpl_21 != null) {
                                            DataClass9.staticBuffer3.off = i_9 * 8 + 5;
                                            i_11 = DataClass9.staticBuffer3.readInt();
                                            int i_22 = DataClass9.staticBuffer3.readInt();
                                            js5indeximpl_21.method507(i_11, i_22);
                                        }
                                    }
                                } else {
                                    staticCRC32_1.reset();
                                    staticCRC32_1.update(GameCanvas.staticBuffer1.buf, 0, i_7);
                                    i_9 = (int) staticCRC32_1.getValue();
                                    if (i_9 != staticJs5DownloadRequest1.int556) {
                                        try {
                                            staticConnection3.shutdown();
                                        } catch (Exception exception_17) {
                                            ;
                                        }

                                        ++staticInt142;
                                        staticConnection3 = null;
                                        staticByte3 = (byte) (int) (Math.random() * 255.0D + 1.0D);
                                        return false;
                                    }

                                    staticInt142 = 0;
                                    staticInt145 = 0;
                                    staticJs5DownloadRequest1.js5IndexImpl2.method508((int) (staticJs5DownloadRequest1.id & 0xffffL), GameCanvas.staticBuffer1.buf, (staticJs5DownloadRequest1.id & 0xff0000L) == 16711680L, staticBool22);
                                }

                                staticJs5DownloadRequest1.unlink();
                                if (staticBool22)
                                    --staticInt139;
                                else
                                    --staticInt143;

                                staticInt144 = 0;
                                staticJs5DownloadRequest1 = null;
                                GameCanvas.staticBuffer1 = null;
                            } else {
                                if (staticInt144 != 512)
                                    break;

                                staticInt144 = 0;
                            }
                        }
                    }

                    return true;
                }
            } catch (IOException ioexception_18) {
                try {
                    staticConnection3.shutdown();
                } catch (Exception exception_16) {
                    ;
                }

                ++staticInt145;
                staticConnection3 = null;
                return false;
            }
    }

    public static void staticMethod189(boolean bool_0) {
        if (staticConnection3 != null)
            try {
                Buffer buffer_2 = new Buffer(4);
                buffer_2.writeByte(bool_0 ? 2 : 3);
                buffer_2.writeTriByte(0);
                staticConnection3.write(buffer_2.buf, 0, 4);
            } catch (IOException ioexception_5) {
                try {
                    staticConnection3.shutdown();
                } catch (Exception exception_4) {
                    ;
                }

                ++staticInt145;
                staticConnection3 = null;
            }
    }

    static void staticMethod190(Js5IndexImpl js5indeximpl_0, int i_1, int i_2, int i_3, byte b_4, boolean bool_5) {
        long long_7 = (i_1 << 16) + i_2;
        Js5DownloadRequest js5downloadrequest_9 = (Js5DownloadRequest) staticHashTable1.get(long_7);
        if (js5downloadrequest_9 == null) {
            js5downloadrequest_9 = (Js5DownloadRequest) staticHashTable2.get(long_7);
            if (js5downloadrequest_9 == null) {
                js5downloadrequest_9 = (Js5DownloadRequest) staticHashTable3.get(long_7);
                if (js5downloadrequest_9 != null) {
                    if (bool_5) {
                        js5downloadrequest_9.unlinkCacheable();
                        staticHashTable1.put(js5downloadrequest_9, long_7);
                        --staticInt140;
                        ++staticInt141;
                    }

                } else {
                    if (!bool_5) {
                        js5downloadrequest_9 = (Js5DownloadRequest) staticHashTable4.get(long_7);
                        if (js5downloadrequest_9 != null)
                            return;
                    }

                    js5downloadrequest_9 = new Js5DownloadRequest();
                    js5downloadrequest_9.js5IndexImpl2 = js5indeximpl_0;
                    js5downloadrequest_9.int556 = i_3;
                    js5downloadrequest_9.byte4 = b_4;
                    if (bool_5) {
                        staticHashTable1.put(js5downloadrequest_9, long_7);
                        ++staticInt141;
                    } else {
                        staticQueue1.add(js5downloadrequest_9);
                        staticHashTable3.put(js5downloadrequest_9, long_7);
                        ++staticInt140;
                    }

                }
            }
        }
    }

    static void staticMethod191(int i_0, int i_1) {
        long long_3 = (i_0 << 16) + i_1;
        Js5DownloadRequest js5downloadrequest_5 = (Js5DownloadRequest) staticHashTable3.get(long_3);
        if (js5downloadrequest_5 != null)
            staticQueue1.method265(js5downloadrequest_5);
    }

    static int staticMethod192(int i_0, int i_1) {
        long long_3 = (i_0 << 16) + i_1;
        return staticJs5DownloadRequest1 != null && long_3 == staticJs5DownloadRequest1.id ? GameCanvas.staticBuffer1.off * 99 / (GameCanvas.staticBuffer1.buf.length - staticJs5DownloadRequest1.byte4) + 1 : 0;
    }

    public static int staticMethod193(boolean bool_0, boolean bool_1) {
        int i_3 = 0;
        if (bool_0)
            i_3 += staticInt139 + staticInt141;

        if (bool_1)
            i_3 += staticInt143 + staticInt140;

        return i_3;
    }

    public static void staticMethod194() {
        if (staticConnection3 != null)
            staticConnection3.shutdown();

    }

}

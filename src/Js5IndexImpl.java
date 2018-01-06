import java.util.zip.CRC32;

public class Js5IndexImpl extends Js5Index {

    static CRC32 staticCRC32_2 = new CRC32();
    volatile boolean volatileBool6 = false;
    boolean bool46 = false;
    int int462 = -1;
    Js5DiskCache js5DiskCache3;
    Js5DiskCache js5DiskCache2;
    int int460;
    int int461;
    int int463;
    volatile boolean[] volatileBoolArray1;

    public Js5IndexImpl(Js5DiskCache js5diskcache_1, Js5DiskCache js5diskcache_2, int i_3, boolean bool_4, boolean bool_5, boolean bool_6) {
        super(bool_4, bool_5);
        js5DiskCache3 = js5diskcache_1;
        js5DiskCache2 = js5diskcache_2;
        int460 = i_3;
        bool46 = bool_6;
        int i_8 = int460;
        if (DataClass9.staticBuffer3 != null) {
            DataClass9.staticBuffer3.off = i_8 * 8 + 5;
            int i_9 = DataClass9.staticBuffer3.readInt();
            int i_10 = DataClass9.staticBuffer3.readInt();
            method507(i_9, i_10);
        } else {
            StaticClass45.staticMethod190((Js5IndexImpl) null, 255, 255, 0, (byte) 0, true);
            StaticClass45.staticJs5IndexImplArray1[i_8] = this;
        }

    }

    public int method506() {
        if (volatileBool6)
            return 100;
        else if (groups != null)
            return 99;
        else {
            int i_2 = StaticClass45.staticMethod192(255, int460);
            if (i_2 >= 100)
                i_2 = 99;

            return i_2;
        }
    }

    @Override
    void request(int i_1) {
        StaticClass45.staticMethod191(int460, i_1);
    }

    @Override
    void method307(int i_1) {
        if (js5DiskCache3 != null && volatileBoolArray1 != null && volatileBoolArray1[i_1]) {
            Js5DiskCache js5diskcache_3 = js5DiskCache3;
            byte[] bytes_5 = null;
            Deque deque_6 = Js5Worker.staticDeque3;
            synchronized (Js5Worker.staticDeque3) {
                for (Js5CacheWriteRequest js5cachewriterequest_7 = (Js5CacheWriteRequest) Js5Worker.staticDeque3.method257(); js5cachewriterequest_7 != null; js5cachewriterequest_7 = (Js5CacheWriteRequest) Js5Worker.staticDeque3.method259())
                    if (js5cachewriterequest_7.id == i_1 && js5cachewriterequest_7.js5DiskCache1 == js5diskcache_3 && js5cachewriterequest_7.int459 == 0) {
                        bytes_5 = js5cachewriterequest_7.buffer;
                        break;
                    }
            }

            if (bytes_5 != null)
                method509(js5diskcache_3, i_1, bytes_5, true);
            else {
                byte[] bytes_10 = js5diskcache_3.get(i_1);
                method509(js5diskcache_3, i_1, bytes_10, true);
            }
        } else
            StaticClass45.staticMethod190(this, int460, i_1, groupCrcs[i_1], (byte) 2, true);

    }

    void method507(int i_1, int i_2) {
        int461 = i_1;
        int463 = i_2;
        if (js5DiskCache2 != null) {
            int i_4 = int460;
            Js5DiskCache js5diskcache_5 = js5DiskCache2;
            byte[] bytes_7 = null;
            Deque deque_8 = Js5Worker.staticDeque3;
            synchronized (Js5Worker.staticDeque3) {
                for (Js5CacheWriteRequest js5cachewriterequest_9 = (Js5CacheWriteRequest) Js5Worker.staticDeque3.method257(); js5cachewriterequest_9 != null; js5cachewriterequest_9 = (Js5CacheWriteRequest) Js5Worker.staticDeque3.method259())
                    if (js5cachewriterequest_9.id == i_4 && js5diskcache_5 == js5cachewriterequest_9.js5DiskCache1 && js5cachewriterequest_9.int459 == 0) {
                        bytes_7 = js5cachewriterequest_9.buffer;
                        break;
                    }
            }

            if (bytes_7 != null)
                method509(js5diskcache_5, i_4, bytes_7, true);
            else {
                byte[] bytes_12 = js5diskcache_5.get(i_4);
                method509(js5diskcache_5, i_4, bytes_12, true);
            }
        } else
            StaticClass45.staticMethod190(this, 255, int460, int461, (byte) 0, true);

    }

    void method508(int i_1, byte[] bytes_2, boolean bool_3, boolean bool_4) {
        if (bool_3) {
            if (volatileBool6)
                throw new RuntimeException();

            if (js5DiskCache2 != null) {
                int i_6 = int460;
                Js5DiskCache js5diskcache_7 = js5DiskCache2;
                Js5CacheWriteRequest js5cachewriterequest_8 = new Js5CacheWriteRequest();
                js5cachewriterequest_8.int459 = 0;
                js5cachewriterequest_8.id = i_6;
                js5cachewriterequest_8.buffer = bytes_2;
                js5cachewriterequest_8.js5DiskCache1 = js5diskcache_7;
                Deque deque_9 = Js5Worker.staticDeque3;
                synchronized (Js5Worker.staticDeque3) {
                    Js5Worker.staticDeque3.method253(js5cachewriterequest_8);
                }

                Object object_22 = Js5Worker.staticObject1;
                synchronized (Js5Worker.staticObject1) {
                    if (Js5Worker.staticInt146 == 0) {
                        Js5Worker.staticThread1 = new Thread(new Js5Worker());
                        Js5Worker.staticThread1.setDaemon(true);
                        Js5Worker.staticThread1.start();
                        Js5Worker.staticThread1.setPriority(5);
                    }

                    Js5Worker.staticInt146 = 600;
                }
            }

            init(bytes_2);
            method510();
        } else {
            bytes_2[bytes_2.length - 2] = (byte) (groupVersions[i_1] >> 8);
            bytes_2[bytes_2.length - 1] = (byte) groupVersions[i_1];
            if (js5DiskCache3 != null) {
                Js5DiskCache js5diskcache_18 = js5DiskCache3;
                Js5CacheWriteRequest js5cachewriterequest_19 = new Js5CacheWriteRequest();
                js5cachewriterequest_19.int459 = 0;
                js5cachewriterequest_19.id = i_1;
                js5cachewriterequest_19.buffer = bytes_2;
                js5cachewriterequest_19.js5DiskCache1 = js5diskcache_18;
                Deque deque_20 = Js5Worker.staticDeque3;
                synchronized (Js5Worker.staticDeque3) {
                    Js5Worker.staticDeque3.method253(js5cachewriterequest_19);
                }

                Object object_21 = Js5Worker.staticObject1;
                synchronized (Js5Worker.staticObject1) {
                    if (Js5Worker.staticInt146 == 0) {
                        Js5Worker.staticThread1 = new Thread(new Js5Worker());
                        Js5Worker.staticThread1.setDaemon(true);
                        Js5Worker.staticThread1.start();
                        Js5Worker.staticThread1.setPriority(5);
                    }

                    Js5Worker.staticInt146 = 600;
                }

                volatileBoolArray1[i_1] = true;
            }

            if (bool_4)
                groups[i_1] = BufferWrapper.staticMethod153(bytes_2, false);
        }

    }

    public void method509(Js5DiskCache js5diskcache_1, int i_2, byte[] bytes_3, boolean bool_4) {
        int i_6;
        if (js5diskcache_1 == js5DiskCache2) {
            if (volatileBool6)
                throw new RuntimeException();

            if (bytes_3 == null) {
                StaticClass45.staticMethod190(this, 255, int460, int461, (byte) 0, true);
                return;
            }

            staticCRC32_2.reset();
            staticCRC32_2.update(bytes_3, 0, bytes_3.length);
            i_6 = (int) staticCRC32_2.getValue();
            Buffer buffer_7 = new Buffer(Js5Index.staticMethod200(bytes_3));
            int i_8 = buffer_7.readUByte();
            if (i_8 != 5 && i_8 != 6)
                throw new RuntimeException(i_8 + "," + int460 + "," + i_2);

            int i_9 = 0;
            if (i_8 >= 6)
                i_9 = buffer_7.readInt();

            if (i_6 != int461 || int463 != i_9) {
                StaticClass45.staticMethod190(this, 255, int460, int461, (byte) 0, true);
                return;
            }

            init(bytes_3);
            method510();
        } else {
            if (!bool_4 && int462 == i_2)
                volatileBool6 = true;

            if (bytes_3 == null || bytes_3.length <= 2) {
                volatileBoolArray1[i_2] = false;
                if (bool46 || bool_4)
                    StaticClass45.staticMethod190(this, int460, i_2, groupCrcs[i_2], (byte) 2, bool_4);

                return;
            }

            staticCRC32_2.reset();
            staticCRC32_2.update(bytes_3, 0, bytes_3.length - 2);
            i_6 = (int) staticCRC32_2.getValue();
            int i_10 = ((bytes_3[bytes_3.length - 2] & 0xff) << 8) + (bytes_3[bytes_3.length - 1] & 0xff);
            if (groupCrcs[i_2] != i_6 || i_10 != groupVersions[i_2]) {
                volatileBoolArray1[i_2] = false;
                if (bool46 || bool_4)
                    StaticClass45.staticMethod190(this, int460, i_2, groupCrcs[i_2], (byte) 2, bool_4);

                return;
            }

            volatileBoolArray1[i_2] = true;
            if (bool_4)
                groups[i_2] = BufferWrapper.staticMethod153(bytes_3, false);
        }

    }

    void method510() {
        volatileBoolArray1 = new boolean[groups.length];

        int i_2;
        for (i_2 = 0; i_2 < volatileBoolArray1.length; i_2++)
            volatileBoolArray1[i_2] = false;

        if (js5DiskCache3 == null)
            volatileBool6 = true;
        else {
            int462 = -1;

            for (i_2 = 0; i_2 < volatileBoolArray1.length; i_2++)
                if (numFiles[i_2] > 0) {
                    Js5Worker.staticMethod198(i_2, js5DiskCache3, this);
                    int462 = i_2;
                }

            if (int462 == -1)
                volatileBool6 = true;

        }
    }

    @Override
    int getLoadedPercentage(int i_1) {
        return groups[i_1] != null ? 100 : volatileBoolArray1[i_1] ? 100 : StaticClass45.staticMethod192(int460, i_1);
    }

    public int getLoadedPercentage() {
        int i_2 = 0;
        int i_3 = 0;

        int i_4;
        for (i_4 = 0; i_4 < groups.length; i_4++)
            if (numFiles[i_4] > 0) {
                i_2 += 100;
                i_3 += this.getLoadedPercentage(i_4);
            }

        if (i_2 == 0)
            return 100;
        else {
            i_4 = i_3 * 100 / i_2;
            return i_4;
        }
    }

}


public class Js5Worker implements Runnable {

    public static int[] staticIntArray70;
    public static Deque staticDeque3 = new Deque();
    public static Deque staticDeque2 = new Deque();
    public static int staticInt146 = 0;
    public static Object staticObject1 = new Object();
    static Thread staticThread1;

    static void staticMethod198(int i_0, Js5DiskCache js5diskcache_1, Js5IndexImpl js5indeximpl_2) {
        Js5CacheWriteRequest js5cachewriterequest_4 = new Js5CacheWriteRequest();
        js5cachewriterequest_4.int459 = 1;
        js5cachewriterequest_4.id = i_0;
        js5cachewriterequest_4.js5DiskCache1 = js5diskcache_1;
        js5cachewriterequest_4.js5IndexImpl1 = js5indeximpl_2;
        Deque deque_5 = staticDeque3;
        synchronized (staticDeque3) {
            staticDeque3.method253(js5cachewriterequest_4);
        }

        Object object_10 = staticObject1;
        synchronized (staticObject1) {
            if (staticInt146 == 0) {
                staticThread1 = new Thread(new Js5Worker());
                staticThread1.setDaemon(true);
                staticThread1.start();
                staticThread1.setPriority(5);
            }

            staticInt146 = 600;
        }
    }

    @Override
    public void run() {
        try {
            while (true) {
                Deque deque_2 = staticDeque3;
                Js5CacheWriteRequest js5cachewriterequest_1;
                synchronized (staticDeque3) {
                    js5cachewriterequest_1 = (Js5CacheWriteRequest) staticDeque3.method257();
                }

                Object object_14;
                if (js5cachewriterequest_1 != null) {
                    if (js5cachewriterequest_1.int459 == 0) {
                        js5cachewriterequest_1.js5DiskCache1.put((int) js5cachewriterequest_1.id, js5cachewriterequest_1.buffer, js5cachewriterequest_1.buffer.length);
                        deque_2 = staticDeque3;
                        synchronized (staticDeque3) {
                            js5cachewriterequest_1.unlink();
                        }
                    } else if (js5cachewriterequest_1.int459 == 1) {
                        js5cachewriterequest_1.buffer = js5cachewriterequest_1.js5DiskCache1.get((int) js5cachewriterequest_1.id);
                        deque_2 = staticDeque3;
                        synchronized (staticDeque3) {
                            staticDeque2.method253(js5cachewriterequest_1);
                        }
                    }

                    object_14 = staticObject1;
                    synchronized (staticObject1) {
                        if (staticInt146 <= 1) {
                            staticInt146 = 0;
                            staticObject1.notifyAll();
                            return;
                        }

                        staticInt146 = 600;
                    }
                } else {
                    StaticClass18.staticMethod127(100L);
                    object_14 = staticObject1;
                    synchronized (staticObject1) {
                        if (staticInt146 <= 1) {
                            staticInt146 = 0;
                            staticObject1.notifyAll();
                            return;
                        }

                        --staticInt146;
                    }
                }
            }
        } catch (Exception exception_13) {
            ClientError.staticMethod113((String) null, exception_13);
        }
    }

}

import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;

public class RunnableImpl1 implements Runnable {

    static WM4 staticWM4_1;
    java.util.Queue queue2 = new LinkedList();
    final Thread thread1 = new Thread(this);
    volatile boolean volatileBool4;

    public RunnableImpl1() {
        thread1.setPriority(1);
        thread1.start();
    }

    @Override
    public void run() {
        while (!volatileBool4)
            try {
                WorldMap worldmap_1;
                synchronized (this) {
                    worldmap_1 = (WorldMap) queue2.poll();
                    if (worldmap_1 == null) {
                        try {
                            this.wait();
                        } catch (InterruptedException interruptedexception_12) {
                            ;
                        }
                        continue;
                    }
                }

                DataInputStream datainputstream_2 = null;
                URLConnection urlconnection_3 = null;

                try {
                    urlconnection_3 = worldmap_1.uRL1.openConnection();
                    urlconnection_3.setConnectTimeout(5000);
                    urlconnection_3.setReadTimeout(5000);
                    urlconnection_3.setUseCaches(false);
                    urlconnection_3.setRequestProperty("Connection", "close");
                    int i_4 = urlconnection_3.getContentLength();
                    if (i_4 >= 0) {
                        byte[] bytes_5 = new byte[i_4];
                        datainputstream_2 = new DataInputStream(urlconnection_3.getInputStream());
                        datainputstream_2.readFully(bytes_5);
                        worldmap_1.volatileByteArray1 = bytes_5;
                    }

                    worldmap_1.volatileBool3 = true;
                } catch (IOException ioexception_13) {
                    worldmap_1.volatileBool3 = true;
                } finally {
                    if (datainputstream_2 != null)
                        datainputstream_2.close();

                    if (urlconnection_3 != null && urlconnection_3 instanceof HttpURLConnection)
                        ((HttpURLConnection) urlconnection_3).disconnect();

                }
            } catch (Exception exception_16) {
                ClientError.staticMethod113((String) null, exception_16);
            }

    }

    public WorldMap method229(URL url_1) {
        WorldMap worldmap_3 = new WorldMap(url_1);
        synchronized (this) {
            queue2.add(worldmap_3);
            notify();
            return worldmap_3;
        }
    }

    public void method230() {
        volatileBool4 = true;

        try {
            synchronized (this) {
                notify();
            }

            thread1.join();
        } catch (InterruptedException interruptedexception_5) {
            ;
        }

    }

}

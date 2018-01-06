import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLConnection;

public class StaticClass9 {

    static int staticInt46;
    static final BigInteger staticBigInteger2 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
    static final BigInteger staticBigInteger1 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

    StaticClass9() throws Throwable {
        throw new Error();
    }

    static long staticMethod42() {
        try {
            URL url_1 = new URL(Client.staticMethod364("services", false) + "m=accountappeal/login.ws");
            URLConnection urlconnection_2 = url_1.openConnection();
            urlconnection_2.setRequestProperty("connection", "close");
            urlconnection_2.setDoInput(true);
            urlconnection_2.setDoOutput(true);
            urlconnection_2.setConnectTimeout(5000);
            OutputStreamWriter outputstreamwriter_3 = new OutputStreamWriter(urlconnection_2.getOutputStream());
            outputstreamwriter_3.write("data1=req");
            outputstreamwriter_3.flush();
            InputStream inputstream_4 = urlconnection_2.getInputStream();
            Buffer buffer_5 = new Buffer(new byte[1000]);

            do {
                int i_6 = inputstream_4.read(buffer_5.buf, buffer_5.off, 1000 - buffer_5.off);
                if (i_6 == -1) {
                    buffer_5.off = 0;
                    long long_9 = buffer_5.method445();
                    return long_9;
                }

                buffer_5.off += i_6;
            } while (buffer_5.off < 1000);

            return 0L;
        } catch (Exception exception_8) {
            return 0L;
        }
    }

}

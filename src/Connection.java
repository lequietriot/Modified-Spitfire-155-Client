import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public final class Connection implements Runnable {

    boolean shutdown = false;
    int writepos = 0;
    int readpos = 0;
    boolean ioerror = false;
    TaskManager taskManager;
    Socket socket;
    InputStream in;
    OutputStream out;
    Task task;
    byte[] buf;

    public Connection(Socket socket_1, TaskManager taskmanager_2) throws IOException {
        taskManager = taskmanager_2;
        socket = socket_1;
        socket.setSoTimeout(30000);
        socket.setTcpNoDelay(true);
        socket.setReceiveBufferSize(16384);
        socket.setSendBufferSize(16384);
        in = socket.getInputStream();
        out = socket.getOutputStream();
    }

    public void shutdown() {
        if (!shutdown) {
            synchronized (this) {
                shutdown = true;
                notifyAll();
            }

            if (task != null) {
                while (task.status == 0)
                    StaticClass18.staticMethod127(1L);

                if (task.status == 1)
                    try {
                        ((Thread) task.result).join();
                    } catch (InterruptedException interruptedexception_4) {
                        ;
                    }
            }

            task = null;
        }
    }

    @Override
    protected void finalize() {
        shutdown();
    }

    public int read() throws IOException {
        return shutdown ? 0 : in.read();
    }

    public int available() throws IOException {
        return shutdown ? 0 : in.available();
    }

    public void read(byte[] bytes_1, int i_2, int i_3) throws IOException {
        if (!shutdown)
            while (i_3 > 0) {
                int i_5 = in.read(bytes_1, i_2, i_3);
                if (i_5 <= 0)
                    throw new EOFException();

                i_2 += i_5;
                i_3 -= i_5;
            }
    }

    public void write(byte[] bytes_1, int i_2, int i_3) throws IOException {
        if (!shutdown)
            if (ioerror) {
                ioerror = false;
                throw new IOException();
            } else {
                if (buf == null)
                    buf = new byte[5000];

                synchronized (this) {
                    for (int i_6 = 0; i_6 < i_3; i_6++) {
                        buf[readpos] = bytes_1[i_6 + i_2];
                        readpos = (1 + readpos) % 5000;
                        if (readpos == (4900 + writepos) % 5000)
                            throw new IOException();
                    }

                    if (task == null)
                        task = taskManager.submitRunnable(this, 3);

                    notifyAll();
                }
            }
    }

    @Override
    public void run() {
        try {
            while (true) {
                label84: {
                    int i_1;
                    int i_2;
                    synchronized (this) {
                        if (writepos == readpos) {
                            if (shutdown)
                                break label84;

                            try {
                                this.wait();
                            } catch (InterruptedException interruptedexception_9) {
                                ;
                            }
                        }

                        i_2 = writepos;
                        if (readpos >= writepos)
                            i_1 = readpos - writepos;
                        else
                            i_1 = 5000 - writepos;
                    }

                    if (i_1 <= 0)
                        continue;

                    try {
                        out.write(buf, i_2, i_1);
                    } catch (IOException ioexception_8) {
                        ioerror = true;
                    }

                    writepos = (writepos + i_1) % 5000;

                    try {
                        if (writepos == readpos)
                            out.flush();
                    } catch (IOException ioexception_7) {
                        ioerror = true;
                    }
                    continue;
                }

                try {
                    if (in != null)
                        in.close();

                    if (out != null)
                        out.close();

                    if (socket != null)
                        socket.close();
                } catch (IOException ioexception_6) {
                    ;
                }

                buf = null;
                break;
            }
        } catch (Exception exception_11) {
            ClientError.staticMethod113((String) null, exception_11);
        }

    }

}

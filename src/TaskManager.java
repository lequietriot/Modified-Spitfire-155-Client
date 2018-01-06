import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

public class TaskManager implements Runnable {

    static int staticInt118;
    static int[] staticIntArray57;
    Task next = null;
    Task task2 = null;
    boolean shutdown = false;
    public static String staticString27;
    public static String staticString26;
    Thread thread2;

    public TaskManager() {
        staticString27 = "Unknown";
        staticString26 = "1.6";

        try {
            staticString27 = System.getProperty("java.vendor");
            staticString26 = System.getProperty("java.version");
        } catch (Exception exception_2) {
            ;
        }

        shutdown = false;
        thread2 = new Thread(this);
        thread2.setPriority(10);
        thread2.setDaemon(true);
        thread2.start();
    }

    public final void shutdown() {
        synchronized (this) {
            shutdown = true;
            notifyAll();
        }

        try {
            thread2.join();
        } catch (InterruptedException interruptedexception_4) {
            ;
        }

    }

    @Override
    public final void run() {
        while (true) {
            Task task_1;
            synchronized (this) {
                while (true) {
                    if (shutdown)
                        return;

                    if (next != null) {
                        task_1 = next;
                        next = next.nextTask;
                        if (next == null)
                            task2 = null;
                        break;
                    }

                    try {
                        this.wait();
                    } catch (InterruptedException interruptedexception_7) {
                        ;
                    }
                }
            }

            try {
                int i_2 = task_1.type;
                if (i_2 == 1)
                    task_1.result = new Socket(InetAddress.getByName((String) task_1.objectArg), task_1.intArg);
                else if (i_2 == 2) {
                    Thread thread_3 = new Thread((Runnable) task_1.objectArg);
                    thread_3.setDaemon(true);
                    thread_3.start();
                    thread_3.setPriority(task_1.intArg);
                    task_1.result = thread_3;
                } else if (i_2 == 4)
                    task_1.result = new DataInputStream(((URL) task_1.objectArg).openStream());
                else if (i_2 == 3) {
                    String string_9 = (task_1.intArg >> 24 & 0xff) + "." + (task_1.intArg >> 16 & 0xff) + "." + (task_1.intArg >> 8 & 0xff) + "." + (task_1.intArg & 0xff);
                    task_1.result = InetAddress.getByName(string_9).getHostName();
                }

                task_1.status = 1;
            } catch (ThreadDeath threaddeath_5) {
                throw threaddeath_5;
            } catch (Throwable throwable_6) {
                task_1.status = 2;
            }
        }
    }

    final Task submit(int i_1, int i_2, int i_3, Object object_4) {
        Task task_6 = new Task();
        task_6.type = i_1;
        task_6.intArg = i_2;
        task_6.objectArg = object_4;
        synchronized (this) {
            if (task2 != null) {
                task2.nextTask = task_6;
                task2 = task_6;
            } else
                task2 = next = task_6;

            notify();
            return task_6;
        }
    }

    public final Task submitOpenSocket(String string_1, int i_2) {
        return submit(1, i_2, 0, string_1);
    }

    public final Task submitRunnable(Runnable runnable_1, int i_2) {
        return submit(2, i_2, 0, runnable_1);
    }

    public final Task submitDNS(int i_1) {
        return submit(3, i_1, 0, (Object) null);
    }

}

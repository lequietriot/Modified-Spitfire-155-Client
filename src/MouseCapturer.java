public class MouseCapturer implements Runnable {

    boolean running = true;
    Object lock = new Object();
    int offset = 0;
    int[] xcoords = new int[500];
    int[] ycoords = new int[500];

    @Override
    public void run() {
        for (; running; StaticClass18.staticMethod127(50L)) {
            Object object_1 = lock;
            synchronized (lock) {
                if (offset < 500) {
                    xcoords[offset] = MouseHandler.staticInt28;
                    ycoords[offset] = MouseHandler.staticInt29;
                    ++offset;
                }
            }
        }

    }

}

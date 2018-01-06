import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public final class MouseWheelHandler implements WheelRotationProvider, MouseWheelListener {

    int wheelRotation = 0;

    void addMouseWheelListener(Component component_1) {
        component_1.addMouseWheelListener(this);
    }

    void removeMouseWheelListener(Component component_1) {
        component_1.removeMouseWheelListener(this);
    }

    @Override
    public synchronized void mouseWheelMoved(MouseWheelEvent mousewheelevent_1) {
        wheelRotation += mousewheelevent_1.getWheelRotation();
    }

    @Override
    public synchronized int getWheelRotation() {
        int i_2 = wheelRotation;
        wheelRotation = 0;
        return i_2;
    }

}

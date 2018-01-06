import java.util.Iterator;

public class HitMarkList implements Iterable {

    Node node10 = new Node();
    Node node9;

    public HitMarkList() {
        node10.next = node10;
        node10.prev = node10;
    }

    public void add(Node node_1) {
        if (node_1.prev != null)
            node_1.unlink();

        node_1.prev = node10.prev;
        node_1.next = node10;
        node_1.prev.next = node_1;
        node_1.next.prev = node_1;
    }

    public void method283(Node node_1) {
        if (node_1.prev != null)
            node_1.unlink();

        node_1.prev = node10;
        node_1.next = node10.next;
        node_1.prev.next = node_1;
        node_1.next.prev = node_1;
    }

    public static void staticMethod163(Node node_0, Node node_1) {
        if (node_0.prev != null)
            node_0.unlink();

        node_0.prev = node_1;
        node_0.next = node_1.next;
        node_0.prev.next = node_0;
        node_0.next.prev = node_0;
    }

    public Node method284() {
        Node node_1 = node10.next;
        if (node_1 == node10)
            return null;
        else {
            node_1.unlink();
            return node_1;
        }
    }

    public Node method285() {
        return method286((Node) null);
    }

    Node method286(Node node_1) {
        Node node_2;
        if (node_1 == null)
            node_2 = node10.next;
        else
            node_2 = node_1;

        if (node_2 == node10) {
            node9 = null;
            return null;
        } else {
            node9 = node_2.next;
            return node_2;
        }
    }

    public Node method287() {
        Node node_1 = node9;
        if (node_1 == node10) {
            node9 = null;
            return null;
        } else {
            node9 = node_1.next;
            return node_1;
        }
    }

    public boolean method288() {
        return node10.next == node10;
    }

    @Override
    public Iterator iterator() {
        return new IteratorImpl1(this);
    }

}

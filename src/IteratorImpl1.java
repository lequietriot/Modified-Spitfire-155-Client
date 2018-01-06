import java.util.Iterator;

public class IteratorImpl1 implements Iterator {

    Node node3 = null;
    HitMarkList hitMarkList1;
    Node node2;

    IteratorImpl1(HitMarkList hitmarklist_1) {
        hitMarkList1 = hitmarklist_1;
        node2 = hitMarkList1.node10.next;
        node3 = null;
    }

    @Override
    public Object next() {
        Node node_1 = node2;
        if (node_1 == hitMarkList1.node10) {
            node_1 = null;
            node2 = null;
        } else
            node2 = node_1.next;

        node3 = node_1;
        return node_1;
    }

    @Override
    public boolean hasNext() {
        return node2 != hitMarkList1.node10;
    }

    @Override
    public void remove() {
        if (node3 == null)
            throw new IllegalStateException();
        else {
            node3.unlink();
            node3 = null;
        }
    }

}

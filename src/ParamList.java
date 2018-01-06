import java.util.Iterator;

public final class ParamList implements Iterable {

    int int242 = 0;
    int int241;
    Node[] nodeArray1;
    Node node4;
    Node node5;

    public ParamList(int i_1) {
        int241 = i_1;
        nodeArray1 = new Node[i_1];

        for (int i_2 = 0; i_2 < i_1; i_2++) {
            Node node_3 = nodeArray1[i_2] = new Node();
            node_3.next = node_3;
            node_3.prev = node_3;
        }

    }

    public Node method247(long long_1) {
        Node node_3 = nodeArray1[(int) (long_1 & int241 - 1)];

        for (node4 = node_3.next; node4 != node_3; node4 = node4.next)
            if (node4.id == long_1) {
                Node node_4 = node4;
                node4 = node4.next;
                return node_4;
            }

        node4 = null;
        return null;
    }

    public void method248(Node node_1, long long_2) {
        if (node_1.prev != null)
            node_1.unlink();

        Node node_4 = nodeArray1[(int) (long_2 & int241 - 1)];
        node_1.prev = node_4.prev;
        node_1.next = node_4;
        node_1.prev.next = node_1;
        node_1.next.prev = node_1;
        node_1.id = long_2;
    }

    public void method249() {
        for (int i_1 = 0; i_1 < int241; i_1++) {
            Node node_2 = nodeArray1[i_1];

            while (true) {
                Node node_3 = node_2.next;
                if (node_3 == node_2)
                    break;

                node_3.unlink();
            }
        }

        node4 = null;
        node5 = null;
    }

    public Node method250() {
        int242 = 0;
        return method251();
    }

    public Node method251() {
        Node node_1;
        if (int242 > 0 && node5 != nodeArray1[int242 - 1]) {
            node_1 = node5;
            node5 = node_1.next;
            return node_1;
        } else {
            do {
                if (int242 >= int241)
                    return null;

                node_1 = nodeArray1[int242++].next;
            } while (node_1 == nodeArray1[int242 - 1]);

            node5 = node_1.next;
            return node_1;
        }
    }

    @Override
    public Iterator iterator() {
        return new ParamIterator(this);
    }

}

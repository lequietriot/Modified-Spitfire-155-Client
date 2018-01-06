public class Deque {

    public Node node7 = new Node();
    Node node6;

    public Deque() {
        node7.next = node7;
        node7.prev = node7;
    }

    public void method252() {
        while (true) {
            Node node_1 = node7.next;
            if (node_1 == node7) {
                node6 = null;
                return;
            }

            node_1.unlink();
        }
    }

    public void method253(Node node_1) {
        if (node_1.prev != null)
            node_1.unlink();

        node_1.prev = node7.prev;
        node_1.next = node7;
        node_1.prev.next = node_1;
        node_1.next.prev = node_1;
    }

    public void method254(Node node_1) {
        if (node_1.prev != null)
            node_1.unlink();

        node_1.prev = node7;
        node_1.next = node7.next;
        node_1.prev.next = node_1;
        node_1.next.prev = node_1;
    }

    public static void staticMethod162(Node node_0, Node node_1) {
        if (node_0.prev != null)
            node_0.unlink();

        node_0.prev = node_1.prev;
        node_0.next = node_1;
        node_0.prev.next = node_0;
        node_0.next.prev = node_0;
    }

    public Node method255() {
        Node node_1 = node7.next;
        if (node_1 == node7)
            return null;
        else {
            node_1.unlink();
            return node_1;
        }
    }

    public Node method256() {
        Node node_1 = node7.prev;
        if (node_1 == node7)
            return null;
        else {
            node_1.unlink();
            return node_1;
        }
    }

    public Node method257() {
        Node node_1 = node7.next;
        if (node_1 == node7) {
            node6 = null;
            return null;
        } else {
            node6 = node_1.next;
            return node_1;
        }
    }

    public Node method258() {
        Node node_1 = node7.prev;
        if (node_1 == node7) {
            node6 = null;
            return null;
        } else {
            node6 = node_1.prev;
            return node_1;
        }
    }

    public Node method259() {
        Node node_1 = node6;
        if (node_1 == node7) {
            node6 = null;
            return null;
        } else {
            node6 = node_1.next;
            return node_1;
        }
    }

    public Node method260() {
        Node node_1 = node6;
        if (node_1 == node7) {
            node6 = null;
            return null;
        } else {
            node6 = node_1.prev;
            return node_1;
        }
    }

}

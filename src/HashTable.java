public final class HashTable {

    int int243 = 0;
    int size;
    Node[] buckets;
    Node node;
    Node node8;

    public HashTable(int i_1) {
        size = i_1;
        buckets = new Node[i_1];

        for (int i_2 = 0; i_2 < i_1; i_2++) {
            Node node_3 = buckets[i_2] = new Node();
            node_3.next = node_3;
            node_3.prev = node_3;
        }

    }

    public Node get(long long_1) {
        Node node_3 = buckets[(int) (long_1 & size - 1)];

        for (node = node_3.next; node != node_3; node = node.next)
            if (node.id == long_1) {
                Node node_4 = node;
                node = node.next;
                return node_4;
            }

        node = null;
        return null;
    }

    public void put(Node node_1, long long_2) {
        if (node_1.prev != null)
            node_1.unlink();

        Node node_4 = buckets[(int) (long_2 & size - 1)];
        node_1.prev = node_4.prev;
        node_1.next = node_4;
        node_1.prev.next = node_1;
        node_1.next.prev = node_1;
        node_1.id = long_2;
    }

    void clear() {
        for (int i_1 = 0; i_1 < size; i_1++) {
            Node node_2 = buckets[i_1];

            while (true) {
                Node node_3 = node_2.next;
                if (node_3 == node_2)
                    break;

                node_3.unlink();
            }
        }

        node = null;
        node8 = null;
    }

    public Node method267() {
        int243 = 0;
        return method268();
    }

    public Node method268() {
        Node node_1;
        if (int243 > 0 && node8 != buckets[int243 - 1]) {
            node_1 = node8;
            node8 = node_1.next;
            return node_1;
        } else {
            do {
                if (int243 >= size)
                    return null;

                node_1 = buckets[int243++].next;
            } while (node_1 == buckets[int243 - 1]);

            node8 = node_1.next;
            return node_1;
        }
    }

}

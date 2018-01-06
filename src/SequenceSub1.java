public class SequenceSub1 extends Sequence {

    Deque deque3 = new Deque();
    Deque deque2 = new Deque();
    int int485 = 0;
    int int484 = -1;

    public final synchronized void synchronizedMethod8(Sequence sequence_1) {
        deque3.method254(sequence_1);
    }

    public final synchronized void synchronizedMethod9(Sequence sequence_1) {
        sequence_1.unlink();
    }

    void method515() {
        if (int485 > 0) {
            for (NodeSub4 nodesub4_1 = (NodeSub4) deque2.method257(); nodesub4_1 != null; nodesub4_1 = (NodeSub4) deque2.method259())
                nodesub4_1.int345 -= int485;

            int484 -= int485;
            int485 = 0;
        }

    }

    void method516(Node node_1, NodeSub4 nodesub4_2) {
        while (node_1 != deque2.node7 && ((NodeSub4) node_1).int345 <= nodesub4_2.int345)
            node_1 = node_1.next;

        Deque.staticMethod162(nodesub4_2, node_1);
        int484 = ((NodeSub4) deque2.node7.next).int345;
    }

    void method517(NodeSub4 nodesub4_1) {
        nodesub4_1.unlink();
        nodesub4_1.method415();
        Node node_2 = deque2.node7.next;
        if (node_2 == deque2.node7)
            int484 = -1;
        else
            int484 = ((NodeSub4) node_2).int345;

    }

    @Override
    protected Sequence method418() {
        return (Sequence) deque3.method257();
    }

    @Override
    protected Sequence method416() {
        return (Sequence) deque3.method259();
    }

    @Override
    protected int method417() {
        return 0;
    }

    @Override
    public final synchronized void method420(int[] ints_1, int i_2, int i_3) {
        do {
            if (int484 < 0) {
                method518(ints_1, i_2, i_3);
                return;
            }

            if (int485 + i_3 < int484) {
                int485 += i_3;
                method518(ints_1, i_2, i_3);
                return;
            }

            int i_4 = int484 - int485;
            method518(ints_1, i_2, i_4);
            i_2 += i_4;
            i_3 -= i_4;
            int485 += i_4;
            method515();
            NodeSub4 nodesub4_5 = (NodeSub4) deque2.method257();
            synchronized (nodesub4_5) {
                int i_7 = nodesub4_5.method414(this);
                if (i_7 < 0) {
                    nodesub4_5.int345 = 0;
                    method517(nodesub4_5);
                } else {
                    nodesub4_5.int345 = i_7;
                    method516(nodesub4_5.next, nodesub4_5);
                }
            }
        } while (i_3 != 0);

    }

    void method518(int[] ints_1, int i_2, int i_3) {
        for (Sequence sequence_4 = (Sequence) deque3.method257(); sequence_4 != null; sequence_4 = (Sequence) deque3.method259())
            sequence_4.method422(ints_1, i_2, i_3);

    }

    @Override
    public final synchronized void method419(int i_1) {
        do {
            if (int484 < 0) {
                method519(i_1);
                return;
            }

            if (int485 + i_1 < int484) {
                int485 += i_1;
                method519(i_1);
                return;
            }

            int i_2 = int484 - int485;
            method519(i_2);
            i_1 -= i_2;
            int485 += i_2;
            method515();
            NodeSub4 nodesub4_3 = (NodeSub4) deque2.method257();
            synchronized (nodesub4_3) {
                int i_5 = nodesub4_3.method414(this);
                if (i_5 < 0) {
                    nodesub4_3.int345 = 0;
                    method517(nodesub4_3);
                } else {
                    nodesub4_3.int345 = i_5;
                    method516(nodesub4_3.next, nodesub4_3);
                }
            }
        } while (i_1 != 0);

    }

    void method519(int i_1) {
        for (Sequence sequence_2 = (Sequence) deque3.method257(); sequence_2 != null; sequence_2 = (Sequence) deque3.method259())
            sequence_2.method419(i_1);

    }

}

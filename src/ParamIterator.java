import java.util.Iterator;

public class ParamIterator implements Iterator {

    Node node12 = null;
    ParamList paramList1;
    Node node11;
    int int253;

    ParamIterator(ParamList paramlist_1) {
        paramList1 = paramlist_1;
        method291();
    }

    void method291() {
        node11 = paramList1.nodeArray1[0].next;
        int253 = 1;
        node12 = null;
    }

    @Override
    public Object next() {
        Node node_1;
        if (node11 != paramList1.nodeArray1[int253 - 1]) {
            node_1 = node11;
            node11 = node_1.next;
            node12 = node_1;
            return node_1;
        } else {
            do {
                if (int253 >= paramList1.int241)
                    return null;

                node_1 = paramList1.nodeArray1[int253++].next;
            } while (node_1 == paramList1.nodeArray1[int253 - 1]);

            node11 = node_1.next;
            node12 = node_1;
            return node_1;
        }
    }

    @Override
    public boolean hasNext() {
        if (node11 != paramList1.nodeArray1[int253 - 1])
            return true;
        else {
            while (int253 < paramList1.int241) {
                if (paramList1.nodeArray1[int253++].next != paramList1.nodeArray1[int253 - 1]) {
                    node11 = paramList1.nodeArray1[int253 - 1].next;
                    return true;
                }

                node11 = paramList1.nodeArray1[int253 - 1];
            }

            return false;
        }
    }

    @Override
    public void remove() {
        if (node12 == null)
            throw new IllegalStateException();
        else {
            node12.unlink();
            node12 = null;
        }
    }

}

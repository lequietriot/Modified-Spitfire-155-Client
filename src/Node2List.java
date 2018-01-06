public class Node2List {

    Node2 node2_2 = new Node2();
    Node2 node2_1;

    public Node2List() {
        node2_2.node2_3 = node2_2;
        node2_2.node2_4 = node2_2;
    }

    public void method261(Node2 node2_1x) {
        if (node2_1x.node2_4 != null)
            node2_1x.method292();

        node2_1x.node2_4 = node2_2.node2_4;
        node2_1x.node2_3 = node2_2;
        node2_1x.node2_4.node2_3 = node2_1x;
        node2_1x.node2_3.node2_4 = node2_1x;
    }

    public Node2 method262() {
        Node2 node2_1x = node2_2.node2_3;
        if (node2_1x == node2_2) {
            node2_1 = null;
            return null;
        } else {
            node2_1 = node2_1x.node2_3;
            return node2_1x;
        }
    }

    public Node2 method263() {
        Node2 node2_1x = node2_1;
        if (node2_1x == node2_2) {
            node2_1 = null;
            return null;
        } else {
            node2_1 = node2_1x.node2_3;
            return node2_1x;
        }
    }

}

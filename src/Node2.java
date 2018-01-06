public class Node2 {

    Node2 node2_3;
    Node2 node2_4;

    public void method292() {
        if (node2_4 != null) {
            node2_4.node2_3 = node2_3;
            node2_3.node2_4 = node2_4;
            node2_3 = null;
            node2_4 = null;
        }
    }

}

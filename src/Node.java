public class Node {

    public long id;
    public Node next;
    Node prev;

    public void unlink() {
        if (prev != null) {
            prev.next = next;
            next.prev = prev;
            next = null;
            prev = null;
        }
    }

    public boolean hasPrevious() {
        return prev != null;
    }

}

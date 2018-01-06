public class Cacheable extends Node {

    public Cacheable next;
    public Cacheable prev;

    public void unlinkCacheable() {
        if (prev != null) {
            prev.next = next;
            next.prev = prev;
            next = null;
            prev = null;
        }
    }

}

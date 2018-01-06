public final class Queue {

    Cacheable head = new Cacheable();

    public Queue() {
        head.next = head;
        head.prev = head;
    }

    public void add(Cacheable cacheable_1) {
        if (cacheable_1.prev != null)
            cacheable_1.unlinkCacheable();

        cacheable_1.prev = head.prev;
        cacheable_1.next = head;
        cacheable_1.prev.next = cacheable_1;
        cacheable_1.next.prev = cacheable_1;
    }

    public void method265(Cacheable cacheable_1) {
        if (cacheable_1.prev != null)
            cacheable_1.unlinkCacheable();

        cacheable_1.prev = head;
        cacheable_1.next = head.next;
        cacheable_1.prev.next = cacheable_1;
        cacheable_1.next.prev = cacheable_1;
    }

    Cacheable remove() {
        Cacheable cacheable_1 = head.next;
        if (cacheable_1 == head)
            return null;
        else {
            cacheable_1.unlinkCacheable();
            return cacheable_1;
        }
    }

    public Cacheable method266() {
        Cacheable cacheable_1 = head.next;
        return cacheable_1 == head ? null : cacheable_1;
    }

    void clear() {
        while (true) {
            Cacheable cacheable_1 = head.next;
            if (cacheable_1 == head)
                return;

            cacheable_1.unlinkCacheable();
        }
    }

}

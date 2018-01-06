import java.util.Iterator;

public class ChatLineList implements Iterable {

    public Cacheable cacheable4 = new Cacheable();

    public ChatLineList() {
        cacheable4.next = cacheable4;
        cacheable4.prev = cacheable4;
    }

    public void method289() {
        while (cacheable4.next != cacheable4)
            cacheable4.next.unlinkCacheable();

    }

    public void method290(Cacheable cacheable_1) {
        if (cacheable_1.prev != null)
            cacheable_1.unlinkCacheable();

        cacheable_1.prev = cacheable4.prev;
        cacheable_1.next = cacheable4;
        cacheable_1.prev.next = cacheable_1;
        cacheable_1.next.prev = cacheable_1;
    }

    @Override
    public Iterator iterator() {
        return new IteratorImpl2(this);
    }

}

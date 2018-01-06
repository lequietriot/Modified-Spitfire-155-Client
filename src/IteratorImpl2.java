import java.util.Iterator;

public class IteratorImpl2 implements Iterator {

    Cacheable cacheable2 = null;
    ChatLineList chatLineList1;
    Cacheable cacheable3;

    IteratorImpl2(ChatLineList chatlinelist_1) {
        chatLineList1 = chatlinelist_1;
        cacheable3 = chatLineList1.cacheable4.next;
        cacheable2 = null;
    }

    @Override
    public Object next() {
        Cacheable cacheable_1 = cacheable3;
        if (cacheable_1 == chatLineList1.cacheable4) {
            cacheable_1 = null;
            cacheable3 = null;
        } else
            cacheable3 = cacheable_1.next;

        cacheable2 = cacheable_1;
        return cacheable_1;
    }

    @Override
    public boolean hasNext() {
        return cacheable3 != chatLineList1.cacheable4;
    }

    @Override
    public void remove() {
        if (cacheable2 == null)
            throw new IllegalStateException();
        else {
            cacheable2.unlinkCacheable();
            cacheable2 = null;
        }
    }

}

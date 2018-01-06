public final class Cache {

    Cacheable cacheable1 = new Cacheable();
    Queue queue = new Queue();
    int initialSize;
    int size;
    HashTable hashTable;

    public Cache(int i_1) {
        initialSize = i_1;
        size = i_1;

        int i_2;
        for (i_2 = 1; i_2 + i_2 < i_1; i_2 += i_2)
            ;

        hashTable = new HashTable(i_2);
    }

    public Cacheable get(long long_1) {
        Cacheable cacheable_3 = (Cacheable) hashTable.get(long_1);
        if (cacheable_3 != null)
            queue.add(cacheable_3);

        return cacheable_3;
    }

    public void remove(long long_1) {
        Cacheable cacheable_3 = (Cacheable) hashTable.get(long_1);
        if (cacheable_3 != null) {
            cacheable_3.unlink();
            cacheable_3.unlinkCacheable();
            ++size;
        }

    }

    public void put(Cacheable cacheable_1, long long_2) {
        if (size == 0) {
            Cacheable cacheable_4 = queue.remove();
            cacheable_4.unlink();
            cacheable_4.unlinkCacheable();
            if (cacheable_4 == cacheable1) {
                cacheable_4 = queue.remove();
                cacheable_4.unlink();
                cacheable_4.unlinkCacheable();
            }
        } else
            --size;

        hashTable.put(cacheable_1, long_2);
        queue.add(cacheable_1);
    }

    public void method264() {
        queue.clear();
        hashTable.clear();
        cacheable1 = new Cacheable();
        size = initialSize;
    }

}

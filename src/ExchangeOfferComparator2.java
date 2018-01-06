import java.util.Comparator;

final class ExchangeOfferComparator2 implements Comparator {

    static Class13 staticClass13_1;

    int method293(Class3 class3_1, Class3 class3_2) {
        return class3_1.long1 < class3_2.long1 ? -1 : class3_2.long1 == class3_1.long1 ? 0 : 1;
    }

    @Override
    public int compare(Object object_1, Object object_2) {
        return method293((Class3) object_1, (Class3) object_2);
    }

    @Override
    public boolean equals(Object object_1) {
        return super.equals(object_1);
    }

}

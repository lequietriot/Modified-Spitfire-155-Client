import java.util.Comparator;

final class ExchangeOfferComparator3 implements Comparator {

    public static int staticInt157;
    public static String[] staticStringArray5;

    int method385(Class3 class3_1, Class3 class3_2) {
        return class3_1.exchangeOffer1.int268 < class3_2.exchangeOffer1.int268 ? -1 : class3_2.exchangeOffer1.int268 == class3_1.exchangeOffer1.int268 ? 0 : 1;
    }

    @Override
    public int compare(Object object_1, Object object_2) {
        return method385((Class3) object_1, (Class3) object_2);
    }

    @Override
    public boolean equals(Object object_1) {
        return super.equals(object_1);
    }

}

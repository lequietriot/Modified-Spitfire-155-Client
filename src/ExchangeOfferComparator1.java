import java.util.Comparator;

final class ExchangeOfferComparator1 implements Comparator {

    static int staticInt119;
    public static Js5Index staticJs5Index2;
    static Sprite staticSprite2;
    static int staticInt120;
    static Sprite staticSprite3;

    int method231(Class3 class3_1, Class3 class3_2) {
        return class3_1.exchangeOffer1.int269 < class3_2.exchangeOffer1.int269 ? -1 : class3_1.exchangeOffer1.int269 == class3_2.exchangeOffer1.int269 ? 0 : 1;
    }

    @Override
    public int compare(Object object_1, Object object_2) {
        return method231((Class3) object_1, (Class3) object_2);
    }

    @Override
    public boolean equals(Object object_1) {
        return super.equals(object_1);
    }

}

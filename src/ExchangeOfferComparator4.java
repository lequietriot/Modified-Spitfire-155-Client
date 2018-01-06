import java.util.Comparator;

final class ExchangeOfferComparator4 implements Comparator {

    // $FF: synthetic field
    final boolean bool8;

    ExchangeOfferComparator4(boolean bool_1) {
        bool8 = bool_1;
    }

    int method125(Class3 class3_1, Class3 class3_2) {
        if (class3_2.int78 == class3_1.int78)
            return 0;
        else {
            if (bool8) {
                if (class3_1.int78 == Client.staticInt271)
                    return -1;

                if (class3_2.int78 == Client.staticInt271)
                    return 1;
            }

            return class3_1.int78 < class3_2.int78 ? -1 : 1;
        }
    }

    @Override
    public int compare(Object object_1, Object object_2) {
        return method125((Class3) object_1, (Class3) object_2);
    }

    @Override
    public boolean equals(Object object_1) {
        return super.equals(object_1);
    }

}

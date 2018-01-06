import java.util.Comparator;

final class ExchangeOfferComparator6 implements Comparator {

    public static GraphicsBuffer staticGraphicsBuffer1;
    static byte[][] staticByteArrayArray5;

    int method305(Class3 class3_1, Class3 class3_2) {
        return class3_1.int78 < class3_2.int78 ? -1 : class3_2.int78 == class3_1.int78 ? 0 : 1;
    }

    @Override
    public int compare(Object object_1, Object object_2) {
        return method305((Class3) object_1, (Class3) object_2);
    }

    @Override
    public boolean equals(Object object_1) {
        return super.equals(object_1);
    }

}

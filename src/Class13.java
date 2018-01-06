import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Class13 {

    public static Comparator staticComparator2 = new ExchangeOfferComparator2();
    public static Comparator staticComparator1;
    public static Comparator staticComparator4;
    public static Comparator staticComparator3;
    public final List list3;

    static {
        new ExchangeOfferComparator6();
        staticComparator1 = new ExchangeOfferComparator3();
        staticComparator4 = new ExchangeOfferComparator5();
        staticComparator3 = new ExchangeOfferComparator1();
    }

    public Class13(Buffer buffer_1, boolean bool_2) {
        int i_3 = buffer_1.readUShort();
        boolean bool_4 = buffer_1.readUByte() == 1;
        byte b_5;
        if (bool_4)
            b_5 = 1;
        else
            b_5 = 0;

        int i_6 = buffer_1.readUShort();
        list3 = new ArrayList(i_6);

        for (int i_7 = 0; i_7 < i_6; i_7++)
            list3.add(new Class3(buffer_1, b_5, i_3));

    }

    public void method384(Comparator comparator_1, boolean bool_2) {
        if (bool_2)
            Collections.sort(list3, comparator_1);
        else
            Collections.sort(list3, Collections.reverseOrder(comparator_1));

    }

}

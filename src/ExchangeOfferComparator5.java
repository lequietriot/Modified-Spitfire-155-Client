import java.io.IOException;
import java.util.Comparator;

final class ExchangeOfferComparator5 implements Comparator {

    static int staticInt45;

    int method124(Class3 class3_1, Class3 class3_2) {
        return class3_1.method94().compareTo(class3_2.method94());
    }

    @Override
    public int compare(Object object_1, Object object_2) {
        return method124((Class3) object_1, (Class3) object_2);
    }

    @Override
    public boolean equals(Object object_1) {
        return super.equals(object_1);
    }

    static ClientPreferences staticMethod41() {
        FileOnDisk fileondisk_1 = null;
        ClientPreferences clientpreferences_2 = new ClientPreferences();

        try {
            fileondisk_1 = StaticClass16.staticMethod111("", Client.staticGameType7.string13, false);
            byte[] bytes_3 = new byte[(int) fileondisk_1.method177()];

            int i_5;
            for (int i_4 = 0; i_4 < bytes_3.length; i_4 += i_5) {
                i_5 = fileondisk_1.method178(bytes_3, i_4, bytes_3.length - i_4);
                if (i_5 == -1)
                    throw new IOException();
            }

            clientpreferences_2 = new ClientPreferences(new Buffer(bytes_3));
        } catch (Exception exception_7) {
            ;
        }

        try {
            if (fileondisk_1 != null)
                fileondisk_1.close();
        } catch (Exception exception_6) {
            ;
        }

        return clientpreferences_2;
    }

}

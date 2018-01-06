public class Class3 {

    String string2;
    String string3;
    public final int int78;
    public final long long1;
    public final ExchangeOffer exchangeOffer1;

    Class3(Buffer buffer_1, byte b_2, int i_3) {
        string2 = buffer_1.method448();
        string3 = buffer_1.method448();
        int78 = buffer_1.readUShort();
        long1 = buffer_1.method445();
        int i_4 = buffer_1.readInt();
        int i_5 = buffer_1.readInt();
        exchangeOffer1 = new ExchangeOffer();
        exchangeOffer1.method313(2);
        exchangeOffer1.method314(b_2);
        exchangeOffer1.int268 = i_4;
        exchangeOffer1.int269 = i_5;
        exchangeOffer1.int270 = 0;
        exchangeOffer1.int271 = 0;
        exchangeOffer1.int272 = i_3;
    }

    public String method94() {
        return string2;
    }

    public String method95() {
        return string3;
    }

}

public final class Packet extends Buffer {

    static final int[] staticIntArray128 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
    Isaac isaac1;
    int bitoff;

    public Packet(int i_1) {
        super(i_1);
    }

    public void initCipher(int[] ints_1) {
        isaac1 = new Isaac(ints_1);
    }

    public void writeOpcode(int i_1) {
        buf[off++] = (byte) (i_1 /*+ isaac1.getNextKey()*/);
    }

    public int readOpcode() {
        return buf[off++] - isaac1.getNextKey() & 0xff;
    }

    public void initBitAccess() {
        bitoff = off * 8;
    }

    public int readBits(int i_1) {
        int i_3 = bitoff >> 3;
        int i_4 = 8 - (bitoff & 0x7);
        int i_5 = 0;

        for (bitoff += i_1; i_1 > i_4; i_4 = 8) {
            i_5 += (buf[i_3++] & staticIntArray128[i_4]) << i_1 - i_4;
            i_1 -= i_4;
        }

        if (i_1 == i_4)
            i_5 += buf[i_3] & staticIntArray128[i_4];
        else
            i_5 += buf[i_3] >> i_4 - i_1 & staticIntArray128[i_1];

        return i_5;
    }

    public void finishBitAccess() {
        off = (bitoff + 7) / 8;
    }

    public int remainingBits(int i_1) {
        return i_1 * 8 - bitoff;
    }

}

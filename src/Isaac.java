public final class Isaac {

    int[] memory = new int[256];
    int[] results = new int[256];
    int count;
    int int232;
    int int231;
    int accumulator;

    Isaac(int[] ints_1) {
        for (int i_2 = 0; i_2 < ints_1.length; i_2++)
            results[i_2] = ints_1[i_2];

        init();
    }

    final int getNextKey() {
        if (--count + 1 == 0) {
            isaac();
            count = 255;
        }

        return results[count];
    }

    final void isaac() {
        int231 += ++int232;

        for (int i_2 = 0; i_2 < 256; i_2++) {
            int i_3 = memory[i_2];
            if ((i_2 & 0x2) == 0) {
                if ((i_2 & 0x1) == 0)
                    accumulator ^= accumulator << 13;
                else
                    accumulator ^= accumulator >>> 6;
            } else if ((i_2 & 0x1) == 0)
                accumulator ^= accumulator << 2;
            else
                accumulator ^= accumulator >>> 16;

            accumulator += memory[i_2 + 128 & 0xff];
            int i_4;
            memory[i_2] = i_4 = accumulator + memory[(i_3 & 0x3fc) >> 2] + int231;
            results[i_2] = int231 = i_3 + memory[(i_4 >> 8 & 0x3fc) >> 2];
        }

    }

    final void init() {
        int i_10 = -1640531527;
        int i_9 = -1640531527;
        int i_8 = -1640531527;
        int i_7 = -1640531527;
        int i_6 = -1640531527;
        int i_5 = -1640531527;
        int i_4 = -1640531527;
        int i_3 = -1640531527;

        int i_2;
        for (i_2 = 0; i_2 < 4; i_2++) {
            i_3 ^= i_4 << 11;
            i_6 += i_3;
            i_4 += i_5;
            i_4 ^= i_5 >>> 2;
            i_7 += i_4;
            i_5 += i_6;
            i_5 ^= i_6 << 8;
            i_8 += i_5;
            i_6 += i_7;
            i_6 ^= i_7 >>> 16;
            i_9 += i_6;
            i_7 += i_8;
            i_7 ^= i_8 << 10;
            i_10 += i_7;
            i_8 += i_9;
            i_8 ^= i_9 >>> 4;
            i_3 += i_8;
            i_9 += i_10;
            i_9 ^= i_10 << 8;
            i_4 += i_9;
            i_10 += i_3;
            i_10 ^= i_3 >>> 9;
            i_5 += i_10;
            i_3 += i_4;
        }

        for (i_2 = 0; i_2 < 256; i_2 += 8) {
            i_3 += results[i_2];
            i_4 += results[i_2 + 1];
            i_5 += results[i_2 + 2];
            i_6 += results[i_2 + 3];
            i_7 += results[i_2 + 4];
            i_8 += results[i_2 + 5];
            i_9 += results[i_2 + 6];
            i_10 += results[i_2 + 7];
            i_3 ^= i_4 << 11;
            i_6 += i_3;
            i_4 += i_5;
            i_4 ^= i_5 >>> 2;
            i_7 += i_4;
            i_5 += i_6;
            i_5 ^= i_6 << 8;
            i_8 += i_5;
            i_6 += i_7;
            i_6 ^= i_7 >>> 16;
            i_9 += i_6;
            i_7 += i_8;
            i_7 ^= i_8 << 10;
            i_10 += i_7;
            i_8 += i_9;
            i_8 ^= i_9 >>> 4;
            i_3 += i_8;
            i_9 += i_10;
            i_9 ^= i_10 << 8;
            i_4 += i_9;
            i_10 += i_3;
            i_10 ^= i_3 >>> 9;
            i_5 += i_10;
            i_3 += i_4;
            memory[i_2] = i_3;
            memory[i_2 + 1] = i_4;
            memory[i_2 + 2] = i_5;
            memory[i_2 + 3] = i_6;
            memory[i_2 + 4] = i_7;
            memory[i_2 + 5] = i_8;
            memory[i_2 + 6] = i_9;
            memory[i_2 + 7] = i_10;
        }

        for (i_2 = 0; i_2 < 256; i_2 += 8) {
            i_3 += memory[i_2];
            i_4 += memory[i_2 + 1];
            i_5 += memory[i_2 + 2];
            i_6 += memory[i_2 + 3];
            i_7 += memory[i_2 + 4];
            i_8 += memory[i_2 + 5];
            i_9 += memory[i_2 + 6];
            i_10 += memory[i_2 + 7];
            i_3 ^= i_4 << 11;
            i_6 += i_3;
            i_4 += i_5;
            i_4 ^= i_5 >>> 2;
            i_7 += i_4;
            i_5 += i_6;
            i_5 ^= i_6 << 8;
            i_8 += i_5;
            i_6 += i_7;
            i_6 ^= i_7 >>> 16;
            i_9 += i_6;
            i_7 += i_8;
            i_7 ^= i_8 << 10;
            i_10 += i_7;
            i_8 += i_9;
            i_8 ^= i_9 >>> 4;
            i_3 += i_8;
            i_9 += i_10;
            i_9 ^= i_10 << 8;
            i_4 += i_9;
            i_10 += i_3;
            i_10 ^= i_3 >>> 9;
            i_5 += i_10;
            i_3 += i_4;
            memory[i_2] = i_3;
            memory[i_2 + 1] = i_4;
            memory[i_2 + 2] = i_5;
            memory[i_2 + 3] = i_6;
            memory[i_2 + 4] = i_7;
            memory[i_2 + 5] = i_8;
            memory[i_2 + 6] = i_9;
            memory[i_2 + 7] = i_10;
        }

        isaac();
        count = 256;
    }

}

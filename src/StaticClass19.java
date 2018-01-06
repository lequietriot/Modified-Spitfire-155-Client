public final class StaticClass19 {

    static BZip2Context staticBZip2Context1 = new BZip2Context();

    StaticClass19() throws Throwable {
        throw new Error();
    }

    public static int staticMethod129(byte[] bytes_0, int i_1, byte[] bytes_2, int i_3, int i_4) {
        BZip2Context bzip2context_5 = staticBZip2Context1;
        synchronized (staticBZip2Context1) {
            staticBZip2Context1.byteArray2 = bytes_2;
            staticBZip2Context1.next_in = i_4;
            staticBZip2Context1.byteArray3 = bytes_0;
            staticBZip2Context1.next_out = 0;
            staticBZip2Context1.int219 = i_1;
            staticBZip2Context1.int212 = 0;
            staticBZip2Context1.int221 = 0;
            staticBZip2Context1.int228 = 0;
            staticBZip2Context1.int230 = 0;
            staticMethod131(staticBZip2Context1);
            i_1 -= staticBZip2Context1.int219;
            staticBZip2Context1.byteArray2 = null;
            staticBZip2Context1.byteArray3 = null;
            return i_1;
        }
    }

    static void staticMethod130(BZip2Context bzip2context_0) {
        byte b_2 = bzip2context_0.byte2;
        int i_3 = bzip2context_0.int220;
        int i_4 = bzip2context_0.int224;
        int i_5 = bzip2context_0.int225;
        int[] ints_6 = TaskManager.staticIntArray57;
        int i_7 = bzip2context_0.int226;
        byte[] bytes_8 = bzip2context_0.byteArray3;
        int i_9 = bzip2context_0.next_out;
        int i_10 = bzip2context_0.int219;
        int i_12 = bzip2context_0.int229 + 1;

        label65: while (true) {
            if (i_3 > 0)
                while (true) {
                    if (i_10 == 0)
                        break label65;

                    if (i_3 == 1) {
                        if (i_10 == 0) {
                            i_3 = 1;
                            break label65;
                        }

                        bytes_8[i_9] = b_2;
                        ++i_9;
                        --i_10;
                        break;
                    }

                    bytes_8[i_9] = b_2;
                    --i_3;
                    ++i_9;
                    --i_10;
                }

            boolean bool_14 = true;

            byte b_1;
            while (bool_14) {
                bool_14 = false;
                if (i_4 == i_12) {
                    i_3 = 0;
                    break label65;
                }

                b_2 = (byte) i_5;
                i_7 = ints_6[i_7];
                b_1 = (byte) (i_7 & 0xff);
                i_7 >>= 8;
                ++i_4;
                if (b_1 != i_5) {
                    i_5 = b_1;
                    if (i_10 == 0) {
                        i_3 = 1;
                        break label65;
                    }

                    bytes_8[i_9] = b_2;
                    ++i_9;
                    --i_10;
                    bool_14 = true;
                } else if (i_4 == i_12) {
                    if (i_10 == 0) {
                        i_3 = 1;
                        break label65;
                    }

                    bytes_8[i_9] = b_2;
                    ++i_9;
                    --i_10;
                    bool_14 = true;
                }
            }

            i_3 = 2;
            i_7 = ints_6[i_7];
            b_1 = (byte) (i_7 & 0xff);
            i_7 >>= 8;
            ++i_4;
            if (i_4 != i_12)
                if (b_1 != i_5)
                    i_5 = b_1;
                else {
                    i_3 = 3;
                    i_7 = ints_6[i_7];
                    b_1 = (byte) (i_7 & 0xff);
                    i_7 >>= 8;
                    ++i_4;
                    if (i_4 != i_12)
                        if (b_1 != i_5)
                            i_5 = b_1;
                        else {
                            i_7 = ints_6[i_7];
                            b_1 = (byte) (i_7 & 0xff);
                            i_7 >>= 8;
                            ++i_4;
                            i_3 = (b_1 & 0xff) + 4;
                            i_7 = ints_6[i_7];
                            i_5 = (byte) (i_7 & 0xff);
                            i_7 >>= 8;
                            ++i_4;
                        }
                }
        }

        int i_13 = bzip2context_0.int230;
        bzip2context_0.int230 += i_10 - i_10;
        if (bzip2context_0.int230 < i_13)
            ;

        bzip2context_0.byte2 = b_2;
        bzip2context_0.int220 = i_3;
        bzip2context_0.int224 = i_4;
        bzip2context_0.int225 = i_5;
        TaskManager.staticIntArray57 = ints_6;
        bzip2context_0.int226 = i_7;
        bzip2context_0.byteArray3 = bytes_8;
        bzip2context_0.next_out = i_9;
        bzip2context_0.int219 = i_10;
    }

    static void staticMethod131(BZip2Context bzip2context_0) {
        boolean bool_4 = false;
        boolean bool_5 = false;
        boolean bool_6 = false;
        boolean bool_7 = false;
        boolean bool_8 = false;
        boolean bool_9 = false;
        boolean bool_10 = false;
        boolean bool_11 = false;
        boolean bool_12 = false;
        boolean bool_13 = false;
        boolean bool_14 = false;
        boolean bool_15 = false;
        boolean bool_16 = false;
        boolean bool_17 = false;
        boolean bool_18 = false;
        boolean bool_19 = false;
        boolean bool_20 = false;
        boolean bool_21 = false;
        int i_22 = 0;
        int[] ints_23 = null;
        int[] ints_24 = null;
        int[] ints_25 = null;
        bzip2context_0.int218 = 1;
        if (TaskManager.staticIntArray57 == null)
            TaskManager.staticIntArray57 = new int[bzip2context_0.int218 * 100000];

        boolean bool_26 = true;

        while (true) {
            while (bool_26) {
                byte b_1 = staticMethod132(bzip2context_0);
                if (b_1 == 23)
                    return;

                b_1 = staticMethod132(bzip2context_0);
                b_1 = staticMethod132(bzip2context_0);
                b_1 = staticMethod132(bzip2context_0);
                b_1 = staticMethod132(bzip2context_0);
                b_1 = staticMethod132(bzip2context_0);
                b_1 = staticMethod132(bzip2context_0);
                b_1 = staticMethod132(bzip2context_0);
                b_1 = staticMethod132(bzip2context_0);
                b_1 = staticMethod132(bzip2context_0);
                b_1 = staticMethod133(bzip2context_0);
                if (b_1 != 0)
                    ;

                bzip2context_0.int223 = 0;
                b_1 = staticMethod132(bzip2context_0);
                bzip2context_0.int223 = bzip2context_0.int223 << 8 | b_1 & 0xff;
                b_1 = staticMethod132(bzip2context_0);
                bzip2context_0.int223 = bzip2context_0.int223 << 8 | b_1 & 0xff;
                b_1 = staticMethod132(bzip2context_0);
                bzip2context_0.int223 = bzip2context_0.int223 << 8 | b_1 & 0xff;

                int i_35;
                for (i_35 = 0; i_35 < 16; i_35++) {
                    b_1 = staticMethod133(bzip2context_0);
                    if (b_1 == 1)
                        bzip2context_0.inUse16[i_35] = true;
                    else
                        bzip2context_0.inUse16[i_35] = false;
                }

                for (i_35 = 0; i_35 < 256; i_35++)
                    bzip2context_0.inUse[i_35] = false;

                int i_36;
                for (i_35 = 0; i_35 < 16; i_35++)
                    if (bzip2context_0.inUse16[i_35])
                        for (i_36 = 0; i_36 < 16; i_36++) {
                            b_1 = staticMethod133(bzip2context_0);
                            if (b_1 == 1)
                                bzip2context_0.inUse[i_35 * 16 + i_36] = true;
                        }

                staticMethod135(bzip2context_0);
                int i_38 = bzip2context_0.int227 + 2;
                int i_39 = staticMethod134(3, bzip2context_0);
                int i_40 = staticMethod134(15, bzip2context_0);

                for (i_35 = 0; i_35 < i_40; i_35++) {
                    i_36 = 0;

                    while (true) {
                        b_1 = staticMethod133(bzip2context_0);
                        if (b_1 == 0) {
                            bzip2context_0.selectorMtf[i_35] = (byte) i_36;
                            break;
                        }

                        ++i_36;
                    }
                }

                byte[] bytes_27 = new byte[6];

                byte b_29;
                for (b_29 = 0; b_29 < i_39; bytes_27[b_29] = b_29++)
                    ;

                for (i_35 = 0; i_35 < i_40; i_35++) {
                    b_29 = bzip2context_0.selectorMtf[i_35];

                    byte b_28;
                    for (b_28 = bytes_27[b_29]; b_29 > 0; --b_29)
                        bytes_27[b_29] = bytes_27[b_29 - 1];

                    bytes_27[0] = b_28;
                    bzip2context_0.selector[i_35] = b_28;
                }

                int i_37;
                for (i_37 = 0; i_37 < i_39; i_37++) {
                    int i_49 = staticMethod134(5, bzip2context_0);

                    for (i_35 = 0; i_35 < i_38; i_35++)
                        while (true) {
                            b_1 = staticMethod133(bzip2context_0);
                            if (b_1 == 0) {
                                bzip2context_0.len[i_37][i_35] = (byte) i_49;
                                break;
                            }

                            b_1 = staticMethod133(bzip2context_0);
                            if (b_1 == 0)
                                ++i_49;
                            else
                                --i_49;
                        }
                }

                for (i_37 = 0; i_37 < i_39; i_37++) {
                    byte b_2 = 32;
                    byte b_3 = 0;

                    for (i_35 = 0; i_35 < i_38; i_35++) {
                        if (bzip2context_0.len[i_37][i_35] > b_3)
                            b_3 = bzip2context_0.len[i_37][i_35];

                        if (bzip2context_0.len[i_37][i_35] < b_2)
                            b_2 = bzip2context_0.len[i_37][i_35];
                    }

                    staticMethod136(bzip2context_0.limit[i_37], bzip2context_0.base[i_37], bzip2context_0.perm[i_37], bzip2context_0.len[i_37], b_2, b_3, i_38);
                    bzip2context_0.minLens[i_37] = b_2;
                }

                int i_41 = bzip2context_0.int227 + 1;
                int i_42 = -1;
                byte b_43 = 0;

                for (i_35 = 0; i_35 <= 255; i_35++)
                    bzip2context_0.unzftab[i_35] = 0;

                int i_56 = 4095;

                int i_54;
                int i_55;
                for (i_54 = 15; i_54 >= 0; --i_54) {
                    for (i_55 = 15; i_55 >= 0; --i_55) {
                        bzip2context_0.mtfa[i_56] = (byte) (i_54 * 16 + i_55);
                        --i_56;
                    }

                    bzip2context_0.mtfbase[i_54] = i_56 + 1;
                }

                int i_46 = 0;
                byte b_53;
                if (b_43 == 0) {
                    ++i_42;
                    b_43 = 50;
                    b_53 = bzip2context_0.selector[i_42];
                    i_22 = bzip2context_0.minLens[b_53];
                    ints_23 = bzip2context_0.limit[b_53];
                    ints_25 = bzip2context_0.perm[b_53];
                    ints_24 = bzip2context_0.base[b_53];
                }

                int i_44 = b_43 - 1;
                int i_50 = i_22;

                int i_51;
                byte b_52;
                for (i_51 = staticMethod134(i_22, bzip2context_0); i_51 > ints_23[i_50]; i_51 = i_51 << 1 | b_52) {
                    ++i_50;
                    b_52 = staticMethod133(bzip2context_0);
                }

                int i_45 = ints_25[i_51 - ints_24[i_50]];

                while (true) {
                    while (i_45 != i_41)
                        if (i_45 != 0 && i_45 != 1) {
                            int i_33 = i_45 - 1;
                            int i_30;
                            if (i_33 < 16) {
                                i_30 = bzip2context_0.mtfbase[0];

                                for (b_1 = bzip2context_0.mtfa[i_30 + i_33]; i_33 > 3; i_33 -= 4) {
                                    int i_34 = i_30 + i_33;
                                    bzip2context_0.mtfa[i_34] = bzip2context_0.mtfa[i_34 - 1];
                                    bzip2context_0.mtfa[i_34 - 1] = bzip2context_0.mtfa[i_34 - 2];
                                    bzip2context_0.mtfa[i_34 - 2] = bzip2context_0.mtfa[i_34 - 3];
                                    bzip2context_0.mtfa[i_34 - 3] = bzip2context_0.mtfa[i_34 - 4];
                                }

                                while (i_33 > 0) {
                                    bzip2context_0.mtfa[i_30 + i_33] = bzip2context_0.mtfa[i_30 + i_33 - 1];
                                    --i_33;
                                }

                                bzip2context_0.mtfa[i_30] = b_1;
                            } else {
                                int i_31 = i_33 / 16;
                                int i_32 = i_33 % 16;
                                i_30 = bzip2context_0.mtfbase[i_31] + i_32;

                                for (b_1 = bzip2context_0.mtfa[i_30]; i_30 > bzip2context_0.mtfbase[i_31]; --i_30)
                                    bzip2context_0.mtfa[i_30] = bzip2context_0.mtfa[i_30 - 1];

                                ++bzip2context_0.mtfbase[i_31];

                                while (i_31 > 0) {
                                    --bzip2context_0.mtfbase[i_31];
                                    bzip2context_0.mtfa[bzip2context_0.mtfbase[i_31]] = bzip2context_0.mtfa[bzip2context_0.mtfbase[i_31 - 1] + 16 - 1];
                                    --i_31;
                                }

                                --bzip2context_0.mtfbase[0];
                                bzip2context_0.mtfa[bzip2context_0.mtfbase[0]] = b_1;
                                if (bzip2context_0.mtfbase[0] == 0) {
                                    i_56 = 4095;

                                    for (i_54 = 15; i_54 >= 0; --i_54) {
                                        for (i_55 = 15; i_55 >= 0; --i_55) {
                                            bzip2context_0.mtfa[i_56] = bzip2context_0.mtfa[bzip2context_0.mtfbase[i_54] + i_55];
                                            --i_56;
                                        }

                                        bzip2context_0.mtfbase[i_54] = i_56 + 1;
                                    }
                                }
                            }

                            ++bzip2context_0.unzftab[bzip2context_0.seqToUnseq[b_1 & 0xff] & 0xff];
                            TaskManager.staticIntArray57[i_46] = bzip2context_0.seqToUnseq[b_1 & 0xff] & 0xff;
                            ++i_46;
                            if (i_44 == 0) {
                                ++i_42;
                                i_44 = 50;
                                b_53 = bzip2context_0.selector[i_42];
                                i_22 = bzip2context_0.minLens[b_53];
                                ints_23 = bzip2context_0.limit[b_53];
                                ints_25 = bzip2context_0.perm[b_53];
                                ints_24 = bzip2context_0.base[b_53];
                            }

                            --i_44;
                            i_50 = i_22;

                            for (i_51 = staticMethod134(i_22, bzip2context_0); i_51 > ints_23[i_50]; i_51 = i_51 << 1 | b_52) {
                                ++i_50;
                                b_52 = staticMethod133(bzip2context_0);
                            }

                            i_45 = ints_25[i_51 - ints_24[i_50]];
                        } else {
                            int i_47 = -1;
                            int i_48 = 1;

                            do {
                                if (i_45 == 0)
                                    i_47 += i_48;
                                else if (i_45 == 1)
                                    i_47 += i_48 * 2;

                                i_48 *= 2;
                                if (i_44 == 0) {
                                    ++i_42;
                                    i_44 = 50;
                                    b_53 = bzip2context_0.selector[i_42];
                                    i_22 = bzip2context_0.minLens[b_53];
                                    ints_23 = bzip2context_0.limit[b_53];
                                    ints_25 = bzip2context_0.perm[b_53];
                                    ints_24 = bzip2context_0.base[b_53];
                                }

                                --i_44;
                                i_50 = i_22;

                                for (i_51 = staticMethod134(i_22, bzip2context_0); i_51 > ints_23[i_50]; i_51 = i_51 << 1 | b_52) {
                                    ++i_50;
                                    b_52 = staticMethod133(bzip2context_0);
                                }

                                i_45 = ints_25[i_51 - ints_24[i_50]];
                            } while (i_45 == 0 || i_45 == 1);

                            ++i_47;
                            b_1 = bzip2context_0.seqToUnseq[bzip2context_0.mtfa[bzip2context_0.mtfbase[0]] & 0xff];

                            for (bzip2context_0.unzftab[b_1 & 0xff] += i_47; i_47 > 0; --i_47) {
                                TaskManager.staticIntArray57[i_46] = b_1 & 0xff;
                                ++i_46;
                            }
                        }

                    bzip2context_0.int220 = 0;
                    bzip2context_0.byte2 = 0;
                    bzip2context_0.cftab[0] = 0;

                    for (i_35 = 1; i_35 <= 256; i_35++)
                        bzip2context_0.cftab[i_35] = bzip2context_0.unzftab[i_35 - 1];

                    for (i_35 = 1; i_35 <= 256; i_35++)
                        bzip2context_0.cftab[i_35] += bzip2context_0.cftab[i_35 - 1];

                    for (i_35 = 0; i_35 < i_46; i_35++) {
                        b_1 = (byte) (TaskManager.staticIntArray57[i_35] & 0xff);
                        TaskManager.staticIntArray57[bzip2context_0.cftab[b_1 & 0xff]] |= i_35 << 8;
                        ++bzip2context_0.cftab[b_1 & 0xff];
                    }

                    bzip2context_0.int226 = TaskManager.staticIntArray57[bzip2context_0.int223] >> 8;
                    bzip2context_0.int224 = 0;
                    bzip2context_0.int226 = TaskManager.staticIntArray57[bzip2context_0.int226];
                    bzip2context_0.int225 = (byte) (bzip2context_0.int226 & 0xff);
                    bzip2context_0.int226 >>= 8;
                    ++bzip2context_0.int224;
                    bzip2context_0.int229 = i_46;
                    staticMethod130(bzip2context_0);
                    if (bzip2context_0.int224 == bzip2context_0.int229 + 1 && bzip2context_0.int220 == 0) {
                        bool_26 = true;
                        break;
                    }

                    bool_26 = false;
                    break;
                }
            }

            return;
        }
    }

    static byte staticMethod132(BZip2Context bzip2context_0) {
        return (byte) staticMethod134(8, bzip2context_0);
    }

    static byte staticMethod133(BZip2Context bzip2context_0) {
        return (byte) staticMethod134(1, bzip2context_0);
    }

    static int staticMethod134(int i_0, BZip2Context bzip2context_1) {
        while (bzip2context_1.int212 < i_0) {
            bzip2context_1.int221 = bzip2context_1.int221 << 8 | bzip2context_1.byteArray2[bzip2context_1.next_in] & 0xff;
            bzip2context_1.int212 += 8;
            ++bzip2context_1.next_in;
            ++bzip2context_1.int228;
            if (bzip2context_1.int228 == 0)
                ;
        }

        int i_3 = bzip2context_1.int221 >> bzip2context_1.int212 - i_0 & (1 << i_0) - 1;
        bzip2context_1.int212 -= i_0;
        return i_3;
    }

    static void staticMethod135(BZip2Context bzip2context_0) {
        bzip2context_0.int227 = 0;

        for (int i_1 = 0; i_1 < 256; i_1++)
            if (bzip2context_0.inUse[i_1]) {
                bzip2context_0.seqToUnseq[bzip2context_0.int227] = (byte) i_1;
                ++bzip2context_0.int227;
            }

    }

    static void staticMethod136(int[] ints_0, int[] ints_1, int[] ints_2, byte[] bytes_3, int i_4, int i_5, int i_6) {
        int i_7 = 0;

        int i_8;
        for (i_8 = i_4; i_8 <= i_5; i_8++)
            for (int i_9 = 0; i_9 < i_6; i_9++)
                if (bytes_3[i_9] == i_8) {
                    ints_2[i_7] = i_9;
                    ++i_7;
                }

        for (i_8 = 0; i_8 < 23; i_8++)
            ints_1[i_8] = 0;

        for (i_8 = 0; i_8 < i_6; i_8++)
            ++ints_1[bytes_3[i_8] + 1];

        for (i_8 = 1; i_8 < 23; i_8++)
            ints_1[i_8] += ints_1[i_8 - 1];

        for (i_8 = 0; i_8 < 23; i_8++)
            ints_0[i_8] = 0;

        int i_10 = 0;

        for (i_8 = i_4; i_8 <= i_5; i_8++) {
            i_10 += ints_1[i_8 + 1] - ints_1[i_8];
            ints_0[i_8] = i_10 - 1;
            i_10 <<= 1;
        }

        for (i_8 = i_4 + 1; i_8 <= i_5; i_8++)
            ints_1[i_8] = (ints_0[i_8 - 1] + 1 << 1) - ints_1[i_8];

    }

}

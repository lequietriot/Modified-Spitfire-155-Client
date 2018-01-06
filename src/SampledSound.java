public class SampledSound extends Sequence {

    int int501;
    int int502;
    boolean bool50;
    int int493;
    int int495;
    int int496;
    int int498;
    int int497;
    int int506;
    int int499;
    int int500;
    int int504;
    int int505;
    int int494;
    int int503;

    static int staticMethod389(int i_0, int i_1) {
        return i_1 < 0 ? i_0 : (int) (i_0 * Math.sqrt((16384 - i_1) * 1.220703125E-4D) + 0.5D);
    }

    static int staticMethod390(int i_0, int i_1) {
        return i_1 < 0 ? -i_0 : (int) (i_0 * Math.sqrt(i_1 * 1.220703125E-4D) + 0.5D);
    }

    @Override
    int method421() {
        int i_1 = int497 * 3 >> 6;
        i_1 = (i_1 ^ i_1 >> 31) + (i_1 >>> 31);
        if (int500 == 0)
            i_1 -= i_1 * int498 / (((MusicNote) mus10_1).byteArray11.length << 8);
        else if (int500 >= 0)
            i_1 -= i_1 * int501 / ((MusicNote) mus10_1).byteArray11.length;

        return i_1 > 255 ? 255 : i_1;
    }

    SampledSound(MusicNote musicnote_1, int i_2, int i_3) {
        mus10_1 = musicnote_1;
        int501 = musicnote_1.int492;
        int502 = musicnote_1.int490;
        bool50 = musicnote_1.bool49;
        int493 = i_2;
        int495 = i_3;
        int496 = 8192;
        int498 = 0;
        method522();
    }

    SampledSound(MusicNote musicnote_1, int i_2, int i_3, int i_4) {
        mus10_1 = musicnote_1;
        int501 = musicnote_1.int492;
        int502 = musicnote_1.int490;
        bool50 = musicnote_1.bool49;
        int493 = i_2;
        int495 = i_3;
        int496 = i_4;
        int498 = 0;
        method522();
    }

    public static SampledSound staticMethod391(MusicNote musicnote_0, int i_1, int i_2) {
        return musicnote_0.byteArray11 != null && musicnote_0.byteArray11.length != 0 ? new SampledSound(musicnote_0, (int) (musicnote_0.int491 * 256L * i_1 / (WorldMapTile.staticInt7 * 100)), i_2 << 6) : null;
    }

    public static SampledSound staticMethod392(MusicNote musicnote_0, int i_1, int i_2, int i_3) {
        return musicnote_0.byteArray11 != null && musicnote_0.byteArray11.length != 0 ? new SampledSound(musicnote_0, i_1, i_2, i_3) : null;
    }

    void method522() {
        int497 = int495;
        int506 = staticMethod389(int495, int496);
        int499 = staticMethod390(int495, int496);
    }

    public synchronized void synchronizedMethod10(int i_1) {
        int500 = i_1;
    }

    public synchronized void synchronizedMethod11(int i_1) {
        synchronizedMethod13(i_1 << 6, synchronizedMethod15());
    }

    synchronized void synchronizedMethod12(int i_1) {
        synchronizedMethod13(i_1, synchronizedMethod15());
    }

    synchronized void synchronizedMethod13(int i_1, int i_2) {
        int495 = i_1;
        int496 = i_2;
        int504 = 0;
        method522();
    }

    public synchronized int synchronizedMethod14() {
        return int495 == Integer.MIN_VALUE ? 0 : int495;
    }

    public synchronized int synchronizedMethod15() {
        return int496 < 0 ? -1 : int496;
    }

    public synchronized void synchronizedMethod16(int i_1) {
        int i_2 = ((MusicNote) mus10_1).byteArray11.length << 8;
        if (i_1 < -1)
            i_1 = -1;

        if (i_1 > i_2)
            i_1 = i_2;

        int498 = i_1;
    }

    public synchronized void synchronizedMethod17(boolean bool_1) {
        int493 = (int493 ^ int493 >> 31) + (int493 >>> 31);
        if (bool_1)
            int493 = -int493;

    }

    void method523() {
        if (int504 != 0) {
            if (int495 == Integer.MIN_VALUE)
                int495 = 0;

            int504 = 0;
            method522();
        }

    }

    public synchronized void synchronizedMethod18(int i_1, int i_2) {
        synchronizedMethod19(i_1, i_2, synchronizedMethod15());
    }

    public synchronized void synchronizedMethod19(int i_1, int i_2, int i_3) {
        if (i_1 == 0)
            synchronizedMethod13(i_2, i_3);
        else {
            int i_4 = staticMethod389(i_2, i_3);
            int i_5 = staticMethod390(i_2, i_3);
            if (int506 == i_4 && int499 == i_5)
                int504 = 0;
            else {
                int i_6 = i_2 - int497;
                if (int497 - i_2 > i_6)
                    i_6 = int497 - i_2;

                if (i_4 - int506 > i_6)
                    i_6 = i_4 - int506;

                if (int506 - i_4 > i_6)
                    i_6 = int506 - i_4;

                if (i_5 - int499 > i_6)
                    i_6 = i_5 - int499;

                if (int499 - i_5 > i_6)
                    i_6 = int499 - i_5;

                if (i_1 > i_6)
                    i_1 = i_6;

                int504 = i_1;
                int495 = i_2;
                int496 = i_3;
                int505 = (i_2 - int497) / i_1;
                int494 = (i_4 - int506) / i_1;
                int503 = (i_5 - int499) / i_1;
            }
        }
    }

    public synchronized void synchronizedMethod20(int i_1) {
        if (i_1 == 0) {
            synchronizedMethod12(0);
            unlink();
        } else if (int506 == 0 && int499 == 0) {
            int504 = 0;
            int495 = 0;
            int497 = 0;
            unlink();
        } else {
            int i_2 = -int497;
            if (int497 > i_2)
                i_2 = int497;

            if (-int506 > i_2)
                i_2 = -int506;

            if (int506 > i_2)
                i_2 = int506;

            if (-int499 > i_2)
                i_2 = -int499;

            if (int499 > i_2)
                i_2 = int499;

            if (i_1 > i_2)
                i_1 = i_2;

            int504 = i_1;
            int495 = Integer.MIN_VALUE;
            int505 = -int497 / i_1;
            int494 = -int506 / i_1;
            int503 = -int499 / i_1;
        }
    }

    public synchronized void synchronizedMethod21(int i_1) {
        if (int493 < 0)
            int493 = -i_1;
        else
            int493 = i_1;

    }

    public synchronized int synchronizedMethod22() {
        return int493 < 0 ? -int493 : int493;
    }

    public boolean method524() {
        return int498 < 0 || int498 >= ((MusicNote) mus10_1).byteArray11.length << 8;
    }

    public boolean method525() {
        return int504 != 0;
    }

    @Override
    protected Sequence method418() {
        return null;
    }

    @Override
    protected Sequence method416() {
        return null;
    }

    @Override
    protected int method417() {
        return int495 == 0 && int504 == 0 ? 0 : 1;
    }

    @Override
    public synchronized void method420(int[] ints_1, int i_2, int i_3) {
        if (int495 == 0 && int504 == 0)
            method419(i_3);
        else {
            MusicNote musicnote_4 = (MusicNote) mus10_1;
            int i_5 = int501 << 8;
            int i_6 = int502 << 8;
            int i_7 = musicnote_4.byteArray11.length << 8;
            int i_8 = i_6 - i_5;
            if (i_8 <= 0)
                int500 = 0;

            int i_9 = i_2;
            i_3 += i_2;
            if (int498 < 0) {
                if (int493 <= 0) {
                    method523();
                    unlink();
                    return;
                }

                int498 = 0;
            }

            if (int498 >= i_7) {
                if (int493 >= 0) {
                    method523();
                    unlink();
                    return;
                }

                int498 = i_7 - 1;
            }

            if (int500 < 0) {
                if (bool50) {
                    if (int493 < 0) {
                        i_9 = method527(ints_1, i_2, i_5, i_3, musicnote_4.byteArray11[int501]);
                        if (int498 >= i_5)
                            return;

                        int498 = i_5 + i_5 - 1 - int498;
                        int493 = -int493;
                    }

                    while (true) {
                        i_9 = method526(ints_1, i_9, i_6, i_3, musicnote_4.byteArray11[int502 - 1]);
                        if (int498 < i_6)
                            return;

                        int498 = i_6 + i_6 - 1 - int498;
                        int493 = -int493;
                        i_9 = method527(ints_1, i_9, i_5, i_3, musicnote_4.byteArray11[int501]);
                        if (int498 >= i_5)
                            return;

                        int498 = i_5 + i_5 - 1 - int498;
                        int493 = -int493;
                    }
                } else if (int493 < 0)
                    while (true) {
                        i_9 = method527(ints_1, i_9, i_5, i_3, musicnote_4.byteArray11[int502 - 1]);
                        if (int498 >= i_5)
                            return;

                        int498 = i_6 - 1 - (i_6 - 1 - int498) % i_8;
                    }
                else
                    while (true) {
                        i_9 = method526(ints_1, i_9, i_6, i_3, musicnote_4.byteArray11[int501]);
                        if (int498 < i_6)
                            return;

                        int498 = i_5 + (int498 - i_5) % i_8;
                    }
            } else {
                if (int500 > 0)
                    if (bool50)
                        label130: {
                            if (int493 < 0) {
                                i_9 = method527(ints_1, i_2, i_5, i_3, musicnote_4.byteArray11[int501]);
                                if (int498 >= i_5)
                                    return;

                                int498 = i_5 + i_5 - 1 - int498;
                                int493 = -int493;
                                if (--int500 == 0)
                                    break label130;
                            }

                            do {
                                i_9 = method526(ints_1, i_9, i_6, i_3, musicnote_4.byteArray11[int502 - 1]);
                                if (int498 < i_6)
                                    return;

                                int498 = i_6 + i_6 - 1 - int498;
                                int493 = -int493;
                                if (--int500 == 0)
                                    break;

                                i_9 = method527(ints_1, i_9, i_5, i_3, musicnote_4.byteArray11[int501]);
                                if (int498 >= i_5)
                                    return;

                                int498 = i_5 + i_5 - 1 - int498;
                                int493 = -int493;
                            } while (--int500 != 0);
                        }
                    else {
                        int i_10;
                        if (int493 < 0)
                            while (true) {
                                i_9 = method527(ints_1, i_9, i_5, i_3, musicnote_4.byteArray11[int502 - 1]);
                                if (int498 >= i_5)
                                    return;

                                i_10 = (i_6 - 1 - int498) / i_8;
                                if (i_10 >= int500) {
                                    int498 += i_8 * int500;
                                    int500 = 0;
                                    break;
                                }

                                int498 += i_8 * i_10;
                                int500 -= i_10;
                            }
                        else
                            while (true) {
                                i_9 = method526(ints_1, i_9, i_6, i_3, musicnote_4.byteArray11[int501]);
                                if (int498 < i_6)
                                    return;

                                i_10 = (int498 - i_5) / i_8;
                                if (i_10 >= int500) {
                                    int498 -= i_8 * int500;
                                    int500 = 0;
                                    break;
                                }

                                int498 -= i_8 * i_10;
                                int500 -= i_10;
                            }
                    }

                if (int493 < 0) {
                    method527(ints_1, i_9, 0, i_3, 0);
                    if (int498 < 0) {
                        int498 = -1;
                        method523();
                        unlink();
                    }
                } else {
                    method526(ints_1, i_9, i_7, i_3, 0);
                    if (int498 >= i_7) {
                        int498 = i_7;
                        method523();
                        unlink();
                    }
                }

            }
        }
    }

    @Override
    public synchronized void method419(int i_1) {
        if (int504 > 0)
            if (i_1 >= int504) {
                if (int495 == Integer.MIN_VALUE) {
                    int495 = 0;
                    int499 = 0;
                    int506 = 0;
                    int497 = 0;
                    unlink();
                    i_1 = int504;
                }

                int504 = 0;
                method522();
            } else {
                int497 += int505 * i_1;
                int506 += int494 * i_1;
                int499 += int503 * i_1;
                int504 -= i_1;
            }

        MusicNote musicnote_2 = (MusicNote) mus10_1;
        int i_3 = int501 << 8;
        int i_4 = int502 << 8;
        int i_5 = musicnote_2.byteArray11.length << 8;
        int i_6 = i_4 - i_3;
        if (i_6 <= 0)
            int500 = 0;

        if (int498 < 0) {
            if (int493 <= 0) {
                method523();
                unlink();
                return;
            }

            int498 = 0;
        }

        if (int498 >= i_5) {
            if (int493 >= 0) {
                method523();
                unlink();
                return;
            }

            int498 = i_5 - 1;
        }

        int498 += int493 * i_1;
        if (int500 < 0) {
            if (!bool50) {
                if (int493 < 0) {
                    if (int498 >= i_3)
                        return;

                    int498 = i_4 - 1 - (i_4 - 1 - int498) % i_6;
                } else {
                    if (int498 < i_4)
                        return;

                    int498 = i_3 + (int498 - i_3) % i_6;
                }

            } else {
                if (int493 < 0) {
                    if (int498 >= i_3)
                        return;

                    int498 = i_3 + i_3 - 1 - int498;
                    int493 = -int493;
                }

                while (int498 >= i_4) {
                    int498 = i_4 + i_4 - 1 - int498;
                    int493 = -int493;
                    if (int498 >= i_3)
                        return;

                    int498 = i_3 + i_3 - 1 - int498;
                    int493 = -int493;
                }

            }
        } else {
            if (int500 > 0)
                if (bool50)
                    label123: {
                        if (int493 < 0) {
                            if (int498 >= i_3)
                                return;

                            int498 = i_3 + i_3 - 1 - int498;
                            int493 = -int493;
                            if (--int500 == 0)
                                break label123;
                        }

                        do {
                            if (int498 < i_4)
                                return;

                            int498 = i_4 + i_4 - 1 - int498;
                            int493 = -int493;
                            if (--int500 == 0)
                                break;

                            if (int498 >= i_3)
                                return;

                            int498 = i_3 + i_3 - 1 - int498;
                            int493 = -int493;
                        } while (--int500 != 0);
                    }
                else
                    label155: {
                        int i_7;
                        if (int493 < 0) {
                            if (int498 >= i_3)
                                return;

                            i_7 = (i_4 - 1 - int498) / i_6;
                            if (i_7 >= int500) {
                                int498 += i_6 * int500;
                                int500 = 0;
                                break label155;
                            }

                            int498 += i_6 * i_7;
                            int500 -= i_7;
                        } else {
                            if (int498 < i_4)
                                return;

                            i_7 = (int498 - i_3) / i_6;
                            if (i_7 >= int500) {
                                int498 -= i_6 * int500;
                                int500 = 0;
                                break label155;
                            }

                            int498 -= i_6 * i_7;
                            int500 -= i_7;
                        }

                        return;
                    }

            if (int493 < 0) {
                if (int498 < 0) {
                    int498 = -1;
                    method523();
                    unlink();
                }
            } else if (int498 >= i_5) {
                int498 = i_5;
                method523();
                unlink();
            }

        }
    }

    int method526(int[] ints_1, int i_2, int i_3, int i_4, int i_5) {
        while (true) {
            if (int504 > 0) {
                int i_6 = i_2 + int504;
                if (i_6 > i_4)
                    i_6 = i_4;

                int504 += i_2;
                if (int493 == 256 && (int498 & 0xff) == 0) {
                    if (WorldMapLabel.staticBool1)
                        i_2 = staticMethod402(0, ((MusicNote) mus10_1).byteArray11, ints_1, int498, i_2, int506, int499, int494, int503, 0, i_6, i_3, this);
                    else
                        i_2 = staticMethod401(((MusicNote) mus10_1).byteArray11, ints_1, int498, i_2, int497, int505, 0, i_6, i_3, this);
                } else if (WorldMapLabel.staticBool1)
                    i_2 = staticMethod406(0, 0, ((MusicNote) mus10_1).byteArray11, ints_1, int498, i_2, int506, int499, int494, int503, 0, i_6, i_3, this, int493, i_5);
                else
                    i_2 = staticMethod405(0, 0, ((MusicNote) mus10_1).byteArray11, ints_1, int498, i_2, int497, int505, 0, i_6, i_3, this, int493, i_5);

                int504 -= i_2;
                if (int504 != 0)
                    return i_2;

                if (!method528())
                    continue;

                return i_4;
            }

            if (int493 == 256 && (int498 & 0xff) == 0) {
                if (WorldMapLabel.staticBool1)
                    return staticMethod394(0, ((MusicNote) mus10_1).byteArray11, ints_1, int498, i_2, int506, int499, 0, i_4, i_3, this);

                return staticMethod393(((MusicNote) mus10_1).byteArray11, ints_1, int498, i_2, int497, 0, i_4, i_3, this);
            }

            if (WorldMapLabel.staticBool1)
                return staticMethod398(0, 0, ((MusicNote) mus10_1).byteArray11, ints_1, int498, i_2, int506, int499, 0, i_4, i_3, this, int493, i_5);

            return staticMethod397(0, 0, ((MusicNote) mus10_1).byteArray11, ints_1, int498, i_2, int497, 0, i_4, i_3, this, int493, i_5);
        }
    }

    int method527(int[] ints_1, int i_2, int i_3, int i_4, int i_5) {
        while (true) {
            if (int504 > 0) {
                int i_6 = i_2 + int504;
                if (i_6 > i_4)
                    i_6 = i_4;

                int504 += i_2;
                if (int493 == -256 && (int498 & 0xff) == 0) {
                    if (WorldMapLabel.staticBool1)
                        i_2 = staticMethod404(0, ((MusicNote) mus10_1).byteArray11, ints_1, int498, i_2, int506, int499, int494, int503, 0, i_6, i_3, this);
                    else
                        i_2 = staticMethod403(((MusicNote) mus10_1).byteArray11, ints_1, int498, i_2, int497, int505, 0, i_6, i_3, this);
                } else if (WorldMapLabel.staticBool1)
                    i_2 = staticMethod408(0, 0, ((MusicNote) mus10_1).byteArray11, ints_1, int498, i_2, int506, int499, int494, int503, 0, i_6, i_3, this, int493, i_5);
                else
                    i_2 = staticMethod407(0, 0, ((MusicNote) mus10_1).byteArray11, ints_1, int498, i_2, int497, int505, 0, i_6, i_3, this, int493, i_5);

                int504 -= i_2;
                if (int504 != 0)
                    return i_2;

                if (!method528())
                    continue;

                return i_4;
            }

            if (int493 == -256 && (int498 & 0xff) == 0) {
                if (WorldMapLabel.staticBool1)
                    return staticMethod396(0, ((MusicNote) mus10_1).byteArray11, ints_1, int498, i_2, int506, int499, 0, i_4, i_3, this);

                return staticMethod395(((MusicNote) mus10_1).byteArray11, ints_1, int498, i_2, int497, 0, i_4, i_3, this);
            }

            if (WorldMapLabel.staticBool1)
                return staticMethod400(0, 0, ((MusicNote) mus10_1).byteArray11, ints_1, int498, i_2, int506, int499, 0, i_4, i_3, this, int493, i_5);

            return staticMethod399(0, 0, ((MusicNote) mus10_1).byteArray11, ints_1, int498, i_2, int497, 0, i_4, i_3, this, int493, i_5);
        }
    }

    boolean method528() {
        int i_1 = int495;
        int i_2;
        int i_3;
        if (i_1 == Integer.MIN_VALUE) {
            i_3 = 0;
            i_2 = 0;
            i_1 = 0;
        } else {
            i_2 = staticMethod389(i_1, int496);
            i_3 = staticMethod390(i_1, int496);
        }

        if (int497 == i_1 && int506 == i_2 && int499 == i_3) {
            if (int495 == Integer.MIN_VALUE) {
                int495 = 0;
                int499 = 0;
                int506 = 0;
                int497 = 0;
                unlink();
                return true;
            } else {
                method522();
                return false;
            }
        } else {
            if (int497 < i_1) {
                int505 = 1;
                int504 = i_1 - int497;
            } else if (int497 > i_1) {
                int505 = -1;
                int504 = int497 - i_1;
            } else
                int505 = 0;

            if (int506 < i_2) {
                int494 = 1;
                if (int504 == 0 || int504 > i_2 - int506)
                    int504 = i_2 - int506;
            } else if (int506 > i_2) {
                int494 = -1;
                if (int504 == 0 || int504 > int506 - i_2)
                    int504 = int506 - i_2;
            } else
                int494 = 0;

            if (int499 < i_3) {
                int503 = 1;
                if (int504 == 0 || int504 > i_3 - int499)
                    int504 = i_3 - int499;
            } else if (int499 > i_3) {
                int503 = -1;
                if (int504 == 0 || int504 > int499 - i_3)
                    int504 = int499 - i_3;
            } else
                int503 = 0;

            return false;
        }
    }

    static int staticMethod393(byte[] bytes_0, int[] ints_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, SampledSound sampledsound_8) {
        i_2 >>= 8;
        i_7 >>= 8;
        i_4 <<= 2;
        if ((i_5 = i_3 + i_7 - i_2) > i_6)
            i_5 = i_6;

        int i_10001;
        for (i_5 -= 3; i_3 < i_5; ints_1[i_10001] += bytes_0[i_2++] * i_4) {
            i_10001 = i_3++;
            ints_1[i_10001] += bytes_0[i_2++] * i_4;
            i_10001 = i_3++;
            ints_1[i_10001] += bytes_0[i_2++] * i_4;
            i_10001 = i_3++;
            ints_1[i_10001] += bytes_0[i_2++] * i_4;
            i_10001 = i_3++;
        }

        for (i_5 += 3; i_3 < i_5; ints_1[i_10001] += bytes_0[i_2++] * i_4)
            i_10001 = i_3++;

        sampledsound_8.int498 = i_2 << 8;
        return i_3;
    }

    static int staticMethod394(int i_0, byte[] bytes_1, int[] ints_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, SampledSound sampledsound_10) {
        i_3 >>= 8;
        i_9 >>= 8;
        i_5 <<= 2;
        i_6 <<= 2;
        if ((i_7 = i_4 + i_9 - i_3) > i_8)
            i_7 = i_8;

        i_4 <<= 1;
        i_7 <<= 1;

        int i_10001;
        byte b_11;
        for (i_7 -= 6; i_4 < i_7; ints_2[i_10001] += b_11 * i_6) {
            b_11 = bytes_1[i_3++];
            i_10001 = i_4++;
            ints_2[i_10001] += b_11 * i_5;
            i_10001 = i_4++;
            ints_2[i_10001] += b_11 * i_6;
            b_11 = bytes_1[i_3++];
            i_10001 = i_4++;
            ints_2[i_10001] += b_11 * i_5;
            i_10001 = i_4++;
            ints_2[i_10001] += b_11 * i_6;
            b_11 = bytes_1[i_3++];
            i_10001 = i_4++;
            ints_2[i_10001] += b_11 * i_5;
            i_10001 = i_4++;
            ints_2[i_10001] += b_11 * i_6;
            b_11 = bytes_1[i_3++];
            i_10001 = i_4++;
            ints_2[i_10001] += b_11 * i_5;
            i_10001 = i_4++;
        }

        for (i_7 += 6; i_4 < i_7; ints_2[i_10001] += b_11 * i_6) {
            b_11 = bytes_1[i_3++];
            i_10001 = i_4++;
            ints_2[i_10001] += b_11 * i_5;
            i_10001 = i_4++;
        }

        sampledsound_10.int498 = i_3 << 8;
        return i_4 >> 1;
    }

    static int staticMethod395(byte[] bytes_0, int[] ints_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, SampledSound sampledsound_8) {
        i_2 >>= 8;
        i_7 >>= 8;
        i_4 <<= 2;
        if ((i_5 = i_3 + i_2 - (i_7 - 1)) > i_6)
            i_5 = i_6;

        int i_10001;
        for (i_5 -= 3; i_3 < i_5; ints_1[i_10001] += bytes_0[i_2--] * i_4) {
            i_10001 = i_3++;
            ints_1[i_10001] += bytes_0[i_2--] * i_4;
            i_10001 = i_3++;
            ints_1[i_10001] += bytes_0[i_2--] * i_4;
            i_10001 = i_3++;
            ints_1[i_10001] += bytes_0[i_2--] * i_4;
            i_10001 = i_3++;
        }

        for (i_5 += 3; i_3 < i_5; ints_1[i_10001] += bytes_0[i_2--] * i_4)
            i_10001 = i_3++;

        sampledsound_8.int498 = i_2 << 8;
        return i_3;
    }

    static int staticMethod396(int i_0, byte[] bytes_1, int[] ints_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, SampledSound sampledsound_10) {
        i_3 >>= 8;
        i_9 >>= 8;
        i_5 <<= 2;
        i_6 <<= 2;
        if ((i_7 = i_4 + i_3 - (i_9 - 1)) > i_8)
            i_7 = i_8;

        i_4 <<= 1;
        i_7 <<= 1;

        int i_10001;
        byte b_11;
        for (i_7 -= 6; i_4 < i_7; ints_2[i_10001] += b_11 * i_6) {
            b_11 = bytes_1[i_3--];
            i_10001 = i_4++;
            ints_2[i_10001] += b_11 * i_5;
            i_10001 = i_4++;
            ints_2[i_10001] += b_11 * i_6;
            b_11 = bytes_1[i_3--];
            i_10001 = i_4++;
            ints_2[i_10001] += b_11 * i_5;
            i_10001 = i_4++;
            ints_2[i_10001] += b_11 * i_6;
            b_11 = bytes_1[i_3--];
            i_10001 = i_4++;
            ints_2[i_10001] += b_11 * i_5;
            i_10001 = i_4++;
            ints_2[i_10001] += b_11 * i_6;
            b_11 = bytes_1[i_3--];
            i_10001 = i_4++;
            ints_2[i_10001] += b_11 * i_5;
            i_10001 = i_4++;
        }

        for (i_7 += 6; i_4 < i_7; ints_2[i_10001] += b_11 * i_6) {
            b_11 = bytes_1[i_3--];
            i_10001 = i_4++;
            ints_2[i_10001] += b_11 * i_5;
            i_10001 = i_4++;
        }

        sampledsound_10.int498 = i_3 << 8;
        return i_4 >> 1;
    }

    static int staticMethod397(int i_0, int i_1, byte[] bytes_2, int[] ints_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, SampledSound sampledsound_10, int i_11, int i_12) {
        if (i_11 == 0 || (i_7 = i_5 + (i_9 - i_4 + i_11 - 257) / i_11) > i_8)
            i_7 = i_8;

        byte b_13;
        int i_10001;
        while (i_5 < i_7) {
            i_1 = i_4 >> 8;
            b_13 = bytes_2[i_1];
            i_10001 = i_5++;
            ints_3[i_10001] += ((b_13 << 8) + (bytes_2[i_1 + 1] - b_13) * (i_4 & 0xff)) * i_6 >> 6;
            i_4 += i_11;
        }

        if (i_11 == 0 || (i_7 = i_5 + (i_9 - i_4 + i_11 - 1) / i_11) > i_8)
            i_7 = i_8;

        for (i_1 = i_12; i_5 < i_7; i_4 += i_11) {
            b_13 = bytes_2[i_4 >> 8];
            i_10001 = i_5++;
            ints_3[i_10001] += ((b_13 << 8) + (i_1 - b_13) * (i_4 & 0xff)) * i_6 >> 6;
        }

        sampledsound_10.int498 = i_4;
        return i_5;
    }

    static int staticMethod398(int i_0, int i_1, byte[] bytes_2, int[] ints_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, SampledSound sampledsound_11, int i_12, int i_13) {
        if (i_12 == 0 || (i_8 = i_5 + (i_10 - i_4 + i_12 - 257) / i_12) > i_9)
            i_8 = i_9;

        i_5 <<= 1;

        byte b_14;
        int i_10001;
        for (i_8 <<= 1; i_5 < i_8; i_4 += i_12) {
            i_1 = i_4 >> 8;
            b_14 = bytes_2[i_1];
            i_0 = (b_14 << 8) + (bytes_2[i_1 + 1] - b_14) * (i_4 & 0xff);
            i_10001 = i_5++;
            ints_3[i_10001] += i_0 * i_6 >> 6;
            i_10001 = i_5++;
            ints_3[i_10001] += i_0 * i_7 >> 6;
        }

        if (i_12 == 0 || (i_8 = (i_5 >> 1) + (i_10 - i_4 + i_12 - 1) / i_12) > i_9)
            i_8 = i_9;

        i_8 <<= 1;

        for (i_1 = i_13; i_5 < i_8; i_4 += i_12) {
            b_14 = bytes_2[i_4 >> 8];
            i_0 = (b_14 << 8) + (i_1 - b_14) * (i_4 & 0xff);
            i_10001 = i_5++;
            ints_3[i_10001] += i_0 * i_6 >> 6;
            i_10001 = i_5++;
            ints_3[i_10001] += i_0 * i_7 >> 6;
        }

        sampledsound_11.int498 = i_4;
        return i_5 >> 1;
    }

    static int staticMethod399(int i_0, int i_1, byte[] bytes_2, int[] ints_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, SampledSound sampledsound_10, int i_11, int i_12) {
        if (i_11 == 0 || (i_7 = i_5 + (i_9 + 256 - i_4 + i_11) / i_11) > i_8)
            i_7 = i_8;

        int i_10001;
        while (i_5 < i_7) {
            i_1 = i_4 >> 8;
            byte b_13 = bytes_2[i_1 - 1];
            i_10001 = i_5++;
            ints_3[i_10001] += ((b_13 << 8) + (bytes_2[i_1] - b_13) * (i_4 & 0xff)) * i_6 >> 6;
            i_4 += i_11;
        }

        if (i_11 == 0 || (i_7 = i_5 + (i_9 - i_4 + i_11) / i_11) > i_8)
            i_7 = i_8;

        i_0 = i_12;

        for (i_1 = i_11; i_5 < i_7; i_4 += i_1) {
            i_10001 = i_5++;
            ints_3[i_10001] += ((i_0 << 8) + (bytes_2[i_4 >> 8] - i_0) * (i_4 & 0xff)) * i_6 >> 6;
        }

        sampledsound_10.int498 = i_4;
        return i_5;
    }

    static int staticMethod400(int i_0, int i_1, byte[] bytes_2, int[] ints_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, SampledSound sampledsound_11, int i_12, int i_13) {
        if (i_12 == 0 || (i_8 = i_5 + (i_10 + 256 - i_4 + i_12) / i_12) > i_9)
            i_8 = i_9;

        i_5 <<= 1;

        int i_10001;
        for (i_8 <<= 1; i_5 < i_8; i_4 += i_12) {
            i_1 = i_4 >> 8;
            byte b_14 = bytes_2[i_1 - 1];
            i_0 = (b_14 << 8) + (bytes_2[i_1] - b_14) * (i_4 & 0xff);
            i_10001 = i_5++;
            ints_3[i_10001] += i_0 * i_6 >> 6;
            i_10001 = i_5++;
            ints_3[i_10001] += i_0 * i_7 >> 6;
        }

        if (i_12 == 0 || (i_8 = (i_5 >> 1) + (i_10 - i_4 + i_12) / i_12) > i_9)
            i_8 = i_9;

        i_8 <<= 1;

        for (i_1 = i_13; i_5 < i_8; i_4 += i_12) {
            i_0 = (i_1 << 8) + (bytes_2[i_4 >> 8] - i_1) * (i_4 & 0xff);
            i_10001 = i_5++;
            ints_3[i_10001] += i_0 * i_6 >> 6;
            i_10001 = i_5++;
            ints_3[i_10001] += i_0 * i_7 >> 6;
        }

        sampledsound_11.int498 = i_4;
        return i_5 >> 1;
    }

    static int staticMethod401(byte[] bytes_0, int[] ints_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, SampledSound sampledsound_9) {
        i_2 >>= 8;
        i_8 >>= 8;
        i_4 <<= 2;
        i_5 <<= 2;
        if ((i_6 = i_3 + i_8 - i_2) > i_7)
            i_6 = i_7;

        sampledsound_9.int506 += sampledsound_9.int494 * (i_6 - i_3);
        sampledsound_9.int499 += sampledsound_9.int503 * (i_6 - i_3);

        int i_10001;
        for (i_6 -= 3; i_3 < i_6; i_4 += i_5) {
            i_10001 = i_3++;
            ints_1[i_10001] += bytes_0[i_2++] * i_4;
            i_4 += i_5;
            i_10001 = i_3++;
            ints_1[i_10001] += bytes_0[i_2++] * i_4;
            i_4 += i_5;
            i_10001 = i_3++;
            ints_1[i_10001] += bytes_0[i_2++] * i_4;
            i_4 += i_5;
            i_10001 = i_3++;
            ints_1[i_10001] += bytes_0[i_2++] * i_4;
        }

        for (i_6 += 3; i_3 < i_6; i_4 += i_5) {
            i_10001 = i_3++;
            ints_1[i_10001] += bytes_0[i_2++] * i_4;
        }

        sampledsound_9.int497 = i_4 >> 2;
        sampledsound_9.int498 = i_2 << 8;
        return i_3;
    }

    static int staticMethod402(int i_0, byte[] bytes_1, int[] ints_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, SampledSound sampledsound_12) {
        i_3 >>= 8;
        i_11 >>= 8;
        i_5 <<= 2;
        i_6 <<= 2;
        i_7 <<= 2;
        i_8 <<= 2;
        if ((i_9 = i_4 + i_11 - i_3) > i_10)
            i_9 = i_10;

        sampledsound_12.int497 += sampledsound_12.int505 * (i_9 - i_4);
        i_4 <<= 1;
        i_9 <<= 1;

        byte b_13;
        int i_10001;
        for (i_9 -= 6; i_4 < i_9; i_6 += i_8) {
            b_13 = bytes_1[i_3++];
            i_10001 = i_4++;
            ints_2[i_10001] += b_13 * i_5;
            i_5 += i_7;
            i_10001 = i_4++;
            ints_2[i_10001] += b_13 * i_6;
            i_6 += i_8;
            b_13 = bytes_1[i_3++];
            i_10001 = i_4++;
            ints_2[i_10001] += b_13 * i_5;
            i_5 += i_7;
            i_10001 = i_4++;
            ints_2[i_10001] += b_13 * i_6;
            i_6 += i_8;
            b_13 = bytes_1[i_3++];
            i_10001 = i_4++;
            ints_2[i_10001] += b_13 * i_5;
            i_5 += i_7;
            i_10001 = i_4++;
            ints_2[i_10001] += b_13 * i_6;
            i_6 += i_8;
            b_13 = bytes_1[i_3++];
            i_10001 = i_4++;
            ints_2[i_10001] += b_13 * i_5;
            i_5 += i_7;
            i_10001 = i_4++;
            ints_2[i_10001] += b_13 * i_6;
        }

        for (i_9 += 6; i_4 < i_9; i_6 += i_8) {
            b_13 = bytes_1[i_3++];
            i_10001 = i_4++;
            ints_2[i_10001] += b_13 * i_5;
            i_5 += i_7;
            i_10001 = i_4++;
            ints_2[i_10001] += b_13 * i_6;
        }

        sampledsound_12.int506 = i_5 >> 2;
        sampledsound_12.int499 = i_6 >> 2;
        sampledsound_12.int498 = i_3 << 8;
        return i_4 >> 1;
    }

    static int staticMethod403(byte[] bytes_0, int[] ints_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, SampledSound sampledsound_9) {
        i_2 >>= 8;
        i_8 >>= 8;
        i_4 <<= 2;
        i_5 <<= 2;
        if ((i_6 = i_3 + i_2 - (i_8 - 1)) > i_7)
            i_6 = i_7;

        sampledsound_9.int506 += sampledsound_9.int494 * (i_6 - i_3);
        sampledsound_9.int499 += sampledsound_9.int503 * (i_6 - i_3);

        int i_10001;
        for (i_6 -= 3; i_3 < i_6; i_4 += i_5) {
            i_10001 = i_3++;
            ints_1[i_10001] += bytes_0[i_2--] * i_4;
            i_4 += i_5;
            i_10001 = i_3++;
            ints_1[i_10001] += bytes_0[i_2--] * i_4;
            i_4 += i_5;
            i_10001 = i_3++;
            ints_1[i_10001] += bytes_0[i_2--] * i_4;
            i_4 += i_5;
            i_10001 = i_3++;
            ints_1[i_10001] += bytes_0[i_2--] * i_4;
        }

        for (i_6 += 3; i_3 < i_6; i_4 += i_5) {
            i_10001 = i_3++;
            ints_1[i_10001] += bytes_0[i_2--] * i_4;
        }

        sampledsound_9.int497 = i_4 >> 2;
        sampledsound_9.int498 = i_2 << 8;
        return i_3;
    }

    static int staticMethod404(int i_0, byte[] bytes_1, int[] ints_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, SampledSound sampledsound_12) {
        i_3 >>= 8;
        i_11 >>= 8;
        i_5 <<= 2;
        i_6 <<= 2;
        i_7 <<= 2;
        i_8 <<= 2;
        if ((i_9 = i_4 + i_3 - (i_11 - 1)) > i_10)
            i_9 = i_10;

        sampledsound_12.int497 += sampledsound_12.int505 * (i_9 - i_4);
        i_4 <<= 1;
        i_9 <<= 1;

        byte b_13;
        int i_10001;
        for (i_9 -= 6; i_4 < i_9; i_6 += i_8) {
            b_13 = bytes_1[i_3--];
            i_10001 = i_4++;
            ints_2[i_10001] += b_13 * i_5;
            i_5 += i_7;
            i_10001 = i_4++;
            ints_2[i_10001] += b_13 * i_6;
            i_6 += i_8;
            b_13 = bytes_1[i_3--];
            i_10001 = i_4++;
            ints_2[i_10001] += b_13 * i_5;
            i_5 += i_7;
            i_10001 = i_4++;
            ints_2[i_10001] += b_13 * i_6;
            i_6 += i_8;
            b_13 = bytes_1[i_3--];
            i_10001 = i_4++;
            ints_2[i_10001] += b_13 * i_5;
            i_5 += i_7;
            i_10001 = i_4++;
            ints_2[i_10001] += b_13 * i_6;
            i_6 += i_8;
            b_13 = bytes_1[i_3--];
            i_10001 = i_4++;
            ints_2[i_10001] += b_13 * i_5;
            i_5 += i_7;
            i_10001 = i_4++;
            ints_2[i_10001] += b_13 * i_6;
        }

        for (i_9 += 6; i_4 < i_9; i_6 += i_8) {
            b_13 = bytes_1[i_3--];
            i_10001 = i_4++;
            ints_2[i_10001] += b_13 * i_5;
            i_5 += i_7;
            i_10001 = i_4++;
            ints_2[i_10001] += b_13 * i_6;
        }

        sampledsound_12.int506 = i_5 >> 2;
        sampledsound_12.int499 = i_6 >> 2;
        sampledsound_12.int498 = i_3 << 8;
        return i_4 >> 1;
    }

    static int staticMethod405(int i_0, int i_1, byte[] bytes_2, int[] ints_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, SampledSound sampledsound_11, int i_12, int i_13) {
        sampledsound_11.int506 -= sampledsound_11.int494 * i_5;
        sampledsound_11.int499 -= sampledsound_11.int503 * i_5;
        if (i_12 == 0 || (i_8 = i_5 + (i_10 - i_4 + i_12 - 257) / i_12) > i_9)
            i_8 = i_9;

        byte b_14;
        int i_10001;
        while (i_5 < i_8) {
            i_1 = i_4 >> 8;
            b_14 = bytes_2[i_1];
            i_10001 = i_5++;
            ints_3[i_10001] += ((b_14 << 8) + (bytes_2[i_1 + 1] - b_14) * (i_4 & 0xff)) * i_6 >> 6;
            i_6 += i_7;
            i_4 += i_12;
        }

        if (i_12 == 0 || (i_8 = i_5 + (i_10 - i_4 + i_12 - 1) / i_12) > i_9)
            i_8 = i_9;

        for (i_1 = i_13; i_5 < i_8; i_4 += i_12) {
            b_14 = bytes_2[i_4 >> 8];
            i_10001 = i_5++;
            ints_3[i_10001] += ((b_14 << 8) + (i_1 - b_14) * (i_4 & 0xff)) * i_6 >> 6;
            i_6 += i_7;
        }

        sampledsound_11.int506 += sampledsound_11.int494 * i_5;
        sampledsound_11.int499 += sampledsound_11.int503 * i_5;
        sampledsound_11.int497 = i_6;
        sampledsound_11.int498 = i_4;
        return i_5;
    }

    static int staticMethod406(int i_0, int i_1, byte[] bytes_2, int[] ints_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12, SampledSound sampledsound_13, int i_14, int i_15) {
        sampledsound_13.int497 -= sampledsound_13.int505 * i_5;
        if (i_14 == 0 || (i_10 = i_5 + (i_12 - i_4 + i_14 - 257) / i_14) > i_11)
            i_10 = i_11;

        i_5 <<= 1;

        byte b_16;
        int i_10001;
        for (i_10 <<= 1; i_5 < i_10; i_4 += i_14) {
            i_1 = i_4 >> 8;
            b_16 = bytes_2[i_1];
            i_0 = (b_16 << 8) + (bytes_2[i_1 + 1] - b_16) * (i_4 & 0xff);
            i_10001 = i_5++;
            ints_3[i_10001] += i_0 * i_6 >> 6;
            i_6 += i_8;
            i_10001 = i_5++;
            ints_3[i_10001] += i_0 * i_7 >> 6;
            i_7 += i_9;
        }

        if (i_14 == 0 || (i_10 = (i_5 >> 1) + (i_12 - i_4 + i_14 - 1) / i_14) > i_11)
            i_10 = i_11;

        i_10 <<= 1;

        for (i_1 = i_15; i_5 < i_10; i_4 += i_14) {
            b_16 = bytes_2[i_4 >> 8];
            i_0 = (b_16 << 8) + (i_1 - b_16) * (i_4 & 0xff);
            i_10001 = i_5++;
            ints_3[i_10001] += i_0 * i_6 >> 6;
            i_6 += i_8;
            i_10001 = i_5++;
            ints_3[i_10001] += i_0 * i_7 >> 6;
            i_7 += i_9;
        }

        i_5 >>= 1;
        sampledsound_13.int497 += sampledsound_13.int505 * i_5;
        sampledsound_13.int506 = i_6;
        sampledsound_13.int499 = i_7;
        sampledsound_13.int498 = i_4;
        return i_5;
    }

    static int staticMethod407(int i_0, int i_1, byte[] bytes_2, int[] ints_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, SampledSound sampledsound_11, int i_12, int i_13) {
        sampledsound_11.int506 -= sampledsound_11.int494 * i_5;
        sampledsound_11.int499 -= sampledsound_11.int503 * i_5;
        if (i_12 == 0 || (i_8 = i_5 + (i_10 + 256 - i_4 + i_12) / i_12) > i_9)
            i_8 = i_9;

        int i_10001;
        while (i_5 < i_8) {
            i_1 = i_4 >> 8;
            byte b_14 = bytes_2[i_1 - 1];
            i_10001 = i_5++;
            ints_3[i_10001] += ((b_14 << 8) + (bytes_2[i_1] - b_14) * (i_4 & 0xff)) * i_6 >> 6;
            i_6 += i_7;
            i_4 += i_12;
        }

        if (i_12 == 0 || (i_8 = i_5 + (i_10 - i_4 + i_12) / i_12) > i_9)
            i_8 = i_9;

        i_0 = i_13;

        for (i_1 = i_12; i_5 < i_8; i_4 += i_1) {
            i_10001 = i_5++;
            ints_3[i_10001] += ((i_0 << 8) + (bytes_2[i_4 >> 8] - i_0) * (i_4 & 0xff)) * i_6 >> 6;
            i_6 += i_7;
        }

        sampledsound_11.int506 += sampledsound_11.int494 * i_5;
        sampledsound_11.int499 += sampledsound_11.int503 * i_5;
        sampledsound_11.int497 = i_6;
        sampledsound_11.int498 = i_4;
        return i_5;
    }

    static int staticMethod408(int i_0, int i_1, byte[] bytes_2, int[] ints_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12, SampledSound sampledsound_13, int i_14, int i_15) {
        sampledsound_13.int497 -= sampledsound_13.int505 * i_5;
        if (i_14 == 0 || (i_10 = i_5 + (i_12 + 256 - i_4 + i_14) / i_14) > i_11)
            i_10 = i_11;

        i_5 <<= 1;

        int i_10001;
        for (i_10 <<= 1; i_5 < i_10; i_4 += i_14) {
            i_1 = i_4 >> 8;
            byte b_16 = bytes_2[i_1 - 1];
            i_0 = (b_16 << 8) + (bytes_2[i_1] - b_16) * (i_4 & 0xff);
            i_10001 = i_5++;
            ints_3[i_10001] += i_0 * i_6 >> 6;
            i_6 += i_8;
            i_10001 = i_5++;
            ints_3[i_10001] += i_0 * i_7 >> 6;
            i_7 += i_9;
        }

        if (i_14 == 0 || (i_10 = (i_5 >> 1) + (i_12 - i_4 + i_14) / i_14) > i_11)
            i_10 = i_11;

        i_10 <<= 1;

        for (i_1 = i_15; i_5 < i_10; i_4 += i_14) {
            i_0 = (i_1 << 8) + (bytes_2[i_4 >> 8] - i_1) * (i_4 & 0xff);
            i_10001 = i_5++;
            ints_3[i_10001] += i_0 * i_6 >> 6;
            i_6 += i_8;
            i_10001 = i_5++;
            ints_3[i_10001] += i_0 * i_7 >> 6;
            i_7 += i_9;
        }

        i_5 >>= 1;
        sampledsound_13.int497 += sampledsound_13.int505 * i_5;
        sampledsound_13.int506 = i_6;
        sampledsound_13.int499 = i_7;
        sampledsound_13.int498 = i_4;
        return i_5;
    }

}

public abstract class Sequence extends Node {

    int int346;
    Mus10 mus10_1;
    Sequence sequence2;
    volatile boolean volatileBool5 = true;

    protected abstract Sequence method416();

    protected abstract int method417();

    protected abstract Sequence method418();

    protected abstract void method419(int var1);

    protected abstract void method420(int[] var1, int var2, int var3);

    int method421() {
        return 255;
    }

    final void method422(int[] ints_1, int i_2, int i_3) {
        if (volatileBool5)
            method420(ints_1, i_2, i_3);
        else
            method419(i_3);

    }

}

public final class BZip2Context {

    int int212;
    byte[] byteArray2;
    byte[] byteArray3;
    int int218;
    int int219;
    int int220;
    int int221;
    int int223;
    int int224;
    int int225;
    int int226;
    int int227;
    static String staticString28;
    int int228;
    byte byte2;
    int int229;
    int int230;
    final int int222 = 4096;
    final int int213 = 16;
    final int int214 = 258;
    final int int215 = 6;
    final int int216 = 50;
    final int int217 = 18002;
    int next_in = 0;
    int next_out = 0;
    int[] unzftab = new int[256];
    int[] cftab = new int[257];
    boolean[] inUse = new boolean[256];
    boolean[] inUse16 = new boolean[16];
    byte[] seqToUnseq = new byte[256];
    byte[] mtfa = new byte[4096];
    int[] mtfbase = new int[16];
    byte[] selector = new byte[18002];
    byte[] selectorMtf = new byte[18002];
    byte[][] len = new byte[6][258];
    int[][] limit = new int[6][258];
    int[][] base = new int[6][258];
    int[][] perm = new int[6][258];
    int[] minLens = new int[6];

}

public class BuildType {

    static int staticInt137;
    static int[] staticIntArray69;
    static final BuildType staticBuildType3 = new BuildType("LIVE", 0);
    static final BuildType staticBuildType1 = new BuildType("BUILDLIVE", 3);
    static final BuildType staticBuildType4 = new BuildType("RC", 1);
    static final BuildType staticBuildType2 = new BuildType("WIP", 2);
    public final String string14;
    public final int int263;

    public static BuildType[] staticMethod187() {
        return new BuildType[] { staticBuildType2, staticBuildType4, staticBuildType1, staticBuildType3 };
    }

    BuildType(String string_1, int i_2) {
        string14 = string_1;
        int263 = i_2;
    }

}

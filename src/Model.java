public class Model extends Renderable {

    static Model staticModel2 = new Model();
    static byte[] staticByteArray8 = new byte[1];
    static Model staticModel1 = new Model();
    static byte[] staticByteArray7 = new byte[1];
    static boolean[] staticBoolArray13 = new boolean[4700];
    static boolean[] staticBoolArray12 = new boolean[4700];
    public static int[] staticIntArray139 = new int[4700];
    public static int[] staticIntArray140 = new int[4700];
    static int[] staticIntArray141 = new int[4700];
    static int[] staticIntArray142 = new int[4700];
    static int[] staticIntArray143 = new int[4700];
    static int[] staticIntArray144 = new int[4700];
    static int[] staticIntArray145 = new int[1600];
    static int[][] staticIntArrayArray10 = new int[1600][512];
    static int[] staticIntArray146 = new int[12];
    static int[][] staticIntArrayArray11 = new int[12][2000];
    static int[] staticIntArray147 = new int[2000];
    static int[] staticIntArray137 = new int[2000];
    static int[] staticIntArray138 = new int[12];
    static int[] staticIntArray149 = new int[10];
    static int[] staticIntArray150 = new int[10];
    static int[] staticIntArray151 = new int[10];
    static boolean staticBool51 = true;
    static int[] staticIntArray153;
    static int[] staticIntArray148;
    static int[] staticIntArray136;
    static int[] staticIntArray152;
    int vertexCount = 0;
    public int triangleCount = 0;
    byte byte7 = 0;
    int texTriangleCount = 0;
    public boolean bool75 = false;
    public int sizex = -1;
    public int sizey = -1;
    public int sizez = -1;
    int[] verticesX;
    int[] verticesY;
    int[] verticesZ;
    public int[] triangleA;
    public int[] triangleB;
    public int[] triangleC;
    int[] texX;
    int[] texY;
    public int[] texZ;
    byte[] texturePoints;
    byte[] trianglePriorities;
    short[] triangleAlphaValues;
    byte[] triangleSkinValues;
    int[] texTriangleA;
    int[] texTriangleB;
    int[] texTriangleC;
    int[][] intArrayArray15;
    int[][] intArrayArray16;
    public int midx;
    public int midy;
    public int midz;
    int int671;
    int maxY;
    int shadowIntensity;
    int int673;
    int int672;
    static int staticInt321;
    static int staticInt322;
    static int staticInt323;

    static {
        staticIntArray153 = Rasterizer3D.staticIntArray156;
        staticIntArray148 = Rasterizer3D.staticIntArray159;
        staticIntArray136 = Rasterizer3D.staticIntArray155;
        staticIntArray152 = Rasterizer3D.staticIntArray158;
    }

    Model() {
    }

    public Model(Model[] arr_1, int i_2) {
        boolean bool_3 = false;
        boolean bool_4 = false;
        boolean bool_5 = false;
        boolean bool_6 = false;
        vertexCount = 0;
        triangleCount = 0;
        texTriangleCount = 0;
        byte7 = -1;

        int i_7;
        Model model_8;
        for (i_7 = 0; i_7 < i_2; i_7++) {
            model_8 = arr_1[i_7];
            if (model_8 != null) {
                vertexCount += model_8.vertexCount;
                triangleCount += model_8.triangleCount;
                texTriangleCount += model_8.texTriangleCount;
                if (model_8.texturePoints != null)
                    bool_3 = true;
                else {
                    if (byte7 == -1)
                        byte7 = model_8.byte7;

                    if (byte7 != model_8.byte7)
                        bool_3 = true;
                }

                bool_4 |= model_8.trianglePriorities != null;
                bool_5 |= model_8.triangleAlphaValues != null;
                bool_6 |= model_8.triangleSkinValues != null;
            }
        }

        verticesX = new int[vertexCount];
        verticesY = new int[vertexCount];
        verticesZ = new int[vertexCount];
        triangleA = new int[triangleCount];
        triangleB = new int[triangleCount];
        triangleC = new int[triangleCount];
        texX = new int[triangleCount];
        texY = new int[triangleCount];
        texZ = new int[triangleCount];
        if (bool_3)
            texturePoints = new byte[triangleCount];

        if (bool_4)
            trianglePriorities = new byte[triangleCount];

        if (bool_5)
            triangleAlphaValues = new short[triangleCount];

        if (bool_6)
            triangleSkinValues = new byte[triangleCount];

        if (texTriangleCount > 0) {
            texTriangleA = new int[texTriangleCount];
            texTriangleB = new int[texTriangleCount];
            texTriangleC = new int[texTriangleCount];
        }

        vertexCount = 0;
        triangleCount = 0;
        texTriangleCount = 0;

        for (i_7 = 0; i_7 < i_2; i_7++) {
            model_8 = arr_1[i_7];
            if (model_8 != null) {
                int i_9;
                for (i_9 = 0; i_9 < model_8.triangleCount; i_9++) {
                    triangleA[triangleCount] = model_8.triangleA[i_9] + vertexCount;
                    triangleB[triangleCount] = model_8.triangleB[i_9] + vertexCount;
                    triangleC[triangleCount] = model_8.triangleC[i_9] + vertexCount;
                    texX[triangleCount] = model_8.texX[i_9];
                    texY[triangleCount] = model_8.texY[i_9];
                    texZ[triangleCount] = model_8.texZ[i_9];
                    if (bool_3)
                        if (model_8.texturePoints != null)
                            texturePoints[triangleCount] = model_8.texturePoints[i_9];
                        else
                            texturePoints[triangleCount] = model_8.byte7;

                    if (bool_4 && model_8.trianglePriorities != null)
                        trianglePriorities[triangleCount] = model_8.trianglePriorities[i_9];

                    if (bool_5)
                        if (model_8.triangleAlphaValues != null)
                            triangleAlphaValues[triangleCount] = model_8.triangleAlphaValues[i_9];
                        else
                            triangleAlphaValues[triangleCount] = -1;

                    if (bool_6)
                        if (model_8.triangleSkinValues != null && model_8.triangleSkinValues[i_9] != -1)
                            triangleSkinValues[triangleCount] = (byte) (model_8.triangleSkinValues[i_9] + texTriangleCount);
                        else
                            triangleSkinValues[triangleCount] = -1;

                    ++triangleCount;
                }

                for (i_9 = 0; i_9 < model_8.texTriangleCount; i_9++) {
                    texTriangleA[texTriangleCount] = model_8.texTriangleA[i_9] + vertexCount;
                    texTriangleB[texTriangleCount] = model_8.texTriangleB[i_9] + vertexCount;
                    texTriangleC[texTriangleCount] = model_8.texTriangleC[i_9] + vertexCount;
                    ++texTriangleCount;
                }

                for (i_9 = 0; i_9 < model_8.vertexCount; i_9++) {
                    verticesX[vertexCount] = model_8.verticesX[i_9];
                    verticesY[vertexCount] = model_8.verticesY[i_9];
                    verticesZ[vertexCount] = model_8.verticesZ[i_9];
                    ++vertexCount;
                }
            }
        }

    }

    public Model method635(int[][] ints_1, int i_2, int i_3, int i_4, boolean bool_5, int i_6) {
        method640();
        int i_7 = i_2 - shadowIntensity;
        int i_8 = i_2 + shadowIntensity;
        int i_9 = i_4 - shadowIntensity;
        int i_10 = i_4 + shadowIntensity;
        if (i_7 >= 0 && i_8 + 128 >> 7 < ints_1.length && i_9 >= 0 && i_10 + 128 >> 7 < ints_1[0].length) {
            i_7 >>= 7;
            i_8 = i_8 + 127 >> 7;
            i_9 >>= 7;
            i_10 = i_10 + 127 >> 7;
            if (ints_1[i_7][i_9] == i_3 && ints_1[i_8][i_9] == i_3 && ints_1[i_7][i_10] == i_3 && ints_1[i_8][i_10] == i_3)
                return this;
            else {
                Model model_11;
                if (bool_5) {
                    model_11 = new Model();
                    model_11.vertexCount = vertexCount;
                    model_11.triangleCount = triangleCount;
                    model_11.texTriangleCount = texTriangleCount;
                    model_11.verticesX = verticesX;
                    model_11.verticesZ = verticesZ;
                    model_11.triangleA = triangleA;
                    model_11.triangleB = triangleB;
                    model_11.triangleC = triangleC;
                    model_11.texX = texX;
                    model_11.texY = texY;
                    model_11.texZ = texZ;
                    model_11.texturePoints = texturePoints;
                    model_11.trianglePriorities = trianglePriorities;
                    model_11.triangleSkinValues = triangleSkinValues;
                    model_11.triangleAlphaValues = triangleAlphaValues;
                    model_11.byte7 = byte7;
                    model_11.texTriangleA = texTriangleA;
                    model_11.texTriangleB = texTriangleB;
                    model_11.texTriangleC = texTriangleC;
                    model_11.intArrayArray15 = intArrayArray15;
                    model_11.intArrayArray16 = intArrayArray16;
                    model_11.bool75 = bool75;
                    model_11.verticesY = new int[model_11.vertexCount];
                } else
                    model_11 = this;

                int i_12;
                int i_13;
                int i_14;
                int i_15;
                int i_16;
                int i_17;
                int i_18;
                int i_19;
                int i_20;
                int i_21;
                if (i_6 == 0)
                    for (i_12 = 0; i_12 < model_11.vertexCount; i_12++) {
                        i_13 = verticesX[i_12] + i_2;
                        i_14 = verticesZ[i_12] + i_4;
                        i_15 = i_13 & 0x7f;
                        i_16 = i_14 & 0x7f;
                        i_17 = i_13 >> 7;
                        i_18 = i_14 >> 7;
                        i_19 = ints_1[i_17][i_18] * (128 - i_15) + ints_1[i_17 + 1][i_18] * i_15 >> 7;
                        i_20 = ints_1[i_17][i_18 + 1] * (128 - i_15) + ints_1[i_17 + 1][i_18 + 1] * i_15 >> 7;
                        i_21 = i_19 * (128 - i_16) + i_20 * i_16 >> 7;
                        model_11.verticesY[i_12] = verticesY[i_12] + i_21 - i_3;
                    }
                else
                    for (i_12 = 0; i_12 < model_11.vertexCount; i_12++) {
                        i_13 = (-verticesY[i_12] << 16) / modelHeight;
                        if (i_13 < i_6) {
                            i_14 = verticesX[i_12] + i_2;
                            i_15 = verticesZ[i_12] + i_4;
                            i_16 = i_14 & 0x7f;
                            i_17 = i_15 & 0x7f;
                            i_18 = i_14 >> 7;
                            i_19 = i_15 >> 7;
                            i_20 = ints_1[i_18][i_19] * (128 - i_16) + ints_1[i_18 + 1][i_19] * i_16 >> 7;
                            i_21 = ints_1[i_18][i_19 + 1] * (128 - i_16) + ints_1[i_18 + 1][i_19 + 1] * i_16 >> 7;
                            int i_22 = i_20 * (128 - i_17) + i_21 * i_17 >> 7;
                            model_11.verticesY[i_12] = verticesY[i_12] + (i_22 - i_3) * (i_6 - i_13) / i_6;
                        }
                    }

                model_11.method643();
                return model_11;
            }
        } else
            return this;
    }

    public Model method636(boolean bool_1) {
        if (!bool_1 && staticByteArray8.length < triangleCount)
            staticByteArray8 = new byte[triangleCount + 100];

        return method638(bool_1, staticModel2, staticByteArray8);
    }

    public Model method637(boolean bool_1) {
        if (!bool_1 && staticByteArray7.length < triangleCount)
            staticByteArray7 = new byte[triangleCount + 100];

        return method638(bool_1, staticModel1, staticByteArray7);
    }

    Model method638(boolean bool_1, Model model_2, byte[] bytes_3) {
        model_2.vertexCount = vertexCount;
        model_2.triangleCount = triangleCount;
        model_2.texTriangleCount = texTriangleCount;
        if (model_2.verticesX == null || model_2.verticesX.length < vertexCount) {
            model_2.verticesX = new int[vertexCount + 100];
            model_2.verticesY = new int[vertexCount + 100];
            model_2.verticesZ = new int[vertexCount + 100];
        }

        int i_4;
        for (i_4 = 0; i_4 < vertexCount; i_4++) {
            model_2.verticesX[i_4] = verticesX[i_4];
            model_2.verticesY[i_4] = verticesY[i_4];
            model_2.verticesZ[i_4] = verticesZ[i_4];
        }

        if (bool_1)
            model_2.trianglePriorities = trianglePriorities;
        else {
            model_2.trianglePriorities = bytes_3;
            if (trianglePriorities == null)
                for (i_4 = 0; i_4 < triangleCount; i_4++)
                    model_2.trianglePriorities[i_4] = 0;
            else
                for (i_4 = 0; i_4 < triangleCount; i_4++)
                    model_2.trianglePriorities[i_4] = trianglePriorities[i_4];
        }

        model_2.triangleA = triangleA;
        model_2.triangleB = triangleB;
        model_2.triangleC = triangleC;
        model_2.texX = texX;
        model_2.texY = texY;
        model_2.texZ = texZ;
        model_2.texturePoints = texturePoints;
        model_2.triangleSkinValues = triangleSkinValues;
        model_2.triangleAlphaValues = triangleAlphaValues;
        model_2.byte7 = byte7;
        model_2.texTriangleA = texTriangleA;
        model_2.texTriangleB = texTriangleB;
        model_2.texTriangleC = texTriangleC;
        model_2.intArrayArray15 = intArrayArray15;
        model_2.intArrayArray16 = intArrayArray16;
        model_2.bool75 = bool75;
        model_2.method643();
        return model_2;
    }

    void method639(int i_1) {
        if (sizex == -1) {
            int i_2 = 0;
            int i_3 = 0;
            int i_4 = 0;
            int i_5 = 0;
            int i_6 = 0;
            int i_7 = 0;
            int i_8 = staticIntArray148[i_1];
            int i_9 = staticIntArray153[i_1];

            for (int i_10 = 0; i_10 < vertexCount; i_10++) {
                int i_11 = Rasterizer3D.staticMethod488(verticesX[i_10], verticesZ[i_10], i_8, i_9);
                int i_12 = verticesY[i_10];
                int i_13 = Rasterizer3D.staticMethod489(verticesX[i_10], verticesZ[i_10], i_8, i_9);
                if (i_11 < i_2)
                    i_2 = i_11;

                if (i_11 > i_5)
                    i_5 = i_11;

                if (i_12 < i_3)
                    i_3 = i_12;

                if (i_12 > i_6)
                    i_6 = i_12;

                if (i_13 < i_4)
                    i_4 = i_13;

                if (i_13 > i_7)
                    i_7 = i_13;
            }

            midx = (i_5 + i_2) / 2;
            midy = (i_6 + i_3) / 2;
            midz = (i_7 + i_4) / 2;
            sizex = (i_5 - i_2 + 1) / 2;
            sizey = (i_6 - i_3 + 1) / 2;
            sizez = (i_7 - i_4 + 1) / 2;
            if (sizex < 32)
                sizex = 32;

            if (sizez < 32)
                sizez = 32;

            if (bool75) {
                sizex += 8;
                sizez += 8;
            }

        }
    }

    public void method640() {
        if (int671 != 1) {
            int671 = 1;
            modelHeight = 0;
            maxY = 0;
            shadowIntensity = 0;

            for (int i_1 = 0; i_1 < vertexCount; i_1++) {
                int i_2 = verticesX[i_1];
                int i_3 = verticesY[i_1];
                int i_4 = verticesZ[i_1];
                if (-i_3 > modelHeight)
                    modelHeight = -i_3;

                if (i_3 > maxY)
                    maxY = i_3;

                int i_5 = i_2 * i_2 + i_4 * i_4;
                if (i_5 > shadowIntensity)
                    shadowIntensity = i_5;
            }

            shadowIntensity = (int) (Math.sqrt(shadowIntensity) + 0.99D);
            int673 = (int) (Math.sqrt(shadowIntensity * shadowIntensity + modelHeight * modelHeight) + 0.99D);
            int672 = int673 + (int) (Math.sqrt(shadowIntensity * shadowIntensity + maxY * maxY) + 0.99D);
        }
    }

    void method641() {
        if (int671 != 2) {
            int671 = 2;
            shadowIntensity = 0;

            for (int i_1 = 0; i_1 < vertexCount; i_1++) {
                int i_2 = verticesX[i_1];
                int i_3 = verticesY[i_1];
                int i_4 = verticesZ[i_1];
                int i_5 = i_2 * i_2 + i_4 * i_4 + i_3 * i_3;
                if (i_5 > shadowIntensity)
                    shadowIntensity = i_5;
            }

            shadowIntensity = (int) (Math.sqrt(shadowIntensity) + 0.99D);
            int673 = shadowIntensity;
            int672 = shadowIntensity + shadowIntensity;
        }
    }

    public int method642() {
        method640();
        return shadowIntensity;
    }

    void method643() {
        int671 = 0;
        sizex = -1;
    }

    public void method644(AnimFrame animframe_1, int i_2) {
        if (intArrayArray15 != null)
            if (i_2 != -1) {
                DataClass5 dataclass5_3 = animframe_1.dataClass5Array1[i_2];
                AnimTransform animtransform_4 = dataclass5_3.animTransform1;
                staticInt321 = 0;
                staticInt322 = 0;
                staticInt323 = 0;

                for (int i_5 = 0; i_5 < dataclass5_3.int138; i_5++) {
                    int i_6 = dataclass5_3.intArray21[i_5];
                    method646(animtransform_4.intArray49[i_6], animtransform_4.intArrayArray11[i_6], dataclass5_3.intArray22[i_5], dataclass5_3.intArray20[i_5], dataclass5_3.intArray23[i_5]);
                }

                method643();
            }
    }

    public void method645(AnimFrame animframe_1, int i_2, AnimFrame animframe_3, int i_4, int[] ints_5) {
        if (i_2 != -1)
            if (ints_5 != null && i_4 != -1) {
                DataClass5 dataclass5_6 = animframe_1.dataClass5Array1[i_2];
                DataClass5 dataclass5_7 = animframe_3.dataClass5Array1[i_4];
                AnimTransform animtransform_8 = dataclass5_6.animTransform1;
                staticInt321 = 0;
                staticInt322 = 0;
                staticInt323 = 0;
                byte b_9 = 0;
                int i_13 = b_9 + 1;
                int i_10 = ints_5[b_9];

                int i_11;
                int i_12;
                for (i_11 = 0; i_11 < dataclass5_6.int138; i_11++) {
                    for (i_12 = dataclass5_6.intArray21[i_11]; i_12 > i_10; i_10 = ints_5[i_13++])
                        ;

                    if (i_12 != i_10 || animtransform_8.intArray49[i_12] == 0)
                        method646(animtransform_8.intArray49[i_12], animtransform_8.intArrayArray11[i_12], dataclass5_6.intArray22[i_11], dataclass5_6.intArray20[i_11], dataclass5_6.intArray23[i_11]);
                }

                staticInt321 = 0;
                staticInt322 = 0;
                staticInt323 = 0;
                b_9 = 0;
                i_13 = b_9 + 1;
                i_10 = ints_5[b_9];

                for (i_11 = 0; i_11 < dataclass5_7.int138; i_11++) {
                    for (i_12 = dataclass5_7.intArray21[i_11]; i_12 > i_10; i_10 = ints_5[i_13++])
                        ;

                    if (i_12 == i_10 || animtransform_8.intArray49[i_12] == 0)
                        method646(animtransform_8.intArray49[i_12], animtransform_8.intArrayArray11[i_12], dataclass5_7.intArray22[i_11], dataclass5_7.intArray20[i_11], dataclass5_7.intArray23[i_11]);
                }

                method643();
            } else
                method644(animframe_1, i_2);
    }

    void method646(int i_1, int[] ints_2, int i_3, int i_4, int i_5) {
        int i_6 = ints_2.length;
        int i_7;
        int i_8;
        int i_11;
        int i_12;
        if (i_1 == 0) {
            i_7 = 0;
            staticInt321 = 0;
            staticInt322 = 0;
            staticInt323 = 0;

            for (i_8 = 0; i_8 < i_6; i_8++) {
                int i_18 = ints_2[i_8];
                if (i_18 < intArrayArray15.length) {
                    int[] ints_19 = intArrayArray15[i_18];

                    for (i_11 = 0; i_11 < ints_19.length; i_11++) {
                        i_12 = ints_19[i_11];
                        staticInt321 += verticesX[i_12];
                        staticInt322 += verticesY[i_12];
                        staticInt323 += verticesZ[i_12];
                        ++i_7;
                    }
                }
            }

            if (i_7 > 0) {
                staticInt321 = staticInt321 / i_7 + i_3;
                staticInt322 = staticInt322 / i_7 + i_4;
                staticInt323 = staticInt323 / i_7 + i_5;
            } else {
                staticInt321 = i_3;
                staticInt322 = i_4;
                staticInt323 = i_5;
            }

        } else {
            int[] ints_9;
            int i_10;
            if (i_1 == 1)
                for (i_7 = 0; i_7 < i_6; i_7++) {
                    i_8 = ints_2[i_7];
                    if (i_8 < intArrayArray15.length) {
                        ints_9 = intArrayArray15[i_8];

                        for (i_10 = 0; i_10 < ints_9.length; i_10++) {
                            i_11 = ints_9[i_10];
                            verticesX[i_11] += i_3;
                            verticesY[i_11] += i_4;
                            verticesZ[i_11] += i_5;
                        }
                    }
                }
            else if (i_1 == 2)
                for (i_7 = 0; i_7 < i_6; i_7++) {
                    i_8 = ints_2[i_7];
                    if (i_8 < intArrayArray15.length) {
                        ints_9 = intArrayArray15[i_8];

                        for (i_10 = 0; i_10 < ints_9.length; i_10++) {
                            i_11 = ints_9[i_10];
                            verticesX[i_11] -= staticInt321;
                            verticesY[i_11] -= staticInt322;
                            verticesZ[i_11] -= staticInt323;
                            i_12 = (i_3 & 0xff) * 8;
                            int i_13 = (i_4 & 0xff) * 8;
                            int i_14 = (i_5 & 0xff) * 8;
                            int i_15;
                            int i_16;
                            int i_17;
                            if (i_14 != 0) {
                                i_15 = staticIntArray153[i_14];
                                i_16 = staticIntArray148[i_14];
                                i_17 = verticesY[i_11] * i_15 + verticesX[i_11] * i_16 >> 16;
                                verticesY[i_11] = verticesY[i_11] * i_16 - verticesX[i_11] * i_15 >> 16;
                                verticesX[i_11] = i_17;
                            }

                            if (i_12 != 0) {
                                i_15 = staticIntArray153[i_12];
                                i_16 = staticIntArray148[i_12];
                                i_17 = verticesY[i_11] * i_16 - verticesZ[i_11] * i_15 >> 16;
                                verticesZ[i_11] = verticesY[i_11] * i_15 + verticesZ[i_11] * i_16 >> 16;
                                verticesY[i_11] = i_17;
                            }

                            if (i_13 != 0) {
                                i_15 = staticIntArray153[i_13];
                                i_16 = staticIntArray148[i_13];
                                i_17 = verticesZ[i_11] * i_15 + verticesX[i_11] * i_16 >> 16;
                                verticesZ[i_11] = verticesZ[i_11] * i_16 - verticesX[i_11] * i_15 >> 16;
                                verticesX[i_11] = i_17;
                            }

                            verticesX[i_11] += staticInt321;
                            verticesY[i_11] += staticInt322;
                            verticesZ[i_11] += staticInt323;
                        }
                    }
                }
            else if (i_1 == 3)
                for (i_7 = 0; i_7 < i_6; i_7++) {
                    i_8 = ints_2[i_7];
                    if (i_8 < intArrayArray15.length) {
                        ints_9 = intArrayArray15[i_8];

                        for (i_10 = 0; i_10 < ints_9.length; i_10++) {
                            i_11 = ints_9[i_10];
                            verticesX[i_11] -= staticInt321;
                            verticesY[i_11] -= staticInt322;
                            verticesZ[i_11] -= staticInt323;
                            verticesX[i_11] = verticesX[i_11] * i_3 / 128;
                            verticesY[i_11] = verticesY[i_11] * i_4 / 128;
                            verticesZ[i_11] = verticesZ[i_11] * i_5 / 128;
                            verticesX[i_11] += staticInt321;
                            verticesY[i_11] += staticInt322;
                            verticesZ[i_11] += staticInt323;
                        }
                    }
                }
            else if (i_1 == 5)
                if (intArrayArray16 != null && trianglePriorities != null)
                    for (i_7 = 0; i_7 < i_6; i_7++) {
                        i_8 = ints_2[i_7];
                        if (i_8 < intArrayArray16.length) {
                            ints_9 = intArrayArray16[i_8];

                            for (i_10 = 0; i_10 < ints_9.length; i_10++) {
                                i_11 = ints_9[i_10];
                                i_12 = (trianglePriorities[i_11] & 0xff) + i_3 * 8;
                                if (i_12 < 0)
                                    i_12 = 0;
                                else if (i_12 > 255)
                                    i_12 = 255;

                                trianglePriorities[i_11] = (byte) i_12;
                            }
                        }
                    }
        }
    }

    public void method647() {
        for (int i_1 = 0; i_1 < vertexCount; i_1++) {
            int i_2 = verticesX[i_1];
            verticesX[i_1] = verticesZ[i_1];
            verticesZ[i_1] = -i_2;
        }

        method643();
    }

    public void method648() {
        for (int i_1 = 0; i_1 < vertexCount; i_1++) {
            verticesX[i_1] = -verticesX[i_1];
            verticesZ[i_1] = -verticesZ[i_1];
        }

        method643();
    }

    public void method649() {
        for (int i_1 = 0; i_1 < vertexCount; i_1++) {
            int i_2 = verticesZ[i_1];
            verticesZ[i_1] = verticesX[i_1];
            verticesX[i_1] = -i_2;
        }

        method643();
    }

    public void method650(int i_1) {
        int i_2 = staticIntArray153[i_1];
        int i_3 = staticIntArray148[i_1];

        for (int i_4 = 0; i_4 < vertexCount; i_4++) {
            int i_5 = verticesY[i_4] * i_3 - verticesZ[i_4] * i_2 >> 16;
            verticesZ[i_4] = verticesY[i_4] * i_2 + verticesZ[i_4] * i_3 >> 16;
            verticesY[i_4] = i_5;
        }

        method643();
    }

    public void method651(int i_1, int i_2, int i_3) {
        for (int i_4 = 0; i_4 < vertexCount; i_4++) {
            verticesX[i_4] += i_1;
            verticesY[i_4] += i_2;
            verticesZ[i_4] += i_3;
        }

        method643();
    }

    public void method652(int i_1, int i_2, int i_3) {
        for (int i_4 = 0; i_4 < vertexCount; i_4++) {
            verticesX[i_4] = verticesX[i_4] * i_1 / 128;
            verticesY[i_4] = verticesY[i_4] * i_2 / 128;
            verticesZ[i_4] = verticesZ[i_4] * i_3 / 128;
        }

        method643();
    }

    public final void method653(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
        staticIntArray145[0] = -1;
        if (int671 != 2 && int671 != 1)
            method641();

        int i_8 = Rasterizer3D.staticInt325;
        int i_9 = Rasterizer3D.staticInt332;
        int i_10 = staticIntArray153[i_1];
        int i_11 = staticIntArray148[i_1];
        int i_12 = staticIntArray153[i_2];
        int i_13 = staticIntArray148[i_2];
        int i_14 = staticIntArray153[i_3];
        int i_15 = staticIntArray148[i_3];
        int i_16 = staticIntArray153[i_4];
        int i_17 = staticIntArray148[i_4];
        int i_18 = i_6 * i_16 + i_7 * i_17 >> 16;

        for (int i_19 = 0; i_19 < vertexCount; i_19++) {
            int i_20 = verticesX[i_19];
            int i_21 = verticesY[i_19];
            int i_22 = verticesZ[i_19];
            int i_23;
            if (i_3 != 0) {
                i_23 = i_21 * i_14 + i_20 * i_15 >> 16;
                i_21 = i_21 * i_15 - i_20 * i_14 >> 16;
                i_20 = i_23;
            }

            if (i_1 != 0) {
                i_23 = i_21 * i_11 - i_22 * i_10 >> 16;
                i_22 = i_21 * i_10 + i_22 * i_11 >> 16;
                i_21 = i_23;
            }

            if (i_2 != 0) {
                i_23 = i_22 * i_12 + i_20 * i_13 >> 16;
                i_22 = i_22 * i_13 - i_20 * i_12 >> 16;
                i_20 = i_23;
            }

            i_20 += i_5;
            i_21 += i_6;
            i_22 += i_7;
            i_23 = i_21 * i_17 - i_22 * i_16 >> 16;
            i_22 = i_21 * i_16 + i_22 * i_17 >> 16;
            staticIntArray141[i_19] = i_22 - i_18;
            staticIntArray139[i_19] = i_8 + i_20 * Rasterizer3D.staticInt326 / i_22;
            staticIntArray140[i_19] = i_9 + i_23 * Rasterizer3D.staticInt326 / i_22;
            if (texTriangleCount > 0) {
                staticIntArray142[i_19] = i_20;
                staticIntArray143[i_19] = i_23;
                staticIntArray144[i_19] = i_22;
            }
        }

        try {
            method655(false, false, false, 0);
        } catch (Exception exception_24) {
            ;
        }

    }

    public final void method654(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
        staticIntArray145[0] = -1;
        if (int671 != 2 && int671 != 1)
            method641();

        int i_9 = Rasterizer3D.staticInt325;
        int i_10 = Rasterizer3D.staticInt332;
        int i_11 = staticIntArray153[i_1];
        int i_12 = staticIntArray148[i_1];
        int i_13 = staticIntArray153[i_2];
        int i_14 = staticIntArray148[i_2];
        int i_15 = staticIntArray153[i_3];
        int i_16 = staticIntArray148[i_3];
        int i_17 = staticIntArray153[i_4];
        int i_18 = staticIntArray148[i_4];
        int i_19 = i_6 * i_17 + i_7 * i_18 >> 16;

        for (int i_20 = 0; i_20 < vertexCount; i_20++) {
            int i_21 = verticesX[i_20];
            int i_22 = verticesY[i_20];
            int i_23 = verticesZ[i_20];
            int i_24;
            if (i_3 != 0) {
                i_24 = i_22 * i_15 + i_21 * i_16 >> 16;
                i_22 = i_22 * i_16 - i_21 * i_15 >> 16;
                i_21 = i_24;
            }

            if (i_1 != 0) {
                i_24 = i_22 * i_12 - i_23 * i_11 >> 16;
                i_23 = i_22 * i_11 + i_23 * i_12 >> 16;
                i_22 = i_24;
            }

            if (i_2 != 0) {
                i_24 = i_23 * i_13 + i_21 * i_14 >> 16;
                i_23 = i_23 * i_14 - i_21 * i_13 >> 16;
                i_21 = i_24;
            }

            i_21 += i_5;
            i_22 += i_6;
            i_23 += i_7;
            i_24 = i_22 * i_18 - i_23 * i_17 >> 16;
            i_23 = i_22 * i_17 + i_23 * i_18 >> 16;
            staticIntArray141[i_20] = i_23 - i_19;
            staticIntArray139[i_20] = i_9 + i_21 * Rasterizer3D.staticInt326 / i_8;
            staticIntArray140[i_20] = i_10 + i_24 * Rasterizer3D.staticInt326 / i_8;
            if (texTriangleCount > 0) {
                staticIntArray142[i_20] = i_21;
                staticIntArray143[i_20] = i_24;
                staticIntArray144[i_20] = i_23;
            }
        }

        try {
            method655(false, false, false, 0);
        } catch (Exception exception_25) {
            ;
        }

    }

    @Override
    void renderAt(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
        staticIntArray145[0] = -1;
        if (int671 != 1)
            method640();

        method639(i_1);
        int i_10 = i_8 * i_5 - i_6 * i_4 >> 16;
        int i_11 = i_7 * i_2 + i_10 * i_3 >> 16;
        int i_12 = shadowIntensity * i_3 >> 16;
        int i_13 = i_11 + i_12;
        if (i_13 > 50 && i_11 < 3500) {
            int i_14 = i_8 * i_4 + i_6 * i_5 >> 16;
            int i_15 = (i_14 - shadowIntensity) * Rasterizer3D.staticInt326;
            if (i_15 / i_13 < Rasterizer3D.staticInt330) {
                int i_16 = (i_14 + shadowIntensity) * Rasterizer3D.staticInt326;
                if (i_16 / i_13 > Rasterizer3D.staticInt329) {
                    int i_17 = i_7 * i_3 - i_10 * i_2 >> 16;
                    int i_18 = shadowIntensity * i_2 >> 16;
                    int i_19 = (i_17 + i_18) * Rasterizer3D.staticInt326;
                    if (i_19 / i_13 > Rasterizer3D.staticInt331) {
                        int i_20 = i_18 + (modelHeight * i_3 >> 16);
                        int i_21 = (i_17 - i_20) * Rasterizer3D.staticInt326;
                        if (i_21 / i_13 < Rasterizer3D.staticInt324) {
                            int i_22 = i_12 + (modelHeight * i_2 >> 16);
                            boolean bool_23 = false;
                            boolean bool_24 = false;
                            if (i_11 - i_22 <= 50)
                                bool_24 = true;

                            boolean bool_25 = bool_24 || texTriangleCount > 0;
                            int i_26 = StaticClass17.staticMethod123();
                            int i_27 = StaticClass17.staticMethod124();
                            boolean bool_28 = StaticClass17.staticMethod122();
                            if (StaticClass29.staticBool20 && i_9 > 0)
                                if (StaticClass17.staticMethod125(this, i_6, i_7, i_8))
                                    StaticClass29.staticMethod158(this, i_6, i_7, i_8, -65281);
                                else if (StaticClass29.staticDataClass12_1 == DataClass12.staticDataClass12_2)
                                    StaticClass29.staticMethod158(this, i_6, i_7, i_8, -16776961);

                            int i_30;
                            int i_31;
                            int i_32;
                            int i_33;
                            int i_34;
                            int i_35;
                            int i_36;
                            if (StaticClass29.staticBool19 && i_9 > 0) {
                                int i_29 = i_11 - i_12;
                                if (i_29 <= 50)
                                    i_29 = 50;

                                if (i_14 > 0) {
                                    i_30 = i_15 / i_13;
                                    i_31 = i_16 / i_29;
                                } else {
                                    i_31 = i_16 / i_13;
                                    i_30 = i_15 / i_29;
                                }

                                if (i_17 > 0) {
                                    i_32 = i_21 / i_13;
                                    i_33 = i_19 / i_29;
                                } else {
                                    i_33 = i_19 / i_13;
                                    i_32 = i_21 / i_29;
                                }

                                i_34 = -8355840;
                                i_35 = i_26 - Rasterizer3D.staticInt325;
                                i_36 = i_27 - Rasterizer3D.staticInt332;
                                if (i_35 > i_30 && i_35 < i_31 && i_36 > i_32 && i_36 < i_33)
                                    i_34 = -256;

                                StaticClass29.staticMethod159(i_30 + Rasterizer3D.staticInt325, i_32 + Rasterizer3D.staticInt332, i_31 + Rasterizer3D.staticInt325, i_33 + Rasterizer3D.staticInt332, i_34);
                            }

                            boolean bool_40 = false;
                            if (i_9 > 0 && bool_28) {
                                boolean bool_41 = false;
                                if (staticBool51)
                                    bool_41 = StaticClass17.staticMethod125(this, i_6, i_7, i_8);
                                else {
                                    i_31 = i_11 - i_12;
                                    if (i_31 <= 50)
                                        i_31 = 50;

                                    if (i_14 > 0) {
                                        i_15 /= i_13;
                                        i_16 /= i_31;
                                    } else {
                                        i_16 /= i_13;
                                        i_15 /= i_31;
                                    }

                                    if (i_17 > 0) {
                                        i_21 /= i_13;
                                        i_19 /= i_31;
                                    } else {
                                        i_19 /= i_13;
                                        i_21 /= i_31;
                                    }

                                    i_32 = i_26 - Rasterizer3D.staticInt325;
                                    i_33 = i_27 - Rasterizer3D.staticInt332;
                                    if (i_32 > i_15 && i_32 < i_16 && i_33 > i_21 && i_33 < i_19)
                                        bool_41 = true;
                                }

                                if (bool_41)
                                    if (bool75)
                                        StaticClass17.staticIntArray56[StaticClass17.staticInt117++] = i_9;
                                    else
                                        bool_40 = true;
                            }

                            i_30 = Rasterizer3D.staticInt325;
                            i_31 = Rasterizer3D.staticInt332;
                            i_32 = 0;
                            i_33 = 0;
                            if (i_1 != 0) {
                                i_32 = staticIntArray153[i_1];
                                i_33 = staticIntArray148[i_1];
                            }

                            for (i_34 = 0; i_34 < vertexCount; i_34++) {
                                i_35 = verticesX[i_34];
                                i_36 = verticesY[i_34];
                                int i_37 = verticesZ[i_34];
                                int i_38;
                                if (i_1 != 0) {
                                    i_38 = i_37 * i_32 + i_35 * i_33 >> 16;
                                    i_37 = i_37 * i_33 - i_35 * i_32 >> 16;
                                    i_35 = i_38;
                                }

                                i_35 += i_6;
                                i_36 += i_7;
                                i_37 += i_8;
                                i_38 = i_37 * i_4 + i_35 * i_5 >> 16;
                                i_37 = i_37 * i_5 - i_35 * i_4 >> 16;
                                i_35 = i_38;
                                i_38 = i_36 * i_3 - i_37 * i_2 >> 16;
                                i_37 = i_36 * i_2 + i_37 * i_3 >> 16;
                                staticIntArray141[i_34] = i_37 - i_11;
                                if (i_37 >= 50) {
                                    staticIntArray139[i_34] = i_30 + i_35 * Rasterizer3D.staticInt326 / i_37;
                                    staticIntArray140[i_34] = i_31 + i_38 * Rasterizer3D.staticInt326 / i_37;
                                } else {
                                    staticIntArray139[i_34] = -5000;
                                    bool_23 = true;
                                }

                                if (bool_25) {
                                    staticIntArray142[i_34] = i_35;
                                    staticIntArray143[i_34] = i_38;
                                    staticIntArray144[i_34] = i_37;
                                }
                            }

                            try {
                                method655(bool_23, bool_40, bool75, i_9);
                            } catch (Exception exception_39) {
                                ;
                            }

                        }
                    }
                }
            }
        }
    }

    final void method655(boolean bool_1, boolean bool_2, boolean bool_3, int i_4) {
        if (int672 < 1600) {
            int i_5;
            for (i_5 = 0; i_5 < int672; i_5++)
                staticIntArray145[i_5] = 0;

            i_5 = bool_3 ? 20 : 5;
            if (StaticClass29.staticBool21 && bool_2)
                StaticClass29.staticMethod156(this, i_5);

            int i_6;
            int i_7;
            int i_8;
            int i_9;
            int i_10;
            int i_11;
            int i_12;
            int i_14;
            int i_15;
            int i_17;
            for (i_6 = 0; i_6 < triangleCount; i_6++)
                if (texZ[i_6] != -2) {
                    i_7 = triangleA[i_6];
                    i_8 = triangleB[i_6];
                    i_9 = triangleC[i_6];
                    i_10 = staticIntArray139[i_7];
                    i_11 = staticIntArray139[i_8];
                    i_12 = staticIntArray139[i_9];
                    int i_13;
                    int i_16;
                    if (!bool_1 || i_10 != -5000 && i_11 != -5000 && i_12 != -5000) {
                        if (bool_2) {
                            i_14 = staticIntArray140[i_7];
                            i_15 = staticIntArray140[i_8];
                            i_16 = staticIntArray140[i_9];
                            i_17 = StaticClass17.staticInt112 + i_5;
                            boolean bool_29;
                            if (i_17 < i_14 && i_17 < i_15 && i_17 < i_16)
                                bool_29 = false;
                            else {
                                i_17 = StaticClass17.staticInt112 - i_5;
                                if (i_17 > i_14 && i_17 > i_15 && i_17 > i_16)
                                    bool_29 = false;
                                else {
                                    i_17 = i_5 + StaticClass17.staticInt113;
                                    if (i_17 < i_10 && i_17 < i_11 && i_17 < i_12)
                                        bool_29 = false;
                                    else {
                                        i_17 = StaticClass17.staticInt113 - i_5;
                                        if (i_17 > i_10 && i_17 > i_11 && i_17 > i_12)
                                            bool_29 = false;
                                        else
                                            bool_29 = true;
                                    }
                                }
                            }

                            if (bool_29) {
                                StaticClass17.staticIntArray56[StaticClass17.staticInt117++] = i_4;
                                bool_2 = false;
                            }
                        }

                        if ((i_10 - i_11) * (staticIntArray140[i_9] - staticIntArray140[i_8]) - (staticIntArray140[i_7] - staticIntArray140[i_8]) * (i_12 - i_11) > 0) {
                            staticBoolArray12[i_6] = false;
                            if (i_10 >= 0 && i_11 >= 0 && i_12 >= 0 && i_10 <= Rasterizer3D.staticInt327 && i_11 <= Rasterizer3D.staticInt327 && i_12 <= Rasterizer3D.staticInt327)
                                staticBoolArray13[i_6] = false;
                            else
                                staticBoolArray13[i_6] = true;

                            i_13 = (staticIntArray141[i_7] + staticIntArray141[i_8] + staticIntArray141[i_9]) / 3 + int673;
                            staticIntArrayArray10[i_13][staticIntArray145[i_13]++] = i_6;
                        }
                    } else {
                        i_13 = staticIntArray142[i_7];
                        i_14 = staticIntArray142[i_8];
                        i_15 = staticIntArray142[i_9];
                        i_16 = staticIntArray143[i_7];
                        i_17 = staticIntArray143[i_8];
                        int i_18 = staticIntArray143[i_9];
                        int i_19 = staticIntArray144[i_7];
                        int i_20 = staticIntArray144[i_8];
                        int i_21 = staticIntArray144[i_9];
                        i_13 -= i_14;
                        i_15 -= i_14;
                        i_16 -= i_17;
                        i_18 -= i_17;
                        i_19 -= i_20;
                        i_21 -= i_20;
                        int i_22 = i_16 * i_21 - i_19 * i_18;
                        int i_23 = i_19 * i_15 - i_13 * i_21;
                        int i_24 = i_13 * i_18 - i_16 * i_15;
                        if (i_14 * i_22 + i_17 * i_23 + i_20 * i_24 > 0) {
                            staticBoolArray12[i_6] = true;
                            int i_25 = (staticIntArray141[i_7] + staticIntArray141[i_8] + staticIntArray141[i_9]) / 3 + int673;
                            staticIntArrayArray10[i_25][staticIntArray145[i_25]++] = i_6;
                        }
                    }
                }

            int[] ints_26;
            if (texturePoints == null)
                for (i_6 = int672 - 1; i_6 >= 0; --i_6) {
                    i_7 = staticIntArray145[i_6];
                    if (i_7 > 0) {
                        ints_26 = staticIntArrayArray10[i_6];

                        for (i_9 = 0; i_9 < i_7; i_9++)
                            method656(ints_26[i_9]);
                    }
                }
            else {
                for (i_6 = 0; i_6 < 12; i_6++) {
                    staticIntArray146[i_6] = 0;
                    staticIntArray138[i_6] = 0;
                }

                for (i_6 = int672 - 1; i_6 >= 0; --i_6) {
                    i_7 = staticIntArray145[i_6];
                    if (i_7 > 0) {
                        ints_26 = staticIntArrayArray10[i_6];

                        for (i_9 = 0; i_9 < i_7; i_9++) {
                            i_10 = ints_26[i_9];
                            byte b_27 = texturePoints[i_10];
                            i_12 = staticIntArray146[b_27]++;
                            staticIntArrayArray11[b_27][i_12] = i_10;
                            if (b_27 < 10)
                                staticIntArray138[b_27] += i_6;
                            else if (b_27 == 10)
                                staticIntArray147[i_12] = i_6;
                            else
                                staticIntArray137[i_12] = i_6;
                        }
                    }
                }

                i_6 = 0;
                if (staticIntArray146[1] > 0 || staticIntArray146[2] > 0)
                    i_6 = (staticIntArray138[1] + staticIntArray138[2]) / (staticIntArray146[1] + staticIntArray146[2]);

                i_7 = 0;
                if (staticIntArray146[3] > 0 || staticIntArray146[4] > 0)
                    i_7 = (staticIntArray138[3] + staticIntArray138[4]) / (staticIntArray146[3] + staticIntArray146[4]);

                i_8 = 0;
                if (staticIntArray146[6] > 0 || staticIntArray146[8] > 0)
                    i_8 = (staticIntArray138[6] + staticIntArray138[8]) / (staticIntArray146[6] + staticIntArray146[8]);

                i_10 = 0;
                i_11 = staticIntArray146[10];
                int[] ints_28 = staticIntArrayArray11[10];
                int[] ints_30 = staticIntArray147;
                if (i_10 == i_11) {
                    i_10 = 0;
                    i_11 = staticIntArray146[11];
                    ints_28 = staticIntArrayArray11[11];
                    ints_30 = staticIntArray137;
                }

                if (i_10 < i_11)
                    i_9 = ints_30[i_10];
                else
                    i_9 = -1000;

                for (i_14 = 0; i_14 < 10; i_14++) {
                    while (i_14 == 0 && i_9 > i_6) {
                        method656(ints_28[i_10++]);
                        if (i_10 == i_11 && ints_28 != staticIntArrayArray11[11]) {
                            i_10 = 0;
                            i_11 = staticIntArray146[11];
                            ints_28 = staticIntArrayArray11[11];
                            ints_30 = staticIntArray137;
                        }

                        if (i_10 < i_11)
                            i_9 = ints_30[i_10];
                        else
                            i_9 = -1000;
                    }

                    while (i_14 == 3 && i_9 > i_7) {
                        method656(ints_28[i_10++]);
                        if (i_10 == i_11 && ints_28 != staticIntArrayArray11[11]) {
                            i_10 = 0;
                            i_11 = staticIntArray146[11];
                            ints_28 = staticIntArrayArray11[11];
                            ints_30 = staticIntArray137;
                        }

                        if (i_10 < i_11)
                            i_9 = ints_30[i_10];
                        else
                            i_9 = -1000;
                    }

                    while (i_14 == 5 && i_9 > i_8) {
                        method656(ints_28[i_10++]);
                        if (i_10 == i_11 && ints_28 != staticIntArrayArray11[11]) {
                            i_10 = 0;
                            i_11 = staticIntArray146[11];
                            ints_28 = staticIntArrayArray11[11];
                            ints_30 = staticIntArray137;
                        }

                        if (i_10 < i_11)
                            i_9 = ints_30[i_10];
                        else
                            i_9 = -1000;
                    }

                    i_15 = staticIntArray146[i_14];
                    int[] ints_31 = staticIntArrayArray11[i_14];

                    for (i_17 = 0; i_17 < i_15; i_17++)
                        method656(ints_31[i_17]);
                }

                while (i_9 != -1000) {
                    method656(ints_28[i_10++]);
                    if (i_10 == i_11 && ints_28 != staticIntArrayArray11[11]) {
                        i_10 = 0;
                        ints_28 = staticIntArrayArray11[11];
                        i_11 = staticIntArray146[11];
                        ints_30 = staticIntArray137;
                    }

                    if (i_10 < i_11)
                        i_9 = ints_30[i_10];
                    else
                        i_9 = -1000;
                }

            }
        }
    }

    final void method656(int i_1) {
        if (staticBoolArray12[i_1])
            method657(i_1);
        else {
            int i_2 = triangleA[i_1];
            int i_3 = triangleB[i_1];
            int i_4 = triangleC[i_1];
            Rasterizer3D.staticBool54 = staticBoolArray13[i_1];
            if (trianglePriorities == null)
                Rasterizer3D.staticInt333 = 0;
            else
                Rasterizer3D.staticInt333 = trianglePriorities[i_1] & 0xff;

            if (triangleAlphaValues != null && triangleAlphaValues[i_1] != -1) {
                int i_5;
                int i_6;
                int i_7;
                if (triangleSkinValues != null && triangleSkinValues[i_1] != -1) {
                    int i_8 = triangleSkinValues[i_1] & 0xff;
                    i_5 = texTriangleA[i_8];
                    i_6 = texTriangleB[i_8];
                    i_7 = texTriangleC[i_8];
                } else {
                    i_5 = i_2;
                    i_6 = i_3;
                    i_7 = i_4;
                }

                if (texZ[i_1] == -1)
                    Rasterizer3D.staticMethod483(staticIntArray140[i_2], staticIntArray140[i_3], staticIntArray140[i_4], staticIntArray139[i_2], staticIntArray139[i_3], staticIntArray139[i_4], texX[i_1], texX[i_1], texX[i_1], staticIntArray142[i_5], staticIntArray142[i_6], staticIntArray142[i_7], staticIntArray143[i_5], staticIntArray143[i_6], staticIntArray143[i_7], staticIntArray144[i_5], staticIntArray144[i_6], staticIntArray144[i_7], triangleAlphaValues[i_1]);
                else
                    Rasterizer3D.staticMethod483(staticIntArray140[i_2], staticIntArray140[i_3], staticIntArray140[i_4], staticIntArray139[i_2], staticIntArray139[i_3], staticIntArray139[i_4], texX[i_1], texY[i_1], texZ[i_1], staticIntArray142[i_5], staticIntArray142[i_6], staticIntArray142[i_7], staticIntArray143[i_5], staticIntArray143[i_6], staticIntArray143[i_7], staticIntArray144[i_5], staticIntArray144[i_6], staticIntArray144[i_7], triangleAlphaValues[i_1]);
            } else if (texZ[i_1] == -1)
                Rasterizer3D.staticMethod481(staticIntArray140[i_2], staticIntArray140[i_3], staticIntArray140[i_4], staticIntArray139[i_2], staticIntArray139[i_3], staticIntArray139[i_4], staticIntArray136[texX[i_1]]);
            else
                Rasterizer3D.staticMethod479(staticIntArray140[i_2], staticIntArray140[i_3], staticIntArray140[i_4], staticIntArray139[i_2], staticIntArray139[i_3], staticIntArray139[i_4], texX[i_1], texY[i_1], texZ[i_1]);

        }
    }

    final void method657(int i_1) {
        int i_2 = Rasterizer3D.staticInt325;
        int i_3 = Rasterizer3D.staticInt332;
        int i_4 = 0;
        int i_5 = triangleA[i_1];
        int i_6 = triangleB[i_1];
        int i_7 = triangleC[i_1];
        int i_8 = staticIntArray144[i_5];
        int i_9 = staticIntArray144[i_6];
        int i_10 = staticIntArray144[i_7];
        if (trianglePriorities == null)
            Rasterizer3D.staticInt333 = 0;
        else
            Rasterizer3D.staticInt333 = trianglePriorities[i_1] & 0xff;

        int i_11;
        int i_12;
        int i_13;
        int i_14;
        if (i_8 >= 50) {
            staticIntArray149[i_4] = staticIntArray139[i_5];
            staticIntArray150[i_4] = staticIntArray140[i_5];
            staticIntArray151[i_4++] = texX[i_1];
        } else {
            i_11 = staticIntArray142[i_5];
            i_12 = staticIntArray143[i_5];
            i_13 = texX[i_1];
            if (i_10 >= 50) {
                i_14 = (50 - i_8) * staticIntArray152[i_10 - i_8];
                staticIntArray149[i_4] = i_2 + (i_11 + ((staticIntArray142[i_7] - i_11) * i_14 >> 16)) * Rasterizer3D.staticInt326 / 50;
                staticIntArray150[i_4] = i_3 + (i_12 + ((staticIntArray143[i_7] - i_12) * i_14 >> 16)) * Rasterizer3D.staticInt326 / 50;
                staticIntArray151[i_4++] = i_13 + ((texZ[i_1] - i_13) * i_14 >> 16);
            }

            if (i_9 >= 50) {
                i_14 = (50 - i_8) * staticIntArray152[i_9 - i_8];
                staticIntArray149[i_4] = i_2 + (i_11 + ((staticIntArray142[i_6] - i_11) * i_14 >> 16)) * Rasterizer3D.staticInt326 / 50;
                staticIntArray150[i_4] = i_3 + (i_12 + ((staticIntArray143[i_6] - i_12) * i_14 >> 16)) * Rasterizer3D.staticInt326 / 50;
                staticIntArray151[i_4++] = i_13 + ((texY[i_1] - i_13) * i_14 >> 16);
            }
        }

        if (i_9 >= 50) {
            staticIntArray149[i_4] = staticIntArray139[i_6];
            staticIntArray150[i_4] = staticIntArray140[i_6];
            staticIntArray151[i_4++] = texY[i_1];
        } else {
            i_11 = staticIntArray142[i_6];
            i_12 = staticIntArray143[i_6];
            i_13 = texY[i_1];
            if (i_8 >= 50) {
                i_14 = (50 - i_9) * staticIntArray152[i_8 - i_9];
                staticIntArray149[i_4] = i_2 + (i_11 + ((staticIntArray142[i_5] - i_11) * i_14 >> 16)) * Rasterizer3D.staticInt326 / 50;
                staticIntArray150[i_4] = i_3 + (i_12 + ((staticIntArray143[i_5] - i_12) * i_14 >> 16)) * Rasterizer3D.staticInt326 / 50;
                staticIntArray151[i_4++] = i_13 + ((texX[i_1] - i_13) * i_14 >> 16);
            }

            if (i_10 >= 50) {
                i_14 = (50 - i_9) * staticIntArray152[i_10 - i_9];
                staticIntArray149[i_4] = i_2 + (i_11 + ((staticIntArray142[i_7] - i_11) * i_14 >> 16)) * Rasterizer3D.staticInt326 / 50;
                staticIntArray150[i_4] = i_3 + (i_12 + ((staticIntArray143[i_7] - i_12) * i_14 >> 16)) * Rasterizer3D.staticInt326 / 50;
                staticIntArray151[i_4++] = i_13 + ((texZ[i_1] - i_13) * i_14 >> 16);
            }
        }

        if (i_10 >= 50) {
            staticIntArray149[i_4] = staticIntArray139[i_7];
            staticIntArray150[i_4] = staticIntArray140[i_7];
            staticIntArray151[i_4++] = texZ[i_1];
        } else {
            i_11 = staticIntArray142[i_7];
            i_12 = staticIntArray143[i_7];
            i_13 = texZ[i_1];
            if (i_9 >= 50) {
                i_14 = (50 - i_10) * staticIntArray152[i_9 - i_10];
                staticIntArray149[i_4] = i_2 + (i_11 + ((staticIntArray142[i_6] - i_11) * i_14 >> 16)) * Rasterizer3D.staticInt326 / 50;
                staticIntArray150[i_4] = i_3 + (i_12 + ((staticIntArray143[i_6] - i_12) * i_14 >> 16)) * Rasterizer3D.staticInt326 / 50;
                staticIntArray151[i_4++] = i_13 + ((texY[i_1] - i_13) * i_14 >> 16);
            }

            if (i_8 >= 50) {
                i_14 = (50 - i_10) * staticIntArray152[i_8 - i_10];
                staticIntArray149[i_4] = i_2 + (i_11 + ((staticIntArray142[i_5] - i_11) * i_14 >> 16)) * Rasterizer3D.staticInt326 / 50;
                staticIntArray150[i_4] = i_3 + (i_12 + ((staticIntArray143[i_5] - i_12) * i_14 >> 16)) * Rasterizer3D.staticInt326 / 50;
                staticIntArray151[i_4++] = i_13 + ((texX[i_1] - i_13) * i_14 >> 16);
            }
        }

        i_11 = staticIntArray149[0];
        i_12 = staticIntArray149[1];
        i_13 = staticIntArray149[2];
        i_14 = staticIntArray150[0];
        int i_15 = staticIntArray150[1];
        int i_16 = staticIntArray150[2];
        Rasterizer3D.staticBool54 = false;
        int i_17;
        int i_18;
        int i_19;
        int i_20;
        if (i_4 == 3) {
            if (i_11 < 0 || i_12 < 0 || i_13 < 0 || i_11 > Rasterizer3D.staticInt327 || i_12 > Rasterizer3D.staticInt327 || i_13 > Rasterizer3D.staticInt327)
                Rasterizer3D.staticBool54 = true;

            if (triangleAlphaValues != null && triangleAlphaValues[i_1] != -1) {
                if (triangleSkinValues != null && triangleSkinValues[i_1] != -1) {
                    i_20 = triangleSkinValues[i_1] & 0xff;
                    i_17 = texTriangleA[i_20];
                    i_18 = texTriangleB[i_20];
                    i_19 = texTriangleC[i_20];
                } else {
                    i_17 = i_5;
                    i_18 = i_6;
                    i_19 = i_7;
                }

                if (texZ[i_1] == -1)
                    Rasterizer3D.staticMethod483(i_14, i_15, i_16, i_11, i_12, i_13, texX[i_1], texX[i_1], texX[i_1], staticIntArray142[i_17], staticIntArray142[i_18], staticIntArray142[i_19], staticIntArray143[i_17], staticIntArray143[i_18], staticIntArray143[i_19], staticIntArray144[i_17], staticIntArray144[i_18], staticIntArray144[i_19], triangleAlphaValues[i_1]);
                else
                    Rasterizer3D.staticMethod483(i_14, i_15, i_16, i_11, i_12, i_13, staticIntArray151[0], staticIntArray151[1], staticIntArray151[2], staticIntArray142[i_17], staticIntArray142[i_18], staticIntArray142[i_19], staticIntArray143[i_17], staticIntArray143[i_18], staticIntArray143[i_19], staticIntArray144[i_17], staticIntArray144[i_18], staticIntArray144[i_19], triangleAlphaValues[i_1]);
            } else if (texZ[i_1] == -1)
                Rasterizer3D.staticMethod481(i_14, i_15, i_16, i_11, i_12, i_13, staticIntArray136[texX[i_1]]);
            else
                Rasterizer3D.staticMethod479(i_14, i_15, i_16, i_11, i_12, i_13, staticIntArray151[0], staticIntArray151[1], staticIntArray151[2]);
        }

        if (i_4 == 4) {
            if (i_11 < 0 || i_12 < 0 || i_13 < 0 || i_11 > Rasterizer3D.staticInt327 || i_12 > Rasterizer3D.staticInt327 || i_13 > Rasterizer3D.staticInt327 || staticIntArray149[3] < 0 || staticIntArray149[3] > Rasterizer3D.staticInt327)
                Rasterizer3D.staticBool54 = true;

            if (triangleAlphaValues != null && triangleAlphaValues[i_1] != -1) {
                if (triangleSkinValues != null && triangleSkinValues[i_1] != -1) {
                    i_20 = triangleSkinValues[i_1] & 0xff;
                    i_17 = texTriangleA[i_20];
                    i_18 = texTriangleB[i_20];
                    i_19 = texTriangleC[i_20];
                } else {
                    i_17 = i_5;
                    i_18 = i_6;
                    i_19 = i_7;
                }

                short s_21 = triangleAlphaValues[i_1];
                if (texZ[i_1] == -1) {
                    Rasterizer3D.staticMethod483(i_14, i_15, i_16, i_11, i_12, i_13, texX[i_1], texX[i_1], texX[i_1], staticIntArray142[i_17], staticIntArray142[i_18], staticIntArray142[i_19], staticIntArray143[i_17], staticIntArray143[i_18], staticIntArray143[i_19], staticIntArray144[i_17], staticIntArray144[i_18], staticIntArray144[i_19], s_21);
                    Rasterizer3D.staticMethod483(i_14, i_16, staticIntArray150[3], i_11, i_13, staticIntArray149[3], texX[i_1], texX[i_1], texX[i_1], staticIntArray142[i_17], staticIntArray142[i_18], staticIntArray142[i_19], staticIntArray143[i_17], staticIntArray143[i_18], staticIntArray143[i_19], staticIntArray144[i_17], staticIntArray144[i_18], staticIntArray144[i_19], s_21);
                } else {
                    Rasterizer3D.staticMethod483(i_14, i_15, i_16, i_11, i_12, i_13, staticIntArray151[0], staticIntArray151[1], staticIntArray151[2], staticIntArray142[i_17], staticIntArray142[i_18], staticIntArray142[i_19], staticIntArray143[i_17], staticIntArray143[i_18], staticIntArray143[i_19], staticIntArray144[i_17], staticIntArray144[i_18], staticIntArray144[i_19], s_21);
                    Rasterizer3D.staticMethod483(i_14, i_16, staticIntArray150[3], i_11, i_13, staticIntArray149[3], staticIntArray151[0], staticIntArray151[2], staticIntArray151[3], staticIntArray142[i_17], staticIntArray142[i_18], staticIntArray142[i_19], staticIntArray143[i_17], staticIntArray143[i_18], staticIntArray143[i_19], staticIntArray144[i_17], staticIntArray144[i_18], staticIntArray144[i_19], s_21);
                }
            } else if (texZ[i_1] == -1) {
                i_17 = staticIntArray136[texX[i_1]];
                Rasterizer3D.staticMethod481(i_14, i_15, i_16, i_11, i_12, i_13, i_17);
                Rasterizer3D.staticMethod481(i_14, i_16, staticIntArray150[3], i_11, i_13, staticIntArray149[3], i_17);
            } else {
                Rasterizer3D.staticMethod479(i_14, i_15, i_16, i_11, i_12, i_13, staticIntArray151[0], staticIntArray151[1], staticIntArray151[2]);
                Rasterizer3D.staticMethod479(i_14, i_16, staticIntArray150[3], i_11, i_13, staticIntArray149[3], staticIntArray151[0], staticIntArray151[2], staticIntArray151[3]);
            }
        }

    }

}

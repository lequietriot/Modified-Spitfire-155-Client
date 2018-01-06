public final class Tile extends Node {

    int int359;
    DataClass9 dataClass9_1;
    DataClass4 tilePaint;
    DataClass10 dataClass10_1;
    WallObject wallObject;
    int int361;
    int numGameObjects;
    GroundDecoration groundDecoration;
    int int362;
    boolean bool29;
    boolean bool30;
    GroundItemPile groundItemPile;
    int int363;
    int int364;
    boolean bool31;
    Tile groundTile;
    GameObject[] gameObjects = new GameObject[5];
    int[] gameObjectFlags = new int[5];
    int flags = 0;
    int int365;
    int int360;
    int x;
    int y;

    Tile(int i_1, int i_2, int i_3) {
        int360 = int365 = i_1;
        x = i_2;
        y = i_3;
    }

}

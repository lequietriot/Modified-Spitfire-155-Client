public class GameType implements Enum {

    public static final GameType staticGameType3 = new GameType("runescape", "RuneScape", 0);
    public static final GameType staticGameType2 = new GameType("stellardawn", "Stellar Dawn", 1);
    public static final GameType staticGameType6 = new GameType("game3", "Game 3", 2);
    public static final GameType staticGameType1 = new GameType("game4", "Game 4", 3);
    public static final GameType staticGameType4 = new GameType("game5", "Game 5", 4);
    public static final GameType staticGameType5 = new GameType("oldscape", "RuneScape 2007", 5);
    public final String string13;
    final int int254;

    GameType(String string_1, String string_2, int i_3) {
        string13 = string_1;
        int254 = i_3;
    }

    @Override
    public int ordinal() {
        return int254;
    }

}

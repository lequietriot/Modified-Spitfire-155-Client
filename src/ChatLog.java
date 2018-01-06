public class ChatLog {

    static int staticInt69;
    public static char staticChar1;
    ChatLine[] chatLines = new ChatLine[100];
    int size;

    ChatLine addLine(int i_1, String string_2, String string_3, String string_4) {
        ChatLine chatline_6 = chatLines[99];

        for (int i_7 = size; i_7 > 0; --i_7)
            if (i_7 != 100)
                chatLines[i_7] = chatLines[i_7 - 1];

        if (chatline_6 == null)
            chatline_6 = new ChatLine(i_1, string_2, string_4, string_3);
        else {
            chatline_6.unlink();
            chatline_6.unlinkCacheable();
            chatline_6.setValues(i_1, string_2, string_4, string_3);
        }

        chatLines[0] = chatline_6;
        if (size < 100)
            ++size;

        return chatline_6;
    }

    ChatLine get(int i_1) {
        return i_1 >= 0 && i_1 < size ? chatLines[i_1] : null;
    }

    int size() {
        return size;
    }

}

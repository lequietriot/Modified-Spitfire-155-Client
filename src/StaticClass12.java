import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StaticClass12 {

    public static BufferedFile[] staticBufferedFileArray1;
    static int staticInt55;
    static final Map staticMap1 = new HashMap();
    static final ParamList staticParamList1 = new ParamList(1024);
    static final ChatLineList staticChatLineList1 = new ChatLineList();
    static int staticInt54 = 0;

    StaticClass12() throws Throwable {
        throw new Error();
    }

    static int staticMethod58() {
        return staticInt54++;
    }

    static void staticMethod59(int i_0, String string_1, String string_2) {
        staticMethod60(i_0, string_1, string_2, (String) null);
    }

    static void staticMethod60(int i_0, String string_1, String string_2, String string_3) {
        ChatLog chatlog_5 = (ChatLog) staticMap1.get(Integer.valueOf(i_0));
        if (chatlog_5 == null) {
            chatlog_5 = new ChatLog();
            staticMap1.put(Integer.valueOf(i_0), chatlog_5);
        }

        ChatLine chatline_6 = chatlog_5.addLine(i_0, string_1, string_2, string_3);
        staticParamList1.method248(chatline_6, chatline_6.int483);
        staticChatLineList1.method290(chatline_6);
        Client.staticInt290 = Client.staticInt256;
    }

    static int staticMethod61(int i_0) {
        ChatLine chatline_2 = (ChatLine) staticParamList1.method247(i_0);
        return chatline_2 == null ? -1 : staticChatLineList1.cacheable4 == chatline_2.prev ? -1 : ((ChatLine) chatline_2.prev).int483;
    }

    static String staticMethod62() {
        String str_1 = "";

        ChatLine chatline_3;
        for (Iterator iterator_2 = staticParamList1.iterator(); iterator_2.hasNext(); str_1 = str_1 + chatline_3.string35 + ':' + chatline_3.string37 + '\n')
            chatline_3 = (ChatLine) iterator_2.next();

        return str_1;
    }

}

public class FontDescriptor {

    public static final FontDescriptor staticFontDescriptor5 = new FontDescriptor("PLAIN11", "p11_full");
    public static final FontDescriptor staticFontDescriptor1 = new FontDescriptor("PLAIN12", "p12_full");
    public static final FontDescriptor staticFontDescriptor2 = new FontDescriptor("BOLD12", "b12_full");
    public static final FontDescriptor staticFontDescriptor3 = new FontDescriptor("VERDANA11", "verdana_11pt_regular");
    public static final FontDescriptor staticFontDescriptor4 = new FontDescriptor("VERDANA13", "verdana_13pt_regular");
    public static final FontDescriptor staticFontDescriptor6 = new FontDescriptor("VERDANA15", "verdana_15pt_regular");
    final String desc;
    String filename;

    public static FontDescriptor[] staticMethod222() {
        return new FontDescriptor[] { staticFontDescriptor4, staticFontDescriptor3, staticFontDescriptor1, staticFontDescriptor2, staticFontDescriptor6, staticFontDescriptor5 };
    }

    FontDescriptor(String string_1, String string_2) {
        desc = string_1;
        filename = string_2;
    }

}

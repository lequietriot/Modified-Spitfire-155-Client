import java.util.HashMap;

public class FontLoader {

    Js5Index js5Index3;
    Js5Index js5Index2;
    HashMap hashMap6;

    public FontLoader(Js5Index js5index_1, Js5Index js5index_2) {
        js5Index3 = js5index_1;
        js5Index2 = js5index_2;
        hashMap6 = new HashMap();
    }

    public HashMap loadFonts(FontDescriptor[] arr_1) {
        HashMap hashmap_3 = new HashMap();
        FontDescriptor[] arr_4 = arr_1;

        for (int i_5 = 0; i_5 < arr_4.length; i_5++) {
            FontDescriptor fontdescriptor_6 = arr_4[i_5];
            if (hashMap6.containsKey(fontdescriptor_6))
                hashmap_3.put(fontdescriptor_6, hashMap6.get(fontdescriptor_6));
            else {
                FontFace fontface_7 = StaticClass59.staticMethod238(js5Index3, js5Index2, fontdescriptor_6.filename, "");
                if (fontface_7 != null) {
                    hashMap6.put(fontdescriptor_6, fontface_7);
                    hashmap_3.put(fontdescriptor_6, fontface_7);
                }
            }
        }

        return hashmap_3;
    }

}

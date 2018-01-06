import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class ClientPreferences {

    static int staticInt56 = 6;
    int int104 = 1;
    String string11 = null;
    boolean bool12 = false;
    LinkedHashMap linkedHashMap1 = new LinkedHashMap();
    boolean bool11;
    boolean bool10;

    ClientPreferences() {
        method142(true);
    }

    ClientPreferences(Buffer buffer_1) {
        if (buffer_1 != null && buffer_1.buf != null) {
            int i_2 = buffer_1.readUByte();
            if (i_2 >= 0 && i_2 <= 6) {
                if (buffer_1.readUByte() == 1)
                    bool11 = true;

                if (i_2 > 1)
                    bool10 = buffer_1.readUByte() == 1;

                if (i_2 > 3)
                    int104 = buffer_1.readUByte();

                if (i_2 > 2) {
                    int i_3 = buffer_1.readUByte();

                    for (int i_4 = 0; i_4 < i_3; i_4++) {
                        int i_5 = buffer_1.readInt();
                        int i_6 = buffer_1.readInt();
                        linkedHashMap1.put(Integer.valueOf(i_5), Integer.valueOf(i_6));
                    }
                }

                if (i_2 > 4)
                    string11 = buffer_1.method447();

                if (i_2 > 5)
                    bool12 = buffer_1.method446();
            } else
                method142(true);
        } else
            method142(true);

    }

    void method142(boolean bool_1) {
    }

    Buffer method143() {
        Buffer buffer_2 = new Buffer(100);
        buffer_2.writeByte(6);
        buffer_2.writeByte(bool11 ? 1 : 0);
        buffer_2.writeByte(bool10 ? 1 : 0);
        buffer_2.writeByte(int104);
        buffer_2.writeByte(linkedHashMap1.size());
        Iterator iterator_3 = linkedHashMap1.entrySet().iterator();

        while (iterator_3.hasNext()) {
            Entry map$entry_4 = (Entry) iterator_3.next();
            buffer_2.writeInt(((Integer) map$entry_4.getKey()).intValue());
            buffer_2.writeInt(((Integer) map$entry_4.getValue()).intValue());
        }

        buffer_2.method430(string11 != null ? string11 : "");
        buffer_2.method429(bool12);
        return buffer_2;
    }

    static void staticMethod63() {
        FileOnDisk fileondisk_1 = null;

        try {
            fileondisk_1 = StaticClass16.staticMethod111("", Client.staticGameType7.string13, true);
            Buffer buffer_2 = StaticClass61.staticClientPreferences1.method143();
            fileondisk_1.write(buffer_2.buf, 0, buffer_2.off);
        } catch (Exception exception_4) {
            ;
        }

        try {
            if (fileondisk_1 != null)
                fileondisk_1.method176(true);
        } catch (Exception exception_3) {
            ;
        }

    }

}

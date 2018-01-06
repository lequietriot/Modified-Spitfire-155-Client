import java.util.Iterator;
import java.util.LinkedList;

public class WorldMapAreaDescriptor {

    int int59 = -1;
    int int60 = -1;
    int int61 = -1;
    WorldMapCoord worldMapCoord5 = null;
    int int62 = Integer.MAX_VALUE;
    int int63 = 0;
    int int64 = Integer.MAX_VALUE;
    int int65 = 0;
    boolean bool3 = false;
    String filename;
    String name;
    LinkedList linkedList2;

    public void method64(Buffer buffer_1, int i_2) {
        int59 = i_2;
        filename = buffer_1.method448();
        name = buffer_1.method448();
        worldMapCoord5 = new WorldMapCoord(buffer_1.readInt());
        int60 = buffer_1.readInt();
        buffer_1.readUByte();
        bool3 = buffer_1.readUByte() == 1;
        int61 = buffer_1.readUByte();
        int i_4 = buffer_1.readUByte();
        linkedList2 = new LinkedList();

        for (int i_5 = 0; i_5 < i_4; i_5++)
            linkedList2.add(method65(buffer_1));

        method70();
    }

    WMUnknown method65(Buffer buffer_1) {
        int i_3 = buffer_1.readUByte();
        WMEnum5 wmenum5_4 = (WMEnum5) StaticClass26.staticMethod155(WMEnum5.staticMethod1(), i_3);
        Object obj_5 = null;
        switch (wmenum5_4.int38) {
        case 0:
            obj_5 = new WMUnknown2();
            break;
        case 1:
            obj_5 = new WMUnknown3();
            break;
        case 2:
            obj_5 = new Class1();
            break;
        case 3:
            obj_5 = new Class2();
            break;
        default:
            throw new IllegalStateException("");
        }

        ((WMUnknown) obj_5).method6(buffer_1);
        return (WMUnknown) obj_5;
    }

    public boolean method66(int i_1, int i_2, int i_3) {
        Iterator iterator_5 = linkedList2.iterator();

        WMUnknown wmunknown_6;
        do {
            if (!iterator_5.hasNext())
                return false;

            wmunknown_6 = (WMUnknown) iterator_5.next();
        } while (!wmunknown_6.method2(i_1, i_2, i_3));

        return true;
    }

    public boolean method67(int i_1, int i_2) {
        int i_4 = i_1 / 64;
        int i_5 = i_2 / 64;
        if (i_4 >= int62 && i_4 <= int63) {
            if (i_5 >= int64 && i_5 <= int65) {
                Iterator iterator_6 = linkedList2.iterator();

                WMUnknown wmunknown_7;
                do {
                    if (!iterator_6.hasNext())
                        return false;

                    wmunknown_7 = (WMUnknown) iterator_6.next();
                } while (!wmunknown_7.method3(i_1, i_2));

                return true;
            } else
                return false;
        } else
            return false;
    }

    public int[] method68(int i_1, int i_2, int i_3) {
        Iterator iterator_5 = linkedList2.iterator();

        WMUnknown wmunknown_6;
        do {
            if (!iterator_5.hasNext())
                return null;

            wmunknown_6 = (WMUnknown) iterator_5.next();
        } while (!wmunknown_6.method2(i_1, i_2, i_3));

        return wmunknown_6.method4(i_1, i_2, i_3);
    }

    public WorldMapCoord method69(int i_1, int i_2) {
        Iterator iterator_4 = linkedList2.iterator();

        WMUnknown wmunknown_5;
        do {
            if (!iterator_4.hasNext())
                return null;

            wmunknown_5 = (WMUnknown) iterator_4.next();
        } while (!wmunknown_5.method3(i_1, i_2));

        return wmunknown_5.method5(i_1, i_2);
    }

    void method70() {
        Iterator iterator_2 = linkedList2.iterator();

        while (iterator_2.hasNext()) {
            WMUnknown wmunknown_3 = (WMUnknown) iterator_2.next();
            wmunknown_3.method1(this);
        }

    }

    public int method71() {
        return int59;
    }

    public boolean method72() {
        return bool3;
    }

    public String filename() {
        return filename;
    }

    public String name() {
        return name;
    }

    int method73() {
        return int60;
    }

    public int method74() {
        return int61;
    }

    public int getX() {
        return int62;
    }

    public int method75() {
        return int63;
    }

    public int getY() {
        return int64;
    }

    public int method76() {
        return int65;
    }

    public int method77() {
        return worldMapCoord5.int262;
    }

    public int method78() {
        return worldMapCoord5.int261;
    }

    public int method79() {
        return worldMapCoord5.int260;
    }

    public WorldMapCoord method80() {
        return new WorldMapCoord(worldMapCoord5);
    }

}

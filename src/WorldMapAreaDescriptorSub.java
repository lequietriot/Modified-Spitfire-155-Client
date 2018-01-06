import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class WorldMapAreaDescriptorSub extends WorldMapAreaDescriptor {

    HashSet hashSet8;
    HashSet hashSet7;
    List list4;

    void method386(Buffer buffer_1, Buffer buffer_2, Buffer buffer_3, int i_4, boolean bool_5) {
        method64(buffer_1, i_4);
        int i_7 = buffer_3.readUShort();
        hashSet8 = new HashSet(i_7);

        int i_8;
        for (i_8 = 0; i_8 < i_7; i_8++) {
            WorldMapRegionStorageSub1 worldmapregionstoragesub1_9 = new WorldMapRegionStorageSub1();

            try {
                worldmapregionstoragesub1_9.method514(buffer_2, buffer_3);
            } catch (IllegalStateException illegalstateexception_13) {
                continue;
            }

            hashSet8.add(worldmapregionstoragesub1_9);
        }

        i_8 = buffer_3.readUShort();
        hashSet7 = new HashSet(i_8);

        for (int i_14 = 0; i_14 < i_8; i_14++) {
            WorldMapRegionStorageSub2 worldmapregionstoragesub2_10 = new WorldMapRegionStorageSub2();

            try {
                worldmapregionstoragesub2_10.method388(buffer_2, buffer_3);
            } catch (IllegalStateException illegalstateexception_12) {
                continue;
            }

            hashSet7.add(worldmapregionstoragesub2_10);
        }

        method387(buffer_2, bool_5);
    }

    void method387(Buffer buffer_1, boolean bool_2) {
        list4 = new LinkedList();
        int i_4 = buffer_1.readUShort();

        for (int i_5 = 0; i_5 < i_4; i_5++) {
            int i_6 = buffer_1.method455();
            WorldMapCoord worldmapcoord_7 = new WorldMapCoord(buffer_1.readInt());
            boolean bool_8 = buffer_1.readUByte() == 1;
            if (bool_2 || !bool_8)
                list4.add(new WM3(i_6, worldmapcoord_7));
        }

    }

}

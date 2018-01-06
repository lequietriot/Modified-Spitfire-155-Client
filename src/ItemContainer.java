public class ItemContainer extends Node {

    static FontLoader staticFontLoader1;
    static int staticInt160;
    static HashTable staticHashTable5 = new HashTable(32);
    int[] itemIds = new int[] { -1 };
    int[] itemQuantities = new int[] { 0 };

    static int staticMethod250(int i_0, int i_1) {
        ItemContainer itemcontainer_3 = (ItemContainer) staticHashTable5.get(i_0);
        return itemcontainer_3 == null ? -1 : i_1 >= 0 && i_1 < itemcontainer_3.itemIds.length ? itemcontainer_3.itemIds[i_1] : -1;
    }

    static void staticMethod251(int i_0, int i_1, int i_2, int i_3) {
        ItemContainer itemcontainer_5 = (ItemContainer) staticHashTable5.get(i_0);
        if (itemcontainer_5 == null) {
            itemcontainer_5 = new ItemContainer();
            staticHashTable5.put(itemcontainer_5, i_0);
        }

        if (itemcontainer_5.itemIds.length <= i_1) {
            int[] ints_6 = new int[i_1 + 1];
            int[] ints_7 = new int[i_1 + 1];

            int i_8;
            for (i_8 = 0; i_8 < itemcontainer_5.itemIds.length; i_8++) {
                ints_6[i_8] = itemcontainer_5.itemIds[i_8];
                ints_7[i_8] = itemcontainer_5.itemQuantities[i_8];
            }

            for (i_8 = itemcontainer_5.itemIds.length; i_8 < i_1; i_8++) {
                ints_6[i_8] = -1;
                ints_7[i_8] = 0;
            }

            itemcontainer_5.itemIds = ints_6;
            itemcontainer_5.itemQuantities = ints_7;
        }

        itemcontainer_5.itemIds[i_1] = i_2;
        itemcontainer_5.itemQuantities[i_1] = i_3;
    }

}

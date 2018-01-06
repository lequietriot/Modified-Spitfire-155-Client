public abstract class Actor extends Renderable {

    int int609;
    int int610;
    int int613;
    int int614;
    boolean bool70;
    int int619;
    int int622;
    int int626;
    int int630;
    int int632;
    int int635;
    int int636;
    int int639;
    int int641;
    static int staticInt318;
    boolean bool69 = false;
    int tiles = 1;
    int idle = -1;
    int unknown2 = -1;
    int int612 = -1;
    int walk = -1;
    int reverse = -1;
    int counterclockwise = -1;
    int clockwise = -1;
    int run = -1;
    String string43 = null;
    boolean bool71 = false;
    int int615 = 100;
    int int616 = 0;
    int int617 = 0;
    byte byte5 = 0;
    int[] intArray102 = new int[4];
    int[] intArray98 = new int[4];
    int[] intArray101 = new int[4];
    int[] intArray99 = new int[4];
    int[] intArray100 = new int[4];
    HitMarkList hitMarkList3 = new HitMarkList();
    int int620 = -1;
    boolean bool72 = false;
    int int621 = -1;
    int stance = -1;
    int int618 = 0;
    int int623 = 0;
    int anim = -1;
    int int624 = 0;
    int int608 = 0;
    int int628 = 0;
    int int627 = 0;
    int int640 = -1;
    int int631 = 0;
    int int629 = 0;
    int int637 = 0;
    int int638 = 200;
    int int634 = 0;
    int ubn = 32;
    int int611 = 0;
    int[] intArray103 = new int[10];
    int[] intArray104 = new int[10];
    byte[] byteArray12 = new byte[10];
    int int633 = 0;
    int int625 = 0;

    final void method608() {
        int611 = 0;
        int625 = 0;
    }

    boolean method609() {
        return false;
    }

    final void method610(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        boolean bool_8 = true;
        boolean bool_9 = true;

        int i_10;
        for (i_10 = 0; i_10 < 4; i_10++)
            if (intArray101[i_10] > i_5)
                bool_8 = false;
            else
                bool_9 = false;

        i_10 = -1;
        int i_11 = -1;
        int i_12 = 0;
        if (i_1 >= 0) {
            Config32 config32_13 = Config32.staticMethod419(i_1);
            i_11 = config32_13.int571;
            i_12 = config32_13.int560;
        }

        int i_15;
        if (bool_9) {
            if (i_11 == -1)
                return;

            i_10 = 0;
            i_15 = 0;
            if (i_11 == 0)
                i_15 = intArray101[0];
            else if (i_11 == 1)
                i_15 = intArray98[0];

            for (int i_14 = 1; i_14 < 4; i_14++)
                if (i_11 == 0) {
                    if (intArray101[i_14] < i_15) {
                        i_10 = i_14;
                        i_15 = intArray101[i_14];
                    }
                } else if (i_11 == 1 && intArray98[i_14] < i_15) {
                    i_10 = i_14;
                    i_15 = intArray98[i_14];
                }

            if (i_11 == 1 && i_15 >= i_2)
                return;
        } else {
            if (bool_8)
                byte5 = 0;

            for (i_15 = 0; i_15 < 4; i_15++) {
                byte b_16 = byte5;
                byte5 = (byte) ((byte5 + 1) % 4);
                if (intArray101[b_16] <= i_5) {
                    i_10 = b_16;
                    break;
                }
            }
        }

        if (i_10 >= 0) {
            intArray102[i_10] = i_1;
            intArray98[i_10] = i_2;
            intArray99[i_10] = i_3;
            intArray100[i_10] = i_4;
            intArray101[i_10] = i_5 + i_12 + i_6;
        }
    }

    final void method611(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        HealthBarType healthbartype_8 = HealthBarType.staticMethod437(i_1);
        HealthBar healthbar_9 = null;
        HealthBar healthbar_10 = null;
        int i_11 = healthbartype_8.int599;
        int i_12 = 0;

        HealthBar healthbar_13;
        for (healthbar_13 = (HealthBar) hitMarkList3.method285(); healthbar_13 != null; healthbar_13 = (HealthBar) hitMarkList3.method287()) {
            ++i_12;
            if (healthbartype_8.int596 == healthbar_13.healthBarType1.int596) {
                healthbar_13.method411(i_4 + i_2, i_5, i_6, i_3);
                return;
            }

            if (healthbar_13.healthBarType1.int595 <= healthbartype_8.int595)
                healthbar_9 = healthbar_13;

            if (healthbar_13.healthBarType1.int599 > i_11) {
                healthbar_10 = healthbar_13;
                i_11 = healthbar_13.healthBarType1.int599;
            }
        }

        if (healthbar_10 != null || i_12 < 4) {
            healthbar_13 = new HealthBar(healthbartype_8);
            if (healthbar_9 == null)
                hitMarkList3.method283(healthbar_13);
            else
                HitMarkList.staticMethod163(healthbar_13, healthbar_9);

            healthbar_13.method411(i_4 + i_2, i_5, i_6, i_3);
            if (i_12 >= 4)
                healthbar_10.unlink();

        }
    }

    final void method612(int i_1) {
        HealthBarType healthbartype_3 = HealthBarType.staticMethod437(i_1);

        for (HealthBar healthbar_4 = (HealthBar) hitMarkList3.method285(); healthbar_4 != null; healthbar_4 = (HealthBar) hitMarkList3.method287())
            if (healthbar_4.healthBarType1 == healthbartype_3) {
                healthbar_4.unlink();
                return;
            }

    }

}

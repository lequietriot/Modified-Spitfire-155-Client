import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

public class HealthBar extends Node {

    static SequenceSub1 staticSequenceSub1_1;
    HitMarkList hitMarkList2 = new HitMarkList();
    HealthBarType healthBarType1;

    HealthBar(HealthBarType healthbartype_1) {
        healthBarType1 = healthbartype_1;
    }

    void method411(int i_1, int i_2, int i_3, int i_4) {
        HitMark hitmark_6 = null;
        int i_7 = 0;

        for (HitMark hitmark_8 = (HitMark) hitMarkList2.method285(); hitmark_8 != null; hitmark_8 = (HitMark) hitMarkList2.method287()) {
            ++i_7;
            if (i_1 == hitmark_8.int319) {
                hitmark_8.method396(i_1, i_2, i_3, i_4);
                return;
            }

            if (hitmark_8.int319 <= i_1)
                hitmark_6 = hitmark_8;
        }

        if (hitmark_6 == null) {
            if (i_7 < 4)
                hitMarkList2.method283(new HitMark(i_1, i_2, i_3, i_4));

        } else {
            HitMarkList.staticMethod163(new HitMark(i_1, i_2, i_3, i_4), hitmark_6);
            if (i_7 >= 4)
                hitMarkList2.method285().unlink();

        }
    }

    HitMark method412(int i_1) {
        HitMark hitmark_3 = (HitMark) hitMarkList2.method285();
        if (hitmark_3 != null && hitmark_3.int319 <= i_1) {
            for (HitMark hitmark_4 = (HitMark) hitMarkList2.method287(); hitmark_4 != null && hitmark_4.int319 <= i_1; hitmark_4 = (HitMark) hitMarkList2.method287()) {
                hitmark_3.unlink();
                hitmark_3 = hitmark_4;
            }

            if (healthBarType1.int601 + hitmark_3.int319 + hitmark_3.int321 > i_1)
                return hitmark_3;
            else {
                hitmark_3.unlink();
                return null;
            }
        } else
            return null;
    }

    boolean method413() {
        return hitMarkList2.method288();
    }

    static String staticMethod368(Throwable throwable_0) throws IOException {
        String str_2;
        if (throwable_0 instanceof ClientError) {
            ClientError clienterror_3 = (ClientError) throwable_0;
            str_2 = clienterror_3.string12 + " | ";
            throwable_0 = clienterror_3.throwable1;
        } else
            str_2 = "";

        StringWriter stringwriter_13 = new StringWriter();
        PrintWriter printwriter_4 = new PrintWriter(stringwriter_13);
        throwable_0.printStackTrace(printwriter_4);
        printwriter_4.close();
        String string_5 = stringwriter_13.toString();
        BufferedReader bufferedreader_6 = new BufferedReader(new StringReader(string_5));
        String string_7 = bufferedreader_6.readLine();

        while (true)
            while (true) {
                String string_8 = bufferedreader_6.readLine();
                if (string_8 == null) {
                    str_2 = str_2 + "| " + string_7;
                    return str_2;
                }

                int i_9 = string_8.indexOf(40);
                int i_10 = string_8.indexOf(41, i_9 + 1);
                if (i_9 >= 0 && i_10 >= 0) {
                    String string_11 = string_8.substring(i_9 + 1, i_10);
                    int i_12 = string_11.indexOf(".java:");
                    if (i_12 >= 0) {
                        string_11 = string_11.substring(0, i_12) + string_11.substring(i_12 + 5);
                        str_2 = str_2 + string_11 + ' ';
                        continue;
                    }

                    string_8 = string_8.substring(0, i_9);
                }

                string_8 = string_8.trim();
                string_8 = string_8.substring(string_8.lastIndexOf(32) + 1);
                string_8 = string_8.substring(string_8.lastIndexOf(9) + 1);
                str_2 = str_2 + string_8 + ' ';
            }
    }

}

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

public class StaticClass22 {

    public static File staticFile3;
    public static boolean staticBool17 = false;
    static Hashtable staticHashtable1 = new Hashtable(16);

    StaticClass22() throws Throwable {
        throw new Error();
    }

    public static File staticMethod139(String string_0) {
        if (!staticBool17)
            throw new RuntimeException("");
        else {
            File file_2 = (File) staticHashtable1.get(string_0);
            if (file_2 != null)
                return file_2;
            else {
                File file_3 = new File(staticFile3, string_0);
                RandomAccessFile randomaccessfile_4 = null;

                try {
                    File file_5 = new File(file_3.getParent());
                    if (!file_5.exists())
                        throw new RuntimeException("");
                    else {
                        randomaccessfile_4 = new RandomAccessFile(file_3, "rw");
                        int i_6 = randomaccessfile_4.read();
                        randomaccessfile_4.seek(0L);
                        randomaccessfile_4.write(i_6);
                        randomaccessfile_4.seek(0L);
                        randomaccessfile_4.close();
                        staticHashtable1.put(string_0, file_3);
                        return file_3;
                    }
                } catch (Exception exception_8) {
                    try {
                        if (randomaccessfile_4 != null) {
                            randomaccessfile_4.close();
                            randomaccessfile_4 = null;
                        }
                    } catch (Exception exception_7) {
                        ;
                    }

                    throw new RuntimeException();
                }
            }
        }
    }

}

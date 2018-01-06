import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class StaticClass48 {

    public static HitMarkList staticHitMarkList2 = new HitMarkList();

    StaticClass48() throws Throwable {
        throw new Error();
    }

    public static void staticMethod202() {
        staticHitMarkList2 = new HitMarkList();
    }

    public static boolean staticMethod203() {
        Config34 config34_1 = (Config34) staticHitMarkList2.method285();
        return config34_1 != null;
    }

    public static void staticMethod204(Packet packet_0) {
        Config34 config34_2 = (Config34) staticHitMarkList2.method285();
        if (config34_2 != null) {
            int i_3 = packet_0.off;
            packet_0.writeInt(config34_2.int464);

            for (int i_4 = 0; i_4 < config34_2.int465; i_4++)
                if (config34_2.intArray61[i_4] != 0)
                    packet_0.writeByte(config34_2.intArray61[i_4]);
                else
                    try {
                        int i_5 = config34_2.intArray62[i_4];
                        Field field_6;
                        int i_7;
                        if (i_5 == 0) {
                            field_6 = config34_2.fieldArray1[i_4];
                            i_7 = field_6.getInt((Object) null);
                            packet_0.writeByte(0);
                            packet_0.writeInt(i_7);
                        } else if (i_5 == 1) {
                            field_6 = config34_2.fieldArray1[i_4];
                            field_6.setInt((Object) null, config34_2.intArray63[i_4]);
                            packet_0.writeByte(0);
                        } else if (i_5 == 2) {
                            field_6 = config34_2.fieldArray1[i_4];
                            i_7 = field_6.getModifiers();
                            packet_0.writeByte(0);
                            packet_0.writeInt(i_7);
                        }

                        Method method_23;
                        if (i_5 != 3) {
                            if (i_5 == 4) {
                                method_23 = config34_2.methodArray1[i_4];
                                i_7 = method_23.getModifiers();
                                packet_0.writeByte(0);
                                packet_0.writeInt(i_7);
                            }
                        } else {
                            method_23 = config34_2.methodArray1[i_4];
                            byte[][] bytes_24 = config34_2.byteArrayArrayArray4[i_4];
                            Object[] arr_8 = new Object[bytes_24.length];

                            for (int i_9 = 0; i_9 < bytes_24.length; i_9++) {
                                ObjectInputStream objectinputstream_10 = new ObjectInputStream(new ByteArrayInputStream(bytes_24[i_9]));
                                arr_8[i_9] = objectinputstream_10.readObject();
                            }

                            Object object_25 = method_23.invoke((Object) null, arr_8);
                            if (object_25 == null)
                                packet_0.writeByte(0);
                            else if (object_25 instanceof Number) {
                                packet_0.writeByte(1);
                                packet_0.writeLong(((Number) object_25).longValue());
                            } else if (object_25 instanceof String) {
                                packet_0.writeByte(2);
                                packet_0.method430((String) object_25);
                            } else
                                packet_0.writeByte(4);
                        }
                    } catch (ClassNotFoundException classnotfoundexception_11) {
                        packet_0.writeByte(-10);
                    } catch (InvalidClassException invalidclassexception_12) {
                        packet_0.writeByte(-11);
                    } catch (StreamCorruptedException streamcorruptedexception_13) {
                        packet_0.writeByte(-12);
                    } catch (OptionalDataException optionaldataexception_14) {
                        packet_0.writeByte(-13);
                    } catch (IllegalAccessException illegalaccessexception_15) {
                        packet_0.writeByte(-14);
                    } catch (IllegalArgumentException illegalargumentexception_16) {
                        packet_0.writeByte(-15);
                    } catch (InvocationTargetException invocationtargetexception_17) {
                        packet_0.writeByte(-16);
                    } catch (SecurityException securityexception_18) {
                        packet_0.writeByte(-17);
                    } catch (IOException ioexception_19) {
                        packet_0.writeByte(-18);
                    } catch (NullPointerException nullpointerexception_20) {
                        packet_0.writeByte(-19);
                    } catch (Exception exception_21) {
                        packet_0.writeByte(-20);
                    } catch (Throwable throwable_22) {
                        packet_0.writeByte(-21);
                    }

            packet_0.method462(i_3);
            config34_2.unlink();
        }
    }

    public static Class staticMethod205(String string_0) throws ClassNotFoundException {
        return string_0.equals("B") ? Byte.TYPE : string_0.equals("I") ? Integer.TYPE : string_0.equals("S") ? Short.TYPE : string_0.equals("J") ? Long.TYPE : string_0.equals("Z") ? Boolean.TYPE : string_0.equals("F") ? Float.TYPE : string_0.equals("D") ? Double.TYPE : string_0.equals("C") ? Character.TYPE : string_0.equals("void") ? Void.TYPE : Class.forName(string_0);
    }

}

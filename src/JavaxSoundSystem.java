import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

public class JavaxSoundSystem extends SoundSystem {

    AudioFormat format;
    byte[] buf;
    SourceDataLine sdl;
    int int309;

    @Override
    protected void init() {
        format = new AudioFormat(WorldMapTile.staticInt7, 16, WorldMapLabel.staticBool1 ? 2 : 1, true, false);
        buf = new byte[256 << (WorldMapLabel.staticBool1 ? 2 : 1)];
    }

    @Override
    protected void start(int i_1) throws LineUnavailableException {
        try {
            Info dataline$info_3 = new Info(SourceDataLine.class, format, i_1 << (WorldMapLabel.staticBool1 ? 2 : 1));
            sdl = (SourceDataLine) AudioSystem.getLine(dataline$info_3);
            sdl.open();
            sdl.start();
            int309 = i_1;
        } catch (LineUnavailableException lineunavailableexception_4) {
            if (StaticClass25.staticMethod148(i_1) != 1)
                start(StaticClass25.staticMethod149(i_1));
            else {
                sdl = null;
                throw lineunavailableexception_4;
            }
        }
    }

    @Override
    protected int available() {
        return int309 - (sdl.available() >> (WorldMapLabel.staticBool1 ? 2 : 1));
    }

    @Override
    protected void flush() {
        int i_1 = 256;
        if (WorldMapLabel.staticBool1)
            i_1 <<= 1;

        for (int i_2 = 0; i_2 < i_1; i_2++) {
            int i_3 = intArray19[i_2];
            if ((i_3 + 8388608 & ~0xffffff) != 0)
                i_3 = 0x7fffff ^ i_3 >> 31;

            buf[i_2 * 2] = (byte) (i_3 >> 8);
            buf[1 + i_2 * 2] = (byte) (i_3 >> 16);
        }

        sdl.write(buf, 0, i_1 << 1);
    }

    @Override
    protected void close() {
        if (sdl != null) {
            sdl.close();
            sdl = null;
        }

    }

    @Override
    protected void flushLine() {
        sdl.flush();
    }

}

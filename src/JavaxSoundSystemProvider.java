public class JavaxSoundSystemProvider implements SoundSystemProvider {

    static Task staticTask2;
    static int staticInt10;
    static Js5IndexImpl staticJs5IndexImpl3;
    static long staticLong1;

    @Override
    public SoundSystem getSoundSystem() {
        return new JavaxSoundSystem();
    }

}

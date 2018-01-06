import com.alex.store.Index;

public abstract class Renderable extends Cacheable {

    static Index staticJs5IndexImpl15;
    static Mus9 staticMus9_1;
    public int modelHeight = 1000;

    void renderAt(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
        Model model_10 = getModel();
        if (model_10 != null) {
            modelHeight = model_10.modelHeight;
            model_10.renderAt(i_1, i_2, i_3, i_4, i_5, i_6, i_7, i_8, i_9);
        }

    }

    protected Model getModel() {
        return null;
    }

}

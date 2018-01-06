import java.io.IOException;
import com.alex.store.Index;
import com.alex.store.Store;

public class Sound2Dumper {
	
	public static void main(String[] args) throws IOException {
	    
		Store store = new Store("./cache/");
		Index sfx1index = store.getIndexes()[4];
		Index sfx2index = store.getIndexes()[14];

		SoundBank soundbank = new SoundBank(sfx1index, sfx2index);
		soundbank.method159(1, null);
	}
}

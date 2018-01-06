import java.io.IOException;

import com.alex.store.Index;
import com.alex.store.Store;

public class Sound3Dumper {
	
	public static void main(String[] args) throws IOException {
	    
		Store store = new Store("./cache/");
		Index sfxindex = store.getIndexes()[4];
		Index sfx2index = store.getIndexes()[14];
		Index sfx3index = store.getIndexes()[15];
		
		byte[] sfx3byte = sfx3index.getFile(0);

		SoundBank soundbank = new SoundBank(sfxindex, sfx2index);
		InstrumentDef insdef = new InstrumentDef(sfx3byte);
		InstrumentDef.method490(soundbank, sfx3byte, null);
	}
}

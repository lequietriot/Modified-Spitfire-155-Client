import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import com.alex.store.Index;
import com.alex.store.Store;

public class Sound1Dumper {
	
	public static void main(String[] args) throws IOException {
	    
		Store store = new Store("./cache/");
		Index sfxindex = store.getIndexes()[4];
		
		byte[] sfx1byte = sfxindex.getFile(0);

		SoundEffect sfx = new SoundEffect(new Buffer(sfx1byte));
		
		File file = new File("./0.dat/");
		FileOutputStream fos = new FileOutputStream(file);
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.write(sfx.method131());
	}
}



import java.applet.AppletContext;
import java.applet.AppletStub;
import java.awt.Dimension;
import java.io.*;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.*;

public class Loader implements AppletStub {

	private static final HashMap<String, String> params = new HashMap<>();
	private static final HashMap<String, String> cfg = new HashMap<>();

	static {
		params.put("11", "ElZAIrq5NpKN6D3mDdihco3oPeYN2KFy2DCquj7JMmECPmLrDP3Bnw");
		params.put("12", "0");
		params.put("13", ".runescape.com");
		params.put("14", "0");
		params.put("15", "0");
		params.put("1", "false");
		params.put("2", "true");
		params.put("3", "false");
		params.put("4", "5");
		params.put("5", "0");
		params.put("6", "12479");
		params.put("7", "http://www.runescape.com/g=oldscape/slr.ws?order=LPWM");
		params.put("8", "301");
		params.put("9", "");
		params.put("10", "0");

		cfg.put("privacyurl", "http://www.jagex.com/g=oldscape/privacy/privacy.ws");
		cfg.put("window_preferredheight", "600");
		cfg.put("msg", "new_version_link=http://oldschool.runescape.com/");
		cfg.put("applet_minwidth", "765");
		cfg.put("adverturl", "http://www.runescape.com/g=oldscape/bare_advert.ws");
		cfg.put("cachedir", "oldschool");
		cfg.put("window_preferredwidth", "800");
		cfg.put("applet_maxheight", "2160");
		cfg.put("win_sub_version", "1");
		cfg.put("browsercontrol_win_x86_jar", "browsercontrol_0_-1928975093.jar");
		cfg.put("other_sub_version", "2");
		cfg.put("initial_jar", "gamepack_4840368.jar");
		cfg.put("advert_height", "96");
		cfg.put("title", "Old School RuneScape");
		cfg.put("storebase", "0");
		cfg.put("initial_class", "client.class");
		cfg.put("applet_maxwidth", "5760");
		cfg.put("download", "1230228");
		cfg.put("termsurl", "http://www.jagex.com/g=oldscape/terms/terms.ws");
		cfg.put("codebase", "http://oldschool1.runescape.com/");
		cfg.put("mac_sub_version", "2");
		cfg.put("browsercontrol_win_amd64_jar", "browsercontrol_1_1674545273.jar");
		cfg.put("applet_minheight", "503");
		cfg.put("viewerversion", "124");
	}

	private static URL codebase;
	private final static boolean RSPS = true;

	public static void main(String[] args) throws Exception {
		codebase = new URL(args.length == 0 ? RSPS ? "http://127.0.0.1" : "http://oldschool1.runescape.com" : args[0]);
		//parseParams(new URL(codebase, "jav_config.ws").openStream());
		Client game = new Client();
		game.setSize(new Dimension(Integer.parseInt(cfg.get("applet_minwidth")),
				Integer.parseInt(cfg.get("applet_minheight"))));
		game.setPreferredSize(new Dimension(Integer.parseInt(cfg.get("applet_minwidth")),
				Integer.parseInt(cfg.get("applet_minheight"))));
		game.setStub(new Loader());
		game.init();
		String title = new File(".").getCanonicalPath();
		title = title.substring(title.lastIndexOf('\\') + 1);
		JFrame frame = new JFrame(title);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setContentPane(game);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	private static void parseParams(InputStream stream) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(stream));
		String line;
		while ((line = br.readLine()) != null) {
			int idx = line.indexOf('=');
			if (idx != -1) {
				String key = line.substring(0, idx);
				String val = line.substring(idx + 1);
				if (key.equals("param")) {
					idx = val.indexOf('=');
					key = val.substring(0, idx);
					val = val.substring(idx + 1);
					params.put(key, val);
				} else {
					cfg.put(key, val);
				}
			}
		}
	}

	@Override
	public boolean isActive() {
		return false;
	}

	@Override
	public URL getDocumentBase() {
		return codebase;
	}

	@Override
	public URL getCodeBase() {
		return codebase;
	}

	@Override
	public String getParameter(String name) {
		return params.get(name);
	}

	@Override
	public AppletContext getAppletContext() {
		return null;
	}

	@Override
	public void appletResize(int width, int height) {
	}

}

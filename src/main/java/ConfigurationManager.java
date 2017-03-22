import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by radix on 3/22/17.
 */
public class ConfigurationManager {
	public static Configuration readConfiguration() {
		JSONParser parser = new JSONParser();
		try {
			Object input = parser.parse(new FileReader("config.json"));
			JSONObject configJSON = (JSONObject) input;
			return new Configuration((String) configJSON.get("emailAdress"), (String) configJSON.get("login"), (String) configJSON.get("password"), (String) configJSON.get("smtpServerAdress"), (String) configJSON.get("defaultSendAdress"));
		} catch (FileNotFoundException f) {
			System.out.println("Config file not found, creating a new one");
			return createConfig();
		} catch (ParseException f) {
			System.out.println("Config file corrupted");
		} catch (IOException f) {
			f.printStackTrace();
		}
		return null;
	}

	public static Configuration createConfig() {
		JSONObject configJSON = new JSONObject();

	}
}

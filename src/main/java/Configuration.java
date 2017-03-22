/**
 * Created by radix on 3/22/17.
 */
public class Configuration {
	String login, password, emailAdress, defaultSendAdress, smtpServerAdress;

	public Configuration(String emailAdress, String login, String password, String smtpServerAdress, String defaultSendAdress) {
		this.defaultSendAdress = defaultSendAdress;
		this.smtpServerAdress = smtpServerAdress;
		this.password = password;
		this.login = login;
		this.emailAdress = emailAdress;
	}
}

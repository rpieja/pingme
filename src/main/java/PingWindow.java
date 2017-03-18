import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * Created by radix on 3/18/17.
 */
public class PingWindow extends Application {
	public void start(Stage primaryStage) throws Exception {
		Image settingsIcon = new Image(getClass().getResourceAsStream("ic_settings_white_18dp_1x.png"));
		Image closeIcon = new Image(getClass().getResourceAsStream("ic_close_white_18dp_1x.png"));
		Image sendIcon = new Image(getClass().getResourceAsStream("ic_send_white_18dp_1x.png"));

		GridPane mainLayout = new GridPane();
		mainLayout.setPadding(new Insets(15, 15, 5, 15));
		mainLayout.setVgap(10);
		//mainLayout.setHgap(10);

		//mainLayout.setPadding(new Insets(10, 10, 10, 10));

		TextField mailSubject = new TextField();
		mailSubject.setStyle("-fx-background-color: #424242; -fx-text-fill: aliceblue");
		//mailSubject.setPadding(new Insets(10, 0, 10, 0));
		TextArea mailText = new TextArea();
		mailText.setStyle("-fx-background-insets: 0; -fx-background-color: transparent, transparent , transparent, transparent; -fx-text-fill: aliceblue");

		Button settingsButton = new Button();
		Button sendButton = new Button("Send", new ImageView(sendIcon));
		Button exitButton = new Button();
		HBox buttonBar = new HBox(sendButton, settingsButton, exitButton);
		buttonBar.setAlignment(Pos.CENTER);
		buttonBar.setSpacing(5);


		settingsButton.setGraphic(new ImageView(settingsIcon));
		exitButton.setGraphic(new ImageView(closeIcon));

		settingsButton.setStyle("-fx-base: #212121;");
		exitButton.setStyle("-fx-base: #212121;");
		sendButton.setStyle("-fx-base: #212121;");

		GridPane.setRowIndex(mailSubject, 0);
		GridPane.setRowIndex(mailText, 1);
		GridPane.setRowIndex(buttonBar, 2);

		mainLayout.setStyle("-fx-background-color: transparent");

		mainLayout.getChildren().addAll(mailSubject, mailText, buttonBar);

		Scene mainWindow = new Scene(mainLayout, 300, 280, Color.web("#303030"));
		primaryStage.setScene(mainWindow);
		primaryStage.show();

		Region region = (Region) mailText.lookup(".content");
		region.setStyle("-fx-background-color: #424242; -fx-background-insets: 0;");

	}

	static void startUI(String[] args) {
		launch(args);
	}

}

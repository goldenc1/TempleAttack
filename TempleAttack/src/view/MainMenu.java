package view;

<<<<<<< HEAD
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class MainMenu implements SceneInterface {
	
private SceneManager sceneManager;
private Scene menuScene;
private Group root;

public MainMenu(SceneManager sceneManager) {
	
	this.sceneManager = sceneManager;
	
}

	@Override
	public Scene init(int width, int height) {		

		root = new Group();	
		menuScene = new Scene(root, width, height);
		
		
		
		
		
		addStartButton();
		addAboutButton();
		addMarketButton();
		
		return menuScene;
	}
	
	private void addStartButton() {
		Button startButton = new Button();
		startButton.setText("Click to Begin Battle");
		startButton.setLayoutX(450);
		startButton.setLayoutY(150);
		startButton.setMinWidth(150);
		startButton.setMinHeight(30);
		startButton.setFont(Font.font("Verdana", 12));
		
		startButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				
				sceneManager.goToBattleScene(sceneManager);
			}
		});
		
		
		root.getChildren().add(startButton);
	}
	private void addAboutButton() {
		Button aboutButton = new Button();
		aboutButton.setText("About T.A.G Team");
		aboutButton.setLayoutX(450);
		aboutButton.setLayoutY(200);
		aboutButton.setMinWidth(150);
		aboutButton.setMinHeight(30);
		aboutButton.setFont(Font.font("Verdana", 12));
		aboutButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				
				sceneManager.goToAboutScene(sceneManager);
			}
		});
		
		root.getChildren().add(aboutButton);
	}
	
	private void addMarketButton() {
		Button marketButton = new Button();
		marketButton.setText("Market");
		marketButton.setLayoutX(450);
		marketButton.setLayoutY(250);
		marketButton.setMinWidth(150);
		marketButton.setMinHeight(30);
		marketButton.setFont(Font.font("Verdana", 12));
		
		
		root.getChildren().add(marketButton);
	}
	
=======
public class MainMenu {
>>>>>>> 23d50159ee3c8a59f7d747e69a8a754385a960db

}

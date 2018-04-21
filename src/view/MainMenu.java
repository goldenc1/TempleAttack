package view;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.text.Font;
import model.Market;

public class MainMenu implements SceneInterface {
	
private SceneManager sceneManager;
private Scene menuScene;
private Group root;


public MainMenu(SceneManager sceneManager) {
	
	this.sceneManager = sceneManager;
	
}

	@Override
	public Scene init(int width, int height, Market market) {		

		root = new Group();	
		menuScene = new Scene(root, width, height);

		
		addBackground();
		addStartButton();
		addAboutButton();
		addDifficultyButton();
		
		return menuScene;
	}
	
	private void addStartButton() {
		
		Image start = new Image ("img/start.png");
		ImageView startIV = new ImageView(start);
		startIV.setFitHeight(35);
		startIV.setFitWidth(140);
		Button startButton = new Button();
		startButton.setGraphic(startIV);
		startButton.setLayoutX((Main.SIZE_W/2)-70);
		startButton.setLayoutY(150);
		startButton.setStyle("-fx-background-color: rgba(0, 100, 100, 0); -fx-background-radius: 10;");

		
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
		
		Image about = new Image ("img/about.png");
		ImageView aboutIV = new ImageView(about);
		aboutIV.setFitHeight(35);
		aboutIV.setFitWidth(140);
		aboutButton.setGraphic(aboutIV);
		aboutButton.setLayoutX((Main.SIZE_W/2)-70);
		aboutButton.setLayoutY(200);
		aboutButton.setStyle("-fx-background-color: rgba(0, 100, 100, 0); -fx-background-radius: 10;");

		aboutButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				
				sceneManager.goToAboutScene(sceneManager);
			}
		});
		
		root.getChildren().add(aboutButton);
	}
	
	private void addDifficultyButton() {
		Button difficultyButton = new Button();
		
		Image difficulty = new Image ("img/difficulty.png");
		ImageView difficultyIV = new ImageView(difficulty);
		difficultyIV.setFitHeight(35);
		difficultyIV.setFitWidth(140);
		difficultyButton.setLayoutX((Main.SIZE_W/2)-70);
		difficultyButton.setLayoutY(250);
		difficultyButton.setGraphic(difficultyIV);
		difficultyButton.setStyle("-fx-background-color: rgba(0, 100, 100, 0); -fx-background-radius: 10;");
		
		difficultyButton.setOnAction((ActionEvent e)->{
				sceneManager.goToMarketScene(sceneManager);
			
		});
		
		root.getChildren().add(difficultyButton);
	}
	
	private void addBackground() {
		//load the image
			Image background = new Image("img/mainscreen.jpg");
			ImagePattern background1 = new ImagePattern(background);
			System.out.println("Is Loaded: " +background.isError());
			ImageView iv = new ImageView();
			iv.setImage(background);
		
			menuScene.setFill(background1);
			
			

	        
		    
		}
}

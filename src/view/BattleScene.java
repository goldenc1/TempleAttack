package view;
import java.io.File;
import java.nio.file.Paths;

import javax.swing.ImageIcon;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.util.Duration;
import model.Unit;
import javafx.scene.control.TextField;
import javafx.scene.paint.ImagePattern;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class BattleScene implements SceneInterface {
	
	private SceneManager sceneManager;
	private Scene battleScene;
	private Group root;
	boolean soundCheck;
	
	
	public BattleScene(SceneManager sceneManager) {
		
		this.sceneManager = sceneManager;
		
	}
	
	
	@Override
	public Scene init(int width, int height) {
		
		root = new Group();
		
		battleScene = new Scene(root, width, height);
	
		
	
		addUnitButtons();
		addText();
		addBackground();
		
		return battleScene;
	}
	
	private void startBattle(){
		//TODO
	}
	
	public void animate(Node unit, int x){
		TranslateTransition trans = new TranslateTransition();
		trans.setDuration(Duration.seconds(1));
		trans.setNode(unit);
		trans.setToX(x);
		trans.play();
		
	}
	
	
	private void addBackground() {
	//load the image
		Image background = new Image("img/background.jpg");
		ImagePattern background1 = new ImagePattern(background);
		System.out.println("Is Loaded: " +background.isError());
		ImageView iv = new ImageView();
		iv.setImage(background);
	
		battleScene.setFill(background1);
	    
	}
	
	
	private void addText() {
	Text bank = new Text();
	bank.setFont(Font.font("SanSerif",20));
	bank.setLayoutX(640);
	bank.setLayoutY(30);
	bank.setText("$0.00");
	bank.setFill(Color.GOLD);
	
	Text level = new Text();
	level.setFont(Font.font("SanSerif",20));
	level.setLayoutX(700);
	level.setLayoutY(30);
	level.setText("Level 1");
	level.setFill(Color.BLUE);
	
	
	root.getChildren().add(bank);
	root.getChildren().add(level);
	
	
		
	
		
	}
	
	
	private void addUnitButtons() {
		Button unitAButton = new Button();
		unitAButton.setText("Unit A");
		unitAButton.setLayoutX(100);
		unitAButton.setLayoutY(10);
		unitAButton.setMinWidth(20);
		unitAButton.setMinHeight(10);
		unitAButton.setFont(Font.font("Verdana", 12));
		
		
		Button unitBButton = new Button();
		unitBButton.setText("Unit B");
		unitBButton.setLayoutX(170);
		unitBButton.setLayoutY(10);
		unitBButton.setMinWidth(20);
		unitBButton.setMinHeight(10);
		unitBButton.setFont(Font.font("Verdana", 12));
		
		Button unitCButton = new Button();
		unitCButton.setText("Unit C");
		unitCButton.setLayoutX(240);
		unitCButton.setLayoutY(10);
		unitCButton.setMinWidth(20);
		unitCButton.setMinHeight(10);
		unitCButton.setFont(Font.font("Verdana", 12));
		
		Button unitDButton = new Button();
		unitDButton.setText("Unit D");
		unitDButton.setLayoutX(310);
		unitDButton.setLayoutY(10);
		unitDButton.setMinWidth(20);
		unitDButton.setMinHeight(10);
		unitDButton.setFont(Font.font("Verdana", 12));
		
		Button barricadeButton = new Button();
		barricadeButton.setText("Barricade");
		barricadeButton.setLayoutX(380);
		barricadeButton.setLayoutY(10);
		barricadeButton.setMinWidth(20);
		barricadeButton.setMinHeight(10);
		barricadeButton.setFont(Font.font("Verdana", 12));
		
		Button spellButton = new Button();
		spellButton.setText("Cast Spell");
		spellButton.setLayoutX(470);
		spellButton.setLayoutY(10);
		spellButton.setMinWidth(150);
		spellButton.setMinHeight(10);
		spellButton.setFont(Font.font("Verdana", 12));
		
		Button pauseButton = new Button();
		pauseButton.setText("||");
		pauseButton.setLayoutX(780);
		pauseButton.setLayoutY(10);
		pauseButton.setMinWidth(10);
		pauseButton.setMinHeight(10);
		pauseButton.setFont(Font.font("Verdana", 12));
		
		Button marketButton = new Button();
		marketButton.setText("Market");
		marketButton.setLayoutX(810);
		marketButton.setLayoutY(10);
		marketButton.setMinWidth(10);
		marketButton.setMinHeight(10);
		marketButton.setFont(Font.font("Verdana", 12));
		
		Button menuButton = new Button();
		menuButton.setText("Menu");
		menuButton.setLayoutX(870);
		menuButton.setLayoutY(10);
		menuButton.setMinWidth(10);
		menuButton.setMinHeight(10);
		menuButton.setFont(Font.font("Verdana", 12));
		
		menuButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				
				sceneManager.goToMenuScene(sceneManager);
			}
		});
		
		marketButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				
				sceneManager.goToMarketScene(sceneManager);
			}
		});
		
		
		root.getChildren().add(unitAButton);
		root.getChildren().add(unitBButton);
		root.getChildren().add(unitCButton);
		root.getChildren().add(unitDButton);
		root.getChildren().add(barricadeButton);
		root.getChildren().add(spellButton);
		root.getChildren().add(pauseButton);
		root.getChildren().add(menuButton);
		root.getChildren().add(marketButton);
	}

}

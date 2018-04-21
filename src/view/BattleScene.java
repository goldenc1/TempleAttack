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
import model.Fighter;
import model.Market;
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
	Text bank = new Text();
	private final int unit1Price = 100;
	private final int unit2Price = 200;
	private final int unit3Price = 300;
	private final int startingX = 10;
	private final int startingY = 320;
	
	Image baron, archer;
	ImageView imageView, baronIV, archerIV;
	int x, y;
	
	
	
	public BattleScene(SceneManager sceneManager) {
		
		this.sceneManager = sceneManager;
		
	}
	
	
	@Override
	public Scene init(int width, int height, Market market) {
		
		root = new Group();
		
		battleScene = new Scene(root, width, height);
	
		
	
		addUnitButtons(market);
		addText(market);
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
	
	
	private void addText(Market market) {
	bank.setFont(Font.font("SanSerif",20));
	bank.setLayoutX(640);
	bank.setLayoutY(30);
	bank.setText("$" + market.getFunds());
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
	
	
	private void addUnitButtons(Market market) {
		Button unitAButton = new Button();
		//unitAButton.setText("Unit A");
		
		baron = new Image ("img/baron.png");
		baronIV = new ImageView(baron);
		baronIV.setFitHeight(55);
		baronIV.setFitWidth(70);
		unitAButton.setGraphic(baronIV);
		unitAButton.setLayoutX(85);
		unitAButton.setLayoutY(10);
		unitAButton.setStyle("-fx-background-color: rgba(0, 100, 100, 0); -fx-background-radius: 10;");
		
	
		unitAButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				int currFunds = market.getFunds();
				if(currFunds >= unit1Price) {
				currFunds -= unit1Price;
				market.setFunds(currFunds);
				bank.setText("$" + market.getFunds() );
				
				addBaron();
				}
			}		
		});
		
		
		Button unitBButton = new Button();
		//unitBButton.setText("Unit B");
		
		
		archer = new Image ("img/archer.png");
		archerIV = new ImageView(archer);
		archerIV.setFitHeight(70);
		archerIV.setFitWidth(48);
		unitBButton.setGraphic(archerIV);
		unitBButton.setLayoutX(170);
		unitBButton.setLayoutY(10);
		unitBButton.setStyle("-fx-background-color: rgba(0, 100, 100, 0); -fx-background-radius: 10;");
		unitBButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				int currFunds = market.getFunds();
				if(currFunds >= unit2Price) {
				currFunds -= unit2Price;
				market.setFunds(currFunds);
				bank.setText("$" + market.getFunds() );
				
				addArcher();
				}
			}		
		});
		
		Button unitCButton = new Button();
		
		Image horse = new Image ("img/horseman.png");
		ImageView horseIV = new ImageView(horse);
		horseIV.setFitHeight(70);
		horseIV.setFitWidth(48);
		unitCButton.setGraphic(horseIV);
		unitCButton.setLayoutX(240);
		unitCButton.setLayoutY(10);
		unitCButton.setStyle("-fx-background-color: rgba(0, 100, 100, 0); -fx-background-radius: 10;");
		
		unitCButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				int currFunds = market.getFunds();
				if(currFunds >= unit3Price) {
				currFunds -= unit3Price;
				market.setFunds(currFunds);
				bank.setText("$" + market.getFunds() );
				}
			}		
		});
		
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
		
		Button upgradeButton = new Button();
		upgradeButton.setText("Upgrades");
		upgradeButton.setLayoutX(810);
		upgradeButton.setLayoutY(10);
		upgradeButton.setMinWidth(10);
		upgradeButton.setMinHeight(10);
		upgradeButton.setFont(Font.font("Verdana", 12));
		
		Button menuButton = new Button();
		menuButton.setText("Menu");
		menuButton.setLayoutX(890);
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
		
		upgradeButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				
				sceneManager. goToUpgradeScene(sceneManager);
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
		root.getChildren().add(upgradeButton);
	}
	
	public void addBaron() {
		Fighter fighter = new Fighter(Main.getFighterLevel(),baron, x,y);
		this.imageView = new ImageView(baron);
		this.imageView.setFitWidth(50);
		this.imageView.setFitHeight(50);
		
		this.x = startingX;
		this.y = startingY;
		
		this.imageView.relocate(x, y);
		
		this.root.getChildren().add(this.imageView);
	}
	
	public void addArcher() {
		Fighter fighter = new Fighter(Main.getFighterLevel(),archer, x,y);
		this.imageView = new ImageView(archer);
		this.imageView.setFitWidth(50);
		this.imageView.setFitHeight(50);
		
		this.x = startingX;
		this.y = startingY;
		
		this.imageView.relocate(x, y);
		
		this.root.getChildren().add(this.imageView);
	}

}

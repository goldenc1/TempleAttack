package view;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;
import model.Market;


public class SceneManager {
	
	private Stage stage;
	private Timeline animation;
	private Market market = new Market();
	
	public SceneManager(Stage primaryStage) {
		this.stage = primaryStage;
		this.animation = new Timeline();
		stage.show();
	}
	
	public void goToMenuScene(SceneManager sceneManager) {
		animation.stop();
		
		MainMenu MainMenu = new MainMenu(sceneManager);
		Scene menuScene = MainMenu.init(Main.SIZE_W, Main.SIZE_H);
		stage.setScene(menuScene);
		
	}
	
	public void goToBattleScene(SceneManager sceneManager) {
		animation.stop();
		
		BattleScene BattleScene = new BattleScene(sceneManager);
		Scene battleScene = BattleScene.init(Main.SIZE_W, Main.SIZE_H);
		//sets the scene
		stage.setScene(battleScene);
		
	}
	
	//creates the aboutScene
	public void goToAboutScene(SceneManager sceneManager) {
		animation.stop();
		
		AboutScene AboutScene = new AboutScene(sceneManager);
		Scene aboutScene = AboutScene.init(Main.SIZE_W, Main.SIZE_H);
		//sets the scene
		stage.setScene(aboutScene);
		
	}
	public void goToMarketScene(SceneManager sceneManager) {
		
		MarketScene MarketScene = new MarketScene(sceneManager);
		Scene marketScene = MarketScene.init(Main.SIZE_W, Main.SIZE_H);
		stage.setScene(marketScene);
		//sets the stating funds for the game
		market.setFunds(MarketScene.getFunds());
	}
}

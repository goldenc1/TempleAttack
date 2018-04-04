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
	private MarketScene MarketScene;
	
	public SceneManager(Stage primaryStage) {
		this.stage = primaryStage;
		//sets default funds 1000
		market.setFunds(1500);
		this.animation = new Timeline();
		stage.show();
	}
	
	public void goToMenuScene(SceneManager sceneManager) {
		animation.stop();
		
		MainMenu MainMenu = new MainMenu(sceneManager);
		//sets starting funds to value on market menu's slider
		if(MarketScene != null) {
			market.setFunds((int)MarketScene.getSlider().getValue());
		}
		Scene menuScene = MainMenu.init(Main.SIZE_W, Main.SIZE_H, market);
		
		stage.setScene(menuScene);
		
	}
	
	public void goToBattleScene(SceneManager sceneManager) {
		animation.stop();
		
		BattleScene BattleScene = new BattleScene(sceneManager);
		Scene battleScene = BattleScene.init(Main.SIZE_W, Main.SIZE_H, market);
		//sets the scene
		stage.setScene(battleScene);
		
	}
	
	//creates the aboutScene
	public void goToAboutScene(SceneManager sceneManager) {
		animation.stop();
		
		AboutScene AboutScene = new AboutScene(sceneManager);
		Scene aboutScene = AboutScene.init(Main.SIZE_W, Main.SIZE_H, market);
		//sets the scene
		stage.setScene(aboutScene);
		
	}
	public void goToMarketScene(SceneManager sceneManager) {
		animation.stop();
		
		MarketScene = new MarketScene(sceneManager);
		Scene marketScene = MarketScene.init(Main.SIZE_W, Main.SIZE_H, market);
		stage.setScene(marketScene);
	}
	public void goToUpgradeScene(SceneManager sceneManager) {
		animation.stop();
		
		UpgradeScene UpgradeScene = new UpgradeScene(sceneManager);
		Scene upgradeScene = UpgradeScene.init(Main.SIZE_W, Main.SIZE_H, market);
		stage.setScene(upgradeScene);
	}
}
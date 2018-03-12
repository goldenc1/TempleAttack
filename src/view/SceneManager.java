package view;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;


public class SceneManager {
	
	private Stage stage;
	private Timeline animation;
	
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
		stage.setScene(battleScene);
		
	}
	
	
	public void goToAboutScene(SceneManager sceneManager) {
		animation.stop();
		
		AboutScene AboutScene = new AboutScene(sceneManager);
		Scene aboutScene = AboutScene.init(Main.SIZE_W, Main.SIZE_H);
		stage.setScene(aboutScene);
		
	}
	
	

}

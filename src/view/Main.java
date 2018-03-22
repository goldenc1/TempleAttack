package view;

import javafx.application.Application;
import javafx.stage.Stage;
import view.SceneManager;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.image.Image;
import javafx.animation.AnimationTimer;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;

import java.util.ArrayList;

/**
 * @program Temple Attack
 * 
 * @author Charles Golden II 
 *
 * @version 1.0
 * 
 * @returns nothing
**/

public class Main extends Application{
	public static final int SIZE_W = 1250;
	public static final int SIZE_H = 400;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		launch(args);

	}
	
	
	@Override
	public void start(Stage primaryStage)
	{
	primaryStage.setTitle("Temple Attack");
	
	
	SceneManager sceneManager = new SceneManager(primaryStage);
	
	sceneManager.goToMenuScene(sceneManager);
	
	}
	
	
	

}
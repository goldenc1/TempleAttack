package view;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.util.Duration;
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
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * @program Temple Attack
 * 
 * @author Charles Golden II , Carlos Portillo, Rachel Direling, Fred Slawson, Zach 
 *
 * @version 1.0,
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
	addMusic();
	
	}
	
	
private void addMusic() {
		
		Media sound = new Media(Paths.get("src/sound/GloomyMeadows.mp3").toUri().toString());
		MediaPlayer mediaPlayer = new MediaPlayer(sound);
		
			
			mediaPlayer.setOnEndOfMedia(new Runnable() {
			       public void run() {
			         mediaPlayer.seek(Duration.ZERO);
			       }
			   });
			  mediaPlayer.play();
			
		
		
		
		
	}
	
	

}
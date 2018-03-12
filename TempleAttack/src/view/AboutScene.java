package view;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;

public class AboutScene implements SceneInterface {
	
	private SceneManager sceneManager;
	private Scene aboutScene;
	private Group root;
	
	public AboutScene(SceneManager sceneManager) {
		
		this.sceneManager = sceneManager;
		
	}
	
	
	@Override
	public Scene init(int width, int height) {
		
		root = new Group();
		aboutScene = new Scene(root, width, height, Color.AZURE);
		
		addInstructionsText();
		addReturnButton();
		
		return aboutScene;
	}
	
	private void addInstructionsText() {
		
		Text text = new Text();
		text.setFont(Font.font("SanSerif",10));
		text.setLayoutX(400);
		text.setLayoutY(200);
		text.setText("Created by Zach, CJ, Charles, Rachel, and Fred");
		text.setFill(Color.BLACK);
	
				
		
		root.getChildren().add(text);
	}	
	
	private void addReturnButton() {
		Button returnButton = new Button();
		returnButton.setText("Main Menu");
		returnButton.setLayoutX(450);
		returnButton.setLayoutY(230);
		returnButton.setMinWidth(150);
		returnButton.setMinHeight(30);
		returnButton.setFont(Font.font("Verdana", 12));
		returnButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				
				sceneManager.goToMenuScene(sceneManager);
			}
		});
		
		root.getChildren().add(returnButton);
	}
}
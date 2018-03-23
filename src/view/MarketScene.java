package view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseEvent;

public class MarketScene implements SceneInterface {
	
	private SceneManager sceneManager;
	private Scene marketScene;
	private Group root;
	private int funds;
	
	
	public MarketScene(SceneManager sceneManager) {
		this.sceneManager = sceneManager;
	}
	
	@Override
	public Scene init(int width, int height) {
		root = new Group();
		marketScene = new Scene(root, width, height);
		addSlider();
		addReturnButton();
		return marketScene;
	}
	//adds slider and labels associated with them
	public void addSlider() {
		Label fundLabel = new Label();
		fundLabel.setText("Set starting funds");
		fundLabel.setLayoutX(400);
		fundLabel.setLayoutY(170);
		fundLabel.setFont(new Font("Verdana", 12));
		
		Label amountLabel = new Label("$" + 500);
		amountLabel.setLayoutX(580);
		amountLabel.setLayoutY(170);
		amountLabel.setFont(new Font("Verdana", 12));
		
		//create slider
		Slider slider = new Slider(500, 2000, 500);
		slider.setLayoutX(400);
		slider.setLayoutY(200);
		slider.setShowTickMarks(true);
		slider.setShowTickLabels(true);
		slider.setSnapToTicks(true);
		slider.setMajorTickUnit(500);
		//create event listener/handler on value changing on slider and set that value to be starting funds
		slider.valueProperty().addListener((changed, oldValue, newValue)-> {
			amountLabel.setText("$" + (int)Math.round((double)newValue));
			setFunds((int)Math.round((double) newValue));
		});
		
		//add nodes to root 
		root.getChildren().add(fundLabel);
		root.getChildren().add(slider);
		root.getChildren().add(amountLabel);
	}
	//adds return button
	private void addReturnButton() {
		Button returnButton = new Button();
		returnButton.setText("Return to Battle");
		returnButton.setLayoutX(400);
		returnButton.setLayoutY(250);
		returnButton.setMinWidth(150);
		returnButton.setMinHeight(30);
		returnButton.setFont(Font.font("Verdana", 12));
		returnButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				
				sceneManager.goToBattleScene(sceneManager);
			}		
		});
		root.getChildren().add(returnButton);
	}

	public int getFunds() {
		return funds;
	}

	public void setFunds(int funds) {
		this.funds = funds;
	}

}
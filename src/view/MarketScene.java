package view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import model.Market;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseEvent;

public class MarketScene implements SceneInterface {
	
	private SceneManager sceneManager;
	private Scene marketScene;
	private Group root;
	private int funds;
	private Slider slider;
	
	
	public MarketScene(SceneManager sceneManager) {
		this.sceneManager = sceneManager;
	}
	
	@Override
	public Scene init(int width, int height, Market market) {
		root = new Group();
		marketScene = new Scene(root, width, height);
		addSlider();
		addReturnButton();
		addBackground();
		return marketScene;
	}
	//adds slider and labels associated with them
	public void addSlider() {
		Label fundLabel = new Label();
		fundLabel.setText("Set starting funds");
		fundLabel.setLayoutX((Main.SIZE_W/2)-75);
		fundLabel.setLayoutY(170);
		fundLabel.setFont(Font.font("Verdana",FontWeight.BOLD,18));
		
		Label amountLabel = new Label("$" + 500);
		amountLabel.setLayoutX((Main.SIZE_W/2)+140);
		amountLabel.setLayoutY(170);
		amountLabel.setFont(Font.font("Verdana",FontWeight.BOLD,18));
		
		Label easyLabel = new Label();
		easyLabel.setText("Easier");
		easyLabel.setLayoutX((Main.SIZE_W/2)+100);
		easyLabel.setLayoutY(200);
		easyLabel.setFont(Font.font("Verdana",FontWeight.BOLD,18));
	
		
		Label hardLabel = new Label();
		hardLabel.setText("Harder");
		hardLabel.setLayoutX((Main.SIZE_W/2)-150);
		hardLabel.setLayoutY(200);
		hardLabel.setFont(Font.font("Verdana",FontWeight.BOLD,18));
		
		//create slider
		slider = new Slider(500, 2000, 500);
		slider.setLayoutX((Main.SIZE_W/2)-50);
		slider.setLayoutY(200);
		slider.setShowTickMarks(true);
		slider.setShowTickLabels(true);
		slider.setSnapToTicks(true);
		slider.setMajorTickUnit(500);
		setFunds((int)slider.getValue());
		
		//create event listener/handler on value changing on slider and set that value to be starting funds
		slider.valueProperty().addListener((changed, oldValue, newValue)-> {
			amountLabel.setText("$" + (int)Math.round((double)newValue));
		});
		
		//add nodes to root 
		root.getChildren().add(fundLabel);
		root.getChildren().add(slider);
		root.getChildren().add(amountLabel);
		root.getChildren().add(easyLabel);
		root.getChildren().add(hardLabel);
	}
	//adds return button
	private void addReturnButton() {
		Button returnButton = new Button();
		returnButton.setText("Return to Battle");
		returnButton.setLayoutX((Main.SIZE_W/2)-75);
		returnButton.setLayoutY(250);
		returnButton.setMinWidth(150);
		returnButton.setMinHeight(30);
		returnButton.setFont(Font.font("Verdana",FontWeight.BOLD,18));
		returnButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				
				sceneManager.goToMenuScene(sceneManager);
			}		
		});
		root.getChildren().add(returnButton);
	}
	public Slider getSlider() {
		return this.slider;
	}

	public int getFunds() {
		return this.funds;
	}

	public void setFunds(int funds) {
		this.funds = funds;
	}
	
	private void addBackground() {
		//load the image
			Image background = new Image("img/mainscreen.jpg");
			ImagePattern background1 = new ImagePattern(background);
			System.out.println("Is Loaded: " +background.isError());
			ImageView iv = new ImageView();
			iv.setImage(background);
		
			marketScene.setFill(background1);
			
			

	        
		    
		}

}
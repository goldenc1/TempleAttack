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
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import model.Market;
import javafx.scene.control.TextField;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseEvent;

public class UpgradeScene implements SceneInterface  {

	private SceneManager sceneManager;
	private Scene upgradeScene;
	private Group root;
	Label fundLabel, fundLabel2;
	private final int unit1UpgradePrice = 500;
	private final int unit2UpgradePrice = 750;
	private final int unit3UpgradePrice = 1000;
	public UpgradeScene(SceneManager sceneManager) {
		this.sceneManager = sceneManager;
	}
	
	@Override
	public Scene init(int width, int height, Market market) {
		root = new Group();
		upgradeScene = new Scene(root, width, height);
		addButtons(market);
		addFundLabel(market);
		addReturnButton();
		return this.upgradeScene;
	}
	private void addButtons(Market market) {
		//create labels for the buttons displaying cost value
		Label unit1Label = new Label("$"+unit1UpgradePrice);
		unit1Label.setStyle("-fx-font-weight: bold; -fx-font-size: 14;");
		unit1Label.setLayoutX(430);
		unit1Label.setLayoutY(150);
		
		Label unit2Label = new Label("$"+unit2UpgradePrice);
		unit2Label.setStyle("-fx-font-weight: bold; -fx-font-size: 14;");
		unit2Label.setLayoutX(550);
		unit2Label.setLayoutY(150);
		
		Label unit3Label = new Label("$"+unit3UpgradePrice);
		unit3Label.setStyle("-fx-font-weight: bold; -fx-font-size: 14;");
		unit3Label.setLayoutX(670);
		unit3Label.setLayoutY(150);
		
		Button unit1Button = new Button("Upgrade Fighter");
		unit1Button.setLayoutX(400);
		unit1Button.setLayoutY(170);
		unit1Button.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				int currFunds = market.getFunds();
				if(currFunds >= unit1UpgradePrice) {
				currFunds -= unit1UpgradePrice;
				market.setFunds(currFunds);
				fundLabel.setText("Current Funds  $:" + market.getFunds() );
				}
				else {
				fundLabel2.setText("Insufficient funds!!");
				}
			}		
		});
		
	
		
		Button unit2Button = new Button("Upgrade Archer");
		unit2Button.setLayoutX(520);
		unit2Button.setLayoutY(170);
		unit2Button.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				int currFunds = market.getFunds();
				if(currFunds >= unit2UpgradePrice) {
				currFunds -= unit2UpgradePrice;
				market.setFunds(currFunds);
				fundLabel.setText("Current Funds  $:" + market.getFunds() );
				}
				else {
				fundLabel2.setText("Insufficient funds!!");
				}
			}		
		});
		
		
		Button unit3Button = new Button("Upgrade Horseman");
		unit3Button.setLayoutX(640);
		unit3Button.setLayoutY(170);
		unit3Button.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				int currFunds = market.getFunds();
				if(currFunds >= unit3UpgradePrice) {
				currFunds -= unit3UpgradePrice;
				market.setFunds(currFunds);
				fundLabel.setText("Current Funds  $:" + market.getFunds() );
				}
				else {
				fundLabel2.setText("Insufficient funds!!");
				}
			}		
		});
		
		//Give buttons event handler so that unit stats are upgraded and money is deducted 
		//Will probably need to pass unit classes unit this class to do this
		
		
		root.getChildren().add(unit1Label);
		root.getChildren().add(unit2Label);
		root.getChildren().add(unit3Label);
		root.getChildren().add(unit1Button);
		root.getChildren().add(unit2Button);
		root.getChildren().add(unit3Button);
		
		
	}
	private void addFundLabel(Market market) {
		fundLabel = new Label("Current Funds  $:" + market.getFunds());
		fundLabel.setStyle("-fx-font-weight: bold; -fx-font-size: 18;");
		fundLabel.setLayoutX(400);
		fundLabel.setLayoutY(300);
		root.getChildren().add(fundLabel);
		
		
		fundLabel2 = new Label("");
		fundLabel2.setStyle("-fx-font-weight: bold; -fx-font-size: 18;");
		fundLabel2.setLayoutX(400);
		fundLabel2.setLayoutY(340);
		root.getChildren().add(fundLabel2);
		
	}
	
	//adds return button
		private void addReturnButton() {
			Button returnButton = new Button();
			returnButton.setText("Return to Battle");
			returnButton.setLayoutX(600);
			returnButton.setLayoutY(300);
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
		
	
	
	
}
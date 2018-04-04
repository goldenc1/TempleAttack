package view;

import javafx.scene.Scene;
import model.Market;

interface SceneInterface {
	
	Scene init(int width, int height, Market market);

}
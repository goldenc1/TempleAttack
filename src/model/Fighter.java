package model;

import javafx.scene.image.Image;

//Developer: Carlos Portillo
public class Fighter extends Unit {

	public Fighter(int level, Image image, double x, double y) {
		if(level == 0)
		{
			setStrength(5);
			setHealth(20);
			setRange(4);
			setSpeed(2);
		}
		else if(level == 1){
			setStrength(10);
			setHealth(30);
			setRange(8);
			setSpeed(4);
		}
		else {
			setStrength(16);
			setHealth(35);
			setRange(12);
			setSpeed(6);
		}
	}

	@Override
	public void upgrade() throws IneligibleUpgradeException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getUpgradePrice() throws IneligibleUpgradeException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void checkFunds() {
		// TODO Auto-generated method stub
		
	}
	
}
package model;

import javafx.scene.image.Image;

//Developer: Carlos Portillo
public class HorsemanUnit extends Unit {

 
	public static int HORSEMAN_STRENGTH = 50;
	public static int HORSEMAN_HP  = 100;
	public static int HORSEMAN_PRICE = 250;
	public static int HORSEMAN_SPEED = 10;
	public static final int HORSEMAN_RANGE = 10;
	public static final Image  HORSEMAN_IMAGE = new Image("../img/horseman.png");		
	public HorsemanUnit(boolean player) {
		super(player, HORSEMAN_STRENGTH, HORSEMAN_HP, HORSEMAN_PRICE, HORSEMAN_SPEED, HORSEMAN_RANGE, HORSEMAN_IMAGE);
	}

	@Override
	public void upgrade() throws IneligibleUpgradeException {
		
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
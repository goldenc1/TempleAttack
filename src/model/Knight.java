package model;

import model.Funds;

public class Knight extends Unit {
	
	public static final int INITIAL_PRICE= 100;
	public static final double UPGRADE_MULTIPLIER = 1.2;
	public static int level;

	public Knight(boolean player) {
		// UML Attribs
		super(player);
		this.strength = 55;
		this.health = 100; // hit points
		this.price = INITIAL_PRICE; // gold cost
		this.speed = 15; // pixels per tick of movement
		this.boost = false; // is unit boosted?
		this.range = 20; // radius of 20 (what units of measurements? pixels?
							// then raise the number)
		this.level= 1;  // can go up to 3 upgrades   /// level === level of upgrade NOT GAME LVL

	}
	
	public void upgrade() throws IneligibleUpgradeException{
		if(this.level <= 3 ){   // check upgrades less than 3
			try{
			Funds.Transaction((int )Math.ceil((price * (UPGRADE_MULTIPLIER* this.level)))); // run transaction
		}
			catch (Exception e){
				throw new IneligibleUpgradeException("Maximum Upgrade Achieved");
			}		
			
		}
		else throw new IneligibleUpgradeException("Maximum Upgrade Achieved");
		
	}  
    public int getUpgradePrice() throws IneligibleUpgradeException{
    	if(this.level <= 3 ){   // check upgrades less than 3
    		return (int )Math.ceil((price * (UPGRADE_MULTIPLIER* this.level)));
    	}
    	else throw new IneligibleUpgradeException("Maximum Upgrade Achieved");
    }
    public void checkFunds(){
    	//TODO
    }
	

}

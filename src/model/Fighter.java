package model;
//Developer: Carlos Portillo
public class Fighter extends Unit {

	public Fighter(boolean upgradeActive) {
		if(upgradeActive == false)
		{
			setStrength(5);
			setHealth(20);
			setRange(4);
<<<<<<< HEAD
=======
			setSpeed(2);
>>>>>>> 50cd33b054263001ce0c3177313f00926d1e45e7
		}
		else {
			setStrength(10);
			setHealth(30);
			setRange(8);
<<<<<<< HEAD
		}
=======
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
		
>>>>>>> 50cd33b054263001ce0c3177313f00926d1e45e7
	}
	
}
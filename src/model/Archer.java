package model;

//Developer: Carlos Portillo
public class Archer extends Unit {

	public Archer(int level) {
		if(level == 0)
		{
			setStrength(2);
			setHealth(10);
			setRange(12);
			setSpeed(4);
		}
		else if(level == 1) {
			setStrength(5);
			setHealth(20);
			setRange(16);
			setSpeed(6);
		}
		else {
			setStrength(9);
			setHealth(25);
			setRange(20);
			setSpeed(8);
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
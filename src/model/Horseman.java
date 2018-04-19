package model;
//Developer: Carlos Portillo
public class Horseman extends Unit {
	
	public Horseman(int level) {
		if(level == 0)
		{
			setStrength(3);
			setHealth(25);
			setRange(8);
			setSpeed(3);
		}
		else if(level == 1) {
			setStrength(7);
			setHealth(35);
			setRange(12);
			setSpeed(5);
		}
		else {
			setStrength(10);
			setHealth(45);
			setRange(16);
			setSpeed(7);
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
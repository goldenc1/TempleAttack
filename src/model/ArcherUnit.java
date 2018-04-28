package model;

//Developer: Carlos Portillo
public class ArcherUnit extends Unit {

	public ArcherUnit(boolean upgradeActive) {
		if (upgradeActive == false) {
			setStrength(2);
			setHealth(10);
			setRange(12);
		} else {
			setStrength(5);
			setHealth(20);
			setRange(16);
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
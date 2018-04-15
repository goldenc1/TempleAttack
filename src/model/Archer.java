package model;

//Developer: Carlos Portillo
public class Archer extends Unit {

	public Archer(boolean upgradeActive) {
		if(upgradeActive == false)
		{
			setStrength(2);
			setHealth(10);
			setRange(12);
		}
		else {
			setStrength(5);
			setHealth(20);
			setRange(16);
		}
		
	}
}
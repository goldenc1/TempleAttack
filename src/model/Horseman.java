package model;
//Developer: Carlos Portillo
public class Horseman extends Unit {
	
	public Horseman(boolean upgradeActive) {
		if(upgradeActive == false)
		{
			setStrength(3);
			setHealth(25);
			setRange(8);
		}
		else {
			setStrength(7);
			setHealth(35);
			setRange(12);
		}
	}

}
package model;
//Developer: Carlos Portillo
public class Fighter extends Unit {

	public Fighter(boolean upgradeActive) {
		if(upgradeActive == false)
		{
			setStrength(5);
			setHealth(20);
			setRange(4);
		}
		else {
			setStrength(10);
			setHealth(30);
			setRange(8);
		}
	}
	
}
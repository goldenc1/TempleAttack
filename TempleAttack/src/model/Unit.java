/**
 * 
 */
package model;

/**
 * @author boome
 *
 */
public abstract class Unit {

	private double strength;
	private double health;
	private int price;
	private double upgradePrice;
	private double speed;
	private boolean boost = false;

	/**
	 * 
	 */
	public Unit() {
		// TODO Auto-generated constructor stub
	}

	protected boolean Upgrade() {
			
		return false;
		// TODO
	}

	public double Attack() {
		double inflict;
		if (!this.boost) {
			inflict = this.strength;
		} else {
			inflict = (this.strength * 1.5);
		}
		return inflict;
	}

	public void Move() {
		
		// TODO
	}
	
	public void kill(){
		// TODO
	}

	public double TakeDamage(double hitPoints) {
		double h = health-hitPoints;
		if (h <= 0 ){
			this.kill();
		}
		return health-hitPoints;

	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getUpgradePrice() {
		return upgradePrice;
	}

	public void setUpgradePrice(double upgradePrice) {
		this.upgradePrice = upgradePrice;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

}

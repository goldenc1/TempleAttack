package model;

public class Knight extends Unit {

	public Knight(boolean player) {
		// UML Attribs
		this.strength = 55;
		this.health = 100; // hit points
		this.price = 100; // gold cost
		this.speed = 15; // pixels per tick of movement
		this.boost = false; // is unit boosted?
		this.range = 20; // radius of 20 (what units of measurements? pixels?
							// then raise the number)
		this.player = player; 
		super(player);


	}

}

package sprites;

import java.awt.Image;

import javafx.scene.image.ImageView;

public abstract class Sprite {
	
	
	    public Image image;
	    public ImageView imageView;

	    Pane layer;

	    double x;
	    double y;
	    double r;

	    double dx;
	    double dy;
	    double dr;

	    double health;
	    double damage;

	    boolean removable = false;

	    double w;
	    double h;

	    boolean canMove = true;

	public static enum State {
		IDLE, MOVING_LEFT, MOVING_RIGHT, MOVING_DOWN, MOVING_UP, MOVING_SNEAKILY
	};

	protected State state; // current state
	protected int frame; // current frame

	/**
	 *  Construct new sprite. Initialized with IDLE state
	 */
	public Sprite() {
		this.state = State.IDLE;
		this.frame = 0;
	}

	/**
	 * Sets the state of the sprite
	 * 
	 * @param state
	 *            the new state of the sprite
	 */
	public void setState(State state) {
		this.state = state;
	}

	/**
	 * @return the current state of the sprite
	 */
	public State getState() {
		return this.state;
	}

	/**	 
	 * @return false; by default all sprites never finish
	 * 		*******=====>implementation is meant to indicate a unit sprites death
	 */
	public boolean isFinished() {
		return false;
	}

	/**
	 * Tells the sprite to restart its animation. By default, resetting a sprite
	 * does nothing.
	 */
	public void reset() {
		setState(State.IDLE);
	}

	/**	 
	 * @return the current image for the sprite
	 */
	public abstract Image getImage();

	/**	 
	 * @return the width of the sprite
	 */
	public abstract int getWidth();

	/**	 
	 * @return the height of the sprite
	 */
	public abstract int getHeight();

}
package model;

import java.util.ArrayDeque;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.TimerTask;

import objects.Archer;
import objects.Horseman;
import objects.Knight;

import java.util.Timer;

/**
 * 
 * AI class that controls the spawning / level rewards / propagation of waves
 * 
 */
public class Wave {
	private int numDefenders;
	private int numKnights;
	private int numArchers;
	private int numFighters;
	private int numBarriers;
	private int numHorsemen;
	private int prize = 1000;

	private ArrayDeque<Unit> activeDefenders;
	private ArrayDeque<Unit> toSpawn;
	private ArrayDeque<Unit> totalDefenders;
	private int currentWave = 1;
	private static Wave instance;
	private static Timer timer = new Timer();
	private static TimerTask spawn;

	/**
	 * Constructor sets up the current wave with a call to createWave()
	 */
	private Wave() {
		this.activeDefenders = new ArrayDeque<Unit>();
		this.toSpawn = new ArrayDeque<Unit>();
		this.createWave(this.currentWave);
	}

	public int start() {

		spawn = new TimerTask() {
			@Override
			public void run() {
				addDefender();
			}
		};
		// start game
		timer.scheduleAtFixedRate(spawn, 2 * 1000, 2 * 1000); // spawns new unit
																// every 2
																// seconds

		return currentWave;
	}

	public ArrayDeque<Unit> getActiveDefenders() {
		return this.activeDefenders;
	}

	public int getnumDefenders() {
		return numArchers + numFighters + numHorsemen + numKnights;
	}

	public static synchronized Wave getInstance() {
		if (instance == null) {
			return instance = new Wave();
		}
		return instance;
	}

	public void createWave(int wave) {
		switch (wave) { // set wave sizes
		case 1:
			this.numBarriers = 0;
			this.numFighters = 4;
			this.numArchers = 1;
			this.numHorsemen = 0;
			this.numKnights = 0;
			break;
		case 2:
			this.numDefenders = 10;
			this.numBarriers = 1;
			this.numFighters = 7;
			this.numArchers = 2;
			this.numHorsemen = 0;
			this.numKnights = 0;
			break;
		case 3:
			this.numDefenders = 15;
			this.numBarriers = 1;
			this.numFighters = 8;
			this.numArchers = 3;
			this.numHorsemen = 3;
			this.numKnights = 0;
			break;
		case 4:
			this.numDefenders = 20;
			this.numBarriers = 3;
			this.numFighters = 10;
			this.numArchers = 3;
			this.numHorsemen = 3;
			this.numKnights = 1;
			break;
		case 5:
			endGame();
			break;
		default:

			break;
		}

		for (int i = 0; i < this.numFighters / 2; i++) {
			this.toSpawn.add(new Fighter(false));
		}
		for (int i = 0; i < this.numArchers; i++) {
			this.toSpawn.add(new Archer(false));
		}
		for (int i = 0; i < this.numFighters / 2; i++) {
			this.toSpawn.add(new Fighter(false));
		}
		for (int i = 0; i < this.numHorsemen; i++) {
			this.toSpawn.add(new Horseman(false));
		}
		for (int i = 0; i < this.numKnights; i++) {
			this.toSpawn.add(new Knight(false));
		}
	}

	public void endGame() {

	}

	public void nextWave() {
		if (this.waveOver()) {
			this.currentWave++;
			this.prize += prize * .20; // 20% more earnings each level
			this.createWave(this.currentWave);
		}
	}

	// used cohesively to determine the end of a level
	public boolean waveOver() {
		return (this.toSpawn.size() == 0) && (this.activeDefenders.size() == 0);
	}

	/**
	 * Resets the current wave
	 */
	public static void reset() {
		Wave.instance = new Wave();
	}

	/**
	 * Spawns Defensive Units
	 */
	public void addDefender() {
		if (this.toSpawn.size() > 0) {
			System.out.println("Spawned a " + this.toSpawn.getFirst().getClass().getSimpleName());
			this.activeDefenders.add(this.toSpawn.remove());
		}
	}

	public int collectLoot() {

		return prize;

	}

	public int getLevel() {
		return currentWave;
	}

}

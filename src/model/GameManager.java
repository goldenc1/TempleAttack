package model;

public class GameManager {

	public static GameManager gameInstance;
	public Wave level = Wave.getInstance();

	private GameManager() {
		// TODO Auto-generated constructor stub
	}

	public static GameManager getInstance() {
		if (gameInstance == null) {
			gameInstance = new GameManager();
		}

		return gameInstance;
	}

	public boolean gameLoop() {
		boolean ended = false;
		while (!ended) {
			if (level.waveOver()) {
				if (level.getLevel() <= 5) {
					/*
					 * // do stuff and wait for action click "next level"
					 * 
					 * ============================= view marketplace button
					 * next level button quit =============================
					 * 
					 */
					level.nextWave();
				}
				level.endGame();
				ended = true;
			}

		}

		return true;
	}

	public void pauseGame() {

	}

}

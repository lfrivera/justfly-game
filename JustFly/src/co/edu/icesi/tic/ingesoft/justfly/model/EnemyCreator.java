package co.edu.icesi.tic.ingesoft.justfly.model;

import java.util.ArrayList;
import java.util.Random;

/**
 * Class that allows to create enemies.
 * @author lfrivera
 *
 */
public class EnemyCreator {

	/**
	 * Unique instance of the class.
	 */
	private static EnemyCreator instance;
	
	/**
	 * Constructor of the class.
	 */
	private EnemyCreator()
	{}
	
	public static EnemyCreator getInstance()
	{
		if(instance == null)
		{
			instance = new EnemyCreator();
		}
		return instance;
	}
	
	/**
	 * Incomplete.
	 * Allows to create the initial enemies of the game (borders).
	 * @return Initial enemies of the game.
	 */
	public ArrayList<Enemy> generateInitialEnemies()
	{
		ArrayList<Enemy> response = new ArrayList<Enemy>();
		
		//Top line
				for(int i = 0; i < 10; i++)
				{
					Enemy e = new Enemy(i * 100, 0);
					response.add(e);
				}
				
				//Bottom line
				for(int i = 0; i < 10; i++)
				{
					Enemy e = new Enemy(i * 100, 470);
					response.add(e);
				}

				//Left line
				for(int i = 0; i < 4; i++)
				{
					Enemy e = new Enemy(0, i*120);
					response.add(e);
				}

				//Right line
				for(int i = 0; i < 4; i++)
				{
					Enemy e = new Enemy(898, i*120);
					response.add(e);
				}

		return response;
	}
	
	/**
	 * Incomplete
	 * Method that allows to generate a random enemy.
	 * @return New enemy.
	 */
	public Enemy generateRandomEnemy()
	{
		Random r = new Random();
		Enemy random = new Enemy(1000, r.nextInt(500));
		return random;
	}
	
}

public class Player
{
	private int health;

 	public int getHealth()
 	{
 		return health;
 	}

	public void setHealth(int h)
 	{
 		if (h < 0)
 			health = 0;
 		else if (h > 100)
 			health = 100;
 		else
 			health = h;
 	}
}
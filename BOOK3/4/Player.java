class Player
{
	public int move()
 	{
 		for (int i = 0; i < 9; i++)
 		{
 			System.out.println("\nThe basic player says:");
 			System.out.println("I'll take the first open square!");
 			return firstOpenSquare();
 		}
 		return -1;
 	}

	private int firstOpenSquare()
 	{
 		int square = 0;
 		// code to find the first open square goes here
 		return square;
 	}
}
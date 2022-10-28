import java.util.Arrays;
import java.util.ArrayList;

class LinkedList
{
	public static void main(String args[])
 	{
 		ArrayList officer = new ArrayList();

		ArrayList<String> officers = new ArrayList<String>();

		officers.add("Blake");
		officers.add("Burns");
		officers.add("Houlihan");
		officers.add("Pierce");
		officers.add("McIntyre");

		for (String s : officers)
 			System.out.println(s);
	}
}
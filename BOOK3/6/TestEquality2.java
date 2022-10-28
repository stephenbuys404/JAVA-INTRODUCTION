public class TestEquality2
{
	public static void main(String[] args)
 	{
 		Employee2 emp1 = new Employee2("Martinez", "Anthony");
 		Employee2 emp2 = new Employee2("Martinez1", "Anthony2");

 		if (emp1.equals(emp2)) 
 			System.out.println("These employees are the same.");
 		else
 			System.out.println("These are different employees.");
 	}
}


public class CloneTest
{

	public static void main(String[] args)
 	{
 		Employee3 emp1 = new Employee3("Martinez", "Anthony");
 		emp1.setSalary(40000.0); 

		Employee3 emp2 = (Employee3)emp1.clone(); 
 		emp1.setLastName("Smith"); 

		System.out.println(emp1); 
 		System.out.println(emp2); 
 	}
}


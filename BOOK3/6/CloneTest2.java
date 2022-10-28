public class CloneTest2
{
	public static void main(String[] args)
 	{
 		Employee4 emp1 = new Employee4("Martinez", "Anthony");
 		emp1.setSalary(40000.0);
 		emp1.address = new Address("1300 N. First Street","Fresno", "CA", "93702");

		Employee4 emp2 = (Employee4)emp1.clone(); 
 		System.out.println("**** after cloning ****\n");

		printEmployee(emp1);
 		printEmployee(emp2);

		emp2.setLastName("Smith"); 
 		emp2.address = new Address("2503 N. 6th Street","Fresno", "CA", "93722");
 		System.out.println("**** after changing emp2 ****\n");

		printEmployee(emp1);
 		printEmployee(emp2);
 	}

 	private static void printEmployee(Employee4 e) 
 	{
 		System.out.println(e.getFirstName() + " " + e.getLastName());
 		System.out.println(e.address.getAddress());
 		System.out.println("Salary: " + e.getSalary());
 		System.out.println();
 	}
}


public class Employee5
{
	private String lastName;
 	private String firstName;

	public Employee5(String lastName, String firstName)
 	{
 		this.lastName = lastName;
 		this.firstName = firstName;
 	}

	public String toString()
 	{
 		return "Employee[" + this.firstName + " " + this.lastName + "]";
 	}
}
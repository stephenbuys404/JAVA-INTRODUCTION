class Employee2 
{
	private String lastName;
 	private String firstName;

	public Employee2(String lastName, String firstName)
 	{
 		this.lastName = lastName;
 		this.firstName = firstName;
 	}

	public String getLastName()
	{
 		return this.lastName;
 	}

	public String getFirstName()
 	{
 		return this.firstName;
 	}

	public boolean equals(Object obj) 
 	{
 		// an object must equal itself
 		if (this == obj) 
 			return true;

		// no object equals null
 		if (this == null) 
 			return false;

		// objects of different types are never equal
 		if (this.getClass() != obj.getClass()) 
 			return false;

		// cast to an Employee, then compare the fields
 		Employee2 emp = (Employee2) obj; 
 			return this.lastName.equals(emp.getLastName()) && this.firstName.equals(emp.getFirstName());
 	}
}
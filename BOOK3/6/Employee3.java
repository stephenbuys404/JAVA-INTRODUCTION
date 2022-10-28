class Employee3{
	private String lastName;
	private String firstName;
 	private Double salary;

 	public Employee3(String lastName,String firstName)
 	{
 		this.lastName = lastName;
 		this.firstName = firstName;
 	}

	public String getLastName()
 	{
 		return this.lastName;
 	}

	public void setLastName(String lastName)
 	{
 		this.lastName = lastName;
 	}

	public String getFirstName()
 	{
 		return this.firstName;
 	}

	public void setFirstName(String firstName)
 	{
 		this.firstName = firstName;
 	}

 	public Double getSalary()
 	{
 		return this.salary;
 	}

	public void setSalary(Double salary)
 	{
 		this.salary = salary;
 	}

	public Object clone() 
 	{
 		Employee3 emp;
 		emp = new Employee3( 
 		this.lastName, this.firstName);
 		emp.setSalary(this.salary); 
 		return emp; 
 	}

 	public String toString()
 	{
		return this.getClass().getName() + "[" + this.firstName + " " + this.lastName + ", " + this.salary + "]";
 	}
}
package L5_Vi_Construct_Inherit;

public class employee 
{
//emp details
	String name;
	int age;
	double salary;
	String jobDescription;
	int departmentsFactor;
	double yearsInCompany;
	
	public void printDetails()
	{
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Salary: " + salary);
		System.out.println("Job Description: " + jobDescription);
	}
	
	public double salaryRaise()
	{
		return salary + (departmentsFactor * yearsInCompany);
	}
	
}

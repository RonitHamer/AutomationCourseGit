package L5_Vi_Construct_Inherit;

public class ClassQA extends employee
{
	public ClassQA(double salary, String jobDescription)//instead of initializing in class will do it in main
	{
		this.salary=salary;
		this.jobDescription=jobDescription;
		departmentsFactor = 1000;
	}
}

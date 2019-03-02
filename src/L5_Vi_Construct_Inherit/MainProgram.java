package L5_Vi_Construct_Inherit;

public class MainProgram {

	public static void main(String[] args)
	{
		ClassQA QA = new ClassQA(12000.55, "Finding bugs");
		QA.name="Yoni";
		QA.age=13;
		QA.yearsInCompany = 3.5;
		QA.printDetails();
		System.out.println("New salary: " + QA.salaryRaise());
		
//		
//		ClassQA QA1 = new ClassQA(21000.0, "Finding extreme bugs");
//		QA1.name="Shlomo";
//		QA1.age=39;
//		QA1.printDetails();
		
		ClassProgrammer prog = new ClassProgrammer();
		prog.name = " Moshe";
		prog.age = 21;
		prog.yearsInCompany=1.5;
		prog.printDetails();
		System.out.println("New salary: " + prog.salaryRaise());
	}

}

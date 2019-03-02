package lesson03_OperatorStatement;

public class main 
{
	public static void main(String[] args) 
	{
		int x,result;
		x = 2;
		result = x%2==0 ? ++x : -1; //make modulus operation boolean; ++ then X means: add then do the operation
		//x++ then X means:  do the operation then add
		//x%=2 --> x = x%2  another way to write the modulus operation
		    System.out.println(result);			
		    String contriesArray[] = {"Austria", "Germany","Canada","Peru","Israel","China"};//07_ex1

			for(String Country : contriesArray)
			{System.out.print(Country + " ,");}
			for(String Country : contriesArray)
			{ if(Country.equals("Israel"))
				System.out.println(Country + " exists in list");   }
			if(contriesArray[2].equals("China"))			
				System.out.println("Yes, it is there");
				else System.out.println("no, sorry..");	
			System.out.println(contriesArray[0].length());
	System.out.println("***end of exercise1, lesson7 ");

			int[] numbers = {15,2,36,20,7};
			if (numbers[0]>numbers[1])
			   System.out.println("First One is Bigger");
				else System.out.println("second One is Bigger");				
			for(int numbersSum : numbers)
			{
				result = result + numbersSum;
			}
			System.out.println("numbers Sum is: " + result);	

			int biggestnumber = 0;
			for(int numbersSum : numbers)
			  {
				if (numbersSum > biggestnumber)
				  biggestnumber = numbersSum;
			  }
			System.out.println("Biggest number is: " + biggestnumber);
			System.out.println("***end of exercise2, lesson7 ");

//Example_statements
			double[] salary = {3500, 14000, 8000, 50000};// 3500 will become 3500.0 in back
			double resultSalary = 0.0;
			for(double value : salary) 
			{
				if(value>5000 && value <=10000)
				    //value= value*0.9;
					resultSalary = value / 1.1;
				else if (value>10000 && value<20000)
					resultSalary = value / 1.2;
				else if(value>20000)
				    resultSalary = value / 1.3;
				else //less then 5000 is out of scope for Tax
					resultSalary = value;
				System.out.println(resultSalary);
			}
	}
}


//6 I++ :  print i then update

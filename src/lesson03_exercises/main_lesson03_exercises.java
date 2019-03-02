package lesson03_exercises;

public class main_lesson03_exercises {

	public static void main(String[] args) 
	{
		int kinder=105;
		if(kinder>=0 && kinder<=6)
		System.out.println("Go to Kindergarten");
		if(kinder>=6 && kinder<=18)
		System.out.println("Go to School");
		if(kinder>=19 && kinder<=67)
		System.out.println("Go to Work");
		if(kinder>=67 && kinder<=120)
		System.out.println("Collecting Pension");			
		System.out.println("***end of exercise3, lesson7 ");			

		String proffesion = "Teacher";
		int Salary=0;
		switch(proffesion)
		{
		case "Teacher":
		 {
			Salary = 5000;
			break;
		 }
		case "Bank Teller":
		 {
			Salary = 10000;
			break;
		 }
		case "QA":
		 {
			Salary = 15000;
			break;
		 }
		case "everage salary":
		 {
			Salary = 9000;
			break;
		 }
		}
		System.out.println("Salary of " + proffesion + " is: " + Salary);
		System.out.println("***end of exercise4, lesson7 ");		
		
		String[][] MultiArray = new String[2][3];
		MultiArray[0][0]="Moshe";
		MultiArray[0][1]="22";
		MultiArray[0][2]="Jerusalem";
		MultiArray[1][0]="Joseph";
		MultiArray[1][1]="45";
		MultiArray[1][2]="London";
		for (int i = 0; i < 2; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				System.out.println(MultiArray[i][j]);
			}
		}
		System.out.println("***end of exercise5, lesson7 ");	
		
		int[] array = {1,2,3,4,5,6,7};
		for (int i=0; i<array.length; i++)
		{
			if((array[i]%2)==0)
			System.out.println(array[i]);
		}		
		System.out.println("***end of exercise6, lesson7 ");	
		
		String[] array2 = {"o","l","l","e","h"};
		int i=array2.length-1;
		do 
		{
			System.out.print(array2[i]);
			i--;
		}
			while(i>=0);  				 
	}

}

package L4_Video_exceptionAccess;

public class myStudents 
{
	static void CalcAverage(int[] grades)
	{
		try
		{
			if(grades[10] == 100)
			{
				System.out.println("Congrats!");
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Out of array limits!");
		}

		int sumgrades = 0;
		for(int currentgrade : grades)
		{
			sumgrades += currentgrade;
		}
		try 
		{
		System.out.println(sumgrades / grades.length);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Array is empty");
		}
	}
}


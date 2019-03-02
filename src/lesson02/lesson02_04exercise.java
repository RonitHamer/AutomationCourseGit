package lesson02;

public class lesson02_04exercise {

	public static void main(String[] args) 
	{
		Person person1  = new Person();	
		person1.firstName="Ronit";
		person1.familyName="Hamermesh";
		person1.age=42;
		person1.fullNameF();
		
		String[] array1={"Java","is","a","general","purpose","computer","programming","languge"};
		String[][] MultiArray = new String[2][3];
		MultiArray[0][0]="Moshe";
		MultiArray[0][1]="22";
		MultiArray[0][2]="Jerusalem";
		MultiArray[1][0]="Joseph";
		MultiArray[1][1]="45";
		MultiArray[1][2]="London";
	
		String ageAsString = Integer.toString(person1.age);
		System.out.println(ageAsString);  
		System.out.println(person1.fullNameF());
		System.out.println(person1.fullNameF().length());
		System.out.println(person1.fullNameF().equals(person1.age));
		//System.out.println(array1[5] + " " + array1[6] + " " + array1[7]);// print based on location from 0 till 7
		System.out.println(array1[array1.length-3] + " " + array1[array1.length-2] + " " + array1[array1.length-1]);//last 3 words in the array
		System.out.println(MultiArray[0][2]);
		
	}
}

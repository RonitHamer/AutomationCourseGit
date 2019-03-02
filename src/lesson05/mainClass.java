package lesson05;

public class mainClass {

	public static void main(String[] args) 
	{
		child text = new child();
				text.print1();
				
		Israel TradIsrael = new Israel();
		System.out.println("In Israel Traditional food is: " + TradIsrael.myTraditionalFood());
		System.out.println("In Israel Traditional vacation is: " + TradIsrael.myTraditionalVacation());
		System.out.println("In Israel Traditional Languge is: " + TradIsrael.myTraditionalLanguge());
		System.out.println("");
		USA TradUSA = new USA();
		System.out.println("In USA Traditional food is: " + TradUSA.myTraditionalFood());
		System.out.println("In USA Traditional vacation is: " + TradUSA.myTraditionalVacation());
		System.out.println("In USA Traditional Languge is: " +TradUSA.myTraditionalLanguge());
		System.out.println("");
		China TradChina = new China();
		System.out.println("In China Traditional food is: " + TradChina.myTraditionalFood());
		System.out.println("In China Traditional vacation is: " + TradChina.myTraditionalVacation());
		System.out.println("In China Traditional Languge is: " + TradChina.myTraditionalLanguge());
	}
}

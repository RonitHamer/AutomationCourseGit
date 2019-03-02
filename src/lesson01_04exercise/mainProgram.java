package lesson01_04exercise;

public class mainProgram 
{
	public static void main(String[] args) 
		{
		//new class created
		MobileDevice mainProgram  = new MobileDevice();		
		mainProgram.model ="Jonny";
		mainProgram.OS = 'A';
		mainProgram.OSVersion = 12;
		mainProgram.hasFlash = false;
		mainProgram.price=200.4;	
		mainProgram.screenHeight=10;
		mainProgram.screenWidth=22;

		mainProgram.printParameters();	
		int area = mainProgram.CalculateArea();
		System.out.println("Calculate Area is: " + area);
		//System.out.println("Calculate Area is: " + mainProgram.screenWidth * mainProgram.screenHeight); 
		//= bad practice!!  need to create function for reuse
		mainProgram.PictureQuality();
		}
}

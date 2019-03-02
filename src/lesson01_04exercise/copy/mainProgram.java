package lesson01_04exercise.copy;

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
		try
		{
			mainProgram.setDim(-10,22);//setDim since screenWidth,screenHeigh are private
			int area = mainProgram.CalculateArea(10,20);
			System.out.println("Calculate Area is: " + area);
		}
		catch(Exception e)
		{System.out.println(e);}

		mainProgram.printParameters();	
		//System.out.println("Calculate Area is: " + mainProgram.screenWidth * mainProgram.screenHeight); 
		//= bad practice!!  need to create function for reuse
		mainProgram.PictureQuality();
		}
}

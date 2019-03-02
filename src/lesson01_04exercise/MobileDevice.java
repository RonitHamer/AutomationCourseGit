package lesson01_04exercise;

public class MobileDevice 
{
	// smart phone data
	String model; //mobile's name
	char OS; //A - Android , I - IOS, W - Window Phone
	int OSVersion;
	boolean hasFlash;
	double price;
	int screenWidth,screenHeight;

	int CalculateArea()
	{
		return screenWidth * screenHeight;
	}	
	
	public void printParameters()	
	{
		System.out.println("Model is: " + model);
		System.out.println("Operating system is: " + OS);
		System.out.println("Operating system's version is: " + OSVersion);
		System.out.println("Does it have Flash: " + hasFlash);
		System.out.println("Price is: " + price);
	}
	public void PictureQuality()	
	  {
		if (hasFlash) //when result is true
		{
		System.out.println("Picture Quality is of Good Quality");
		}
	    else {  //when result is false
		System.out.println("Picture Quality is of bad Quality");}	
	  }
}
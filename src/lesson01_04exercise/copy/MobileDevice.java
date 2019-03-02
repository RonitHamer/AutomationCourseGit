package lesson01_04exercise.copy;

public class MobileDevice 
{
	// smart phone data
	String model; //mobile's name
	char OS; //A - Android , I - IOS, W - Window Phone
	int OSVersion;
	boolean hasFlash;
	double price;

//EX03
	private int screenWidth,screenHeight;

	void setDim(int W, int H)
	{
		if(W > 0 && W <= 10)
		screenWidth = W;
		if(H > 0 && H <= 20)
			screenHeight = H;
		else
		{
			screenWidth = 0;
			screenHeight = 0;
		}
	}
	
	int CalculateArea(int screenWidth , int screenHeight) //EX04,java09
	{
		return this.screenWidth * this.screenHeight;
	}	
	
	
	public void printParameters()	
	{
		System.out.println("Model is: " + model);
		System.out.println("Operating system is: " + OS);
		System.out.println("Operating system's version is: " + OSVersion);
		System.out.println("Does it have Flash: " + hasFlash);
		System.out.println("Price is: " + price);
		//System.out.println("Device Details: " + model + " " + OS + " " + OSVersion + " " + hasFlash + " " + price);  Yoni's solution
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
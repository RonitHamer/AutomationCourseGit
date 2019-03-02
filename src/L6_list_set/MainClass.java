package L6_list_set;

//import ... or select & raw will be added
import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) 
	{
		List<String> countries = new ArrayList<String>();
		List<String> Nocountries = new ArrayList<String>();
		
		countries.add("Italy");
		countries.add("Spain");
		countries.add("Netheland");
		countries.add("USA");
		countries.add("France");
		countries.add("Japan");
		countries.add("Egypt");
		countries.add("Greece");
		
		Nocountries.add("New Ziland");
		Nocountries.add("China");
		Nocountries.add("Australia");
		
		countries.remove(countries.size()-1);
					
		//double middle;  complete #4
		//countries.size()\2 = middle;
		System.out.println("Number of counties is: " + countries.size());
		//System.out.println("Country in the middle is: " + countries(middle));
		countries.set(  countries.indexOf("Egypt"), "India");
		
		for (String value : countries)
		{
			System.out.println(value);
		}
		if (countries.contains("Germany"))
			System.out.println(countries.indexOf("Germany"));
		else System.out.println("No");
		
		System.out.println("Last country is: " + countries.get(countries.size()-1) );
	}
}

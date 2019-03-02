package lesson02;

public class Person {
	String firstName;
	 String familyName;
	 int age;
		 	 
	 String fullNameF() 
	 {
		String fullName = firstName.concat(familyName);
		return fullName.toUpperCase();
	 }
}

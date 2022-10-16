package vaccinationSystem;
import java.util.Scanner;
import java.util.regex.*;
public class Registration {

	public void inputData() {
		Scanner sc= new Scanner(System.in);
		String firstName,lastName,address,password, phone;
		int age;
		System.out.println("Enter your first name");
		firstName=sc.next();
		if(!checkStringForAlphabets(firstName)) {
			System.out.println("Cannot enter Numbers, re-enter the Data");
			firstName=sc.next();
		}
		
		System.out.println("Enter your last name");
		lastName=sc.next();
		if(!checkStringForAlphabets(lastName)) {
			System.out.println("Cannot enter Numbers, re-enter the Data");
			lastName=sc.next();
		}
		
		System.out.println("Enter your Address");
		address=sc.next();
		address+=sc.nextLine();
		if(address.length()<=6) {
		 System.out.println("Please Enter an valid address");
		 address=sc.next();
		 address+=sc.nextLine();
		}
		System.out.println("Enter your Age (Enter numbers only)");
		age=sc.nextInt();
		if(Integer.signum(age)!=1) {
			System.out.println("Age cannot be Zero or negative, Re-enter Age");
			age=sc.nextInt();
		}
		
		System.out.println("Enter your Mobile number");
		phone=sc.next();
		if(!isValidPhoneNumber(phone)) {
			System.out.println("Entered number is not a valid number, Re-enter a Valid phone number");
			phone=sc.next();
		}
		System.out.println("All data entered Succefully!!");
		sc.close();
	}
	// function will check if the mobile number is an valid Indian number or not 
	public static boolean isValidPhoneNumber(String s) { 
		//an Indian phone number
		//1.begins with 0 or 91
		//2. then have 6,7,8 or 9 starting digit
		//3. then contains 9 more digits
		//using Regex Pattern & Matcher class
		Pattern p =Pattern.compile("(0|91)?[6-9][0-9]{9}");
		Matcher m= p.matcher(s);
		
		return(m.find() && m.group().equals(s));
	}
	public  static boolean checkStringForAlphabets(String str) {
		
		return ((str!=null)&&(!str.equals(" "))&&(str.matches("^[a-zA-Z]*$"))); //used Regex String.matches()
		
	}
	public static void main(String[] args) {
		Registration r= new Registration();
		r.inputData();
		

	}

}

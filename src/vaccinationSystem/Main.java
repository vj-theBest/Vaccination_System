//This is the  part main Execution of System {Selection of **** is done here} 
package vaccinationSystem;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		System.out.println("<== Welcome to Vaccination System ==>");
		int num= 0;
		do {
			System.out.println("Press 1 for new Registration. \nPress 2 for Searching. \nPress 3 To check Profile. ");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				Registration reg =new Registration();
				reg.inputData();
				break;
			case 2:
				//Searching part
				break;
			case 3:
				//Profile check part
				break;
			default:
					System.out.println("Enter a valid number to Continue");
					num=1;
			}		
		}while(num==1);
		sc.close();
	}

}

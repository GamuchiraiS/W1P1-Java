//For scanner 
import java.util.*;

public class oneOfOne {
	public static void main(String [] args){
		String userName;
		int userAge;

		Scanner sc = new Scanner(System.in);
		//Asking user for their name
		System.out.println("Please enter your name: ");
		//Reading their input
		userName = sc.nextLine();

		//Asking user for their age
		System.out.println("Please enter your age: ");
		userAge = Integer.parseInt(sc.nextLine());

		if (userAge > 18){
			System.out.println("Hi " + userName + "! You qualify to " +
            "apply for a car driver license.");
		}

		else if (userAge == 17){
			System.out.println("Hi " + userName + "! You qualify to " +
            "apply for a car learner license.");
		}

		else {
			System.out.println("Hi " + userName + "! You do not qualify to " +
            "apply for a car learner or driver license.");
		}
		sc.close(); //close Scanner

	}
}

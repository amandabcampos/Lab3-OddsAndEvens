import java.util.Scanner;

public class OddsAndEvens {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = scnr.nextLine(); //or next?
		
		boolean looping = true;
		while(looping) {
		
			System.out.print(name + ", please enter a number between 1 and 100: ");
			int number = scnr.nextInt();
			if (number > 0 && number < 101) {	
				if (number % 2 == 0) {
					if (number < 26) {
						System.out.println("Even and less than 25");
					} else if (number < 61) {
						System.out.println("Even");
					} else {
						System.out.println(number + " is even");
					}	
				} else {
					if (number > 60) {
						System.out.println(number + " is odd and over 60");
					} else {
						System.out.println(number + " is odd");
					}
				}
			} else {
				System.out.println("Invalid entry");
			}
		System.out.print(name + ", would you like to continue? (y/n): ");
		looping = scnr.next().startsWith("y");
		
		}
		System.out.print("Bye, " + name);
		scnr.close();
	}
			
}

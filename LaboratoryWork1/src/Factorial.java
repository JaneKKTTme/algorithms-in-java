import java.util.Scanner;
public class Factorial { 
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in); 
		int fact = 2; 
		int result = 1; 
		System.out.print("Enter the number: "); 
		if (sc.hasNextInt()) { 
			fact = sc.nextInt();
			System.out.println(fact); 
			for (int i=1; i<=fact; i++) { 
				result = result*i; 
			} 
			System.out.print("Result: " + result); 
		} 
		else {
			System.out.println("You are loser!"); 
		}
	}
}
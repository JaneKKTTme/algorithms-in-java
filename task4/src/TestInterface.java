import java.util.Scanner;

public class TestInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Take me your name. ");
		String s1 = sc.nextLine();
		System.out.println("Take me your surname. ");
		String s2 = sc.nextLine();
		System.out.println("What is your pet's name? ");
		String s3 = sc.nextLine();
		Nameable nameable = new Person(s1, s2);
		nameable.getName();
		nameable = new Animal(s1);
		nameable.getName();
	}

}

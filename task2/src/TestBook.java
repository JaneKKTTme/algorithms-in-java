import java.util.Scanner; 

public class TestBook extends Book{ 
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in); 
		Book b1 = new Book(); 
		System.out.println("Enter the name of book: "); 
		b1.setName(sc.nextLine());
		System.out.println("Enter the author of book: "); 
		//sc.next();
		b1.setAuthor(sc.nextLine()); 
		System.out.println("Enter the year of publishing: "); 
		b1.setYear(sc.nextInt()); 
		System.out.println("Enter the number of pages: "); 
		b1.setNumberOfPages(sc.nextInt()); 
		b1.println(); 
	} 
}
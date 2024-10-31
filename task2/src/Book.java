
public class Book {
	String Name; 
	String Author; 		
	int Year; 
	int NumberOfPages; 
		
	Book() { }; 
	
	public Book(String _name, String _author, int _year, int _numberofpages) { 
		Name = _name; 
		Author = _author; 
		Year = _year; 
		NumberOfPages = _numberofpages; 
	} 

	public void setName(String _name) { 
		this.Name = _name; 
	} 
		
	public String getName() { 
		return Name; 
	} 

	public void setAuthor(String _author) { 
		this.Author = _author; 
	} 

	public String getAuthor() { 
		return Author; 
	} 
	
	public void setYear(int _year) { 
		this.Year = _year; 
		} 

	public int getYear() { 
		return Year; 
	} 

	public void setNumberOfPages(int _numberofpages) { 
		this.NumberOfPages = _numberofpages; 
	} 
	
	public int getNumberOfPages() { 
		return NumberOfPages; 
	} 

	public void println() { 
		System.out.println("BOOK\n" + "Name: " + Name + "\n" + "Author: " + Author + "\n" + 
		"Year of publishing: " + Year + "\n" + "Number of pages: " + NumberOfPages); 
	} 
}

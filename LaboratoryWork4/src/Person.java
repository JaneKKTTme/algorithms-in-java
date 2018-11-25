public class Person implements Nameable{
	private String Name;
	private String Surname;
	
	Person(String name, String surname) {
		this.Name = name;
		this.Surname = surname;
	};
	
	public void getName() {
		System.out.println("PERSON\nName: " + Name + "\nSurname: " 
	+ Surname + "\n");
	}
}

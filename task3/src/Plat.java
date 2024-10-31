public class Plat extends Dish{
	protected int Diameter;
	
	public Plat() {};
	
	public Plat(String color, String material) {
		this.Color = color;
		this.Material = material;
	}
	
	public Plat(String color, String material, int diameter) {
		this.Color = color;
		this.Material = material;
		this.Diameter = diameter;
	}
	
	public void setDiameter(int diameter) {
		this.Diameter = diameter;
	}
	
	public int getDiameter() {
		return Diameter;
	}
	
	public void surpriseToYou() {
		System.out.println("It should be a surprise. But at night I do not come up with anything.");
	}
	
	public void println() {
		System.out.print("\nPLAT:\nColor: " + Color + 
				"\nMaterial: " + Material + "\nDiameter: " + Diameter);
	}
}

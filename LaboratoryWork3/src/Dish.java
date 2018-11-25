
public abstract class Dish {
	protected String Color;
	protected String Material;
	
	public Dish() {};
	
	public Dish(String color, String material) {
		this.Color = color;
		this.Material = material;
	}
	
	public void setColor(String color) {
		this.Color = color;
	}
	
	public String getColor() {
		return Color;
	}
	
	public void setMaterial(String material) {
		this.Material = material;
	}
	
	public String getMaterial() {
		return Material;
	}
	
	public void surpriseToYou() {
		System.out.println("Each type of dishes can be broken!\n"
				+ "But if it happen, the dish will hate you.");
	}
	
	public void println() {
		System.out.print("DISH:\nColor: " + Color + "\nMaterial: " + Material);
	};
}

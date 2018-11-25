public class Cup extends Dish{
	protected int Volume;
	
	public Cup() {};
	
	public Cup(String color, String material) {
		this.Color = color;
		this.Material = material;
	}
	
	public Cup(String color, String material, int volume) {
		this.Color = color;
		this.Material = material;
		this.Volume = volume;
	}
	
	public void setVolume(int volume) {
		this.Volume = volume;
	}
	
	public int getVolume() {
		return Volume;
	}
	
	public void surpriseToYou() {
		System.out.println("No surprises :(");
	}
	
	public void println() {
		System.out.print("\nCUT:\nColor: " + Color + 
				"\nMaterial: " + Material + "\nVolume: " + Volume);
	}
}
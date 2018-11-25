import java.util.ArrayList;

public class TestArrayList {
	public static void main(String[] args) {
		ArrayList<String> zoo = new ArrayList<String>();
		zoo.add("Parrot");
		zoo.add("Lion");
		zoo.add("Opossum");
		zoo.add("Dinosaur");
		zoo.add("Hippopotamus");
		for (int i = 0; i < 5; i++) {
			System.out.println(i+1 + " animal: " + zoo.get(i));
		}
		System.out.print("\nDo you have an opossum? ");
		if ( zoo.indexOf("Opossum") != -1) {
			System.out.print("Oh, yes!");
		}
		else {
			System.out.print("\nIt is so pity! But no...");
		}
		System.out.println("\nLion will be arrived to the next Zoo. So...");
		zoo.remove(1);
		for (int i = 0; i < 4; i++) {
			System.out.println(i+1 + " animal: " + zoo.get(i));
		}
		System.out.println("\nAnd dinosaur will be changed on cat.");
		zoo.set(3, "Cat");
		for (int i = 0; i < 4; i++) {
			System.out.println(i+1 + " animal: " + zoo.get(i));
		}
	}
}

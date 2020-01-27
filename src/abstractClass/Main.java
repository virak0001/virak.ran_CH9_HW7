package abstractClass;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Thing> allThings = new ArrayList<>();
		Bike bike = new Bike("Giant ", 1, true, true);
		allThings.add(bike);
		System.out.println(bike.name);
	}
}

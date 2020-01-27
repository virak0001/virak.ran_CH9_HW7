package abstractClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Thing> allThings = new ArrayList<>();
		allThings.add(new Bike("Giant ", 1, true, true));
		allThings.add(new Bike("hello ", 3, false, true));
		
		for (int i = 0; i < allThings.size(); i++) {
			System.out.println(allThings.get(i).name);
		}
	}
}

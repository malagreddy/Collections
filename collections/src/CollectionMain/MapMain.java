package CollectionMain;

//HAshMap
import java.util.HashMap;
import java.util.Set;

public class MapMain {
	public static void main(String args[]) {
		HashMap<String, String> map = new HashMap<>();

		map.put("Mala", "Pomogranate");
		map.put("NagaShekar", "Apple");
		map.put("Pavithra", "Mango");

		// getting favorite fruit by their name
		if (map.containsKey("Mala")) {
			String s = map.get("Mala");
			System.out.println("Favorite fruit is " + s);
		}
	}

}

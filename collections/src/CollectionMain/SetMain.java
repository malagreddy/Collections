package CollectionMain;

//HashSet
import java.util.HashSet;
import java.util.Iterator;

public class SetMain {
	public static void main(String[] args) {
		HashSet<String> h = new HashSet<String>();
		h.add("chennai");
		h.add("Mumbai");
		h.add("Bangalore");
		h.add("Kolkata");
		h.add("Bangalore");// duplicate

		System.out.println(h);
		// iterating over hash set items
		System.out.println("Iterating over the list");
		Iterator<String> i = h.iterator();
		while (i.hasNext())
			System.out.println(i.next());

	}

}

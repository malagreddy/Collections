package CollectionMain;

//TreeSet
import java.util.Set;
import java.util.TreeSet;

public class Tree {

	public static void main(String[] args) {
		Set<Object> tree = new TreeSet<>();

		// add items to treeSet
		tree.add("Mala");
		tree.add("Meena");
		tree.add("Sinchu");
		tree.add("Geeta");
		tree.add("Ram");

		tree.stream().forEach((tree1) -> System.out.println(tree1));
	}
}

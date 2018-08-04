package CollectionMain;

//LinkedList 
import java.util.*;
import collections.Car;
import collections.CellPhone;
import collections.School;
import collections.Television;
import collections.laptop;

public class LinkedListMain {

	public static void main(String[] args) {
		List list = new LinkedList();
		// add elements to list
		list.add(new Car("Benz", 4000000, 1999, "Mercedes"));
		list.add(new Car("Suzuki", 200000, 1987, "Maruthi"));
		list.add(new Car("carrera", 8000000, 2011, "Porsche"));
		list.add(new Car("carrera", 8000000, 2011, "Porsche"));// duplicate
																// object

		list.add(new CellPhone("vivo", "v5s", "improved features", "Android", 17000));
		list.add(new CellPhone("Samsung", "j7", "improved features", "Android", 15000));
		list.add(new CellPhone("iphone", "iphone6", "improved features", "ios", 30000));

		list.add(new laptop("Dell", "inspiron", "windows", "i5"));
		list.add(new laptop("Hp", "hp", "windows", "i7"));
		list.add(new laptop("Lenevo", "lenevo", "linux", "i3"));
		list.add(new laptop("Dell", "inspiron", "windows", "i5"));// duplicate
																	// object

		list.add(new School("BGS", "Bangalore", "Bangalore", 5));
		list.add(new School("RNS", "Bangalore", "Bangalore", 4));
		list.add(new School("VVN", "Gowribidanur", "Chikkaballapur", 1));

		list.add(new Television("Sony", "LED", false, 8000));
		list.add(new Television("Samsung", "LCD", false, 4000));
		list.add(new Television("LG", "Plasma", true, 10000));

		list.stream().forEach((list1) -> System.out.println(list1));
	}

}

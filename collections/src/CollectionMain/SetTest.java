package CollectionMain;

//program to depict that set does not accept duplicate objects
import java.util.LinkedHashSet;
import java.util.*;

import collections.Car;
import collections.CellPhone;
import collections.School;
import collections.Television;
import collections.laptop;

public class SetTest {
	public static void main(String[] args) {
		Set<Object> set = new LinkedHashSet<>();
		set.add(new Car("Benz", 4000000, 1999, "Mercedes"));
		set.add(new Car("Suzuki", 200000, 1987, "Maruthi"));
		set.add(new Car("carrera", 8000000, 2011, "Porsche"));
		set.add(new Car("carrera", 8000000, 2011, "Porsche"));// duplicate
																// object

		set.add(new CellPhone("vivo", "v5s", "improved features", "Android", 17000));
		set.add(new CellPhone("Samsung", "j7", "improved features", "Android", 15000));
		set.add(new CellPhone("iphone", "iphone6", "improved features", "ios", 30000));
		set.add(new CellPhone("iphone", "iphone6", "improved features", "ios", 30000));// duplicate
																						// object

		set.add(new laptop("Dell", "inspiron", "windows", "i5"));
		set.add(new laptop("Hp", "hp", "windows", "i7"));
		set.add(new laptop("Lenevo", "lenevo", "linux", "i3"));
		set.add(new laptop("Lenevo", "lenevo", "linux", "i3"));// duplicate
																// object

		set.add(new School("BGS", "Bangalore", "Bangalore", 5));
		set.add(new School("RNS", "Bangalore", "Bangalore", 4));
		set.add(new School("VVN", "Gowribidanur", "Chikkaballapur", 1));
		set.add(new School("VVN", "Gowribidanur", "Chikkaballapur", 1));// duplicate
																		// object

		set.add(new Television("Sony", "LED", false, 8000));
		set.add(new Television("Samsung", "LCD", false, 4000));
		set.add(new Television("LG", "Plasma", true, 10000));
		set.add(new Television("Samsung", "LCD", false, 4000));// duplicate
																// object

		set.stream().forEach((list1) -> System.out.println(list1));
	}

}

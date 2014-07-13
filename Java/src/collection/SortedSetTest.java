package collection;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class SortedSetTest {

	public static void main(String[] args) {
		String[] a = new String[]{
				"a", "b", "c", "d"
		};
		
		List<String> list = Arrays.asList(a);		
		Collections.rotate(list, 1);
		for (String ele : list) {
			System.out.println(ele);
		}
	}

}

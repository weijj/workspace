package app;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class UpperBoundedWildcards {
	
	public static double process(List<? extends Number> list) { // upper bound wildcard
		double sum = 0.0;
		for (Number n : list) {
			sum += n.doubleValue();
		}
		
		return sum;
	}
	
	public static double processIt(List<Number> list) {
		double sum = 0.0;
		for (Number n : list) {
			sum += n.doubleValue();
		}
		
		return sum;
	}
	
	public static void print(List<?> list) {
		for (Object o: list) {
			System.out.println(o);
		}
	}
	
	public static void addNumber(List<? super Integer> list) { // lower bound wildcard
		for (int i = 0; i < 10; ++i) {
			list.add(i);
		}
	}

	public static void main(String[] args) {
		List<Object> list = new ArrayList<Object>();
		addNumber(list);
		print(list);
	}

}

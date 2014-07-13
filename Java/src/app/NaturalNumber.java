package app;

import java.util.List;
import java.util.ArrayList;

class EvenNumber extends NaturalNumber {
	public EvenNumber(int i) {
		super(i);
	}
}

public class NaturalNumber {
	private int i;
	public NaturalNumber(int i) {
		this.i = i;
	}
	
	public static void main(String[] args) {
		List<? extends NaturalNumber> ln = new ArrayList<NaturalNumber>();
//		ln.add(new NaturalNumber(35)); the List<?extends ...> can be informly thought of as read-only
	}
}

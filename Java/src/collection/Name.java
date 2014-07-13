package collection;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Name implements Comparable<Name> {
	private final String firstName, lastName;
	
	public Name(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String toString() {
		return this.firstName + " " + this.lastName;
	}
	
	public int compareTo(Name name) {
		int result = this.lastName.compareTo(name.lastName);
		return (result != 0 ? result : this.firstName.compareTo(name.firstName));
	}

	public static void main(String[] args) {
		Name[] names = new Name[] {
				new Name("Lione", "Messi"),
				new Name("Xavi", "Alonso"),
				new Name("Cristodo", "Rinado"),
				new Name("Fan", "Perse")
		};
		
		List<Name> ls = Arrays.asList(names);
		
		Comparator<Name> comparator = new Comparator<Name>() {
			public int compare(Name n1, Name n2) {
				return n1.firstName.compareTo(n2.firstName);
			}
		};
		
		Collections.sort(ls, comparator);
		
		for (Name ele : ls) {
			System.out.println(ele);
		}
	}

}

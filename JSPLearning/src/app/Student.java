package app;

public class Student {
	private int id;
	private String name;
	
	public Student() {}
	
	public Student(int id, String name) {
		this.setId(id);
		this.setName(name);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "ID: " + this.id + ", Name: " + this.name;
	}
	
}

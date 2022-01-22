package week1.day1;

public class Student {

	public String name = "Parimala";
	private int rollNo = 87;

	public static void main(String[] args) {
		Student obj = new Student();
		System.out.println(obj.name);
		System.out.println(obj.rollNo);
		obj.College();
	}

	void College() {
		String name = "Pawankumar";
		System.out.println(name);
	}

}

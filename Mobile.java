package week1.day1;

public class Mobile {
	
	public static void main(String[] args) {
		Mobile obj1 = new Mobile();
		obj1.sendMsg();
		obj1.makeCall(9876789878L);
		obj1.saveContact("John", 7788998877L);

	}

	public void sendMsg() {
		String name = "Daisy";
		String msg = "Hi How are you?";
		System.out.println(name);
		System.out.println(msg);
	}

	private void makeCall(long num) {
		System.out.println("Call to number " + num);
	}

	void saveContact(String name, long num) {
		System.out.println(name);
		System.out.println(num);
	}

}

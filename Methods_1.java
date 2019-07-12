package Methods_2;
public class Methods_1 {
	public static void main(String[] args) {

		sayHello("Aisha");
		sayHello("John");
		sayHello("Rebecca");
		
		int eID = returnNumber();
		System.out.println(eID);
		
		Add(2,2);
		Add(99,2);
		Add(29, 34, 20);
		Methods_1 obj = new Methods_1();
		obj.nonStat();
		obj.Stat();
	}

	public static void sayHello(String name) {
		System.out.println("Hello "+name);
	}
	public static int returnNumber() {
		int empID = 100;
		return empID;
	}
	
	public static void Add(int a, int b) {
		System.out.println(a + b);
	}
	public static void Add(int c, int d, int e) {
		System.out.println(c + d - e);
	}
	void nonStat() {
		System.out.println("I am Non-Static Method");
	}
	static void Stat() {
		System.out.println("I am Static Method");
	}
}

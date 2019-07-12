package Methods_2;

public class methods_2 {

	public static void main(String[] args) {
		// All 4 methods

      sayHelloWorld();  // calls the method

		cities("Astoria");

		cities("LIC");

		int two = retrunTwo();

		System.out.println(two);

		int result = square(5);

		System.out.println(result);
	}	

	//This method simply says Hello World

	static void sayHelloWorld() {

		System.out.println("Hello, World!");
	}

	//This method will print cities to whenever cities are passed when called

	static void cities(String cities) {

		System.out.println("This city is "+cities);

	}

	//This method returns an int type w/ the value 2

	static int retrunTwo() {

		return 2;
	}

	//This method both returns a value + takes in data

	static int square(int x) {

		return x * x;
	}

	}



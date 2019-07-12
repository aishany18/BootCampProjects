package Exceptions_3;
public class Exceptions_1 {
public static void main(String[] args) {	
	
	System.out.println("Execution Started");
		try {
	int val1 = 20;
	int val2 =  val1/2;  //<-- divide it by 0 & see what happens

	System.out.println("value of value2 is"+val2);

	}catch (Exception e) {

			e.printStackTrace();
		}
		finally {

			System.out.println("Execution Ended");
		}
	}
}

package Exceptions_3;
public class Exception_Example2 {
	public static void main(String[] args) {		
	
System.out.println("Execution Started");

try {

int val1 = 20;

int val2 =  val1/2;  //<-- divide it by 0 & see what happens

System.out.println("value of value2 is"+val2);
		
}catch (ArithmeticException e) {     // type in arithemetic Exception and then select arithemtic lang

System.out.println("In Arithemetic Exception Catch Block");

e.printStackTrace();

}catch (Exception ie) {  // u can have another catch block

	ie.printStackTrace();
System.out.println("In Exception catch block");
		}
		finally {
			System.out.println("Execution Ended");
		}
	}
}

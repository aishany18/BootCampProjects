package Abstract_1;
public class paint_2 extends colors_1 {
	public static void main(String[] args) {
		paint_2 obj = new paint_2();
		obj.yellow();
		obj.pink();
		obj.green();
		obj.purple();
		obj.white();
	}
	@Override
	public void yellow() {
    System.out.println("Yellow");		
	}
	@Override
	public void pink() {
	    System.out.println("Pink");				
	}
	@Override
	public void green() {
	    System.out.println("Green");				
	}
	@Override
	public void purple() {
	    System.out.println("Purple");			
	}

	@Override
	public void white() {
	    System.out.println("White");		
		
	}

}

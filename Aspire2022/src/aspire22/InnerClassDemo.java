package aspire22;

public class InnerClassDemo{
	
	//inner classes are used for better encapsulation.
	
public static void main(String args[]) {
	
	Outer.Inner inn = new Outer.Inner();//declaring the obj for static inner class
	inn.meth();
	
	Outer.Inner2 inn2 = new Outer().new Inner2(); //declaring the obj for non-static inner class
	inn2.meth();

	
}
}
	

class  Outer{
	
	int i;
	void methh() {
		
	}
	//inner
	static class Inner{
	public void meth() {
		
		//methh(); we cannot call non-static method inside the static.
	
	//System.out.println("static in inner class.........."+i);
	
	}	
}

class Inner2{
	public void meth() {

		methh();
	System.out.println("non-static inner class.........."+i);	
	}
	
}

}


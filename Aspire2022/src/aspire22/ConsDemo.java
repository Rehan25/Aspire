package aspire22;

public class ConsDemo {
  ConsDemo() {//class name and constructor name should be same. it is also a default constructor.
	  System.out.println("cons called.....");
	  }
  
  ConsDemo(String s){// constructor overload, we can create multiple cons and call both default and new cons at same time.
	  System.out.println("cons called......:"+s);
	  
  }
  
  ConsDemo(String s,  int i) {
	  System.out.println("cons........:"+s+"..........."+i);
	  }
  
  
	  public static void main (String[] args) {
//ConsDemo obj;//its just creating the reference not object
 ConsDemo obj = new ConsDemo();
  System.out.println("..........");

ConsDemo obj2 = new ConsDemo("hello");

ConsDemo obj3 = new ConsDemo("hello", 10000);

//for one object only one constructor can be called
	
}
}

  


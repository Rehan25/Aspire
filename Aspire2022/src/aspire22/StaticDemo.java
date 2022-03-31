package aspire22;

public class StaticDemo {
	public static void main(String args[]) {
		MothersKitchen.food();
		MothersKitchen.food();
		MothersKitchen.food2();
	}	
}
class Kitchen{
	int i;
}
class MothersKitchen extends Kitchen{
	int i;
	public MothersKitchen(int i) {
		System.out.println("mothers kitchen cons called....");
		this.i=i; //this.i points towards the instance variable and just i towards the local variable.
		super.i=i;//this points to parent class
		//super is very important keyword we can use it refer super class variable,methods and constructors.
	}
	static {
		System.out.println("static block........");
	}
	public void meet() {
		i=90;
	}
	public static void food() {
		//this.i=90; - this cannot be used in static context
		//i=9;//non static fields cannot be referred in static context
		//super.i=8;//cannot use super in static context because its pointing towards the parent and for static parent is JVM.
		MothersKitchen obj=new MothersKitchen(1);//we can only declare a variable by creating an object in static.
		obj.i=0;
		System.out.println("yummy.......................");
	}	
	public static void food2() {
		System.out.println("yummy22222222222222222.......................");
	}	
}
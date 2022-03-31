//https://fluvid.com/videos/detail/oKxdEh6a1_CDjody4#.YhWXrlcGA0s.linkpublic 
//https://fluvid.com/videos/detail/oKxdEh6a1_CDjody4#.YhWXrlcGA0s.link
package aspire22;


	class VariableDemo3 {
	//three types of varaible 1.local 2.instance 3. class -- scope:-where they are available,how they are availabe etc.
	//local-variable declared with in the method.
	//instance variable - any variable declared outside a a method is a instance variable.
	//class variable - any variable declared with the keyword static is called a class varaible.
	
	int s;
	static int ss;
	void meth(int i) {
		System.out.println(i);
		}
	void meth2(long ll) {
		System.out.println(ll);	
			
		}
		public static void main(String[] args) {
			
			VariableDemo3 obj= new VariableDemo3();
			
			obj.s =10;
			//obj.ss = 1000;
			VariableDemo3.ss = 1000;
			
			VariableDemo3 obj2 = new VariableDemo3();
			
			
			System.out.println(obj.s + ":" +obj2.s);
			System.out.println(VariableDemo3.ss + ":" + VariableDemo3.ss); 
			
			obj2.s = 20;
			//obj2.ss = 2000;
			VariableDemo3.ss = 2000;

			System.out.println(obj.s + ":" +obj2.s);
			System.out.println(VariableDemo3.ss + ":" + VariableDemo3.ss);
				
			//local variable
			
			obj.meth(999);
			VariableDemo3 objx=obj;
			obj.meth(888);
			
			System.out.println(obj.s+ ":"+objx.s);
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	



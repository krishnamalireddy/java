package krishna;
class Test {
	
	int a;
	int b;
	int c;
	int d;
	
	
 }
public class AccessTest {
	public static void main(String args[]) {
		Test obj = new Test();
		obj.a = 15;
		obj.b = 20;
		
        obj.c = 30;
        obj.d = (obj.c +10) * (obj.a+obj.b);
        
        
        System.out.println("a,b,d &c"+obj.a+" "+obj.b+" "+obj.d+" "+obj.c);
        System.out.println("completed");

  
		
	
		


	}
}
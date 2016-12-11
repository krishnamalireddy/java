/**
 * 
 */
package krishna;



abstract class  arth {
	int a;
	int b;
	int c;
	int add;
	void addition()
				{
					add=a+b;
		System.out.println(add);
	}
		
	abstract void mul1();
	
/**
 * @author swaroop
 *
 */
}
class Inte  extends arth{
  public void mul1(){
	  c=a*b;
	 System.out.println(c);
 }
}
  public class Integer{
	public static void main(String[] args) {
	Inte ob = new Inte();
	ob.a=10;
	ob.b=2;
  ob.add=00;
ob.c=00;
ob.mul1();
ob.addition();
	}
		// TODO Auto-generated method stub

	

		// TODO Auto-generated method stub
		
}


package krishna;

 class overloaddemo {
	void method(){
	System.out.println("overloading")	;
	}
	private double zero;
	private double hard;
	overloaddemo( double z,double h){
		zero=z;
		hard=h;
	}
	void method(int a){
System .out.println("a="+a);
	}
	
	void method(int a,int c){
		System.out.println( "a and c: " + a + " " + this.zero +" "+this.hard);
		
		
	}
		
			double method(double c) {
				System.out.println("double c: " + c);
				return c*c;}
				
						
			
			
 }
			
	
    public class Overload{
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		overloaddemo ob = new overloaddemo(2,3);
		ob.method();
		//ob.method(10);
		ob.method(10,20);
		//double result = ob.method(0.2);
		//System.out.println("Result of ob.test(0.2): " + result);
		overloaddemo a = new overloaddemo(1,2);
		a.method();
		//a.method(12);
		a.method(22,88);
		//double result1 = a.method(1.2);
		//System.out.println("Result of a.test(1): " + result1);
	}
	}
		
		
		

	
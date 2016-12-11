package krishna;

public class Multicatch {
	public static void main(String args[]) {
		try{
			int a,b;
			a=1;
			b=1/a;
			System.out.println("correct");
			

			int c[]={ 12  };
			c[11] = 88;
			
			 System.out.println("right");
			 
		
			
		}
		
		catch
			(ArithmeticException x){
		System.out.println("divided by zero"+x);
			
		}
		catch
			(Exception e){
			System.out.println("out of code"+e);
		}
		}
	}
			
	
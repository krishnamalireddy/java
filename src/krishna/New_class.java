package krishna;
class act{
	 void method1(){
		System.out.println("new program");
	}
	private int zero;
	private int one;
	
	act(int z,int o){
		zero=z;
		one=o;
	}
	
	
	void method2(int a){
		System.out.println("a="+a);
	}
 void method3(int a,int b){
		System.out.println("a and b="+a+" " + this.one);
	}
	
	
}
public class New_class {

	public static void main(String[] args) {
		 act ob =new act(1,2);
		 ob.method1();
		 ob.method2(10);
		 ob.method3(11, 13);
		// TODO Auto-generated method stub

	}

	}



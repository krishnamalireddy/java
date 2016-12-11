package krishna;
interface sub{
	void meth1();
}
interface basis extends sub{
	void meth2();
}
class opp implements basis{
	public void meth1(){
	System.out.println("meth1()")	;
	
}

	@Override
	public void meth2() {
		System.out.println("meth2()");
	}}
	public class Ifext{
		public static void main(String arg[]) {
			opp a =new opp();
			a.meth1();
			a.meth2();
			
			
		}
	}
	
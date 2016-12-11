package krishna;
interface send{
void meth1();
void meth2();

}
	

abstract class phone implements send {
	public void meth1() {
	System.out.println("hi implement meth1()");

	}}


class newphone extends phone
{
	public void meth2() {
		System.out.println("hi implement meth1()");

		}

}

 class Ifextended {
	public static void main(String arg[]) {
		newphone ob = new newphone();
	ob.meth1();
		
}
}




	
	
	
	
	
	

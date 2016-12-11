package krishna;
interface arthmatic{
	 void addition();
	void subtraction();
}
interface aeroplane{
	void airport();
}
interface navy{
	void ships();
}

	abstract class operations implements arthmatic{
		 public void addition(){
		System.out.println("addition A+B =2");
		}
	}
		class AbstractCla extends operations implements navy{
			
			public void ships() {
				System.out.println("submarine");
			}
			public void subtraction() {
			System.out.println("subtraction A-B=0");
			}}
			class AbstractClass{
				public static void main(String arg[]) {
		
				AbstractCla  ob= new AbstractCla();
				ob.addition();
				ob.subtraction();
				}}
				
				
			


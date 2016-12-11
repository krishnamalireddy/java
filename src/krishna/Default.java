package krishna;
interface baasic{
	void addition();

}
interface opperations extends baasic{
	void subtraction();
	
}
interface BasicOperations extends baasic{
	void arthmatic();
}
abstract class perfect implements opperations{
	public void addition() {
		
		System.out.println("Implement addition().");
	}}

 class Jaa extends perfect {
public void subtraction() {
		
		System.out.println("Implement subtraction().");
	
}


}
  class fixed extends Jaa{
	 public void arthmatic() {
			
			System.out.println("Implement arthmatic().");
	 }}
		class Default {
			public static void main(String arg[]) {
			fixed ob = new fixed();
			ob.addition();
			ob.subtraction();
			ob.arthmatic();
			}
				
				
		
	 
 }




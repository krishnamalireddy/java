package krishna;

interface morni{
	void morkel();
	
}
interface mou{
	void maroon();
}
abstract class Joa implements morni{
	public void morkel(){
	System.out.println("add");
}
}
class sujan extends Joa  implements mou{
	public void maroon(){
	System.out.println("lnn");
}
}
public class trail { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sujan nes = new sujan();
		nes.maroon();
		nes.morkel();
		
		

	}

}

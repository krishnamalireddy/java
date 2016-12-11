package krishna;
import java.util.Scanner;
public class Pubclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Museclass ob = new Museclass();
Scanner obj = new Scanner(System.in);
System.out.println("enter name");
String Username= obj.nextLine();
ob.Profile(Username);
	}

}

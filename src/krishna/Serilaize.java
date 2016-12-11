package krishna;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class A1 implements Serializable
{
	public int i;
	public double j;
	public String g;
}


public class Serilaize 
{

	public static void main(String[] args) throws Exception
	{

doSerialization();
//doDeserialization();
	}
	
	private static void doSerialization() throws Exception
	{
		A1 a1= new A1();
		a1.i= 10;
		a1.j= 10.9;
		a1.g= "Sachin Tendulkar";
		FileOutputStream fout= new FileOutputStream("D:/abc.txt");
		ObjectOutputStream out= new ObjectOutputStream(fout);
		out.writeObject(a1);
		out.flush();
		out.close();
		System.out.println("wrote into file");
	}
	
	private static void doDeserialization() throws Exception
	{
		FileInputStream fin= new FileInputStream("D:/abc.txt");
		ObjectInputStream in= new ObjectInputStream(fin);
		A1 a1= (A1)in.readObject();
		System.out.println(a1.i);
		System.out.println(a1.j);
	}

}

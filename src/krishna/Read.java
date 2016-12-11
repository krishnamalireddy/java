package krishna;

import java.io.FileReader;

public class Read {
	public static void main(String[] args)  {
		try{
			FileReader ans = new FileReader("D:/update.txt");
			char[] a = new char [40];
			ans.read(a);
			for ( char b:a)
				System.out.print(b);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	
	}
}

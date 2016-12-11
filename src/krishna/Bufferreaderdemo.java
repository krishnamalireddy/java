package krishna;



import java.io.BufferedReader;
import java.io.FileReader;

public class Bufferreaderdemo {
   public static void main(String[] args) throws Exception {
      
      String  thisLine = null;
      try{
         // open input stream test.txt for reading purpose.
         BufferedReader br = new BufferedReader (new FileReader("D:/abc.txt"));
         while ((thisLine = br.readLine()) != null) {
            System.out.println(thisLine);
         }       
      }catch(Exception e){
         e.printStackTrace();
      }
   }
}
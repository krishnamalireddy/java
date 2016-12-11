package krishna;

import java.util.Scanner;  
class ScannerTest{  
 public static void main(String args[]){  
   Scanner sc=new Scanner(System.in);  
   double answer;
   int fnum,snum;
   System.out.println("enter fnum");  
    fnum=sc.nextInt();    
   System.out.println("Enter snum");  
   snum=sc.nextInt();   
  answer = fnum * snum;
  System.out.println("your answer");
System.out.println(answer);  
     
   
   sc.close();  
 }  
}   
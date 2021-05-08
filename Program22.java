import java.util.Scanner;
public class Program22{  
public static void main(String args[]){

System.out.print("Input a binary number: ");

Scanner sc=new Scanner(System.in);
  
String binaryString=sc.next();
  
int decimal=Integer.parseInt(binaryString,2);  
System.out.println("Decimal Number: "+decimal);  
}
}  
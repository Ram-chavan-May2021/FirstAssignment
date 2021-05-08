import java.util.Scanner;
public class Program21{  
public static void main(String args[]){  
System.out.print("Input a decimal number: ");  

Scanner sc=new Scanner(System.in);

int num=sc.nextInt();
System.out.println("Octal number is: "+Integer.toOctalString(num));  
  
}
}  
import java.util.Scanner;
import java.lang.Math;
class Program25{

public static void main(String[] args){

Scanner sc=new Scanner(System.in);

System.out.print("Input any octal number:");

int octalNumber=sc.nextInt();//10

int i=0, rem, decimalNumber=0;

while(octalNumber!=0){

rem=octalNumber%10;//1

decimalNumber=decimalNumber+rem*(int)Math.pow(8,i);
++i;

octalNumber=octalNumber/10;//0

}
System.out.println("Equivalent decimal number: "+decimalNumber);

}

}
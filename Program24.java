import java.util.Scanner;
import java.lang.Math;
class Program24{

public static void main(String[] args){

Scanner sc=new Scanner(System.in);

System.out.print("Input a Binary Number:");//111

String binaryString=sc.next();

int binaryNumber=Integer.parseInt(binaryString);

int rem,decimalNumber=0,i=0,octalNumber=0,dec,decrem;

while(binaryNumber!=0){//111

rem=(int)binaryNumber%10;//1

decimalNumber=decimalNumber+(rem*(int)Math.pow(2,i));//
++i;

binaryNumber=binaryNumber/10;//7


}
System.out.println(decimalNumber);//7
i=1;

dec=decimalNumber;

while(dec!=0){

rem=dec%8;

octalNumber=octalNumber+rem*i;
i=i+10;

octalNumber=octalNumber/18;

}

System.out.println("Octal number: "+octalNumber);


}

}
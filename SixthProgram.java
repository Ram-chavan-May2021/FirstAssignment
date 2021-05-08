import java.util.Scanner;
class SixthProgram{

public static void main(String[] args){

Scanner sc=new Scanner(System.in);

System.out.print("Input First Number:");
int num1=sc.nextInt();
System.out.print("Input First Number:");
int num2=sc.nextInt();
System.out.println(num1+" + "+num2+" = "+(num1+num2));
System.out.println(num1+" - "+num2+" = "+(num1-num2));
System.out.println(num1+" * "+num2+" = "+(num1*num2));
System.out.println(num1+" / "+num2+" = "+(num1/num2));
System.out.println(num1+" mod "+num2+" = "+(num1%num2));
}
}
import java.util.Scanner;
class EleventhProgram{

public static void main(String[] args){

final double pi=3.141592653589793238;

Scanner sc=new Scanner(System.in);

System.out.print("Radius = ");

double r=sc.nextDouble();

System.out.println("Perimeter is ="+2*pi*r);

System.out.println("Area is ="+pi*r*r);

}

}
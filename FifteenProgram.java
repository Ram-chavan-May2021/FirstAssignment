import java.util.Scanner;
class FifteenProgram{

public static void main(String[] args){

Scanner sc=new Scanner(System.in);

System.out.println("Enter two integer numbers:");

int i=sc.nextInt();
int j=sc.nextInt();

System.out.println("i: "+i);
System.out.println("j: "+j);

int temp=i;
i=j;
j=temp;

System.out.println("After swapping:");

System.out.println("i: "+i);
System.out.println("j: "+j);



}

}
import java.util.Scanner;
public class NineteenProgram {

public static void main(String args[]){
        int dec, quot, i=1, j;
        int bin_num[] = new int[100];
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Input a Decimal Number : ");
        dec = scan.nextInt();//5
		
        quot = dec;
		
        while(quot != 0)
        {
            bin_num[i++] = quot%2;//1
            quot = quot/2;//2
        }
		
        System.out.print("Binary number is: ");
        for(j=i-1; j>0; j--)
        {
            System.out.print(bin_num[j]);
        }
        System.out.print("\n");
    }
}

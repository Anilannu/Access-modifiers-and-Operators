package bridgelabz.com.Whileloop;
import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        int num,i=1,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        num=sc.nextInt();

        while (i<num){
            sum=sum+i;
            i++;
        }
        System.out.println("Sum of n natural numbers are: "+sum);
    }

}

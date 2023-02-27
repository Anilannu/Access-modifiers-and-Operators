package bridgelabz.com.forloop;
import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        int n=0;
        System.out.print("enter number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0;i<=num;i++) {
            n=n+i;
        }
        System.out.println(+n);
        }
    }

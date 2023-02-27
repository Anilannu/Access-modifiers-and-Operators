package bridgelabz.com.Whileloop;
import java.util.Scanner;

public class ReversWhile {
    public static void main(String[] args) {
        int n,lastDigit,sum=0;
        System.out.println("Enter number: ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();

        while (n>0){
            lastDigit=n%10;
            sum=(sum*10)+lastDigit;
            n=n/10;
        }
        System.out.println("Number after reverse: " +sum);

    }
}


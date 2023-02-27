package bridgelabz.com.forloop;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        temp =a;
        int r = 0;
        for (; a != 0; a = a / 10) {
            int last = a % 10;
            r = r * 10 + last;
        }
        System.out.println("reversed number is " + r);
        if(temp==r)
        {
            System.out.println("palimdrome");
        }
        else {
            System.out.println("not palimdrome ");
        }
    }
}

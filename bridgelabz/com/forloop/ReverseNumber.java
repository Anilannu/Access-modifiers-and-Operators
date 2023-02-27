package bridgelabz.com.forloop;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int n, m, r = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("enter number:");
        m = s.nextInt();
        for (; m != 0; m /= 10){
            n = m % 10;
            r = r * 10 + n;
        }
        System.out.println(r);


    }
}

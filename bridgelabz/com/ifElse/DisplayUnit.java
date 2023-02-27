package bridgelabz.com.ifElse;
import java.util.Scanner;

public class DisplayUnit {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter Unit: ");
        Scanner r=new Scanner(System.in);
        num=r.nextInt();

        if (num<10){
            System.out.println("Unit");
        } else if (num==10) {
            System.out.println("Ten");
        } else if (num==100) {
            System.out.println("Hundred");
        } else if (num==1000) {
            System.out.println("Thousand");
        }
    }
}


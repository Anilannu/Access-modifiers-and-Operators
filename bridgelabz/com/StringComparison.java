package bridgelabz.com;
import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
            String a, b;
            Scanner scanner = new Scanner(System.in);
            System.out.println("first String");
            a = scanner.nextLine();

            System.out.println("second String");
            b = scanner.nextLine();
            if (a == b)
                System.out.print("Equal");
            else
                System.out.print("Not Equal");
        }
    }


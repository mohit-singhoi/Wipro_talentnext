import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        // Try-with-resources automatically closes the Scanner
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter two numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();

            int c = a + b;
            System.out.println(a + " + " + b + " = " + c);
        } // Scanner is automatically closed here
    }
}

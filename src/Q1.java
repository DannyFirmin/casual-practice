
import java.util.Scanner;

public class Q1 {

    static boolean primeCheck(int n) {
        if (n == 2) {
            System.out.println("is prime");
            return true;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("is not prime");
                return false;
            } else {
                System.out.println("is prime");
                return true;
            }
        }
        System.out.println("is not prime");
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        primeCheck(n);
    }
}
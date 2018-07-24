package workshop1;

import java.util.Scanner;

public class Q2 {

    static int sumDigits(int s) {
        if (s<10){
            return s;
        }
        return sumDigits(sumDigits(s / 10 + s % 10));
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        if (n >= 10) {
            int a = sumDigits(n);
            System.out.println(a);
        } else {
            System.out.println(n);
        }
    }
}

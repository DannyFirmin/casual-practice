import java.util.ArrayList;
import java.util.Scanner;

public class Q3 {

    static double doMidArea(double[] num, int n, double midArea) {
        if (num.length - n == 1) {
            return midArea;
        }

        midArea = midArea + ((num[num.length - n] - num[num.length - (n + 1)]) / 2) * ((num[num.length - n] - num[num.length - (n + 1)]) / 2);

        return doMidArea(num, n + 1, midArea);
    }

    public static void main(String[] args) {
//        ArrayList<Integer> store = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String input;
        String[] temp;
//        int count=in.nextInt();
//        for (int i=count;i>0;i--){
//            store.add(in.nextInt());
//        }
        while (in.hasNext()) {
            input = in.nextLine();
            temp = input.split(" ");

            double num[] = new double[temp.length];
            for (int i = 0; i < temp.length; i++) {
                num[i] = Integer.parseInt(temp[i]);
            }
            if (num[0] == -1) {
                System.exit(0);
            }

            if (num[0] == 0) {
                System.out.println("0");
                System.exit(0);
            }

            //  System.out.println(Arrays.toString(num));
            double firstArea = (num[1] * num[1]) / 2;

            double lastArea = (100 - num[num.length - 1]) * (100 - num[num.length - 1]) / 2;

            double midArea = doMidArea(num, 1, 0);
            double totalArea = firstArea + lastArea + midArea;
            System.out.println(String.format("%.2f", totalArea));

        }

    }
}

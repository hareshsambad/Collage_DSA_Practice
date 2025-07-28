import java.util.Scanner;

public class Summation_Itrative_5_1 {
    public static void main(String[] args) {
        try (Scanner sc = new  Scanner(System.in)) {
            System.out.println("Enter Number Which You Want ::::");
            int num = sc.nextInt();
            int res;
            int sum = 0;

            while(num > 0)
            {
                res = num % 10;
                sum += res;
                num = num / 10;
            }
            System.out.println("Your Sum Is ::: " + sum);
        }
    }
}

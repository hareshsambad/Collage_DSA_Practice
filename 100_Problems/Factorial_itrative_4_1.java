
import java.util.Scanner;

public class Factorial_itrative_4_1 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter Number Which You Want ::::");
        int num = sc.nextInt();
        int sum = 1;

        for(int i = num ; i > 0 ; i--)
        {
            sum *= i;
            System.out.println(sum);
        }
        System.out.println("YOur Factorial Is :::: " + sum);

    }
}

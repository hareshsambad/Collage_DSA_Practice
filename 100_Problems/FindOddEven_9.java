import java.util.Scanner;

public class FindOddEven_9 {
    public static void main(String[] args) {
            Scanner sc = new  Scanner(System.in);
            System.out.println("Enter Number Which You Want ::::");
            int num = sc.nextInt();

            if((num & 1) == 0)
            {
                System.out.println("Your Number Is Even :::: " + num);
            }
            else
            {
                System.out.println("Your Number Is Odd :::: " + num);
            }
    }
}


import java.util.Scanner;

public class Factor_Itrative_3_1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Number Which You Want ::::");
       int number = sc.nextInt();
       for(int i = 1; i <= number ;i++)
       {
            if(number % i == 0)
            {
                System.out.println("Factor IS : " + i);
            }
       }
    }
}

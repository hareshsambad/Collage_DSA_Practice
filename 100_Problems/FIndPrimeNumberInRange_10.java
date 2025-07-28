import java.util.Scanner;

public class FIndPrimeNumberInRange_10 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.print("Enter Number Which You Want Start :::: ");
        int start = sc.nextInt();

        System.out.print("Enter Number Which You Want End:::: ");
        int end = sc.nextInt();
        int count = 0;

        for(int i = start ; i <= end; i++)
        {
            count = 0;
            for(int j = 1 ; j <= i ; j++)
            {
                if((i % j == 0))
                {
                    count++;
                }
            }
            if(count == 2)
            {
                System.out.println(i + ",");
            }
        }
    }
}

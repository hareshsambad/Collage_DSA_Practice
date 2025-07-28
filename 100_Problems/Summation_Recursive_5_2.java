import java.util.Scanner;

public class Summation_Recursive_5_2 {
    int sum = 0;
    
    public static void main(String[] args) {
        try (Scanner sc = new  Scanner(System.in)) {
            System.out.println("Enter Number Which You Want ::::");
            int num = sc.nextInt();
            
            Summation_Recursive_5_2 sm = new Summation_Recursive_5_2();
            sm.summation(num);
            sm.print();
        }
    }
    
    void print()
    {
        System.out.println("Your Sum Is ::: " + sum);
    }

    void summation(int num)
    {
        if(num > 0)
        {
            int res = num % 10;
            num = num / 10;
            sum += res;
            summation(num);
        }
    }
    
}

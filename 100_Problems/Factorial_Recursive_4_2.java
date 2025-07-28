import java.util.Scanner;

public class Factorial_Recursive_4_2 {
    int sum = 1;
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter Number Which You Want ::::");
        int num = sc.nextInt();
        int i = 1;
    
        Factorial_Recursive_4_2 fc = new Factorial_Recursive_4_2();
        fc.factorial(i,num);
    }

    public void factorial(int i, int number)
    {
        if(i<=number)
        {
            sum *= i;
            System.out.println("Your Sum Is :::" + sum);
            factorial(i+1,number);
        }
        
        
    }
}

import java.util.Scanner;

public class ArmstrongNumber_11 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.print("Enter Number Which You Want Start :::: ");
        int user_number = sc.nextInt();
        int num;
        int num_length = String.valueOf(user_number).length();
        int res;
        int sum = 0;

        for(int i = 1 ; i < user_number ; i++)
        {

        num = i;
        sum = 0;

        while(num > 0)
        {
            res = num % 10;
            sum += Math.pow(res,num_length);
            num = num / 10;
        }

        // System.out.println("Your Sum Is :::: " + sum);
        // System.out.println("Your Num Is :::: " + user_number);
        if(sum == i)
        {
            System.out.println(i + ",");
        }

        // if(user_number == sum)
        // {
        //     System.out.println("Your Number Is ArmStrong Number ::::");
        // }
        // else
        // {
        //     System.out.println("Your Number Is Not ArmStrong Number ::::");

        // }

    }
    }
}

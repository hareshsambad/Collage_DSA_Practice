import java.util.ArrayList;
import java.util.Scanner;

public class MaxMinAvg_12 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.print("How Many Number You Want TO Add ::: ");
        int user_number = sc.nextInt();
        int num;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int avg;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for(int i = 0 ; i < user_number; i++)
        {
            System.out.print("Enter Number ::: ");
            num = sc.nextInt();

            if(num > max)
            {
                max = num;
                sum += num;
            }
            if(num < min)
            {
                min = num;
            }
                arrayList.add(num);
                System.out.println("Your Currunt Max Value Is ::: " + max);
                System.out.println("Your Currunt Min Value Is ::: " + min);
                System.out.println();


        }

        avg = sum/user_number;

        System.out.println("");
        System.out.println("Your Final Max Value Is ::: " + max);
        System.out.println("Your Final Min Value Is ::: " + min);
        System.out.println("Your Final Sum Value Is ::: " + sum);
        System.out.println("Your Final Avg Value Is ::: " + avg);
        System.out.println(arrayList);
        sc.close();
    }
}

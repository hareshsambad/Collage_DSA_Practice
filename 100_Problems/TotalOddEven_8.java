import java.util.ArrayList;
import java.util.Scanner;

public class TotalOddEven_8 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter Number Which You Want ::::");
        int num = sc.nextInt();
        int res;
        int odd_count = 0;
        int even_count = 0;
        ArrayList<Integer> even_arrayList = new ArrayList<Integer>(0);
        ArrayList<Integer> odd_arrayList = new ArrayList<Integer>(0);


        while(num > 0)
        {
            res = num % 10;
        
            if(res % 2 == 0)
            {
                even_count++;
                even_arrayList.add(res);
            }
            else
            {
                odd_count++;
                odd_arrayList.add(res);
            }
            num = num / 10;
        }

        System.out.println("Even Number IS ::: " + even_count + " It's " + even_arrayList);
        System.out.println("Odd Number IS ::: " + odd_count + " It's " + odd_arrayList);

    }
}

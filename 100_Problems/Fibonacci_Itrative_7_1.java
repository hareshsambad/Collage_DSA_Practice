import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci_Itrative_7_1 {
    
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter Number Which You Want ::::");
        int num = sc.nextInt();
        int f_num = 0;
        int s_num = 1;
        int sum = 0;
        int i = 0;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        
        


        while(i < num)
        {
            f_num = s_num;
            s_num = sum;
            System.out.print(sum +",");
            arrayList.add(sum);
            sum = f_num + s_num;
            i++;
            
        }
        System.out.println("");
        System.out.println(arrayList);
        
        int result;
        int last_index = arrayList.size();
        int s_last_index = arrayList.size() - 1;
        System.out.println(arrayList.size());
        result = arrayList.get(last_index-1) + arrayList.get(s_last_index-1);
        System.out.println(result);
    }
}

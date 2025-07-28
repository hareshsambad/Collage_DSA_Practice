import java.util.Scanner;

public class Count_1s_InBinary {
    public static void main(String[] args) {
            Scanner sc = new  Scanner(System.in);
            System.out.println("Enter Number Which You Want ::::");
            int num = sc.nextInt();
            int count = 0;
            sc.close();
            String binary = "";
            int bit ;
            String result = "";

            while(num > 0)
            {
                bit = num & 1;
                
                if((bit) == 1)
                { 
                    count++;
                }
                num = num >> 1;
                System.out.print(num + ",");
                binary += bit;
            }

            for(int i = binary.length()-1 ; i >= 0 ; i--)
            {
                result += binary.charAt(i);
            }
            System.out.println();
            System.out.println("1's Is " + count + " Times");
            System.out.println("Your Binary Num Is ::: " + result);
            


    }
}

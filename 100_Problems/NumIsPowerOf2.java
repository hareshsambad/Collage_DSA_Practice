import java.util.Scanner;

public class NumIsPowerOf2 {
    public static void main(String[] args) {
        try (Scanner sc = new  Scanner(System.in)) {
            System.out.println("Enter Number Which You Want ::::");
            int num = sc.nextInt();

            if(((num) & (num-1)) == 0)
            {
                System.out.println("That Number Is Power Of Two :: " + num);
            }
            else
            {
                System.out.println("That Number Is Not Power Of Two :: " + num);
            }
        }
    }
}

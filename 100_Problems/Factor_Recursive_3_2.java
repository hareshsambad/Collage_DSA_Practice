import java.util.Scanner;

public class Factor_Recursive_3_2 {
    static int number;
    public static void main(String[] args) {
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Which You Want ::::");
        number = sc.nextInt();
        factor(i);

    }

    public static void factor(int i) {
    if (i > number) {
        return;
    }
    if (number % i == 0) {
        System.out.println("Factor is: " + i);
    }
    factor(i + 1); 
}
}



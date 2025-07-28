
import java.util.Scanner;

public class String_Palindrome_2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String string = sc.nextLine();
            String revString = "";
            System.out.println(string.length());
            for(int i = string.length()-1; i >= 0 ; i--)
            {
                revString += string.charAt(i);
            }
            if(string.equals(revString))
            {
                System.out.println("Your String Is Palindrome :::::" + revString);
            }
            else
            System.out.println("Oops! Your String Is NOt Palindrome ::::" + revString);
        }
    }
}

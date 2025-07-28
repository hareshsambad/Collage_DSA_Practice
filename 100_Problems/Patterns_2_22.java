public class Patterns_2_22 {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            for (int j = i * 2 - 1; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();       
        }
    }
}

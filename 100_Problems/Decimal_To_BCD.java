public class Decimal_To_BCD {
    public static void main(String[] args) {
        int num = 293;
        int bit;
        int binary = 0 ;
        while(num > 0)
        {
            bit = num & 1;
            System.out.print(bit + ",");
            num = num >> 1;
            binary += bit;
            // System.out.print(binary + " ");
        }
    }
}

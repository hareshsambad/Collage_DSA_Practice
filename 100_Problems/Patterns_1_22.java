public class Patterns_1_22 
{
    public static void main(String[] args) {
        int count = 0;
        int char_count = 65;
        
        for (int i = 0; i < 4; i++)
        {
            System.out.print("     ");
            for(int j = 0 ; j < i + 1; j++ )
            {
                
                if (i % 2 == 0) {
                    count++;
                   System.out.print(count+" ");
                }
                else {
                    
                    System.out.print((char) char_count + " ");
                    char_count++;
                }
                
            }   
            System.out.println();
        }
    }
}

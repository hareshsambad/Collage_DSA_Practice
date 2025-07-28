import java.util.Random;

public class SumOfEvenNumber_1 {
    public static void main(String[] args) {
        

        Random rand = new Random();
        int array[] = new int[10];
        int sum = 0;

        
        for(int i = 0 ; i  < array.length ; i++)
        {
            array[i] = rand.nextInt(100);
            System.out.print(array[i] + ",");
        }

        for(int i = 0; i < array.length ; i++)
        {
            if(array[i] % 2 == 0)
            {
                sum += array[i];
            }
        }
        System.out.println();
        System.out.println("Your Sum Is :::: "+sum);

    }
}

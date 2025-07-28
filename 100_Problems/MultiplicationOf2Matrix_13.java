
import java.util.Random;
import java.util.Scanner;

public class MultiplicationOf2Matrix_13 {

        int row_1 ; 
        int col_1;
        int row_2; 
        int col_2;
        int matrix_1[][];
        int matrix_2[][];
        int matrix_3[][];
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
    public static void main(String[] args) {
         
        MultiplicationOf2Matrix_13 mc = new MultiplicationOf2Matrix_13();
        mc.getMatrix();
        mc.multiply_matrix();
        
    }

    void getMatrix()
    {
        int r =  rand.nextInt(10);
        // System.out.println("Enter  Dimension of 1 st array ::: ");
        // System.out.print("Enter Row Of First Matrix :::: ");
        row_1 = rand.nextInt(10);
        // System.out.print("Enter Col Of First Matrix :::: ");
        col_1 = r;
        // System.out.println("");
        
        // System.out.println("Enter  Dimension of 2 st Matrix ::: ");
        //                                  System.out.print("Enter Row Of First Matrix :::: ");
        row_2 = r;
        // System.out.print("Enter Col Of First Matrix :::: ");
        col_2 = rand.nextInt(10);
        matrix_1 = new int[row_1][col_1];
        matrix_2 = new int[row_2][col_2];
        System.out.println("Row And COl Of MAtrix One : " + row_1 +" " +col_1);
        System.out.println("Row And Col Of Matrix Two : " + row_2 +" "+ col_2);

        System.out.println("");
        for(int i = 0 ; i < row_1 ; i++ )
        {
            for(int j = 0 ; j < col_1 ; j++)
            {
                matrix_1[i][j] = rand.nextInt(10);
            }
        }

        System.out.println("");
        for(int i = 0 ; i < row_2 ; i++ )
        {
            for(int j = 0 ; j < col_2 ; j++)
            {
                matrix_2[i][j] = rand.nextInt(10);
            }
        }

    }

    void displayMatrix()
    {
        System.out.println("");
         for(int i = 0 ; i < row_1 ; i++ )
        {
            for(int j = 0 ; j < col_1 ; j++)
            {
               System.out.print(matrix_1[i][j] + " ");
                
            }
            System.out.println(" ");
        }

        System.out.println("");
        for(int i = 0 ; i < row_2 ; i++ )
        {
            for(int j = 0 ; j < col_2 ; j++)
            {
               System.out.print(matrix_2[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("");
        System.out.println("Youor Final Matrix Is :::: ");
         for (int i = 0; i < row_1; i++) {
            for (int j = 0; j < col_2; j++) {
                System.out.print(matrix_3[i][j] + "\t");
            }
            System.out.println();
        }
    }

    void multiply_matrix()
    {
        matrix_3 = new int[row_1][col_2];
        if (col_1 != row_2) 
        {
            System.out.print("Matrix multiplication not possible. Columns of A != Rows of B.");
        }
        else
        {
            for (int i = 0; i < row_1; i++) {
                for (int j = 0; j < col_2; j++) {
                    for(int k = 0; k < col_1; k++) {
                        matrix_3[i][j] += matrix_1[i][k] * matrix_2[k][j];
                    }
                }
            }
            displayMatrix();
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MultiplicationOf2Matrix_13 other = (MultiplicationOf2Matrix_13) obj;
        return true;
    }
}

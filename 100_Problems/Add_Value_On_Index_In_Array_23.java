
import java.util.Scanner;

public class Add_Value_On_Index_In_Array_23 {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        Add_Value_On_Index_In_Array_23 ac = new Add_Value_On_Index_In_Array_23();
        int array[] = ac.getArray();
        ac.addElement(array);
        ac.printNewArray(array);

    }
    
    void addElement(int array[])
    {
        int position = getPosition();
        int value = getValue();
        printArray(array);
        calcArray(position,value,array);

    }

    void calcArray(int position,int value,int array[])
    {
        int temp_first;
        for (int i = position; i < array.length; i++) {
            temp_first = array[i];
            array[i] = value;
            value = temp_first;
        }
    }

    void printNewArray(int array[])
    {
        System.out.println("Your New Array Is :::: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println();
    }
    
    void printArray(int array[])
    {
        System.out.println("Your Old Array Is :::: ");
        for (int i = 0; i < array.length - 1; i++)
        {
            System.out.print(array[i] + ",");
        }
        System.out.println();
    }

    int getValue()
    {
        System.out.print("Enter Value :::::::::::");
        return sc.nextInt();
    }

    int getPosition()
    {
        System.out.print("Enter Position In Which You Want TO Add Element In Array::::: ");
        return sc.nextInt();
    }
    
    int[] getArray()
    {
        System.out.print("Enter Size Of An Array :::::: ");
        int size = sc.nextInt();
        int array[] = new int[size + 1];
        for (int i = 0; i < array.length - 1; i++)
        {
            System.out.print("Enter Element In Array ::: ");
            array[i] = sc.nextInt();
        }
        return array;
    }

}

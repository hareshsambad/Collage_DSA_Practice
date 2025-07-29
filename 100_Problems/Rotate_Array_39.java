public class Rotate_Array_39 {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7 };
        int size = nums.length;
        int rotate_nums[] = new int[size];
        int k = 4;
        int kIndex = size - k;
        int j = 0;

        for (int i = 0; i < size; i++)
        {
            if (i < k) {
                rotate_nums[i] = nums[kIndex];
                // System.out.println(rotate_nums[i]);
                kIndex++;
            }
                else {
                    rotate_nums[i] = nums[j];
                    // System.out.println(rotate_nums[i] + ",");
                    j++;
                }
        } 

            
        for (int i = 0; i < size; i++)
        {
            System.out.print(rotate_nums[i] + ",");
        }
        
    }
}

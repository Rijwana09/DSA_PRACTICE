import java.util.*;
public class Subarray {

    public static void getSubarray(int[] nums){
        int ts=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(nums[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarrays = "+ts);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array  : ");
        int size= sc.nextInt();

        System.out.println("Enter the array elements : ");
        int[] array = new int[size];

        for (int index = 0; index < array.length; index++){
                array[index]=sc.nextInt();
        }

        getSubarray(array);
    }
}

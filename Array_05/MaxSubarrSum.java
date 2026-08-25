import java.util.Scanner;

public class MaxSubarrSum {
    public static void maxSubarraySum(int[] nums){
        int currSum=0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                currSum=0;
                for(int k=i;k<=j;k++){
                    currSum+=nums[k];
                }
                
                System.out.println("current sum is : "+currSum);

                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("max subarray sum is : "+maxSum);
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

        maxSubarraySum(array);
    }
}

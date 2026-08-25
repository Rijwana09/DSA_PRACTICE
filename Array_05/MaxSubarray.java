import java.util.Scanner;
public class MaxSubarray {
    
    //prefix
    public static void maxSubarraySum(int[] nums){
        int currSum=0;
        int maxSum = Integer.MIN_VALUE;

        int[] prefix = new int[nums.length];

        prefix[0]=nums[0];

        for (int i = 1; i < prefix.length; i++) { //prefix array find
            prefix[i] = prefix[i-1] + nums[i];
        }

        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                
                currSum= i==0 ? prefix[j]: prefix[j] - prefix[i-1];

                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("max subarray sum is : "+maxSum);
    }

    public static void maxSubarraySumKadane(int[] nums){

        
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

        maxSubarraySumKadane(array);
    }
}

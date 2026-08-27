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

    public static void Kadane(int[] nums){

        int ms = nums[0];
        int cs =nums[0] ;
//nasta karke 
        for (int i = 0; i < nums.length; i++) {

            cs = Math.max(nums[i], cs + nums[i]);
            ms = Math.max(cs, ms);
        }
        System.out.println("max subarray sum is : "+ms);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array  : ");
        int size= sc.nextInt();

        System.out.println("Enter the array elements : ");
        int[] array = new int[size];
        //-2 -3 4 -1 -2 1 5 -3
        for (int index = 0; index < array.length; index++){
                array[index]=sc.nextInt();
        }

        Kadane(array);
    }
}

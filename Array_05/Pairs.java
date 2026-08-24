import java.util.Scanner;

public class Pairs {

    public static void getPairs(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i]; // 2 4 6 8 10
            for(int j=i+1;j<nums.length;j++){
                System.out.print("("+curr+","+nums[j]+")");
            }
            System.out.println();
        }
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

        getPairs(array);
    }
}
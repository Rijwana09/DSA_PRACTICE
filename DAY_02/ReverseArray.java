import java.util.Scanner;

public class ReverseArray {

    public static void reverseA(int[] arr, int left, int right){
        //base condition
        if(left>=right) {
            return ;
        }

        //temporarily store left element
        int temp = arr[left];

        //right ele put left side
        arr[left] = arr[right];

        //old ele put in right side
        arr[right] = temp;

        reverseA(arr,left+1,right-1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length :");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        reverseA(arr,0,arr.length-1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");   
        }
    }
}

import java.util.Scanner;

public class Palindrome {

    public static void palindrome(String s,int left,int right){
        
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
    }
}

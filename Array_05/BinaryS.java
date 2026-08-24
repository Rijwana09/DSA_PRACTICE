import java.util.Scanner;

public class BinaryS {
    public static int getBinarySearch(int[] numbers, int key) {
        int start = 0 ,end = numbers.length-1;

        while(start <= end){
            int mid =(start+end)/2 ;

            //compare

            if(numbers[mid]==key) { // found
                return mid;
            }
            else if(numbers[mid]<key){ // right
                start=mid+1; // we increase start as mid + 1
            }
            else { //left
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the key :");
        int key = sc.nextInt();

        System.out.println("Enter the size of an array  : ");
        int size= sc.nextInt();

        System.out.println("Enter the array elements : ");
        int[] numbers = new int[size];

        for (int index = 0; index < numbers.length; index++){
                numbers[index]=sc.nextInt();
        }

        int index = getBinarySearch(numbers,key);

        System.out.println("Index for key is  : "+index);
    }
}

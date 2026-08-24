import java.util.*;

public class LargestElement {
    public static int LE(int[] array){
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if(largest < array[i]){
                largest=array[i];
            }   
        }
        return largest;
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

        int index = LE(array);

        System.out.println("largest element is  : "+index);

    }
}

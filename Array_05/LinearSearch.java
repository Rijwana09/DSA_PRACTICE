import java.util.*;
public class LinearSearch{

    public static int LS(int[] array , int key){
        for (int i = 0; i < array.length; i++) {
            if(array[i]==key){
                return i;
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
        int[] array = new int[size];

        for (int index = 0; index < array.length; index++){
                array[index]=sc.nextInt();
        }

        int index = LS(array, key);

        if(index == -1) System.out.println("key is not found");
        else System.out.println("key is found at index "+index);
    }
}
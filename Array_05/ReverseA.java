import java.util.*;
public class ReverseA {
    public static void getReverse(int array[]){
        int first = 0, last=array.length-1;

        while(first < last ) {

            //swap
            int temp = array[last];
            array[last]=array[first];
            array[first]=temp;

            first++;
            last--;

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
        getReverse(array);

        //print 
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}

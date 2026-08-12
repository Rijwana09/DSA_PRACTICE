import java.util.Arrays;
public class BubbleSort {

    public static void bubble(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {

                if(arr[j]>arr[j+1]){

                    //swap
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};

        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
}

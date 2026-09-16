import java.util.Arrays;

public class DesBubble {
    public  static void DecesndingOrder(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for(int j = 0; j < n-i-1; j++){

                if(arr[j] < arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            } 
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,6,2,1,8,7,4,5,3,1};

        DecesndingOrder(arr);

        System.out.println(Arrays.toString(arr));
    }
}

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,3,2,1,4};

        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;

            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }

            
                //swap

                int temp = arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;
        }

        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}

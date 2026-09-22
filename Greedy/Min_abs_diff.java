import java.util.*;
public class Min_abs_diff{
    public static void main(String[] args) {
        // ans = 6
        int A[] = {4,1,8,7};
        int B[] = {2, 3, 6 ,5};

        // ans = 0 
        // int A[] = {1,3,2};
        // int B[] = {2,1,3};
        
        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0;

        for(int i=0; i<A.length; i++) {
            minDiff += Math.abs(A[i] - B[i]);
        }
        System.out.println("min absolute value is = "+minDiff);;
    }
}

import java.util.*;

public class Count {


    public static int countnumber(int n) {

        int count = 0;

        if(n==0) return 1;

        while(n!=0){
            n = n/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int result = countnumber(n);
        System.out.println("nubmer of digit : "+result);

    }
}
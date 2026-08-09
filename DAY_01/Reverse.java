import java.util.Scanner;

public class Reverse {
    public static int reverseNumber(int n){
        
        int reverse=0;
        while(n>0){
            int digit=n%10;
            n=n/10;
            reverse=reverse*10+digit;
        }
        return reverse;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int result = reverseNumber(n);
        System.out.println("reverse number is : "+result);
    }
}

import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(int n){
        int original=n;
        int reverse = 0;
        while(n>0){
            int digit=n%10;
            n=n/10;
            reverse=reverse*10+digit;
        }
        return original==reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        boolean result=isPalindrome(n);
        System.out.println(result);
        
    }
}

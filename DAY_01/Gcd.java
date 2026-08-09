import java.util.Scanner;

public class Gcd {

    public static int isgcd(int a, int b){
        while(b!=0){
            int remaider = a%b;
            a=b;
            b=remaider;
        }
        return a;
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = sc.nextInt();
        System.out.println("Enter a number : ");
        int b = sc.nextInt();
        int result = isgcd(a,b);

        System.out.println("gcd of two number is : "+result);

        sc.close();
    }
}

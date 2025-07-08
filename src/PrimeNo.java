import java.util.*;

public class PrimeNo {
    public static void main(String[] args){
        System.out.print("enter the No. to see whether its prime or no : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (isPrime(num)){
            System.out.println(num + " is Prime no.");
        }else{
            System.out.println(num + " is Not Prime no.");
        }

    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
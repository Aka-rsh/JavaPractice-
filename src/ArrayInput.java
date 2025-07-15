import java.util.*;

public class ArrayInput {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // takes an input
            System.out.print("Enter the No. you want to print in array :- ");
            int n = sc.nextInt();

            // create an array
            int[] arr = new int[n];

            // read Elements in the array
            System.out.println("Enter " + n + " number:-");
            for(int i =0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            System.out.println("You Entered");
            for(int val:arr){
                System.out.print(val + " ");
            }
        }
    }

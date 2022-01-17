// Author: Afzal Alam
// Date : 17.01.2022
import java.util.Scanner;
public class Fibonacci_series {
    public static void main(String[] args) {
       int fib = 0;
       int fib2 = 1;
       Scanner sc = new Scanner(System.in);
       System.out.println("Till how many terms you want the Fibonacci series? ");
       int terms = sc.nextInt();
       for(int i = 0;i<=terms;i++){
           System.out.print(fib);
           System.out.print(" ");
           int fib3 = fib-0;
           fib = fib+fib2;
           fib2 = fib3;
           
       }
    sc.close();
    }
}

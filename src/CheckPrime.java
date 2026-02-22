import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        // TODO: Read n
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // TODO: Check if n is prime
        // Hint:
        // 1. If n <= 1, it is Not Prime.
        // 2. Loop from 2 to sqrt(n). If n is divisible by any number, it is Not Prime.
        // 3. Otherwise, it is Prime.
        boolean isPrime = true;
        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        
        // TODO: Print "Prime" or "Not Prime"
        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
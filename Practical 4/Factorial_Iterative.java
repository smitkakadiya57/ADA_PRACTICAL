import java.util.*;

public class Factorial_Iterative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, fact = 1;
        System.out.print("Enter which number factorial you want: ");
        n = sc.nextInt();
        if (n == 0 || n == 1) {
            System.out.println("Factorial of given number is 1");
        } else {
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
            System.out.println("factorial of given number is : " + fact);
        }
    }
}

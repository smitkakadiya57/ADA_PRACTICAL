import java.util.*;
public class Factorial_Recursive {    

    public int fact(int n){
        int x,y;
        if (n == 0 ) {
            return 1;
        } else {
            x = n-1;
            y=fact(x);
        }
        return n*y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter which number factorial you want: ");
        int n = sc. nextInt();
        Factorial_Recursive ob = new Factorial_Recursive();
        System.out.println("Factorial value of given number is : " + ob.fact(n));
    }
}

import java.util.*;

public class Knapsack_Problem {

    public int max(int a, int b){ return (a > b)? a: b; }

    public int knapsack(int n, int val[], int wt[], int W){
        int i, j;
        int k[][] = new int [n+1][W+1];
        for (i = 0; i <= n; i++){
            for (j = 0; j <= W; j++){
                if (i==0 || j==0) 
                    k[i][j] = 0;
                else if (wt[i-1] <= j)
                    k[i][j] = max(val[i-1] + k[i-1][j-wt[i-1]], k[i-1][j]);
                else
                    k[i][j] = k[i-1][j];
            }
        }
        return k[n][W];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        int val[] = new int[n];
        int wt[] = new int[n];
        System.out.println("Enetr value and weight of items : ");
        for (int i = 0; i < n; i++) {
            val[i] = sc.nextInt();
            wt[i] = sc.nextInt();
        }
        System.out.print("Enetr size of knapsack : ");
        int W = sc.nextInt();
        Knapsack_Problem ob = new Knapsack_Problem();
        System.out.println(ob.knapsack(n, val, wt, W));

    }    
}

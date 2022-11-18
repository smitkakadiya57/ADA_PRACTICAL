import java.util.Scanner;

public class SelectionSort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Element : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int k = 0; k < n; k++) {
            System.out.print("Enter the " + (k + 1) + " Element : ");
            arr[k] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }

        System.out.println();
        System.out.print("Sorted array :");
        for (int h = 0; h < n; ++h)
            System.out.print(arr[h] + " ");
    }
}

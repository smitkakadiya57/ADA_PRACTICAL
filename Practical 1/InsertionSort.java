import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Element : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int k = 0; k < n; k++) {
            System.out.print("Enter the " + (k + 1) + " Element : ");
            arr[k] = sc.nextInt();
        }

        for(int i=1;i<n;i++){
            int key = arr[i];
            int j = i-1;

            while (j>=0 && arr[j]>key) {
                arr[j+1] = arr[j];
                j = j-1; 
            }
            arr[j+1]=key;
        }

        System.out.println();
        System.out.print("Sorted array :");
        for (int h = 0; h < n; ++h)
            System.out.print(arr[h] + " ");
    }
}

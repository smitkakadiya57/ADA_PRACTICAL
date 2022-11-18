import java.util.Scanner;

public class MergeSort {

    void sort(int a[], int low, int high) {
        if (low < high) {
            int mid = (low + (high-1)) / 2;
            sort(a, low, mid);
            sort(a, (mid + 1), high);
            merge(a, low, mid, high);
        }
    }

    void merge(int a[], int low, int mid, int high) {
        int n1 = mid - low + 1; 
        int n2 = high - mid;
        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = a[low + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = a[mid + 1 + j];
        }
        int i=0,j=0;
        int k=low;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                a[k] = L[i];
                i++;
            } else {
                a[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            a[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            a[k] = R[j];
            j++;
            k++;
        }
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Element : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the " + (i + 1) + " Element : ");
            a[i] = sc.nextInt();
        }

        MergeSort ob = new MergeSort();
        ob.sort(a, 0, n-1);

        System.out.println(); 
        System.out.print("Sorted array is : ");
        for (int h = 0; h < n; h++) {
            System.out.print(a[h] + " ");
        }
    }
}
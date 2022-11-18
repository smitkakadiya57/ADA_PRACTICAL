import java.util.*;

public class QuickSort {

    void sort(int a[], int low, int high) {
        int pivot;
        QuickSort pi = new QuickSort();
        if (low < high) {
            pivot = pi.partition(a, low, high);
            sort(a, low, pivot - 1);
            sort(a, pivot + 1, high);
        }
    }

    int partition(int A[] , int low , int high)
    {
        int key = A[low];
        int i = low + 1;
        int j = high;
        int temp;
        do
        {
            while (A[i] <= key)
            {
                if (i == high) {
                    break;
                }
                i++;
            }
            while (A[j] > key)
            {
                if (j == low) {
                    break;
                }
                j--;
            }
    
            if (i < j)
            {
                temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        } while (i < j);
    
        temp = A[low];
        A[low] = A[j];
        A[j] = temp;
    
        return j;
    
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Element : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the " + (i + 1) + " Element :");
            a[i] = sc.nextInt();
        }

        QuickSort ob = new QuickSort();
        ob.sort(a, 0, n - 1);

        System.out.println();
        System.out.print("Sorted array is : ");
        for (int h = 0; h < n; h++) {
            System.out.print(a[h] + " ");
        }
    }
}

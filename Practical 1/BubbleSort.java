
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Element : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int k = 0; k < n; k++) {
            System.out.print("Enter the " + (k + 1) + " Element : ");
            arr[k] = sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println();
        System.out.print("Sorted array :");
        for (int h = 0; h < n; ++h)
            System.out.print(arr[h] + " ");

    }
}

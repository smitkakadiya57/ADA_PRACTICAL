import java.util.*;
public class BinarySearch {

    int search(int a[],int low, int high,int data){
        if (low <= high) {
            int mid = (low + high)/2;
            if (a[mid] == data) {
                return mid;
            }
            if (a[mid] > data) {
                return search(a, low, mid-1, data);
            }
            return search(a, mid+1, high, data);
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int a[] ={11,22,33,44,55,66,77,88,99,100};
        System.out.print("Chooes a number : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.print("Enter youer choice : ");
        int data = sc.nextInt();
        
        BinarySearch ob = new BinarySearch();
        int Index = ob.search(a, 0, a.length-1, data);
        if (Index == -1) {
            System.out.println("Enter vaild Element");
        }
        else{
            System.out.println("youer choice "+data+" is Index number : "+(Index+1));
        }
    }
}
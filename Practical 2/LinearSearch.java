import java.util.*;
public class LinearSearch {
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
        int j;
        for (j = 0; j < a.length; j++) {
            if (a[j] == data) {
                System.out.println("youer choice "+data+" is Index number : "+(j+1));
                break;
            }
        }
        if (j == a.length) {
            System.out.println("Enter vaild Element");
        }
    }
}

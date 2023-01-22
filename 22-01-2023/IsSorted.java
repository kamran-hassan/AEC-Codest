import java.util.*;
public class IsSorted {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = s.nextInt();
        }

        for(int i=0;i<n-1;i++){
            if(arr[i] > arr[i+1]) {
                System.out.println("Not Sorted");
                return;
            }
        } 

        System.out.print("Sorted");
    }
}

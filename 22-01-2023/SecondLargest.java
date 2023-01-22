import java.util.*;
public class SecondLargest {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = s.nextInt();
        }
        int largest = arr[0];

        for (int i = 1; i<n; i++){
            if(largest < arr[i]) largest = arr[i];
        }

        int SecondLargest = arr[0];

        for (int i = 0; i<n; i++){
            if(SecondLargest < arr[i] && arr[i] != largest) SecondLargest = arr[i];
        }

        System.out.print(SecondLargest);

    }
    
}

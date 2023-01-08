// Largest Number in Array 
import java.util.*;

public class J01 {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int[] arr = new int[5];
      for(int i = 0; i < 5; i++)
        arr[i] = s.nextInt();
      
      int t = arr[0];
      for(int i = 1; i < 5; i++){
        if(t < arr[i]) t = arr[i];
      }
      
      System.out.print("Largest Number is ->  "+t);
  }
}
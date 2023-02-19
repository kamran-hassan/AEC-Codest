import java.util.*;

// rotate an array by D position

public class RotateByD {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      ArrayList<Integer> a = new ArrayList<>();
      
       String ip = sc.nextLine();
      
      for(String s: ip.split(" ")){
        a.add(Integer.parseInt(s));
      }
      
      int d = sc.nextInt();
      
      a = reverse(a,0,d-1);
      a = reverse(a,d,a.size()-1);
      a = reverse(a,0,a.size()-1);
      System.out.print(a);
  }
  
  static ArrayList<Integer> reverse(ArrayList<Integer> arr,int i, int j){
      
      while(i < j){
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j,temp);
        i++;
        j--;
      }
        
        return arr;
    
  }
}
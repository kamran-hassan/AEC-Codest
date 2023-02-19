import java.util.*;

// remove duplicate from sorted array

public class RemoveDupe {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      ArrayList<Integer> a = new ArrayList<>();
      
      String ip = sc.nextLine();
      
      for(String s: ip.split(" ")){
        a.add(Integer.parseInt(s));
      }
      
      int element = a.get(0);
      
      for(int i=1; i < a.size(); i++){
        if(element == a.get(i)) a.remove(i);
        else element = a.get(i);
      }
      
      System.out.println(a);
  }
}
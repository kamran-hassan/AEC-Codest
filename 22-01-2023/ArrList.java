import java.util.*;
public class ArrList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(5);

        arr.add(7);

        arr.add(9);

        System.out.println(arr);

        System.out.println(arr.get(1));

        arr.size();

        for(int i=0;i< arr.size(); i++)
            arr.get(i);
        arr.remove(1);
        
        System.out.println(arr);

        arr.add(1, 10);

        System.out.println(arr);

    }   
}

class Student{
    String name;
    String adress;
}
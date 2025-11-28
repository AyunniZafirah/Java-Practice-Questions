import java.util.Scanner;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class DuplicateElement{

    static List<Integer> duplicates (int[] arr){

   Map<Integer, Integer> map = new HashMap<>();
   List<Integer> duplicates = new ArrayList<>();
   
   for(int num : arr){
    map.put(num, map.getOrDefault(num, 0)+1);
   }
   for (Map.Entry<Integer, Integer> entry : map.entrySet()){
    if (entry.getValue() > 1)
     duplicates.add(entry.getKey());
   }   
   return duplicates; 
   }

public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    int[] arr = {1,2,5,8,3,2,1,7,5};
            System.out.print(duplicates(arr));

}
}
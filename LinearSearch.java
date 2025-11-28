import java.util.Scanner;
public class LinearSearch{

public static void MinMax(int[] array){
    int min = array[0];
    int max = array[0];
    for(int i = 1; i < array.length; i++){
     if (max > array[i]){
      max = array[i];
     }
     if (min < array[i]){
      min = array[i];
     }
}
    System.out.println("Minimum: " + min);
    System.out.println("Maximum: " + max);

}

public static void main (String[] args){
    int[] array = {4,1,3,5,7,8};
    MinMax(array);
}
}
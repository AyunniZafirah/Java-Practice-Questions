public class SumArray{

private static int SumArray(int[] arr){
 int sum = 0;
 for (int i = 0; i < arr.length; i++){
    sum = sum + arr[i];
 }
return sum;
}


public static void main (String[] args){
     int[] arr = {6, 7, 2, 5, 4};
     System.out.print(SumArray(arr));
}
}
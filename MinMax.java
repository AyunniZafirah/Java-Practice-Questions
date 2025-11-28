public class MinMax{

    private static int[] findMinMax (int[] arr){
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++){
         if (arr[i] > max )
           max = arr[i];

        if (arr[i] < min)
          min = arr[i];
        }
        return new int[] {min, max};
    }



    public static void main (String[] args){
        int[] arr = {2,5,2,-3,7,3,8};
        int[] result = findMinMax(arr);
        System.out.println("Min : "+result[0]);
        System.out.print("Max : "+result[1]);

    }
}
import java.util.Arrays;

public class SelectionSort {

  private static int[] SelectionSort(int arr[]) {
    for (int i = 0; i < arr.length - 1; i++) {
      int smallestIndex = i;

      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[smallestIndex]) {
          smallestIndex = j;
        }
      }

      int temp = arr[i];
      arr[i] = arr[smallestIndex];
      arr[smallestIndex] = temp;
    }
    return arr;
  }

  public static void main(String[] args) {
    int[] arr = {6, 7, 2, 5, 4};
    SelectionSort(arr);
    System.out.print(Arrays.toString(arr));
  }
}

//https://www.youtube.com/watch?v=dsqsnngsoD8
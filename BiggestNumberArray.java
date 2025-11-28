import java.util.Scanner;

public class BiggestNumberArray{


public static int BiggestNumber(int[] array){
  int max = array[0];//start with 1st index onstead of max = 0

  for(int i = 0; i < array.length; i++){
    if (array[i] > max)
     max = array[i];
  }
  return max;
}

public static void main(String[] args){
  Scanner sc = new Scanner(System.in);


 System.out.print("Enter size of the number : ");
 int size = sc.nextInt();
 int arr[] = new int[size];

 for (int i = 0; i < size; i++){
    System.out.println("Enter number "+(i+1)+": ");
    arr[i] = sc.nextInt();
 }
 System.out.print("The biggest number is "+BiggestNumber(arr));
}
}


/*
def biggestNumber(arr):
    max_num = arr[0]
    
    for num in arr:
        if num > max_num:
            max_num = num
            
    return max_num


size = int(input('Enter size of the number: '))
arr = []

for i in range(size):
    num = int(input(f'Enter number {i+1}: '))
    arr.append(num)

print(f'The biggest number is {biggestNumber(arr)}')

*/

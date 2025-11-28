import java.util.Scanner;
public class PerfectSquare{

public static Boolean isPerfectSquare(int num){
 int sqrt = (int)Math.sqrt(num);

 return (sqrt * sqrt == num);

}


public static void main (String[] args){
 Scanner sc = new Scanner(System.in);

while (true){
 System.out.print("Enter the number (Press X to cancel) : ");
 String input = sc.next();

  if (input.equalsIgnoreCase("X"))
    break;


try{
 int num = Integer.parseInt(input);
 if (isPerfectSquare(num))
  System.out.println(num+" is a perfect square");
 else
 System.out.println(num+" is not a perfect square");

}
catch (NumberFormatException e){
    System.out.print("Invalid input");
}
}
}
}



/* USING PYTHON
import math

def is_perfect_square(num):
    sqrt = int(math.sqrt(num))
    return (sqrt * sqrt == num), sqrt

while True:
    user_input = input("Enter a number (Press X to cancel): ")

    if user_input.lower() == 'x':
        break

    try:
        num = int(user_input)
        is_square, sqrt = is_perfect_square(num)

        if is_square:
            print(f"{num} is a perfect square number. The square root is {sqrt}.")
        else:
            print(f"{num} is not a perfect square number.")
    except ValueError:
        print("Please enter a valid number.")

*/
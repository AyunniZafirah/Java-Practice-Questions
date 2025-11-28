public class Fibonacci_nth{

public static int Fibonacci (int n){
    if (n <= 1)
     return n;
    else
     return Fibonacci (n-2)+ Fibonacci (n-1);

}
// F(0)=0
// F(1)=1
// F(2)=1
// F(3)=2
// F(4)=3
// F(5)=5
// F(6)=8
// F(7)=13

public static void main (String [] args){
    System.out.print(Fibonacci(8));
}
}
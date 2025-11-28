import java.util.Scanner;
public class Fibonacci{

public static void Fibonacci(int n){
    int f1 = 0;
    int f2 = 1;
    System.out.print(f1+", "+f2+", ");
    for(int i =0; i < n-2; i++){
        int next = f1 + f2;
        System.out.print(next+", ");

        f1 = f2;
        f2 = next;
    }
}
    public static void main(String[] args){
        System.out.print("How many numbers?: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Fibonacci(num);
    }
}
/*
def Fibonacciseries(num):
 f1= 0
 f2 = 1
 print(f"{f1}, {f2}", end=", ")
 for i in range(2, num):
   next = f1+f2
   print(next, end=", ")
   f1 = f2
   f2 = next


def main():
  Fibonacciseries(15)
  
if __name__ =="__main__":
 main()
*/
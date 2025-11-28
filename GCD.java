import java.lang.Math;

public class GCD{

    public static int calcGCD(int a, int b){
    
    
    while (b != 0){
        int remainder = a % b;
        a = b;
        b = remainder;
    }
    return a;
    }
 
    public static void main(String[] args){
   
     System.out.print(  calcGCD(96,63));

    }
}
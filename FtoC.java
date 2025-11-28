import java.util.Scanner;
public class FtoC{


private static double Convert_Celcius(double fahrenheit){
    return (fahrenheit-32) * 5/9;
}

public static void main (String[] args){
Scanner sc = new Scanner (System.in);
System.out.print("Enter temperature in Fahrenherit : ");
double f = sc.nextDouble();
System.out.printf("%.2f",Convert_Celcius(f));
}
}
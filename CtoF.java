import java.util.Scanner;
public class CtoF{

 private static double Convert_Fahrenheit(double celcius){

    
     return (celcius * 9 /5) + 32;
 }


    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celcius : ");
        double celcius = sc.nextDouble();

        System.out.print(Convert_Fahrenheit(celcius));
    }
}
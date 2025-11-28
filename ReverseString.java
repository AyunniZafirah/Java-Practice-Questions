import java.util.Scanner;
public class ReverseString{

private static String ReverseString (String input){
    String reversedString = "";
    for (int i =0; i < input.length(); i++){
        char ch = input.charAt(i);
        reversedString = ch + reversedString;
    }
    return reversedString;
}
//hello
//eh
private static String reverseString (String input){
    return new StringBuilder(input).reverse().toString();
}
public static void main (String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter any number or string : ");
String input = sc.next();


System.out.print(ReverseString(input));

System.out.print(reverseString(input));

}
}
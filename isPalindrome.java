import java.util.Scanner;

public class isPalindrome{
public static Boolean isPalindrome(char[] str){

    for(int i = 0; i < str.length/2; i++){//no need to put str.length()
        if(str[i] != str[str.length-1-i])
        // break; .....You can’t use break after return — return already exits the method.
        return false;
 
    }
   return true;
}


public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter any numbers or string : ");
    String str1 = sc.next();

    str1 = str1.toLowerCase();

    //Convert to char
    char[] str = str1.toCharArray();

    if(isPalindrome(str))// don’t add [] when passing an array variable.
    System.out.print(String.valueOf(str)+" is a  palindrome!");

    else
    System.out.print(String.valueOf(str)+" is not a palindrome!");
}
}
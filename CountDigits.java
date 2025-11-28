public class CountDigits{

private static int countdigits(int n){
    int count=0;;
    while (n != 0){
        n/= 10;
        count++;
    }
    return count;

}

public static void main (String args[]){

    System.out.print(countdigits(47282));
}
}
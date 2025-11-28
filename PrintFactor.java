import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class PrintFactor {
    public Set<Integer> printFactors(int num) {
        Set<Integer> factors = new HashSet<>();

        for (int i = 2; i <= num; i++) {
            if (num % i == 0)
                factors.add(i);
        }

        return factors;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        PrintFactor pf = new PrintFactor();
        Set<Integer> result = pf.printFactors(num);

        System.out.println("Factors of " + num + " is " + result);
    }
}

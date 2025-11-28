public class printPiramids {

    private static void printpyramid(int r, char c) {
        for (int i = 1; i <= r; i++) {
            // print spaces
            for (int j = 1; j <= r - i; j++) {
                System.out.print(" ");
            }
            // print characters
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(c);
            }
            // move to next row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printpyramid(3, '*');
    }
}

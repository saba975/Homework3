import java.util.InputMismatchException;
import java.util.Scanner;

public class C {

    private static int a, b, c;

    Scanner input = new Scanner(System.in);

    public void InitializeABC() {
        a = (int) input.nextInt();
        b = (int) input.nextInt();
        c = (int) input.nextInt();
    }

    public int getLastDigitOfA() {
        return Math.abs(a) % 10;
    }

    public int getFirstDigitOfB() {
        while (b >= 10)
            b /= 10;

        return b;
    }

    public int getSumOfC() {
        int sum = 0;
        while (c > 0) {
            sum = sum + c % 10;
            c = c / 10;
        }
        return sum;
    }

    public int getMultiply(int a, int b) {
        return a * b;
    }

    public int getMultiplayAndSum(int a, int b) {
        return a + b;
    }
}

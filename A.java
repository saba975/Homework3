import java.util.Scanner;

public class A extends B {

    public int x;
    Scanner input = new Scanner(System.in);

    A(){
        System.out.println("Hello");
    }

    public void initializeX(){
        x = input.nextInt();
    }

    public void printXPlusTwelve(){
        System.out.println(x + 12);
    }

    public void isOddOrEven(){
        if ( x % 2 == 0 ) System.out.println("x is even"); else System.out.println("x is odd");
    }


    @Override
    public void setY() {
        super.y = input.nextInt();
    }

    @Override
    public int getSum() {
        return super.y + this.x;
    }
}

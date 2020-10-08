import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {


    static Scanner input = new Scanner(System.in);

    public static void main(String [] args){

//        // დავალება 1
//
//        System.out.println("task 1");
//        C classC = new C();
//
//        classC.InitializeABC();
//
//        System.out.println(classC.getLastDigitOfA());
//
//        System.out.println(classC.getFirstDigitOfB());
//
//        System.out.println(classC.getSumOfC());
//
//        System.out.println(classC.getMultiply(classC.getLastDigitOfA(), classC.getFirstDigitOfB()));
//
//        System.out.println(classC.getMultiplayAndSum(classC.getFirstDigitOfB(), classC.getMultiply(classC.getLastDigitOfA(), classC.getFirstDigitOfB())));
//
//        // დავალება 2
//
//        System.out.println("task 2");
//        A classA = new A();
//
//        classA.initializeX();
//        classA.printXPlusTwelve();
//        classA.isOddOrEven();
//        System.out.println("Set Y");
//        classA.setY();
//        System.out.println("Sum of x and y");
//        System.out.println(classA.getSum());


        // დავალება 3

        int a,b,tmp, length, counter;

        System.out.println("task 3");
        a = input.nextInt();
        b = input.nextInt();


        if (a > b){
            tmp = b;
            b = a;
            a = tmp;
        }
        counter = a;
        length = b - a;
        int[] array = new int[length+1];

        for (int i = 0; i < length + 1; i++){
            array[i] = counter;
            counter++;
        }


        System.out.println(a);
        System.out.println(b);


        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0){

            }

        }



    }

}

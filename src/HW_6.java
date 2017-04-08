/**
 * Created by Александр on 08.04.2017.
 */

import java.util.*;

public class HW_6 {

    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    private static void HW_6_1(int nal) {//Bank operation
        int sum = 700;

        if (nal < sum)
            System.out.println("Your pay was accept!\nYour debt " + (sum - nal));

        if (nal == sum)
            System.out.println("Your pay was accept!\nYou repaid for debt");

        if (nal > sum)
            System.out.println("Your pay reject\nYou exceeded the payment amount for " + (nal - sum));
    }

    private static void HW_6_2(double val, double exchange) {//exchange money
        System.out.println(val * exchange);
    }

    private static void HW_6_3(int a) {

        if (a >= 0)
            System.out.println("The number is positive");
        if (a < 0)
            System.out.println("The number is negative");


        for (int k = 2; k * k <= a; k++) {
            if (a % k == 0) System.out.println("The number is not prime");
            else System.out.println("The number is prime.");
        }


        for (int i = 2; i < 10; i++) {
            if (i == 2 || i == 3 || i == 6 || i == 9 || i == 5) {
                if (a % i == 0) System.out.println("Number to divide without rest on " + i);
            }
        }
    }

    private static void HW_6_4_1(int[] ar) {//bubble sort
        int a = 0;

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < (ar.length - i); j++) {
                if (ar[j] > ar[j + 1]) {
                    a = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = a;
                }
            }
        }
    }

    private static void HW_6_4_2(int[] ar) {
        System.out.println(Arrays.toString(ar));
    }

    private static boolean HW_6_5(int[] ar, int a) {
        for (int i :
                ar) {
            if (a == i) return true;

        }
        return false;
    }

    private static boolean HW_6_5(double[] ar, double a) {
        for (double i :
                ar) {
            if (a == i) return true;

        }
        return false;
    }


    public static void main(String args[]){
        int choice = 0;
        int array[] = new int[10];

        System.out.println("Choice number of Home Work (1 - 5)");
        choice = scanner.nextInt();
        switch(choice){
            case 1:
                int a = 0;

                System.out.println("Welcom in the Bank\nPlease enter sum of the operation: ");
                a = scanner.nextInt();

                HW_6_1(a);
                break;

            case 2:
                double money = 0, course = 0;
                System.out.println("Welcome into Exchange manager!\nPlease enter money.");
                money = scanner.nextDouble();
                System.out.println("Please enter exchange cource.");
                course = scanner.nextDouble();
                HW_6_2(money, course);
                break;

            case 3:
                int number = 0;
                System.out.println("Welcom into number check\nPlease enter number.");
                number = scanner.nextInt();
                HW_6_3(number);
                break;

            case 4:
                for(int i = 0; i < array.length; i++){
                    array[i] = random.nextInt(100);
                }
                System.out.println("Welcome into bubble sort!\nMassive before sort");
                HW_6_4_2(array);
                HW_6_4_1(array);
                System.out.println("Massive after sort");
                HW_6_4_2(array);
                break;

            case 5:
                System.out.println("Welcom into locking number in the massive\nPlease choice type\n1)Integer\n2)Double");
                a = scanner.nextInt();
                if(a == 1){
                    System.out.println("Please choice number.");
                    number = scanner.nextInt();
                    System.out.println(HW_6_5(array, number) ? "Massive have this number" : "Massive have not this number");
                }
                if(a==2){
                    double numberD = 0;
                    double arrayD[] = new double[10];

                    for(int i = 0; i < arrayD.length; i++){
                        arrayD[i] = random.nextInt(100) + Math.random();
                    }


                    System.out.println("Please choice number");
                    numberD = scanner.nextDouble();

                    System.out.println(HW_6_5(arrayD, numberD) ? "Massive have this number" : "Massive have not this number");
                }
                break;
        }
    }
}

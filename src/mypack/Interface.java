package mypack;

import mypack.Calc;

import java.util.Scanner;

public class Interface {
    private Scanner scanner = new Scanner(System.in);
    private Calc calc = new Calc();
    Interface() {
        System.out.println("Welcome to calculator!");
        System.out.println("You have 3 operations:");
        System.out.println("1. Addition");
        System.out.println("2. Multiply");
        System.out.println("3. Division");
        System.out.println("4. Clear result");
        System.out.println("5. End work");
        System.out.println("");

        System.out.println("Please, enter option you want to choose");
        System.out.println("0");
        int opt = scanner.nextInt();
        selectOption(opt);
    }

    /**
     * providing operations by selected option
     * @param opt
     * @return -1 if option is wrong, and 1 if its OK
     */
    public int selectOption(int opt) {


        if(opt == 1) {
            int num = scanner.nextInt();
            System.out.println(calc.add(num));
            System.out.println(calc.printRes());
            int next = scanner.nextInt();
            selectOption(next);
        }
        else if(opt == 2) {
            int num = scanner.nextInt();
            System.out.println(calc.mult(num));
            System.out.println(calc.printRes());
            int next = scanner.nextInt();
            selectOption(next);
        }
        else if(opt == 3) {
            int num = scanner.nextInt();
            System.out.println(calc.div(num));
            System.out.println(calc.printRes());
            int next = scanner.nextInt();
            selectOption(next);
        }
        else if(opt == 4) {
            calc.clear();
            System.out.println(calc.printRes());
            int next = scanner.nextInt();
            selectOption(next);
        }
        else if(opt == 5) {
            System.out.println("FINISH");
        }
        else {
            return -1;
        }
        return 1;
    }

}
package mypack;

import mypack.Calc;

import java.util.Scanner;

public class Interface {
    private Scanner scanner = new Scanner(System.in);
    private Calc calc = new Calc();

    private CalcHistory calcHistory = new CalcHistory();

    Interface() {
        System.out.println("Welcome to calculator!");

        System.out.println("You have 3 operations:");

        System.out.println("1. Addition");

        System.out.println("2. Multiply");

        System.out.println("3. Division");

        System.out.println("4. Power in 2");

        System.out.println("7. Show history");

        System.out.println("8. Clear result");

        System.out.println("9. End work");

        System.out.println("");

        System.out.println("Please, enter option you want to choose");

        System.out.println("0");
        int opt = scanner.nextInt();
        selectOption(opt);
    }

    /**
     * providing operations by selected option
     *
     * @param opt
     * @return -1 if option is wrong, and 1 if its OK
     */
    public int selectOption(int opt) {


        if (opt == 1) {
            double num = scanner.nextInt();

            double res = calc.add(num);

            calcHistory.add(res);

            System.out.println(res);

            int next = scanner.nextInt();
            selectOption(next);
        }

        else if (opt == 2) {
            double num = scanner.nextInt();

            double res = calc.mult(num);

            calcHistory.add(res);

            System.out.println(res);

            int next = scanner.nextInt();
            selectOption(next);
        }

        else if (opt == 3) {
            double num = scanner.nextInt();

            double res = calc.div(num);

            calcHistory.add(res);

            System.out.println(res);

            int next = scanner.nextInt();
            selectOption(next);
        }

        else if (opt == 4) {
            double num = scanner.nextInt();

            double res = calc.pow2(num);

            calcHistory.add(res);

            System.out.println(res);

            int next = scanner.nextInt();
            selectOption(next);
        }

        else if (opt == 7) {
            calcHistory.show();

            int next = scanner.nextInt();
            selectOption(next);
        }

        else if (opt == 8) {
            calc.clear();
            System.out.println(calc.printRes());
            int next = scanner.nextInt();
            selectOption(next);
        }

        else if (opt == 9) {
            System.out.println("FINISH");
        }

        else {
            return -1;
        }

        return 1;
    }

}
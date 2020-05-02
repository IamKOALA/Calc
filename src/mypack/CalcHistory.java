package mypack;

import java.util.ArrayList;

public class CalcHistory {
    private ArrayList<Double> values = new ArrayList<Double>();

    public void add(Double val) {
        values.add(val);
    }

    public void show() {
        System.out.println("History of calculated values:");

        for (Double v : values) {
            System.out.print(v + " ");
        }

        System.out.println();
    }
}

package Nivel1.Duplicats;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {

        ArrayList<Month> months = new ArrayList<>();

        MonthManagement.addMonth(months);
        Month august = new Month ("August");
        MonthManagement.addMissingMonths(months, 7, august);

       for (Month m : months) {
            System.out.println(m);
        }

        System.out.println("\nMonth list before: " + months + "\n");
        System.out.print("Duplicate add returned:" + MonthManagement.monthDeduplicator(months) + "\n");
        System.out.println("Month list after: " + months + "\n");
        System.out.println("Iterator List: " + MonthManagement.printIterator(months));
    }
}

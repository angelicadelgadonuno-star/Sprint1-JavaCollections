package Nivel1.Duplicats;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class MonthManagement {

    public static void addMonth(ArrayList <Month> months){
        months.add(new Month("January"));
        months.add(new Month("February"));
        months.add(new Month("March"));
        months.add(new Month("April"));
        months.add(new Month("May"));
        months.add(new Month("June"));
        months.add(new Month("July"));
        months.add(new Month("September"));
        months.add(new Month("October"));
        months.add(new Month("November"));
        months.add(new Month("December"));
    }

    public static void addMissingMonths(ArrayList<Month> months, int monthPosition, Month monthName) {
        months.add(monthPosition, monthName);
    }

    public static boolean monthDeduplicator(ArrayList <Month> months){
        HashSet<Month> uniqueMonths = new HashSet<>(months);
        boolean inserted = uniqueMonths.add (new Month("January"));
        return inserted;
    }

    public static List<Month> printIterator(ArrayList<Month> months){
        HashSet<Month> uniqueMonths = new HashSet<>(months);
        Iterator<Month> it = uniqueMonths.iterator();
        List<Month> resultMonths = new ArrayList<>();
        while (it.hasNext()) {
        Month m = it.next();
        resultMonths.add(m);
    }
        return resultMonths;
    }
}


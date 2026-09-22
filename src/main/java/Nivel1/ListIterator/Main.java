package Nivel1.ListIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    static void main(String[] args) {


        List <Integer> numbers1 = new ArrayList<>();

        numbers1.add(56);
        numbers1.add(25);
        numbers1.add(44);
        numbers1.add(78);

        List <Integer> numbers2 = new ArrayList<>();

        ListIterator <Integer> it = numbers1.listIterator(numbers1.size());

        while (it.hasPrevious()){
            numbers2.add(it.previous());
        }
        System.out.println("First List " + numbers1);
        System.out.println("Second List" + numbers2);





    }
}

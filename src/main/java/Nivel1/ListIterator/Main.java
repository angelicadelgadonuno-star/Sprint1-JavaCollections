package Nivel1.ListIterator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {


        List <Integer> numbers1 = List.of(56,25,44,78);

        ListReverser reverser = new ListReverser(numbers1);

        List<Integer> numbers2 = reverser.listBackWards();

        System.out.println("First List " + numbers1);
        System.out.println("Second List" + numbers2);

    }
}

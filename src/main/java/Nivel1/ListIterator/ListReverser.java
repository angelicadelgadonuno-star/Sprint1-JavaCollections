package Nivel1.ListIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListReverser {

    private List<Integer> numbers;

    public ListReverser(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> listBackWards() {
        List<Integer> numbers2 = new ArrayList<>();
        ListIterator<Integer> it = numbers.listIterator(numbers.size());
        while (it.hasPrevious()) {
            numbers2.add(it.previous());
        }
        return numbers2;
    }
}





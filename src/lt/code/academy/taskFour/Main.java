package lt.code.academy.taskFour;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main <T extends ListOfNumbers> {

    public static void main(String[] args) {

        Main main = new Main();

        ListOfNumbers l1 = new ListOfNumbers();
        l1.addNumber(1.5d);
        l1.addNumber(10d);
        l1.addNumber(2.5d);

        ListOfNumbers l2 = new ListOfNumbers();
        l2.addNumber(0d);
        l2.addNumber(1d);

        ListOfNumbers l3 = new ListOfNumbers();
        l3.addNumber(100d);

        ListOfNumbers resultOne = main.findWithMaxAverage(l1, l3, l2);
        ListOfNumbers resultTwo = main.findWithMaxAverage( l2, l1);

        System.out.println(resultOne);
        System.out.println(resultTwo);
    }

    ListOfNumbers findWithMaxAverage (ListOfNumbers... lists){

        List<ListOfNumbers> sorted = Arrays.stream(lists).
               sorted(Comparator.comparing(ListOfNumbers::getAverage)).
                collect(Collectors.toList());

       return sorted.get(sorted.size()-1);

    }

}

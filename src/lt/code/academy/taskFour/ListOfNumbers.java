package lt.code.academy.taskFour;

import java.util.ArrayList;
import java.util.List;

public class ListOfNumbers {

    List<Double> numbers = new ArrayList<>();

    void addNumber(double number){
        this.numbers.add(number);
    }

    double getAverage (){
        double counter = 0;
        for(Double number : numbers){
            counter += number;
        }
        double average = counter / numbers.size();
        return average;

    }

    @Override
    public String toString() {
        return "ListOfNumbers{" +
                "numbers=" + numbers +
                '}';
    }

}

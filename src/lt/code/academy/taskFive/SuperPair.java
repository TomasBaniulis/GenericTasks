package lt.code.academy.taskFive;

public class SuperPair <K, V, N extends Number> {

    K valueOne;
    V valueTwo;
    N number;

    public SuperPair(K valueOne, V valueTwo, N number) {
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
        this.number = number;
    }
}

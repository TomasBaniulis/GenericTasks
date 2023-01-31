package lt.code.academy;

public class TaskOne <E> {

    public static void main(String[] args) {
        Integer[] numbers = {1,2,3};
        String[] strings = {"Hello", "World"};

        TaskOne one = new TaskOne();

        one.printArray(numbers, strings);
    }

    void printArray (E[] first, E[]second ) {
        for (int i = 0; i< first.length; i++){
            System.out.println(first[i]);
        }
        for (int i=0; i< second.length; i++){
            System.out.println(second[i]);
        }
    }




}

import java.util.*;

public class Main {
    public static void printNumbers(List<? extends Number> list) {
        for (Number n : list) {
            System.out.println(n);
        }
    }

    public static void addIntegers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
    }

    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1, 2, 3);
        List<Double> doubles = Arrays.asList(1.1, 2.2, 3.3);

        printNumbers(ints);
        printNumbers(doubles);

        List<Integer> a = new ArrayList<>();
        List<Number> b = new ArrayList<>();
        List<Object> c = new ArrayList<>();

        addIntegers(a);
        addIntegers(b);
        addIntegers(c);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
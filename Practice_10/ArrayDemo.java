import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] a = {5, 2, 8, 1, 3};
        int[] b = {1, 2, 3, 5, 8};
        int[] c = {1, 2, 3, 5, 9};

        // sort
        Arrays.sort(a);
        System.out.println("Отсортированный массив a в строковом представлении: " + Arrays.toString(a));

        // binarySearch
        int index = Arrays.binarySearch(a, 5);
        System.out.println("Индекс элемента 5: " + index);

        // equals
        System.out.println("a и b равны: " + Arrays.equals(a, b));

        // compare
        System.out.println("Сравнение b и c: " + Arrays.compare(b, c));
    }
}
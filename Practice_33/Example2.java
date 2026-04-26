import java.util.StringJoiner;

public class Example2 {
    public static void main(String[] args) {
        // 1. Простейшее объединение строк через разделитель
        StringJoiner joiner1 = new StringJoiner(", ");
        joiner1.add("Java");
        joiner1.add("Python");
        joiner1.add("C++");
        System.out.println("1. " + joiner1);

        // 2. Использование префикса и суффикса
        StringJoiner joiner2 = new StringJoiner(", ", "[", "]");
        joiner2.add("red");
        joiner2.add("green");
        joiner2.add("blue");
        System.out.println("2. " + joiner2);

        // 3. Объединение двух StringJoiner через merge()
        StringJoiner joiner3 = new StringJoiner(" - ");
        joiner3.add("A");
        joiner3.add("B");

        StringJoiner joiner4 = new StringJoiner(" - ");
        joiner4.add("C");
        joiner4.add("D");

        joiner3.merge(joiner4);
        System.out.println("3. " + joiner3);

        // 4. Значение для пустого объекта StringJoiner
        StringJoiner joiner5 = new StringJoiner(", ");
        joiner5.setEmptyValue("Строк нет");
        System.out.println("4. " + joiner5);
    }
}
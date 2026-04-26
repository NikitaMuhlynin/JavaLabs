import java.util.Formatter;

public class Example1 {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();

        fmt.format("Логическое значение: %b%n", true);     // %b
        fmt.format("Символ: %c%n", 'A');                   // %c
        fmt.format("Целое число: %d%n", 125);             // %d
        fmt.format("Число с плавающей точкой: %f%n", 12.34); // %f
        fmt.format("Строка: %s%n", "Java");               // %s

        System.out.println(fmt);
        fmt.close();
    }
}
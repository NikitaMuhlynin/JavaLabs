import java.util.Date;
import java.util.Formatter;

public class Example2 {
    public static void main(String[] args) {
        Date now = new Date();
        Formatter fmt = new Formatter();

        fmt.format("Час: %tH%n", now);          // %tH
        fmt.format("Минуты: %tM%n", now);       // %tM
        fmt.format("Секунды: %tS%n", now);      // %tS
        fmt.format("Год: %tY%n", now);          // %tY
        fmt.format("Месяц: %tm%n", now);        // %tm

        System.out.println(fmt);
        fmt.close();
    }
}
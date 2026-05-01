import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Example1 {
    public static void main(String[] args) throws IOException {
        byte[] data = {'J', 'a', 'v', 'a'};

        ByteArrayInputStream in = new ByteArrayInputStream(data);

        int b;
        while ((b = in.read()) != -1) { // read() читает один байт и возвращает его код
            System.out.println("Символ: " + (char) b + ", код: " + b);
        }

        in.close();
    }
}
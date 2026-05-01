import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Example2 {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        out.write(65); // символ 'A'
        out.write(66); // символ 'B'
        out.write(67); // символ 'C'

        byte[] result = out.toByteArray();

        for (byte b : result) {
            System.out.println("Символ: " + (char) b + ", код: " + b);
        }

        out.close();
    }
}
import java.util.ArrayList;
import java.util.List;

public class Main {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        List list = new ArrayList(); // raw type
        list.add("Привет");

        List<String> words = list;   // предупреждение подавляется
        System.out.println(words.get(0));
    }
}
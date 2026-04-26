public class Example1 {
    public static void main(String[] args) {
        String s1 = "  Hello, Java World!  ";
        String s2 = "hello, java world!";

        // 1. length() - возвращает длину строки
        System.out.println("1. length(): " + s1.length());

        // 2. trim() - удаляет пробелы в начале и в конце строки
        String trimmed = s1.trim();
        System.out.println("2. trim(): [" + trimmed + "]");

        // 3. charAt(index) - возвращает символ по указанному индексу
        System.out.println("3. charAt(1): " + trimmed.charAt(1));

        // 4. substring(begin, end) - возвращает подстроку
        System.out.println("4. substring(0, 5): " + trimmed.substring(0, 5));

        // 5. equals(obj) - сравнивает строки с учетом регистра
        System.out.println("5. equals(): " + trimmed.equals(s2));

        // 6. equalsIgnoreCase(obj) - сравнивает строки без учета регистра
        System.out.println("6. equalsIgnoreCase(): " + trimmed.equalsIgnoreCase(s2));

        // 7. toUpperCase() - переводит строку в верхний регистр
        System.out.println("7. toUpperCase(): " + trimmed.toUpperCase());

        // 8. replace(old, new) - заменяет один символ или подстроку на другую
        System.out.println("8. replace(\"Java\", \"Python\"): " + trimmed.replace("Java", "Python"));

        // 9. contains(str) - проверяет, содержит ли строка указанную подстроку
        System.out.println("9. contains(\"Java\"): " + trimmed.contains("Java"));

        // 10. indexOf(str) - возвращает индекс первого вхождения подстроки
        System.out.println("10. indexOf(\"World\"): " + trimmed.indexOf("World"));
    }
}
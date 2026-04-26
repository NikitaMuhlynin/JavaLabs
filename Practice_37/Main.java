public class Main {
    public static void main(String[] args) {

        // 1. Исключение перехватывается
        try {
            int a = 10 / 0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("Перехвачено исключение: деление на ноль");
        }

        // 2. Исключение не перехватывается
        String s = null;
        System.out.println(s.length()); // NullPointerException

        System.out.println("Эта строка уже не выполнится");
    }
}
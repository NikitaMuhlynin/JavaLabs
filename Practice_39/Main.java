public class Main {

    static void checkAge(int age) throws MyFirstException {
        if (age < 18) {
            throw new MyFirstException("Возраст меньше 18 лет");
        }
        System.out.println("Доступ разрешен");
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (MyFirstException e) {
            System.out.println("Перехвачено собственное исключение: " + e.getMessage());
        }
    }
}
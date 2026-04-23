class Example {

    void print() {
        System.out.println("Метод без параметров");
    }

    void print(String text) {
        System.out.println("Строка: " + text);
    }

    void print(int number) {
        System.out.println("Число: " + number);
    }

    void print(String text, int number) {
        System.out.println("Строка: " + text + ", число: " + number);
    }
}

public class Main {
    public static void main(String[] args) {
        Example obj = new Example();

        obj.print();
        obj.print("Привет");
        obj.print(10);
        obj.print("Возраст", 18);
    }
}
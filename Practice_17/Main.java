class Printer {
    void print(int... numbers) {
        System.out.println("Метод print(int...)");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    void print(String... words) {
        System.out.println("Метод print(String...)");
        for (String s : words) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}

class Message {
    void show(String title, int... nums) {
        System.out.println("Заголовок: " + title);
        for (int x : nums) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    void show(String title, String... words) {
        System.out.println("Заголовок: " + title);
        for (String s : words) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}

class Test {
    void func(int x) {
        System.out.println("Обычный метод: " + x);
    }

    void func(int... x) {
        System.out.println("Метод с переменным числом параметров:");
        for (int n : x) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Printer p = new Printer();

        p.print(1, 2, 3);
        p.print("Java", "Python", "C++");

        Message m = new Message();

        m.show("Числа", 10, 20, 30);
        m.show("Слова", "один", "два", "три");

        Test t = new Test();

        t.func(5);        // вызовется func(int)
        t.func(1, 2, 3);  // вызовется func(int...)
    }
}
final class A {
    void show() {
        System.out.println("Класс A");
    }
}

// Ошибка: нельзя наследоваться от final-класса
class B extends A {
    void print() {
        System.out.println("Класс B");
    }
}

public class Example2 {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
class A {
    public final void show() {
        System.out.println("Метод класса A");
    }
}

class B extends A {
    // Ошибка: нельзя переопределить final-метод
    public void show() {
        System.out.println("Метод класса B");
    }
}

public class Example1 {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
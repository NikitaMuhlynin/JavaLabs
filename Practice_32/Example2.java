interface InterfaceA {
    default void show() {
        System.out.println("Метод из InterfaceA");
    }
}

interface InterfaceB {
    default void show() {
        System.out.println("Метод из InterfaceB");
    }
}

class MyClass implements InterfaceA, InterfaceB {
    @Override
    public void show() {
        System.out.println("Метод класса MyClass"); // можно выйти из этого положения, переопределив этот метод в самом классе
    }
}

public class Example2 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.show();
    }
}
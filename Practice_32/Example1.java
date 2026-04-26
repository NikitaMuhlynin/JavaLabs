interface MyInterface {
    void printName(); // абстрактный метод

    default void showMessage() { // неабстрактный (default) метод
        System.out.println("Это default-метод интерфейса");
    }

    static void showInfo() { // статический метод
        System.out.println("Это static-метод интерфейса");
    }
}

class MyClass implements MyInterface {
    private String name;

    public MyClass(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println("Имя: " + name);
    }
}

public class Example1 {
    public static void main(String[] args) {
        MyClass obj = new MyClass("Иван");

        obj.printName();      // вызов абстрактного метода, реализованного в классе
        obj.showMessage();    // вызов default-метода через объект класса

        MyInterface ref = new MyClass("Петр");
        ref.printName();      // вызов через ссылку типа интерфейса
        ref.showMessage();    // вызов default-метода через ссылку типа интерфейса

        MyInterface.showInfo(); // вызов static-метода по имени интерфейса
    }
}
class Parent {
    String name;

    Parent(String name) {
        this.name = name;
        System.out.println("Конструктор Parent: name = " + name);
    }

    void showMessage() {
        System.out.println("Метод Parent: Привет из суперкласса");
    }
}

class Child extends Parent {
    String name;

    Child(String parentName, String childName) {
        super(parentName); // 1. обращение к конструктору суперкласса
        this.name = childName;
    }

    void printNames() {
        System.out.println("Поле суперкласса: " + super.name); // 2. доступ к полю суперкласса
        System.out.println("Поле подкласса: " + this.name);
    }

    @Override
    void showMessage() {
        super.showMessage(); // 3. доступ к методу суперкласса
        System.out.println("Метод Child: Привет из подкласса");
    }
}

public class Main {
    public static void main(String[] args) {
        Child obj = new Child("Родитель", "Потомок");

        obj.printNames();
        obj.showMessage();
    }
}
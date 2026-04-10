// перегрузки
class PrintDemo {
    void print(int a) {
        System.out.println("Целое число: " + a);
    }

    void print(double a) {
        System.out.println("Дробное число: " + a);
    }

    void print(String a) {
        System.out.println("Строка: " + a);
    }
}

// переопределение
class Animal {
    void sound() {
        System.out.println("Животное издает звук");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Собака лает");
    }
}

public class Main {
    public static void main(String[] args) {
        PrintDemo obj = new PrintDemo(); // перегрузка

        obj.print(10);
        obj.print(3.14);
        obj.print("Java");

        // переопределение
        Animal a = new Animal();
        Dog d = new Dog();

        a.sound();
        d.sound();

        //переопределение с полиморфизмом
        Animal objA = new Dog();
        objA.sound();
    }
}

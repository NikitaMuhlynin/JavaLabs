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
        Animal a = new Animal();
        Dog d = new Dog();

        a.sound();
        d.sound();
    }
}
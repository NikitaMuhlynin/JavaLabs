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
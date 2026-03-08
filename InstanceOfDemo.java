class Animal {}
class Cat extends Animal {}

public class InstanceOfDemo {
    public static void main(String[] args) {
        String s = "Java";
        System.out.println(s instanceof String); // true
        System.out.println(s instanceof Object); // true

        Animal kitty = new Cat();
        System.out.println(kitty instanceof Animal); // true 
        System.out.println(kitty instanceof Cat); // true

        Object obj = "Hello";
        System.out.println(obj instanceof String); // true
        System.out.println(obj instanceof Integer); // false

        Object n = null;
        System.out.println(n instanceof Object); // false
        System.out.println(n instanceof String); // false
    }
}

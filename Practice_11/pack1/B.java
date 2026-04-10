package pack1;

public class B {
    public void show() {
        A obj = new A();

        System.out.println("Класс B из того же пакета:");
        // System.out.println(obj.privateVar); // Ошибка: private
        System.out.println(obj.defaultVar);    // можно
        System.out.println(obj.protectedVar);  // можно
        System.out.println(obj.publicVar);     // можно
    }
}
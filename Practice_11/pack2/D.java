package pack2;

import pack1.A;

public class D {
    public void show() {
        A obj = new A();

        System.out.println("Класс D из другого пакета и не наследник:");
        // System.out.println(obj.privateVar);   // Ошибка
        // System.out.println(obj.defaultVar);   // Ошибка
        // System.out.println(obj.protectedVar); // Ошибка
        System.out.println(obj.publicVar);       // можно
    }
}
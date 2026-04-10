package pack2;

import pack1.A;

public class C extends A {
    public void show() {
        System.out.println("Класс C - наследник из другого пакета:");

        // System.out.println(privateVar); // Ошибка: private
        // System.out.println(defaultVar); // Ошибка: доступ только в пределах пакета
        System.out.println(protectedVar);  // можно, так как наследование
        System.out.println(publicVar);     // можно
    }
}
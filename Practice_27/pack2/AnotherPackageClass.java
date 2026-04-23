package pack2;

import pack1.Outer;

public class AnotherPackageClass {
    public static void main(String[] args) {
        Outer outer = new Outer();

        Outer.PublicInner a = outer.new PublicInner();
        a.show();

        // Outer.ProtectedInner b = outer.new ProtectedInner(); // ошибка
        // Outer.DefaultInner c = outer.new DefaultInner();     // ошибка
        // Outer.PrivateInner d = outer.new PrivateInner();     // ошибка
    }
}
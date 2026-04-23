package pack1;

public class SamePackageClass {
    public static void main(String[] args) {
        Outer outer = new Outer();

        Outer.PublicInner a = outer.new PublicInner();
        Outer.ProtectedInner b = outer.new ProtectedInner();
        Outer.DefaultInner c = outer.new DefaultInner();

        a.show();
        b.show();
        c.show();

        // Outer.PrivateInner d = outer.new PrivateInner(); // ошибка
    }
}
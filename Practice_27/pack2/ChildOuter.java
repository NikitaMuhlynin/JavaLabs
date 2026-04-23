package pack2;

import pack1.Outer;

public class ChildOuter extends Outer {
    public void test() {
        ProtectedInner b = createProtectedInner();
        b.show();
    }

    public static void main(String[] args) {
        ChildOuter obj = new ChildOuter();
        obj.test();
    }
}
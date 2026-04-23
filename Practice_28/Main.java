class Outer {
    private int a = 10;
    int b = 20;
    protected int c = 30;
    public int d = 40;

    private void m1() {
        System.out.println("private method");
    }

    void m2() {
        System.out.println("default method");
    }

    protected void m3() {
        System.out.println("protected method");
    }

    public void m4() {
        System.out.println("public method");
    }

    class Inner {
        void show() {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);

            m1();
            m2();
            m3();
            m4();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.show();
    }
}
public class Outer {

    class Inner {
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
    }

    void showInnerData() {
        Inner obj = new Inner();

        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);

        obj.m1();
        obj.m2();
        obj.m3();
        obj.m4();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.showInnerData();
    }
}
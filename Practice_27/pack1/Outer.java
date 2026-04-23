package pack1;

public class Outer {

    public class PublicInner {
        public void show() {
            System.out.println("PublicInner");
        }
    }

    protected class ProtectedInner {
        public void show() {
            System.out.println("ProtectedInner");
        }
    }

    class DefaultInner {
        public void show() {
            System.out.println("DefaultInner");
        }
    }

    private class PrivateInner {
        public void show() {
            System.out.println("PrivateInner");
        }
    }

    public void testInsideOuter() {
        PublicInner a = new PublicInner();
        ProtectedInner b = new ProtectedInner();
        DefaultInner c = new DefaultInner();
        PrivateInner d = new PrivateInner();

        a.show();
        b.show();
        c.show();
        d.show();
    }

    protected ProtectedInner createProtectedInner() {
        return new ProtectedInner();
    }
}
class MyResource implements AutoCloseable {
    public void work() {
        System.out.println("Ресурс используется");
    }

    @Override
    public void close() {
        System.out.println("Ресурс закрыт");
    }
}

public class Example3 {
    public static void main(String[] args) {
        try (MyResource res = new MyResource()) {
            res.work();
        }
    }
}
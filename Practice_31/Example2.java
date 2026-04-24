class Example {

    @Deprecated
    void oldMethod() {
        System.out.println("Старый метод");
    }

    void newMethod() {
        System.out.println("Новый метод");
    }
}

public class Example2 {
    public static void main(String[] args) {
        Example obj = new Example();
        obj.oldMethod(); // компилятор выдаст предупреждение
        obj.newMethod();
    }
}
interface MyInterface {

    class NestedClass {
        public void show() {
            System.out.println("Метод вложенного класса в интерфейсе");
        }
    }
}

public class Example1 {
    public static void main(String[] args) {
        MyInterface.NestedClass obj = new MyInterface.NestedClass();
        obj.show();
    }
}
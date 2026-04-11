class Box<T> {
    T value;

    Box(T value) {
        this.value = value;
    }
}

public class main {
    public static void main(String[] args) {
        Box<String> b1 = new Box<>("Hello");

        if (b1 instanceof Box<?>) { // проверка объекта параметризованного класса
            System.err.println("b1 - объект класса Box");
        }

        Object obj = new Box<Integer>(123);

        if (obj instanceof Box<?>) { // через ссылку типа Object
            System.out.println("obj содержит объект параметризованного класса Box");
        }
    }
}
public class A {
    public final int a = 10; // сразу после объявления
}

public class A {
    public final int a;

    {
        a = 10; // в блоке инициализации экземпляра
    }
} 

public class A {
    public final int a;

    public A() {
        a = 10; // в конструкторе
    }
}

public class A {
    public final int a;

    public A() {
        a = 0;
    }

    public A(int x) {
        a = x; // в каждом конструкторе, если их много
    }
}
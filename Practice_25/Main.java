class Parent {
    void showMessage() {
        System.out.println("Сообщение из Parent");
    }
}

class Child extends Parent {
    @Override
    void showmessage() {   // ошибка: имя метода написано не так
        System.out.println("Сообщение из Child");
    }
}
public class CreateBooleanDemo {
    public static void main(String[] args) {
        Boolean b1 = Boolean.valueOf("true"); // true
        Boolean b2 = Boolean.valueOf("TRUE"); // true
        Boolean b3 = Boolean.valueOf(true); // true
        Boolean b4 = Boolean.valueOf("Cute kitty"); // false
        Boolean b5 = true; // true, автоупаковка
        Boolean b6 = false; // false, автоупаковка

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        System.out.println(b6);
    }
}

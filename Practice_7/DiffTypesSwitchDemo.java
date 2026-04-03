public class DiffTypesSwitchDemo {
    public static void main(String[] args) {

        // byte
        byte b = 2;
        switch (b) {
            case 1 -> System.out.println("byte");
            case 2 -> System.out.println("2 bytes");
        }

        // short
        short s = 10;
        switch (s) {
            case 5 -> System.out.println("short");
            case 10 -> System.out.println("short = 10");
        }

        // char
        char ch = 'A';
        switch (ch) {
            case 'A' -> System.out.println("char A");
            case 'B' -> System.out.println("char B");
        }

        // int
        int n = 40;
        switch (n) {
            case 20 -> System.out.println("int = 20");
            case 40 -> System.out.println("int = 40");
        }

        // Byte
        Byte bObj = 1;
        switch (bObj) {
            case 1 -> System.out.println("Byte");
            case 2 -> System.out.println("2 Bytes");
        }

        // Short
        Short sObj = 7;
        switch (sObj) {
            case 7 -> System.out.println("Short 7");
            default -> System.out.println("other");
        }

        // Character
        Character chObj = 'x';
        switch (chObj) {
            case 'x' -> System.out.println("Character x");
            default -> System.out.println("other");
        }

        // Integer
        Integer iObj = 69;
        switch (iObj) {
            case 69 -> System.out.println("Integer 69");
            default -> System.out.println("other");
        }

        // String
        String str = "start";
        switch (str) {
            case "start" -> System.out.println("String");
            case "stop" -> System.out.println("Stop");
        }

        // enum
        enum Day { MON, TUE, WED }
        Day day = Day.TUE;
        switch (day) {
            case MON -> System.out.println("Monday");
            case TUE -> System.out.println("Tuesday");
            case WED -> System.out.println("Wednesday");
        }
    }
}

public class DecodeDemo {
    public static void main(String[] args) {
        Integer val1 = Integer.decode("15"); // 15
        Integer val2 = Integer.decode("017"); // 15
        Integer val3 = Integer.decode("0x15"); // 21
        Integer val4 = Integer.decode("#15"); // 21

        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);
        System.out.println(val4);
    }
}

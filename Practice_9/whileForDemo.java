public class whileForDemo {
    public static void Main(String[] args) {

        // басконечные while и do-while
        while (true) {
            System.err.println("something");
        } 

        do {
            System.err.println("something");
        } while (true);

        // break и continue
        for (int i = 1; i <= 10; i++) {

            if (i == 3) {
                continue;
            }

            if (i == 7) {
                break; 
            }
        }
    }
}

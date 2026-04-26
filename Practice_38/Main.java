public class Main {

    public static void main(String[] args) {

        // 1. Несколько исключений обрабатываются одинаково
        try {
            int[] arr = {1, 2, 3};

            int x = 10 / 0;          // ArithmeticException
            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка вычисления или выхода за границы массива");
        }

        // 2. Исключения образуют иерархию
        try {
            method3();
        } catch (Ex3 e) {
            System.out.println("Перехвачено Ex3");
        } catch (Ex2 e) {
            System.out.println("Перехвачено Ex2");
        } catch (Ex1 e) {
            System.out.println("Перехвачено Ex1");
        }
    }

    static void method3() throws Ex1 {
        throw new Ex3();
    }
}

// Ex1 <- Ex2 <- Ex3
class Ex1 extends Exception { }
class Ex2 extends Ex1 { }
class Ex3 extends Ex2 { }
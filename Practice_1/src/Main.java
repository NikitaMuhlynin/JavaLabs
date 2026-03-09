import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = scan.nextLine();
        System.out.print("Привет, " + name);
        scan.close();
    }
    
}

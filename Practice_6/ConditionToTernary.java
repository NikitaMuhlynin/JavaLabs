import java.util.Scanner;

public class ConditionToTernary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        
        int i = (a == 1) ? 1 : ((a == 2) ? 2 : 3);
        System.out.println(i);
        scan.close();
    } 
}
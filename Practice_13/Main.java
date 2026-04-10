public class Main {
    public static void main(String[] args) {
        A.printVars(); // вызов через класс
        
        A obj = new A(); // вызов через экземпляр
        obj.printVars();
    }
}
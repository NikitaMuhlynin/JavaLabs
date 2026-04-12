enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }
}

public class Example1 {
    public static void main(String[] args) {
        Day d = Day.SATURDAY;

        System.out.println("День: " + d);
        System.out.println("Выходной: " + d.isWeekend());
    } 
}
enum Day {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье");

    private String title;

    Day(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

public class Example2 {
    public static void main(String[] args) {
        Day d = Day.FRIDAY;

        System.out.println(d);
        System.out.println(d.getTitle());
    }
}
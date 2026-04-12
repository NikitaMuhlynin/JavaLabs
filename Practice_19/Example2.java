enum Season {
    WINTER, SPRING, SUMMER, AUTUMN;

    public String getDescription() {
        switch (this) {
            case WINTER: return "Холодное время года";
            case SPRING: return "Время пробуждения природы";
            case SUMMER: return "Самое теплое время года";
            case AUTUMN: return "Время листопада";
            default: return "";
        }
    }
}

public class Example2 {
    public static void main(String[] args) {
        Season s = Season.SUMMER;
        System.out.println(s + " - " + s.getDescription());
    }
}

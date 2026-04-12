enum Season {
    WINTER(-10),
    SPRING(10),
    SUMMER(25),
    AUTUMN(8);

    private int avgTemp;

    Season(int avgTemp) {
        this.avgTemp = avgTemp;
    }

    public int getAvgTemp() {
        return avgTemp;
    }
}

public class Example1 {
    public static void main(String[] args) {
        Season s = Season.SUMMER;

        System.out.println("Время года: " + s);
        System.out.println("Средняя температура: " + s.getAvgTemp());
    }
}
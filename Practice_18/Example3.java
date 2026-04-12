enum Status {
    NEW("Новый"),
    IN_PROGRESS("В работе"),
    DONE("Завершён");

    private String description;

    Status(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

class Task {
    private String name;
    private Status status;

    public Task(String name, Status status) {
        this.name = name;
        this.status = status;
    }

    public void printInfo() {
        System.out.println("Задача: " + name);
        System.out.println("Статус: " + status.getDescription());
    }
}

public class Example3 {
    public static void main(String[] args) {
        Task task = new Task("Подготовить отчет", Status.IN_PROGRESS);
        task.printInfo();
    }
}

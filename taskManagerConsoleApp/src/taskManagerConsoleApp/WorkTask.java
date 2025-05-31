package taskManagerConsoleApp;

import java.time.LocalDate;

public class WorkTask extends Task {
    public WorkTask(int id, String title, String description, String status, LocalDate dueDate) {
        super(id, title, description, status, dueDate);
    }

    @Override
    public void displayTask() {
        System.out.println("[Work] ID: " + id + ", Title: " + title + ", Status: " + status + ", Due: " + dueDate);
    }
}



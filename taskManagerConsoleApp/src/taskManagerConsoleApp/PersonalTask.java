package taskManagerConsoleApp;

import java.time.LocalDate;

public class PersonalTask extends Task {
    public PersonalTask(int id, String title, String description, String status, LocalDate dueDate) {
        super(id, title, description, status, dueDate);
    }

    @Override
    public void displayTask() {
        System.out.println("[Personal] ID: " + id + ", Title: " + title + ", Status: " + status + ", Due: " + dueDate);
    }
}

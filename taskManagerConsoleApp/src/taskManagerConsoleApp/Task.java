package taskManagerConsoleApp;

import java.time.LocalDate;

public abstract class Task {
    protected int id;
    protected String title;
    protected String description;
    protected String status;
    protected LocalDate dueDate;

    public Task(int id, String title, String description, String status, LocalDate dueDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
        this.dueDate = dueDate;
    }

    public int getId() { return id; }
    public String getStatus() { return status; }
    public LocalDate getDueDate() { return dueDate; }
    public void setStatus(String status) { this.status = status; }

    public abstract void displayTask();
}


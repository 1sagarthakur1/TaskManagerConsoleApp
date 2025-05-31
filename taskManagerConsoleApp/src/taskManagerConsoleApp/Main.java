package taskManagerConsoleApp;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskManagerImpl manager = new TaskManagerImpl();

        while (true) {
            System.out.println("\n--- Task Manager ---");
            System.out.println("1. Add Task\n2. View All Tasks\n3. Search Task\n4. Update Task Status\n5. Delete Task\n6. Filter Completed Tasks\n7. Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            try {
                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter type (work/personal): ");
                        String type = sc.nextLine();
                        System.out.print("Title: "); String title = sc.nextLine();
                        System.out.print("Description: "); String desc = sc.nextLine();
                        System.out.print("Due date (yyyy-mm-dd): "); LocalDate due = LocalDate.parse(sc.nextLine());
                        int id = (int)(Math.random() * 10000);

                        Task task = type.equalsIgnoreCase("work") ?
                            new WorkTask(id, title, desc, "Pending", due) :
                            new PersonalTask(id, title, desc, "Pending", due);

                        manager.addTask(task);
                        System.out.println("Task added with ID: " + id);
                    }

                    case 2 -> manager.getAllTasks().forEach(Task::displayTask);

                    case 3 -> {
                        System.out.print("Enter Task ID: ");
                        int id = sc.nextInt();
                        manager.searchTaskById(id).ifPresentOrElse(
                            Task::displayTask,
                            () -> System.out.println("Task not found.")
                        );
                    }

                    case 4 -> {
                        System.out.print("Enter Task ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("New Status (Pending/Completed): ");
                        String status = sc.nextLine();
                        manager.updateTaskStatus(id, status);
                        System.out.println("Updated successfully.");
                    }

                    case 5 -> {
                        System.out.print("Enter Task ID: ");
                        int id = sc.nextInt();
                        manager.removeTask(id);
                        System.out.println("Task removed.");
                    }

                    case 6 -> manager.filterByStatus("Completed").forEach(Task::displayTask);

                    case 7 -> {
                        System.out.println("Exiting...");
                        return;
                    }

                    default -> System.out.println("Invalid option.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}

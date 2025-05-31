package taskManagerConsoleApp;

import java.util.*;
import java.util.stream.Collectors;

public class TaskManagerImpl implements TaskOperations {
    private List<Task> taskList = new ArrayList<>();
    private Map<Integer, Task> taskMap = new HashMap<>();

    @Override
    public void addTask(Task task) {
        taskList.add(task);
        taskMap.put(task.getId(), task);
    }

    @Override
    public void removeTask(int id) throws TaskNotFoundException {
        Task task = taskMap.remove(id);
        if (task == null) throw new TaskNotFoundException("Task not found with ID: " + id);
        taskList.remove(task);
    }

    @Override
    public void updateTaskStatus(int id, String status) throws TaskNotFoundException {
        Task task = taskMap.get(id);
        if (task == null) throw new TaskNotFoundException("Task not found with ID: " + id);
        task.setStatus(status);
    }

    @Override
    public List<Task> getAllTasks() {
        return taskList;
    }

    @Override
    public Optional<Task> searchTaskById(int id) {
        return Optional.ofNullable(taskMap.get(id));
    }

    public List<Task> filterByStatus(String status) {
        return taskList.stream()
                .filter(task -> task.getStatus().equalsIgnoreCase(status))
                .collect(Collectors.toList());
    }

    public List<Task> sortByDueDate() {
        return taskList.stream()
                .sorted(Comparator.comparing(Task::getDueDate))
                .collect(Collectors.toList());
    }
}



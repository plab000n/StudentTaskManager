import java.util.ArrayList;

public class TaskManager {
    ArrayList<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks found.");
            return;
        }
        for (Task t : tasks) {
            System.out.println(t);
        }
    }

    public void deleteTask(int id) {
        tasks.removeIf(t -> t.id == id);
    }

    public void markTaskDone(int id) {
        for (Task t : tasks) {
            if (t.id == id) {
                t.markComplete();
            }
        }
    }
}

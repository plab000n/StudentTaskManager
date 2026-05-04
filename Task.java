public class Task {
    int id;
    String title;
    boolean isCompleted;

    public Task(int id, String title) {
        this.id = id;
        this.title = title;
        this.isCompleted = false;
    }

    public void markComplete() {
        isCompleted = true;
    }

    public String toString() {
        return id + ". " + title + " [" + (isCompleted ? "Done" : "Pending") + "]";
    }
    public void updateTask(int id, String newTitle) {
    for (Task t : tasks) {
        if (t.id == id) {
            t.title = newTitle;
        }
    }
}
}

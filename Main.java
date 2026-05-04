import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner sc = new Scanner(System.in);
        int choice;
        int id = 1;

        do {
            System.out.println("\n1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task Done");
            System.out.println("4. Delete Task");
            System.out.println("0. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter task: ");
                    String title = sc.nextLine();
                    manager.addTask(new Task(id++, title));
                    break;

                case 2:
                    manager.viewTasks();
                    break;

                case 3:
                    System.out.print("Enter task ID: ");
                    int doneId = sc.nextInt();
                    manager.markTaskDone(doneId);
                    break;

                case 4:
                    System.out.print("Enter task ID: ");
                    int delId = sc.nextInt();
                    manager.deleteTask(delId);
                    break;
            }
        } while (choice != 0);

        sc.close();
    }
}

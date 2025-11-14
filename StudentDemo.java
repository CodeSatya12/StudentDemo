package satya3;

import java.util.*;

class Student {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void show() {
        System.out.println("ID: " + id + ", Name: " + name + ", Marks: " + marks);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        while (true) {
            System.out.println("\n1. Add\n2. View\n3. Update\n4. Delete\n5. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            if (ch == 1) {
                System.out.print("ID: ");
                int id = sc.nextInt();
                sc.nextLine(); // clear buffer
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Marks: ");
                int marks = sc.nextInt();
                list.add(new Student(id, name, marks));
                System.out.println("Added.");
            } else if (ch == 2) {
                for (Student s : list) {
                    s.show();
                }
            } else if (ch == 3) {
                System.out.print("Enter ID to update: ");
                int id = sc.nextInt();
                for (Student s : list) {
                    if (s.id == id) {
                        sc.nextLine();
                        System.out.print("New Name: ");
                        s.name = sc.nextLine();
                        System.out.print("New Marks: ");
                        s.marks = sc.nextInt();
                        System.out.println("Updated.");
                    }
                }
            } else if (ch == 4) {
                System.out.print("Enter ID to delete: ");
                int id = sc.nextInt();
                list.removeIf(s -> s.id == id);
                System.out.println("Deleted.");
            } else if (ch == 5) {
                System.out.println("Bye!");
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }
}
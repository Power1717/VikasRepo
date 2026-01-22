import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    // Student class
    static class Student {
        private int id;
        private String name;
        private int age;

        public Student(int id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{id=" + id + ", name='" + name + "', age=" + age + "}";
        }
    }

    // Service class
    static class StudentService {
        private List<Student> students = new ArrayList<>();

        public void addStudent(Student student) {
            students.add(student);
        }

        public List<Student> getAllStudents() {
            return students;
        }
    }

    // Main method
    public static void main(String[] args) {
        StudentService service = new StudentService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();

                    System.out.print("Enter Name: ");
                    String name = scanner.next();

                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();

                    service.addStudent(new Student(id, name, age));
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    System.out.println("\nStudents List:");
                    for (Student s : service.getAllStudents()) {
                        System.out.println(s);
                    }
                    break;

                case 3:
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}

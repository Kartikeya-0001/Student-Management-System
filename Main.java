import model.Student;
import service.StudentManager;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        Student s1 = new Student(101, "Ankit", "ankit@mail.com", "B.Tech", 89.5, "A");
        Student s2 = new Student(102, "Riya", "riya@mail.com", "M.Tech", 91.2, "A+");

        manager.addStudent(s1);
        manager.addStudent(s2);

        manager.viewAllStudents();

        // Demonstrating Overloading
        s1.displayInfo("Overloaded display method example:");
    }
}

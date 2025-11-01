package model;

public class Student extends Person {
    private int rollNo;
    private String course;
    private double marks;
    private String grade;

    // Constructor
    public Student(int rollNo, String name, String email, String course, double marks, String grade) {
        super(name, email);
        this.rollNo = rollNo;
        this.course = course;
        this.marks = marks;
        this.grade = grade;
    }

    // Method Overloading Example
    public void displayInfo(String note) {
        System.out.println(note);
        displayInfo();
    }

    // Overridden Method
    @Override
    public void displayInfo() {
        System.out.println("\nStudent Info:");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }

    public int getRollNo() { return rollNo; }
    public void setCourse(String course) { this.course = course; }
    public void setMarks(double marks) { this.marks = marks; }
    public void setGrade(String grade) { this.grade = grade; }
}

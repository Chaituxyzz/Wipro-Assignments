package StudentGrade;

import java.util.ArrayList;
import java.util.Scanner;

public class GradeManagementSystem {

    static class Student {
        int id;
        String name;
        ArrayList<Grade> grades = new ArrayList<>();

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student ID: " + id + ", Name: " + name;
        }
    }

    static class Course {
        int id;
        String name;

        public Course(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Course ID: " + id + ", Name: " + name;
        }
    }

    static class Grade {
        int courseId;
        String courseName;
        double grade;

        public Grade(int courseId, String courseName, double grade) {
            this.courseId = courseId;
            this.courseName = courseName;
            this.grade = grade;
        }

        @Override
        public String toString() {
            return "Course ID: " + courseId + ", Course Name: " + courseName + ", Grade: " + grade;
        }
    }

    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Course> courses = new ArrayList<>();

    public void addStudent(int id, String name) {
        students.add(new Student(id, name));
        System.out.println("Student added successfully.");
    }

    public void addCourse(int id, String name) {
        courses.add(new Course(id, name));
        System.out.println("Course added successfully.");
    }

    public void assignGrade(int studentId, int courseId, double grade) {
        Student student = findStudentById(studentId);
        Course course = findCourseById(courseId);

        if (student == null) {
            System.out.println("Student not found.");
            return;
        }

        if (course == null) {
            System.out.println("Course not found.");
            return;
        }

        student.grades.add(new Grade(courseId, course.name, grade));
        System.out.println("Grade assigned successfully.");
    }

    public void calculateGPA(int studentId) {
        Student student = findStudentById(studentId);

        if (student == null) {
            System.out.println("Student not found.");
            return;
        }

        if (student.grades.isEmpty()) {
            System.out.println("No grades available for this student.");
            return;
        }

        double totalGrades = 0;
        for (Grade grade : student.grades) {
            totalGrades += grade.grade;
        }
        double gpa = totalGrades / student.grades.size();
        System.out.println("GPA for " + student.name + " is: " + gpa);
    }

    public void listStudents() {
        System.out.println("Students:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void listCourses() {
        System.out.println("Courses:");
        for (Course course : courses) {
            System.out.println(course);
        }
    }

    private Student findStudentById(int id) {
        for (Student student : students) {
            if (student.id == id) {
                return student;
            }
        }
        return null;
    }

    private Course findCourseById(int id) {
        for (Course course : courses) {
            if (course.id == id) {
                return course;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        GradeManagementSystem system = new GradeManagementSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nStudent Grade Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Add Course");
            System.out.println("3. Assign Grade");
            System.out.println("4. Calculate GPA");
            System.out.println("5. List Students");
            System.out.println("6. List Courses");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int studentId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Student Name: ");
                    String studentName = scanner.nextLine();
                    system.addStudent(studentId, studentName);
                    break;

                case 2:
                    System.out.print("Enter Course ID: ");
                    int courseId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Course Name: ");
                    String courseName = scanner.nextLine();
                    system.addCourse(courseId, courseName);
                    break;

                case 3:
                    System.out.print("Enter Student ID: ");
                    studentId = scanner.nextInt();
                    System.out.print("Enter Course ID: ");
                    courseId = scanner.nextInt();
                    System.out.print("Enter Grade: ");
                    double grade = scanner.nextDouble();
                    system.assignGrade(studentId, courseId, grade);
                    break;

                case 4:
                    System.out.print("Enter Student ID: ");
                    studentId = scanner.nextInt();
                    system.calculateGPA(studentId);
                    break;

                case 5:
                    system.listStudents();
                    break;

                case 6:
                    system.listCourses();
                    break;

                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

package Task3;

import java.io.*;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + '}';
    }
}

class Course implements Serializable {
    private static final long serialVersionUID = 1L;
    private String courseCode;
    private String courseName;
    private String instructor;

    public Course(String courseCode, String courseName, String instructor) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.instructor = instructor;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    @Override
    public String toString() {
        return "Course{" + "courseCode='" + courseCode + '\'' + ", courseName='" + courseName + '\'' + ", instructor='" + instructor + '\'' + '}';
    }
}

class Enrollment implements Serializable {
    private static final long serialVersionUID = 1L;
    private Student student;
    private Course course;
    private String enrollmentDate;

    public Enrollment(Student student, Course course, String enrollmentDate) {
        this.student = student;
        this.course = course;
        this.enrollmentDate = enrollmentDate;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(String enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    @Override
    public String toString() {
        return "Enrollment{" + "student=" + student + ", course=" + course + ", enrollmentDate='" + enrollmentDate + '\'' + '}';
    }
}

public class Main {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Pelikone\\IdeaProjects\\JavaTasks\\Module 3.4\\src\\Task3\\enrollments.ser";

        Student student = new Student(1001, "Luulet", 23);
        Course course = new Course("JAVA", "Object Oriented Programming", "Jarkko");
        Enrollment enrollment = new Enrollment(student, course, "2025-01-15");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(enrollment);
            System.out.println("Enrollment serialized and saved to: " + filePath);
        } catch (IOException e) {
            System.err.println("Error during serialization: " + e.getMessage());
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            Enrollment deserializedEnrollment = (Enrollment) ois.readObject();
            System.out.println("\nDeserialized Enrollment:");
            System.out.println(deserializedEnrollment);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error during deserialization: " + e.getMessage());
        }
    }
}

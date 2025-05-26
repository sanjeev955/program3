import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class StudentCourses {
    private Map<Integer, List<Course>> courses;

    public StudentCourses() {
        courses = new HashMap<>();
    }

    public void addCourse(int semester, String courseName, int marks) {
        Course course = new Course(courseName, marks);
        courses.computeIfAbsent(semester, k -> new ArrayList<>()).add(course);
    }

    public void displayCourses() {
        for (Map.Entry<Integer, List<Course>> entry : courses.entrySet()) {
            System.out.println("\nSemester: " + entry.getKey());
            for (Course course : entry.getValue()) {
                System.out.println("Course: " + course.getCourseName() + ", Marks: " + course.getMarks());
            }
        }
    }
}

class Course {
    private String courseName;
    private int marks;

    public Course(String courseName, int marks) {
        this.courseName = courseName;
        this.marks = marks;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getMarks() {
        return marks;
    }
}

public class Main {
    public static void main(String[] args) {
        StudentCourses studentCourses = new StudentCourses();
        studentCourses.addCourse(1, "Mathematics", 85);
        studentCourses.addCourse(1, "Physics", 90);
        studentCourses.displayCourses();
    }
}
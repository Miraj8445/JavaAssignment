import java.util.ArrayList;

public class Student {
    
    private String name;
    private String grade;
    private ArrayList<String> courses;

    
    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    
    public String getName() {
        return name;
    }

    
    public String getGrade() {
        return grade;
    }

   
    public ArrayList<String> getCourses() {
        return courses;
    }

    public void addCourse(String course) {
        courses.add(course);
        System.out.println(course + " has been added to " + name + "'s course list.");
    }

    
    public void removeCourse(String course) {
        if (courses.remove(course)) {
            System.out.println(course + " has been removed from " + name + "'s course list.");
        } else {
            System.out.println(course + " is not in " + name + "'s course list.");
        }
    }

    
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Courses: " + courses);
    }

    public static void main(String[] args) {
        
        Student student = new Student("Miraj", "10th Grade");

        student.addCourse("Math");
        student.addCourse("Science");
        student.addCourse("English ");

        student.printDetails();

        student.removeCourse("Science");

        student.printDetails();
    }
}

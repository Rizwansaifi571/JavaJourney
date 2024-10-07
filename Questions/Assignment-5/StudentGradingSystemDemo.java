import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private List<Double> grades;

    // Constructor to initialize student name and grades as an array
    public Student(String name, double[] gradesArray) {
        this.name = name;
        this.grades = new ArrayList<>();
        for (double grade : gradesArray) {
            grades.add(grade);
        }
    }

    // Overloaded constructor to initialize student name and grades as a list
    public Student(String name, List<Double> gradesList) {
        this.name = name;
        this.grades = new ArrayList<>(gradesList);
    }

    // Method to calculate average grade
    public double calculateAverage() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    // Method to find the highest grade
    public double findHighestGrade() {
        double highest = grades.get(0);
        for (double grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    // Method to find the lowest grade
    public double findLowestGrade() {
        double lowest = grades.get(0);
        for (double grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }

    // Method to display student details and grades
    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Grades: " + grades);
        System.out.println("Average Grade: " + calculateAverage());
        System.out.println("Highest Grade: " + findHighestGrade());
        System.out.println("Lowest Grade: " + findLowestGrade());
    }
}

public class StudentGradingSystemDemo {
    public static void main(String[] args) {
        // Example with grades as an array
        double[] gradesArray = {85.5, 90.0, 78.5, 92.0};
        Student student1 = new Student("Alice", gradesArray);
        student1.displayStudentInfo();
        
        System.out.println();

        // Example with grades as a list
        List<Double> gradesList = new ArrayList<>();
        gradesList.add(88.0);
        gradesList.add(76.5);
        gradesList.add(95.0);
        gradesList.add(82.5);
        Student student2 = new Student("Bob", gradesList);
        student2.displayStudentInfo();
    }
}

package exercises.ex2_1;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private final int StudentNo;
    private String name;
    private final List<Integer> grades;

    public Student(int studentNo, String name, List<Integer> grades) {
        StudentNo = studentNo;
        this.name = name;
        this.grades = grades;
    }

    public int getStudentNo() {
        return StudentNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getGrades() {
        return new ArrayList<>(grades);
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    @Override
    public String toString() {
        return "Student: \n" + "StudentNo: " + StudentNo + "\nName: " + name + "\nGrades: " + grades;
    }
}

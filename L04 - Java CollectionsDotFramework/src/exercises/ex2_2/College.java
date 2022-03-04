package exercises.ex2_2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class College {
    private String name;
//  Link attribute
    private Set<Student> students = new LinkedHashSet<Student>();

    public College(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public double calcAverage() {
        double average = 0;
        double count = 0;
        for (Student s : students) {
            for (int grade : s.getGrades()) {
                average += grade;
                count++;
            }
        }
        return average/count;
    }
     public Student findStudent(int studentNo) {
        for (Student student : students) {
            if (student.getStudentNo() == studentNo) {
                return student;
            }
        }
        return null;
     }
}

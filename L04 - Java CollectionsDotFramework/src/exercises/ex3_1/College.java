package exercises.ex3_1;

import java.util.ArrayList;
import java.util.List;

public class College {
    private String name;
//  Link attribute
    private List<Student> students = new ArrayList<>();

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

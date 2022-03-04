package exercises.ex2_3;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class College {
    private String name;
//  Link attribute
    private final Map<Integer, Student> students = new LinkedHashMap<>();

    public College(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        students.put(student.getStudentNo(), student);
    }

    public void removeStudent(Student student) {
        students.remove(student.getStudentNo(), student);
    }

//    public double calcAverage() {
//        double average = 0;
//        double count = 0;
//        Student student;
//        for (Integer i : students.keySet()) {
//            student = findStudent(i);
//            for (int grade : student.getGrades()) {
//                average += grade;
//                count++;
//            }
//        }
//        return average/count;
//    }

    public double calcAverage() {
        double average = 0;
        double count = 0;
        for (Student student : students.values()) {
            for (int grade : student.getGrades()) {
                average += grade;
            }
            count +=student.getGrades().size();
        }
        return average/count;
    }
     public Student findStudent(int studentNo) {
        return students.get(studentNo);
     }
}

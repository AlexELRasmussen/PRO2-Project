package exercises.ex2_3;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        College college = new College("ErhvervsAkademi Aarhus");

        List<Integer> grades1 = new ArrayList<>(List.of(4,4,7,10,12,12));
        List<Integer> grades2 = new ArrayList<>(List.of(4,4,2,4,10,2));
        List<Integer> grades3 = new ArrayList<>(List.of(2,4,7,7,12,10));

        Student s1 = new Student(1,"Alex",grades1);
        Student s2 = new Student(2,"Charlotte",grades2);
        Student s3 = new Student(3,"David",grades3);

        college.addStudent(s1);
        college.addStudent(s2);
        college.addStudent(s3);

        System.out.println(college.calcAverage());
        System.out.println();

        System.out.println(college.findStudent(2));
    }
}

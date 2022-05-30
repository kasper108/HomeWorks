package lambda;

import java.util.ArrayList;
import java.util.List;


public class StudentInfo {

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Vasia", 'm', 24, 2, 5.3);
        Student st3 = new Student("Lena", 'f', 19, 1, 9.1);
        Student st4 = new Student("Nadia", 'f', 20, 4, 7.5);
        Student st5 = new Student("Petr", 'm', 27, 3, 6.0);

        List<Student> students = new ArrayList<>();

        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        /*
        studentInfo.printStudentOverGrade(students, 8 );
        System.out.println("=================");
        studentInfo.printStudentsUnderAge(students, 20);
        System.out.println("=================");
        studentInfo.printStudenstMixConditions(students, 9 , 6, 'f');
        */

        StudentInfo studentInfo = new StudentInfo();
        studentInfo.testStudent(students, new CheckOverGrade());

        studentInfo.testStudent(students, new StudentChecks() {
            @Override
            public boolean check(Student s) {
                return s.age < 20;
            }
        });

        System.out.println("--------Lambda---------------");

        studentInfo.testStudent(students, (Student s) -> {return s.age < 20;});
    }

    /*
    public void printStudentOverGrade(List<Student> students, double grade){
        for(Student s : students){
            if(s.avgGrade > grade){
                System.out.println(s);
            }
        }
    }

    public void printStudentsUnderAge(List<Student> students, int age){
        for(Student s : students){
            if(s.age < age){
                System.out.println(s);
            }
        }
    }

    public void printStudenstMixConditions(List<Student> students, double grade, int age, char sex){
        for(Student s : students){
            if(s.avgGrade > grade && s.age > age && s.sex == sex){
                System.out.println(s);
            }
        }
    }

     */

    void testStudent(List<Student> students, StudentChecks sc){
        for(Student s : students){
            if(sc.check(s)){
                System.out.println(s);
            }
        }
    }
}

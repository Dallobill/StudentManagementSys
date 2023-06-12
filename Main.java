package school.management.system;

import java.util.ArrayList;
import java.util.List;

import school.management.Teacher;

public class Main {
    public static void main(String[] args){
        Teacher ticoh = new Teacher(1,"Ticoh",500);
        Teacher naku = new Teacher(5,"Naku", 1000);
        Teacher kenny = new Teacher(7,"Kenny", 800);
        Teacher givauhn = new Teacher(9,"Givauhn", 1100);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(ticoh);
        teacherList.add(naku);
        teacherList.add(kenny);
        teacherList.add(givauhn);

        Student jerome = new Student(2, "Jerome", 4);
        Student rakeem = new Student(6, "Rakeem", 12);
        Student tremane = new Student(3, "Tremane", 10);
        List<Student> studentList = new ArrayList<>();

        studentList.add(jerome);
        studentList.add(rakeem);
        studentList.add(tremane);

        
        School ghs = new School(teacherList,studentList);

        // new teacher wants to be add
        Teacher mark = new Teacher(11, "Mark", 2000);

        //add a teacher
        ghs.addTeacher(mark);

        // make student pay fees
        jerome.payFees(5000);
        rakeem.payFees(10000);
        System.out.println("GHS has earned $ "+ ghs.totalMoneyEarned());

        System.out.println("-----MAKING SCHOOL PAY SALARY-----");
        ticoh.receiveSalary(ticoh.getSalary());
        System.out.println("GHS has spent for salary to " + ticoh.getName() +" and now has $ " + ghs.getTotalMoneyEarned());

        System.out.println(rakeem);

        naku.receiveSalary(naku.getSalary());

        System.out.println(naku);

    }
    
}

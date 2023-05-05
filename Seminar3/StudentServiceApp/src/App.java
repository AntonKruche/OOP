import java.util.ArrayList;
import java.util.List;

import Controllers.AverageAge;
import Controllers.EmploeeController;
import Controllers.StudentController;
import StudentDomen.Emploee;
import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.StudentStream;

public class App {
    public static void main(String[] args) throws Exception {
        //User u1 = new User("Сергей","Иванов",25);
        Student s1 = new Student("Сергей", "Иванов", 22, (long)101);
        Student s2 = new Student("Андрей", "Сидоров", 22, (long)111);
        Student s3 = new Student("Иван", "Петров", 22, (long)121);
        Student s4 = new Student("Игорь", "Иванов", 23, (long)301);
        Student s5 = new Student("Даша", "Цветкова", 23, (long)171);
        Student s6 = new Student("Лена", "Незабудкина", 23, (long)104);

        Student st1 = new Student("Сергей", "Иванов", 22, (long)101);
        Student st2 = new Student("Андрей", "Сидоров", 22, (long)111);
        Student st3 = new Student("Иван", "Петров", 22, (long)121);
        Student st4 = new Student("Игорь", "Иванов", 23, (long)301);
        Student st5 = new Student("Даша", "Цветкова", 23, (long)171);

        Student sn1 = new Student("Сергей", "Иванов", 22, (long)101);
        Student sn2 = new Student("Андрей", "Сидоров", 22, (long)111);
        Student sn3 = new Student("Иван", "Петров", 22, (long)121);

        List<Student> listStud = new ArrayList<Student>();
        List<Student> listStud1 = new ArrayList<Student>();
        List<Student> listStud2 = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);

        listStud1.add(st1);
        listStud1.add(st2);
        listStud1.add(st3);
        listStud1.add(st4);
        listStud1.add(st5);

        listStud2.add(sn1);
        listStud2.add(sn2);
        listStud2.add(sn3);



        StudentGroup group1 = new StudentGroup(listStud, 1);
        StudentGroup group2 = new StudentGroup(listStud1, 2);
        StudentGroup group3 = new StudentGroup(listStud2, 3);
        List<StudentGroup> groups = new ArrayList<StudentGroup>();
        groups.add(group1);
        groups.add(group2);
        groups.add(group3);
        StudentStream stream = new StudentStream(groups, 101);
        //Collections.sort(stream.getStudentGroups());

        System.out.println(stream);
        

        // for(Student stud : group)
        // {
        //     System.out.println(stud);
        // }

        // System.out.println("============= после сортировки =============");
        // Collections.sort(group.getStudents());


        // for(Student stud : group)
        // {
        //     System.out.println(stud);
        // }
        


        //System.out.println(u1);
        //System.out.println(s1);
        //System.out.println(group);

        //System.out.println(group1);
        EmploeeController contrEmp = new EmploeeController();
        Emploee per1 = new Emploee("Ivanov", "Oleg", 55, 110);

        EmploeeController.paySalary(per1);
        Integer studHour[] = {124, 232, 12 ,4};
        System.out.println(EmploeeController.mean(studHour));
        Double emplsSallary[] = {12432.12, 12345.22, 10.0};
        System.out.println(EmploeeController.mean(emplsSallary));
        
        StudentController studContr = new StudentController();
        studContr.create("Сергей", "Иванов", 22);
        studContr.create("Сергей", "Иванов", 24);
        studContr.create("Сергей", "Иванов", 49);
        studContr.create("Сергей", "Иванов", 54);
        studContr.create("Сергей", "Иванов", 11);
        
        AverageAge getAv = new AverageAge<>();

        System.out.println(getAv.getAverageAge(studContr.getAll()));

    }   
}

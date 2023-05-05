package StudentService;
import StudentDomen.Student;
import java.util.*;

public class StudentService implements iUserService<Student> {
    private List<Student> students;
    private int count;
    /**
     * Конструктор класса StudentService для реализации работы со студентами
     */
    public StudentService(){
        this.students = new ArrayList<Student>();
    }
    /**
     * Переопределние метода для создания экземпляра студента
     */
    @Override
    public void create(String firstName, String secondName, int age) {
        Student per = new Student(firstName, secondName, age, count);
        count ++;
        students.add(per);
        
    }
    /**
     * Переопределение метода для получения списка студентов
     */
    @Override
    public List<Student> getAll() {
        // TODO Auto-generated method stub
        return students;
    }

    // public List<Student> getAll(){
    //     return this.students;
    // }
}

package Controllers;
import java.util.List;

import StudentDomen.Student;
import StudentService.StudentGroupService;
import StudentService.StudentService;
public class StudentController implements iUserController<Student>{
    /**
     * Класс для реализации работы со студентами
     */
    private final StudentService dataService = new StudentService();
    private final StudentGroupService groupService = new StudentGroupService();
    /**
     * Переопределение метода Create
     */
    @Override
    public void create(String firstName, String secondName, int age) {
        dataService.create(firstName, secondName, age);
        
    }

    public List<Student> getAll(){
        return dataService.getAll();
    }
    

}

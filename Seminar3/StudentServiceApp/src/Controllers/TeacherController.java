package Controllers;

import StudentDomen.Teacher;
import StudentService.TeacherService;

public class TeacherController implements iUserController<Teacher> {
    /**
     * Класс для реализации работы с учителями
     */
    private final TeacherService dataService = new TeacherService();
    /**
     * Переопределение метода Create
     */
    
    @Override
    public void create(String firstName, String secondName, int age) {
        dataService.create(firstName, secondName, age);
    }
    
    public void create(String firstName, String secondName, int age, int teacherId, String grade){
        dataService.create(firstName, secondName, age, teacherId, grade);
    }
    
    
}

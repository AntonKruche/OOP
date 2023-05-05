package StudentService;
import java.util.*;
import StudentDomen.StudentGroup;
import StudentDomen.UserComparator;
import StudentDomen.Student;
/**
 * Класс для работы с группами студентов
 */
public class StudentGroupService {
    private List<StudentGroup> groups;
    /**
     * Конструктор класса. Инициализируется поле список групп
     */
    public StudentGroupService(){
        this.groups = new ArrayList<StudentGroup>();
    }
    /**
     * Геттер для получения списка групп
     * @return
     */
    public List<StudentGroup> getAll(){
        return groups;
    }
    /**
     * Метод для сортировкии студентов в группе
     * @param numberGroup
     * @return
     */
    public List<Student> getSortedByFIOStudentGroup(int numberGroup){
        List<Student> students = new ArrayList<Student>(groups.get(numberGroup).getStudents());
        students.sort(new UserComparator<>());
        return students;
    }

}

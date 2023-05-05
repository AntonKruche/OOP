package StudentService;
import java.util.ArrayList;
import java.util.List;
import StudentDomen.Teacher;
import StudentDomen.UserComparator;
public class TeacherService extends UserComparator<Teacher> implements iUserService<Teacher> {
    private List<Teacher> teachers;
    private int count;

    public TeacherService(){
        this.teachers = new ArrayList<Teacher>();

    }

    public void create(String firstName, String secondName, int age, int teacherId, String grade){
        Teacher per = new Teacher(firstName, secondName, age, teacherId, grade);
        count ++;
        teachers.add(per);
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String firstName, String secondName, int age) {
        count ++;
        Teacher per = new Teacher(firstName, secondName, age, count, "unknown");
        teachers.add(per);
    }

    public void printSortedTeacherList(){
        List<Teacher> sortedTeachers = new ArrayList<>(teachers);
        sortedTeachers.sort(new UserComparator<Teacher>());
        for(Teacher teacher: sortedTeachers){
            System.out.println(teacher);
        }
    }
}

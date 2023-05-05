package StudentService;
import StudentDomen.Emploee;
import java.util.*;
import StudentDomen.UserComparator;
/**
 * Класс Сервис Работников для создания работников, ведения учёта количества работников
 */
public class EmploeeService implements iUserService<Emploee> {
    private List<Emploee> emploees;
    private int count;
    /**
     * Конструктор класса Сервис работников, при создании создаёт поле список Работников
     */
    public EmploeeService(){
        this.emploees = new ArrayList<Emploee>();
    }
    /**
     * Переопределение метода Create интерфейса iUdserInterface для создания экземпляра работника
     */
    @Override
    public void create(String firstName, String secondName, int age) {
        Emploee per = new Emploee(firstName, secondName, age, count);
        count ++;
        emploees.add(per);
        
    }
    /**
     * Геттер для получения списка работников 
     */
    @Override
    public List<Emploee> getAll() {
        // TODO Auto-generated method stub
        return emploees;
    }
    /**
     * Метод сортировки работников
     * @return
     */
    public List<Emploee> getSortedByFIOStudentGroup(){
        List<Emploee> emps = new ArrayList<>(emploees);
        emps.sort(new UserComparator<Emploee>());
        return emps;
    }

    // public List<Emploee> getAll(){
    //     return emploees;
    // }
}

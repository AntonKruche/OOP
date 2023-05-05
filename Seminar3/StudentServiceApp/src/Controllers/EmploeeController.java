package Controllers;
import StudentDomen.Emploee;
import StudentService.EmploeeService;
import StudentDomen.User;
public class EmploeeController implements iUserController<Emploee>{
    private final EmploeeService empService = new EmploeeService();
    /*
     * Переопределение метода create для создания экземпляра класса EmploeeService
     */
    @Override
    public void create(String firstName, String secondName, int age) {
        empService.create(firstName, secondName, age);
        
    }
    /**
     * Метод для выплаты зарплаты сотруднику
     * @param <T>
     * @param person
     */
    static public <T extends Emploee> void paySalary(T person){
        System.out.println(((User)person).getFirstName() + " poluchil zp 10000");
    }
    /**
     * Метод для подсчёта среднего значения поля типа Num
     * @param <T>
     * @param num
     * @return
     */
    static public <T extends Number> Double mean(T[] num){
        double sum = 0.0;
        for(int i = 0; i < num.length; i ++){
            sum += num[i].doubleValue();
        }
        sum = sum / num.length;
        return sum;

    }
}

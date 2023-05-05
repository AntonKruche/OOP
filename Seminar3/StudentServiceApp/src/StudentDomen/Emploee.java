package StudentDomen;

public class Emploee extends User {
    private int empId;
    /**
     * Конструктор класса Работник, определяются поля Имя, Фамилия, Возраст и Айди
     * @param firstName
     * @param secondName
     * @param age
     * @param empId
     */
    public Emploee(String firstName, String secondName, int age, int empId){
        super(firstName, secondName, age);
        this.empId = empId;
    }
    /**
     * Геттер для получения поля айди
     * @return
     */
    public int getEmpId(){
        return empId;
    }
    /**
     * Сеттер для определения поля Айди
     * @param empId
     */
    public void setEmpId(int empId){
        this.empId = empId;
    }
}

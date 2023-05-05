package StudentDomen;

public class Teacher extends User {
    private int teacherId;
    private String academicDegree;
    /**
     * Конструктор класса Учитель, определяются поля Имя, Фамилия, Возраст, Айди и Звание
     * @param firstName
     * @param secondName
     * @param age
     * @param teacherId
     * @param level
     */
    public Teacher(String firstName, String secondName, int age, int teacherId, String level) {
        super(firstName, secondName, age);
        this.teacherId = teacherId;
        this.academicDegree = level;
        
    }
    /**
     * Getter для получения поля Айди
     * @return
     */
    public int getTeacherId() {
        return teacherId;
    }
    /**
     * Сеттер для определения поля Айди
     * @param teacherId
     */
    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
    /**
     * Геттер для получения поля Звание
     * @return
     */
    public String getAcademicDegree() {
        return academicDegree;
    }
    /**
     * Сеттер для определения поля Звание
     * @param academicDegree
     */
    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    @Override
    public String toString() {
        return "Teacher{" 
                
                +"firstName=" +super.getFirstName()
                +", secondName=" +super.getSecondName()
                +", age=" +super.getAge()
                +", teacherId=" + this.getTeacherId()
                +", Grade=" + this.getAcademicDegree()+
                '}';
    }

    

    
    
}

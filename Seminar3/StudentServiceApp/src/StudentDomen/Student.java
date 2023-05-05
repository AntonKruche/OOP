package StudentDomen;

public class Student extends User implements Comparable<Student>{
    private long studentID;
    /**
     * Конструктор класса Student с заданием полей Имя, Фамилия, возпаст и айди студента
     * @param firstName
     * @param secondName
     * @param age
     * @param studentID
     */
    public Student(String firstName, String secondName, int age, long studentID) {
        super(firstName, secondName, age);
        this.studentID = studentID;
    }
    /**
     * Геттер для получения значения поля "айди студента"
     * @return
     */

    public long getStudentID() {
        return studentID;
    }
    /**
     * Setter дял определения значения "айди студента"
     * @param studentID
     */
    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }
    /**
     * Переопределение метода ToString для вывода полей Имя, Фамилия, Возраст и айди студента
     */
    @Override
    public String toString() {
        return "Student{" 
                
                +"firstName=" +super.getFirstName()
                +", secondName=" +super.getSecondName()
                +", age=" +super.getAge()+
                ", studentID=" + studentID +
                '}';
    }

    /**
     * Переопределение метода CopareTo для реализации сортировки по полю возраст и затем по полю айди
     */
    @Override
    public int compareTo(Student o) {
        
        //System.out.println(super.getFirstName()+" - "+o.getFirstName());
         if(super.getAge()==o.getAge())
         {
            if(this.studentID==o.studentID)
            {
                return 0;
            }
            if(this.studentID<o.studentID)
            {
                return -1;
            }
            return 1;
         } 
         if(super.getAge()<o.getAge())
         {
            return -1;
         }   
         return 1;
    }
}

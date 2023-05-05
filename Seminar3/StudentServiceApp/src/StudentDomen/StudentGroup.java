package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    private List<Student> students;
    private int groupID;
    /**
     * Конструктор класса группа студентов, определяются поля Список студентов и Айди группы
     * @param students список студентов
     * @param id
     */
    public StudentGroup(List<Student> students, int id) {
        this.students = students;
        this.groupID = id;
    }
    /**
     * Геттер для получения поля Список Студентов
     * @return
     */
    public List<Student> getStudents() {
        return students;
    }
    /**
     * Сеттер для определения поля список студентов
     * @param students
     */
    public void setStudents(List<Student> students) {
        this.students = students;
    }
    /**
     * Геттер для получения поля список студентов
     * @return
     */
    public int getId(){
        return this.groupID;
    }
    /**
     * Сетте для определения поля Айди группы
     * @param id
     */
    public void setId(int id){
        this.groupID = id;
    }
    // @Override
    // public Iterator<Student> iterator() {
    //     return new StudentGroupIterator(students);
    // }
    /**
     * Переопределение метода iterator для реализации перебора в цикле 
     */
    @Override
    public Iterator<Student> iterator() {
        return new Iterator<Student>(){
            private int index = 0;
            @Override
            public boolean hasNext() {
               return index<students.size();
            }
            @Override
            public Student next() {
                if(!hasNext())
                {
                    return null;
                }
                //counter++;
                return students.get(index++);        
            }

        };
    }
    /**
     * Переопределение метода ToString 
     */
    @Override
    public String toString() {
        String result = String.format("Group Number: %d \nCount of Students: %d\nStudent list:\n", this.groupID, this.students.size());
        for(Student student : students){
            result += student.toString() + "\n";
        }
        return result;
    }
    /**
     * Переопределение метода CompareTo для реализации сортировки по количеству студентов в группе и по Айди группы
     */
    @Override
    public int compareTo(StudentGroup o) {
        if(this.students.size() == o.students.size()){
            if(this.getId() == o.getId()){
                return 0;
            }
            if(this.getId() < o.getId()){
                return -1;
            }
            return 1;
        }
        if(this.getStudents().size() < o.getStudents().size()){
            return -1;
        }
        return 1;
    }
    
}

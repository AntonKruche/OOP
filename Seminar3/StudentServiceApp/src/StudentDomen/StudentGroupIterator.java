package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {
    private int counter;
    private final List<Student> students;
    /**
     * Констуктор класса StudentGroupIterator, принимающий список студентов
     * @param students
     */
    public StudentGroupIterator(List<Student> students) {
        this.students = students;
        this.counter = 0;
    }
    /**
     * Переопределение метода hasNext
     */
    @Override
    public boolean hasNext() {
       return counter<students.size();
    }
    /**
     * Переопределение метода next
     */
    @Override
    public Student next() {
        if(!hasNext())
        {
            return null;
        }
        //counter++;
        return students.get(counter++);        
    }
    
}

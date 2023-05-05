package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentStreamIterator implements Iterator<StudentGroup>{
    /**
     * Конструктор класса StudentStreamIterator, принимает поле список групп студентов
     */
    private int counter;
    private final List<StudentGroup> studentGroups;

    public StudentStreamIterator(List<StudentGroup> studentGroups) {
        this.studentGroups = studentGroups;
        this.counter = 0;
    }
    /**
     * Переопределение метода hasNext
     */
    @Override
    public boolean hasNext() {
       return counter<studentGroups.size();
    }
    /**
     * Переопределение метода Next
     */
    @Override
    public StudentGroup next() {
        if(!hasNext())
        {
            return null;
        }
        return studentGroups.get(counter++);        
    }
}
